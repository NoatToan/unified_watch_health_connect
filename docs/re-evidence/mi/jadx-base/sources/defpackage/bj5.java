package defpackage;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;

/* JADX INFO: loaded from: classes3.dex */
public class bj5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ee[] f4277a = {uqr.wb, y2h.j, uqr.xb};

    public static String a(BigInteger bigInteger, DSAParams dSAParams) {
        return new bo9(vj1.l(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    public static wi5 b(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new wi5(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }
}
