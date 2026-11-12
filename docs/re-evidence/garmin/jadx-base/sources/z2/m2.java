package z2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.h3;
import p006l2.i3;

/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h2 f201691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f201692b;

        public a(h2 h2Var, boolean z14) {
            this.f201691a = h2Var;
            this.f201692b = z14;
        }

        @Override // z2.p
        public final long a() {
            return this.f201691a.s(this.f201692b);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p006l2.p2 f201693a;

        public b(p006l2.p2 p2Var) {
            this.f201693a = p2Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            Object objA = p006l2.h2.a(h0Var, this.f201693a, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201694a;

        static {
            int[] iArr = new int[p006l2.l1.values().length];
            try {
                iArr[p006l2.l1.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p006l2.l1.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p006l2.l1.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f201694a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    public static final void a(boolean z14, d6.g gVar, h2 h2Var, p3.m mVar, int i14) {
        int i15;
        i3 i3VarD;
        s5.q0 q0Var;
        p3.o0 o0VarE = mVar.E(-1344558920);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(h2Var) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = i15 & 14;
            boolean zB = (i16 == 4) | o0VarE.B(h2Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new f2(h2Var, z14);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f2(h2Var, z14);
                    o0VarE.K(objQ);
                }
            }
            p006l2.p2 p2Var = (p006l2.p2) objQ;
            boolean zR = o0VarE.r(h2Var) | (i16 == 4);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new a(h2Var, z14);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(h2Var, z14);
                    o0VarE.K(objQ2);
                }
            }
            p pVar = (p) objQ2;
            boolean zI = s5.w0.i(h2Var.u().f188879b);
            int i17 = (int) (z14 ? h2Var.u().f188879b >> 32 : h2Var.u().f188879b & 4294967295L);
            p006l2.b2 b2Var = h2Var.f201607d;
            float fA = (b2Var == null || (i3VarD = b2Var.d()) == null || (q0Var = i3VarD.f108575a) == null) ? 0.0f : h3.a(q0Var, i17);
            h4.r.a aVar2 = h4.r.S;
            boolean zR2 = o0VarE.r(p2Var);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new b(p2Var);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new b(p2Var);
                    o0VarE.K(objQ3);
                }
            }
            z2.c.b(pVar, z14, gVar, zI, 0L, fA, b5.s0.b(aVar2, p2Var, (PointerInputEventHandler) objQ3), o0VarE, (i15 << 3) & 1008, 16);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wt0.c(z14, gVar, h2Var, i14, 1);
        }
    }

    public static final void b(x1.i iVar, x1.k kVar, p006l2.m2 m2Var, boolean z14, e23.a<Unit> aVar) {
        if (z14) {
            x1.i.b(iVar, new p006l2.n0(m2Var), null, new p006l2.o0(aVar, kVar), 14);
        }
    }
}
