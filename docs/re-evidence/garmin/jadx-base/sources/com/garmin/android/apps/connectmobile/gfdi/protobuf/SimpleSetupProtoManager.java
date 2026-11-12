package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import am.j;
import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISimpleSetup;
import com.garmin.proto.generated.GDISimpleSetupExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/SimpleSetupProtoManager;", "", "deviceId", "", "onFeatureListListener", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/SimpleSetupProtoManager$OnFeatureListListener;", "<init>", "(JLcom/garmin/android/apps/connectmobile/gfdi/protobuf/SimpleSetupProtoManager$OnFeatureListListener;)V", "sendFeatureListRequest", "", "sendRestoreListNotification", "featureType", "Lcom/garmin/proto/generated/GDISimpleSetup$FeatureType;", "sendSensorListNotification", "sensorList", "", "Lcom/garmin/proto/generated/GDISimpleSetup$SensorType;", "initiateRequest", "smartBuilder", "Lcom/garmin/proto/generated/GDISmartProto$Smart$Builder;", "OnFeatureListListener", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SimpleSetupProtoManager {
    public static final int $stable = 8;
    private final long deviceId;
    private final OnFeatureListListener onFeatureListListener;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/SimpleSetupProtoManager$OnFeatureListListener;", "", "onFeatureListResponseReceived", "", "featureList", "", "Lcom/garmin/proto/generated/GDISimpleSetup$Feature;", "onFeatureListResponseFailed", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface OnFeatureListListener {
        void onFeatureListResponseFailed();

        void onFeatureListResponseReceived(List<GDISimpleSetup.Feature> featureList);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.SimpleSetupProtoManager$initiateRequest$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/garmin/android/apps/connectmobile/gfdi/protobuf/SimpleSetupProtoManager$initiateRequest$1", "Lwm2/b;", "", "requestId", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "message", "", "onResponseReceived", "(ILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "onResponseFailed", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1 implements wm2.b {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResponseFailed$lambda$1(SimpleSetupProtoManager simpleSetupProtoManager, AnonymousClass1 anonymousClass1, int i14) {
            OnFeatureListListener onFeatureListListener = simpleSetupProtoManager.onFeatureListListener;
            if (onFeatureListListener != null) {
                onFeatureListListener.onFeatureListResponseFailed();
            }
            String strH = j.h(i14, "on Response Failed: ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.k(a2Var, "SimpleSetupProtoManager", strH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResponseReceived$lambda$0(SimpleSetupProtoManager simpleSetupProtoManager, GDISimpleSetup.SupportedFeaturesListResponse supportedFeaturesListResponse, AnonymousClass1 anonymousClass1, int i14) {
            OnFeatureListListener onFeatureListListener = simpleSetupProtoManager.onFeatureListListener;
            if (onFeatureListListener != null) {
                List<GDISimpleSetup.Feature> featureList = supportedFeaturesListResponse.getFeatureList();
                featureList.getClass();
                onFeatureListListener.onFeatureListResponseReceived(featureList);
            }
            String strH = j.h(i14, "on Response Received: ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.k(a2Var, "SimpleSetupProtoManager", strH);
        }

        @Override // wm2.b
        public void onResponseFailed(int requestId) {
            new Handler(Looper.getMainLooper()).post(new androidx.camera.camera2.internal.compat.j(SimpleSetupProtoManager.this, this, requestId, 5));
        }

        @Override // wm2.b
        public void onResponseReceived(int requestId, GDISmartProto.Smart message) {
            message.getClass();
            new Handler(Looper.getMainLooper()).post(new g(SimpleSetupProtoManager.this, ((GDISimpleSetup.SimpleSetupService) message.getExtension((GeneratedMessage.GeneratedExtension) GDISimpleSetupExtension.simpleSetupService)).getSupportedFeatureListResponse(), this, requestId, 0));
        }
    }

    public /* synthetic */ SimpleSetupProtoManager(long j8, OnFeatureListListener onFeatureListListener, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? null : onFeatureListListener);
    }

    private final void initiateRequest(GDISmartProto.Smart.Builder smartBuilder) {
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = smartBuilder.build();
        smartBuild.getClass();
        protobufRequestManager.initiateRequest(smartBuild, this.deviceId, new AnonymousClass1());
    }

    public final void sendFeatureListRequest() {
        GDISimpleSetup.SupportedFeaturesListRequest.Builder builderNewBuilder = GDISimpleSetup.SupportedFeaturesListRequest.newBuilder();
        GDISimpleSetup.SimpleSetupService.Builder builderNewBuilder2 = GDISimpleSetup.SimpleSetupService.newBuilder();
        builderNewBuilder2.setSupportedFeatureListRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.getClass();
        SimpleSetupProtoManagerKt.setSimpleSetupService(builderNewBuilder3, builderNewBuilder2);
        initiateRequest(builderNewBuilder3);
    }

    public final void sendRestoreListNotification(GDISimpleSetup.FeatureType featureType) {
        featureType.getClass();
        GDISimpleSetup.SelectedRestoreListNotification.Builder builderNewBuilder = GDISimpleSetup.SelectedRestoreListNotification.newBuilder();
        builderNewBuilder.addFeatureType(featureType);
        GDISimpleSetup.SimpleSetupService.Builder builderNewBuilder2 = GDISimpleSetup.SimpleSetupService.newBuilder();
        builderNewBuilder2.setSelectedRestoreListNotification(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.getClass();
        SimpleSetupProtoManagerKt.setSimpleSetupService(builderNewBuilder3, builderNewBuilder2);
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
        smartBuild.getClass();
        protobufRequestManager.initiateNotification(smartBuild, this.deviceId);
    }

    public final void sendSensorListNotification(List<? extends GDISimpleSetup.SensorType> sensorList) {
        sensorList.getClass();
        GDISimpleSetup.SelectedSensorListNotification.Builder builderNewBuilder = GDISimpleSetup.SelectedSensorListNotification.newBuilder();
        builderNewBuilder.addAllSensorType(sensorList);
        GDISimpleSetup.SimpleSetupService.Builder builderNewBuilder2 = GDISimpleSetup.SimpleSetupService.newBuilder();
        builderNewBuilder2.setSelectedSensorListNotification(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.getClass();
        SimpleSetupProtoManagerKt.setSimpleSetupService(builderNewBuilder3, builderNewBuilder2);
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
        smartBuild.getClass();
        protobufRequestManager.initiateNotification(smartBuild, this.deviceId);
    }

    public SimpleSetupProtoManager(long j8, OnFeatureListListener onFeatureListListener) {
        this.deviceId = j8;
        this.onFeatureListListener = onFeatureListListener;
    }
}
