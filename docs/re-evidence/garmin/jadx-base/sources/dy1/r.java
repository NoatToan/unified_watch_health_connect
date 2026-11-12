package dy1;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.flexbox.FlexItem;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001d\u0018\u00010\"\u0012\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001d\u0018\u00010\"¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Ldy1/r;", "", "", "planTitle", "Lmx1/f;", "planType", "planMessage", "planInsight", "", "currentWeek", "totalDurationInWeeks", "trainingPhase", "trainingPhaseDescription", "trainingPhaseMessage", "", "isPhaseInfoAvailable", "isGoalAchieved", "isHelpAvailable", "isRemovePlanAvailable", "isRestartPlanAvailable", "isSkipDeloadWeekAvailable", "isSkipAndCompletePlanAvailable", "Ldy1/f;", "benchmarksDashboardState", "Ldy1/m;", "rounds", "Ldy1/t;", "workoutSchedule", "Lkotlin/Function0;", "", "Lcom/garmin/android/apps/connectmobile/training/stp/presentation/composables/ButtonClicked;", "onRemoveClicked", "onQuitClicked", "onHelpClicked", "Lkotlin/Function1;", "Li/c;", "onSkipDeloadWeekClicked", "onRestartPlanClicked", "<init>", "(Ljava/lang/String;Lmx1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLdy1/f;Ldy1/m;Ldy1/t;Le23/a;Le23/a;Le23/a;Le23/l;Le23/l;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx1.f f61610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f61612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f61613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f61614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f61617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f61618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f61619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f61620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f61621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f61622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f61623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f61624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f61625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f61626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f61627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e23.a<Unit> f61628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e23.a<Unit> f61629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e23.a<Unit> f61630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e23.l<i.c, Unit> f61631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e23.l<i.c, Unit> f61632x;

    public /* synthetic */ r(String str, mx1.f fVar, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, f fVar2, m mVar, t tVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar, e23.l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : fVar, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? 0 : num2, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? false : z14, (i14 & 1024) != 0 ? false : z15, (i14 & 2048) != 0 ? false : z16, (i14 & 4096) != 0 ? false : z17, (i14 & 8192) != 0 ? false : z18, (i14 & 16384) != 0 ? false : z19, (i14 & 32768) != 0 ? false : z24, (i14 & 65536) != 0 ? null : fVar2, (i14 & 131072) != 0 ? null : mVar, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : tVar, (i14 & 524288) != 0 ? null : aVar, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : aVar2, (i14 & 2097152) != 0 ? null : aVar3, (i14 & 4194304) != 0 ? null : lVar, (i14 & 8388608) != 0 ? null : lVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f61609a, rVar.f61609a) && p005kotlin.jvm.internal.s.g(this.f61610b, rVar.f61610b) && p005kotlin.jvm.internal.s.g(this.f61611c, rVar.f61611c) && p005kotlin.jvm.internal.s.g(this.f61612d, rVar.f61612d) && p005kotlin.jvm.internal.s.g(this.f61613e, rVar.f61613e) && p005kotlin.jvm.internal.s.g(this.f61614f, rVar.f61614f) && p005kotlin.jvm.internal.s.g(this.f61615g, rVar.f61615g) && p005kotlin.jvm.internal.s.g(this.f61616h, rVar.f61616h) && p005kotlin.jvm.internal.s.g(this.f61617i, rVar.f61617i) && this.f61618j == rVar.f61618j && this.f61619k == rVar.f61619k && this.f61620l == rVar.f61620l && this.f61621m == rVar.f61621m && this.f61622n == rVar.f61622n && this.f61623o == rVar.f61623o && this.f61624p == rVar.f61624p && p005kotlin.jvm.internal.s.g(this.f61625q, rVar.f61625q) && p005kotlin.jvm.internal.s.g(this.f61626r, rVar.f61626r) && p005kotlin.jvm.internal.s.g(this.f61627s, rVar.f61627s) && p005kotlin.jvm.internal.s.g(this.f61628t, rVar.f61628t) && p005kotlin.jvm.internal.s.g(this.f61629u, rVar.f61629u) && p005kotlin.jvm.internal.s.g(this.f61630v, rVar.f61630v) && p005kotlin.jvm.internal.s.g(this.f61631w, rVar.f61631w) && p005kotlin.jvm.internal.s.g(this.f61632x, rVar.f61632x);
    }

    public final int hashCode() {
        String str = this.f61609a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        mx1.f fVar = this.f61610b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str2 = this.f61611c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61612d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f61613e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f61614f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f61615g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f61616h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f61617i;
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f61618j), 31, this.f61619k), 31, this.f61620l), 31, this.f61621m), 31, this.f61622n), 31, this.f61623o), 31, this.f61624p);
        f fVar2 = this.f61625q;
        int iHashCode9 = (iG + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        m mVar = this.f61626r;
        int iHashCode10 = (iHashCode9 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        t tVar = this.f61627s;
        int iHashCode11 = (iHashCode10 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        e23.a<Unit> aVar = this.f61628t;
        int iHashCode12 = (iHashCode11 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e23.a<Unit> aVar2 = this.f61629u;
        int iHashCode13 = (iHashCode12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        e23.a<Unit> aVar3 = this.f61630v;
        int iHashCode14 = (iHashCode13 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        e23.l<i.c, Unit> lVar = this.f61631w;
        int iHashCode15 = (iHashCode14 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        e23.l<i.c, Unit> lVar2 = this.f61632x;
        return iHashCode15 + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingPlanDashboardState(planTitle=");
        sb3.append(this.f61609a);
        sb3.append(", planType=");
        sb3.append(this.f61610b);
        sb3.append(", planMessage=");
        sn.a.t(sb3, this.f61611c, ", planInsight=", this.f61612d, ", currentWeek=");
        x.m(sb3, this.f61613e, ", totalDurationInWeeks=", this.f61614f, ", trainingPhase=");
        sn.a.t(sb3, this.f61615g, ", trainingPhaseDescription=", this.f61616h, ", trainingPhaseMessage=");
        v.h.C(this.f61617i, ", isPhaseInfoAvailable=", ", isGoalAchieved=", sb3, this.f61618j);
        kg.f.q(", isHelpAvailable=", ", isRemovePlanAvailable=", sb3, this.f61619k, this.f61620l);
        kg.f.q(", isRestartPlanAvailable=", ", isSkipDeloadWeekAvailable=", sb3, this.f61621m, this.f61622n);
        kg.f.q(", isSkipAndCompletePlanAvailable=", ", benchmarksDashboardState=", sb3, this.f61623o, this.f61624p);
        sb3.append(this.f61625q);
        sb3.append(", rounds=");
        sb3.append(this.f61626r);
        sb3.append(", workoutSchedule=");
        sb3.append(this.f61627s);
        sb3.append(", onRemoveClicked=");
        sb3.append(this.f61628t);
        sb3.append(", onQuitClicked=");
        sb3.append(this.f61629u);
        sb3.append(", onHelpClicked=");
        sb3.append(this.f61630v);
        sb3.append(", onSkipDeloadWeekClicked=");
        sb3.append(this.f61631w);
        sb3.append(", onRestartPlanClicked=");
        sb3.append(this.f61632x);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(String str, mx1.f fVar, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, f fVar2, m mVar, t tVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super i.c, Unit> lVar, e23.l<? super i.c, Unit> lVar2) {
        this.f61609a = str;
        this.f61610b = fVar;
        this.f61611c = str2;
        this.f61612d = str3;
        this.f61613e = num;
        this.f61614f = num2;
        this.f61615g = str4;
        this.f61616h = str5;
        this.f61617i = str6;
        this.f61618j = z14;
        this.f61619k = z15;
        this.f61620l = z16;
        this.f61621m = z17;
        this.f61622n = z18;
        this.f61623o = z19;
        this.f61624p = z24;
        this.f61625q = fVar2;
        this.f61626r = mVar;
        this.f61627s = tVar;
        this.f61628t = aVar;
        this.f61629u = aVar2;
        this.f61630v = aVar3;
        this.f61631w = lVar;
        this.f61632x = lVar2;
    }

    public r() {
        this(null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, FlexItem.MAX_SIZE, null);
    }
}
