package y8;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB\u008b\u0001\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018B\u008d\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u001b¨\u0006\u001d"}, d2 = {"Ly8/v;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "", "exerciseType", "", "title", "notes", "", "Ly8/u;", "segments", "Ly8/q;", "laps", "Ly8/t;", "exerciseRouteResult", "plannedExerciseSessionId", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ly8/t;Ljava/lang/String;)V", "Ly8/s;", "exerciseRoute", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ly8/s;Ljava/lang/String;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v implements d0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f194991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LinkedHashMap f194992n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.c f194997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f194998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f194999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f195000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<u> f195001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<q> f195002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f195003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f195004l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly8/q;", "kotlin.jvm.PlatformType", "a", "b", "", "invoke", "(Ly8/q;Ly8/q;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.p<q, q, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f195005a = new b();

        public b() {
            super(2);
        }

        @Override // e23.p
        public final Integer invoke(q qVar, q qVar2) {
            return Integer.valueOf(qVar.f194946a.compareTo(qVar2.f194946a));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly8/u;", "kotlin.jvm.PlatformType", "a", "b", "", "invoke", "(Ly8/u;Ly8/u;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.p<u, u, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f195006a = new c();

        public c() {
            super(2);
        }

        @Override // e23.p
        public final Integer invoke(u uVar, u uVar2) {
            return Integer.valueOf(uVar.f194981a.compareTo(uVar2.f194981a));
        }
    }

    static {
        new a(null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        bVar.getClass();
        l8.a.b.c("ActiveTime", enumC2129a, "time");
        Map mapE = p13.u0.e(new o13.p("back_extension", 13), new o13.p("badminton", 2), new o13.p("barbell_shoulder_press", 70), new o13.p("baseball", 4), new o13.p("basketball", 5), new o13.p("bench_press", 70), new o13.p("bench_sit_up", 13), new o13.p("biking", 8), new o13.p("biking_stationary", 9), new o13.p("boot_camp", 10), new o13.p("boxing", 11), new o13.p("burpee", 13), new o13.p("cricket", 14), new o13.p("crunch", 13), new o13.p("dancing", 16), new o13.p("deadlift", 70), new o13.p("dumbbell_curl_left_arm", 70), new o13.p("dumbbell_curl_right_arm", 70), new o13.p("dumbbell_front_raise", 70), new o13.p("dumbbell_lateral_raise", 70), new o13.p("dumbbell_triceps_extension_left_arm", 70), new o13.p("dumbbell_triceps_extension_right_arm", 70), new o13.p("dumbbell_triceps_extension_two_arm", 70), new o13.p("elliptical", 25), new o13.p("exercise_class", 26), new o13.p("fencing", 27), new o13.p("football_american", 28), new o13.p("football_australian", 29), new o13.p("forward_twist", 13), new o13.p("frisbee_disc", 31), new o13.p("golf", 32), new o13.p("guided_breathing", 33), new o13.p("gymnastics", 34), new o13.p("handball", 35), new o13.p("hiking", 37), new o13.p("ice_hockey", 38), new o13.p("ice_skating", 39), new o13.p("jumping_jack", 36), new o13.p("jump_rope", 36), new o13.p("lat_pull_down", 70), new o13.p("lunge", 13), new o13.p("martial_arts", 44), new o13.p("paddling", 46), new o13.p("para_gliding", 47), new o13.p("pilates", 48), new o13.p("plank", 13), new o13.p("racquetball", 50), new o13.p("rock_climbing", 51), new o13.p("roller_hockey", 52), new o13.p("rowing", 53), new o13.p("rowing_machine", 54), new o13.p("rugby", 55), new o13.p("running", 56), new o13.p("running_treadmill", 57), new o13.p("sailing", 58), new o13.p("scuba_diving", 59), new o13.p("skating", 60), new o13.p("skiing", 61), new o13.p("snowboarding", 62), new o13.p("snowshoeing", 63), new o13.p("soccer", 64), new o13.p("softball", 65), new o13.p("squash", 66), new o13.p("squat", 13), new o13.p("stair_climbing", 68), new o13.p("stair_climbing_machine", 69), new o13.p("stretching", 71), new o13.p("surfing", 72), new o13.p("swimming_open_water", 73), new o13.p("swimming_pool", 74), new o13.p("table_tennis", 75), new o13.p("tennis", 76), new o13.p("upper_twist", 13), new o13.p("volleyball", 78), new o13.p("walking", 79), new o13.p("water_polo", 80), new o13.p("weightlifting", 81), new o13.p("wheelchair", 82), new o13.p("workout", 0), new o13.p("yoga", 83), new o13.p("calisthenics", 13), new o13.p("high_intensity_interval_training", 36), new o13.p("strength_training", 70));
        f194991m = mapE;
        Set<Map.Entry> setEntrySet = mapE.entrySet();
        int iA = p13.t0.a(p13.y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        f194992n = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, java.util.Map] */
    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2, List<u> list, List<q> list2, t tVar, String str3) {
        boolean zContains;
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
        list2.getClass();
        tVar.getClass();
        this.f194993a = instant;
        this.f194994b = zoneOffset;
        this.f194995c = instant2;
        this.f194996d = zoneOffset2;
        this.f194997e = cVar;
        this.f194998f = i14;
        this.f194999g = str;
        this.f195000h = str2;
        this.f195001i = list;
        this.f195002j = list2;
        this.f195003k = tVar;
        this.f195004l = str3;
        if (!instant.isBefore(instant2)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (!list.isEmpty()) {
            List<u> listN0 = p13.h0.N0(list, new p5.l0(c.f195006a, 1));
            int iJ = p13.x.j(listN0);
            int i15 = 0;
            while (i15 < iJ) {
                Instant instant3 = ((u) listN0.get(i15)).f194982b;
                i15++;
                if (instant3.isAfter(((u) listN0.get(i15)).f194981a)) {
                    vb.h.s("segments can not overlap.");
                    throw null;
                }
            }
            if (((u) p13.h0.b0(listN0)).f194981a.isBefore(this.f194993a)) {
                vb.h.s("segments can not be out of parent time range.");
                throw null;
            }
            if (((u) p13.h0.m0(listN0)).f194982b.isAfter(this.f194995c)) {
                vb.h.s("segments can not be out of parent time range.");
                throw null;
            }
            for (u uVar : listN0) {
                u.a aVar = u.f194975e;
                int i16 = uVar.f194983c;
                int i17 = this.f194998f;
                aVar.getClass();
                if (u.f194976f.contains(Integer.valueOf(i17)) || u.f194977g.contains(Integer.valueOf(i16))) {
                    zContains = true;
                } else {
                    Set set = (Set) u.f194980j.get(Integer.valueOf(i17));
                    zContains = set != null ? set.contains(Integer.valueOf(i16)) : false;
                }
                if (!zContains) {
                    vb.h.s("segmentType and sessionType is not compatible.");
                    throw null;
                }
            }
        }
        if (!this.f195002j.isEmpty()) {
            List listN1 = p13.h0.N0(this.f195002j, new p5.l0(b.f195005a, 2));
            int iJ2 = p13.x.j(listN1);
            int i18 = 0;
            while (i18 < iJ2) {
                Instant instant4 = ((q) listN1.get(i18)).f194947b;
                i18++;
                if (instant4.isAfter(((q) listN1.get(i18)).f194946a)) {
                    vb.h.s("laps can not overlap.");
                    throw null;
                }
            }
            if (((q) p13.h0.b0(listN1)).f194946a.isBefore(this.f194993a)) {
                vb.h.s("laps can not be out of parent time range.");
                throw null;
            }
            if (((q) p13.h0.m0(listN1)).f194947b.isAfter(this.f194995c)) {
                vb.h.s("laps can not be out of parent time range.");
                throw null;
            }
        }
        t tVar2 = this.f195003k;
        if (!(tVar2 instanceof t.a) || ((t.a) tVar2).f194974a.f194963a.isEmpty()) {
            return;
        }
        List<s.a> list3 = ((t.a) this.f195003k).f194974a.f194963a;
        Iterator<T> it = list3.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            throw null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant instant5 = ((s.a) next).f194964a;
            do {
                Object next2 = it.next();
                Instant instant6 = ((s.a) next2).f194964a;
                if (instant5.compareTo(instant6) > 0) {
                    next = next2;
                    instant5 = instant6;
                }
            } while (it.hasNext());
        }
        Instant instant7 = ((s.a) next).f194964a;
        Iterator<T> it3 = list3.iterator();
        if (!it3.hasNext()) {
            c22.t.g();
            throw null;
        }
        Object next3 = it3.next();
        if (it3.hasNext()) {
            Instant instant8 = ((s.a) next3).f194964a;
            do {
                Object next4 = it3.next();
                Instant instant9 = ((s.a) next4).f194964a;
                if (instant8.compareTo(instant9) < 0) {
                    next3 = next4;
                    instant8 = instant9;
                }
            } while (it3.hasNext());
        }
        if (!instant7.isBefore(this.f194993a) && ((s.a) next3).f194964a.isBefore(this.f194995c)) {
            return;
        }
        vb.h.s("route can not be out of parent time range.");
        throw null;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194996d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194994b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f194998f == vVar.f194998f && p005kotlin.jvm.internal.s.g(this.f194999g, vVar.f194999g) && p005kotlin.jvm.internal.s.g(this.f195000h, vVar.f195000h) && p005kotlin.jvm.internal.s.g(this.f194993a, vVar.f194993a) && p005kotlin.jvm.internal.s.g(this.f194994b, vVar.f194994b) && p005kotlin.jvm.internal.s.g(this.f194995c, vVar.f194995c) && p005kotlin.jvm.internal.s.g(this.f194996d, vVar.f194996d) && p005kotlin.jvm.internal.s.g(this.f194997e, vVar.f194997e) && p005kotlin.jvm.internal.s.g(this.f195001i, vVar.f195001i) && p005kotlin.jvm.internal.s.g(this.f195002j, vVar.f195002j) && p005kotlin.jvm.internal.s.g(this.f195003k, vVar.f195003k);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194995c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194997e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194993a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f194998f) * 31;
        String str = this.f194999g;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f195000h;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ZoneOffset zoneOffset = this.f194994b;
        int iK = wr.g.k(this.f194995c, (iHashCode3 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194996d;
        return this.f195003k.hashCode() + ((this.f194997e.hashCode() + ((iK + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ExerciseSessionRecord(startTime=" + this.f194993a + ", startZoneOffset=" + this.f194994b + ", endTime=" + this.f194995c + ", endZoneOffset=" + this.f194996d + ", exerciseType=" + this.f194998f + ", title=" + this.f194999g + ", notes=" + this.f195000h + ", metadata=" + this.f194997e + ", segments=" + this.f195001i + ", laps=" + this.f195002j + ", exerciseRouteResult=" + this.f195003k + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b>\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00102\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\nR\u0014\u00103\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\nR\u0014\u00104\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\nR\u0014\u00105\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\nR\u0014\u00106\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\nR\u0014\u00107\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\nR\u0014\u00108\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\nR\u0014\u00109\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\nR\u0014\u0010:\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\nR\u0014\u0010;\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\nR\u0014\u0010<\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\nR\u0014\u0010=\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\nR\u0014\u0010>\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\nR\u0014\u0010?\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\nR\u0014\u0010@\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\nR\u0014\u0010A\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\nR\u0014\u0010B\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\nR\u0014\u0010C\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\nR\u0014\u0010D\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\nR\u0014\u0010E\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\nR\u0014\u0010F\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\nR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\b0G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020H0G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010J¨\u0006L"}, d2 = {"Ly8/v$a;", "", "<init>", "()V", "Ll8/a;", "Ljava/time/Duration;", "EXERCISE_DURATION_TOTAL", "Ll8/a;", "", "EXERCISE_TYPE_OTHER_WORKOUT", "I", "EXERCISE_TYPE_BADMINTON", "EXERCISE_TYPE_BASEBALL", "EXERCISE_TYPE_BASKETBALL", "EXERCISE_TYPE_BIKING", "EXERCISE_TYPE_BIKING_STATIONARY", "EXERCISE_TYPE_BOOT_CAMP", "EXERCISE_TYPE_BOXING", "EXERCISE_TYPE_CALISTHENICS", "EXERCISE_TYPE_CRICKET", "EXERCISE_TYPE_DANCING", "EXERCISE_TYPE_ELLIPTICAL", "EXERCISE_TYPE_EXERCISE_CLASS", "EXERCISE_TYPE_FENCING", "EXERCISE_TYPE_FOOTBALL_AMERICAN", "EXERCISE_TYPE_FOOTBALL_AUSTRALIAN", "EXERCISE_TYPE_FRISBEE_DISC", "EXERCISE_TYPE_GOLF", "EXERCISE_TYPE_GUIDED_BREATHING", "EXERCISE_TYPE_GYMNASTICS", "EXERCISE_TYPE_HANDBALL", "EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING", "EXERCISE_TYPE_HIKING", "EXERCISE_TYPE_ICE_HOCKEY", "EXERCISE_TYPE_ICE_SKATING", "EXERCISE_TYPE_MARTIAL_ARTS", "EXERCISE_TYPE_PADDLING", "EXERCISE_TYPE_PARAGLIDING", "EXERCISE_TYPE_PILATES", "EXERCISE_TYPE_RACQUETBALL", "EXERCISE_TYPE_ROCK_CLIMBING", "EXERCISE_TYPE_ROLLER_HOCKEY", "EXERCISE_TYPE_ROWING", "EXERCISE_TYPE_ROWING_MACHINE", "EXERCISE_TYPE_RUGBY", "EXERCISE_TYPE_RUNNING", "EXERCISE_TYPE_RUNNING_TREADMILL", "EXERCISE_TYPE_SAILING", "EXERCISE_TYPE_SCUBA_DIVING", "EXERCISE_TYPE_SKATING", "EXERCISE_TYPE_SKIING", "EXERCISE_TYPE_SNOWBOARDING", "EXERCISE_TYPE_SNOWSHOEING", "EXERCISE_TYPE_SOCCER", "EXERCISE_TYPE_SOFTBALL", "EXERCISE_TYPE_SQUASH", "EXERCISE_TYPE_STAIR_CLIMBING", "EXERCISE_TYPE_STAIR_CLIMBING_MACHINE", "EXERCISE_TYPE_STRENGTH_TRAINING", "EXERCISE_TYPE_STRETCHING", "EXERCISE_TYPE_SURFING", "EXERCISE_TYPE_SWIMMING_OPEN_WATER", "EXERCISE_TYPE_SWIMMING_POOL", "EXERCISE_TYPE_TABLE_TENNIS", "EXERCISE_TYPE_TENNIS", "EXERCISE_TYPE_VOLLEYBALL", "EXERCISE_TYPE_WALKING", "EXERCISE_TYPE_WATER_POLO", "EXERCISE_TYPE_WEIGHTLIFTING", "EXERCISE_TYPE_WHEELCHAIR", "EXERCISE_TYPE_YOGA", "", "", "EXERCISE_TYPE_STRING_TO_INT_MAP", "Ljava/util/Map;", "EXERCISE_TYPE_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, str, (String) null, (List) null, (List) null, (s) null, (String) null, 3968, (p005kotlin.jvm.internal.j) null);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, str, str2, (List) null, (List) null, (s) null, (String) null, 3840, (p005kotlin.jvm.internal.j) null);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2, List<u> list) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, str, str2, list, (List) null, (s) null, (String) null, 3584, (p005kotlin.jvm.internal.j) null);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2, List<u> list, List<q> list2) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, str, str2, list, list2, (s) null, (String) null, 3072, (p005kotlin.jvm.internal.j) null);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
        list2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2, List<u> list, List<q> list2, s sVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, str, str2, list, list2, sVar, (String) null, 2048, (p005kotlin.jvm.internal.j) null);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
        list2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, (String) null, (String) null, (List) null, (List) null, (s) null, (String) null, 4032, (p005kotlin.jvm.internal.j) null);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
    }

    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2, List list, List list2, s sVar, String str3, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, (i15 & 64) != 0 ? null : str, (i15 & 128) != 0 ? null : str2, (List<u>) ((i15 & 256) != 0 ? p13.j0.f134944a : list), (List<q>) ((i15 & 512) != 0 ? p13.j0.f134944a : list2), (i15 & 1024) != 0 ? null : sVar, (i15 & 2048) != 0 ? null : str3);
    }

    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2, List list, List list2, t tVar, String str3, int i15, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, (i15 & 64) != 0 ? null : str, (i15 & 128) != 0 ? null : str2, (List<u>) ((i15 & 256) != 0 ? p13.j0.f134944a : list), (List<q>) ((i15 & 512) != 0 ? p13.j0.f134944a : list2), (i15 & 1024) != 0 ? new t.b() : tVar, (i15 & 2048) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, int i14, String str, String str2, List<u> list, List<q> list2, s sVar, String str3) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, i14, str, str2, list, list2, sVar != null ? new t.a(sVar) : new t.b(), str3);
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        list.getClass();
        list2.getClass();
    }
}
