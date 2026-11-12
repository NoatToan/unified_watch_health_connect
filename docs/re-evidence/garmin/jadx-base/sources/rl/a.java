package rl;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import j23.p;
import j23.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.x1;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rl.a[], still in use, count: 1, list:
  (r0v1 rl.a[]) from 0x0063: CONSTRUCTOR (r0v1 rl.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lrl/a;", "", "Lj23/r;", "", "range", "", "colorResId", "<init>", "(Ljava/lang/String;ILj23/r;I)V", "a", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    HARMFUL(new p(0.0d, 70.0d), R.color.gds_data_viz_red_primary),
    LOW(new p(70.0d, 80.0d), R.color.gds_data_viz_orange_primary),
    MODERATE(new p(80.0d, 90.0d), R.color.gds_data_viz_orange_secondary),
    NORMAL(new p(90.0d, 100.01d), R.color.gds_data_viz_green_primary);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2902a f153389c = new C2902a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c f153395i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<Double> f153396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153397b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153398a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HARMFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f153398a = iArr;
        }
    }

    static {
        f153395i = new c(new a[]{r0, r1, r2, r3});
    }

    private a(r rVar, int i14) {
        super(str, i);
        this.f153396a = rVar;
        this.f153397b = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f153394h.clone();
    }

    public final String a(m mVar) {
        x1 x1Var = n.f135158a;
        if (b.f153398a[ordinal()] == 1) {
            mVar.C(-2090398242);
            String strP = y.P(R.string.less_than_string_pattern, new Object[]{y.P(R.string.lbl_percentage, new Object[]{Integer.valueOf((int) ((Number) HARMFUL.f153396a.c()).doubleValue())}, mVar)}, mVar);
            mVar.f();
            return strP;
        }
        mVar.C(-2090391631);
        r<Double> rVar = this.f153396a;
        String strP2 = y.P(R.string.string_line_string_pattern_no_space, new Object[]{String.valueOf((int) ((Number) rVar.getStart()).doubleValue()), y.P(R.string.lbl_percentage, new Object[]{Integer.valueOf((int) ((Number) rVar.c()).doubleValue())}, mVar)}, mVar);
        mVar.f();
        return strP2;
    }

    /* JADX INFO: renamed from: rl.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrl/a$a;", "", "<init>", "()V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2902a {
        public /* synthetic */ C2902a(j jVar) {
            this();
        }

        public static a a(double d14) {
            a aVar = a.HARMFUL;
            if (!aVar.f153396a.contains(Double.valueOf(d14))) {
                a aVar2 = a.LOW;
                if (aVar2.f153396a.contains(Double.valueOf(d14))) {
                    return aVar2;
                }
                a aVar3 = a.MODERATE;
                if (aVar3.f153396a.contains(Double.valueOf(d14))) {
                    return aVar3;
                }
                a aVar4 = a.NORMAL;
                if (aVar4.f153396a.contains(Double.valueOf(d14)) || d14 >= ((Number) aVar.f153396a.getStart()).doubleValue()) {
                    return aVar4;
                }
            }
            return aVar;
        }

        private C2902a() {
        }
    }
}
