package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes8.dex */
public class b1e {
    public static void b(EditText editText) {
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static /* synthetic */ void c(EditText editText) {
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 2);
    }

    public static void d(final EditText editText) {
        editText.requestFocus();
        editText.postDelayed(new Runnable() { // from class: a1e
            @Override // java.lang.Runnable
            public final void run() {
                b1e.c(editText);
            }
        }, 300L);
    }
}
