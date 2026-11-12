package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static kqr f667a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f668b = new Hashtable();
    public static final Hashtable c = new Hashtable();
    public static final Hashtable d = new Hashtable();

    public static class a extends kqr {
        @Override // defpackage.kqr
        public iqr a() {
            BigInteger bigIntegerE = a6.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger bigIntegerE2 = a6.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger bigIntegerE3 = a6.e("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger bigIntegerE4 = a6.e("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            a87 a87VarC = a6.c(new a87.e(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4, bigIntegerValueOf));
            return new iqr(a87VarC, new mqr(a87VarC, h7c.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigIntegerE4, bigIntegerValueOf, (byte[]) null);
        }
    }

    static {
        d("FRP256v1", k6.f23505a, f667a);
    }

    public static a87 c(a87 a87Var) {
        return a87Var;
    }

    public static void d(String str, ee eeVar, kqr kqrVar) {
        f668b.put(olo.f(str), eeVar);
        d.put(eeVar, str);
        c.put(eeVar, kqrVar);
    }

    public static BigInteger e(String str) {
        return new BigInteger(1, h7c.a(str));
    }

    public static iqr f(String str) {
        ee eeVarI = i(str);
        if (eeVarI == null) {
            return null;
        }
        return g(eeVarI);
    }

    public static iqr g(ee eeVar) {
        kqr kqrVar = (kqr) c.get(eeVar);
        if (kqrVar == null) {
            return null;
        }
        return kqrVar.b();
    }

    public static String h(ee eeVar) {
        return (String) d.get(eeVar);
    }

    public static ee i(String str) {
        return (ee) f668b.get(olo.f(str));
    }
}
