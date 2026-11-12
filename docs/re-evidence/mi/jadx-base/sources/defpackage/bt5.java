package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class bt5 implements r61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4585b;
    public final byte[] c;
    public final q61[] d;
    public int e;
    public int f;
    public int g;
    public q61[] h;

    public bt5(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // defpackage.r61
    public synchronized void a(q61 q61Var) {
        q61[] q61VarArr = this.d;
        q61VarArr[0] = q61Var;
        c(q61VarArr);
    }

    @Override // defpackage.r61
    public synchronized void b() {
        try {
            int i = 0;
            int iMax = Math.max(0, wlq.l(this.e, this.f4585b) - this.f);
            int i2 = this.g;
            if (iMax >= i2) {
                return;
            }
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    q61 q61Var = (q61) rk1.e(this.h[i]);
                    if (q61Var.f31154a == this.c) {
                        i++;
                    } else {
                        q61 q61Var2 = (q61) rk1.e(this.h[i3]);
                        if (q61Var2.f31154a != this.c) {
                            i3--;
                        } else {
                            q61[] q61VarArr = this.h;
                            q61VarArr[i] = q61Var2;
                            q61VarArr[i3] = q61Var;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.g) {
                    return;
                }
            }
            Arrays.fill(this.h, iMax, this.g, (Object) null);
            this.g = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.r61
    public synchronized void c(q61[] q61VarArr) {
        try {
            int i = this.g;
            int length = q61VarArr.length + i;
            q61[] q61VarArr2 = this.h;
            if (length >= q61VarArr2.length) {
                this.h = (q61[]) Arrays.copyOf(q61VarArr2, Math.max(q61VarArr2.length * 2, i + q61VarArr.length));
            }
            for (q61 q61Var : q61VarArr) {
                q61[] q61VarArr3 = this.h;
                int i2 = this.g;
                this.g = i2 + 1;
                q61VarArr3[i2] = q61Var;
            }
            this.f -= q61VarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.r61
    public synchronized q61 d() {
        q61 q61Var;
        try {
            this.f++;
            int i = this.g;
            if (i > 0) {
                q61[] q61VarArr = this.h;
                int i2 = i - 1;
                this.g = i2;
                q61Var = (q61) rk1.e(q61VarArr[i2]);
                this.h[this.g] = null;
            } else {
                q61Var = new q61(new byte[this.f4585b], 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q61Var;
    }

    @Override // defpackage.r61
    public int e() {
        return this.f4585b;
    }

    public synchronized int f() {
        return this.f * this.f4585b;
    }

    public synchronized void g() {
        if (this.f4584a) {
            h(0);
        }
    }

    public synchronized void h(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            b();
        }
    }

    public bt5(boolean z, int i, int i2) {
        rk1.a(i > 0);
        rk1.a(i2 >= 0);
        this.f4584a = z;
        this.f4585b = i;
        this.g = i2;
        this.h = new q61[i2 + 100];
        if (i2 > 0) {
            this.c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.h[i3] = new q61(this.c, i3 * i);
            }
        } else {
            this.c = null;
        }
        this.d = new q61[1];
    }
}
