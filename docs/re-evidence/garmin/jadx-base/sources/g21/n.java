package g21;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 g21.n[], still in use, count: 1, list:
  (r0v1 g21.n[]) from 0x0030: CONSTRUCTOR (r0v1 g21.n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg21/n;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {
    PROTEIN,
    FAT,
    CARBS,
    OTHER;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f75455a = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f75461g;

    static {
        f75461g = new w13.c(new n[]{r0, r1, r2, r3});
    }

    private n() {
        super(str, i);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f75460f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg21/n$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: g21.n$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1518a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75462a;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.PROTEIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n.FAT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n.CARBS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n.OTHER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f75462a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(n nVar, p3.m mVar) {
            int i14;
            int i15;
            nVar.getClass();
            x1 x1Var = p3.n.f135158a;
            int i16 = C1518a.f75462a[nVar.ordinal()];
            if (i16 == 1) {
                i14 = -91488728;
                i15 = R.string.avg_protein;
            } else if (i16 == 2) {
                i14 = -91486812;
                i15 = R.string.avg_fat;
            } else if (i16 == 3) {
                i14 = -91484954;
                i15 = R.string.avg_carbs;
            } else {
                if (i16 != 4) {
                    throw n23.j.m(mVar, -91489799);
                }
                i14 = -91483024;
                i15 = R.string.pregnancy_other_avg;
            }
            return sn.a.h(mVar, i14, i15, mVar);
        }

        public static long b(n nVar, p3.m mVar) {
            nVar.getClass();
            x1 x1Var = p3.n.f135158a;
            int i14 = C1518a.f75462a[nVar.ordinal()];
            if (i14 == 1) {
                mVar.C(1151410725);
                f02.u.f67749a.getClass();
                long jG = f02.u.g(mVar);
                mVar.f();
                return jG;
            }
            if (i14 == 2) {
                mVar.C(1151412481);
                f02.u.f67749a.getClass();
                long jF = f02.u.f(mVar);
                mVar.f();
                return jF;
            }
            if (i14 == 3) {
                mVar.C(1151414179);
                f02.u.f67749a.getClass();
                long jE = f02.u.e(mVar);
                mVar.f();
                return jE;
            }
            if (i14 != 4) {
                throw n23.j.m(mVar, 1151409040);
            }
            mVar.C(1151415939);
            f02.u.f67749a.getClass();
            gl.c.f77766a.getClass();
            long jM = gl.c.a(mVar).m();
            mVar.f();
            return jM;
        }

        public static String c(n nVar, p3.m mVar) {
            int i14;
            int i15;
            nVar.getClass();
            x1 x1Var = p3.n.f135158a;
            int i16 = C1518a.f75462a[nVar.ordinal()];
            if (i16 == 1) {
                i14 = -1626912891;
                i15 = R.string.protein;
            } else if (i16 == 2) {
                i14 = -1626910943;
                i15 = R.string.fat;
            } else if (i16 == 3) {
                i14 = -1626909053;
                i15 = R.string.carbs;
            } else {
                if (i16 != 4) {
                    throw n23.j.m(mVar, -1626913965);
                }
                i14 = -1626907097;
                i15 = R.string.lbl_other;
            }
            return sn.a.h(mVar, i14, i15, mVar);
        }

        public static String d(n nVar, p3.m mVar) {
            nVar.getClass();
            x1 x1Var = p3.n.f135158a;
            int i14 = C1518a.f75462a[nVar.ordinal()];
            if (i14 == 1) {
                return sn.a.h(mVar, 1368369699, R.string.unit_g, mVar);
            }
            if (i14 == 2) {
                return sn.a.h(mVar, 1368371459, R.string.unit_g, mVar);
            }
            if (i14 == 3) {
                return sn.a.h(mVar, 1368373283, R.string.unit_g, mVar);
            }
            if (i14 == 4) {
                return sn.a.h(mVar, 1368375122, R.string.calories_abbreviation, mVar);
            }
            throw n23.j.m(mVar, 1368368626);
        }

        private a() {
        }
    }
}
