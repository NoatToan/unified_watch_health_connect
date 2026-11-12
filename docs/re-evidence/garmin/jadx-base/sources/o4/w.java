package o4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lo4/w;", "", "<init>", "()V", "a", "Lo4/p1;", "Lo4/t1;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f129023a = new a(null);

    private w() {
        n4.g.f123559b.getClass();
    }

    public abstract void a(float f14, long j8, d1 d1Var);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/w$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static z0 a(o13.p[] pVarArr, float f14, float f15) {
            o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            return d(pVarArr2, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), 0);
        }

        public static z0 b(a aVar, List list, float f14, float f15, int i14) {
            float f16 = (i14 & 2) != 0 ? 0.0f : f14;
            float f17 = (i14 & 4) != 0 ? Float.POSITIVE_INFINITY : f15;
            x1.f129034b.getClass();
            aVar.getClass();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            return new z0(list, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0, null);
        }

        public static z0 c(a aVar, o13.p[] pVarArr, float f14, float f15, int i14) {
            if ((i14 & 2) != 0) {
                f14 = 0.0f;
            }
            if ((i14 & 4) != 0) {
                f15 = Float.POSITIVE_INFINITY;
            }
            x1.f129034b.getClass();
            aVar.getClass();
            return a(pVarArr, f14, f15);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static z0 d(o13.p[] pVarArr, long j8, long j14, int i14) {
            ArrayList arrayList = new ArrayList(pVarArr.length);
            for (o13.p pVar : pVarArr) {
                arrayList.add(d0.a(((d0) pVar.f128595b).f128833a));
            }
            ArrayList arrayList2 = new ArrayList(pVarArr.length);
            for (o13.p pVar2 : pVarArr) {
                arrayList2.add(Float.valueOf(((Number) pVar2.f128594a).floatValue()));
            }
            return new z0(arrayList, arrayList2, j8, j14, i14, null);
        }

        public static z0 e(a aVar, o13.p[] pVarArr) {
            n4.c.a aVar2 = n4.c.f123541b;
            aVar2.getClass();
            aVar2.getClass();
            long j8 = n4.c.f123542c;
            aVar.getClass();
            return d(pVarArr, 0L, j8, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static k1 f(a aVar, o13.p[] pVarArr, long j8, float f14, int i14) {
            if ((i14 & 2) != 0) {
                n4.c.f123541b.getClass();
                j8 = n4.c.f123543d;
            }
            long j14 = j8;
            if ((i14 & 4) != 0) {
                f14 = Float.POSITIVE_INFINITY;
            }
            float f15 = f14;
            x1.f129034b.getClass();
            aVar.getClass();
            ArrayList arrayList = new ArrayList(pVarArr.length);
            for (o13.p pVar : pVarArr) {
                arrayList.add(d0.a(((d0) pVar.f128595b).f128833a));
            }
            ArrayList arrayList2 = new ArrayList(pVarArr.length);
            for (o13.p pVar2 : pVarArr) {
                arrayList2.add(Float.valueOf(((Number) pVar2.f128594a).floatValue()));
            }
            return new k1(arrayList, arrayList2, j14, f15, 0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static w1 g(a aVar, o13.p[] pVarArr) {
            n4.c.f123541b.getClass();
            long j8 = n4.c.f123543d;
            aVar.getClass();
            ArrayList arrayList = new ArrayList(pVarArr.length);
            for (o13.p pVar : pVarArr) {
                arrayList.add(d0.a(((d0) pVar.f128595b).f128833a));
            }
            ArrayList arrayList2 = new ArrayList(pVarArr.length);
            for (o13.p pVar2 : pVarArr) {
                arrayList2.add(Float.valueOf(((Number) pVar2.f128594a).floatValue()));
            }
            return new w1(j8, arrayList, arrayList2, null);
        }

        public static z0 h(o13.p[] pVarArr, float f14, float f15) {
            o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            return d(pVarArr2, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), 0);
        }

        public static z0 i(a aVar, List list, float f14, int i14) {
            float f15 = (i14 & 2) != 0 ? 0.0f : f14;
            x1.f129034b.getClass();
            aVar.getClass();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            return new z0(list, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 0, null);
        }

        public static z0 j(a aVar, o13.p[] pVarArr) {
            x1.f129034b.getClass();
            aVar.getClass();
            return h(pVarArr, 0.0f, Float.POSITIVE_INFINITY);
        }

        private a() {
        }
    }

    public /* synthetic */ w(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
