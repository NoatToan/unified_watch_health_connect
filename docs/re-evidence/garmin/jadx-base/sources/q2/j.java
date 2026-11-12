package q2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import f5.c0;
import o4.e0;
import p004k6.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.j0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f142180a = new d0(true, false, false, false, 14, (p005kotlin.jvm.internal.j) null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.q<o4.d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o2.b f142181a;

        public a(o2.b bVar) {
            this.f142181a = bVar;
        }

        @Override // e23.q
        public final Unit invoke(o4.d0 d0Var, p3.m mVar, Integer num) {
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= mVar2.l(j8) ? 4 : 2;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                x1 x1Var = p3.n.f135158a;
                j.b(((o2.e) this.f142181a).f128627c, (iIntValue << 3) & 112, j8, mVar2);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<o2.d> {
        public b(Object obj) {
            super(0, obj, s2.e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0);
        }

        @Override // e23.a
        public final o2.d invoke() {
            return ((s2.e) this.receiver).F();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    public static final void a(o2.h hVar, o2.d dVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1904307118);
        int i15 = (o0VarE.B(hVar) ? 4 : 2) | i14 | (o0VarE.r(dVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(-1009482584);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o0VarE.g0(false);
            boolean zR = o0VarE.r(dVar) | ((i15 & 14) == 4) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new p90.h(dVar, 10, context, hVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p90.h(dVar, 10, context, hVar);
                    o0VarE.K(objQ);
                }
            }
            x1.l.b(null, null, (e23.l) objQ, o0VarE, 0, 3);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oo0.f(hVar, dVar, i14, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    public static final void b(final int i14, final int i15, final long j8, p3.m mVar) {
        final int i16;
        int i17;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(-1240244237);
        if ((i15 & 6) == 0) {
            i16 = i14;
            i17 = i15 | (o0VarE.k(i16) ? 4 : 2);
        } else {
            i16 = i14;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.l(j8) ? 32 : 16;
        }
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = ((i17 & 14) == 4) | o0VarE.B(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = Integer.valueOf(context.obtainStyledAttributes(new int[]{i16}).getResourceId(0, -1));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = Integer.valueOf(context.obtainStyledAttributes(new int[]{i16}).getResourceId(0, -1));
                    o0VarE.K(objQ);
                }
            }
            int iIntValue = ((Number) objQ).intValue();
            if (iIntValue == -1) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i18 = 1;
                pVar = new e23.p() { // from class: q2.i
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i19 = i18;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).intValue();
                        switch (i19) {
                            case 0:
                                j.b(i16, p0.t(i15 | 1), j8, mVar2);
                                break;
                            default:
                                j.b(i16, p0.t(i15 | 1), j8, mVar2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                t4.d dVarA = n5.c.a(iIntValue, o0VarE, 0);
                boolean z14 = (i17 & 112) == 32;
                Object objQ2 = o0VarE.q();
                if (z14) {
                    if (j8 == 16) {
                        objQ2 = null;
                    } else {
                        objQ2 = e0.a.a(e0.f128843b, j8);
                    }
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        if (j8 == 16) {
                            objQ2 = null;
                        } else {
                            objQ2 = e0.a.a(e0.f128843b, j8);
                        }
                        o0VarE.K(objQ2);
                    }
                }
                e0 e0Var = (e0) objQ2;
                h4.r.a aVar2 = h4.r.S;
                x1.j.f188348a.getClass();
                h4.r rVarQ = x2.q(aVar2, x1.j.f188358k);
                f5.k.f68985a.getClass();
                c2.q.a(l4.r.a(rVarQ, dVarA, null, f5.k.a.f68988c, 0.0f, e0Var, 22), o0VarE, 0);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i19 = 0;
            pVar = new e23.p() { // from class: q2.i
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = i19;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i110) {
                        case 0:
                            j.b(i14, p0.t(i15 | 1), j8, mVar2);
                            break;
                        default:
                            j.b(i14, p0.t(i15 | 1), j8, mVar2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(o2.h hVar, s2.e eVar, e23.a<? extends c0> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-2040393164);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = (i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.B(eVar));
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (objArr == true) {
                objQ = new l(new x1.h((e23.a) new p40.o0(18, eVar, aVar), (e23.p) null, i16, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0)));
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l(new x1.h((e23.a) new p40.o0(18, eVar, aVar), (e23.p) null, i16, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0)));
                    o0VarE.K(objQ);
                }
            }
            l lVar = (l) objQ;
            if ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(hVar))) {
                z14 = true;
            }
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new ov1.u(hVar, 28);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ov1.u(hVar, 28);
                    o0VarE.K(objQ2);
                }
            }
            p004k6.g.a(lVar, (e23.a) objQ2, f142180a, z3.f.c(1315155414, new oo0.f(23, eVar, hVar), o0VarE), o0VarE, 3456, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(hVar, eVar, aVar, i14, 9);
        }
    }

    public static final void d(h4.r rVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        z3.e eVar2;
        o0 o0VarE = mVar.E(1392105195);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            j0 j0Var = s2.g.f156002a;
            h.f142173a.getClass();
            rVar2 = rVar;
            eVar2 = eVar;
            s2.d.a(rVar2, j0Var, h.f142174b, eVar2, o0VarE, (i15 & 14) | 432 | ((i15 << 6) & 7168));
        } else {
            rVar2 = rVar;
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lh0.k(rVar2, eVar2, i14, 3);
        }
    }
}
