package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDeviceStatus {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015GDIDeviceStatus.proto\u0012\u0016GDI.Proto.DeviceStatus\u001a\rGDICore.proto\"Ñ\u000b\n\u0013DeviceStatusService\u0012\u007f\n1remote_device_battery_status_changed_notification\u0018\u0001 \u0001(\u000b2D.GDI.Proto.DeviceStatus.RemoteDeviceBatteryStatusChangedNotification\u0012f\n$remote_device_battery_status_request\u0018\u0002 \u0001(\u000b28.GDI.Proto.DeviceStatus.RemoteDeviceBatteryStatusRequest\u0012h\n%remote_device_battery_status_response\u0018\u0003 \u0001(\u000b29.GDI.Proto.DeviceStatus.RemoteDeviceBatteryStatusResponse\u0012X\n\u0017activity_status_request\u0018\u0004 \u0001(\u000b27.GDI.Proto.DeviceStatus.GetCurrentActivityStatusRequest\u0012Z\n\u0018activity_status_response\u0018\u0005 \u0001(\u000b28.GDI.Proto.DeviceStatus.GetCurrentActivityStatusResponse\u0012Z\n\u001cinitial_setup_status_request\u0018\u0006 \u0001(\u000b24.GDI.Proto.DeviceStatus.GetInitialSetupStatusRequest\u0012\\\n\u001dinitial_setup_status_response\u0018\u0007 \u0001(\u000b25.GDI.Proto.DeviceStatus.GetInitialSetupStatusResponse\u0012v\n,device_passcode_invalid_attempt_notification\u0018\b \u0001(\u000b2@.GDI.Proto.DeviceStatus.DevicePasscodeInvalidAttemptNotification\u0012X\n\u001cdevice_unlocked_notification\u0018\t \u0001(\u000b22.GDI.Proto.DeviceStatus.DeviceUnlockedNotification\u0012U\n\u001bset_device_passcode_request\u0018\n \u0001(\u000b20.GDI.Proto.DeviceStatus.SetDevicePasscodeRequest\u0012W\n\u001cset_device_passcode_response\u0018\u000b \u0001(\u000b21.GDI.Proto.DeviceStatus.SetDevicePasscodeResponse\u0012l\n'app_initiated_passcode_set_notification\u0018\f \u0001(\u000b2;.GDI.Proto.DeviceStatus.AppInitiatedPasscodeSetNotification\u0012L\n\u0016reset_passcode_request\u0018\r \u0001(\u000b2,.GDI.Proto.DeviceStatus.ResetPasscodeRequest\u0012N\n\u0017reset_passcode_response\u0018\u000e \u0001(\u000b2-.GDI.Proto.DeviceStatus.ResetPasscodeResponse\u0012i\n%region_requires_passcode_notification\u0018\u000f \u0001(\u000b2:.GDI.Proto.DeviceStatus.RegionRequiresPasscodeNotification\"\u008d\u0001\n\u0013CapabilitiesRequest2v\n\u0015device_status_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u0013 \u0001(\u000b2+.GDI.Proto.DeviceStatus.CapabilitiesRequest\"·\u0001\n\u0014CapabilitiesResponse\u0012$\n\u001cinitial_setup_status_support\u0018\u0001 \u0001(\b2y\n\u0016device_status_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u0013 \u0001(\u000b2,.GDI.Proto.DeviceStatus.CapabilitiesResponse\"~\n,RemoteDeviceBatteryStatusChangedNotification\u0012N\n\u0006status\u0018\u0001 \u0001(\u000e2>.GDI.Proto.DeviceStatus.RemoteDeviceBatteryStatusBatteryStatus\"\"\n RemoteDeviceBatteryStatusRequest\"ä\u0002\n!RemoteDeviceBatteryStatusResponse\u0012X\n\u0006status\u0018\u0001 \u0002(\u000e2H.GDI.Proto.DeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus\u0012\u001d\n\u0015current_battery_level\u0018\u0002 \u0001(\r\u0012V\n\u000ebattery_status\u0018\u0003 \u0001(\u000e2>.GDI.Proto.DeviceStatus.RemoteDeviceBatteryStatusBatteryStatus\u0012!\n\u0019estimated_hours_remaining\u0018\u0004 \u0001(\r\"K\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0014\n\u0010NO_REMOTE_DEVICE\u0010\u0002\"!\n\u001fGetCurrentActivityStatusRequest\"À\u0001\n GetCurrentActivityStatusResponse\u0012`\n\u000factivity_status\u0018\u0001 \u0001(\u000e2G.GDI.Proto.DeviceStatus.GetCurrentActivityStatusResponse.ActivityStatus\":\n\u000eActivityStatus\u0012\u0007\n\u0003OFF\u0010\u0000\u0012\u000b\n\u0007STOPPED\u0010\u0001\u0012\n\n\u0006PAUSED\u0010\u0002\u0012\u0006\n\u0002ON\u0010\u0003\"\u001e\n\u001cGetInitialSetupStatusRequest\"÷\u0001\n\u001dGetInitialSetupStatusResponse\u0012x\n\u0014initial_setup_status\u0018\u0001 \u0001(\u000e2H.GDI.Proto.DeviceStatus.GetInitialSetupStatusResponse.InitialSetupStatus:\u0010IN_INITIAL_SETUP\"\\\n\u0012InitialSetupStatus\u0012\u0014\n\u0010IN_INITIAL_SETUP\u0010\u0000\u0012\u0012\n\u000eSETUP_COMPLETE\u0010\u0001\u0012\u001c\n\u0018IN_SETUP_APPLYING_BACKUP\u0010\u0002\"F\n(DevicePasscodeInvalidAttemptNotification\u0012\u001a\n\u0012attempts_remaining\u0018\u0001 \u0001(\r\"\u001c\n\u001aDeviceUnlockedNotification\",\n\u0018SetDevicePasscodeRequest\u0012\u0010\n\bpasscode\u0018\u0001 \u0002(\t\"d\n\u0019SetDevicePasscodeResponse\u0012G\n\u000fresponse_status\u0018\u0001 \u0001(\u000e2..GDI.Proto.DeviceStatus.PasscodeResponseStatus\"¨\u0001\n#AppInitiatedPasscodeSetNotification\u0012R\n\u0006source\u0018\u0001 \u0001(\u000e2B.GDI.Proto.DeviceStatus.AppInitiatedPasscodeSetNotification.Source\"-\n\u0006Source\u0012\u000e\n\nGARMIN_PAY\u0010\u0000\u0012\u0013\n\u000fDEVICE_SETTINGS\u0010\u0001\"\u0016\n\u0014ResetPasscodeRequest\"`\n\u0015ResetPasscodeResponse\u0012G\n\u000fresponse_status\u0018\u0001 \u0001(\u000e2..GDI.Proto.DeviceStatus.PasscodeResponseStatus\"$\n\"RegionRequiresPasscodeNotification*\u009d\u0001\n&RemoteDeviceBatteryStatusBatteryStatus\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\n\n\u0006NORMAL\u0010\u0001\u0012\u0007\n\u0003LOW\u0010\u0002\u0012\f\n\bCRITICAL\u0010\u0003\u0012\f\n\bCHARGING\u0010\u0004\u0012\u0011\n\rFULLY_CHARGED\u0010\u0005\u0012\t\n\u0005ERROR\u0010\u0006\u0012\u0010\n\fLOW_PULSE_OX\u0010\u0007*k\n\u0016PasscodeResponseStatus\u0012\u0019\n\u0015PASSCODE_STATUS_ERROR\u0010\u0000\u0012\u0016\n\u0012PASSCODE_STATUS_OK\u0010\u0001\u0012\u001e\n\u001aPASSCODE_STATUS_NFC_DEVICE\u0010\u0002B/\n\u001acom.garmin.proto.generatedB\u000fGDIDeviceStatusH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_fieldAccessorTable;

    public interface AppInitiatedPasscodeSetNotificationOrBuilder extends MessageOrBuilder {
        AppInitiatedPasscodeSetNotification.Source getSource();

        boolean hasSource();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        boolean getInitialSetupStatusSupport();

        boolean hasInitialSetupStatusSupport();
    }

    public interface DevicePasscodeInvalidAttemptNotificationOrBuilder extends MessageOrBuilder {
        int getAttemptsRemaining();

        boolean hasAttemptsRemaining();
    }

    public interface DeviceStatusServiceOrBuilder extends MessageOrBuilder {
        GetCurrentActivityStatusRequest getActivityStatusRequest();

        GetCurrentActivityStatusRequestOrBuilder getActivityStatusRequestOrBuilder();

        GetCurrentActivityStatusResponse getActivityStatusResponse();

        GetCurrentActivityStatusResponseOrBuilder getActivityStatusResponseOrBuilder();

        AppInitiatedPasscodeSetNotification getAppInitiatedPasscodeSetNotification();

        AppInitiatedPasscodeSetNotificationOrBuilder getAppInitiatedPasscodeSetNotificationOrBuilder();

        DevicePasscodeInvalidAttemptNotification getDevicePasscodeInvalidAttemptNotification();

        DevicePasscodeInvalidAttemptNotificationOrBuilder getDevicePasscodeInvalidAttemptNotificationOrBuilder();

        DeviceUnlockedNotification getDeviceUnlockedNotification();

        DeviceUnlockedNotificationOrBuilder getDeviceUnlockedNotificationOrBuilder();

        GetInitialSetupStatusRequest getInitialSetupStatusRequest();

        GetInitialSetupStatusRequestOrBuilder getInitialSetupStatusRequestOrBuilder();

        GetInitialSetupStatusResponse getInitialSetupStatusResponse();

        GetInitialSetupStatusResponseOrBuilder getInitialSetupStatusResponseOrBuilder();

        RegionRequiresPasscodeNotification getRegionRequiresPasscodeNotification();

        RegionRequiresPasscodeNotificationOrBuilder getRegionRequiresPasscodeNotificationOrBuilder();

        RemoteDeviceBatteryStatusChangedNotification getRemoteDeviceBatteryStatusChangedNotification();

        RemoteDeviceBatteryStatusChangedNotificationOrBuilder getRemoteDeviceBatteryStatusChangedNotificationOrBuilder();

        RemoteDeviceBatteryStatusRequest getRemoteDeviceBatteryStatusRequest();

        RemoteDeviceBatteryStatusRequestOrBuilder getRemoteDeviceBatteryStatusRequestOrBuilder();

        RemoteDeviceBatteryStatusResponse getRemoteDeviceBatteryStatusResponse();

        RemoteDeviceBatteryStatusResponseOrBuilder getRemoteDeviceBatteryStatusResponseOrBuilder();

        ResetPasscodeRequest getResetPasscodeRequest();

        ResetPasscodeRequestOrBuilder getResetPasscodeRequestOrBuilder();

        ResetPasscodeResponse getResetPasscodeResponse();

        ResetPasscodeResponseOrBuilder getResetPasscodeResponseOrBuilder();

        SetDevicePasscodeRequest getSetDevicePasscodeRequest();

        SetDevicePasscodeRequestOrBuilder getSetDevicePasscodeRequestOrBuilder();

        SetDevicePasscodeResponse getSetDevicePasscodeResponse();

        SetDevicePasscodeResponseOrBuilder getSetDevicePasscodeResponseOrBuilder();

        boolean hasActivityStatusRequest();

        boolean hasActivityStatusResponse();

        boolean hasAppInitiatedPasscodeSetNotification();

        boolean hasDevicePasscodeInvalidAttemptNotification();

        boolean hasDeviceUnlockedNotification();

        boolean hasInitialSetupStatusRequest();

        boolean hasInitialSetupStatusResponse();

        boolean hasRegionRequiresPasscodeNotification();

        boolean hasRemoteDeviceBatteryStatusChangedNotification();

        boolean hasRemoteDeviceBatteryStatusRequest();

        boolean hasRemoteDeviceBatteryStatusResponse();

        boolean hasResetPasscodeRequest();

        boolean hasResetPasscodeResponse();

        boolean hasSetDevicePasscodeRequest();

        boolean hasSetDevicePasscodeResponse();
    }

    public interface DeviceUnlockedNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface GetCurrentActivityStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GetCurrentActivityStatusResponseOrBuilder extends MessageOrBuilder {
        GetCurrentActivityStatusResponse.ActivityStatus getActivityStatus();

        boolean hasActivityStatus();
    }

    public interface GetInitialSetupStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GetInitialSetupStatusResponseOrBuilder extends MessageOrBuilder {
        GetInitialSetupStatusResponse.InitialSetupStatus getInitialSetupStatus();

        boolean hasInitialSetupStatus();
    }

    public interface RegionRequiresPasscodeNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface RemoteDeviceBatteryStatusChangedNotificationOrBuilder extends MessageOrBuilder {
        RemoteDeviceBatteryStatusBatteryStatus getStatus();

        boolean hasStatus();
    }

    public interface RemoteDeviceBatteryStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface RemoteDeviceBatteryStatusResponseOrBuilder extends MessageOrBuilder {
        RemoteDeviceBatteryStatusBatteryStatus getBatteryStatus();

        int getCurrentBatteryLevel();

        int getEstimatedHoursRemaining();

        RemoteDeviceBatteryStatusResponse.ResponseStatus getStatus();

        boolean hasBatteryStatus();

        boolean hasCurrentBatteryLevel();

        boolean hasEstimatedHoursRemaining();

        boolean hasStatus();
    }

    public interface ResetPasscodeRequestOrBuilder extends MessageOrBuilder {
    }

    public interface ResetPasscodeResponseOrBuilder extends MessageOrBuilder {
        PasscodeResponseStatus getResponseStatus();

        boolean hasResponseStatus();
    }

    public interface SetDevicePasscodeRequestOrBuilder extends MessageOrBuilder {
        String getPasscode();

        ByteString getPasscodeBytes();

        boolean hasPasscode();
    }

    public interface SetDevicePasscodeResponseOrBuilder extends MessageOrBuilder {
        PasscodeResponseStatus getResponseStatus();

        boolean hasResponseStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_descriptor = descriptor2;
        internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"RemoteDeviceBatteryStatusChangedNotification", "RemoteDeviceBatteryStatusRequest", "RemoteDeviceBatteryStatusResponse", "ActivityStatusRequest", "ActivityStatusResponse", "InitialSetupStatusRequest", "InitialSetupStatusResponse", "DevicePasscodeInvalidAttemptNotification", "DeviceUnlockedNotification", "SetDevicePasscodeRequest", "SetDevicePasscodeResponse", "AppInitiatedPasscodeSetNotification", "ResetPasscodeRequest", "ResetPasscodeResponse", "RegionRequiresPasscodeNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"InitialSetupStatusSupport"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Status"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[0]);
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Status", "CurrentBatteryLevel", "BatteryStatus", "EstimatedHoursRemaining"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[0]);
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ActivityStatus"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[0]);
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"InitialSetupStatus"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_descriptor = descriptor12;
        internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"AttemptsRemaining"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[0]);
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Passcode"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"ResponseStatus"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_descriptor = descriptor16;
        internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Source"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_descriptor = descriptor17;
        internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[0]);
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_descriptor = descriptor18;
        internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"ResponseStatus"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(17);
        internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_descriptor = descriptor19;
        internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[0]);
        GDICore.getDescriptor();
    }

    private GDIDeviceStatus() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.deviceStatusRequest);
        extensionRegistryLite.add(CapabilitiesResponse.deviceStatusResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int DEVICE_STATUS_REQUEST_FIELD_NUMBER = 19;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.CapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> deviceStatusRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(CapabilitiesRequest capabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesRequest);
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CapabilitiesRequest) {
                return getUnknownFields().equals(((CapabilitiesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CapabilitiesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest build() {
                CapabilitiesRequest capabilitiesRequestBuildPartial = buildPartial();
                if (capabilitiesRequestBuildPartial.isInitialized()) {
                    return capabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest buildPartial() {
                CapabilitiesRequest capabilitiesRequest = new CapabilitiesRequest(this);
                onBuilt();
                return capabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesRequest) {
                    return mergeFrom((CapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesRequest capabilitiesRequest) {
                if (capabilitiesRequest == CapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(capabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int DEVICE_STATUS_RESPONSE_FIELD_NUMBER = 19;
        public static final int INITIAL_SETUP_STATUS_SUPPORT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean initialSetupStatusSupport_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.CapabilitiesResponse.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> deviceStatusResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.initialSetupStatusSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_descriptor;
        }

        public static Builder newBuilder(CapabilitiesResponse capabilitiesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesResponse);
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CapabilitiesResponse)) {
                return super.equals(obj);
            }
            CapabilitiesResponse capabilitiesResponse = (CapabilitiesResponse) obj;
            if (hasInitialSetupStatusSupport() != capabilitiesResponse.hasInitialSetupStatusSupport()) {
                return false;
            }
            return (!hasInitialSetupStatusSupport() || getInitialSetupStatusSupport() == capabilitiesResponse.getInitialSetupStatusSupport()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.CapabilitiesResponseOrBuilder
        public boolean getInitialSetupStatusSupport() {
            return this.initialSetupStatusSupport_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.initialSetupStatusSupport_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.CapabilitiesResponseOrBuilder
        public boolean hasInitialSetupStatusSupport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInitialSetupStatusSupport()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getInitialSetupStatusSupport());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CapabilitiesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.initialSetupStatusSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private boolean initialSetupStatusSupport_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesResponse.initialSetupStatusSupport_ = this.initialSetupStatusSupport_;
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse build() {
                CapabilitiesResponse capabilitiesResponseBuildPartial = buildPartial();
                if (capabilitiesResponseBuildPartial.isInitialized()) {
                    return capabilitiesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse buildPartial() {
                CapabilitiesResponse capabilitiesResponse = new CapabilitiesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesResponse);
                }
                onBuilt();
                return capabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.initialSetupStatusSupport_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInitialSetupStatusSupport() {
                this.bitField0_ &= -2;
                this.initialSetupStatusSupport_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.CapabilitiesResponseOrBuilder
            public boolean getInitialSetupStatusSupport() {
                return this.initialSetupStatusSupport_;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.CapabilitiesResponseOrBuilder
            public boolean hasInitialSetupStatusSupport() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.initialSetupStatusSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInitialSetupStatusSupport(boolean z14) {
                this.initialSetupStatusSupport_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesResponse) {
                    return mergeFrom((CapabilitiesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesResponse capabilitiesResponse) {
                if (capabilitiesResponse == CapabilitiesResponse.getDefaultInstance()) {
                    return this;
                }
                if (capabilitiesResponse.hasInitialSetupStatusSupport()) {
                    setInitialSetupStatusSupport(capabilitiesResponse.getInitialSetupStatusSupport());
                }
                mergeUnknownFields(capabilitiesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesResponse() {
            this.initialSetupStatusSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DevicePasscodeInvalidAttemptNotification extends GeneratedMessageV3 implements DevicePasscodeInvalidAttemptNotificationOrBuilder {
        public static final int ATTEMPTS_REMAINING_FIELD_NUMBER = 1;
        private static final DevicePasscodeInvalidAttemptNotification DEFAULT_INSTANCE = new DevicePasscodeInvalidAttemptNotification();

        @Deprecated
        public static final Parser<DevicePasscodeInvalidAttemptNotification> PARSER = new AbstractParser<DevicePasscodeInvalidAttemptNotification>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.DevicePasscodeInvalidAttemptNotification.1
            @Override // com.google.protobuf.Parser
            public DevicePasscodeInvalidAttemptNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DevicePasscodeInvalidAttemptNotification.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int attemptsRemaining_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private DevicePasscodeInvalidAttemptNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.attemptsRemaining_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DevicePasscodeInvalidAttemptNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_descriptor;
        }

        public static Builder newBuilder(DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(devicePasscodeInvalidAttemptNotification);
        }

        public static DevicePasscodeInvalidAttemptNotification parseDelimitedFrom(InputStream inputStream) {
            return (DevicePasscodeInvalidAttemptNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DevicePasscodeInvalidAttemptNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DevicePasscodeInvalidAttemptNotification)) {
                return super.equals(obj);
            }
            DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification = (DevicePasscodeInvalidAttemptNotification) obj;
            if (hasAttemptsRemaining() != devicePasscodeInvalidAttemptNotification.hasAttemptsRemaining()) {
                return false;
            }
            return (!hasAttemptsRemaining() || getAttemptsRemaining() == devicePasscodeInvalidAttemptNotification.getAttemptsRemaining()) && getUnknownFields().equals(devicePasscodeInvalidAttemptNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DevicePasscodeInvalidAttemptNotificationOrBuilder
        public int getAttemptsRemaining() {
            return this.attemptsRemaining_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DevicePasscodeInvalidAttemptNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.attemptsRemaining_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DevicePasscodeInvalidAttemptNotificationOrBuilder
        public boolean hasAttemptsRemaining() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAttemptsRemaining()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAttemptsRemaining();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicePasscodeInvalidAttemptNotification.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new DevicePasscodeInvalidAttemptNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.attemptsRemaining_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DevicePasscodeInvalidAttemptNotificationOrBuilder {
            private int attemptsRemaining_;
            private int bitField0_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    devicePasscodeInvalidAttemptNotification.attemptsRemaining_ = this.attemptsRemaining_;
                } else {
                    i14 = 0;
                }
                devicePasscodeInvalidAttemptNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicePasscodeInvalidAttemptNotification build() {
                DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotificationBuildPartial = buildPartial();
                if (devicePasscodeInvalidAttemptNotificationBuildPartial.isInitialized()) {
                    return devicePasscodeInvalidAttemptNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) devicePasscodeInvalidAttemptNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicePasscodeInvalidAttemptNotification buildPartial() {
                DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification = new DevicePasscodeInvalidAttemptNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(devicePasscodeInvalidAttemptNotification);
                }
                onBuilt();
                return devicePasscodeInvalidAttemptNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.attemptsRemaining_ = 0;
                return this;
            }

            public Builder clearAttemptsRemaining() {
                this.bitField0_ &= -2;
                this.attemptsRemaining_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DevicePasscodeInvalidAttemptNotificationOrBuilder
            public int getAttemptsRemaining() {
                return this.attemptsRemaining_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DevicePasscodeInvalidAttemptNotificationOrBuilder
            public boolean hasAttemptsRemaining() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DevicePasscodeInvalidAttemptNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicePasscodeInvalidAttemptNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.attemptsRemaining_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAttemptsRemaining(int i14) {
                this.attemptsRemaining_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DevicePasscodeInvalidAttemptNotification getDefaultInstanceForType() {
                return DevicePasscodeInvalidAttemptNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DevicePasscodeInvalidAttemptNotification) {
                    return mergeFrom((DevicePasscodeInvalidAttemptNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification) {
                if (devicePasscodeInvalidAttemptNotification == DevicePasscodeInvalidAttemptNotification.getDefaultInstance()) {
                    return this;
                }
                if (devicePasscodeInvalidAttemptNotification.hasAttemptsRemaining()) {
                    setAttemptsRemaining(devicePasscodeInvalidAttemptNotification.getAttemptsRemaining());
                }
                mergeUnknownFields(devicePasscodeInvalidAttemptNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DevicePasscodeInvalidAttemptNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DevicePasscodeInvalidAttemptNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicePasscodeInvalidAttemptNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DevicePasscodeInvalidAttemptNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DevicePasscodeInvalidAttemptNotification() {
            this.attemptsRemaining_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(InputStream inputStream) {
            return (DevicePasscodeInvalidAttemptNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicePasscodeInvalidAttemptNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(CodedInputStream codedInputStream) {
            return (DevicePasscodeInvalidAttemptNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DevicePasscodeInvalidAttemptNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicePasscodeInvalidAttemptNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeviceUnlockedNotification extends GeneratedMessageV3 implements DeviceUnlockedNotificationOrBuilder {
        private static final DeviceUnlockedNotification DEFAULT_INSTANCE = new DeviceUnlockedNotification();

        @Deprecated
        public static final Parser<DeviceUnlockedNotification> PARSER = new AbstractParser<DeviceUnlockedNotification>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.DeviceUnlockedNotification.1
            @Override // com.google.protobuf.Parser
            public DeviceUnlockedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceUnlockedNotification.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private DeviceUnlockedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceUnlockedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_descriptor;
        }

        public static Builder newBuilder(DeviceUnlockedNotification deviceUnlockedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceUnlockedNotification);
        }

        public static DeviceUnlockedNotification parseDelimitedFrom(InputStream inputStream) {
            return (DeviceUnlockedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceUnlockedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceUnlockedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DeviceUnlockedNotification) {
                return getUnknownFields().equals(((DeviceUnlockedNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceUnlockedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceUnlockedNotification.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new DeviceUnlockedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceUnlockedNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceUnlockedNotification build() {
                DeviceUnlockedNotification deviceUnlockedNotificationBuildPartial = buildPartial();
                if (deviceUnlockedNotificationBuildPartial.isInitialized()) {
                    return deviceUnlockedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceUnlockedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceUnlockedNotification buildPartial() {
                DeviceUnlockedNotification deviceUnlockedNotification = new DeviceUnlockedNotification(this);
                onBuilt();
                return deviceUnlockedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceUnlockedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceUnlockedNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeviceUnlockedNotification getDefaultInstanceForType() {
                return DeviceUnlockedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceUnlockedNotification) {
                    return mergeFrom((DeviceUnlockedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceUnlockedNotification deviceUnlockedNotification) {
                if (deviceUnlockedNotification == DeviceUnlockedNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(deviceUnlockedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceUnlockedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceUnlockedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceUnlockedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceUnlockedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceUnlockedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceUnlockedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceUnlockedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceUnlockedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceUnlockedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceUnlockedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceUnlockedNotification parseFrom(InputStream inputStream) {
            return (DeviceUnlockedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceUnlockedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceUnlockedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceUnlockedNotification parseFrom(CodedInputStream codedInputStream) {
            return (DeviceUnlockedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceUnlockedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceUnlockedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetCurrentActivityStatusRequest extends GeneratedMessageV3 implements GetCurrentActivityStatusRequestOrBuilder {
        private static final GetCurrentActivityStatusRequest DEFAULT_INSTANCE = new GetCurrentActivityStatusRequest();

        @Deprecated
        public static final Parser<GetCurrentActivityStatusRequest> PARSER = new AbstractParser<GetCurrentActivityStatusRequest>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.GetCurrentActivityStatusRequest.1
            @Override // com.google.protobuf.Parser
            public GetCurrentActivityStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetCurrentActivityStatusRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private GetCurrentActivityStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetCurrentActivityStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_descriptor;
        }

        public static Builder newBuilder(GetCurrentActivityStatusRequest getCurrentActivityStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getCurrentActivityStatusRequest);
        }

        public static GetCurrentActivityStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetCurrentActivityStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetCurrentActivityStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetCurrentActivityStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GetCurrentActivityStatusRequest) {
                return getUnknownFields().equals(((GetCurrentActivityStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetCurrentActivityStatusRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetCurrentActivityStatusRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GetCurrentActivityStatusRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetCurrentActivityStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetCurrentActivityStatusRequest build() {
                GetCurrentActivityStatusRequest getCurrentActivityStatusRequestBuildPartial = buildPartial();
                if (getCurrentActivityStatusRequestBuildPartial.isInitialized()) {
                    return getCurrentActivityStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getCurrentActivityStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetCurrentActivityStatusRequest buildPartial() {
                GetCurrentActivityStatusRequest getCurrentActivityStatusRequest = new GetCurrentActivityStatusRequest(this);
                onBuilt();
                return getCurrentActivityStatusRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetCurrentActivityStatusRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetCurrentActivityStatusRequest getDefaultInstanceForType() {
                return GetCurrentActivityStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetCurrentActivityStatusRequest) {
                    return mergeFrom((GetCurrentActivityStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetCurrentActivityStatusRequest getCurrentActivityStatusRequest) {
                if (getCurrentActivityStatusRequest == GetCurrentActivityStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(getCurrentActivityStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetCurrentActivityStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetCurrentActivityStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetCurrentActivityStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetCurrentActivityStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetCurrentActivityStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetCurrentActivityStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetCurrentActivityStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetCurrentActivityStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetCurrentActivityStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetCurrentActivityStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetCurrentActivityStatusRequest parseFrom(InputStream inputStream) {
            return (GetCurrentActivityStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetCurrentActivityStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetCurrentActivityStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetCurrentActivityStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetCurrentActivityStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetCurrentActivityStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetCurrentActivityStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetInitialSetupStatusRequest extends GeneratedMessageV3 implements GetInitialSetupStatusRequestOrBuilder {
        private static final GetInitialSetupStatusRequest DEFAULT_INSTANCE = new GetInitialSetupStatusRequest();

        @Deprecated
        public static final Parser<GetInitialSetupStatusRequest> PARSER = new AbstractParser<GetInitialSetupStatusRequest>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.GetInitialSetupStatusRequest.1
            @Override // com.google.protobuf.Parser
            public GetInitialSetupStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetInitialSetupStatusRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private GetInitialSetupStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetInitialSetupStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_descriptor;
        }

        public static Builder newBuilder(GetInitialSetupStatusRequest getInitialSetupStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getInitialSetupStatusRequest);
        }

        public static GetInitialSetupStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetInitialSetupStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetInitialSetupStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetInitialSetupStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GetInitialSetupStatusRequest) {
                return getUnknownFields().equals(((GetInitialSetupStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetInitialSetupStatusRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInitialSetupStatusRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GetInitialSetupStatusRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInitialSetupStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetInitialSetupStatusRequest build() {
                GetInitialSetupStatusRequest getInitialSetupStatusRequestBuildPartial = buildPartial();
                if (getInitialSetupStatusRequestBuildPartial.isInitialized()) {
                    return getInitialSetupStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getInitialSetupStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetInitialSetupStatusRequest buildPartial() {
                GetInitialSetupStatusRequest getInitialSetupStatusRequest = new GetInitialSetupStatusRequest(this);
                onBuilt();
                return getInitialSetupStatusRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInitialSetupStatusRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetInitialSetupStatusRequest getDefaultInstanceForType() {
                return GetInitialSetupStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetInitialSetupStatusRequest) {
                    return mergeFrom((GetInitialSetupStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetInitialSetupStatusRequest getInitialSetupStatusRequest) {
                if (getInitialSetupStatusRequest == GetInitialSetupStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(getInitialSetupStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetInitialSetupStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetInitialSetupStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetInitialSetupStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetInitialSetupStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInitialSetupStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetInitialSetupStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetInitialSetupStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetInitialSetupStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetInitialSetupStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetInitialSetupStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetInitialSetupStatusRequest parseFrom(InputStream inputStream) {
            return (GetInitialSetupStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetInitialSetupStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInitialSetupStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetInitialSetupStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetInitialSetupStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetInitialSetupStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInitialSetupStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RegionRequiresPasscodeNotification extends GeneratedMessageV3 implements RegionRequiresPasscodeNotificationOrBuilder {
        private static final RegionRequiresPasscodeNotification DEFAULT_INSTANCE = new RegionRequiresPasscodeNotification();

        @Deprecated
        public static final Parser<RegionRequiresPasscodeNotification> PARSER = new AbstractParser<RegionRequiresPasscodeNotification>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.RegionRequiresPasscodeNotification.1
            @Override // com.google.protobuf.Parser
            public RegionRequiresPasscodeNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RegionRequiresPasscodeNotification.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private RegionRequiresPasscodeNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RegionRequiresPasscodeNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_descriptor;
        }

        public static Builder newBuilder(RegionRequiresPasscodeNotification regionRequiresPasscodeNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(regionRequiresPasscodeNotification);
        }

        public static RegionRequiresPasscodeNotification parseDelimitedFrom(InputStream inputStream) {
            return (RegionRequiresPasscodeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RegionRequiresPasscodeNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RegionRequiresPasscodeNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof RegionRequiresPasscodeNotification) {
                return getUnknownFields().equals(((RegionRequiresPasscodeNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RegionRequiresPasscodeNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(RegionRequiresPasscodeNotification.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RegionRequiresPasscodeNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RegionRequiresPasscodeNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RegionRequiresPasscodeNotification build() {
                RegionRequiresPasscodeNotification regionRequiresPasscodeNotificationBuildPartial = buildPartial();
                if (regionRequiresPasscodeNotificationBuildPartial.isInitialized()) {
                    return regionRequiresPasscodeNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) regionRequiresPasscodeNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RegionRequiresPasscodeNotification buildPartial() {
                RegionRequiresPasscodeNotification regionRequiresPasscodeNotification = new RegionRequiresPasscodeNotification(this);
                onBuilt();
                return regionRequiresPasscodeNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RegionRequiresPasscodeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(RegionRequiresPasscodeNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RegionRequiresPasscodeNotification getDefaultInstanceForType() {
                return RegionRequiresPasscodeNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RegionRequiresPasscodeNotification) {
                    return mergeFrom((RegionRequiresPasscodeNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RegionRequiresPasscodeNotification regionRequiresPasscodeNotification) {
                if (regionRequiresPasscodeNotification == RegionRequiresPasscodeNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(regionRequiresPasscodeNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RegionRequiresPasscodeNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ RegionRequiresPasscodeNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private RegionRequiresPasscodeNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RegionRequiresPasscodeNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RegionRequiresPasscodeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RegionRequiresPasscodeNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RegionRequiresPasscodeNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RegionRequiresPasscodeNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RegionRequiresPasscodeNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RegionRequiresPasscodeNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RegionRequiresPasscodeNotification parseFrom(InputStream inputStream) {
            return (RegionRequiresPasscodeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RegionRequiresPasscodeNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RegionRequiresPasscodeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RegionRequiresPasscodeNotification parseFrom(CodedInputStream codedInputStream) {
            return (RegionRequiresPasscodeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RegionRequiresPasscodeNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RegionRequiresPasscodeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RemoteDeviceBatteryStatusRequest extends GeneratedMessageV3 implements RemoteDeviceBatteryStatusRequestOrBuilder {
        private static final RemoteDeviceBatteryStatusRequest DEFAULT_INSTANCE = new RemoteDeviceBatteryStatusRequest();

        @Deprecated
        public static final Parser<RemoteDeviceBatteryStatusRequest> PARSER = new AbstractParser<RemoteDeviceBatteryStatusRequest>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusRequest.1
            @Override // com.google.protobuf.Parser
            public RemoteDeviceBatteryStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemoteDeviceBatteryStatusRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private RemoteDeviceBatteryStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemoteDeviceBatteryStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_descriptor;
        }

        public static Builder newBuilder(RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(remoteDeviceBatteryStatusRequest);
        }

        public static RemoteDeviceBatteryStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (RemoteDeviceBatteryStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RemoteDeviceBatteryStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof RemoteDeviceBatteryStatusRequest) {
                return getUnknownFields().equals(((RemoteDeviceBatteryStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RemoteDeviceBatteryStatusRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoteDeviceBatteryStatusRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RemoteDeviceBatteryStatusRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RemoteDeviceBatteryStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoteDeviceBatteryStatusRequest build() {
                RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequestBuildPartial = buildPartial();
                if (remoteDeviceBatteryStatusRequestBuildPartial.isInitialized()) {
                    return remoteDeviceBatteryStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) remoteDeviceBatteryStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoteDeviceBatteryStatusRequest buildPartial() {
                RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest = new RemoteDeviceBatteryStatusRequest(this);
                onBuilt();
                return remoteDeviceBatteryStatusRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoteDeviceBatteryStatusRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RemoteDeviceBatteryStatusRequest getDefaultInstanceForType() {
                return RemoteDeviceBatteryStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RemoteDeviceBatteryStatusRequest) {
                    return mergeFrom((RemoteDeviceBatteryStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest) {
                if (remoteDeviceBatteryStatusRequest == RemoteDeviceBatteryStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(remoteDeviceBatteryStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RemoteDeviceBatteryStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ RemoteDeviceBatteryStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private RemoteDeviceBatteryStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemoteDeviceBatteryStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(InputStream inputStream) {
            return (RemoteDeviceBatteryStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (RemoteDeviceBatteryStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RemoteDeviceBatteryStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ResetPasscodeRequest extends GeneratedMessageV3 implements ResetPasscodeRequestOrBuilder {
        private static final ResetPasscodeRequest DEFAULT_INSTANCE = new ResetPasscodeRequest();

        @Deprecated
        public static final Parser<ResetPasscodeRequest> PARSER = new AbstractParser<ResetPasscodeRequest>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.ResetPasscodeRequest.1
            @Override // com.google.protobuf.Parser
            public ResetPasscodeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ResetPasscodeRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private ResetPasscodeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetPasscodeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_descriptor;
        }

        public static Builder newBuilder(ResetPasscodeRequest resetPasscodeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resetPasscodeRequest);
        }

        public static ResetPasscodeRequest parseDelimitedFrom(InputStream inputStream) {
            return (ResetPasscodeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResetPasscodeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ResetPasscodeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ResetPasscodeRequest) {
                return getUnknownFields().equals(((ResetPasscodeRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResetPasscodeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetPasscodeRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ResetPasscodeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResetPasscodeRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetPasscodeRequest build() {
                ResetPasscodeRequest resetPasscodeRequestBuildPartial = buildPartial();
                if (resetPasscodeRequestBuildPartial.isInitialized()) {
                    return resetPasscodeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resetPasscodeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetPasscodeRequest buildPartial() {
                ResetPasscodeRequest resetPasscodeRequest = new ResetPasscodeRequest(this);
                onBuilt();
                return resetPasscodeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetPasscodeRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ResetPasscodeRequest getDefaultInstanceForType() {
                return ResetPasscodeRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ResetPasscodeRequest) {
                    return mergeFrom((ResetPasscodeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ResetPasscodeRequest resetPasscodeRequest) {
                if (resetPasscodeRequest == ResetPasscodeRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(resetPasscodeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResetPasscodeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ResetPasscodeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ResetPasscodeRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetPasscodeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPasscodeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetPasscodeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ResetPasscodeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResetPasscodeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ResetPasscodeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ResetPasscodeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ResetPasscodeRequest parseFrom(InputStream inputStream) {
            return (ResetPasscodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ResetPasscodeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPasscodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetPasscodeRequest parseFrom(CodedInputStream codedInputStream) {
            return (ResetPasscodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResetPasscodeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPasscodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AppInitiatedPasscodeSetNotification extends GeneratedMessageV3 implements AppInitiatedPasscodeSetNotificationOrBuilder {
        private static final AppInitiatedPasscodeSetNotification DEFAULT_INSTANCE = new AppInitiatedPasscodeSetNotification();

        @Deprecated
        public static final Parser<AppInitiatedPasscodeSetNotification> PARSER = new AbstractParser<AppInitiatedPasscodeSetNotification>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.AppInitiatedPasscodeSetNotification.1
            @Override // com.google.protobuf.Parser
            public AppInitiatedPasscodeSetNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AppInitiatedPasscodeSetNotification.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int SOURCE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int source_;

        private AppInitiatedPasscodeSetNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.source_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AppInitiatedPasscodeSetNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_descriptor;
        }

        public static Builder newBuilder(AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appInitiatedPasscodeSetNotification);
        }

        public static AppInitiatedPasscodeSetNotification parseDelimitedFrom(InputStream inputStream) {
            return (AppInitiatedPasscodeSetNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AppInitiatedPasscodeSetNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppInitiatedPasscodeSetNotification)) {
                return super.equals(obj);
            }
            AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification = (AppInitiatedPasscodeSetNotification) obj;
            if (hasSource() != appInitiatedPasscodeSetNotification.hasSource()) {
                return false;
            }
            return (!hasSource() || this.source_ == appInitiatedPasscodeSetNotification.source_) && getUnknownFields().equals(appInitiatedPasscodeSetNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AppInitiatedPasscodeSetNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.source_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.AppInitiatedPasscodeSetNotificationOrBuilder
        public Source getSource() {
            Source sourceForNumber = Source.forNumber(this.source_);
            return sourceForNumber == null ? Source.GARMIN_PAY : sourceForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.AppInitiatedPasscodeSetNotificationOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSource()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.source_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AppInitiatedPasscodeSetNotification.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AppInitiatedPasscodeSetNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.source_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppInitiatedPasscodeSetNotificationOrBuilder {
            private int bitField0_;
            private int source_;

            private Builder() {
                this.source_ = 0;
            }

            private void buildPartial0(AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    appInitiatedPasscodeSetNotification.source_ = this.source_;
                } else {
                    i14 = 0;
                }
                appInitiatedPasscodeSetNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppInitiatedPasscodeSetNotification build() {
                AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotificationBuildPartial = buildPartial();
                if (appInitiatedPasscodeSetNotificationBuildPartial.isInitialized()) {
                    return appInitiatedPasscodeSetNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appInitiatedPasscodeSetNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppInitiatedPasscodeSetNotification buildPartial() {
                AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification = new AppInitiatedPasscodeSetNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(appInitiatedPasscodeSetNotification);
                }
                onBuilt();
                return appInitiatedPasscodeSetNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.source_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSource() {
                this.bitField0_ &= -2;
                this.source_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.AppInitiatedPasscodeSetNotificationOrBuilder
            public Source getSource() {
                Source sourceForNumber = Source.forNumber(this.source_);
                return sourceForNumber == null ? Source.GARMIN_PAY : sourceForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.AppInitiatedPasscodeSetNotificationOrBuilder
            public boolean hasSource() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_AppInitiatedPasscodeSetNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AppInitiatedPasscodeSetNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Source.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.source_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSource(Source source) {
                source.getClass();
                this.bitField0_ |= 1;
                this.source_ = source.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AppInitiatedPasscodeSetNotification getDefaultInstanceForType() {
                return AppInitiatedPasscodeSetNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.source_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AppInitiatedPasscodeSetNotification) {
                    return mergeFrom((AppInitiatedPasscodeSetNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification) {
                if (appInitiatedPasscodeSetNotification == AppInitiatedPasscodeSetNotification.getDefaultInstance()) {
                    return this;
                }
                if (appInitiatedPasscodeSetNotification.hasSource()) {
                    setSource(appInitiatedPasscodeSetNotification.getSource());
                }
                mergeUnknownFields(appInitiatedPasscodeSetNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AppInitiatedPasscodeSetNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AppInitiatedPasscodeSetNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppInitiatedPasscodeSetNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AppInitiatedPasscodeSetNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AppInitiatedPasscodeSetNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.source_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(InputStream inputStream) {
            return (AppInitiatedPasscodeSetNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppInitiatedPasscodeSetNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(CodedInputStream codedInputStream) {
            return (AppInitiatedPasscodeSetNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AppInitiatedPasscodeSetNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppInitiatedPasscodeSetNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Source implements ProtocolMessageEnum {
            GARMIN_PAY(0),
            DEVICE_SETTINGS(1);

            public static final int DEVICE_SETTINGS_VALUE = 1;
            public static final int GARMIN_PAY_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Source> internalValueMap = new Internal.EnumLiteMap<Source>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.AppInitiatedPasscodeSetNotification.Source.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Source findValueByNumber(int i14) {
                    return Source.forNumber(i14);
                }
            };
            private static final Source[] VALUES = values();

            Source(int i14) {
                this.value = i14;
            }

            public static Source forNumber(int i14) {
                if (i14 == 0) {
                    return GARMIN_PAY;
                }
                if (i14 != 1) {
                    return null;
                }
                return DEVICE_SETTINGS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AppInitiatedPasscodeSetNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Source> internalGetValueMap() {
                return internalValueMap;
            }

            public static Source valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Source valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class DeviceStatusService extends GeneratedMessageV3 implements DeviceStatusServiceOrBuilder {
        public static final int ACTIVITY_STATUS_REQUEST_FIELD_NUMBER = 4;
        public static final int ACTIVITY_STATUS_RESPONSE_FIELD_NUMBER = 5;
        public static final int APP_INITIATED_PASSCODE_SET_NOTIFICATION_FIELD_NUMBER = 12;
        public static final int DEVICE_PASSCODE_INVALID_ATTEMPT_NOTIFICATION_FIELD_NUMBER = 8;
        public static final int DEVICE_UNLOCKED_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int INITIAL_SETUP_STATUS_REQUEST_FIELD_NUMBER = 6;
        public static final int INITIAL_SETUP_STATUS_RESPONSE_FIELD_NUMBER = 7;
        public static final int REGION_REQUIRES_PASSCODE_NOTIFICATION_FIELD_NUMBER = 15;
        public static final int REMOTE_DEVICE_BATTERY_STATUS_CHANGED_NOTIFICATION_FIELD_NUMBER = 1;
        public static final int REMOTE_DEVICE_BATTERY_STATUS_REQUEST_FIELD_NUMBER = 2;
        public static final int REMOTE_DEVICE_BATTERY_STATUS_RESPONSE_FIELD_NUMBER = 3;
        public static final int RESET_PASSCODE_REQUEST_FIELD_NUMBER = 13;
        public static final int RESET_PASSCODE_RESPONSE_FIELD_NUMBER = 14;
        public static final int SET_DEVICE_PASSCODE_REQUEST_FIELD_NUMBER = 10;
        public static final int SET_DEVICE_PASSCODE_RESPONSE_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private GetCurrentActivityStatusRequest activityStatusRequest_;
        private GetCurrentActivityStatusResponse activityStatusResponse_;
        private AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification_;
        private int bitField0_;
        private DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification_;
        private DeviceUnlockedNotification deviceUnlockedNotification_;
        private GetInitialSetupStatusRequest initialSetupStatusRequest_;
        private GetInitialSetupStatusResponse initialSetupStatusResponse_;
        private byte memoizedIsInitialized;
        private RegionRequiresPasscodeNotification regionRequiresPasscodeNotification_;
        private RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification_;
        private RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest_;
        private RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse_;
        private ResetPasscodeRequest resetPasscodeRequest_;
        private ResetPasscodeResponse resetPasscodeResponse_;
        private SetDevicePasscodeRequest setDevicePasscodeRequest_;
        private SetDevicePasscodeResponse setDevicePasscodeResponse_;
        private static final DeviceStatusService DEFAULT_INSTANCE = new DeviceStatusService();

        @Deprecated
        public static final Parser<DeviceStatusService> PARSER = new AbstractParser<DeviceStatusService>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusService.1
            @Override // com.google.protobuf.Parser
            public DeviceStatusService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceStatusService.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private DeviceStatusService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatusService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_descriptor;
        }

        public static Builder newBuilder(DeviceStatusService deviceStatusService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceStatusService);
        }

        public static DeviceStatusService parseDelimitedFrom(InputStream inputStream) {
            return (DeviceStatusService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceStatusService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceStatusService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceStatusService)) {
                return super.equals(obj);
            }
            DeviceStatusService deviceStatusService = (DeviceStatusService) obj;
            if (hasRemoteDeviceBatteryStatusChangedNotification() != deviceStatusService.hasRemoteDeviceBatteryStatusChangedNotification()) {
                return false;
            }
            if ((hasRemoteDeviceBatteryStatusChangedNotification() && !getRemoteDeviceBatteryStatusChangedNotification().equals(deviceStatusService.getRemoteDeviceBatteryStatusChangedNotification())) || hasRemoteDeviceBatteryStatusRequest() != deviceStatusService.hasRemoteDeviceBatteryStatusRequest()) {
                return false;
            }
            if ((hasRemoteDeviceBatteryStatusRequest() && !getRemoteDeviceBatteryStatusRequest().equals(deviceStatusService.getRemoteDeviceBatteryStatusRequest())) || hasRemoteDeviceBatteryStatusResponse() != deviceStatusService.hasRemoteDeviceBatteryStatusResponse()) {
                return false;
            }
            if ((hasRemoteDeviceBatteryStatusResponse() && !getRemoteDeviceBatteryStatusResponse().equals(deviceStatusService.getRemoteDeviceBatteryStatusResponse())) || hasActivityStatusRequest() != deviceStatusService.hasActivityStatusRequest()) {
                return false;
            }
            if ((hasActivityStatusRequest() && !getActivityStatusRequest().equals(deviceStatusService.getActivityStatusRequest())) || hasActivityStatusResponse() != deviceStatusService.hasActivityStatusResponse()) {
                return false;
            }
            if ((hasActivityStatusResponse() && !getActivityStatusResponse().equals(deviceStatusService.getActivityStatusResponse())) || hasInitialSetupStatusRequest() != deviceStatusService.hasInitialSetupStatusRequest()) {
                return false;
            }
            if ((hasInitialSetupStatusRequest() && !getInitialSetupStatusRequest().equals(deviceStatusService.getInitialSetupStatusRequest())) || hasInitialSetupStatusResponse() != deviceStatusService.hasInitialSetupStatusResponse()) {
                return false;
            }
            if ((hasInitialSetupStatusResponse() && !getInitialSetupStatusResponse().equals(deviceStatusService.getInitialSetupStatusResponse())) || hasDevicePasscodeInvalidAttemptNotification() != deviceStatusService.hasDevicePasscodeInvalidAttemptNotification()) {
                return false;
            }
            if ((hasDevicePasscodeInvalidAttemptNotification() && !getDevicePasscodeInvalidAttemptNotification().equals(deviceStatusService.getDevicePasscodeInvalidAttemptNotification())) || hasDeviceUnlockedNotification() != deviceStatusService.hasDeviceUnlockedNotification()) {
                return false;
            }
            if ((hasDeviceUnlockedNotification() && !getDeviceUnlockedNotification().equals(deviceStatusService.getDeviceUnlockedNotification())) || hasSetDevicePasscodeRequest() != deviceStatusService.hasSetDevicePasscodeRequest()) {
                return false;
            }
            if ((hasSetDevicePasscodeRequest() && !getSetDevicePasscodeRequest().equals(deviceStatusService.getSetDevicePasscodeRequest())) || hasSetDevicePasscodeResponse() != deviceStatusService.hasSetDevicePasscodeResponse()) {
                return false;
            }
            if ((hasSetDevicePasscodeResponse() && !getSetDevicePasscodeResponse().equals(deviceStatusService.getSetDevicePasscodeResponse())) || hasAppInitiatedPasscodeSetNotification() != deviceStatusService.hasAppInitiatedPasscodeSetNotification()) {
                return false;
            }
            if ((hasAppInitiatedPasscodeSetNotification() && !getAppInitiatedPasscodeSetNotification().equals(deviceStatusService.getAppInitiatedPasscodeSetNotification())) || hasResetPasscodeRequest() != deviceStatusService.hasResetPasscodeRequest()) {
                return false;
            }
            if ((hasResetPasscodeRequest() && !getResetPasscodeRequest().equals(deviceStatusService.getResetPasscodeRequest())) || hasResetPasscodeResponse() != deviceStatusService.hasResetPasscodeResponse()) {
                return false;
            }
            if ((!hasResetPasscodeResponse() || getResetPasscodeResponse().equals(deviceStatusService.getResetPasscodeResponse())) && hasRegionRequiresPasscodeNotification() == deviceStatusService.hasRegionRequiresPasscodeNotification()) {
                return (!hasRegionRequiresPasscodeNotification() || getRegionRequiresPasscodeNotification().equals(deviceStatusService.getRegionRequiresPasscodeNotification())) && getUnknownFields().equals(deviceStatusService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public GetCurrentActivityStatusRequest getActivityStatusRequest() {
            GetCurrentActivityStatusRequest getCurrentActivityStatusRequest = this.activityStatusRequest_;
            return getCurrentActivityStatusRequest == null ? GetCurrentActivityStatusRequest.getDefaultInstance() : getCurrentActivityStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public GetCurrentActivityStatusRequestOrBuilder getActivityStatusRequestOrBuilder() {
            GetCurrentActivityStatusRequest getCurrentActivityStatusRequest = this.activityStatusRequest_;
            return getCurrentActivityStatusRequest == null ? GetCurrentActivityStatusRequest.getDefaultInstance() : getCurrentActivityStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public GetCurrentActivityStatusResponse getActivityStatusResponse() {
            GetCurrentActivityStatusResponse getCurrentActivityStatusResponse = this.activityStatusResponse_;
            return getCurrentActivityStatusResponse == null ? GetCurrentActivityStatusResponse.getDefaultInstance() : getCurrentActivityStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public GetCurrentActivityStatusResponseOrBuilder getActivityStatusResponseOrBuilder() {
            GetCurrentActivityStatusResponse getCurrentActivityStatusResponse = this.activityStatusResponse_;
            return getCurrentActivityStatusResponse == null ? GetCurrentActivityStatusResponse.getDefaultInstance() : getCurrentActivityStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public AppInitiatedPasscodeSetNotification getAppInitiatedPasscodeSetNotification() {
            AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification = this.appInitiatedPasscodeSetNotification_;
            return appInitiatedPasscodeSetNotification == null ? AppInitiatedPasscodeSetNotification.getDefaultInstance() : appInitiatedPasscodeSetNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public AppInitiatedPasscodeSetNotificationOrBuilder getAppInitiatedPasscodeSetNotificationOrBuilder() {
            AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification = this.appInitiatedPasscodeSetNotification_;
            return appInitiatedPasscodeSetNotification == null ? AppInitiatedPasscodeSetNotification.getDefaultInstance() : appInitiatedPasscodeSetNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public DevicePasscodeInvalidAttemptNotification getDevicePasscodeInvalidAttemptNotification() {
            DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification = this.devicePasscodeInvalidAttemptNotification_;
            return devicePasscodeInvalidAttemptNotification == null ? DevicePasscodeInvalidAttemptNotification.getDefaultInstance() : devicePasscodeInvalidAttemptNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public DevicePasscodeInvalidAttemptNotificationOrBuilder getDevicePasscodeInvalidAttemptNotificationOrBuilder() {
            DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification = this.devicePasscodeInvalidAttemptNotification_;
            return devicePasscodeInvalidAttemptNotification == null ? DevicePasscodeInvalidAttemptNotification.getDefaultInstance() : devicePasscodeInvalidAttemptNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public DeviceUnlockedNotification getDeviceUnlockedNotification() {
            DeviceUnlockedNotification deviceUnlockedNotification = this.deviceUnlockedNotification_;
            return deviceUnlockedNotification == null ? DeviceUnlockedNotification.getDefaultInstance() : deviceUnlockedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public DeviceUnlockedNotificationOrBuilder getDeviceUnlockedNotificationOrBuilder() {
            DeviceUnlockedNotification deviceUnlockedNotification = this.deviceUnlockedNotification_;
            return deviceUnlockedNotification == null ? DeviceUnlockedNotification.getDefaultInstance() : deviceUnlockedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public GetInitialSetupStatusRequest getInitialSetupStatusRequest() {
            GetInitialSetupStatusRequest getInitialSetupStatusRequest = this.initialSetupStatusRequest_;
            return getInitialSetupStatusRequest == null ? GetInitialSetupStatusRequest.getDefaultInstance() : getInitialSetupStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public GetInitialSetupStatusRequestOrBuilder getInitialSetupStatusRequestOrBuilder() {
            GetInitialSetupStatusRequest getInitialSetupStatusRequest = this.initialSetupStatusRequest_;
            return getInitialSetupStatusRequest == null ? GetInitialSetupStatusRequest.getDefaultInstance() : getInitialSetupStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public GetInitialSetupStatusResponse getInitialSetupStatusResponse() {
            GetInitialSetupStatusResponse getInitialSetupStatusResponse = this.initialSetupStatusResponse_;
            return getInitialSetupStatusResponse == null ? GetInitialSetupStatusResponse.getDefaultInstance() : getInitialSetupStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public GetInitialSetupStatusResponseOrBuilder getInitialSetupStatusResponseOrBuilder() {
            GetInitialSetupStatusResponse getInitialSetupStatusResponse = this.initialSetupStatusResponse_;
            return getInitialSetupStatusResponse == null ? GetInitialSetupStatusResponse.getDefaultInstance() : getInitialSetupStatusResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceStatusService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public RegionRequiresPasscodeNotification getRegionRequiresPasscodeNotification() {
            RegionRequiresPasscodeNotification regionRequiresPasscodeNotification = this.regionRequiresPasscodeNotification_;
            return regionRequiresPasscodeNotification == null ? RegionRequiresPasscodeNotification.getDefaultInstance() : regionRequiresPasscodeNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public RegionRequiresPasscodeNotificationOrBuilder getRegionRequiresPasscodeNotificationOrBuilder() {
            RegionRequiresPasscodeNotification regionRequiresPasscodeNotification = this.regionRequiresPasscodeNotification_;
            return regionRequiresPasscodeNotification == null ? RegionRequiresPasscodeNotification.getDefaultInstance() : regionRequiresPasscodeNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public RemoteDeviceBatteryStatusChangedNotification getRemoteDeviceBatteryStatusChangedNotification() {
            RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification = this.remoteDeviceBatteryStatusChangedNotification_;
            return remoteDeviceBatteryStatusChangedNotification == null ? RemoteDeviceBatteryStatusChangedNotification.getDefaultInstance() : remoteDeviceBatteryStatusChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public RemoteDeviceBatteryStatusChangedNotificationOrBuilder getRemoteDeviceBatteryStatusChangedNotificationOrBuilder() {
            RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification = this.remoteDeviceBatteryStatusChangedNotification_;
            return remoteDeviceBatteryStatusChangedNotification == null ? RemoteDeviceBatteryStatusChangedNotification.getDefaultInstance() : remoteDeviceBatteryStatusChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public RemoteDeviceBatteryStatusRequest getRemoteDeviceBatteryStatusRequest() {
            RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest = this.remoteDeviceBatteryStatusRequest_;
            return remoteDeviceBatteryStatusRequest == null ? RemoteDeviceBatteryStatusRequest.getDefaultInstance() : remoteDeviceBatteryStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public RemoteDeviceBatteryStatusRequestOrBuilder getRemoteDeviceBatteryStatusRequestOrBuilder() {
            RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest = this.remoteDeviceBatteryStatusRequest_;
            return remoteDeviceBatteryStatusRequest == null ? RemoteDeviceBatteryStatusRequest.getDefaultInstance() : remoteDeviceBatteryStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public RemoteDeviceBatteryStatusResponse getRemoteDeviceBatteryStatusResponse() {
            RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse = this.remoteDeviceBatteryStatusResponse_;
            return remoteDeviceBatteryStatusResponse == null ? RemoteDeviceBatteryStatusResponse.getDefaultInstance() : remoteDeviceBatteryStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public RemoteDeviceBatteryStatusResponseOrBuilder getRemoteDeviceBatteryStatusResponseOrBuilder() {
            RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse = this.remoteDeviceBatteryStatusResponse_;
            return remoteDeviceBatteryStatusResponse == null ? RemoteDeviceBatteryStatusResponse.getDefaultInstance() : remoteDeviceBatteryStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public ResetPasscodeRequest getResetPasscodeRequest() {
            ResetPasscodeRequest resetPasscodeRequest = this.resetPasscodeRequest_;
            return resetPasscodeRequest == null ? ResetPasscodeRequest.getDefaultInstance() : resetPasscodeRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public ResetPasscodeRequestOrBuilder getResetPasscodeRequestOrBuilder() {
            ResetPasscodeRequest resetPasscodeRequest = this.resetPasscodeRequest_;
            return resetPasscodeRequest == null ? ResetPasscodeRequest.getDefaultInstance() : resetPasscodeRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public ResetPasscodeResponse getResetPasscodeResponse() {
            ResetPasscodeResponse resetPasscodeResponse = this.resetPasscodeResponse_;
            return resetPasscodeResponse == null ? ResetPasscodeResponse.getDefaultInstance() : resetPasscodeResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public ResetPasscodeResponseOrBuilder getResetPasscodeResponseOrBuilder() {
            ResetPasscodeResponse resetPasscodeResponse = this.resetPasscodeResponse_;
            return resetPasscodeResponse == null ? ResetPasscodeResponse.getDefaultInstance() : resetPasscodeResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getRemoteDeviceBatteryStatusChangedNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getRemoteDeviceBatteryStatusRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getRemoteDeviceBatteryStatusResponse());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getActivityStatusRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getActivityStatusResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getInitialSetupStatusRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getInitialSetupStatusResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getDevicePasscodeInvalidAttemptNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getDeviceUnlockedNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getSetDevicePasscodeRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getSetDevicePasscodeResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getAppInitiatedPasscodeSetNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getResetPasscodeRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getResetPasscodeResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getRegionRequiresPasscodeNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public SetDevicePasscodeRequest getSetDevicePasscodeRequest() {
            SetDevicePasscodeRequest setDevicePasscodeRequest = this.setDevicePasscodeRequest_;
            return setDevicePasscodeRequest == null ? SetDevicePasscodeRequest.getDefaultInstance() : setDevicePasscodeRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public SetDevicePasscodeRequestOrBuilder getSetDevicePasscodeRequestOrBuilder() {
            SetDevicePasscodeRequest setDevicePasscodeRequest = this.setDevicePasscodeRequest_;
            return setDevicePasscodeRequest == null ? SetDevicePasscodeRequest.getDefaultInstance() : setDevicePasscodeRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public SetDevicePasscodeResponse getSetDevicePasscodeResponse() {
            SetDevicePasscodeResponse setDevicePasscodeResponse = this.setDevicePasscodeResponse_;
            return setDevicePasscodeResponse == null ? SetDevicePasscodeResponse.getDefaultInstance() : setDevicePasscodeResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public SetDevicePasscodeResponseOrBuilder getSetDevicePasscodeResponseOrBuilder() {
            SetDevicePasscodeResponse setDevicePasscodeResponse = this.setDevicePasscodeResponse_;
            return setDevicePasscodeResponse == null ? SetDevicePasscodeResponse.getDefaultInstance() : setDevicePasscodeResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasActivityStatusRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasActivityStatusResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasAppInitiatedPasscodeSetNotification() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasDevicePasscodeInvalidAttemptNotification() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasDeviceUnlockedNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasInitialSetupStatusRequest() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasInitialSetupStatusResponse() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasRegionRequiresPasscodeNotification() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasRemoteDeviceBatteryStatusChangedNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasRemoteDeviceBatteryStatusRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasRemoteDeviceBatteryStatusResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasResetPasscodeRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasResetPasscodeResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasSetDevicePasscodeRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
        public boolean hasSetDevicePasscodeResponse() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRemoteDeviceBatteryStatusChangedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRemoteDeviceBatteryStatusChangedNotification().hashCode();
            }
            if (hasRemoteDeviceBatteryStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRemoteDeviceBatteryStatusRequest().hashCode();
            }
            if (hasRemoteDeviceBatteryStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getRemoteDeviceBatteryStatusResponse().hashCode();
            }
            if (hasActivityStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getActivityStatusRequest().hashCode();
            }
            if (hasActivityStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getActivityStatusResponse().hashCode();
            }
            if (hasInitialSetupStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getInitialSetupStatusRequest().hashCode();
            }
            if (hasInitialSetupStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getInitialSetupStatusResponse().hashCode();
            }
            if (hasDevicePasscodeInvalidAttemptNotification()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getDevicePasscodeInvalidAttemptNotification().hashCode();
            }
            if (hasDeviceUnlockedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getDeviceUnlockedNotification().hashCode();
            }
            if (hasSetDevicePasscodeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSetDevicePasscodeRequest().hashCode();
            }
            if (hasSetDevicePasscodeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getSetDevicePasscodeResponse().hashCode();
            }
            if (hasAppInitiatedPasscodeSetNotification()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getAppInitiatedPasscodeSetNotification().hashCode();
            }
            if (hasResetPasscodeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getResetPasscodeRequest().hashCode();
            }
            if (hasResetPasscodeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getResetPasscodeResponse().hashCode();
            }
            if (hasRegionRequiresPasscodeNotification()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getRegionRequiresPasscodeNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatusService.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (hasRemoteDeviceBatteryStatusResponse() && !getRemoteDeviceBatteryStatusResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSetDevicePasscodeRequest() || getSetDevicePasscodeRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new DeviceStatusService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getRemoteDeviceBatteryStatusChangedNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getRemoteDeviceBatteryStatusRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getRemoteDeviceBatteryStatusResponse());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getActivityStatusRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getActivityStatusResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getInitialSetupStatusRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getInitialSetupStatusResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getDevicePasscodeInvalidAttemptNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getDeviceUnlockedNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getSetDevicePasscodeRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getSetDevicePasscodeResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getAppInitiatedPasscodeSetNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getResetPasscodeRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getResetPasscodeResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getRegionRequiresPasscodeNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceStatusServiceOrBuilder {
            private SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> activityStatusRequestBuilder_;
            private GetCurrentActivityStatusRequest activityStatusRequest_;
            private SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> activityStatusResponseBuilder_;
            private GetCurrentActivityStatusResponse activityStatusResponse_;
            private SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> appInitiatedPasscodeSetNotificationBuilder_;
            private AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification_;
            private int bitField0_;
            private SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> devicePasscodeInvalidAttemptNotificationBuilder_;
            private DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification_;
            private SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> deviceUnlockedNotificationBuilder_;
            private DeviceUnlockedNotification deviceUnlockedNotification_;
            private SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> initialSetupStatusRequestBuilder_;
            private GetInitialSetupStatusRequest initialSetupStatusRequest_;
            private SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> initialSetupStatusResponseBuilder_;
            private GetInitialSetupStatusResponse initialSetupStatusResponse_;
            private SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> regionRequiresPasscodeNotificationBuilder_;
            private RegionRequiresPasscodeNotification regionRequiresPasscodeNotification_;
            private SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> remoteDeviceBatteryStatusChangedNotificationBuilder_;
            private RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification_;
            private SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> remoteDeviceBatteryStatusRequestBuilder_;
            private RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest_;
            private SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> remoteDeviceBatteryStatusResponseBuilder_;
            private RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse_;
            private SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> resetPasscodeRequestBuilder_;
            private ResetPasscodeRequest resetPasscodeRequest_;
            private SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> resetPasscodeResponseBuilder_;
            private ResetPasscodeResponse resetPasscodeResponse_;
            private SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> setDevicePasscodeRequestBuilder_;
            private SetDevicePasscodeRequest setDevicePasscodeRequest_;
            private SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> setDevicePasscodeResponseBuilder_;
            private SetDevicePasscodeResponse setDevicePasscodeResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DeviceStatusService deviceStatusService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
                    deviceStatusService.remoteDeviceBatteryStatusChangedNotification_ = singleFieldBuilderV3 == null ? this.remoteDeviceBatteryStatusChangedNotification_ : (RemoteDeviceBatteryStatusChangedNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> singleFieldBuilderV4 = this.remoteDeviceBatteryStatusRequestBuilder_;
                    deviceStatusService.remoteDeviceBatteryStatusRequest_ = singleFieldBuilderV4 == null ? this.remoteDeviceBatteryStatusRequest_ : (RemoteDeviceBatteryStatusRequest) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> singleFieldBuilderV5 = this.remoteDeviceBatteryStatusResponseBuilder_;
                    deviceStatusService.remoteDeviceBatteryStatusResponse_ = singleFieldBuilderV5 == null ? this.remoteDeviceBatteryStatusResponse_ : (RemoteDeviceBatteryStatusResponse) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> singleFieldBuilderV6 = this.activityStatusRequestBuilder_;
                    deviceStatusService.activityStatusRequest_ = singleFieldBuilderV6 == null ? this.activityStatusRequest_ : (GetCurrentActivityStatusRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> singleFieldBuilderV7 = this.activityStatusResponseBuilder_;
                    deviceStatusService.activityStatusResponse_ = singleFieldBuilderV7 == null ? this.activityStatusResponse_ : (GetCurrentActivityStatusResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> singleFieldBuilderV8 = this.initialSetupStatusRequestBuilder_;
                    deviceStatusService.initialSetupStatusRequest_ = singleFieldBuilderV8 == null ? this.initialSetupStatusRequest_ : (GetInitialSetupStatusRequest) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> singleFieldBuilderV9 = this.initialSetupStatusResponseBuilder_;
                    deviceStatusService.initialSetupStatusResponse_ = singleFieldBuilderV9 == null ? this.initialSetupStatusResponse_ : (GetInitialSetupStatusResponse) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> singleFieldBuilderV10 = this.devicePasscodeInvalidAttemptNotificationBuilder_;
                    deviceStatusService.devicePasscodeInvalidAttemptNotification_ = singleFieldBuilderV10 == null ? this.devicePasscodeInvalidAttemptNotification_ : (DevicePasscodeInvalidAttemptNotification) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> singleFieldBuilderV11 = this.deviceUnlockedNotificationBuilder_;
                    deviceStatusService.deviceUnlockedNotification_ = singleFieldBuilderV11 == null ? this.deviceUnlockedNotification_ : (DeviceUnlockedNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> singleFieldBuilderV12 = this.setDevicePasscodeRequestBuilder_;
                    deviceStatusService.setDevicePasscodeRequest_ = singleFieldBuilderV12 == null ? this.setDevicePasscodeRequest_ : (SetDevicePasscodeRequest) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> singleFieldBuilderV13 = this.setDevicePasscodeResponseBuilder_;
                    deviceStatusService.setDevicePasscodeResponse_ = singleFieldBuilderV13 == null ? this.setDevicePasscodeResponse_ : (SetDevicePasscodeResponse) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> singleFieldBuilderV14 = this.appInitiatedPasscodeSetNotificationBuilder_;
                    deviceStatusService.appInitiatedPasscodeSetNotification_ = singleFieldBuilderV14 == null ? this.appInitiatedPasscodeSetNotification_ : (AppInitiatedPasscodeSetNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> singleFieldBuilderV15 = this.resetPasscodeRequestBuilder_;
                    deviceStatusService.resetPasscodeRequest_ = singleFieldBuilderV15 == null ? this.resetPasscodeRequest_ : (ResetPasscodeRequest) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> singleFieldBuilderV16 = this.resetPasscodeResponseBuilder_;
                    deviceStatusService.resetPasscodeResponse_ = singleFieldBuilderV16 == null ? this.resetPasscodeResponse_ : (ResetPasscodeResponse) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> singleFieldBuilderV17 = this.regionRequiresPasscodeNotificationBuilder_;
                    deviceStatusService.regionRequiresPasscodeNotification_ = singleFieldBuilderV17 == null ? this.regionRequiresPasscodeNotification_ : (RegionRequiresPasscodeNotification) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                deviceStatusService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> getActivityStatusRequestFieldBuilder() {
                if (this.activityStatusRequestBuilder_ == null) {
                    this.activityStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getActivityStatusRequest(), getParentForChildren(), isClean());
                    this.activityStatusRequest_ = null;
                }
                return this.activityStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> getActivityStatusResponseFieldBuilder() {
                if (this.activityStatusResponseBuilder_ == null) {
                    this.activityStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getActivityStatusResponse(), getParentForChildren(), isClean());
                    this.activityStatusResponse_ = null;
                }
                return this.activityStatusResponseBuilder_;
            }

            private SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> getAppInitiatedPasscodeSetNotificationFieldBuilder() {
                if (this.appInitiatedPasscodeSetNotificationBuilder_ == null) {
                    this.appInitiatedPasscodeSetNotificationBuilder_ = new SingleFieldBuilderV3<>(getAppInitiatedPasscodeSetNotification(), getParentForChildren(), isClean());
                    this.appInitiatedPasscodeSetNotification_ = null;
                }
                return this.appInitiatedPasscodeSetNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_descriptor;
            }

            private SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> getDevicePasscodeInvalidAttemptNotificationFieldBuilder() {
                if (this.devicePasscodeInvalidAttemptNotificationBuilder_ == null) {
                    this.devicePasscodeInvalidAttemptNotificationBuilder_ = new SingleFieldBuilderV3<>(getDevicePasscodeInvalidAttemptNotification(), getParentForChildren(), isClean());
                    this.devicePasscodeInvalidAttemptNotification_ = null;
                }
                return this.devicePasscodeInvalidAttemptNotificationBuilder_;
            }

            private SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> getDeviceUnlockedNotificationFieldBuilder() {
                if (this.deviceUnlockedNotificationBuilder_ == null) {
                    this.deviceUnlockedNotificationBuilder_ = new SingleFieldBuilderV3<>(getDeviceUnlockedNotification(), getParentForChildren(), isClean());
                    this.deviceUnlockedNotification_ = null;
                }
                return this.deviceUnlockedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> getInitialSetupStatusRequestFieldBuilder() {
                if (this.initialSetupStatusRequestBuilder_ == null) {
                    this.initialSetupStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getInitialSetupStatusRequest(), getParentForChildren(), isClean());
                    this.initialSetupStatusRequest_ = null;
                }
                return this.initialSetupStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> getInitialSetupStatusResponseFieldBuilder() {
                if (this.initialSetupStatusResponseBuilder_ == null) {
                    this.initialSetupStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getInitialSetupStatusResponse(), getParentForChildren(), isClean());
                    this.initialSetupStatusResponse_ = null;
                }
                return this.initialSetupStatusResponseBuilder_;
            }

            private SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> getRegionRequiresPasscodeNotificationFieldBuilder() {
                if (this.regionRequiresPasscodeNotificationBuilder_ == null) {
                    this.regionRequiresPasscodeNotificationBuilder_ = new SingleFieldBuilderV3<>(getRegionRequiresPasscodeNotification(), getParentForChildren(), isClean());
                    this.regionRequiresPasscodeNotification_ = null;
                }
                return this.regionRequiresPasscodeNotificationBuilder_;
            }

            private SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> getRemoteDeviceBatteryStatusChangedNotificationFieldBuilder() {
                if (this.remoteDeviceBatteryStatusChangedNotificationBuilder_ == null) {
                    this.remoteDeviceBatteryStatusChangedNotificationBuilder_ = new SingleFieldBuilderV3<>(getRemoteDeviceBatteryStatusChangedNotification(), getParentForChildren(), isClean());
                    this.remoteDeviceBatteryStatusChangedNotification_ = null;
                }
                return this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> getRemoteDeviceBatteryStatusRequestFieldBuilder() {
                if (this.remoteDeviceBatteryStatusRequestBuilder_ == null) {
                    this.remoteDeviceBatteryStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getRemoteDeviceBatteryStatusRequest(), getParentForChildren(), isClean());
                    this.remoteDeviceBatteryStatusRequest_ = null;
                }
                return this.remoteDeviceBatteryStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> getRemoteDeviceBatteryStatusResponseFieldBuilder() {
                if (this.remoteDeviceBatteryStatusResponseBuilder_ == null) {
                    this.remoteDeviceBatteryStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getRemoteDeviceBatteryStatusResponse(), getParentForChildren(), isClean());
                    this.remoteDeviceBatteryStatusResponse_ = null;
                }
                return this.remoteDeviceBatteryStatusResponseBuilder_;
            }

            private SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> getResetPasscodeRequestFieldBuilder() {
                if (this.resetPasscodeRequestBuilder_ == null) {
                    this.resetPasscodeRequestBuilder_ = new SingleFieldBuilderV3<>(getResetPasscodeRequest(), getParentForChildren(), isClean());
                    this.resetPasscodeRequest_ = null;
                }
                return this.resetPasscodeRequestBuilder_;
            }

            private SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> getResetPasscodeResponseFieldBuilder() {
                if (this.resetPasscodeResponseBuilder_ == null) {
                    this.resetPasscodeResponseBuilder_ = new SingleFieldBuilderV3<>(getResetPasscodeResponse(), getParentForChildren(), isClean());
                    this.resetPasscodeResponse_ = null;
                }
                return this.resetPasscodeResponseBuilder_;
            }

            private SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> getSetDevicePasscodeRequestFieldBuilder() {
                if (this.setDevicePasscodeRequestBuilder_ == null) {
                    this.setDevicePasscodeRequestBuilder_ = new SingleFieldBuilderV3<>(getSetDevicePasscodeRequest(), getParentForChildren(), isClean());
                    this.setDevicePasscodeRequest_ = null;
                }
                return this.setDevicePasscodeRequestBuilder_;
            }

            private SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> getSetDevicePasscodeResponseFieldBuilder() {
                if (this.setDevicePasscodeResponseBuilder_ == null) {
                    this.setDevicePasscodeResponseBuilder_ = new SingleFieldBuilderV3<>(getSetDevicePasscodeResponse(), getParentForChildren(), isClean());
                    this.setDevicePasscodeResponse_ = null;
                }
                return this.setDevicePasscodeResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getRemoteDeviceBatteryStatusChangedNotificationFieldBuilder();
                    getRemoteDeviceBatteryStatusRequestFieldBuilder();
                    getRemoteDeviceBatteryStatusResponseFieldBuilder();
                    getActivityStatusRequestFieldBuilder();
                    getActivityStatusResponseFieldBuilder();
                    getInitialSetupStatusRequestFieldBuilder();
                    getInitialSetupStatusResponseFieldBuilder();
                    getDevicePasscodeInvalidAttemptNotificationFieldBuilder();
                    getDeviceUnlockedNotificationFieldBuilder();
                    getSetDevicePasscodeRequestFieldBuilder();
                    getSetDevicePasscodeResponseFieldBuilder();
                    getAppInitiatedPasscodeSetNotificationFieldBuilder();
                    getResetPasscodeRequestFieldBuilder();
                    getResetPasscodeResponseFieldBuilder();
                    getRegionRequiresPasscodeNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatusService build() {
                DeviceStatusService deviceStatusServiceBuildPartial = buildPartial();
                if (deviceStatusServiceBuildPartial.isInitialized()) {
                    return deviceStatusServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceStatusServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatusService buildPartial() {
                DeviceStatusService deviceStatusService = new DeviceStatusService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceStatusService);
                }
                onBuilt();
                return deviceStatusService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.remoteDeviceBatteryStatusChangedNotification_ = null;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.remoteDeviceBatteryStatusChangedNotificationBuilder_ = null;
                }
                this.remoteDeviceBatteryStatusRequest_ = null;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> singleFieldBuilderV4 = this.remoteDeviceBatteryStatusRequestBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.remoteDeviceBatteryStatusRequestBuilder_ = null;
                }
                this.remoteDeviceBatteryStatusResponse_ = null;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> singleFieldBuilderV5 = this.remoteDeviceBatteryStatusResponseBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.remoteDeviceBatteryStatusResponseBuilder_ = null;
                }
                this.activityStatusRequest_ = null;
                SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> singleFieldBuilderV6 = this.activityStatusRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.activityStatusRequestBuilder_ = null;
                }
                this.activityStatusResponse_ = null;
                SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> singleFieldBuilderV7 = this.activityStatusResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.activityStatusResponseBuilder_ = null;
                }
                this.initialSetupStatusRequest_ = null;
                SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> singleFieldBuilderV8 = this.initialSetupStatusRequestBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.initialSetupStatusRequestBuilder_ = null;
                }
                this.initialSetupStatusResponse_ = null;
                SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> singleFieldBuilderV9 = this.initialSetupStatusResponseBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.initialSetupStatusResponseBuilder_ = null;
                }
                this.devicePasscodeInvalidAttemptNotification_ = null;
                SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> singleFieldBuilderV10 = this.devicePasscodeInvalidAttemptNotificationBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.devicePasscodeInvalidAttemptNotificationBuilder_ = null;
                }
                this.deviceUnlockedNotification_ = null;
                SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> singleFieldBuilderV11 = this.deviceUnlockedNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.deviceUnlockedNotificationBuilder_ = null;
                }
                this.setDevicePasscodeRequest_ = null;
                SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> singleFieldBuilderV12 = this.setDevicePasscodeRequestBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.setDevicePasscodeRequestBuilder_ = null;
                }
                this.setDevicePasscodeResponse_ = null;
                SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> singleFieldBuilderV13 = this.setDevicePasscodeResponseBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.setDevicePasscodeResponseBuilder_ = null;
                }
                this.appInitiatedPasscodeSetNotification_ = null;
                SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> singleFieldBuilderV14 = this.appInitiatedPasscodeSetNotificationBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.appInitiatedPasscodeSetNotificationBuilder_ = null;
                }
                this.resetPasscodeRequest_ = null;
                SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> singleFieldBuilderV15 = this.resetPasscodeRequestBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.resetPasscodeRequestBuilder_ = null;
                }
                this.resetPasscodeResponse_ = null;
                SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> singleFieldBuilderV16 = this.resetPasscodeResponseBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.resetPasscodeResponseBuilder_ = null;
                }
                this.regionRequiresPasscodeNotification_ = null;
                SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> singleFieldBuilderV17 = this.regionRequiresPasscodeNotificationBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.regionRequiresPasscodeNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearActivityStatusRequest() {
                this.bitField0_ &= -9;
                this.activityStatusRequest_ = null;
                SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> singleFieldBuilderV3 = this.activityStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.activityStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearActivityStatusResponse() {
                this.bitField0_ &= -17;
                this.activityStatusResponse_ = null;
                SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> singleFieldBuilderV3 = this.activityStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.activityStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAppInitiatedPasscodeSetNotification() {
                this.bitField0_ &= -2049;
                this.appInitiatedPasscodeSetNotification_ = null;
                SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> singleFieldBuilderV3 = this.appInitiatedPasscodeSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appInitiatedPasscodeSetNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDevicePasscodeInvalidAttemptNotification() {
                this.bitField0_ &= -129;
                this.devicePasscodeInvalidAttemptNotification_ = null;
                SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> singleFieldBuilderV3 = this.devicePasscodeInvalidAttemptNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.devicePasscodeInvalidAttemptNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceUnlockedNotification() {
                this.bitField0_ &= -257;
                this.deviceUnlockedNotification_ = null;
                SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> singleFieldBuilderV3 = this.deviceUnlockedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceUnlockedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInitialSetupStatusRequest() {
                this.bitField0_ &= -33;
                this.initialSetupStatusRequest_ = null;
                SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialSetupStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearInitialSetupStatusResponse() {
                this.bitField0_ &= -65;
                this.initialSetupStatusResponse_ = null;
                SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialSetupStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRegionRequiresPasscodeNotification() {
                this.bitField0_ &= -16385;
                this.regionRequiresPasscodeNotification_ = null;
                SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> singleFieldBuilderV3 = this.regionRequiresPasscodeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.regionRequiresPasscodeNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRemoteDeviceBatteryStatusChangedNotification() {
                this.bitField0_ &= -2;
                this.remoteDeviceBatteryStatusChangedNotification_ = null;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.remoteDeviceBatteryStatusChangedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRemoteDeviceBatteryStatusRequest() {
                this.bitField0_ &= -3;
                this.remoteDeviceBatteryStatusRequest_ = null;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.remoteDeviceBatteryStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRemoteDeviceBatteryStatusResponse() {
                this.bitField0_ &= -5;
                this.remoteDeviceBatteryStatusResponse_ = null;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.remoteDeviceBatteryStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearResetPasscodeRequest() {
                this.bitField0_ &= -4097;
                this.resetPasscodeRequest_ = null;
                SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> singleFieldBuilderV3 = this.resetPasscodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.resetPasscodeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearResetPasscodeResponse() {
                this.bitField0_ &= -8193;
                this.resetPasscodeResponse_ = null;
                SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> singleFieldBuilderV3 = this.resetPasscodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.resetPasscodeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetDevicePasscodeRequest() {
                this.bitField0_ &= -513;
                this.setDevicePasscodeRequest_ = null;
                SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setDevicePasscodeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetDevicePasscodeResponse() {
                this.bitField0_ &= -1025;
                this.setDevicePasscodeResponse_ = null;
                SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setDevicePasscodeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public GetCurrentActivityStatusRequest getActivityStatusRequest() {
                SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> singleFieldBuilderV3 = this.activityStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetCurrentActivityStatusRequest) singleFieldBuilderV3.getMessage();
                }
                GetCurrentActivityStatusRequest getCurrentActivityStatusRequest = this.activityStatusRequest_;
                return getCurrentActivityStatusRequest == null ? GetCurrentActivityStatusRequest.getDefaultInstance() : getCurrentActivityStatusRequest;
            }

            public GetCurrentActivityStatusRequest.Builder getActivityStatusRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GetCurrentActivityStatusRequest.Builder) getActivityStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public GetCurrentActivityStatusRequestOrBuilder getActivityStatusRequestOrBuilder() {
                SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> singleFieldBuilderV3 = this.activityStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetCurrentActivityStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetCurrentActivityStatusRequest getCurrentActivityStatusRequest = this.activityStatusRequest_;
                return getCurrentActivityStatusRequest == null ? GetCurrentActivityStatusRequest.getDefaultInstance() : getCurrentActivityStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public GetCurrentActivityStatusResponse getActivityStatusResponse() {
                SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> singleFieldBuilderV3 = this.activityStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetCurrentActivityStatusResponse) singleFieldBuilderV3.getMessage();
                }
                GetCurrentActivityStatusResponse getCurrentActivityStatusResponse = this.activityStatusResponse_;
                return getCurrentActivityStatusResponse == null ? GetCurrentActivityStatusResponse.getDefaultInstance() : getCurrentActivityStatusResponse;
            }

            public GetCurrentActivityStatusResponse.Builder getActivityStatusResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (GetCurrentActivityStatusResponse.Builder) getActivityStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public GetCurrentActivityStatusResponseOrBuilder getActivityStatusResponseOrBuilder() {
                SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> singleFieldBuilderV3 = this.activityStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetCurrentActivityStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetCurrentActivityStatusResponse getCurrentActivityStatusResponse = this.activityStatusResponse_;
                return getCurrentActivityStatusResponse == null ? GetCurrentActivityStatusResponse.getDefaultInstance() : getCurrentActivityStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public AppInitiatedPasscodeSetNotification getAppInitiatedPasscodeSetNotification() {
                SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> singleFieldBuilderV3 = this.appInitiatedPasscodeSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppInitiatedPasscodeSetNotification) singleFieldBuilderV3.getMessage();
                }
                AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification = this.appInitiatedPasscodeSetNotification_;
                return appInitiatedPasscodeSetNotification == null ? AppInitiatedPasscodeSetNotification.getDefaultInstance() : appInitiatedPasscodeSetNotification;
            }

            public AppInitiatedPasscodeSetNotification.Builder getAppInitiatedPasscodeSetNotificationBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (AppInitiatedPasscodeSetNotification.Builder) getAppInitiatedPasscodeSetNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public AppInitiatedPasscodeSetNotificationOrBuilder getAppInitiatedPasscodeSetNotificationOrBuilder() {
                SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> singleFieldBuilderV3 = this.appInitiatedPasscodeSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppInitiatedPasscodeSetNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification = this.appInitiatedPasscodeSetNotification_;
                return appInitiatedPasscodeSetNotification == null ? AppInitiatedPasscodeSetNotification.getDefaultInstance() : appInitiatedPasscodeSetNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public DevicePasscodeInvalidAttemptNotification getDevicePasscodeInvalidAttemptNotification() {
                SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> singleFieldBuilderV3 = this.devicePasscodeInvalidAttemptNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicePasscodeInvalidAttemptNotification) singleFieldBuilderV3.getMessage();
                }
                DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification = this.devicePasscodeInvalidAttemptNotification_;
                return devicePasscodeInvalidAttemptNotification == null ? DevicePasscodeInvalidAttemptNotification.getDefaultInstance() : devicePasscodeInvalidAttemptNotification;
            }

            public DevicePasscodeInvalidAttemptNotification.Builder getDevicePasscodeInvalidAttemptNotificationBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (DevicePasscodeInvalidAttemptNotification.Builder) getDevicePasscodeInvalidAttemptNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public DevicePasscodeInvalidAttemptNotificationOrBuilder getDevicePasscodeInvalidAttemptNotificationOrBuilder() {
                SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> singleFieldBuilderV3 = this.devicePasscodeInvalidAttemptNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicePasscodeInvalidAttemptNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification = this.devicePasscodeInvalidAttemptNotification_;
                return devicePasscodeInvalidAttemptNotification == null ? DevicePasscodeInvalidAttemptNotification.getDefaultInstance() : devicePasscodeInvalidAttemptNotification;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public DeviceUnlockedNotification getDeviceUnlockedNotification() {
                SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> singleFieldBuilderV3 = this.deviceUnlockedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceUnlockedNotification) singleFieldBuilderV3.getMessage();
                }
                DeviceUnlockedNotification deviceUnlockedNotification = this.deviceUnlockedNotification_;
                return deviceUnlockedNotification == null ? DeviceUnlockedNotification.getDefaultInstance() : deviceUnlockedNotification;
            }

            public DeviceUnlockedNotification.Builder getDeviceUnlockedNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (DeviceUnlockedNotification.Builder) getDeviceUnlockedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public DeviceUnlockedNotificationOrBuilder getDeviceUnlockedNotificationOrBuilder() {
                SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> singleFieldBuilderV3 = this.deviceUnlockedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceUnlockedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceUnlockedNotification deviceUnlockedNotification = this.deviceUnlockedNotification_;
                return deviceUnlockedNotification == null ? DeviceUnlockedNotification.getDefaultInstance() : deviceUnlockedNotification;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public GetInitialSetupStatusRequest getInitialSetupStatusRequest() {
                SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetInitialSetupStatusRequest) singleFieldBuilderV3.getMessage();
                }
                GetInitialSetupStatusRequest getInitialSetupStatusRequest = this.initialSetupStatusRequest_;
                return getInitialSetupStatusRequest == null ? GetInitialSetupStatusRequest.getDefaultInstance() : getInitialSetupStatusRequest;
            }

            public GetInitialSetupStatusRequest.Builder getInitialSetupStatusRequestBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (GetInitialSetupStatusRequest.Builder) getInitialSetupStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public GetInitialSetupStatusRequestOrBuilder getInitialSetupStatusRequestOrBuilder() {
                SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetInitialSetupStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetInitialSetupStatusRequest getInitialSetupStatusRequest = this.initialSetupStatusRequest_;
                return getInitialSetupStatusRequest == null ? GetInitialSetupStatusRequest.getDefaultInstance() : getInitialSetupStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public GetInitialSetupStatusResponse getInitialSetupStatusResponse() {
                SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetInitialSetupStatusResponse) singleFieldBuilderV3.getMessage();
                }
                GetInitialSetupStatusResponse getInitialSetupStatusResponse = this.initialSetupStatusResponse_;
                return getInitialSetupStatusResponse == null ? GetInitialSetupStatusResponse.getDefaultInstance() : getInitialSetupStatusResponse;
            }

            public GetInitialSetupStatusResponse.Builder getInitialSetupStatusResponseBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (GetInitialSetupStatusResponse.Builder) getInitialSetupStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public GetInitialSetupStatusResponseOrBuilder getInitialSetupStatusResponseOrBuilder() {
                SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetInitialSetupStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetInitialSetupStatusResponse getInitialSetupStatusResponse = this.initialSetupStatusResponse_;
                return getInitialSetupStatusResponse == null ? GetInitialSetupStatusResponse.getDefaultInstance() : getInitialSetupStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public RegionRequiresPasscodeNotification getRegionRequiresPasscodeNotification() {
                SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> singleFieldBuilderV3 = this.regionRequiresPasscodeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RegionRequiresPasscodeNotification) singleFieldBuilderV3.getMessage();
                }
                RegionRequiresPasscodeNotification regionRequiresPasscodeNotification = this.regionRequiresPasscodeNotification_;
                return regionRequiresPasscodeNotification == null ? RegionRequiresPasscodeNotification.getDefaultInstance() : regionRequiresPasscodeNotification;
            }

            public RegionRequiresPasscodeNotification.Builder getRegionRequiresPasscodeNotificationBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (RegionRequiresPasscodeNotification.Builder) getRegionRequiresPasscodeNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public RegionRequiresPasscodeNotificationOrBuilder getRegionRequiresPasscodeNotificationOrBuilder() {
                SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> singleFieldBuilderV3 = this.regionRequiresPasscodeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RegionRequiresPasscodeNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RegionRequiresPasscodeNotification regionRequiresPasscodeNotification = this.regionRequiresPasscodeNotification_;
                return regionRequiresPasscodeNotification == null ? RegionRequiresPasscodeNotification.getDefaultInstance() : regionRequiresPasscodeNotification;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public RemoteDeviceBatteryStatusChangedNotification getRemoteDeviceBatteryStatusChangedNotification() {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoteDeviceBatteryStatusChangedNotification) singleFieldBuilderV3.getMessage();
                }
                RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification = this.remoteDeviceBatteryStatusChangedNotification_;
                return remoteDeviceBatteryStatusChangedNotification == null ? RemoteDeviceBatteryStatusChangedNotification.getDefaultInstance() : remoteDeviceBatteryStatusChangedNotification;
            }

            public RemoteDeviceBatteryStatusChangedNotification.Builder getRemoteDeviceBatteryStatusChangedNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (RemoteDeviceBatteryStatusChangedNotification.Builder) getRemoteDeviceBatteryStatusChangedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public RemoteDeviceBatteryStatusChangedNotificationOrBuilder getRemoteDeviceBatteryStatusChangedNotificationOrBuilder() {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoteDeviceBatteryStatusChangedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification = this.remoteDeviceBatteryStatusChangedNotification_;
                return remoteDeviceBatteryStatusChangedNotification == null ? RemoteDeviceBatteryStatusChangedNotification.getDefaultInstance() : remoteDeviceBatteryStatusChangedNotification;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public RemoteDeviceBatteryStatusRequest getRemoteDeviceBatteryStatusRequest() {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoteDeviceBatteryStatusRequest) singleFieldBuilderV3.getMessage();
                }
                RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest = this.remoteDeviceBatteryStatusRequest_;
                return remoteDeviceBatteryStatusRequest == null ? RemoteDeviceBatteryStatusRequest.getDefaultInstance() : remoteDeviceBatteryStatusRequest;
            }

            public RemoteDeviceBatteryStatusRequest.Builder getRemoteDeviceBatteryStatusRequestBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (RemoteDeviceBatteryStatusRequest.Builder) getRemoteDeviceBatteryStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public RemoteDeviceBatteryStatusRequestOrBuilder getRemoteDeviceBatteryStatusRequestOrBuilder() {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoteDeviceBatteryStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest = this.remoteDeviceBatteryStatusRequest_;
                return remoteDeviceBatteryStatusRequest == null ? RemoteDeviceBatteryStatusRequest.getDefaultInstance() : remoteDeviceBatteryStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public RemoteDeviceBatteryStatusResponse getRemoteDeviceBatteryStatusResponse() {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoteDeviceBatteryStatusResponse) singleFieldBuilderV3.getMessage();
                }
                RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse = this.remoteDeviceBatteryStatusResponse_;
                return remoteDeviceBatteryStatusResponse == null ? RemoteDeviceBatteryStatusResponse.getDefaultInstance() : remoteDeviceBatteryStatusResponse;
            }

            public RemoteDeviceBatteryStatusResponse.Builder getRemoteDeviceBatteryStatusResponseBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (RemoteDeviceBatteryStatusResponse.Builder) getRemoteDeviceBatteryStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public RemoteDeviceBatteryStatusResponseOrBuilder getRemoteDeviceBatteryStatusResponseOrBuilder() {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoteDeviceBatteryStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse = this.remoteDeviceBatteryStatusResponse_;
                return remoteDeviceBatteryStatusResponse == null ? RemoteDeviceBatteryStatusResponse.getDefaultInstance() : remoteDeviceBatteryStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public ResetPasscodeRequest getResetPasscodeRequest() {
                SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> singleFieldBuilderV3 = this.resetPasscodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetPasscodeRequest) singleFieldBuilderV3.getMessage();
                }
                ResetPasscodeRequest resetPasscodeRequest = this.resetPasscodeRequest_;
                return resetPasscodeRequest == null ? ResetPasscodeRequest.getDefaultInstance() : resetPasscodeRequest;
            }

            public ResetPasscodeRequest.Builder getResetPasscodeRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (ResetPasscodeRequest.Builder) getResetPasscodeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public ResetPasscodeRequestOrBuilder getResetPasscodeRequestOrBuilder() {
                SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> singleFieldBuilderV3 = this.resetPasscodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetPasscodeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ResetPasscodeRequest resetPasscodeRequest = this.resetPasscodeRequest_;
                return resetPasscodeRequest == null ? ResetPasscodeRequest.getDefaultInstance() : resetPasscodeRequest;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public ResetPasscodeResponse getResetPasscodeResponse() {
                SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> singleFieldBuilderV3 = this.resetPasscodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetPasscodeResponse) singleFieldBuilderV3.getMessage();
                }
                ResetPasscodeResponse resetPasscodeResponse = this.resetPasscodeResponse_;
                return resetPasscodeResponse == null ? ResetPasscodeResponse.getDefaultInstance() : resetPasscodeResponse;
            }

            public ResetPasscodeResponse.Builder getResetPasscodeResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (ResetPasscodeResponse.Builder) getResetPasscodeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public ResetPasscodeResponseOrBuilder getResetPasscodeResponseOrBuilder() {
                SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> singleFieldBuilderV3 = this.resetPasscodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetPasscodeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ResetPasscodeResponse resetPasscodeResponse = this.resetPasscodeResponse_;
                return resetPasscodeResponse == null ? ResetPasscodeResponse.getDefaultInstance() : resetPasscodeResponse;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public SetDevicePasscodeRequest getSetDevicePasscodeRequest() {
                SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetDevicePasscodeRequest) singleFieldBuilderV3.getMessage();
                }
                SetDevicePasscodeRequest setDevicePasscodeRequest = this.setDevicePasscodeRequest_;
                return setDevicePasscodeRequest == null ? SetDevicePasscodeRequest.getDefaultInstance() : setDevicePasscodeRequest;
            }

            public SetDevicePasscodeRequest.Builder getSetDevicePasscodeRequestBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (SetDevicePasscodeRequest.Builder) getSetDevicePasscodeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public SetDevicePasscodeRequestOrBuilder getSetDevicePasscodeRequestOrBuilder() {
                SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetDevicePasscodeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetDevicePasscodeRequest setDevicePasscodeRequest = this.setDevicePasscodeRequest_;
                return setDevicePasscodeRequest == null ? SetDevicePasscodeRequest.getDefaultInstance() : setDevicePasscodeRequest;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public SetDevicePasscodeResponse getSetDevicePasscodeResponse() {
                SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetDevicePasscodeResponse) singleFieldBuilderV3.getMessage();
                }
                SetDevicePasscodeResponse setDevicePasscodeResponse = this.setDevicePasscodeResponse_;
                return setDevicePasscodeResponse == null ? SetDevicePasscodeResponse.getDefaultInstance() : setDevicePasscodeResponse;
            }

            public SetDevicePasscodeResponse.Builder getSetDevicePasscodeResponseBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (SetDevicePasscodeResponse.Builder) getSetDevicePasscodeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public SetDevicePasscodeResponseOrBuilder getSetDevicePasscodeResponseOrBuilder() {
                SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetDevicePasscodeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetDevicePasscodeResponse setDevicePasscodeResponse = this.setDevicePasscodeResponse_;
                return setDevicePasscodeResponse == null ? SetDevicePasscodeResponse.getDefaultInstance() : setDevicePasscodeResponse;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasActivityStatusRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasActivityStatusResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasAppInitiatedPasscodeSetNotification() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasDevicePasscodeInvalidAttemptNotification() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasDeviceUnlockedNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasInitialSetupStatusRequest() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasInitialSetupStatusResponse() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasRegionRequiresPasscodeNotification() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasRemoteDeviceBatteryStatusChangedNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasRemoteDeviceBatteryStatusRequest() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasRemoteDeviceBatteryStatusResponse() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasResetPasscodeRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasResetPasscodeResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasSetDevicePasscodeRequest() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.DeviceStatusServiceOrBuilder
            public boolean hasSetDevicePasscodeResponse() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_DeviceStatusService_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatusService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasRemoteDeviceBatteryStatusResponse() || getRemoteDeviceBatteryStatusResponse().isInitialized()) {
                    return !hasSetDevicePasscodeRequest() || getSetDevicePasscodeRequest().isInitialized();
                }
                return false;
            }

            public Builder mergeActivityStatusRequest(GetCurrentActivityStatusRequest getCurrentActivityStatusRequest) {
                GetCurrentActivityStatusRequest getCurrentActivityStatusRequest2;
                SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> singleFieldBuilderV3 = this.activityStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getCurrentActivityStatusRequest);
                } else if ((this.bitField0_ & 8) == 0 || (getCurrentActivityStatusRequest2 = this.activityStatusRequest_) == null || getCurrentActivityStatusRequest2 == GetCurrentActivityStatusRequest.getDefaultInstance()) {
                    this.activityStatusRequest_ = getCurrentActivityStatusRequest;
                } else {
                    getActivityStatusRequestBuilder().mergeFrom(getCurrentActivityStatusRequest);
                }
                if (this.activityStatusRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeActivityStatusResponse(GetCurrentActivityStatusResponse getCurrentActivityStatusResponse) {
                GetCurrentActivityStatusResponse getCurrentActivityStatusResponse2;
                SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> singleFieldBuilderV3 = this.activityStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getCurrentActivityStatusResponse);
                } else if ((this.bitField0_ & 16) == 0 || (getCurrentActivityStatusResponse2 = this.activityStatusResponse_) == null || getCurrentActivityStatusResponse2 == GetCurrentActivityStatusResponse.getDefaultInstance()) {
                    this.activityStatusResponse_ = getCurrentActivityStatusResponse;
                } else {
                    getActivityStatusResponseBuilder().mergeFrom(getCurrentActivityStatusResponse);
                }
                if (this.activityStatusResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAppInitiatedPasscodeSetNotification(AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification) {
                AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification2;
                SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> singleFieldBuilderV3 = this.appInitiatedPasscodeSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(appInitiatedPasscodeSetNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (appInitiatedPasscodeSetNotification2 = this.appInitiatedPasscodeSetNotification_) == null || appInitiatedPasscodeSetNotification2 == AppInitiatedPasscodeSetNotification.getDefaultInstance()) {
                    this.appInitiatedPasscodeSetNotification_ = appInitiatedPasscodeSetNotification;
                } else {
                    getAppInitiatedPasscodeSetNotificationBuilder().mergeFrom(appInitiatedPasscodeSetNotification);
                }
                if (this.appInitiatedPasscodeSetNotification_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDevicePasscodeInvalidAttemptNotification(DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification) {
                DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification2;
                SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> singleFieldBuilderV3 = this.devicePasscodeInvalidAttemptNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(devicePasscodeInvalidAttemptNotification);
                } else if ((this.bitField0_ & 128) == 0 || (devicePasscodeInvalidAttemptNotification2 = this.devicePasscodeInvalidAttemptNotification_) == null || devicePasscodeInvalidAttemptNotification2 == DevicePasscodeInvalidAttemptNotification.getDefaultInstance()) {
                    this.devicePasscodeInvalidAttemptNotification_ = devicePasscodeInvalidAttemptNotification;
                } else {
                    getDevicePasscodeInvalidAttemptNotificationBuilder().mergeFrom(devicePasscodeInvalidAttemptNotification);
                }
                if (this.devicePasscodeInvalidAttemptNotification_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceUnlockedNotification(DeviceUnlockedNotification deviceUnlockedNotification) {
                DeviceUnlockedNotification deviceUnlockedNotification2;
                SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> singleFieldBuilderV3 = this.deviceUnlockedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceUnlockedNotification);
                } else if ((this.bitField0_ & 256) == 0 || (deviceUnlockedNotification2 = this.deviceUnlockedNotification_) == null || deviceUnlockedNotification2 == DeviceUnlockedNotification.getDefaultInstance()) {
                    this.deviceUnlockedNotification_ = deviceUnlockedNotification;
                } else {
                    getDeviceUnlockedNotificationBuilder().mergeFrom(deviceUnlockedNotification);
                }
                if (this.deviceUnlockedNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    codedInputStream.readMessage(getRemoteDeviceBatteryStatusChangedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getRemoteDeviceBatteryStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getRemoteDeviceBatteryStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getActivityStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getActivityStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getInitialSetupStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getInitialSetupStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getDevicePasscodeInvalidAttemptNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getDeviceUnlockedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getSetDevicePasscodeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getSetDevicePasscodeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getAppInitiatedPasscodeSetNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getResetPasscodeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getResetPasscodeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getRegionRequiresPasscodeNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            public Builder mergeInitialSetupStatusRequest(GetInitialSetupStatusRequest getInitialSetupStatusRequest) {
                GetInitialSetupStatusRequest getInitialSetupStatusRequest2;
                SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getInitialSetupStatusRequest);
                } else if ((this.bitField0_ & 32) == 0 || (getInitialSetupStatusRequest2 = this.initialSetupStatusRequest_) == null || getInitialSetupStatusRequest2 == GetInitialSetupStatusRequest.getDefaultInstance()) {
                    this.initialSetupStatusRequest_ = getInitialSetupStatusRequest;
                } else {
                    getInitialSetupStatusRequestBuilder().mergeFrom(getInitialSetupStatusRequest);
                }
                if (this.initialSetupStatusRequest_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeInitialSetupStatusResponse(GetInitialSetupStatusResponse getInitialSetupStatusResponse) {
                GetInitialSetupStatusResponse getInitialSetupStatusResponse2;
                SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getInitialSetupStatusResponse);
                } else if ((this.bitField0_ & 64) == 0 || (getInitialSetupStatusResponse2 = this.initialSetupStatusResponse_) == null || getInitialSetupStatusResponse2 == GetInitialSetupStatusResponse.getDefaultInstance()) {
                    this.initialSetupStatusResponse_ = getInitialSetupStatusResponse;
                } else {
                    getInitialSetupStatusResponseBuilder().mergeFrom(getInitialSetupStatusResponse);
                }
                if (this.initialSetupStatusResponse_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRegionRequiresPasscodeNotification(RegionRequiresPasscodeNotification regionRequiresPasscodeNotification) {
                RegionRequiresPasscodeNotification regionRequiresPasscodeNotification2;
                SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> singleFieldBuilderV3 = this.regionRequiresPasscodeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(regionRequiresPasscodeNotification);
                } else if ((this.bitField0_ & 16384) == 0 || (regionRequiresPasscodeNotification2 = this.regionRequiresPasscodeNotification_) == null || regionRequiresPasscodeNotification2 == RegionRequiresPasscodeNotification.getDefaultInstance()) {
                    this.regionRequiresPasscodeNotification_ = regionRequiresPasscodeNotification;
                } else {
                    getRegionRequiresPasscodeNotificationBuilder().mergeFrom(regionRequiresPasscodeNotification);
                }
                if (this.regionRequiresPasscodeNotification_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRemoteDeviceBatteryStatusChangedNotification(RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification) {
                RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification2;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(remoteDeviceBatteryStatusChangedNotification);
                } else if ((this.bitField0_ & 1) == 0 || (remoteDeviceBatteryStatusChangedNotification2 = this.remoteDeviceBatteryStatusChangedNotification_) == null || remoteDeviceBatteryStatusChangedNotification2 == RemoteDeviceBatteryStatusChangedNotification.getDefaultInstance()) {
                    this.remoteDeviceBatteryStatusChangedNotification_ = remoteDeviceBatteryStatusChangedNotification;
                } else {
                    getRemoteDeviceBatteryStatusChangedNotificationBuilder().mergeFrom(remoteDeviceBatteryStatusChangedNotification);
                }
                if (this.remoteDeviceBatteryStatusChangedNotification_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRemoteDeviceBatteryStatusRequest(RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest) {
                RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest2;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(remoteDeviceBatteryStatusRequest);
                } else if ((this.bitField0_ & 2) == 0 || (remoteDeviceBatteryStatusRequest2 = this.remoteDeviceBatteryStatusRequest_) == null || remoteDeviceBatteryStatusRequest2 == RemoteDeviceBatteryStatusRequest.getDefaultInstance()) {
                    this.remoteDeviceBatteryStatusRequest_ = remoteDeviceBatteryStatusRequest;
                } else {
                    getRemoteDeviceBatteryStatusRequestBuilder().mergeFrom(remoteDeviceBatteryStatusRequest);
                }
                if (this.remoteDeviceBatteryStatusRequest_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRemoteDeviceBatteryStatusResponse(RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse) {
                RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse2;
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(remoteDeviceBatteryStatusResponse);
                } else if ((this.bitField0_ & 4) == 0 || (remoteDeviceBatteryStatusResponse2 = this.remoteDeviceBatteryStatusResponse_) == null || remoteDeviceBatteryStatusResponse2 == RemoteDeviceBatteryStatusResponse.getDefaultInstance()) {
                    this.remoteDeviceBatteryStatusResponse_ = remoteDeviceBatteryStatusResponse;
                } else {
                    getRemoteDeviceBatteryStatusResponseBuilder().mergeFrom(remoteDeviceBatteryStatusResponse);
                }
                if (this.remoteDeviceBatteryStatusResponse_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeResetPasscodeRequest(ResetPasscodeRequest resetPasscodeRequest) {
                ResetPasscodeRequest resetPasscodeRequest2;
                SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> singleFieldBuilderV3 = this.resetPasscodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(resetPasscodeRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (resetPasscodeRequest2 = this.resetPasscodeRequest_) == null || resetPasscodeRequest2 == ResetPasscodeRequest.getDefaultInstance()) {
                    this.resetPasscodeRequest_ = resetPasscodeRequest;
                } else {
                    getResetPasscodeRequestBuilder().mergeFrom(resetPasscodeRequest);
                }
                if (this.resetPasscodeRequest_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeResetPasscodeResponse(ResetPasscodeResponse resetPasscodeResponse) {
                ResetPasscodeResponse resetPasscodeResponse2;
                SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> singleFieldBuilderV3 = this.resetPasscodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(resetPasscodeResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (resetPasscodeResponse2 = this.resetPasscodeResponse_) == null || resetPasscodeResponse2 == ResetPasscodeResponse.getDefaultInstance()) {
                    this.resetPasscodeResponse_ = resetPasscodeResponse;
                } else {
                    getResetPasscodeResponseBuilder().mergeFrom(resetPasscodeResponse);
                }
                if (this.resetPasscodeResponse_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetDevicePasscodeRequest(SetDevicePasscodeRequest setDevicePasscodeRequest) {
                SetDevicePasscodeRequest setDevicePasscodeRequest2;
                SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setDevicePasscodeRequest);
                } else if ((this.bitField0_ & 512) == 0 || (setDevicePasscodeRequest2 = this.setDevicePasscodeRequest_) == null || setDevicePasscodeRequest2 == SetDevicePasscodeRequest.getDefaultInstance()) {
                    this.setDevicePasscodeRequest_ = setDevicePasscodeRequest;
                } else {
                    getSetDevicePasscodeRequestBuilder().mergeFrom(setDevicePasscodeRequest);
                }
                if (this.setDevicePasscodeRequest_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetDevicePasscodeResponse(SetDevicePasscodeResponse setDevicePasscodeResponse) {
                SetDevicePasscodeResponse setDevicePasscodeResponse2;
                SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setDevicePasscodeResponse);
                } else if ((this.bitField0_ & 1024) == 0 || (setDevicePasscodeResponse2 = this.setDevicePasscodeResponse_) == null || setDevicePasscodeResponse2 == SetDevicePasscodeResponse.getDefaultInstance()) {
                    this.setDevicePasscodeResponse_ = setDevicePasscodeResponse;
                } else {
                    getSetDevicePasscodeResponseBuilder().mergeFrom(setDevicePasscodeResponse);
                }
                if (this.setDevicePasscodeResponse_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setActivityStatusRequest(GetCurrentActivityStatusRequest.Builder builder) {
                SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> singleFieldBuilderV3 = this.activityStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.activityStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setActivityStatusResponse(GetCurrentActivityStatusResponse.Builder builder) {
                SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> singleFieldBuilderV3 = this.activityStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.activityStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAppInitiatedPasscodeSetNotification(AppInitiatedPasscodeSetNotification.Builder builder) {
                SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> singleFieldBuilderV3 = this.appInitiatedPasscodeSetNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.appInitiatedPasscodeSetNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setDevicePasscodeInvalidAttemptNotification(DevicePasscodeInvalidAttemptNotification.Builder builder) {
                SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> singleFieldBuilderV3 = this.devicePasscodeInvalidAttemptNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.devicePasscodeInvalidAttemptNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setDeviceUnlockedNotification(DeviceUnlockedNotification.Builder builder) {
                SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> singleFieldBuilderV3 = this.deviceUnlockedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceUnlockedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInitialSetupStatusRequest(GetInitialSetupStatusRequest.Builder builder) {
                SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initialSetupStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setInitialSetupStatusResponse(GetInitialSetupStatusResponse.Builder builder) {
                SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initialSetupStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRegionRequiresPasscodeNotification(RegionRequiresPasscodeNotification.Builder builder) {
                SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> singleFieldBuilderV3 = this.regionRequiresPasscodeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.regionRequiresPasscodeNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceBatteryStatusChangedNotification(RemoteDeviceBatteryStatusChangedNotification.Builder builder) {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.remoteDeviceBatteryStatusChangedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceBatteryStatusRequest(RemoteDeviceBatteryStatusRequest.Builder builder) {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.remoteDeviceBatteryStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceBatteryStatusResponse(RemoteDeviceBatteryStatusResponse.Builder builder) {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.remoteDeviceBatteryStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResetPasscodeRequest(ResetPasscodeRequest.Builder builder) {
                SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> singleFieldBuilderV3 = this.resetPasscodeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetPasscodeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setResetPasscodeResponse(ResetPasscodeResponse.Builder builder) {
                SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> singleFieldBuilderV3 = this.resetPasscodeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetPasscodeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setSetDevicePasscodeRequest(SetDevicePasscodeRequest.Builder builder) {
                SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setDevicePasscodeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSetDevicePasscodeResponse(SetDevicePasscodeResponse.Builder builder) {
                SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setDevicePasscodeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeviceStatusService getDefaultInstanceForType() {
                return DeviceStatusService.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public Builder setActivityStatusRequest(GetCurrentActivityStatusRequest getCurrentActivityStatusRequest) {
                SingleFieldBuilderV3<GetCurrentActivityStatusRequest, GetCurrentActivityStatusRequest.Builder, GetCurrentActivityStatusRequestOrBuilder> singleFieldBuilderV3 = this.activityStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getCurrentActivityStatusRequest.getClass();
                    this.activityStatusRequest_ = getCurrentActivityStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getCurrentActivityStatusRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setActivityStatusResponse(GetCurrentActivityStatusResponse getCurrentActivityStatusResponse) {
                SingleFieldBuilderV3<GetCurrentActivityStatusResponse, GetCurrentActivityStatusResponse.Builder, GetCurrentActivityStatusResponseOrBuilder> singleFieldBuilderV3 = this.activityStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getCurrentActivityStatusResponse.getClass();
                    this.activityStatusResponse_ = getCurrentActivityStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getCurrentActivityStatusResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAppInitiatedPasscodeSetNotification(AppInitiatedPasscodeSetNotification appInitiatedPasscodeSetNotification) {
                SingleFieldBuilderV3<AppInitiatedPasscodeSetNotification, AppInitiatedPasscodeSetNotification.Builder, AppInitiatedPasscodeSetNotificationOrBuilder> singleFieldBuilderV3 = this.appInitiatedPasscodeSetNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    appInitiatedPasscodeSetNotification.getClass();
                    this.appInitiatedPasscodeSetNotification_ = appInitiatedPasscodeSetNotification;
                } else {
                    singleFieldBuilderV3.setMessage(appInitiatedPasscodeSetNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setDevicePasscodeInvalidAttemptNotification(DevicePasscodeInvalidAttemptNotification devicePasscodeInvalidAttemptNotification) {
                SingleFieldBuilderV3<DevicePasscodeInvalidAttemptNotification, DevicePasscodeInvalidAttemptNotification.Builder, DevicePasscodeInvalidAttemptNotificationOrBuilder> singleFieldBuilderV3 = this.devicePasscodeInvalidAttemptNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    devicePasscodeInvalidAttemptNotification.getClass();
                    this.devicePasscodeInvalidAttemptNotification_ = devicePasscodeInvalidAttemptNotification;
                } else {
                    singleFieldBuilderV3.setMessage(devicePasscodeInvalidAttemptNotification);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setDeviceUnlockedNotification(DeviceUnlockedNotification deviceUnlockedNotification) {
                SingleFieldBuilderV3<DeviceUnlockedNotification, DeviceUnlockedNotification.Builder, DeviceUnlockedNotificationOrBuilder> singleFieldBuilderV3 = this.deviceUnlockedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceUnlockedNotification.getClass();
                    this.deviceUnlockedNotification_ = deviceUnlockedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(deviceUnlockedNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setInitialSetupStatusRequest(GetInitialSetupStatusRequest getInitialSetupStatusRequest) {
                SingleFieldBuilderV3<GetInitialSetupStatusRequest, GetInitialSetupStatusRequest.Builder, GetInitialSetupStatusRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getInitialSetupStatusRequest.getClass();
                    this.initialSetupStatusRequest_ = getInitialSetupStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getInitialSetupStatusRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setInitialSetupStatusResponse(GetInitialSetupStatusResponse getInitialSetupStatusResponse) {
                SingleFieldBuilderV3<GetInitialSetupStatusResponse, GetInitialSetupStatusResponse.Builder, GetInitialSetupStatusResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getInitialSetupStatusResponse.getClass();
                    this.initialSetupStatusResponse_ = getInitialSetupStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getInitialSetupStatusResponse);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRegionRequiresPasscodeNotification(RegionRequiresPasscodeNotification regionRequiresPasscodeNotification) {
                SingleFieldBuilderV3<RegionRequiresPasscodeNotification, RegionRequiresPasscodeNotification.Builder, RegionRequiresPasscodeNotificationOrBuilder> singleFieldBuilderV3 = this.regionRequiresPasscodeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    regionRequiresPasscodeNotification.getClass();
                    this.regionRequiresPasscodeNotification_ = regionRequiresPasscodeNotification;
                } else {
                    singleFieldBuilderV3.setMessage(regionRequiresPasscodeNotification);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceBatteryStatusChangedNotification(RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification) {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusChangedNotification, RemoteDeviceBatteryStatusChangedNotification.Builder, RemoteDeviceBatteryStatusChangedNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    remoteDeviceBatteryStatusChangedNotification.getClass();
                    this.remoteDeviceBatteryStatusChangedNotification_ = remoteDeviceBatteryStatusChangedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(remoteDeviceBatteryStatusChangedNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceBatteryStatusRequest(RemoteDeviceBatteryStatusRequest remoteDeviceBatteryStatusRequest) {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusRequest, RemoteDeviceBatteryStatusRequest.Builder, RemoteDeviceBatteryStatusRequestOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    remoteDeviceBatteryStatusRequest.getClass();
                    this.remoteDeviceBatteryStatusRequest_ = remoteDeviceBatteryStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(remoteDeviceBatteryStatusRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceBatteryStatusResponse(RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse) {
                SingleFieldBuilderV3<RemoteDeviceBatteryStatusResponse, RemoteDeviceBatteryStatusResponse.Builder, RemoteDeviceBatteryStatusResponseOrBuilder> singleFieldBuilderV3 = this.remoteDeviceBatteryStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    remoteDeviceBatteryStatusResponse.getClass();
                    this.remoteDeviceBatteryStatusResponse_ = remoteDeviceBatteryStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(remoteDeviceBatteryStatusResponse);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setResetPasscodeRequest(ResetPasscodeRequest resetPasscodeRequest) {
                SingleFieldBuilderV3<ResetPasscodeRequest, ResetPasscodeRequest.Builder, ResetPasscodeRequestOrBuilder> singleFieldBuilderV3 = this.resetPasscodeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resetPasscodeRequest.getClass();
                    this.resetPasscodeRequest_ = resetPasscodeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(resetPasscodeRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setResetPasscodeResponse(ResetPasscodeResponse resetPasscodeResponse) {
                SingleFieldBuilderV3<ResetPasscodeResponse, ResetPasscodeResponse.Builder, ResetPasscodeResponseOrBuilder> singleFieldBuilderV3 = this.resetPasscodeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resetPasscodeResponse.getClass();
                    this.resetPasscodeResponse_ = resetPasscodeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(resetPasscodeResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setSetDevicePasscodeRequest(SetDevicePasscodeRequest setDevicePasscodeRequest) {
                SingleFieldBuilderV3<SetDevicePasscodeRequest, SetDevicePasscodeRequest.Builder, SetDevicePasscodeRequestOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setDevicePasscodeRequest.getClass();
                    this.setDevicePasscodeRequest_ = setDevicePasscodeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(setDevicePasscodeRequest);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSetDevicePasscodeResponse(SetDevicePasscodeResponse setDevicePasscodeResponse) {
                SingleFieldBuilderV3<SetDevicePasscodeResponse, SetDevicePasscodeResponse.Builder, SetDevicePasscodeResponseOrBuilder> singleFieldBuilderV3 = this.setDevicePasscodeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setDevicePasscodeResponse.getClass();
                    this.setDevicePasscodeResponse_ = setDevicePasscodeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(setDevicePasscodeResponse);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceStatusService) {
                    return mergeFrom((DeviceStatusService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceStatusService deviceStatusService) {
                if (deviceStatusService == DeviceStatusService.getDefaultInstance()) {
                    return this;
                }
                if (deviceStatusService.hasRemoteDeviceBatteryStatusChangedNotification()) {
                    mergeRemoteDeviceBatteryStatusChangedNotification(deviceStatusService.getRemoteDeviceBatteryStatusChangedNotification());
                }
                if (deviceStatusService.hasRemoteDeviceBatteryStatusRequest()) {
                    mergeRemoteDeviceBatteryStatusRequest(deviceStatusService.getRemoteDeviceBatteryStatusRequest());
                }
                if (deviceStatusService.hasRemoteDeviceBatteryStatusResponse()) {
                    mergeRemoteDeviceBatteryStatusResponse(deviceStatusService.getRemoteDeviceBatteryStatusResponse());
                }
                if (deviceStatusService.hasActivityStatusRequest()) {
                    mergeActivityStatusRequest(deviceStatusService.getActivityStatusRequest());
                }
                if (deviceStatusService.hasActivityStatusResponse()) {
                    mergeActivityStatusResponse(deviceStatusService.getActivityStatusResponse());
                }
                if (deviceStatusService.hasInitialSetupStatusRequest()) {
                    mergeInitialSetupStatusRequest(deviceStatusService.getInitialSetupStatusRequest());
                }
                if (deviceStatusService.hasInitialSetupStatusResponse()) {
                    mergeInitialSetupStatusResponse(deviceStatusService.getInitialSetupStatusResponse());
                }
                if (deviceStatusService.hasDevicePasscodeInvalidAttemptNotification()) {
                    mergeDevicePasscodeInvalidAttemptNotification(deviceStatusService.getDevicePasscodeInvalidAttemptNotification());
                }
                if (deviceStatusService.hasDeviceUnlockedNotification()) {
                    mergeDeviceUnlockedNotification(deviceStatusService.getDeviceUnlockedNotification());
                }
                if (deviceStatusService.hasSetDevicePasscodeRequest()) {
                    mergeSetDevicePasscodeRequest(deviceStatusService.getSetDevicePasscodeRequest());
                }
                if (deviceStatusService.hasSetDevicePasscodeResponse()) {
                    mergeSetDevicePasscodeResponse(deviceStatusService.getSetDevicePasscodeResponse());
                }
                if (deviceStatusService.hasAppInitiatedPasscodeSetNotification()) {
                    mergeAppInitiatedPasscodeSetNotification(deviceStatusService.getAppInitiatedPasscodeSetNotification());
                }
                if (deviceStatusService.hasResetPasscodeRequest()) {
                    mergeResetPasscodeRequest(deviceStatusService.getResetPasscodeRequest());
                }
                if (deviceStatusService.hasResetPasscodeResponse()) {
                    mergeResetPasscodeResponse(deviceStatusService.getResetPasscodeResponse());
                }
                if (deviceStatusService.hasRegionRequiresPasscodeNotification()) {
                    mergeRegionRequiresPasscodeNotification(deviceStatusService.getRegionRequiresPasscodeNotification());
                }
                mergeUnknownFields(deviceStatusService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceStatusService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceStatusService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceStatusService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatusService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatusService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceStatusService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceStatusService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceStatusService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceStatusService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceStatusService parseFrom(InputStream inputStream) {
            return (DeviceStatusService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceStatusService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatusService parseFrom(CodedInputStream codedInputStream) {
            return (DeviceStatusService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceStatusService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetCurrentActivityStatusResponse extends GeneratedMessageV3 implements GetCurrentActivityStatusResponseOrBuilder {
        public static final int ACTIVITY_STATUS_FIELD_NUMBER = 1;
        private static final GetCurrentActivityStatusResponse DEFAULT_INSTANCE = new GetCurrentActivityStatusResponse();

        @Deprecated
        public static final Parser<GetCurrentActivityStatusResponse> PARSER = new AbstractParser<GetCurrentActivityStatusResponse>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.GetCurrentActivityStatusResponse.1
            @Override // com.google.protobuf.Parser
            public GetCurrentActivityStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetCurrentActivityStatusResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int activityStatus_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private GetCurrentActivityStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.activityStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetCurrentActivityStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_descriptor;
        }

        public static Builder newBuilder(GetCurrentActivityStatusResponse getCurrentActivityStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getCurrentActivityStatusResponse);
        }

        public static GetCurrentActivityStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetCurrentActivityStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetCurrentActivityStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetCurrentActivityStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetCurrentActivityStatusResponse)) {
                return super.equals(obj);
            }
            GetCurrentActivityStatusResponse getCurrentActivityStatusResponse = (GetCurrentActivityStatusResponse) obj;
            if (hasActivityStatus() != getCurrentActivityStatusResponse.hasActivityStatus()) {
                return false;
            }
            return (!hasActivityStatus() || this.activityStatus_ == getCurrentActivityStatusResponse.activityStatus_) && getUnknownFields().equals(getCurrentActivityStatusResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.GetCurrentActivityStatusResponseOrBuilder
        public ActivityStatus getActivityStatus() {
            ActivityStatus activityStatusForNumber = ActivityStatus.forNumber(this.activityStatus_);
            return activityStatusForNumber == null ? ActivityStatus.OFF : activityStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetCurrentActivityStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.activityStatus_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.GetCurrentActivityStatusResponseOrBuilder
        public boolean hasActivityStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasActivityStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.activityStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetCurrentActivityStatusResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GetCurrentActivityStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.activityStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetCurrentActivityStatusResponseOrBuilder {
            private int activityStatus_;
            private int bitField0_;

            private Builder() {
                this.activityStatus_ = 0;
            }

            private void buildPartial0(GetCurrentActivityStatusResponse getCurrentActivityStatusResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    getCurrentActivityStatusResponse.activityStatus_ = this.activityStatus_;
                } else {
                    i14 = 0;
                }
                getCurrentActivityStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetCurrentActivityStatusResponse build() {
                GetCurrentActivityStatusResponse getCurrentActivityStatusResponseBuildPartial = buildPartial();
                if (getCurrentActivityStatusResponseBuildPartial.isInitialized()) {
                    return getCurrentActivityStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getCurrentActivityStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetCurrentActivityStatusResponse buildPartial() {
                GetCurrentActivityStatusResponse getCurrentActivityStatusResponse = new GetCurrentActivityStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getCurrentActivityStatusResponse);
                }
                onBuilt();
                return getCurrentActivityStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.activityStatus_ = 0;
                return this;
            }

            public Builder clearActivityStatus() {
                this.bitField0_ &= -2;
                this.activityStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.GetCurrentActivityStatusResponseOrBuilder
            public ActivityStatus getActivityStatus() {
                ActivityStatus activityStatusForNumber = ActivityStatus.forNumber(this.activityStatus_);
                return activityStatusForNumber == null ? ActivityStatus.OFF : activityStatusForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.GetCurrentActivityStatusResponseOrBuilder
            public boolean hasActivityStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetCurrentActivityStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetCurrentActivityStatusResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ActivityStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.activityStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setActivityStatus(ActivityStatus activityStatus) {
                activityStatus.getClass();
                this.bitField0_ |= 1;
                this.activityStatus_ = activityStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetCurrentActivityStatusResponse getDefaultInstanceForType() {
                return GetCurrentActivityStatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.activityStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetCurrentActivityStatusResponse) {
                    return mergeFrom((GetCurrentActivityStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetCurrentActivityStatusResponse getCurrentActivityStatusResponse) {
                if (getCurrentActivityStatusResponse == GetCurrentActivityStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (getCurrentActivityStatusResponse.hasActivityStatus()) {
                    setActivityStatus(getCurrentActivityStatusResponse.getActivityStatus());
                }
                mergeUnknownFields(getCurrentActivityStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetCurrentActivityStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetCurrentActivityStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetCurrentActivityStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetCurrentActivityStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GetCurrentActivityStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetCurrentActivityStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GetCurrentActivityStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.activityStatus_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetCurrentActivityStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetCurrentActivityStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetCurrentActivityStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetCurrentActivityStatusResponse parseFrom(InputStream inputStream) {
            return (GetCurrentActivityStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetCurrentActivityStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetCurrentActivityStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetCurrentActivityStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetCurrentActivityStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetCurrentActivityStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetCurrentActivityStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ActivityStatus implements ProtocolMessageEnum {
            OFF(0),
            STOPPED(1),
            PAUSED(2),
            ON(3);

            public static final int OFF_VALUE = 0;
            public static final int ON_VALUE = 3;
            public static final int PAUSED_VALUE = 2;
            public static final int STOPPED_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ActivityStatus> internalValueMap = new Internal.EnumLiteMap<ActivityStatus>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.GetCurrentActivityStatusResponse.ActivityStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ActivityStatus findValueByNumber(int i14) {
                    return ActivityStatus.forNumber(i14);
                }
            };
            private static final ActivityStatus[] VALUES = values();

            ActivityStatus(int i14) {
                this.value = i14;
            }

            public static ActivityStatus forNumber(int i14) {
                if (i14 == 0) {
                    return OFF;
                }
                if (i14 == 1) {
                    return STOPPED;
                }
                if (i14 == 2) {
                    return PAUSED;
                }
                if (i14 != 3) {
                    return null;
                }
                return ON;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetCurrentActivityStatusResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ActivityStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ActivityStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static ActivityStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class GetInitialSetupStatusResponse extends GeneratedMessageV3 implements GetInitialSetupStatusResponseOrBuilder {
        public static final int INITIAL_SETUP_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int initialSetupStatus_;
        private byte memoizedIsInitialized;
        private static final GetInitialSetupStatusResponse DEFAULT_INSTANCE = new GetInitialSetupStatusResponse();

        @Deprecated
        public static final Parser<GetInitialSetupStatusResponse> PARSER = new AbstractParser<GetInitialSetupStatusResponse>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.GetInitialSetupStatusResponse.1
            @Override // com.google.protobuf.Parser
            public GetInitialSetupStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetInitialSetupStatusResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private GetInitialSetupStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.initialSetupStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetInitialSetupStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_descriptor;
        }

        public static Builder newBuilder(GetInitialSetupStatusResponse getInitialSetupStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getInitialSetupStatusResponse);
        }

        public static GetInitialSetupStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetInitialSetupStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetInitialSetupStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetInitialSetupStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetInitialSetupStatusResponse)) {
                return super.equals(obj);
            }
            GetInitialSetupStatusResponse getInitialSetupStatusResponse = (GetInitialSetupStatusResponse) obj;
            if (hasInitialSetupStatus() != getInitialSetupStatusResponse.hasInitialSetupStatus()) {
                return false;
            }
            return (!hasInitialSetupStatus() || this.initialSetupStatus_ == getInitialSetupStatusResponse.initialSetupStatus_) && getUnknownFields().equals(getInitialSetupStatusResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.GetInitialSetupStatusResponseOrBuilder
        public InitialSetupStatus getInitialSetupStatus() {
            InitialSetupStatus initialSetupStatusForNumber = InitialSetupStatus.forNumber(this.initialSetupStatus_);
            return initialSetupStatusForNumber == null ? InitialSetupStatus.IN_INITIAL_SETUP : initialSetupStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetInitialSetupStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.initialSetupStatus_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.GetInitialSetupStatusResponseOrBuilder
        public boolean hasInitialSetupStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInitialSetupStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.initialSetupStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInitialSetupStatusResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GetInitialSetupStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.initialSetupStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInitialSetupStatusResponseOrBuilder {
            private int bitField0_;
            private int initialSetupStatus_;

            private Builder() {
                this.initialSetupStatus_ = 0;
            }

            private void buildPartial0(GetInitialSetupStatusResponse getInitialSetupStatusResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    getInitialSetupStatusResponse.initialSetupStatus_ = this.initialSetupStatus_;
                } else {
                    i14 = 0;
                }
                getInitialSetupStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetInitialSetupStatusResponse build() {
                GetInitialSetupStatusResponse getInitialSetupStatusResponseBuildPartial = buildPartial();
                if (getInitialSetupStatusResponseBuildPartial.isInitialized()) {
                    return getInitialSetupStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getInitialSetupStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetInitialSetupStatusResponse buildPartial() {
                GetInitialSetupStatusResponse getInitialSetupStatusResponse = new GetInitialSetupStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getInitialSetupStatusResponse);
                }
                onBuilt();
                return getInitialSetupStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.initialSetupStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInitialSetupStatus() {
                this.bitField0_ &= -2;
                this.initialSetupStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.GetInitialSetupStatusResponseOrBuilder
            public InitialSetupStatus getInitialSetupStatus() {
                InitialSetupStatus initialSetupStatusForNumber = InitialSetupStatus.forNumber(this.initialSetupStatus_);
                return initialSetupStatusForNumber == null ? InitialSetupStatus.IN_INITIAL_SETUP : initialSetupStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.GetInitialSetupStatusResponseOrBuilder
            public boolean hasInitialSetupStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_GetInitialSetupStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInitialSetupStatusResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (InitialSetupStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.initialSetupStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInitialSetupStatus(InitialSetupStatus initialSetupStatus) {
                initialSetupStatus.getClass();
                this.bitField0_ |= 1;
                this.initialSetupStatus_ = initialSetupStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetInitialSetupStatusResponse getDefaultInstanceForType() {
                return GetInitialSetupStatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.initialSetupStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetInitialSetupStatusResponse) {
                    return mergeFrom((GetInitialSetupStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetInitialSetupStatusResponse getInitialSetupStatusResponse) {
                if (getInitialSetupStatusResponse == GetInitialSetupStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (getInitialSetupStatusResponse.hasInitialSetupStatus()) {
                    setInitialSetupStatus(getInitialSetupStatusResponse.getInitialSetupStatus());
                }
                mergeUnknownFields(getInitialSetupStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetInitialSetupStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetInitialSetupStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInitialSetupStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetInitialSetupStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GetInitialSetupStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetInitialSetupStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GetInitialSetupStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.initialSetupStatus_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetInitialSetupStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetInitialSetupStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetInitialSetupStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetInitialSetupStatusResponse parseFrom(InputStream inputStream) {
            return (GetInitialSetupStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetInitialSetupStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInitialSetupStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetInitialSetupStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetInitialSetupStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetInitialSetupStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInitialSetupStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum InitialSetupStatus implements ProtocolMessageEnum {
            IN_INITIAL_SETUP(0),
            SETUP_COMPLETE(1),
            IN_SETUP_APPLYING_BACKUP(2);

            public static final int IN_INITIAL_SETUP_VALUE = 0;
            public static final int IN_SETUP_APPLYING_BACKUP_VALUE = 2;
            public static final int SETUP_COMPLETE_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<InitialSetupStatus> internalValueMap = new Internal.EnumLiteMap<InitialSetupStatus>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.GetInitialSetupStatusResponse.InitialSetupStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public InitialSetupStatus findValueByNumber(int i14) {
                    return InitialSetupStatus.forNumber(i14);
                }
            };
            private static final InitialSetupStatus[] VALUES = values();

            InitialSetupStatus(int i14) {
                this.value = i14;
            }

            public static InitialSetupStatus forNumber(int i14) {
                if (i14 == 0) {
                    return IN_INITIAL_SETUP;
                }
                if (i14 == 1) {
                    return SETUP_COMPLETE;
                }
                if (i14 != 2) {
                    return null;
                }
                return IN_SETUP_APPLYING_BACKUP;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetInitialSetupStatusResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<InitialSetupStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static InitialSetupStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static InitialSetupStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class RemoteDeviceBatteryStatusChangedNotification extends GeneratedMessageV3 implements RemoteDeviceBatteryStatusChangedNotificationOrBuilder {
        private static final RemoteDeviceBatteryStatusChangedNotification DEFAULT_INSTANCE = new RemoteDeviceBatteryStatusChangedNotification();

        @Deprecated
        public static final Parser<RemoteDeviceBatteryStatusChangedNotification> PARSER = new AbstractParser<RemoteDeviceBatteryStatusChangedNotification>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotification.1
            @Override // com.google.protobuf.Parser
            public RemoteDeviceBatteryStatusChangedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemoteDeviceBatteryStatusChangedNotification.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private RemoteDeviceBatteryStatusChangedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemoteDeviceBatteryStatusChangedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_descriptor;
        }

        public static Builder newBuilder(RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(remoteDeviceBatteryStatusChangedNotification);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseDelimitedFrom(InputStream inputStream) {
            return (RemoteDeviceBatteryStatusChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RemoteDeviceBatteryStatusChangedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemoteDeviceBatteryStatusChangedNotification)) {
                return super.equals(obj);
            }
            RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification = (RemoteDeviceBatteryStatusChangedNotification) obj;
            if (hasStatus() != remoteDeviceBatteryStatusChangedNotification.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == remoteDeviceBatteryStatusChangedNotification.status_) && getUnknownFields().equals(remoteDeviceBatteryStatusChangedNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RemoteDeviceBatteryStatusChangedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotificationOrBuilder
        public RemoteDeviceBatteryStatusBatteryStatus getStatus() {
            RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatusForNumber = RemoteDeviceBatteryStatusBatteryStatus.forNumber(this.status_);
            return remoteDeviceBatteryStatusBatteryStatusForNumber == null ? RemoteDeviceBatteryStatusBatteryStatus.UNKNOWN_STATUS : remoteDeviceBatteryStatusBatteryStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotificationOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoteDeviceBatteryStatusChangedNotification.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RemoteDeviceBatteryStatusChangedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RemoteDeviceBatteryStatusChangedNotificationOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    remoteDeviceBatteryStatusChangedNotification.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                remoteDeviceBatteryStatusChangedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoteDeviceBatteryStatusChangedNotification build() {
                RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotificationBuildPartial = buildPartial();
                if (remoteDeviceBatteryStatusChangedNotificationBuildPartial.isInitialized()) {
                    return remoteDeviceBatteryStatusChangedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) remoteDeviceBatteryStatusChangedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoteDeviceBatteryStatusChangedNotification buildPartial() {
                RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification = new RemoteDeviceBatteryStatusChangedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(remoteDeviceBatteryStatusChangedNotification);
                }
                onBuilt();
                return remoteDeviceBatteryStatusChangedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotificationOrBuilder
            public RemoteDeviceBatteryStatusBatteryStatus getStatus() {
                RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatusForNumber = RemoteDeviceBatteryStatusBatteryStatus.forNumber(this.status_);
                return remoteDeviceBatteryStatusBatteryStatusForNumber == null ? RemoteDeviceBatteryStatusBatteryStatus.UNKNOWN_STATUS : remoteDeviceBatteryStatusBatteryStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusChangedNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoteDeviceBatteryStatusChangedNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (RemoteDeviceBatteryStatusBatteryStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus) {
                remoteDeviceBatteryStatusBatteryStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = remoteDeviceBatteryStatusBatteryStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RemoteDeviceBatteryStatusChangedNotification getDefaultInstanceForType() {
                return RemoteDeviceBatteryStatusChangedNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RemoteDeviceBatteryStatusChangedNotification) {
                    return mergeFrom((RemoteDeviceBatteryStatusChangedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RemoteDeviceBatteryStatusChangedNotification remoteDeviceBatteryStatusChangedNotification) {
                if (remoteDeviceBatteryStatusChangedNotification == RemoteDeviceBatteryStatusChangedNotification.getDefaultInstance()) {
                    return this;
                }
                if (remoteDeviceBatteryStatusChangedNotification.hasStatus()) {
                    setStatus(remoteDeviceBatteryStatusChangedNotification.getStatus());
                }
                mergeUnknownFields(remoteDeviceBatteryStatusChangedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RemoteDeviceBatteryStatusChangedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ RemoteDeviceBatteryStatusChangedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private RemoteDeviceBatteryStatusChangedNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(InputStream inputStream) {
            return (RemoteDeviceBatteryStatusChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(CodedInputStream codedInputStream) {
            return (RemoteDeviceBatteryStatusChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RemoteDeviceBatteryStatusChangedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RemoteDeviceBatteryStatusResponse extends GeneratedMessageV3 implements RemoteDeviceBatteryStatusResponseOrBuilder {
        public static final int BATTERY_STATUS_FIELD_NUMBER = 3;
        public static final int CURRENT_BATTERY_LEVEL_FIELD_NUMBER = 2;
        public static final int ESTIMATED_HOURS_REMAINING_FIELD_NUMBER = 4;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int batteryStatus_;
        private int bitField0_;
        private int currentBatteryLevel_;
        private int estimatedHoursRemaining_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final RemoteDeviceBatteryStatusResponse DEFAULT_INSTANCE = new RemoteDeviceBatteryStatusResponse();

        @Deprecated
        public static final Parser<RemoteDeviceBatteryStatusResponse> PARSER = new AbstractParser<RemoteDeviceBatteryStatusResponse>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.1
            @Override // com.google.protobuf.Parser
            public RemoteDeviceBatteryStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemoteDeviceBatteryStatusResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private RemoteDeviceBatteryStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.currentBatteryLevel_ = 0;
            this.batteryStatus_ = 0;
            this.estimatedHoursRemaining_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemoteDeviceBatteryStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_descriptor;
        }

        public static Builder newBuilder(RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(remoteDeviceBatteryStatusResponse);
        }

        public static RemoteDeviceBatteryStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (RemoteDeviceBatteryStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RemoteDeviceBatteryStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemoteDeviceBatteryStatusResponse)) {
                return super.equals(obj);
            }
            RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse = (RemoteDeviceBatteryStatusResponse) obj;
            if (hasStatus() != remoteDeviceBatteryStatusResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != remoteDeviceBatteryStatusResponse.status_) || hasCurrentBatteryLevel() != remoteDeviceBatteryStatusResponse.hasCurrentBatteryLevel()) {
                return false;
            }
            if ((hasCurrentBatteryLevel() && getCurrentBatteryLevel() != remoteDeviceBatteryStatusResponse.getCurrentBatteryLevel()) || hasBatteryStatus() != remoteDeviceBatteryStatusResponse.hasBatteryStatus()) {
                return false;
            }
            if ((!hasBatteryStatus() || this.batteryStatus_ == remoteDeviceBatteryStatusResponse.batteryStatus_) && hasEstimatedHoursRemaining() == remoteDeviceBatteryStatusResponse.hasEstimatedHoursRemaining()) {
                return (!hasEstimatedHoursRemaining() || getEstimatedHoursRemaining() == remoteDeviceBatteryStatusResponse.getEstimatedHoursRemaining()) && getUnknownFields().equals(remoteDeviceBatteryStatusResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
        public RemoteDeviceBatteryStatusBatteryStatus getBatteryStatus() {
            RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatusForNumber = RemoteDeviceBatteryStatusBatteryStatus.forNumber(this.batteryStatus_);
            return remoteDeviceBatteryStatusBatteryStatusForNumber == null ? RemoteDeviceBatteryStatusBatteryStatus.UNKNOWN_STATUS : remoteDeviceBatteryStatusBatteryStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
        public int getCurrentBatteryLevel() {
            return this.currentBatteryLevel_;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
        public int getEstimatedHoursRemaining() {
            return this.estimatedHoursRemaining_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RemoteDeviceBatteryStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.currentBatteryLevel_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.batteryStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.estimatedHoursRemaining_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
        public boolean hasBatteryStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
        public boolean hasCurrentBatteryLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
        public boolean hasEstimatedHoursRemaining() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            if (hasCurrentBatteryLevel()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCurrentBatteryLevel();
            }
            if (hasBatteryStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.batteryStatus_;
            }
            if (hasEstimatedHoursRemaining()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEstimatedHoursRemaining();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoteDeviceBatteryStatusResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (hasStatus()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new RemoteDeviceBatteryStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.currentBatteryLevel_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.batteryStatus_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.estimatedHoursRemaining_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RemoteDeviceBatteryStatusResponseOrBuilder {
            private int batteryStatus_;
            private int bitField0_;
            private int currentBatteryLevel_;
            private int estimatedHoursRemaining_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.batteryStatus_ = 0;
            }

            private void buildPartial0(RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    remoteDeviceBatteryStatusResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    remoteDeviceBatteryStatusResponse.currentBatteryLevel_ = this.currentBatteryLevel_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    remoteDeviceBatteryStatusResponse.batteryStatus_ = this.batteryStatus_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    remoteDeviceBatteryStatusResponse.estimatedHoursRemaining_ = this.estimatedHoursRemaining_;
                    i14 |= 8;
                }
                remoteDeviceBatteryStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoteDeviceBatteryStatusResponse build() {
                RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponseBuildPartial = buildPartial();
                if (remoteDeviceBatteryStatusResponseBuildPartial.isInitialized()) {
                    return remoteDeviceBatteryStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) remoteDeviceBatteryStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoteDeviceBatteryStatusResponse buildPartial() {
                RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse = new RemoteDeviceBatteryStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(remoteDeviceBatteryStatusResponse);
                }
                onBuilt();
                return remoteDeviceBatteryStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.currentBatteryLevel_ = 0;
                this.batteryStatus_ = 0;
                this.estimatedHoursRemaining_ = 0;
                return this;
            }

            public Builder clearBatteryStatus() {
                this.bitField0_ &= -5;
                this.batteryStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentBatteryLevel() {
                this.bitField0_ &= -3;
                this.currentBatteryLevel_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEstimatedHoursRemaining() {
                this.bitField0_ &= -9;
                this.estimatedHoursRemaining_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
            public RemoteDeviceBatteryStatusBatteryStatus getBatteryStatus() {
                RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatusForNumber = RemoteDeviceBatteryStatusBatteryStatus.forNumber(this.batteryStatus_);
                return remoteDeviceBatteryStatusBatteryStatusForNumber == null ? RemoteDeviceBatteryStatusBatteryStatus.UNKNOWN_STATUS : remoteDeviceBatteryStatusBatteryStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
            public int getCurrentBatteryLevel() {
                return this.currentBatteryLevel_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
            public int getEstimatedHoursRemaining() {
                return this.estimatedHoursRemaining_;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
            public boolean hasBatteryStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
            public boolean hasCurrentBatteryLevel() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
            public boolean hasEstimatedHoursRemaining() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_RemoteDeviceBatteryStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoteDeviceBatteryStatusResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.currentBatteryLevel_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (RemoteDeviceBatteryStatusBatteryStatus.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.batteryStatus_ = i15;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    this.estimatedHoursRemaining_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBatteryStatus(RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus) {
                remoteDeviceBatteryStatusBatteryStatus.getClass();
                this.bitField0_ |= 4;
                this.batteryStatus_ = remoteDeviceBatteryStatusBatteryStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setCurrentBatteryLevel(int i14) {
                this.currentBatteryLevel_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEstimatedHoursRemaining(int i14) {
                this.estimatedHoursRemaining_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RemoteDeviceBatteryStatusResponse getDefaultInstanceForType() {
                return RemoteDeviceBatteryStatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
                this.batteryStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RemoteDeviceBatteryStatusResponse) {
                    return mergeFrom((RemoteDeviceBatteryStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RemoteDeviceBatteryStatusResponse remoteDeviceBatteryStatusResponse) {
                if (remoteDeviceBatteryStatusResponse == RemoteDeviceBatteryStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (remoteDeviceBatteryStatusResponse.hasStatus()) {
                    setStatus(remoteDeviceBatteryStatusResponse.getStatus());
                }
                if (remoteDeviceBatteryStatusResponse.hasCurrentBatteryLevel()) {
                    setCurrentBatteryLevel(remoteDeviceBatteryStatusResponse.getCurrentBatteryLevel());
                }
                if (remoteDeviceBatteryStatusResponse.hasBatteryStatus()) {
                    setBatteryStatus(remoteDeviceBatteryStatusResponse.getBatteryStatus());
                }
                if (remoteDeviceBatteryStatusResponse.hasEstimatedHoursRemaining()) {
                    setEstimatedHoursRemaining(remoteDeviceBatteryStatusResponse.getEstimatedHoursRemaining());
                }
                mergeUnknownFields(remoteDeviceBatteryStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RemoteDeviceBatteryStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RemoteDeviceBatteryStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(InputStream inputStream) {
            return (RemoteDeviceBatteryStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ RemoteDeviceBatteryStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private RemoteDeviceBatteryStatusResponse() {
            this.currentBatteryLevel_ = 0;
            this.estimatedHoursRemaining_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.batteryStatus_ = 0;
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (RemoteDeviceBatteryStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RemoteDeviceBatteryStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteDeviceBatteryStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            NO_REMOTE_DEVICE(2);

            public static final int NO_REMOTE_DEVICE_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return NO_REMOTE_DEVICE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return RemoteDeviceBatteryStatusResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ResetPasscodeResponse extends GeneratedMessageV3 implements ResetPasscodeResponseOrBuilder {
        private static final ResetPasscodeResponse DEFAULT_INSTANCE = new ResetPasscodeResponse();

        @Deprecated
        public static final Parser<ResetPasscodeResponse> PARSER = new AbstractParser<ResetPasscodeResponse>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.ResetPasscodeResponse.1
            @Override // com.google.protobuf.Parser
            public ResetPasscodeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ResetPasscodeResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int RESPONSE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int responseStatus_;

        private ResetPasscodeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.responseStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetPasscodeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_descriptor;
        }

        public static Builder newBuilder(ResetPasscodeResponse resetPasscodeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resetPasscodeResponse);
        }

        public static ResetPasscodeResponse parseDelimitedFrom(InputStream inputStream) {
            return (ResetPasscodeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResetPasscodeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ResetPasscodeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResetPasscodeResponse)) {
                return super.equals(obj);
            }
            ResetPasscodeResponse resetPasscodeResponse = (ResetPasscodeResponse) obj;
            if (hasResponseStatus() != resetPasscodeResponse.hasResponseStatus()) {
                return false;
            }
            return (!hasResponseStatus() || this.responseStatus_ == resetPasscodeResponse.responseStatus_) && getUnknownFields().equals(resetPasscodeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResetPasscodeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.ResetPasscodeResponseOrBuilder
        public PasscodeResponseStatus getResponseStatus() {
            PasscodeResponseStatus passcodeResponseStatusForNumber = PasscodeResponseStatus.forNumber(this.responseStatus_);
            return passcodeResponseStatusForNumber == null ? PasscodeResponseStatus.PASSCODE_STATUS_ERROR : passcodeResponseStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.responseStatus_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.ResetPasscodeResponseOrBuilder
        public boolean hasResponseStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponseStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.responseStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetPasscodeResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ResetPasscodeResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.responseStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResetPasscodeResponseOrBuilder {
            private int bitField0_;
            private int responseStatus_;

            private Builder() {
                this.responseStatus_ = 0;
            }

            private void buildPartial0(ResetPasscodeResponse resetPasscodeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    resetPasscodeResponse.responseStatus_ = this.responseStatus_;
                } else {
                    i14 = 0;
                }
                resetPasscodeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetPasscodeResponse build() {
                ResetPasscodeResponse resetPasscodeResponseBuildPartial = buildPartial();
                if (resetPasscodeResponseBuildPartial.isInitialized()) {
                    return resetPasscodeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resetPasscodeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetPasscodeResponse buildPartial() {
                ResetPasscodeResponse resetPasscodeResponse = new ResetPasscodeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(resetPasscodeResponse);
                }
                onBuilt();
                return resetPasscodeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.responseStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResponseStatus() {
                this.bitField0_ &= -2;
                this.responseStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.ResetPasscodeResponseOrBuilder
            public PasscodeResponseStatus getResponseStatus() {
                PasscodeResponseStatus passcodeResponseStatusForNumber = PasscodeResponseStatus.forNumber(this.responseStatus_);
                return passcodeResponseStatusForNumber == null ? PasscodeResponseStatus.PASSCODE_STATUS_ERROR : passcodeResponseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.ResetPasscodeResponseOrBuilder
            public boolean hasResponseStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_ResetPasscodeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetPasscodeResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (PasscodeResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.responseStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResponseStatus(PasscodeResponseStatus passcodeResponseStatus) {
                passcodeResponseStatus.getClass();
                this.bitField0_ |= 1;
                this.responseStatus_ = passcodeResponseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ResetPasscodeResponse getDefaultInstanceForType() {
                return ResetPasscodeResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.responseStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ResetPasscodeResponse) {
                    return mergeFrom((ResetPasscodeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ResetPasscodeResponse resetPasscodeResponse) {
                if (resetPasscodeResponse == ResetPasscodeResponse.getDefaultInstance()) {
                    return this;
                }
                if (resetPasscodeResponse.hasResponseStatus()) {
                    setResponseStatus(resetPasscodeResponse.getResponseStatus());
                }
                mergeUnknownFields(resetPasscodeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResetPasscodeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ResetPasscodeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPasscodeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetPasscodeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ResetPasscodeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ResetPasscodeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ResetPasscodeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.responseStatus_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResetPasscodeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ResetPasscodeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ResetPasscodeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ResetPasscodeResponse parseFrom(InputStream inputStream) {
            return (ResetPasscodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ResetPasscodeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPasscodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetPasscodeResponse parseFrom(CodedInputStream codedInputStream) {
            return (ResetPasscodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResetPasscodeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPasscodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetDevicePasscodeRequest extends GeneratedMessageV3 implements SetDevicePasscodeRequestOrBuilder {
        private static final SetDevicePasscodeRequest DEFAULT_INSTANCE = new SetDevicePasscodeRequest();

        @Deprecated
        public static final Parser<SetDevicePasscodeRequest> PARSER = new AbstractParser<SetDevicePasscodeRequest>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeRequest.1
            @Override // com.google.protobuf.Parser
            public SetDevicePasscodeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetDevicePasscodeRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int PASSCODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object passcode_;

        private SetDevicePasscodeRequest() {
            this.passcode_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.passcode_ = "";
        }

        public static SetDevicePasscodeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_descriptor;
        }

        public static Builder newBuilder(SetDevicePasscodeRequest setDevicePasscodeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setDevicePasscodeRequest);
        }

        public static SetDevicePasscodeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SetDevicePasscodeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetDevicePasscodeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetDevicePasscodeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetDevicePasscodeRequest)) {
                return super.equals(obj);
            }
            SetDevicePasscodeRequest setDevicePasscodeRequest = (SetDevicePasscodeRequest) obj;
            if (hasPasscode() != setDevicePasscodeRequest.hasPasscode()) {
                return false;
            }
            return (!hasPasscode() || getPasscode().equals(setDevicePasscodeRequest.getPasscode())) && getUnknownFields().equals(setDevicePasscodeRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetDevicePasscodeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeRequestOrBuilder
        public String getPasscode() {
            Object obj = this.passcode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.passcode_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeRequestOrBuilder
        public ByteString getPasscodeBytes() {
            Object obj = this.passcode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.passcode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.passcode_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeRequestOrBuilder
        public boolean hasPasscode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPasscode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPasscode().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetDevicePasscodeRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (hasPasscode()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new SetDevicePasscodeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.passcode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetDevicePasscodeRequestOrBuilder {
            private int bitField0_;
            private Object passcode_;

            private Builder() {
                this.passcode_ = "";
            }

            private void buildPartial0(SetDevicePasscodeRequest setDevicePasscodeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setDevicePasscodeRequest.passcode_ = this.passcode_;
                } else {
                    i14 = 0;
                }
                setDevicePasscodeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetDevicePasscodeRequest build() {
                SetDevicePasscodeRequest setDevicePasscodeRequestBuildPartial = buildPartial();
                if (setDevicePasscodeRequestBuildPartial.isInitialized()) {
                    return setDevicePasscodeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setDevicePasscodeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetDevicePasscodeRequest buildPartial() {
                SetDevicePasscodeRequest setDevicePasscodeRequest = new SetDevicePasscodeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setDevicePasscodeRequest);
                }
                onBuilt();
                return setDevicePasscodeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.passcode_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPasscode() {
                this.passcode_ = SetDevicePasscodeRequest.getDefaultInstance().getPasscode();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeRequestOrBuilder
            public String getPasscode() {
                Object obj = this.passcode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.passcode_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeRequestOrBuilder
            public ByteString getPasscodeBytes() {
                Object obj = this.passcode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.passcode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeRequestOrBuilder
            public boolean hasPasscode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetDevicePasscodeRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPasscode();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.passcode_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPasscode(String str) {
                str.getClass();
                this.passcode_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPasscodeBytes(ByteString byteString) {
                byteString.getClass();
                this.passcode_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SetDevicePasscodeRequest getDefaultInstanceForType() {
                return SetDevicePasscodeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.passcode_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetDevicePasscodeRequest) {
                    return mergeFrom((SetDevicePasscodeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetDevicePasscodeRequest setDevicePasscodeRequest) {
                if (setDevicePasscodeRequest == SetDevicePasscodeRequest.getDefaultInstance()) {
                    return this;
                }
                if (setDevicePasscodeRequest.hasPasscode()) {
                    this.passcode_ = setDevicePasscodeRequest.passcode_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(setDevicePasscodeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetDevicePasscodeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetDevicePasscodeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetDevicePasscodeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetDevicePasscodeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetDevicePasscodeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetDevicePasscodeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetDevicePasscodeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private SetDevicePasscodeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.passcode_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetDevicePasscodeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetDevicePasscodeRequest parseFrom(InputStream inputStream) {
            return (SetDevicePasscodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ SetDevicePasscodeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SetDevicePasscodeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetDevicePasscodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetDevicePasscodeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SetDevicePasscodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetDevicePasscodeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetDevicePasscodeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetDevicePasscodeResponse extends GeneratedMessageV3 implements SetDevicePasscodeResponseOrBuilder {
        private static final SetDevicePasscodeResponse DEFAULT_INSTANCE = new SetDevicePasscodeResponse();

        @Deprecated
        public static final Parser<SetDevicePasscodeResponse> PARSER = new AbstractParser<SetDevicePasscodeResponse>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeResponse.1
            @Override // com.google.protobuf.Parser
            public SetDevicePasscodeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetDevicePasscodeResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int RESPONSE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int responseStatus_;

        private SetDevicePasscodeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.responseStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetDevicePasscodeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_descriptor;
        }

        public static Builder newBuilder(SetDevicePasscodeResponse setDevicePasscodeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setDevicePasscodeResponse);
        }

        public static SetDevicePasscodeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SetDevicePasscodeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetDevicePasscodeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetDevicePasscodeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetDevicePasscodeResponse)) {
                return super.equals(obj);
            }
            SetDevicePasscodeResponse setDevicePasscodeResponse = (SetDevicePasscodeResponse) obj;
            if (hasResponseStatus() != setDevicePasscodeResponse.hasResponseStatus()) {
                return false;
            }
            return (!hasResponseStatus() || this.responseStatus_ == setDevicePasscodeResponse.responseStatus_) && getUnknownFields().equals(setDevicePasscodeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetDevicePasscodeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeResponseOrBuilder
        public PasscodeResponseStatus getResponseStatus() {
            PasscodeResponseStatus passcodeResponseStatusForNumber = PasscodeResponseStatus.forNumber(this.responseStatus_);
            return passcodeResponseStatusForNumber == null ? PasscodeResponseStatus.PASSCODE_STATUS_ERROR : passcodeResponseStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.responseStatus_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeResponseOrBuilder
        public boolean hasResponseStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponseStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.responseStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetDevicePasscodeResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new SetDevicePasscodeResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.responseStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetDevicePasscodeResponseOrBuilder {
            private int bitField0_;
            private int responseStatus_;

            private Builder() {
                this.responseStatus_ = 0;
            }

            private void buildPartial0(SetDevicePasscodeResponse setDevicePasscodeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setDevicePasscodeResponse.responseStatus_ = this.responseStatus_;
                } else {
                    i14 = 0;
                }
                setDevicePasscodeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetDevicePasscodeResponse build() {
                SetDevicePasscodeResponse setDevicePasscodeResponseBuildPartial = buildPartial();
                if (setDevicePasscodeResponseBuildPartial.isInitialized()) {
                    return setDevicePasscodeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setDevicePasscodeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetDevicePasscodeResponse buildPartial() {
                SetDevicePasscodeResponse setDevicePasscodeResponse = new SetDevicePasscodeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setDevicePasscodeResponse);
                }
                onBuilt();
                return setDevicePasscodeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.responseStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResponseStatus() {
                this.bitField0_ &= -2;
                this.responseStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeResponseOrBuilder
            public PasscodeResponseStatus getResponseStatus() {
                PasscodeResponseStatus passcodeResponseStatusForNumber = PasscodeResponseStatus.forNumber(this.responseStatus_);
                return passcodeResponseStatusForNumber == null ? PasscodeResponseStatus.PASSCODE_STATUS_ERROR : passcodeResponseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceStatus.SetDevicePasscodeResponseOrBuilder
            public boolean hasResponseStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceStatus.internal_static_GDI_Proto_DeviceStatus_SetDevicePasscodeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetDevicePasscodeResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (PasscodeResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.responseStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResponseStatus(PasscodeResponseStatus passcodeResponseStatus) {
                passcodeResponseStatus.getClass();
                this.bitField0_ |= 1;
                this.responseStatus_ = passcodeResponseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SetDevicePasscodeResponse getDefaultInstanceForType() {
                return SetDevicePasscodeResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.responseStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetDevicePasscodeResponse) {
                    return mergeFrom((SetDevicePasscodeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetDevicePasscodeResponse setDevicePasscodeResponse) {
                if (setDevicePasscodeResponse == SetDevicePasscodeResponse.getDefaultInstance()) {
                    return this;
                }
                if (setDevicePasscodeResponse.hasResponseStatus()) {
                    setResponseStatus(setDevicePasscodeResponse.getResponseStatus());
                }
                mergeUnknownFields(setDevicePasscodeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetDevicePasscodeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetDevicePasscodeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetDevicePasscodeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetDevicePasscodeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SetDevicePasscodeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SetDevicePasscodeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SetDevicePasscodeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.responseStatus_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetDevicePasscodeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetDevicePasscodeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetDevicePasscodeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetDevicePasscodeResponse parseFrom(InputStream inputStream) {
            return (SetDevicePasscodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetDevicePasscodeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetDevicePasscodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetDevicePasscodeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SetDevicePasscodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetDevicePasscodeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetDevicePasscodeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum PasscodeResponseStatus implements ProtocolMessageEnum {
        PASSCODE_STATUS_ERROR(0),
        PASSCODE_STATUS_OK(1),
        PASSCODE_STATUS_NFC_DEVICE(2);

        public static final int PASSCODE_STATUS_ERROR_VALUE = 0;
        public static final int PASSCODE_STATUS_NFC_DEVICE_VALUE = 2;
        public static final int PASSCODE_STATUS_OK_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<PasscodeResponseStatus> internalValueMap = new Internal.EnumLiteMap<PasscodeResponseStatus>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.PasscodeResponseStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PasscodeResponseStatus findValueByNumber(int i14) {
                return PasscodeResponseStatus.forNumber(i14);
            }
        };
        private static final PasscodeResponseStatus[] VALUES = values();

        PasscodeResponseStatus(int i14) {
            this.value = i14;
        }

        public static PasscodeResponseStatus forNumber(int i14) {
            if (i14 == 0) {
                return PASSCODE_STATUS_ERROR;
            }
            if (i14 == 1) {
                return PASSCODE_STATUS_OK;
            }
            if (i14 != 2) {
                return null;
            }
            return PASSCODE_STATUS_NFC_DEVICE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDeviceStatus.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<PasscodeResponseStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static PasscodeResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            h.s("EnumValueDescriptor is not for this type.");
            return null;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static PasscodeResponseStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum RemoteDeviceBatteryStatusBatteryStatus implements ProtocolMessageEnum {
        UNKNOWN_STATUS(0),
        NORMAL(1),
        LOW(2),
        CRITICAL(3),
        CHARGING(4),
        FULLY_CHARGED(5),
        ERROR(6),
        LOW_PULSE_OX(7);

        public static final int CHARGING_VALUE = 4;
        public static final int CRITICAL_VALUE = 3;
        public static final int ERROR_VALUE = 6;
        public static final int FULLY_CHARGED_VALUE = 5;
        public static final int LOW_PULSE_OX_VALUE = 7;
        public static final int LOW_VALUE = 2;
        public static final int NORMAL_VALUE = 1;
        public static final int UNKNOWN_STATUS_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<RemoteDeviceBatteryStatusBatteryStatus> internalValueMap = new Internal.EnumLiteMap<RemoteDeviceBatteryStatusBatteryStatus>() { // from class: com.garmin.proto.generated.GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public RemoteDeviceBatteryStatusBatteryStatus findValueByNumber(int i14) {
                return RemoteDeviceBatteryStatusBatteryStatus.forNumber(i14);
            }
        };
        private static final RemoteDeviceBatteryStatusBatteryStatus[] VALUES = values();

        RemoteDeviceBatteryStatusBatteryStatus(int i14) {
            this.value = i14;
        }

        public static RemoteDeviceBatteryStatusBatteryStatus forNumber(int i14) {
            switch (i14) {
                case 0:
                    return UNKNOWN_STATUS;
                case 1:
                    return NORMAL;
                case 2:
                    return LOW;
                case 3:
                    return CRITICAL;
                case 4:
                    return CHARGING;
                case 5:
                    return FULLY_CHARGED;
                case 6:
                    return ERROR;
                case 7:
                    return LOW_PULSE_OX;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDeviceStatus.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<RemoteDeviceBatteryStatusBatteryStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static RemoteDeviceBatteryStatusBatteryStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            h.s("EnumValueDescriptor is not for this type.");
            return null;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static RemoteDeviceBatteryStatusBatteryStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
