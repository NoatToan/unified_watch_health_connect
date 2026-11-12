package hi;

import ch.qos.logback.core.joran.action.Action;
import d53.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhi/d;", "", "", Action.KEY_ATTRIBUTE, "record", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83780b;

    public d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f83779a = str;
        this.f83780b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f83779a.equals(dVar.f83779a) && this.f83780b.equals(dVar.f83780b);
    }

    public final int hashCode() {
        return this.f83780b.hashCode() + (this.f83779a.hashCode() * 31);
    }

    public final String toString() {
        return n.d("\n  |RecordsForKeys [\n  |  key: " + this.f83779a + "\n  |  record: " + this.f83780b + "\n  |]\n  ");
    }
}
