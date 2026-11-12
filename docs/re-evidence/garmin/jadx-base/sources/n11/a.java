package n11;

import java.util.Locale;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 n11.a[], still in use, count: 1, list:
  (r0v1 n11.a[]) from 0x0026: CONSTRUCTOR (r0v1 n11.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln11/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    YES,
    NO,
    SYSTEM;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2309a f122205a = new C2309a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c f122210f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122211a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f122211a = iArr;
        }
    }

    static {
        f122210f = new c(new a[]{r0, r1, r2});
    }

    private a() {
        super(str, i);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f122209e.clone();
    }

    public final String a() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        return ((Object) d53.b.e(lowerCase.charAt(0))) + lowerCase.substring(1);
    }

    public final Boolean b() {
        int i14 = b.f122211a[ordinal()];
        if (i14 == 1) {
            return Boolean.TRUE;
        }
        if (i14 == 2) {
            return Boolean.FALSE;
        }
        if (i14 == 3) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX INFO: renamed from: n11.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln11/a$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2309a {
        public /* synthetic */ C2309a(j jVar) {
            this();
        }

        public static a a(Boolean bool) {
            if (s.g(bool, Boolean.TRUE)) {
                return a.YES;
            }
            if (s.g(bool, Boolean.FALSE)) {
                return a.NO;
            }
            if (bool == null) {
                return a.SYSTEM;
            }
            u0.r();
            return null;
        }

        private C2309a() {
        }
    }
}
