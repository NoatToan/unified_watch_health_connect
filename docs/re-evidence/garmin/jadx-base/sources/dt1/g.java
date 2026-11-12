package dt1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.k;
import com.garmin.android.library.mapsdkadapter.r;
import dh0.j;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static final void a(i.d dVar, i53.f<le2.d> fVar, i53.c<le2.c> cVar, List<ke2.b> list, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        i53.c<le2.c> cVar2;
        dVar.getClass();
        fVar.getClass();
        cVar.getClass();
        list.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-726924829);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(dVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            cVar2 = cVar;
            i15 |= o0VarE.B(cVar2) ? 256 : 128;
        } else {
            cVar2 = cVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(list) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            ie2.n.f93149a.getClass();
            k kVarA = ie2.n.a();
            ke2.b bVar = new ke2.b(0.0d, 0.0d, null, 4, null);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new j(9);
                o0VarE.K(objQ);
            }
            je2.b<?> bVarE = ((r) kVarA).e(dVar, bVar, (e23.a) objQ, o0VarE, (i15 & 14) | 384 | (ke2.b.f104550d << 3));
            if (bVarE == null) {
                o0VarE.C(-592029363);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1504922932);
                bVarE.b(x2.h(x2.f(h4.r.S, 1.0f), gl.b.q(o0VarE, R.dimen.trail_preview_view_box_height)), fVar, cVar2, list, 0, false, aVar, false, null, o0VarE, ((i15 << 6) & 3670016) | (i15 & 8176) | 1073741824, 432);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(dVar, fVar, cVar, list, aVar, i14, 12);
        }
    }
}
