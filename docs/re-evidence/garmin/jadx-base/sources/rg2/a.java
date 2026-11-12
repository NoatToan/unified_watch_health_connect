package rg2;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.gf;
import i3.mh;
import java.util.List;
import java.util.Map;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static final void a(List<ag2.c> list, Map<ag2.c.a, ah2.e> map, boolean z14, rf2.l lVar, zf2.d dVar, boolean z15, p3.m mVar, int i14) {
        rf2.l lVar2;
        boolean z16;
        list.getClass();
        map.getClass();
        dVar.getClass();
        o0 o0VarE = mVar.E(1047310543);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(map) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.B(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(dVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            z16 = z15;
            i15 |= o0VarE.h(z16) ? 131072 : 65536;
        } else {
            z16 = z15;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97921f, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_activity_details);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), o0VarE, 0, 0, 131070);
            int i16 = i15 << 3;
            g.a(null, list, null, z14, lVar2, dVar, z16, null, map, dVar == zf2.d.f204583b2, dVar == zf2.d.f204585c2, o0VarE, (i16 & 3670016) | (i16 & 112) | 12583296 | (i16 & 7168) | (57344 & i16) | (458752 & i16) | ((i15 << 21) & 234881024), 1);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(list, map, z14, lVar, dVar, z15, i14);
        }
    }
}
