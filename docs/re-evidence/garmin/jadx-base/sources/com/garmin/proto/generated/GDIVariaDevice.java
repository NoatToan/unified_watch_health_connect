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

/* JADX INFO: loaded from: classes13.dex */
public final class GDIVariaDevice {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDIVariaDevice.proto\u0012\u0015GDI.Proto.VariaDevice\u001a\rGDICore.proto\u001a\u0015GDIEventSharing.proto\"\u008d\u0007\n\u0007Service\u0012F\n\u0011configure_request\u0018\u0001 \u0001(\u000b2+.GDI.Proto.VariaDevice.ConfigurationRequest\u0012H\n\u0012configure_response\u0018\u0002 \u0001(\u000b2,.GDI.Proto.VariaDevice.ConfigurationResponse\u0012P\n\u0016configure_notification\u0018\u0003 \u0001(\u000b20.GDI.Proto.VariaDevice.ConfigurationNotification\u00128\n\fmode_request\u0018\u0004 \u0001(\u000b2\".GDI.Proto.VariaDevice.ModeRequest\u0012:\n\rmode_response\u0018\u0005 \u0001(\u000b2#.GDI.Proto.VariaDevice.ModeResponse\u0012B\n\u0011mode_notification\u0018\u0006 \u0001(\u000b2'.GDI.Proto.VariaDevice.ModeNotification\u0012B\n\u000estatus_request\u0018\u0007 \u0001(\u000b2*.GDI.Proto.VariaDevice.DeviceStatusRequest\u0012D\n\u000fstatus_response\u0018\b \u0001(\u000b2+.GDI.Proto.VariaDevice.DeviceStatusResponse\u0012L\n\u0013status_notification\u0018\t \u0001(\u000b2/.GDI.Proto.VariaDevice.DeviceStatusNotification\u0012T\n\u001bvault_upload_enable_request\u0018\n \u0001(\u000b2/.GDI.Proto.VariaDevice.VaultUploadEnableRequest\u0012V\n\u001cvault_upload_enable_response\u0018\u000b \u0001(\u000b20.GDI.Proto.VariaDevice.VaultUploadEnableResponse\u0012^\n vault_upload_enable_notification\u0018\f \u0001(\u000b24.GDI.Proto.VariaDevice.VaultUploadEnableNotification\"\u0087\u0001\n\u0013CapabilitiesRequest2p\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018& \u0001(\u000b2*.GDI.Proto.VariaDevice.CapabilitiesRequest\"\u0099\u0001\n\fCapabilities\u0012$\n\u001cincident_detection_supported\u0018\u0001 \u0001(\b\u0012\u001d\n\u0015orientation_supported\u0018\u0002 \u0001(\b\u0012\u001e\n\u0016power_source_supported\u0018\u0003 \u0001(\b\u0012$\n\u001cmoisture_detection_supported\u0018\u0004 \u0001(\b\"Æ\u0001\n\u0014CapabilitiesResponse\u00129\n\fcapabilities\u0018\u0001 \u0001(\u000b2#.GDI.Proto.VariaDevice.Capabilities2s\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018& \u0001(\u000b2+.GDI.Proto.VariaDevice.CapabilitiesResponse\"Å\u0003\n\rConfiguration\u00125\n\u0003sku\u0018\u0001 \u0001(\u000e2(.GDI.Proto.VariaDevice.Configuration.SKU\u0012E\n\u000borientation\u0018\u0002 \u0001(\u000e20.GDI.Proto.VariaDevice.Configuration.Orientation\u0012!\n\u0019incident_detection_enable\u0018\u0003 \u0001(\b\u0012\u001b\n\u0013power_source_enable\u0018\u0004 \u0001(\b\u0012!\n\u0019moisture_detection_enable\u0018\u0005 \u0001(\b\"s\n\u000bOrientation\u0012\u0017\n\u0013ORIENTATION_UNKNOWN\u0010\u0000\u0012\u0017\n\u0013ORIENTATION_DYNAMIC\u0010\u0001\u0012\u0018\n\u0014ORIENTATION_STANDARD\u0010\u0002\u0012\u0018\n\u0014ORIENTATION_INVERTED\u0010\u0003\"^\n\u0003SKU\u0012\u000f\n\u000bSKU_UNKNOWN\u0010\u0000\u0012\n\n\u0006SKU_WW\u0010\u0001\u0012\u0011\n\rSKU_UK_FRANCE\u0010\u0002\u0012\r\n\tSKU_STVZO\u0010\u0003\u0012\f\n\bSKU_APAC\u0010\u0004\u0012\n\n\u0006SKU_NA\u0010\u0005\"L\n\u0014ConfigurationRequest\u00124\n\u0006config\u0018\u0001 \u0001(\u000b2$.GDI.Proto.VariaDevice.Configuration\"|\n\u0015ConfigurationResponse\u0012-\n\u0006status\u0018\u0001 \u0001(\u000e2\u001d.GDI.Proto.VariaDevice.Status\u00124\n\u0006config\u0018\u0002 \u0001(\u000b2$.GDI.Proto.VariaDevice.Configuration\"Q\n\u0019ConfigurationNotification\u00124\n\u0006config\u0018\u0001 \u0001(\u000b2$.GDI.Proto.VariaDevice.Configuration\"8\n\u000bModeRequest\u0012)\n\u0004mode\u0018\u0001 \u0001(\u000e2\u001b.GDI.Proto.VariaDevice.Mode\"h\n\fModeResponse\u0012-\n\u0006status\u0018\u0001 \u0001(\u000e2\u001d.GDI.Proto.VariaDevice.Status\u0012)\n\u0004mode\u0018\u0002 \u0001(\u000e2\u001b.GDI.Proto.VariaDevice.Mode\"=\n\u0010ModeNotification\u0012)\n\u0004mode\u0018\u0001 \u0001(\u000e2\u001b.GDI.Proto.VariaDevice.Mode\"b\n\fDeviceStatus\u0012\u0019\n\u0011incident_detected\u0018\u0001 \u0001(\b\u0012\u001d\n\u0015incorrect_orientation\u0018\u0002 \u0001(\b\u0012\u0018\n\u0010reverse_charging\u0018\u0003 \u0001(\b\"¦\u0004\n\fDeviceFaults\u0012\"\n\u001ahigh_cpu_temperature_fault\u0018\u0001 \u0001(\b\u0012!\n\u0019low_cpu_temperature_fault\u0018\u0002 \u0001(\b\u0012$\n\u001cremote_cpu_temperature_fault\u0018\u0003 \u0001(\b\u0012&\n\u001ehigh_battery_temperature_fault\u0018\u0004 \u0001(\b\u0012%\n\u001dlow_battery_temperature_fault\u0018\u0005 \u0001(\b\u0012\u0016\n\u000echarging_fault\u0018\u0006 \u0001(\b\u0012\u001f\n\u0017moisture_detected_fault\u0018\u0007 \u0001(\b\u0012\"\n\u001acharging_temperature_fault\u0018\b \u0001(\b\u0012\"\n\u001ahigh_led_temperature_fault\u0018\t \u0001(\b\u0012!\n\u0019low_led_temperature_fault\u0018\n \u0001(\b\u0012\u001e\n\u0016main_led_failure_fault\u0018\u000b \u0001(\b\u0012\u001e\n\u0016battery_shutdown_fault\u0018\f \u0001(\b\u0012\u001b\n\u0013battery_empty_fault\u0018\r \u0001(\b\u0012\u0019\n\u0011radar_power_fault\u0018\u000e \u0001(\b\u0012\u001a\n\u0012radar_health_fault\u0018\u000f \u0001(\b\u0012\"\n\u001aradar_health_timeout_fault\u0018\u0010 \u0001(\b\"\u0015\n\u0013DeviceStatusRequest\"\u0080\u0001\n\u0014DeviceStatusResponse\u00123\n\u0006status\u0018\u0001 \u0001(\u000b2#.GDI.Proto.VariaDevice.DeviceStatus\u00123\n\u0006faults\u0018\u0002 \u0001(\u000b2#.GDI.Proto.VariaDevice.DeviceFaults\"ï\u0001\n\u0018DeviceStatusNotification\u00123\n\u0006status\u0018\u0001 \u0001(\u000b2#.GDI.Proto.VariaDevice.DeviceStatus\u00123\n\u0006faults\u0018\u0002 \u0001(\u000b2#.GDI.Proto.VariaDevice.DeviceFaults2i\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ü\u0007 \u0001(\u000b2/.GDI.Proto.VariaDevice.DeviceStatusNotification\"*\n\u0018VaultUploadEnableRequest\u0012\u000e\n\u0006enable\u0018\u0001 \u0001(\b\"Z\n\u0019VaultUploadEnableResponse\u0012-\n\u0006status\u0018\u0001 \u0001(\u000e2\u001d.GDI.Proto.VariaDevice.Status\u0012\u000e\n\u0006enable\u0018\u0002 \u0001(\b\"/\n\u001dVaultUploadEnableNotification\u0012\u000e\n\u0006enable\u0018\u0001 \u0001(\b*W\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fSTATUS_REJECTED\u0010\u0001\u0012\u0013\n\u000fSTATUS_ACCEPTED\u0010\u0002\u0012\u000f\n\u000bSTATUS_BUSY\u0010\u0003*f\n\u0004Mode\u0012\u0010\n\fMODE_UNKNOWN\u0010\u0000\u0012\u000f\n\u000bMODE_ACTIVE\u0010\u0001\u0012\u0013\n\u000fMODE_RADAR_DEMO\u0010\u0002\u0012\u0010\n\fMODE_PAIRING\u0010\u0003\u0012\u0014\n\u0010MODE_HIBERNATION\u0010\u0004B.\n\u001acom.garmin.proto.generatedB\u000eGDIVariaDeviceH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_Capabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_Capabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_Configuration_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_Configuration_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_DeviceFaults_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_DeviceFaults_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_DeviceStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_DeviceStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_ModeNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_ModeNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_ModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_ModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_ModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_ModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_fieldAccessorTable;

    public interface CapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getIncidentDetectionSupported();

        boolean getMoistureDetectionSupported();

        boolean getOrientationSupported();

        boolean getPowerSourceSupported();

        boolean hasIncidentDetectionSupported();

        boolean hasMoistureDetectionSupported();

        boolean hasOrientationSupported();

        boolean hasPowerSourceSupported();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        Capabilities getCapabilities();

        CapabilitiesOrBuilder getCapabilitiesOrBuilder();

