package o11;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.n3;
import ll1.g;
import mw0.i;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0114  */
    /* JADX WARN: Code duplicated, block: B:40:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x016d  */
    /* JADX WARN: Code duplicated, block: B:50:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e23.a aVar, p11.a aVar2, m mVar, int i14) {
        p11.a aVar3;
        p11.a aVar4;
        aVar.getClass();
        o0 o0VarE = mVar.E(-6264160);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | 16;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(p11.a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    aVar4 = (p11.a) u1VarResolveViewModel;
                }
            } else {
                o0VarE.e();
                aVar4 = aVar2;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            p1 p1VarC = p0.c(aVar4.f134894c, o0VarE, 0);
            p1 p1VarC2 = p0.c(aVar4.f134896e, o0VarE, 0);
            p1 p1VarC3 = p0.c(aVar4.f134898g, o0VarE, 0);
            p1 p1VarC4 = p0.c(aVar4.f134900i, o0VarE, 0);
            p1 p1VarC5 = p0.c(aVar4.f134902k, o0VarE, 0);
            p1 p1VarC6 = p0.c(aVar4.f134904m, o0VarE, 0);
            p1 p1VarC7 = p0.c(aVar4.f134906o, o0VarE, 0);
            boolean zB = o0VarE.B((Boolean) p1VarC2.getF182175a());
            Object objQ = o0VarE.q();
            m.a aVar5 = m.f135153a;
            if (zB) {
                n11.a.C2309a c2309a = n11.a.f122205a;
                Boolean bool = (Boolean) p1VarC2.getF182175a();
                c2309a.getClass();
                objQ = n11.a.C2309a.a(bool);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    n11.a.C2309a c2309a2 = n11.a.f122205a;
                    Boolean bool2 = (Boolean) p1VarC2.getF182175a();
                    c2309a2.getClass();
                    objQ = n11.a.C2309a.a(bool2);
                    o0VarE.K(objQ);
                }
            }
            n11.a aVar6 = (n11.a) objQ;
            boolean zB2 = o0VarE.B((Boolean) p1VarC3.getF182175a());
            Object objQ2 = o0VarE.q();
            if (zB2) {
                n11.a.C2309a c2309a3 = n11.a.f122205a;
                Boolean bool3 = (Boolean) p1VarC3.getF182175a();
                c2309a3.getClass();
                objQ2 = n11.a.C2309a.a(bool3);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == m.a.f135155b) {
                    n11.a.C2309a c2309a4 = n11.a.f122205a;
                    Boolean bool4 = (Boolean) p1VarC3.getF182175a();
                    c2309a4.getClass();
                    objQ2 = n11.a.C2309a.a(bool4);
                    o0VarE.K(objQ2);
                }
            }
            n11.a aVar7 = (n11.a) objQ2;
            boolean zB3 = o0VarE.B((Boolean) p1VarC4.getF182175a());
            Object objQ3 = o0VarE.q();
            if (zB3) {
                n11.a.C2309a c2309a5 = n11.a.f122205a;
                Boolean bool5 = (Boolean) p1VarC4.getF182175a();
                c2309a5.getClass();
                objQ3 = n11.a.C2309a.a(bool5);
                o0VarE.K(objQ3);
            } else {
                aVar5.getClass();
                if (objQ3 == m.a.f135155b) {
                    n11.a.C2309a c2309a6 = n11.a.f122205a;
                    Boolean bool6 = (Boolean) p1VarC4.getF182175a();
                    c2309a6.getClass();
                    objQ3 = n11.a.C2309a.a(bool6);
                    o0VarE.K(objQ3);
                }
            }
            n11.a aVar8 = (n11.a) objQ3;
            boolean zB4 = o0VarE.B((Boolean) p1VarC5.getF182175a());
            Object objQ4 = o0VarE.q();
            if (zB4) {
                n11.a.C2309a c2309a7 = n11.a.f122205a;
                Boolean bool7 = (Boolean) p1VarC5.getF182175a();
                c2309a7.getClass();
                objQ4 = n11.a.C2309a.a(bool7);
                o0VarE.K(objQ4);
            } else {
                aVar5.getClass();
                if (objQ4 == m.a.f135155b) {
                    n11.a.C2309a c2309a8 = n11.a.f122205a;
                    Boolean bool8 = (Boolean) p1VarC5.getF182175a();
                    c2309a8.getClass();
                    objQ4 = n11.a.C2309a.a(bool8);
                    o0VarE.K(objQ4);
                }
            }
            n11.a aVar9 = (n11.a) objQ4;
            boolean zB5 = o0VarE.B((Boolean) p1VarC6.getF182175a());
            Object objQ5 = o0VarE.q();
            if (zB5) {
                n11.a.C2309a c2309a9 = n11.a.f122205a;
                Boolean bool9 = (Boolean) p1VarC6.getF182175a();
                c2309a9.getClass();
                objQ5 = n11.a.C2309a.a(bool9);
                o0VarE.K(objQ5);
            } else {
                aVar5.getClass();
                if (objQ5 == m.a.f135155b) {
                    n11.a.C2309a c2309a10 = n11.a.f122205a;
                    Boolean bool10 = (Boolean) p1VarC6.getF182175a();
                    c2309a10.getClass();
                    objQ5 = n11.a.C2309a.a(bool10);
                    o0VarE.K(objQ5);
                }
            }
            n11.a aVar10 = (n11.a) objQ5;
            boolean zB6 = o0VarE.B((Boolean) p1VarC7.getF182175a());
            Object objQ6 = o0VarE.q();
            if (zB6) {
                n11.a.C2309a c2309a11 = n11.a.f122205a;
                Boolean bool11 = (Boolean) p1VarC7.getF182175a();
                c2309a11.getClass();
                objQ6 = n11.a.C2309a.a(bool11);
                o0VarE.K(objQ6);
            } else {
                aVar5.getClass();
                if (objQ6 == m.a.f135155b) {
                    n11.a.C2309a c2309a12 = n11.a.f122205a;
                    Boolean bool12 = (Boolean) p1VarC7.getF182175a();
                    c2309a12.getClass();
                    objQ6 = n11.a.C2309a.a(bool12);
                    o0VarE.K(objQ6);
                }
            }
            aVar3 = aVar4;
            z02.d.a(false, f.c(1782280805, new g(aVar, 23), o0VarE), null, null, n3.f22788a, f.c(1845555049, new d(aVar4, p1VarC, aVar6, aVar7, aVar8, aVar9, aVar10, (n11.a) objQ6, 0), o0VarE), o0VarE, 196656, 13);
        } else {
            o0VarE.e();
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(aVar, aVar3, i14, 15);
        }
    }
}
