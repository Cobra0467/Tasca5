import java.util.List;

public class TDDSong {
    String volar = "fly";
    String aranya = "spider";
    String pajaro = "bird";

    public String compruebaLetras(List<String> palabrasClaves) {
        String resultado = "";
        if (palabrasClaves.size() == 0) {
            return resultado;
        } else if (palabrasClaves.size() == 1) {
            resultado += "There was an old lady who swallowed a " + palabrasClaves.get(0) + ".\n" +
                    "I don't know why she swallowed a " + palabrasClaves.get(0) + " - perhaps she'll die!\n";
        } else if (palabrasClaves.size() == 2) {
            resultado += "There was an old lady who swallowed a " + palabrasClaves.get(0) + ".\n" +
                    "I don't know why she swallowed a " + palabrasClaves.get(0) + " - perhaps she'll die!\n" +
                    "There was an old lady who swallowed a " + palabrasClaves.get(1) + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + palabrasClaves.get(1) + " to catch the " + palabrasClaves.get(0) + ";\n" +
                    "I don't know why she swallowed a " + palabrasClaves.get(0) + " - perhaps she'll die!\n";
        } else if (palabrasClaves.size() == 3) {
            resultado += "There was an old lady who swallowed a " + palabrasClaves.get(0) + ".\n" +
                    "I don't know why she swallowed a " + palabrasClaves.get(0) + " - perhaps she'll die!\n" +
                    "There was an old lady who swallowed a " + palabrasClaves.get(1) + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + palabrasClaves.get(1) + " to catch the " + palabrasClaves.get(0) + ";\n" +
                    "I don't know why she swallowed a " + palabrasClaves.get(0) + " - perhaps she'll die!\n" +
                    "There was an old lady who swallowed a " + palabrasClaves.get(2) + ";\n" +
                    "How absurd to swallow a " + palabrasClaves.get(2) + ".\n" +
                    "She swallowed the " + palabrasClaves.get(2) + " to catch the " + palabrasClaves.get(1) + ",\n" +
                    "She swallowed the " + palabrasClaves.get(1) + " to catch the " + palabrasClaves.get(0) + ";\n" +
                    "I don't know why she swallowed a " + palabrasClaves.get(0) + " - perhaps she'll die!\n";
        }
        return resultado;
    }
}
