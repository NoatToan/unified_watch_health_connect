package v2;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;

/* JADX INFO: loaded from: classes.dex */
public interface f2 extends p0 {
    void a(int i14);

    int b(HandwritingGesture handwritingGesture);

    void e();

    void f();

    u2.e getText();

    boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i14);

    void sendKeyEvent(KeyEvent keyEvent);
}
