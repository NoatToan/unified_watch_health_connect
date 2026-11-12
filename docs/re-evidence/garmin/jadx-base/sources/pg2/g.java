package pg2;

import android.app.Activity;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y;
import b82.g1;
import b82.k1;
import c.w;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import g6.o;
import h4.k;
import h4.r;
import h5.e0;
import java.util.Arrays;
import kotlin.t1;
import o4.d0;
import og2.g0;
import og2.i0;
import og2.k0;
import og2.l0;
import og2.q0;
import og2.r0;
import og2.u0;
import og2.v0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.q1;
import p3.x1;
import r53.o2;
import s5.s0;
import s9.j;
import vb.h;
import w5.q;

/* JADX INFO: loaded from: classes11.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, qg2.c cVar, e23.a aVar, e23.a aVar2, boolean z14, o2 o2Var, o2 o2Var2, m mVar, int i14) {
        r rVar2;
        boolean z15;
        s0 s0Var;
        l0 pVar;
        i0 o0Var;
        aVar.getClass();
        aVar2.getClass();
        o2Var.getClass();
        o2Var2.getClass();
        o0 o0VarE = mVar.E(1744283082);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.k(cVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.r(o2Var) ? 131072 : 65536) | (o0VarE.r(o2Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            r.a aVar3 = r.S;
            x1 x1Var = n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            c cVar3 = new c(cVar, o2Var, o2Var2);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            b bVar = (b) v9.b.a(p005kotlin.jvm.internal.s0.f105811a.b(b.class), viewModelStoreOwnerA, null, cVar3, viewModelStoreOwnerA instanceof y ? ((y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            p1 p1VarC = p0.c(bVar.x4(), o0VarE, 0);
            p1 p1VarC2 = p0.c(bVar.f137620d.f132111f, o0VarE, 0);
            s0 s0Var2 = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (o) o0VarE.A(t1.f91496n), 0, 8, null);
            boolean zR = o0VarE.r(activity);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zR) {
                z15 = false;
                objQ = new d(activity, 0);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    z15 = false;
                    objQ = new d(activity, 0);
                    o0VarE.K(objQ);
                } else {
                    z15 = false;
                }
            }
            p3.l0.a(activity, (l) objQ, o0VarE);
            w.a((i15 >> 3) & 112, 1, aVar, o0VarE, z15);
            x0 x0Var = x0.f105818a;
            g1 g1Var = new g1(String.format(gl1.y.Q(o0VarE, a.d.f137616e.f137612a), Arrays.copyOf(new Object[]{1}, 1)), null, null, null, 14, null);
            a.c cVar4 = a.c.f137615e;
            i53.f fVarA = i53.a.a(g1Var, new g1(String.format(gl1.y.Q(o0VarE, cVar4.f137612a), Arrays.copyOf(new Object[]{5}, 1)), null, null, null, 14, null), new g1(gl1.y.Q(o0VarE, a.C2605a.f137614e.f137612a), null, null, null, 14, null));
            n0 n0Var = (n0) o0VarE.A(j.f158018a);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(n0Var) | ((i15 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new e(n0Var, aVar2, null);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e(n0Var, aVar2, null);
                    o0VarE.K(objQ2);
                }
            }
            p3.l0.e((p) objQ2, unit, o0VarE);
            r rVarF = x2.f(aVar3, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar5, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarY = c2.l.y(aVar3, eVar2.f97920e);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarY, o0VarE);
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            int iIntValue = ((Number) p1VarC.getF182175a()).intValue();
            mg2.w.f118432a.getClass();
            float f14 = mg2.w.f118435d;
            r rVarH = l4.k.h(aVar3, 0.8f, 0.8f);
            g6.f fVarA2 = g6.f.a(f14);
            boolean zR3 = o0VarE.r(bVar);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new q1(bVar, 17);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new q1(bVar, 17);
                    o0VarE.K(objQ3);
                }
            }
            k1.a(fVarA, iIntValue, rVarH, fVarA2, 0.0f, (l) objQ3, o0VarE, 3456, 16);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0Var2 = j92.f.f97935l;
            s5.x0 x0VarF = d92.c.f(x0Var2, o0VarE);
            a.b bVar4 = a.f137610c;
            int iIntValue2 = ((Number) p1VarC.getF182175a()).intValue();
            bVar4.getClass();
            a aVarA = a.b.a(iIntValue2);
            if ((aVarA instanceof a.d) || aVarA.equals(cVar4)) {
                o0VarE.C(-1636187990);
                og2.m mVar2 = new og2.m(s0Var2, x0VarF, d92.b.a(o0VarE).c().b(), null);
                s0Var = s0Var2;
                o0VarE.g0(false);
                pVar = mVar2;
            } else {
                if (!(aVarA instanceof a.C2605a)) {
                    throw kg.f.h(o0VarE, -1636192098, false);
                }
                o0VarE.C(-1636182064);
                o0VarE.g0(false);
                pVar = new og2.p(s0Var2, x0VarF);
                s0Var = s0Var2;
            }
            bVar3.getClass();
            r rVarA = c2.l.A(aVar3, eVar2.f97920e, 0.0f, 2);
            i53.c cVarE = i53.a.e(((og2.l) p1VarC2.getF182175a()).f132053a);
            og2.j jVar = ((og2.l) p1VarC2.getF182175a()).f132054b;
            i53.c<og2.g> cVar5 = ((og2.l) p1VarC2.getF182175a()).f132058f;
            d0 d0VarA = d0.a(cVar.a(o0VarE));
            og2.b bVar5 = ((og2.l) p1VarC2.getF182175a()).f132055c;
            og2.b bVar6 = ((og2.l) p1VarC2.getF182175a()).f132056d;
            switch (qg2.c.b.f144688a[cVar.ordinal()]) {
                case 1:
                    o0Var = new og2.o0();
                    break;
                case 2:
                    o0Var = new v0(z14);
                    break;
                case 3:
                    o0Var = new og2.s0();
                    break;
                case 4:
                case 5:
                    o0Var = new r0(z14);
                    break;
                case 6:
                    o0Var = new u0(z14);
                    break;
                case 7:
                    o0Var = new og2.n0(z14);
                    break;
                default:
                    lc.u0.r();
                    return;
            }
            g0 g0Var = new g0(o0Var, ((og2.l) p1VarC2.getF182175a()).f132057e);
            long jC = d92.b.a(o0VarE).j().c();
            fVar2.getClass();
            og2.a.a(rVarA, new og2.f(cVarE, jVar, cVar5, d0VarA, bVar5, bVar6, new q0(g0Var, new og2.q(jC, s0Var, d92.c.f(x0Var2, o0VarE), null)), new k0(pVar, ((og2.l) p1VarC2.getF182175a()).f132059g), ((og2.l) p1VarC2.getF182175a()).f132060h, null), o0VarE, 0);
            o0VarE.g0(true);
            rVar2 = aVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(rVar2, cVar, aVar, aVar2, z14, o2Var, o2Var2, i14);
        }
    }
}
