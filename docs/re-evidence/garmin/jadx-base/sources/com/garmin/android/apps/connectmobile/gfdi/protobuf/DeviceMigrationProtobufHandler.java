package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.util.Set;
import o13.r;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u0004\u0018\u00010,2\b\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u00105R \u00108\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/DeviceMigrationProtobufHandler;", "Ldt2/c;", "Ldt2/a;", "<init>", "()V", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "getDeviceSetupStatusRequest", "()Lcom/garmin/proto/generated/GDISmartProto$Smart;", "Lcom/google/protobuf/ExtensionRegistryLite;", "extensionRegistry", "", "registerExtensions", "(Lcom/google/protobuf/ExtensionRegistryLite;)V", "Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesRequest$Builder;", "featureCapabilitiesRequestBuilder", "Lcom/garmin/proto/generated/GDIDeviceStatus$CapabilitiesRequest$Builder;", "clientCapabilities", "setFeatureCapabilities", "(Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesRequest$Builder;Lcom/garmin/proto/generated/GDIDeviceStatus$CapabilitiesRequest$Builder;)V", "Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesResponse;", "response", "Lcom/garmin/proto/generated/GDIDeviceStatus$CapabilitiesResponse;", "getFeatureCapabilities", "(Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesResponse;)Lcom/garmin/proto/generated/GDIDeviceStatus$CapabilitiesResponse;", "", "connectionId", "close", "(Ljava/lang/String;)V", "Lrs2/c;", "deviceInfo", "Ldt2/g;", "messenger", TtmlNode.START, "(Lrs2/c;Ldt2/g;Lcom/google/protobuf/ExtensionRegistryLite;)V", "capabilitiesRequestBuilder", "configure", "(Lrs2/c;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesRequest$Builder;)V", "featureCapabilities", "receiveCapabilities", "(Lcom/garmin/proto/generated/GDICore$FeatureCapabilitiesResponse;)V", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/InitialSetupResponseStatus;", "sendDeviceSetupStatusRequest", "(Lt13/d;)Ljava/lang/Object;", "smart", "Lcom/garmin/proto/generated/GDIDeviceStatus$DeviceStatusService;", "getService", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;)Lcom/garmin/proto/generated/GDIDeviceStatus$DeviceStatusService;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "deviceId", "J", "Ldt2/g;", "", "", "configuration", "Ljava/util/Set;", "getConfiguration", "()Ljava/util/Set;", "capabilities", "Lcom/garmin/proto/generated/GDIDeviceStatus$CapabilitiesResponse;", "getCapabilities", "()Lcom/garmin/proto/generated/GDIDeviceStatus$CapabilitiesResponse;", "setCapabilities", "(Lcom/garmin/proto/generated/GDIDeviceStatus$CapabilitiesResponse;)V", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceMigrationProtobufHandler implements dt2.c, dt2.a {
    private static final String TAG = "DeviceMigrationProtobufHandler";
    private GDIDeviceStatus.CapabilitiesResponse capabilities;
    private Logger logger;
    private dt2.g messenger;
    public static final int $stable = 8;
    private long deviceId = -1;
    private final Set<Integer> configuration = l0.f134950a;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceMigrationProtobufHandler$sendDeviceSetupStatusRequest$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceMigrationProtobufHandler", f = "DeviceMigrationProtobufHandler.kt", l = {50}, m = "sendDeviceSetupStatusRequest", v = 2)
    public static final class AnonymousClass1 extends v13.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(t13.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceMigrationProtobufHandler.this.sendDeviceSetupStatusRequest(this);
        }
    }

    private final GDISmartProto.Smart getDeviceSetupStatusRequest() {
        GDIDeviceStatus.GetInitialSetupStatusRequest getInitialSetupStatusRequestBuild = GDIDeviceStatus.GetInitialSetupStatusRequest.newBuilder().build();
        GDIDeviceStatus.DeviceStatusService.Builder builderNewBuilder = GDIDeviceStatus.DeviceStatusService.newBuilder();
        builderNewBuilder.setInitialSetupStatusRequest(getInitialSetupStatusRequestBuild);
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIDeviceStatusExtension.deviceStatusService, builderNewBuilder.build()).build();
        smartBuild.getClass();
        return smartBuild;
    }

    private final GDIDeviceStatus.CapabilitiesResponse getFeatureCapabilities(GDICore.FeatureCapabilitiesResponse response) {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDIDeviceStatus.CapabilitiesResponse> generatedExtension = GDIDeviceStatus.CapabilitiesResponse.deviceStatusResponse;
        if (!response.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return null;
        }
        Object extension = response.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) generatedExtension);
        extension.getClass();
        return (GDIDeviceStatus.CapabilitiesResponse) extension;
    }

    private final void registerExtensions(ExtensionRegistryLite extensionRegistry) {
        GDIDeviceStatusExtension.registerAllExtensions(extensionRegistry);
        GDIDeviceStatus.registerAllExtensions(extensionRegistry);
    }

    private final void setFeatureCapabilities(GDICore.FeatureCapabilitiesRequest.Builder featureCapabilitiesRequestBuilder, GDIDeviceStatus.CapabilitiesRequest.Builder clientCapabilities) {
        featureCapabilitiesRequestBuilder.setExtension(GDIDeviceStatus.CapabilitiesRequest.deviceStatusRequest, clientCapabilities.build());
    }

    @Override // dt2.a
    public void close(String connectionId) {
        connectionId.getClass();
    }

    @Override // dt2.c
    public void configure(rs2.c deviceInfo, ExtensionRegistryLite extensionRegistry, GDICore.FeatureCapabilitiesRequest.Builder capabilitiesRequestBuilder) {
        deviceInfo.getClass();
        extensionRegistry.getClass();
        capabilitiesRequestBuilder.getClass();
        registerExtensions(extensionRegistry);
        GDIDeviceStatus.CapabilitiesRequest.Builder builderNewBuilder = GDIDeviceStatus.CapabilitiesRequest.newBuilder();
        builderNewBuilder.getClass();
        setFeatureCapabilities(capabilitiesRequestBuilder, builderNewBuilder);
    }

    @Override // dt2.c
    public void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
        connectionReadyNotification.getClass();
    }

    public final GDIDeviceStatus.CapabilitiesResponse getCapabilities() {
        return this.capabilities;
    }

    @Override // dt2.a
    public Set<Integer> getConfiguration() {
        return this.configuration;
    }

    public final GDIDeviceStatus.DeviceStatusService getService(GDISmartProto.Smart smart) {
        if (smart == null) {
            return null;
        }
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceStatus.DeviceStatusService> generatedExtension = GDIDeviceStatusExtension.deviceStatusService;
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return null;
        }
        Object extension = smart.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) generatedExtension);
        extension.getClass();
        return (GDIDeviceStatus.DeviceStatusService) extension;
    }

    @Override // dt2.c
    public void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilities) {
        featureCapabilities.getClass();
        this.capabilities = getFeatureCapabilities(featureCapabilities);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendDeviceSetupStatusRequest(t13.d<? super InitialSetupResponseStatus> dVar) {
        AnonymousClass1 anonymousClass1;
        InitialSetupResponseStatus initialSetupResponseStatus;
        Exception e4;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        if (i15 == 0) {
            r.b(obj);
            InitialSetupResponseStatus initialSetupResponseStatus2 = InitialSetupResponseStatus.SETUP_COMPLETE;
            try {
                dt2.g gVar = this.messenger;
                if (gVar == null) {
                    s.m("messenger");
                    throw null;
                }
                GDISmartProto.Smart deviceSetupStatusRequest = getDeviceSetupStatusRequest();
                anonymousClass1.L$0 = initialSetupResponseStatus2;
                anonymousClass1.label = 1;
                Object objB = gVar.b(deviceSetupStatusRequest, anonymousClass1);
                if (objB == aVar) {
                    return aVar;
                }
                initialSetupResponseStatus = initialSetupResponseStatus2;
                obj = objB;
            } catch (Exception e14) {
                initialSetupResponseStatus = initialSetupResponseStatus2;
                e4 = e14;
                e4.toString();
                return initialSetupResponseStatus;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            initialSetupResponseStatus = (InitialSetupResponseStatus) anonymousClass1.L$0;
            try {
                r.b(obj);
            } catch (Exception e15) {
                e4 = e15;
                e4.toString();
                return initialSetupResponseStatus;
            }
        }
        GDISmartProto.Smart smart = (GDISmartProto.Smart) obj;
        if (smart == null) {
            return initialSetupResponseStatus;
        }
        InitialSetupResponseStatus initialSetupResponseStatusFromInt = InitialSetupResponseStatus.INSTANCE.fromInt(((GDIDeviceStatus.DeviceStatusService) smart.getExtension((GeneratedMessage.GeneratedExtension) GDIDeviceStatusExtension.deviceStatusService)).getInitialSetupStatusResponse().getInitialSetupStatus().getNumber());
        return initialSetupResponseStatusFromInt == null ? InitialSetupResponseStatus.SETUP_COMPLETE : initialSetupResponseStatusFromInt;
    }

    public final void setCapabilities(GDIDeviceStatus.CapabilitiesResponse capabilitiesResponse) {
        this.capabilities = capabilitiesResponse;
    }

    @Override // dt2.a
    public void start(rs2.c deviceInfo, dt2.g messenger, ExtensionRegistryLite extensionRegistry) {
        deviceInfo.getClass();
        messenger.getClass();
        extensionRegistry.getClass();
        this.messenger = messenger;
        this.deviceId = deviceInfo.getF92746j();
    }
}
