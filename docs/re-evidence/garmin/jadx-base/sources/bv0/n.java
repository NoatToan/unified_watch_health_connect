package bv0;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gv0.d f21350b;

    public /* synthetic */ n(gv0.d dVar, int i14) {
        this.f21349a = i14;
        this.f21350b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        ge2.e eVar;
        pu0.b bVar;
        int i14 = this.f21349a;
        boolean z14 = false;
        gv0.d dVar = this.f21350b;
        switch (i14) {
            case 0:
                ge2.b bVar2 = (ge2.b) obj;
                bVar2.getClass();
                dVar.Q4(new o13.p(ge2.c.ProfilePrivacy, bVar2));
                return Unit.INSTANCE;
            case 1:
                ge2.b bVar3 = (ge2.b) obj;
                bVar3.getClass();
                p2 p2Var = dVar.f79202t;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, bVar3));
                return Unit.INSTANCE;
            case 2:
                ge2.b bVar4 = (ge2.b) obj;
                bVar4.getClass();
                dVar.Q4(new o13.p(ge2.c.ActiveSessionPrivacy, bVar4));
                return Unit.INSTANCE;
            case 3:
                ou0.b bVar5 = (ou0.b) obj;
                bVar5.getClass();
                dVar.P4(bVar5);
                return Unit.INSTANCE;
            case 4:
                ((f.a) obj).getClass();
                dVar.U4();
                return Unit.INSTANCE;
            case 5:
                wd2.m1 m1Var = (wd2.m1) obj;
                int i15 = gv0.d.O0;
                m1Var.getClass();
                ou0.f fVar = (ou0.f) ((g3) dVar.f79203v.getValue()).f35301b;
                if (fVar == null) {
                    eVar = new ge2.e(null, null, null, null, null, null, null, 127, null);
                } else {
                    Boolean bool = fVar.f133983a;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    Boolean bool2 = fVar.f133986d;
                    boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                    ou0.b bVar6 = fVar.f133984b;
                    boolean z15 = bVar6 instanceof ou0.b.a;
                    if (bVar6 != null && !(bVar6 instanceof ou0.b.c)) {
                        z14 = true;
                    }
                    eVar = new ge2.e(fVar.f133987e, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Boolean.valueOf(z15), Boolean.valueOf(z14), fVar.f133988f, null, 64, null);
                }
                m1Var.f(-1L, eVar);
                return Unit.INSTANCE;
            case 6:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == -1) {
                    Intent intent = aVar.f67586b;
                    if (p005kotlin.jvm.internal.s.g(intent != null ? Boolean.valueOf(intent.getBooleanExtra("GCM_RESULT_HAS_MADE_LIVE_TRACK_SMS_OPT_IN_REQUEST", false)) : null, Boolean.TRUE) && (bVar = dVar.C) != null) {
                        pu0.b bVar7 = dVar.D;
                        boolean z16 = dVar.E;
                        dVar.C = null;
                        dVar.D = null;
                        dVar.E = false;
                        if (bVar7 != null) {
                            ge1.b.T(androidx.lifecycle.v1.a(dVar), null, null, new gv0.u(dVar, bVar, bVar7, null), 3);
                        } else if (z16) {
                            dVar.G4();
                        } else {
                            dVar.A4(bVar);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 7:
                ((f.a) obj).getClass();
                dVar.U4();
                return Unit.INSTANCE;
            case 8:
                f.a aVar2 = (f.a) obj;
                aVar2.getClass();
                if (aVar2.f67585a == -1) {
                    dVar.F4();
                }
                return Unit.INSTANCE;
            case 9:
                f.a aVar3 = (f.a) obj;
                aVar3.getClass();
                if (aVar3.f67585a == -1) {
                    dVar.F4();
                }
                return Unit.INSTANCE;
            case 10:
                ((f.a) obj).getClass();
                dVar.G4();
                return Unit.INSTANCE;
            case 11:
                f.a aVar4 = (f.a) obj;
                aVar4.getClass();
                if (aVar4.f67585a == -1) {
                    dVar.F4();
                }
                return Unit.INSTANCE;
            case 12:
                pu0.b bVar8 = (pu0.b) obj;
                bVar8.getClass();
                return Boolean.valueOf(dVar.J4(bVar8, dVar.K4()));
            case 13:
                pu0.b bVar9 = (pu0.b) obj;
                bVar9.getClass();
                gv0.d.T4(dVar, bVar9, null, null, 10);
                return Unit.INSTANCE;
            case 14:
                ((f.a) obj).getClass();
                dVar.G4();
                return Unit.INSTANCE;
            case 15:
                pu0.b bVar10 = (pu0.b) obj;
                bVar10.getClass();
                return Boolean.valueOf(dVar.J4(bVar10, dVar.K4()));
            case 16:
                pu0.b bVar11 = (pu0.b) obj;
                bVar11.getClass();
                gv0.d.T4(dVar, bVar11, null, null, 10);
                return Unit.INSTANCE;
            case 17:
                ou0.b bVar12 = (ou0.b) obj;
                bVar12.getClass();
                dVar.P4(bVar12);
                return Unit.INSTANCE;
            case 18:
                ((f.a) obj).getClass();
                dVar.U4();
                return Unit.INSTANCE;
            case 19:
                f.a aVar5 = (f.a) obj;
                aVar5.getClass();
                if (aVar5.f67585a == -1) {
                    dVar.F4();
                }
                return Unit.INSTANCE;
            case 20:
                f.a aVar6 = (f.a) obj;
                aVar6.getClass();
                if (aVar6.f67585a == -1) {
                    dVar.F4();
                }
                return Unit.INSTANCE;
            default:
                f.a aVar7 = (f.a) obj;
                aVar7.getClass();
                if (aVar7.f67585a == -1) {
                    dVar.F4();
                }
                return Unit.INSTANCE;
        }
    }
}
