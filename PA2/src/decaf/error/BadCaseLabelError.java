package decaf.error;

import decaf.Location;

public class BadCaseLabelError  extends DecafError {
	
	public BadCaseLabelError(Location location) {super (location);}
	
	protected String getErrMsg() {
		return "case label must be a constant int";
	}
	
}
