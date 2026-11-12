package n02;

import ds.e0;
import j23.t;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p3.n;
import p3.p1;
import p3.x1;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ln02/f;", "", "Ln02/g;", "unit", "", "distance", "Li53/d;", "Lj23/g;", "unitRanges", "", "fractionalPartPrecision", "", "convertDistanceWhenUnitChanges", "<init>", "(Ln02/g;DLi53/d;IZ)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f122169f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f122170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f122171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.d<g, j23.g<Double>> f122172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f122173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f122174e;

    public f(g gVar, double d14, i53.d dVar, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? g.KILOMETERS : gVar, (i15 & 2) != 0 ? 0.0d : d14, (i15 & 4) != 0 ? i53.a.b(new p(g.KILOMETERS, new j23.d(0.0d, 1000.0d)), new p(g.MILES, new j23.d(0.0d, 1000.0d))) : dVar, (i15 & 8) != 0 ? 2 : i14, (i15 & 16) != 0 ? true : z14);
    }

    public final double a() {
        return Math.pow(10.0d, this.f122173d);
    }

    public final i53.c<Integer> b() {
        i53.c<Integer> cVarE;
        j23.g<Double> gVar = this.f122172c.get(this.f122170a);
        if (gVar != null) {
            int iA = (int) (a() * (((Number) gVar.getStart()).doubleValue() - ((double) ((int) ((Number) gVar.getStart()).doubleValue()))));
            int iA2 = (int) (a() * (((Number) gVar.b()).doubleValue() - ((double) ((int) ((Number) gVar.b()).doubleValue()))));
            if (((int) ((Number) gVar.getStart()).doubleValue()) == ((int) ((Number) gVar.b()).doubleValue())) {
                cVarE = e0.h(iA, iA2);
            } else {
                int i14 = (int) this.f122171b;
                if (i14 == ((int) ((Number) gVar.b()).doubleValue())) {
                    cVarE = e0.h(0, iA2);
                } else {
                    cVarE = i14 == ((int) ((Number) gVar.getStart()).doubleValue()) ? i53.a.e(t.o(iA, (int) a())) : i53.a.e(t.o(0, (int) a()));
                }
            }
            if (cVarE != null) {
                return cVarE;
            }
        }
        return j53.l.b();
    }

    public final i53.c<Integer> c() {
        i53.c<Integer> cVarE;
        j23.g<Double> gVar = this.f122172c.get(this.f122170a);
        return (gVar == null || (cVarE = i53.a.e(new j23.l((int) ((Number) gVar.getStart()).doubleValue(), (int) ((Number) gVar.b()).doubleValue()))) == null) ? j53.l.b() : cVarE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f122170a == fVar.f122170a && Double.compare(this.f122171b, fVar.f122171b) == 0 && s.g(this.f122172c, fVar.f122172c) && this.f122173d == fVar.f122173d && this.f122174e == fVar.f122174e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122174e) + q2.d(this.f122173d, l2.b(this.f122172c, org.apache.commons.lang3.e.b(this.f122170a.hashCode() * 31, 31, this.f122171b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DistancePickerState(unit=");
        sb3.append(this.f122170a);
        sb3.append(", distance=");
        sb3.append(this.f122171b);
        sb3.append(", unitRanges=");
        sb3.append(this.f122172c);
        sb3.append(", fractionalPartPrecision=");
        sb3.append(this.f122173d);
        return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", convertDistanceWhenUnitChanges=", this.f122174e, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln02/f$a;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0035  */
        public static p1 a(f fVar, p3.m mVar) {
            fVar.getClass();
            x1 x1Var = n.f135158a;
            Object[] objArr = {fVar};
            i53.d<g, j23.g<Double>> dVar = fVar.f122172c;
            int i14 = fVar.f122173d;
            dVar.getClass();
            d4.l lVarB = d4.a.b(new ml0.a(26), new ap.b(dVar, i14, 13));
            boolean zB = mVar.B(fVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new mh1.i(fVar, 17);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new mh1.i(fVar, 17);
                    mVar.K(objQ);
                }
            }
            return (p1) d4.a.c(objArr, lVarB, (e23.a) objQ, mVar, 0);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(g gVar, double d14, i53.d<g, ? extends j23.g<Double>> dVar, int i14, boolean z14) {
        gVar.getClass();
        dVar.getClass();
        this.f122170a = gVar;
        this.f122171b = d14;
        this.f122172c = dVar;
        this.f122173d = i14;
        this.f122174e = z14;
    }

    public f() {
        this(null, 0.0d, null, 0, false, 31, null);
    }
}
