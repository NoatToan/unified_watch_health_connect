package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/e2;", "Lr70/r;", "Ly70/x;", "stateHolder", "<init>", "(Ly70/x;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e2 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.x f157690a;

    public e2(y70.x xVar) {
        xVar.getClass();
        this.f157690a = xVar;
    }

    @Override // r70.r
    public final void a(final h4.r rVar, final r70.q qVar, p3.m mVar, final int i14) {
        int i15;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        String strP;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 1313756792);
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
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = this.f157690a.f194688a;
                o0VarQ.K(objQ);
            }
            List list = (List) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            if (list == null) {
                p2VarI0 = o0VarQ.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(this) { // from class: s70.c2

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e2 f157676b;

                    {
                        this.f157676b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = i16;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i17) {
                            case 0:
                                this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            case 1:
                                this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                int size = list.size();
                if (list.isEmpty()) {
                    p2VarI0 = o0VarQ.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i17 = 1;
                    pVar = new e23.p(this) { // from class: s70.c2

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ e2 f157676b;

                        {
                            this.f157676b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i17;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                case 1:
                                    this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
                    if (size == 1) {
                        o0VarQ.C(-1908009973);
                        strP = gl1.y.P(R.string.lbl_num_item_singular, new Object[]{Integer.valueOf(size)}, o0VarQ);
                        o0VarQ.g0(false);
                    } else {
                        o0VarQ.C(-1907909812);
                        strP = gl1.y.P(R.string.lbl_num_items_plural, new Object[]{Integer.valueOf(size)}, o0VarQ);
                        o0VarQ.g0(false);
                    }
                    String strP2 = oi0.c.P(p13.x.k(gl1.y.Q(o0VarQ, R.string.lbl_whats_new), gl1.y.Q(o0VarQ, R.string.lbl_carousel), strP));
                    boolean zB = o0VarQ.B(strP2);
                    Object objQ2 = o0VarQ.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new r0(strP2, 5);
                        o0VarQ.K(objQ2);
                    }
                    h4.r rVarC = p5.v.c((e23.l) objQ2, rVar, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarQ, 0);
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
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarQ, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarQ);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String strQ = gl1.y.Q(o0VarQ, R.string.lbl_whats_new);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97920e;
                    bVar2.getClass();
                    float f16 = eVar.f97920e;
                    bVar2.getClass();
                    h4.r rVarC3 = c2.l.C(aVar2, f14, f16, eVar.f97920e, 0.0f, 8);
                    Object objQ3 = o0VarQ.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new s5.e0(24);
                        o0VarQ.K(objQ3);
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ3, rVarC3, false);
                    d6.h.f57752b.getClass();
                    d6.h hVarA = d6.h.a(d6.h.f57757g);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarQ), o0VarQ, 0, 0, 130044);
                    boolean zK = o0VarQ.k(size);
                    Object objQ4 = o0VarQ.q();
                    if (zK || objQ4 == c2565a) {
                        objQ4 = new a51.c(size, 12);
                        o0VarQ.K(objQ4);
                    }
                    h2.b bVarB = h2.o0.b(0, (e23.a) objQ4, o0VarQ, 0, 3);
                    bVar2.getClass();
                    float f17 = eVar.f97918c;
                    bVar2.getClass();
                    h2.u.a(bVarB, null, c2.l.a(f15), null, 0, f17, null, null, false, null, null, null, null, z3.f.c(-1611694879, new qw.b(list, qVar, this, false, context, 3), o0VarQ), o0VarQ, 0, 24576, 16346);
                    o0VarQ = o0VarQ;
                    if (size > 1) {
                        o0VarQ.C(157153770);
                        h4.r rVarB = b0Var.b(aVar2, h4.d.a.f81537o);
                        bVar2.getClass();
                        h4.r rVarA = c2.l.A(rVarB, f15, 0.0f, 2);
                        bVar2.getClass();
                        l02.f.a(bVarB, rVarA, size, 0, 0L, 0L, j92.b.f97901d.f97902a, 0.0f, null, o0VarQ, 0, 952);
                        o0VarQ.g0(false);
                    } else {
                        o0VarQ.C(157527072);
                        o0VarQ.g0(false);
                    }
                    o0VarQ.g0(true);
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarQ.e();
        p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            final int i18 = 2;
            pVar = new e23.p(this) { // from class: s70.c2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e2 f157676b;

                {
                    this.f157676b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i19) {
                        case 0:
                            this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        case 1:
                            this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f157676b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
