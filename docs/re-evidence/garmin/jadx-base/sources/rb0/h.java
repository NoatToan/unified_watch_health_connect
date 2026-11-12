package rb0;

import androidx.lifecycle.ViewModelStoreOwner;
import ca0.u1;
import e23.l;
import e23.p;
import h4.r;
import i3.e5;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static final void a(r rVar, hv.a aVar, int i14, int i15, boolean z14, m mVar, int i16) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-777483578);
        int i17 = i16 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new r82.e(12);
                o0VarE.K(objQ);
            }
            l lVar = (l) objQ;
            boolean zR = ((i17 & 896) == 256) | o0VarE.r(aVar) | ((i17 & 7168) == 2048) | ((i17 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                e eVar = new e(aVar, i14, i15, z14, 0);
                o0VarE.K(eVar);
                objQ2 = eVar;
            }
            l lVar2 = (l) objQ2;
            o0Var = o0VarE;
            p002j6.c.b(lVar, rVar, lVar2, o0Var, 54, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(rVar, aVar, i14, i15, z14, i16, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, String str2, String str3, u1 u1Var, l lVar, e23.a aVar, m mVar, int i14) {
        str.getClass();
        str3.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-85740870);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.r(u1Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new a90.c(str, 11);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a90.c(str, 11);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(i.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
            o0VarE.g0(false);
            p1 p1VarC = p0.c(((i) u1VarResolveViewModel).f151570d, o0VarE, 0);
            Boolean boolValueOf = Boolean.valueOf(((i.a) p1VarC.getF182175a()).f151572b);
            boolean zB = o0VarE.B(p1VarC) | ((i15 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new g(u1Var, p1VarC, null);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new g(u1Var, p1VarC, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((p) objQ2, boolValueOf, o0VarE);
            hv.a aVar4 = ((i.a) p1VarC.getF182175a()).f151573c;
            if (aVar4 == null) {
                o0VarE.C(1199778393);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1199778394);
                c((i.a) p1VarC.getF182175a(), aVar4, str3, str2, lVar, aVar, o0VarE, (i15 & 896) | ((i15 << 6) & 7168) | (57344 & i15) | (i15 & 458752));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(str, str2, str3, u1Var, lVar, aVar, i14, 13);
        }
    }

    public static final void c(i.a aVar, hv.a aVar2, String str, String str2, l<? super Float, Unit> lVar, e23.a<Unit> aVar3, m mVar, int i14) {
        String str3;
        String str4;
        l<? super Float, Unit> lVar2;
        o0 o0VarE = mVar.E(-18460258);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            str3 = str;
            i15 |= o0VarE.B(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i14 & 3072) == 0) {
            str4 = str2;
            i15 |= o0VarE.B(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if ((i14 & 24576) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        } else {
            lVar2 = lVar;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            int i16 = aVar.f151575e;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n("");
                o0VarE.K(objQ2);
            }
            da0.p.d("sync_legacy_tutorial_screen", aVar.f151571a, aVar3, null, null, null, z3.f.c(-1739123019, new q32.b(aVar2, lVar2, i16, n1Var, (p1) objQ2, str3, str4), o0VarE), o0VarE, ((i15 >> 9) & 896) | 12582918, 120);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(aVar, aVar2, str, str2, lVar, aVar3, i14, 4);
        }
    }

    public static final void d(r rVar, hv.a aVar, int i14, l lVar, m mVar, int i15) {
        o0 o0VarE = mVar.E(2077519783);
        int i16 = i15 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new r82.e(11);
                o0VarE.K(objQ);
            }
            l lVar2 = (l) objQ;
            boolean zR = ((i16 & 896) == 256) | o0VarE.r(aVar) | ((i16 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new c(aVar, i14, lVar, 0);
                o0VarE.K(objQ2);
            }
            p002j6.c.b(lVar2, rVar, (l) objQ2, o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, aVar, i14, lVar, i15, 0);
        }
    }
}
