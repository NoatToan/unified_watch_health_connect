package nr;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/o;", "", "Lps/r;", "activitySummary", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "activityOwnerProfileFrameDTO", "", "childActivitySummaries", "Ljr/m;", "childStatsConfigurations", "<init>", "(Lps/r;Lcom/garmin/android/apps/connectmobile/userprofile/model/l;Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps.r f127269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.model.l f127270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ps.r> f127271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<jr.m> f127272d;

    public /* synthetic */ o(ps.r rVar, com.garmin.android.apps.connectmobile.userprofile.model.l lVar, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : rVar, (i14 & 2) != 0 ? null : lVar, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f127269a, oVar.f127269a) && p005kotlin.jvm.internal.s.g(this.f127270b, oVar.f127270b) && p005kotlin.jvm.internal.s.g(this.f127271c, oVar.f127271c) && p005kotlin.jvm.internal.s.g(this.f127272d, oVar.f127272d);
    }

    public final int hashCode() {
        ps.r rVar = this.f127269a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = this.f127270b;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        List<ps.r> list = this.f127271c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<jr.m> list2 = this.f127272d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivitySummaries(activitySummary=");
        sb3.append(this.f127269a);
        sb3.append(", activityOwnerProfileFrameDTO=");
        sb3.append(this.f127270b);
        sb3.append(", childActivitySummaries=");
        return n23.j.j(sb3, this.f127271c, ", childStatsConfigurations=", this.f127272d, ")");
    }

    public o(ps.r rVar, com.garmin.android.apps.connectmobile.userprofile.model.l lVar, List<ps.r> list, List<jr.m> list2) {
        this.f127269a = rVar;
        this.f127270b = lVar;
        this.f127271c = list;
        this.f127272d = list2;
    }

    public o() {
        this(null, null, null, null, 15, null);
    }
}
