package rm1;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.e0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010%\u001a\u00020\u0014\u0012\u0006\u0010&\u001a\u00020\u0014\u0012\u0006\u0010'\u001a\u00020\u0014\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\u0006\u0010)\u001a\u00020\u0014\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010-\u001a\u00020*\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lrm1/j;", "", "Lrm1/h;", "dailySleep", "", "Lrm1/i;", "sleepMovement", "sleepLevels", "Lrm1/a;", "breathingVariations", "Lrm1/k;", "sleepRestlessMoments", "Lrm1/n;", "wellnessSpO2SleepSummary", "Lrm1/m;", "wellnessEpochSPO2DataList", "Lrm1/d;", "wellnessEpochRespirationDataList", "Lrm1/c;", "wellnessEpochRespirationAveragesList", "", "respirationVersion", "sleepStressList", "Lrm1/e;", "skinTemp", "Lrm1/f;", "skinTempDataList", "", "avgSkinTempDeviationC", "avgSkinTempDeviationF", "sleepHeartRateList", "sleepBodyBatteryList", "bodyBatteryChange", "hrvDataList", "", "hrvStatus", "avgOvernightHrv", "totalDeepSleepMinutes", "totalLightSleepMinutes", "totalRemSleepMinutes", "totalAwakeSleepMinutes", "totalSleepMinutes", "", "isDeviceRemCapable", "sleepScoreValue", "hasUnmeasurableSleep", "Lrm1/b;", "sleepInterval", "Lrl1/h;", "sleepStagesData", "<init>", "(Lrm1/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrm1/n;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lrm1/e;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;IIIIIZLjava/lang/Integer;ZLrm1/b;Lrl1/h;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {
    public final boolean A;
    public final Integer B;
    public final boolean C;
    public final b D;
    public final rl1.h E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f153585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<i> f153586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i> f153587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a> f153588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<k> f153589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f153590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<m> f153591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<d> f153592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<c> f153593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f153594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<k> f153595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f153596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<f> f153597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f153598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f153599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<k> f153600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<k> f153601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f153602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<k> f153603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f153604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f153605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f153606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f153607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f153608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f153609y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f153610z;

    public /* synthetic */ j(h hVar, List list, List list2, List list3, List list4, n nVar, List list5, List list6, List list7, Integer num, List list8, e eVar, List list9, Double d14, Double d15, List list10, List list11, Integer num2, List list12, String str, Integer num3, int i14, int i15, int i16, int i17, int i18, boolean z14, Integer num4, boolean z15, b bVar, rl1.h hVar2, int i19, p005kotlin.jvm.internal.j jVar) {
        this((i19 & 1) != 0 ? null : hVar, (i19 & 2) != 0 ? null : list, (i19 & 4) != 0 ? null : list2, (i19 & 8) != 0 ? null : list3, (i19 & 16) != 0 ? null : list4, (i19 & 32) != 0 ? null : nVar, (i19 & 64) != 0 ? null : list5, (i19 & 128) != 0 ? null : list6, (i19 & 256) != 0 ? null : list7, (i19 & 512) != 0 ? null : num, (i19 & 1024) != 0 ? null : list8, (i19 & 2048) != 0 ? null : eVar, (i19 & 4096) != 0 ? null : list9, (i19 & 8192) != 0 ? null : d14, (i19 & 16384) != 0 ? null : d15, (32768 & i19) != 0 ? null : list10, (65536 & i19) != 0 ? null : list11, (131072 & i19) != 0 ? null : num2, (262144 & i19) != 0 ? null : list12, (524288 & i19) != 0 ? null : str, (i19 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num3, i14, i15, i16, i17, i18, z14, num4, z15, bVar, hVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f153585a, jVar.f153585a) && s.g(this.f153586b, jVar.f153586b) && s.g(this.f153587c, jVar.f153587c) && s.g(this.f153588d, jVar.f153588d) && s.g(this.f153589e, jVar.f153589e) && s.g(this.f153590f, jVar.f153590f) && s.g(this.f153591g, jVar.f153591g) && s.g(this.f153592h, jVar.f153592h) && s.g(this.f153593i, jVar.f153593i) && s.g(this.f153594j, jVar.f153594j) && s.g(this.f153595k, jVar.f153595k) && s.g(this.f153596l, jVar.f153596l) && s.g(this.f153597m, jVar.f153597m) && s.g(this.f153598n, jVar.f153598n) && s.g(this.f153599o, jVar.f153599o) && s.g(this.f153600p, jVar.f153600p) && s.g(this.f153601q, jVar.f153601q) && s.g(this.f153602r, jVar.f153602r) && s.g(this.f153603s, jVar.f153603s) && s.g(this.f153604t, jVar.f153604t) && s.g(this.f153605u, jVar.f153605u) && this.f153606v == jVar.f153606v && this.f153607w == jVar.f153607w && this.f153608x == jVar.f153608x && this.f153609y == jVar.f153609y && this.f153610z == jVar.f153610z && this.A == jVar.A && s.g(this.B, jVar.B) && this.C == jVar.C && s.g(this.D, jVar.D) && s.g(this.E, jVar.E);
    }

    public final int hashCode() {
        h hVar = this.f153585a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        List<i> list = this.f153586b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<i> list2 = this.f153587c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<a> list3 = this.f153588d;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<k> list4 = this.f153589e;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        n nVar = this.f153590f;
        int iHashCode6 = (iHashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        List<m> list5 = this.f153591g;
        int iHashCode7 = (iHashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<d> list6 = this.f153592h;
        int iHashCode8 = (iHashCode7 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<c> list7 = this.f153593i;
        int iHashCode9 = (iHashCode8 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Integer num = this.f153594j;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        List<k> list8 = this.f153595k;
        int iHashCode11 = (iHashCode10 + (list8 == null ? 0 : list8.hashCode())) * 31;
        e eVar = this.f153596l;
        int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<f> list9 = this.f153597m;
        int iHashCode13 = (iHashCode12 + (list9 == null ? 0 : list9.hashCode())) * 31;
        Double d14 = this.f153598n;
        int iHashCode14 = (iHashCode13 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f153599o;
        int iHashCode15 = (iHashCode14 + (d15 == null ? 0 : d15.hashCode())) * 31;
        List<k> list10 = this.f153600p;
        int iHashCode16 = (iHashCode15 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<k> list11 = this.f153601q;
        int iHashCode17 = (iHashCode16 + (list11 == null ? 0 : list11.hashCode())) * 31;
        Integer num2 = this.f153602r;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<k> list12 = this.f153603s;
        int iHashCode19 = (iHashCode18 + (list12 == null ? 0 : list12.hashCode())) * 31;
        String str = this.f153604t;
        int iHashCode20 = (iHashCode19 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f153605u;
        int iG = q6.f.g(q2.d(this.f153610z, q2.d(this.f153609y, q2.d(this.f153608x, q2.d(this.f153607w, q2.d(this.f153606v, (iHashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.A);
        Integer num4 = this.B;
        int iG2 = q6.f.g((iG + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.C);
        b bVar = this.D;
        return this.E.hashCode() + ((iG2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SleepChartData(dailySleep=");
        sb3.append(this.f153585a);
        sb3.append(", sleepMovement=");
        sb3.append(this.f153586b);
        sb3.append(", sleepLevels=");
        n23.j.z(sb3, this.f153587c, ", breathingVariations=", this.f153588d, ", sleepRestlessMoments=");
        sb3.append(this.f153589e);
        sb3.append(", wellnessSpO2SleepSummary=");
        sb3.append(this.f153590f);
        sb3.append(", wellnessEpochSPO2DataList=");
        n23.j.z(sb3, this.f153591g, ", wellnessEpochRespirationDataList=", this.f153592h, ", wellnessEpochRespirationAveragesList=");
        sb3.append(this.f153593i);
        sb3.append(", respirationVersion=");
        sb3.append(this.f153594j);
        sb3.append(", sleepStressList=");
        sb3.append(this.f153595k);
        sb3.append(", skinTemp=");
        sb3.append(this.f153596l);
        sb3.append(", skinTempDataList=");
        sb3.append(this.f153597m);
        sb3.append(", avgSkinTempDeviationC=");
        sb3.append(this.f153598n);
        sb3.append(", avgSkinTempDeviationF=");
        sb3.append(this.f153599o);
        sb3.append(", sleepHeartRateList=");
        sb3.append(this.f153600p);
        sb3.append(", sleepBodyBatteryList=");
        sb3.append(this.f153601q);
        sb3.append(", bodyBatteryChange=");
        sb3.append(this.f153602r);
        sb3.append(", hrvDataList=");
        o2.c.n(", hrvStatus=", this.f153604t, ", avgOvernightHrv=", sb3, this.f153603s);
        sb3.append(this.f153605u);
        sb3.append(", totalDeepSleepMinutes=");
        sb3.append(this.f153606v);
        sb3.append(", totalLightSleepMinutes=");
        e0.m(this.f153607w, this.f153608x, ", totalRemSleepMinutes=", ", totalAwakeSleepMinutes=", sb3);
        e0.m(this.f153609y, this.f153610z, ", totalSleepMinutes=", ", isDeviceRemCapable=", sb3);
        sb3.append(this.A);
        sb3.append(", sleepScoreValue=");
        sb3.append(this.B);
        sb3.append(", hasUnmeasurableSleep=");
        sb3.append(this.C);
        sb3.append(", sleepInterval=");
        sb3.append(this.D);
        sb3.append(", sleepStagesData=");
        sb3.append(this.E);
        sb3.append(")");
        return sb3.toString();
    }

    public j(h hVar, List<i> list, List<i> list2, List<a> list3, List<k> list4, n nVar, List<m> list5, List<d> list6, List<c> list7, Integer num, List<k> list8, e eVar, List<f> list9, Double d14, Double d15, List<k> list10, List<k> list11, Integer num2, List<k> list12, String str, Integer num3, int i14, int i15, int i16, int i17, int i18, boolean z14, Integer num4, boolean z15, b bVar, rl1.h hVar2) {
        hVar2.getClass();
        this.f153585a = hVar;
        this.f153586b = list;
        this.f153587c = list2;
        this.f153588d = list3;
        this.f153589e = list4;
        this.f153590f = nVar;
        this.f153591g = list5;
        this.f153592h = list6;
        this.f153593i = list7;
        this.f153594j = num;
        this.f153595k = list8;
        this.f153596l = eVar;
        this.f153597m = list9;
        this.f153598n = d14;
        this.f153599o = d15;
        this.f153600p = list10;
        this.f153601q = list11;
        this.f153602r = num2;
        this.f153603s = list12;
        this.f153604t = str;
        this.f153605u = num3;
        this.f153606v = i14;
        this.f153607w = i15;
        this.f153608x = i16;
        this.f153609y = i17;
        this.f153610z = i18;
        this.A = z14;
        this.B = num4;
        this.C = z15;
        this.D = bVar;
        this.E = hVar2;
    }
}
