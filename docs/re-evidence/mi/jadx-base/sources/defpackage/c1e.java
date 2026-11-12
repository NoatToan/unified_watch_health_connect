package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes6.dex */
public class c1e {
    public static void a(EditText editText) {
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        editText.clearFocus();
    }
}
