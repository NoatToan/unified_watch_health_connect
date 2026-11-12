package p006l2;

import a11.b0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import b5.s0;
import d6.p;
import e23.l;
import h4.r;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.c;
import s5.q0;
import s5.x0;
import t13.d;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<q0> f108421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Integer, Unit> f108422b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p1<q0> p1Var, l<? super Integer, Unit> lVar) {
            this.f108421a = p1Var;
            this.f108422b = lVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, d<? super Unit> dVar) {
            Object objF = k3.f(h0Var, null, null, new b0(this.f108421a, this.f108422b, 18), dVar, 7);
            return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    @e
    public static final void a(final c cVar, r rVar, x0 x0Var, boolean z14, int i14, int i15, l<? super q0, Unit> lVar, final l<? super Integer, Unit> lVar2, m mVar, final int i16, final int i17) {
        r rVar2;
        int i18;
        x0 x0Var2;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z15;
        o0 o0Var;
        final boolean z16;
        final int i27;
        final l<? super q0, Unit> lVar3;
        final r rVar3;
        final x0 x0Var3;
        final int i28;
        p2 p2VarI0;
        boolean z17;
        x0 x0Var4;
        Object objQ;
        m.a.C2565a c2565a;
        l<? super q0, Unit> lVar4;
        Object objQ2;
        p1 p1Var;
        boolean z18;
        Object objQ3;
        Object objQ4;
        o0 o0VarE = mVar.E(-246609449);
        int i29 = i16 | (o0VarE.B(cVar) ? 4 : 2);
        int i30 = i17 & 2;
        if (i30 == 0) {
            if ((i16 & 48) == 0) {
                rVar2 = rVar;
                i29 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i18 = i17 & 4;
            if (i18 != 0) {
                i24 = i29 | 384;
                x0Var2 = x0Var;
            } else {
                x0Var2 = x0Var;
                if (o0VarE.B(x0Var2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i24 = i29 | i19;
            }
            int i34 = i24 | 1797120;
            if (o0VarE.r(lVar2)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i26 = i34 | i25;
            if ((4793491 & i26) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i26 & 1, z15)) {
                if (i30 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i18 != 0) {
                    x0.f157320d.getClass();
                    x0Var4 = x0.f157321e;
                    z17 = false;
                } else {
                    z17 = false;
                    x0Var4 = x0Var2;
                }
                p.f57793b.getClass();
                int i35 = p.f57794c;
                objQ = o0VarE.q();
                m.a aVar = m.f135153a;
                aVar.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new kn1.m(22);
                    o0VarE.K(objQ);
                }
                lVar4 = (l) objQ;
                x1 x1Var = n.f135158a;
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(null);
                    o0VarE.K(objQ2);
                }
                p1Var = (p1) objQ2;
                r.a aVar2 = r.S;
                z18 = (29360128 & i26) != 8388608 ? z17 : true;
                objQ3 = o0VarE.q();
                if (z18 || objQ3 == c2565a) {
                    objQ3 = new a(p1Var, lVar2);
                    o0VarE.K(objQ3);
                }
                r rVarThen = rVar3.then(s0.b(aVar2, lVar2, (PointerInputEventHandler) objQ3));
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new b0(p1Var, lVar4, 17);
                    o0VarE.K(objQ4);
                }
                o0Var = o0VarE;
                y.a(cVar, rVarThen, x0Var4, (l) objQ4, i35, true, Integer.MAX_VALUE, 0, null, o0Var, (i26 & 58254) | 1769472, 0, 1920);
                lVar3 = lVar4;
                x0Var3 = x0Var4;
                i28 = i35;
                z16 = true;
                i27 = Integer.MAX_VALUE;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z16 = z14;
                i27 = i15;
                lVar3 = lVar;
                rVar3 = rVar2;
                x0Var3 = x0Var2;
                i28 = i14;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l2.b0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c0.a(cVar, rVar3, x0Var3, z16, i28, i27, lVar3, lVar2, (m) obj, p0.t(i16 | 1), i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i29 |= 48;
        rVar2 = rVar;
        i18 = i17 & 4;
        if (i18 != 0) {
            i24 = i29 | 384;
            x0Var2 = x0Var;
        } else {
            x0Var2 = x0Var;
            if (o0VarE.B(x0Var2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i24 = i29 | i19;
        }
        int i36 = i24 | 1797120;
        if (o0VarE.r(lVar2)) {
            i25 = 8388608;
        } else {
            i25 = 4194304;
        }
        i26 = i36 | i25;
        if ((4793491 & i26) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i26 & 1, z15)) {
            if (i30 != 0) {
                rVar3 = r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i18 != 0) {
                x0.f157320d.getClass();
                x0Var4 = x0.f157321e;
                z17 = false;
            } else {
                z17 = false;
                x0Var4 = x0Var2;
            }
            p.f57793b.getClass();
            int i37 = p.f57794c;
            objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            aVar3.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new kn1.m(22);
                o0VarE.K(objQ);
            }
            lVar4 = (l) objQ;
            x1 x1Var2 = n.f135158a;
            objQ2 = o0VarE.q();
            aVar3.getClass();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1Var = (p1) objQ2;
            r.a aVar4 = r.S;
            if ((29360128 & i26) != 8388608) {
            }
            objQ3 = o0VarE.q();
            if (z18) {
                objQ3 = new a(p1Var, lVar2);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new a(p1Var, lVar2);
                o0VarE.K(objQ3);
            }
            r rVarThen2 = rVar3.then(s0.b(aVar4, lVar2, (PointerInputEventHandler) objQ3));
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new b0(p1Var, lVar4, 17);
                o0VarE.K(objQ4);
            }
            o0Var = o0VarE;
            y.a(cVar, rVarThen2, x0Var4, (l) objQ4, i37, true, Integer.MAX_VALUE, 0, null, o0Var, (i26 & 58254) | 1769472, 0, 1920);
            lVar3 = lVar4;
            x0Var3 = x0Var4;
            i28 = i37;
            z16 = true;
            i27 = Integer.MAX_VALUE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z16 = z14;
            i27 = i15;
            lVar3 = lVar;
            rVar3 = rVar2;
            x0Var3 = x0Var2;
            i28 = i14;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l2.b0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c0.a(cVar, rVar3, x0Var3, z16, i28, i27, lVar3, lVar2, (m) obj, p0.t(i16 | 1), i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
