package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class vva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static kqr f37267a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static kqr f37268b = new b();
    public static final Hashtable c = new Hashtable();
    public static final Hashtable d = new Hashtable();
    public static final Hashtable e = new Hashtable();

    public static class a extends kqr {
        @Override // defpackage.kqr
        public iqr a() {
            BigInteger bigIntegerE = vva.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger bigIntegerE2 = vva.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger bigIntegerE3 = vva.e("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger bigIntegerE4 = vva.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            a87 a87VarC = vva.c(new a87.e(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4, bigIntegerValueOf));
            return new iqr(a87VarC, new mqr(a87VarC, h7c.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), bigIntegerE4, bigIntegerValueOf, (byte[]) null);
        }
    }

    public static class b extends kqr {
        @Override // defpackage.kqr
        public iqr a() {
            BigInteger bigIntegerE = vva.e("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger bigIntegerE2 = vva.e("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger bigIntegerE3 = vva.e("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger bigIntegerE4 = vva.e("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            a87 a87VarC = vva.c(new a87.e(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4, bigIntegerValueOf));
            return new iqr(a87VarC, new mqr(a87VarC, h7c.a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), bigIntegerE4, bigIntegerValueOf, (byte[]) null);
        }
    }

    static {
        d("wapip192v1", wva.J, f37268b);
        d("sm2p256v1", wva.F, f37267a);
    }

    public static a87 c(a87 a87Var) {
        return a87Var;
    }

    public static void d(String str, ee eeVar, kqr kqrVar) {
        c.put(olo.f(str), eeVar);
        e.put(eeVar, str);
        d.put(eeVar, kqrVar);
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
        kqr kqrVar = (kqr) d.get(eeVar);
        if (kqrVar == null) {
            return null;
        }
        return kqrVar.b();
    }

    public static String h(ee eeVar) {
        return (String) e.get(eeVar);
    }

    public static ee i(String str) {
        return (ee) c.get(olo.f(str));
    }
}
