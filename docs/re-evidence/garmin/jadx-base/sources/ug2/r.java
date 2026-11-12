package ug2;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg2.a f170923b;

    public /* synthetic */ r(lg2.a aVar, int i14) {
        this.f170922a = i14;
        this.f170923b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f170922a;
        lg2.a aVar = this.f170923b;
        switch (i14) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                ge1.b.T(v1.a(aVar), null, null, new lg2.e(aVar, num, null), 3);
                break;
            default:
                ag2.e eVar = (ag2.e) obj;
                eVar.getClass();
                if (aVar.f112268o) {
                    if (eVar == ag2.e.START_RECORDING || eVar == ag2.e.START) {
                        ge1.b.T(v1.a(aVar), null, null, new lg2.g(aVar, null), 3);
                    } else if (eVar == ag2.e.STOP_RECORDING || eVar == ag2.e.END) {
                        if (aVar.f112269p) {
                            aVar.f112269p = false;
                            ge1.b.T(v1.a(aVar), null, null, new lg2.h(aVar, null), 3);
                        }
                    } else if (!aVar.f112256c || ((Boolean) aVar.B4().f71486j.getValue()).booleanValue()) {
                        fg2.f fVarB4 = aVar.B4();
                        mf2.h hVarE = fVarB4.e();
                        if (hVarE != null) {
                            hVarE.d(mf2.h.f.LAP);
                        }
                        fVarB4.f71478b.f131773b.f().l();
                        Unit unit = Unit.INSTANCE;
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        fg2.f fVarB5 = aVar.B4();
                        mf2.h hVarE2 = fVarB5.e();
                        if (hVarE2 != null) {
                            hVarE2.d(mf2.h.f.LAP);
                        }
                        fVarB5.f71478b.f131773b.f().f();
                        Unit unit3 = Unit.INSTANCE;
                        Unit unit4 = Unit.INSTANCE;
                    }
                    aVar.f112268o = false;
                    ge1.b.T(v1.a(aVar), null, null, new lg2.b(aVar, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
