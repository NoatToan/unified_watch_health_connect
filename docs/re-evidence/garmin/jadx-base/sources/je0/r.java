package je0;

import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lje0/r;", "", "", "count", "", "min", "max", "avg", "sum", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class r {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f98566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f98567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f98568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f98569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f98570e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/domaindogs/data/model/StatsSummaryDTO.$serializer", "Lm63/e0;", "Lje0/r;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f98571a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f98571a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.domaindogs.data.model.StatsSummaryDTO", aVar, 5);
            m1Var.j("count", true);
            m1Var.j("min", true);
            m1Var.j("max", true);
            m1Var.j("avg", true);
            m1Var.j("sum", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(m0.f116981a);
            x xVar = x.f117036a;
            return new i63.c[]{cVarD, j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Integer num = null;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                    i15 |= 1;
                } else if (iE == 1) {
                    d14 = (Double) cVarC.v(eVar2, 1, x.f117036a, d14);
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
            return new r(i15, num, d14, d15, d16, d17, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            r rVar = (r) obj;
            rVar.getClass();
            Double d14 = rVar.f98570e;
            Double d15 = rVar.f98569d;
            Double d16 = rVar.f98568c;
            Double d17 = rVar.f98567b;
            Integer num = rVar.f98566a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 0, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || d17 != null) {
                dVarC.d(eVar, 1, x.f117036a, d17);
            }
            if (dVarC.C(eVar) || d16 != null) {
                dVarC.d(eVar, 2, x.f117036a, d16);
            }
            if (dVarC.C(eVar) || d15 != null) {
                dVarC.d(eVar, 3, x.f117036a, d15);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 4, x.f117036a, d14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ r(int i14, Integer num, Double d14, Double d15, Double d16, Double d17, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f98566a = null;
        } else {
            this.f98566a = num;
        }
        if ((i14 & 2) == 0) {
            this.f98567b = null;
        } else {
            this.f98567b = d14;
        }
        if ((i14 & 4) == 0) {
            this.f98568c = null;
        } else {
            this.f98568c = d15;
        }
        if ((i14 & 8) == 0) {
            this.f98569d = null;
        } else {
            this.f98569d = d16;
        }
        if ((i14 & 16) == 0) {
            this.f98570e = null;
        } else {
            this.f98570e = d17;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f98566a, rVar.f98566a) && p005kotlin.jvm.internal.s.g(this.f98567b, rVar.f98567b) && p005kotlin.jvm.internal.s.g(this.f98568c, rVar.f98568c) && p005kotlin.jvm.internal.s.g(this.f98569d, rVar.f98569d) && p005kotlin.jvm.internal.s.g(this.f98570e, rVar.f98570e);
    }

    public final int hashCode() {
        Integer num = this.f98566a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f98567b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f98568c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f98569d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f98570e;
        return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = u0.m("StatsSummaryDTO(count=", this.f98566a, ", min=", this.f98567b, ", max=");
        b71.i.p(this.f98568c, this.f98569d, ", avg=", ", sum=", sbM);
        return b71.i.g(sbM, this.f98570e, ")");
    }

    /* JADX INFO: renamed from: je0.r$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/r$b;", "", "<init>", "()V", "Li63/c;", "Lje0/r;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<r> serializer() {
            return a.f98571a;
        }

        private Companion() {
        }
    }

    public r() {
        this((Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, 31, (p005kotlin.jvm.internal.j) null);
    }

    public r(Integer num, Double d14, Double d15, Double d16, Double d17) {
        this.f98566a = num;
        this.f98567b = d14;
        this.f98568c = d15;
        this.f98569d = d16;
        this.f98570e = d17;
    }

    public /* synthetic */ r(Integer num, Double d14, Double d15, Double d16, Double d17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : d17);
    }
}
