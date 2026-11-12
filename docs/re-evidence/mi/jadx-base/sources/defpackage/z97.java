package defpackage;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class z97 {
    public static eqr a(ECParameterSpec eCParameterSpec, boolean z) {
        if (!(eCParameterSpec instanceof a97)) {
            if (eCParameterSpec == null) {
                return new eqr((ae) mg5.f26130a);
            }
            a87 a87VarA = t77.a(eCParameterSpec.getCurve());
            return new eqr(new iqr(a87VarA, t77.d(a87VarA, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        a97 a97Var = (a97) eCParameterSpec;
        ee eeVarH = y97.h(a97Var.a());
        if (eeVarH == null) {
            eeVarH = new ee(a97Var.a());
        }
        return new eqr(eeVarH);
    }
}
