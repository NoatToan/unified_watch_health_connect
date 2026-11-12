package pt1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lpt1/l;", "", "", "trailId", "activityId", "reviewId", "", "trailName", "", "rating", "dateMillis", "formattedDate", "reviewText", "", "submitAnonymously", "Lus1/h;", "difficulty", "Li53/c;", "Lus1/g;", "conditions", "Lus1/i;", "features", "Lpt1/u;", "photos", "photosToDelete", "reviewRejected", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;ZLus1/h;Li53/c;Li53/c;Li53/c;Li53/c;Z)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f140875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f140876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f140877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f140878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f140879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f140880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f140881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f140882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final us1.h f140883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i53.c<us1.g> f140884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i53.c<us1.i> f140885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i53.c<u> f140886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i53.c<u> f140887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f140888o;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(long j8, Long l14, Long l15, String str, int i14, long j14, String str2, String str3, boolean z14, us1.h hVar, i53.c cVar, i53.c cVar2, i53.c cVar3, i53.c cVar4, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        String string;
        long j15 = (i15 & 1) != 0 ? -1L : j8;
        Long l16 = (i15 & 2) != 0 ? null : l14;
        Long l17 = (i15 & 4) != 0 ? null : l15;
        String str4 = (i15 & 8) != 0 ? "" : str;
        int i16 = (i15 & 16) != 0 ? 0 : i14;
        long millis = (i15 & 32) != 0 ? DateTime.now().withTimeAtStartOfDay().getMillis() : j14;
        if ((i15 & 64) != 0) {
            string = DateTime.now().toString("dd-MMM-yyyy");
            string.getClass();
        } else {
            string = str2;
        }
        this(j15, l16, l17, str4, i16, millis, string, (i15 & 128) != 0 ? null : str3, (i15 & 256) != 0 ? false : z14, (i15 & 512) != 0 ? null : hVar, (i15 & 1024) != 0 ? null : cVar, (i15 & 2048) != 0 ? null : cVar2, (i15 & 4096) != 0 ? j53.l.b() : cVar3, (i15 & 8192) != 0 ? null : cVar4, (i15 & 16384) != 0 ? false : z15);
    }

    public static l a(l lVar, long j8, Long l14, int i14, long j14, String str, String str2, boolean z14, us1.h hVar, i53.c cVar, i53.c cVar2, i53.c cVar3, boolean z15, int i15) {
        long j15 = (i15 & 1) != 0 ? lVar.f140874a : j8;
        Long l15 = lVar.f140875b;
        Long l16 = (i15 & 4) != 0 ? lVar.f140876c : l14;
        String str3 = lVar.f140877d;
        int i16 = (i15 & 16) != 0 ? lVar.f140878e : i14;
        long j16 = (i15 & 32) != 0 ? lVar.f140879f : j14;
        String str4 = (i15 & 64) != 0 ? lVar.f140880g : str;
        String str5 = (i15 & 128) != 0 ? lVar.f140881h : str2;
        boolean z16 = (i15 & 256) != 0 ? lVar.f140882i : z14;
        us1.h hVar2 = (i15 & 512) != 0 ? lVar.f140883j : hVar;
        i53.c cVar4 = (i15 & 1024) != 0 ? lVar.f140884k : cVar;
        i53.c cVar5 = (i15 & 2048) != 0 ? lVar.f140885l : cVar2;
        i53.c cVar6 = (i15 & 4096) != 0 ? lVar.f140886m : cVar3;
        i53.c<u> cVar7 = lVar.f140887n;
        boolean z17 = (i15 & 16384) != 0 ? lVar.f140888o : z15;
        lVar.getClass();
        str3.getClass();
        str4.getClass();
        cVar6.getClass();
        return new l(j15, l15, l16, str3, i16, j16, str4, str5, z16, hVar2, cVar4, cVar5, cVar6, cVar7, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f140874a == lVar.f140874a && p005kotlin.jvm.internal.s.g(this.f140875b, lVar.f140875b) && p005kotlin.jvm.internal.s.g(this.f140876c, lVar.f140876c) && p005kotlin.jvm.internal.s.g(this.f140877d, lVar.f140877d) && this.f140878e == lVar.f140878e && this.f140879f == lVar.f140879f && p005kotlin.jvm.internal.s.g(this.f140880g, lVar.f140880g) && p005kotlin.jvm.internal.s.g(this.f140881h, lVar.f140881h) && this.f140882i == lVar.f140882i && this.f140883j == lVar.f140883j && p005kotlin.jvm.internal.s.g(this.f140884k, lVar.f140884k) && p005kotlin.jvm.internal.s.g(this.f140885l, lVar.f140885l) && p005kotlin.jvm.internal.s.g(this.f140886m, lVar.f140886m) && p005kotlin.jvm.internal.s.g(this.f140887n, lVar.f140887n) && this.f140888o == lVar.f140888o;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f140874a) * 31;
        Long l14 = this.f140875b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f140876c;
        int iJ = wr.g.j(q6.f.e(q2.d(this.f140878e, wr.g.j((iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31, 31, this.f140877d), 31), 31, this.f140879f), 31, this.f140880g);
        String str = this.f140881h;
        int iG = q6.f.g((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f140882i);
        us1.h hVar = this.f140883j;
        int iHashCode3 = (iG + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i53.c<us1.g> cVar = this.f140884k;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        i53.c<us1.i> cVar2 = this.f140885l;
        int iA = l2.a(this.f140886m, (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31);
        i53.c<u> cVar3 = this.f140887n;
        return Boolean.hashCode(this.f140888o) + ((iA + (cVar3 != null ? cVar3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SubmitReviewState(trailId=");
        sb3.append(this.f140874a);
        sb3.append(", activityId=");
        sb3.append(this.f140875b);
        sb3.append(", reviewId=");
        sb3.append(this.f140876c);
        sb3.append(", trailName=");
        sb3.append(this.f140877d);
        sb3.append(", rating=");
        sb3.append(this.f140878e);
        sb3.append(", dateMillis=");
        p6.b.k(this.f140879f, ", formattedDate=", this.f140880g, sb3);
        com.airbnb.lottie.animation.keyframe.a.t(", reviewText=", this.f140881h, ", submitAnonymously=", sb3, this.f140882i);
        sb3.append(", difficulty=");
        sb3.append(this.f140883j);
        sb3.append(", conditions=");
        sb3.append(this.f140884k);
        sb3.append(", features=");
        sb3.append(this.f140885l);
        sb3.append(", photos=");
        sb3.append(this.f140886m);
        sb3.append(", photosToDelete=");
        sb3.append(this.f140887n);
        sb3.append(", reviewRejected=");
        sb3.append(this.f140888o);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(long j8, Long l14, Long l15, String str, int i14, long j14, String str2, String str3, boolean z14, us1.h hVar, i53.c<? extends us1.g> cVar, i53.c<? extends us1.i> cVar2, i53.c<u> cVar3, i53.c<u> cVar4, boolean z15) {
        str.getClass();
        str2.getClass();
        cVar3.getClass();
        this.f140874a = j8;
        this.f140875b = l14;
        this.f140876c = l15;
        this.f140877d = str;
        this.f140878e = i14;
        this.f140879f = j14;
        this.f140880g = str2;
        this.f140881h = str3;
        this.f140882i = z14;
        this.f140883j = hVar;
        this.f140884k = cVar;
        this.f140885l = cVar2;
        this.f140886m = cVar3;
        this.f140887n = cVar4;
        this.f140888o = z15;
    }

    public l() {
        this(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
    }
}
