package vv1;

import am.x0;
import com.garmin.android.apps.connectmobile.f3;
import java.util.Map;
import java.util.SortedMap;
import o13.p;
import o13.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yw1.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B»\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012$\b\u0002\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0018\u00010\b\u0012\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0002\u0012 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvv1/a;", "", "Lo13/p;", "", "fitnessAge", "", "highVigorousMins", "caloriesBurn", "", "", "Lyw1/i;", "personalRecords", "vo2Max", "Lo13/u;", "", "longestRideInPlan", "longestRunInPlan", "longestSwimInPlan", "fastestOrLongestAvg", "Lam/x0;", "triathlonLongestStats", "ltThresholdPace", "ltThresholdHR", "functionalThresholdPower", "criticalSwimSpeed", "furthestWalkedInDay", "longestStepGoalStreak", "mostStepsInDay", "<init>", "(Lo13/p;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Lo13/p;Lo13/u;Lo13/u;Lo13/u;Lo13/p;Ljava/util/Map;Lo13/p;Lo13/u;Lo13/u;Lo13/u;Lo13/u;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<String, String> f180489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f180490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f180491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Long, i> f180492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<Integer, Integer> f180493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u<Double, Integer, Integer> f180494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u<Double, Integer, Integer> f180495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u<Double, Integer, Integer> f180496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p<Integer, Integer> f180497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<x0, p<Double, Integer>> f180498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p<Double, Double> f180499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u<Integer, Integer, Integer> f180500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u<Integer, Integer, Integer> f180501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u<Integer, Integer, Integer> f180502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u<Double, Integer, Integer> f180503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f180504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f180505q;

    public /* synthetic */ a(p pVar, Integer num, Integer num2, Map map, p pVar2, u uVar, u uVar2, u uVar3, p pVar3, Map map2, p pVar4, u uVar4, u uVar5, u uVar6, u uVar7, Integer num3, Integer num4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : pVar, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : map, (i14 & 16) != 0 ? null : pVar2, (i14 & 32) != 0 ? null : uVar, (i14 & 64) != 0 ? null : uVar2, (i14 & 128) != 0 ? null : uVar3, (i14 & 256) != 0 ? null : pVar3, (i14 & 512) != 0 ? null : map2, (i14 & 1024) != 0 ? null : pVar4, (i14 & 2048) != 0 ? null : uVar4, (i14 & 4096) != 0 ? null : uVar5, (i14 & 8192) != 0 ? null : uVar6, (i14 & 16384) != 0 ? null : uVar7, (i14 & 32768) != 0 ? null : num3, (i14 & 65536) != 0 ? null : num4);
    }

    public static a a(a aVar, p pVar, Integer num, Integer num2, SortedMap sortedMap, p pVar2, u uVar, u uVar2, u uVar3, p pVar3, p pVar4, u uVar4, u uVar5, u uVar6, u uVar7, Integer num3, Integer num4, int i14) {
        p pVar5 = (i14 & 1) != 0 ? aVar.f180489a : pVar;
        Integer num5 = (i14 & 2) != 0 ? aVar.f180490b : num;
        Integer num6 = (i14 & 4) != 0 ? aVar.f180491c : num2;
        Map<Long, i> map = (i14 & 8) != 0 ? aVar.f180492d : sortedMap;
        p pVar6 = (i14 & 16) != 0 ? aVar.f180493e : pVar2;
        u uVar8 = (i14 & 32) != 0 ? aVar.f180494f : uVar;
        u uVar9 = (i14 & 64) != 0 ? aVar.f180495g : uVar2;
        u uVar10 = (i14 & 128) != 0 ? aVar.f180496h : uVar3;
        p pVar7 = (i14 & 256) != 0 ? aVar.f180497i : pVar3;
        Map<x0, p<Double, Integer>> map2 = aVar.f180498j;
        p pVar8 = (i14 & 1024) != 0 ? aVar.f180499k : pVar4;
        u uVar11 = (i14 & 2048) != 0 ? aVar.f180500l : uVar4;
        u uVar12 = (i14 & 4096) != 0 ? aVar.f180501m : uVar5;
        u uVar13 = (i14 & 8192) != 0 ? aVar.f180502n : uVar6;
        p pVar9 = pVar5;
        u uVar14 = (i14 & 16384) != 0 ? aVar.f180503o : uVar7;
        Integer num7 = (i14 & 32768) != 0 ? aVar.f180504p : num3;
        Integer num8 = (i14 & 65536) != 0 ? aVar.f180505q : num4;
        aVar.getClass();
        return new a(pVar9, num5, num6, map, pVar6, uVar8, uVar9, uVar10, pVar7, map2, pVar8, uVar11, uVar12, uVar13, uVar14, num7, num8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f180489a, aVar.f180489a) && s.g(this.f180490b, aVar.f180490b) && s.g(this.f180491c, aVar.f180491c) && s.g(this.f180492d, aVar.f180492d) && s.g(this.f180493e, aVar.f180493e) && s.g(this.f180494f, aVar.f180494f) && s.g(this.f180495g, aVar.f180495g) && s.g(this.f180496h, aVar.f180496h) && s.g(this.f180497i, aVar.f180497i) && s.g(this.f180498j, aVar.f180498j) && s.g(this.f180499k, aVar.f180499k) && s.g(this.f180500l, aVar.f180500l) && s.g(this.f180501m, aVar.f180501m) && s.g(this.f180502n, aVar.f180502n) && s.g(this.f180503o, aVar.f180503o) && s.g(this.f180504p, aVar.f180504p) && s.g(this.f180505q, aVar.f180505q);
    }

    public final int hashCode() {
        p<String, String> pVar = this.f180489a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        Integer num = this.f180490b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f180491c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<Long, i> map = this.f180492d;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        p<Integer, Integer> pVar2 = this.f180493e;
        int iHashCode5 = (iHashCode4 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        u<Double, Integer, Integer> uVar = this.f180494f;
        int iHashCode6 = (iHashCode5 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        u<Double, Integer, Integer> uVar2 = this.f180495g;
        int iHashCode7 = (iHashCode6 + (uVar2 == null ? 0 : uVar2.hashCode())) * 31;
        u<Double, Integer, Integer> uVar3 = this.f180496h;
        int iHashCode8 = (iHashCode7 + (uVar3 == null ? 0 : uVar3.hashCode())) * 31;
        p<Integer, Integer> pVar3 = this.f180497i;
        int iHashCode9 = (iHashCode8 + (pVar3 == null ? 0 : pVar3.hashCode())) * 31;
        Map<x0, p<Double, Integer>> map2 = this.f180498j;
        int iHashCode10 = (iHashCode9 + (map2 == null ? 0 : map2.hashCode())) * 31;
        p<Double, Double> pVar4 = this.f180499k;
        int iHashCode11 = (iHashCode10 + (pVar4 == null ? 0 : pVar4.hashCode())) * 31;
        u<Integer, Integer, Integer> uVar4 = this.f180500l;
        int iHashCode12 = (iHashCode11 + (uVar4 == null ? 0 : uVar4.hashCode())) * 31;
        u<Integer, Integer, Integer> uVar5 = this.f180501m;
        int iHashCode13 = (iHashCode12 + (uVar5 == null ? 0 : uVar5.hashCode())) * 31;
        u<Integer, Integer, Integer> uVar6 = this.f180502n;
        int iHashCode14 = (iHashCode13 + (uVar6 == null ? 0 : uVar6.hashCode())) * 31;
        u<Double, Integer, Integer> uVar7 = this.f180503o;
        int iHashCode15 = (iHashCode14 + (uVar7 == null ? 0 : uVar7.hashCode())) * 31;
        Integer num3 = this.f180504p;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f180505q;
        return iHashCode16 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTAchievementsUiModel(fitnessAge=");
        sb3.append(this.f180489a);
        sb3.append(", highVigorousMins=");
        sb3.append(this.f180490b);
        sb3.append(", caloriesBurn=");
        sb3.append(this.f180491c);
        sb3.append(", personalRecords=");
        sb3.append(this.f180492d);
        sb3.append(", vo2Max=");
        sb3.append(this.f180493e);
        sb3.append(", longestRideInPlan=");
        sb3.append(this.f180494f);
        sb3.append(", longestRunInPlan=");
        sb3.append(this.f180495g);
        sb3.append(", longestSwimInPlan=");
        sb3.append(this.f180496h);
        sb3.append(", fastestOrLongestAvg=");
        sb3.append(this.f180497i);
        sb3.append(", triathlonLongestStats=");
        sb3.append(this.f180498j);
        sb3.append(", ltThresholdPace=");
        sb3.append(this.f180499k);
        sb3.append(", ltThresholdHR=");
        sb3.append(this.f180500l);
        sb3.append(", functionalThresholdPower=");
        sb3.append(this.f180501m);
        sb3.append(", criticalSwimSpeed=");
        sb3.append(this.f180502n);
        sb3.append(", furthestWalkedInDay=");
        sb3.append(this.f180503o);
        sb3.append(", longestStepGoalStreak=");
        sb3.append(this.f180504p);
        sb3.append(", mostStepsInDay=");
        return f3.i(sb3, this.f180505q, ")");
    }

    public a(p<String, String> pVar, Integer num, Integer num2, Map<Long, i> map, p<Integer, Integer> pVar2, u<Double, Integer, Integer> uVar, u<Double, Integer, Integer> uVar2, u<Double, Integer, Integer> uVar3, p<Integer, Integer> pVar3, Map<x0, p<Double, Integer>> map2, p<Double, Double> pVar4, u<Integer, Integer, Integer> uVar4, u<Integer, Integer, Integer> uVar5, u<Integer, Integer, Integer> uVar6, u<Double, Integer, Integer> uVar7, Integer num3, Integer num4) {
        this.f180489a = pVar;
        this.f180490b = num;
        this.f180491c = num2;
        this.f180492d = map;
        this.f180493e = pVar2;
        this.f180494f = uVar;
        this.f180495g = uVar2;
        this.f180496h = uVar3;
        this.f180497i = pVar3;
        this.f180498j = map2;
        this.f180499k = pVar4;
        this.f180500l = uVar4;
        this.f180501m = uVar5;
        this.f180502n = uVar6;
        this.f180503o = uVar7;
        this.f180504p = num3;
        this.f180505q = num4;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }
}
