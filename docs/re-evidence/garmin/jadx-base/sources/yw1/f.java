package yw1;

import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lyw1/f;", "", "", "avg", "", "count", "max", "min", "sum", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f199914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f199915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f199916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f199917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f199918e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/FBTActivityStatsItem.$serializer", "Lm63/e0;", "Lyw1/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199919a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199919a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.FBTActivityStatsItem", aVar, 5);
            m1Var.j("avg", false);
            m1Var.j("count", false);
            m1Var.j("max", false);
            m1Var.j("min", false);
            m1Var.j("sum", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            x xVar = x.f117036a;
            return new i63.c[]{j63.a.d(xVar), j63.a.d(m0.f116981a), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Double d14 = null;
            Integer num = null;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    d14 = (Double) cVarC.v(eVar2, 0, x.f117036a, d14);
                    i15 |= 1;
                } else if (iE == 1) {
                    num = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num);
                    i15 |= 2;
                } else if (iE == 2) {
                    d15 = (Double) cVarC.v(eVar2, 2, x.f117036a, d15);
                    i15 |= 4;
                } else if (iE == 3) {
                    d16 = (Double) cVarC.v(eVar2, 3, x.f117036a, d16);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    d17 = (Double) cVarC.v(eVar2, 4, x.f117036a, d17);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new f(i15, d14, num, d15, d16, d17, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f fVar2 = (f) obj;
            fVar2.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            x xVar = x.f117036a;
            dVarC.d(eVar, 0, xVar, fVar2.f199914a);
            dVarC.d(eVar, 1, m0.f116981a, fVar2.f199915b);
            dVarC.d(eVar, 2, xVar, fVar2.f199916c);
            dVarC.d(eVar, 3, xVar, fVar2.f199917d);
            dVarC.d(eVar, 4, xVar, fVar2.f199918e);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ f(int i14, Double d14, Integer num, Double d15, Double d16, Double d17, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, a.f199919a.getF158591b());
            throw null;
        }
        this.f199914a = d14;
        this.f199915b = num;
        this.f199916c = d15;
        this.f199917d = d16;
        this.f199918e = d17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f199914a, fVar.f199914a) && p005kotlin.jvm.internal.s.g(this.f199915b, fVar.f199915b) && p005kotlin.jvm.internal.s.g(this.f199916c, fVar.f199916c) && p005kotlin.jvm.internal.s.g(this.f199917d, fVar.f199917d) && p005kotlin.jvm.internal.s.g(this.f199918e, fVar.f199918e);
    }

    public final int hashCode() {
        Double d14 = this.f199914a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Integer num = this.f199915b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d15 = this.f199916c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f199917d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f199918e;
        return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTActivityStatsItem(avg=");
        sb3.append(this.f199914a);
        sb3.append(", count=");
        sb3.append(this.f199915b);
        sb3.append(", max=");
        b71.i.p(this.f199916c, this.f199917d, ", min=", ", sum=", sb3);
        return b71.i.g(sb3, this.f199918e, ")");
    }

    /* JADX INFO: renamed from: yw1.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/f$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/f;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f199919a;
        }

        private Companion() {
        }
    }

    public f(Double d14, Integer num, Double d15, Double d16, Double d17) {
        this.f199914a = d14;
        this.f199915b = num;
        this.f199916c = d15;
        this.f199917d = d16;
        this.f199918e = d17;
    }
}
