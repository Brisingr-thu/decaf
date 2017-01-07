package decaf.error;
import decaf.Location;

public class BadSwitchVarError extends DecafError {
	
	public BadSwitchVarError(Location location) {super (location);}
	protected String getErrMsg() {
		return "switch varible must be a int";
	}
	
}
