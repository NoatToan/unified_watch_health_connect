package bw0;

import gl.c;
import n23.j;
import p3.m;
import p3.n;
import p3.x1;
import pv0.s;
import pv0.y;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21567a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21567a = iArr;
        }
    }

    public static final long a(y yVar, m mVar) {
        yVar.getClass();
        x1 x1Var = n.f135158a;
        if (yVar == y.b.COFFEE) {
            mVar.C(-889650470);
            c.f77766a.getClass();
            long jB = c.a(mVar).b();
            mVar.f();
            return jB;
        }
        if (yVar == y.b.TEA) {
            mVar.C(-889648740);
            c.f77766a.getClass();
            long jH = c.a(mVar).h();
            mVar.f();
            return jH;
        }
        if (yVar == y.b.SODA) {
            mVar.C(-889646916);
            c.f77766a.getClass();
            long jR = c.a(mVar).r();
            mVar.f();
            return jR;
        }
        if (yVar == y.b.ENERGY_DRINK) {
            mVar.C(-889644835);
            c.f77766a.getClass();
            long jE = c.a(mVar).e();
            mVar.f();
            return jE;
        }
        if (yVar == y.b.OTHER) {
            mVar.C(-889642948);
            c.f77766a.getClass();
            long jP = c.a(mVar).p();
            mVar.f();
            return jP;
        }
        if (yVar == y.a.BEER) {
            mVar.C(-889641126);
            c.f77766a.getClass();
            long jB2 = c.a(mVar).b();
            mVar.f();
            return jB2;
        }
        if (yVar == y.a.WINE) {
            mVar.C(-889639396);
            c.f77766a.getClass();
            long jH2 = c.a(mVar).h();
            mVar.f();
            return jH2;
        }
        if (yVar == y.a.SPIRIT) {
            mVar.C(-889637540);
            c.f77766a.getClass();
            long jR2 = c.a(mVar).r();
            mVar.f();
            return jR2;
        }
        if (yVar != y.a.OTHER) {
            throw j.m(mVar, -889651830);
        }
        mVar.C(-889635716);
        c.f77766a.getClass();
        long jP2 = c.a(mVar).p();
        mVar.f();
        return jP2;
    }
}
