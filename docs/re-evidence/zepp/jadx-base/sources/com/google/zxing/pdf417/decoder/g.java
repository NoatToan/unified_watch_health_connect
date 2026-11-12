package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* JADX INFO: loaded from: classes4.dex */
class g {
    private static final int c = 5;
    private final c a;
    private final d[] b;

    public g(c cVar) {
        this.a = new c(cVar);
        this.b = new d[(cVar.e() - cVar.g()) + 1];
    }

    public final c a() {
        return this.a;
    }

    public final d b(int i) {
        return this.b[e(i)];
    }

    public final d c(int i) {
        d dVar;
        d dVar2;
        d dVarB = b(i);
        if (dVarB != null) {
            return dVarB;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iE = e(i) - i2;
            if (iE >= 0 && (dVar2 = this.b[iE]) != null) {
                return dVar2;
            }
            int iE2 = e(i) + i2;
            d[] dVarArr = this.b;
            if (iE2 < dVarArr.length && (dVar = dVarArr[iE2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    public final d[] d() {
        return this.b;
    }

    public final int e(int i) {
        return i - this.a.g();
    }

    public final void f(int i, d dVar) {
        this.b[e(i)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (d dVar : this.b) {
                if (dVar == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
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
