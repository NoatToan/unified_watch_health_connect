package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class l {
    private l() {
    }

    public static void a(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof d1) {
                editorInfo.hintText = ((d1) parent).e();
                return;
            }
        }
    }
}
