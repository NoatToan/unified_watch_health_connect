package c80;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b!\u0010\"B!\b\u0016\u0012\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010#¢\u0006\u0004\b!\u0010%¨\u0006&"}, d2 = {"Lc80/n0;", "", "", "", "types", "", "hasGCPlusSubscription", "hasPairedDevice", "activityTypes", "excludedActivityTypes", "isManualActivity", "isOwnedActivity", "locationDismissedToday", "usageIndicators", "", "garminCoachPlanSubTypes", "hasRecent3DCapableActivity", "hasSetupNutrition", "isNutritionSetup", "isNutritionInTabBar", "isIntegratedWithMFP", "loggedToMFPInLast90Days", "hasViewedHealthStatus", "hasRecentIndexScale1WeighIn", "Lc80/h0;", "autoDismissType", "Lc80/g0;", "autoDismissParams", "hasFollowings", "", "minLiveActivityVersion", "allCoachPlansRequireGCPlus", "isPrimaryWearableScreenless", "<init>", "(Ljava/util/Set;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lc80/h0;Lc80/g0;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "conditions", "(Ljava/util/Map;)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f25476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f25477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f25478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f25481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f25482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f25483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f25484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<String> f25485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f25486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f25487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f25488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f25489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Boolean f25490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f25491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f25492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f25493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h0 f25494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g0 f25495t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Boolean f25496u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f25497v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Boolean f25498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Boolean f25499x;

    /* JADX WARN: Code duplicated, block: B:121:0x0209  */
    /* JADX WARN: Code duplicated, block: B:122:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x022c  */
    /* JADX WARN: Code duplicated, block: B:130:0x022f  */
    /* JADX WARN: Code duplicated, block: B:131:0x023a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0241  */
    /* JADX WARN: Code duplicated, block: B:135:0x024c  */
    /* JADX WARN: Illegal instructions before constructor call */
    public n0(Map<String, String> map) {
        Object next;
        Set<String> set;
        Boolean bool;
        Boolean bool2;
        g0 g0Var;
        String str;
        Integer numI;
        String str2;
        String str3;
        String str4;
        String str5;
        Set<String> setKeySet;
        Set<String> set2 = (map == null || (setKeySet = map.keySet()) == null) ? p13.l0.f134950a : setKeySet;
        Boolean boolU = w3.x.u(map != null ? map.get(m0.f25440d.f25461a) : null);
        Boolean boolU2 = w3.x.u(map != null ? map.get(m0.f25441e.f25461a) : null);
        String str6 = map != null ? map.get(m0.f25442f.f25461a) : null;
        String str7 = map != null ? map.get(m0.f25443g.f25461a) : null;
        Boolean boolU3 = w3.x.u(map != null ? map.get(m0.f25445i.f25461a) : null);
        Boolean boolU4 = w3.x.u(map != null ? map.get(m0.f25446j.f25461a) : null);
        Boolean boolU5 = w3.x.u(map != null ? map.get(m0.f25447k.f25461a) : null);
        String str8 = map != null ? map.get(m0.f25444h.f25461a) : null;
        List listW = (map == null || (str5 = map.get(m0.f25448l.f25461a)) == null) ? null : d53.w.W(str5, new String[]{","});
        Boolean boolU6 = w3.x.u(map != null ? map.get(m0.f25449m.f25461a) : null);
        Boolean boolU7 = w3.x.u(map != null ? map.get(m0.f25450n.f25461a) : null);
        Boolean boolU8 = w3.x.u(map != null ? map.get(m0.f25451o.f25461a) : null);
        Boolean boolU9 = w3.x.u(map != null ? map.get(m0.f25452p.f25461a) : null);
        Boolean boolU10 = w3.x.u(map != null ? map.get(m0.f25453q.f25461a) : null);
        Boolean boolU11 = w3.x.u(map != null ? map.get(m0.f25454r.f25461a) : null);
        Boolean boolU12 = w3.x.u(map != null ? map.get(m0.f25455t.f25461a) : null);
        Boolean boolU13 = w3.x.u(map != null ? map.get(m0.f25456v.f25461a) : null);
        h0.a aVar = h0.f25379b;
        String str9 = map != null ? map.get(m0.f25458x.f25461a) : null;
        aVar.getClass();
        Iterator it = h0.f25382e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Iterator it3 = it;
            if (p005kotlin.jvm.internal.s.g(((h0) next).f25383a, str9)) {
                break;
            } else {
                it = it3;
            }
        }
        h0 h0Var = (h0) next;
        g0.a aVar2 = g0.f25374b;
        String str10 = map != null ? map.get(m0.f25457w.f25461a) : null;
        aVar2.getClass();
        if (str10 != null) {
            try {
                n63.b.a aVar3 = n63.b.f123892d;
                aVar3.getClass();
                set = set2;
                try {
                    bool = boolU;
                    try {
                        y1 y1Var = y1.f117048a;
                        String str11 = (String) ((Map) aVar3.c(new m63.q0(y1Var, y1Var), str10)).get("params");
                        if (str11 != null) {
                            bool2 = boolU2;
                            try {
                                List<Map> list = (List) aVar3.c(new m63.e(new m63.q0(y1Var, y1Var)), str11);
                                ArrayList arrayList = new ArrayList();
                                for (Map map2 : list) {
                                    e0.f25359c.getClass();
                                    e0 e0VarA = e0.a.a(map2);
                                    if (e0VarA != null) {
                                        arrayList.add(e0VarA);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    arrayList = null;
                                }
                                g0Var = arrayList == null ? null : new g0(arrayList);
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    bool = boolU;
                }
            } catch (Exception unused4) {
                set = set2;
            }
            if (map != null) {
                str = map.get(m0.f25459y.f25461a);
            } else {
                str = null;
            }
            Boolean boolU14 = w3.x.u(str);
            if (map != null || (str4 = map.get(m0.f25460z.f25461a)) == null) {
                numI = null;
            } else {
                numI = d53.t.i(str4);
            }
            if (map != null) {
                str2 = map.get(m0.A.f25461a);
            } else {
                str2 = null;
            }
            Boolean boolU15 = w3.x.u(str2);
            if (map != null) {
                str3 = map.get(m0.B.f25461a);
            } else {
                str3 = null;
            }
            this(set, bool, bool2, str6, str7, boolU3, boolU4, boolU5, str8, listW, boolU6, boolU7, boolU8, boolU9, boolU10, boolU11, boolU12, boolU13, h0Var, g0Var, boolU14, numI, boolU15, w3.x.u(str3));
        }
        set = set2;
        bool = boolU;
        bool2 = boolU2;
        if (map != null) {
            str = map.get(m0.f25459y.f25461a);
        } else {
            str = null;
        }
        Boolean boolU16 = w3.x.u(str);
        if (map != null) {
            numI = null;
        } else {
            numI = null;
        }
        if (map != null) {
            str2 = map.get(m0.A.f25461a);
        } else {
            str2 = null;
        }
        Boolean boolU17 = w3.x.u(str2);
        if (map != null) {
            str3 = map.get(m0.B.f25461a);
        } else {
            str3 = null;
        }
        this(set, bool, bool2, str6, str7, boolU3, boolU4, boolU5, str8, listW, boolU6, boolU7, boolU8, boolU9, boolU10, boolU11, boolU12, boolU13, h0Var, g0Var, boolU16, numI, boolU17, w3.x.u(str3));
    }

    public final Set<m0> a() {
        Set<String> set = this.f25476a;
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            m0.f25439c.getClass();
            m0 m0VarA = m0.a.a(str);
            if (m0VarA != null) {
                arrayList.add(m0VarA);
            }
        }
        return p13.h0.g1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p005kotlin.jvm.internal.s.g(this.f25476a, n0Var.f25476a) && p005kotlin.jvm.internal.s.g(this.f25477b, n0Var.f25477b) && p005kotlin.jvm.internal.s.g(this.f25478c, n0Var.f25478c) && p005kotlin.jvm.internal.s.g(this.f25479d, n0Var.f25479d) && p005kotlin.jvm.internal.s.g(this.f25480e, n0Var.f25480e) && p005kotlin.jvm.internal.s.g(this.f25481f, n0Var.f25481f) && p005kotlin.jvm.internal.s.g(this.f25482g, n0Var.f25482g) && p005kotlin.jvm.internal.s.g(this.f25483h, n0Var.f25483h) && p005kotlin.jvm.internal.s.g(this.f25484i, n0Var.f25484i) && p005kotlin.jvm.internal.s.g(this.f25485j, n0Var.f25485j) && p005kotlin.jvm.internal.s.g(this.f25486k, n0Var.f25486k) && p005kotlin.jvm.internal.s.g(this.f25487l, n0Var.f25487l) && p005kotlin.jvm.internal.s.g(this.f25488m, n0Var.f25488m) && p005kotlin.jvm.internal.s.g(this.f25489n, n0Var.f25489n) && p005kotlin.jvm.internal.s.g(this.f25490o, n0Var.f25490o) && p005kotlin.jvm.internal.s.g(this.f25491p, n0Var.f25491p) && p005kotlin.jvm.internal.s.g(this.f25492q, n0Var.f25492q) && p005kotlin.jvm.internal.s.g(this.f25493r, n0Var.f25493r) && this.f25494s == n0Var.f25494s && p005kotlin.jvm.internal.s.g(this.f25495t, n0Var.f25495t) && p005kotlin.jvm.internal.s.g(this.f25496u, n0Var.f25496u) && p005kotlin.jvm.internal.s.g(this.f25497v, n0Var.f25497v) && p005kotlin.jvm.internal.s.g(this.f25498w, n0Var.f25498w) && p005kotlin.jvm.internal.s.g(this.f25499x, n0Var.f25499x);
    }

    public final int hashCode() {
        int iHashCode = this.f25476a.hashCode() * 31;
        Boolean bool = this.f25477b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f25478c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f25479d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25480e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.f25481f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f25482g;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f25483h;
        int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str3 = this.f25484i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.f25485j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool6 = this.f25486k;
        int iHashCode11 = (iHashCode10 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f25487l;
        int iHashCode12 = (iHashCode11 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f25488m;
        int iHashCode13 = (iHashCode12 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f25489n;
        int iHashCode14 = (iHashCode13 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.f25490o;
        int iHashCode15 = (iHashCode14 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.f25491p;
        int iHashCode16 = (iHashCode15 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.f25492q;
        int iHashCode17 = (iHashCode16 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.f25493r;
        int iHashCode18 = (iHashCode17 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        h0 h0Var = this.f25494s;
        int iHashCode19 = (iHashCode18 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        g0 g0Var = this.f25495t;
        int iHashCode20 = (iHashCode19 + (g0Var == null ? 0 : g0Var.f25375a.hashCode())) * 31;
        Boolean bool14 = this.f25496u;
        int iHashCode21 = (iHashCode20 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Integer num = this.f25497v;
        int iHashCode22 = (iHashCode21 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool15 = this.f25498w;
        int iHashCode23 = (iHashCode22 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.f25499x;
        return iHashCode23 + (bool16 != null ? bool16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PromoConditions(types=");
        sb3.append(this.f25476a);
        sb3.append(", hasGCPlusSubscription=");
        sb3.append(this.f25477b);
        sb3.append(", hasPairedDevice=");
        b71.i.s(sb3, this.f25478c, ", activityTypes=", this.f25479d, ", excludedActivityTypes=");
        b71.i.w(sb3, this.f25480e, ", isManualActivity=", this.f25481f, ", isOwnedActivity=");
        b71.i.o(this.f25482g, this.f25483h, ", locationDismissedToday=", ", usageIndicators=", sb3);
        v.e0.o(this.f25484i, ", garminCoachPlanSubTypes=", ", hasRecent3DCapableActivity=", sb3, this.f25485j);
        b71.i.o(this.f25486k, this.f25487l, ", hasSetupNutrition=", ", isNutritionSetup=", sb3);
        b71.i.o(this.f25488m, this.f25489n, ", isNutritionInTabBar=", ", isIntegratedWithMFP=", sb3);
        b71.i.o(this.f25490o, this.f25491p, ", loggedToMFPInLast90Days=", ", hasViewedHealthStatus=", sb3);
        b71.i.o(this.f25492q, this.f25493r, ", hasRecentIndexScale1WeighIn=", ", autoDismissType=", sb3);
        sb3.append(this.f25494s);
        sb3.append(", autoDismissParams=");
        sb3.append(this.f25495t);
        sb3.append(", hasFollowings=");
        sb3.append(this.f25496u);
        sb3.append(", minLiveActivityVersion=");
        sb3.append(this.f25497v);
        sb3.append(", allCoachPlansRequireGCPlus=");
        sb3.append(this.f25498w);
        sb3.append(", isPrimaryWearableScreenless=");
        sb3.append(this.f25499x);
        sb3.append(")");
        return sb3.toString();
    }

    public n0(Set<String> set, Boolean bool, Boolean bool2, String str, String str2, Boolean bool3, Boolean bool4, Boolean bool5, String str3, List<String> list, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, h0 h0Var, g0 g0Var, Boolean bool14, Integer num, Boolean bool15, Boolean bool16) {
        set.getClass();
        this.f25476a = set;
        this.f25477b = bool;
        this.f25478c = bool2;
        this.f25479d = str;
        this.f25480e = str2;
        this.f25481f = bool3;
        this.f25482g = bool4;
        this.f25483h = bool5;
        this.f25484i = str3;
        this.f25485j = list;
        this.f25486k = bool6;
        this.f25487l = bool7;
        this.f25488m = bool8;
        this.f25489n = bool9;
        this.f25490o = bool10;
        this.f25491p = bool11;
        this.f25492q = bool12;
        this.f25493r = bool13;
        this.f25494s = h0Var;
        this.f25495t = g0Var;
        this.f25496u = bool14;
        this.f25497v = num;
        this.f25498w = bool15;
        this.f25499x = bool16;
    }
}
