package ohtuesimerkki;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author hanna
 */
public class StatisticsTest {
    
    Statistics stats;
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
    
    public StatisticsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        stats=new Statistics(readerStub);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void existingPlayerIsFound() {
        Player player = stats.search("Semenko");
        
        assertEquals(player.getName(), "Semenko");
    }
    
    @Test
    public void nonExistantPlayerIsNotFound(){
        assertTrue(stats.search("not found")==null);
    }
    
    @Test
    public void playerListIsFormed(){
        assertEquals(stats.team("PIT").get(0).getName(), "Lemieux");
    }
    
    
    @Test
    public void topScoresListHasCorrectPlayers(){
        List<Player> topScorers = stats.topScorers(1);
        
        assertTrue(topScorers.get(0).getName().equals("Gretzky") &&
                topScorers.get(1).getName().equals("Lemieux"));
    }
    

}
