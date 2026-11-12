package s21;

import b21.l4;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010&\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0%\u0012\u0018\b\u0002\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0%\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020.\u0018\u00010%\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00104\u001a\u000203\u0012\b\b\u0002\u00105\u001a\u00020\u001c¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Ls21/a0;", "", "Lb21/l4;", "startDestination", "", "editExistingPlan", "Ls21/c0;", "revokeConsentBlocks", "shouldRecalculateRecommendations", "shouldRecalculateWeights", "Ls21/s;", "goalType", "", "gender", "Lb63/o;", "dateOfBirth", "", "heightInCm", "isUsingMetric", "", "weight", "weightGoal", "targetDate", "targetWeeklyWeightChangeInGrams", "Ls21/a;", "activityLevelOption", "Ll01/a;", "activityMultiplierType", "", "activeDailyCalories", "hasUserDefinedActiveCalories", "calorieGoal", "Ls21/e;", "macroGoals", "Ls21/o;", "micronutrientsSettings", "autoCalorieAdjustment", "Lo13/p;", "selectedCountry", "selectedLanguage", "isLoading", "isGenericError", "Ls21/y;", "savingError", "navigateAfterDisconnectingMFP", "navigateToReports", "Ll01/k;", "navigateToSettings", "Lb63/v;", "timelineStartTime", "timelineEndTime", "Ls21/c;", "selectedDailyViewType", "activeMealsCount", "<init>", "(Lb21/l4;Ljava/lang/Boolean;Ls21/c0;ZZLs21/s;Ljava/lang/String;Lb63/o;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Lb63/o;Ljava/lang/Float;Ls21/a;Ll01/a;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ls21/e;Ls21/o;Ljava/lang/Boolean;Lo13/p;Lo13/p;ZZLs21/y;ZZLo13/p;Lb63/v;Lb63/v;Ls21/c;I)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {
    public final y A;
    public final boolean B;
    public final boolean C;
    public final o13.p<Boolean, l01.k> D;
    public final b63.v E;
    public final b63.v F;
    public final c G;
    public final int H;
    public final o I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f156036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f156037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f156038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f156039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f156040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f156041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f156042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b63.o f156043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Float f156044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f156045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f156046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f156047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b63.o f156048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Float f156049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f156050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l01.a f156051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f156052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f156053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f156054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f156055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o f156056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Boolean f156057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o13.p<String, String> f156058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o13.p<String, String> f156059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f156060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f156061z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a0(l4 l4Var, Boolean bool, c0 c0Var, boolean z14, boolean z15, s sVar, String str, b63.o oVar, Float f14, Boolean bool2, Double d14, Double d15, b63.o oVar2, Float f15, a aVar, l01.a aVar2, Integer num, Boolean bool3, Integer num2, e eVar, o oVar3, Boolean bool4, o13.p pVar, o13.p pVar2, boolean z16, boolean z17, y yVar, boolean z18, boolean z19, o13.p pVar3, b63.v vVar, b63.v vVar2, c cVar, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        b63.v vVar3;
        o13.p pVar4;
        l4 l4Var2 = (i15 & 1) != 0 ? null : l4Var;
        Boolean bool5 = (i15 & 2) != 0 ? Boolean.FALSE : bool;
        c0 c0Var2 = (i15 & 4) != 0 ? null : c0Var;
        boolean z24 = (i15 & 8) != 0 ? false : z14;
        boolean z25 = (i15 & 16) != 0 ? false : z15;
        s sVar2 = (i15 & 32) != 0 ? s.NO_GOAL : sVar;
        String str2 = (i15 & 64) != 0 ? null : str;
        b63.o oVar4 = (i15 & 128) != 0 ? null : oVar;
        Float f16 = (i15 & 256) != 0 ? null : f14;
        Boolean bool6 = (i15 & 512) != 0 ? null : bool2;
        Double d16 = (i15 & 1024) != 0 ? null : d14;
        Double d17 = (i15 & 2048) != 0 ? null : d15;
        b63.o oVar5 = (i15 & 4096) != 0 ? null : oVar2;
        Float f17 = (i15 & 8192) != 0 ? null : f15;
        a aVar3 = (i15 & 16384) != 0 ? null : aVar;
        l01.a aVar4 = (i15 & 32768) != 0 ? null : aVar2;
        Integer num3 = (i15 & 65536) != 0 ? null : num;
        Boolean bool7 = (i15 & 131072) != 0 ? Boolean.FALSE : bool3;
        Integer num4 = (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : num2;
        e eVar2 = (i15 & 524288) != 0 ? null : eVar;
        o oVar6 = (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : oVar3;
        Boolean bool8 = (i15 & 2097152) != 0 ? null : bool4;
        if ((i15 & 4194304) != 0) {
            vVar3 = null;
            pVar4 = new o13.p(null, null);
        } else {
            vVar3 = null;
            pVar4 = pVar;
        }
        this(l4Var2, bool5, c0Var2, z24, z25, sVar2, str2, oVar4, f16, bool6, d16, d17, oVar5, f17, aVar3, aVar4, num3, bool7, num4, eVar2, oVar6, bool8, pVar4, (i15 & 8388608) != 0 ? new o13.p(vVar3, vVar3) : pVar2, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z16, (i15 & 33554432) != 0 ? false : z17, (i15 & 67108864) != 0 ? vVar3 : yVar, (i15 & 134217728) != 0 ? false : z18, (i15 & 268435456) != 0 ? false : z19, (i15 & 536870912) != 0 ? vVar3 : pVar3, (i15 & 1073741824) != 0 ? vVar3 : vVar, (i15 & Integer.MIN_VALUE) == 0 ? vVar2 : vVar3, (i16 & 1) != 0 ? c.TIMELINE : cVar, (i16 & 2) != 0 ? 0 : i14);
    }

    public static a0 a(a0 a0Var, l4 l4Var, c0 c0Var, boolean z14, boolean z15, s sVar, String str, b63.o oVar, Float f14, Boolean bool, Double d14, Double d15, b63.o oVar2, Float f15, a aVar, l01.a aVar2, Integer num, Boolean bool2, Integer num2, e eVar, o oVar3, Boolean bool3, o13.p pVar, o13.p pVar2, boolean z16, boolean z17, y yVar, boolean z18, boolean z19, o13.p pVar3, b63.v vVar, b63.v vVar2, c cVar, int i14, int i15, int i16) {
        Boolean bool4 = Boolean.TRUE;
        l4 l4Var2 = (i15 & 1) != 0 ? a0Var.f156036a : l4Var;
        if ((i15 & 2) != 0) {
            bool4 = a0Var.f156037b;
        }
        c0 c0Var2 = (i15 & 4) != 0 ? a0Var.f156038c : c0Var;
        boolean z24 = (i15 & 8) != 0 ? a0Var.f156039d : z14;
        boolean z25 = (i15 & 16) != 0 ? a0Var.f156040e : z15;
        s sVar2 = (i15 & 32) != 0 ? a0Var.f156041f : sVar;
        String str2 = (i15 & 64) != 0 ? a0Var.f156042g : str;
        b63.o oVar4 = (i15 & 128) != 0 ? a0Var.f156043h : oVar;
        Float f16 = (i15 & 256) != 0 ? a0Var.f156044i : f14;
        Boolean bool5 = (i15 & 512) != 0 ? a0Var.f156045j : bool;
        Double d16 = (i15 & 1024) != 0 ? a0Var.f156046k : d14;
        Double d17 = (i15 & 2048) != 0 ? a0Var.f156047l : d15;
        b63.o oVar5 = (i15 & 4096) != 0 ? a0Var.f156048m : oVar2;
        Float f17 = (i15 & 8192) != 0 ? a0Var.f156049n : f15;
        Boolean bool6 = bool4;
        a aVar3 = (i15 & 16384) != 0 ? a0Var.f156050o : aVar;
        l01.a aVar4 = (i15 & 32768) != 0 ? a0Var.f156051p : aVar2;
        Integer num3 = (i15 & 65536) != 0 ? a0Var.f156052q : num;
        Boolean bool7 = (i15 & 131072) != 0 ? a0Var.f156053r : bool2;
        Integer num4 = (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? a0Var.f156054s : num2;
        e eVar2 = (i15 & 524288) != 0 ? a0Var.f156055t : eVar;
        o oVar6 = (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? a0Var.f156056u : oVar3;
        Boolean bool8 = (i15 & 2097152) != 0 ? a0Var.f156057v : bool3;
        o13.p pVar4 = (i15 & 4194304) != 0 ? a0Var.f156058w : pVar;
        o13.p pVar5 = (i15 & 8388608) != 0 ? a0Var.f156059x : pVar2;
        boolean z26 = (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? a0Var.f156060y : z16;
        boolean z27 = (i15 & 33554432) != 0 ? a0Var.f156061z : z17;
        y yVar2 = (i15 & 67108864) != 0 ? a0Var.A : yVar;
        boolean z28 = (i15 & 134217728) != 0 ? a0Var.B : z18;
        boolean z29 = (i15 & 268435456) != 0 ? a0Var.C : z19;
        o13.p pVar6 = (i15 & 536870912) != 0 ? a0Var.D : pVar3;
        b63.v vVar3 = (i15 & 1073741824) != 0 ? a0Var.E : vVar;
        b63.v vVar4 = (i15 & Integer.MIN_VALUE) != 0 ? a0Var.F : vVar2;
        c cVar2 = (i16 & 1) != 0 ? a0Var.G : cVar;
        int i17 = (i16 & 2) != 0 ? a0Var.H : i14;
        a0Var.getClass();
        sVar2.getClass();
        pVar4.getClass();
        pVar5.getClass();
        cVar2.getClass();
        return new a0(l4Var2, bool6, c0Var2, z24, z25, sVar2, str2, oVar4, f16, bool5, d16, d17, oVar5, f17, aVar3, aVar4, num3, bool7, num4, eVar2, oVar6, bool8, pVar4, pVar5, z26, z27, yVar2, z28, z29, pVar6, vVar3, vVar4, cVar2, i17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f156036a, a0Var.f156036a) && p005kotlin.jvm.internal.s.g(this.f156037b, a0Var.f156037b) && p005kotlin.jvm.internal.s.g(this.f156038c, a0Var.f156038c) && this.f156039d == a0Var.f156039d && this.f156040e == a0Var.f156040e && this.f156041f == a0Var.f156041f && p005kotlin.jvm.internal.s.g(this.f156042g, a0Var.f156042g) && p005kotlin.jvm.internal.s.g(this.f156043h, a0Var.f156043h) && p005kotlin.jvm.internal.s.g(this.f156044i, a0Var.f156044i) && p005kotlin.jvm.internal.s.g(this.f156045j, a0Var.f156045j) && p005kotlin.jvm.internal.s.g(this.f156046k, a0Var.f156046k) && p005kotlin.jvm.internal.s.g(this.f156047l, a0Var.f156047l) && p005kotlin.jvm.internal.s.g(this.f156048m, a0Var.f156048m) && p005kotlin.jvm.internal.s.g(this.f156049n, a0Var.f156049n) && this.f156050o == a0Var.f156050o && this.f156051p == a0Var.f156051p && p005kotlin.jvm.internal.s.g(this.f156052q, a0Var.f156052q) && p005kotlin.jvm.internal.s.g(this.f156053r, a0Var.f156053r) && p005kotlin.jvm.internal.s.g(this.f156054s, a0Var.f156054s) && p005kotlin.jvm.internal.s.g(this.f156055t, a0Var.f156055t) && p005kotlin.jvm.internal.s.g(this.f156056u, a0Var.f156056u) && p005kotlin.jvm.internal.s.g(this.f156057v, a0Var.f156057v) && p005kotlin.jvm.internal.s.g(this.f156058w, a0Var.f156058w) && p005kotlin.jvm.internal.s.g(this.f156059x, a0Var.f156059x) && this.f156060y == a0Var.f156060y && this.f156061z == a0Var.f156061z && this.A == a0Var.A && this.B == a0Var.B && this.C == a0Var.C && p005kotlin.jvm.internal.s.g(this.D, a0Var.D) && p005kotlin.jvm.internal.s.g(this.E, a0Var.E) && p005kotlin.jvm.internal.s.g(this.F, a0Var.F) && this.G == a0Var.G && this.H == a0Var.H;
    }

    public final int hashCode() {
        l4 l4Var = this.f156036a;
        int iHashCode = (l4Var == null ? 0 : l4Var.hashCode()) * 31;
        Boolean bool = this.f156037b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        c0 c0Var = this.f156038c;
        int iHashCode3 = (this.f156041f.hashCode() + q6.f.g(q6.f.g((iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31, this.f156039d), 31, this.f156040e)) * 31;
        String str = this.f156042g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        b63.o oVar = this.f156043h;
        int iHashCode5 = (iHashCode4 + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        Float f14 = this.f156044i;
        int iHashCode6 = (iHashCode5 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Boolean bool2 = this.f156045j;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d14 = this.f156046k;
        int iHashCode8 = (iHashCode7 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f156047l;
        int iHashCode9 = (iHashCode8 + (d15 == null ? 0 : d15.hashCode())) * 31;
        b63.o oVar2 = this.f156048m;
        int iHashCode10 = (iHashCode9 + (oVar2 == null ? 0 : oVar2.f16206a.hashCode())) * 31;
        Float f15 = this.f156049n;
        int iHashCode11 = (iHashCode10 + (f15 == null ? 0 : f15.hashCode())) * 31;
        a aVar = this.f156050o;
        int iHashCode12 = (iHashCode11 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        l01.a aVar2 = this.f156051p;
        int iHashCode13 = (iHashCode12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Integer num = this.f156052q;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.f156053r;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.f156054s;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        e eVar = this.f156055t;
        int iHashCode17 = (iHashCode16 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        o oVar3 = this.f156056u;
        int iHashCode18 = (iHashCode17 + (oVar3 == null ? 0 : oVar3.hashCode())) * 31;
        Boolean bool4 = this.f156057v;
        int iG = q6.f.g(q6.f.g((this.f156059x.hashCode() + ((this.f156058w.hashCode() + ((iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31)) * 31)) * 31, 31, this.f156060y), 31, this.f156061z);
        y yVar = this.A;
        int iG2 = q6.f.g(q6.f.g((iG + (yVar == null ? 0 : yVar.hashCode())) * 31, 31, this.B), 31, this.C);
        o13.p<Boolean, l01.k> pVar = this.D;
        int iHashCode19 = (iG2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        b63.v vVar = this.E;
        int iHashCode20 = (iHashCode19 + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        b63.v vVar2 = this.F;
        return Integer.hashCode(this.H) + ((this.G.hashCode() + ((iHashCode20 + (vVar2 != null ? vVar2.f16219a.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionSetupUiModel(startDestination=");
        sb3.append(this.f156036a);
        sb3.append(", editExistingPlan=");
        sb3.append(this.f156037b);
        sb3.append(", revokeConsentBlocks=");
        sb3.append(this.f156038c);
        sb3.append(", shouldRecalculateRecommendations=");
        sb3.append(this.f156039d);
        sb3.append(", shouldRecalculateWeights=");
        sb3.append(this.f156040e);
        sb3.append(", goalType=");
        sb3.append(this.f156041f);
        sb3.append(", gender=");
        sb3.append(this.f156042g);
        sb3.append(", dateOfBirth=");
        sb3.append(this.f156043h);
        sb3.append(", heightInCm=");
        sb3.append(this.f156044i);
        sb3.append(", isUsingMetric=");
        sb3.append(this.f156045j);
        sb3.append(", weight=");
        b71.i.p(this.f156046k, this.f156047l, ", weightGoal=", ", targetDate=", sb3);
        sb3.append(this.f156048m);
        sb3.append(", targetWeeklyWeightChangeInGrams=");
        sb3.append(this.f156049n);
        sb3.append(", activityLevelOption=");
        sb3.append(this.f156050o);
        sb3.append(", activityMultiplierType=");
        sb3.append(this.f156051p);
        sb3.append(", activeDailyCalories=");
        kg.f.r(sb3, this.f156052q, ", hasUserDefinedActiveCalories=", this.f156053r, ", calorieGoal=");
        sb3.append(this.f156054s);
        sb3.append(", macroGoals=");
        sb3.append(this.f156055t);
        sb3.append(", micronutrientsSettings=");
        sb3.append(this.f156056u);
        sb3.append(", autoCalorieAdjustment=");
        sb3.append(this.f156057v);
        sb3.append(", selectedCountry=");
        sb3.append(this.f156058w);
        sb3.append(", selectedLanguage=");
        sb3.append(this.f156059x);
        sb3.append(", isLoading=");
        kg.f.q(", isGenericError=", ", savingError=", sb3, this.f156060y, this.f156061z);
        sb3.append(this.A);
        sb3.append(", navigateAfterDisconnectingMFP=");
        sb3.append(this.B);
        sb3.append(", navigateToReports=");
        sb3.append(this.C);
        sb3.append(", navigateToSettings=");
        sb3.append(this.D);
        sb3.append(", timelineStartTime=");
        sb3.append(this.E);
        sb3.append(", timelineEndTime=");
        sb3.append(this.F);
        sb3.append(", selectedDailyViewType=");
        sb3.append(this.G);
        sb3.append(", activeMealsCount=");
        sb3.append(this.H);
        sb3.append(")");
        return sb3.toString();
    }

    public a0(l4 l4Var, Boolean bool, c0 c0Var, boolean z14, boolean z15, s sVar, String str, b63.o oVar, Float f14, Boolean bool2, Double d14, Double d15, b63.o oVar2, Float f15, a aVar, l01.a aVar2, Integer num, Boolean bool3, Integer num2, e eVar, o oVar3, Boolean bool4, o13.p<String, String> pVar, o13.p<String, String> pVar2, boolean z16, boolean z17, y yVar, boolean z18, boolean z19, o13.p<Boolean, l01.k> pVar3, b63.v vVar, b63.v vVar2, c cVar, int i14) {
        sVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        cVar.getClass();
        this.f156036a = l4Var;
        this.f156037b = bool;
        this.f156038c = c0Var;
        this.f156039d = z14;
        this.f156040e = z15;
        this.f156041f = sVar;
        this.f156042g = str;
        this.f156043h = oVar;
        this.f156044i = f14;
        this.f156045j = bool2;
        this.f156046k = d14;
        this.f156047l = d15;
        this.f156048m = oVar2;
        this.f156049n = f15;
        this.f156050o = aVar;
        this.f156051p = aVar2;
        this.f156052q = num;
        this.f156053r = bool3;
        this.f156054s = num2;
        this.f156055t = eVar;
        this.f156056u = oVar3;
        this.f156057v = bool4;
        this.f156058w = pVar;
        this.f156059x = pVar2;
        this.f156060y = z16;
        this.f156061z = z17;
        this.A = yVar;
        this.B = z18;
        this.C = z19;
        this.D = pVar3;
        this.E = vVar;
        this.F = vVar2;
        this.G = cVar;
        this.H = i14;
        this.I = oVar3 != null ? o72.t.c0(oVar3) : null;
    }

    public a0() {
        this(null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -1, 3, null);
    }
}
