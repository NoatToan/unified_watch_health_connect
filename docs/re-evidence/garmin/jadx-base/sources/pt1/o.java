package pt1;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;
import yc.v2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020#\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0002¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lpt1/o;", "", "", "isLoading", "isError", "operationInProgress", "Lpt1/e;", "photoUploadProgress", "isReviewsRateLimited", "suggestionRateLimited", "", "rateLimitedMessage", "showReportsRateLimitedDialog", "showContentAlreadyReportedDialog", "Lpt1/p;", "detailsState", "photosCount", "Lr53/i;", "Lyc/v2;", "Lkt1/b;", "photosFlow", "showContentReportedDialog", "Li53/d;", "", "Lpt1/r;", "photosHelpfulStates", "activityId", "activityDateMillis", "Li53/c;", "Lpt1/x;", "overviewReviews", "Lpt1/v;", "trailReviewPromptState", "Lpt1/y;", "trailReviewSuggestionState", "Lpt1/n;", "bottomSheetContentType", "reviewImagesScreenBottomSheetContentType", "Lvs1/i;", "gcPlusFeatureStatus", "", "sendTrailDeviceName", "Lc80/p;", "trailsFeatureStatus", "enableGCPlusFeatures", "showCustomizeTrailDialog", "showPlusIcon", "showPhotoUploadCanceledDialog", "showPhotoUploadFailedDialog", "showTrailReviewsNotSupportedDialog", "<init>", "(ZZZLpt1/e;ZZIZZLpt1/p;ILr53/i;ZLi53/d;Ljava/lang/Long;Ljava/lang/Long;Li53/c;Lpt1/v;Lpt1/y;Lpt1/n;Lpt1/n;Lvs1/i;Ljava/lang/String;Lc80/p;ZZZZZZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f140906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f140907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f140908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f140909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f140910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f140911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f140912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f140913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r53.i<v2<kt1.b>> f140914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f140915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i53.d<Long, r> f140916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Long f140917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f140918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i53.c<x> f140919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f140920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f140921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f140922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n f140923u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final vs1.i f140924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f140925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c80.p f140926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f140927y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f140928z;

    public /* synthetic */ o(boolean z14, boolean z15, boolean z16, e eVar, boolean z17, boolean z18, int i14, boolean z19, boolean z24, p pVar, int i15, r53.i iVar, boolean z25, i53.d dVar, Long l14, Long l15, i53.c cVar, v vVar, y yVar, n nVar, n nVar2, vs1.i iVar2, String str, c80.p pVar2, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, boolean z35, int i16, p005kotlin.jvm.internal.j jVar) {
        this(z14, (i16 & 2) != 0 ? false : z15, (i16 & 4) != 0 ? false : z16, (i16 & 8) != 0 ? null : eVar, (i16 & 16) != 0 ? false : z17, (i16 & 32) != 0 ? false : z18, (i16 & 64) != 0 ? -1 : i14, (i16 & 128) != 0 ? false : z19, (i16 & 256) != 0 ? false : z24, (i16 & 512) != 0 ? null : pVar, (i16 & 1024) != 0 ? 0 : i15, (i16 & 2048) != 0 ? null : iVar, (i16 & 4096) != 0 ? false : z25, (i16 & 8192) != 0 ? i53.a.c() : dVar, (i16 & 16384) != 0 ? null : l14, (i16 & 32768) != 0 ? null : l15, (i16 & 65536) != 0 ? null : cVar, (i16 & 131072) != 0 ? null : vVar, (i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : yVar, (i16 & 524288) != 0 ? n.b.f140894a : nVar, (i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? n.b.f140894a : nVar2, (i16 & 2097152) != 0 ? null : iVar2, (i16 & 4194304) != 0 ? null : str, (i16 & 8388608) == 0 ? pVar2 : null, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z26, (i16 & 33554432) != 0 ? false : z27, (i16 & 67108864) != 0 ? false : z28, (i16 & 134217728) != 0 ? false : z29, (i16 & 268435456) != 0 ? false : z34, (i16 & 536870912) != 0 ? false : z35);
    }

    public static o a(o oVar, boolean z14, e eVar, boolean z15, boolean z16, int i14, boolean z17, boolean z18, p pVar, int i15, boolean z19, i53.d dVar, Long l14, Long l15, i53.c cVar, v vVar, y yVar, n nVar, n nVar2, vs1.i iVar, String str, c80.p pVar2, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, int i16) {
        boolean z29 = oVar.f140903a;
        boolean z34 = oVar.f140904b;
        boolean z35 = (i16 & 4) != 0 ? oVar.f140905c : z14;
        e eVar2 = (i16 & 8) != 0 ? oVar.f140906d : eVar;
        boolean z36 = (i16 & 16) != 0 ? oVar.f140907e : z15;
        boolean z37 = (i16 & 32) != 0 ? oVar.f140908f : z16;
        int i17 = (i16 & 64) != 0 ? oVar.f140909g : i14;
        boolean z38 = (i16 & 128) != 0 ? oVar.f140910h : z17;
        boolean z39 = (i16 & 256) != 0 ? oVar.f140911i : z18;
        p pVar3 = (i16 & 512) != 0 ? oVar.f140912j : pVar;
        int i18 = (i16 & 1024) != 0 ? oVar.f140913k : i15;
        r53.i<v2<kt1.b>> iVar2 = oVar.f140914l;
        boolean z44 = (i16 & 4096) != 0 ? oVar.f140915m : z19;
        i53.d dVar2 = (i16 & 8192) != 0 ? oVar.f140916n : dVar;
        Long l16 = (i16 & 16384) != 0 ? oVar.f140917o : l14;
        Long l17 = (i16 & 32768) != 0 ? oVar.f140918p : l15;
        i53.c cVar2 = (i16 & 65536) != 0 ? oVar.f140919q : cVar;
        v vVar2 = (i16 & 131072) != 0 ? oVar.f140920r : vVar;
        y yVar2 = (i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? oVar.f140921s : yVar;
        n nVar3 = (i16 & 524288) != 0 ? oVar.f140922t : nVar;
        n nVar4 = (i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? oVar.f140923u : nVar2;
        vs1.i iVar3 = (i16 & 2097152) != 0 ? oVar.f140924v : iVar;
        String str2 = (i16 & 4194304) != 0 ? oVar.f140925w : str;
        c80.p pVar4 = (i16 & 8388608) != 0 ? oVar.f140926x : pVar2;
        boolean z45 = (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? oVar.f140927y : z24;
        boolean z46 = (i16 & 33554432) != 0 ? oVar.f140928z : z25;
        boolean z47 = oVar.A;
        boolean z48 = (i16 & 134217728) != 0 ? oVar.B : z26;
        boolean z49 = (i16 & 268435456) != 0 ? oVar.C : z27;
        boolean z54 = (i16 & 536870912) != 0 ? oVar.D : z28;
        oVar.getClass();
        dVar2.getClass();
        nVar3.getClass();
        nVar4.getClass();
        return new o(z29, z34, z35, eVar2, z36, z37, i17, z38, z39, pVar3, i18, iVar2, z44, dVar2, l16, l17, cVar2, vVar2, yVar2, nVar3, nVar4, iVar3, str2, pVar4, z45, z46, z47, z48, z49, z54);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f140903a == oVar.f140903a && this.f140904b == oVar.f140904b && this.f140905c == oVar.f140905c && p005kotlin.jvm.internal.s.g(this.f140906d, oVar.f140906d) && this.f140907e == oVar.f140907e && this.f140908f == oVar.f140908f && this.f140909g == oVar.f140909g && this.f140910h == oVar.f140910h && this.f140911i == oVar.f140911i && p005kotlin.jvm.internal.s.g(this.f140912j, oVar.f140912j) && this.f140913k == oVar.f140913k && p005kotlin.jvm.internal.s.g(this.f140914l, oVar.f140914l) && this.f140915m == oVar.f140915m && p005kotlin.jvm.internal.s.g(this.f140916n, oVar.f140916n) && p005kotlin.jvm.internal.s.g(this.f140917o, oVar.f140917o) && p005kotlin.jvm.internal.s.g(this.f140918p, oVar.f140918p) && p005kotlin.jvm.internal.s.g(this.f140919q, oVar.f140919q) && p005kotlin.jvm.internal.s.g(this.f140920r, oVar.f140920r) && p005kotlin.jvm.internal.s.g(this.f140921s, oVar.f140921s) && p005kotlin.jvm.internal.s.g(this.f140922t, oVar.f140922t) && p005kotlin.jvm.internal.s.g(this.f140923u, oVar.f140923u) && this.f140924v == oVar.f140924v && p005kotlin.jvm.internal.s.g(this.f140925w, oVar.f140925w) && p005kotlin.jvm.internal.s.g(this.f140926x, oVar.f140926x) && this.f140927y == oVar.f140927y && this.f140928z == oVar.f140928z && this.A == oVar.A && this.B == oVar.B && this.C == oVar.C && this.D == oVar.D;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Boolean.hashCode(this.f140903a) * 31, 31, this.f140904b), 31, this.f140905c);
        e eVar = this.f140906d;
        int iG2 = q6.f.g(q6.f.g(q2.d(this.f140909g, q6.f.g(q6.f.g((iG + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f140907e), 31, this.f140908f), 31), 31, this.f140910h), 31, this.f140911i);
        p pVar = this.f140912j;
        int iD = q2.d(this.f140913k, (iG2 + (pVar == null ? 0 : pVar.hashCode())) * 31, 31);
        r53.i<v2<kt1.b>> iVar = this.f140914l;
        int iB = l2.b(this.f140916n, q6.f.g((iD + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f140915m), 31);
        Long l14 = this.f140917o;
        int iHashCode = (iB + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f140918p;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        i53.c<x> cVar = this.f140919q;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        v vVar = this.f140920r;
        int iHashCode4 = (iHashCode3 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        y yVar = this.f140921s;
        int iHashCode5 = (this.f140923u.hashCode() + ((this.f140922t.hashCode() + ((iHashCode4 + (yVar == null ? 0 : yVar.hashCode())) * 31)) * 31)) * 31;
        vs1.i iVar2 = this.f140924v;
        int iHashCode6 = (iHashCode5 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        String str = this.f140925w;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        c80.p pVar2 = this.f140926x;
        return Boolean.hashCode(this.D) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode7 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31, 31, this.f140927y), 31, this.f140928z), 31, this.A), 31, this.B), 31, this.C);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("TrailDetailsScreenState(isLoading=", ", isError=", ", operationInProgress=", this.f140903a, this.f140904b);
        sbM.append(this.f140905c);
        sbM.append(", photoUploadProgress=");
        sbM.append(this.f140906d);
        sbM.append(", isReviewsRateLimited=");
        kg.f.q(", suggestionRateLimited=", ", rateLimitedMessage=", sbM, this.f140907e, this.f140908f);
        fb1.c.x(sbM, this.f140909g, ", showReportsRateLimitedDialog=", this.f140910h, ", showContentAlreadyReportedDialog=");
        sbM.append(this.f140911i);
        sbM.append(", detailsState=");
        sbM.append(this.f140912j);
        sbM.append(", photosCount=");
        sbM.append(this.f140913k);
        sbM.append(", photosFlow=");
        sbM.append(this.f140914l);
        sbM.append(", showContentReportedDialog=");
        sbM.append(this.f140915m);
        sbM.append(", photosHelpfulStates=");
        sbM.append(this.f140916n);
        sbM.append(", activityId=");
        kg.f.s(sbM, this.f140917o, ", activityDateMillis=", this.f140918p, ", overviewReviews=");
        sbM.append(this.f140919q);
        sbM.append(", trailReviewPromptState=");
        sbM.append(this.f140920r);
        sbM.append(", trailReviewSuggestionState=");
        sbM.append(this.f140921s);
        sbM.append(", bottomSheetContentType=");
        sbM.append(this.f140922t);
        sbM.append(", reviewImagesScreenBottomSheetContentType=");
        sbM.append(this.f140923u);
        sbM.append(", gcPlusFeatureStatus=");
        sbM.append(this.f140924v);
        sbM.append(", sendTrailDeviceName=");
        sbM.append(this.f140925w);
        sbM.append(", trailsFeatureStatus=");
        sbM.append(this.f140926x);
        sbM.append(", enableGCPlusFeatures=");
        kg.f.q(", showCustomizeTrailDialog=", ", showPlusIcon=", sbM, this.f140927y, this.f140928z);
        kg.f.q(", showPhotoUploadCanceledDialog=", ", showPhotoUploadFailedDialog=", sbM, this.A, this.B);
        return com.airbnb.lottie.animation.keyframe.a.f(", showTrailReviewsNotSupportedDialog=", ")", sbM, this.C, this.D);
    }

    public o(boolean z14, boolean z15, boolean z16, e eVar, boolean z17, boolean z18, int i14, boolean z19, boolean z24, p pVar, int i15, r53.i<v2<kt1.b>> iVar, boolean z25, i53.d<Long, r> dVar, Long l14, Long l15, i53.c<x> cVar, v vVar, y yVar, n nVar, n nVar2, vs1.i iVar2, String str, c80.p pVar2, boolean z26, boolean z27, boolean z28, boolean z29, boolean z34, boolean z35) {
        dVar.getClass();
        nVar.getClass();
        nVar2.getClass();
        this.f140903a = z14;
        this.f140904b = z15;
        this.f140905c = z16;
        this.f140906d = eVar;
        this.f140907e = z17;
        this.f140908f = z18;
        this.f140909g = i14;
        this.f140910h = z19;
        this.f140911i = z24;
        this.f140912j = pVar;
        this.f140913k = i15;
        this.f140914l = iVar;
        this.f140915m = z25;
        this.f140916n = dVar;
        this.f140917o = l14;
        this.f140918p = l15;
        this.f140919q = cVar;
        this.f140920r = vVar;
        this.f140921s = yVar;
        this.f140922t = nVar;
        this.f140923u = nVar2;
        this.f140924v = iVar2;
        this.f140925w = str;
        this.f140926x = pVar2;
        this.f140927y = z26;
        this.f140928z = z27;
        this.A = z28;
        this.B = z29;
        this.C = z34;
        this.D = z35;
    }
}
