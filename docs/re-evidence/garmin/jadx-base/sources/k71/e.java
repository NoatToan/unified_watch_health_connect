package k71;

import ch.qos.logback.core.net.SyslogConstants;
import e23.l;
import f72.id;
import g02.i;
import h4.r;
import o4.d0;
import o4.g1;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import q4.k;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103288a;

        static {
            int[] iArr = new int[o61.d.values().length];
            try {
                iArr[o61.d.DASHED_OUTLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o61.d.OUTLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103288a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    public static final void a(r rVar, long j8, long j14, o61.d dVar, float f14, m mVar, int i14) {
        r rVar2;
        long j15;
        k kVar;
        dVar.getClass();
        o0 o0VarE = mVar.E(-447396339);
        int i15 = i14 | 6 | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.l(j14) ? 256 : 128) | (o0VarE.k(dVar.ordinal()) ? 2048 : 1024) | (o0VarE.i(f14) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            if (dVar == o61.d.FILL_COLOR) {
                j15 = j14;
            } else {
                d0.f128823b.getClass();
                j15 = d0.f128831j;
            }
            int i16 = a.f103288a[dVar.ordinal()];
            if (i16 != 1) {
                kVar = i16 != 2 ? new k(0.0f, 0.0f, 0, 0, null, 31, null) : new k(4.0f, 0.0f, 0, 0, null, 30, null);
            } else {
                g1.f128855a.getClass();
                kVar = new k(4.0f, 0.0f, 0, 0, g1.a.a(10.0f, new float[]{10.0f, 10.0f}), 14, null);
            }
            s62.a.f157643a.getClass();
            u4.d dVarA = id.a(t62.c.f162799a);
            int i17 = 57344 & i15;
            boolean zR = ((i15 & 7168) == 2048) | (i17 == 16384) | ((i15 & 896) == 256) | o0VarE.r(kVar);
            Object objQ = o0VarE.q();
            if (zR) {
                cd1.c cVar = new cd1.c(dVar, f14, j14, kVar);
                o0VarE.K(cVar);
                objQ = cVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    cd1.c cVar2 = new cd1.c(dVar, f14, j14, kVar);
                    o0VarE.K(cVar2);
                    objQ = cVar2;
                }
            }
            i.a(aVar, dVarA, j8, j15, f14, 0.0f, (l) objQ, o0VarE, ((i15 << 3) & 896) | 6 | i17, SyslogConstants.LOG_LOCAL4);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar2, j8, j14, dVar, f14, i14);
        }
    }
}
