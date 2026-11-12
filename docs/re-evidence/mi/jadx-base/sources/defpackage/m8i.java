package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class m8i implements do9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f25887a;

    public m8i(BigInteger bigInteger) {
        this.f25887a = bigInteger;
    }

    @Override // defpackage.do9
    public int a() {
        return 1;
    }

    @Override // defpackage.do9
    public BigInteger b() {
        return this.f25887a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m8i) {
            return this.f25887a.equals(((m8i) obj).f25887a);
        }
        return false;
    }

    public int hashCode() {
        return this.f25887a.hashCode();
    }
}
