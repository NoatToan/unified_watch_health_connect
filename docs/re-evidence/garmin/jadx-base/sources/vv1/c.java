package vv1;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import fg0.k;
import j61.i;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import vt1.o;
import yw1.m;
import yw1.p;
import yw1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B«\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\u0018\b\u0002\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0012\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00106\u001a\u00020\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u00108\u001a\u00020\u0002¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lvv1/c;", "", "", "isLoading", "isUsingMetric", "", "planName", "Lorg/joda/time/LocalDate;", "planStartDate", "planEndDateOrCurrentDate", "dateRangeString", "Luv1/b;", "inProgressOrCompleted", "Luv1/c;", "eventOrOpenLoop", "isError", "Lvt1/o;", "trainingType", "", "Luv1/d;", "screenConfig", "Luv1/a;", "achievementsConfig", "", "Lpu1/c;", "", "uniqueActivities", "Lvv1/e;", "trainingLoad", "Lyw1/b;", "runningStats", "cyclingStats", "swimmingStats", "Lyw1/m;", "fitnessStats", "Lyw1/p;", "frogStats", "Lyw1/u;", "strengthPerformanceStats", "Lvv1/a;", "achievements", "showContinueTraining", "Lfg0/k;", "eventDTO", "Lvv1/d;", "racePredictorDTO", "Lj61/i;", "cyclingAbilityDTO", "Lk61/b;", "cyclingAbilitySummary", "Lj61/d;", "courseDemandsDTO", "Lir0/e;", "intensityMinutesSummary", "showWeeklyReportForIntensityMinutesChart", "currentOrLongWalkingStreak", "showMotivationMessage", "<init>", "(Ljava/lang/Boolean;ZLjava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/String;Luv1/b;Luv1/c;Ljava/lang/String;Lvt1/o;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lvv1/e;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lyw1/u;Lvv1/a;ZLfg0/k;Lvv1/d;Lj61/i;Lk61/b;Lj61/d;Lir0/e;ZLjava/lang/Integer;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {
    public final j61.d A;
    public final ir0.e B;
    public final boolean C;
    public final Integer D;
    public final boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f180508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDate f180511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LocalDate f180512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f180513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uv1.b f180514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uv1.c f180515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f180516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f180517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<uv1.d> f180518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<uv1.a> f180519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<pu1.c, Integer> f180520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f180521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<yw1.b> f180522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<yw1.b> f180523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<yw1.b> f180524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<m> f180525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<p> f180526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f180527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f180528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f180529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f180530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f180531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f180532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k61.b f180533z;

    public /* synthetic */ c(Boolean bool, boolean z14, String str, LocalDate localDate, LocalDate localDate2, String str2, uv1.b bVar, uv1.c cVar, String str3, o oVar, List list, List list2, Map map, e eVar, List list3, List list4, List list5, List list6, List list7, u uVar, a aVar, boolean z15, k kVar, d dVar, i iVar, k61.b bVar2, j61.d dVar2, ir0.e eVar2, boolean z16, Integer num, boolean z17, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : localDate, (i14 & 16) != 0 ? null : localDate2, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : bVar, (i14 & 128) != 0 ? null : cVar, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : oVar, (i14 & 1024) != 0 ? null : list, (i14 & 2048) != 0 ? null : list2, (i14 & 4096) != 0 ? null : map, (i14 & 8192) != 0 ? null : eVar, (i14 & 16384) != 0 ? null : list3, (i14 & 32768) != 0 ? null : list4, (i14 & 65536) != 0 ? null : list5, (i14 & 131072) != 0 ? null : list6, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : list7, (i14 & 524288) != 0 ? null : uVar, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : aVar, (i14 & 2097152) != 0 ? false : z15, (i14 & 4194304) != 0 ? null : kVar, (i14 & 8388608) != 0 ? null : dVar, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : iVar, (i14 & 33554432) != 0 ? null : bVar2, (i14 & 67108864) != 0 ? null : dVar2, (i14 & 134217728) != 0 ? null : eVar2, (i14 & 268435456) != 0 ? false : z16, (i14 & 536870912) != 0 ? null : num, (i14 & 1073741824) != 0 ? false : z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f180508a, cVar.f180508a) && this.f180509b == cVar.f180509b && s.g(this.f180510c, cVar.f180510c) && s.g(this.f180511d, cVar.f180511d) && s.g(this.f180512e, cVar.f180512e) && s.g(this.f180513f, cVar.f180513f) && this.f180514g == cVar.f180514g && this.f180515h == cVar.f180515h && s.g(this.f180516i, cVar.f180516i) && this.f180517j == cVar.f180517j && s.g(this.f180518k, cVar.f180518k) && s.g(this.f180519l, cVar.f180519l) && s.g(this.f180520m, cVar.f180520m) && s.g(this.f180521n, cVar.f180521n) && s.g(this.f180522o, cVar.f180522o) && s.g(this.f180523p, cVar.f180523p) && s.g(this.f180524q, cVar.f180524q) && s.g(this.f180525r, cVar.f180525r) && s.g(this.f180526s, cVar.f180526s) && s.g(this.f180527t, cVar.f180527t) && s.g(this.f180528u, cVar.f180528u) && this.f180529v == cVar.f180529v && s.g(this.f180530w, cVar.f180530w) && s.g(this.f180531x, cVar.f180531x) && s.g(this.f180532y, cVar.f180532y) && s.g(this.f180533z, cVar.f180533z) && s.g(this.A, cVar.A) && s.g(this.B, cVar.B) && this.C == cVar.C && s.g(this.D, cVar.D) && this.E == cVar.E;
    }

    public final int hashCode() {
        Boolean bool = this.f180508a;
        int iG = f.g((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f180509b);
        String str = this.f180510c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.f180511d;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f180512e;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str2 = this.f180513f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        uv1.b bVar = this.f180514g;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        uv1.c cVar = this.f180515h;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.f180516i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        o oVar = this.f180517j;
        int iHashCode8 = (iHashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        List<uv1.d> list = this.f180518k;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<uv1.a> list2 = this.f180519l;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<pu1.c, Integer> map = this.f180520m;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        e eVar = this.f180521n;
        int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<yw1.b> list3 = this.f180522o;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<yw1.b> list4 = this.f180523p;
        int iHashCode14 = (iHashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<yw1.b> list5 = this.f180524q;
        int iHashCode15 = (iHashCode14 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<m> list6 = this.f180525r;
        int iHashCode16 = (iHashCode15 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<p> list7 = this.f180526s;
        int iHashCode17 = (iHashCode16 + (list7 == null ? 0 : list7.hashCode())) * 31;
        u uVar = this.f180527t;
        int iHashCode18 = (iHashCode17 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        a aVar = this.f180528u;
        int iG2 = f.g((iHashCode18 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f180529v);
        k kVar = this.f180530w;
        int iHashCode19 = (iG2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        d dVar = this.f180531x;
        int iHashCode20 = (iHashCode19 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.f180532y;
        int iHashCode21 = (iHashCode20 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k61.b bVar2 = this.f180533z;
        int iHashCode22 = (iHashCode21 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        j61.d dVar2 = this.A;
        int iHashCode23 = (iHashCode22 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        ir0.e eVar2 = this.B;
        int iG3 = f.g((iHashCode23 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31, 31, this.C);
        Integer num = this.D;
        return Boolean.hashCode(this.E) + ((iG3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTProgressReportUIModel(isLoading=");
        sb3.append(this.f180508a);
        sb3.append(", isUsingMetric=");
        sb3.append(this.f180509b);
        sb3.append(", planName=");
        sb3.append(this.f180510c);
        sb3.append(", planStartDate=");
        sb3.append(this.f180511d);
        sb3.append(", planEndDateOrCurrentDate=");
        sb3.append(this.f180512e);
        sb3.append(", dateRangeString=");
        sb3.append(this.f180513f);
        sb3.append(", inProgressOrCompleted=");
        sb3.append(this.f180514g);
        sb3.append(", eventOrOpenLoop=");
        sb3.append(this.f180515h);
        sb3.append(", isError=");
        sb3.append(this.f180516i);
        sb3.append(", trainingType=");
        sb3.append(this.f180517j);
        sb3.append(", screenConfig=");
        n23.j.z(sb3, this.f180518k, ", achievementsConfig=", this.f180519l, ", uniqueActivities=");
        sb3.append(this.f180520m);
        sb3.append(", trainingLoad=");
        sb3.append(this.f180521n);
        sb3.append(", runningStats=");
        n23.j.z(sb3, this.f180522o, ", cyclingStats=", this.f180523p, ", swimmingStats=");
        n23.j.z(sb3, this.f180524q, ", fitnessStats=", this.f180525r, ", frogStats=");
        sb3.append(this.f180526s);
        sb3.append(", strengthPerformanceStats=");
        sb3.append(this.f180527t);
        sb3.append(", achievements=");
        sb3.append(this.f180528u);
        sb3.append(", showContinueTraining=");
        sb3.append(this.f180529v);
        sb3.append(", eventDTO=");
        sb3.append(this.f180530w);
        sb3.append(", racePredictorDTO=");
        sb3.append(this.f180531x);
        sb3.append(", cyclingAbilityDTO=");
        sb3.append(this.f180532y);
        sb3.append(", cyclingAbilitySummary=");
        sb3.append(this.f180533z);
        sb3.append(", courseDemandsDTO=");
        sb3.append(this.A);
        sb3.append(", intensityMinutesSummary=");
        sb3.append(this.B);
        sb3.append(", showWeeklyReportForIntensityMinutesChart=");
        sb3.append(this.C);
        sb3.append(", currentOrLongWalkingStreak=");
        sb3.append(this.D);
        sb3.append(", showMotivationMessage=");
        return hb.a.k(sb3, this.E, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Boolean bool, boolean z14, String str, LocalDate localDate, LocalDate localDate2, String str2, uv1.b bVar, uv1.c cVar, String str3, o oVar, List<? extends uv1.d> list, List<? extends uv1.a> list2, Map<pu1.c, Integer> map, e eVar, List<? extends yw1.b> list3, List<? extends yw1.b> list4, List<? extends yw1.b> list5, List<? extends m> list6, List<? extends p> list7, u uVar, a aVar, boolean z15, k kVar, d dVar, i iVar, k61.b bVar2, j61.d dVar2, ir0.e eVar2, boolean z16, Integer num, boolean z17) {
        this.f180508a = bool;
        this.f180509b = z14;
        this.f180510c = str;
        this.f180511d = localDate;
        this.f180512e = localDate2;
        this.f180513f = str2;
        this.f180514g = bVar;
        this.f180515h = cVar;
        this.f180516i = str3;
        this.f180517j = oVar;
        this.f180518k = list;
        this.f180519l = list2;
        this.f180520m = map;
        this.f180521n = eVar;
        this.f180522o = list3;
        this.f180523p = list4;
        this.f180524q = list5;
        this.f180525r = list6;
        this.f180526s = list7;
        this.f180527t = uVar;
        this.f180528u = aVar;
        this.f180529v = z15;
        this.f180530w = kVar;
        this.f180531x = dVar;
        this.f180532y = iVar;
        this.f180533z = bVar2;
        this.A = dVar2;
        this.B = eVar2;
        this.C = z16;
        this.D = num;
        this.E = z17;
    }

    public c() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, Integer.MAX_VALUE, null);
    }
}
