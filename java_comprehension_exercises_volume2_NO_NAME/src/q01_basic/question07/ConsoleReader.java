package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str2 = reader.readLine();
		int num = Integer.parseInt(str2);

		return num;

	}

}
