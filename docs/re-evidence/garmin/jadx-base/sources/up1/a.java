package up1;

import androidx.room.a0;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i53.c;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v.h;
import xp1.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    public static final void a(xp1.b bVar, boolean z14, l<? super Boolean, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        boolean z15;
        o0 o0VarP = a0.p(lVar, aVar, mVar, -398118093);
        int i15 = i14 | (o0VarP.B(bVar) ? 4 : 2) | (o0VarP.h(z14) ? 32 : 16) | (o0VarP.r(lVar) ? 256 : 128) | (o0VarP.r(aVar) ? 2048 : 1024);
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                c<d> cVar = bVar != null ? bVar.f191855c : null;
                if (cVar == null || cVar.isEmpty()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
            r rVarD = x2.d(r.S, 1.0f);
            h4.d.f81522a.getClass();
            g.a aVar2 = h4.d.a.f81537o;
            j jVar = j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            z zVarA = y.a(j.i(f14), aVar2, o0VarP, 48);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            r rVarC = k.c(rVarD, o0VarP);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar3);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarP, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            b0 b0Var = b0.f22601a;
            tp1.a.a(bVar, lVar, o0VarP, (i15 & 14) | ((i15 >> 3) & 112));
            if (z15) {
                o0VarP.C(169284368);
                b82.n.d(null, gl1.y.Q(o0VarP, R.string.no_solar_intensity_data_title), gl1.y.Q(o0VarP, R.string.no_solar_intensity_data_message), null, gl1.y.Q(o0VarP, R.string.common_learn_more), aVar, null, null, o0VarP, (i15 << 6) & 458752, 201);
                o0VarP.g0(false);
            } else {
                o0VarP.C(169612069);
                o0VarP.g0(false);
            }
            o0VarP.g0(true);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(bVar, z14, lVar, aVar, i14, 15);
        }
    }
}
