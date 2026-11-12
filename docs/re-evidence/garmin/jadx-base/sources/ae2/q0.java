package ae2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Lae2/q0;", "", "", "userDisplayName", "Lae2/k;", "groupConnectionTrackPoint", "", "liveTrackMessagingAvailable", "<init>", "(Ljava/lang/String;Lae2/k;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lae2/k;", "()Lae2/k;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userDisplayName")
    private final String userDisplayName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupConnectionTrackPoint")
    private final k groupConnectionTrackPoint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveTrackMessagingAvailable")
    private final Boolean liveTrackMessagingAvailable;

    public /* synthetic */ q0(String str, k kVar, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : kVar, (i14 & 4) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getGroupConnectionTrackPoint() {
        return this.groupConnectionTrackPoint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getLiveTrackMessagingAvailable() {
        return this.liveTrackMessagingAvailable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUserDisplayName() {
        return this.userDisplayName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return p005kotlin.jvm.internal.s.g(this.userDisplayName, q0Var.userDisplayName) && p005kotlin.jvm.internal.s.g(this.groupConnectionTrackPoint, q0Var.groupConnectionTrackPoint) && p005kotlin.jvm.internal.s.g(this.liveTrackMessagingAvailable, q0Var.liveTrackMessagingAvailable);
    }

    public final int hashCode() {
        String str = this.userDisplayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        k kVar = this.groupConnectionTrackPoint;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Boolean bool = this.liveTrackMessagingAvailable;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.userDisplayName;
        k kVar = this.groupConnectionTrackPoint;
        Boolean bool = this.liveTrackMessagingAvailable;
        StringBuilder sb3 = new StringBuilder("UserConnectionTrackPoint(userDisplayName=");
        sb3.append(str);
        sb3.append(", groupConnectionTrackPoint=");
        sb3.append(kVar);
        sb3.append(", liveTrackMessagingAvailable=");
        return p6.b.f(sb3, bool, ")");
    }

    public q0(String str, k kVar, Boolean bool) {
        this.userDisplayName = str;
        this.groupConnectionTrackPoint = kVar;
        this.liveTrackMessagingAvailable = bool;
    }

    public q0() {
        this(null, null, null, 7, null);
    }
}
