package com.huami.wallet.ui.widget;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes16.dex */
public class EditTextWatcher implements TextWatcher {
    private static final String c = "\n";
    private final int a;
    private final EditText b;

    public EditTextWatcher(int i, EditText editText) {
        this.a = i;
        this.b = editText;
    }

    private boolean a(char c2) {
        return c2 / 128 == 0;
    }

    private int b(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        for (char c2 : str.toCharArray()) {
            i++;
            if (!a(c2)) {
                i++;
            }
        }
        return i;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int selectionEnd = Selection.getSelectionEnd(this.b.getText());
        String string = editable.toString();
        if (string.contains("\n")) {
            this.b.setText(string.replace("\n", ""));
            Editable text = this.b.getText();
            if (selectionEnd > text.length()) {
                selectionEnd = text.length();
            }
            Selection.setSelection(text, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Editable text = this.b.getText();
        String string = text.toString();
        if (b(string) > this.a) {
            int selectionEnd = Selection.getSelectionEnd(text);
            String strSubstring = string.substring(0, string.length() - 1);
            while (b(strSubstring) > this.a) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            this.b.setText(strSubstring);
            Editable text2 = this.b.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
        }
    }
}
