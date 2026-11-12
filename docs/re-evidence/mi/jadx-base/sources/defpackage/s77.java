package defpackage;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class s77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map f33366a = new HashMap();

    static {
        Enumeration enumerationJ = de5.j();
        while (enumerationJ.hasMoreElements()) {
            String str = (String) enumerationJ.nextElement();
            hqr hqrVarA = b97.a(str);
            if (hqrVarA != null) {
                f33366a.put(hqrVarA.g(), de5.h(str).g());
            }
        }
    }

    public static b87 a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a2 = ellipticCurve.getA();
        BigInteger b2 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            b87.e eVar = new b87.e(((ECFieldFp) field).getP(), a2, b2);
            return f33366a.containsKey(eVar) ? (b87) f33366a.get(eVar) : eVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] iArrA = x97.a(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new b87.d(m, iArrA[0], iArrA[1], iArrA[2], a2, b2);
    }

    public static EllipticCurve b(b87 b87Var, byte[] bArr) {
        return new EllipticCurve(c(b87Var.o()), b87Var.k().s(), b87Var.l().s(), null);
    }

    public static ECField c(do9 do9Var) {
        if (u77.d(do9Var)) {
            return new ECFieldFp(do9Var.b());
        }
        v2i v2iVarC = ((x2i) do9Var).c();
        int[] iArrA = v2iVarC.a();
        return new ECFieldF2m(v2iVarC.b(), wj1.r(wj1.i(iArrA, 1, iArrA.length - 1)));
    }

    public static i97 d(b87 b87Var, ECPoint eCPoint, boolean z) {
        return b87Var.d(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static i97 e(ECParameterSpec eCParameterSpec, ECPoint eCPoint, boolean z) {
        return d(a(eCParameterSpec.getCurve()), eCPoint, z);
    }

    public static e97 f(ECParameterSpec eCParameterSpec, boolean z) {
        b87 b87VarA = a(eCParameterSpec.getCurve());
        return new e97(b87VarA, d(b87VarA, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static ECParameterSpec g(dqr dqrVar, b87 b87Var) {
        if (dqrVar.j()) {
            fe feVar = (fe) dqrVar.h();
            hqr hqrVarC = x97.c(feVar);
            return new z87(x97.b(feVar), b(b87Var, hqrVarC.l()), new ECPoint(hqrVarC.h().f().s(), hqrVarC.h().g().s()), hqrVarC.k(), hqrVarC.i());
        }
        if (dqrVar.i()) {
            return null;
        }
        hqr hqrVarJ = hqr.j(dqrVar.h());
        EllipticCurve ellipticCurveB = b(b87Var, hqrVarJ.l());
        return hqrVarJ.i() != null ? new ECParameterSpec(ellipticCurveB, new ECPoint(hqrVarJ.h().f().s(), hqrVarJ.h().g().s()), hqrVarJ.k(), hqrVarJ.i().intValue()) : new ECParameterSpec(ellipticCurveB, new ECPoint(hqrVarJ.h().f().s(), hqrVarJ.h().g().s()), hqrVarJ.k(), 1);
    }

    public static b87 h(eei eeiVar, dqr dqrVar) {
        if (dqrVar.j()) {
            return x97.c(fe.w(dqrVar.h())).g();
        }
        return dqrVar.i() ? eeiVar.a().a() : hqr.j(dqrVar.h()).g();
    }
}
