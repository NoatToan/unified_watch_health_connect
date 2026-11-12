package pj;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import qj.l;
import ui.e;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f137874b;

    public d(Object obj) {
        l.c(obj, "Argument must not be null");
        this.f137874b = obj;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f137874b.toString().getBytes(e.f171166a));
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f137874b.equals(((d) obj).f137874b);
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        return this.f137874b.hashCode();
    }

    public final String toString() {
        return g.p(new StringBuilder("ObjectKey{object="), this.f137874b, CoreConstants.CURLY_RIGHT);
    }
}
