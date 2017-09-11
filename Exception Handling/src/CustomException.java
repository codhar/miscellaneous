
public class CustomException extends RuntimeException {

	/**
	 * private static final long serialVersionUID = 1L;
	 */
	
	public CustomException(Exception e) {
		super(e);
//		this.e = e;
	}

	public String toString(){
		return "Custom Exception";
	}

}
