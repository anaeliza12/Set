package program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Log;

public class Program {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Enter the file full path: ");
		File file = new File(tec.next());

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			Set<Log> set = new HashSet<>();
			String line = br.readLine();

			while (line != null) {
				String vet[] = line.split(" ");

				Date moment = Date.from(Instant.parse(vet[1]));
				Log log = new Log(vet[0], moment);
				set.add(log);

				line = br.readLine();

			}
			
			System.out.print("Total users: ");
			System.out.println(set.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
