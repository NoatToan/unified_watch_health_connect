package if2;

import c80.s0;
import e23.p;
import j92.e;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.i;
import r70.q;
import r70.r;
import ub1.l;
import yz1.u;
import z70.a0;
import zd0.q0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lif2/c;", "Lr70/r;", "Ljf2/a;", "stateHolder", "Lff2/c;", "campaignInteractor", "Lzd0/q0;", "promosProvider", "<init>", "(Ljf2/a;Lff2/c;Lzd0/q0;)V", "", "wasShowingPromotions", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jf2.a f93224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff2.c f93225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f93226c;

    public c(jf2.a aVar, ff2.c cVar, q0 q0Var) {
        aVar.getClass();
        cVar.getClass();
        q0Var.getClass();
        this.f93224a = aVar;
        this.f93225b = cVar;
        this.f93226c = q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(final h4.r rVar, final q qVar, m mVar, final int i14) {
        int i15;
        q qVar2;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        p1 p1Var;
        Unit unit;
        Long l14;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1771646375);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            jf2.a aVar = this.f93224a;
            if (objQ == c2565a) {
                objQ = (i) aVar.f98719a.invoke();
                o0VarQ.K(objQ);
            }
            gf2.a aVar2 = (gf2.a) s9.c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            long jLongValue = (aVar2 == null || (l14 = aVar2.f77078b) == null) ? -1L : l14.longValue();
            s0 s0Var = s0.HOME;
            q0 q0Var = this.f93226c;
            if (q0Var.c(s0Var)) {
                Object objQ2 = o0VarQ.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(Boolean.FALSE);
                    o0VarQ.K(objQ2);
                }
                p1 p1Var2 = (p1) objQ2;
                if (jLongValue != -1) {
                    yz1.d dVar = aVar2 != null ? aVar2.f77077a : null;
                    if (dVar != null && dVar.f200298a != u.LOADING && !((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        o0VarQ.C(-1734909315);
                        d.a(jLongValue, aVar2, aVar, rVar, this.f93225b, q0Var, o0VarQ, (i15 << 9) & 7168);
                        o0VarQ.g0(false);
                        p2VarI0 = o0VarQ.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        final int i16 = 1;
                        pVar = new p(this) { // from class: if2.a

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ c f93218b;

                            {
                                this.f93218b = this;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int i17 = i16;
                                m mVar2 = (m) obj;
                                ((Integer) obj2).getClass();
                                switch (i17) {
                                    case 0:
                                        this.f93218b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                        break;
                                    case 1:
                                        this.f93218b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                        break;
                                    default:
                                        this.f93218b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                qVar2 = qVar;
                o0VarQ.C(-1734757477);
                o0VarQ.g0(false);
                ff2.p pVar2 = new ff2.p((a0) KoinJavaComponent.get$default(a0.class, null, null, 6, null));
                boolean zR = o0VarQ.r(qVar2);
                Object objQ3 = o0VarQ.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new b(qVar2, 0);
                    o0VarQ.K(objQ3);
                }
                l lVarQ = q0Var.q(s0Var, pVar2, (e23.l) objQ3);
                if (lVarQ == null) {
                    o0VarQ.C(-1734089521);
                    o0VarQ.g0(false);
                    unit = null;
                    p1Var = p1Var2;
                } else {
                    o0VarQ.C(1745176946);
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    float f15 = eVar.f97920e;
                    bVar.getClass();
                    p1Var = p1Var2;
                    lVarQ.a(c2.l.C(rVar, f14, f15, eVar.f97920e, 0.0f, 8), o0VarQ, 0);
                    o0VarQ.g0(false);
                    unit = Unit.INSTANCE;
                }
                p1Var.setValue(Boolean.valueOf(unit != null));
            } else {
                p2VarI0 = o0VarQ.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new p(this) { // from class: if2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ c f93218b;

                    {
                        this.f93218b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = i17;
                        m mVar2 = (m) obj;
                        ((Integer) obj2).getClass();
                        switch (i18) {
                            case 0:
                                this.f93218b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                            case 1:
                                this.f93218b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                            default:
                                this.f93218b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        qVar2 = qVar;
        o0VarQ.e();
        p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            final int i18 = 2;
            final q qVar3 = qVar2;
            pVar = new p(this) { // from class: if2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f93218b;

                {
                    this.f93218b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i19) {
                        case 0:
                            this.f93218b.a(rVar, qVar3, mVar2, p0.t(i14 | 1));
                            break;
                        case 1:
                            this.f93218b.a(rVar, qVar3, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            this.f93218b.a(rVar, qVar3, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
