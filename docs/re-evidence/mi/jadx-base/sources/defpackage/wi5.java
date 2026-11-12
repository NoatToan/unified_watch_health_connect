package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wi5 implements lw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f37997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f37998b;
    public BigInteger c;

    public wi5(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f37997a = bigInteger3;
        this.c = bigInteger;
        this.f37998b = bigInteger2;
    }

    public BigInteger a() {
        return this.f37997a;
    }

    public BigInteger b() {
        return this.c;
    }

    public BigInteger c() {
        return this.f37998b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wi5)) {
            return false;
        }
        wi5 wi5Var = (wi5) obj;
        return wi5Var.b().equals(this.c) && wi5Var.c().equals(this.f37998b) && wi5Var.a().equals(this.f37997a);
    }

    public int hashCode() {
        return (b().hashCode() ^ c().hashCode()) ^ a().hashCode();
    }
}
