package ls;

import b71.i;
import com.garmin.android.apps.connectmobile.activities.newmodel.o0;
import com.garmin.android.apps.connectmobile.activities.newmodel.p;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps.a1;
import ps.c0;
import ps.e2;
import ps.i0;
import ps.k0;
import ps.o1;
import ps.q1;
import ps.s0;
import ps.w;
import ps.w0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lls/a;", "", "", "activityTypeKey", "Lps/q1;", "summaryDto", "Lps/a1;", "metadataDto", "", "Lps/c0;", "ciqApps", "", "isDeviceTrainingEffectCapable", "Lqs/d;", "deviceManufacturer", "Lps/w;", "ciqMeasurementDTOs", "Lps/o1;", "splitSummaries", "", "bestGradeAdjustedSpeed", "bestLapAverageSpeed", "Lps/e2;", "windDataValue", "bestRunActiveSplitSpeed", "maxRunningSplitPower", "userWeight", "Lps/w0;", "jumpMetrics", "", "lapCount", "locationName", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/o0;", "videoGameInfo", "Lps/s0;", "exerciseSetsDTO", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "roundsDTO", "Lps/k0;", "diveInfoDTO", "airTemperatureCelsius", "weatherDescription", "Lps/i0;", "diveActivityDTO", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;", "deviceDisplayUnitsDTO", "<init>", "(Ljava/lang/String;Lps/q1;Lps/a1;Ljava/util/List;ZLqs/d;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Lps/e2;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/activities/newmodel/o0;Lps/s0;Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;Lps/k0;Ljava/lang/Double;Ljava/lang/String;Lps/i0;Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f114451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f114452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c0> f114453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f114454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs.d f114455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<w> f114456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<o1> f114457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f114458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f114459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e2 f114460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f114461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f114462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f114463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<w0> f114464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f114465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f114466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f114467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s0 f114468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.f f114469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k0 f114470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Double f114471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f114472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i0 f114473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p f114474y;

    public /* synthetic */ a(String str, q1 q1Var, a1 a1Var, List list, boolean z14, qs.d dVar, List list2, List list3, Double d14, Double d15, e2 e2Var, Double d16, Double d17, Double d18, List list4, Integer num, String str2, o0 o0Var, s0 s0Var, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, k0 k0Var, Double d19, String str3, i0 i0Var, p pVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : q1Var, (i14 & 4) != 0 ? null : a1Var, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? true : z14, (i14 & 32) != 0 ? qs.d.DEFAULT : dVar, (i14 & 64) != 0 ? null : list2, (i14 & 128) != 0 ? null : list3, (i14 & 256) != 0 ? null : d14, (i14 & 512) != 0 ? null : d15, (i14 & 1024) != 0 ? null : e2Var, (i14 & 2048) != 0 ? null : d16, (i14 & 4096) != 0 ? null : d17, (i14 & 8192) != 0 ? null : d18, (i14 & 16384) != 0 ? null : list4, (i14 & 32768) != 0 ? null : num, (i14 & 65536) != 0 ? null : str2, (i14 & 131072) != 0 ? null : o0Var, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : s0Var, (i14 & 524288) != 0 ? null : fVar, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : k0Var, (i14 & 2097152) != 0 ? null : d19, (i14 & 4194304) != 0 ? null : str3, (i14 & 8388608) != 0 ? null : i0Var, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : pVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF114450a() {
        return this.f114450a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getF114471v() {
        return this.f114471v;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getF114458i() {
        return this.f114458i;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getF114459j() {
        return this.f114459j;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getF114461l() {
        return this.f114461l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f114450a, aVar.f114450a) && s.g(this.f114451b, aVar.f114451b) && s.g(this.f114452c, aVar.f114452c) && s.g(this.f114453d, aVar.f114453d) && this.f114454e == aVar.f114454e && this.f114455f == aVar.f114455f && s.g(this.f114456g, aVar.f114456g) && s.g(this.f114457h, aVar.f114457h) && s.g(this.f114458i, aVar.f114458i) && s.g(this.f114459j, aVar.f114459j) && this.f114460k == aVar.f114460k && s.g(this.f114461l, aVar.f114461l) && s.g(this.f114462m, aVar.f114462m) && s.g(this.f114463n, aVar.f114463n) && s.g(this.f114464o, aVar.f114464o) && s.g(this.f114465p, aVar.f114465p) && s.g(this.f114466q, aVar.f114466q) && s.g(this.f114467r, aVar.f114467r) && s.g(this.f114468s, aVar.f114468s) && s.g(this.f114469t, aVar.f114469t) && s.g(this.f114470u, aVar.f114470u) && s.g(this.f114471v, aVar.f114471v) && s.g(this.f114472w, aVar.f114472w) && s.g(this.f114473x, aVar.f114473x) && s.g(this.f114474y, aVar.f114474y);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getF114474y() {
        return this.f114474y;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i0 getF114473x() {
        return this.f114473x;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k0 getF114470u() {
        return this.f114470u;
    }

    public final int hashCode() {
        String str = this.f114450a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        q1 q1Var = this.f114451b;
        int iHashCode2 = (iHashCode + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        a1 a1Var = this.f114452c;
        int iHashCode3 = (iHashCode2 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        List<c0> list = this.f114453d;
        int iHashCode4 = (this.f114455f.hashCode() + q6.f.g((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f114454e)) * 31;
        List<w> list2 = this.f114456g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<o1> list3 = this.f114457h;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Double d14 = this.f114458i;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f114459j;
        int iHashCode8 = (iHashCode7 + (d15 == null ? 0 : d15.hashCode())) * 31;
        e2 e2Var = this.f114460k;
        int iHashCode9 = (iHashCode8 + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        Double d16 = this.f114461l;
        int iHashCode10 = (iHashCode9 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f114462m;
        int iHashCode11 = (iHashCode10 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f114463n;
        int iHashCode12 = (iHashCode11 + (d18 == null ? 0 : d18.hashCode())) * 31;
        List<w0> list4 = this.f114464o;
        int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.f114465p;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f114466q;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        o0 o0Var = this.f114467r;
        int iHashCode16 = (iHashCode15 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        s0 s0Var = this.f114468s;
        int iHashCode17 = (iHashCode16 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = this.f114469t;
        int iHashCode18 = (iHashCode17 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        k0 k0Var = this.f114470u;
        int iHashCode19 = (iHashCode18 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        Double d19 = this.f114471v;
        int iHashCode20 = (iHashCode19 + (d19 == null ? 0 : d19.hashCode())) * 31;
        String str3 = this.f114472w;
        int iHashCode21 = (iHashCode20 + (str3 == null ? 0 : str3.hashCode())) * 31;
        i0 i0Var = this.f114473x;
        int iHashCode22 = (iHashCode21 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        p pVar = this.f114474y;
        return iHashCode22 + (pVar != null ? pVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.f getF114469t() {
        return this.f114469t;
    }

    public final List<o1> j() {
        return this.f114457h;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getF114472w() {
        return this.f114472w;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final e2 getF114460k() {
        return this.f114460k;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityStatsSummary(activityTypeKey=");
        sb3.append(this.f114450a);
        sb3.append(", summaryDto=");
        sb3.append(this.f114451b);
        sb3.append(", metadataDto=");
        sb3.append(this.f114452c);
        sb3.append(", ciqApps=");
        sb3.append(this.f114453d);
        sb3.append(", isDeviceTrainingEffectCapable=");
        sb3.append(this.f114454e);
        sb3.append(", deviceManufacturer=");
        sb3.append(this.f114455f);
        sb3.append(", ciqMeasurementDTOs=");
        n23.j.z(sb3, this.f114456g, ", splitSummaries=", this.f114457h, ", bestGradeAdjustedSpeed=");
        i.p(this.f114458i, this.f114459j, ", bestLapAverageSpeed=", ", windDataValue=", sb3);
        sb3.append(this.f114460k);
        sb3.append(", bestRunActiveSplitSpeed=");
        sb3.append(this.f114461l);
        sb3.append(", maxRunningSplitPower=");
        i.p(this.f114462m, this.f114463n, ", userWeight=", ", jumpMetrics=", sb3);
        sb3.append(this.f114464o);
        sb3.append(", lapCount=");
        sb3.append(this.f114465p);
        sb3.append(", locationName=");
        sb3.append(this.f114466q);
        sb3.append(", videoGameInfo=");
        sb3.append(this.f114467r);
        sb3.append(", exerciseSetsDTO=");
        sb3.append(this.f114468s);
        sb3.append(", roundsDTO=");
        sb3.append(this.f114469t);
        sb3.append(", diveInfoDTO=");
        sb3.append(this.f114470u);
        sb3.append(", airTemperatureCelsius=");
        sb3.append(this.f114471v);
        sb3.append(", weatherDescription=");
        sb3.append(this.f114472w);
        sb3.append(", diveActivityDTO=");
        sb3.append(this.f114473x);
        sb3.append(", deviceDisplayUnitsDTO=");
        sb3.append(this.f114474y);
        sb3.append(")");
        return sb3.toString();
    }

    public a(String str, q1 q1Var, a1 a1Var, List<c0> list, boolean z14, qs.d dVar, List<w> list2, List<o1> list3, Double d14, Double d15, e2 e2Var, Double d16, Double d17, Double d18, List<w0> list4, Integer num, String str2, o0 o0Var, s0 s0Var, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, k0 k0Var, Double d19, String str3, i0 i0Var, p pVar) {
        dVar.getClass();
        this.f114450a = str;
        this.f114451b = q1Var;
        this.f114452c = a1Var;
        this.f114453d = list;
        this.f114454e = z14;
        this.f114455f = dVar;
        this.f114456g = list2;
        this.f114457h = list3;
        this.f114458i = d14;
        this.f114459j = d15;
        this.f114460k = e2Var;
        this.f114461l = d16;
        this.f114462m = d17;
        this.f114463n = d18;
        this.f114464o = list4;
        this.f114465p = num;
        this.f114466q = str2;
        this.f114467r = o0Var;
        this.f114468s = s0Var;
        this.f114469t = fVar;
        this.f114470u = k0Var;
        this.f114471v = d19;
        this.f114472w = str3;
        this.f114473x = i0Var;
        this.f114474y = pVar;
    }

    public a() {
        this(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }
}
