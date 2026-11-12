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
import java.util.Set;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class t77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map f34404a = new HashMap();

    static {
        Enumeration enumerationJ = ce5.j();
        while (enumerationJ.hasMoreElements()) {
            String str = (String) enumerationJ.nextElement();
            iqr iqrVarB = c97.b(str);
            if (iqrVarB != null) {
                f34404a.put(iqrVarB.g(), ce5.h(str).g());
            }
        }
        iqr iqrVarH = ce5.h("Curve25519");
        f34404a.put(new a87.e(iqrVarH.g().r().b(), iqrVarH.g().n().t(), iqrVarH.g().o().t()), iqrVarH.g());
    }

    public static a87 a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a2 = ellipticCurve.getA();
        BigInteger b2 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            a87.e eVar = new a87.e(((ECFieldFp) field).getP(), a2, b2);
            return f34404a.containsKey(eVar) ? (a87) f34404a.get(eVar) : eVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] iArrB = y97.b(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new a87.d(m, iArrB[0], iArrB[1], iArrB[2], a2, b2);
    }

    public static EllipticCurve b(a87 a87Var, byte[] bArr) {
        return new EllipticCurve(c(a87Var.r()), a87Var.n().t(), a87Var.o().t(), null);
    }

    public static ECField c(eo9 eo9Var) {
        if (v77.g(eo9Var)) {
            return new ECFieldFp(eo9Var.b());
        }
        w2i w2iVarC = ((y2i) eo9Var).c();
        int[] iArrA = w2iVarC.a();
        return new ECFieldF2m(w2iVarC.b(), vj1.y(vj1.n(iArrA, 1, iArrA.length - 1)));
    }

    public static h97 d(a87 a87Var, ECPoint eCPoint, boolean z) {
        return a87Var.f(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static h97 e(ECParameterSpec eCParameterSpec, ECPoint eCPoint, boolean z) {
        return d(a(eCParameterSpec.getCurve()), eCPoint, z);
    }

    public static ECPoint f(h97 h97Var) {
        h97 h97VarY = h97Var.y();
        return new ECPoint(h97VarY.f().t(), h97VarY.g().t());
    }

    public static f97 g(ECParameterSpec eCParameterSpec, boolean z) {
        a87 a87VarA = a(eCParameterSpec.getCurve());
        return new f97(a87VarA, d(a87VarA, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static ECParameterSpec h(EllipticCurve ellipticCurve, f97 f97Var) {
        return f97Var instanceof y87 ? new a97(((y87) f97Var).f(), ellipticCurve, f(f97Var.b()), f97Var.d(), f97Var.c()) : new ECParameterSpec(ellipticCurve, f(f97Var.b()), f97Var.d(), f97Var.c().intValue());
    }

    public static ECParameterSpec i(eqr eqrVar, a87 a87Var) {
        if (!eqrVar.j()) {
            if (eqrVar.i()) {
                return null;
            }
            iqr iqrVarJ = iqr.j(eqrVar.h());
            EllipticCurve ellipticCurveB = b(a87Var, iqrVarJ.l());
            return iqrVarJ.i() != null ? new ECParameterSpec(ellipticCurveB, f(iqrVarJ.h()), iqrVarJ.k(), iqrVarJ.i().intValue()) : new ECParameterSpec(ellipticCurveB, f(iqrVarJ.h()), iqrVarJ.k(), 1);
        }
        ee eeVar = (ee) eqrVar.h();
        iqr iqrVarG = y97.g(eeVar);
        if (iqrVarG == null) {
            Map mapC = BouncyCastleProvider.CONFIGURATION.c();
            if (!mapC.isEmpty()) {
                iqrVarG = (iqr) mapC.get(eeVar);
            }
        }
        return new a97(y97.d(eeVar), b(a87Var, iqrVarG.l()), f(iqrVarG.h()), iqrVarG.k(), iqrVarG.i());
    }

    public static a87 j(fei feiVar, eqr eqrVar) {
        Set setB = feiVar.b();
        if (!eqrVar.j()) {
            if (eqrVar.i()) {
                return feiVar.a().a();
            }
            if (setB.isEmpty()) {
                return iqr.j(eqrVar.h()).g();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        ee eeVarW = ee.w(eqrVar.h());
        if (!setB.isEmpty() && !setB.contains(eeVarW)) {
            throw new IllegalStateException("named curve not acceptable");
        }
        iqr iqrVarG = y97.g(eeVarW);
        if (iqrVarG == null) {
            iqrVarG = (iqr) feiVar.c().get(eeVarW);
        }
        return iqrVarG.g();
    }

    public static d87 k(fei feiVar, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return y97.e(feiVar, g(eCParameterSpec, false));
        }
        f97 f97VarA = feiVar.a();
        return new d87(f97VarA.a(), f97VarA.b(), f97VarA.d(), f97VarA.c(), f97VarA.e());
    }
}
