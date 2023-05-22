import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TDDSongTest {

    @Test
    public void test1(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>();
        String resultadoEsperado = "";
        String resultadoReal = song.compruebaLetras(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList(song.volar));
        String resultadoEsperado = "There was an old lady who swallowed a " + song.volar + ".\n" +
                "I don't know why she swallowed a " + song.volar + " - perhaps she'll die!\n";
        String resultadoReal = song.compruebaLetras(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList(song.aranya));
        String resultadoEsperado = "There was an old lady who swallowed a " + song.aranya + ".\n" +
                "I don't know why she swallowed a " + song.aranya + " - perhaps she'll die!\n";
        String resultadoReal = song.compruebaLetras(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test4(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList(song.volar, song.aranya));
        String resultadoEsperado =  "There was an old lady who swallowed a " + song.volar + ".\n" +
                "I don't know why she swallowed a " + song.volar + " - perhaps she'll die!\n" +
                "There was an old lady who swallowed a " + song.aranya + ";\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the " + song.aranya + " to catch the " + song.volar + ";\n" +
                "I don't know why she swallowed a " + song.volar + " - perhaps she'll die!\n";
        String resultadoReal = song.compruebaLetras(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test5(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList(song.aranya, song.volar));
        String resultadoEsperado =  "There was an old lady who swallowed a " + song.aranya + ".\n" +
                "I don't know why she swallowed a " + song.aranya + " - perhaps she'll die!\n" +
                "There was an old lady who swallowed a " + song.volar + ";\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the " + song.volar + " to catch the " + song.aranya + ";\n" +
                "I don't know why she swallowed a " + song.aranya + " - perhaps she'll die!\n";
        String resultadoReal = song.compruebaLetras(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test6(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList(song.volar, song.aranya, song.pajaro));
        String resultadoEsperado =  "There was an old lady who swallowed a " + song.volar + ".\n" +
                "I don't know why she swallowed a " + song.volar + " - perhaps she'll die!\n" +
                "There was an old lady who swallowed a " + song.aranya + ";\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the " + song.aranya + " to catch the " + song.volar + ";\n" +
                "I don't know why she swallowed a " + song.volar + " - perhaps she'll die!\n" +
                "There was an old lady who swallowed a " + song.pajaro + ";\n" +
                "How absurd to swallow a " + song.pajaro + ".\n" +
                "She swallowed the " + song.pajaro + " to catch the " + song.aranya + ",\n" +
                "She swallowed the " + song.aranya + " to catch the " + song.volar + ";\n" +
                "I don't know why she swallowed a " + song.volar + " - perhaps she'll die!\n";
        String resultadoReal = song.compruebaLetras(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test7(){
        TDDSong song = new TDDSong();
        List<String> list = new ArrayList<>(Arrays.asList(song.pajaro, song.volar, song.aranya));
        String resultadoEsperado =   "There was an old lady who swallowed a " + song.pajaro + ".\n" +
                "I don't know why she swallowed a " + song.pajaro + " - perhaps she'll die!\n" +
                "There was an old lady who swallowed a " + song.volar + ";\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the " + song.volar + " to catch the " + song.pajaro + ";\n" +
                "I don't know why she swallowed a " + song.pajaro + " - perhaps she'll die!\n" +
                "There was an old lady who swallowed a " + song.aranya + ";\n" +
                "How absurd to swallow a " + song.aranya + ".\n" +
                "She swallowed the " + song.aranya + " to catch the " + song.volar + ",\n" +
                "She swallowed the " + song.volar + " to catch the " + song.pajaro + ";\n" +
                "I don't know why she swallowed a " + song.pajaro + " - perhaps she'll die!\n";
        String resultadoReal = song.compruebaLetras(list);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}