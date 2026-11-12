package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f66580b;

    public /* synthetic */ m1(q1 q1Var, int i14) {
        this.f66579a = i14;
        this.f66580b = q1Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    @Override // e23.a
    public final Object invoke() {
        aw1.e eVar;
        jv1.s sVarI6;
        fg0.k kVar;
        Boolean bool;
        int i14 = this.f66579a;
        q1 q1Var = this.f66580b;
        switch (i14) {
            case 0:
                q1.a aVar = q1.f66677f;
                q1Var.J6().o5();
                break;
            case 1:
                q1.a aVar2 = q1.f66677f;
                q1Var.I6();
                break;
            case 2:
                q1.a aVar3 = q1.f66677f;
                q1Var.K6();
                break;
            default:
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachCreatePlanStarted");
                q1.a aVar4 = q1.f66677f;
                aw1.h hVarJ6 = q1Var.J6();
                int i15 = aw1.h.S1;
                if (hVarJ6.H5().f61437c) {
                    dw1.a aVarH5 = hVarJ6.H5();
                    if (!aVarH5.f61437c) {
                        eVar = new aw1.e(hVarJ6, 9);
                        sVarI6 = hVarJ6.i6();
                        if (sVarI6 != null) {
                            kVar = sVarI6.f101124c;
                        } else {
                            kVar = null;
                        }
                        if (kVar != null) {
                            ge1.b.T(androidx.lifecycle.v1.a(hVarJ6), null, null, new aw1.r0(kVar, hVarJ6, eVar, null), 3);
                        }
                    } else {
                        ww1.g gVar = aVarH5.f61438d;
                        if ((gVar != null ? gVar.f187764b : null) == null || !((bool = aVarH5.f61439e) == null || bool.equals(Boolean.FALSE))) {
                            eVar = new aw1.e(hVarJ6, 9);
                            sVarI6 = hVarJ6.i6();
                            if (sVarI6 != null) {
                                kVar = sVarI6.f101124c;
                            } else {
                                kVar = null;
                            }
                            if (kVar != null) {
                                ge1.b.T(androidx.lifecycle.v1.a(hVarJ6), null, null, new aw1.r0(kVar, hVarJ6, eVar, null), 3);
                            }
                        } else {
                            aw1.e eVar2 = new aw1.e(hVarJ6, 8);
                            ww1.g gVar2 = hVarJ6.H5().f61438d;
                            Long l14 = gVar2 != null ? gVar2.f187764b : null;
                            ww1.g gVar3 = hVarJ6.H5().f61438d;
                            boolean z14 = (gVar3 != null ? gVar3.f187765c : null) != null;
                            ww1.g gVar4 = hVarJ6.H5().f61438d;
                            ge1.b.T(androidx.lifecycle.v1.a(hVarJ6), null, null, new aw1.m0(hVarJ6, l14, z14, gVar4 != null ? gVar4.f187767e : null, eVar2, null), 3);
                        }
                    }
                } else {
                    hVarJ6.o5();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
