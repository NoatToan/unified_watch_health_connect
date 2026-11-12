package bz1;

import fg0.k;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ww1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbz1/a;", "", "", "primaryEventID", "", "Lfg0/k;", "primaryEventList", "supportingEventList", "Lww1/g;", "activeTrainingPlanDTO", "<init>", "(JLjava/util/List;Ljava/util/List;Lww1/g;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<k> f22286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k> f22287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f22288d;

    public /* synthetic */ a(long j8, List list, List list2, g gVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, list, list2, (i14 & 8) != 0 ? null : gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22285a == aVar.f22285a && s.g(this.f22286b, aVar.f22286b) && s.g(this.f22287c, aVar.f22287c) && s.g(this.f22288d, aVar.f22288d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f22285a) * 31;
        List<k> list = this.f22286b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<k> list2 = this.f22287c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        g gVar = this.f22288d;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "EventDashBoardPriorityUIModel(primaryEventID=" + this.f22285a + ", primaryEventList=" + this.f22286b + ", supportingEventList=" + this.f22287c + ", activeTrainingPlanDTO=" + this.f22288d + ")";
    }

    public a(long j8, List<k> list, List<k> list2, g gVar) {
        this.f22285a = j8;
        this.f22286b = list;
        this.f22287c = list2;
        this.f22288d = gVar;
    }
}
