package defpackage;

import java.util.Formatter;

/* JADX INFO: loaded from: classes5.dex */
public class zz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53 f41819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r34[] f41820b;

    public zz5(i53 i53Var) {
        this.f41819a = new i53(i53Var);
        this.f41820b = new r34[(i53Var.e() - i53Var.g()) + 1];
    }

    public final i53 a() {
        return this.f41819a;
    }

    public final r34 b(int i) {
        return this.f41820b[e(i)];
    }

    public final r34 c(int i) {
        r34 r34Var;
        r34 r34Var2;
        r34 r34VarB = b(i);
        if (r34VarB != null) {
            return r34VarB;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iE = e(i) - i2;
            if (iE >= 0 && (r34Var2 = this.f41820b[iE]) != null) {
                return r34Var2;
            }
            int iE2 = e(i) + i2;
            r34[] r34VarArr = this.f41820b;
            if (iE2 < r34VarArr.length && (r34Var = r34VarArr[iE2]) != null) {
                return r34Var;
            }
        }
        return null;
    }

    public final r34[] d() {
        return this.f41820b;
    }

    public final int e(int i) {
        return i - this.f41819a.g();
    }

    public final void f(int i, r34 r34Var) {
        this.f41820b[e(i)] = r34Var;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (r34 r34Var : this.f41820b) {
                if (r34Var == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(r34Var.c()), Integer.valueOf(r34Var.e()));
                    i++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
