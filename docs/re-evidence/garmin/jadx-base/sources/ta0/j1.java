package ta0;

import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 {
    public static final void a(int i14, e23.a aVar, e23.l lVar, i53.c cVar, p3.m mVar, boolean z14) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1637170470);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            da0.p.d("device_discovery_multiple_devices_detected_screen", false, null, null, null, null, z3.f.c(131412143, new p40.d0(cVar, z14, lVar, aVar), o0VarE), o0VarE, 12582918, 126);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.d0(z14, cVar, lVar, aVar, i14);
        }
    }
}
