package defpackage;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes3.dex */
public class a97 extends ECParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f793a;

    public a97(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f793a = str;
    }

    public String a() {
        return this.f793a;
    }
}
