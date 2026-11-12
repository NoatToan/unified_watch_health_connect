package s9;

import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import p3.h0;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import rx1.u;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s9/e$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f158009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f158010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0 f158011c;

        public a(n0 n0Var, k0 k0Var, r0 r0Var) {
            this.f158009a = n0Var;
            this.f158010b = k0Var;
            this.f158011c = r0Var;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f158009a.getF158016a().d(this.f158010b);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s9/e$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f158012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f158013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0 f158014c;

        public b(n0 n0Var, k0 k0Var, r0 r0Var) {
            this.f158012a = n0Var;
            this.f158013b = k0Var;
            this.f158014c = r0Var;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f158012a.getF158016a().d(this.f158013b);
            i iVar = (i) this.f158014c.f105810a;
            if (iVar != null) {
                iVar.a();
            }
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158015a;

        static {
            int[] iArr = new int[b0.a.values().length];
            try {
                iArr[b0.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f158015a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    public static final void a(b0.a aVar, n0 n0Var, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-709389590);
        int i15 = i14 | 16;
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                n0Var = (n0) o0VarE.A(j.f158018a);
            } else {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            if (aVar == b0.a.ON_DESTROY) {
                vb.h.s("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            p1 p1VarQ = p0.q(aVar2, o0VarE);
            boolean zB = o0VarE.B(p1VarQ) | o0VarE.r(n0Var);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new rp.b(n0Var, 9, aVar, p1VarQ);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rp.b(n0Var, 9, aVar, p1VarQ);
                    o0VarE.K(objQ);
                }
            }
            l0.a(n0Var, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        n0 n0Var2 = n0Var;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(aVar, n0Var2, aVar2, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    public static final void b(Long l14, n0 n0Var, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1220373486);
        int i15 = (o0VarE.r(l14) ? 4 : 2) | i14 | 16 | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                n0Var = (n0) o0VarE.A(j.f158018a);
            } else {
                o0VarE.e();
            }
            int i16 = i15 & (-113);
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            boolean zB = o0VarE.B(l14) | o0VarE.B(n0Var);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new g(n0Var.getF158016a());
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(n0Var.getF158016a());
                    o0VarE.K(objQ);
                }
            }
            c(n0Var, (g) objQ, lVar, o0VarE, i16 & 896);
        } else {
            o0VarE.e();
        }
        n0 n0Var2 = n0Var;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(l14, n0Var2, lVar, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    public static final void c(n0 n0Var, g gVar, e23.l<? super g, ? extends f> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(912823238);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(n0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(gVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(gVar) | ((i15 & 896) == 256) | o0VarE.r(n0Var);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new rp.b(n0Var, 11, gVar, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rp.b(n0Var, 11, gVar, lVar);
                    o0VarE.K(objQ);
                }
            }
            l0.b(n0Var, gVar, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(n0Var, gVar, lVar, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    public static final void d(Object obj, Object obj2, n0 n0Var, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(696924721);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(obj2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                n0Var = (n0) o0VarE.A(j.f158018a);
            } else {
                o0VarE.e();
            }
            int i16 = i15 & (-897);
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            boolean zB = o0VarE.B(obj) | o0VarE.B(obj2) | o0VarE.B(n0Var);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new h(n0Var.getF158016a());
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(n0Var.getF158016a());
                    o0VarE.K(objQ);
                }
            }
            e(n0Var, (h) objQ, lVar, o0VarE, (i16 >> 3) & 896);
        } else {
            o0VarE.e();
        }
        n0 n0Var2 = n0Var;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(obj, obj2, n0Var2, lVar, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    public static final void e(n0 n0Var, h hVar, e23.l<? super h, ? extends i> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(228371534);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(n0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(hVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(hVar) | ((i15 & 896) == 256) | o0VarE.r(n0Var);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new rp.b(n0Var, 10, hVar, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rp.b(n0Var, 10, hVar, lVar);
                    o0VarE.K(objQ);
                }
            }
            l0.b(n0Var, hVar, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.n(n0Var, hVar, lVar, i14, 19);
        }
    }
}
