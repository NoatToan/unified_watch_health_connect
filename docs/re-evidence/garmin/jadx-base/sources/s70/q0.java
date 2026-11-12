package s70;

import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/q0;", "Lr70/r;", "Ly70/j;", "stateHolder", "<init>", "(Ly70/j;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.j f157780a;

    public q0(y70.j jVar) {
        jVar.getClass();
        this.f157780a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(final h4.r rVar, r70.q qVar, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        final r70.q qVar2 = qVar;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar2, mVar, -8700232);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarQ.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            o70.h hVar = (o70.h) s9.c.b(this.f157780a.f194664a, null, o0VarQ, 48).getF182175a();
            if (hVar != null) {
                List<r70.s> list = hVar.f129996a;
                o0VarQ.C(-1490385983);
                if (list.isEmpty()) {
                    o0VarQ.g0(false);
                    p2VarI0 = o0VarQ.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i17 = 0;
                    pVar = new e23.p(this) { // from class: s70.p0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ q0 f157771b;

                        {
                            this.f157771b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i17;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    this.f157771b.a(rVar, qVar2, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    this.f157771b.a(rVar, qVar2, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    float f15 = eVar.f97921f;
                    bVar.getClass();
                    h4.r rVarC = c2.l.C(rVar, f14, f15, eVar.f97920e, 0.0f, 8);
                    c2.j jVar = c2.j.f22691a;
                    bVar.getClass();
                    float f16 = eVar.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f16);
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarQ, 0);
                    int iHashCode = Long.hashCode(o0VarQ.U);
                    i2 i2VarA0 = o0VarQ.a0();
                    h4.r rVarC2 = h4.k.c(rVarC, o0VarQ);
                    h5.g.V.getClass();
                    h5.e0.a aVar = h5.g.a.f81805b;
                    if (o0VarQ.f135177b == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarQ.z();
                    if (o0VarQ.T) {
                        o0VarQ.M(aVar);
                    } else {
                        o0VarQ.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarQ);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarQ);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarQ, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarQ);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r.a aVar2 = h4.r.S;
                    bVar.getClass();
                    h4.r rVarC3 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                    Object objQ = o0VarQ.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new s5.e0(16);
                        o0VarQ.K(objQ);
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ, rVarC3, false);
                    String strQ = gl1.y.Q(o0VarQ, R.string.lbl_essentials);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarQ), o0VarQ, 0, 0, 131068);
                    o0Var = o0VarQ;
                    qVar2 = qVar;
                    o0.a(list, hVar.f129997b, qVar2, o0Var, (i16 << 3) & 896);
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                p2VarI0.f135219d = pVar;
            }
            o0VarQ.C(-1490385984);
            o0VarQ.g0(false);
            o0Var = o0VarQ;
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            pVar = new e23.p(this) { // from class: s70.p0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q0 f157771b;

                {
                    this.f157771b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i19) {
                        case 0:
                            this.f157771b.a(rVar, qVar2, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f157771b.a(rVar, qVar2, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
