package ao0;

import in0.h;
import java.util.ArrayList;
import lc.u0;
import p3.m;
import p3.n;
import p3.x1;
import z72.l;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11534a;

        static {
            int[] iArr = new int[h.a.C1802a.EnumC1803a.values().length];
            try {
                iArr[h.a.C1802a.EnumC1803a.BELOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.C1802a.EnumC1803a.IN_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.C1802a.EnumC1803a.ABOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11534a = iArr;
        }
    }

    public static final i53.c<l> a(boolean z14, h.a.C1802a.EnumC1803a enumC1803a, m mVar, int i14, int i15) {
        if ((i15 & 1) != 0) {
            z14 = true;
        }
        if ((i15 & 2) != 0) {
            enumC1803a = null;
        }
        x1 x1Var = n.f135158a;
        mVar.C(1277792147);
        ArrayList arrayList = new ArrayList();
        zn0.a.f205390a.getClass();
        gl.c cVar = gl.c.f77766a;
        cVar.getClass();
        arrayList.add(new l(0.19999999f, c(gl.c.a(mVar).h(), h.a.C1802a.EnumC1803a.BELOW, enumC1803a, mVar), null));
        cVar.getClass();
        long jC = c(gl.c.a(mVar).c(), h.a.C1802a.EnumC1803a.IN_RANGE, enumC1803a, mVar);
        if (z14) {
            mVar.C(190200993);
            arrayList.add(new l(0.6f, jC, null));
            cVar.getClass();
            arrayList.add(new l(0.19999999f, c(gl.c.a(mVar).h(), h.a.C1802a.EnumC1803a.ABOVE, enumC1803a, mVar), null));
            mVar.f();
        } else {
            mVar.C(190906553);
            mVar.f();
            arrayList.add(new l(0.8f, jC, null));
        }
        mVar.f();
        return i53.a.e(arrayList);
    }

    public static final float b(double d14, h.a.C1802a.EnumC1803a enumC1803a, boolean z14) {
        float f14 = ((float) d14) / 100.0f;
        int i14 = a.f11534a[enumC1803a.ordinal()];
        if (i14 == 1) {
            return f14 * 0.19999999f;
        }
        if (i14 == 2) {
            return ((z14 ? 0.6f : 0.8f) * f14) + 0.19999999f;
        }
        if (i14 == 3) {
            return (f14 * 0.19999999f) + 0.8f;
        }
        u0.r();
        return 0.0f;
    }

    public static final long c(long j8, h.a.C1802a.EnumC1803a enumC1803a, h.a.C1802a.EnumC1803a enumC1803a2, m mVar) {
        x1 x1Var = n.f135158a;
        if (enumC1803a2 == null || enumC1803a2 == enumC1803a) {
            mVar.C(533829014);
        } else {
            mVar.C(533830433);
            zn0.a.f205390a.getClass();
            gl.c.f77766a.getClass();
            j8 = gl.c.a(mVar).g();
        }
        mVar.f();
        return j8;
    }
}
