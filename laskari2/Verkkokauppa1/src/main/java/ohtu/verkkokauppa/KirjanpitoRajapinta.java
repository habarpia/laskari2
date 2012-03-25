
package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 *
 * @author hanna
 */
public interface KirjanpitoRajapinta {
    
    
    public void lisaaTapahtuma(String tapahtuma);
    public ArrayList<String> getTapahtumat();
}
