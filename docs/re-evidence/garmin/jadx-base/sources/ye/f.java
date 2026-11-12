package ye;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lye/f;", "", "", "isConnected", "isValidated", "isMetered", "isNotRoaming", "<init>", "(ZZZZ)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f196791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f196792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f196793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f196794d;

    public f(boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f196791a = z14;
        this.f196792b = z15;
        this.f196793c = z16;
        this.f196794d = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f196791a == fVar.f196791a && this.f196792b == fVar.f196792b && this.f196793c == fVar.f196793c && this.f196794d == fVar.f196794d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196794d) + q6.f.g(q6.f.g(Boolean.hashCode(this.f196791a) * 31, 31, this.f196792b), 31, this.f196793c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NetworkState(isConnected=");
        sb3.append(this.f196791a);
        sb3.append(", isValidated=");
        sb3.append(this.f196792b);
        sb3.append(", isMetered=");
        sb3.append(this.f196793c);
        sb3.append(", isNotRoaming=");
        return am.j.t(sb3, this.f196794d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
