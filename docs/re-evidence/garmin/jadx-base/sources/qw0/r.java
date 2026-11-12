package qw0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.s0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List<m> list, com.garmin.android.library.mapsdkadapter.i.d dVar, e23.l<? super com.garmin.android.library.mapsdkadapter.i.d, Unit> lVar, p3.m mVar, int i14) {
        String strJ;
        dVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(807909752);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(dVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(dVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new pp.b(p1Var, 6);
                o0VarE.K(objQ2);
            }
            int iO = zf.b.o((e23.l) objQ2, list);
            boolean zB = o0VarE.B(list);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                int i16 = 0;
                for (Object obj : list) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    arrayList.add(new o13.p(Integer.valueOf(i16), (m) obj));
                    i16 = i17;
                }
                objQ3 = p0.n(arrayList);
                o0VarE.K(objQ3);
            }
            o0VarE.C(-987791440);
            List<o13.p> list2 = (List) ((p1) objQ3).getF182175a();
            ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
            for (o13.p pVar : list2) {
                com.garmin.android.library.mapsdkadapter.i.d dVar2 = ((m) pVar.f128595b).f148324a;
                int[] iArr = m.a.f148325a;
                int i18 = iArr[dVar2.ordinal()];
                int i19 = i18 != 1 ? i18 != 2 ? -1 : R.string.lbl_mapbox : R.string.lbl_google_maps;
                if (i19 < 0) {
                    o0VarE.C(1617651907);
                    o0VarE.g0(false);
                    int i24 = iArr[((m) pVar.f128595b).f148324a.ordinal()];
                    if (i24 == 1) {
                        strJ = "_Google Maps";
                    } else if (i24 != 2) {
                        strJ = i24 != 3 ? "" : "_Baidu Maps";
                    } else {
                        strJ = "_Mapbox Maps";
                    }
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1617723238, i19, o0VarE, false);
                }
                arrayList2.add(new o13.p(pVar.f128594a, strJ));
            }
            o0VarE.g0(false);
            boolean zR = o0VarE.r(list) | ((i15 & 896) == 256);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == p3.m.a.f135155b) {
                objQ4 = new p90.h(list, 18, lVar, p1Var);
                o0VarE.K(objQ4);
            }
            b(arrayList2, iO, null, (e23.l) objQ4, o0VarE, 1573248);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(list, dVar, lVar, i14, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ArrayList arrayList, int i14, h4.r rVar, e23.l lVar, p3.m mVar, int i15) {
        h4.r rVar2;
        lVar.getClass();
        o0 o0VarE = mVar.E(1007481920);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i15 | (o0VarE.r(arrayList) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | 3072 | (o0VarE.r(lVar) ? 16384 : 8192) | 12779520;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new qr.n(23);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            boolean z14 = (57344 & i16) == 16384;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new qe2.c(lVar, 5);
                o0VarE.K(objQ2);
            }
            e23.l lVar2 = (e23.l) objQ2;
            boolean zB = ((i16 & 112) == 32) | o0VarE.B(arrayList);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = p0.n((i14 < 0 || i14 >= arrayList.size()) ? new o13.p(-1, "_Default string") : arrayList.get(i14));
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            o0VarE.C(1822506446);
            d92.b bVar = d92.b.f58623a;
            bVar.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            o0VarE.g0(false);
            bVar.getClass();
            long jB = d92.b.a(o0VarE).c().b();
            m1.a aVar2 = m1.f128891a;
            h4.r rVarE = u1.n.e(aVar, jB, aVar2);
            Boolean bool = Boolean.TRUE;
            boolean zB2 = o0VarE.B(p1Var);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new q(p1Var);
                o0VarE.K(objQ4);
            }
            h4.r rVarB = s0.b(rVarE, bool, (PointerInputEventHandler) objQ4);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarB, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String str = (String) ((o13.p) p1Var2.getF182175a()).f128595b;
            fVar.getClass();
            x0 x0VarB2 = d92.c.b(x0Var, o0VarE);
            d6.p.f57793b.getClass();
            mh.c(str, aVar, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, x0VarB2, o0VarE, 48, 24960, 110588);
            o0VarE.C(-1715531232);
            b3.b.a aVar4 = b3.b.a.f15503a;
            i7.b(d3.k.a(), null, null, x0VarB.c(), o0VarE, 48, 4);
            o0VarE.g0(false);
            o0VarE.g0(true);
            bVar2.getClass();
            h4.r rVarY2 = c2.l.y(aVar, eVar.f97920e);
            h4.g gVar2 = h4.d.a.f81532j;
            h4.r rVarY3 = x2.y(rVarY2, gVar2, 2);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            h4.r rVarE2 = u1.n.e(x2.y(aVar, gVar2, 2), d92.b.a(o0VarE).c().e(), aVar2);
            boolean zB3 = o0VarE.B(p1Var);
            Object objQ5 = o0VarE.q();
            if (zB3 || objQ5 == c2565a) {
                objQ5 = new qk0.m(p1Var, 1);
                o0VarE.K(objQ5);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ5, rVarE2, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-289275349, new p(arrayList, p1Var, p1Var2, lVar2, i14, aVar, 0), o0VarE), o0VarE, 0, 48, 2040);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(arrayList, i14, rVar2, lVar, i15);
        }
    }

    public static final ArrayList c() {
        ie2.n.f93149a.getClass();
        List<com.garmin.android.library.mapsdkadapter.i.d> listC = ((i) ie2.n.a()).c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((com.garmin.android.library.mapsdkadapter.i.d) obj) != com.garmin.android.library.mapsdkadapter.i.d.GOOGLE || !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new m((com.garmin.android.library.mapsdkadapter.i.d) it.next()));
        }
        return arrayList2;
    }
}
