package o70;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o70.o[], still in use, count: 1, list:
  (r0v1 o70.o[]) from 0x0050: CONSTRUCTOR (r0v1 o70.o[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lo70/o;", "Lo70/r;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements r {
    BODY_BATTERY("BODY_BATTERY"),
    NUTRITION("GCNT"),
    SLEEP("SLEEP"),
    STEPS("STEPS"),
    TRAINING_READINESS("TRAINING_READINESS"),
    TRAINING_STATUS("TRAINING_STATUS"),
    ACTIVITY_SUMMARY("ACTIVITY_SUMMARY");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f130039b = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f130048k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130049a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130050a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.BODY_BATTERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.NUTRITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.STEPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.TRAINING_READINESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.TRAINING_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o.ACTIVITY_SUMMARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f130050a = iArr;
        }
    }

    static {
        f130048k = new w13.c(new o[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private o(String str) {
        super(str, i);
        this.f130049a = str;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f130047j.clone();
    }

    @Override // o70.r
    public final String a() {
        return fb1.c.n("KeyStatType_", this.f130049a);
    }

    @Override // o70.r
    public final String b(l22.a aVar) {
        switch (b.f130050a[ordinal()]) {
            case 1:
                return aVar.getString(R.string.gcm_body_battery_lbl_body_battery);
            case 2:
                return aVar.getString(R.string.lbl_nutrition);
            case 3:
                return t.Z.d(aVar, null);
            case 4:
                return t.H0.d(aVar, null);
            case 5:
                return aVar.getString(R.string.training_readiness);
            case 6:
                return aVar.getString(R.string.lbl_training_status);
            case 7:
                return aVar.getString(R.string.device_screen_activity);
            default:
                u0.r();
                return null;
        }
    }

    @Override // o70.r
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF130049a() {
        return this.f130049a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo70/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o a(String str) {
            Object next;
            w13.c cVar = o.f130048k;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((o) next).f130049a, str)) {
                    return (o) next;
                }
            }
            next = null;
            return (o) next;
        }

        private a() {
        }
    }
}
