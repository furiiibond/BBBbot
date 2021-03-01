

public class Wait {

	public Wait(int time) {
		try {
			java.lang.Thread.sleep(1000*time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
