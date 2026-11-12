package defpackage;

import android.graphics.Rect;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes16.dex */
public class qpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f46617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f46619c;
    private long d;
    private qpp h;
    private int[] i;
    private int j;
    private int o;
    private int g = 0;
    private int e = 0;
    private int n = 0;
    private boolean f = false;
    private qps k = new qps();
    private Rect m = new Rect();

    private int d(int i, int i2, int i3) {
        return (i >= i2 && i2 + (-1) < i3) ? i3 + (i - i2) : i;
    }

    public qpq(qpp qppVar) {
        this.h = qppVar;
    }

    public void e() {
        this.i = new int[0];
        this.f46617a = new int[0];
        this.d = 0L;
        this.f46619c = 0L;
        this.f46618b = 0;
        this.j = 0;
        this.o = 0;
        this.f = false;
    }

    public void c(int i, int i2, int i3, int i4, int i5) {
        this.i = new int[i];
        this.f46617a = new int[i2];
        this.e = i3;
        this.n = i4;
        this.g = i5;
        this.f = true;
    }

    void d() {
        if (!this.f) {
            throw new IllegalStateException("You need to init matrix before work!");
        }
    }

    public void l() {
        d();
        this.d = 0L;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f46617a;
            if (i2 >= iArr.length) {
                break;
            }
            long j = this.d + ((long) iArr[i2]);
            this.d = j;
            if (i2 == this.g - 1) {
                this.j = (int) j;
            }
            i2++;
        }
        this.f46619c = 0L;
        this.o = 0;
        while (true) {
            int[] iArr2 = this.i;
            if (i >= iArr2.length) {
                return;
            }
            long j2 = this.f46619c;
            int i3 = iArr2[i];
            long j3 = j2 + ((long) i3);
            this.f46619c = j3;
            if (i == this.e - 1) {
                this.f46618b = (int) j3;
            } else if (i >= iArr2.length - this.n) {
                this.o += i3;
            }
            i++;
        }
    }

    public int b(int i) {
        d();
        if (i < 0) {
            return 0;
        }
        int[] iArr = this.f46617a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public void d(int i, int i2) {
        d();
        if (i >= 0) {
            int[] iArr = this.f46617a;
            if (i < iArr.length) {
                iArr[i] = i2;
            }
        }
    }

    public int a(int i, int i2) {
        d();
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            int[] iArr = this.f46617a;
            if (iArr == null) {
                break;
            }
            i3 += iArr[i4];
        }
        return i3 + ((i2 - i) * this.h.c());
    }

    public int b() {
        int[] iArr = this.f46617a;
        if (iArr != null) {
            return iArr.length;
        }
        return 0;
    }

    public int c(int i) {
        d();
        if (i < 0) {
            return 0;
        }
        int[] iArr = this.i;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public void b(int i, int i2) {
        d();
        if (i >= 0) {
            int[] iArr = this.i;
            if (i < iArr.length) {
                iArr[i] = i2;
            }
        }
    }

    public int c(int i, int i2) {
        d();
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            int[] iArr = this.i;
            if (iArr == null) {
                break;
            }
            i3 += iArr[i4];
        }
        return i3 + ((i2 - i) * this.h.b());
    }

    public int j() {
        int[] iArr = this.i;
        if (iArr != null) {
            return iArr.length;
        }
        return 0;
    }

    public int o() {
        return this.n;
    }

    public long h() {
        d();
        return this.d + ((long) ((this.h.o() ? b() + 1 : b() - 1) * this.h.c()));
    }

    public long a() {
        d();
        return this.f46619c + ((long) ((this.h.m() ? j() + 1 : j() - 1) * this.h.b()));
    }

    public int g() {
        return Math.max(0, this.j + ((this.h.o() ? this.g : this.g - 1) * this.h.c()));
    }

    public int c() {
        return Math.max(0, this.f46618b + ((this.h.m() ? this.e : this.e - 1) * this.h.b()));
    }

    public int i() {
        return Math.max(0, this.o + ((this.h.m() ? this.n : this.n - 1) * this.h.b()));
    }

    public int e(int i) {
        d();
        int iC = i - ((this.h.o() ? 1 : 0) * this.h.c());
        int i2 = 0;
        if (iC <= 0) {
            return 0;
        }
        int length = this.f46617a.length;
        int i3 = 0;
        while (i2 < length) {
            int iC2 = this.f46617a[i2] + i3 + this.h.c();
            if (iC > i3 && iC < iC2) {
                return i2;
            }
            if (iC < iC2) {
                return i2 - 1;
            }
            i2++;
            i3 = iC2;
        }
        return this.f46617a.length - 1;
    }

    public int a(int i) {
        d();
        int iB = i - ((this.h.m() ? 1 : 0) * this.h.b());
        int i2 = 0;
        if (iB <= 0) {
            return 0;
        }
        int length = this.i.length;
        int i3 = 0;
        while (i2 < length) {
            int iB2 = this.i[i2] + i3 + this.h.b();
            if (iB > i3 && iB < iB2) {
                return i2;
            }
            if (iB < iB2) {
                return i2 - 1;
            }
            i2++;
            i3 = iB2;
        }
        return this.i.length - 1;
    }

    public d[][] c(Rect rect) {
        int i;
        int i2 = this.h.i() ? this.e : 0;
        int i3 = this.h.l() ? this.n : 0;
        int i4 = this.h.n() ? this.g : 0;
        int iE = e(rect.left);
        int iE2 = e(rect.right);
        int iA = a(rect.top);
        int iA2 = a(rect.bottom);
        if (iE > iE2) {
            i = iE2;
        } else {
            i = iE;
            iE = iE2;
        }
        int i5 = (iE - i) + 1;
        int i6 = i4 + (-1) < i ? i5 + i4 : i5 + i;
        int iJ = (iA2 - iA) + 1 + (i2 + (-1) < iA ? i2 : iA) + (i3 < (j() + (-1)) - iA2 ? i3 : (j() - 1) - iA2);
        d[][] dVarArr = (d[][]) Array.newInstance((Class<?>) d.class, iJ, i6);
        int i7 = 0;
        while (i7 < iJ) {
            int i8 = i7;
            int iA3 = a(i7, iJ, iA, i2, i3);
            for (int i9 = 0; i9 < i6; i9++) {
                int iD = d(i9, i4, i);
                dVarArr[i8][i9] = new d(iA3, iD, e(iA3, iD));
            }
            i7 = i8 + 1;
        }
        return dVarArr;
    }

    private int a(int i, int i2, int i3, int i4, int i5) {
        if (i >= i4) {
            if (i > (i2 - i5) - 1) {
                return j() - (i2 - i);
            }
            if (i4 - 1 < i3) {
                return i3 + (i - i4);
            }
        }
        return i;
    }

    int e(int i, int i2) {
        int i3;
        if (i < this.g) {
            i3 = 2;
        } else {
            i3 = i > (j() - 1) - this.n ? 4 : 0;
        }
        return i3 | (i2 < this.e ? 1 : 0);
    }

    public qps f() {
        return this.k;
    }

    public Rect e(boolean z) {
        if (z) {
            this.m.set(((int) Math.max(h(), this.h.d())) - this.k.b(), this.k.a(), ((int) Math.max(h(), this.h.d())) - (this.k.b() + this.h.d()), this.k.a() + this.h.e());
        } else {
            this.m.set(this.k.b(), this.k.a(), this.k.b() + this.h.d(), this.k.a() + this.h.e());
        }
        return this.m;
    }

    public boolean m() {
        return this.f;
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46621c;
        private int e;

        d(int i, int i2, int i3) {
            this.f46621c = i;
            this.e = i2;
            this.f46620b = i3;
        }

        public int c() {
            return this.e;
        }

        public int e() {
            return this.f46621c;
        }

        public int b() {
            return this.f46620b;
        }
    }
}
