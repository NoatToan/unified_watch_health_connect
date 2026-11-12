package o51;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import j53.l;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010'\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020%\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\b\b\u0002\u0010,\u001a\u00020\u0012\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00102\u001a\u000201\u0012\b\b\u0002\u00103\u001a\u00020\u0012\u0012\b\b\u0002\u00104\u001a\u00020\u0012¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"Lo51/f;", "", "", "paceBandPk", "courseId", "", "name", "", "pacingStrategy", "uphillEffort", "elevationBasedSplits", "Lt41/f;", "paceProRaceDistance", "", "distanceInSelectedUnit", "Ln02/g;", "distanceUnit", "formattedDistance", "", "isGoalPaceUsingMetric", "isPlanUsingMetric", "", "minGoalTimeSeconds", "maxGoalTimeSeconds", "goalTimeSeconds", "formattedGoalTime", "goalTimeContentDescription", "minGoalPaceSeconds", "maxGoalPaceSeconds", "goalPaceSeconds", "formattedGoalPace", "goalPaceContentDescription", "Lt41/i;", "splitsDisplayType", "chartTitle", "formattedMinimumPace", "formattedMaximumPace", "Lo51/i;", "portraitSplitsState", "landscapeSplitsState", "editSplitsState", "Li53/c;", "Lo51/c;", "relatedPaceProPlanStates", "hasManualPaceEdits", "Lo51/e;", "paceProMapState", "Lo51/b;", "paceProChartState", "Lo51/g;", "sendToDeviceState", "isLoading", "isError", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;FFFLt41/f;DLn02/g;Ljava/lang/String;ZZIIILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Lt41/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo51/i;Lo51/i;Lo51/i;Li53/c;ZLo51/e;Lo51/b;Lo51/g;ZZ)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {
    public final i A;
    public final i B;
    public final i C;
    public final i53.c<c> D;
    public final boolean E;
    public final e F;
    public final b G;
    public final g H;
    public final boolean I;
    public final boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f129236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f129237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f129238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f129239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f129240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f129241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t41.f f129242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f129243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n02.g f129244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f129245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f129246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f129247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f129248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f129249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f129250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f129251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f129252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f129253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f129254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f129255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f129256u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f129257v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t41.i f129258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f129259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f129260y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f129261z;

    static {
        Parcelable.Creator<ke2.b> creator = ke2.b.CREATOR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Long l14, Long l15, String str, float f14, float f15, float f16, t41.f fVar, double d14, n02.g gVar, String str2, boolean z14, boolean z15, int i14, int i15, int i16, String str3, String str4, int i17, int i18, int i19, String str5, String str6, t41.i iVar, String str7, String str8, String str9, i iVar2, i iVar3, i iVar4, i53.c cVar, boolean z16, e eVar, b bVar, g gVar2, boolean z17, boolean z18, int i24, int i25, p005kotlin.jvm.internal.j jVar) {
        Long l16 = (i24 & 1) != 0 ? null : l14;
        Long l17 = (i24 & 2) != 0 ? null : l15;
        String str10 = (i24 & 4) != 0 ? "" : str;
        float f17 = (i24 & 8) != 0 ? 0.0f : f14;
        float f18 = (i24 & 16) != 0 ? 0.0f : f15;
        float f19 = (i24 & 32) == 0 ? f16 : 0.0f;
        t41.f fVar2 = (i24 & 64) != 0 ? t41.f.FIVE_K : fVar;
        double d15 = (i24 & 128) != 0 ? 0.0d : d14;
        n02.g gVar3 = (i24 & 256) != 0 ? n02.g.MILES : gVar;
        String str11 = (i24 & 512) != 0 ? "" : str2;
        boolean z19 = (i24 & 1024) != 0 ? false : z14;
        boolean z24 = (i24 & 2048) != 0 ? false : z15;
        int i26 = (i24 & 4096) != 0 ? 0 : i14;
        Long l18 = l16;
        int i27 = (i24 & 8192) != 0 ? 0 : i15;
        int i28 = (i24 & 16384) != 0 ? 0 : i16;
        String str12 = (i24 & 32768) != 0 ? "" : str3;
        String str13 = (i24 & 65536) != 0 ? str12 : str4;
        int i29 = (i24 & 131072) != 0 ? 0 : i17;
        int i30 = (i24 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? 0 : i18;
        int i34 = (i24 & 524288) != 0 ? 0 : i19;
        String str14 = (i24 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? "" : str5;
        this(l18, l17, str10, f17, f18, f19, fVar2, d15, gVar3, str11, z19, z24, i26, i27, i28, str12, str13, i29, i30, i34, str14, (i24 & 2097152) != 0 ? str14 : str6, (i24 & 4194304) != 0 ? t41.i.EVERY_MILE : iVar, (i24 & 8388608) != 0 ? "" : str7, (i24 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? "" : str8, (i24 & 33554432) == 0 ? str9 : "", (i24 & 67108864) != 0 ? new i(null, null, null, 7, null) : iVar2, (i24 & 134217728) != 0 ? new i(null, null, null, 7, null) : iVar3, (i24 & 268435456) != 0 ? new i(null, null, null, 7, null) : iVar4, (i24 & 536870912) != 0 ? l.b() : cVar, (i24 & 1073741824) != 0 ? false : z16, (i24 & Integer.MIN_VALUE) != 0 ? null : eVar, (i25 & 1) != 0 ? null : bVar, (i25 & 2) != 0 ? new g(false, false, false, null, 15, null) : gVar2, (i25 & 4) != 0 ? true : z17, (i25 & 8) != 0 ? false : z18);
    }

    public final i53.c<c> a() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.D) {
            long j8 = cVar.f129221c;
            Long l14 = this.f129236a;
            if (l14 == null || j8 != l14.longValue()) {
                arrayList.add(cVar);
            }
        }
        return i53.a.e(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f129236a, fVar.f129236a) && s.g(this.f129237b, fVar.f129237b) && s.g(this.f129238c, fVar.f129238c) && Float.compare(this.f129239d, fVar.f129239d) == 0 && Float.compare(this.f129240e, fVar.f129240e) == 0 && Float.compare(this.f129241f, fVar.f129241f) == 0 && this.f129242g == fVar.f129242g && Double.compare(this.f129243h, fVar.f129243h) == 0 && this.f129244i == fVar.f129244i && s.g(this.f129245j, fVar.f129245j) && this.f129246k == fVar.f129246k && this.f129247l == fVar.f129247l && this.f129248m == fVar.f129248m && this.f129249n == fVar.f129249n && this.f129250o == fVar.f129250o && s.g(this.f129251p, fVar.f129251p) && s.g(this.f129252q, fVar.f129252q) && this.f129253r == fVar.f129253r && this.f129254s == fVar.f129254s && this.f129255t == fVar.f129255t && s.g(this.f129256u, fVar.f129256u) && s.g(this.f129257v, fVar.f129257v) && this.f129258w == fVar.f129258w && s.g(this.f129259x, fVar.f129259x) && s.g(this.f129260y, fVar.f129260y) && s.g(this.f129261z, fVar.f129261z) && s.g(this.A, fVar.A) && s.g(this.B, fVar.B) && s.g(this.C, fVar.C) && s.g(this.D, fVar.D) && this.E == fVar.E && s.g(this.F, fVar.F) && s.g(this.G, fVar.G) && s.g(this.H, fVar.H) && this.I == fVar.I && this.J == fVar.J;
    }

    public final int hashCode() {
        Long l14 = this.f129236a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f129237b;
        int iG = q6.f.g(l2.a(this.D, (this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + wr.g.j(wr.g.j(wr.g.j((this.f129258w.hashCode() + wr.g.j(wr.g.j(q2.d(this.f129255t, q2.d(this.f129254s, q2.d(this.f129253r, wr.g.j(wr.g.j(q2.d(this.f129250o, q2.d(this.f129249n, q2.d(this.f129248m, q6.f.g(q6.f.g(wr.g.j((this.f129244i.hashCode() + org.apache.commons.lang3.e.b((this.f129242g.hashCode() + q6.f.d(this.f129241f, q6.f.d(this.f129240e, q6.f.d(this.f129239d, wr.g.j((iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31, 31, this.f129238c), 31), 31), 31)) * 31, 31, this.f129243h)) * 31, 31, this.f129245j), 31, this.f129246k), 31, this.f129247l), 31), 31), 31), 31, this.f129251p), 31, this.f129252q), 31), 31), 31), 31, this.f129256u), 31, this.f129257v)) * 31, 31, this.f129259x), 31, this.f129260y), 31, this.f129261z)) * 31)) * 31)) * 31, 31), 31, this.E);
        e eVar = this.F;
        int iHashCode2 = (iG + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b bVar = this.G;
        return Boolean.hashCode(this.J) + q6.f.g((this.H.hashCode() + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31)) * 31, 31, this.I);
    }

    public final String toString() {
        StringBuilder sbJ = f3.j(this.f129236a, this.f129237b, "PaceProPlanState(paceBandPk=", ", courseId=", ", name=");
        sbJ.append(this.f129238c);
        sbJ.append(", pacingStrategy=");
        sbJ.append(this.f129239d);
        sbJ.append(", uphillEffort=");
        l2.n(sbJ, this.f129240e, ", elevationBasedSplits=", this.f129241f, ", paceProRaceDistance=");
        sbJ.append(this.f129242g);
        sbJ.append(", distanceInSelectedUnit=");
        sbJ.append(this.f129243h);
        sbJ.append(", distanceUnit=");
        sbJ.append(this.f129244i);
        sbJ.append(", formattedDistance=");
        sbJ.append(this.f129245j);
        com.airbnb.lottie.animation.keyframe.a.v(", isGoalPaceUsingMetric=", ", isPlanUsingMetric=", sbJ, this.f129246k, this.f129247l);
        androidx.core.view.j.m(this.f129248m, this.f129249n, ", minGoalTimeSeconds=", ", maxGoalTimeSeconds=", sbJ);
        sbJ.append(", goalTimeSeconds=");
        sbJ.append(this.f129250o);
        sbJ.append(", formattedGoalTime=");
        sbJ.append(this.f129251p);
        sbJ.append(", goalTimeContentDescription=");
        sbJ.append(this.f129252q);
        sbJ.append(", minGoalPaceSeconds=");
        sbJ.append(this.f129253r);
        androidx.core.view.j.m(this.f129254s, this.f129255t, ", maxGoalPaceSeconds=", ", goalPaceSeconds=", sbJ);
        sn.a.t(sbJ, ", formattedGoalPace=", this.f129256u, ", goalPaceContentDescription=", this.f129257v);
        sbJ.append(", splitsDisplayType=");
        sbJ.append(this.f129258w);
        sbJ.append(", chartTitle=");
        sbJ.append(this.f129259x);
        sn.a.t(sbJ, ", formattedMinimumPace=", this.f129260y, ", formattedMaximumPace=", this.f129261z);
        sbJ.append(", portraitSplitsState=");
        sbJ.append(this.A);
        sbJ.append(", landscapeSplitsState=");
        sbJ.append(this.B);
        sbJ.append(", editSplitsState=");
        sbJ.append(this.C);
        sbJ.append(", relatedPaceProPlanStates=");
        sbJ.append(this.D);
        sbJ.append(", hasManualPaceEdits=");
        sbJ.append(this.E);
        sbJ.append(", paceProMapState=");
        sbJ.append(this.F);
        sbJ.append(", paceProChartState=");
        sbJ.append(this.G);
        sbJ.append(", sendToDeviceState=");
        sbJ.append(this.H);
        com.airbnb.lottie.animation.keyframe.a.v(", isLoading=", ", isError=", sbJ, this.I, this.J);
        sbJ.append(")");
        return sbJ.toString();
    }

    public f(Long l14, Long l15, String str, float f14, float f15, float f16, t41.f fVar, double d14, n02.g gVar, String str2, boolean z14, boolean z15, int i14, int i15, int i16, String str3, String str4, int i17, int i18, int i19, String str5, String str6, t41.i iVar, String str7, String str8, String str9, i iVar2, i iVar3, i iVar4, i53.c<c> cVar, boolean z16, e eVar, b bVar, g gVar2, boolean z17, boolean z18) {
        str.getClass();
        fVar.getClass();
        gVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        iVar.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        iVar2.getClass();
        iVar3.getClass();
        iVar4.getClass();
        cVar.getClass();
        gVar2.getClass();
        this.f129236a = l14;
        this.f129237b = l15;
        this.f129238c = str;
        this.f129239d = f14;
        this.f129240e = f15;
        this.f129241f = f16;
        this.f129242g = fVar;
        this.f129243h = d14;
        this.f129244i = gVar;
        this.f129245j = str2;
        this.f129246k = z14;
        this.f129247l = z15;
        this.f129248m = i14;
        this.f129249n = i15;
        this.f129250o = i16;
        this.f129251p = str3;
        this.f129252q = str4;
        this.f129253r = i17;
        this.f129254s = i18;
        this.f129255t = i19;
        this.f129256u = str5;
        this.f129257v = str6;
        this.f129258w = iVar;
        this.f129259x = str7;
        this.f129260y = str8;
        this.f129261z = str9;
        this.A = iVar2;
        this.B = iVar3;
        this.C = iVar4;
        this.D = cVar;
        this.E = z16;
        this.F = eVar;
        this.G = bVar;
        this.H = gVar2;
        this.I = z17;
        this.J = z18;
    }

    public f() {
        this(null, null, null, 0.0f, 0.0f, 0.0f, null, 0.0d, null, null, false, false, 0, 0, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, false, -1, 15, null);
    }
}
