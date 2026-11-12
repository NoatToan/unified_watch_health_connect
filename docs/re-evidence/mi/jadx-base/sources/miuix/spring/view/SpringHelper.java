package miuix.spring.view;

import androidx.annotation.Keep;
import defpackage.z7o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SpringHelper implements z7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f26885a = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f26886b = new b(1);

    public class a extends c {
        public a(int i) {
            super(i);
        }

        @Override // miuix.spring.view.SpringHelper.c
        public boolean a() {
            return SpringHelper.this.b();
        }

        @Override // miuix.spring.view.SpringHelper.c
        public int b() {
            return SpringHelper.this.i();
        }

        @Override // miuix.spring.view.SpringHelper.c
        public void f() {
            SpringHelper.this.vibrate();
        }
    }

    public class b extends c {
        public b(int i) {
            super(i);
        }

        @Override // miuix.spring.view.SpringHelper.c
        public boolean a() {
            return SpringHelper.this.c();
        }

        @Override // miuix.spring.view.SpringHelper.c
        public int b() {
            return SpringHelper.this.f();
        }

        @Override // miuix.spring.view.SpringHelper.c
        public void f() {
            SpringHelper.this.vibrate();
        }
    }

    public abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f26887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f26888b;
        public int c;

        public c(int i) {
            this.c = i;
        }

        public abstract boolean a();

        public abstract int b();

        public boolean c(int[] iArr, int[] iArr2, boolean z) {
            int i = iArr[this.c];
            if (i != 0 && a()) {
                float f = this.f26887a;
                if (f == 0.0f || Integer.signum((int) f) * i > 0) {
                    return false;
                }
                iArr[this.c] = h(i, iArr2, z);
                return true;
            }
            return false;
        }

        public boolean d(int i, int[] iArr, int i2, int[] iArr2) {
            if (SpringHelper.this.m()) {
                return g(i, iArr2, i2 == 0);
            }
            return false;
        }

        public final float e(float f) {
            float f2;
            float fPow;
            int iB = b();
            if (iB == 0) {
                fPow = Math.abs(f);
                f2 = 0.5f;
            } else {
                f2 = iB;
                double dMin = Math.min(Math.abs(f) / f2, 1.0f);
                fPow = (float) (((Math.pow(dMin, 3.0d) / 3.0d) - Math.pow(dMin, 2.0d)) + dMin);
            }
            return fPow * f2;
        }

        public abstract void f();

        public final boolean g(int i, int[] iArr, boolean z) {
            if (i == 0 || !a()) {
                return false;
            }
            float f = i;
            float f2 = this.f26888b + f;
            this.f26888b = f2;
            if (z) {
                this.f26887a = Math.signum(f2) * e(Math.abs(this.f26888b));
            } else {
                if (this.f26887a == 0.0f) {
                    f();
                }
                float f3 = this.f26887a + f;
                this.f26887a = f3;
                this.f26888b = Math.signum(f3) * i(Math.abs(this.f26887a));
            }
            int i2 = this.c;
            iArr[i2] = iArr[i2] + i;
            return true;
        }

        public final int h(int i, int[] iArr, boolean z) {
            float f = this.f26887a;
            float f2 = this.f26888b;
            float fSignum = Math.signum(f);
            float f3 = this.f26888b + i;
            this.f26888b = f3;
            if (z) {
                this.f26887a = Math.signum(f3) * e(Math.abs(this.f26888b));
                int i2 = this.c;
                iArr[i2] = iArr[i2] + (i - i);
            }
            int i3 = (int) (this.f26887a + (this.f26888b - f2));
            float f4 = i3;
            if (fSignum * f4 >= 0.0f) {
                if (!z) {
                    this.f26887a = f4;
                }
                iArr[this.c] = i;
            } else {
                this.f26887a = 0.0f;
                int i4 = this.c;
                iArr[i4] = (int) (iArr[i4] + f);
            }
            float f5 = this.f26887a;
            if (f5 == 0.0f) {
                this.f26888b = 0.0f;
            }
            if (!z) {
                this.f26888b = Math.signum(f5) * i(Math.abs(this.f26887a));
            }
            return i3;
        }

        public final float i(float f) {
            int iB = b();
            if (iB == 0) {
                return Math.abs(f) * 2.0f;
            }
            float f2 = iB;
            if (Math.abs(f) / f2 > 0.33333334f) {
                return f * 3.0f;
            }
            double d = iB;
            return (float) (d - (Math.pow(d, 0.6666666865348816d) * Math.pow(f2 - (Math.abs(f) * 3.0f), 0.3333333432674408d)));
        }
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i, int i2, int[] iArr, int[] iArr2, int i3);

    public abstract void e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2);

    public abstract int f();

    public int g() {
        return (int) this.f26885a.f26887a;
    }

    public int h() {
        return (int) this.f26886b.f26887a;
    }

    public abstract int i();

    public boolean j(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        boolean z;
        int[] iArr3 = {0, 0};
        if (m()) {
            boolean z2 = i3 == 0;
            int[] iArr4 = {i, i2};
            boolean zC = this.f26886b.c(iArr4, iArr3, z2) | this.f26885a.c(iArr4, iArr3, z2);
            i4 = iArr4[0];
            i5 = iArr4[1];
            if (zC) {
                a(this.f26885a.f26888b, this.f26886b.f26888b);
            }
            z = zC;
        } else {
            i4 = i;
            i5 = i2;
            z = false;
        }
        if (z) {
            i4 -= iArr3[0];
            i5 -= iArr3[1];
        }
        boolean zD = d(i4, i5, iArr, iArr2, i3) | z;
        if (iArr != null) {
            iArr[0] = iArr[0] + iArr3[0];
            iArr[1] = iArr[1] + iArr3[1];
        }
        return zD;
    }

    public void k(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int[] iArr3 = iArr2 == null ? new int[]{0, 0} : iArr2;
        e(i, i2, i3, i4, iArr, i5, iArr3);
        int i6 = i3 - iArr3[0];
        int i7 = i4 - iArr3[1];
        if (i6 == 0 && i7 == 0) {
            return;
        }
        boolean zD = this.f26885a.d(i6, iArr, i5, iArr3);
        boolean zD2 = this.f26886b.d(i7, iArr, i5, iArr3);
        if (zD || zD2) {
            a(this.f26885a.f26888b, this.f26886b.f26888b);
        }
    }

    public void l() {
        c cVar = this.f26885a;
        boolean z = (cVar.f26888b == 0.0f && this.f26886b.f26888b == 0.0f) ? false : true;
        c cVar2 = this.f26886b;
        cVar2.f26887a = 0.0f;
        cVar2.f26888b = 0.0f;
        cVar.f26887a = 0.0f;
        cVar.f26888b = 0.0f;
        if (z) {
            a(0.0f, cVar2.f26888b);
        }
    }

    public abstract boolean m();

    @Keep
    public abstract void vibrate();
}
