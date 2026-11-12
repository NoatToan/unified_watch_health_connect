package s70;

import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/q;", "Lr70/r;", "Ly70/c;", "stateHolder", "<init>", "(Ly70/c;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.c f157778a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157779a;

        static {
            int[] iArr = new int[o70.d.values().length];
            try {
                iArr[o70.d.BLUETOOTH_PERMISSION_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.d.BLUETOOTH_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f157779a = iArr;
        }
    }

    public q(y70.c cVar) {
        cVar.getClass();
        this.f157778a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 1225184764);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            p3.x1 x1Var = p3.n.f135158a;
            n70.t tVar = this.f157778a.f194653a;
            o70.d dVar = (o70.d) s9.c.b(new r53.u1(tVar.f124575b.a(), tVar.f124576c, new n70.s(tVar, null)), null, o0VarQ, 48).getF182175a();
            if (dVar == null) {
                o0VarQ.C(847406747);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(847406748);
                int i16 = a.f157779a[dVar.ordinal()];
                if (i16 == 1) {
                    o0VarQ.C(165148144);
                    boolean zR = o0VarQ.r(this);
                    Object objQ = o0VarQ.q();
                    if (zR) {
                        objQ = new ro0.g(this, 11);
                        o0VarQ.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ro0.g(this, 11);
                            o0VarQ.K(objQ);
                        }
                    }
                    s.c(i15 & 14, (e23.a) objQ, rVar, o0VarQ);
                    o0VarQ.g0(false);
                } else {
                    if (i16 != 2) {
                        throw kg.f.h(o0VarQ, 165145788, false);
                    }
                    o0VarQ.C(165152594);
                    s.b(rVar, o0VarQ, i15 & 14);
                    o0VarQ.g0(false);
                }
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 1);
        }
    }
}
