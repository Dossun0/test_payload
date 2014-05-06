import java.io.IOException;

public class bytetest {
	
	public static void main(String[] args) {
		System.out.print(">>Payload : ");
		byte[] tmp = new byte[65495];
		try {
			System.in.read(tmp);
			System.out.write(tmp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
