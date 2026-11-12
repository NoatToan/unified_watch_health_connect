package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes6.dex */
public class sya {
    public static float a(MotionEvent motionEvent, boolean z) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            int i = pointerCount - 1;
            if (i == actionIndex) {
                i = pointerCount - 2;
            }
            return motionEvent.getX(i) + rawX;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        float x = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount2; i3++) {
            if (i3 != actionIndex) {
                x += motionEvent.getX(i3) + rawX;
                i2++;
            }
        }
        return x / i2;
    }

    public static float b(MotionEvent motionEvent, boolean z) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            int i = pointerCount - 1;
            if (i == actionIndex) {
                i = pointerCount - 2;
            }
            return motionEvent.getY(i) + rawY;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        float y = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount2; i3++) {
            if (i3 != actionIndex) {
                y += motionEvent.getY(i3) + rawY;
                i2++;
            }
        }
        return y / i2;
    }
}
