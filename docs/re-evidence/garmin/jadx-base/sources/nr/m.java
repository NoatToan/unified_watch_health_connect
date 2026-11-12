package nr;

import java.util.List;
import p005kotlin.Metadata;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lnr/m;", "", "Ljr/c;", "activityShareConfiguration", "Lnr/j;", "activitySummary", "Lps/r;", "activitySummaryDTO", "Lnr/v;", "deviceData", "Lwg0/d;", "activityFeedMapOverlay", "", "Lps/x1;", "typedSplitDTO", "<init>", "(Ljr/c;Lnr/j;Lps/r;Lnr/v;Lwg0/d;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr.c f127252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f127253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ps.r f127254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f127255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wg0.d f127256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<x1> f127257f;

    public m(jr.c cVar, j jVar, ps.r rVar, v vVar, wg0.d dVar, List<x1> list) {
        cVar.getClass();
        jVar.getClass();
        this.f127252a = cVar;
        this.f127253b = jVar;
        this.f127254c = rVar;
        this.f127255d = vVar;
        this.f127256e = dVar;
        this.f127257f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f127252a.equals(mVar.f127252a) && this.f127253b.equals(mVar.f127253b) && p005kotlin.jvm.internal.s.g(this.f127254c, mVar.f127254c) && p005kotlin.jvm.internal.s.g(this.f127255d, mVar.f127255d) && p005kotlin.jvm.internal.s.g(this.f127256e, mVar.f127256e) && p005kotlin.jvm.internal.s.g(this.f127257f, mVar.f127257f);
    }

    public final int hashCode() {
        int iHashCode = (this.f127253b.hashCode() + (this.f127252a.hashCode() * 31)) * 31;
        ps.r rVar = this.f127254c;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        v vVar = this.f127255d;
        int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        wg0.d dVar = this.f127256e;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<x1> list = this.f127257f;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityShareData(activityShareConfiguration=" + this.f127252a + ", activitySummary=" + this.f127253b + ", activitySummaryDTO=" + this.f127254c + ", deviceData=" + this.f127255d + ", activityFeedMapOverlay=" + this.f127256e + ", typedSplitDTO=" + this.f127257f + ")";
    }
}
