package af0;

import a11.j;
import a42.r;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.k;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import o4.m1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;
import s5.x0;
import we0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    public static final void a(we0.d dVar, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        dVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1918926108);
        int i15 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(dVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a03.e(dVar, 3);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a03.e(dVar, 3);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(h.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar2);
            o0VarE.g0(false);
            h hVar = (h) u1VarResolveViewModel;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            hVar.getClass();
            context.getClass();
            p2 p2Var = hVar.f3053g;
            i.f184761d.getClass();
            ArrayList arrayList = new ArrayList();
            for (i iVar : i.f184763f) {
                String string = context.getString(iVar.f184764a);
                string.getClass();
                arrayList.add(new we0.h(string, iVar.f184765b, false, iVar.f184766c, 4, null));
            }
            p2Var.k(null, arrayList);
            w9.a aVarA = v1.a(hVar);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new g(hVar, null), 2);
            p1 p1VarC = p0.c(hVar.f3051e, o0VarE, 0);
            p1 p1VarC2 = p0.c(hVar.f3055i, o0VarE, 0);
            p1 p1VarC3 = p0.c(hVar.f3057k, o0VarE, 0);
            p1 p1VarC4 = p0.c(hVar.f3059m, o0VarE, 0);
            p1 p1VarC5 = p0.c(hVar.f3060n, o0VarE, 0);
            p1 p1VarC6 = p0.c(hVar.f3062p, o0VarE, 0);
            p1 p1VarC7 = p0.c(hVar.f3064r, o0VarE, 0);
            z3.e eVarC = z3.f.c(-1710042889, new c(aVar, p1VarC, 0), o0VarE);
            z3.e eVarC2 = z3.f.c(1012928627, new j((Object) hVar, (e23.a) aVar, (Object) context, (Object) dVar, (Object) p1VarC2, (Object) p1VarC3, (Object) p1VarC5, (Object) p1VarC4, (Object) p1VarC6, (Object) p1VarC7, 1), o0VarE);
            o0Var = o0VarE;
            z02.d.a(false, eVarC, null, null, null, eVarC2, o0Var, 196656, 29);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(dVar, aVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h hVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0Var2;
        h hVar2 = hVar;
        o0 o0VarE = mVar.E(-727837714);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = (o0VarE.r(hVar2) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = p0.c(hVar2.f3052f, o0VarE, 0);
            p1 p1VarC2 = p0.c(hVar2.f3054h, o0VarE, 0);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            h4.r rVarC = l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            String str = (String) p1VarC.getF182175a();
            d92.b.f58624b.getClass();
            int i17 = 0;
            mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            h4.r rVarZ = g8.i.Z(aVar);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0Var2, 0);
            int iHashCode = Long.hashCode(o0Var2.U);
            i2 i2VarA0 = o0Var2.a0();
            h4.r rVarC2 = k.c(rVarZ, o0Var2);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                o0Var2 = o0VarE;
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2 = o0VarE;
                o0Var2.M(aVar2);
            } else {
                o0Var2 = o0VarE;
                o0Var2.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0Var2);
            b4.c(h5.g.a.f81809f, i2VarA0, o0Var2);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0Var2, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0Var2);
            b0 b0Var = b0.f22601a;
            o0Var2.C(-888764129);
            o0 o0Var3 = o0Var2;
            for (we0.h hVar3 : (List) p1VarC2.getF182175a()) {
                h4.r.a aVar3 = h4.r.S;
                h4.r rVarF = x2.f(aVar3, 1.0f);
                boolean z14 = hVar3.f184759c;
                p5.l.f136032b.getClass();
                p5.l lVarA = p5.l.a(p5.l.f136035e);
                boolean zR = o0Var3.r(hVar2) | o0Var3.B(hVar3);
                Object objQ = o0Var3.q();
                if (zR) {
                    objQ = new a11.n(14, hVar2, hVar3);
                    o0Var3.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a11.n(14, hVar2, hVar3);
                        o0Var3.K(objQ);
                    }
                }
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarY = l.y(u1.n.e(j2.b.b(rVarF, z14, false, lVarA, (e23.a) objQ, 10), am.j.c(d92.b.f58623a, o0Var3), m1.f128891a), 16);
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar3, o0Var3, 48);
                x1 x1Var2 = n.f135158a;
                int iHashCode2 = Long.hashCode(o0Var3.U);
                i2 i2VarA1 = o0Var3.a0();
                h4.r rVarC3 = k.c(rVarY, o0Var3);
                h5.g.V.getClass();
                e0.a aVar5 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    o0Var3.M(aVar5);
                } else {
                    o0Var3.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0Var3);
                b4.c(h5.g.a.f81809f, i2VarA1, o0Var3);
                h5.g.a.b bVar4 = h5.g.a.f81813j;
                if (o0Var3.T || !s.g(o0Var3.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var3, iHashCode2, bVar4);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0Var3);
                u2 u2Var = u2.f22900a;
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                i7.a(n5.c.a(hVar3.f184758b, o0Var3, i17), null, x2.q(aVar3, j92.b.f97901d.f97906e), sn.a.y(o0Var3), o0Var3, 48, 0);
                String str2 = hVar3.f184757a;
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0Var3);
                bVar5.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                bVar5.getClass();
                o0 o0Var4 = o0Var3;
                mh.c(str2, u2Var.a(l.C(aVar3, f14, 0.0f, eVar2.f97920e, 0.0f, 10), 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var4, 0, 0, 131068);
                o0 o0Var5 = o0Var4;
                i7.a(n5.c.a(R.drawable.ic_chackmark, o0Var5, 0), null, l4.k.a(aVar3, hVar3.f184759c ? 1.0f : 0.0f), hb.a.s(o0Var5), o0Var5, 48, 0);
                o0Var5.g0(true);
                i17 = 0;
                hVar2 = hVar;
                o0Var3 = o0Var5;
            }
            i15 = 1;
            o0Var3.g0(i17);
            o0Var3.g0(true);
            x1 x1Var3 = n.f135158a;
            o0Var = o0Var3;
        } else {
            i15 = 1;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a61.d(hVar, i14, i15);
        }
    }
}
