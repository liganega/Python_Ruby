import javax.swing.*;

public class TempConvGUI {

    public static void main(String[] args) {
        String fahrString;
        double fahr, cel;

        fahrString = JOptionPane.showInputDialog("화씨 온도를(F) 숫자를 입력하세요: ");
        fahr = Double.parseDouble(fahrString);
        cel = (fahr - 32) * 5.0/9.0;

        Object[] options = { "OK", "CANCEL" };
        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
                             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                                          null, options, options[0]);

        JOptionPane.showMessageDialog(null,"The temperature in C is " + cel);
    }

}































































































