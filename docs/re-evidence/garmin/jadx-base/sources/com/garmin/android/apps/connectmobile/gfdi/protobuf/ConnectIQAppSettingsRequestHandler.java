package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import com.garmin.android.apps.connectmobile.connectiq.b0;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.ConnectIQAppSettingsEvent;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIConnectIQAppSettingsExtension;
import com.garmin.proto.generated.GDIConnectIQAppSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes8.dex */
public class ConnectIQAppSettingsRequestHandler extends ProtobufRequestHandler {
    private static final String TAG = "ConnectIQAppSettingsRequestHandler";

    public ConnectIQAppSettingsRequestHandler(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
    }

    @Override // java.lang.Runnable
    public void run() {
        i2.i(TAG, "RequestHandler run()");
        if (this.contextRef.get() == null) {
            i2.i(TAG, "Aborting. Context is null.");
            return;
        }
        GDISmartProto.Smart smart = this.requestMsg;
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService> generatedExtension = GDIConnectIQAppSettingsExtension.connectIqAppSettingsService;
        GDIConnectIQAppSettingsProto.SendAppSettingsRequest sendAppSettingsRequest = ((GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getSendAppSettingsRequest();
        byte[] byteArray = sendAppSettingsRequest.getAppIdentifier().toByteArray();
        b0.e().f31824b = byteArray;
        b0.e().f31825c = sendAppSettingsRequest.getSettingsValues().toByteArray();
        ConnectIQAppSettingsEvent connectIQAppSettingsEvent = new ConnectIQAppSettingsEvent(byteArray);
        oi2.a.f132270a.getClass();
        l73.c.b().e(connectIQAppSettingsEvent);
        GDIConnectIQAppSettingsProto.SendAppSettingsResponse.Builder builderNewBuilder = GDIConnectIQAppSettingsProto.SendAppSettingsResponse.newBuilder();
        builderNewBuilder.setResponse(GDIConnectIQAppSettingsProto.SendAppSettingsResponse.Response.SUCCESS);
        GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.Builder builderNewBuilder2 = GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.newBuilder();
        builderNewBuilder2.setSendAppSettingsResponse(builderNewBuilder.build());
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(generatedExtension, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().respondToRequest(this.requestId, this.deviceId, builderNewBuilder3.build());
    }
}
