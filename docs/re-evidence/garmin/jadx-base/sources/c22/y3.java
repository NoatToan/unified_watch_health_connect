package c22;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes10.dex */
public class y3 {
    public static void a(View view2) {
        InputMethodManager inputMethodManager = (InputMethodManager) view2.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
        }
    }

    public static void b(EditText editText) {
        if (editText != null) {
            ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
        }
    }
}
