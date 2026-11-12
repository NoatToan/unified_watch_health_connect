package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ax9 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f3535a;
    }

    public static boolean a(okh okhVar, ex9 ex9Var, int i) {
        int iJ = j(okhVar, i);
        return iJ != -1 && iJ <= ex9Var.f17150b;
    }

    public static boolean b(okh okhVar, int i) {
        return okhVar.D() == wlq.v(okhVar.d(), i, okhVar.e() - 1, 0);
    }

    public static boolean c(okh okhVar, ex9 ex9Var, boolean z, a aVar) {
        try {
            long jK = okhVar.K();
            if (!z) {
                jK *= (long) ex9Var.f17150b;
            }
            aVar.f3535a = jK;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(okh okhVar, ex9 ex9Var, int i, a aVar) {
        int iE = okhVar.e();
        long jF = okhVar.F();
        long j = jF >>> 16;
        if (j != i) {
            return false;
        }
        return g((int) ((jF >> 4) & 15), ex9Var) && f((int) ((jF >> 1) & 7), ex9Var) && !(((jF & 1) > 1L ? 1 : ((jF & 1) == 1L ? 0 : -1)) == 0) && c(okhVar, ex9Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && a(okhVar, ex9Var, (int) ((jF >> 12) & 15)) && e(okhVar, ex9Var, (int) ((jF >> 8) & 15)) && b(okhVar, iE);
    }

    public static boolean e(okh okhVar, ex9 ex9Var, int i) {
        int i2 = ex9Var.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == ex9Var.f;
        }
        if (i == 12) {
            return okhVar.D() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int iJ = okhVar.J();
        if (i == 14) {
            iJ *= 10;
        }
        return iJ == i2;
    }

    public static boolean f(int i, ex9 ex9Var) {
        return i == 0 || i == ex9Var.i;
    }

    public static boolean g(int i, ex9 ex9Var) {
        if (i <= 7) {
            return i == ex9Var.g - 1;
        }
        return i <= 10 && ex9Var.g == 2;
    }

    public static boolean h(jl8 jl8Var, ex9 ex9Var, int i, a aVar) throws IOException {
        long jN = jl8Var.n();
        byte[] bArr = new byte[2];
        jl8Var.i(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            jl8Var.l();
            jl8Var.o((int) (jN - jl8Var.getPosition()));
            return false;
        }
        okh okhVar = new okh(16);
        System.arraycopy(bArr, 0, okhVar.d(), 0, 2);
        okhVar.O(ll8.a(jl8Var, okhVar.d(), 2, 14));
        jl8Var.l();
        jl8Var.o((int) (jN - jl8Var.getPosition()));
        return d(okhVar, ex9Var, i, aVar);
    }

    public static long i(jl8 jl8Var, ex9 ex9Var) throws IOException {
        jl8Var.l();
        jl8Var.o(1);
        byte[] bArr = new byte[1];
        jl8Var.i(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        jl8Var.o(2);
        int i = z ? 7 : 6;
        okh okhVar = new okh(i);
        okhVar.O(ll8.a(jl8Var, okhVar.d(), 0, i));
        jl8Var.l();
        a aVar = new a();
        if (c(okhVar, ex9Var, z, aVar)) {
            return aVar.f3535a;
        }
        throw new ParserException();
    }

    public static int j(okh okhVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return okhVar.D() + 1;
            case 7:
                return okhVar.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
