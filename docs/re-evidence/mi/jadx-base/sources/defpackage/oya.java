package defpackage;

import android.view.MotionEvent;
import android.view.View;
import defpackage.oya;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class oya<T extends oya> {
    public static short A = 0;
    public static int x = 11;
    public static MotionEvent.PointerProperties[] y;
    public static MotionEvent.PointerCoords[] z;
    public int c;
    public View d;
    public float f;
    public float g;
    public boolean h;
    public float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public short f29813k;
    public float l;
    public float m;
    public float n;
    public float o;
    public boolean p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public qya f29814r;
    public gah<T> s;
    public pya t;
    public int u;
    public boolean v;
    public boolean w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f29811a = new int[x];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29812b = 0;
    public int e = 0;
    public boolean i = true;
    public int q = 0;

    public static boolean u(float f) {
        return !Float.isNaN(f);
    }

    public static void v(int i) {
        if (y == null) {
            int i2 = x;
            y = new MotionEvent.PointerProperties[i2];
            z = new MotionEvent.PointerCoords[i2];
        }
        while (i > 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = y;
            int i3 = i - 1;
            if (pointerPropertiesArr[i3] != null) {
                return;
            }
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
            z[i3] = new MotionEvent.PointerCoords();
            i--;
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f29812b) {
            return true;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f29811a;
            if (i >= iArr.length) {
                return false;
            }
            int i2 = iArr[i];
            if (i2 != -1 && i2 != i) {
                return true;
            }
            i++;
        }
    }

    public void B() {
    }

    public void C(MotionEvent motionEvent) {
        z(1);
    }

    public void D() {
    }

    public void E(int i, int i2) {
    }

    public final void F(View view, qya qyaVar) {
        if (this.d != null || this.f29814r != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.f29811a, -1);
        this.f29812b = 0;
        this.e = 0;
        this.d = view;
        this.f29814r = qyaVar;
    }

    public final void G() {
        this.d = null;
        this.f29814r = null;
        Arrays.fill(this.f29811a, -1);
        this.f29812b = 0;
        D();
    }

    public T H(boolean z2) {
        if (this.d != null) {
            d();
        }
        this.i = z2;
        return this;
    }

    public T I(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.j == null) {
            this.j = new float[6];
        }
        float[] fArr = this.j;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        if (u(f5) && u(f) && u(f3)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (u(f5) && !u(f) && !u(f3)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (u(f6) && u(f4) && u(f2)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (!u(f6) || u(f4) || u(f2)) {
            return this;
        }
        throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
    }

    public T J(pya pyaVar) {
        this.t = pyaVar;
        return this;
    }

    public oya K(gah<T> gahVar) {
        this.s = gahVar;
        return this;
    }

    public T L(boolean z2) {
        this.p = z2;
        return this;
    }

    public void M(int i) {
        this.c = i;
    }

    public boolean N(oya oyaVar) {
        pya pyaVar;
        if (oyaVar == this || (pyaVar = this.t) == null) {
            return false;
        }
        return pyaVar.c(this, oyaVar);
    }

    public boolean O(oya oyaVar) {
        if (oyaVar == this) {
            return true;
        }
        pya pyaVar = this.t;
        if (pyaVar != null) {
            return pyaVar.d(this, oyaVar);
        }
        return false;
    }

    public boolean P(oya oyaVar) {
        pya pyaVar;
        if (oyaVar == this || (pyaVar = this.t) == null) {
            return false;
        }
        return pyaVar.b(this, oyaVar);
    }

    public boolean Q(oya oyaVar) {
        pya pyaVar;
        if (oyaVar == this || (pyaVar = this.t) == null) {
            return false;
        }
        return pyaVar.a(this, oyaVar);
    }

    public void R(int i) {
        int[] iArr = this.f29811a;
        if (iArr[i] == -1) {
            iArr[i] = i();
            this.f29812b++;
        }
    }

    public void S(int i) {
        int[] iArr = this.f29811a;
        if (iArr[i] != -1) {
            iArr[i] = -1;
            this.f29812b--;
        }
    }

    public boolean T() {
        int i;
        return (!this.i || (i = this.e) == 1 || i == 3 || i == 5 || this.f29812b <= 0) ? false : true;
    }

    public final void a() {
        int i = this.e;
        if (i == 0 || i == 2) {
            z(4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[SYNTHETIC] */
    public final MotionEvent b(MotionEvent motionEvent) {
        int actionIndex;
        int i;
        int pointerCount;
        int i2;
        int i3;
        int pointerId;
        if (!A(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i4 = 2;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 1 || actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
                if (this.f29811a[motionEvent.getPointerId(actionIndex)] != -1) {
                    i = actionIndex;
                    actionMasked = this.f29812b == 1 ? 1 : 6;
                }
            } else {
                i = -1;
            }
            v(this.f29812b);
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            pointerCount = motionEvent.getPointerCount();
            i2 = actionMasked;
            i3 = 0;
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerId = motionEvent.getPointerId(i5);
                if (this.f29811a[pointerId] != -1) {
                    motionEvent.getPointerProperties(i5, y[i3]);
                    y[i3].id = this.f29811a[pointerId];
                    motionEvent.getPointerCoords(i5, z[i3]);
                    if (i5 == i) {
                        i2 |= i3 << 8;
                    }
                    i3++;
                }
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i2, i3, y, z, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            motionEvent.setLocation(x2, y2);
            motionEventObtain.setLocation(x2, y2);
            return motionEventObtain;
        }
        actionIndex = motionEvent.getActionIndex();
        if (this.f29811a[motionEvent.getPointerId(actionIndex)] != -1) {
            i4 = this.f29812b == 1 ? 0 : 5;
        }
        int i6 = i4;
        i = actionIndex;
        actionMasked = i6;
        v(this.f29812b);
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        pointerCount = motionEvent.getPointerCount();
        i2 = actionMasked;
        i3 = 0;
        while (i5 < pointerCount) {
            pointerId = motionEvent.getPointerId(i5);
            if (this.f29811a[pointerId] != -1) {
                motionEvent.getPointerProperties(i5, y[i3]);
                y[i3].id = this.f29811a[pointerId];
                motionEvent.getPointerCoords(i5, z[i3]);
                if (i5 == i) {
                    i2 |= i3 << 8;
                }
                i3++;
            }
        }
        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i2, i3, y, z, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        motionEvent.setLocation(x3, y3);
        motionEventObtain2.setLocation(x3, y3);
        return motionEventObtain2;
    }

    public final void c() {
        if (this.e == 0) {
            z(2);
        }
    }

    public final void d() {
        int i = this.e;
        if (i == 4 || i == 0 || i == 2) {
            B();
            z(3);
        }
    }

    public void e(int i, int i2) {
        gah<T> gahVar = this.s;
        if (gahVar != null) {
            gahVar.b(this, i, i2);
        }
    }

    public void f(MotionEvent motionEvent) {
        gah<T> gahVar = this.s;
        if (gahVar != null) {
            gahVar.a(this, motionEvent);
        }
    }

    public final void g() {
        int i = this.e;
        if (i == 2 || i == 4) {
            z(5);
        }
    }

    public final void h() {
        int i = this.e;
        if (i == 4 || i == 0 || i == 2) {
            z(1);
        }
    }

    public final int i() {
        int[] iArr;
        int i = 0;
        while (i < this.f29812b) {
            int i2 = 0;
            while (true) {
                iArr = this.f29811a;
                if (i2 >= iArr.length || iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == iArr.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    public short j() {
        return this.f29813k;
    }

    public float k() {
        return this.l;
    }

    public float l() {
        return this.m;
    }

    public float m() {
        return this.l - this.n;
    }

    public float n() {
        return this.m - this.o;
    }

    public int o() {
        return this.q;
    }

    public int p() {
        return this.e;
    }

    public int q() {
        return this.c;
    }

    public View r() {
        return this.d;
    }

    public final void s(MotionEvent motionEvent) {
        int i;
        if (!this.i || (i = this.e) == 3 || i == 1 || i == 5 || this.f29812b < 1) {
            return;
        }
        MotionEvent motionEventB = b(motionEvent);
        this.f = motionEventB.getX();
        this.g = motionEventB.getY();
        this.q = motionEventB.getPointerCount();
        boolean zY = y(this.d, this.f, this.g);
        this.h = zY;
        if (this.p && !zY) {
            int i2 = this.e;
            if (i2 == 4) {
                d();
                return;
            } else {
                if (i2 == 2) {
                    h();
                    return;
                }
                return;
            }
        }
        this.l = sya.a(motionEventB, true);
        this.m = sya.b(motionEventB, true);
        this.n = motionEventB.getRawX() - motionEventB.getX();
        this.o = motionEventB.getRawY() - motionEventB.getY();
        C(motionEventB);
        if (motionEventB != motionEvent) {
            motionEventB.recycle();
        }
    }

    public boolean t(oya oyaVar) {
        int i = 0;
        while (true) {
            int[] iArr = this.f29811a;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != -1 && oyaVar.f29811a[i] != -1) {
                return true;
            }
            i++;
        }
    }

    public String toString() {
        View view = this.d;
        return getClass().getSimpleName() + "@[" + this.c + "]:" + (view == null ? null : view.getClass().getSimpleName());
    }

    public boolean w() {
        return this.i;
    }

    public boolean x() {
        return this.h;
    }

    public boolean y(View view, float f, float f2) {
        float f3;
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.j;
        float f4 = 0.0f;
        if (fArr != null) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            float f8 = fArr[3];
            float f9 = u(f5) ? 0.0f - f5 : 0.0f;
            f4 = u(f6) ? 0.0f - f8 : 0.0f;
            if (u(f7)) {
                width += f7;
            }
            if (u(f8)) {
                height += f8;
            }
            float[] fArr2 = this.j;
            float f10 = fArr2[4];
            float f11 = fArr2[5];
            if (u(f10)) {
                if (!u(f5)) {
                    f9 = width - f10;
                } else if (!u(f7)) {
                    width = f10 + f9;
                }
            }
            if (u(f11)) {
                if (!u(f4)) {
                    f4 = height - f11;
                } else if (!u(height)) {
                    height = f4 + f11;
                }
            }
            f3 = f4;
            f4 = f9;
        } else {
            f3 = 0.0f;
        }
        return f >= f4 && f <= width && f2 >= f3 && f2 <= height;
    }

    public final void z(int i) {
        int i2 = this.e;
        if (i2 == i) {
            return;
        }
        this.e = i;
        if (i == 4) {
            short s = A;
            A = (short) (s + 1);
            this.f29813k = s;
        }
        this.f29814r.r(this, i, i2);
        E(i, i2);
    }
}
