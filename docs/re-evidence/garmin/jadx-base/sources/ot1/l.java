package ot1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import et1.w0;
import i3.fe;
import java.util.ArrayList;
import java.util.List;
import lc.m0;
import lc.q0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import yc.v2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lot1/l;", "Lot1/a;", "<init>", "()V", "Lpt1/o;", "detailsScreenState", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends ot1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f133804a = new l();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, b.u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((b.u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    private l() {
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ot1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        List listB1;
        ArrayList parcelableArrayList;
        vVar.getClass();
        qc.d dVar = vVar.f111888h;
        m0Var.getClass();
        o0 o0VarE = mVar.E(-512326623);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(m0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (feVar == null) {
                vb.h.s("Snackbar host state must be passed to review images fullscreen route");
                return;
            }
            qt1.k kVarF0 = gl1.d.f0(m0Var, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Bundle bundleA = dVar.a();
            int i16 = bundleA != null ? bundleA.getInt("imageIndex") : 0;
            Bundle bundleA2 = dVar.a();
            if (bundleA2 == null || (parcelableArrayList = bundleA2.getParcelableArrayList("photosKey")) == null || (listB1 = h0.b1(parcelableArrayList)) == null) {
                listB1 = j0.f134944a;
            }
            boolean zB = o0VarE.B(listB1);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                v2.f196535e.getClass();
                objQ = new r53.m(v2.d.a(listB1));
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    v2.f196535e.getClass();
                    objQ = new r53.m(v2.d.a(listB1));
                    o0VarE.K(objQ);
                }
            }
            r53.i iVar = (r53.i) objQ;
            Bundle bundleA3 = dVar.a();
            boolean z14 = bundleA3 != null && bundleA3.getBoolean("requesterOwned");
            p1 p1VarC = s9.c.c(kVarF0.A, o0VarE);
            nt1.e eVar = new nt1.e();
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new oe2.g(21);
                o0VarE.K(objQ2);
            }
            c.q qVarC = c.w.c(eVar, (e23.l) objQ2, o0VarE, 48);
            i53.d<Long, pt1.r> dVar2 = ((pt1.o) p1VarC.getF182175a()).f140916n;
            int size = listB1.size();
            boolean z15 = ((pt1.o) p1VarC.getF182175a()).f140915m;
            boolean z16 = z14;
            boolean z17 = ((pt1.o) p1VarC.getF182175a()).f140910h;
            boolean z18 = ((pt1.o) p1VarC.getF182175a()).f140911i;
            pt1.n nVar = ((pt1.o) p1VarC.getF182175a()).f140923u;
            boolean z19 = ((pt1.o) p1VarC.getF182175a()).f140903a;
            b.u uVar = (b.u) o0VarE.A(g02.d.f74342a);
            boolean zR = o0VarE.r(uVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new a(uVar);
                o0VarE.K(objQ3);
            }
            k23.g gVar = (k23.g) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new oe2.g(22);
                o0VarE.K(objQ4);
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR2 = o0VarE.r(kVarF0);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new j(kVarF0, 0);
                o0VarE.K(objQ5);
            }
            e23.l lVar2 = (e23.l) objQ5;
            boolean zR3 = o0VarE.r(kVarF0);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                objQ6 = new j(kVarF0, 1);
                o0VarE.K(objQ6);
            }
            e23.l lVar3 = (e23.l) objQ6;
            boolean zR4 = o0VarE.r(kVarF0);
            Object objQ7 = o0VarE.q();
            if (zR4 || objQ7 == c2565a) {
                objQ7 = new j(kVarF0, 2);
                o0VarE.K(objQ7);
            }
            e23.l lVar4 = (e23.l) objQ7;
            boolean zR5 = o0VarE.r(qVarC);
            Object objQ8 = o0VarE.q();
            if (zR5 || objQ8 == c2565a) {
                objQ8 = new d(qVarC, 1);
                o0VarE.K(objQ8);
            }
            e23.l lVar5 = (e23.l) objQ8;
            boolean zR6 = o0VarE.r(kVarF0) | o0VarE.r(context);
            Object objQ9 = o0VarE.q();
            if (zR6 || objQ9 == c2565a) {
                objQ9 = new k(kVarF0, context, 0);
                o0VarE.K(objQ9);
            }
            e23.p pVar = (e23.p) objQ9;
            boolean zR7 = o0VarE.r(kVarF0);
            Object objQ10 = o0VarE.q();
            if (zR7 || objQ10 == c2565a) {
                objQ10 = new h(kVarF0, 1);
                o0VarE.K(objQ10);
            }
            e23.a aVar2 = (e23.a) objQ10;
            boolean zR8 = o0VarE.r(kVarF0);
            Object objQ11 = o0VarE.q();
            if (zR8 || objQ11 == c2565a) {
                objQ11 = new h(kVarF0, 2);
                o0VarE.K(objQ11);
            }
            e23.a aVar3 = (e23.a) objQ11;
            boolean zR9 = o0VarE.r(kVarF0);
            Object objQ12 = o0VarE.q();
            if (zR9 || objQ12 == c2565a) {
                objQ12 = new h(kVarF0, 0);
                o0VarE.K(objQ12);
            }
            o0Var = o0VarE;
            w0.b(iVar, dVar2, i16, size, z16, z15, z17, z18, z19, feVar, nVar, lVar, lVar2, lVar3, lVar4, lVar5, pVar, aVar2, aVar3, (e23.a) objQ12, (e23.a) gVar, o0Var, (i15 << 21) & 1879048192, 48, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, vVar, m0Var, feVar, i14, 0);
        }
    }

    @Override // ot1.a
    public final List<lc.r> b() {
        lc.u uVar = new lc.u();
        uVar.b(q0.f111838c);
        lc.t.a aVar = uVar.f111877a;
        aVar.f111872b = false;
        uVar.a(0);
        Unit unit = Unit.INSTANCE;
        lc.r rVar = new lc.r("imageIndex", aVar.a());
        lc.u uVar2 = new lc.u();
        uVar2.b(q0.f111848m);
        lc.t.a aVar2 = uVar2.f111877a;
        aVar2.f111872b = false;
        uVar2.a(Boolean.FALSE);
        return p13.x.k(rVar, new lc.r("requesterOwned", aVar2.a()));
    }
}
