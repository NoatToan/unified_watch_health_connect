package qs1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqs1/v;", "", "", "resultsFiltered", "", "Lqs1/u;", "tripReports", "<init>", "(ZLjava/util/List;)V", "a", "Z", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultsFiltered")
    private final boolean resultsFiltered;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tripReports")
    private final List<u> tripReports;

    public /* synthetic */ v(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getResultsFiltered() {
        return this.resultsFiltered;
    }

    public final List<u> b() {
        return this.tripReports;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.resultsFiltered == vVar.resultsFiltered && p005kotlin.jvm.internal.s.g(this.tripReports, vVar.tripReports);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.resultsFiltered) * 31;
        List<u> list = this.tripReports;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "TrailReviewPageDTO(resultsFiltered=" + this.resultsFiltered + ", tripReports=" + this.tripReports + ")";
    }

    public v(boolean z14, List<u> list) {
        this.resultsFiltered = z14;
        this.tripReports = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
