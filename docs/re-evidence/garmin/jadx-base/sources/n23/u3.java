package n23;

/* JADX INFO: loaded from: classes3.dex */
public final class u3 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122638a;

        static {
            int[] iArr = new int[p43.g2.values().length];
            try {
                iArr[p43.g2.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p43.g2.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p43.g2.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f122638a = iArr;
        }
    }

    public static final f2<?> a(t23.e eVar) {
        Class<?> clsI = s4.i(eVar);
        f2<?> f2Var = (f2) (clsI != null ? p005kotlin.jvm.internal.s0.f105811a.b(clsI) : null);
        if (f2Var != null) {
            return f2Var;
        }
        j.r(eVar.d(), "Type parameter container is not resolved: ");
        return null;
    }
}
