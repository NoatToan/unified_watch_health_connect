package z10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lz10/s1;", "", "", "isLoading", "navigateToSpecificConsent", "shouldDisplayStravaEntry", "shouldDisplayAiEntry", "", "Lcom/garmin/android/apps/connectmobile/consent/d;", "Lkotlin/Function0;", "", "dataConsents", "", "Lq92/x;", "incompleteConsents", "<init>", "(ZZZZLjava/util/Map;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f201239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f201242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<com.garmin.android.apps.connectmobile.consent.d, e23.a<Unit>> f201243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<q92.x> f201244f;

    /* JADX WARN: Illegal instructions before constructor call */
    public s1(boolean z14, boolean z15, boolean z16, boolean z17, Map map, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? true : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        z16 = (i14 & 4) != 0 ? false : z16;
        z17 = (i14 & 8) != 0 ? false : z17;
        if ((i14 & 16) != 0) {
            map = p13.k0.f134949a;
            map.getClass();
        }
        this(z14, z15, z16, z17, map, (i14 & 32) != 0 ? p13.j0.f134944a : list);
    }

    public static s1 a(s1 s1Var, boolean z14, boolean z15, boolean z16, boolean z17, TreeMap treeMap, ArrayList arrayList, int i14) {
        if ((i14 & 1) != 0) {
            z14 = s1Var.f201239a;
        }
        boolean z18 = z14;
        if ((i14 & 2) != 0) {
            z15 = s1Var.f201240b;
        }
        boolean z19 = z15;
        if ((i14 & 4) != 0) {
            z16 = s1Var.f201241c;
        }
        boolean z24 = z16;
        if ((i14 & 8) != 0) {
            z17 = s1Var.f201242d;
        }
        boolean z25 = z17;
        Map<com.garmin.android.apps.connectmobile.consent.d, e23.a<Unit>> map = treeMap;
        if ((i14 & 16) != 0) {
            map = s1Var.f201243e;
        }
        Map<com.garmin.android.apps.connectmobile.consent.d, e23.a<Unit>> map2 = map;
        List<q92.x> list = arrayList;
        if ((i14 & 32) != 0) {
            list = s1Var.f201244f;
        }
        List<q92.x> list2 = list;
        s1Var.getClass();
        map2.getClass();
        list2.getClass();
        return new s1(z18, z19, z24, z25, map2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.f201239a == s1Var.f201239a && this.f201240b == s1Var.f201240b && this.f201241c == s1Var.f201241c && this.f201242d == s1Var.f201242d && p005kotlin.jvm.internal.s.g(this.f201243e, s1Var.f201243e) && p005kotlin.jvm.internal.s.g(this.f201244f, s1Var.f201244f);
    }

    public final int hashCode() {
        return this.f201244f.hashCode() + am.j.b(this.f201243e, q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f201239a) * 31, 31, this.f201240b), 31, this.f201241c), 31, this.f201242d), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("DataConsentUiState(isLoading=", ", navigateToSpecificConsent=", ", shouldDisplayStravaEntry=", this.f201239a, this.f201240b);
        kg.f.q(", shouldDisplayAiEntry=", ", dataConsents=", sbM, this.f201241c, this.f201242d);
        sbM.append(this.f201243e);
        sbM.append(", incompleteConsents=");
        sbM.append(this.f201244f);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s1(boolean z14, boolean z15, boolean z16, boolean z17, Map<com.garmin.android.apps.connectmobile.consent.d, ? extends e23.a<Unit>> map, List<? extends q92.x> list) {
        map.getClass();
        list.getClass();
        this.f201239a = z14;
        this.f201240b = z15;
        this.f201241c = z16;
        this.f201242d = z17;
        this.f201243e = map;
        this.f201244f = list;
    }

    public s1() {
        this(false, false, false, false, null, null, 63, null);
    }
}
