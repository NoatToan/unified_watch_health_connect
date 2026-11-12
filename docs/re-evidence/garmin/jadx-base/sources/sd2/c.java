package sd2;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f158641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f158643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f158644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f158645e;

    public c(long j8, String str, int i14, boolean z14, int i15) {
        this.f158641a = j8;
        this.f158642b = str;
        this.f158643c = i14;
        this.f158644d = z14;
        this.f158645e = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f158641a == cVar.f158641a && this.f158643c == cVar.f158643c && Objects.equals(this.f158642b, cVar.f158642b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f158641a), this.f158642b, Integer.valueOf(this.f158643c));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CannedTextReply{deviceUnitId=");
        sb3.append(this.f158641a);
        sb3.append(", replyText='");
        sb3.append(this.f158642b);
        sb3.append("', replyType=");
        sb3.append(this.f158643c);
        sb3.append(", isOnDevice=");
        sb3.append(this.f158644d);
        sb3.append(", replySortOrder=");
        return e0.j(sb3, this.f158645e, CoreConstants.CURLY_RIGHT);
    }
}
