package nr;

import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsListDTO;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnr/k0;", "", "", "isCarouselLoading", "Lwg0/m;", "activitySocialData", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/SimpleBadgeDTO;", "activityBadges", "Lnr/p;", "bannerData", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "segments", "Lyo1/j;", "socialGroupRideResults", "Lyo1/f;", "socialGroupRideCompetitionsResults", "Lpe0/a;", "activityDogs", "Lmr/p;", "epics", "<init>", "(ZLwg0/m;Ljava/util/List;Lnr/p;Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;Lyo1/j;Lyo1/f;Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f127240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wg0.m f127241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<SimpleBadgeDTO> f127242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f127243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SegmentDetailsListDTO f127244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yo1.j f127245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yo1.f f127246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<pe0.a> f127247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<mr.p> f127248i;

    public k0(boolean z14, wg0.m mVar, List list, p pVar, SegmentDetailsListDTO segmentDetailsListDTO, yo1.j jVar, yo1.f fVar, List list2, List list3, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(z14, mVar, (i14 & 4) != 0 ? null : list, pVar, (i14 & 16) != 0 ? null : segmentDetailsListDTO, (i14 & 32) != 0 ? null : jVar, (i14 & 64) != 0 ? null : fVar, (i14 & 128) != 0 ? null : list2, (i14 & 256) != 0 ? p13.j0.f134944a : list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f127240a == k0Var.f127240a && p005kotlin.jvm.internal.s.g(this.f127241b, k0Var.f127241b) && p005kotlin.jvm.internal.s.g(this.f127242c, k0Var.f127242c) && p005kotlin.jvm.internal.s.g(this.f127243d, k0Var.f127243d) && p005kotlin.jvm.internal.s.g(this.f127244e, k0Var.f127244e) && p005kotlin.jvm.internal.s.g(this.f127245f, k0Var.f127245f) && p005kotlin.jvm.internal.s.g(this.f127246g, k0Var.f127246g) && p005kotlin.jvm.internal.s.g(this.f127247h, k0Var.f127247h) && p005kotlin.jvm.internal.s.g(this.f127248i, k0Var.f127248i);
    }

    public final int hashCode() {
        int iHashCode = (this.f127241b.hashCode() + (Boolean.hashCode(this.f127240a) * 31)) * 31;
        List<SimpleBadgeDTO> list = this.f127242c;
        int iHashCode2 = (this.f127243d.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        SegmentDetailsListDTO segmentDetailsListDTO = this.f127244e;
        int iHashCode3 = (iHashCode2 + (segmentDetailsListDTO == null ? 0 : segmentDetailsListDTO.hashCode())) * 31;
        yo1.j jVar = this.f127245f;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        yo1.f fVar = this.f127246g;
        int iHashCode5 = (iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        List<pe0.a> list2 = this.f127247h;
        return this.f127248i.hashCode() + ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OverviewData(isCarouselLoading=");
        sb3.append(this.f127240a);
        sb3.append(", activitySocialData=");
        sb3.append(this.f127241b);
        sb3.append(", activityBadges=");
        sb3.append(this.f127242c);
        sb3.append(", bannerData=");
        sb3.append(this.f127243d);
        sb3.append(", segments=");
        sb3.append(this.f127244e);
        sb3.append(", socialGroupRideResults=");
        sb3.append(this.f127245f);
        sb3.append(", socialGroupRideCompetitionsResults=");
        sb3.append(this.f127246g);
        sb3.append(", activityDogs=");
        sb3.append(this.f127247h);
        sb3.append(", epics=");
        return u62.z.c(sb3, this.f127248i, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(boolean z14, wg0.m mVar, List<? extends SimpleBadgeDTO> list, p pVar, SegmentDetailsListDTO segmentDetailsListDTO, yo1.j jVar, yo1.f fVar, List<pe0.a> list2, List<mr.p> list3) {
        mVar.getClass();
        pVar.getClass();
        list3.getClass();
        this.f127240a = z14;
        this.f127241b = mVar;
        this.f127242c = list;
        this.f127243d = pVar;
        this.f127244e = segmentDetailsListDTO;
        this.f127245f = jVar;
        this.f127246g = fVar;
        this.f127247h = list2;
        this.f127248i = list3;
    }
}
