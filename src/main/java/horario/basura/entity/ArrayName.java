/**
 * 
 */
package horario.basura.entity;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Vector de nombres que realizaran labores de sacar la basura
 */
@Component
public class ArrayName {
	
	private String[] arrayName = {"C","D","F","S"};
	

	
	/**
	 * @return the arrayName
	 */
	public String[] getArrayName() {
		return arrayName;
	}

	/**
	 * @param arrayName the arrayName to set
	 */
	public void setArrayName(String[] arrayName) {
		this.arrayName = arrayName;
	}

}
