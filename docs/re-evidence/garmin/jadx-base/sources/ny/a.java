package ny;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ny.a[], still in use, count: 1, list:
  (r0v1 ny.a[]) from 0x0022: CONSTRUCTOR (r0v1 ny.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lny/a;", "", "", "mLabelRes", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    ACTIVE_CALORIES(R.string.lbl_active_calories),
    RESTING_CALORIES(R.string.lbl_calories_details_resting);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2460a f128281b = new C2460a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f128285f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128286a;

    static {
        f128285f = new w13.c(new a[]{r0, r1});
    }

    private a(int i14) {
        super(str, i);
        this.f128286a = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f128284e.clone();
    }

    /* JADX INFO: renamed from: ny.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lny/a$a;", "", "<init>", "()V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2460a {

        /* JADX INFO: renamed from: ny.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2461a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f128287a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ACTIVE_CALORIES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.RESTING_CALORIES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f128287a = iArr;
            }
        }

        public /* synthetic */ C2460a(j jVar) {
            this();
        }

        public static long a(a aVar, m mVar) {
            aVar.getClass();
            x1 x1Var = n.f135158a;
            int i14 = C2461a.f128287a[aVar.ordinal()];
            if (i14 == 1) {
                mVar.C(-144851140);
                gl.c.f77766a.getClass();
                long jL = gl.c.a(mVar).l();
                mVar.f();
                return jL;
            }
            if (i14 != 2) {
                throw n23.j.m(mVar, -144853137);
            }
            mVar.C(-144849059);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(mVar).b();
            mVar.f();
            return jB;
        }

        private C2460a() {
        }
    }
}
