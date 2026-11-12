package qg2;

import ch.qos.logback.core.joran.action.Action;
import lc.u0;
import n23.j;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qg2.c[], still in use, count: 1, list:
  (r0v1 qg2.c[]) from 0x004e: CONSTRUCTOR (r0v1 qg2.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lqg2/c;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    ELEVATION("ELEVATION"),
    HEART_RATE("HEART_RATE"),
    SPEED("SPEED"),
    POWER("POWER"),
    ROW_PACE("ROW_PACE"),
    GRADE_ADJUSTED_PACE("GRADE_ADJUSTED_PACE"),
    PACE("PACE");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f144676b = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f144685k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144686a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144688a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.GRADE_ADJUSTED_PACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.ROW_PACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.ELEVATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f144688a = iArr;
        }
    }

    static {
        f144685k = new w13.c(new c[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private c(String str) {
        super(str, i);
        this.f144686a = str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f144684j.clone();
    }

    public final long a(m mVar) {
        x1 x1Var = n.f135158a;
        switch (b.f144688a[ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                mVar.C(1803818459);
                gl.c.f77766a.getClass();
                long jC = gl.c.a(mVar).c();
                mVar.f();
                return jC;
            case 3:
                mVar.C(1803821821);
                gl.c.f77766a.getClass();
                long jK = gl.c.a(mVar).k();
                mVar.f();
                return jK;
            case 7:
                mVar.C(1803820188);
                gl.c.f77766a.getClass();
                long jE = gl.c.a(mVar).e();
                mVar.f();
                return jE;
            default:
                throw j.m(mVar, 1803814263);
        }
    }

    public final rf2.a b() {
        switch (b.f144688a[ordinal()]) {
            case 1:
                return rf2.a.HEART_RATE;
            case 2:
                return rf2.a.SPEED;
            case 3:
                return rf2.a.POWER;
            case 4:
                return rf2.a.PACE;
            case 5:
                return rf2.a.GRADE_ADJUSTED_PACE;
            case 6:
                return rf2.a.PACE;
            case 7:
                return rf2.a.ELEVATION;
            default:
                u0.r();
                return null;
        }
    }

    public final qg2.a c() {
        switch (b.f144688a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return new qg2.a(d(), false);
            case 4:
            case 5:
            case 6:
                return new qg2.a(d(), true);
            default:
                u0.r();
                return null;
        }
    }

    public final qg2.b d() {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        switch (b.f144688a[ordinal()]) {
            case 1:
                return new qg2.b(Float.valueOf(60.0f), Float.valueOf(120.0f), fValueOf2);
            case 2:
                return new qg2.b(fValueOf, Float.valueOf(25.0f), null);
            case 3:
                return new qg2.b(fValueOf, Float.valueOf(200.0f), fValueOf2);
            case 4:
            case 5:
            case 6:
                return new qg2.b(Float.valueOf(2.682f), Float.valueOf(3.35f), null);
            case 7:
                return new qg2.b(null, null, fValueOf2);
            default:
                u0.r();
                return null;
        }
    }

    public final ag2.c.a e() {
        switch (b.f144688a[ordinal()]) {
            case 1:
                return ag2.c.a.HEART_RATE;
            case 2:
                return ag2.c.a.SPEED;
            case 3:
                return ag2.c.a.POWER;
            case 4:
                return ag2.c.a.PACE;
            case 5:
                return ag2.c.a.GRADE_ADJUSTED_PACE;
            case 6:
                return ag2.c.a.ROW_PACE;
            case 7:
                return ag2.c.a.ELEVATION;
            default:
                u0.r();
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqg2/c$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: qg2.c$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2728a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f144687a;

            static {
                int[] iArr = new int[ag2.c.a.values().length];
                try {
                    iArr[ag2.c.a.ELEVATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ag2.c.a.HEART_RATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ag2.c.a.SPEED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ag2.c.a.POWER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ag2.c.a.ROW_PACE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ag2.c.a.GRADE_ADJUSTED_PACE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ag2.c.a.PACE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f144687a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
