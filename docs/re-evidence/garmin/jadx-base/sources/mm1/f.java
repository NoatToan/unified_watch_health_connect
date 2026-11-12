package mm1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmm1/f;", "", "", "Lmm1/g;", "individualStats", "Lmm1/e;", "overallStats", "<init>", "(Ljava/util/List;Lmm1/e;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lmm1/e;", "c", "()Lmm1/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("individualStats")
    private final List<g> individualStats;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("overallStats")
    private final e overallStats;

    public /* synthetic */ f(List list, e eVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : eVar);
    }

    public static f a(f fVar, List list) {
        return new f(list, fVar.overallStats);
    }

    public final List<g> b() {
        return this.individualStats;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getOverallStats() {
        return this.overallStats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.individualStats, fVar.individualStats) && s.g(this.overallStats, fVar.overallStats);
    }

    public final int hashCode() {
        List<g> list = this.individualStats;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        e eVar = this.overallStats;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "WeeklySleepSummaryDTO(individualStats=" + this.individualStats + ", overallStats=" + this.overallStats + ")";
    }

    public f(List<g> list, e eVar) {
        this.individualStats = list;
        this.overallStats = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
