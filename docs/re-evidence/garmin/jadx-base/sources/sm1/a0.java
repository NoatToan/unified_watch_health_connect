package sm1;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lsm1/a0;", "", "", "isLoading", "isEditSleepAvailable", "Lo82/g;", "selectedIntervalType", "Lb63/o;", "selectedDate", "Len1/c;", "selectedTab", "", "selectedSegment", "Lrl1/i;", "selectedOverlay", "hasInitialSelectedOverlay", "showSkinTempOnboarding", "showBreathingVariationsOnboarding", "showSkinTempTooltip", "showSleepFactorsTooltip", "respirationVersion", "isPerformanceDevice", "Lrn1/k;", "selectedReportsTab", "showWhatsNewInSleepCoach", "showWhatsNewInSleep", "Lcom/garmin/android/apps/connectmobile/sleep/presentation/c;", "scrollTarget", "<init>", "(ZZLo82/g;Lb63/o;Len1/c;ILrl1/i;ZZZZZLjava/lang/Integer;ZLrn1/k;ZZLcom/garmin/android/apps/connectmobile/sleep/presentation/c;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f160085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f160086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o82.g f160087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.o f160088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final en1.c f160089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f160090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rl1.i f160091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f160092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f160093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f160094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f160095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f160096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f160097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f160098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final rn1.k f160099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f160100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f160101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.sleep.presentation.c f160102r;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a0(boolean z14, boolean z15, o82.g gVar, b63.o oVar, en1.c cVar, int i14, rl1.i iVar, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, Integer num, boolean z25, rn1.k kVar, boolean z26, boolean z27, com.garmin.android.apps.connectmobile.sleep.presentation.c cVar2, int i15, p005kotlin.jvm.internal.j jVar) {
        b63.o oVarF;
        boolean z28 = (i15 & 1) != 0 ? false : z14;
        boolean z29 = (i15 & 2) != 0 ? false : z15;
        o82.g gVar2 = (i15 & 4) != 0 ? o82.g.f130850c : gVar;
        if ((i15 & 8) != 0) {
            b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
            b63.z.INSTANCE.getClass();
            oVarF = b63.b.f(c0229a, b63.z.Companion.a());
        } else {
            oVarF = oVar;
        }
        this(z28, z29, gVar2, oVarF, (i15 & 16) != 0 ? en1.c.SCORE : cVar, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? null : iVar, (i15 & 128) != 0 ? false : z16, (i15 & 256) != 0 ? false : z17, (i15 & 512) != 0 ? false : z18, (i15 & 1024) != 0 ? false : z19, (i15 & 2048) != 0 ? false : z24, (i15 & 4096) != 0 ? null : num, (i15 & 8192) != 0 ? false : z25, (i15 & 16384) != 0 ? rn1.k.CONSISTENCY : kVar, (i15 & 32768) != 0 ? false : z26, (i15 & 65536) != 0 ? false : z27, (i15 & 131072) != 0 ? null : cVar2);
    }

    public static a0 a(a0 a0Var, boolean z14, boolean z15, o82.g gVar, b63.o oVar, en1.c cVar, int i14, rl1.i iVar, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, Integer num, boolean z25, rn1.k kVar, com.garmin.android.apps.connectmobile.sleep.presentation.c cVar2, int i15) {
        boolean z26 = (i15 & 1) != 0 ? a0Var.f160085a : z14;
        boolean z27 = (i15 & 2) != 0 ? a0Var.f160086b : z15;
        o82.g gVar2 = (i15 & 4) != 0 ? a0Var.f160087c : gVar;
        b63.o oVar2 = (i15 & 8) != 0 ? a0Var.f160088d : oVar;
        en1.c cVar3 = (i15 & 16) != 0 ? a0Var.f160089e : cVar;
        int i16 = (i15 & 32) != 0 ? a0Var.f160090f : i14;
        rl1.i iVar2 = (i15 & 64) != 0 ? a0Var.f160091g : iVar;
        boolean z28 = (i15 & 128) != 0 ? a0Var.f160092h : z16;
        boolean z29 = (i15 & 256) != 0 ? a0Var.f160093i : z17;
        boolean z34 = (i15 & 512) != 0 ? a0Var.f160094j : z18;
        boolean z35 = (i15 & 1024) != 0 ? a0Var.f160095k : z19;
        boolean z36 = (i15 & 2048) != 0 ? a0Var.f160096l : z24;
        Integer num2 = (i15 & 4096) != 0 ? a0Var.f160097m : num;
        boolean z37 = (i15 & 8192) != 0 ? a0Var.f160098n : z25;
        rn1.k kVar2 = (i15 & 16384) != 0 ? a0Var.f160099o : kVar;
        boolean z38 = a0Var.f160100p;
        boolean z39 = a0Var.f160101q;
        com.garmin.android.apps.connectmobile.sleep.presentation.c cVar4 = (i15 & 131072) != 0 ? a0Var.f160102r : cVar2;
        a0Var.getClass();
        gVar2.getClass();
        oVar2.getClass();
        cVar3.getClass();
        kVar2.getClass();
        return new a0(z26, z27, gVar2, oVar2, cVar3, i16, iVar2, z28, z29, z34, z35, z36, num2, z37, kVar2, z38, z39, cVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f160085a == a0Var.f160085a && this.f160086b == a0Var.f160086b && this.f160087c == a0Var.f160087c && p005kotlin.jvm.internal.s.g(this.f160088d, a0Var.f160088d) && this.f160089e == a0Var.f160089e && this.f160090f == a0Var.f160090f && this.f160091g == a0Var.f160091g && this.f160092h == a0Var.f160092h && this.f160093i == a0Var.f160093i && this.f160094j == a0Var.f160094j && this.f160095k == a0Var.f160095k && this.f160096l == a0Var.f160096l && p005kotlin.jvm.internal.s.g(this.f160097m, a0Var.f160097m) && this.f160098n == a0Var.f160098n && this.f160099o == a0Var.f160099o && this.f160100p == a0Var.f160100p && this.f160101q == a0Var.f160101q && this.f160102r == a0Var.f160102r;
    }

    public final int hashCode() {
        int iD = q2.d(this.f160090f, (this.f160089e.hashCode() + n23.j.a(this.f160088d.f16206a, q6.f.i(this.f160087c, q6.f.g(Boolean.hashCode(this.f160085a) * 31, 31, this.f160086b), 31), 31)) * 31, 31);
        rl1.i iVar = this.f160091g;
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iD + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f160092h), 31, this.f160093i), 31, this.f160094j), 31, this.f160095k), 31, this.f160096l);
        Integer num = this.f160097m;
        int iG2 = q6.f.g(q6.f.g((this.f160099o.hashCode() + q6.f.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.f160098n)) * 31, 31, this.f160100p), 31, this.f160101q);
        com.garmin.android.apps.connectmobile.sleep.presentation.c cVar = this.f160102r;
        return iG2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SleepUiState(isLoading=", ", isEditSleepAvailable=", ", selectedIntervalType=", this.f160085a, this.f160086b);
        sbM.append(this.f160087c);
        sbM.append(", selectedDate=");
        sbM.append(this.f160088d);
        sbM.append(", selectedTab=");
        sbM.append(this.f160089e);
        sbM.append(", selectedSegment=");
        sbM.append(this.f160090f);
        sbM.append(", selectedOverlay=");
        sbM.append(this.f160091g);
        sbM.append(", hasInitialSelectedOverlay=");
        sbM.append(this.f160092h);
        sbM.append(", showSkinTempOnboarding=");
        kg.f.q(", showBreathingVariationsOnboarding=", ", showSkinTempTooltip=", sbM, this.f160093i, this.f160094j);
        kg.f.q(", showSleepFactorsTooltip=", ", respirationVersion=", sbM, this.f160095k, this.f160096l);
        sbM.append(this.f160097m);
        sbM.append(", isPerformanceDevice=");
        sbM.append(this.f160098n);
        sbM.append(", selectedReportsTab=");
        sbM.append(this.f160099o);
        sbM.append(", showWhatsNewInSleepCoach=");
        sbM.append(this.f160100p);
        sbM.append(", showWhatsNewInSleep=");
        sbM.append(this.f160101q);
        sbM.append(", scrollTarget=");
        sbM.append(this.f160102r);
        sbM.append(")");
        return sbM.toString();
    }

    public a0(boolean z14, boolean z15, o82.g gVar, b63.o oVar, en1.c cVar, int i14, rl1.i iVar, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, Integer num, boolean z25, rn1.k kVar, boolean z26, boolean z27, com.garmin.android.apps.connectmobile.sleep.presentation.c cVar2) {
        gVar.getClass();
        oVar.getClass();
        cVar.getClass();
        kVar.getClass();
        this.f160085a = z14;
        this.f160086b = z15;
        this.f160087c = gVar;
        this.f160088d = oVar;
        this.f160089e = cVar;
        this.f160090f = i14;
        this.f160091g = iVar;
        this.f160092h = z16;
        this.f160093i = z17;
        this.f160094j = z18;
        this.f160095k = z19;
        this.f160096l = z24;
        this.f160097m = num;
        this.f160098n = z25;
        this.f160099o = kVar;
        this.f160100p = z26;
        this.f160101q = z27;
        this.f160102r = cVar2;
    }

    public a0() {
        this(false, false, null, null, null, 0, null, false, false, false, false, false, null, false, null, false, false, null, 262143, null);
    }
}
