package idgenerator;

import com.github.curiousoddman.rgxgen.RgxGen;

public class IdGenerator {
	public static void main(String[] args){
		RgxGen rgxGen = new RgxGen("[^{}$&+,:;=?@#|'-`<>.-_\\s^*()%!~\\\"A-Z0-9oli][2-9][^{}$&+,:;=?@#|'-`<>.-_\\s^*()%!~\\\"A-Z0-9oli][2-9]$");   
        String s = rgxGen.generate();                                        
        System.out.println(s);
    }
}
