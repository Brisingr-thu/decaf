package decaf.error;
import decaf.Location;

public class IncompatTerOpError extends DecafError {

	private String left;
	private String right;

	public IncompatTerOpError(Location location, String left, String right) {
		super(location);
		this.left = left;
		this.right = right;
	}

	@Override
	protected String getErrMsg() {
		return "incompatible condition expr type: " + left + " and " + right;
	}
	
}
