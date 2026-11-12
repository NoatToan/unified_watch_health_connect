package m21;

import com.garmin.proto.generated.GDIInReachMessaging;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;
import p13.t0;
import p13.y;
import yc.l2;
import yc.v2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0018\u0012\"\b\u0002\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010\u001a0\u0018\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lm21/e;", "", "", "searchQuery", "", "isShowingSearchResults", "isLoading", "Lf01/j;", "selectedSortOption", "Lm21/b;", "mode", "Lm21/d;", "snackbarState", "showIngredientsLimitReached", "Li53/c;", "Lm21/c;", "moreMenuOptions", "Lk21/a;", "tabs", "selectedTab", "", "suggestions", "suggestionsIsLoading", "showSuggestions", "", "triggerRefresh", "Lr53/i;", "Lyc/v2;", "Lg01/n;", "foodPagingSources", "isTimelineView", "Lb11/l;", "mealList", "selectedMealWindow", "Lb11/k;", "currentMealSelection", "showVoiceRecording", "<init>", "(Ljava/lang/String;ZZLf01/j;Lm21/b;Lm21/d;ZLi53/c;Li53/c;Lk21/a;Ljava/util/List;ZZLjava/util/Map;Ljava/util/Map;ZLjava/util/List;Lb11/l;Lb11/k;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f01.j f116087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f116088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f116089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f116090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<c> f116091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.c<k21.a> f116092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k21.a f116093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<String> f116094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f116095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f116096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<k21.a, Boolean> f116097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map<k21.a, r53.i<v2<g01.n>>> f116098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f116099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<b11.l> f116100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b11.l f116101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b11.k f116102s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f116103t;

    public e(String str, boolean z14, boolean z15, f01.j jVar, b bVar, d dVar, boolean z16, i53.c cVar, i53.c cVar2, k21.a aVar, List list, boolean z17, boolean z18, Map map, Map map2, boolean z19, List list2, b11.l lVar, b11.k kVar, boolean z24, int i14, p005kotlin.jvm.internal.j jVar2) {
        Map linkedHashMap;
        Map linkedHashMap2;
        String str2 = (i14 & 1) != 0 ? "" : str;
        boolean z25 = (i14 & 2) != 0 ? false : z14;
        boolean z26 = (i14 & 4) != 0 ? false : z15;
        f01.j jVar3 = (i14 & 8) != 0 ? f01.j.DEFAULT : jVar;
        d dVar2 = (i14 & 32) != 0 ? null : dVar;
        boolean z27 = (i14 & 64) != 0 ? false : z16;
        i53.c cVarB = (i14 & 128) != 0 ? j53.l.b() : cVar;
        k21.a aVar2 = (i14 & 512) != 0 ? k21.a.ALL : aVar;
        List list3 = (i14 & 1024) != 0 ? j0.f134944a : list;
        boolean z28 = (i14 & 2048) != 0 ? false : z17;
        boolean z29 = (i14 & 4096) != 0 ? false : z18;
        if ((i14 & 8192) != 0) {
            int iA = t0.a(y.r(cVar2, 10));
            linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (Object obj : cVar2) {
                linkedHashMap.put(obj, Boolean.FALSE);
                str2 = str2;
            }
        } else {
            linkedHashMap = map;
        }
        String str3 = str2;
        if ((i14 & 16384) != 0) {
            int iA2 = t0.a(y.r(cVar2, 10));
            linkedHashMap2 = new LinkedHashMap(iA2 < 16 ? 16 : iA2);
            for (Object obj2 : cVar2) {
                linkedHashMap2.put(obj2, null);
            }
        } else {
            linkedHashMap2 = map2;
        }
        this(str3, z25, z26, jVar3, bVar, dVar2, z27, cVarB, cVar2, aVar2, list3, z28, z29, linkedHashMap, linkedHashMap2, (i14 & 32768) != 0 ? false : z19, (i14 & 65536) != 0 ? j0.f134944a : list2, (i14 & 131072) != 0 ? null : lVar, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : kVar, (i14 & 524288) != 0 ? false : z24);
    }

    public static e a(e eVar, String str, boolean z14, boolean z15, f01.j jVar, d dVar, boolean z16, k21.a aVar, List list, boolean z17, boolean z18, Map map, Map map2, boolean z19, ArrayList arrayList, b11.l lVar, b11.k kVar, int i14) {
        String str2 = (i14 & 1) != 0 ? eVar.f116084a : str;
        boolean z24 = (i14 & 2) != 0 ? eVar.f116085b : z14;
        boolean z25 = (i14 & 4) != 0 ? eVar.f116086c : z15;
        f01.j jVar2 = (i14 & 8) != 0 ? eVar.f116087d : jVar;
        b bVar = eVar.f116088e;
        d dVar2 = (i14 & 32) != 0 ? eVar.f116089f : dVar;
        boolean z26 = (i14 & 64) != 0 ? eVar.f116090g : z16;
        i53.c<c> cVar = eVar.f116091h;
        i53.c<k21.a> cVar2 = eVar.f116092i;
        k21.a aVar2 = (i14 & 512) != 0 ? eVar.f116093j : aVar;
        List list2 = (i14 & 1024) != 0 ? eVar.f116094k : list;
        boolean z27 = (i14 & 2048) != 0 ? eVar.f116095l : z17;
        boolean z28 = (i14 & 4096) != 0 ? eVar.f116096m : z18;
        Map map3 = (i14 & 8192) != 0 ? eVar.f116097n : map;
        Map map4 = (i14 & 16384) != 0 ? eVar.f116098o : map2;
        boolean z29 = (32768 & i14) != 0 ? eVar.f116099p : z19;
        List<b11.l> list3 = (65536 & i14) != 0 ? eVar.f116100q : arrayList;
        b11.l lVar2 = (131072 & i14) != 0 ? eVar.f116101r : lVar;
        b11.k kVar2 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? eVar.f116102s : kVar;
        boolean z34 = eVar.f116103t;
        eVar.getClass();
        str2.getClass();
        jVar2.getClass();
        bVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        aVar2.getClass();
        list2.getClass();
        map3.getClass();
        map4.getClass();
        list3.getClass();
        return new e(str2, z24, z25, jVar2, bVar, dVar2, z26, cVar, cVar2, aVar2, list2, z27, z28, map3, map4, z29, list3, lVar2, kVar2, z34);
    }

    public final boolean b() {
        return !this.f116099p && (this.f116088e instanceof b.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f116084a, eVar.f116084a) && this.f116085b == eVar.f116085b && this.f116086c == eVar.f116086c && this.f116087d == eVar.f116087d && p005kotlin.jvm.internal.s.g(this.f116088e, eVar.f116088e) && p005kotlin.jvm.internal.s.g(this.f116089f, eVar.f116089f) && this.f116090g == eVar.f116090g && p005kotlin.jvm.internal.s.g(this.f116091h, eVar.f116091h) && p005kotlin.jvm.internal.s.g(this.f116092i, eVar.f116092i) && this.f116093j == eVar.f116093j && p005kotlin.jvm.internal.s.g(this.f116094k, eVar.f116094k) && this.f116095l == eVar.f116095l && this.f116096m == eVar.f116096m && p005kotlin.jvm.internal.s.g(this.f116097n, eVar.f116097n) && p005kotlin.jvm.internal.s.g(this.f116098o, eVar.f116098o) && this.f116099p == eVar.f116099p && p005kotlin.jvm.internal.s.g(this.f116100q, eVar.f116100q) && p005kotlin.jvm.internal.s.g(this.f116101r, eVar.f116101r) && p005kotlin.jvm.internal.s.g(this.f116102s, eVar.f116102s) && this.f116103t == eVar.f116103t;
    }

    public final int hashCode() {
        int iHashCode = (this.f116088e.hashCode() + ((this.f116087d.hashCode() + q6.f.g(q6.f.g(this.f116084a.hashCode() * 31, 31, this.f116085b), 31, this.f116086c)) * 31)) * 31;
        d dVar = this.f116089f;
        int iB = u0.b(q6.f.g(am.j.b(this.f116098o, am.j.b(this.f116097n, q6.f.g(q6.f.g(u0.b((this.f116093j.hashCode() + l2.a(this.f116092i, l2.a(this.f116091h, q6.f.g((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f116090g), 31), 31)) * 31, 31, this.f116094k), 31, this.f116095l), 31, this.f116096m), 31), 31), 31, this.f116099p), 31, this.f116100q);
        b11.l lVar = this.f116101r;
        int iHashCode2 = (iB + (lVar == null ? 0 : lVar.hashCode())) * 31;
        b11.k kVar = this.f116102s;
        return Boolean.hashCode(this.f116103t) + ((iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbD = zl.a.d("FoodSearchUiState(searchQuery=", this.f116084a, ", isShowingSearchResults=", this.f116085b, ", isLoading=");
        sbD.append(this.f116086c);
        sbD.append(", selectedSortOption=");
        sbD.append(this.f116087d);
        sbD.append(", mode=");
        sbD.append(this.f116088e);
        sbD.append(", snackbarState=");
        sbD.append(this.f116089f);
        sbD.append(", showIngredientsLimitReached=");
        sbD.append(this.f116090g);
        sbD.append(", moreMenuOptions=");
        sbD.append(this.f116091h);
        sbD.append(", tabs=");
        sbD.append(this.f116092i);
        sbD.append(", selectedTab=");
        sbD.append(this.f116093j);
        sbD.append(", suggestions=");
        sbD.append(this.f116094k);
        sbD.append(", suggestionsIsLoading=");
        sbD.append(this.f116095l);
        sbD.append(", showSuggestions=");
        sbD.append(this.f116096m);
        sbD.append(", triggerRefresh=");
        sbD.append(this.f116097n);
        sbD.append(", foodPagingSources=");
        sbD.append(this.f116098o);
        sbD.append(", isTimelineView=");
        sbD.append(this.f116099p);
        sbD.append(", mealList=");
        sbD.append(this.f116100q);
        sbD.append(", selectedMealWindow=");
        sbD.append(this.f116101r);
        sbD.append(", currentMealSelection=");
        sbD.append(this.f116102s);
        sbD.append(", showVoiceRecording=");
        sbD.append(this.f116103t);
        sbD.append(")");
        return sbD.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, boolean z14, boolean z15, f01.j jVar, b bVar, d dVar, boolean z16, i53.c<? extends c> cVar, i53.c<? extends k21.a> cVar2, k21.a aVar, List<String> list, boolean z17, boolean z18, Map<k21.a, Boolean> map, Map<k21.a, ? extends r53.i<v2<g01.n>>> map2, boolean z19, List<b11.l> list2, b11.l lVar, b11.k kVar, boolean z24) {
        str.getClass();
        jVar.getClass();
        bVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        aVar.getClass();
        list.getClass();
        map.getClass();
        map2.getClass();
        list2.getClass();
        this.f116084a = str;
        this.f116085b = z14;
        this.f116086c = z15;
        this.f116087d = jVar;
        this.f116088e = bVar;
        this.f116089f = dVar;
        this.f116090g = z16;
        this.f116091h = cVar;
        this.f116092i = cVar2;
        this.f116093j = aVar;
        this.f116094k = list;
        this.f116095l = z17;
        this.f116096m = z18;
        this.f116097n = map;
        this.f116098o = map2;
        this.f116099p = z19;
        this.f116100q = list2;
        this.f116101r = lVar;
        this.f116102s = kVar;
        this.f116103t = z24;
    }
}
