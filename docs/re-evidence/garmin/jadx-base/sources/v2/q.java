package v2;

import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public interface q {
    void a(int i14, int i15, int i16, int i17);

    void b();

    void c();

    void sendKeyEvent(KeyEvent keyEvent);

    void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo);
}
