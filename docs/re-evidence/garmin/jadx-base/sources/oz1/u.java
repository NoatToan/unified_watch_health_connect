package oz1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 oz1.u[], still in use, count: 1, list:
  (r0v1 oz1.u[]) from 0x00af: CONSTRUCTOR (r0v1 oz1.u[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Loz1/u;", "", "", Action.KEY_ATTRIBUTE, "", "realTimeDataId", "level", "", "min", "max", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Ljava/lang/String;ILjava/lang/String;IIFFI)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {
    NONE("NONE", 0, R.string.tr_level_none, 0.0f, 0.0f, R.color.gcm_progress_indicator_empty),
    POOR("POOR", 1, R.string.tr_level_poor, 0.0f, 25.0f, R.color.gcm_training_readiness_poor),
    LOW("LOW", 2, R.string.tr_level_low, 25.0f, 50.0f, R.color.gcm_training_readiness_low),
    MODERATE("MODERATE", 3, R.string.tr_level_moderate, 50.0f, 75.0f, R.color.gcm_training_readiness_moderate),
    HIGH("HIGH", 4, R.string.tr_level_high, 75.0f, 95.0f, R.color.gcm_training_readiness_high),
    PRIME("PRIME", 5, R.string.tr_level_prime, 95.0f, 100.0f, R.color.gcm_training_readiness_prime),
    INVALID("INVALID", 6, R.string.tr_level_none, 0.0f, 0.0f, R.color.gcm_progress_indicator_empty),
    RECENT_DIVE("RECENT_DIVE", -1, R.string.recent_dives, 0.0f, 0.0f, R.color.gcm_progress_indicator_empty);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f134627e = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w13.c f134637o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f134639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f134640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f134641d;

    static {
        f134637o = new w13.c(new u[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    private u(String str, int i14, int i15, float f14, float f15, int i16) {
        super(str, i);
        this.f134638a = str;
        this.f134639b = i14;
        this.f134640c = i15;
        this.f134641d = f15;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f134636n.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loz1/u$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: oz1.u$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2555a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f134642a;

            static {
                int[] iArr = new int[u.values().length];
                try {
                    iArr[u.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[u.POOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[u.LOW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[u.MODERATE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[u.HIGH.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[u.PRIME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[u.INVALID.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[u.RECENT_DIVE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f134642a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static u a(String str) {
            Object next;
            w13.c cVar = u.f134637o;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((u) next).f134638a, str)) {
                    return (u) next;
                }
            }
            next = null;
            return (u) next;
        }

        public static u b(Integer num) {
            Object next;
            w13.c cVar = u.f134637o;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                int i14 = ((u) next).f134639b;
                if (num != null && i14 == num.intValue()) {
                    return (u) next;
                }
            }
            next = null;
            return (u) next;
        }

        public static long c(u uVar, p3.m mVar) {
            uVar.getClass();
            x1 x1Var = p3.n.f135158a;
            switch (C2555a.f134642a[uVar.ordinal()]) {
                case 1:
                    mVar.C(631294811);
                    f02.e.f67730a.getClass();
                    long jC = f02.e.c(mVar);
                    mVar.f();
                    return jC;
                case 2:
                    mVar.C(631296621);
                    gl.c.f77766a.getClass();
                    long jL = gl.c.a(mVar).l();
                    mVar.f();
                    return jL;
                case 3:
                    mVar.C(631297968);
                    gl.c.f77766a.getClass();
                    long jH = gl.c.a(mVar).h();
                    mVar.f();
                    return jH;
                case 4:
                    mVar.C(631299567);
                    gl.c.f77766a.getClass();
                    long jD = gl.c.a(mVar).d();
                    mVar.f();
                    return jD;
                case 5:
                    mVar.C(631301006);
                    gl.c.f77766a.getClass();
                    long jB = gl.c.a(mVar).b();
                    mVar.f();
                    return jB;
                case 6:
                    mVar.C(631302448);
                    gl.c.f77766a.getClass();
                    long j8 = gl.c.a(mVar).j();
                    mVar.f();
                    return j8;
                case 7:
                    mVar.C(631304251);
                    f02.e.f67730a.getClass();
                    long jC2 = f02.e.c(mVar);
                    mVar.f();
                    return jC2;
                case 8:
                    mVar.C(631306523);
                    f02.e.f67730a.getClass();
                    long jC3 = f02.e.c(mVar);
                    mVar.f();
                    return jC3;
                default:
                    throw n23.j.m(mVar, 631293548);
            }
        }

        private a() {
        }
    }
}
