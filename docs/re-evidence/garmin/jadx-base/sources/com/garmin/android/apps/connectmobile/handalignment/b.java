package com.garmin.android.apps.connectmobile.handalignment;

import android.os.Handler;
import android.os.Looper;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIHandCalibration;
import com.garmin.proto.generated.GDIHandCalibrationExtension;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/b;", "", "<init>", "()V", "a", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f36607a = new b();

    public interface a<T> {
        void a(Exception exc);

        void b(Enum r14);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.handalignment.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/handalignment/b$b", "Lwm2/b;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0649b implements wm2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<GDIHandCalibration.CommandResponse.Status> f36608a;

        public C0649b(a<GDIHandCalibration.CommandResponse.Status> aVar) {
            this.f36608a = aVar;
        }

        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            new Handler(Looper.getMainLooper()).post(new eh2.b(this.f36608a, 1));
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            smart.getClass();
            new Handler(Looper.getMainLooper()).post(new df.d(5, smart, this.f36608a));
        }
    }

    private b() {
    }

    public static wm2.a a(long j8) {
        da2.b bVar = da2.d.b().f58886a.f111646e;
        DeviceProfile deviceProfile = (DeviceProfile) u.H(bVar.a(j8));
        if (deviceProfile == null) {
            return null;
        }
        String macAddress = deviceProfile.getMacAddress();
        macAddress.getClass();
        return (wm2.a) bVar.getCapability(macAddress, wm2.a.class);
    }

    public static void b(long j8, GDIHandCalibration.CommandRequest.Command command, a aVar) {
        command.getClass();
        wm2.a aVarA = a(j8);
        if (aVarA != null) {
            GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
            builderNewBuilder.getClass();
            GDIHandCalibration.HandCalibrationService.Builder builderNewBuilder2 = GDIHandCalibration.HandCalibrationService.newBuilder();
            GDIHandCalibration.CommandRequest.Builder builderNewBuilder3 = GDIHandCalibration.CommandRequest.newBuilder();
            builderNewBuilder3.setCommand(command);
            builderNewBuilder2.setCommandRequest(builderNewBuilder3.build());
            GDIHandCalibration.HandCalibrationService handCalibrationServiceBuild = builderNewBuilder2.build();
            handCalibrationServiceBuild.getClass();
            builderNewBuilder.setExtension(GDIHandCalibrationExtension.handCalibrationService, handCalibrationServiceBuild);
            GDISmartProto.Smart smartBuild = builderNewBuilder.build();
            smartBuild.getClass();
            aVarA.initiateRequest(smartBuild, j8, new C0649b(aVar));
        }
    }
}
