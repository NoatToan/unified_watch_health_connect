package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class qbd implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f31321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31322b;
    public final int c;
    public final int d;

    public qbd(Dialog dialog, Rect rect) {
        this.f31321a = dialog;
        this.f31322b = rect.left;
        this.c = rect.top;
        this.d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f31322b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.d;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f31321a.onTouchEvent(motionEventObtain);
    }
}
