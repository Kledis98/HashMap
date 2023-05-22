import java.util.HashMap;
import java.util.Set;

public class Maps{
    public static void main(String[] args){
        HashMap<String, String> tracklist = new HashMap<String, String> ();
        tracklist.put("Song 1", "Lyrics 1");
        tracklist.put("Song 2 ", "Lyrics 2");
        tracklist.put("Song 3 ", "Lyrics 3");
        tracklist.put("Song 4 ", "Lyrics 4");

        String name = tracklist.get("Song 1");
        System.out.println(name);


    Set<String> tracks = tracklist.keySet();
        for(String track : tracks){
            System.out.println(String.format("Track:"+ track + "-" + "Lyrics:" + tracklist.get(track)));
        }
    }
}

