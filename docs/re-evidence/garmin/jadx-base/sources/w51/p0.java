package w51;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.flexbox.FlexItem;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0012\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020\u0012\u0012\b\b\u0002\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lw51/p0;", "", "Lz51/h;", "persistedActivitySummaryDTO", "", "activityTypeSelected", "Li53/c;", "Lam/x0;", "activityTypes", "Lz51/d;", "mapDetails", "", "avgHearRate", "calories", "Lb63/u;", "startTime", "endTime", "duration", "", "isLoading", "isMapLoading", "isInputInvalid", "showSavingAlert", "showSavingError", "isSaving", "showMapError", "isActivityTypeNonGps", "Lz51/c;", "heartRateMeasurements", "isChartLoading", "Lgs1/t;", "timelineDTO", "hasChartData", "showMissingHeartRateDataBanner", "activityNoLongerValid", "showNoLocationDataBanner", "<init>", "(Lz51/h;Ljava/lang/String;Li53/c;Lz51/d;Ljava/lang/Double;Ljava/lang/Double;Lb63/u;Lb63/u;DZZZZZZZZLi53/c;ZLgs1/t;ZZZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z51.h f182344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<am.x0> f182346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z51.d f182347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f182348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f182349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b63.u f182350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b63.u f182351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f182352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f182353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f182354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f182355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f182356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f182357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f182358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f182359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f182360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i53.c<z51.c> f182361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f182362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gs1.t f182363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f182364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f182365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f182366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f182367x;

    public p0(z51.h hVar, String str, i53.c cVar, z51.d dVar, Double d14, Double d15, b63.u uVar, b63.u uVar2, double d16, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, i53.c cVar2, boolean z26, gs1.t tVar, boolean z27, boolean z28, boolean z29, boolean z34, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : hVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? j53.l.b() : cVar, (i14 & 8) != 0 ? null : dVar, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : d15, (i14 & 64) != 0 ? g22.l.e(b63.u.INSTANCE) : uVar, (i14 & 128) != 0 ? g22.l.e(b63.u.INSTANCE) : uVar2, (i14 & 256) != 0 ? Double.NaN : d16, (i14 & 512) != 0 ? false : z14, (i14 & 1024) != 0 ? false : z15, (i14 & 2048) != 0 ? false : z16, (i14 & 4096) != 0 ? false : z17, (i14 & 8192) != 0 ? false : z18, (i14 & 16384) != 0 ? false : z19, (i14 & 32768) != 0 ? false : z24, (i14 & 65536) != 0 ? false : z25, (i14 & 131072) != 0 ? j53.l.b() : cVar2, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? false : z26, (i14 & 524288) != 0 ? null : tVar, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z27, (i14 & 2097152) != 0 ? false : z28, (i14 & 4194304) != 0 ? false : z29, (i14 & 8388608) != 0 ? false : z34);
    }

    public static p0 a(p0 p0Var, z51.h hVar, String str, i53.c cVar, z51.d dVar, Double d14, Double d15, b63.u uVar, b63.u uVar2, double d16, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, i53.c cVar2, boolean z25, gs1.t tVar, boolean z26, boolean z27, boolean z28, boolean z29, int i14) {
        z51.h hVar2 = (i14 & 1) != 0 ? p0Var.f182344a : hVar;
        String str2 = (i14 & 2) != 0 ? p0Var.f182345b : str;
        i53.c cVar3 = (i14 & 4) != 0 ? p0Var.f182346c : cVar;
        z51.d dVar2 = (i14 & 8) != 0 ? p0Var.f182347d : dVar;
        Double d17 = (i14 & 16) != 0 ? p0Var.f182348e : d14;
        Double d18 = (i14 & 32) != 0 ? p0Var.f182349f : d15;
        b63.u uVar3 = (i14 & 64) != 0 ? p0Var.f182350g : uVar;
        b63.u uVar4 = (i14 & 128) != 0 ? p0Var.f182351h : uVar2;
        double d19 = (i14 & 256) != 0 ? p0Var.f182352i : d16;
        boolean z34 = (i14 & 512) != 0 ? p0Var.f182353j : z14;
        boolean z35 = (i14 & 1024) != 0 ? p0Var.f182354k : z15;
        boolean z36 = (i14 & 2048) != 0 ? p0Var.f182355l : z16;
        boolean z37 = (i14 & 4096) != 0 ? p0Var.f182356m : z17;
        z51.h hVar3 = hVar2;
        boolean z38 = (i14 & 8192) != 0 ? p0Var.f182357n : z18;
        boolean z39 = (i14 & 16384) != 0 ? p0Var.f182358o : z19;
        boolean z44 = (i14 & 32768) != 0 ? p0Var.f182359p : false;
        boolean z45 = (i14 & 65536) != 0 ? p0Var.f182360q : z24;
        i53.c cVar4 = (i14 & 131072) != 0 ? p0Var.f182361r : cVar2;
        boolean z46 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? p0Var.f182362s : z25;
        gs1.t tVar2 = (i14 & 524288) != 0 ? p0Var.f182363t : tVar;
        boolean z47 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? p0Var.f182364u : z26;
        boolean z48 = (i14 & 2097152) != 0 ? p0Var.f182365v : z27;
        boolean z49 = (i14 & 4194304) != 0 ? p0Var.f182366w : z28;
        boolean z54 = (i14 & 8388608) != 0 ? p0Var.f182367x : z29;
        p0Var.getClass();
        cVar3.getClass();
        uVar3.getClass();
        uVar4.getClass();
        cVar4.getClass();
        return new p0(hVar3, str2, cVar3, dVar2, d17, d18, uVar3, uVar4, d19, z34, z35, z36, z37, z38, z39, z44, z45, cVar4, z46, tVar2, z47, z48, z49, z54);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p005kotlin.jvm.internal.s.g(this.f182344a, p0Var.f182344a) && p005kotlin.jvm.internal.s.g(this.f182345b, p0Var.f182345b) && p005kotlin.jvm.internal.s.g(this.f182346c, p0Var.f182346c) && p005kotlin.jvm.internal.s.g(this.f182347d, p0Var.f182347d) && p005kotlin.jvm.internal.s.g(this.f182348e, p0Var.f182348e) && p005kotlin.jvm.internal.s.g(this.f182349f, p0Var.f182349f) && p005kotlin.jvm.internal.s.g(this.f182350g, p0Var.f182350g) && p005kotlin.jvm.internal.s.g(this.f182351h, p0Var.f182351h) && Double.compare(this.f182352i, p0Var.f182352i) == 0 && this.f182353j == p0Var.f182353j && this.f182354k == p0Var.f182354k && this.f182355l == p0Var.f182355l && this.f182356m == p0Var.f182356m && this.f182357n == p0Var.f182357n && this.f182358o == p0Var.f182358o && this.f182359p == p0Var.f182359p && this.f182360q == p0Var.f182360q && p005kotlin.jvm.internal.s.g(this.f182361r, p0Var.f182361r) && this.f182362s == p0Var.f182362s && p005kotlin.jvm.internal.s.g(this.f182363t, p0Var.f182363t) && this.f182364u == p0Var.f182364u && this.f182365v == p0Var.f182365v && this.f182366w == p0Var.f182366w && this.f182367x == p0Var.f182367x;
    }

    public final int hashCode() {
        z51.h hVar = this.f182344a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        String str = this.f182345b;
        int iA = l2.a(this.f182346c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        z51.d dVar = this.f182347d;
        int iHashCode2 = (iA + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Double d14 = this.f182348e;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f182349f;
        int iG = q6.f.g(l2.a(this.f182361r, q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(org.apache.commons.lang3.e.b((this.f182351h.f16216a.hashCode() + ((this.f182350g.f16216a.hashCode() + ((iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31)) * 31)) * 31, 31, this.f182352i), 31, this.f182353j), 31, this.f182354k), 31, this.f182355l), 31, this.f182356m), 31, this.f182357n), 31, this.f182358o), 31, this.f182359p), 31, this.f182360q), 31), 31, this.f182362s);
        gs1.t tVar = this.f182363t;
        return Boolean.hashCode(this.f182367x) + q6.f.g(q6.f.g(q6.f.g((iG + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.f182364u), 31, this.f182365v), 31, this.f182366w);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PendingActivityDetailsUiState(persistedActivitySummaryDTO=");
        sb3.append(this.f182344a);
        sb3.append(", activityTypeSelected=");
        sb3.append(this.f182345b);
        sb3.append(", activityTypes=");
        sb3.append(this.f182346c);
        sb3.append(", mapDetails=");
        sb3.append(this.f182347d);
        sb3.append(", avgHearRate=");
        b71.i.p(this.f182348e, this.f182349f, ", calories=", ", startTime=", sb3);
        sb3.append(this.f182350g);
        sb3.append(", endTime=");
        sb3.append(this.f182351h);
        sb3.append(", duration=");
        sb3.append(this.f182352i);
        sb3.append(", isLoading=");
        sb3.append(this.f182353j);
        com.airbnb.lottie.animation.keyframe.a.v(", isMapLoading=", ", isInputInvalid=", sb3, this.f182354k, this.f182355l);
        com.airbnb.lottie.animation.keyframe.a.v(", showSavingAlert=", ", showSavingError=", sb3, this.f182356m, this.f182357n);
        com.airbnb.lottie.animation.keyframe.a.v(", isSaving=", ", showMapError=", sb3, this.f182358o, this.f182359p);
        sb3.append(", isActivityTypeNonGps=");
        sb3.append(this.f182360q);
        sb3.append(", heartRateMeasurements=");
        sb3.append(this.f182361r);
        sb3.append(", isChartLoading=");
        sb3.append(this.f182362s);
        sb3.append(", timelineDTO=");
        sb3.append(this.f182363t);
        com.airbnb.lottie.animation.keyframe.a.v(", hasChartData=", ", showMissingHeartRateDataBanner=", sb3, this.f182364u, this.f182365v);
        com.airbnb.lottie.animation.keyframe.a.v(", activityNoLongerValid=", ", showNoLocationDataBanner=", sb3, this.f182366w, this.f182367x);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(z51.h hVar, String str, i53.c<? extends am.x0> cVar, z51.d dVar, Double d14, Double d15, b63.u uVar, b63.u uVar2, double d16, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, i53.c<z51.c> cVar2, boolean z26, gs1.t tVar, boolean z27, boolean z28, boolean z29, boolean z34) {
        cVar.getClass();
        uVar.getClass();
        uVar2.getClass();
        cVar2.getClass();
        this.f182344a = hVar;
        this.f182345b = str;
        this.f182346c = cVar;
        this.f182347d = dVar;
        this.f182348e = d14;
        this.f182349f = d15;
        this.f182350g = uVar;
        this.f182351h = uVar2;
        this.f182352i = d16;
        this.f182353j = z14;
        this.f182354k = z15;
        this.f182355l = z16;
        this.f182356m = z17;
        this.f182357n = z18;
        this.f182358o = z19;
        this.f182359p = z24;
        this.f182360q = z25;
        this.f182361r = cVar2;
        this.f182362s = z26;
        this.f182363t = tVar;
        this.f182364u = z27;
        this.f182365v = z28;
        this.f182366w = z29;
        this.f182367x = z34;
    }

    public p0() {
        this(null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, false, null, false, null, false, false, false, false, FlexItem.MAX_SIZE, null);
    }
}
