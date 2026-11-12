package com.xiaomi.smarthome.library.common.util;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class KeyboardUtils {
    public static void hideKeyboard(EditText editText) {
        if (editText == null) {
            return;
        }
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static void showKeyboard(final EditText editText) {
        if (editText == null) {
            return;
        }
        new Timer().schedule(new TimerTask() { // from class: com.xiaomi.smarthome.library.common.util.KeyboardUtils.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 2);
            }
        }, 300L);
    }
}
