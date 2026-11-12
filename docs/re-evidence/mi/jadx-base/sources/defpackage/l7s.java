package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l7s extends r7s {
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f24752k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f24753r;
    public float s;
    public float t;
    public float u;
    public float v;

    public l7s(Context context) {
        super(context);
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.j = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    public static float j(MotionEvent motionEvent, int i) {
        float x = (i + motionEvent.getX()) - motionEvent.getRawX();
        if (1 < motionEvent.getPointerCount()) {
            return motionEvent.getX(1) + x;
        }
        return 0.0f;
    }

    public static float m(MotionEvent motionEvent, int i) {
        float y = (i + motionEvent.getY()) - motionEvent.getRawY();
        if (1 < motionEvent.getPointerCount()) {
            return motionEvent.getY(1) + y;
        }
        return 0.0f;
    }

    @Override // defpackage.r7s
    public void e(MotionEvent motionEvent) {
        super.e(motionEvent);
        MotionEvent motionEvent2 = this.c;
        int pointerCount = motionEvent2.getPointerCount();
        int pointerCount2 = motionEvent.getPointerCount();
        if (pointerCount2 == 2 && pointerCount2 == pointerCount) {
            this.q = -1.0f;
            this.f24753r = -1.0f;
            float x = motionEvent2.getX(0);
            float y = motionEvent2.getY(0);
            float x2 = motionEvent2.getX(1);
            float y2 = motionEvent2.getY(1);
            this.m = x2 - x;
            this.n = y2 - y;
            float x3 = motionEvent.getX(0);
            float y3 = motionEvent.getY(0);
            float x4 = motionEvent.getX(1);
            float y4 = motionEvent.getY(1);
            this.o = x4 - x3;
            this.p = y4 - y3;
            this.s = x3 - x;
            this.t = y3 - y;
            this.u = x4 - x2;
            this.v = y4 - y2;
        }
    }

    public final PointF k(int i) {
        return i == 0 ? new PointF(this.s, this.t) : new PointF(this.u, this.v);
    }

    public final boolean l(MotionEvent motionEvent, int i, int i2) {
        int i3;
        int i4 = this.h;
        if (i4 == 0 || (i3 = this.i) == 0) {
            DisplayMetrics displayMetrics = this.f32298a.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels;
            float f2 = this.j;
            this.f24752k = f - f2;
            this.l = displayMetrics.heightPixels - f2;
        } else {
            float f3 = this.j;
            this.f24752k = i4 - f3;
            this.l = i3 - f3;
        }
        float f4 = this.j;
        float f5 = this.f24752k;
        float f6 = this.l;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float fJ = j(motionEvent, i);
        float fM = m(motionEvent, i2);
        boolean z = rawX < f4 || rawY < f4 || rawX > f5 || rawY > f6;
        boolean z2 = fJ < f4 || fM < f4 || fJ > f5 || fM > f6;
        return (z && z2) || z || z2;
    }
}
