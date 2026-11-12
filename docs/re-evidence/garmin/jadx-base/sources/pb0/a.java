package pb0;

import c22.l3;
import gg1.o0;
import i63.c;
import i63.h;
import java.text.DecimalFormat;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.x;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lpb0/a;", "", "", "weightInGrams", "<init>", "(D)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IDLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f136828a;

    /* JADX INFO: renamed from: pb0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/presentation/profile/weight/model/WeightData.$serializer", "Lm63/e0;", "Lpb0/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C2594a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2594a f136829a;
        private static final k63.e descriptor;

        static {
            C2594a c2594a = new C2594a();
            f136829a = c2594a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.presentation.profile.weight.model.WeightData", c2594a, 1);
            m1Var.j("weightInGrams", false);
            descriptor = m1Var;
        }

        private C2594a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            return new c[]{x.f117036a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            double dT = 0.0d;
            boolean z14 = true;
            int i15 = 0;
            while (true) {
                u1 u1Var = null;
                if (!z14) {
                    cVarC.b(eVar2);
                    return new a(i15, dT, u1Var);
                }
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else {
                    if (iE != 0) {
                        hb.a.o(iE);
                        return null;
                    }
                    dT = cVarC.t(eVar2, 0);
                    i15 = 1;
                }
            }
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            dVarC.B(eVar, 0, aVar.f136828a);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, double d14, u1 u1Var) {
        if (1 == (i14 & 1)) {
            this.f136828a = d14;
        } else {
            k1.h(i14, 1, C2594a.f136829a.getF158591b());
            throw null;
        }
    }

    public final String a(o0 o0Var) {
        double dP1;
        o0Var.getClass();
        boolean zA = o0Var.a();
        DecimalFormat decimalFormat = l3.f23126d;
        double d14 = this.f136828a;
        if (zA) {
            l3.f23124b.getClass();
            dP1 = l3.a.P1(d14);
        } else {
            l3.f23124b.getClass();
            dP1 = d14 / 453.592d;
        }
        String str = decimalFormat.format(dP1);
        str.getClass();
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Double.compare(this.f136828a, ((a) obj).f136828a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f136828a);
    }

    public final String toString() {
        return "WeightData(weightInGrams=" + this.f136828a + ")";
    }

    /* JADX INFO: renamed from: pb0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpb0/a$b;", "", "<init>", "()V", "Li63/c;", "Lpb0/a;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final c<a> serializer() {
            return C2594a.f136829a;
        }

        private Companion() {
        }
    }

    public a(double d14) {
        this.f136828a = d14;
    }
}
