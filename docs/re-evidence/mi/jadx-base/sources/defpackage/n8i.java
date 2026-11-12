package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class n8i implements eo9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f27659a;

    public n8i(BigInteger bigInteger) {
        this.f27659a = bigInteger;
    }

    @Override // defpackage.eo9
    public int a() {
        return 1;
    }

    @Override // defpackage.eo9
    public BigInteger b() {
        return this.f27659a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n8i) {
            return this.f27659a.equals(((n8i) obj).f27659a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27659a.hashCode();
    }
}
