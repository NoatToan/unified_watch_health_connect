package qw1;

import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import i53.f;
import j23.l;
import java.util.ArrayList;
import java.util.Iterator;
import o62.s0;
import ov1.q;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z72.k;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f<a> f148380a = i53.a.a(new a(new l(0, 14), "Base Phase"), new a(new l(14, 21), "Build Phase"), new a(new l(21, 28), "Peak Phase"));

    public static final void a(b bVar, m mVar, int i14) {
        int i15 = bVar.f148375a;
        int i16 = bVar.f148377c;
        o0 o0VarE = mVar.E(1753133379);
        int i17 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        if (o0VarE.n(i17 & 1, (i17 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            ArrayList arrayList = new ArrayList();
            o0VarE.C(1134014994);
            Iterator<a> it = bVar.f148379e.iterator();
            float f14 = 0.0f;
            while (it.hasNext()) {
                l lVar = it.next().f148373a;
                int i18 = lVar.f96797b;
                int i19 = lVar.f96796a;
                int i24 = lVar.f96797b;
                if (i24 <= i15) {
                    o0VarE.C(-859701387);
                    float fB = b(i18 - i19, i16);
                    f14 += fB;
                    d92.b.f58623a.getClass();
                    arrayList.add(new z72.l(fB, d92.b.a(o0VarE).e().f(), null));
                    o0VarE.g0(false);
                } else if (lVar.f96796a > i15 || i15 > i24) {
                    o0VarE.C(-858730529);
                    float fB2 = b(i18 - i19, i16);
                    d92.b.f58623a.getClass();
                    arrayList.add(new z72.l(fB2, d92.b.a(o0VarE).e().f(), null));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-859316491);
                    float fB3 = b(i15 - i19, i16) + f14;
                    float fB4 = b(i18 - i19, i16);
                    d92.b.f58623a.getClass();
                    arrayList.add(new z72.l(fB4, d92.b.a(o0VarE).e().f(), null));
                    o0VarE.g0(false);
                    f14 = fB3;
                }
            }
            o0VarE.g0(false);
            r rVarQ = x2.q(r.S, gl.b.q(o0VarE, R.dimen.gauge_chart_size_normal));
            f fVarJ = i53.a.j(arrayList);
            d92.b.f58623a.getClass();
            k.b(f14, 0.0f, 3.0f, 102260736, SyslogConstants.LOG_LOCAL4, d92.b.a(o0VarE).e().e(), z3.f.c(217118525, new s0(bVar, 12), o0VarE), rVarQ, fVarJ, o0VarE, false);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(bVar, i14, 26);
        }
    }

    public static final float b(int i14, int i15) {
        if (i14 >= i15) {
            return 1.0f;
        }
        if (i14 <= 0) {
            return 0.0f;
        }
        return i14 / i15;
    }
}
