package bz1;

import fg0.k;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ww1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lbz1/b;", "", "Lzy1/c;", "uiState", "Lfg0/k;", "primaryEventDTO", "", "upcomingEvents", "pastEventDTO", "", "eventTemperature", "Lww1/g;", "activeTrainingPlanDTO", "<init>", "(Lzy1/c;Lfg0/k;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Lww1/g;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy1.c f22289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f22290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<k> f22291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<k> f22292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f22293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f22294f;

    public /* synthetic */ b(zy1.c cVar, k kVar, List list, List list2, Double d14, g gVar, int i14, j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : kVar, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22289a == bVar.f22289a && s.g(this.f22290b, bVar.f22290b) && s.g(this.f22291c, bVar.f22291c) && s.g(this.f22292d, bVar.f22292d) && s.g(this.f22293e, bVar.f22293e) && s.g(this.f22294f, bVar.f22294f);
    }

    public final int hashCode() {
        int iHashCode = this.f22289a.hashCode() * 31;
        k kVar = this.f22290b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<k> list = this.f22291c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<k> list2 = this.f22292d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d14 = this.f22293e;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        g gVar = this.f22294f;
        return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EventDashBoardUIModel(uiState=");
        sb3.append(this.f22289a);
        sb3.append(", primaryEventDTO=");
        sb3.append(this.f22290b);
        sb3.append(", upcomingEvents=");
        n23.j.z(sb3, this.f22291c, ", pastEventDTO=", this.f22292d, ", eventTemperature=");
        sb3.append(this.f22293e);
        sb3.append(", activeTrainingPlanDTO=");
        sb3.append(this.f22294f);
        sb3.append(")");
        return sb3.toString();
    }

    public b(zy1.c cVar, k kVar, List<k> list, List<k> list2, Double d14, g gVar) {
        cVar.getClass();
        this.f22289a = cVar;
        this.f22290b = kVar;
        this.f22291c = list;
        this.f22292d = list2;
        this.f22293e = d14;
        this.f22294f = gVar;
    }
}
