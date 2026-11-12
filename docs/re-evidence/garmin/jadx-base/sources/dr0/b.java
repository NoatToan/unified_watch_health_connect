package dr0;

import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIInstantInput;
import com.garmin.proto.generated.GDISmartProto;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GDISmartProto.Smart f60827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f60828c;

    public /* synthetic */ b(GDISmartProto.Smart smart, f fVar, int i14) {
        this.f60826a = i14;
        this.f60827b = smart;
        this.f60828c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60826a) {
            case 0:
                i2.a aVar = i2.f36769a;
                i2.a.c(aVar, "InstantInputBizManager", "cancelInstantInput()$onResponseReceived()");
                GDIInstantInput.InstantInputService instantInputService = ProtoUtil.INSTANCE.getInstantInputService(this.f60827b);
                f fVar = this.f60828c;
                if (instantInputService != null && instantInputService.hasEndResponse()) {
                    GDIInstantInput.InstantInputEndResponse endResponse = instantInputService.getEndResponse();
                    i2.a.c(aVar, "InstantInputBizManager", "device replies " + endResponse.getResult().name());
                    if (fVar != null) {
                        fVar.a(endResponse.getResult() == GDIInstantInput.CommandResult.SUCCESS);
                    }
                } else {
                    i2.a.j(aVar, "InstantInputBizManager", "A cancellation is not responded with a EndResponse! Check the design");
                    if (fVar != null) {
                        fVar.a(false);
                    }
                }
                break;
            default:
                GDIInstantInput.InstantInputService instantInputService2 = ProtoUtil.INSTANCE.getInstantInputService(this.f60827b);
                f fVar2 = this.f60828c;
                if (instantInputService2 != null && instantInputService2.hasEndResponse()) {
                    GDIInstantInput.InstantInputEndResponse endResponse2 = instantInputService2.getEndResponse();
                    i2.a.c(i2.f36769a, "InstantInputBizManager", "device replies " + endResponse2.getResult().name());
                    if (fVar2 != null) {
                        fVar2.a(endResponse2.getResult() == GDIInstantInput.CommandResult.SUCCESS);
                    }
                } else {
                    i2.a.j(i2.f36769a, "InstantInputBizManager", "A confirmation is not responded with a EndResponse! Check the design");
                    new Handler(Looper.getMainLooper()).post(new c(fVar2, 2));
                }
                break;
        }
    }
}
