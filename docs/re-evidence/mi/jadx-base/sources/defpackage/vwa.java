package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class vwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f37299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f37300b;
    public BigInteger c;

    public vwa(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f37299a = bigInteger;
        this.f37300b = bigInteger2;
        this.c = bigInteger3;
    }

    public BigInteger a() {
        return this.c;
    }

    public BigInteger b() {
        return this.f37299a;
    }

    public BigInteger c() {
        return this.f37300b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vwa)) {
            return false;
        }
        vwa vwaVar = (vwa) obj;
        return this.c.equals(vwaVar.c) && this.f37299a.equals(vwaVar.f37299a) && this.f37300b.equals(vwaVar.f37300b);
    }

    public int hashCode() {
        return (this.c.hashCode() ^ this.f37299a.hashCode()) ^ this.f37300b.hashCode();
    }
}
