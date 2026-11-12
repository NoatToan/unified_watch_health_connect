package l72;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l72.b2[], still in use, count: 1, list:
  (r0v1 l72.b2[]) from 0x0030: CONSTRUCTOR (r0v1 l72.b2[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll72/b2;", "", "<init>", "(Ljava/lang/String;I)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b2 {
    XSMALL,
    SMALL,
    MEDIUM,
    LARGE;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f110918f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110919a;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.XSMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b2.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b2.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f110919a = iArr;
        }
    }

    static {
        f110918f = new w13.c(b2VarArr);
    }

    private b2() {
        super(str, i);
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) f110917e.clone();
    }

    public final float a() {
        p3.x1 x1Var = p3.n.f135158a;
        int i14 = a.f110919a[ordinal()];
        if (i14 == 1) {
            float f14 = 20;
            g6.f.a aVar = g6.f.f75994b;
            return f14;
        }
        if (i14 == 2) {
            float f15 = 24;
            g6.f.a aVar2 = g6.f.f75994b;
            return f15;
        }
        if (i14 == 3) {
            float f16 = 34;
            g6.f.a aVar3 = g6.f.f75994b;
            return f16;
        }
        if (i14 != 4) {
            lc.u0.r();
            return 0.0f;
        }
        float f17 = 48;
        g6.f.a aVar4 = g6.f.f75994b;
        return f17;
    }
}
