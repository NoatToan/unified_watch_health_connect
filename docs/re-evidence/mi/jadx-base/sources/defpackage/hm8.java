package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes10.dex */
public class hm8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f20231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f20232b;
    public float c;
    public float d;
    public float e;
    public float f;

    public static int e(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i5 = i + i4;
        if (i5 < i2) {
            return i4 + (i2 - i5);
        }
        return i5 > i3 ? i4 + (i3 - i5) : i4;
    }

    public static boolean g(View view, int i, int i2) {
        return i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public static void i(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public double a() {
        float fC = c();
        if (fC == 0.0f) {
            return 0.0d;
        }
        return Math.toDegrees(Math.atan(Math.abs(d()) / Math.abs(fC)));
    }

    public float b() {
        return this.f20231a - this.c;
    }

    public float c() {
        return this.f20231a - this.e;
    }

    public float d() {
        return this.f20232b - this.f;
    }

    public boolean f(MotionEvent motionEvent, Context context) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        long pressedStateDuration = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        return motionEvent.getEventTime() - motionEvent.getDownTime() < pressedStateDuration && ((int) c()) < scaledTouchSlop && ((int) d()) < scaledTouchSlop;
    }

    public void h(MotionEvent motionEvent) {
        this.c = this.f20231a;
        this.d = this.f20232b;
        this.f20231a = motionEvent.getRawX();
        this.f20232b = motionEvent.getRawY();
        if (motionEvent.getAction() != 0) {
            return;
        }
        this.e = this.f20231a;
        this.f = this.f20232b;
    }
}
