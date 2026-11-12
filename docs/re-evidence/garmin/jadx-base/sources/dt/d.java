package dt;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs.c f61105b;

    public /* synthetic */ d(zs.c cVar, int i14) {
        this.f61104a = i14;
        this.f61105b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        ys.b bVar;
        GDISmartProto.Smart smartC;
        Object value2;
        ys.b bVar2;
        GDISmartProto.Smart smartC2;
        vs.f fVar;
        String str;
        switch (this.f61104a) {
            case 0:
                this.f61105b.getClass();
                ((ts.b) KoinJavaComponent.get$default(ts.b.class, null, null, 6, null)).a();
                return Unit.INSTANCE;
            case 1:
                zs.c cVar = this.f61105b;
                p2 p2Var = cVar.f206791g;
                do {
                    value = p2Var.getValue();
                    bVar = (ys.b) p2Var.getValue();
                    bVar.getClass();
                } while (!p2Var.b(value, ys.b.b(bVar, true, false, null, null, null, null, 62)));
                cVar.f206785a.f(p2Var.getValue(), "ui_state");
                return Unit.INSTANCE;
            case 2:
                us.a aVar = this.f61105b.f206789e.f192034b;
                if (aVar != null && (smartC = us.a.c(aVar, GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.RESUME, null, 2)) != null) {
                    aVar.d(smartC);
                }
                return Unit.INSTANCE;
            case 3:
                xs.a aVar2 = this.f61105b.f206789e;
                p2 p2Var2 = aVar2.f192035c;
                p2Var2.k(null, vs.a.b((vs.a) p2Var2.getValue(), null, ys.a.d.f199155a, null, 5));
                us.a aVar3 = aVar2.f192034b;
                if (aVar3 != null) {
                    aVar3.f172338f = null;
                }
                if (aVar3 != null) {
                    a2 a2Var = a2.ACTIVITY_RECORDING;
                    rs2.c cVar2 = aVar3.f172337e;
                    if (cVar2 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    String strE = org.apache.commons.lang3.e.e(cVar2.getF92746j(), "saveActivityRecording device unit id  ");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", strE);
                    GDISmartProto.Smart smartC3 = us.a.c(aVar3, GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.SAVE, null, 2);
                    if (smartC3 != null) {
                        aVar3.d(smartC3);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                zs.c cVar3 = this.f61105b;
                p2 p2Var3 = cVar3.f206791g;
                do {
                    value2 = p2Var3.getValue();
                    bVar2 = (ys.b) p2Var3.getValue();
                    bVar2.getClass();
                } while (!p2Var3.b(value2, ys.b.b(bVar2, false, false, null, null, null, null, 62)));
                cVar3.f206785a.f(p2Var3.getValue(), "ui_state");
                return Unit.INSTANCE;
            default:
                zs.c cVar4 = this.f61105b;
                vs.e eVar = (vs.e) cVar4.f206793i.getValue();
                if (eVar != null && (fVar = eVar.f179706a) != null && (str = fVar.f179711a) != null) {
                    xs.g gVar = cVar4.f206787c;
                    gVar.getClass();
                    gVar.f192052a.b(str);
                    gVar.f192053b.k(null, gVar.a());
                }
                us.a aVar4 = cVar4.f206789e.f192034b;
                if (aVar4 != null && (smartC2 = us.a.c(aVar4, GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.INITIAL_START, null, 2)) != null) {
                    aVar4.d(smartC2);
                }
                return Unit.INSTANCE;
        }
    }
}
