package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDIWaypointTransferExtension;
import com.garmin.proto.generated.GDIWaypointTransferProto;
import com.google.protobuf.GeneratedMessage;
import org.apache.commons.lang3.StringUtils;
import zb0.b0;
import zb0.g1;

/* JADX INFO: loaded from: classes8.dex */
public class WaypointTransferProtobufRequestHandler extends ProtobufRequestHandler {
    private static final String TAG = "WaypointTransferProtobufRequestHandler";

    public WaypointTransferProtobufRequestHandler(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
    }

    private void respondToWaypointTransferMessage(int i14, long j8, GDIWaypointTransferProto.WaypointResponse.ResponseStatus responseStatus) {
        ProtobufRequestManager.getInstance().respondToRequest(i14, j8, GDISmartProto.Smart.newBuilder().setExtension(GDIWaypointTransferExtension.wayPointTransferService, GDIWaypointTransferProto.WaypointTransferService.newBuilder().setWaypointResponse(GDIWaypointTransferProto.WaypointResponse.newBuilder().setStatus(responseStatus).build()).build()).build());
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = this.contextRef.get();
        if (context == null) {
            i2.i(TAG, "Aborting. Context is null.");
            return;
        }
        GDIWaypointTransferProto.WaypointTransferService waypointTransferService = (GDIWaypointTransferProto.WaypointTransferService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) GDIWaypointTransferExtension.wayPointTransferService);
        if (waypointTransferService.hasWaypointRequest()) {
            if (!waypointTransferService.getWaypointRequest().hasLocation()) {
                respondToWaypointTransferMessage(this.requestId, this.deviceId, GDIWaypointTransferProto.WaypointResponse.ResponseStatus.ERROR);
                return;
            }
            GDIDataTypes.ScPoint location = waypointTransferService.getWaypointRequest().getLocation();
            double dB = lb2.b.b(location.getLat());
            double dB2 = lb2.b.b(location.getLon());
            g1 g1VarA = g1.a(context.getApplicationContext());
            b0 b0Var = new b0(this.deviceId, String.valueOf(dB), String.valueOf(dB2), System.currentTimeMillis());
            i2.j(TAG, "run: " + location.getLat() + StringUtils.SPACE + location.getLon());
            g1VarA.getClass();
            g1.d(b0Var);
            respondToWaypointTransferMessage(this.requestId, this.deviceId, GDIWaypointTransferProto.WaypointResponse.ResponseStatus.OK);
        }
    }
}
