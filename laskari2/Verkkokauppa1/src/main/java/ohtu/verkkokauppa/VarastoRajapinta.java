
package ohtu.verkkokauppa;

/**
 *
 * @author hanna
 */
public interface VarastoRajapinta {
    
    public Tuote haeTuote(int id);
    public int saldo(int id);
    public void otaVarastosta(Tuote t);
    public void palautaVarastoon(Tuote t);
}
