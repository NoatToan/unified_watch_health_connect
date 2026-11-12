package d62;

import am.x0;
import bs2.nv;
import bs2.sw;
import lc.u0;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ld62/j;", "", "Lbs2/nv;", "fitSportType", "Lbs2/sw;", "fitSubSportType", "Lam/x0;", "activityType", "Ld62/j$b;", "mode", "<init>", "(Ljava/lang/String;ILbs2/nv;Lbs2/sw;Lam/x0;Ld62/j$b;)V", "b", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f58018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f58019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f58020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f58021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ j[] f58022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f58023j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv f58024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sw f58025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f58026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f58027d;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld62/j$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        DEFAULT_ONLY,
        WHEELCHAIR_ONLY,
        ALL
    }

    static {
        nv nvVar = nv.RUNNING;
        sw swVar = sw.GENERIC;
        x0 x0Var = x0.f4308n;
        b bVar = b.DEFAULT_ONLY;
        j jVar = new j("RUN", 0, nvVar, swVar, x0Var, bVar);
        nv nvVar2 = nv.WHEELCHAIR_PUSH_RUN;
        x0 x0Var2 = x0.f4271b3;
        b bVar2 = b.WHEELCHAIR_ONLY;
        j jVar2 = new j("PUSH_RUN_SPEED", 1, nvVar2, swVar, x0Var2, bVar2);
        j jVar3 = new j("TRAIL_RUN", 2, nvVar, sw.TRAIL, x0.J0, bVar);
        j jVar4 = new j("TREADMILL", 3, nvVar, sw.TREADMILL, x0.L0, bVar);
        j jVar5 = new j("TRACK_RUN", 4, nvVar, sw.TRACK, x0.I0, bVar);
        j jVar6 = new j("INDOOR_RUN", 5, nvVar, sw.INDOOR_RUNNING, x0.N0, bVar);
        j jVar7 = new j("OBSTACLE_RACING", 6, nvVar, sw.OBSTACLE, x0.O0, null, 8, null);
        nv nvVar3 = nv.CYCLING;
        j jVar8 = new j("BIKE", 7, nvVar3, swVar, x0.f4312o, bVar);
        j jVar9 = new j("BIKE_INDOOR", 8, nvVar3, sw.INDOOR_CYCLING, x0.U0, bVar);
        j jVar10 = new j("BIKE_COMMUTE", 9, nvVar3, sw.COMMUTING, null, bVar);
        f58019f = jVar10;
        int i14 = 8;
        p005kotlin.jvm.internal.j jVar11 = null;
        b bVar3 = null;
        j jVar12 = new j("HAND_CYCLING", 10, nvVar3, sw.HAND_CYCLING, x0.Y2, bVar3, i14, jVar11);
        j jVar13 = new j("INDOOR_HAND_CYCLING", 11, nvVar3, sw.INDOOR_HAND_CYCLING, x0.Z2, bVar3, i14, jVar11);
        j jVar14 = new j("MTB", 12, nvVar3, sw.MOUNTAIN, x0.V0, bVar);
        j jVar15 = new j("E_BIKE", 13, nvVar3, sw.E_BIKE_FITNESS, x0.f4272c1, bVar);
        j jVar16 = new j("E_MTB", 14, nvVar3, sw.E_BIKE_MOUNTAIN, x0.f4269b1, bVar);
        j jVar17 = new j("GRAVEL_BIKE", 15, nvVar3, sw.GRAVEL_CYCLING, x0.Z0, bVar);
        j jVar18 = new j("BIKE_TOUR", 16, nvVar3, sw.MIXED_SURFACE, null, bVar);
        f58020g = jVar18;
        j jVar19 = new j("ROAD_BIKE", 17, nvVar3, sw.ROAD, x0.X0, bVar);
        f58021h = jVar19;
        j jVar20 = new j("BMX", 18, nvVar3, sw.BMX, x0.P0, bVar);
        nv nvVar4 = nv.FITNESS_EQUIPMENT;
        int i15 = 8;
        p005kotlin.jvm.internal.j jVar21 = null;
        b bVar4 = null;
        b bVar5 = null;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar12, jVar13, jVar14, jVar15, jVar16, jVar17, jVar18, jVar19, jVar20, new j("ELLIPTICAL", 19, nvVar4, sw.ELLIPTICAL, x0.f4290i1, bVar), new j("STAIR_STEPPER", 20, nvVar4, sw.STAIR_CLIMBING, x0.f4305m1, bVar), new j("CARDIO", 21, nv.TRAINING, sw.CARDIO_TRAINING, x0.f4293j1, null, 8, null), new j("WALK", 22, nv.WALKING, swVar, x0.f4331t, bVar), new j("PUSH_WALK_SPEED", 23, nv.WHEELCHAIR_PUSH_WALK, swVar, x0.f4274c3, bVar2), new j("XC_SKI", 24, nv.CROSS_COUNTRY_SKIING, swVar, x0.Y1, bVar), new j("ROW", 25, nv.ROWING, swVar, x0.f4273c2, bVar4, i15, jVar21), new j("KAYAK", 26, nv.KAYAKING, swVar, x0.f4306m2, bVar4, i15, jVar21), new j("SUP", 27, nv.STAND_UP_PADDLEBOARDING, swVar, x0.f4294j2, bVar4, i15, jVar21), new j("HIKE", 28, nv.HIKING, swVar, x0.f4320q, bVar), new j("INLINE_SKATE", 29, nv.INLINE_SKATING, swVar, x0.R1, bVar), new j("ICE_SKATE", 30, nv.ICE_SKATING, swVar, x0.f4285g2, null, i15, jVar21), new j("SNOW_SHOE", 31, nv.SNOWSHOEING, swVar, x0.f4291i2, bVar), new j("BOXING", 32, nv.BOXING, swVar, x0.f4357z3, bVar5, i15, jVar21), new j("HIIT", 33, nv.HIIT, swVar, x0.C2, bVar5, i15, jVar21), new j("JUMP_ROPE", 34, nv.JUMP_ROPE, swVar, x0.D3, bVar)};
        f58022i = jVarArr;
        f58023j = new w13.c(jVarArr);
        f58018e = new a(null);
    }

    public /* synthetic */ j(String str, int i14, nv nvVar, sw swVar, x0 x0Var, b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, nvVar, swVar, x0Var, (i15 & 8) != 0 ? b.ALL : bVar);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f58022i.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld62/j$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: d62.j$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1237a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f58028a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f58029b;

            static {
                int[] iArr = new int[nv.values().length];
                try {
                    iArr[nv.WHEELCHAIR_PUSH_RUN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nv.WHEELCHAIR_PUSH_WALK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f58028a = iArr;
                int[] iArr2 = new int[b.values().length];
                try {
                    iArr2[b.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[b.DEFAULT_ONLY.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[b.WHEELCHAIR_ONLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                f58029b = iArr2;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(x0 x0Var, boolean z14) {
            Object next;
            w13.c cVar = j.f58023j;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                j jVar = (j) next;
                if (jVar.f58026c == x0Var) {
                    j.f58018e.getClass();
                    if (b(jVar, z14)) {
                        return (j) next;
                    }
                }
            }
            next = null;
            return (j) next;
        }

        public static boolean b(j jVar, boolean z14) {
            int i14 = C1237a.f58029b[jVar.f58027d.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        return z14;
                    }
                    u0.r();
                    return false;
                }
                if (z14) {
                    return false;
                }
            }
            return true;
        }

        private a() {
        }
    }

    private j(String str, int i14, nv nvVar, sw swVar, x0 x0Var, b bVar) {
        super(str, i14);
        this.f58024a = nvVar;
        this.f58025b = swVar;
        this.f58026c = x0Var;
        this.f58027d = bVar;
    }
}
