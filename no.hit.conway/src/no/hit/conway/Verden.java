public class Verden {
 
  // Objektvariabler for å representere
  // matrisen av celler (både "denne"
  // generasjon og "neste").
 
  public Verden(int rader, int kolonner) {
    // Opprett en matrise med gitt antall
    // rader og kolonner, og fyll matrisen med
    // tilfeldige verdier (levende eller død).
  }
 
  public void nyGenerasjon() {
    // Beregn neste generasjon basert på
    // reglene i Conway's Game of Life.
  }
 
  public boolean iLive(int r, int k) {
    // Er cellen i rad r og kolonne k i live?
    // Rader og kolonner er nummerert fra 0 og oppover.
  }
 
  public int antallRader() {
    // Hvor mange rader har matrisen?
  }
 
  public int antallKolonner() {
    // Hvor mange kolonner har matrisen?
  }
}
