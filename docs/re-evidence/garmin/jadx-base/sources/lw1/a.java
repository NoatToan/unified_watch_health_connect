package lw1;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Llw1/a;", "", "", "isLoading", "isError", "isDataLoaded", "Lnw1/d;", "startDestination", "", "completedPlanCount", "", "Llw1/g;", "supportedPlanSportTypes", "Lkw1/h;", "selectedPlanSportType", "Lfg0/k;", "primaryEvent", "primaryEventRequiresGCPlus", "trainForPrimaryEvent", "isGCPlusActive", "showGCPlusRequiredBanner", "<init>", "(ZZZLnw1/d;ILjava/util/List;Lkw1/h;Lfg0/k;ZZZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f115077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nw1.d f115078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f115079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<g> f115080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kw1.h f115081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fg0.k f115082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f115083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f115084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f115085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f115086l;

    public a(boolean z14, boolean z15, boolean z16, nw1.d dVar, int i14, List list, kw1.h hVar, fg0.k kVar, boolean z17, boolean z18, boolean z19, boolean z24, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? false : z16, (i15 & 8) != 0 ? null : dVar, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? j0.f134944a : list, (i15 & 64) != 0 ? null : hVar, (i15 & 128) == 0 ? kVar : null, (i15 & 256) != 0 ? false : z17, (i15 & 512) != 0 ? false : z18, (i15 & 1024) != 0 ? false : z19, (i15 & 2048) != 0 ? false : z24);
    }

    public static a a(a aVar, boolean z14, boolean z15, boolean z16, nw1.d dVar, int i14, List list, kw1.h hVar, fg0.k kVar, boolean z17, boolean z18, boolean z19, boolean z24, int i15) {
        if ((i15 & 1) != 0) {
            z14 = aVar.f115075a;
        }
        boolean z25 = z14;
        if ((i15 & 2) != 0) {
            z15 = aVar.f115076b;
        }
        boolean z26 = z15;
        boolean z27 = (i15 & 4) != 0 ? aVar.f115077c : z16;
        nw1.d dVar2 = (i15 & 8) != 0 ? aVar.f115078d : dVar;
        int i16 = (i15 & 16) != 0 ? aVar.f115079e : i14;
        List list2 = (i15 & 32) != 0 ? aVar.f115080f : list;
        kw1.h hVar2 = (i15 & 64) != 0 ? aVar.f115081g : hVar;
        fg0.k kVar2 = (i15 & 128) != 0 ? aVar.f115082h : kVar;
        boolean z28 = (i15 & 256) != 0 ? aVar.f115083i : z17;
        boolean z29 = (i15 & 512) != 0 ? aVar.f115084j : z18;
        boolean z34 = (i15 & 1024) != 0 ? aVar.f115085k : z19;
        boolean z35 = (i15 & 2048) != 0 ? aVar.f115086l : z24;
        aVar.getClass();
        list2.getClass();
        return new a(z25, z26, z27, dVar2, i16, list2, hVar2, kVar2, z28, z29, z34, z35);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f115075a == aVar.f115075a && this.f115076b == aVar.f115076b && this.f115077c == aVar.f115077c && s.g(this.f115078d, aVar.f115078d) && this.f115079e == aVar.f115079e && s.g(this.f115080f, aVar.f115080f) && this.f115081g == aVar.f115081g && s.g(this.f115082h, aVar.f115082h) && this.f115083i == aVar.f115083i && this.f115084j == aVar.f115084j && this.f115085k == aVar.f115085k && this.f115086l == aVar.f115086l;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Boolean.hashCode(this.f115075a) * 31, 31, this.f115076b), 31, this.f115077c);
        nw1.d dVar = this.f115078d;
        int iB = u0.b(q2.d(this.f115079e, (iG + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31, this.f115080f);
        kw1.h hVar = this.f115081g;
        int iHashCode = (iB + (hVar == null ? 0 : hVar.hashCode())) * 31;
        fg0.k kVar = this.f115082h;
        return Boolean.hashCode(this.f115086l) + q6.f.g(q6.f.g(q6.f.g((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31, 31, this.f115083i), 31, this.f115084j), 31, this.f115085k);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("FindPlanUIState(isLoading=", ", isError=", ", isDataLoaded=", this.f115075a, this.f115076b);
        sbM.append(this.f115077c);
        sbM.append(", startDestination=");
        sbM.append(this.f115078d);
        sbM.append(", completedPlanCount=");
        sbM.append(this.f115079e);
        sbM.append(", supportedPlanSportTypes=");
        sbM.append(this.f115080f);
        sbM.append(", selectedPlanSportType=");
        sbM.append(this.f115081g);
        sbM.append(", primaryEvent=");
        sbM.append(this.f115082h);
        sbM.append(", primaryEventRequiresGCPlus=");
        kg.f.q(", trainForPrimaryEvent=", ", isGCPlusActive=", sbM, this.f115083i, this.f115084j);
        return com.airbnb.lottie.animation.keyframe.a.f(", showGCPlusRequiredBanner=", ")", sbM, this.f115085k, this.f115086l);
    }

    public a(boolean z14, boolean z15, boolean z16, nw1.d dVar, int i14, List<g> list, kw1.h hVar, fg0.k kVar, boolean z17, boolean z18, boolean z19, boolean z24) {
        list.getClass();
        this.f115075a = z14;
        this.f115076b = z15;
        this.f115077c = z16;
        this.f115078d = dVar;
        this.f115079e = i14;
        this.f115080f = list;
        this.f115081g = hVar;
        this.f115082h = kVar;
        this.f115083i = z17;
        this.f115084j = z18;
        this.f115085k = z19;
        this.f115086l = z24;
    }

    public a() {
        this(false, false, false, null, 0, null, null, null, false, false, false, false, 4095, null);
    }
}
