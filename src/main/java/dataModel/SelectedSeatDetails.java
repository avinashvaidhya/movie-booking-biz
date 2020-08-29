package dataModel;

import java.util.List;

public class SelectedSeatDetails {

	private List<Integer> selectedSeatList;
	
	private String theatreName;
	
	private String userName;

	public List<Integer> getSelectedSeatList() {
		return selectedSeatList;
	}

	public void setSelectedSeatList(List<Integer> selectedSeatList) {
		this.selectedSeatList = selectedSeatList;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
