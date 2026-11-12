package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class s7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f33385b;
    public float c;
    public int d = -1;
    public int e;
    public int f;
    public ViewGroup g;

    public s7o(ViewGroup viewGroup, int i) {
        this.g = viewGroup;
        this.f = i;
        this.f33384a = ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
    }

    public void a(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int pointerId = motionEvent.getPointerId(0);
            this.d = pointerId;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return;
            }
            this.f33385b = motionEvent.getY(iFindPointerIndex2);
            this.c = motionEvent.getX(iFindPointerIndex2);
            this.e = 0;
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = this.d;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    float y = motionEvent.getY(iFindPointerIndex);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float f = y - this.f33385b;
                    float f2 = x - this.c;
                    if (Math.abs(f2) > this.f33384a || Math.abs(f) > this.f33384a) {
                        this.e = Math.abs(f2) <= Math.abs(f) ? 2 : 1;
                        return;
                    }
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        this.e = 0;
        this.g.requestDisallowInterceptTouchEvent(false);
    }

    public boolean b(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        if (iFindPointerIndex < 0) {
            return false;
        }
        float y = motionEvent.getY(iFindPointerIndex);
        float x = motionEvent.getX(iFindPointerIndex);
        int[] iArr = {0, 0};
        this.g.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, this.g.getWidth() + i, this.g.getHeight() + i2).contains((int) x, (int) y);
    }
}
