package p006l2;

import c02.d;
import e2.f0;
import e23.a;
import e23.l;
import e23.r;
import i3.v5;
import java.util.List;
import kotlin.m3;
import m4.b0;
import n4.c;
import p005kotlin.Unit;
import p3.x1;
import r1.q2;
import u1.w;
import x5.c0;
import x5.l0;
import z2.h2;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108889a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f108890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f108891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f108892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f108893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f108894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f108895g;

    public /* synthetic */ y0(List list, boolean z14, boolean z15, a aVar, l lVar, l lVar2) {
        this.f108892d = list;
        this.f108890b = z14;
        this.f108891c = z15;
        this.f108893e = aVar;
        this.f108894f = lVar;
        this.f108895g = lVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        m3 m3Var;
        switch (this.f108889a) {
            case 0:
                b2 b2Var = (b2) this.f108892d;
                b0 b0Var = (b0) this.f108893e;
                h2 h2Var = (h2) this.f108894f;
                c0 c0Var = (c0) this.f108895g;
                c cVar = (c) obj;
                if (!b2Var.b()) {
                    b0.a(b0Var);
                } else if (!this.f108890b && (m3Var = b2Var.f108393c) != null) {
                    m3Var.show();
                }
                if (b2Var.b() && this.f108891c) {
                    if (b2Var.a() != m1.Selection) {
                        i3 i3VarD = b2Var.d();
                        if (i3VarD != null) {
                            t2.a aVar = t2.f108797a;
                            long j8 = cVar.f123544a;
                            x5.l lVar = b2Var.f108394d;
                            x0 x0Var = b2Var.f108412v;
                            aVar.getClass();
                            int iA = c0Var.a(i3VarD.b(j8, true));
                            x0Var.invoke(l0.b(lVar.f188874a, null, og.a.l(iA, iA), 5));
                            if (b2Var.f108391a.f108674a.f157138b.length() > 0) {
                                b2Var.f108401k.setValue(m1.Cursor);
                            }
                        }
                    } else {
                        h2Var.m(cVar);
                    }
                }
                break;
            default:
                final List list = (List) this.f108892d;
                final a aVar2 = (a) this.f108893e;
                final l lVar2 = (l) this.f108894f;
                final l lVar3 = (l) this.f108895g;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                int size = list.size();
                final boolean z14 = this.f108890b;
                final boolean z15 = this.f108891c;
                f0.f(f0Var, size, null, new e(625587616, true, new r() { // from class: ml0.g
                    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj3).intValue();
                        p3.m mVar = (p3.m) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        ((e2.d) obj2).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
                        }
                        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                            x1 x1Var = p3.n.f135158a;
                            List list2 = list;
                            il0.a aVar3 = (il0.a) list2.get(iIntValue);
                            if (iIntValue >= list2.size() - 1 && !z14 && !z15) {
                                aVar2.invoke();
                            }
                            h4.r.a aVar4 = h4.r.S;
                            e23.l lVar4 = lVar2;
                            boolean zB = mVar.B(lVar4) | mVar.B(aVar3);
                            Object objQ = mVar.q();
                            if (zB) {
                                objQ = new jl0.f(lVar4, aVar3, 4);
                                mVar.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new jl0.f(lVar4, aVar3, 4);
                                    mVar.K(objQ);
                                }
                            }
                            jl0.g.a(aVar3, w.d(aVar4, false, null, null, (e23.a) objQ, 15), lVar3, mVar, 0, 0);
                            v5.a(0.0f, 0, 3, q2.e(d92.b.f58623a, mVar), null, mVar);
                        } else {
                            mVar.e();
                        }
                        return Unit.INSTANCE;
                    }
                }), 6);
                f0.b(f0Var, null, new e(-1433496183, true, new d(z15, 2)), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y0(b2 b2Var, b0 b0Var, boolean z14, boolean z15, h2 h2Var, c0 c0Var) {
        this.f108892d = b2Var;
        this.f108893e = b0Var;
        this.f108890b = z14;
        this.f108891c = z15;
        this.f108894f = h2Var;
        this.f108895g = c0Var;
    }
}
