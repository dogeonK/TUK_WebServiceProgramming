package tukorea.web.club.domain;

public class ReservationVO {

	private String reservid;
	private String username;
	private String movieid;
	private String moviename;
	private String seatnumber;
	
	public String getReservid() {
		return reservid;
	}
	public void setReservid(String reservid) {
		this.reservid = reservid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}
}
