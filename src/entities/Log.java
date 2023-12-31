package entities;

import java.util.Date;
import java.util.Objects;

public class Log {
	
	private String user;
	private Date moment;
	
	public Log(String name, Date moment) {

		this.user = name;
		this.moment = moment;
	}
	public String getUser() {
		return user;
	}
	public Date getMoment() {
		return moment;
	}
	@Override
	public String toString() {
		return "Log [name=" + user + ", moment=" + moment + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		return Objects.equals(user, other.user);
	}
	


}
