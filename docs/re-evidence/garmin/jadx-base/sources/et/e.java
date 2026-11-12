package et;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs.c f65241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f65242c;

    public /* synthetic */ e(zs.c cVar, p1 p1Var, int i14) {
        this.f65240a = i14;
        this.f65241b = cVar;
        this.f65242c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        ys.b bVar;
        vs.a aVar;
        GDISmartProto.Smart smartC;
        int i14 = this.f65240a;
        p1 p1Var = this.f65242c;
        zs.c cVar = this.f65241b;
        switch (i14) {
            case 0:
                us.a aVar2 = cVar.f206789e.f192034b;
                if (aVar2 != null) {
                    a2 a2Var = a2.ACTIVITY_RECORDING;
                    rs2.c cVar2 = aVar2.f172337e;
                    if (cVar2 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    String strE = org.apache.commons.lang3.e.e(cVar2.getF92746j(), "discardActivityRecording device unit id ");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", strE);
                    GDISmartProto.Smart smartC2 = us.a.c(aVar2, GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.DISCARD, null, 2);
                    if (smartC2 != null) {
                        aVar2.d(smartC2);
                    }
                }
                p2 p2Var = cVar.f206791g;
                do {
                    value = p2Var.getValue();
                    bVar = (ys.b) p2Var.getValue();
                    int i15 = zs.c.f206784l;
                    bVar.getClass();
                    aVar = bVar.f199162d;
                } while (!p2Var.b(value, ys.b.b(bVar, false, false, null, aVar != null ? vs.a.b(aVar, null, ys.a.b.f199153a, null, 5) : null, null, null, 54)));
                cVar.f206785a.f(p2Var.getValue(), "ui_state");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                p1Var.setValue(Boolean.TRUE);
                us.a aVar3 = cVar.f206789e.f192034b;
                if (aVar3 != null && (smartC = us.a.c(aVar3, GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.PAUSE, null, 2)) != null) {
                    aVar3.d(smartC);
                }
                return Unit.INSTANCE;
        }
    }
}
