package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f38422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f38423b;
    public BigInteger c;

    public wwa(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f38422a = bigInteger;
        this.f38423b = bigInteger2;
        this.c = bigInteger3;
    }

    public BigInteger a() {
        return this.c;
    }

    public BigInteger b() {
        return this.f38422a;
    }

    public BigInteger c() {
        return this.f38423b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wwa)) {
            return false;
        }
        wwa wwaVar = (wwa) obj;
        return this.c.equals(wwaVar.c) && this.f38422a.equals(wwaVar.f38422a) && this.f38423b.equals(wwaVar.f38423b);
    }

    public int hashCode() {
        return (this.c.hashCode() ^ this.f38422a.hashCode()) ^ this.f38423b.hashCode();
    }
}