        boolean hasCapabilities();
    }

    public interface ConfigurationNotificationOrBuilder extends MessageOrBuilder {
        Configuration getConfig();

        ConfigurationOrBuilder getConfigOrBuilder();

        boolean hasConfig();
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        boolean getIncidentDetectionEnable();

        boolean getMoistureDetectionEnable();

        Configuration.Orientation getOrientation();

        boolean getPowerSourceEnable();

        Configuration.SKU getSku();

        boolean hasIncidentDetectionEnable();

        boolean hasMoistureDetectionEnable();

        boolean hasOrientation();

        boolean hasPowerSourceEnable();

        boolean hasSku();
    }

    public interface ConfigurationRequestOrBuilder extends MessageOrBuilder {
        Configuration getConfig();

        ConfigurationOrBuilder getConfigOrBuilder();

        boolean hasConfig();
    }

    public interface ConfigurationResponseOrBuilder extends MessageOrBuilder {
        Configuration getConfig();

        ConfigurationOrBuilder getConfigOrBuilder();

        Status getStatus();

        boolean hasConfig();

        boolean hasStatus();
    }

    public interface DeviceFaultsOrBuilder extends MessageOrBuilder {
        boolean getBatteryEmptyFault();

        boolean getBatteryShutdownFault();

        boolean getChargingFault();

        boolean getChargingTemperatureFault();

        boolean getHighBatteryTemperatureFault();

        boolean getHighCpuTemperatureFault();

        boolean getHighLedTemperatureFault();

        boolean getLowBatteryTemperatureFault();

        boolean getLowCpuTemperatureFault();

        boolean getLowLedTemperatureFault();

        boolean getMainLedFailureFault();

        boolean getMoistureDetectedFault();

        boolean getRadarHealthFault();

        boolean getRadarHealthTimeoutFault();

        boolean getRadarPowerFault();

        boolean getRemoteCpuTemperatureFault();

        boolean hasBatteryEmptyFault();

        boolean hasBatteryShutdownFault();

        boolean hasChargingFault();

        boolean hasChargingTemperatureFault();

        boolean hasHighBatteryTemperatureFault();

        boolean hasHighCpuTemperatureFault();

        boolean hasHighLedTemperatureFault();

        boolean hasLowBatteryTemperatureFault();

        boolean hasLowCpuTemperatureFault();

        boolean hasLowLedTemperatureFault();

        boolean hasMainLedFailureFault();

        boolean hasMoistureDetectedFault();

        boolean hasRadarHealthFault();

        boolean hasRadarHealthTimeoutFault();

        boolean hasRadarPowerFault();

        boolean hasRemoteCpuTemperatureFault();
    }

    public interface DeviceStatusNotificationOrBuilder extends MessageOrBuilder {
        DeviceFaults getFaults();

        DeviceFaultsOrBuilder getFaultsOrBuilder();

        DeviceStatus getStatus();

        DeviceStatusOrBuilder getStatusOrBuilder();

        boolean hasFaults();

        boolean hasStatus();
    }

    public interface DeviceStatusOrBuilder extends MessageOrBuilder {
        boolean getIncidentDetected();

        boolean getIncorrectOrientation();

        boolean getReverseCharging();

        boolean hasIncidentDetected();

        boolean hasIncorrectOrientation();

        boolean hasReverseCharging();
    }

    public interface DeviceStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface DeviceStatusResponseOrBuilder extends MessageOrBuilder {
        DeviceFaults getFaults();

        DeviceFaultsOrBuilder getFaultsOrBuilder();

        DeviceStatus getStatus();

        DeviceStatusOrBuilder getStatusOrBuilder();

        boolean hasFaults();

        boolean hasStatus();
    }

    public interface ModeNotificationOrBuilder extends MessageOrBuilder {
        Mode getMode();

        boolean hasMode();
    }

    public interface ModeRequestOrBuilder extends MessageOrBuilder {
        Mode getMode();

        boolean hasMode();
    }

    public interface ModeResponseOrBuilder extends MessageOrBuilder {
        Mode getMode();

        Status getStatus();

        boolean hasMode();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ConfigurationNotification getConfigureNotification();

        ConfigurationNotificationOrBuilder getConfigureNotificationOrBuilder();

        ConfigurationRequest getConfigureRequest();

        ConfigurationRequestOrBuilder getConfigureRequestOrBuilder();

        ConfigurationResponse getConfigureResponse();

        ConfigurationResponseOrBuilder getConfigureResponseOrBuilder();

        ModeNotification getModeNotification();

        ModeNotificationOrBuilder getModeNotificationOrBuilder();

        ModeRequest getModeRequest();

        ModeRequestOrBuilder getModeRequestOrBuilder();

        ModeResponse getModeResponse();

        ModeResponseOrBuilder getModeResponseOrBuilder();

        DeviceStatusNotification getStatusNotification();

        DeviceStatusNotificationOrBuilder getStatusNotificationOrBuilder();

        DeviceStatusRequest getStatusRequest();

        DeviceStatusRequestOrBuilder getStatusRequestOrBuilder();

        DeviceStatusResponse getStatusResponse();

        DeviceStatusResponseOrBuilder getStatusResponseOrBuilder();

        VaultUploadEnableNotification getVaultUploadEnableNotification();

        VaultUploadEnableNotificationOrBuilder getVaultUploadEnableNotificationOrBuilder();

        VaultUploadEnableRequest getVaultUploadEnableRequest();

        VaultUploadEnableRequestOrBuilder getVaultUploadEnableRequestOrBuilder();

        VaultUploadEnableResponse getVaultUploadEnableResponse();

        VaultUploadEnableResponseOrBuilder getVaultUploadEnableResponseOrBuilder();

        boolean hasConfigureNotification();

        boolean hasConfigureRequest();

        boolean hasConfigureResponse();

        boolean hasModeNotification();

        boolean hasModeRequest();

        boolean hasModeResponse();

        boolean hasStatusNotification();

        boolean hasStatusRequest();

        boolean hasStatusResponse();

        boolean hasVaultUploadEnableNotification();

        boolean hasVaultUploadEnableRequest();

        boolean hasVaultUploadEnableResponse();
    }

    public interface VaultUploadEnableNotificationOrBuilder extends MessageOrBuilder {
        boolean getEnable();

        boolean hasEnable();
    }

    public interface VaultUploadEnableRequestOrBuilder extends MessageOrBuilder {
        boolean getEnable();

        boolean hasEnable();
    }

    public interface VaultUploadEnableResponseOrBuilder extends MessageOrBuilder {
        boolean getEnable();

        Status getStatus();

        boolean hasEnable();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_VariaDevice_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_VariaDevice_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConfigureRequest", "ConfigureResponse", "ConfigureNotification", "ModeRequest", "ModeResponse", "ModeNotification", "StatusRequest", "StatusResponse", "StatusNotification", "VaultUploadEnableRequest", "VaultUploadEnableResponse", "VaultUploadEnableNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_VariaDevice_Capabilities_descriptor = descriptor4;
        internal_static_GDI_Proto_VariaDevice_Capabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"IncidentDetectionSupported", "OrientationSupported", "PowerSourceSupported", "MoistureDetectionSupported"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_VariaDevice_Configuration_descriptor = descriptor6;
        internal_static_GDI_Proto_VariaDevice_Configuration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Sku", "Orientation", "IncidentDetectionEnable", "PowerSourceEnable", "MoistureDetectionEnable"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Config"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status", "Config"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Config"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_VariaDevice_ModeRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_VariaDevice_ModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Mode"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_VariaDevice_ModeResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_VariaDevice_ModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Status", "Mode"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_VariaDevice_ModeNotification_descriptor = descriptor12;
        internal_static_GDI_Proto_VariaDevice_ModeNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Mode"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_VariaDevice_DeviceStatus_descriptor = descriptor13;
        internal_static_GDI_Proto_VariaDevice_DeviceStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"IncidentDetected", "IncorrectOrientation", "ReverseCharging"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_VariaDevice_DeviceFaults_descriptor = descriptor14;
        internal_static_GDI_Proto_VariaDevice_DeviceFaults_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"HighCpuTemperatureFault", "LowCpuTemperatureFault", "RemoteCpuTemperatureFault", "HighBatteryTemperatureFault", "LowBatteryTemperatureFault", "ChargingFault", "MoistureDetectedFault", "ChargingTemperatureFault", "HighLedTemperatureFault", "LowLedTemperatureFault", "MainLedFailureFault", "BatteryShutdownFault", "BatteryEmptyFault", "RadarPowerFault", "RadarHealthFault", "RadarHealthTimeoutFault"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[0]);
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Status", "Faults"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_descriptor = descriptor17;
        internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Status", "Faults"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_descriptor = descriptor18;
        internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Enable"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(17);
        internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_descriptor = descriptor19;
        internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Status", "Enable"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(18);
        internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_descriptor = descriptor20;
        internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Enable"});
        GDICore.getDescriptor();
        GDIEventSharingProto.getDescriptor();
    }

    private GDIVariaDevice() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
        extensionRegistryLite.add(DeviceStatusNotification.data);
    }

    public static final class Capabilities extends GeneratedMessageV3 implements CapabilitiesOrBuilder {
        public static final int INCIDENT_DETECTION_SUPPORTED_FIELD_NUMBER = 1;
        public static final int MOISTURE_DETECTION_SUPPORTED_FIELD_NUMBER = 4;
        public static final int ORIENTATION_SUPPORTED_FIELD_NUMBER = 2;
        public static final int POWER_SOURCE_SUPPORTED_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean incidentDetectionSupported_;
        private byte memoizedIsInitialized;
        private boolean moistureDetectionSupported_;
        private boolean orientationSupported_;
        private boolean powerSourceSupported_;
        private static final Capabilities DEFAULT_INSTANCE = new Capabilities();

        @Deprecated
        public static final Parser<Capabilities> PARSER = new AbstractParser<Capabilities>() { // from class: com.garmin.proto.generated.GDIVariaDevice.Capabilities.1
            @Override // com.google.protobuf.Parser
            public Capabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Capabilities.newBuilder();
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

        private Capabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.incidentDetectionSupported_ = false;
            this.orientationSupported_ = false;
            this.powerSourceSupported_ = false;
            this.moistureDetectionSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Capabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Capabilities_descriptor;
        }

        public static Builder newBuilder(Capabilities capabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilities);
        }

        public static Capabilities parseDelimitedFrom(InputStream inputStream) {
            return (Capabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Capabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Capabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Capabilities)) {
                return super.equals(obj);
            }
            Capabilities capabilities = (Capabilities) obj;
            if (hasIncidentDetectionSupported() != capabilities.hasIncidentDetectionSupported()) {
                return false;
            }
            if ((hasIncidentDetectionSupported() && getIncidentDetectionSupported() != capabilities.getIncidentDetectionSupported()) || hasOrientationSupported() != capabilities.hasOrientationSupported()) {
                return false;
            }
            if ((hasOrientationSupported() && getOrientationSupported() != capabilities.getOrientationSupported()) || hasPowerSourceSupported() != capabilities.hasPowerSourceSupported()) {
                return false;
            }
            if ((!hasPowerSourceSupported() || getPowerSourceSupported() == capabilities.getPowerSourceSupported()) && hasMoistureDetectionSupported() == capabilities.hasMoistureDetectionSupported()) {
                return (!hasMoistureDetectionSupported() || getMoistureDetectionSupported() == capabilities.getMoistureDetectionSupported()) && getUnknownFields().equals(capabilities.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
        public boolean getIncidentDetectionSupported() {
            return this.incidentDetectionSupported_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
        public boolean getMoistureDetectionSupported() {
            return this.moistureDetectionSupported_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
        public boolean getOrientationSupported() {
            return this.orientationSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Capabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
        public boolean getPowerSourceSupported() {
            return this.powerSourceSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.incidentDetectionSupported_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.orientationSupported_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.powerSourceSupported_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.moistureDetectionSupported_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
        public boolean hasIncidentDetectionSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
        public boolean hasMoistureDetectionSupported() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
        public boolean hasOrientationSupported() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
        public boolean hasPowerSourceSupported() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIncidentDetectionSupported()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIncidentDetectionSupported());
            }
            if (hasOrientationSupported()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getOrientationSupported());
            }
            if (hasPowerSourceSupported()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getPowerSourceSupported());
            }
            if (hasMoistureDetectionSupported()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getMoistureDetectionSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
            return new Capabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.incidentDetectionSupported_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.orientationSupported_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.powerSourceSupported_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.moistureDetectionSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesOrBuilder {
            private int bitField0_;
            private boolean incidentDetectionSupported_;
            private boolean moistureDetectionSupported_;
            private boolean orientationSupported_;
            private boolean powerSourceSupported_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(Capabilities capabilities) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilities.incidentDetectionSupported_ = this.incidentDetectionSupported_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilities.orientationSupported_ = this.orientationSupported_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    capabilities.powerSourceSupported_ = this.powerSourceSupported_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    capabilities.moistureDetectionSupported_ = this.moistureDetectionSupported_;
                    i14 |= 8;
                }
                capabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Capabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Capabilities build() {
                Capabilities capabilitiesBuildPartial = buildPartial();
                if (capabilitiesBuildPartial.isInitialized()) {
                    return capabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Capabilities buildPartial() {
                Capabilities capabilities = new Capabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilities);
                }
                onBuilt();
                return capabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.incidentDetectionSupported_ = false;
                this.orientationSupported_ = false;
                this.powerSourceSupported_ = false;
                this.moistureDetectionSupported_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIncidentDetectionSupported() {
                this.bitField0_ &= -2;
                this.incidentDetectionSupported_ = false;
                onChanged();
                return this;
            }

            public Builder clearMoistureDetectionSupported() {
                this.bitField0_ &= -9;
                this.moistureDetectionSupported_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearOrientationSupported() {
                this.bitField0_ &= -3;
                this.orientationSupported_ = false;
                onChanged();
                return this;
            }

            public Builder clearPowerSourceSupported() {
                this.bitField0_ &= -5;
                this.powerSourceSupported_ = false;
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Capabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
            public boolean getIncidentDetectionSupported() {
                return this.incidentDetectionSupported_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
            public boolean getMoistureDetectionSupported() {
                return this.moistureDetectionSupported_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
            public boolean getOrientationSupported() {
                return this.orientationSupported_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
            public boolean getPowerSourceSupported() {
                return this.powerSourceSupported_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
            public boolean hasIncidentDetectionSupported() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
            public boolean hasMoistureDetectionSupported() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
            public boolean hasOrientationSupported() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesOrBuilder
            public boolean hasPowerSourceSupported() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
                                    this.incidentDetectionSupported_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.orientationSupported_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.powerSourceSupported_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.moistureDetectionSupported_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIncidentDetectionSupported(boolean z14) {
                this.incidentDetectionSupported_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMoistureDetectionSupported(boolean z14) {
                this.moistureDetectionSupported_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setOrientationSupported(boolean z14) {
                this.orientationSupported_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPowerSourceSupported(boolean z14) {
                this.powerSourceSupported_ = z14;
                this.bitField0_ |= 4;
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
            public Capabilities getDefaultInstanceForType() {
                return Capabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Capabilities) {
                    return mergeFrom((Capabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Capabilities capabilities) {
                if (capabilities == Capabilities.getDefaultInstance()) {
                    return this;
                }
                if (capabilities.hasIncidentDetectionSupported()) {
                    setIncidentDetectionSupported(capabilities.getIncidentDetectionSupported());
                }
                if (capabilities.hasOrientationSupported()) {
                    setOrientationSupported(capabilities.getOrientationSupported());
                }
                if (capabilities.hasPowerSourceSupported()) {
                    setPowerSourceSupported(capabilities.getPowerSourceSupported());
                }
                if (capabilities.hasMoistureDetectionSupported()) {
                    setMoistureDetectionSupported(capabilities.getMoistureDetectionSupported());
                }
                mergeUnknownFields(capabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Capabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Capabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Capabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Capabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Capabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Capabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Capabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Capabilities parseFrom(InputStream inputStream) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ Capabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Capabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Capabilities() {
            this.incidentDetectionSupported_ = false;
            this.orientationSupported_ = false;
            this.powerSourceSupported_ = false;
            this.moistureDetectionSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Capabilities parseFrom(CodedInputStream codedInputStream) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Capabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 38;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIVariaDevice.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> featuresRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_descriptor;
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
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_descriptor;
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class DeviceFaults extends GeneratedMessageV3 implements DeviceFaultsOrBuilder {
        public static final int BATTERY_EMPTY_FAULT_FIELD_NUMBER = 13;
        public static final int BATTERY_SHUTDOWN_FAULT_FIELD_NUMBER = 12;
        public static final int CHARGING_FAULT_FIELD_NUMBER = 6;
        public static final int CHARGING_TEMPERATURE_FAULT_FIELD_NUMBER = 8;
        public static final int HIGH_BATTERY_TEMPERATURE_FAULT_FIELD_NUMBER = 4;
        public static final int HIGH_CPU_TEMPERATURE_FAULT_FIELD_NUMBER = 1;
        public static final int HIGH_LED_TEMPERATURE_FAULT_FIELD_NUMBER = 9;
        public static final int LOW_BATTERY_TEMPERATURE_FAULT_FIELD_NUMBER = 5;
        public static final int LOW_CPU_TEMPERATURE_FAULT_FIELD_NUMBER = 2;
        public static final int LOW_LED_TEMPERATURE_FAULT_FIELD_NUMBER = 10;
        public static final int MAIN_LED_FAILURE_FAULT_FIELD_NUMBER = 11;
        public static final int MOISTURE_DETECTED_FAULT_FIELD_NUMBER = 7;
        public static final int RADAR_HEALTH_FAULT_FIELD_NUMBER = 15;
        public static final int RADAR_HEALTH_TIMEOUT_FAULT_FIELD_NUMBER = 16;
        public static final int RADAR_POWER_FAULT_FIELD_NUMBER = 14;
        public static final int REMOTE_CPU_TEMPERATURE_FAULT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private boolean batteryEmptyFault_;
        private boolean batteryShutdownFault_;
        private int bitField0_;
        private boolean chargingFault_;
        private boolean chargingTemperatureFault_;
        private boolean highBatteryTemperatureFault_;
        private boolean highCpuTemperatureFault_;
        private boolean highLedTemperatureFault_;
        private boolean lowBatteryTemperatureFault_;
        private boolean lowCpuTemperatureFault_;
        private boolean lowLedTemperatureFault_;
        private boolean mainLedFailureFault_;
        private byte memoizedIsInitialized;
        private boolean moistureDetectedFault_;
        private boolean radarHealthFault_;
        private boolean radarHealthTimeoutFault_;
        private boolean radarPowerFault_;
        private boolean remoteCpuTemperatureFault_;
        private static final DeviceFaults DEFAULT_INSTANCE = new DeviceFaults();

        @Deprecated
        public static final Parser<DeviceFaults> PARSER = new AbstractParser<DeviceFaults>() { // from class: com.garmin.proto.generated.GDIVariaDevice.DeviceFaults.1
            @Override // com.google.protobuf.Parser
            public DeviceFaults parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceFaults.newBuilder();
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

        private DeviceFaults(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.highCpuTemperatureFault_ = false;
            this.lowCpuTemperatureFault_ = false;
            this.remoteCpuTemperatureFault_ = false;
            this.highBatteryTemperatureFault_ = false;
            this.lowBatteryTemperatureFault_ = false;
            this.chargingFault_ = false;
            this.moistureDetectedFault_ = false;
            this.chargingTemperatureFault_ = false;
            this.highLedTemperatureFault_ = false;
            this.lowLedTemperatureFault_ = false;
            this.mainLedFailureFault_ = false;
            this.batteryShutdownFault_ = false;
            this.batteryEmptyFault_ = false;
            this.radarPowerFault_ = false;
            this.radarHealthFault_ = false;
            this.radarHealthTimeoutFault_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceFaults getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceFaults_descriptor;
        }

        public static Builder newBuilder(DeviceFaults deviceFaults) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceFaults);
        }

        public static DeviceFaults parseDelimitedFrom(InputStream inputStream) {
            return (DeviceFaults) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceFaults parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceFaults> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceFaults)) {
                return super.equals(obj);
            }
            DeviceFaults deviceFaults = (DeviceFaults) obj;
            if (hasHighCpuTemperatureFault() != deviceFaults.hasHighCpuTemperatureFault()) {
                return false;
            }
            if ((hasHighCpuTemperatureFault() && getHighCpuTemperatureFault() != deviceFaults.getHighCpuTemperatureFault()) || hasLowCpuTemperatureFault() != deviceFaults.hasLowCpuTemperatureFault()) {
                return false;
            }
            if ((hasLowCpuTemperatureFault() && getLowCpuTemperatureFault() != deviceFaults.getLowCpuTemperatureFault()) || hasRemoteCpuTemperatureFault() != deviceFaults.hasRemoteCpuTemperatureFault()) {
                return false;
            }
            if ((hasRemoteCpuTemperatureFault() && getRemoteCpuTemperatureFault() != deviceFaults.getRemoteCpuTemperatureFault()) || hasHighBatteryTemperatureFault() != deviceFaults.hasHighBatteryTemperatureFault()) {
                return false;
            }
            if ((hasHighBatteryTemperatureFault() && getHighBatteryTemperatureFault() != deviceFaults.getHighBatteryTemperatureFault()) || hasLowBatteryTemperatureFault() != deviceFaults.hasLowBatteryTemperatureFault()) {
                return false;
            }
            if ((hasLowBatteryTemperatureFault() && getLowBatteryTemperatureFault() != deviceFaults.getLowBatteryTemperatureFault()) || hasChargingFault() != deviceFaults.hasChargingFault()) {
                return false;
            }
            if ((hasChargingFault() && getChargingFault() != deviceFaults.getChargingFault()) || hasMoistureDetectedFault() != deviceFaults.hasMoistureDetectedFault()) {
                return false;
            }
            if ((hasMoistureDetectedFault() && getMoistureDetectedFault() != deviceFaults.getMoistureDetectedFault()) || hasChargingTemperatureFault() != deviceFaults.hasChargingTemperatureFault()) {
                return false;
            }
            if ((hasChargingTemperatureFault() && getChargingTemperatureFault() != deviceFaults.getChargingTemperatureFault()) || hasHighLedTemperatureFault() != deviceFaults.hasHighLedTemperatureFault()) {
                return false;
            }
            if ((hasHighLedTemperatureFault() && getHighLedTemperatureFault() != deviceFaults.getHighLedTemperatureFault()) || hasLowLedTemperatureFault() != deviceFaults.hasLowLedTemperatureFault()) {
                return false;
            }
            if ((hasLowLedTemperatureFault() && getLowLedTemperatureFault() != deviceFaults.getLowLedTemperatureFault()) || hasMainLedFailureFault() != deviceFaults.hasMainLedFailureFault()) {
                return false;
            }
            if ((hasMainLedFailureFault() && getMainLedFailureFault() != deviceFaults.getMainLedFailureFault()) || hasBatteryShutdownFault() != deviceFaults.hasBatteryShutdownFault()) {
                return false;
            }
            if ((hasBatteryShutdownFault() && getBatteryShutdownFault() != deviceFaults.getBatteryShutdownFault()) || hasBatteryEmptyFault() != deviceFaults.hasBatteryEmptyFault()) {
                return false;
            }
            if ((hasBatteryEmptyFault() && getBatteryEmptyFault() != deviceFaults.getBatteryEmptyFault()) || hasRadarPowerFault() != deviceFaults.hasRadarPowerFault()) {
                return false;
            }
            if ((hasRadarPowerFault() && getRadarPowerFault() != deviceFaults.getRadarPowerFault()) || hasRadarHealthFault() != deviceFaults.hasRadarHealthFault()) {
                return false;
            }
            if ((!hasRadarHealthFault() || getRadarHealthFault() == deviceFaults.getRadarHealthFault()) && hasRadarHealthTimeoutFault() == deviceFaults.hasRadarHealthTimeoutFault()) {
                return (!hasRadarHealthTimeoutFault() || getRadarHealthTimeoutFault() == deviceFaults.getRadarHealthTimeoutFault()) && getUnknownFields().equals(deviceFaults.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getBatteryEmptyFault() {
            return this.batteryEmptyFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getBatteryShutdownFault() {
            return this.batteryShutdownFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getChargingFault() {
            return this.chargingFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getChargingTemperatureFault() {
            return this.chargingTemperatureFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getHighBatteryTemperatureFault() {
            return this.highBatteryTemperatureFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getHighCpuTemperatureFault() {
            return this.highCpuTemperatureFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getHighLedTemperatureFault() {
            return this.highLedTemperatureFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getLowBatteryTemperatureFault() {
            return this.lowBatteryTemperatureFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getLowCpuTemperatureFault() {
            return this.lowCpuTemperatureFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getLowLedTemperatureFault() {
            return this.lowLedTemperatureFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getMainLedFailureFault() {
            return this.mainLedFailureFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getMoistureDetectedFault() {
            return this.moistureDetectedFault_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceFaults> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getRadarHealthFault() {
            return this.radarHealthFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getRadarHealthTimeoutFault() {
            return this.radarHealthTimeoutFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getRadarPowerFault() {
            return this.radarPowerFault_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean getRemoteCpuTemperatureFault() {
            return this.remoteCpuTemperatureFault_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.highCpuTemperatureFault_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.lowCpuTemperatureFault_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.remoteCpuTemperatureFault_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.highBatteryTemperatureFault_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(5, this.lowBatteryTemperatureFault_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(6, this.chargingFault_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(7, this.moistureDetectedFault_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(8, this.chargingTemperatureFault_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(9, this.highLedTemperatureFault_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(10, this.lowLedTemperatureFault_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(11, this.mainLedFailureFault_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(12, this.batteryShutdownFault_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(13, this.batteryEmptyFault_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(14, this.radarPowerFault_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(15, this.radarHealthFault_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(16, this.radarHealthTimeoutFault_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasBatteryEmptyFault() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasBatteryShutdownFault() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasChargingFault() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasChargingTemperatureFault() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasHighBatteryTemperatureFault() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasHighCpuTemperatureFault() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasHighLedTemperatureFault() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasLowBatteryTemperatureFault() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasLowCpuTemperatureFault() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasLowLedTemperatureFault() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasMainLedFailureFault() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasMoistureDetectedFault() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasRadarHealthFault() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasRadarHealthTimeoutFault() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasRadarPowerFault() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
        public boolean hasRemoteCpuTemperatureFault() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHighCpuTemperatureFault()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getHighCpuTemperatureFault());
            }
            if (hasLowCpuTemperatureFault()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getLowCpuTemperatureFault());
            }
            if (hasRemoteCpuTemperatureFault()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getRemoteCpuTemperatureFault());
            }
            if (hasHighBatteryTemperatureFault()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getHighBatteryTemperatureFault());
            }
            if (hasLowBatteryTemperatureFault()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getLowBatteryTemperatureFault());
            }
            if (hasChargingFault()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getChargingFault());
            }
            if (hasMoistureDetectedFault()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashBoolean(getMoistureDetectedFault());
            }
            if (hasChargingTemperatureFault()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashBoolean(getChargingTemperatureFault());
            }
            if (hasHighLedTemperatureFault()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Internal.hashBoolean(getHighLedTemperatureFault());
            }
            if (hasLowLedTemperatureFault()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Internal.hashBoolean(getLowLedTemperatureFault());
            }
            if (hasMainLedFailureFault()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + Internal.hashBoolean(getMainLedFailureFault());
            }
            if (hasBatteryShutdownFault()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + Internal.hashBoolean(getBatteryShutdownFault());
            }
            if (hasBatteryEmptyFault()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + Internal.hashBoolean(getBatteryEmptyFault());
            }
            if (hasRadarPowerFault()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + Internal.hashBoolean(getRadarPowerFault());
            }
            if (hasRadarHealthFault()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + Internal.hashBoolean(getRadarHealthFault());
            }
            if (hasRadarHealthTimeoutFault()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + Internal.hashBoolean(getRadarHealthTimeoutFault());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceFaults_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceFaults.class, Builder.class);
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
            return new DeviceFaults();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.highCpuTemperatureFault_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.lowCpuTemperatureFault_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.remoteCpuTemperatureFault_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.highBatteryTemperatureFault_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.lowBatteryTemperatureFault_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.chargingFault_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.moistureDetectedFault_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(8, this.chargingTemperatureFault_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeBool(9, this.highLedTemperatureFault_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeBool(10, this.lowLedTemperatureFault_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeBool(11, this.mainLedFailureFault_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeBool(12, this.batteryShutdownFault_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeBool(13, this.batteryEmptyFault_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeBool(14, this.radarPowerFault_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeBool(15, this.radarHealthFault_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeBool(16, this.radarHealthTimeoutFault_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceFaultsOrBuilder {
            private boolean batteryEmptyFault_;
            private boolean batteryShutdownFault_;
            private int bitField0_;
            private boolean chargingFault_;
            private boolean chargingTemperatureFault_;
            private boolean highBatteryTemperatureFault_;
            private boolean highCpuTemperatureFault_;
            private boolean highLedTemperatureFault_;
            private boolean lowBatteryTemperatureFault_;
            private boolean lowCpuTemperatureFault_;
            private boolean lowLedTemperatureFault_;
            private boolean mainLedFailureFault_;
            private boolean moistureDetectedFault_;
            private boolean radarHealthFault_;
            private boolean radarHealthTimeoutFault_;
            private boolean radarPowerFault_;
            private boolean remoteCpuTemperatureFault_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DeviceFaults deviceFaults) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    deviceFaults.highCpuTemperatureFault_ = this.highCpuTemperatureFault_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    deviceFaults.lowCpuTemperatureFault_ = this.lowCpuTemperatureFault_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    deviceFaults.remoteCpuTemperatureFault_ = this.remoteCpuTemperatureFault_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    deviceFaults.highBatteryTemperatureFault_ = this.highBatteryTemperatureFault_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    deviceFaults.lowBatteryTemperatureFault_ = this.lowBatteryTemperatureFault_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    deviceFaults.chargingFault_ = this.chargingFault_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    deviceFaults.moistureDetectedFault_ = this.moistureDetectedFault_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    deviceFaults.chargingTemperatureFault_ = this.chargingTemperatureFault_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    deviceFaults.highLedTemperatureFault_ = this.highLedTemperatureFault_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    deviceFaults.lowLedTemperatureFault_ = this.lowLedTemperatureFault_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    deviceFaults.mainLedFailureFault_ = this.mainLedFailureFault_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    deviceFaults.batteryShutdownFault_ = this.batteryShutdownFault_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    deviceFaults.batteryEmptyFault_ = this.batteryEmptyFault_;
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    deviceFaults.radarPowerFault_ = this.radarPowerFault_;
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    deviceFaults.radarHealthFault_ = this.radarHealthFault_;
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    deviceFaults.radarHealthTimeoutFault_ = this.radarHealthTimeoutFault_;
                    i14 |= 32768;
                }
                deviceFaults.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceFaults_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceFaults build() {
                DeviceFaults deviceFaultsBuildPartial = buildPartial();
                if (deviceFaultsBuildPartial.isInitialized()) {
                    return deviceFaultsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceFaultsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceFaults buildPartial() {
                DeviceFaults deviceFaults = new DeviceFaults(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceFaults);
                }
                onBuilt();
                return deviceFaults;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.highCpuTemperatureFault_ = false;
                this.lowCpuTemperatureFault_ = false;
                this.remoteCpuTemperatureFault_ = false;
                this.highBatteryTemperatureFault_ = false;
                this.lowBatteryTemperatureFault_ = false;
                this.chargingFault_ = false;
                this.moistureDetectedFault_ = false;
                this.chargingTemperatureFault_ = false;
                this.highLedTemperatureFault_ = false;
                this.lowLedTemperatureFault_ = false;
                this.mainLedFailureFault_ = false;
                this.batteryShutdownFault_ = false;
                this.batteryEmptyFault_ = false;
                this.radarPowerFault_ = false;
                this.radarHealthFault_ = false;
                this.radarHealthTimeoutFault_ = false;
                return this;
            }

            public Builder clearBatteryEmptyFault() {
                this.bitField0_ &= -4097;
                this.batteryEmptyFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearBatteryShutdownFault() {
                this.bitField0_ &= -2049;
                this.batteryShutdownFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearChargingFault() {
                this.bitField0_ &= -33;
                this.chargingFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearChargingTemperatureFault() {
                this.bitField0_ &= -129;
                this.chargingTemperatureFault_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHighBatteryTemperatureFault() {
                this.bitField0_ &= -9;
                this.highBatteryTemperatureFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearHighCpuTemperatureFault() {
                this.bitField0_ &= -2;
                this.highCpuTemperatureFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearHighLedTemperatureFault() {
                this.bitField0_ &= -257;
                this.highLedTemperatureFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearLowBatteryTemperatureFault() {
                this.bitField0_ &= -17;
                this.lowBatteryTemperatureFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearLowCpuTemperatureFault() {
                this.bitField0_ &= -3;
                this.lowCpuTemperatureFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearLowLedTemperatureFault() {
                this.bitField0_ &= -513;
                this.lowLedTemperatureFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearMainLedFailureFault() {
                this.bitField0_ &= -1025;
                this.mainLedFailureFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearMoistureDetectedFault() {
                this.bitField0_ &= -65;
                this.moistureDetectedFault_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRadarHealthFault() {
                this.bitField0_ &= -16385;
                this.radarHealthFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearRadarHealthTimeoutFault() {
                this.bitField0_ &= -32769;
                this.radarHealthTimeoutFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearRadarPowerFault() {
                this.bitField0_ &= -8193;
                this.radarPowerFault_ = false;
                onChanged();
                return this;
            }

            public Builder clearRemoteCpuTemperatureFault() {
                this.bitField0_ &= -5;
                this.remoteCpuTemperatureFault_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getBatteryEmptyFault() {
                return this.batteryEmptyFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getBatteryShutdownFault() {
                return this.batteryShutdownFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getChargingFault() {
                return this.chargingFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getChargingTemperatureFault() {
                return this.chargingTemperatureFault_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceFaults_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getHighBatteryTemperatureFault() {
                return this.highBatteryTemperatureFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getHighCpuTemperatureFault() {
                return this.highCpuTemperatureFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getHighLedTemperatureFault() {
                return this.highLedTemperatureFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getLowBatteryTemperatureFault() {
                return this.lowBatteryTemperatureFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getLowCpuTemperatureFault() {
                return this.lowCpuTemperatureFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getLowLedTemperatureFault() {
                return this.lowLedTemperatureFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getMainLedFailureFault() {
                return this.mainLedFailureFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getMoistureDetectedFault() {
                return this.moistureDetectedFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getRadarHealthFault() {
                return this.radarHealthFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getRadarHealthTimeoutFault() {
                return this.radarHealthTimeoutFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getRadarPowerFault() {
                return this.radarPowerFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean getRemoteCpuTemperatureFault() {
                return this.remoteCpuTemperatureFault_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasBatteryEmptyFault() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasBatteryShutdownFault() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasChargingFault() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasChargingTemperatureFault() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasHighBatteryTemperatureFault() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasHighCpuTemperatureFault() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasHighLedTemperatureFault() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasLowBatteryTemperatureFault() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasLowCpuTemperatureFault() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasLowLedTemperatureFault() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasMainLedFailureFault() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasMoistureDetectedFault() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasRadarHealthFault() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasRadarHealthTimeoutFault() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasRadarPowerFault() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceFaultsOrBuilder
            public boolean hasRemoteCpuTemperatureFault() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceFaults_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceFaults.class, Builder.class);
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.highCpuTemperatureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.lowCpuTemperatureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.remoteCpuTemperatureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.highBatteryTemperatureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.lowBatteryTemperatureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.chargingFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.moistureDetectedFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.chargingTemperatureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.highLedTemperatureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.lowLedTemperatureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    this.mainLedFailureFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    this.batteryShutdownFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    this.batteryEmptyFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 112:
                                    this.radarPowerFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 120:
                                    this.radarHealthFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 128:
                                    this.radarHealthTimeoutFault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32768;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBatteryEmptyFault(boolean z14) {
                this.batteryEmptyFault_ = z14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setBatteryShutdownFault(boolean z14) {
                this.batteryShutdownFault_ = z14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setChargingFault(boolean z14) {
                this.chargingFault_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setChargingTemperatureFault(boolean z14) {
                this.chargingTemperatureFault_ = z14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHighBatteryTemperatureFault(boolean z14) {
                this.highBatteryTemperatureFault_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setHighCpuTemperatureFault(boolean z14) {
                this.highCpuTemperatureFault_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHighLedTemperatureFault(boolean z14) {
                this.highLedTemperatureFault_ = z14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setLowBatteryTemperatureFault(boolean z14) {
                this.lowBatteryTemperatureFault_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLowCpuTemperatureFault(boolean z14) {
                this.lowCpuTemperatureFault_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLowLedTemperatureFault(boolean z14) {
                this.lowLedTemperatureFault_ = z14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setMainLedFailureFault(boolean z14) {
                this.mainLedFailureFault_ = z14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setMoistureDetectedFault(boolean z14) {
                this.moistureDetectedFault_ = z14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRadarHealthFault(boolean z14) {
                this.radarHealthFault_ = z14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setRadarHealthTimeoutFault(boolean z14) {
                this.radarHealthTimeoutFault_ = z14;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setRadarPowerFault(boolean z14) {
                this.radarPowerFault_ = z14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setRemoteCpuTemperatureFault(boolean z14) {
                this.remoteCpuTemperatureFault_ = z14;
                this.bitField0_ |= 4;
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
            public DeviceFaults getDefaultInstanceForType() {
                return DeviceFaults.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceFaults) {
                    return mergeFrom((DeviceFaults) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceFaults deviceFaults) {
                if (deviceFaults == DeviceFaults.getDefaultInstance()) {
                    return this;
                }
                if (deviceFaults.hasHighCpuTemperatureFault()) {
                    setHighCpuTemperatureFault(deviceFaults.getHighCpuTemperatureFault());
                }
                if (deviceFaults.hasLowCpuTemperatureFault()) {
                    setLowCpuTemperatureFault(deviceFaults.getLowCpuTemperatureFault());
                }
                if (deviceFaults.hasRemoteCpuTemperatureFault()) {
                    setRemoteCpuTemperatureFault(deviceFaults.getRemoteCpuTemperatureFault());
                }
                if (deviceFaults.hasHighBatteryTemperatureFault()) {
                    setHighBatteryTemperatureFault(deviceFaults.getHighBatteryTemperatureFault());
                }
                if (deviceFaults.hasLowBatteryTemperatureFault()) {
                    setLowBatteryTemperatureFault(deviceFaults.getLowBatteryTemperatureFault());
                }
                if (deviceFaults.hasChargingFault()) {
                    setChargingFault(deviceFaults.getChargingFault());
                }
                if (deviceFaults.hasMoistureDetectedFault()) {
                    setMoistureDetectedFault(deviceFaults.getMoistureDetectedFault());
                }
                if (deviceFaults.hasChargingTemperatureFault()) {
                    setChargingTemperatureFault(deviceFaults.getChargingTemperatureFault());
                }
                if (deviceFaults.hasHighLedTemperatureFault()) {
                    setHighLedTemperatureFault(deviceFaults.getHighLedTemperatureFault());
                }
                if (deviceFaults.hasLowLedTemperatureFault()) {
                    setLowLedTemperatureFault(deviceFaults.getLowLedTemperatureFault());
                }
                if (deviceFaults.hasMainLedFailureFault()) {
                    setMainLedFailureFault(deviceFaults.getMainLedFailureFault());
                }
                if (deviceFaults.hasBatteryShutdownFault()) {
                    setBatteryShutdownFault(deviceFaults.getBatteryShutdownFault());
                }
                if (deviceFaults.hasBatteryEmptyFault()) {
                    setBatteryEmptyFault(deviceFaults.getBatteryEmptyFault());
                }
                if (deviceFaults.hasRadarPowerFault()) {
                    setRadarPowerFault(deviceFaults.getRadarPowerFault());
                }
                if (deviceFaults.hasRadarHealthFault()) {
                    setRadarHealthFault(deviceFaults.getRadarHealthFault());
                }
                if (deviceFaults.hasRadarHealthTimeoutFault()) {
                    setRadarHealthTimeoutFault(deviceFaults.getRadarHealthTimeoutFault());
                }
                mergeUnknownFields(deviceFaults.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceFaults getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeviceFaults parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceFaults) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceFaults parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceFaults parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceFaults parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceFaults parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceFaults parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceFaults parseFrom(InputStream inputStream) {
            return (DeviceFaults) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceFaults parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceFaults) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceFaults parseFrom(CodedInputStream codedInputStream) {
            return (DeviceFaults) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceFaults parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceFaults) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ DeviceFaults(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceFaults() {
            this.highCpuTemperatureFault_ = false;
            this.lowCpuTemperatureFault_ = false;
            this.remoteCpuTemperatureFault_ = false;
            this.highBatteryTemperatureFault_ = false;
            this.lowBatteryTemperatureFault_ = false;
            this.chargingFault_ = false;
            this.moistureDetectedFault_ = false;
            this.chargingTemperatureFault_ = false;
            this.highLedTemperatureFault_ = false;
            this.lowLedTemperatureFault_ = false;
            this.mainLedFailureFault_ = false;
            this.batteryShutdownFault_ = false;
            this.batteryEmptyFault_ = false;
            this.radarPowerFault_ = false;
            this.radarHealthFault_ = false;
            this.radarHealthTimeoutFault_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class DeviceStatus extends GeneratedMessageV3 implements DeviceStatusOrBuilder {
        public static final int INCIDENT_DETECTED_FIELD_NUMBER = 1;
        public static final int INCORRECT_ORIENTATION_FIELD_NUMBER = 2;
        public static final int REVERSE_CHARGING_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean incidentDetected_;
        private boolean incorrectOrientation_;
        private byte memoizedIsInitialized;
        private boolean reverseCharging_;
        private static final DeviceStatus DEFAULT_INSTANCE = new DeviceStatus();

        @Deprecated
        public static final Parser<DeviceStatus> PARSER = new AbstractParser<DeviceStatus>() { // from class: com.garmin.proto.generated.GDIVariaDevice.DeviceStatus.1
            @Override // com.google.protobuf.Parser
            public DeviceStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceStatus.newBuilder();
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

        private DeviceStatus(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.incidentDetected_ = false;
            this.incorrectOrientation_ = false;
            this.reverseCharging_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatus_descriptor;
        }

        public static Builder newBuilder(DeviceStatus deviceStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceStatus);
        }

        public static DeviceStatus parseDelimitedFrom(InputStream inputStream) {
            return (DeviceStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceStatus)) {
                return super.equals(obj);
            }
            DeviceStatus deviceStatus = (DeviceStatus) obj;
            if (hasIncidentDetected() != deviceStatus.hasIncidentDetected()) {
                return false;
            }
            if ((hasIncidentDetected() && getIncidentDetected() != deviceStatus.getIncidentDetected()) || hasIncorrectOrientation() != deviceStatus.hasIncorrectOrientation()) {
                return false;
            }
            if ((!hasIncorrectOrientation() || getIncorrectOrientation() == deviceStatus.getIncorrectOrientation()) && hasReverseCharging() == deviceStatus.hasReverseCharging()) {
                return (!hasReverseCharging() || getReverseCharging() == deviceStatus.getReverseCharging()) && getUnknownFields().equals(deviceStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
        public boolean getIncidentDetected() {
            return this.incidentDetected_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
        public boolean getIncorrectOrientation() {
            return this.incorrectOrientation_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
        public boolean getReverseCharging() {
            return this.reverseCharging_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.incidentDetected_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.incorrectOrientation_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.reverseCharging_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
        public boolean hasIncidentDetected() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
        public boolean hasIncorrectOrientation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
        public boolean hasReverseCharging() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIncidentDetected()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIncidentDetected());
            }
            if (hasIncorrectOrientation()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getIncorrectOrientation());
            }
            if (hasReverseCharging()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getReverseCharging());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatus.class, Builder.class);
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
            return new DeviceStatus();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.incidentDetected_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.incorrectOrientation_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.reverseCharging_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceStatusOrBuilder {
            private int bitField0_;
            private boolean incidentDetected_;
            private boolean incorrectOrientation_;
            private boolean reverseCharging_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DeviceStatus deviceStatus) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    deviceStatus.incidentDetected_ = this.incidentDetected_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    deviceStatus.incorrectOrientation_ = this.incorrectOrientation_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    deviceStatus.reverseCharging_ = this.reverseCharging_;
                    i14 |= 4;
                }
                deviceStatus.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatus build() {
                DeviceStatus deviceStatusBuildPartial = buildPartial();
                if (deviceStatusBuildPartial.isInitialized()) {
                    return deviceStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatus buildPartial() {
                DeviceStatus deviceStatus = new DeviceStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceStatus);
                }
                onBuilt();
                return deviceStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.incidentDetected_ = false;
                this.incorrectOrientation_ = false;
                this.reverseCharging_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIncidentDetected() {
                this.bitField0_ &= -2;
                this.incidentDetected_ = false;
                onChanged();
                return this;
            }

            public Builder clearIncorrectOrientation() {
                this.bitField0_ &= -3;
                this.incorrectOrientation_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearReverseCharging() {
                this.bitField0_ &= -5;
                this.reverseCharging_ = false;
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatus_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
            public boolean getIncidentDetected() {
                return this.incidentDetected_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
            public boolean getIncorrectOrientation() {
                return this.incorrectOrientation_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
            public boolean getReverseCharging() {
                return this.reverseCharging_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
            public boolean hasIncidentDetected() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
            public boolean hasIncorrectOrientation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusOrBuilder
            public boolean hasReverseCharging() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatus.class, Builder.class);
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
                                    this.incidentDetected_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.incorrectOrientation_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.reverseCharging_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
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

            public Builder setIncidentDetected(boolean z14) {
                this.incidentDetected_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIncorrectOrientation(boolean z14) {
                this.incorrectOrientation_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setReverseCharging(boolean z14) {
                this.reverseCharging_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
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
            public DeviceStatus getDefaultInstanceForType() {
                return DeviceStatus.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceStatus) {
                    return mergeFrom((DeviceStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceStatus deviceStatus) {
                if (deviceStatus == DeviceStatus.getDefaultInstance()) {
                    return this;
                }
                if (deviceStatus.hasIncidentDetected()) {
                    setIncidentDetected(deviceStatus.getIncidentDetected());
                }
                if (deviceStatus.hasIncorrectOrientation()) {
                    setIncorrectOrientation(deviceStatus.getIncorrectOrientation());
                }
                if (deviceStatus.hasReverseCharging()) {
                    setReverseCharging(deviceStatus.getReverseCharging());
                }
                mergeUnknownFields(deviceStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeviceStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ DeviceStatus(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeviceStatus parseFrom(InputStream inputStream) {
            return (DeviceStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private DeviceStatus() {
            this.incidentDetected_ = false;
            this.incorrectOrientation_ = false;
            this.reverseCharging_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatus parseFrom(CodedInputStream codedInputStream) {
            return (DeviceStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeviceStatusRequest extends GeneratedMessageV3 implements DeviceStatusRequestOrBuilder {
        private static final DeviceStatusRequest DEFAULT_INSTANCE = new DeviceStatusRequest();

        @Deprecated
        public static final Parser<DeviceStatusRequest> PARSER = new AbstractParser<DeviceStatusRequest>() { // from class: com.garmin.proto.generated.GDIVariaDevice.DeviceStatusRequest.1
            @Override // com.google.protobuf.Parser
            public DeviceStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceStatusRequest.newBuilder();
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

        private DeviceStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_descriptor;
        }

        public static Builder newBuilder(DeviceStatusRequest deviceStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceStatusRequest);
        }

        public static DeviceStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (DeviceStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DeviceStatusRequest) {
                return getUnknownFields().equals(((DeviceStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceStatusRequest> getParserForType() {
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
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatusRequest.class, Builder.class);
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
            return new DeviceStatusRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatusRequest build() {
                DeviceStatusRequest deviceStatusRequestBuildPartial = buildPartial();
                if (deviceStatusRequestBuildPartial.isInitialized()) {
                    return deviceStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatusRequest buildPartial() {
                DeviceStatusRequest deviceStatusRequest = new DeviceStatusRequest(this);
                onBuilt();
                return deviceStatusRequest;
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatusRequest.class, Builder.class);
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
            public DeviceStatusRequest getDefaultInstanceForType() {
                return DeviceStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceStatusRequest) {
                    return mergeFrom((DeviceStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceStatusRequest deviceStatusRequest) {
                if (deviceStatusRequest == DeviceStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(deviceStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceStatusRequest parseFrom(InputStream inputStream) {
            return (DeviceStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (DeviceStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VaultUploadEnableNotification extends GeneratedMessageV3 implements VaultUploadEnableNotificationOrBuilder {
        public static final int ENABLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enable_;
        private byte memoizedIsInitialized;
        private static final VaultUploadEnableNotification DEFAULT_INSTANCE = new VaultUploadEnableNotification();

        @Deprecated
        public static final Parser<VaultUploadEnableNotification> PARSER = new AbstractParser<VaultUploadEnableNotification>() { // from class: com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableNotification.1
            @Override // com.google.protobuf.Parser
            public VaultUploadEnableNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VaultUploadEnableNotification.newBuilder();
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

        private VaultUploadEnableNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.enable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VaultUploadEnableNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_descriptor;
        }

        public static Builder newBuilder(VaultUploadEnableNotification vaultUploadEnableNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(vaultUploadEnableNotification);
        }

        public static VaultUploadEnableNotification parseDelimitedFrom(InputStream inputStream) {
            return (VaultUploadEnableNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VaultUploadEnableNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VaultUploadEnableNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VaultUploadEnableNotification)) {
                return super.equals(obj);
            }
            VaultUploadEnableNotification vaultUploadEnableNotification = (VaultUploadEnableNotification) obj;
            if (hasEnable() != vaultUploadEnableNotification.hasEnable()) {
                return false;
            }
            return (!hasEnable() || getEnable() == vaultUploadEnableNotification.getEnable()) && getUnknownFields().equals(vaultUploadEnableNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableNotificationOrBuilder
        public boolean getEnable() {
            return this.enable_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VaultUploadEnableNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.enable_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableNotificationOrBuilder
        public boolean hasEnable() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEnable()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getEnable());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(VaultUploadEnableNotification.class, Builder.class);
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
            return new VaultUploadEnableNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.enable_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VaultUploadEnableNotificationOrBuilder {
            private int bitField0_;
            private boolean enable_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(VaultUploadEnableNotification vaultUploadEnableNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    vaultUploadEnableNotification.enable_ = this.enable_;
                } else {
                    i14 = 0;
                }
                vaultUploadEnableNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VaultUploadEnableNotification build() {
                VaultUploadEnableNotification vaultUploadEnableNotificationBuildPartial = buildPartial();
                if (vaultUploadEnableNotificationBuildPartial.isInitialized()) {
                    return vaultUploadEnableNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) vaultUploadEnableNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VaultUploadEnableNotification buildPartial() {
                VaultUploadEnableNotification vaultUploadEnableNotification = new VaultUploadEnableNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(vaultUploadEnableNotification);
                }
                onBuilt();
                return vaultUploadEnableNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.enable_ = false;
                return this;
            }

            public Builder clearEnable() {
                this.bitField0_ &= -2;
                this.enable_ = false;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableNotificationOrBuilder
            public boolean getEnable() {
                return this.enable_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableNotificationOrBuilder
            public boolean hasEnable() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(VaultUploadEnableNotification.class, Builder.class);
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
                                    this.enable_ = codedInputStream.readBool();
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

            public Builder setEnable(boolean z14) {
                this.enable_ = z14;
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
            public VaultUploadEnableNotification getDefaultInstanceForType() {
                return VaultUploadEnableNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VaultUploadEnableNotification) {
                    return mergeFrom((VaultUploadEnableNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VaultUploadEnableNotification vaultUploadEnableNotification) {
                if (vaultUploadEnableNotification == VaultUploadEnableNotification.getDefaultInstance()) {
                    return this;
                }
                if (vaultUploadEnableNotification.hasEnable()) {
                    setEnable(vaultUploadEnableNotification.getEnable());
                }
                mergeUnknownFields(vaultUploadEnableNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VaultUploadEnableNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VaultUploadEnableNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VaultUploadEnableNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ VaultUploadEnableNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static VaultUploadEnableNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private VaultUploadEnableNotification() {
            this.enable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VaultUploadEnableNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VaultUploadEnableNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VaultUploadEnableNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VaultUploadEnableNotification parseFrom(InputStream inputStream) {
            return (VaultUploadEnableNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VaultUploadEnableNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VaultUploadEnableNotification parseFrom(CodedInputStream codedInputStream) {
            return (VaultUploadEnableNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VaultUploadEnableNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VaultUploadEnableRequest extends GeneratedMessageV3 implements VaultUploadEnableRequestOrBuilder {
        public static final int ENABLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enable_;
        private byte memoizedIsInitialized;
        private static final VaultUploadEnableRequest DEFAULT_INSTANCE = new VaultUploadEnableRequest();

        @Deprecated
        public static final Parser<VaultUploadEnableRequest> PARSER = new AbstractParser<VaultUploadEnableRequest>() { // from class: com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableRequest.1
            @Override // com.google.protobuf.Parser
            public VaultUploadEnableRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VaultUploadEnableRequest.newBuilder();
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

        private VaultUploadEnableRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.enable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VaultUploadEnableRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_descriptor;
        }

        public static Builder newBuilder(VaultUploadEnableRequest vaultUploadEnableRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(vaultUploadEnableRequest);
        }

        public static VaultUploadEnableRequest parseDelimitedFrom(InputStream inputStream) {
            return (VaultUploadEnableRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VaultUploadEnableRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VaultUploadEnableRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VaultUploadEnableRequest)) {
                return super.equals(obj);
            }
            VaultUploadEnableRequest vaultUploadEnableRequest = (VaultUploadEnableRequest) obj;
            if (hasEnable() != vaultUploadEnableRequest.hasEnable()) {
                return false;
            }
            return (!hasEnable() || getEnable() == vaultUploadEnableRequest.getEnable()) && getUnknownFields().equals(vaultUploadEnableRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableRequestOrBuilder
        public boolean getEnable() {
            return this.enable_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VaultUploadEnableRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.enable_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableRequestOrBuilder
        public boolean hasEnable() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEnable()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getEnable());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(VaultUploadEnableRequest.class, Builder.class);
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
            return new VaultUploadEnableRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.enable_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VaultUploadEnableRequestOrBuilder {
            private int bitField0_;
            private boolean enable_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(VaultUploadEnableRequest vaultUploadEnableRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    vaultUploadEnableRequest.enable_ = this.enable_;
                } else {
                    i14 = 0;
                }
                vaultUploadEnableRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VaultUploadEnableRequest build() {
                VaultUploadEnableRequest vaultUploadEnableRequestBuildPartial = buildPartial();
                if (vaultUploadEnableRequestBuildPartial.isInitialized()) {
                    return vaultUploadEnableRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) vaultUploadEnableRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VaultUploadEnableRequest buildPartial() {
                VaultUploadEnableRequest vaultUploadEnableRequest = new VaultUploadEnableRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(vaultUploadEnableRequest);
                }
                onBuilt();
                return vaultUploadEnableRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.enable_ = false;
                return this;
            }

            public Builder clearEnable() {
                this.bitField0_ &= -2;
                this.enable_ = false;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableRequestOrBuilder
            public boolean getEnable() {
                return this.enable_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableRequestOrBuilder
            public boolean hasEnable() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(VaultUploadEnableRequest.class, Builder.class);
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
                                    this.enable_ = codedInputStream.readBool();
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

            public Builder setEnable(boolean z14) {
                this.enable_ = z14;
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
            public VaultUploadEnableRequest getDefaultInstanceForType() {
                return VaultUploadEnableRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VaultUploadEnableRequest) {
                    return mergeFrom((VaultUploadEnableRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VaultUploadEnableRequest vaultUploadEnableRequest) {
                if (vaultUploadEnableRequest == VaultUploadEnableRequest.getDefaultInstance()) {
                    return this;
                }
                if (vaultUploadEnableRequest.hasEnable()) {
                    setEnable(vaultUploadEnableRequest.getEnable());
                }
                mergeUnknownFields(vaultUploadEnableRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VaultUploadEnableRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VaultUploadEnableRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VaultUploadEnableRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ VaultUploadEnableRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static VaultUploadEnableRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private VaultUploadEnableRequest() {
            this.enable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VaultUploadEnableRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VaultUploadEnableRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VaultUploadEnableRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VaultUploadEnableRequest parseFrom(InputStream inputStream) {
            return (VaultUploadEnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VaultUploadEnableRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VaultUploadEnableRequest parseFrom(CodedInputStream codedInputStream) {
            return (VaultUploadEnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VaultUploadEnableRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 38;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Capabilities capabilities_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIVariaDevice.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> featuresResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_descriptor;
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
            if (hasCapabilities() != capabilitiesResponse.hasCapabilities()) {
                return false;
            }
            return (!hasCapabilities() || getCapabilities().equals(capabilitiesResponse.getCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesResponseOrBuilder
        public Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesResponseOrBuilder
        public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesResponseOrBuilder
        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> capabilitiesBuilder_;
            private Capabilities capabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                    capabilitiesResponse.capabilities_ = singleFieldBuilderV3 == null ? this.capabilities_ : (Capabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> getCapabilitiesFieldBuilder() {
                if (this.capabilitiesBuilder_ == null) {
                    this.capabilitiesBuilder_ = new SingleFieldBuilderV3<>(getCapabilities(), getParentForChildren(), isClean());
                    this.capabilities_ = null;
                }
                return this.capabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCapabilitiesFieldBuilder();
                }
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
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearCapabilities() {
                this.bitField0_ &= -2;
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
                }
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

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesResponseOrBuilder
            public Capabilities getCapabilities() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Capabilities) singleFieldBuilderV3.getMessage();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            public Capabilities.Builder getCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Capabilities.Builder) getCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesResponseOrBuilder
            public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.CapabilitiesResponseOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCapabilities(Capabilities capabilities) {
                Capabilities capabilities2;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilities);
                } else if ((this.bitField0_ & 1) == 0 || (capabilities2 = this.capabilities_) == null || capabilities2 == Capabilities.getDefaultInstance()) {
                    this.capabilities_ = capabilities;
                } else {
                    getCapabilitiesBuilder().mergeFrom(capabilities);
                }
                if (this.capabilities_ != null) {
                    this.bitField0_ |= 1;
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCapabilities(Capabilities.Builder builder) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilities_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
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

            public Builder setCapabilities(Capabilities capabilities) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilities.getClass();
                    this.capabilities_ = capabilities;
                } else {
                    singleFieldBuilderV3.setMessage(capabilities);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
                if (capabilitiesResponse.hasCapabilities()) {
                    mergeCapabilities(capabilitiesResponse.getCapabilities());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesResponse() {
            this.memoizedIsInitialized = (byte) -1;
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

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
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

    public static final class Configuration extends GeneratedMessageV3 implements ConfigurationOrBuilder {
        public static final int INCIDENT_DETECTION_ENABLE_FIELD_NUMBER = 3;
        public static final int MOISTURE_DETECTION_ENABLE_FIELD_NUMBER = 5;
        public static final int ORIENTATION_FIELD_NUMBER = 2;
        public static final int POWER_SOURCE_ENABLE_FIELD_NUMBER = 4;
        public static final int SKU_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean incidentDetectionEnable_;
        private byte memoizedIsInitialized;
        private boolean moistureDetectionEnable_;
        private int orientation_;
        private boolean powerSourceEnable_;
        private int sku_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();

        @Deprecated
        public static final Parser<Configuration> PARSER = new AbstractParser<Configuration>() { // from class: com.garmin.proto.generated.GDIVariaDevice.Configuration.1
            @Override // com.google.protobuf.Parser
            public Configuration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Configuration.newBuilder();
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

        private Configuration(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sku_ = 0;
            this.orientation_ = 0;
            this.incidentDetectionEnable_ = false;
            this.powerSourceEnable_ = false;
            this.moistureDetectionEnable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Configuration_descriptor;
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) {
            return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Configuration> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            if (hasSku() != configuration.hasSku()) {
                return false;
            }
            if ((hasSku() && this.sku_ != configuration.sku_) || hasOrientation() != configuration.hasOrientation()) {
                return false;
            }
            if ((hasOrientation() && this.orientation_ != configuration.orientation_) || hasIncidentDetectionEnable() != configuration.hasIncidentDetectionEnable()) {
                return false;
            }
            if ((hasIncidentDetectionEnable() && getIncidentDetectionEnable() != configuration.getIncidentDetectionEnable()) || hasPowerSourceEnable() != configuration.hasPowerSourceEnable()) {
                return false;
            }
            if ((!hasPowerSourceEnable() || getPowerSourceEnable() == configuration.getPowerSourceEnable()) && hasMoistureDetectionEnable() == configuration.hasMoistureDetectionEnable()) {
                return (!hasMoistureDetectionEnable() || getMoistureDetectionEnable() == configuration.getMoistureDetectionEnable()) && getUnknownFields().equals(configuration.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public boolean getIncidentDetectionEnable() {
            return this.incidentDetectionEnable_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public boolean getMoistureDetectionEnable() {
            return this.moistureDetectionEnable_;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public Orientation getOrientation() {
            Orientation orientationForNumber = Orientation.forNumber(this.orientation_);
            return orientationForNumber == null ? Orientation.ORIENTATION_UNKNOWN : orientationForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Configuration> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public boolean getPowerSourceEnable() {
            return this.powerSourceEnable_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.sku_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.orientation_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(3, this.incidentDetectionEnable_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(4, this.powerSourceEnable_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(5, this.moistureDetectionEnable_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public SKU getSku() {
            SKU skuForNumber = SKU.forNumber(this.sku_);
            return skuForNumber == null ? SKU.SKU_UNKNOWN : skuForNumber;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public boolean hasIncidentDetectionEnable() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public boolean hasMoistureDetectionEnable() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public boolean hasOrientation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public boolean hasPowerSourceEnable() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
        public boolean hasSku() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSku()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.sku_;
            }
            if (hasOrientation()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.orientation_;
            }
            if (hasIncidentDetectionEnable()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getIncidentDetectionEnable());
            }
            if (hasPowerSourceEnable()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getPowerSourceEnable());
            }
            if (hasMoistureDetectionEnable()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getMoistureDetectionEnable());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
            return new Configuration();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.sku_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.orientation_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.incidentDetectionEnable_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.powerSourceEnable_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.moistureDetectionEnable_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationOrBuilder {
            private int bitField0_;
            private boolean incidentDetectionEnable_;
            private boolean moistureDetectionEnable_;
            private int orientation_;
            private boolean powerSourceEnable_;
            private int sku_;

            private Builder() {
                this.sku_ = 0;
                this.orientation_ = 0;
            }

            private void buildPartial0(Configuration configuration) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    configuration.sku_ = this.sku_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    configuration.orientation_ = this.orientation_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    configuration.incidentDetectionEnable_ = this.incidentDetectionEnable_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    configuration.powerSourceEnable_ = this.powerSourceEnable_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    configuration.moistureDetectionEnable_ = this.moistureDetectionEnable_;
                    i14 |= 16;
                }
                configuration.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Configuration_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Configuration build() {
                Configuration configurationBuildPartial = buildPartial();
                if (configurationBuildPartial.isInitialized()) {
                    return configurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configuration);
                }
                onBuilt();
                return configuration;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sku_ = 0;
                this.orientation_ = 0;
                this.incidentDetectionEnable_ = false;
                this.powerSourceEnable_ = false;
                this.moistureDetectionEnable_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIncidentDetectionEnable() {
                this.bitField0_ &= -5;
                this.incidentDetectionEnable_ = false;
                onChanged();
                return this;
            }

            public Builder clearMoistureDetectionEnable() {
                this.bitField0_ &= -17;
                this.moistureDetectionEnable_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearOrientation() {
                this.bitField0_ &= -3;
                this.orientation_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPowerSourceEnable() {
                this.bitField0_ &= -9;
                this.powerSourceEnable_ = false;
                onChanged();
                return this;
            }

            public Builder clearSku() {
                this.bitField0_ &= -2;
                this.sku_ = 0;
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Configuration_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public boolean getIncidentDetectionEnable() {
                return this.incidentDetectionEnable_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public boolean getMoistureDetectionEnable() {
                return this.moistureDetectionEnable_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public Orientation getOrientation() {
                Orientation orientationForNumber = Orientation.forNumber(this.orientation_);
                return orientationForNumber == null ? Orientation.ORIENTATION_UNKNOWN : orientationForNumber;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public boolean getPowerSourceEnable() {
                return this.powerSourceEnable_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public SKU getSku() {
                SKU skuForNumber = SKU.forNumber(this.sku_);
                return skuForNumber == null ? SKU.SKU_UNKNOWN : skuForNumber;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public boolean hasIncidentDetectionEnable() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public boolean hasMoistureDetectionEnable() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public boolean hasOrientation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public boolean hasPowerSourceEnable() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationOrBuilder
            public boolean hasSku() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
                                    if (SKU.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.sku_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Orientation.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.orientation_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.incidentDetectionEnable_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.powerSourceEnable_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.moistureDetectionEnable_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
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

            public Builder setIncidentDetectionEnable(boolean z14) {
                this.incidentDetectionEnable_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMoistureDetectionEnable(boolean z14) {
                this.moistureDetectionEnable_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setOrientation(Orientation orientation) {
                orientation.getClass();
                this.bitField0_ |= 2;
                this.orientation_ = orientation.getNumber();
                onChanged();
                return this;
            }

            public Builder setPowerSourceEnable(boolean z14) {
                this.powerSourceEnable_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSku(SKU sku) {
                sku.getClass();
                this.bitField0_ |= 1;
                this.sku_ = sku.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Configuration getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sku_ = 0;
                this.orientation_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasSku()) {
                    setSku(configuration.getSku());
                }
                if (configuration.hasOrientation()) {
                    setOrientation(configuration.getOrientation());
                }
                if (configuration.hasIncidentDetectionEnable()) {
                    setIncidentDetectionEnable(configuration.getIncidentDetectionEnable());
                }
                if (configuration.hasPowerSourceEnable()) {
                    setPowerSourceEnable(configuration.getPowerSourceEnable());
                }
                if (configuration.hasMoistureDetectionEnable()) {
                    setMoistureDetectionEnable(configuration.getMoistureDetectionEnable());
                }
                mergeUnknownFields(configuration.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Configuration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Configuration parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Configuration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Configuration parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Configuration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Configuration parseFrom(InputStream inputStream) {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ Configuration(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream) {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private Configuration() {
            this.incidentDetectionEnable_ = false;
            this.powerSourceEnable_ = false;
            this.moistureDetectionEnable_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.sku_ = 0;
            this.orientation_ = 0;
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Orientation implements ProtocolMessageEnum {
            ORIENTATION_UNKNOWN(0),
            ORIENTATION_DYNAMIC(1),
            ORIENTATION_STANDARD(2),
            ORIENTATION_INVERTED(3);

            public static final int ORIENTATION_DYNAMIC_VALUE = 1;
            public static final int ORIENTATION_INVERTED_VALUE = 3;
            public static final int ORIENTATION_STANDARD_VALUE = 2;
            public static final int ORIENTATION_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Orientation> internalValueMap = new Internal.EnumLiteMap<Orientation>() { // from class: com.garmin.proto.generated.GDIVariaDevice.Configuration.Orientation.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Orientation findValueByNumber(int i14) {
                    return Orientation.forNumber(i14);
                }
            };
            private static final Orientation[] VALUES = values();

            Orientation(int i14) {
                this.value = i14;
            }

            public static Orientation forNumber(int i14) {
                if (i14 == 0) {
                    return ORIENTATION_UNKNOWN;
                }
                if (i14 == 1) {
                    return ORIENTATION_DYNAMIC;
                }
                if (i14 == 2) {
                    return ORIENTATION_STANDARD;
                }
                if (i14 != 3) {
                    return null;
                }
                return ORIENTATION_INVERTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Orientation> internalGetValueMap() {
                return internalValueMap;
            }

            public static Orientation valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Orientation valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum SKU implements ProtocolMessageEnum {
            SKU_UNKNOWN(0),
            SKU_WW(1),
            SKU_UK_FRANCE(2),
            SKU_STVZO(3),
            SKU_APAC(4),
            SKU_NA(5);

            public static final int SKU_APAC_VALUE = 4;
            public static final int SKU_NA_VALUE = 5;
            public static final int SKU_STVZO_VALUE = 3;
            public static final int SKU_UK_FRANCE_VALUE = 2;
            public static final int SKU_UNKNOWN_VALUE = 0;
            public static final int SKU_WW_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<SKU> internalValueMap = new Internal.EnumLiteMap<SKU>() { // from class: com.garmin.proto.generated.GDIVariaDevice.Configuration.SKU.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SKU findValueByNumber(int i14) {
                    return SKU.forNumber(i14);
                }
            };
            private static final SKU[] VALUES = values();

            SKU(int i14) {
                this.value = i14;
            }

            public static SKU forNumber(int i14) {
                if (i14 == 0) {
                    return SKU_UNKNOWN;
                }
                if (i14 == 1) {
                    return SKU_WW;
                }
                if (i14 == 2) {
                    return SKU_UK_FRANCE;
                }
                if (i14 == 3) {
                    return SKU_STVZO;
                }
                if (i14 == 4) {
                    return SKU_APAC;
                }
                if (i14 != 5) {
                    return null;
                }
                return SKU_NA;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Configuration.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<SKU> internalGetValueMap() {
                return internalValueMap;
            }

            public static SKU valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SKU valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ConfigurationNotification extends GeneratedMessageV3 implements ConfigurationNotificationOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final ConfigurationNotification DEFAULT_INSTANCE = new ConfigurationNotification();

        @Deprecated
        public static final Parser<ConfigurationNotification> PARSER = new AbstractParser<ConfigurationNotification>() { // from class: com.garmin.proto.generated.GDIVariaDevice.ConfigurationNotification.1
            @Override // com.google.protobuf.Parser
            public ConfigurationNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationNotification.newBuilder();
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
        private int bitField0_;
        private Configuration config_;
        private byte memoizedIsInitialized;

        private ConfigurationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_descriptor;
        }

        public static Builder newBuilder(ConfigurationNotification configurationNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationNotification);
        }

        public static ConfigurationNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationNotification)) {
                return super.equals(obj);
            }
            ConfigurationNotification configurationNotification = (ConfigurationNotification) obj;
            if (hasConfig() != configurationNotification.hasConfig()) {
                return false;
            }
            return (!hasConfig() || getConfig().equals(configurationNotification.getConfig())) && getUnknownFields().equals(configurationNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationNotificationOrBuilder
        public Configuration getConfig() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationNotificationOrBuilder
        public ConfigurationOrBuilder getConfigOrBuilder() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationNotificationOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
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
            return new ConfigurationNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> configBuilder_;
            private Configuration config_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationNotification configurationNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationNotification.config_ = singleFieldBuilderV3 == null ? this.config_ : (Configuration) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationNotification build() {
                ConfigurationNotification configurationNotificationBuildPartial = buildPartial();
                if (configurationNotificationBuildPartial.isInitialized()) {
                    return configurationNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationNotification buildPartial() {
                ConfigurationNotification configurationNotification = new ConfigurationNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationNotification);
                }
                onBuilt();
                return configurationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -2;
                this.config_ = null;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
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

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationNotificationOrBuilder
            public Configuration getConfig() {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Configuration) singleFieldBuilderV3.getMessage();
                }
                Configuration configuration = this.config_;
                return configuration == null ? Configuration.getDefaultInstance() : configuration;
            }

            public Configuration.Builder getConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Configuration.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationNotificationOrBuilder
            public ConfigurationOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Configuration configuration = this.config_;
                return configuration == null ? Configuration.getDefaultInstance() : configuration;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationNotificationOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(Configuration configuration) {
                Configuration configuration2;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configuration);
                } else if ((this.bitField0_ & 1) == 0 || (configuration2 = this.config_) == null || configuration2 == Configuration.getDefaultInstance()) {
                    this.config_ = configuration;
                } else {
                    getConfigBuilder().mergeFrom(configuration);
                }
                if (this.config_ != null) {
                    this.bitField0_ |= 1;
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConfig(Configuration.Builder builder) {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigurationNotification getDefaultInstanceForType() {
                return ConfigurationNotification.getDefaultInstance();
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

            public Builder setConfig(Configuration configuration) {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configuration.getClass();
                    this.config_ = configuration;
                } else {
                    singleFieldBuilderV3.setMessage(configuration);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationNotification) {
                    return mergeFrom((ConfigurationNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationNotification configurationNotification) {
                if (configurationNotification == ConfigurationNotification.getDefaultInstance()) {
                    return this;
                }
                if (configurationNotification.hasConfig()) {
                    mergeConfig(configurationNotification.getConfig());
                }
                mergeUnknownFields(configurationNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigurationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigurationNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(InputStream inputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigurationRequest extends GeneratedMessageV3 implements ConfigurationRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final ConfigurationRequest DEFAULT_INSTANCE = new ConfigurationRequest();

        @Deprecated
        public static final Parser<ConfigurationRequest> PARSER = new AbstractParser<ConfigurationRequest>() { // from class: com.garmin.proto.generated.GDIVariaDevice.ConfigurationRequest.1
            @Override // com.google.protobuf.Parser
            public ConfigurationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationRequest.newBuilder();
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
        private int bitField0_;
        private Configuration config_;
        private byte memoizedIsInitialized;

        private ConfigurationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_descriptor;
        }

        public static Builder newBuilder(ConfigurationRequest configurationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationRequest);
        }

        public static ConfigurationRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationRequest)) {
                return super.equals(obj);
            }
            ConfigurationRequest configurationRequest = (ConfigurationRequest) obj;
            if (hasConfig() != configurationRequest.hasConfig()) {
                return false;
            }
            return (!hasConfig() || getConfig().equals(configurationRequest.getConfig())) && getUnknownFields().equals(configurationRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationRequestOrBuilder
        public Configuration getConfig() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationRequestOrBuilder
        public ConfigurationOrBuilder getConfigOrBuilder() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationRequestOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
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
            return new ConfigurationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> configBuilder_;
            private Configuration config_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationRequest configurationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationRequest.config_ = singleFieldBuilderV3 == null ? this.config_ : (Configuration) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationRequest build() {
                ConfigurationRequest configurationRequestBuildPartial = buildPartial();
                if (configurationRequestBuildPartial.isInitialized()) {
                    return configurationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationRequest buildPartial() {
                ConfigurationRequest configurationRequest = new ConfigurationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationRequest);
                }
                onBuilt();
                return configurationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -2;
                this.config_ = null;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
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

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationRequestOrBuilder
            public Configuration getConfig() {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Configuration) singleFieldBuilderV3.getMessage();
                }
                Configuration configuration = this.config_;
                return configuration == null ? Configuration.getDefaultInstance() : configuration;
            }

            public Configuration.Builder getConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Configuration.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationRequestOrBuilder
            public ConfigurationOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Configuration configuration = this.config_;
                return configuration == null ? Configuration.getDefaultInstance() : configuration;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationRequestOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(Configuration configuration) {
                Configuration configuration2;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configuration);
                } else if ((this.bitField0_ & 1) == 0 || (configuration2 = this.config_) == null || configuration2 == Configuration.getDefaultInstance()) {
                    this.config_ = configuration;
                } else {
                    getConfigBuilder().mergeFrom(configuration);
                }
                if (this.config_ != null) {
                    this.bitField0_ |= 1;
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConfig(Configuration.Builder builder) {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigurationRequest getDefaultInstanceForType() {
                return ConfigurationRequest.getDefaultInstance();
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

            public Builder setConfig(Configuration configuration) {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configuration.getClass();
                    this.config_ = configuration;
                } else {
                    singleFieldBuilderV3.setMessage(configuration);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationRequest) {
                    return mergeFrom((ConfigurationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationRequest configurationRequest) {
                if (configurationRequest == ConfigurationRequest.getDefaultInstance()) {
                    return this;
                }
                if (configurationRequest.hasConfig()) {
                    mergeConfig(configurationRequest.getConfig());
                }
                mergeUnknownFields(configurationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigurationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigurationRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(InputStream inputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigurationResponse extends GeneratedMessageV3 implements ConfigurationResponseOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        private static final ConfigurationResponse DEFAULT_INSTANCE = new ConfigurationResponse();

        @Deprecated
        public static final Parser<ConfigurationResponse> PARSER = new AbstractParser<ConfigurationResponse>() { // from class: com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponse.1
            @Override // com.google.protobuf.Parser
            public ConfigurationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationResponse.newBuilder();
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
        private Configuration config_;
        private byte memoizedIsInitialized;
        private int status_;

        private ConfigurationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_descriptor;
        }

        public static Builder newBuilder(ConfigurationResponse configurationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationResponse);
        }

        public static ConfigurationResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationResponse)) {
                return super.equals(obj);
            }
            ConfigurationResponse configurationResponse = (ConfigurationResponse) obj;
            if (hasStatus() != configurationResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == configurationResponse.status_) && hasConfig() == configurationResponse.hasConfig()) {
                return (!hasConfig() || getConfig().equals(configurationResponse.getConfig())) && getUnknownFields().equals(configurationResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
        public Configuration getConfig() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
        public ConfigurationOrBuilder getConfigOrBuilder() {
            Configuration configuration = this.config_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getConfig());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
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
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
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
            return new ConfigurationResponse();
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
                codedOutputStream.writeMessage(2, getConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> configBuilder_;
            private Configuration config_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationResponse configurationResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    configurationResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationResponse.config_ = singleFieldBuilderV3 == null ? this.config_ : (Configuration) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                configurationResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationResponse build() {
                ConfigurationResponse configurationResponseBuildPartial = buildPartial();
                if (configurationResponseBuildPartial.isInitialized()) {
                    return configurationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationResponse buildPartial() {
                ConfigurationResponse configurationResponse = new ConfigurationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationResponse);
                }
                onBuilt();
                return configurationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -3;
                this.config_ = null;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
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

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
            public Configuration getConfig() {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Configuration) singleFieldBuilderV3.getMessage();
                }
                Configuration configuration = this.config_;
                return configuration == null ? Configuration.getDefaultInstance() : configuration;
            }

            public Configuration.Builder getConfigBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Configuration.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
            public ConfigurationOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Configuration configuration = this.config_;
                return configuration == null ? Configuration.getDefaultInstance() : configuration;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ConfigurationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(Configuration configuration) {
                Configuration configuration2;
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configuration);
                } else if ((this.bitField0_ & 2) == 0 || (configuration2 = this.config_) == null || configuration2 == Configuration.getDefaultInstance()) {
                    this.config_ = configuration;
                } else {
                    getConfigBuilder().mergeFrom(configuration);
                }
                if (this.config_ != null) {
                    this.bitField0_ |= 2;
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
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
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

            public Builder setConfig(Configuration.Builder builder) {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
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

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigurationResponse getDefaultInstanceForType() {
                return ConfigurationResponse.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setConfig(Configuration configuration) {
                SingleFieldBuilderV3<Configuration, Configuration.Builder, ConfigurationOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configuration.getClass();
                    this.config_ = configuration;
                } else {
                    singleFieldBuilderV3.setMessage(configuration);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationResponse) {
                    return mergeFrom((ConfigurationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationResponse configurationResponse) {
                if (configurationResponse == ConfigurationResponse.getDefaultInstance()) {
                    return this;
                }
                if (configurationResponse.hasStatus()) {
                    setStatus(configurationResponse.getStatus());
                }
                if (configurationResponse.hasConfig()) {
                    mergeConfig(configurationResponse.getConfig());
                }
                mergeUnknownFields(configurationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigurationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConfigurationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigurationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigurationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(InputStream inputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeviceStatusNotification extends GeneratedMessageV3 implements DeviceStatusNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1020;
        public static final int FAULTS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DeviceFaults faults_;
        private byte memoizedIsInitialized;
        private DeviceStatus status_;
        private static final DeviceStatusNotification DEFAULT_INSTANCE = new DeviceStatusNotification();

        @Deprecated
        public static final Parser<DeviceStatusNotification> PARSER = new AbstractParser<DeviceStatusNotification>() { // from class: com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotification.1
            @Override // com.google.protobuf.Parser
            public DeviceStatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceStatusNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, DeviceStatusNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, DeviceStatusNotification.class, getDefaultInstance());

        private DeviceStatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_descriptor;
        }

        public static Builder newBuilder(DeviceStatusNotification deviceStatusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceStatusNotification);
        }

        public static DeviceStatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (DeviceStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceStatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceStatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceStatusNotification)) {
                return super.equals(obj);
            }
            DeviceStatusNotification deviceStatusNotification = (DeviceStatusNotification) obj;
            if (hasStatus() != deviceStatusNotification.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || getStatus().equals(deviceStatusNotification.getStatus())) && hasFaults() == deviceStatusNotification.hasFaults()) {
                return (!hasFaults() || getFaults().equals(deviceStatusNotification.getFaults())) && getUnknownFields().equals(deviceStatusNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
        public DeviceFaults getFaults() {
            DeviceFaults deviceFaults = this.faults_;
            return deviceFaults == null ? DeviceFaults.getDefaultInstance() : deviceFaults;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
        public DeviceFaultsOrBuilder getFaultsOrBuilder() {
            DeviceFaults deviceFaults = this.faults_;
            return deviceFaults == null ? DeviceFaults.getDefaultInstance() : deviceFaults;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceStatusNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStatus()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getFaults());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
        public DeviceStatus getStatus() {
            DeviceStatus deviceStatus = this.status_;
            return deviceStatus == null ? DeviceStatus.getDefaultInstance() : deviceStatus;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
        public DeviceStatusOrBuilder getStatusOrBuilder() {
            DeviceStatus deviceStatus = this.status_;
            return deviceStatus == null ? DeviceStatus.getDefaultInstance() : deviceStatus;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
        public boolean hasFaults() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatus().hashCode();
            }
            if (hasFaults()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFaults().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatusNotification.class, Builder.class);
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
            return new DeviceStatusNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getStatus());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getFaults());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceStatusNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> faultsBuilder_;
            private DeviceFaults faults_;
            private SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> statusBuilder_;
            private DeviceStatus status_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DeviceStatusNotification deviceStatusNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                    deviceStatusNotification.status_ = singleFieldBuilderV3 == null ? this.status_ : (DeviceStatus) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV4 = this.faultsBuilder_;
                    deviceStatusNotification.faults_ = singleFieldBuilderV4 == null ? this.faults_ : (DeviceFaults) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                deviceStatusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_descriptor;
            }

            private SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> getFaultsFieldBuilder() {
                if (this.faultsBuilder_ == null) {
                    this.faultsBuilder_ = new SingleFieldBuilderV3<>(getFaults(), getParentForChildren(), isClean());
                    this.faults_ = null;
                }
                return this.faultsBuilder_;
            }

            private SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> getStatusFieldBuilder() {
                if (this.statusBuilder_ == null) {
                    this.statusBuilder_ = new SingleFieldBuilderV3<>(getStatus(), getParentForChildren(), isClean());
                    this.status_ = null;
                }
                return this.statusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStatusFieldBuilder();
                    getFaultsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatusNotification build() {
                DeviceStatusNotification deviceStatusNotificationBuildPartial = buildPartial();
                if (deviceStatusNotificationBuildPartial.isInitialized()) {
                    return deviceStatusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceStatusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatusNotification buildPartial() {
                DeviceStatusNotification deviceStatusNotification = new DeviceStatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceStatusNotification);
                }
                onBuilt();
                return deviceStatusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = null;
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
                }
                this.faults_ = null;
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV4 = this.faultsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.faultsBuilder_ = null;
                }
                return this;
            }

            public Builder clearFaults() {
                this.bitField0_ &= -3;
                this.faults_ = null;
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.faultsBuilder_ = null;
                }
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
                this.status_ = null;
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
                }
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
            public DeviceFaults getFaults() {
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceFaults) singleFieldBuilderV3.getMessage();
                }
                DeviceFaults deviceFaults = this.faults_;
                return deviceFaults == null ? DeviceFaults.getDefaultInstance() : deviceFaults;
            }

            public DeviceFaults.Builder getFaultsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DeviceFaults.Builder) getFaultsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
            public DeviceFaultsOrBuilder getFaultsOrBuilder() {
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceFaultsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceFaults deviceFaults = this.faults_;
                return deviceFaults == null ? DeviceFaults.getDefaultInstance() : deviceFaults;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
            public DeviceStatus getStatus() {
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatus) singleFieldBuilderV3.getMessage();
                }
                DeviceStatus deviceStatus = this.status_;
                return deviceStatus == null ? DeviceStatus.getDefaultInstance() : deviceStatus;
            }

            public DeviceStatus.Builder getStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DeviceStatus.Builder) getStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
            public DeviceStatusOrBuilder getStatusOrBuilder() {
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceStatus deviceStatus = this.status_;
                return deviceStatus == null ? DeviceStatus.getDefaultInstance() : deviceStatus;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
            public boolean hasFaults() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatusNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFaults(DeviceFaults deviceFaults) {
                DeviceFaults deviceFaults2;
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceFaults);
                } else if ((this.bitField0_ & 2) == 0 || (deviceFaults2 = this.faults_) == null || deviceFaults2 == DeviceFaults.getDefaultInstance()) {
                    this.faults_ = deviceFaults;
                } else {
                    getFaultsBuilder().mergeFrom(deviceFaults);
                }
                if (this.faults_ != null) {
                    this.bitField0_ |= 2;
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getFaultsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
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

            public Builder mergeStatus(DeviceStatus deviceStatus) {
                DeviceStatus deviceStatus2;
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceStatus);
                } else if ((this.bitField0_ & 1) == 0 || (deviceStatus2 = this.status_) == null || deviceStatus2 == DeviceStatus.getDefaultInstance()) {
                    this.status_ = deviceStatus;
                } else {
                    getStatusBuilder().mergeFrom(deviceStatus);
                }
                if (this.status_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setFaults(DeviceFaults.Builder builder) {
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.faults_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
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

            public Builder setStatus(DeviceStatus.Builder builder) {
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.status_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeviceStatusNotification getDefaultInstanceForType() {
                return DeviceStatusNotification.getDefaultInstance();
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

            public Builder setFaults(DeviceFaults deviceFaults) {
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceFaults.getClass();
                    this.faults_ = deviceFaults;
                } else {
                    singleFieldBuilderV3.setMessage(deviceFaults);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStatus(DeviceStatus deviceStatus) {
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceStatus.getClass();
                    this.status_ = deviceStatus;
                } else {
                    singleFieldBuilderV3.setMessage(deviceStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceStatusNotification) {
                    return mergeFrom((DeviceStatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceStatusNotification deviceStatusNotification) {
                if (deviceStatusNotification == DeviceStatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (deviceStatusNotification.hasStatus()) {
                    mergeStatus(deviceStatusNotification.getStatus());
                }
                if (deviceStatusNotification.hasFaults()) {
                    mergeFaults(deviceStatusNotification.getFaults());
                }
                mergeUnknownFields(deviceStatusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceStatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceStatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceStatusNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceStatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceStatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceStatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceStatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceStatusNotification parseFrom(InputStream inputStream) {
            return (DeviceStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceStatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (DeviceStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceStatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeviceStatusResponse extends GeneratedMessageV3 implements DeviceStatusResponseOrBuilder {
        public static final int FAULTS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DeviceFaults faults_;
        private byte memoizedIsInitialized;
        private DeviceStatus status_;
        private static final DeviceStatusResponse DEFAULT_INSTANCE = new DeviceStatusResponse();

        @Deprecated
        public static final Parser<DeviceStatusResponse> PARSER = new AbstractParser<DeviceStatusResponse>() { // from class: com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponse.1
            @Override // com.google.protobuf.Parser
            public DeviceStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceStatusResponse.newBuilder();
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

        private DeviceStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_descriptor;
        }

        public static Builder newBuilder(DeviceStatusResponse deviceStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceStatusResponse);
        }

        public static DeviceStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (DeviceStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceStatusResponse)) {
                return super.equals(obj);
            }
            DeviceStatusResponse deviceStatusResponse = (DeviceStatusResponse) obj;
            if (hasStatus() != deviceStatusResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || getStatus().equals(deviceStatusResponse.getStatus())) && hasFaults() == deviceStatusResponse.hasFaults()) {
                return (!hasFaults() || getFaults().equals(deviceStatusResponse.getFaults())) && getUnknownFields().equals(deviceStatusResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
        public DeviceFaults getFaults() {
            DeviceFaults deviceFaults = this.faults_;
            return deviceFaults == null ? DeviceFaults.getDefaultInstance() : deviceFaults;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
        public DeviceFaultsOrBuilder getFaultsOrBuilder() {
            DeviceFaults deviceFaults = this.faults_;
            return deviceFaults == null ? DeviceFaults.getDefaultInstance() : deviceFaults;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStatus()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getFaults());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
        public DeviceStatus getStatus() {
            DeviceStatus deviceStatus = this.status_;
            return deviceStatus == null ? DeviceStatus.getDefaultInstance() : deviceStatus;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
        public DeviceStatusOrBuilder getStatusOrBuilder() {
            DeviceStatus deviceStatus = this.status_;
            return deviceStatus == null ? DeviceStatus.getDefaultInstance() : deviceStatus;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
        public boolean hasFaults() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatus().hashCode();
            }
            if (hasFaults()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFaults().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatusResponse.class, Builder.class);
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
            return new DeviceStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getStatus());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getFaults());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceStatusResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> faultsBuilder_;
            private DeviceFaults faults_;
            private SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> statusBuilder_;
            private DeviceStatus status_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DeviceStatusResponse deviceStatusResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                    deviceStatusResponse.status_ = singleFieldBuilderV3 == null ? this.status_ : (DeviceStatus) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV4 = this.faultsBuilder_;
                    deviceStatusResponse.faults_ = singleFieldBuilderV4 == null ? this.faults_ : (DeviceFaults) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                deviceStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_descriptor;
            }

            private SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> getFaultsFieldBuilder() {
                if (this.faultsBuilder_ == null) {
                    this.faultsBuilder_ = new SingleFieldBuilderV3<>(getFaults(), getParentForChildren(), isClean());
                    this.faults_ = null;
                }
                return this.faultsBuilder_;
            }

            private SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> getStatusFieldBuilder() {
                if (this.statusBuilder_ == null) {
                    this.statusBuilder_ = new SingleFieldBuilderV3<>(getStatus(), getParentForChildren(), isClean());
                    this.status_ = null;
                }
                return this.statusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStatusFieldBuilder();
                    getFaultsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatusResponse build() {
                DeviceStatusResponse deviceStatusResponseBuildPartial = buildPartial();
                if (deviceStatusResponseBuildPartial.isInitialized()) {
                    return deviceStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceStatusResponse buildPartial() {
                DeviceStatusResponse deviceStatusResponse = new DeviceStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceStatusResponse);
                }
                onBuilt();
                return deviceStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = null;
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
                }
                this.faults_ = null;
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV4 = this.faultsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.faultsBuilder_ = null;
                }
                return this;
            }

            public Builder clearFaults() {
                this.bitField0_ &= -3;
                this.faults_ = null;
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.faultsBuilder_ = null;
                }
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
                this.status_ = null;
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
                }
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
            public DeviceFaults getFaults() {
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceFaults) singleFieldBuilderV3.getMessage();
                }
                DeviceFaults deviceFaults = this.faults_;
                return deviceFaults == null ? DeviceFaults.getDefaultInstance() : deviceFaults;
            }

            public DeviceFaults.Builder getFaultsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DeviceFaults.Builder) getFaultsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
            public DeviceFaultsOrBuilder getFaultsOrBuilder() {
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceFaultsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceFaults deviceFaults = this.faults_;
                return deviceFaults == null ? DeviceFaults.getDefaultInstance() : deviceFaults;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
            public DeviceStatus getStatus() {
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatus) singleFieldBuilderV3.getMessage();
                }
                DeviceStatus deviceStatus = this.status_;
                return deviceStatus == null ? DeviceStatus.getDefaultInstance() : deviceStatus;
            }

            public DeviceStatus.Builder getStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DeviceStatus.Builder) getStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
            public DeviceStatusOrBuilder getStatusOrBuilder() {
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceStatus deviceStatus = this.status_;
                return deviceStatus == null ? DeviceStatus.getDefaultInstance() : deviceStatus;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
            public boolean hasFaults() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.DeviceStatusResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_DeviceStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceStatusResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFaults(DeviceFaults deviceFaults) {
                DeviceFaults deviceFaults2;
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceFaults);
                } else if ((this.bitField0_ & 2) == 0 || (deviceFaults2 = this.faults_) == null || deviceFaults2 == DeviceFaults.getDefaultInstance()) {
                    this.faults_ = deviceFaults;
                } else {
                    getFaultsBuilder().mergeFrom(deviceFaults);
                }
                if (this.faults_ != null) {
                    this.bitField0_ |= 2;
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getFaultsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
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

            public Builder mergeStatus(DeviceStatus deviceStatus) {
                DeviceStatus deviceStatus2;
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceStatus);
                } else if ((this.bitField0_ & 1) == 0 || (deviceStatus2 = this.status_) == null || deviceStatus2 == DeviceStatus.getDefaultInstance()) {
                    this.status_ = deviceStatus;
                } else {
                    getStatusBuilder().mergeFrom(deviceStatus);
                }
                if (this.status_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setFaults(DeviceFaults.Builder builder) {
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.faults_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
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

            public Builder setStatus(DeviceStatus.Builder builder) {
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.status_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeviceStatusResponse getDefaultInstanceForType() {
                return DeviceStatusResponse.getDefaultInstance();
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

            public Builder setFaults(DeviceFaults deviceFaults) {
                SingleFieldBuilderV3<DeviceFaults, DeviceFaults.Builder, DeviceFaultsOrBuilder> singleFieldBuilderV3 = this.faultsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceFaults.getClass();
                    this.faults_ = deviceFaults;
                } else {
                    singleFieldBuilderV3.setMessage(deviceFaults);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStatus(DeviceStatus deviceStatus) {
                SingleFieldBuilderV3<DeviceStatus, DeviceStatus.Builder, DeviceStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceStatus.getClass();
                    this.status_ = deviceStatus;
                } else {
                    singleFieldBuilderV3.setMessage(deviceStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceStatusResponse) {
                    return mergeFrom((DeviceStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceStatusResponse deviceStatusResponse) {
                if (deviceStatusResponse == DeviceStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (deviceStatusResponse.hasStatus()) {
                    mergeStatus(deviceStatusResponse.getStatus());
                }
                if (deviceStatusResponse.hasFaults()) {
                    mergeFaults(deviceStatusResponse.getFaults());
                }
                mergeUnknownFields(deviceStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceStatusResponse parseFrom(InputStream inputStream) {
            return (DeviceStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (DeviceStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ModeNotification extends GeneratedMessageV3 implements ModeNotificationOrBuilder {
        public static final int MODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private static final ModeNotification DEFAULT_INSTANCE = new ModeNotification();

        @Deprecated
        public static final Parser<ModeNotification> PARSER = new AbstractParser<ModeNotification>() { // from class: com.garmin.proto.generated.GDIVariaDevice.ModeNotification.1
            @Override // com.google.protobuf.Parser
            public ModeNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ModeNotification.newBuilder();
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

        private ModeNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ModeNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeNotification_descriptor;
        }

        public static Builder newBuilder(ModeNotification modeNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(modeNotification);
        }

        public static ModeNotification parseDelimitedFrom(InputStream inputStream) {
            return (ModeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ModeNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ModeNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ModeNotification)) {
                return super.equals(obj);
            }
            ModeNotification modeNotification = (ModeNotification) obj;
            if (hasMode() != modeNotification.hasMode()) {
                return false;
            }
            return (!hasMode() || this.mode_ == modeNotification.mode_) && getUnknownFields().equals(modeNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ModeNotificationOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ModeNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.mode_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ModeNotificationOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.mode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeNotification.class, Builder.class);
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
            return new ModeNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.mode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ModeNotificationOrBuilder {
            private int bitField0_;
            private int mode_;

            private Builder() {
                this.mode_ = 0;
            }

            private void buildPartial0(ModeNotification modeNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    modeNotification.mode_ = this.mode_;
                } else {
                    i14 = 0;
                }
                modeNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ModeNotification build() {
                ModeNotification modeNotificationBuildPartial = buildPartial();
                if (modeNotificationBuildPartial.isInitialized()) {
                    return modeNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) modeNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ModeNotification buildPartial() {
                ModeNotification modeNotification = new ModeNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(modeNotification);
                }
                onBuilt();
                return modeNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mode_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMode() {
                this.bitField0_ &= -2;
                this.mode_ = 0;
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ModeNotificationOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ModeNotificationOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeNotification.class, Builder.class);
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
                                    if (Mode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.mode_ = i14;
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

            public Builder setMode(Mode mode) {
                mode.getClass();
                this.bitField0_ |= 1;
                this.mode_ = mode.getNumber();
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
            public ModeNotification getDefaultInstanceForType() {
                return ModeNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ModeNotification) {
                    return mergeFrom((ModeNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ModeNotification modeNotification) {
                if (modeNotification == ModeNotification.getDefaultInstance()) {
                    return this;
                }
                if (modeNotification.hasMode()) {
                    setMode(modeNotification.getMode());
                }
                mergeUnknownFields(modeNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ModeNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ModeNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ModeNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ModeNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ModeNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ModeNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.mode_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ModeNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ModeNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ModeNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ModeNotification parseFrom(InputStream inputStream) {
            return (ModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ModeNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ModeNotification parseFrom(CodedInputStream codedInputStream) {
            return (ModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ModeNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ModeRequest extends GeneratedMessageV3 implements ModeRequestOrBuilder {
        public static final int MODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private static final ModeRequest DEFAULT_INSTANCE = new ModeRequest();

        @Deprecated
        public static final Parser<ModeRequest> PARSER = new AbstractParser<ModeRequest>() { // from class: com.garmin.proto.generated.GDIVariaDevice.ModeRequest.1
            @Override // com.google.protobuf.Parser
            public ModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ModeRequest.newBuilder();
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

        private ModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeRequest_descriptor;
        }

        public static Builder newBuilder(ModeRequest modeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(modeRequest);
        }

        public static ModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (ModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ModeRequest)) {
                return super.equals(obj);
            }
            ModeRequest modeRequest = (ModeRequest) obj;
            if (hasMode() != modeRequest.hasMode()) {
                return false;
            }
            return (!hasMode() || this.mode_ == modeRequest.mode_) && getUnknownFields().equals(modeRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ModeRequestOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ModeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.mode_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ModeRequestOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.mode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeRequest.class, Builder.class);
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
            return new ModeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.mode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ModeRequestOrBuilder {
            private int bitField0_;
            private int mode_;

            private Builder() {
                this.mode_ = 0;
            }

            private void buildPartial0(ModeRequest modeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    modeRequest.mode_ = this.mode_;
                } else {
                    i14 = 0;
                }
                modeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ModeRequest build() {
                ModeRequest modeRequestBuildPartial = buildPartial();
                if (modeRequestBuildPartial.isInitialized()) {
                    return modeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) modeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ModeRequest buildPartial() {
                ModeRequest modeRequest = new ModeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(modeRequest);
                }
                onBuilt();
                return modeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mode_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMode() {
                this.bitField0_ &= -2;
                this.mode_ = 0;
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ModeRequestOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ModeRequestOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeRequest.class, Builder.class);
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
                                    if (Mode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.mode_ = i14;
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

            public Builder setMode(Mode mode) {
                mode.getClass();
                this.bitField0_ |= 1;
                this.mode_ = mode.getNumber();
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
            public ModeRequest getDefaultInstanceForType() {
                return ModeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ModeRequest) {
                    return mergeFrom((ModeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ModeRequest modeRequest) {
                if (modeRequest == ModeRequest.getDefaultInstance()) {
                    return this;
                }
                if (modeRequest.hasMode()) {
                    setMode(modeRequest.getMode());
                }
                mergeUnknownFields(modeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ModeRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.mode_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ModeRequest parseFrom(InputStream inputStream) {
            return (ModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (ModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ModeResponse extends GeneratedMessageV3 implements ModeResponseOrBuilder {
        public static final int MODE_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private int status_;
        private static final ModeResponse DEFAULT_INSTANCE = new ModeResponse();

        @Deprecated
        public static final Parser<ModeResponse> PARSER = new AbstractParser<ModeResponse>() { // from class: com.garmin.proto.generated.GDIVariaDevice.ModeResponse.1
            @Override // com.google.protobuf.Parser
            public ModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ModeResponse.newBuilder();
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

        private ModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeResponse_descriptor;
        }

        public static Builder newBuilder(ModeResponse modeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(modeResponse);
        }

        public static ModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (ModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ModeResponse)) {
                return super.equals(obj);
            }
            ModeResponse modeResponse = (ModeResponse) obj;
            if (hasStatus() != modeResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == modeResponse.status_) && hasMode() == modeResponse.hasMode()) {
                return (!hasMode() || this.mode_ == modeResponse.mode_) && getUnknownFields().equals(modeResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ModeResponseOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ModeResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.mode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ModeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ModeResponseOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ModeResponseOrBuilder
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
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.mode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeResponse.class, Builder.class);
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
            return new ModeResponse();
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
                codedOutputStream.writeEnum(2, this.mode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ModeResponseOrBuilder {
            private int bitField0_;
            private int mode_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.mode_ = 0;
            }

            private void buildPartial0(ModeResponse modeResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    modeResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    modeResponse.mode_ = this.mode_;
                    i14 |= 2;
                }
                modeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ModeResponse build() {
                ModeResponse modeResponseBuildPartial = buildPartial();
                if (modeResponseBuildPartial.isInitialized()) {
                    return modeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) modeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ModeResponse buildPartial() {
                ModeResponse modeResponse = new ModeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(modeResponse);
                }
                onBuilt();
                return modeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.mode_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMode() {
                this.bitField0_ &= -3;
                this.mode_ = 0;
                onChanged();
                return this;
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
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ModeResponseOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ModeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ModeResponseOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ModeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_ModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeResponse.class, Builder.class);
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
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Mode.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.mode_ = i15;
                                        this.bitField0_ |= 2;
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

            public Builder setMode(Mode mode) {
                mode.getClass();
                this.bitField0_ |= 2;
                this.mode_ = mode.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ModeResponse getDefaultInstanceForType() {
                return ModeResponse.getDefaultInstance();
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
                this.mode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ModeResponse) {
                    return mergeFrom((ModeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ModeResponse modeResponse) {
                if (modeResponse == ModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (modeResponse.hasStatus()) {
                    setStatus(modeResponse.getStatus());
                }
                if (modeResponse.hasMode()) {
                    setMode(modeResponse.getMode());
                }
                mergeUnknownFields(modeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.mode_ = 0;
        }

        public static ModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ModeResponse parseFrom(InputStream inputStream) {
            return (ModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (ModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CONFIGURE_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int CONFIGURE_REQUEST_FIELD_NUMBER = 1;
        public static final int CONFIGURE_RESPONSE_FIELD_NUMBER = 2;
        public static final int MODE_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int MODE_REQUEST_FIELD_NUMBER = 4;
        public static final int MODE_RESPONSE_FIELD_NUMBER = 5;
        public static final int STATUS_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int STATUS_REQUEST_FIELD_NUMBER = 7;
        public static final int STATUS_RESPONSE_FIELD_NUMBER = 8;
        public static final int VAULT_UPLOAD_ENABLE_NOTIFICATION_FIELD_NUMBER = 12;
        public static final int VAULT_UPLOAD_ENABLE_REQUEST_FIELD_NUMBER = 10;
        public static final int VAULT_UPLOAD_ENABLE_RESPONSE_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConfigurationNotification configureNotification_;
        private ConfigurationRequest configureRequest_;
        private ConfigurationResponse configureResponse_;
        private byte memoizedIsInitialized;
        private ModeNotification modeNotification_;
        private ModeRequest modeRequest_;
        private ModeResponse modeResponse_;
        private DeviceStatusNotification statusNotification_;
        private DeviceStatusRequest statusRequest_;
        private DeviceStatusResponse statusResponse_;
        private VaultUploadEnableNotification vaultUploadEnableNotification_;
        private VaultUploadEnableRequest vaultUploadEnableRequest_;
        private VaultUploadEnableResponse vaultUploadEnableResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIVariaDevice.Service.1
            @Override // com.google.protobuf.Parser
            public Service parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Service.newBuilder();
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

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Service_descriptor;
        }

        public static Builder newBuilder(Service service) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(service);
        }

        public static Service parseDelimitedFrom(InputStream inputStream) {
            return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Service parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Service> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Service)) {
                return super.equals(obj);
            }
            Service service = (Service) obj;
            if (hasConfigureRequest() != service.hasConfigureRequest()) {
                return false;
            }
            if ((hasConfigureRequest() && !getConfigureRequest().equals(service.getConfigureRequest())) || hasConfigureResponse() != service.hasConfigureResponse()) {
                return false;
            }
            if ((hasConfigureResponse() && !getConfigureResponse().equals(service.getConfigureResponse())) || hasConfigureNotification() != service.hasConfigureNotification()) {
                return false;
            }
            if ((hasConfigureNotification() && !getConfigureNotification().equals(service.getConfigureNotification())) || hasModeRequest() != service.hasModeRequest()) {
                return false;
            }
            if ((hasModeRequest() && !getModeRequest().equals(service.getModeRequest())) || hasModeResponse() != service.hasModeResponse()) {
                return false;
            }
            if ((hasModeResponse() && !getModeResponse().equals(service.getModeResponse())) || hasModeNotification() != service.hasModeNotification()) {
                return false;
            }
            if ((hasModeNotification() && !getModeNotification().equals(service.getModeNotification())) || hasStatusRequest() != service.hasStatusRequest()) {
                return false;
            }
            if ((hasStatusRequest() && !getStatusRequest().equals(service.getStatusRequest())) || hasStatusResponse() != service.hasStatusResponse()) {
                return false;
            }
            if ((hasStatusResponse() && !getStatusResponse().equals(service.getStatusResponse())) || hasStatusNotification() != service.hasStatusNotification()) {
                return false;
            }
            if ((hasStatusNotification() && !getStatusNotification().equals(service.getStatusNotification())) || hasVaultUploadEnableRequest() != service.hasVaultUploadEnableRequest()) {
                return false;
            }
            if ((hasVaultUploadEnableRequest() && !getVaultUploadEnableRequest().equals(service.getVaultUploadEnableRequest())) || hasVaultUploadEnableResponse() != service.hasVaultUploadEnableResponse()) {
                return false;
            }
            if ((!hasVaultUploadEnableResponse() || getVaultUploadEnableResponse().equals(service.getVaultUploadEnableResponse())) && hasVaultUploadEnableNotification() == service.hasVaultUploadEnableNotification()) {
                return (!hasVaultUploadEnableNotification() || getVaultUploadEnableNotification().equals(service.getVaultUploadEnableNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ConfigurationNotification getConfigureNotification() {
            ConfigurationNotification configurationNotification = this.configureNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ConfigurationNotificationOrBuilder getConfigureNotificationOrBuilder() {
            ConfigurationNotification configurationNotification = this.configureNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ConfigurationRequest getConfigureRequest() {
            ConfigurationRequest configurationRequest = this.configureRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ConfigurationRequestOrBuilder getConfigureRequestOrBuilder() {
            ConfigurationRequest configurationRequest = this.configureRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ConfigurationResponse getConfigureResponse() {
            ConfigurationResponse configurationResponse = this.configureResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ConfigurationResponseOrBuilder getConfigureResponseOrBuilder() {
            ConfigurationResponse configurationResponse = this.configureResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ModeNotification getModeNotification() {
            ModeNotification modeNotification = this.modeNotification_;
            return modeNotification == null ? ModeNotification.getDefaultInstance() : modeNotification;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ModeNotificationOrBuilder getModeNotificationOrBuilder() {
            ModeNotification modeNotification = this.modeNotification_;
            return modeNotification == null ? ModeNotification.getDefaultInstance() : modeNotification;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ModeRequest getModeRequest() {
            ModeRequest modeRequest = this.modeRequest_;
            return modeRequest == null ? ModeRequest.getDefaultInstance() : modeRequest;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ModeRequestOrBuilder getModeRequestOrBuilder() {
            ModeRequest modeRequest = this.modeRequest_;
            return modeRequest == null ? ModeRequest.getDefaultInstance() : modeRequest;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ModeResponse getModeResponse() {
            ModeResponse modeResponse = this.modeResponse_;
            return modeResponse == null ? ModeResponse.getDefaultInstance() : modeResponse;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public ModeResponseOrBuilder getModeResponseOrBuilder() {
            ModeResponse modeResponse = this.modeResponse_;
            return modeResponse == null ? ModeResponse.getDefaultInstance() : modeResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfigureRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConfigureResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConfigureNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getModeRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getModeResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getModeNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getStatusRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getStatusResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getStatusNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getVaultUploadEnableRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getVaultUploadEnableResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getVaultUploadEnableNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public DeviceStatusNotification getStatusNotification() {
            DeviceStatusNotification deviceStatusNotification = this.statusNotification_;
            return deviceStatusNotification == null ? DeviceStatusNotification.getDefaultInstance() : deviceStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public DeviceStatusNotificationOrBuilder getStatusNotificationOrBuilder() {
            DeviceStatusNotification deviceStatusNotification = this.statusNotification_;
            return deviceStatusNotification == null ? DeviceStatusNotification.getDefaultInstance() : deviceStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public DeviceStatusRequest getStatusRequest() {
            DeviceStatusRequest deviceStatusRequest = this.statusRequest_;
            return deviceStatusRequest == null ? DeviceStatusRequest.getDefaultInstance() : deviceStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public DeviceStatusRequestOrBuilder getStatusRequestOrBuilder() {
            DeviceStatusRequest deviceStatusRequest = this.statusRequest_;
            return deviceStatusRequest == null ? DeviceStatusRequest.getDefaultInstance() : deviceStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public DeviceStatusResponse getStatusResponse() {
            DeviceStatusResponse deviceStatusResponse = this.statusResponse_;
            return deviceStatusResponse == null ? DeviceStatusResponse.getDefaultInstance() : deviceStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public DeviceStatusResponseOrBuilder getStatusResponseOrBuilder() {
            DeviceStatusResponse deviceStatusResponse = this.statusResponse_;
            return deviceStatusResponse == null ? DeviceStatusResponse.getDefaultInstance() : deviceStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public VaultUploadEnableNotification getVaultUploadEnableNotification() {
            VaultUploadEnableNotification vaultUploadEnableNotification = this.vaultUploadEnableNotification_;
            return vaultUploadEnableNotification == null ? VaultUploadEnableNotification.getDefaultInstance() : vaultUploadEnableNotification;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public VaultUploadEnableNotificationOrBuilder getVaultUploadEnableNotificationOrBuilder() {
            VaultUploadEnableNotification vaultUploadEnableNotification = this.vaultUploadEnableNotification_;
            return vaultUploadEnableNotification == null ? VaultUploadEnableNotification.getDefaultInstance() : vaultUploadEnableNotification;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public VaultUploadEnableRequest getVaultUploadEnableRequest() {
            VaultUploadEnableRequest vaultUploadEnableRequest = this.vaultUploadEnableRequest_;
            return vaultUploadEnableRequest == null ? VaultUploadEnableRequest.getDefaultInstance() : vaultUploadEnableRequest;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public VaultUploadEnableRequestOrBuilder getVaultUploadEnableRequestOrBuilder() {
            VaultUploadEnableRequest vaultUploadEnableRequest = this.vaultUploadEnableRequest_;
            return vaultUploadEnableRequest == null ? VaultUploadEnableRequest.getDefaultInstance() : vaultUploadEnableRequest;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public VaultUploadEnableResponse getVaultUploadEnableResponse() {
            VaultUploadEnableResponse vaultUploadEnableResponse = this.vaultUploadEnableResponse_;
            return vaultUploadEnableResponse == null ? VaultUploadEnableResponse.getDefaultInstance() : vaultUploadEnableResponse;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public VaultUploadEnableResponseOrBuilder getVaultUploadEnableResponseOrBuilder() {
            VaultUploadEnableResponse vaultUploadEnableResponse = this.vaultUploadEnableResponse_;
            return vaultUploadEnableResponse == null ? VaultUploadEnableResponse.getDefaultInstance() : vaultUploadEnableResponse;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasConfigureNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasConfigureRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasConfigureResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasModeNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasModeRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasModeResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasStatusNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasStatusRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasStatusResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasVaultUploadEnableNotification() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasVaultUploadEnableRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
        public boolean hasVaultUploadEnableResponse() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfigureRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfigureRequest().hashCode();
            }
            if (hasConfigureResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfigureResponse().hashCode();
            }
            if (hasConfigureNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConfigureNotification().hashCode();
            }
            if (hasModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getModeRequest().hashCode();
            }
            if (hasModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getModeResponse().hashCode();
            }
            if (hasModeNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getModeNotification().hashCode();
            }
            if (hasStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getStatusRequest().hashCode();
            }
            if (hasStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getStatusResponse().hashCode();
            }
            if (hasStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getStatusNotification().hashCode();
            }
            if (hasVaultUploadEnableRequest()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getVaultUploadEnableRequest().hashCode();
            }
            if (hasVaultUploadEnableResponse()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getVaultUploadEnableResponse().hashCode();
            }
            if (hasVaultUploadEnableNotification()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getVaultUploadEnableNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            return new Service();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getConfigureRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfigureResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConfigureNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getModeRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getModeResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getModeNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getStatusRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getStatusResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getStatusNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getVaultUploadEnableRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getVaultUploadEnableResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getVaultUploadEnableNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> configureNotificationBuilder_;
            private ConfigurationNotification configureNotification_;
            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> configureRequestBuilder_;
            private ConfigurationRequest configureRequest_;
            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> configureResponseBuilder_;
            private ConfigurationResponse configureResponse_;
            private SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> modeNotificationBuilder_;
            private ModeNotification modeNotification_;
            private SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> modeRequestBuilder_;
            private ModeRequest modeRequest_;
            private SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> modeResponseBuilder_;
            private ModeResponse modeResponse_;
            private SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> statusNotificationBuilder_;
            private DeviceStatusNotification statusNotification_;
            private SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> statusRequestBuilder_;
            private DeviceStatusRequest statusRequest_;
            private SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> statusResponseBuilder_;
            private DeviceStatusResponse statusResponse_;
            private SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> vaultUploadEnableNotificationBuilder_;
            private VaultUploadEnableNotification vaultUploadEnableNotification_;
            private SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> vaultUploadEnableRequestBuilder_;
            private VaultUploadEnableRequest vaultUploadEnableRequest_;
            private SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> vaultUploadEnableResponseBuilder_;
            private VaultUploadEnableResponse vaultUploadEnableResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                    service.configureRequest_ = singleFieldBuilderV3 == null ? this.configureRequest_ : (ConfigurationRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configureResponseBuilder_;
                    service.configureResponse_ = singleFieldBuilderV4 == null ? this.configureResponse_ : (ConfigurationResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configureNotificationBuilder_;
                    service.configureNotification_ = singleFieldBuilderV5 == null ? this.configureNotification_ : (ConfigurationNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV6 = this.modeRequestBuilder_;
                    service.modeRequest_ = singleFieldBuilderV6 == null ? this.modeRequest_ : (ModeRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV7 = this.modeResponseBuilder_;
                    service.modeResponse_ = singleFieldBuilderV7 == null ? this.modeResponse_ : (ModeResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> singleFieldBuilderV8 = this.modeNotificationBuilder_;
                    service.modeNotification_ = singleFieldBuilderV8 == null ? this.modeNotification_ : (ModeNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> singleFieldBuilderV9 = this.statusRequestBuilder_;
                    service.statusRequest_ = singleFieldBuilderV9 == null ? this.statusRequest_ : (DeviceStatusRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> singleFieldBuilderV10 = this.statusResponseBuilder_;
                    service.statusResponse_ = singleFieldBuilderV10 == null ? this.statusResponse_ : (DeviceStatusResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> singleFieldBuilderV11 = this.statusNotificationBuilder_;
                    service.statusNotification_ = singleFieldBuilderV11 == null ? this.statusNotification_ : (DeviceStatusNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> singleFieldBuilderV12 = this.vaultUploadEnableRequestBuilder_;
                    service.vaultUploadEnableRequest_ = singleFieldBuilderV12 == null ? this.vaultUploadEnableRequest_ : (VaultUploadEnableRequest) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> singleFieldBuilderV13 = this.vaultUploadEnableResponseBuilder_;
                    service.vaultUploadEnableResponse_ = singleFieldBuilderV13 == null ? this.vaultUploadEnableResponse_ : (VaultUploadEnableResponse) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> singleFieldBuilderV14 = this.vaultUploadEnableNotificationBuilder_;
                    service.vaultUploadEnableNotification_ = singleFieldBuilderV14 == null ? this.vaultUploadEnableNotification_ : (VaultUploadEnableNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> getConfigureNotificationFieldBuilder() {
                if (this.configureNotificationBuilder_ == null) {
                    this.configureNotificationBuilder_ = new SingleFieldBuilderV3<>(getConfigureNotification(), getParentForChildren(), isClean());
                    this.configureNotification_ = null;
                }
                return this.configureNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> getConfigureRequestFieldBuilder() {
                if (this.configureRequestBuilder_ == null) {
                    this.configureRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigureRequest(), getParentForChildren(), isClean());
                    this.configureRequest_ = null;
                }
                return this.configureRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> getConfigureResponseFieldBuilder() {
                if (this.configureResponseBuilder_ == null) {
                    this.configureResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigureResponse(), getParentForChildren(), isClean());
                    this.configureResponse_ = null;
                }
                return this.configureResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Service_descriptor;
            }

            private SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> getModeNotificationFieldBuilder() {
                if (this.modeNotificationBuilder_ == null) {
                    this.modeNotificationBuilder_ = new SingleFieldBuilderV3<>(getModeNotification(), getParentForChildren(), isClean());
                    this.modeNotification_ = null;
                }
                return this.modeNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> getModeRequestFieldBuilder() {
                if (this.modeRequestBuilder_ == null) {
                    this.modeRequestBuilder_ = new SingleFieldBuilderV3<>(getModeRequest(), getParentForChildren(), isClean());
                    this.modeRequest_ = null;
                }
                return this.modeRequestBuilder_;
            }

            private SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> getModeResponseFieldBuilder() {
                if (this.modeResponseBuilder_ == null) {
                    this.modeResponseBuilder_ = new SingleFieldBuilderV3<>(getModeResponse(), getParentForChildren(), isClean());
                    this.modeResponse_ = null;
                }
                return this.modeResponseBuilder_;
            }

            private SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> getStatusNotificationFieldBuilder() {
                if (this.statusNotificationBuilder_ == null) {
                    this.statusNotificationBuilder_ = new SingleFieldBuilderV3<>(getStatusNotification(), getParentForChildren(), isClean());
                    this.statusNotification_ = null;
                }
                return this.statusNotificationBuilder_;
            }

            private SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> getStatusRequestFieldBuilder() {
                if (this.statusRequestBuilder_ == null) {
                    this.statusRequestBuilder_ = new SingleFieldBuilderV3<>(getStatusRequest(), getParentForChildren(), isClean());
                    this.statusRequest_ = null;
                }
                return this.statusRequestBuilder_;
            }

            private SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> getStatusResponseFieldBuilder() {
                if (this.statusResponseBuilder_ == null) {
                    this.statusResponseBuilder_ = new SingleFieldBuilderV3<>(getStatusResponse(), getParentForChildren(), isClean());
                    this.statusResponse_ = null;
                }
                return this.statusResponseBuilder_;
            }

            private SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> getVaultUploadEnableNotificationFieldBuilder() {
                if (this.vaultUploadEnableNotificationBuilder_ == null) {
                    this.vaultUploadEnableNotificationBuilder_ = new SingleFieldBuilderV3<>(getVaultUploadEnableNotification(), getParentForChildren(), isClean());
                    this.vaultUploadEnableNotification_ = null;
                }
                return this.vaultUploadEnableNotificationBuilder_;
            }

            private SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> getVaultUploadEnableRequestFieldBuilder() {
                if (this.vaultUploadEnableRequestBuilder_ == null) {
                    this.vaultUploadEnableRequestBuilder_ = new SingleFieldBuilderV3<>(getVaultUploadEnableRequest(), getParentForChildren(), isClean());
                    this.vaultUploadEnableRequest_ = null;
                }
                return this.vaultUploadEnableRequestBuilder_;
            }

            private SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> getVaultUploadEnableResponseFieldBuilder() {
                if (this.vaultUploadEnableResponseBuilder_ == null) {
                    this.vaultUploadEnableResponseBuilder_ = new SingleFieldBuilderV3<>(getVaultUploadEnableResponse(), getParentForChildren(), isClean());
                    this.vaultUploadEnableResponse_ = null;
                }
                return this.vaultUploadEnableResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigureRequestFieldBuilder();
                    getConfigureResponseFieldBuilder();
                    getConfigureNotificationFieldBuilder();
                    getModeRequestFieldBuilder();
                    getModeResponseFieldBuilder();
                    getModeNotificationFieldBuilder();
                    getStatusRequestFieldBuilder();
                    getStatusResponseFieldBuilder();
                    getStatusNotificationFieldBuilder();
                    getVaultUploadEnableRequestFieldBuilder();
                    getVaultUploadEnableResponseFieldBuilder();
                    getVaultUploadEnableNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Service build() {
                Service serviceBuildPartial = buildPartial();
                if (serviceBuildPartial.isInitialized()) {
                    return serviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Service buildPartial() {
                Service service = new Service(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(service);
                }
                onBuilt();
                return service;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.configureRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configureRequestBuilder_ = null;
                }
                this.configureResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configureResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.configureResponseBuilder_ = null;
                }
                this.configureNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configureNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.configureNotificationBuilder_ = null;
                }
                this.modeRequest_ = null;
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV6 = this.modeRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.modeRequestBuilder_ = null;
                }
                this.modeResponse_ = null;
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV7 = this.modeResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.modeResponseBuilder_ = null;
                }
                this.modeNotification_ = null;
                SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> singleFieldBuilderV8 = this.modeNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.modeNotificationBuilder_ = null;
                }
                this.statusRequest_ = null;
                SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> singleFieldBuilderV9 = this.statusRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.statusRequestBuilder_ = null;
                }
                this.statusResponse_ = null;
                SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> singleFieldBuilderV10 = this.statusResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.statusResponseBuilder_ = null;
                }
                this.statusNotification_ = null;
                SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> singleFieldBuilderV11 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.statusNotificationBuilder_ = null;
                }
                this.vaultUploadEnableRequest_ = null;
                SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> singleFieldBuilderV12 = this.vaultUploadEnableRequestBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.vaultUploadEnableRequestBuilder_ = null;
                }
                this.vaultUploadEnableResponse_ = null;
                SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> singleFieldBuilderV13 = this.vaultUploadEnableResponseBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.vaultUploadEnableResponseBuilder_ = null;
                }
                this.vaultUploadEnableNotification_ = null;
                SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> singleFieldBuilderV14 = this.vaultUploadEnableNotificationBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.vaultUploadEnableNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfigureNotification() {
                this.bitField0_ &= -5;
                this.configureNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configureNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configureNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigureRequest() {
                this.bitField0_ &= -2;
                this.configureRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configureRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigureResponse() {
                this.bitField0_ &= -3;
                this.configureResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configureResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearModeNotification() {
                this.bitField0_ &= -33;
                this.modeNotification_ = null;
                SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> singleFieldBuilderV3 = this.modeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.modeNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearModeRequest() {
                this.bitField0_ &= -9;
                this.modeRequest_ = null;
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.modeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearModeResponse() {
                this.bitField0_ &= -17;
                this.modeResponse_ = null;
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.modeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatusNotification() {
                this.bitField0_ &= -257;
                this.statusNotification_ = null;
                SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusRequest() {
                this.bitField0_ &= -65;
                this.statusRequest_ = null;
                SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusResponse() {
                this.bitField0_ &= -129;
                this.statusResponse_ = null;
                SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVaultUploadEnableNotification() {
                this.bitField0_ &= -2049;
                this.vaultUploadEnableNotification_ = null;
                SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.vaultUploadEnableNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVaultUploadEnableRequest() {
                this.bitField0_ &= -513;
                this.vaultUploadEnableRequest_ = null;
                SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.vaultUploadEnableRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVaultUploadEnableResponse() {
                this.bitField0_ &= -1025;
                this.vaultUploadEnableResponse_ = null;
                SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.vaultUploadEnableResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ConfigurationNotification getConfigureNotification() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configureNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotification) singleFieldBuilderV3.getMessage();
                }
                ConfigurationNotification configurationNotification = this.configureNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            public ConfigurationNotification.Builder getConfigureNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ConfigurationNotification.Builder) getConfigureNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ConfigurationNotificationOrBuilder getConfigureNotificationOrBuilder() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configureNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationNotification configurationNotification = this.configureNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ConfigurationRequest getConfigureRequest() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigurationRequest configurationRequest = this.configureRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            public ConfigurationRequest.Builder getConfigureRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationRequest.Builder) getConfigureRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ConfigurationRequestOrBuilder getConfigureRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationRequest configurationRequest = this.configureRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ConfigurationResponse getConfigureResponse() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigurationResponse configurationResponse = this.configureResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            public ConfigurationResponse.Builder getConfigureResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigurationResponse.Builder) getConfigureResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ConfigurationResponseOrBuilder getConfigureResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationResponse configurationResponse = this.configureResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ModeNotification getModeNotification() {
                SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> singleFieldBuilderV3 = this.modeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeNotification) singleFieldBuilderV3.getMessage();
                }
                ModeNotification modeNotification = this.modeNotification_;
                return modeNotification == null ? ModeNotification.getDefaultInstance() : modeNotification;
            }

            public ModeNotification.Builder getModeNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (ModeNotification.Builder) getModeNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ModeNotificationOrBuilder getModeNotificationOrBuilder() {
                SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> singleFieldBuilderV3 = this.modeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ModeNotification modeNotification = this.modeNotification_;
                return modeNotification == null ? ModeNotification.getDefaultInstance() : modeNotification;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ModeRequest getModeRequest() {
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeRequest) singleFieldBuilderV3.getMessage();
                }
                ModeRequest modeRequest = this.modeRequest_;
                return modeRequest == null ? ModeRequest.getDefaultInstance() : modeRequest;
            }

            public ModeRequest.Builder getModeRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ModeRequest.Builder) getModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ModeRequestOrBuilder getModeRequestOrBuilder() {
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ModeRequest modeRequest = this.modeRequest_;
                return modeRequest == null ? ModeRequest.getDefaultInstance() : modeRequest;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ModeResponse getModeResponse() {
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeResponse) singleFieldBuilderV3.getMessage();
                }
                ModeResponse modeResponse = this.modeResponse_;
                return modeResponse == null ? ModeResponse.getDefaultInstance() : modeResponse;
            }

            public ModeResponse.Builder getModeResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (ModeResponse.Builder) getModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public ModeResponseOrBuilder getModeResponseOrBuilder() {
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ModeResponse modeResponse = this.modeResponse_;
                return modeResponse == null ? ModeResponse.getDefaultInstance() : modeResponse;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public DeviceStatusNotification getStatusNotification() {
                SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatusNotification) singleFieldBuilderV3.getMessage();
                }
                DeviceStatusNotification deviceStatusNotification = this.statusNotification_;
                return deviceStatusNotification == null ? DeviceStatusNotification.getDefaultInstance() : deviceStatusNotification;
            }

            public DeviceStatusNotification.Builder getStatusNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (DeviceStatusNotification.Builder) getStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public DeviceStatusNotificationOrBuilder getStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceStatusNotification deviceStatusNotification = this.statusNotification_;
                return deviceStatusNotification == null ? DeviceStatusNotification.getDefaultInstance() : deviceStatusNotification;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public DeviceStatusRequest getStatusRequest() {
                SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatusRequest) singleFieldBuilderV3.getMessage();
                }
                DeviceStatusRequest deviceStatusRequest = this.statusRequest_;
                return deviceStatusRequest == null ? DeviceStatusRequest.getDefaultInstance() : deviceStatusRequest;
            }

            public DeviceStatusRequest.Builder getStatusRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (DeviceStatusRequest.Builder) getStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public DeviceStatusRequestOrBuilder getStatusRequestOrBuilder() {
                SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceStatusRequest deviceStatusRequest = this.statusRequest_;
                return deviceStatusRequest == null ? DeviceStatusRequest.getDefaultInstance() : deviceStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public DeviceStatusResponse getStatusResponse() {
                SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatusResponse) singleFieldBuilderV3.getMessage();
                }
                DeviceStatusResponse deviceStatusResponse = this.statusResponse_;
                return deviceStatusResponse == null ? DeviceStatusResponse.getDefaultInstance() : deviceStatusResponse;
            }

            public DeviceStatusResponse.Builder getStatusResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (DeviceStatusResponse.Builder) getStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public DeviceStatusResponseOrBuilder getStatusResponseOrBuilder() {
                SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceStatusResponse deviceStatusResponse = this.statusResponse_;
                return deviceStatusResponse == null ? DeviceStatusResponse.getDefaultInstance() : deviceStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public VaultUploadEnableNotification getVaultUploadEnableNotification() {
                SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VaultUploadEnableNotification) singleFieldBuilderV3.getMessage();
                }
                VaultUploadEnableNotification vaultUploadEnableNotification = this.vaultUploadEnableNotification_;
                return vaultUploadEnableNotification == null ? VaultUploadEnableNotification.getDefaultInstance() : vaultUploadEnableNotification;
            }

            public VaultUploadEnableNotification.Builder getVaultUploadEnableNotificationBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (VaultUploadEnableNotification.Builder) getVaultUploadEnableNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public VaultUploadEnableNotificationOrBuilder getVaultUploadEnableNotificationOrBuilder() {
                SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VaultUploadEnableNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VaultUploadEnableNotification vaultUploadEnableNotification = this.vaultUploadEnableNotification_;
                return vaultUploadEnableNotification == null ? VaultUploadEnableNotification.getDefaultInstance() : vaultUploadEnableNotification;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public VaultUploadEnableRequest getVaultUploadEnableRequest() {
                SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VaultUploadEnableRequest) singleFieldBuilderV3.getMessage();
                }
                VaultUploadEnableRequest vaultUploadEnableRequest = this.vaultUploadEnableRequest_;
                return vaultUploadEnableRequest == null ? VaultUploadEnableRequest.getDefaultInstance() : vaultUploadEnableRequest;
            }

            public VaultUploadEnableRequest.Builder getVaultUploadEnableRequestBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (VaultUploadEnableRequest.Builder) getVaultUploadEnableRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public VaultUploadEnableRequestOrBuilder getVaultUploadEnableRequestOrBuilder() {
                SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VaultUploadEnableRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VaultUploadEnableRequest vaultUploadEnableRequest = this.vaultUploadEnableRequest_;
                return vaultUploadEnableRequest == null ? VaultUploadEnableRequest.getDefaultInstance() : vaultUploadEnableRequest;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public VaultUploadEnableResponse getVaultUploadEnableResponse() {
                SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VaultUploadEnableResponse) singleFieldBuilderV3.getMessage();
                }
                VaultUploadEnableResponse vaultUploadEnableResponse = this.vaultUploadEnableResponse_;
                return vaultUploadEnableResponse == null ? VaultUploadEnableResponse.getDefaultInstance() : vaultUploadEnableResponse;
            }

            public VaultUploadEnableResponse.Builder getVaultUploadEnableResponseBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (VaultUploadEnableResponse.Builder) getVaultUploadEnableResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public VaultUploadEnableResponseOrBuilder getVaultUploadEnableResponseOrBuilder() {
                SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VaultUploadEnableResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VaultUploadEnableResponse vaultUploadEnableResponse = this.vaultUploadEnableResponse_;
                return vaultUploadEnableResponse == null ? VaultUploadEnableResponse.getDefaultInstance() : vaultUploadEnableResponse;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasConfigureNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasConfigureRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasConfigureResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasModeNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasModeRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasModeResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasStatusNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasStatusRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasStatusResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasVaultUploadEnableNotification() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasVaultUploadEnableRequest() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.ServiceOrBuilder
            public boolean hasVaultUploadEnableResponse() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfigureNotification(ConfigurationNotification configurationNotification) {
                ConfigurationNotification configurationNotification2;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configureNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationNotification);
                } else if ((this.bitField0_ & 4) == 0 || (configurationNotification2 = this.configureNotification_) == null || configurationNotification2 == ConfigurationNotification.getDefaultInstance()) {
                    this.configureNotification_ = configurationNotification;
                } else {
                    getConfigureNotificationBuilder().mergeFrom(configurationNotification);
                }
                if (this.configureNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigureRequest(ConfigurationRequest configurationRequest) {
                ConfigurationRequest configurationRequest2;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationRequest);
                } else if ((this.bitField0_ & 1) == 0 || (configurationRequest2 = this.configureRequest_) == null || configurationRequest2 == ConfigurationRequest.getDefaultInstance()) {
                    this.configureRequest_ = configurationRequest;
                } else {
                    getConfigureRequestBuilder().mergeFrom(configurationRequest);
                }
                if (this.configureRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigureResponse(ConfigurationResponse configurationResponse) {
                ConfigurationResponse configurationResponse2;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationResponse);
                } else if ((this.bitField0_ & 2) == 0 || (configurationResponse2 = this.configureResponse_) == null || configurationResponse2 == ConfigurationResponse.getDefaultInstance()) {
                    this.configureResponse_ = configurationResponse;
                } else {
                    getConfigureResponseBuilder().mergeFrom(configurationResponse);
                }
                if (this.configureResponse_ != null) {
                    this.bitField0_ |= 2;
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
                                    codedInputStream.readMessage(getConfigureRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getConfigureResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getConfigureNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getModeNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getVaultUploadEnableRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getVaultUploadEnableResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getVaultUploadEnableNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
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

            public Builder mergeModeNotification(ModeNotification modeNotification) {
                ModeNotification modeNotification2;
                SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> singleFieldBuilderV3 = this.modeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(modeNotification);
                } else if ((this.bitField0_ & 32) == 0 || (modeNotification2 = this.modeNotification_) == null || modeNotification2 == ModeNotification.getDefaultInstance()) {
                    this.modeNotification_ = modeNotification;
                } else {
                    getModeNotificationBuilder().mergeFrom(modeNotification);
                }
                if (this.modeNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeModeRequest(ModeRequest modeRequest) {
                ModeRequest modeRequest2;
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(modeRequest);
                } else if ((this.bitField0_ & 8) == 0 || (modeRequest2 = this.modeRequest_) == null || modeRequest2 == ModeRequest.getDefaultInstance()) {
                    this.modeRequest_ = modeRequest;
                } else {
                    getModeRequestBuilder().mergeFrom(modeRequest);
                }
                if (this.modeRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeModeResponse(ModeResponse modeResponse) {
                ModeResponse modeResponse2;
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(modeResponse);
                } else if ((this.bitField0_ & 16) == 0 || (modeResponse2 = this.modeResponse_) == null || modeResponse2 == ModeResponse.getDefaultInstance()) {
                    this.modeResponse_ = modeResponse;
                } else {
                    getModeResponseBuilder().mergeFrom(modeResponse);
                }
                if (this.modeResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusNotification(DeviceStatusNotification deviceStatusNotification) {
                DeviceStatusNotification deviceStatusNotification2;
                SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceStatusNotification);
                } else if ((this.bitField0_ & 256) == 0 || (deviceStatusNotification2 = this.statusNotification_) == null || deviceStatusNotification2 == DeviceStatusNotification.getDefaultInstance()) {
                    this.statusNotification_ = deviceStatusNotification;
                } else {
                    getStatusNotificationBuilder().mergeFrom(deviceStatusNotification);
                }
                if (this.statusNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusRequest(DeviceStatusRequest deviceStatusRequest) {
                DeviceStatusRequest deviceStatusRequest2;
                SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceStatusRequest);
                } else if ((this.bitField0_ & 64) == 0 || (deviceStatusRequest2 = this.statusRequest_) == null || deviceStatusRequest2 == DeviceStatusRequest.getDefaultInstance()) {
                    this.statusRequest_ = deviceStatusRequest;
                } else {
                    getStatusRequestBuilder().mergeFrom(deviceStatusRequest);
                }
                if (this.statusRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusResponse(DeviceStatusResponse deviceStatusResponse) {
                DeviceStatusResponse deviceStatusResponse2;
                SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceStatusResponse);
                } else if ((this.bitField0_ & 128) == 0 || (deviceStatusResponse2 = this.statusResponse_) == null || deviceStatusResponse2 == DeviceStatusResponse.getDefaultInstance()) {
                    this.statusResponse_ = deviceStatusResponse;
                } else {
                    getStatusResponseBuilder().mergeFrom(deviceStatusResponse);
                }
                if (this.statusResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeVaultUploadEnableNotification(VaultUploadEnableNotification vaultUploadEnableNotification) {
                VaultUploadEnableNotification vaultUploadEnableNotification2;
                SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(vaultUploadEnableNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (vaultUploadEnableNotification2 = this.vaultUploadEnableNotification_) == null || vaultUploadEnableNotification2 == VaultUploadEnableNotification.getDefaultInstance()) {
                    this.vaultUploadEnableNotification_ = vaultUploadEnableNotification;
                } else {
                    getVaultUploadEnableNotificationBuilder().mergeFrom(vaultUploadEnableNotification);
                }
                if (this.vaultUploadEnableNotification_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeVaultUploadEnableRequest(VaultUploadEnableRequest vaultUploadEnableRequest) {
                VaultUploadEnableRequest vaultUploadEnableRequest2;
                SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(vaultUploadEnableRequest);
                } else if ((this.bitField0_ & 512) == 0 || (vaultUploadEnableRequest2 = this.vaultUploadEnableRequest_) == null || vaultUploadEnableRequest2 == VaultUploadEnableRequest.getDefaultInstance()) {
                    this.vaultUploadEnableRequest_ = vaultUploadEnableRequest;
                } else {
                    getVaultUploadEnableRequestBuilder().mergeFrom(vaultUploadEnableRequest);
                }
                if (this.vaultUploadEnableRequest_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeVaultUploadEnableResponse(VaultUploadEnableResponse vaultUploadEnableResponse) {
                VaultUploadEnableResponse vaultUploadEnableResponse2;
                SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(vaultUploadEnableResponse);
                } else if ((this.bitField0_ & 1024) == 0 || (vaultUploadEnableResponse2 = this.vaultUploadEnableResponse_) == null || vaultUploadEnableResponse2 == VaultUploadEnableResponse.getDefaultInstance()) {
                    this.vaultUploadEnableResponse_ = vaultUploadEnableResponse;
                } else {
                    getVaultUploadEnableResponseBuilder().mergeFrom(vaultUploadEnableResponse);
                }
                if (this.vaultUploadEnableResponse_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder setConfigureNotification(ConfigurationNotification.Builder builder) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configureNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configureNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigureRequest(ConfigurationRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configureRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigureResponse(ConfigurationResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configureResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setModeNotification(ModeNotification.Builder builder) {
                SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> singleFieldBuilderV3 = this.modeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.modeNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setModeRequest(ModeRequest.Builder builder) {
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.modeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setModeResponse(ModeResponse.Builder builder) {
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.modeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatusNotification(DeviceStatusNotification.Builder builder) {
                SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setStatusRequest(DeviceStatusRequest.Builder builder) {
                SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStatusResponse(DeviceStatusResponse.Builder builder) {
                SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVaultUploadEnableNotification(VaultUploadEnableNotification.Builder builder) {
                SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.vaultUploadEnableNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setVaultUploadEnableRequest(VaultUploadEnableRequest.Builder builder) {
                SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.vaultUploadEnableRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setVaultUploadEnableResponse(VaultUploadEnableResponse.Builder builder) {
                SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.vaultUploadEnableResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Service getDefaultInstanceForType() {
                return Service.getDefaultInstance();
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

            public Builder setConfigureNotification(ConfigurationNotification configurationNotification) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configureNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationNotification.getClass();
                    this.configureNotification_ = configurationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(configurationNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigureRequest(ConfigurationRequest configurationRequest) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationRequest.getClass();
                    this.configureRequest_ = configurationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configurationRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigureResponse(ConfigurationResponse configurationResponse) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationResponse.getClass();
                    this.configureResponse_ = configurationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configurationResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setModeNotification(ModeNotification modeNotification) {
                SingleFieldBuilderV3<ModeNotification, ModeNotification.Builder, ModeNotificationOrBuilder> singleFieldBuilderV3 = this.modeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    modeNotification.getClass();
                    this.modeNotification_ = modeNotification;
                } else {
                    singleFieldBuilderV3.setMessage(modeNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setModeRequest(ModeRequest modeRequest) {
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    modeRequest.getClass();
                    this.modeRequest_ = modeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(modeRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setModeResponse(ModeResponse modeResponse) {
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    modeResponse.getClass();
                    this.modeResponse_ = modeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(modeResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStatusNotification(DeviceStatusNotification deviceStatusNotification) {
                SingleFieldBuilderV3<DeviceStatusNotification, DeviceStatusNotification.Builder, DeviceStatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceStatusNotification.getClass();
                    this.statusNotification_ = deviceStatusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(deviceStatusNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setStatusRequest(DeviceStatusRequest deviceStatusRequest) {
                SingleFieldBuilderV3<DeviceStatusRequest, DeviceStatusRequest.Builder, DeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceStatusRequest.getClass();
                    this.statusRequest_ = deviceStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(deviceStatusRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStatusResponse(DeviceStatusResponse deviceStatusResponse) {
                SingleFieldBuilderV3<DeviceStatusResponse, DeviceStatusResponse.Builder, DeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceStatusResponse.getClass();
                    this.statusResponse_ = deviceStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(deviceStatusResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setVaultUploadEnableNotification(VaultUploadEnableNotification vaultUploadEnableNotification) {
                SingleFieldBuilderV3<VaultUploadEnableNotification, VaultUploadEnableNotification.Builder, VaultUploadEnableNotificationOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    vaultUploadEnableNotification.getClass();
                    this.vaultUploadEnableNotification_ = vaultUploadEnableNotification;
                } else {
                    singleFieldBuilderV3.setMessage(vaultUploadEnableNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setVaultUploadEnableRequest(VaultUploadEnableRequest vaultUploadEnableRequest) {
                SingleFieldBuilderV3<VaultUploadEnableRequest, VaultUploadEnableRequest.Builder, VaultUploadEnableRequestOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    vaultUploadEnableRequest.getClass();
                    this.vaultUploadEnableRequest_ = vaultUploadEnableRequest;
                } else {
                    singleFieldBuilderV3.setMessage(vaultUploadEnableRequest);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setVaultUploadEnableResponse(VaultUploadEnableResponse vaultUploadEnableResponse) {
                SingleFieldBuilderV3<VaultUploadEnableResponse, VaultUploadEnableResponse.Builder, VaultUploadEnableResponseOrBuilder> singleFieldBuilderV3 = this.vaultUploadEnableResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    vaultUploadEnableResponse.getClass();
                    this.vaultUploadEnableResponse_ = vaultUploadEnableResponse;
                } else {
                    singleFieldBuilderV3.setMessage(vaultUploadEnableResponse);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Service) {
                    return mergeFrom((Service) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Service service) {
                if (service == Service.getDefaultInstance()) {
                    return this;
                }
                if (service.hasConfigureRequest()) {
                    mergeConfigureRequest(service.getConfigureRequest());
                }
                if (service.hasConfigureResponse()) {
                    mergeConfigureResponse(service.getConfigureResponse());
                }
                if (service.hasConfigureNotification()) {
                    mergeConfigureNotification(service.getConfigureNotification());
                }
                if (service.hasModeRequest()) {
                    mergeModeRequest(service.getModeRequest());
                }
                if (service.hasModeResponse()) {
                    mergeModeResponse(service.getModeResponse());
                }
                if (service.hasModeNotification()) {
                    mergeModeNotification(service.getModeNotification());
                }
                if (service.hasStatusRequest()) {
                    mergeStatusRequest(service.getStatusRequest());
                }
                if (service.hasStatusResponse()) {
                    mergeStatusResponse(service.getStatusResponse());
                }
                if (service.hasStatusNotification()) {
                    mergeStatusNotification(service.getStatusNotification());
                }
                if (service.hasVaultUploadEnableRequest()) {
                    mergeVaultUploadEnableRequest(service.getVaultUploadEnableRequest());
                }
                if (service.hasVaultUploadEnableResponse()) {
                    mergeVaultUploadEnableResponse(service.getVaultUploadEnableResponse());
                }
                if (service.hasVaultUploadEnableNotification()) {
                    mergeVaultUploadEnableNotification(service.getVaultUploadEnableNotification());
                }
                mergeUnknownFields(service.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Service getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ Service(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private Service() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Service parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Service parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Service parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Service parseFrom(InputStream inputStream) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Service parseFrom(CodedInputStream codedInputStream) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VaultUploadEnableResponse extends GeneratedMessageV3 implements VaultUploadEnableResponseOrBuilder {
        public static final int ENABLE_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enable_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final VaultUploadEnableResponse DEFAULT_INSTANCE = new VaultUploadEnableResponse();

        @Deprecated
        public static final Parser<VaultUploadEnableResponse> PARSER = new AbstractParser<VaultUploadEnableResponse>() { // from class: com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponse.1
            @Override // com.google.protobuf.Parser
            public VaultUploadEnableResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VaultUploadEnableResponse.newBuilder();
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

        private VaultUploadEnableResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.enable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VaultUploadEnableResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_descriptor;
        }

        public static Builder newBuilder(VaultUploadEnableResponse vaultUploadEnableResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(vaultUploadEnableResponse);
        }

        public static VaultUploadEnableResponse parseDelimitedFrom(InputStream inputStream) {
            return (VaultUploadEnableResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VaultUploadEnableResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VaultUploadEnableResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VaultUploadEnableResponse)) {
                return super.equals(obj);
            }
            VaultUploadEnableResponse vaultUploadEnableResponse = (VaultUploadEnableResponse) obj;
            if (hasStatus() != vaultUploadEnableResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == vaultUploadEnableResponse.status_) && hasEnable() == vaultUploadEnableResponse.hasEnable()) {
                return (!hasEnable() || getEnable() == vaultUploadEnableResponse.getEnable()) && getUnknownFields().equals(vaultUploadEnableResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponseOrBuilder
        public boolean getEnable() {
            return this.enable_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VaultUploadEnableResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.enable_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponseOrBuilder
        public boolean hasEnable() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponseOrBuilder
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
            if (hasEnable()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getEnable());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(VaultUploadEnableResponse.class, Builder.class);
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
            return new VaultUploadEnableResponse();
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
                codedOutputStream.writeBool(2, this.enable_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VaultUploadEnableResponseOrBuilder {
            private int bitField0_;
            private boolean enable_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(VaultUploadEnableResponse vaultUploadEnableResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    vaultUploadEnableResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    vaultUploadEnableResponse.enable_ = this.enable_;
                    i14 |= 2;
                }
                vaultUploadEnableResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VaultUploadEnableResponse build() {
                VaultUploadEnableResponse vaultUploadEnableResponseBuildPartial = buildPartial();
                if (vaultUploadEnableResponseBuildPartial.isInitialized()) {
                    return vaultUploadEnableResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) vaultUploadEnableResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VaultUploadEnableResponse buildPartial() {
                VaultUploadEnableResponse vaultUploadEnableResponse = new VaultUploadEnableResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(vaultUploadEnableResponse);
                }
                onBuilt();
                return vaultUploadEnableResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.enable_ = false;
                return this;
            }

            public Builder clearEnable() {
                this.bitField0_ &= -3;
                this.enable_ = false;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponseOrBuilder
            public boolean getEnable() {
                return this.enable_;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponseOrBuilder
            public boolean hasEnable() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIVariaDevice.VaultUploadEnableResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIVariaDevice.internal_static_GDI_Proto_VariaDevice_VaultUploadEnableResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(VaultUploadEnableResponse.class, Builder.class);
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
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.enable_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
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

            public Builder setEnable(boolean z14) {
                this.enable_ = z14;
                this.bitField0_ |= 2;
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

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public VaultUploadEnableResponse getDefaultInstanceForType() {
                return VaultUploadEnableResponse.getDefaultInstance();
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
                if (message instanceof VaultUploadEnableResponse) {
                    return mergeFrom((VaultUploadEnableResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VaultUploadEnableResponse vaultUploadEnableResponse) {
                if (vaultUploadEnableResponse == VaultUploadEnableResponse.getDefaultInstance()) {
                    return this;
                }
                if (vaultUploadEnableResponse.hasStatus()) {
                    setStatus(vaultUploadEnableResponse.getStatus());
                }
                if (vaultUploadEnableResponse.hasEnable()) {
                    setEnable(vaultUploadEnableResponse.getEnable());
                }
                mergeUnknownFields(vaultUploadEnableResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VaultUploadEnableResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VaultUploadEnableResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VaultUploadEnableResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VaultUploadEnableResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VaultUploadEnableResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ VaultUploadEnableResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static VaultUploadEnableResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private VaultUploadEnableResponse() {
            this.enable_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static VaultUploadEnableResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VaultUploadEnableResponse parseFrom(InputStream inputStream) {
            return (VaultUploadEnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VaultUploadEnableResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VaultUploadEnableResponse parseFrom(CodedInputStream codedInputStream) {
            return (VaultUploadEnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VaultUploadEnableResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VaultUploadEnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum Mode implements ProtocolMessageEnum {
        MODE_UNKNOWN(0),
        MODE_ACTIVE(1),
        MODE_RADAR_DEMO(2),
        MODE_PAIRING(3),
        MODE_HIBERNATION(4);

        public static final int MODE_ACTIVE_VALUE = 1;
        public static final int MODE_HIBERNATION_VALUE = 4;
        public static final int MODE_PAIRING_VALUE = 3;
        public static final int MODE_RADAR_DEMO_VALUE = 2;
        public static final int MODE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Mode> internalValueMap = new Internal.EnumLiteMap<Mode>() { // from class: com.garmin.proto.generated.GDIVariaDevice.Mode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Mode findValueByNumber(int i14) {
                return Mode.forNumber(i14);
            }
        };
        private static final Mode[] VALUES = values();

        Mode(int i14) {
            this.value = i14;
        }

        public static Mode forNumber(int i14) {
            if (i14 == 0) {
                return MODE_UNKNOWN;
            }
            if (i14 == 1) {
                return MODE_ACTIVE;
            }
            if (i14 == 2) {
                return MODE_RADAR_DEMO;
            }
            if (i14 == 3) {
                return MODE_PAIRING;
            }
            if (i14 != 4) {
                return null;
            }
            return MODE_HIBERNATION;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIVariaDevice.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<Mode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Mode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static Mode valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum Status implements ProtocolMessageEnum {
        STATUS_UNKNOWN(0),
        STATUS_REJECTED(1),
        STATUS_ACCEPTED(2),
        STATUS_BUSY(3);

        public static final int STATUS_ACCEPTED_VALUE = 2;
        public static final int STATUS_BUSY_VALUE = 3;
        public static final int STATUS_REJECTED_VALUE = 1;
        public static final int STATUS_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIVariaDevice.Status.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Status findValueByNumber(int i14) {
                return Status.forNumber(i14);
            }
        };
        private static final Status[] VALUES = values();

        Status(int i14) {
            this.value = i14;
        }

        public static Status forNumber(int i14) {
            if (i14 == 0) {
                return STATUS_UNKNOWN;
            }
            if (i14 == 1) {
                return STATUS_REJECTED;
            }
            if (i14 == 2) {
                return STATUS_ACCEPTED;
            }
            if (i14 != 3) {
                return null;
            }
            return STATUS_BUSY;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIVariaDevice.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<Status> internalGetValueMap() {
            return internalValueMap;
        }

        public static Status valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static Status valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
