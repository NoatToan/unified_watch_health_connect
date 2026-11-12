package dv1;

import gg1.o0;
import java.util.List;
import jv1.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import zf.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldv1/a;", "", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    static {
        new C1304a(null);
    }

    public static List a(Double d14, o0 o0Var) {
        o0Var.getClass();
        if (!b.D(d14) || d14.doubleValue() <= 0.0d) {
            return null;
        }
        double d15 = (o0Var == o0.METRIC || o0Var == o0.STATUTE_UK) ? 1.0d : 3.2808399d;
        double d16 = 10;
        double dRint = Math.rint(Math.abs(((d14.doubleValue() * 0.005d) * d15) / d16)) * d16;
        double dRint2 = Math.rint(Math.abs(((d14.doubleValue() * 0.01d) * d15) / d16)) * d16;
        double dRint3 = Math.rint(Math.abs(((d14.doubleValue() * 0.017d) * d15) / d16)) * d16;
        double d17 = 1;
        return x.k(new o.b(0.0d, dRint), new o.d(dRint + d17, dRint2), new o.c(dRint2 + d17, dRint3), new o.e(dRint3 + d17, Double.MAX_VALUE), new o.a());
    }

    /* JADX INFO: renamed from: dv1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ldv1/a$a;", "", "<init>", "()V", "", "FLAT_UPPER_INCLINE", "D", "SOMEWHAT_HILLY_UPPER_INCLINE", "HILLY_UPPER_INCLINE", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1304a {
        public /* synthetic */ C1304a(j jVar) {
            this();
        }

        private C1304a() {
        }
    }
}
