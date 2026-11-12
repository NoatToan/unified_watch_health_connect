package j70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lj70/a;", "", "Lyz1/d;", "status", "", "activitiesJson", "golfScoreCardsJson", "workoutsJson", "ecgJson", "wellnessActivityJson", "", "eventsJson", "Lpb2/a$d;", "pendingActivities", "", "showLiveActivityCard", "<init>", "(Lyz1/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f97463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f97467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f97468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f97469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<pb2.a.d> f97470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f97471i;

    public /* synthetic */ a(yz1.d dVar, String str, String str2, String str3, String str4, String str5, List list, List list2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : list2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f97463a, aVar.f97463a) && p005kotlin.jvm.internal.s.g(this.f97464b, aVar.f97464b) && p005kotlin.jvm.internal.s.g(this.f97465c, aVar.f97465c) && p005kotlin.jvm.internal.s.g(this.f97466d, aVar.f97466d) && p005kotlin.jvm.internal.s.g(this.f97467e, aVar.f97467e) && p005kotlin.jvm.internal.s.g(this.f97468f, aVar.f97468f) && p005kotlin.jvm.internal.s.g(this.f97469g, aVar.f97469g) && p005kotlin.jvm.internal.s.g(this.f97470h, aVar.f97470h) && this.f97471i == aVar.f97471i;
    }

    public final int hashCode() {
        int iHashCode = this.f97463a.hashCode() * 31;
        String str = this.f97464b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97465c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97466d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97467e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f97468f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.f97469g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<pb2.a.d> list2 = this.f97470h;
        return Boolean.hashCode(this.f97471i) + ((iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivitiesAndWorkoutsCarouselData(status=");
        sb3.append(this.f97463a);
        sb3.append(", activitiesJson=");
        sb3.append(this.f97464b);
        sb3.append(", golfScoreCardsJson=");
        sn.a.t(sb3, this.f97465c, ", workoutsJson=", this.f97466d, ", ecgJson=");
        sn.a.t(sb3, this.f97467e, ", wellnessActivityJson=", this.f97468f, ", eventsJson=");
        n23.j.z(sb3, this.f97469g, ", pendingActivities=", this.f97470h, ", showLiveActivityCard=");
        return hb.a.k(sb3, this.f97471i, ")");
    }

    public a(yz1.d dVar, String str, String str2, String str3, String str4, String str5, List<String> list, List<pb2.a.d> list2, boolean z14) {
        dVar.getClass();
        this.f97463a = dVar;
        this.f97464b = str;
        this.f97465c = str2;
        this.f97466d = str3;
        this.f97467e = str4;
        this.f97468f = str5;
        this.f97469g = list;
        this.f97470h = list2;
        this.f97471i = z14;
    }
}
