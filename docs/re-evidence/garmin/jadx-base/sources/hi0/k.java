package hi0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhi0/k;", "", "", "requestCount", "", "Lhi0/a;", "pendingFollowRequests", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestCount")
    private final Long requestCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pendingFollowRequests")
    private final List<a> pendingFollowRequests;

    public k(Long l14, List<a> list) {
        this.requestCount = l14;
        this.pendingFollowRequests = list;
    }

    public final List<a> a() {
        return this.pendingFollowRequests;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getRequestCount() {
        return this.requestCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.requestCount, kVar.requestCount) && s.g(this.pendingFollowRequests, kVar.pendingFollowRequests);
    }

    public final int hashCode() {
        Long l14 = this.requestCount;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        List<a> list = this.pendingFollowRequests;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PendingFollowRequestsDTO(requestCount=" + this.requestCount + ", pendingFollowRequests=" + this.pendingFollowRequests + ")";
    }
}
