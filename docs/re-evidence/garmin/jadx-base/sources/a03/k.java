package a03;

import aq.a3;
import aq.o2;
import aq.y2;
import aq.z2;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.compose.clustering.ClusteringKt;
import com.google.maps.android.compose.streetview.StreetViewKt;
import i3.mh;
import p005kotlin.Unit;
import ps.x1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112c;

    public /* synthetic */ k(Object obj, int i14, int i15) {
        this.f110a = i15;
        this.f112c = obj;
        this.f111b = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f110a;
        int i15 = this.f111b;
        Object obj3 = this.f112c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int i16 = l.f115g;
                ((l) obj3).Content((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.d.d((ak0.u) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int i17 = o2.f12136f;
                ((o2) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i18 = y2.f12312f;
                ((y2) obj3).h((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int i19 = z2.f12318f;
                ((z2) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int i24 = a3.f11821f;
                ((a3) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                int i25 = bd0.n.f17593f;
                ((bd0.n) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                int i26 = c70.c.f25219f;
                ((c70.c) obj3).h((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                int i27 = cf1.b.f27017g;
                ((cf1.b) obj3).h((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int i28 = ck0.r.f27882f;
                ((ck0.r) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                cn1.g.a((qm1.m) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 11:
                return ClusteringKt.ResetMapListeners$lambda$61((ClusterManager) obj3, i15, (p3.m) obj, ((Integer) obj2).intValue());
            case 12:
                return StreetViewKt.StreetViewLifecycle$lambda$24((StreetViewPanoramaView) obj3, i15, (p3.m) obj, ((Integer) obj2).intValue());
            case 13:
                ((Integer) obj2).getClass();
                cq.u.f((x1) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                int i29 = cq.w.f55111f;
                ((cq.w) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i30 = cr.b0.f55254f;
                ((cr.b0) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                int i34 = cr0.e.f55329f;
                ((cr0.e) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                int i35 = d52.i.f57576f;
                ((d52.i) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 18:
                e2.p pVar = (e2.p) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    g2.j<e2.j> jVarB = pVar.f62493b.f62487a.b(i15);
                    jVarB.f75140c.f62471c.invoke(pVar.f62494c, Integer.valueOf(i15 - jVarB.f75138a), mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 19:
                f2.p pVar2 = (f2.p) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    g2.j<f2.k> jVarB2 = pVar2.f68257b.f68231b.b(i15);
                    jVarB2.f75140c.f68223d.invoke(f2.s.f68302a, Integer.valueOf(i15 - jVarB2.f75138a), mVar2, 6);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                f70.c.a((b70.h) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                int i36 = ft1.e.f73449f;
                ((ft1.e) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                int i37 = ft1.f.f73450f;
                ((ft1.f) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                int i38 = ft1.g.f73451f;
                ((ft1.g) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                int i39 = ft1.h.f73452f;
                ((ft1.h) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 25:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.f46024o;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    eVar.v6(eVar.y6().D4() || eVar.y6().f74015n, eVar.y6().f74014m, this.f111b, eVar.y6().f74019r, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                int i44 = gg1.a.f77183f;
                ((gg1.a) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 27:
                h2.x xVar = (h2.x) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    g2.j jVarB3 = xVar.f81022b.getF81020c().b(i15);
                    ((h2.p) jVarB3.f75140c).f80988b.invoke(xVar.f81024d, Integer.valueOf(i15 - jVarB3.f75138a), mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 28:
                i53.f fVar = (i53.f) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    String str = (String) fVar.get(i15);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97932i;
                    d6.h.f57752b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var, mVar5, 0, 0, 130046);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                hn1.g.f((ir0.e) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
        }
    }
}
