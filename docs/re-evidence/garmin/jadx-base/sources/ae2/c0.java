package ae2;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lae2/c0;", "", "Lae2/e0;", "publisher", "", "Lae2/g;", "trackPoints", "<init>", "(Lae2/e0;Ljava/util/List;)V", "a", "Lae2/e0;", "getPublisher", "()Lae2/e0;", "b", "Ljava/util/List;", "getTrackPoints", "()Ljava/util/List;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("publisher")
    private final e0 publisher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trackPoints")
    private final List<g> trackPoints;

    public /* synthetic */ c0(e0 e0Var, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : e0Var, (i14 & 2) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.publisher, c0Var.publisher) && p005kotlin.jvm.internal.s.g(this.trackPoints, c0Var.trackPoints);
    }

    public final int hashCode() {
        e0 e0Var = this.publisher;
        int iHashCode = (e0Var == null ? 0 : e0Var.hashCode()) * 31;
        List<g> list = this.trackPoints;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PostTrackPointsRequest(publisher=" + this.publisher + ", trackPoints=" + this.trackPoints + ")";
    }

    public c0(e0 e0Var, List<g> list) {
        this.publisher = e0Var;
        this.trackPoints = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
