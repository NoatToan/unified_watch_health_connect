package ae2;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lae2/i;", "", "", "Lae2/k;", "groupConnectionTrackPoints", "", "dirty", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupConnectionTrackPoints")
    private final List<k> groupConnectionTrackPoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dirty")
    private final Boolean dirty;

    public /* synthetic */ i(List list, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getDirty() {
        return this.dirty;
    }

    public final List<k> b() {
        return this.groupConnectionTrackPoints;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.groupConnectionTrackPoints, iVar.groupConnectionTrackPoints) && p005kotlin.jvm.internal.s.g(this.dirty, iVar.dirty);
    }

    public final int hashCode() {
        List<k> list = this.groupConnectionTrackPoints;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.dirty;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "GetGrouptrackLastKnownLocationsResponse(groupConnectionTrackPoints=" + this.groupConnectionTrackPoints + ", dirty=" + this.dirty + ")";
    }

    public i(List<k> list, Boolean bool) {
        this.groupConnectionTrackPoints = list;
        this.dirty = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
