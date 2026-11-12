package com.garmin.android.apps.connectmobile.handalignment;

import com.garmin.proto.generated.GDIHandCalibration;
import com.garmin.proto.generated.GDIHandCalibrationExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import en0.o;
import java.io.IOException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/d;", "Lwm2/b;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements wm2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.a<GDIHandCalibration.StepResponse.Status> f36610a;

    public d(b.a<GDIHandCalibration.StepResponse.Status> aVar) {
        this.f36610a = aVar;
    }

    @Override // wm2.b
    public final void onResponseFailed(int i14) {
        this.f36610a.a(new IOException("Low level error."));
    }

    @Override // wm2.b
    public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
        smart.getClass();
        boolean zHasExtension = smart.hasExtension((GeneratedMessage.GeneratedExtension) GDIHandCalibrationExtension.handCalibrationService);
        b.a<GDIHandCalibration.StepResponse.Status> aVar = this.f36610a;
        if (!zHasExtension) {
            aVar.a(new IllegalStateException("No handCalibrationService passed."));
            return;
        }
        GDIHandCalibration.HandCalibrationService handCalibrationServiceA = o.a(smart);
        if (!handCalibrationServiceA.hasStepResponse()) {
            aVar.a(new IllegalStateException("No handCalibrationStepResponse passed."));
            return;
        }
        GDIHandCalibration.StepResponse stepResponse = handCalibrationServiceA.getStepResponse();
        if (!stepResponse.hasStatus()) {
            aVar.a(new IllegalStateException("No status passed."));
            return;
        }
        GDIHandCalibration.StepResponse.Status status = stepResponse.getStatus();
        status.getClass();
        aVar.b(status);
    }
}
