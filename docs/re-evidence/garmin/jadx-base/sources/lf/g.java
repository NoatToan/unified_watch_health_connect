package lf;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llf/g;", "", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f112092a = new g();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112093a;

        static {
            int[] iArr = new int[xf.f.values().length];
            try {
                iArr[xf.f.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xf.f.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112093a = iArr;
        }
    }

    private g() {
    }

    public static final long a(int i14, int i15, xf.g gVar, xf.f fVar, xf.g gVar2) {
        int i16;
        int i17;
        if (!p005kotlin.jvm.internal.s.g(gVar, xf.g.f190618c)) {
            xf.a aVar = gVar.f190619a;
            f112092a.getClass();
            i14 = c(aVar, fVar);
            i15 = c(gVar.f190620b, fVar);
        }
        xf.a aVar2 = gVar2.f190619a;
        xf.a aVar3 = gVar2.f190620b;
        if (aVar2 instanceof xf.a.C3547a) {
            dg.t.a aVar4 = dg.t.f59501a;
            if (i14 != Integer.MIN_VALUE && i14 != Integer.MAX_VALUE && i14 > (i17 = ((xf.a.C3547a) aVar2).f190607a)) {
                i14 = i17;
            }
        }
        if (aVar3 instanceof xf.a.C3547a) {
            dg.t.a aVar5 = dg.t.f59501a;
            if (i15 != Integer.MIN_VALUE && i15 != Integer.MAX_VALUE && i15 > (i16 = ((xf.a.C3547a) aVar3).f190607a)) {
                i15 = i16;
            }
        }
        return (((long) i15) & 4294967295L) | (((long) i14) << 32);
    }

    public static final double b(int i14, int i15, int i16, int i17, xf.f fVar) {
        double d14 = ((double) i16) / ((double) i14);
        double d15 = ((double) i17) / ((double) i15);
        int i18 = a.f112093a[fVar.ordinal()];
        if (i18 == 1) {
            return Math.max(d14, d15);
        }
        if (i18 == 2) {
            return Math.min(d14, d15);
        }
        u0.r();
        return 0.0d;
    }

    public static int c(xf.a aVar, xf.f fVar) {
        if (aVar instanceof xf.a.C3547a) {
            return ((xf.a.C3547a) aVar).f190607a;
        }
        int i14 = a.f112093a[fVar.ordinal()];
        if (i14 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i14 == 2) {
            return Integer.MAX_VALUE;
        }
        u0.r();
        return 0;
    }
}
