package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static jqr f15119a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f15120b = new Hashtable();
    public static final Hashtable c = new Hashtable();
    public static final Hashtable d = new Hashtable();

    public static class a extends jqr {
        @Override // defpackage.jqr
        public hqr a() {
            BigInteger bigIntegerE = d6.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger bigIntegerE2 = d6.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger bigIntegerE3 = d6.e("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger bigIntegerE4 = d6.e("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            b87 b87VarC = d6.c(new b87.e(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4, bigIntegerValueOf));
            return new hqr(b87VarC, new lqr(b87VarC, i7c.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigIntegerE4, bigIntegerValueOf, (byte[]) null);
        }
    }

    static {
        d("FRP256v1", j6.f22451a, f15119a);
    }

    public static b87 c(b87 b87Var) {
        return b87Var;
    }

    public static void d(String str, fe feVar, jqr jqrVar) {
        f15120b.put(str.toLowerCase(), feVar);
        d.put(feVar, str);
        c.put(feVar, jqrVar);
    }

    public static BigInteger e(String str) {
        return new BigInteger(1, i7c.a(str));
    }

    public static hqr f(String str) {
        fe feVarH = h(str);
        if (feVarH == null) {
            return null;
        }
        return g(feVarH);
    }

    public static hqr g(fe feVar) {
        jqr jqrVar = (jqr) c.get(feVar);
        if (jqrVar == null) {
            return null;
        }
        return jqrVar.b();
    }

    public static fe h(String str) {
        return (fe) f15120b.get(plo.f(str));
    }
}
