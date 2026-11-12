package o71;

import ds.e0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.YearMonth;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fBE\b\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lo71/b;", "", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "", "volumeMap", "", "repsMap", "setsMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "b", "a", "Lo71/b$a;", "Lo71/b$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Double> f130155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> f130156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> f130157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f130158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f130159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f130160f;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lo71/b$a;", "Lo71/b;", "", "activityId", "", "name", "Lorg/joda/time/DateTime;", "datetime", "duration", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "exerciseKeyPairs", "activityTypeKey", "", "", "volumeMapByExercise", "", "repsMapByExercise", "setsMapByExercise", "<init>", "(JLjava/lang/String;Lorg/joda/time/DateTime;JLjava/util/Set;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f130161g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f130162h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final DateTime f130163i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f130164j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Set<com.garmin.android.apps.connectmobile.performance.dto.c> f130165k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f130166l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Double> f130167m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> f130168n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> f130169o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, String str, DateTime dateTime, long j14, Set<com.garmin.android.apps.connectmobile.performance.dto.c> set, String str2, Map<com.garmin.android.apps.connectmobile.performance.dto.c, Double> map, Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> map2, Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> map3) {
            super(map, map2, map3, null);
            dateTime.getClass();
            set.getClass();
            str2.getClass();
            map.getClass();
            map2.getClass();
            map3.getClass();
            this.f130161g = j8;
            this.f130162h = str;
            this.f130163i = dateTime;
            this.f130164j = j14;
            this.f130165k = set;
            this.f130166l = str2;
            this.f130167m = map;
            this.f130168n = map2;
            this.f130169o = map3;
        }

        @Override // o71.b
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f130161g == aVar.f130161g && s.g(this.f130162h, aVar.f130162h) && s.g(this.f130163i, aVar.f130163i) && this.f130164j == aVar.f130164j && s.g(this.f130165k, aVar.f130165k) && s.g(this.f130166l, aVar.f130166l) && s.g(this.f130167m, aVar.f130167m) && s.g(this.f130168n, aVar.f130168n) && s.g(this.f130169o, aVar.f130169o);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f130161g) * 31;
            String str = this.f130162h;
            return this.f130169o.hashCode() + am.j.b(this.f130168n, am.j.b(this.f130167m, wr.g.j((this.f130165k.hashCode() + q6.f.e(e0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f130163i, 31), 31, this.f130164j)) * 31, 31, this.f130166l), 31), 31);
        }

        public final String toString() {
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f130161g, "IndividualActivity(activityId=", ", name=", this.f130162h);
            sbK.append(", datetime=");
            sbK.append(this.f130163i);
            sbK.append(", duration=");
            sbK.append(this.f130164j);
            sbK.append(", exerciseKeyPairs=");
            sbK.append(this.f130165k);
            sbK.append(", activityTypeKey=");
            sbK.append(this.f130166l);
            sbK.append(", volumeMapByExercise=");
            sbK.append(this.f130167m);
            sbK.append(", repsMapByExercise=");
            sbK.append(this.f130168n);
            sbK.append(", setsMapByExercise=");
            sbK.append(this.f130169o);
            sbK.append(")");
            return sbK.toString();
        }
    }

    /* JADX INFO: renamed from: o71.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lo71/b$b;", "Lo71/b;", "Lorg/joda/time/YearMonth;", "yearMonth", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/d;", "stats", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "", "volumeMapByExercise", "", "repsMapByExercise", "setsMapByExercise", "<init>", "(Lorg/joda/time/YearMonth;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2480b extends b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final YearMonth f130170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.performance.dto.d> f130171h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Double> f130172i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> f130173j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> f130174k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2480b(YearMonth yearMonth, List<com.garmin.android.apps.connectmobile.performance.dto.d> list, Map<com.garmin.android.apps.connectmobile.performance.dto.c, Double> map, Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> map2, Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> map3) {
            super(map, map2, map3, null);
            yearMonth.getClass();
            list.getClass();
            map.getClass();
            map2.getClass();
            map3.getClass();
            this.f130170g = yearMonth;
            this.f130171h = list;
            this.f130172i = map;
            this.f130173j = map2;
            this.f130174k = map3;
        }

        @Override // o71.b
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2480b)) {
                return false;
            }
            C2480b c2480b = (C2480b) obj;
            return s.g(this.f130170g, c2480b.f130170g) && s.g(this.f130171h, c2480b.f130171h) && s.g(this.f130172i, c2480b.f130172i) && s.g(this.f130173j, c2480b.f130173j) && s.g(this.f130174k, c2480b.f130174k);
        }

        public final int hashCode() {
            return this.f130174k.hashCode() + am.j.b(this.f130173j, am.j.b(this.f130172i, u0.b(this.f130170g.hashCode() * 31, 31, this.f130171h), 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MonthsTotal(yearMonth=");
            sb3.append(this.f130170g);
            sb3.append(", stats=");
            sb3.append(this.f130171h);
            sb3.append(", volumeMapByExercise=");
            sb3.append(this.f130172i);
            sb3.append(", repsMapByExercise=");
            sb3.append(this.f130173j);
            sb3.append(", setsMapByExercise=");
            return am.j.s(sb3, this.f130174k, ")");
        }
    }

    private b(Map<com.garmin.android.apps.connectmobile.performance.dto.c, Double> map, Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> map2, Map<com.garmin.android.apps.connectmobile.performance.dto.c, Integer> map3) {
        this.f130155a = map;
        this.f130156b = map2;
        this.f130157c = map3;
        this.f130158d = h0.P0(map.values());
        this.f130159e = h0.R0(map2.values());
        this.f130160f = h0.R0(map3.values());
    }

    public final void a(p71.f fVar) {
        nw0.f fVar2 = new nw0.f(fVar, 8);
        Iterator<T> it = this.f130155a.entrySet().iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            dDoubleValue += ((Boolean) fVar2.invoke(entry.getKey())).booleanValue() ? ((Number) entry.getValue()).doubleValue() : 0.0d;
        }
        this.f130158d = dDoubleValue;
        Iterator<T> it3 = this.f130156b.entrySet().iterator();
        int iIntValue = 0;
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            iIntValue += ((Boolean) fVar2.invoke(entry2.getKey())).booleanValue() ? ((Number) entry2.getValue()).intValue() : 0;
        }
        this.f130159e = iIntValue;
        Iterator<T> it4 = this.f130157c.entrySet().iterator();
        int iIntValue2 = 0;
        while (it4.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it4.next();
            iIntValue2 += ((Boolean) fVar2.invoke(entry3.getKey())).booleanValue() ? ((Number) entry3.getValue()).intValue() : 0;
        }
        this.f130160f = iIntValue2;
    }

    public abstract boolean equals(Object obj);

    public /* synthetic */ b(Map map, Map map2, Map map3, p005kotlin.jvm.internal.j jVar) {
        this(map, map2, map3);
    }
}
