package o70;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import lc.u0;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o70.c[], still in use, count: 1, list:
  (r0v1 o70.c[]) from 0x0068: CONSTRUCTOR (r0v1 o70.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lo70/c;", "Lo70/r;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements r {
    RUNNING("RUNNING_ACTIVITY_TREND"),
    CYCLING("CYCLING_ACTIVITY_TREND"),
    SWIMMING("SWIMMING_ACTIVITY_TREND"),
    WALKING("WALKING_ACTIVITY_TREND"),
    MULTI_SPORT("MULTISPORT_ACTIVITY_TREND"),
    FITNESS_EQUIPMENT("GYM_AND_FITNESS_EQUIPMENT_ACTIVITY_TREND"),
    PARA_SPORTS("PARASPORTS_ACTIVITY_TREND"),
    ALL_ACTIVITIES("ALL_ACTIVITIES_TREND");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f129930b = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f129940l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129941a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129942a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.WALKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.MULTI_SPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.FITNESS_EQUIPMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.PARA_SPORTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.ALL_ACTIVITIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f129942a = iArr;
        }
    }

    static {
        f129940l = new w13.c(new c[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    private c(String str) {
        super(str, i);
        this.f129941a = str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f129939k.clone();
    }

    @Override // o70.r
    public final String a() {
        return fb1.c.n("ActivityReportType_", this.f129941a);
    }

    @Override // o70.r
    public final String b(l22.a aVar) {
        return aVar.getString(e());
    }

    @Override // o70.r
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF129941a() {
        return this.f129941a;
    }

    public final String d() {
        switch (b.f129942a[ordinal()]) {
            case 1:
                return "running";
            case 2:
                return "cycling";
            case 3:
                return "swimming";
            case 4:
                return "walking";
            case 5:
                return "multi_sport";
            case 6:
                return "fitness_equipment";
            case 7:
                return "para_sports";
            case 8:
                return TtmlNode.COMBINE_ALL;
            default:
                u0.r();
                return null;
        }
    }

    public final int e() {
        switch (b.f129942a[ordinal()]) {
            case 1:
                return R.string.lbl_running;
            case 2:
                return R.string.lbl_cycling;
            case 3:
                return R.string.lbl_swimming;
            case 4:
                return R.string.lbl_walking;
            case 5:
                return R.string.activity_type_multisport;
            case 6:
                return R.string.activity_type_gym_and_fitness;
            case 7:
                return R.string.activity_type_parasports;
            case 8:
                return R.string.lbl_all_activities;
            default:
                u0.r();
                return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo70/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(String str) {
            Object next;
            w13.c cVar = c.f129940l;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((c) next).f129941a, str)) {
                    return (c) next;
                }
            }
            next = null;
            return (c) next;
        }

        private a() {
        }
    }
}
