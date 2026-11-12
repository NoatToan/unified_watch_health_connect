package q63;

import android.app.Dialog;
import android.view.Window;
import android.widget.EditText;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq63/a;", "", "<init>", "()V", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
public final class a {
    static {
        new a();
    }

    private a() {
    }

    public static final void a(Dialog dialog, EditText editText) {
        dialog.getClass();
        editText.getClass();
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        editText.requestFocus();
    }
}
