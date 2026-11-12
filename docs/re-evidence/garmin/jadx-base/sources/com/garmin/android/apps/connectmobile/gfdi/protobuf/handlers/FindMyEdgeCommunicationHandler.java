package com.garmin.android.apps.connectmobile.gfdi.protobuf.handlers;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDISmartProto;
import gt2.c;
import java.util.List;
import lb2.b;
import zb0.b0;
import zb0.g1;

/* JADX INFO: loaded from: classes8.dex */
public class FindMyEdgeCommunicationHandler {
    private static final String TAG = "FindMyEdgeCommunicationHandler";
    private static FindMyEdgeCommunicationHandler mInstance;

    private FindMyEdgeCommunicationHandler() {
    }

    public static FindMyEdgeCommunicationHandler getInstance() {
        if (mInstance == null) {
            mInstance = new FindMyEdgeCommunicationHandler();
        }
        return mInstance;
    }

    public void handleLocationUpdatedNotification(GDICore.LocationUpdatedNotification locationUpdatedNotification, long j8) {
        GDIDataTypes.ScPoint position;
        List<GDICore.LocationData> locationDataList = locationUpdatedNotification.getLocationDataList();
        if (locationDataList == null || locationDataList.isEmpty() || (position = locationUpdatedNotification.getLocationData(locationDataList.size() - 1).getPosition()) == null) {
            return;
        }
        double dB = b.b(position.getLat());
        double dB2 = b.b(position.getLon());
        g1 g1VarA = g1.a(GarminConnectMobileApp.f28688j);
        b0 b0Var = new b0(j8, String.valueOf(dB), String.valueOf(dB2), System.currentTimeMillis());
        g1VarA.getClass();
        g1.d(b0Var);
    }

    public void sendLocationUpdatedSetEnabledRequest(final long j8, boolean z14) {
        GDICore.LocationUpdatedSetEnabledRequest.Request.Builder builderNewBuilder = GDICore.LocationUpdatedSetEnabledRequest.Request.newBuilder();
        builderNewBuilder.setRequested(GDICore.LocationData.DataType.GENERAL_LOCATION);
        builderNewBuilder.setDistanceThreshold(15.0f);
        builderNewBuilder.setMinUpdateThreshold(15);
        GDICore.LocationUpdatedSetEnabledRequest.Builder builderNewBuilder2 = GDICore.LocationUpdatedSetEnabledRequest.newBuilder();
        builderNewBuilder2.addRequests(builderNewBuilder);
        builderNewBuilder2.setEnabled(z14);
        GDICore.CoreService.Builder builderNewBuilder3 = GDICore.CoreService.newBuilder();
        builderNewBuilder3.setLocationUpdatedSetEnabledRequest(builderNewBuilder2);
        GDISmartProto.Smart.Builder builderNewBuilder4 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder4.setExtension(GDICoreExtension.coreService, builderNewBuilder3.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder4.build(), j8, new wm2.b(this) { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.handlers.FindMyEdgeCommunicationHandler.1
            @Override // wm2.b
            public void onResponseFailed(int i14) {
                int i15 = c.f79010a;
                gt2.b.f79005a.h(FindMyEdgeCommunicationHandler.TAG).info("Failed to send sendLocationUpdatedSetEnabledRequest to edge with device id: " + j8);
            }

            @Override // wm2.b
            public void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                int i15 = c.f79010a;
                gt2.b.f79005a.h(FindMyEdgeCommunicationHandler.TAG).info(smart.toString() + j8);
            }
        });
    }
}
