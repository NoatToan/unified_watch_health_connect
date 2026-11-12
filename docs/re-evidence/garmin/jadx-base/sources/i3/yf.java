package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Li3/yf;", "", "<init>", "()V", "Lg6/f;", "currentTabWidth", "indicatorOffset", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yf f90469a = new yf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90471c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.q<h4.r, p3.m, Integer, h4.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wf f90472a;

        public a(wf wfVar) {
            this.f90472a = wfVar;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0053  */
        @Override // e23.q
        public final h4.r invoke(h4.r rVar, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            num.intValue();
            mVar2.C(-1541271084);
            p3.x1 x1Var = p3.n.f135158a;
            wf wfVar = this.f90472a;
            float f14 = wfVar.f90135b;
            n3.h0 h0Var = n3.h0.DefaultSpatial;
            p3.x3 x3VarA = s1.f.a(f14, k9.b(h0Var, mVar2), null, mVar2, 0, 12);
            p3.x3 x3VarA2 = s1.f.a(wfVar.f90134a, k9.b(h0Var, mVar2), null, mVar2, 0, 12);
            h4.r rVarF = c2.x2.f(rVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.r rVarY = c2.x2.y(rVarF, h4.d.a.f81530h, 2);
            boolean zB = mVar2.B(x3VarA2);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new i5(x3VarA2, 2);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i5(x3VarA2, 2);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarU = c2.x2.u(c2.l.t(rVarY, (e23.l) objQ), ((g6.f) x3VarA.getF182175a()).f75997a);
            mVar2.f();
            return rVarU;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f90470b = 90;
        f90471c = 52;
    }

    private yf() {
    }

    @o13.e
    public static h4.r b(h4.r rVar, wf wfVar) {
        return h4.k.a(rVar, kotlin.k2.f91249a, new a(wfVar));
    }

    public final void a(float f14, final int i14, final int i15, long j8, final h4.r rVar, p3.m mVar) {
        final long jE;
        p3.o0 o0VarE = mVar.E(-1498258020);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.i(f14) ? 32 : 16;
        }
        int i18 = i16 | (((i15 & 4) == 0 && o0VarE.l(j8)) ? 256 : 128);
        if (o0VarE.n(i18 & 1, (i18 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if (i17 != 0) {
                    n3.q0.f123226a.getClass();
                    f14 = n3.q0.f123228c;
                }
                if ((i15 & 4) != 0) {
                    n3.q0.f123226a.getClass();
                    jE = k2.e(n3.q0.f123227b, o0VarE);
                }
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                c2.q.a(u1.n.e(c2.x2.h(c2.x2.f(rVar, 1.0f), f14), jE, o4.m1.f128891a), o0VarE, 0);
            } else {
                o0VarE.e();
            }
            jE = j8;
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            c2.q.a(u1.n.e(c2.x2.h(c2.x2.f(rVar, 1.0f), f14), jE, o4.m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
            jE = j8;
        }
        final float f15 = f14;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.xf
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    yf yfVar = yf.f90469a;
                    this.f90341a.a(f15, p3.p0.t(i14 | 1), i15, jE, rVar, mVar2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
