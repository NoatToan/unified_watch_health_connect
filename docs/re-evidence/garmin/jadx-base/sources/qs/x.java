package qs;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v40 qs.x[], still in use, count: 1, list:
  (r0v40 qs.x[]) from 0x0263: CONSTRUCTOR (r0v40 qs.x[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqs/x;", "", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {
    RUN_ACTIVE("RUN_ACTIVE"),
    RUN_REST("RUN_REST"),
    SURF_ACTIVE("SURF_ACTIVE"),
    VIRTUAL_ACTIVITY_SECTION("VIRTUAL_ACTIVITY_SECTION"),
    ASCENT("ASCENT_SPLIT"),
    DESCENT("DESCENT_SPLIT"),
    TRANSITION("TRANSITION"),
    CLIMB_ACTIVE("CLIMB_ACTIVE"),
    CLIMB_REST("CLIMB_REST"),
    WORKOUT_ROUND("WORKOUT_ROUND"),
    PACE_PRO_SPLIT("PACE_PRO_SPLIT"),
    WINDSURF_ACTIVE("WINDSURF_ACTIVE"),
    RWD_RUN("RWD_RUN"),
    RWD_WALK("RWD_WALK"),
    RWD_STAND("RWD_STAND"),
    CLIMB_PRO_CYCLING_CLIMB("CLIMB_PRO_CYCLING_CLIMB"),
    CLIMB_PRO_CYCLING_CLIMB_SECTION("CLIMB_PRO_CYCLING_CLIMB_SECTION"),
    POWER_GUIDE_SPLIT("POWER_GUIDANCE_SPLIT"),
    ROUND_ACTIVE("ROUND_ACTIVE"),
    ROUND_REST("ROUND_REST"),
    OBSTACLE("OBSTACLE"),
    SKI_RUN("SKI_RUN_SPLIT"),
    SKI_LIFT("SKI_LIFT_SPLIT"),
    SURFACE_TYPE_PAVED("SURFACE_TYPE_PAVED"),
    SURFACE_TYPE_UNPAVED("SURFACE_TYPE_UNPAVED"),
    DIVE_INTERVAL_DYN("DYNAMIC_APNEA_DIVE"),
    DIVE_INTERVAL_STA("DYNAMIC_APNEA_STA"),
    DIVE_INTERVAL_REST("DYNAMIC_APNEA_REST"),
    SKI_RUN_SPLIT_SECTION("SKI_RUN_SPLIT_SECTION"),
    MARKER_MILE("MARKER_MILE"),
    MARKER_KILOMETER("MARKER_KILOMETER"),
    MARKER_5K("MARKER_5K"),
    MARKER_HALF_MARATHON("MARKER_HALF_MARATHON"),
    MARKER_MANUAL("MARKER_MANUAL"),
    PROVISIONAL_END("PROVISIONAL_END"),
    DIVE("DIVE"),
    DIVE_SECTION("DIVE_SECTION"),
    DOWNHILL_RUN("DOWNHILL_RUN"),
    DOWNHILL_LIFT("DOWNHILL_LIFT"),
    TIMING_GATE("TIMING_GATE"),
    TIMING_RUN("TIMING_RUN"),
    /* JADX INFO: Fake field, exist only in values array */
    WALK("INTERVAL_WALK"),
    PACK_WEIGHT("PACK_WEIGHT");

    public static final /* synthetic */ w13.c P0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f147196b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147220a;

    static {
        P0 = new w13.c(new x[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r2, r0, r1, r0, r1, r2, r0, r1, r0, r1, r2, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0});
    }

    private x(String str) {
        super(str, i);
        this.f147220a = str;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) O0.clone();
    }

    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF147220a() {
        return this.f147220a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/x$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: qs.x$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2768a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f147221a;

            static {
                int[] iArr = new int[x.values().length];
                try {
                    iArr[x.DIVE_INTERVAL_REST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x.DIVE_INTERVAL_STA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x.DIVE_INTERVAL_DYN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f147221a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
