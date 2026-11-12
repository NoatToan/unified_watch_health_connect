package sy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsy0/k;", "", "", "uuid", "", "userId", "", "isYourEpic", "name", "summary", "startDate", "endDate", "Li53/c;", "Lcy0/o;", "images", "Lsy0/m;", "privacyType", "shareLiveTrack", "courseIds", "activityIds", "isStillProcessing", "areCoursesInaccessible", "isActive", "Lry0/m;", "epicState", "<init>", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li53/c;Lsy0/m;ZLi53/c;Li53/c;ZZZLry0/m;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f161234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f161235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f161236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f161237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f161238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f161239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<cy0.o> f161240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f161241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f161242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<Long> f161243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i53.c<Long> f161244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f161245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f161246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f161247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ry0.m f161248p;

    public /* synthetic */ k(String str, Long l14, boolean z14, String str2, String str3, String str4, String str5, i53.c cVar, m mVar, boolean z15, i53.c cVar2, i53.c cVar3, boolean z16, boolean z17, boolean z18, ry0.m mVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? "" : str3, (i14 & 32) != 0 ? "" : str4, (i14 & 64) == 0 ? str5 : "", (i14 & 128) != 0 ? null : cVar, (i14 & 256) != 0 ? m.ONLY_ME : mVar, (i14 & 512) != 0 ? false : z15, (i14 & 1024) != 0 ? null : cVar2, (i14 & 2048) == 0 ? cVar3 : null, (i14 & 4096) != 0 ? false : z16, (i14 & 8192) != 0 ? false : z17, (i14 & 16384) != 0 ? false : z18, (i14 & 32768) != 0 ? ry0.m.a.f155176a : mVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f161233a, kVar.f161233a) && p005kotlin.jvm.internal.s.g(this.f161234b, kVar.f161234b) && this.f161235c == kVar.f161235c && p005kotlin.jvm.internal.s.g(this.f161236d, kVar.f161236d) && p005kotlin.jvm.internal.s.g(this.f161237e, kVar.f161237e) && p005kotlin.jvm.internal.s.g(this.f161238f, kVar.f161238f) && p005kotlin.jvm.internal.s.g(this.f161239g, kVar.f161239g) && p005kotlin.jvm.internal.s.g(this.f161240h, kVar.f161240h) && this.f161241i == kVar.f161241i && this.f161242j == kVar.f161242j && p005kotlin.jvm.internal.s.g(this.f161243k, kVar.f161243k) && p005kotlin.jvm.internal.s.g(this.f161244l, kVar.f161244l) && this.f161245m == kVar.f161245m && this.f161246n == kVar.f161246n && this.f161247o == kVar.f161247o && p005kotlin.jvm.internal.s.g(this.f161248p, kVar.f161248p);
    }

    public final int hashCode() {
        int iHashCode = this.f161233a.hashCode() * 31;
        Long l14 = this.f161234b;
        int iJ = wr.g.j(wr.g.j(wr.g.j(wr.g.j(q6.f.g((iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.f161235c), 31, this.f161236d), 31, this.f161237e), 31, this.f161238f), 31, this.f161239g);
        i53.c<cy0.o> cVar = this.f161240h;
        int iG = q6.f.g((this.f161241i.hashCode() + ((iJ + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31, this.f161242j);
        i53.c<Long> cVar2 = this.f161243k;
        int iHashCode2 = (iG + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        i53.c<Long> cVar3 = this.f161244l;
        return this.f161248p.hashCode() + q6.f.g(q6.f.g(q6.f.g((iHashCode2 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31, 31, this.f161245m), 31, this.f161246n), 31, this.f161247o);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MultiDayActivityDetailUiState(uuid=");
        sb3.append(this.f161233a);
        sb3.append(", userId=");
        sb3.append(this.f161234b);
        sb3.append(", isYourEpic=");
        fb1.c.w(", name=", this.f161236d, ", summary=", sb3, this.f161235c);
        sn.a.t(sb3, this.f161237e, ", startDate=", this.f161238f, ", endDate=");
        sb3.append(this.f161239g);
        sb3.append(", images=");
        sb3.append(this.f161240h);
        sb3.append(", privacyType=");
        sb3.append(this.f161241i);
        sb3.append(", shareLiveTrack=");
        sb3.append(this.f161242j);
        sb3.append(", courseIds=");
        q6.f.w(sb3, this.f161243k, ", activityIds=", this.f161244l, ", isStillProcessing=");
        kg.f.q(", areCoursesInaccessible=", ", isActive=", sb3, this.f161245m, this.f161246n);
        sb3.append(this.f161247o);
        sb3.append(", epicState=");
        sb3.append(this.f161248p);
        sb3.append(")");
        return sb3.toString();
    }

    public k(String str, Long l14, boolean z14, String str2, String str3, String str4, String str5, i53.c<cy0.o> cVar, m mVar, boolean z15, i53.c<Long> cVar2, i53.c<Long> cVar3, boolean z16, boolean z17, boolean z18, ry0.m mVar2) {
        hb.a.p(str, str2, str3, str4, str5);
        mVar.getClass();
        mVar2.getClass();
        this.f161233a = str;
        this.f161234b = l14;
        this.f161235c = z14;
        this.f161236d = str2;
        this.f161237e = str3;
        this.f161238f = str4;
        this.f161239g = str5;
        this.f161240h = cVar;
        this.f161241i = mVar;
        this.f161242j = z15;
        this.f161243k = cVar2;
        this.f161244l = cVar3;
        this.f161245m = z16;
        this.f161246n = z17;
        this.f161247o = z18;
        this.f161248p = mVar2;
    }

    public k() {
        this(null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, null, 65535, null);
    }
}
