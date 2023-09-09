package net.askiiart.usbkeyboard;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendString(View view) throws IOException {
        EditText tb = findViewById(R.id.textBoxOfText);
        OutputUsbKeyboardAsRoot kbd = new OutputUsbKeyboardAsRoot(OutputInterface.Language.en_US);
        kbd.sendText(tb.getText().toString());
    }

    public void sendEscape(View view) throws IOException {
        OutputUsbKeyboardAsRoot kbd = new OutputUsbKeyboardAsRoot(OutputInterface.Language.en_US);
        kbd.sendSingleKey("escape");
    }

    public void sendTab(View view) throws IOException {
        OutputUsbKeyboardAsRoot kbd = new OutputUsbKeyboardAsRoot(OutputInterface.Language.en_US);
        kbd.sendTabulator();
    }

    public void sendEnter(View view) throws IOException {
        OutputUsbKeyboardAsRoot kbd = new OutputUsbKeyboardAsRoot(OutputInterface.Language.en_US);
        kbd.sendReturn();
    }

    public void sendBackspace(View view) throws IOException {
        OutputUsbKeyboardAsRoot kbd = new OutputUsbKeyboardAsRoot(OutputInterface.Language.en_US);
        kbd.sendSingleKey("backspace");
    }
}