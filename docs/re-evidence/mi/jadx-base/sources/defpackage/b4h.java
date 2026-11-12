package defpackage;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class b4h implements pzd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3787b;

    public b4h(Object obj) {
        this.f3787b = a6i.d(obj);
    }

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f3787b.toString().getBytes(pzd.f30934a));
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        if (obj instanceof b4h) {
            return this.f3787b.equals(((b4h) obj).f3787b);
        }
        return false;
    }

    @Override // defpackage.pzd
    public int hashCode() {
        return this.f3787b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f3787b + AbstractJsonLexerKt.END_OBJ;
    }
}
