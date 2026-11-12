package defpackage;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wk5 implements pzd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pzd f38053b;
    public final pzd c;

    public wk5(pzd pzdVar, pzd pzdVar2) {
        this.f38053b = pzdVar;
        this.c = pzdVar2;
    }

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        this.f38053b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        if (!(obj instanceof wk5)) {
            return false;
        }
        wk5 wk5Var = (wk5) obj;
        return this.f38053b.equals(wk5Var.f38053b) && this.c.equals(wk5Var.c);
    }

    @Override // defpackage.pzd
    public int hashCode() {
        return (this.f38053b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f38053b + ", signature=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
