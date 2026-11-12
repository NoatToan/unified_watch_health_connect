package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Handler;
import android.os.Looper;
import com.garmin.proto.generated.GDIConnectIQAppSettingsExtension;
import com.garmin.proto.generated.GDIConnectIQAppSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes7.dex */
public class k0 implements wm2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.j f31886a;

    public k0(b0 b0Var, b0.j jVar) {
        this.f31886a = jVar;
    }

    @Override // wm2.b
    public final void onResponseFailed(int i14) {
        b0.j jVar = this.f31886a;
        if (jVar != null) {
            new Handler(Looper.getMainLooper()).post(new j0(jVar, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // wm2.b
    public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
        GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService connectIQAppSettingsService;
        b0.j jVar = this.f31886a;
        if (jVar != null) {
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
            if (connectIQAppSettingsService == null || !connectIQAppSettingsService.hasSaveAppSettingsResponse()) {
                return;
            }
            if (connectIQAppSettingsService.getSaveAppSettingsResponse().getResponse() == GDIConnectIQAppSettingsProto.SaveAppSettingsResponse.Response.SUCCESS) {
                new Handler(Looper.getMainLooper()).post(new j0(jVar, 1));
            } else {
                new Handler(Looper.getMainLooper()).post(new j0(jVar, 0));
            }
        }
    }
}
