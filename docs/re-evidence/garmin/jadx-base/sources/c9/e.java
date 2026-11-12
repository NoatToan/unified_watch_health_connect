package c9;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc9/e;", "", "", "value", "<init>", "(D)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements Comparable<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25985a;

    public e(double d14) {
        this.f25985a = d14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        e eVar2 = eVar;
        eVar2.getClass();
        return Double.compare(this.f25985a, eVar2.f25985a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f25985a == ((e) obj).f25985a;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f25985a);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f25985a);
        sb3.append(CoreConstants.PERCENT_CHAR);
        return sb3.toString();
    }
}
