package wi;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements ui.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ui.e f185290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ui.e f185291c;

    public d(ui.e eVar, ui.e eVar2) {
        this.f185290b = eVar;
        this.f185291c = eVar2;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        this.f185290b.b(messageDigest);
        this.f185291c.b(messageDigest);
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f185290b.equals(dVar.f185290b) && this.f185291c.equals(dVar.f185291c)) {
                return true;
            }
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        return this.f185291c.hashCode() + (this.f185290b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f185290b + ", signature=" + this.f185291c + CoreConstants.CURLY_RIGHT;
    }
}
