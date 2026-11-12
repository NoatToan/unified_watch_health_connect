package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import com.garmin.proto.generated.GDIAudioPromptsExtension;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDIInstantInput;
import com.garmin.proto.generated.GDIInstantInputExtension;
import com.garmin.proto.generated.GDILimitedUi;
import com.garmin.proto.generated.GDILimitedUiExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISwingSensor;
import com.garmin.proto.generated.GDISwingSensorExtension;
import com.garmin.proto.generated.GDIWifiSetup;
import com.garmin.proto.generated.GDIWifiSetupExtension;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.protobuf.GeneratedMessage;
import dt2.k;
import e23.l;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtoUtil;", "", "<init>", "()V", "Companion", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProtoUtil {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b0 coroutineScope = zl.a.e("ProtoUtil", t13.g.a.C3052a.d(s0.f129406a, ge1.b.h()));

    public static final GDICore.CoreService getCoreService(GDISmartProto.SmartOrBuilder smartOrBuilder) {
        return INSTANCE.getCoreService(smartOrBuilder);
    }

    public static final GDIDeviceStatus.DeviceStatusService getDeviceStatusService(GDISmartProto.SmartOrBuilder smartOrBuilder) {
        return INSTANCE.getDeviceStatusService(smartOrBuilder);
    }

    public static final GDIInstantInput.InstantInputService getInstantInputService(GDISmartProto.SmartOrBuilder smartOrBuilder) {
        return INSTANCE.getInstantInputService(smartOrBuilder);
    }

    public static final GDISwingSensor.SwingSensorService getSwingSensorService(GDISmartProto.SmartOrBuilder smartOrBuilder) {
        return INSTANCE.getSwingSensorService(smartOrBuilder);
    }

    public static final GDIWifiSetup.WifiSetupService getWifiSetupService(GDISmartProto.SmartOrBuilder smartOrBuilder) {
        return INSTANCE.getWifiSetupService(smartOrBuilder);
    }

    public static final void sendResponse(GDISmartProto.Smart smart, k kVar, l<? super Exception, Unit> lVar) {
        INSTANCE.sendResponse(smart, kVar, lVar);
    }

    public static final GDISmartProto.Smart.Builder setAudioPromptsService(GDISmartProto.Smart.Builder builder, GDIAudioPromptsProto.AudioPromptsService.Builder builder2) {
        return INSTANCE.setAudioPromptsService(builder, builder2);
    }

    public static final GDISmartProto.Smart.Builder setLimitedUIService(GDISmartProto.Smart.Builder builder, GDILimitedUi.Service.Builder builder2) {
        return INSTANCE.setLimitedUIService(builder, builder2);
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010%\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u001c\u0010$\u001a\u0018\u0012\f\u0012\n\u0018\u00010!j\u0004\u0018\u0001`\"\u0012\u0004\u0012\u00020#\u0018\u00010 H\u0007¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtoUtil$Companion;", "", "<init>", "()V", "Lcom/garmin/proto/generated/GDISmartProto$SmartOrBuilder;", "smart", "Lcom/garmin/proto/generated/GDIDeviceStatus$DeviceStatusService;", "getDeviceStatusService", "(Lcom/garmin/proto/generated/GDISmartProto$SmartOrBuilder;)Lcom/garmin/proto/generated/GDIDeviceStatus$DeviceStatusService;", "Lcom/garmin/proto/generated/GDIWifiSetup$WifiSetupService;", "getWifiSetupService", "(Lcom/garmin/proto/generated/GDISmartProto$SmartOrBuilder;)Lcom/garmin/proto/generated/GDIWifiSetup$WifiSetupService;", "Lcom/garmin/proto/generated/GDISmartProto$Smart$Builder;", "Lcom/garmin/proto/generated/GDIAudioPromptsProto$AudioPromptsService$Builder;", "service", "setAudioPromptsService", "(Lcom/garmin/proto/generated/GDISmartProto$Smart$Builder;Lcom/garmin/proto/generated/GDIAudioPromptsProto$AudioPromptsService$Builder;)Lcom/garmin/proto/generated/GDISmartProto$Smart$Builder;", "Lcom/garmin/proto/generated/GDILimitedUi$Service$Builder;", "setLimitedUIService", "(Lcom/garmin/proto/generated/GDISmartProto$Smart$Builder;Lcom/garmin/proto/generated/GDILimitedUi$Service$Builder;)Lcom/garmin/proto/generated/GDISmartProto$Smart$Builder;", "Lcom/garmin/proto/generated/GDIInstantInput$InstantInputService;", "getInstantInputService", "(Lcom/garmin/proto/generated/GDISmartProto$SmartOrBuilder;)Lcom/garmin/proto/generated/GDIInstantInput$InstantInputService;", "Lcom/garmin/proto/generated/GDISwingSensor$SwingSensorService;", "getSwingSensorService", "(Lcom/garmin/proto/generated/GDISmartProto$SmartOrBuilder;)Lcom/garmin/proto/generated/GDISwingSensor$SwingSensorService;", "Lcom/garmin/proto/generated/GDICore$CoreService;", "getCoreService", "(Lcom/garmin/proto/generated/GDISmartProto$SmartOrBuilder;)Lcom/garmin/proto/generated/GDICore$CoreService;", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "Ldt2/k;", "responder", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "sendResponse", "(Lcom/garmin/proto/generated/GDISmartProto$Smart;Ldt2/k;Le23/l;)V", "Lo53/b0;", "coroutineScope", "Lo53/b0;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final GDICore.CoreService getCoreService(GDISmartProto.SmartOrBuilder smart) {
            if (smart == null) {
                return null;
            }
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICore.CoreService> generatedExtension = GDICoreExtension.coreService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return (GDICore.CoreService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }
            return null;
        }

        public final GDIDeviceStatus.DeviceStatusService getDeviceStatusService(GDISmartProto.SmartOrBuilder smart) {
            if (smart == null) {
                return null;
            }
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceStatus.DeviceStatusService> generatedExtension = GDIDeviceStatusExtension.deviceStatusService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return (GDIDeviceStatus.DeviceStatusService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }
            return null;
        }

        public final GDIInstantInput.InstantInputService getInstantInputService(GDISmartProto.SmartOrBuilder smart) {
            if (smart == null) {
                return null;
            }
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInstantInput.InstantInputService> generatedExtension = GDIInstantInputExtension.instantInputService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return (GDIInstantInput.InstantInputService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }
            return null;
        }

        public final GDISwingSensor.SwingSensorService getSwingSensorService(GDISmartProto.SmartOrBuilder smart) {
            if (smart == null) {
                return null;
            }
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISwingSensor.SwingSensorService> generatedExtension = GDISwingSensorExtension.swingSensorService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return (GDISwingSensor.SwingSensorService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }
            return null;
        }

        public final GDIWifiSetup.WifiSetupService getWifiSetupService(GDISmartProto.SmartOrBuilder smart) {
            if (smart == null) {
                return null;
            }
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIWifiSetup.WifiSetupService> generatedExtension = GDIWifiSetupExtension.wifiSetupService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return (GDIWifiSetup.WifiSetupService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }
            return null;
        }

        public final void sendResponse(GDISmartProto.Smart smart, k responder, l<? super Exception, Unit> listener) {
            smart.getClass();
            responder.getClass();
            ge1.b.T(ProtoUtil.coroutineScope, null, null, new ProtoUtil$Companion$sendResponse$1(responder, smart, listener, null), 3);
        }

        public final GDISmartProto.Smart.Builder setAudioPromptsService(GDISmartProto.Smart.Builder smart, GDIAudioPromptsProto.AudioPromptsService.Builder service) {
            smart.getClass();
            service.getClass();
            smart.setExtension(GDIAudioPromptsExtension.audioPromptsService, service.build());
            return smart;
        }

        public final GDISmartProto.Smart.Builder setLimitedUIService(GDISmartProto.Smart.Builder smart, GDILimitedUi.Service.Builder service) {
            smart.getClass();
            service.getClass();
            smart.setExtension(GDILimitedUiExtension.limitedUiService, service.build());
            return smart;
        }

        private Companion() {
        }
    }
}
