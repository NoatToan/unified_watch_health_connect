package i21;

import android.os.Parcelable;
import b21.l4;
import c22.g2;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.BuildConfig;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019\u0012\b\b\u0002\u0010 \u001a\u00020\u0019\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Li21/c;", "", "Li21/a;", "snackbarState", "Lg21/d;", "caloriesOverlayData", "Lg21/t;", "selectedGoalsChartTab", "Lg21/x;", "selectedReportsChartTab", "", "goalsChartTabs", "reportsChartTabs", "Lg21/l;", "selectedMacroChartType", "macroChartTypes", "Lg21/r;", "selectedMicroChartType", "microChartTypes", "", "dailyMacroChartTitleResId", "weeklyMacroChartTitleResId", "Lc22/g2;", "dailyNutrientsTitleResId", "weeklyNutrientsTitleResId", "", "showPregnancyRecommendation", "showPostPregnancyReviewGoal", "Li21/x;", "whatsNewModal", "isLoading", "navigateToSetup", "navigateToNutritionHelp", "Lg21/j;", "navigateToMFPCaloriesHelp", "Lb21/l4;", "navigateToRoute", "<init>", "(Li21/a;Lg21/d;Lg21/t;Lg21/x;Ljava/util/List;Ljava/util/List;Lg21/l;Ljava/util/List;Lg21/r;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZLi21/x;ZZZLg21/j;Lb21/l4;Lkotlin/jvm/internal/j;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f87246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g21.d f87247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g21.t f87248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g21.x f87249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<g21.t> f87250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<g21.x> f87251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g21.l f87252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<g21.l> f87253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g21.r f87254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<g21.r> f87255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f87256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f87257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f87258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f87259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f87260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f87261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f87262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f87263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f87264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f87265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g21.j f87266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l4 f87267v;

    public c(a aVar, g21.d dVar, g21.t tVar, g21.x xVar, List list, List list2, g21.l lVar, List list3, g21.r rVar, List list4, Integer num, Integer num2, String str, String str2, boolean z14, boolean z15, x xVar2, boolean z16, boolean z17, boolean z18, g21.j jVar, l4 l4Var, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? g21.t.MACRONUTRIENTS : tVar, (i14 & 8) != 0 ? g21.x.MACROS : xVar, (i14 & 16) != 0 ? g21.t.f75497e : list, (i14 & 32) != 0 ? g21.x.f75533e : list2, (i14 & 64) != 0 ? g21.l.ALL : lVar, list3, (i14 & 256) != 0 ? null : rVar, (i14 & 512) != 0 ? null : list4, (i14 & 1024) != 0 ? Integer.valueOf(R.string.daily_macronutrients) : num, (i14 & 2048) != 0 ? Integer.valueOf(R.string.lbl_avg_daily_macronutrients) : num2, (i14 & 4096) != 0 ? null : str, (i14 & 8192) != 0 ? null : str2, (i14 & 16384) != 0 ? false : z14, (32768 & i14) != 0 ? false : z15, (65536 & i14) != 0 ? null : xVar2, (131072 & i14) != 0 ? false : z16, (262144 & i14) != 0 ? false : z17, (524288 & i14) != 0 ? false : z18, (1048576 & i14) != 0 ? null : jVar, (i14 & 2097152) != 0 ? null : l4Var, null);
    }

    public static c a(c cVar, a aVar, g21.d dVar, g21.t tVar, g21.x xVar, g21.l lVar, g21.r rVar, Integer num, Integer num2, String str, String str2, boolean z14, boolean z15, x xVar2, boolean z16, boolean z17, boolean z18, g21.j jVar, l4 l4Var, int i14) {
        a aVar2 = (i14 & 1) != 0 ? cVar.f87246a : aVar;
        g21.d dVar2 = (i14 & 2) != 0 ? cVar.f87247b : dVar;
        g21.t tVar2 = (i14 & 4) != 0 ? cVar.f87248c : tVar;
        g21.x xVar3 = (i14 & 8) != 0 ? cVar.f87249d : xVar;
        List<g21.t> list = cVar.f87250e;
        List<g21.x> list2 = cVar.f87251f;
        g21.l lVar2 = (i14 & 64) != 0 ? cVar.f87252g : lVar;
        List<g21.l> list3 = cVar.f87253h;
        g21.r rVar2 = (i14 & 256) != 0 ? cVar.f87254i : rVar;
        List<g21.r> list4 = cVar.f87255j;
        Integer num3 = (i14 & 1024) != 0 ? cVar.f87256k : num;
        Integer num4 = (i14 & 2048) != 0 ? cVar.f87257l : num2;
        String str3 = (i14 & 4096) != 0 ? cVar.f87258m : str;
        String str4 = (i14 & 8192) != 0 ? cVar.f87259n : str2;
        boolean z19 = (i14 & 16384) != 0 ? cVar.f87260o : z14;
        boolean z24 = (32768 & i14) != 0 ? cVar.f87261p : z15;
        x xVar4 = (65536 & i14) != 0 ? cVar.f87262q : xVar2;
        boolean z25 = (131072 & i14) != 0 ? cVar.f87263r : z16;
        boolean z26 = (262144 & i14) != 0 ? cVar.f87264s : z17;
        boolean z27 = (524288 & i14) != 0 ? cVar.f87265t : z18;
        g21.j jVar2 = (1048576 & i14) != 0 ? cVar.f87266u : jVar;
        l4 l4Var2 = (i14 & 2097152) != 0 ? cVar.f87267v : l4Var;
        cVar.getClass();
        tVar2.getClass();
        xVar3.getClass();
        list.getClass();
        list2.getClass();
        lVar2.getClass();
        list3.getClass();
        return new c(aVar2, dVar2, tVar2, xVar3, list, list2, lVar2, list3, rVar2, list4, num3, num4, str3, str4, z19, z24, xVar4, z25, z26, z27, jVar2, l4Var2, null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    public final boolean equals(Object obj) {
        boolean zG;
        boolean zG2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f87246a, cVar.f87246a) || !p005kotlin.jvm.internal.s.g(this.f87247b, cVar.f87247b) || this.f87248c != cVar.f87248c || this.f87249d != cVar.f87249d || !p005kotlin.jvm.internal.s.g(this.f87250e, cVar.f87250e) || !p005kotlin.jvm.internal.s.g(this.f87251f, cVar.f87251f) || this.f87252g != cVar.f87252g || !p005kotlin.jvm.internal.s.g(this.f87253h, cVar.f87253h) || this.f87254i != cVar.f87254i || !p005kotlin.jvm.internal.s.g(this.f87255j, cVar.f87255j) || !p005kotlin.jvm.internal.s.g(this.f87256k, cVar.f87256k) || !p005kotlin.jvm.internal.s.g(this.f87257l, cVar.f87257l)) {
            return false;
        }
        String str = cVar.f87258m;
        String str2 = this.f87258m;
        if (str2 == null) {
            if (str == null) {
                zG = true;
            } else {
                zG = false;
            }
        } else if (str == null) {
            zG = false;
        } else {
            Parcelable.Creator<g2> creator = g2.CREATOR;
            zG = p005kotlin.jvm.internal.s.g(str2, str);
        }
        if (!zG) {
            return false;
        }
        String str3 = cVar.f87259n;
        String str4 = this.f87259n;
        if (str4 == null) {
            if (str3 == null) {
                zG2 = true;
            } else {
                zG2 = false;
            }
        } else if (str3 == null) {
            zG2 = false;
        } else {
            Parcelable.Creator<g2> creator2 = g2.CREATOR;
            zG2 = p005kotlin.jvm.internal.s.g(str4, str3);
        }
        return zG2 && this.f87260o == cVar.f87260o && this.f87261p == cVar.f87261p && p005kotlin.jvm.internal.s.g(this.f87262q, cVar.f87262q) && this.f87263r == cVar.f87263r && this.f87264s == cVar.f87264s && this.f87265t == cVar.f87265t && p005kotlin.jvm.internal.s.g(this.f87266u, cVar.f87266u) && p005kotlin.jvm.internal.s.g(this.f87267v, cVar.f87267v);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        a aVar = this.f87246a;
        int iHashCode3 = (aVar == null ? 0 : aVar.hashCode()) * 31;
        g21.d dVar = this.f87247b;
        int iB = u0.b((this.f87252g.hashCode() + u0.b(u0.b((this.f87249d.hashCode() + ((this.f87248c.hashCode() + ((iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31)) * 31, 31, this.f87250e), 31, this.f87251f)) * 31, 31, this.f87253h);
        g21.r rVar = this.f87254i;
        int iHashCode4 = (iB + (rVar == null ? 0 : rVar.hashCode())) * 31;
        List<g21.r> list = this.f87255j;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f87256k;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f87257l;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f87258m;
        if (str == null) {
            iHashCode = 0;
        } else {
            Parcelable.Creator<g2> creator = g2.CREATOR;
            iHashCode = str.hashCode();
        }
        int i14 = (iHashCode7 + iHashCode) * 31;
        String str2 = this.f87259n;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            Parcelable.Creator<g2> creator2 = g2.CREATOR;
            iHashCode2 = str2.hashCode();
        }
        int iG = q6.f.g(q6.f.g((i14 + iHashCode2) * 31, 31, this.f87260o), 31, this.f87261p);
        x xVar = this.f87262q;
        int iG2 = q6.f.g(q6.f.g(q6.f.g((iG + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.f87263r), 31, this.f87264s), 31, this.f87265t);
        g21.j jVar = this.f87266u;
        int iHashCode8 = (iG2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        l4 l4Var = this.f87267v;
        return iHashCode8 + (l4Var != null ? l4Var.hashCode() : 0);
    }

    public final String toString() {
        String strG = BuildConfig.TRAVIS;
        String str = this.f87258m;
        String strG2 = str == null ? BuildConfig.TRAVIS : g2.g(str);
        String str2 = this.f87259n;
        if (str2 != null) {
            strG = g2.g(str2);
        }
        StringBuilder sb3 = new StringBuilder("NutritionReportsUiState(snackbarState=");
        sb3.append(this.f87246a);
        sb3.append(", caloriesOverlayData=");
        sb3.append(this.f87247b);
        sb3.append(", selectedGoalsChartTab=");
        sb3.append(this.f87248c);
        sb3.append(", selectedReportsChartTab=");
        sb3.append(this.f87249d);
        sb3.append(", goalsChartTabs=");
        n23.j.z(sb3, this.f87250e, ", reportsChartTabs=", this.f87251f, ", selectedMacroChartType=");
        sb3.append(this.f87252g);
        sb3.append(", macroChartTypes=");
        sb3.append(this.f87253h);
        sb3.append(", selectedMicroChartType=");
        sb3.append(this.f87254i);
        sb3.append(", microChartTypes=");
        sb3.append(this.f87255j);
        sb3.append(", dailyMacroChartTitleResId=");
        j20.x.m(sb3, this.f87256k, ", weeklyMacroChartTitleResId=", this.f87257l, ", dailyNutrientsTitleResId=");
        sn.a.t(sb3, strG2, ", weeklyNutrientsTitleResId=", strG, ", showPregnancyRecommendation=");
        kg.f.q(", showPostPregnancyReviewGoal=", ", whatsNewModal=", sb3, this.f87260o, this.f87261p);
        sb3.append(this.f87262q);
        sb3.append(", isLoading=");
        sb3.append(this.f87263r);
        sb3.append(", navigateToSetup=");
        kg.f.q(", navigateToNutritionHelp=", ", navigateToMFPCaloriesHelp=", sb3, this.f87264s, this.f87265t);
        sb3.append(this.f87266u);
        sb3.append(", navigateToRoute=");
        sb3.append(this.f87267v);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(a aVar, g21.d dVar, g21.t tVar, g21.x xVar, List<? extends g21.t> list, List<? extends g21.x> list2, g21.l lVar, List<? extends g21.l> list3, g21.r rVar, List<? extends g21.r> list4, Integer num, Integer num2, String str, String str2, boolean z14, boolean z15, x xVar2, boolean z16, boolean z17, boolean z18, g21.j jVar, l4 l4Var) {
        tVar.getClass();
        xVar.getClass();
        list.getClass();
        list2.getClass();
        lVar.getClass();
        list3.getClass();
        this.f87246a = aVar;
        this.f87247b = dVar;
        this.f87248c = tVar;
        this.f87249d = xVar;
        this.f87250e = list;
        this.f87251f = list2;
        this.f87252g = lVar;
        this.f87253h = list3;
        this.f87254i = rVar;
        this.f87255j = list4;
        this.f87256k = num;
        this.f87257l = num2;
        this.f87258m = str;
        this.f87259n = str2;
        this.f87260o = z14;
        this.f87261p = z15;
        this.f87262q = xVar2;
        this.f87263r = z16;
        this.f87264s = z17;
        this.f87265t = z18;
        this.f87266u = jVar;
        this.f87267v = l4Var;
    }

    public /* synthetic */ c(a aVar, g21.d dVar, g21.t tVar, g21.x xVar, List list, List list2, g21.l lVar, List list3, g21.r rVar, List list4, Integer num, Integer num2, String str, String str2, boolean z14, boolean z15, x xVar2, boolean z16, boolean z17, boolean z18, g21.j jVar, l4 l4Var, p005kotlin.jvm.internal.j jVar2) {
        this(aVar, dVar, tVar, xVar, list, list2, lVar, list3, rVar, list4, num, num2, str, str2, z14, z15, xVar2, z16, z17, z18, jVar, l4Var);
    }
}
