package defpackage;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class qge extends LinkMovementMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static qge f31501a;

    public static MovementMethod getInstance() {
        if (f31501a == null) {
            f31501a = new qge();
        }
        return f31501a;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 1 || action == 0) && ((int) motionEvent.getX()) - textView.getTotalPaddingLeft() < 0) {
            return false;
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
