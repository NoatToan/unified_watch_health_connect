package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Handler;
import android.os.Looper;
import com.garmin.proto.generated.GDIConnectIQAppSettingsExtension;
import com.garmin.proto.generated.GDIConnectIQAppSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes7.dex */
public class i0 implements wm2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.i f31881a;

    public i0(b0 b0Var, b0.i iVar) {
        this.f31881a = iVar;
    }

    @Override // wm2.b
    public final void onResponseFailed(int i14) {
        b0.i iVar = this.f31881a;
        if (iVar != null) {
            new Handler(Looper.getMainLooper()).post(new cd0.h0(iVar, 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // wm2.b
    public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
        GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService connectIQAppSettingsService;
        b0.i iVar = this.f31881a;
        if (iVar != null) {
            if (smart != null) {
                GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService> generatedExtension = GDIConnectIQAppSettingsExtension.connectIqAppSettingsService;
                if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                    connectIQAppSettingsService = (GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
                } else {
                    connectIQAppSettingsService = null;
                }
            } else {
                connectIQAppSettingsService = null;
            }
            if (connectIQAppSettingsService == null || !connectIQAppSettingsService.hasGetAppSettingsResponse()) {
                new Handler(Looper.getMainLooper()).post(new cd0.h0(iVar, 8));
                return;
            }
            GDIConnectIQAppSettingsProto.GetAppSettingsResponse getAppSettingsResponse = connectIQAppSettingsService.getGetAppSettingsResponse();
            if (getAppSettingsResponse.getResponse() == GDIConnectIQAppSettingsProto.GetAppSettingsResponse.Response.SUCCESS) {
                new Handler(Looper.getMainLooper()).post(new cd0.f(7, iVar, getAppSettingsResponse));
            } else {
                new Handler(Looper.getMainLooper()).post(new cd0.h0(iVar, 8));
            }
        }
    }
}
