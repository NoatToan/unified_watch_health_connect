package f33;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.f68696a = str;
        this.f68697b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f68696a, aVar.f68696a) && s.g(this.f68697b, aVar.f68697b);
    }

    public final int hashCode() {
        return this.f68697b.hashCode() + (this.f68696a.hashCode() * 31);
    }

    public final String toString() {
        return this.f68696a + CoreConstants.COLON_CHAR + this.f68697b;
    }
}
