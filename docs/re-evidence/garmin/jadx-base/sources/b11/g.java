package b11;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import java.util.Iterator;
import p005kotlin.Metadata;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b11.g[], still in use, count: 1, list:
  (r0v1 b11.g[]) from 0x003c: CONSTRUCTOR (r0v1 b11.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lb11/g;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    BREAKFAST("BREAKFAST", R.string.breakfast),
    LUNCH("LUNCH", R.string.lunch),
    DINNER("DINNER", R.string.dinner),
    SNACKS("SNACKS", R.string.snacks);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14285c = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f14291i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14293b;

    static {
        f14291i = new w13.c(new g[]{r0, r1, r2, r3});
    }

    private g(String str, int i14) {
        super(str, i);
        this.f14292a = str;
        this.f14293b = i14;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f14290h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb11/g$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: b11.g$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0206a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14294a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.BREAKFAST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.LUNCH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.DINNER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[g.SNACKS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f14294a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(String str, p3.m mVar) {
            Object next;
            str.getClass();
            x1 x1Var = p3.n.f135158a;
            Iterator<T> it = g.f14291i.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((g) next).f14292a, str));
            g gVar = (g) next;
            Integer numValueOf = gVar != null ? Integer.valueOf(gVar.f14293b) : null;
            if (numValueOf == null) {
                mVar.C(1833146385);
            } else {
                mVar.C(1833187770);
                str = y.Q(mVar, numValueOf.intValue());
            }
            mVar.f();
            x1 x1Var2 = p3.n.f135158a;
            return str;
        }

        private a() {
        }
    }
}
