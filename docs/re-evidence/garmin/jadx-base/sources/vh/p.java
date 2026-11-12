package vh;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lvh/p;", "", "", "name", "", "inverted", "defaultValue", "<init>", "(Ljava/lang/String;ZZ)V", "(Ljava/lang/String;Z)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178366c;

    public p(String str, boolean z14, boolean z15) {
        str.getClass();
        this.f178364a = str;
        this.f178365b = z14;
        this.f178366c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f178364a, pVar.f178364a) && this.f178365b == pVar.f178365b && this.f178366c == pVar.f178366c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = this.f178364a.hashCode() * 31;
        boolean z14 = this.f178365b;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iHashCode + r14) * 31;
        boolean z15 = this.f178366c;
        return i14 + (z15 ? 1 : z15);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CompiledCondition(name=");
        sb3.append(this.f178364a);
        sb3.append(", inverted=");
        sb3.append(this.f178365b);
        sb3.append(", defaultValue=");
        return am.j.t(sb3, this.f178366c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(String str, boolean z14) {
        this(str, z14, true);
        str.getClass();
    }
}
