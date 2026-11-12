package com.huami.wallet.accessdoor.helper;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import com.huami.wallet.accessdoor.R;
import com.huami.widget.toast.CustomToast;

/* JADX INFO: loaded from: classes10.dex */
public class EditTextWatcher implements TextWatcher {
    private int a;
    private EditText b;
    private Context c;

    public EditTextWatcher(int i, EditText editText) {
        this.c = null;
        this.a = i;
        this.b = editText;
    }

    private static boolean a(char c) {
        return c / 128 == 0;
    }

    public static int strLength(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            i++;
            if (!a(c)) {
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
        if (strLength(string) > this.a) {
            int selectionEnd = Selection.getSelectionEnd(text);
            String strSubstring = string.substring(0, string.length() - 1);
            while (strLength(strSubstring) > this.a) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            this.b.setText(strSubstring);
            Editable text2 = this.b.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
            Context context = this.c;
            if (context != null) {
                CustomToast.makeText(context, context.getResources().getString(R.string.access_door_input_length_tip), 0).show();
            }
        }
    }

    public EditTextWatcher(int i, EditText editText, Context context) {
        this.c = null;
        this.a = i;
        this.b = editText;
        this.c = context;
    }
}
