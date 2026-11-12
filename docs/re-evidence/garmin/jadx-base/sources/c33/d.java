package c33;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import p13.w0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, e> f24170b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, Map<String, ? extends e> map) {
        str.getClass();
        map.getClass();
        this.f24169a = str;
        this.f24170b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f24169a.equals(dVar.f24169a) && this.f24170b.equals(dVar.f24170b);
    }

    public final int hashCode() {
        return this.f24170b.hashCode() + (this.f24169a.hashCode() * 31);
    }

    public final String toString() {
        return "@" + this.f24169a + CoreConstants.LEFT_PARENTHESIS_CHAR + p13.h0.k0(w0.o(this.f24170b), null, null, null, c.f24165a, 31) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
