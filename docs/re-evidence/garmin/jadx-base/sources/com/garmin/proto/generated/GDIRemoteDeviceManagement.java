package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIRemoteDeviceManagement {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fGDIRemoteDeviceManagement.proto\u0012 GDI.Proto.RemoteDeviceManagement\u001a\rGDICore.proto\"¥\u000f\n\u0007Service\u0012P\n\u0013paired_list_request\u0018\u0001 \u0001(\u000b23.GDI.Proto.RemoteDeviceManagement.PairedListRequest\u0012R\n\u0014paired_list_response\u0018\u0002 \u0001(\u000b24.GDI.Proto.RemoteDeviceManagement.PairedListResponse\u0012a\n\u001cremove_paired_device_request\u0018\u0003 \u0001(\u000b2;.GDI.Proto.RemoteDeviceManagement.RemovePairedDeviceRequest\u0012c\n\u001dremove_paired_device_response\u0018\u0004 \u0001(\u000b2<.GDI.Proto.RemoteDeviceManagement.RemovePairedDeviceResponse\u0012T\n\u0015start_pairing_request\u0018\u0005 \u0001(\u000b25.GDI.Proto.RemoteDeviceManagement.StartPairingRequest\u0012V\n\u0016start_pairing_response\u0018\u0006 \u0001(\u000b26.GDI.Proto.RemoteDeviceManagement.StartPairingResponse\u0012V\n\u0016cancel_pairing_request\u0018\u0007 \u0001(\u000b26.GDI.Proto.RemoteDeviceManagement.CancelPairingRequest\u0012X\n\u0017cancel_pairing_response\u0018\b \u0001(\u000b27.GDI.Proto.RemoteDeviceManagement.CancelPairingResponse\u0012b\n\u001cpairing_command_notification\u0018\t \u0001(\u000b2<.GDI.Proto.RemoteDeviceManagement.PairingCommandNotification\u0012f\n!remote_device_status_notification\u0018\n \u0001(\u000b2;.GDI.Proto.RemoteDeviceManagement.PairingStatusNotification\u0012d\n\u001dpairing_complete_notification\u0018\u000b \u0001(\u000b2=.GDI.Proto.RemoteDeviceManagement.PairingCompleteNotification\u0012N\n\u0012start_scan_request\u0018\f \u0001(\u000b22.GDI.Proto.RemoteDeviceManagement.StartScanRequest\u0012P\n\u0013start_scan_response\u0018\r \u0001(\u000b23.GDI.Proto.RemoteDeviceManagement.StartScanResponse\u0012\\\n\u0019scan_results_notification\u0018\u000e \u0001(\u000b29.GDI.Proto.RemoteDeviceManagement.ScanResultsNotification\u0012l\n!accessory_connection_notification\u0018\u000f \u0001(\u000b2A.GDI.Proto.RemoteDeviceManagement.AccessoryConnectionNotification\u0012L\n\u0011stop_scan_request\u0018\u0010 \u0001(\u000b21.GDI.Proto.RemoteDeviceManagement.StopScanRequest\u0012N\n\u0012stop_scan_response\u0018\u0011 \u0001(\u000b22.GDI.Proto.RemoteDeviceManagement.StopScanResponse\u0012h\n set_enable_paired_device_request\u0018\u0012 \u0001(\u000b2>.GDI.Proto.RemoteDeviceManagement.SetEnablePairedDeviceRequest\u0012j\n!set_enable_paired_device_response\u0018\u0013 \u0001(\u000b2?.GDI.Proto.RemoteDeviceManagement.SetEnablePairedDeviceResponse\u0012Z\n\u0018accessory_status_request\u0018\u0014 \u0001(\u000b28.GDI.Proto.RemoteDeviceManagement.AccessoryStatusRequest\u0012\\\n\u0019accessory_status_response\u0018\u0015 \u0001(\u000b29.GDI.Proto.RemoteDeviceManagement.AccessoryStatusResponse\"à\u0001\n\nMacAddress\u0012\u0013\n\u000bmac_address\u0018\u0001 \u0001(\f\u0012N\n\faddress_type\u0018\u0002 \u0001(\u000e28.GDI.Proto.RemoteDeviceManagement.MacAddress.AddressType\"m\n\u000bAddressType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\n\n\u0006PUBLIC\u0010\u0001\u0012\u0011\n\rRANDOM_STATIC\u0010\u0002\u0012\u0016\n\u0012PRIVATE_RESOLVABLE\u0010\u0003\u0012\u001a\n\u0016PRIVATE_NON_RESOLVABLE\u0010\u0004\"÷\u0003\n\u0006Device\u0012\u0013\n\u000bdevice_name\u0018\u0001 \u0001(\t\u0012A\n\u000bmac_address\u0018\u0002 \u0001(\u000b2,.GDI.Proto.RemoteDeviceManagement.MacAddress\u0012A\n\u000bsensor_type\u0018\u0003 \u0001(\u000e2,.GDI.Proto.RemoteDeviceManagement.SensorType\u0012E\n\u0006status\u0018\u0004 \u0001(\u000e25.GDI.Proto.RemoteDeviceManagement.Device.SensorStatus\u0012\u0017\n\u000fbattery_percent\u0018\u0005 \u0001(\r\u0012\u0012\n\nsw_version\u0018\u0006 \u0001(\t\u0012\u0015\n\rserial_number\u0018\u0007 \u0001(\t\u0012\u0014\n\fmodel_number\u0018\b \u0001(\t\u0012\u0014\n\fmanufacturer\u0018\t \u0001(\t\"\u009a\u0001\n\fSensorStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\r\n\tSEARCHING\u0010\u0001\u0012\u0012\n\u000eNO_CONNECTIONS\u0010\u0002\u0012\u0013\n\u000fNOT_CONNECTABLE\u0010\u0003\u0012\u0016\n\u0012REQUIRES_REPAIRING\u0010\u0004\u0012\f\n\bDISABLED\u0010\u0005\u0012\u0010\n\fDISCONNECTED\u0010\u0006\u0012\r\n\tCONNECTED\u0010\u0007\"\u0013\n\u0011PairedListRequest\"O\n\u0012PairedListResponse\u00129\n\u0007devices\u0018\u0001 \u0003(\u000b2(.GDI.Proto.RemoteDeviceManagement.Device\"X\n\u0013StartPairingRequest\u0012A\n\u000bmac_address\u0018\u0001 \u0001(\u000b2,.GDI.Proto.RemoteDeviceManagement.MacAddress\"Ê\u0001\n\u0014StartPairingResponse\u0012M\n\u0006result\u0018\u0001 \u0001(\u000e2=.GDI.Proto.RemoteDeviceManagement.StartPairingResponse.Result\"c\n\u0006Result\u0012\u000e\n\nFAIL_OTHER\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u001a\n\u0016FAIL_INVALID_PARAMETER\u0010\u0002\u0012 \n\u001cFAIL_TOO_MANY_PAIRED_DEVICES\u0010\u0003\"û\u0002\n\u001aPairingCommandNotification\u0012Y\n\u0007command\u0018\u0001 \u0001(\u000e2H.GDI.Proto.RemoteDeviceManagement.PairingCommandNotification.CommandType\u0012d\n\u000fconnection_type\u0018\u0002 \u0001(\u000e2K.GDI.Proto.RemoteDeviceManagement.PairingCommandNotification.ConnectionType\"g\n\u000bCommandType\u0012\u0011\n\rNOT_SUPPORTED\u0010\u0000\u0012\u0012\n\u000eACCEPT_PRIVACY\u0010\u0001\u0012\u0014\n\u0010RETRY_CONNECTION\u0010\u0002\u0012\u001b\n\u0017CONFIRM_CONNECTION_TYPE\u0010\u0003\"3\n\u000eConnectionType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004OPEN\u0010\u0001\u0012\n\n\u0006SECURE\u0010\u0002\"¾\u0002\n\u0019PairingStatusNotification\u0012Z\n\u0004type\u0018\u0001 \u0001(\u000e2L.GDI.Proto.RemoteDeviceManagement.PairingStatusNotification.NotificationType\u00128\n\u0006device\u0018\u0002 \u0001(\u000b2(.GDI.Proto.RemoteDeviceManagement.Device\"\u008a\u0001\n\u0010NotificationType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0015\n\u0011CONNECTION_FAILED\u0010\u0001\u0012\u001b\n\u0017CONFIRM_CONNECTION_TYPE\u0010\u0002\u0012\u001a\n\u0016CONNECTION_NOT_PRIVATE\u0010\u0003\u0012\u0019\n\u0015PAIRING_MODE_REQUIRED\u0010\u0004\"\u0016\n\u0014CancelPairingRequest\"\u0088\u0001\n\u0015CancelPairingResponse\u0012N\n\u0006result\u0018\u0001 \u0001(\u000e2>.GDI.Proto.RemoteDeviceManagement.CancelPairingResponse.Result\"\u001f\n\u0006Result\u0012\b\n\u0004FAIL\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"é\u0001\n\u001bPairingCompleteNotification\u0012[\n\u0006result\u0018\u0001 \u0001(\u000e2K.GDI.Proto.RemoteDeviceManagement.PairingCompleteNotification.PairingResult\"m\n\rPairingResult\u0012\u000e\n\nFAIL_OTHER\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u0011\n\rFAIL_NO_SPACE\u0010\u0002\u0012\u0012\n\u000eFAIL_DUPLICATE\u0010\u0003\u0012\u0018\n\u0014FAIL_NOT_CONNECTABLE\u0010\u0004\"^\n\u0019RemovePairedDeviceRequest\u0012A\n\u000bmac_address\u0018\u0001 \u0001(\u000b2,.GDI.Proto.RemoteDeviceManagement.MacAddress\"\u0092\u0001\n\u001aRemovePairedDeviceResponse\u0012S\n\u0006result\u0018\u0001 \u0002(\u000e2C.GDI.Proto.RemoteDeviceManagement.RemovePairedDeviceResponse.Result\"\u001f\n\u0006Result\u0012\b\n\u0004FAIL\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"U\n\u0010StartScanRequest\u0012A\n\u000bsensor_type\u0018\u0001 \u0001(\u000e2,.GDI.Proto.RemoteDeviceManagement.SensorType\"\u0080\u0001\n\u0011StartScanResponse\u0012J\n\u0006result\u0018\u0001 \u0001(\u000e2:.GDI.Proto.RemoteDeviceManagement.StartScanResponse.Result\"\u001f\n\u0006Result\u0012\b\n\u0004FAIL\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"\u0011\n\u000fStopScanRequest\"~\n\u0010StopScanResponse\u0012I\n\u0006result\u0018\u0001 \u0001(\u000e29.GDI.Proto.RemoteDeviceManagement.StopScanResponse.Result\"\u001f\n\u0006Result\u0012\b\n\u0004FAIL\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"T\n\u0017ScanResultsNotification\u00129\n\u0007devices\u0018\u0001 \u0003(\u000b2(.GDI.Proto.RemoteDeviceManagement.Device\"\u0083\u0001\n\u001cSetEnablePairedDeviceRequest\u0012\u000f\n\u0007enabled\u0018\u0001 \u0001(\b\u0012A\n\u000bmac_address\u0018\u0002 \u0001(\u000b2,.GDI.Proto.RemoteDeviceManagement.MacAddress\u0012\u000f\n\u0007unit_id\u0018\u0003 \u0001(\r\"\u0098\u0001\n\u001dSetEnablePairedDeviceResponse\u0012V\n\u0006result\u0018\u0001 \u0001(\u000e2F.GDI.Proto.RemoteDeviceManagement.SetEnablePairedDeviceResponse.Result\"\u001f\n\u0006Result\u0012\b\n\u0004FAIL\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"\u0087\u0002\n\u001fAccessoryConnectionNotification\u0012X\n\u0006result\u0018\u0001 \u0001(\u000e2H.GDI.Proto.RemoteDeviceManagement.AccessoryConnectionNotification.Result\u00128\n\u0006device\u0018\u0002 \u0001(\u000b2(.GDI.Proto.RemoteDeviceManagement.Device\"P\n\u0006Result\u0012\u000e\n\nFAIL_OTHER\u0010\u0000\u0012\r\n\tCONNECTED\u0010\u0001\u0012\u0015\n\u0011FAIL_KEYS_MISSING\u0010\u0002\u0012\u0010\n\fDISCONNECTED\u0010\u0003\"[\n\u0016AccessoryStatusRequest\u0012A\n\u000bmac_address\u0018\u0001 \u0001(\u000b2,.GDI.Proto.RemoteDeviceManagement.MacAddress\"Æ\u0001\n\u0017AccessoryStatusResponse\u0012P\n\u0006result\u0018\u0001 \u0001(\u000e2@.GDI.Proto.RemoteDeviceManagement.AccessoryStatusResponse.Result\u00128\n\u0006device\u0018\u0002 \u0001(\u000b2(.GDI.Proto.RemoteDeviceManagement.Device\"\u001f\n\u0006Result\u0012\b\n\u0004FAIL\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"¹\u0001\n\u0013CapabilitiesRequest\u0012%\n\u001dset_enable_requests_supported\u0018\u0001 \u0001(\b2{\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u001f \u0001(\u000b25.GDI.Proto.RemoteDeviceManagement.CapabilitiesRequest\"©\u0002\n\u0014CapabilitiesResponse\u0012G\n\u0011supported_sensors\u0018\u0001 \u0003(\u000e2,.GDI.Proto.RemoteDeviceManagement.SensorType\u0012$\n\u001cmax_supported_paired_devices\u0018\u0002 \u0001(\r\u0012\"\n\u001aread_only_accessory_status\u0018\u0003 \u0001(\b2~\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u001f \u0001(\u000b26.GDI.Proto.RemoteDeviceManagement.CapabilitiesResponse*l\n\nSensorType\u0012\u0011\n\rNOT_SUPPORTED\u0010\u0000\u0012\u0007\n\u0003ALL\u0010\u0001\u0012\u000e\n\nHEART_RATE\u0010\u0002\u0012\u0018\n\u0014XCEL_STRENGTH_SENSOR\u0010\u0003\u0012\u0018\n\u0014XCEL_STRENGTH_CRADLE\u0010\u0004B9\n\u001acom.garmin.proto.generatedB\u0019GDIRemoteDeviceManagementH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_Device_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_Device_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_fieldAccessorTable;

    public interface AccessoryConnectionNotificationOrBuilder extends MessageOrBuilder {
        Device getDevice();

        DeviceOrBuilder getDeviceOrBuilder();

        AccessoryConnectionNotification.Result getResult();

        boolean hasDevice();

        boolean hasResult();
    }

    public interface AccessoryStatusRequestOrBuilder extends MessageOrBuilder {
        MacAddress getMacAddress();

        MacAddressOrBuilder getMacAddressOrBuilder();

        boolean hasMacAddress();
    }

    public interface AccessoryStatusResponseOrBuilder extends MessageOrBuilder {
        Device getDevice();

        DeviceOrBuilder getDeviceOrBuilder();

        AccessoryStatusResponse.Result getResult();

        boolean hasDevice();

        boolean hasResult();
    }

    public interface CancelPairingRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CancelPairingResponseOrBuilder extends MessageOrBuilder {
        CancelPairingResponse.Result getResult();

        boolean hasResult();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        boolean getSetEnableRequestsSupported();

        boolean hasSetEnableRequestsSupported();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        int getMaxSupportedPairedDevices();

        boolean getReadOnlyAccessoryStatus();

        SensorType getSupportedSensors(int i14);

        int getSupportedSensorsCount();

        List<SensorType> getSupportedSensorsList();

        boolean hasMaxSupportedPairedDevices();

        boolean hasReadOnlyAccessoryStatus();
    }

    public interface DeviceOrBuilder extends MessageOrBuilder {
        int getBatteryPercent();

        String getDeviceName();

        ByteString getDeviceNameBytes();

        MacAddress getMacAddress();

        MacAddressOrBuilder getMacAddressOrBuilder();

        String getManufacturer();

        ByteString getManufacturerBytes();

        String getModelNumber();

        ByteString getModelNumberBytes();

        SensorType getSensorType();

        String getSerialNumber();

        ByteString getSerialNumberBytes();

        Device.SensorStatus getStatus();

        String getSwVersion();

        ByteString getSwVersionBytes();

        boolean hasBatteryPercent();

        boolean hasDeviceName();

        boolean hasMacAddress();

        boolean hasManufacturer();

        boolean hasModelNumber();

        boolean hasSensorType();

        boolean hasSerialNumber();

        boolean hasStatus();

        boolean hasSwVersion();
    }

    public interface MacAddressOrBuilder extends MessageOrBuilder {
        MacAddress.AddressType getAddressType();

        ByteString getMacAddress();

        boolean hasAddressType();

        boolean hasMacAddress();
    }

    public interface PairedListRequestOrBuilder extends MessageOrBuilder {
    }

    public interface PairedListResponseOrBuilder extends MessageOrBuilder {
        Device getDevices(int i14);

        int getDevicesCount();

        List<Device> getDevicesList();

        DeviceOrBuilder getDevicesOrBuilder(int i14);

        List<? extends DeviceOrBuilder> getDevicesOrBuilderList();
    }

    public interface PairingCommandNotificationOrBuilder extends MessageOrBuilder {
        PairingCommandNotification.CommandType getCommand();

        PairingCommandNotification.ConnectionType getConnectionType();

        boolean hasCommand();

        boolean hasConnectionType();
    }

    public interface PairingCompleteNotificationOrBuilder extends MessageOrBuilder {
        PairingCompleteNotification.PairingResult getResult();

        boolean hasResult();
    }

    public interface PairingStatusNotificationOrBuilder extends MessageOrBuilder {
        Device getDevice();

        DeviceOrBuilder getDeviceOrBuilder();

        PairingStatusNotification.NotificationType getType();

        boolean hasDevice();

        boolean hasType();
    }

    public interface RemovePairedDeviceRequestOrBuilder extends MessageOrBuilder {
        MacAddress getMacAddress();

        MacAddressOrBuilder getMacAddressOrBuilder();

        boolean hasMacAddress();
    }

    public interface RemovePairedDeviceResponseOrBuilder extends MessageOrBuilder {
        RemovePairedDeviceResponse.Result getResult();

        boolean hasResult();
    }

    public interface ScanResultsNotificationOrBuilder extends MessageOrBuilder {
        Device getDevices(int i14);

        int getDevicesCount();

        List<Device> getDevicesList();

        DeviceOrBuilder getDevicesOrBuilder(int i14);

        List<? extends DeviceOrBuilder> getDevicesOrBuilderList();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        AccessoryConnectionNotification getAccessoryConnectionNotification();

        AccessoryConnectionNotificationOrBuilder getAccessoryConnectionNotificationOrBuilder();

        AccessoryStatusRequest getAccessoryStatusRequest();

        AccessoryStatusRequestOrBuilder getAccessoryStatusRequestOrBuilder();

        AccessoryStatusResponse getAccessoryStatusResponse();

        AccessoryStatusResponseOrBuilder getAccessoryStatusResponseOrBuilder();

        CancelPairingRequest getCancelPairingRequest();

        CancelPairingRequestOrBuilder getCancelPairingRequestOrBuilder();

        CancelPairingResponse getCancelPairingResponse();

        CancelPairingResponseOrBuilder getCancelPairingResponseOrBuilder();

        PairedListRequest getPairedListRequest();

        PairedListRequestOrBuilder getPairedListRequestOrBuilder();

        PairedListResponse getPairedListResponse();

        PairedListResponseOrBuilder getPairedListResponseOrBuilder();

        PairingCommandNotification getPairingCommandNotification();

        PairingCommandNotificationOrBuilder getPairingCommandNotificationOrBuilder();

        PairingCompleteNotification getPairingCompleteNotification();

        PairingCompleteNotificationOrBuilder getPairingCompleteNotificationOrBuilder();

        PairingStatusNotification getRemoteDeviceStatusNotification();

        PairingStatusNotificationOrBuilder getRemoteDeviceStatusNotificationOrBuilder();

        RemovePairedDeviceRequest getRemovePairedDeviceRequest();

        RemovePairedDeviceRequestOrBuilder getRemovePairedDeviceRequestOrBuilder();

        RemovePairedDeviceResponse getRemovePairedDeviceResponse();

        RemovePairedDeviceResponseOrBuilder getRemovePairedDeviceResponseOrBuilder();

        ScanResultsNotification getScanResultsNotification();

        ScanResultsNotificationOrBuilder getScanResultsNotificationOrBuilder();

        SetEnablePairedDeviceRequest getSetEnablePairedDeviceRequest();

        SetEnablePairedDeviceRequestOrBuilder getSetEnablePairedDeviceRequestOrBuilder();

        SetEnablePairedDeviceResponse getSetEnablePairedDeviceResponse();

        SetEnablePairedDeviceResponseOrBuilder getSetEnablePairedDeviceResponseOrBuilder();

        StartPairingRequest getStartPairingRequest();

        StartPairingRequestOrBuilder getStartPairingRequestOrBuilder();

        StartPairingResponse getStartPairingResponse();

        StartPairingResponseOrBuilder getStartPairingResponseOrBuilder();

        StartScanRequest getStartScanRequest();

        StartScanRequestOrBuilder getStartScanRequestOrBuilder();

        StartScanResponse getStartScanResponse();

        StartScanResponseOrBuilder getStartScanResponseOrBuilder();

        StopScanRequest getStopScanRequest();

        StopScanRequestOrBuilder getStopScanRequestOrBuilder();

        StopScanResponse getStopScanResponse();

        StopScanResponseOrBuilder getStopScanResponseOrBuilder();

        boolean hasAccessoryConnectionNotification();

        boolean hasAccessoryStatusRequest();

        boolean hasAccessoryStatusResponse();

        boolean hasCancelPairingRequest();

        boolean hasCancelPairingResponse();

        boolean hasPairedListRequest();

        boolean hasPairedListResponse();

        boolean hasPairingCommandNotification();

        boolean hasPairingCompleteNotification();

        boolean hasRemoteDeviceStatusNotification();

        boolean hasRemovePairedDeviceRequest();

        boolean hasRemovePairedDeviceResponse();

        boolean hasScanResultsNotification();

        boolean hasSetEnablePairedDeviceRequest();

        boolean hasSetEnablePairedDeviceResponse();

        boolean hasStartPairingRequest();

        boolean hasStartPairingResponse();

        boolean hasStartScanRequest();

        boolean hasStartScanResponse();

        boolean hasStopScanRequest();

        boolean hasStopScanResponse();
    }

    public interface SetEnablePairedDeviceRequestOrBuilder extends MessageOrBuilder {
        boolean getEnabled();

        MacAddress getMacAddress();

        MacAddressOrBuilder getMacAddressOrBuilder();

        int getUnitId();

        boolean hasEnabled();

        boolean hasMacAddress();

        boolean hasUnitId();
    }

    public interface SetEnablePairedDeviceResponseOrBuilder extends MessageOrBuilder {
        SetEnablePairedDeviceResponse.Result getResult();

        boolean hasResult();
    }

    public interface StartPairingRequestOrBuilder extends MessageOrBuilder {
        MacAddress getMacAddress();

        MacAddressOrBuilder getMacAddressOrBuilder();

        boolean hasMacAddress();
    }

    public interface StartPairingResponseOrBuilder extends MessageOrBuilder {
        StartPairingResponse.Result getResult();

        boolean hasResult();
    }

    public interface StartScanRequestOrBuilder extends MessageOrBuilder {
        SensorType getSensorType();

        boolean hasSensorType();
    }

    public interface StartScanResponseOrBuilder extends MessageOrBuilder {
        StartScanResponse.Result getResult();

        boolean hasResult();
    }

    public interface StopScanRequestOrBuilder extends MessageOrBuilder {
    }

    public interface StopScanResponseOrBuilder extends MessageOrBuilder {
        StopScanResponse.Result getResult();

        boolean hasResult();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) a.p(0);
        internal_static_GDI_Proto_RemoteDeviceManagement_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_RemoteDeviceManagement_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"PairedListRequest", "PairedListResponse", "RemovePairedDeviceRequest", "RemovePairedDeviceResponse", "StartPairingRequest", "StartPairingResponse", "CancelPairingRequest", "CancelPairingResponse", "PairingCommandNotification", "RemoteDeviceStatusNotification", "PairingCompleteNotification", "StartScanRequest", "StartScanResponse", "ScanResultsNotification", "AccessoryConnectionNotification", "StopScanRequest", "StopScanResponse", "SetEnablePairedDeviceRequest", "SetEnablePairedDeviceResponse", "AccessoryStatusRequest", "AccessoryStatusResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) a.p(1);
        internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_descriptor = descriptor3;
        internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MacAddress", "AddressType"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) a.p(2);
        internal_static_GDI_Proto_RemoteDeviceManagement_Device_descriptor = descriptor4;
        internal_static_GDI_Proto_RemoteDeviceManagement_Device_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"DeviceName", "MacAddress", "SensorType", "Status", "BatteryPercent", "SwVersion", "SerialNumber", "ModelNumber", "Manufacturer"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) a.p(3);
        internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) a.p(4);
        internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Devices"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) a.p(5);
        internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"MacAddress"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) a.p(6);
        internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Result"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) a.p(7);
        internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Command", "ConnectionType"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) a.p(8);
        internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Type", "Device"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) a.p(9);
        internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[0]);
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) a.p(10);
        internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Result"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) a.p(11);
        internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Result"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) a.p(12);
        internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"MacAddress"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) a.p(13);
        internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Result"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) a.p(14);
        internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_descriptor = descriptor16;
        internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"SensorType"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) a.p(15);
        internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_descriptor = descriptor17;
        internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Result"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) a.p(16);
        internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_descriptor = descriptor18;
        internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[0]);
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) a.p(17);
        internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_descriptor = descriptor19;
        internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Result"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) a.p(18);
        internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_descriptor = descriptor20;
        internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Devices"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) a.p(19);
        internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_descriptor = descriptor21;
        internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Enabled", "MacAddress", "UnitId"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) a.p(20);
        internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_descriptor = descriptor22;
        internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Result"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) a.p(21);
        internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_descriptor = descriptor23;
        internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Result", "Device"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) a.p(22);
        internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_descriptor = descriptor24;
        internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"MacAddress"});
        Descriptors.Descriptor descriptor25 = (Descriptors.Descriptor) a.p(23);
        internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_descriptor = descriptor25;
        internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"Result", "Device"});
        Descriptors.Descriptor descriptor26 = (Descriptors.Descriptor) a.p(24);
        internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_descriptor = descriptor26;
        internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"SetEnableRequestsSupported"});
        Descriptors.Descriptor descriptor27 = (Descriptors.Descriptor) a.p(25);
        internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_descriptor = descriptor27;
        internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"SupportedSensors", "MaxSupportedPairedDevices", "ReadOnlyAccessoryStatus"});
        GDICore.getDescriptor();
    }

    private GDIRemoteDeviceManagement() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class CancelPairingRequest extends GeneratedMessageV3 implements CancelPairingRequestOrBuilder {
        private static final CancelPairingRequest DEFAULT_INSTANCE = new CancelPairingRequest();

        @Deprecated
        public static final Parser<CancelPairingRequest> PARSER = new AbstractParser<CancelPairingRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.CancelPairingRequest.1
            @Override // com.google.protobuf.Parser
            public CancelPairingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CancelPairingRequest.newBuilder();
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

        private CancelPairingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CancelPairingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_descriptor;
        }

        public static Builder newBuilder(CancelPairingRequest cancelPairingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cancelPairingRequest);
        }

        public static CancelPairingRequest parseDelimitedFrom(InputStream inputStream) {
            return (CancelPairingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CancelPairingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CancelPairingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CancelPairingRequest) {
                return getUnknownFields().equals(((CancelPairingRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CancelPairingRequest> getParserForType() {
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
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelPairingRequest.class, Builder.class);
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
            return new CancelPairingRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CancelPairingRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelPairingRequest build() {
                CancelPairingRequest cancelPairingRequestBuildPartial = buildPartial();
                if (cancelPairingRequestBuildPartial.isInitialized()) {
                    return cancelPairingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cancelPairingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelPairingRequest buildPartial() {
                CancelPairingRequest cancelPairingRequest = new CancelPairingRequest(this);
                onBuilt();
                return cancelPairingRequest;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelPairingRequest.class, Builder.class);
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
            public CancelPairingRequest getDefaultInstanceForType() {
                return CancelPairingRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CancelPairingRequest) {
                    return mergeFrom((CancelPairingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CancelPairingRequest cancelPairingRequest) {
                if (cancelPairingRequest == CancelPairingRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(cancelPairingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CancelPairingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CancelPairingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CancelPairingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CancelPairingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelPairingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelPairingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CancelPairingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CancelPairingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CancelPairingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CancelPairingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CancelPairingRequest parseFrom(InputStream inputStream) {
            return (CancelPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CancelPairingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelPairingRequest parseFrom(CodedInputStream codedInputStream) {
            return (CancelPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CancelPairingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 31;
        public static final int SET_ENABLE_REQUESTS_SUPPORTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean setEnableRequestsSupported_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesRequest.1
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
            this.setEnableRequestsSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_descriptor;
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
            if (!(obj instanceof CapabilitiesRequest)) {
                return super.equals(obj);
            }
            CapabilitiesRequest capabilitiesRequest = (CapabilitiesRequest) obj;
            if (hasSetEnableRequestsSupported() != capabilitiesRequest.hasSetEnableRequestsSupported()) {
                return false;
            }
            return (!hasSetEnableRequestsSupported() || getSetEnableRequestsSupported() == capabilitiesRequest.getSetEnableRequestsSupported()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.setEnableRequestsSupported_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesRequestOrBuilder
        public boolean getSetEnableRequestsSupported() {
            return this.setEnableRequestsSupported_;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesRequestOrBuilder
        public boolean hasSetEnableRequestsSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSetEnableRequestsSupported()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSetEnableRequestsSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.setEnableRequestsSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private boolean setEnableRequestsSupported_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesRequest.setEnableRequestsSupported_ = this.setEnableRequestsSupported_;
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_descriptor;
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
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesRequest);
                }
                onBuilt();
                return capabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.setEnableRequestsSupported_ = false;
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

            public Builder clearSetEnableRequestsSupported() {
                this.bitField0_ &= -2;
                this.setEnableRequestsSupported_ = false;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesRequestOrBuilder
            public boolean getSetEnableRequestsSupported() {
                return this.setEnableRequestsSupported_;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesRequestOrBuilder
            public boolean hasSetEnableRequestsSupported() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.setEnableRequestsSupported_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSetEnableRequestsSupported(boolean z14) {
                this.setEnableRequestsSupported_ = z14;
                this.bitField0_ |= 1;
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
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
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
                if (capabilitiesRequest.hasSetEnableRequestsSupported()) {
                    setSetEnableRequestsSupported(capabilitiesRequest.getSetEnableRequestsSupported());
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

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesRequest() {
            this.setEnableRequestsSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class PairedListRequest extends GeneratedMessageV3 implements PairedListRequestOrBuilder {
        private static final PairedListRequest DEFAULT_INSTANCE = new PairedListRequest();

        @Deprecated
        public static final Parser<PairedListRequest> PARSER = new AbstractParser<PairedListRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListRequest.1
            @Override // com.google.protobuf.Parser
            public PairedListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PairedListRequest.newBuilder();
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

        private PairedListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PairedListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_descriptor;
        }

        public static Builder newBuilder(PairedListRequest pairedListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pairedListRequest);
        }

        public static PairedListRequest parseDelimitedFrom(InputStream inputStream) {
            return (PairedListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PairedListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PairedListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof PairedListRequest) {
                return getUnknownFields().equals(((PairedListRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PairedListRequest> getParserForType() {
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
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PairedListRequest.class, Builder.class);
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
            return new PairedListRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PairedListRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairedListRequest build() {
                PairedListRequest pairedListRequestBuildPartial = buildPartial();
                if (pairedListRequestBuildPartial.isInitialized()) {
                    return pairedListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pairedListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairedListRequest buildPartial() {
                PairedListRequest pairedListRequest = new PairedListRequest(this);
                onBuilt();
                return pairedListRequest;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PairedListRequest.class, Builder.class);
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
            public PairedListRequest getDefaultInstanceForType() {
                return PairedListRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PairedListRequest) {
                    return mergeFrom((PairedListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PairedListRequest pairedListRequest) {
                if (pairedListRequest == PairedListRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(pairedListRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PairedListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ PairedListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PairedListRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PairedListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairedListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PairedListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PairedListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PairedListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PairedListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PairedListRequest parseFrom(InputStream inputStream) {
            return (PairedListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PairedListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairedListRequest parseFrom(CodedInputStream codedInputStream) {
            return (PairedListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PairedListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StopScanRequest extends GeneratedMessageV3 implements StopScanRequestOrBuilder {
        private static final StopScanRequest DEFAULT_INSTANCE = new StopScanRequest();

        @Deprecated
        public static final Parser<StopScanRequest> PARSER = new AbstractParser<StopScanRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StopScanRequest.1
            @Override // com.google.protobuf.Parser
            public StopScanRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopScanRequest.newBuilder();
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

        private StopScanRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopScanRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_descriptor;
        }

        public static Builder newBuilder(StopScanRequest stopScanRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopScanRequest);
        }

        public static StopScanRequest parseDelimitedFrom(InputStream inputStream) {
            return (StopScanRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopScanRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopScanRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StopScanRequest) {
                return getUnknownFields().equals(((StopScanRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopScanRequest> getParserForType() {
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
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StopScanRequest.class, Builder.class);
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
            return new StopScanRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopScanRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopScanRequest build() {
                StopScanRequest stopScanRequestBuildPartial = buildPartial();
                if (stopScanRequestBuildPartial.isInitialized()) {
                    return stopScanRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopScanRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopScanRequest buildPartial() {
                StopScanRequest stopScanRequest = new StopScanRequest(this);
                onBuilt();
                return stopScanRequest;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StopScanRequest.class, Builder.class);
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
            public StopScanRequest getDefaultInstanceForType() {
                return StopScanRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StopScanRequest) {
                    return mergeFrom((StopScanRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StopScanRequest stopScanRequest) {
                if (stopScanRequest == StopScanRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(stopScanRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopScanRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StopScanRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StopScanRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopScanRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopScanRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopScanRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StopScanRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopScanRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopScanRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopScanRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopScanRequest parseFrom(InputStream inputStream) {
            return (StopScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopScanRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopScanRequest parseFrom(CodedInputStream codedInputStream) {
            return (StopScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopScanRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AccessoryConnectionNotification extends GeneratedMessageV3 implements AccessoryConnectionNotificationOrBuilder {
        public static final int DEVICE_FIELD_NUMBER = 2;
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Device device_;
        private byte memoizedIsInitialized;
        private int result_;
        private static final AccessoryConnectionNotification DEFAULT_INSTANCE = new AccessoryConnectionNotification();

        @Deprecated
        public static final Parser<AccessoryConnectionNotification> PARSER = new AbstractParser<AccessoryConnectionNotification>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotification.1
            @Override // com.google.protobuf.Parser
            public AccessoryConnectionNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AccessoryConnectionNotification.newBuilder();
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

        private AccessoryConnectionNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessoryConnectionNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_descriptor;
        }

        public static Builder newBuilder(AccessoryConnectionNotification accessoryConnectionNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(accessoryConnectionNotification);
        }

        public static AccessoryConnectionNotification parseDelimitedFrom(InputStream inputStream) {
            return (AccessoryConnectionNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AccessoryConnectionNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AccessoryConnectionNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccessoryConnectionNotification)) {
                return super.equals(obj);
            }
            AccessoryConnectionNotification accessoryConnectionNotification = (AccessoryConnectionNotification) obj;
            if (hasResult() != accessoryConnectionNotification.hasResult()) {
                return false;
            }
            if ((!hasResult() || this.result_ == accessoryConnectionNotification.result_) && hasDevice() == accessoryConnectionNotification.hasDevice()) {
                return (!hasDevice() || getDevice().equals(accessoryConnectionNotification.getDevice())) && getUnknownFields().equals(accessoryConnectionNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
        public Device getDevice() {
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
        public DeviceOrBuilder getDeviceOrBuilder() {
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AccessoryConnectionNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.FAIL_OTHER : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getDevice());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            if (hasDevice()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDevice().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessoryConnectionNotification.class, Builder.class);
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
            return new AccessoryConnectionNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDevice());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccessoryConnectionNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> deviceBuilder_;
            private Device device_;
            private int result_;

            private Builder() {
                this.result_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AccessoryConnectionNotification accessoryConnectionNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    accessoryConnectionNotification.result_ = this.result_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                    accessoryConnectionNotification.device_ = singleFieldBuilderV3 == null ? this.device_ : (Device) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                accessoryConnectionNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_descriptor;
            }

            private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new SingleFieldBuilderV3<>(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeviceFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessoryConnectionNotification build() {
                AccessoryConnectionNotification accessoryConnectionNotificationBuildPartial = buildPartial();
                if (accessoryConnectionNotificationBuildPartial.isInitialized()) {
                    return accessoryConnectionNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accessoryConnectionNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessoryConnectionNotification buildPartial() {
                AccessoryConnectionNotification accessoryConnectionNotification = new AccessoryConnectionNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(accessoryConnectionNotification);
                }
                onBuilt();
                return accessoryConnectionNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
                this.device_ = null;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceBuilder_ = null;
                }
                return this;
            }

            public Builder clearDevice() {
                this.bitField0_ &= -3;
                this.device_ = null;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceBuilder_ = null;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
            public Device getDevice() {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Device) singleFieldBuilderV3.getMessage();
                }
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }

            public Device.Builder getDeviceBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Device.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
            public DeviceOrBuilder getDeviceOrBuilder() {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.FAIL_OTHER : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotificationOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryConnectionNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessoryConnectionNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDevice(Device device) {
                Device device2;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(device);
                } else if ((this.bitField0_ & 2) == 0 || (device2 = this.device_) == null || device2 == Device.getDefaultInstance()) {
                    this.device_ = device;
                } else {
                    getDeviceBuilder().mergeFrom(device);
                }
                if (this.device_ != null) {
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
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDeviceFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDevice(Device.Builder builder) {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.device_ = builder.build();
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

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 1;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AccessoryConnectionNotification getDefaultInstanceForType() {
                return AccessoryConnectionNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setDevice(Device device) {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    device.getClass();
                    this.device_ = device;
                } else {
                    singleFieldBuilderV3.setMessage(device);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AccessoryConnectionNotification) {
                    return mergeFrom((AccessoryConnectionNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AccessoryConnectionNotification accessoryConnectionNotification) {
                if (accessoryConnectionNotification == AccessoryConnectionNotification.getDefaultInstance()) {
                    return this;
                }
                if (accessoryConnectionNotification.hasResult()) {
                    setResult(accessoryConnectionNotification.getResult());
                }
                if (accessoryConnectionNotification.hasDevice()) {
                    mergeDevice(accessoryConnectionNotification.getDevice());
                }
                mergeUnknownFields(accessoryConnectionNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AccessoryConnectionNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AccessoryConnectionNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryConnectionNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessoryConnectionNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AccessoryConnectionNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AccessoryConnectionNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AccessoryConnectionNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AccessoryConnectionNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AccessoryConnectionNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AccessoryConnectionNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AccessoryConnectionNotification parseFrom(InputStream inputStream) {
            return (AccessoryConnectionNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AccessoryConnectionNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryConnectionNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessoryConnectionNotification parseFrom(CodedInputStream codedInputStream) {
            return (AccessoryConnectionNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AccessoryConnectionNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryConnectionNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            FAIL_OTHER(0),
            CONNECTED(1),
            FAIL_KEYS_MISSING(2),
            DISCONNECTED(3);

            public static final int CONNECTED_VALUE = 1;
            public static final int DISCONNECTED_VALUE = 3;
            public static final int FAIL_KEYS_MISSING_VALUE = 2;
            public static final int FAIL_OTHER_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryConnectionNotification.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL_OTHER;
                }
                if (i14 == 1) {
                    return CONNECTED;
                }
                if (i14 == 2) {
                    return FAIL_KEYS_MISSING;
                }
                if (i14 != 3) {
                    return null;
                }
                return DISCONNECTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AccessoryConnectionNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class AccessoryStatusRequest extends GeneratedMessageV3 implements AccessoryStatusRequestOrBuilder {
        public static final int MAC_ADDRESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private MacAddress macAddress_;
        private byte memoizedIsInitialized;
        private static final AccessoryStatusRequest DEFAULT_INSTANCE = new AccessoryStatusRequest();

        @Deprecated
        public static final Parser<AccessoryStatusRequest> PARSER = new AbstractParser<AccessoryStatusRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusRequest.1
            @Override // com.google.protobuf.Parser
            public AccessoryStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AccessoryStatusRequest.newBuilder();
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

        private AccessoryStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessoryStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_descriptor;
        }

        public static Builder newBuilder(AccessoryStatusRequest accessoryStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(accessoryStatusRequest);
        }

        public static AccessoryStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (AccessoryStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AccessoryStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AccessoryStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccessoryStatusRequest)) {
                return super.equals(obj);
            }
            AccessoryStatusRequest accessoryStatusRequest = (AccessoryStatusRequest) obj;
            if (hasMacAddress() != accessoryStatusRequest.hasMacAddress()) {
                return false;
            }
            return (!hasMacAddress() || getMacAddress().equals(accessoryStatusRequest.getMacAddress())) && getUnknownFields().equals(accessoryStatusRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusRequestOrBuilder
        public MacAddress getMacAddress() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusRequestOrBuilder
        public MacAddressOrBuilder getMacAddressOrBuilder() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AccessoryStatusRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMacAddress()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusRequestOrBuilder
        public boolean hasMacAddress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMacAddress()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMacAddress().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessoryStatusRequest.class, Builder.class);
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
            return new AccessoryStatusRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getMacAddress());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccessoryStatusRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> macAddressBuilder_;
            private MacAddress macAddress_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AccessoryStatusRequest accessoryStatusRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                    accessoryStatusRequest.macAddress_ = singleFieldBuilderV3 == null ? this.macAddress_ : (MacAddress) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                accessoryStatusRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_descriptor;
            }

            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> getMacAddressFieldBuilder() {
                if (this.macAddressBuilder_ == null) {
                    this.macAddressBuilder_ = new SingleFieldBuilderV3<>(getMacAddress(), getParentForChildren(), isClean());
                    this.macAddress_ = null;
                }
                return this.macAddressBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMacAddressFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessoryStatusRequest build() {
                AccessoryStatusRequest accessoryStatusRequestBuildPartial = buildPartial();
                if (accessoryStatusRequestBuildPartial.isInitialized()) {
                    return accessoryStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accessoryStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessoryStatusRequest buildPartial() {
                AccessoryStatusRequest accessoryStatusRequest = new AccessoryStatusRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(accessoryStatusRequest);
                }
                onBuilt();
                return accessoryStatusRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAddress() {
                this.bitField0_ &= -2;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusRequestOrBuilder
            public MacAddress getMacAddress() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddress) singleFieldBuilderV3.getMessage();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            public MacAddress.Builder getMacAddressBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (MacAddress.Builder) getMacAddressFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusRequestOrBuilder
            public MacAddressOrBuilder getMacAddressOrBuilder() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddressOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusRequestOrBuilder
            public boolean hasMacAddress() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessoryStatusRequest.class, Builder.class);
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getMacAddressFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeMacAddress(MacAddress macAddress) {
                MacAddress macAddress2;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(macAddress);
                } else if ((this.bitField0_ & 1) == 0 || (macAddress2 = this.macAddress_) == null || macAddress2 == MacAddress.getDefaultInstance()) {
                    this.macAddress_ = macAddress;
                } else {
                    getMacAddressBuilder().mergeFrom(macAddress);
                }
                if (this.macAddress_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
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

            public Builder setMacAddress(MacAddress.Builder builder) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.macAddress_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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
            public AccessoryStatusRequest getDefaultInstanceForType() {
                return AccessoryStatusRequest.getDefaultInstance();
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

            public Builder setMacAddress(MacAddress macAddress) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    macAddress.getClass();
                    this.macAddress_ = macAddress;
                } else {
                    singleFieldBuilderV3.setMessage(macAddress);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AccessoryStatusRequest) {
                    return mergeFrom((AccessoryStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AccessoryStatusRequest accessoryStatusRequest) {
                if (accessoryStatusRequest == AccessoryStatusRequest.getDefaultInstance()) {
                    return this;
                }
                if (accessoryStatusRequest.hasMacAddress()) {
                    mergeMacAddress(accessoryStatusRequest.getMacAddress());
                }
                mergeUnknownFields(accessoryStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AccessoryStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AccessoryStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AccessoryStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessoryStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessoryStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AccessoryStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AccessoryStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AccessoryStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AccessoryStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AccessoryStatusRequest parseFrom(InputStream inputStream) {
            return (AccessoryStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AccessoryStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessoryStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (AccessoryStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AccessoryStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AccessoryStatusResponse extends GeneratedMessageV3 implements AccessoryStatusResponseOrBuilder {
        public static final int DEVICE_FIELD_NUMBER = 2;
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Device device_;
        private byte memoizedIsInitialized;
        private int result_;
        private static final AccessoryStatusResponse DEFAULT_INSTANCE = new AccessoryStatusResponse();

        @Deprecated
        public static final Parser<AccessoryStatusResponse> PARSER = new AbstractParser<AccessoryStatusResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponse.1
            @Override // com.google.protobuf.Parser
            public AccessoryStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AccessoryStatusResponse.newBuilder();
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

        private AccessoryStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessoryStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_descriptor;
        }

        public static Builder newBuilder(AccessoryStatusResponse accessoryStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(accessoryStatusResponse);
        }

        public static AccessoryStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (AccessoryStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AccessoryStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AccessoryStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccessoryStatusResponse)) {
                return super.equals(obj);
            }
            AccessoryStatusResponse accessoryStatusResponse = (AccessoryStatusResponse) obj;
            if (hasResult() != accessoryStatusResponse.hasResult()) {
                return false;
            }
            if ((!hasResult() || this.result_ == accessoryStatusResponse.result_) && hasDevice() == accessoryStatusResponse.hasDevice()) {
                return (!hasDevice() || getDevice().equals(accessoryStatusResponse.getDevice())) && getUnknownFields().equals(accessoryStatusResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
        public Device getDevice() {
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
        public DeviceOrBuilder getDeviceOrBuilder() {
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AccessoryStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.FAIL : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getDevice());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            if (hasDevice()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDevice().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessoryStatusResponse.class, Builder.class);
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
            return new AccessoryStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDevice());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccessoryStatusResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> deviceBuilder_;
            private Device device_;
            private int result_;

            private Builder() {
                this.result_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AccessoryStatusResponse accessoryStatusResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    accessoryStatusResponse.result_ = this.result_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                    accessoryStatusResponse.device_ = singleFieldBuilderV3 == null ? this.device_ : (Device) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                accessoryStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_descriptor;
            }

            private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new SingleFieldBuilderV3<>(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeviceFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessoryStatusResponse build() {
                AccessoryStatusResponse accessoryStatusResponseBuildPartial = buildPartial();
                if (accessoryStatusResponseBuildPartial.isInitialized()) {
                    return accessoryStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accessoryStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessoryStatusResponse buildPartial() {
                AccessoryStatusResponse accessoryStatusResponse = new AccessoryStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(accessoryStatusResponse);
                }
                onBuilt();
                return accessoryStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
                this.device_ = null;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceBuilder_ = null;
                }
                return this;
            }

            public Builder clearDevice() {
                this.bitField0_ &= -3;
                this.device_ = null;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceBuilder_ = null;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
            public Device getDevice() {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Device) singleFieldBuilderV3.getMessage();
                }
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }

            public Device.Builder getDeviceBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Device.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
            public DeviceOrBuilder getDeviceOrBuilder() {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.FAIL : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_AccessoryStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessoryStatusResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDevice(Device device) {
                Device device2;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(device);
                } else if ((this.bitField0_ & 2) == 0 || (device2 = this.device_) == null || device2 == Device.getDefaultInstance()) {
                    this.device_ = device;
                } else {
                    getDeviceBuilder().mergeFrom(device);
                }
                if (this.device_ != null) {
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
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDeviceFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDevice(Device.Builder builder) {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.device_ = builder.build();
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

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 1;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AccessoryStatusResponse getDefaultInstanceForType() {
                return AccessoryStatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setDevice(Device device) {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    device.getClass();
                    this.device_ = device;
                } else {
                    singleFieldBuilderV3.setMessage(device);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AccessoryStatusResponse) {
                    return mergeFrom((AccessoryStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AccessoryStatusResponse accessoryStatusResponse) {
                if (accessoryStatusResponse == AccessoryStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (accessoryStatusResponse.hasResult()) {
                    setResult(accessoryStatusResponse.getResult());
                }
                if (accessoryStatusResponse.hasDevice()) {
                    mergeDevice(accessoryStatusResponse.getDevice());
                }
                mergeUnknownFields(accessoryStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AccessoryStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AccessoryStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessoryStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AccessoryStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AccessoryStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AccessoryStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AccessoryStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AccessoryStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AccessoryStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AccessoryStatusResponse parseFrom(InputStream inputStream) {
            return (AccessoryStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AccessoryStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessoryStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (AccessoryStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AccessoryStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            FAIL(0),
            SUCCESS(1);

            public static final int FAIL_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.AccessoryStatusResponse.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AccessoryStatusResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class CancelPairingResponse extends GeneratedMessageV3 implements CancelPairingResponseOrBuilder {
        private static final CancelPairingResponse DEFAULT_INSTANCE = new CancelPairingResponse();

        @Deprecated
        public static final Parser<CancelPairingResponse> PARSER = new AbstractParser<CancelPairingResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.CancelPairingResponse.1
            @Override // com.google.protobuf.Parser
            public CancelPairingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CancelPairingResponse.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private CancelPairingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CancelPairingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_descriptor;
        }

        public static Builder newBuilder(CancelPairingResponse cancelPairingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cancelPairingResponse);
        }

        public static CancelPairingResponse parseDelimitedFrom(InputStream inputStream) {
            return (CancelPairingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CancelPairingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CancelPairingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CancelPairingResponse)) {
                return super.equals(obj);
            }
            CancelPairingResponse cancelPairingResponse = (CancelPairingResponse) obj;
            if (hasResult() != cancelPairingResponse.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == cancelPairingResponse.result_) && getUnknownFields().equals(cancelPairingResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CancelPairingResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CancelPairingResponseOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.FAIL : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CancelPairingResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelPairingResponse.class, Builder.class);
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
            return new CancelPairingResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CancelPairingResponseOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(CancelPairingResponse cancelPairingResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    cancelPairingResponse.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                cancelPairingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelPairingResponse build() {
                CancelPairingResponse cancelPairingResponseBuildPartial = buildPartial();
                if (cancelPairingResponseBuildPartial.isInitialized()) {
                    return cancelPairingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cancelPairingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelPairingResponse buildPartial() {
                CancelPairingResponse cancelPairingResponse = new CancelPairingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cancelPairingResponse);
                }
                onBuilt();
                return cancelPairingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CancelPairingResponseOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.FAIL : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CancelPairingResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CancelPairingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelPairingResponse.class, Builder.class);
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
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 1;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CancelPairingResponse getDefaultInstanceForType() {
                return CancelPairingResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CancelPairingResponse) {
                    return mergeFrom((CancelPairingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CancelPairingResponse cancelPairingResponse) {
                if (cancelPairingResponse == CancelPairingResponse.getDefaultInstance()) {
                    return this;
                }
                if (cancelPairingResponse.hasResult()) {
                    setResult(cancelPairingResponse.getResult());
                }
                mergeUnknownFields(cancelPairingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CancelPairingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CancelPairingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelPairingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelPairingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CancelPairingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CancelPairingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CancelPairingResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CancelPairingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CancelPairingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CancelPairingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CancelPairingResponse parseFrom(InputStream inputStream) {
            return (CancelPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CancelPairingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelPairingResponse parseFrom(CodedInputStream codedInputStream) {
            return (CancelPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CancelPairingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            FAIL(0),
            SUCCESS(1);

            public static final int FAIL_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.CancelPairingResponse.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CancelPairingResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 31;
        public static final int MAX_SUPPORTED_PAIRED_DEVICES_FIELD_NUMBER = 2;
        public static final int READ_ONLY_ACCESSORY_STATUS_FIELD_NUMBER = 3;
        public static final int SUPPORTED_SENSORS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int maxSupportedPairedDevices_;
        private byte memoizedIsInitialized;
        private boolean readOnlyAccessoryStatus_;
        private List<Integer> supportedSensors_;
        private static final Internal.ListAdapter.Converter<Integer, SensorType> supportedSensors_converter_ = new Internal.ListAdapter.Converter<Integer, SensorType>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public SensorType convert(Integer num) {
                SensorType sensorTypeForNumber = SensorType.forNumber(num.intValue());
                return sensorTypeForNumber == null ? SensorType.NOT_SUPPORTED : sensorTypeForNumber;
            }
        };
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponse.2
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

        private CapabilitiesResponse() {
            this.maxSupportedPairedDevices_ = 0;
            this.readOnlyAccessoryStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.supportedSensors_ = Collections.EMPTY_LIST;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_descriptor;
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
            if (!this.supportedSensors_.equals(capabilitiesResponse.supportedSensors_) || hasMaxSupportedPairedDevices() != capabilitiesResponse.hasMaxSupportedPairedDevices()) {
                return false;
            }
            if ((!hasMaxSupportedPairedDevices() || getMaxSupportedPairedDevices() == capabilitiesResponse.getMaxSupportedPairedDevices()) && hasReadOnlyAccessoryStatus() == capabilitiesResponse.hasReadOnlyAccessoryStatus()) {
                return (!hasReadOnlyAccessoryStatus() || getReadOnlyAccessoryStatus() == capabilitiesResponse.getReadOnlyAccessoryStatus()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
        public int getMaxSupportedPairedDevices() {
            return this.maxSupportedPairedDevices_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
        public boolean getReadOnlyAccessoryStatus() {
            return this.readOnlyAccessoryStatus_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            List<Integer> list;
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.supportedSensors_.size();
                list = this.supportedSensors_;
                if (i15 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
            int size2 = list.size() + iA;
            if ((this.bitField0_ & 1) != 0) {
                size2 += CodedOutputStream.computeUInt32Size(2, this.maxSupportedPairedDevices_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size2 += CodedOutputStream.computeBoolSize(3, this.readOnlyAccessoryStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
        public SensorType getSupportedSensors(int i14) {
            return supportedSensors_converter_.convert(this.supportedSensors_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
        public int getSupportedSensorsCount() {
            return this.supportedSensors_.size();
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
        public List<SensorType> getSupportedSensorsList() {
            return new Internal.ListAdapter(this.supportedSensors_, supportedSensors_converter_);
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
        public boolean hasMaxSupportedPairedDevices() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
        public boolean hasReadOnlyAccessoryStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSupportedSensorsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.supportedSensors_.hashCode();
            }
            if (hasMaxSupportedPairedDevices()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMaxSupportedPairedDevices();
            }
            if (hasReadOnlyAccessoryStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getReadOnlyAccessoryStatus());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            int iF = 0;
            while (iF < this.supportedSensors_.size()) {
                iF = f3.f(this.supportedSensors_.get(iF), codedOutputStream, 1, iF, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(2, this.maxSupportedPairedDevices_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(3, this.readOnlyAccessoryStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private int maxSupportedPairedDevices_;
            private boolean readOnlyAccessoryStatus_;
            private List<Integer> supportedSensors_;

            private Builder() {
                this.supportedSensors_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 2) != 0) {
                    capabilitiesResponse.maxSupportedPairedDevices_ = this.maxSupportedPairedDevices_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    capabilitiesResponse.readOnlyAccessoryStatus_ = this.readOnlyAccessoryStatus_;
                    i14 |= 2;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(CapabilitiesResponse capabilitiesResponse) {
                if ((this.bitField0_ & 1) != 0) {
                    this.supportedSensors_ = Collections.unmodifiableList(this.supportedSensors_);
                    this.bitField0_ &= -2;
                }
                capabilitiesResponse.supportedSensors_ = this.supportedSensors_;
            }

            private void ensureSupportedSensorsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.supportedSensors_ = new ArrayList(this.supportedSensors_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_descriptor;
            }

            public Builder addAllSupportedSensors(Iterable<? extends SensorType> iterable) {
                ensureSupportedSensorsIsMutable();
                Iterator<? extends SensorType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedSensors_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedSensors(SensorType sensorType) {
                sensorType.getClass();
                ensureSupportedSensorsIsMutable();
                this.supportedSensors_.add(Integer.valueOf(sensorType.getNumber()));
                onChanged();
                return this;
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
                buildPartialRepeatedFields(capabilitiesResponse);
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
                this.supportedSensors_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                this.maxSupportedPairedDevices_ = 0;
                this.readOnlyAccessoryStatus_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxSupportedPairedDevices() {
                this.bitField0_ &= -3;
                this.maxSupportedPairedDevices_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearReadOnlyAccessoryStatus() {
                this.bitField0_ &= -5;
                this.readOnlyAccessoryStatus_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportedSensors() {
                this.supportedSensors_ = Collections.EMPTY_LIST;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
            public int getMaxSupportedPairedDevices() {
                return this.maxSupportedPairedDevices_;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
            public boolean getReadOnlyAccessoryStatus() {
                return this.readOnlyAccessoryStatus_;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
            public SensorType getSupportedSensors(int i14) {
                return (SensorType) CapabilitiesResponse.supportedSensors_converter_.convert(this.supportedSensors_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
            public int getSupportedSensorsCount() {
                return this.supportedSensors_.size();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
            public List<SensorType> getSupportedSensorsList() {
                return new Internal.ListAdapter(this.supportedSensors_, CapabilitiesResponse.supportedSensors_converter_);
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
            public boolean hasMaxSupportedPairedDevices() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.CapabilitiesResponseOrBuilder
            public boolean hasReadOnlyAccessoryStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    if (SensorType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureSupportedSensorsIsMutable();
                                        this.supportedSensors_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (SensorType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSupportedSensorsIsMutable();
                                            this.supportedSensors_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 16) {
                                    this.maxSupportedPairedDevices_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.readOnlyAccessoryStatus_ = codedInputStream.readBool();
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

            public Builder setMaxSupportedPairedDevices(int i14) {
                this.maxSupportedPairedDevices_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setReadOnlyAccessoryStatus(boolean z14) {
                this.readOnlyAccessoryStatus_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSupportedSensors(int i14, SensorType sensorType) {
                sensorType.getClass();
                ensureSupportedSensorsIsMutable();
                this.supportedSensors_.set(i14, Integer.valueOf(sensorType.getNumber()));
                onChanged();
                return this;
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
                this.supportedSensors_ = Collections.EMPTY_LIST;
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
                if (!capabilitiesResponse.supportedSensors_.isEmpty()) {
                    if (this.supportedSensors_.isEmpty()) {
                        this.supportedSensors_ = capabilitiesResponse.supportedSensors_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSupportedSensorsIsMutable();
                        this.supportedSensors_.addAll(capabilitiesResponse.supportedSensors_);
                    }
                    onChanged();
                }
                if (capabilitiesResponse.hasMaxSupportedPairedDevices()) {
                    setMaxSupportedPairedDevices(capabilitiesResponse.getMaxSupportedPairedDevices());
                }
                if (capabilitiesResponse.hasReadOnlyAccessoryStatus()) {
                    setReadOnlyAccessoryStatus(capabilitiesResponse.getReadOnlyAccessoryStatus());
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

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.maxSupportedPairedDevices_ = 0;
            this.readOnlyAccessoryStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Device extends GeneratedMessageV3 implements DeviceOrBuilder {
        public static final int BATTERY_PERCENT_FIELD_NUMBER = 5;
        public static final int DEVICE_NAME_FIELD_NUMBER = 1;
        public static final int MAC_ADDRESS_FIELD_NUMBER = 2;
        public static final int MANUFACTURER_FIELD_NUMBER = 9;
        public static final int MODEL_NUMBER_FIELD_NUMBER = 8;
        public static final int SENSOR_TYPE_FIELD_NUMBER = 3;
        public static final int SERIAL_NUMBER_FIELD_NUMBER = 7;
        public static final int STATUS_FIELD_NUMBER = 4;
        public static final int SW_VERSION_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int batteryPercent_;
        private int bitField0_;
        private volatile Object deviceName_;
        private MacAddress macAddress_;
        private volatile Object manufacturer_;
        private byte memoizedIsInitialized;
        private volatile Object modelNumber_;
        private int sensorType_;
        private volatile Object serialNumber_;
        private int status_;
        private volatile Object swVersion_;
        private static final Device DEFAULT_INSTANCE = new Device();

        @Deprecated
        public static final Parser<Device> PARSER = new AbstractParser<Device>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.Device.1
            @Override // com.google.protobuf.Parser
            public Device parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Device.newBuilder();
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

        private Device() {
            this.deviceName_ = "";
            this.sensorType_ = 0;
            this.status_ = 0;
            this.batteryPercent_ = 0;
            this.swVersion_ = "";
            this.serialNumber_ = "";
            this.modelNumber_ = "";
            this.manufacturer_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.deviceName_ = "";
            this.sensorType_ = 0;
            this.status_ = 0;
            this.swVersion_ = "";
            this.serialNumber_ = "";
            this.modelNumber_ = "";
            this.manufacturer_ = "";
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Device_descriptor;
        }

        public static Builder newBuilder(Device device) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream) {
            return (Device) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Device> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return super.equals(obj);
            }
            Device device = (Device) obj;
            if (hasDeviceName() != device.hasDeviceName()) {
                return false;
            }
            if ((hasDeviceName() && !getDeviceName().equals(device.getDeviceName())) || hasMacAddress() != device.hasMacAddress()) {
                return false;
            }
            if ((hasMacAddress() && !getMacAddress().equals(device.getMacAddress())) || hasSensorType() != device.hasSensorType()) {
                return false;
            }
            if ((hasSensorType() && this.sensorType_ != device.sensorType_) || hasStatus() != device.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != device.status_) || hasBatteryPercent() != device.hasBatteryPercent()) {
                return false;
            }
            if ((hasBatteryPercent() && getBatteryPercent() != device.getBatteryPercent()) || hasSwVersion() != device.hasSwVersion()) {
                return false;
            }
            if ((hasSwVersion() && !getSwVersion().equals(device.getSwVersion())) || hasSerialNumber() != device.hasSerialNumber()) {
                return false;
            }
            if ((hasSerialNumber() && !getSerialNumber().equals(device.getSerialNumber())) || hasModelNumber() != device.hasModelNumber()) {
                return false;
            }
            if ((!hasModelNumber() || getModelNumber().equals(device.getModelNumber())) && hasManufacturer() == device.hasManufacturer()) {
                return (!hasManufacturer() || getManufacturer().equals(device.getManufacturer())) && getUnknownFields().equals(device.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public int getBatteryPercent() {
            return this.batteryPercent_;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public String getDeviceName() {
            Object obj = this.deviceName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public ByteString getDeviceNameBytes() {
            Object obj = this.deviceName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public MacAddress getMacAddress() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public MacAddressOrBuilder getMacAddressOrBuilder() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public String getManufacturer() {
            Object obj = this.manufacturer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.manufacturer_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public ByteString getManufacturerBytes() {
            Object obj = this.manufacturer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.manufacturer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public String getModelNumber() {
            Object obj = this.modelNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.modelNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public ByteString getModelNumberBytes() {
            Object obj = this.modelNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.modelNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Device> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public SensorType getSensorType() {
            SensorType sensorTypeForNumber = SensorType.forNumber(this.sensorType_);
            return sensorTypeForNumber == null ? SensorType.NOT_SUPPORTED : sensorTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public String getSerialNumber() {
            Object obj = this.serialNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.serialNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public ByteString getSerialNumberBytes() {
            Object obj = this.serialNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.serialNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.deviceName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getMacAddress());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.sensorType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(4, this.status_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.batteryPercent_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.swVersion_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.serialNumber_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.modelNumber_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.manufacturer_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public SensorStatus getStatus() {
            SensorStatus sensorStatusForNumber = SensorStatus.forNumber(this.status_);
            return sensorStatusForNumber == null ? SensorStatus.UNKNOWN : sensorStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public String getSwVersion() {
            Object obj = this.swVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.swVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public ByteString getSwVersionBytes() {
            Object obj = this.swVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.swVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasBatteryPercent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasDeviceName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasMacAddress() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasManufacturer() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasModelNumber() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasSensorType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasSerialNumber() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
        public boolean hasSwVersion() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDeviceName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeviceName().hashCode();
            }
            if (hasMacAddress()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMacAddress().hashCode();
            }
            if (hasSensorType()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.sensorType_;
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.status_;
            }
            if (hasBatteryPercent()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getBatteryPercent();
            }
            if (hasSwVersion()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getSwVersion().hashCode();
            }
            if (hasSerialNumber()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSerialNumber().hashCode();
            }
            if (hasModelNumber()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getModelNumber().hashCode();
            }
            if (hasManufacturer()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getManufacturer().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
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
            return new Device();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.deviceName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getMacAddress());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.sensorType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.status_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.batteryPercent_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.swVersion_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.serialNumber_);
            }
            if ((this.bitField0_ & 128) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.modelNumber_);
            }
            if ((this.bitField0_ & 256) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.manufacturer_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceOrBuilder {
            private int batteryPercent_;
            private int bitField0_;
            private Object deviceName_;
            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> macAddressBuilder_;
            private MacAddress macAddress_;
            private Object manufacturer_;
            private Object modelNumber_;
            private int sensorType_;
            private Object serialNumber_;
            private int status_;
            private Object swVersion_;

            private Builder() {
                this.deviceName_ = "";
                this.sensorType_ = 0;
                this.status_ = 0;
                this.swVersion_ = "";
                this.serialNumber_ = "";
                this.modelNumber_ = "";
                this.manufacturer_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Device device) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    device.deviceName_ = this.deviceName_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                    device.macAddress_ = singleFieldBuilderV3 == null ? this.macAddress_ : (MacAddress) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    device.sensorType_ = this.sensorType_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    device.status_ = this.status_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    device.batteryPercent_ = this.batteryPercent_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    device.swVersion_ = this.swVersion_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    device.serialNumber_ = this.serialNumber_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    device.modelNumber_ = this.modelNumber_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    device.manufacturer_ = this.manufacturer_;
                    i14 |= 256;
                }
                device.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Device_descriptor;
            }

            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> getMacAddressFieldBuilder() {
                if (this.macAddressBuilder_ == null) {
                    this.macAddressBuilder_ = new SingleFieldBuilderV3<>(getMacAddress(), getParentForChildren(), isClean());
                    this.macAddress_ = null;
                }
                return this.macAddressBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMacAddressFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Device build() {
                Device deviceBuildPartial = buildPartial();
                if (deviceBuildPartial.isInitialized()) {
                    return deviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Device buildPartial() {
                Device device = new Device(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(device);
                }
                onBuilt();
                return device;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deviceName_ = "";
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
                this.sensorType_ = 0;
                this.status_ = 0;
                this.batteryPercent_ = 0;
                this.swVersion_ = "";
                this.serialNumber_ = "";
                this.modelNumber_ = "";
                this.manufacturer_ = "";
                return this;
            }

            public Builder clearBatteryPercent() {
                this.bitField0_ &= -17;
                this.batteryPercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDeviceName() {
                this.deviceName_ = Device.getDefaultInstance().getDeviceName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAddress() {
                this.bitField0_ &= -3;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearManufacturer() {
                this.manufacturer_ = Device.getDefaultInstance().getManufacturer();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearModelNumber() {
                this.modelNumber_ = Device.getDefaultInstance().getModelNumber();
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSensorType() {
                this.bitField0_ &= -5;
                this.sensorType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSerialNumber() {
                this.serialNumber_ = Device.getDefaultInstance().getSerialNumber();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -9;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSwVersion() {
                this.swVersion_ = Device.getDefaultInstance().getSwVersion();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public int getBatteryPercent() {
                return this.batteryPercent_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Device_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public String getDeviceName() {
                Object obj = this.deviceName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public ByteString getDeviceNameBytes() {
                Object obj = this.deviceName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public MacAddress getMacAddress() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddress) singleFieldBuilderV3.getMessage();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            public MacAddress.Builder getMacAddressBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (MacAddress.Builder) getMacAddressFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public MacAddressOrBuilder getMacAddressOrBuilder() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddressOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public String getManufacturer() {
                Object obj = this.manufacturer_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.manufacturer_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public ByteString getManufacturerBytes() {
                Object obj = this.manufacturer_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.manufacturer_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public String getModelNumber() {
                Object obj = this.modelNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.modelNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public ByteString getModelNumberBytes() {
                Object obj = this.modelNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.modelNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public SensorType getSensorType() {
                SensorType sensorTypeForNumber = SensorType.forNumber(this.sensorType_);
                return sensorTypeForNumber == null ? SensorType.NOT_SUPPORTED : sensorTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public String getSerialNumber() {
                Object obj = this.serialNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.serialNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public ByteString getSerialNumberBytes() {
                Object obj = this.serialNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serialNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public SensorStatus getStatus() {
                SensorStatus sensorStatusForNumber = SensorStatus.forNumber(this.status_);
                return sensorStatusForNumber == null ? SensorStatus.UNKNOWN : sensorStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public String getSwVersion() {
                Object obj = this.swVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.swVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public ByteString getSwVersionBytes() {
                Object obj = this.swVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.swVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasBatteryPercent() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasDeviceName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasMacAddress() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasManufacturer() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasModelNumber() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasSensorType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasSerialNumber() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.DeviceOrBuilder
            public boolean hasSwVersion() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
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
                                if (tag == 10) {
                                    this.deviceName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getMacAddressFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SensorType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.sensorType_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    int i15 = codedInputStream.readEnum();
                                    if (SensorStatus.forNumber(i15) == null) {
                                        mergeUnknownVarintField(4, i15);
                                    } else {
                                        this.status_ = i15;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 40) {
                                    this.batteryPercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.swVersion_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    this.serialNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    this.modelNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 128;
                                } else if (tag == 74) {
                                    this.manufacturer_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 256;
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

            public Builder mergeMacAddress(MacAddress macAddress) {
                MacAddress macAddress2;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(macAddress);
                } else if ((this.bitField0_ & 2) == 0 || (macAddress2 = this.macAddress_) == null || macAddress2 == MacAddress.getDefaultInstance()) {
                    this.macAddress_ = macAddress;
                } else {
                    getMacAddressBuilder().mergeFrom(macAddress);
                }
                if (this.macAddress_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBatteryPercent(int i14) {
                this.batteryPercent_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDeviceName(String str) {
                str.getClass();
                this.deviceName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDeviceNameBytes(ByteString byteString) {
                byteString.getClass();
                this.deviceName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMacAddress(MacAddress.Builder builder) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.macAddress_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setManufacturer(String str) {
                str.getClass();
                this.manufacturer_ = str;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setManufacturerBytes(ByteString byteString) {
                byteString.getClass();
                this.manufacturer_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setModelNumber(String str) {
                str.getClass();
                this.modelNumber_ = str;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setModelNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.modelNumber_ = byteString;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSensorType(SensorType sensorType) {
                sensorType.getClass();
                this.bitField0_ |= 4;
                this.sensorType_ = sensorType.getNumber();
                onChanged();
                return this;
            }

            public Builder setSerialNumber(String str) {
                str.getClass();
                this.serialNumber_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSerialNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.serialNumber_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStatus(SensorStatus sensorStatus) {
                sensorStatus.getClass();
                this.bitField0_ |= 8;
                this.status_ = sensorStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setSwVersion(String str) {
                str.getClass();
                this.swVersion_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSwVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.swVersion_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Device getDefaultInstanceForType() {
                return Device.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.deviceName_ = "";
                this.sensorType_ = 0;
                this.status_ = 0;
                this.swVersion_ = "";
                this.serialNumber_ = "";
                this.modelNumber_ = "";
                this.manufacturer_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setMacAddress(MacAddress macAddress) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    macAddress.getClass();
                    this.macAddress_ = macAddress;
                } else {
                    singleFieldBuilderV3.setMessage(macAddress);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Device) {
                    return mergeFrom((Device) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Device device) {
                if (device == Device.getDefaultInstance()) {
                    return this;
                }
                if (device.hasDeviceName()) {
                    this.deviceName_ = device.deviceName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (device.hasMacAddress()) {
                    mergeMacAddress(device.getMacAddress());
                }
                if (device.hasSensorType()) {
                    setSensorType(device.getSensorType());
                }
                if (device.hasStatus()) {
                    setStatus(device.getStatus());
                }
                if (device.hasBatteryPercent()) {
                    setBatteryPercent(device.getBatteryPercent());
                }
                if (device.hasSwVersion()) {
                    this.swVersion_ = device.swVersion_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (device.hasSerialNumber()) {
                    this.serialNumber_ = device.serialNumber_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (device.hasModelNumber()) {
                    this.modelNumber_ = device.modelNumber_;
                    this.bitField0_ |= 128;
                    onChanged();
                }
                if (device.hasManufacturer()) {
                    this.manufacturer_ = device.manufacturer_;
                    this.bitField0_ |= 256;
                    onChanged();
                }
                mergeUnknownFields(device.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Device getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Device parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Device) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Device parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Device parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Device parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Device parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Device parseFrom(InputStream inputStream) {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(CodedInputStream codedInputStream) {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Device parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SensorStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            SEARCHING(1),
            NO_CONNECTIONS(2),
            NOT_CONNECTABLE(3),
            REQUIRES_REPAIRING(4),
            DISABLED(5),
            DISCONNECTED(6),
            CONNECTED(7);

            public static final int CONNECTED_VALUE = 7;
            public static final int DISABLED_VALUE = 5;
            public static final int DISCONNECTED_VALUE = 6;
            public static final int NOT_CONNECTABLE_VALUE = 3;
            public static final int NO_CONNECTIONS_VALUE = 2;
            public static final int REQUIRES_REPAIRING_VALUE = 4;
            public static final int SEARCHING_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<SensorStatus> internalValueMap = new Internal.EnumLiteMap<SensorStatus>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.Device.SensorStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SensorStatus findValueByNumber(int i14) {
                    return SensorStatus.forNumber(i14);
                }
            };
            private static final SensorStatus[] VALUES = values();

            SensorStatus(int i14) {
                this.value = i14;
            }

            public static SensorStatus forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return SEARCHING;
                    case 2:
                        return NO_CONNECTIONS;
                    case 3:
                        return NOT_CONNECTABLE;
                    case 4:
                        return REQUIRES_REPAIRING;
                    case 5:
                        return DISABLED;
                    case 6:
                        return DISCONNECTED;
                    case 7:
                        return CONNECTED;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Device.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SensorStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static SensorStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SensorStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private Device(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.deviceName_ = "";
            this.sensorType_ = 0;
            this.status_ = 0;
            this.batteryPercent_ = 0;
            this.swVersion_ = "";
            this.serialNumber_ = "";
            this.modelNumber_ = "";
            this.manufacturer_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Device(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class MacAddress extends GeneratedMessageV3 implements MacAddressOrBuilder {
        public static final int ADDRESS_TYPE_FIELD_NUMBER = 2;
        public static final int MAC_ADDRESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int addressType_;
        private int bitField0_;
        private ByteString macAddress_;
        private byte memoizedIsInitialized;
        private static final MacAddress DEFAULT_INSTANCE = new MacAddress();

        @Deprecated
        public static final Parser<MacAddress> PARSER = new AbstractParser<MacAddress>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddress.1
            @Override // com.google.protobuf.Parser
            public MacAddress parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MacAddress.newBuilder();
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

        private MacAddress(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.macAddress_ = ByteString.EMPTY;
            this.addressType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MacAddress getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_descriptor;
        }

        public static Builder newBuilder(MacAddress macAddress) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(macAddress);
        }

        public static MacAddress parseDelimitedFrom(InputStream inputStream) {
            return (MacAddress) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MacAddress parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MacAddress> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MacAddress)) {
                return super.equals(obj);
            }
            MacAddress macAddress = (MacAddress) obj;
            if (hasMacAddress() != macAddress.hasMacAddress()) {
                return false;
            }
            if ((!hasMacAddress() || getMacAddress().equals(macAddress.getMacAddress())) && hasAddressType() == macAddress.hasAddressType()) {
                return (!hasAddressType() || this.addressType_ == macAddress.addressType_) && getUnknownFields().equals(macAddress.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddressOrBuilder
        public AddressType getAddressType() {
            AddressType addressTypeForNumber = AddressType.forNumber(this.addressType_);
            return addressTypeForNumber == null ? AddressType.UNKNOWN : addressTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddressOrBuilder
        public ByteString getMacAddress() {
            return this.macAddress_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MacAddress> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.macAddress_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.addressType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddressOrBuilder
        public boolean hasAddressType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddressOrBuilder
        public boolean hasMacAddress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMacAddress()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMacAddress().hashCode();
            }
            if (hasAddressType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.addressType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_fieldAccessorTable.ensureFieldAccessorsInitialized(MacAddress.class, Builder.class);
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
            return new MacAddress();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.macAddress_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.addressType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MacAddressOrBuilder {
            private int addressType_;
            private int bitField0_;
            private ByteString macAddress_;

            private Builder() {
                this.macAddress_ = ByteString.EMPTY;
                this.addressType_ = 0;
            }

            private void buildPartial0(MacAddress macAddress) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    macAddress.macAddress_ = this.macAddress_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    macAddress.addressType_ = this.addressType_;
                    i14 |= 2;
                }
                macAddress.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MacAddress build() {
                MacAddress macAddressBuildPartial = buildPartial();
                if (macAddressBuildPartial.isInitialized()) {
                    return macAddressBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) macAddressBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MacAddress buildPartial() {
                MacAddress macAddress = new MacAddress(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(macAddress);
                }
                onBuilt();
                return macAddress;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.macAddress_ = ByteString.EMPTY;
                this.addressType_ = 0;
                return this;
            }

            public Builder clearAddressType() {
                this.bitField0_ &= -3;
                this.addressType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAddress() {
                this.bitField0_ &= -2;
                this.macAddress_ = MacAddress.getDefaultInstance().getMacAddress();
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

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddressOrBuilder
            public AddressType getAddressType() {
                AddressType addressTypeForNumber = AddressType.forNumber(this.addressType_);
                return addressTypeForNumber == null ? AddressType.UNKNOWN : addressTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddressOrBuilder
            public ByteString getMacAddress() {
                return this.macAddress_;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddressOrBuilder
            public boolean hasAddressType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddressOrBuilder
            public boolean hasMacAddress() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_MacAddress_fieldAccessorTable.ensureFieldAccessorsInitialized(MacAddress.class, Builder.class);
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
                                if (tag == 10) {
                                    this.macAddress_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (AddressType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.addressType_ = i14;
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

            public Builder setAddressType(AddressType addressType) {
                addressType.getClass();
                this.bitField0_ |= 2;
                this.addressType_ = addressType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMacAddress(ByteString byteString) {
                byteString.getClass();
                this.macAddress_ = byteString;
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
            public MacAddress getDefaultInstanceForType() {
                return MacAddress.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.macAddress_ = ByteString.EMPTY;
                this.addressType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MacAddress) {
                    return mergeFrom((MacAddress) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MacAddress macAddress) {
                if (macAddress == MacAddress.getDefaultInstance()) {
                    return this;
                }
                if (macAddress.hasMacAddress()) {
                    setMacAddress(macAddress.getMacAddress());
                }
                if (macAddress.hasAddressType()) {
                    setAddressType(macAddress.getAddressType());
                }
                mergeUnknownFields(macAddress.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MacAddress getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MacAddress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MacAddress) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MacAddress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MacAddress parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MacAddress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MacAddress parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MacAddress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ MacAddress(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static MacAddress parseFrom(InputStream inputStream) {
            return (MacAddress) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MacAddress() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.macAddress_ = byteString;
            this.addressType_ = 0;
        }

        public static MacAddress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MacAddress) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MacAddress parseFrom(CodedInputStream codedInputStream) {
            return (MacAddress) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MacAddress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MacAddress) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum AddressType implements ProtocolMessageEnum {
            UNKNOWN(0),
            PUBLIC(1),
            RANDOM_STATIC(2),
            PRIVATE_RESOLVABLE(3),
            PRIVATE_NON_RESOLVABLE(4);

            public static final int PRIVATE_NON_RESOLVABLE_VALUE = 4;
            public static final int PRIVATE_RESOLVABLE_VALUE = 3;
            public static final int PUBLIC_VALUE = 1;
            public static final int RANDOM_STATIC_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<AddressType> internalValueMap = new Internal.EnumLiteMap<AddressType>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.MacAddress.AddressType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AddressType findValueByNumber(int i14) {
                    return AddressType.forNumber(i14);
                }
            };
            private static final AddressType[] VALUES = values();

            AddressType(int i14) {
                this.value = i14;
            }

            public static AddressType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return PUBLIC;
                }
                if (i14 == 2) {
                    return RANDOM_STATIC;
                }
                if (i14 == 3) {
                    return PRIVATE_RESOLVABLE;
                }
                if (i14 != 4) {
                    return null;
                }
                return PRIVATE_NON_RESOLVABLE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return MacAddress.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<AddressType> internalGetValueMap() {
                return internalValueMap;
            }

            public static AddressType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static AddressType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class PairedListResponse extends GeneratedMessageV3 implements PairedListResponseOrBuilder {
        public static final int DEVICES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Device> devices_;
        private byte memoizedIsInitialized;
        private static final PairedListResponse DEFAULT_INSTANCE = new PairedListResponse();

        @Deprecated
        public static final Parser<PairedListResponse> PARSER = new AbstractParser<PairedListResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponse.1
            @Override // com.google.protobuf.Parser
            public PairedListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PairedListResponse.newBuilder();
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

        private PairedListResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.devices_ = Collections.EMPTY_LIST;
        }

        public static PairedListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_descriptor;
        }

        public static Builder newBuilder(PairedListResponse pairedListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pairedListResponse);
        }

        public static PairedListResponse parseDelimitedFrom(InputStream inputStream) {
            return (PairedListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PairedListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PairedListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PairedListResponse)) {
                return super.equals(obj);
            }
            PairedListResponse pairedListResponse = (PairedListResponse) obj;
            return getDevicesList().equals(pairedListResponse.getDevicesList()) && getUnknownFields().equals(pairedListResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
        public Device getDevices(int i14) {
            return this.devices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
        public int getDevicesCount() {
            return this.devices_.size();
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
        public List<Device> getDevicesList() {
            return this.devices_;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
        public DeviceOrBuilder getDevicesOrBuilder(int i14) {
            return this.devices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
        public List<? extends DeviceOrBuilder> getDevicesOrBuilderList() {
            return this.devices_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PairedListResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.devices_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.devices_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getDevicesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDevicesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PairedListResponse.class, Builder.class);
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
            return new PairedListResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.devices_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.devices_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PairedListResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> devicesBuilder_;
            private List<Device> devices_;

            private Builder() {
                this.devices_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(PairedListResponse pairedListResponse) {
            }

            private void buildPartialRepeatedFields(PairedListResponse pairedListResponse) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    pairedListResponse.devices_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.devices_ = Collections.unmodifiableList(this.devices_);
                    this.bitField0_ &= -2;
                }
                pairedListResponse.devices_ = this.devices_;
            }

            private void ensureDevicesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.devices_ = new ArrayList(this.devices_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> getDevicesFieldBuilder() {
                if (this.devicesBuilder_ == null) {
                    this.devicesBuilder_ = new RepeatedFieldBuilderV3<>(this.devices_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.devices_ = null;
                }
                return this.devicesBuilder_;
            }

            public Builder addAllDevices(Iterable<? extends Device> iterable) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureDevicesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.devices_);
                onChanged();
                return this;
            }

            public Builder addDevices(Device.Builder builder) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.add(builder.build());
                onChanged();
                return this;
            }

            public Device.Builder addDevicesBuilder() {
                return (Device.Builder) getDevicesFieldBuilder().addBuilder(Device.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairedListResponse build() {
                PairedListResponse pairedListResponseBuildPartial = buildPartial();
                if (pairedListResponseBuildPartial.isInitialized()) {
                    return pairedListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pairedListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairedListResponse buildPartial() {
                PairedListResponse pairedListResponse = new PairedListResponse(this);
                buildPartialRepeatedFields(pairedListResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(pairedListResponse);
                }
                onBuilt();
                return pairedListResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.devices_ = Collections.EMPTY_LIST;
                } else {
                    this.devices_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearDevices() {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.devices_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
            public Device getDevices(int i14) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.get(i14) : (Device) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Device.Builder getDevicesBuilder(int i14) {
                return (Device.Builder) getDevicesFieldBuilder().getBuilder(i14);
            }

            public List<Device.Builder> getDevicesBuilderList() {
                return getDevicesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
            public int getDevicesCount() {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
            public List<Device> getDevicesList() {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.devices_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
            public DeviceOrBuilder getDevicesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.get(i14) : (DeviceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairedListResponseOrBuilder
            public List<? extends DeviceOrBuilder> getDevicesOrBuilderList() {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.devices_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairedListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PairedListResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(PairedListResponse pairedListResponse) {
                if (pairedListResponse == PairedListResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.devicesBuilder_ == null) {
                    if (!pairedListResponse.devices_.isEmpty()) {
                        if (this.devices_.isEmpty()) {
                            this.devices_ = pairedListResponse.devices_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDevicesIsMutable();
                            this.devices_.addAll(pairedListResponse.devices_);
                        }
                        onChanged();
                    }
                } else if (!pairedListResponse.devices_.isEmpty()) {
                    boolean zIsEmpty = this.devicesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.devicesBuilder_ = null;
                        this.devices_ = pairedListResponse.devices_;
                        this.bitField0_ &= -2;
                        this.devicesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDevicesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(pairedListResponse.devices_);
                    }
                }
                mergeUnknownFields(pairedListResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeDevices(int i14) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setDevices(int i14, Device.Builder builder) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.set(i14, builder.build());
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
            public PairedListResponse getDefaultInstanceForType() {
                return PairedListResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.devices_ = Collections.EMPTY_LIST;
            }

            public Device.Builder addDevicesBuilder(int i14) {
                return (Device.Builder) getDevicesFieldBuilder().addBuilder(i14, Device.getDefaultInstance());
            }

            public Builder addDevices(int i14, Device device) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    device.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.add(i14, device);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, device);
                return this;
            }

            public Builder setDevices(int i14, Device device) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    device.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.set(i14, device);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, device);
                return this;
            }

            public Builder addDevices(Device device) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    device.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.add(device);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(device);
                return this;
            }

            public Builder addDevices(int i14, Device.Builder builder) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDevicesIsMutable();
                    this.devices_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PairedListResponse) {
                    return mergeFrom((PairedListResponse) message);
                }
                super.mergeFrom(message);
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Device device = (Device) codedInputStream.readMessage(Device.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureDevicesIsMutable();
                                        this.devices_.add(device);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(device);
                                    }
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
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PairedListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PairedListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairedListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PairedListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private PairedListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PairedListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PairedListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ PairedListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PairedListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PairedListResponse parseFrom(InputStream inputStream) {
            return (PairedListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PairedListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairedListResponse parseFrom(CodedInputStream codedInputStream) {
            return (PairedListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PairedListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PairingCommandNotification extends GeneratedMessageV3 implements PairingCommandNotificationOrBuilder {
        public static final int COMMAND_FIELD_NUMBER = 1;
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 2;
        private static final PairingCommandNotification DEFAULT_INSTANCE = new PairingCommandNotification();

        @Deprecated
        public static final Parser<PairingCommandNotification> PARSER = new AbstractParser<PairingCommandNotification>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotification.1
            @Override // com.google.protobuf.Parser
            public PairingCommandNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PairingCommandNotification.newBuilder();
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
        private int command_;
        private int connectionType_;
        private byte memoizedIsInitialized;

        private PairingCommandNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.command_ = 0;
            this.connectionType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PairingCommandNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_descriptor;
        }

        public static Builder newBuilder(PairingCommandNotification pairingCommandNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pairingCommandNotification);
        }

        public static PairingCommandNotification parseDelimitedFrom(InputStream inputStream) {
            return (PairingCommandNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PairingCommandNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PairingCommandNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PairingCommandNotification)) {
                return super.equals(obj);
            }
            PairingCommandNotification pairingCommandNotification = (PairingCommandNotification) obj;
            if (hasCommand() != pairingCommandNotification.hasCommand()) {
                return false;
            }
            if ((!hasCommand() || this.command_ == pairingCommandNotification.command_) && hasConnectionType() == pairingCommandNotification.hasConnectionType()) {
                return (!hasConnectionType() || this.connectionType_ == pairingCommandNotification.connectionType_) && getUnknownFields().equals(pairingCommandNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotificationOrBuilder
        public CommandType getCommand() {
            CommandType commandTypeForNumber = CommandType.forNumber(this.command_);
            return commandTypeForNumber == null ? CommandType.NOT_SUPPORTED : commandTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotificationOrBuilder
        public ConnectionType getConnectionType() {
            ConnectionType connectionTypeForNumber = ConnectionType.forNumber(this.connectionType_);
            return connectionTypeForNumber == null ? ConnectionType.UNKNOWN : connectionTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PairingCommandNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.command_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.connectionType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotificationOrBuilder
        public boolean hasCommand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotificationOrBuilder
        public boolean hasConnectionType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCommand()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.command_;
            }
            if (hasConnectionType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.connectionType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PairingCommandNotification.class, Builder.class);
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
            return new PairingCommandNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.command_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.connectionType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PairingCommandNotificationOrBuilder {
            private int bitField0_;
            private int command_;
            private int connectionType_;

            private Builder() {
                this.command_ = 0;
                this.connectionType_ = 0;
            }

            private void buildPartial0(PairingCommandNotification pairingCommandNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    pairingCommandNotification.command_ = this.command_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    pairingCommandNotification.connectionType_ = this.connectionType_;
                    i14 |= 2;
                }
                pairingCommandNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairingCommandNotification build() {
                PairingCommandNotification pairingCommandNotificationBuildPartial = buildPartial();
                if (pairingCommandNotificationBuildPartial.isInitialized()) {
                    return pairingCommandNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pairingCommandNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairingCommandNotification buildPartial() {
                PairingCommandNotification pairingCommandNotification = new PairingCommandNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pairingCommandNotification);
                }
                onBuilt();
                return pairingCommandNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.command_ = 0;
                this.connectionType_ = 0;
                return this;
            }

            public Builder clearCommand() {
                this.bitField0_ &= -2;
                this.command_ = 0;
                onChanged();
                return this;
            }

            public Builder clearConnectionType() {
                this.bitField0_ &= -3;
                this.connectionType_ = 0;
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

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotificationOrBuilder
            public CommandType getCommand() {
                CommandType commandTypeForNumber = CommandType.forNumber(this.command_);
                return commandTypeForNumber == null ? CommandType.NOT_SUPPORTED : commandTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotificationOrBuilder
            public ConnectionType getConnectionType() {
                ConnectionType connectionTypeForNumber = ConnectionType.forNumber(this.connectionType_);
                return connectionTypeForNumber == null ? ConnectionType.UNKNOWN : connectionTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotificationOrBuilder
            public boolean hasCommand() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotificationOrBuilder
            public boolean hasConnectionType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCommandNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PairingCommandNotification.class, Builder.class);
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
                                    if (CommandType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.command_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (ConnectionType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.connectionType_ = i15;
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

            public Builder setCommand(CommandType commandType) {
                commandType.getClass();
                this.bitField0_ |= 1;
                this.command_ = commandType.getNumber();
                onChanged();
                return this;
            }

            public Builder setConnectionType(ConnectionType connectionType) {
                connectionType.getClass();
                this.bitField0_ |= 2;
                this.connectionType_ = connectionType.getNumber();
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
            public PairingCommandNotification getDefaultInstanceForType() {
                return PairingCommandNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.command_ = 0;
                this.connectionType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PairingCommandNotification) {
                    return mergeFrom((PairingCommandNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PairingCommandNotification pairingCommandNotification) {
                if (pairingCommandNotification == PairingCommandNotification.getDefaultInstance()) {
                    return this;
                }
                if (pairingCommandNotification.hasCommand()) {
                    setCommand(pairingCommandNotification.getCommand());
                }
                if (pairingCommandNotification.hasConnectionType()) {
                    setConnectionType(pairingCommandNotification.getConnectionType());
                }
                mergeUnknownFields(pairingCommandNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PairingCommandNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PairingCommandNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingCommandNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairingCommandNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PairingCommandNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PairingCommandNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ PairingCommandNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PairingCommandNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private PairingCommandNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.command_ = 0;
            this.connectionType_ = 0;
        }

        public static PairingCommandNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PairingCommandNotification parseFrom(InputStream inputStream) {
            return (PairingCommandNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PairingCommandNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingCommandNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairingCommandNotification parseFrom(CodedInputStream codedInputStream) {
            return (PairingCommandNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PairingCommandNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingCommandNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum CommandType implements ProtocolMessageEnum {
            NOT_SUPPORTED(0),
            ACCEPT_PRIVACY(1),
            RETRY_CONNECTION(2),
            CONFIRM_CONNECTION_TYPE(3);

            public static final int ACCEPT_PRIVACY_VALUE = 1;
            public static final int CONFIRM_CONNECTION_TYPE_VALUE = 3;
            public static final int NOT_SUPPORTED_VALUE = 0;
            public static final int RETRY_CONNECTION_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<CommandType> internalValueMap = new Internal.EnumLiteMap<CommandType>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotification.CommandType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CommandType findValueByNumber(int i14) {
                    return CommandType.forNumber(i14);
                }
            };
            private static final CommandType[] VALUES = values();

            CommandType(int i14) {
                this.value = i14;
            }

            public static CommandType forNumber(int i14) {
                if (i14 == 0) {
                    return NOT_SUPPORTED;
                }
                if (i14 == 1) {
                    return ACCEPT_PRIVACY;
                }
                if (i14 == 2) {
                    return RETRY_CONNECTION;
                }
                if (i14 != 3) {
                    return null;
                }
                return CONFIRM_CONNECTION_TYPE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PairingCommandNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<CommandType> internalGetValueMap() {
                return internalValueMap;
            }

            public static CommandType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static CommandType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum ConnectionType implements ProtocolMessageEnum {
            UNKNOWN(0),
            OPEN(1),
            SECURE(2);

            public static final int OPEN_VALUE = 1;
            public static final int SECURE_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ConnectionType> internalValueMap = new Internal.EnumLiteMap<ConnectionType>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCommandNotification.ConnectionType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ConnectionType findValueByNumber(int i14) {
                    return ConnectionType.forNumber(i14);
                }
            };
            private static final ConnectionType[] VALUES = values();

            ConnectionType(int i14) {
                this.value = i14;
            }

            public static ConnectionType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OPEN;
                }
                if (i14 != 2) {
                    return null;
                }
                return SECURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PairingCommandNotification.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<ConnectionType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ConnectionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ConnectionType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class PairingCompleteNotification extends GeneratedMessageV3 implements PairingCompleteNotificationOrBuilder {
        private static final PairingCompleteNotification DEFAULT_INSTANCE = new PairingCompleteNotification();

        @Deprecated
        public static final Parser<PairingCompleteNotification> PARSER = new AbstractParser<PairingCompleteNotification>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCompleteNotification.1
            @Override // com.google.protobuf.Parser
            public PairingCompleteNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PairingCompleteNotification.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private PairingCompleteNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PairingCompleteNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_descriptor;
        }

        public static Builder newBuilder(PairingCompleteNotification pairingCompleteNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pairingCompleteNotification);
        }

        public static PairingCompleteNotification parseDelimitedFrom(InputStream inputStream) {
            return (PairingCompleteNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PairingCompleteNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PairingCompleteNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PairingCompleteNotification)) {
                return super.equals(obj);
            }
            PairingCompleteNotification pairingCompleteNotification = (PairingCompleteNotification) obj;
            if (hasResult() != pairingCompleteNotification.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == pairingCompleteNotification.result_) && getUnknownFields().equals(pairingCompleteNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PairingCompleteNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCompleteNotificationOrBuilder
        public PairingResult getResult() {
            PairingResult pairingResultForNumber = PairingResult.forNumber(this.result_);
            return pairingResultForNumber == null ? PairingResult.FAIL_OTHER : pairingResultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCompleteNotificationOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PairingCompleteNotification.class, Builder.class);
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
            return new PairingCompleteNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PairingCompleteNotificationOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(PairingCompleteNotification pairingCompleteNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    pairingCompleteNotification.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                pairingCompleteNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairingCompleteNotification build() {
                PairingCompleteNotification pairingCompleteNotificationBuildPartial = buildPartial();
                if (pairingCompleteNotificationBuildPartial.isInitialized()) {
                    return pairingCompleteNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pairingCompleteNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairingCompleteNotification buildPartial() {
                PairingCompleteNotification pairingCompleteNotification = new PairingCompleteNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pairingCompleteNotification);
                }
                onBuilt();
                return pairingCompleteNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCompleteNotificationOrBuilder
            public PairingResult getResult() {
                PairingResult pairingResultForNumber = PairingResult.forNumber(this.result_);
                return pairingResultForNumber == null ? PairingResult.FAIL_OTHER : pairingResultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCompleteNotificationOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingCompleteNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PairingCompleteNotification.class, Builder.class);
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
                                    if (PairingResult.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(PairingResult pairingResult) {
                pairingResult.getClass();
                this.bitField0_ |= 1;
                this.result_ = pairingResult.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PairingCompleteNotification getDefaultInstanceForType() {
                return PairingCompleteNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PairingCompleteNotification) {
                    return mergeFrom((PairingCompleteNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PairingCompleteNotification pairingCompleteNotification) {
                if (pairingCompleteNotification == PairingCompleteNotification.getDefaultInstance()) {
                    return this;
                }
                if (pairingCompleteNotification.hasResult()) {
                    setResult(pairingCompleteNotification.getResult());
                }
                mergeUnknownFields(pairingCompleteNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PairingCompleteNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PairingCompleteNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingCompleteNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairingCompleteNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ PairingCompleteNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PairingCompleteNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private PairingCompleteNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PairingCompleteNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PairingCompleteNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PairingCompleteNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PairingCompleteNotification parseFrom(InputStream inputStream) {
            return (PairingCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PairingCompleteNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairingCompleteNotification parseFrom(CodedInputStream codedInputStream) {
            return (PairingCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PairingCompleteNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum PairingResult implements ProtocolMessageEnum {
            FAIL_OTHER(0),
            SUCCESS(1),
            FAIL_NO_SPACE(2),
            FAIL_DUPLICATE(3),
            FAIL_NOT_CONNECTABLE(4);

            public static final int FAIL_DUPLICATE_VALUE = 3;
            public static final int FAIL_NOT_CONNECTABLE_VALUE = 4;
            public static final int FAIL_NO_SPACE_VALUE = 2;
            public static final int FAIL_OTHER_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<PairingResult> internalValueMap = new Internal.EnumLiteMap<PairingResult>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingCompleteNotification.PairingResult.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public PairingResult findValueByNumber(int i14) {
                    return PairingResult.forNumber(i14);
                }
            };
            private static final PairingResult[] VALUES = values();

            PairingResult(int i14) {
                this.value = i14;
            }

            public static PairingResult forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL_OTHER;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 == 2) {
                    return FAIL_NO_SPACE;
                }
                if (i14 == 3) {
                    return FAIL_DUPLICATE;
                }
                if (i14 != 4) {
                    return null;
                }
                return FAIL_NOT_CONNECTABLE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PairingCompleteNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<PairingResult> internalGetValueMap() {
                return internalValueMap;
            }

            public static PairingResult valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static PairingResult valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class PairingStatusNotification extends GeneratedMessageV3 implements PairingStatusNotificationOrBuilder {
        public static final int DEVICE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Device device_;
        private byte memoizedIsInitialized;
        private int type_;
        private static final PairingStatusNotification DEFAULT_INSTANCE = new PairingStatusNotification();

        @Deprecated
        public static final Parser<PairingStatusNotification> PARSER = new AbstractParser<PairingStatusNotification>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotification.1
            @Override // com.google.protobuf.Parser
            public PairingStatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PairingStatusNotification.newBuilder();
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

        private PairingStatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PairingStatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_descriptor;
        }

        public static Builder newBuilder(PairingStatusNotification pairingStatusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pairingStatusNotification);
        }

        public static PairingStatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (PairingStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PairingStatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PairingStatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PairingStatusNotification)) {
                return super.equals(obj);
            }
            PairingStatusNotification pairingStatusNotification = (PairingStatusNotification) obj;
            if (hasType() != pairingStatusNotification.hasType()) {
                return false;
            }
            if ((!hasType() || this.type_ == pairingStatusNotification.type_) && hasDevice() == pairingStatusNotification.hasDevice()) {
                return (!hasDevice() || getDevice().equals(pairingStatusNotification.getDevice())) && getUnknownFields().equals(pairingStatusNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
        public Device getDevice() {
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
        public DeviceOrBuilder getDeviceOrBuilder() {
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PairingStatusNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getDevice());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
        public NotificationType getType() {
            NotificationType notificationTypeForNumber = NotificationType.forNumber(this.type_);
            return notificationTypeForNumber == null ? NotificationType.UNKNOWN : notificationTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.type_;
            }
            if (hasDevice()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDevice().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PairingStatusNotification.class, Builder.class);
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
            return new PairingStatusNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDevice());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PairingStatusNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> deviceBuilder_;
            private Device device_;
            private int type_;

            private Builder() {
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PairingStatusNotification pairingStatusNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    pairingStatusNotification.type_ = this.type_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                    pairingStatusNotification.device_ = singleFieldBuilderV3 == null ? this.device_ : (Device) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                pairingStatusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_descriptor;
            }

            private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new SingleFieldBuilderV3<>(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeviceFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairingStatusNotification build() {
                PairingStatusNotification pairingStatusNotificationBuildPartial = buildPartial();
                if (pairingStatusNotificationBuildPartial.isInitialized()) {
                    return pairingStatusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pairingStatusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairingStatusNotification buildPartial() {
                PairingStatusNotification pairingStatusNotification = new PairingStatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pairingStatusNotification);
                }
                onBuilt();
                return pairingStatusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.device_ = null;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceBuilder_ = null;
                }
                return this;
            }

            public Builder clearDevice() {
                this.bitField0_ &= -3;
                this.device_ = null;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceBuilder_ = null;
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

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
            public Device getDevice() {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Device) singleFieldBuilderV3.getMessage();
                }
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }

            public Device.Builder getDeviceBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Device.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
            public DeviceOrBuilder getDeviceOrBuilder() {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
            public NotificationType getType() {
                NotificationType notificationTypeForNumber = NotificationType.forNumber(this.type_);
                return notificationTypeForNumber == null ? NotificationType.UNKNOWN : notificationTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotificationOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_PairingStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PairingStatusNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDevice(Device device) {
                Device device2;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(device);
                } else if ((this.bitField0_ & 2) == 0 || (device2 = this.device_) == null || device2 == Device.getDefaultInstance()) {
                    this.device_ = device;
                } else {
                    getDeviceBuilder().mergeFrom(device);
                }
                if (this.device_ != null) {
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
                                    if (NotificationType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.type_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDeviceFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDevice(Device.Builder builder) {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.device_ = builder.build();
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

            public Builder setType(NotificationType notificationType) {
                notificationType.getClass();
                this.bitField0_ |= 1;
                this.type_ = notificationType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PairingStatusNotification getDefaultInstanceForType() {
                return PairingStatusNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setDevice(Device device) {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    device.getClass();
                    this.device_ = device;
                } else {
                    singleFieldBuilderV3.setMessage(device);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PairingStatusNotification) {
                    return mergeFrom((PairingStatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PairingStatusNotification pairingStatusNotification) {
                if (pairingStatusNotification == PairingStatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (pairingStatusNotification.hasType()) {
                    setType(pairingStatusNotification.getType());
                }
                if (pairingStatusNotification.hasDevice()) {
                    mergeDevice(pairingStatusNotification.getDevice());
                }
                mergeUnknownFields(pairingStatusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PairingStatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PairingStatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairingStatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ PairingStatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PairingStatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private PairingStatusNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PairingStatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PairingStatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PairingStatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PairingStatusNotification parseFrom(InputStream inputStream) {
            return (PairingStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PairingStatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairingStatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (PairingStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PairingStatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairingStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum NotificationType implements ProtocolMessageEnum {
            UNKNOWN(0),
            CONNECTION_FAILED(1),
            CONFIRM_CONNECTION_TYPE(2),
            CONNECTION_NOT_PRIVATE(3),
            PAIRING_MODE_REQUIRED(4);

            public static final int CONFIRM_CONNECTION_TYPE_VALUE = 2;
            public static final int CONNECTION_FAILED_VALUE = 1;
            public static final int CONNECTION_NOT_PRIVATE_VALUE = 3;
            public static final int PAIRING_MODE_REQUIRED_VALUE = 4;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<NotificationType> internalValueMap = new Internal.EnumLiteMap<NotificationType>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.PairingStatusNotification.NotificationType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public NotificationType findValueByNumber(int i14) {
                    return NotificationType.forNumber(i14);
                }
            };
            private static final NotificationType[] VALUES = values();

            NotificationType(int i14) {
                this.value = i14;
            }

            public static NotificationType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return CONNECTION_FAILED;
                }
                if (i14 == 2) {
                    return CONFIRM_CONNECTION_TYPE;
                }
                if (i14 == 3) {
                    return CONNECTION_NOT_PRIVATE;
                }
                if (i14 != 4) {
                    return null;
                }
                return PAIRING_MODE_REQUIRED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PairingStatusNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<NotificationType> internalGetValueMap() {
                return internalValueMap;
            }

            public static NotificationType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static NotificationType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class RemovePairedDeviceRequest extends GeneratedMessageV3 implements RemovePairedDeviceRequestOrBuilder {
        public static final int MAC_ADDRESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private MacAddress macAddress_;
        private byte memoizedIsInitialized;
        private static final RemovePairedDeviceRequest DEFAULT_INSTANCE = new RemovePairedDeviceRequest();

        @Deprecated
        public static final Parser<RemovePairedDeviceRequest> PARSER = new AbstractParser<RemovePairedDeviceRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceRequest.1
            @Override // com.google.protobuf.Parser
            public RemovePairedDeviceRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemovePairedDeviceRequest.newBuilder();
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

        private RemovePairedDeviceRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemovePairedDeviceRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_descriptor;
        }

        public static Builder newBuilder(RemovePairedDeviceRequest removePairedDeviceRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(removePairedDeviceRequest);
        }

        public static RemovePairedDeviceRequest parseDelimitedFrom(InputStream inputStream) {
            return (RemovePairedDeviceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RemovePairedDeviceRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RemovePairedDeviceRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemovePairedDeviceRequest)) {
                return super.equals(obj);
            }
            RemovePairedDeviceRequest removePairedDeviceRequest = (RemovePairedDeviceRequest) obj;
            if (hasMacAddress() != removePairedDeviceRequest.hasMacAddress()) {
                return false;
            }
            return (!hasMacAddress() || getMacAddress().equals(removePairedDeviceRequest.getMacAddress())) && getUnknownFields().equals(removePairedDeviceRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceRequestOrBuilder
        public MacAddress getMacAddress() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceRequestOrBuilder
        public MacAddressOrBuilder getMacAddressOrBuilder() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RemovePairedDeviceRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMacAddress()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceRequestOrBuilder
        public boolean hasMacAddress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMacAddress()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMacAddress().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RemovePairedDeviceRequest.class, Builder.class);
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
            return new RemovePairedDeviceRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getMacAddress());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RemovePairedDeviceRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> macAddressBuilder_;
            private MacAddress macAddress_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(RemovePairedDeviceRequest removePairedDeviceRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                    removePairedDeviceRequest.macAddress_ = singleFieldBuilderV3 == null ? this.macAddress_ : (MacAddress) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                removePairedDeviceRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_descriptor;
            }

            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> getMacAddressFieldBuilder() {
                if (this.macAddressBuilder_ == null) {
                    this.macAddressBuilder_ = new SingleFieldBuilderV3<>(getMacAddress(), getParentForChildren(), isClean());
                    this.macAddress_ = null;
                }
                return this.macAddressBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMacAddressFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemovePairedDeviceRequest build() {
                RemovePairedDeviceRequest removePairedDeviceRequestBuildPartial = buildPartial();
                if (removePairedDeviceRequestBuildPartial.isInitialized()) {
                    return removePairedDeviceRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) removePairedDeviceRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemovePairedDeviceRequest buildPartial() {
                RemovePairedDeviceRequest removePairedDeviceRequest = new RemovePairedDeviceRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(removePairedDeviceRequest);
                }
                onBuilt();
                return removePairedDeviceRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAddress() {
                this.bitField0_ &= -2;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceRequestOrBuilder
            public MacAddress getMacAddress() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddress) singleFieldBuilderV3.getMessage();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            public MacAddress.Builder getMacAddressBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (MacAddress.Builder) getMacAddressFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceRequestOrBuilder
            public MacAddressOrBuilder getMacAddressOrBuilder() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddressOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceRequestOrBuilder
            public boolean hasMacAddress() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RemovePairedDeviceRequest.class, Builder.class);
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getMacAddressFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeMacAddress(MacAddress macAddress) {
                MacAddress macAddress2;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(macAddress);
                } else if ((this.bitField0_ & 1) == 0 || (macAddress2 = this.macAddress_) == null || macAddress2 == MacAddress.getDefaultInstance()) {
                    this.macAddress_ = macAddress;
                } else {
                    getMacAddressBuilder().mergeFrom(macAddress);
                }
                if (this.macAddress_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
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

            public Builder setMacAddress(MacAddress.Builder builder) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.macAddress_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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
            public RemovePairedDeviceRequest getDefaultInstanceForType() {
                return RemovePairedDeviceRequest.getDefaultInstance();
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

            public Builder setMacAddress(MacAddress macAddress) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    macAddress.getClass();
                    this.macAddress_ = macAddress;
                } else {
                    singleFieldBuilderV3.setMessage(macAddress);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RemovePairedDeviceRequest) {
                    return mergeFrom((RemovePairedDeviceRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RemovePairedDeviceRequest removePairedDeviceRequest) {
                if (removePairedDeviceRequest == RemovePairedDeviceRequest.getDefaultInstance()) {
                    return this;
                }
                if (removePairedDeviceRequest.hasMacAddress()) {
                    mergeMacAddress(removePairedDeviceRequest.getMacAddress());
                }
                mergeUnknownFields(removePairedDeviceRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RemovePairedDeviceRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ RemovePairedDeviceRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private RemovePairedDeviceRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemovePairedDeviceRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemovePairedDeviceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemovePairedDeviceRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RemovePairedDeviceRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RemovePairedDeviceRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RemovePairedDeviceRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RemovePairedDeviceRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RemovePairedDeviceRequest parseFrom(InputStream inputStream) {
            return (RemovePairedDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RemovePairedDeviceRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemovePairedDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemovePairedDeviceRequest parseFrom(CodedInputStream codedInputStream) {
            return (RemovePairedDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RemovePairedDeviceRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemovePairedDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RemovePairedDeviceResponse extends GeneratedMessageV3 implements RemovePairedDeviceResponseOrBuilder {
        private static final RemovePairedDeviceResponse DEFAULT_INSTANCE = new RemovePairedDeviceResponse();

        @Deprecated
        public static final Parser<RemovePairedDeviceResponse> PARSER = new AbstractParser<RemovePairedDeviceResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceResponse.1
            @Override // com.google.protobuf.Parser
            public RemovePairedDeviceResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemovePairedDeviceResponse.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private RemovePairedDeviceResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemovePairedDeviceResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_descriptor;
        }

        public static Builder newBuilder(RemovePairedDeviceResponse removePairedDeviceResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(removePairedDeviceResponse);
        }

        public static RemovePairedDeviceResponse parseDelimitedFrom(InputStream inputStream) {
            return (RemovePairedDeviceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RemovePairedDeviceResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RemovePairedDeviceResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemovePairedDeviceResponse)) {
                return super.equals(obj);
            }
            RemovePairedDeviceResponse removePairedDeviceResponse = (RemovePairedDeviceResponse) obj;
            if (hasResult() != removePairedDeviceResponse.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == removePairedDeviceResponse.result_) && getUnknownFields().equals(removePairedDeviceResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RemovePairedDeviceResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceResponseOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.FAIL : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RemovePairedDeviceResponse.class, Builder.class);
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
            if (hasResult()) {
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
            return new RemovePairedDeviceResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RemovePairedDeviceResponseOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(RemovePairedDeviceResponse removePairedDeviceResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    removePairedDeviceResponse.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                removePairedDeviceResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemovePairedDeviceResponse build() {
                RemovePairedDeviceResponse removePairedDeviceResponseBuildPartial = buildPartial();
                if (removePairedDeviceResponseBuildPartial.isInitialized()) {
                    return removePairedDeviceResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) removePairedDeviceResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemovePairedDeviceResponse buildPartial() {
                RemovePairedDeviceResponse removePairedDeviceResponse = new RemovePairedDeviceResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(removePairedDeviceResponse);
                }
                onBuilt();
                return removePairedDeviceResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceResponseOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.FAIL : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_RemovePairedDeviceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RemovePairedDeviceResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasResult();
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
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 1;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RemovePairedDeviceResponse getDefaultInstanceForType() {
                return RemovePairedDeviceResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RemovePairedDeviceResponse) {
                    return mergeFrom((RemovePairedDeviceResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RemovePairedDeviceResponse removePairedDeviceResponse) {
                if (removePairedDeviceResponse == RemovePairedDeviceResponse.getDefaultInstance()) {
                    return this;
                }
                if (removePairedDeviceResponse.hasResult()) {
                    setResult(removePairedDeviceResponse.getResult());
                }
                mergeUnknownFields(removePairedDeviceResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RemovePairedDeviceResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RemovePairedDeviceResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemovePairedDeviceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemovePairedDeviceResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ RemovePairedDeviceResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RemovePairedDeviceResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private RemovePairedDeviceResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RemovePairedDeviceResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RemovePairedDeviceResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RemovePairedDeviceResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RemovePairedDeviceResponse parseFrom(InputStream inputStream) {
            return (RemovePairedDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RemovePairedDeviceResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemovePairedDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemovePairedDeviceResponse parseFrom(CodedInputStream codedInputStream) {
            return (RemovePairedDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RemovePairedDeviceResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemovePairedDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            FAIL(0),
            SUCCESS(1);

            public static final int FAIL_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.RemovePairedDeviceResponse.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return RemovePairedDeviceResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ScanResultsNotification extends GeneratedMessageV3 implements ScanResultsNotificationOrBuilder {
        public static final int DEVICES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Device> devices_;
        private byte memoizedIsInitialized;
        private static final ScanResultsNotification DEFAULT_INSTANCE = new ScanResultsNotification();

        @Deprecated
        public static final Parser<ScanResultsNotification> PARSER = new AbstractParser<ScanResultsNotification>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotification.1
            @Override // com.google.protobuf.Parser
            public ScanResultsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ScanResultsNotification.newBuilder();
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

        private ScanResultsNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.devices_ = Collections.EMPTY_LIST;
        }

        public static ScanResultsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_descriptor;
        }

        public static Builder newBuilder(ScanResultsNotification scanResultsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(scanResultsNotification);
        }

        public static ScanResultsNotification parseDelimitedFrom(InputStream inputStream) {
            return (ScanResultsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ScanResultsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ScanResultsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScanResultsNotification)) {
                return super.equals(obj);
            }
            ScanResultsNotification scanResultsNotification = (ScanResultsNotification) obj;
            return getDevicesList().equals(scanResultsNotification.getDevicesList()) && getUnknownFields().equals(scanResultsNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
        public Device getDevices(int i14) {
            return this.devices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
        public int getDevicesCount() {
            return this.devices_.size();
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
        public List<Device> getDevicesList() {
            return this.devices_;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
        public DeviceOrBuilder getDevicesOrBuilder(int i14) {
            return this.devices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
        public List<? extends DeviceOrBuilder> getDevicesOrBuilderList() {
            return this.devices_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ScanResultsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.devices_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.devices_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getDevicesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDevicesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ScanResultsNotification.class, Builder.class);
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
            return new ScanResultsNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.devices_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.devices_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScanResultsNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> devicesBuilder_;
            private List<Device> devices_;

            private Builder() {
                this.devices_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ScanResultsNotification scanResultsNotification) {
            }

            private void buildPartialRepeatedFields(ScanResultsNotification scanResultsNotification) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    scanResultsNotification.devices_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.devices_ = Collections.unmodifiableList(this.devices_);
                    this.bitField0_ &= -2;
                }
                scanResultsNotification.devices_ = this.devices_;
            }

            private void ensureDevicesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.devices_ = new ArrayList(this.devices_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> getDevicesFieldBuilder() {
                if (this.devicesBuilder_ == null) {
                    this.devicesBuilder_ = new RepeatedFieldBuilderV3<>(this.devices_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.devices_ = null;
                }
                return this.devicesBuilder_;
            }

            public Builder addAllDevices(Iterable<? extends Device> iterable) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureDevicesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.devices_);
                onChanged();
                return this;
            }

            public Builder addDevices(Device.Builder builder) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.add(builder.build());
                onChanged();
                return this;
            }

            public Device.Builder addDevicesBuilder() {
                return (Device.Builder) getDevicesFieldBuilder().addBuilder(Device.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScanResultsNotification build() {
                ScanResultsNotification scanResultsNotificationBuildPartial = buildPartial();
                if (scanResultsNotificationBuildPartial.isInitialized()) {
                    return scanResultsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) scanResultsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScanResultsNotification buildPartial() {
                ScanResultsNotification scanResultsNotification = new ScanResultsNotification(this);
                buildPartialRepeatedFields(scanResultsNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(scanResultsNotification);
                }
                onBuilt();
                return scanResultsNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.devices_ = Collections.EMPTY_LIST;
                } else {
                    this.devices_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearDevices() {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.devices_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
            public Device getDevices(int i14) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.get(i14) : (Device) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Device.Builder getDevicesBuilder(int i14) {
                return (Device.Builder) getDevicesFieldBuilder().getBuilder(i14);
            }

            public List<Device.Builder> getDevicesBuilderList() {
                return getDevicesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
            public int getDevicesCount() {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
            public List<Device> getDevicesList() {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.devices_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
            public DeviceOrBuilder getDevicesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.get(i14) : (DeviceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ScanResultsNotificationOrBuilder
            public List<? extends DeviceOrBuilder> getDevicesOrBuilderList() {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.devices_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_ScanResultsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ScanResultsNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ScanResultsNotification scanResultsNotification) {
                if (scanResultsNotification == ScanResultsNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.devicesBuilder_ == null) {
                    if (!scanResultsNotification.devices_.isEmpty()) {
                        if (this.devices_.isEmpty()) {
                            this.devices_ = scanResultsNotification.devices_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDevicesIsMutable();
                            this.devices_.addAll(scanResultsNotification.devices_);
                        }
                        onChanged();
                    }
                } else if (!scanResultsNotification.devices_.isEmpty()) {
                    boolean zIsEmpty = this.devicesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.devicesBuilder_ = null;
                        this.devices_ = scanResultsNotification.devices_;
                        this.bitField0_ &= -2;
                        this.devicesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDevicesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(scanResultsNotification.devices_);
                    }
                }
                mergeUnknownFields(scanResultsNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeDevices(int i14) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setDevices(int i14, Device.Builder builder) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.set(i14, builder.build());
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
            public ScanResultsNotification getDefaultInstanceForType() {
                return ScanResultsNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.devices_ = Collections.EMPTY_LIST;
            }

            public Device.Builder addDevicesBuilder(int i14) {
                return (Device.Builder) getDevicesFieldBuilder().addBuilder(i14, Device.getDefaultInstance());
            }

            public Builder addDevices(int i14, Device device) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    device.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.add(i14, device);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, device);
                return this;
            }

            public Builder setDevices(int i14, Device device) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    device.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.set(i14, device);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, device);
                return this;
            }

            public Builder addDevices(Device device) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    device.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.add(device);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(device);
                return this;
            }

            public Builder addDevices(int i14, Device.Builder builder) {
                RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDevicesIsMutable();
                    this.devices_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ScanResultsNotification) {
                    return mergeFrom((ScanResultsNotification) message);
                }
                super.mergeFrom(message);
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Device device = (Device) codedInputStream.readMessage(Device.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureDevicesIsMutable();
                                        this.devices_.add(device);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(device);
                                    }
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
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ScanResultsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ScanResultsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanResultsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScanResultsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ScanResultsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ScanResultsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ScanResultsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ScanResultsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ScanResultsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ScanResultsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ScanResultsNotification parseFrom(InputStream inputStream) {
            return (ScanResultsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ScanResultsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanResultsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScanResultsNotification parseFrom(CodedInputStream codedInputStream) {
            return (ScanResultsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ScanResultsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanResultsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ACCESSORY_CONNECTION_NOTIFICATION_FIELD_NUMBER = 15;
        public static final int ACCESSORY_STATUS_REQUEST_FIELD_NUMBER = 20;
        public static final int ACCESSORY_STATUS_RESPONSE_FIELD_NUMBER = 21;
        public static final int CANCEL_PAIRING_REQUEST_FIELD_NUMBER = 7;
        public static final int CANCEL_PAIRING_RESPONSE_FIELD_NUMBER = 8;
        public static final int PAIRED_LIST_REQUEST_FIELD_NUMBER = 1;
        public static final int PAIRED_LIST_RESPONSE_FIELD_NUMBER = 2;
        public static final int PAIRING_COMMAND_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int PAIRING_COMPLETE_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int REMOTE_DEVICE_STATUS_NOTIFICATION_FIELD_NUMBER = 10;
        public static final int REMOVE_PAIRED_DEVICE_REQUEST_FIELD_NUMBER = 3;
        public static final int REMOVE_PAIRED_DEVICE_RESPONSE_FIELD_NUMBER = 4;
        public static final int SCAN_RESULTS_NOTIFICATION_FIELD_NUMBER = 14;
        public static final int SET_ENABLE_PAIRED_DEVICE_REQUEST_FIELD_NUMBER = 18;
        public static final int SET_ENABLE_PAIRED_DEVICE_RESPONSE_FIELD_NUMBER = 19;
        public static final int START_PAIRING_REQUEST_FIELD_NUMBER = 5;
        public static final int START_PAIRING_RESPONSE_FIELD_NUMBER = 6;
        public static final int START_SCAN_REQUEST_FIELD_NUMBER = 12;
        public static final int START_SCAN_RESPONSE_FIELD_NUMBER = 13;
        public static final int STOP_SCAN_REQUEST_FIELD_NUMBER = 16;
        public static final int STOP_SCAN_RESPONSE_FIELD_NUMBER = 17;
        private static final long serialVersionUID = 0;
        private AccessoryConnectionNotification accessoryConnectionNotification_;
        private AccessoryStatusRequest accessoryStatusRequest_;
        private AccessoryStatusResponse accessoryStatusResponse_;
        private int bitField0_;
        private CancelPairingRequest cancelPairingRequest_;
        private CancelPairingResponse cancelPairingResponse_;
        private byte memoizedIsInitialized;
        private PairedListRequest pairedListRequest_;
        private PairedListResponse pairedListResponse_;
        private PairingCommandNotification pairingCommandNotification_;
        private PairingCompleteNotification pairingCompleteNotification_;
        private PairingStatusNotification remoteDeviceStatusNotification_;
        private RemovePairedDeviceRequest removePairedDeviceRequest_;
        private RemovePairedDeviceResponse removePairedDeviceResponse_;
        private ScanResultsNotification scanResultsNotification_;
        private SetEnablePairedDeviceRequest setEnablePairedDeviceRequest_;
        private SetEnablePairedDeviceResponse setEnablePairedDeviceResponse_;
        private StartPairingRequest startPairingRequest_;
        private StartPairingResponse startPairingResponse_;
        private StartScanRequest startScanRequest_;
        private StartScanResponse startScanResponse_;
        private StopScanRequest stopScanRequest_;
        private StopScanResponse stopScanResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.Service.1
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
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Service_descriptor;
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
            if (hasPairedListRequest() != service.hasPairedListRequest()) {
                return false;
            }
            if ((hasPairedListRequest() && !getPairedListRequest().equals(service.getPairedListRequest())) || hasPairedListResponse() != service.hasPairedListResponse()) {
                return false;
            }
            if ((hasPairedListResponse() && !getPairedListResponse().equals(service.getPairedListResponse())) || hasRemovePairedDeviceRequest() != service.hasRemovePairedDeviceRequest()) {
                return false;
            }
            if ((hasRemovePairedDeviceRequest() && !getRemovePairedDeviceRequest().equals(service.getRemovePairedDeviceRequest())) || hasRemovePairedDeviceResponse() != service.hasRemovePairedDeviceResponse()) {
                return false;
            }
            if ((hasRemovePairedDeviceResponse() && !getRemovePairedDeviceResponse().equals(service.getRemovePairedDeviceResponse())) || hasStartPairingRequest() != service.hasStartPairingRequest()) {
                return false;
            }
            if ((hasStartPairingRequest() && !getStartPairingRequest().equals(service.getStartPairingRequest())) || hasStartPairingResponse() != service.hasStartPairingResponse()) {
                return false;
            }
            if ((hasStartPairingResponse() && !getStartPairingResponse().equals(service.getStartPairingResponse())) || hasCancelPairingRequest() != service.hasCancelPairingRequest()) {
                return false;
            }
            if ((hasCancelPairingRequest() && !getCancelPairingRequest().equals(service.getCancelPairingRequest())) || hasCancelPairingResponse() != service.hasCancelPairingResponse()) {
                return false;
            }
            if ((hasCancelPairingResponse() && !getCancelPairingResponse().equals(service.getCancelPairingResponse())) || hasPairingCommandNotification() != service.hasPairingCommandNotification()) {
                return false;
            }
            if ((hasPairingCommandNotification() && !getPairingCommandNotification().equals(service.getPairingCommandNotification())) || hasRemoteDeviceStatusNotification() != service.hasRemoteDeviceStatusNotification()) {
                return false;
            }
            if ((hasRemoteDeviceStatusNotification() && !getRemoteDeviceStatusNotification().equals(service.getRemoteDeviceStatusNotification())) || hasPairingCompleteNotification() != service.hasPairingCompleteNotification()) {
                return false;
            }
            if ((hasPairingCompleteNotification() && !getPairingCompleteNotification().equals(service.getPairingCompleteNotification())) || hasStartScanRequest() != service.hasStartScanRequest()) {
                return false;
            }
            if ((hasStartScanRequest() && !getStartScanRequest().equals(service.getStartScanRequest())) || hasStartScanResponse() != service.hasStartScanResponse()) {
                return false;
            }
            if ((hasStartScanResponse() && !getStartScanResponse().equals(service.getStartScanResponse())) || hasScanResultsNotification() != service.hasScanResultsNotification()) {
                return false;
            }
            if ((hasScanResultsNotification() && !getScanResultsNotification().equals(service.getScanResultsNotification())) || hasAccessoryConnectionNotification() != service.hasAccessoryConnectionNotification()) {
                return false;
            }
            if ((hasAccessoryConnectionNotification() && !getAccessoryConnectionNotification().equals(service.getAccessoryConnectionNotification())) || hasStopScanRequest() != service.hasStopScanRequest()) {
                return false;
            }
            if ((hasStopScanRequest() && !getStopScanRequest().equals(service.getStopScanRequest())) || hasStopScanResponse() != service.hasStopScanResponse()) {
                return false;
            }
            if ((hasStopScanResponse() && !getStopScanResponse().equals(service.getStopScanResponse())) || hasSetEnablePairedDeviceRequest() != service.hasSetEnablePairedDeviceRequest()) {
                return false;
            }
            if ((hasSetEnablePairedDeviceRequest() && !getSetEnablePairedDeviceRequest().equals(service.getSetEnablePairedDeviceRequest())) || hasSetEnablePairedDeviceResponse() != service.hasSetEnablePairedDeviceResponse()) {
                return false;
            }
            if ((hasSetEnablePairedDeviceResponse() && !getSetEnablePairedDeviceResponse().equals(service.getSetEnablePairedDeviceResponse())) || hasAccessoryStatusRequest() != service.hasAccessoryStatusRequest()) {
                return false;
            }
            if ((!hasAccessoryStatusRequest() || getAccessoryStatusRequest().equals(service.getAccessoryStatusRequest())) && hasAccessoryStatusResponse() == service.hasAccessoryStatusResponse()) {
                return (!hasAccessoryStatusResponse() || getAccessoryStatusResponse().equals(service.getAccessoryStatusResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public AccessoryConnectionNotification getAccessoryConnectionNotification() {
            AccessoryConnectionNotification accessoryConnectionNotification = this.accessoryConnectionNotification_;
            return accessoryConnectionNotification == null ? AccessoryConnectionNotification.getDefaultInstance() : accessoryConnectionNotification;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public AccessoryConnectionNotificationOrBuilder getAccessoryConnectionNotificationOrBuilder() {
            AccessoryConnectionNotification accessoryConnectionNotification = this.accessoryConnectionNotification_;
            return accessoryConnectionNotification == null ? AccessoryConnectionNotification.getDefaultInstance() : accessoryConnectionNotification;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public AccessoryStatusRequest getAccessoryStatusRequest() {
            AccessoryStatusRequest accessoryStatusRequest = this.accessoryStatusRequest_;
            return accessoryStatusRequest == null ? AccessoryStatusRequest.getDefaultInstance() : accessoryStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public AccessoryStatusRequestOrBuilder getAccessoryStatusRequestOrBuilder() {
            AccessoryStatusRequest accessoryStatusRequest = this.accessoryStatusRequest_;
            return accessoryStatusRequest == null ? AccessoryStatusRequest.getDefaultInstance() : accessoryStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public AccessoryStatusResponse getAccessoryStatusResponse() {
            AccessoryStatusResponse accessoryStatusResponse = this.accessoryStatusResponse_;
            return accessoryStatusResponse == null ? AccessoryStatusResponse.getDefaultInstance() : accessoryStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public AccessoryStatusResponseOrBuilder getAccessoryStatusResponseOrBuilder() {
            AccessoryStatusResponse accessoryStatusResponse = this.accessoryStatusResponse_;
            return accessoryStatusResponse == null ? AccessoryStatusResponse.getDefaultInstance() : accessoryStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public CancelPairingRequest getCancelPairingRequest() {
            CancelPairingRequest cancelPairingRequest = this.cancelPairingRequest_;
            return cancelPairingRequest == null ? CancelPairingRequest.getDefaultInstance() : cancelPairingRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public CancelPairingRequestOrBuilder getCancelPairingRequestOrBuilder() {
            CancelPairingRequest cancelPairingRequest = this.cancelPairingRequest_;
            return cancelPairingRequest == null ? CancelPairingRequest.getDefaultInstance() : cancelPairingRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public CancelPairingResponse getCancelPairingResponse() {
            CancelPairingResponse cancelPairingResponse = this.cancelPairingResponse_;
            return cancelPairingResponse == null ? CancelPairingResponse.getDefaultInstance() : cancelPairingResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public CancelPairingResponseOrBuilder getCancelPairingResponseOrBuilder() {
            CancelPairingResponse cancelPairingResponse = this.cancelPairingResponse_;
            return cancelPairingResponse == null ? CancelPairingResponse.getDefaultInstance() : cancelPairingResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairedListRequest getPairedListRequest() {
            PairedListRequest pairedListRequest = this.pairedListRequest_;
            return pairedListRequest == null ? PairedListRequest.getDefaultInstance() : pairedListRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairedListRequestOrBuilder getPairedListRequestOrBuilder() {
            PairedListRequest pairedListRequest = this.pairedListRequest_;
            return pairedListRequest == null ? PairedListRequest.getDefaultInstance() : pairedListRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairedListResponse getPairedListResponse() {
            PairedListResponse pairedListResponse = this.pairedListResponse_;
            return pairedListResponse == null ? PairedListResponse.getDefaultInstance() : pairedListResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairedListResponseOrBuilder getPairedListResponseOrBuilder() {
            PairedListResponse pairedListResponse = this.pairedListResponse_;
            return pairedListResponse == null ? PairedListResponse.getDefaultInstance() : pairedListResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairingCommandNotification getPairingCommandNotification() {
            PairingCommandNotification pairingCommandNotification = this.pairingCommandNotification_;
            return pairingCommandNotification == null ? PairingCommandNotification.getDefaultInstance() : pairingCommandNotification;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairingCommandNotificationOrBuilder getPairingCommandNotificationOrBuilder() {
            PairingCommandNotification pairingCommandNotification = this.pairingCommandNotification_;
            return pairingCommandNotification == null ? PairingCommandNotification.getDefaultInstance() : pairingCommandNotification;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairingCompleteNotification getPairingCompleteNotification() {
            PairingCompleteNotification pairingCompleteNotification = this.pairingCompleteNotification_;
            return pairingCompleteNotification == null ? PairingCompleteNotification.getDefaultInstance() : pairingCompleteNotification;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairingCompleteNotificationOrBuilder getPairingCompleteNotificationOrBuilder() {
            PairingCompleteNotification pairingCompleteNotification = this.pairingCompleteNotification_;
            return pairingCompleteNotification == null ? PairingCompleteNotification.getDefaultInstance() : pairingCompleteNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairingStatusNotification getRemoteDeviceStatusNotification() {
            PairingStatusNotification pairingStatusNotification = this.remoteDeviceStatusNotification_;
            return pairingStatusNotification == null ? PairingStatusNotification.getDefaultInstance() : pairingStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public PairingStatusNotificationOrBuilder getRemoteDeviceStatusNotificationOrBuilder() {
            PairingStatusNotification pairingStatusNotification = this.remoteDeviceStatusNotification_;
            return pairingStatusNotification == null ? PairingStatusNotification.getDefaultInstance() : pairingStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public RemovePairedDeviceRequest getRemovePairedDeviceRequest() {
            RemovePairedDeviceRequest removePairedDeviceRequest = this.removePairedDeviceRequest_;
            return removePairedDeviceRequest == null ? RemovePairedDeviceRequest.getDefaultInstance() : removePairedDeviceRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public RemovePairedDeviceRequestOrBuilder getRemovePairedDeviceRequestOrBuilder() {
            RemovePairedDeviceRequest removePairedDeviceRequest = this.removePairedDeviceRequest_;
            return removePairedDeviceRequest == null ? RemovePairedDeviceRequest.getDefaultInstance() : removePairedDeviceRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public RemovePairedDeviceResponse getRemovePairedDeviceResponse() {
            RemovePairedDeviceResponse removePairedDeviceResponse = this.removePairedDeviceResponse_;
            return removePairedDeviceResponse == null ? RemovePairedDeviceResponse.getDefaultInstance() : removePairedDeviceResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public RemovePairedDeviceResponseOrBuilder getRemovePairedDeviceResponseOrBuilder() {
            RemovePairedDeviceResponse removePairedDeviceResponse = this.removePairedDeviceResponse_;
            return removePairedDeviceResponse == null ? RemovePairedDeviceResponse.getDefaultInstance() : removePairedDeviceResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public ScanResultsNotification getScanResultsNotification() {
            ScanResultsNotification scanResultsNotification = this.scanResultsNotification_;
            return scanResultsNotification == null ? ScanResultsNotification.getDefaultInstance() : scanResultsNotification;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public ScanResultsNotificationOrBuilder getScanResultsNotificationOrBuilder() {
            ScanResultsNotification scanResultsNotification = this.scanResultsNotification_;
            return scanResultsNotification == null ? ScanResultsNotification.getDefaultInstance() : scanResultsNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPairedListRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getPairedListResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getRemovePairedDeviceRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getRemovePairedDeviceResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getStartPairingRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getStartPairingResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getCancelPairingRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getCancelPairingResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getPairingCommandNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getRemoteDeviceStatusNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getPairingCompleteNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getStartScanRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getStartScanResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getScanResultsNotification());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getAccessoryConnectionNotification());
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getStopScanRequest());
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getStopScanResponse());
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getSetEnablePairedDeviceRequest());
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(19, getSetEnablePairedDeviceResponse());
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(20, getAccessoryStatusRequest());
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(21, getAccessoryStatusResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public SetEnablePairedDeviceRequest getSetEnablePairedDeviceRequest() {
            SetEnablePairedDeviceRequest setEnablePairedDeviceRequest = this.setEnablePairedDeviceRequest_;
            return setEnablePairedDeviceRequest == null ? SetEnablePairedDeviceRequest.getDefaultInstance() : setEnablePairedDeviceRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public SetEnablePairedDeviceRequestOrBuilder getSetEnablePairedDeviceRequestOrBuilder() {
            SetEnablePairedDeviceRequest setEnablePairedDeviceRequest = this.setEnablePairedDeviceRequest_;
            return setEnablePairedDeviceRequest == null ? SetEnablePairedDeviceRequest.getDefaultInstance() : setEnablePairedDeviceRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public SetEnablePairedDeviceResponse getSetEnablePairedDeviceResponse() {
            SetEnablePairedDeviceResponse setEnablePairedDeviceResponse = this.setEnablePairedDeviceResponse_;
            return setEnablePairedDeviceResponse == null ? SetEnablePairedDeviceResponse.getDefaultInstance() : setEnablePairedDeviceResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public SetEnablePairedDeviceResponseOrBuilder getSetEnablePairedDeviceResponseOrBuilder() {
            SetEnablePairedDeviceResponse setEnablePairedDeviceResponse = this.setEnablePairedDeviceResponse_;
            return setEnablePairedDeviceResponse == null ? SetEnablePairedDeviceResponse.getDefaultInstance() : setEnablePairedDeviceResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StartPairingRequest getStartPairingRequest() {
            StartPairingRequest startPairingRequest = this.startPairingRequest_;
            return startPairingRequest == null ? StartPairingRequest.getDefaultInstance() : startPairingRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StartPairingRequestOrBuilder getStartPairingRequestOrBuilder() {
            StartPairingRequest startPairingRequest = this.startPairingRequest_;
            return startPairingRequest == null ? StartPairingRequest.getDefaultInstance() : startPairingRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StartPairingResponse getStartPairingResponse() {
            StartPairingResponse startPairingResponse = this.startPairingResponse_;
            return startPairingResponse == null ? StartPairingResponse.getDefaultInstance() : startPairingResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StartPairingResponseOrBuilder getStartPairingResponseOrBuilder() {
            StartPairingResponse startPairingResponse = this.startPairingResponse_;
            return startPairingResponse == null ? StartPairingResponse.getDefaultInstance() : startPairingResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StartScanRequest getStartScanRequest() {
            StartScanRequest startScanRequest = this.startScanRequest_;
            return startScanRequest == null ? StartScanRequest.getDefaultInstance() : startScanRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StartScanRequestOrBuilder getStartScanRequestOrBuilder() {
            StartScanRequest startScanRequest = this.startScanRequest_;
            return startScanRequest == null ? StartScanRequest.getDefaultInstance() : startScanRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StartScanResponse getStartScanResponse() {
            StartScanResponse startScanResponse = this.startScanResponse_;
            return startScanResponse == null ? StartScanResponse.getDefaultInstance() : startScanResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StartScanResponseOrBuilder getStartScanResponseOrBuilder() {
            StartScanResponse startScanResponse = this.startScanResponse_;
            return startScanResponse == null ? StartScanResponse.getDefaultInstance() : startScanResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StopScanRequest getStopScanRequest() {
            StopScanRequest stopScanRequest = this.stopScanRequest_;
            return stopScanRequest == null ? StopScanRequest.getDefaultInstance() : stopScanRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StopScanRequestOrBuilder getStopScanRequestOrBuilder() {
            StopScanRequest stopScanRequest = this.stopScanRequest_;
            return stopScanRequest == null ? StopScanRequest.getDefaultInstance() : stopScanRequest;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StopScanResponse getStopScanResponse() {
            StopScanResponse stopScanResponse = this.stopScanResponse_;
            return stopScanResponse == null ? StopScanResponse.getDefaultInstance() : stopScanResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public StopScanResponseOrBuilder getStopScanResponseOrBuilder() {
            StopScanResponse stopScanResponse = this.stopScanResponse_;
            return stopScanResponse == null ? StopScanResponse.getDefaultInstance() : stopScanResponse;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasAccessoryConnectionNotification() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasAccessoryStatusRequest() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasAccessoryStatusResponse() {
            return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasCancelPairingRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasCancelPairingResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasPairedListRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasPairedListResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasPairingCommandNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasPairingCompleteNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasRemoteDeviceStatusNotification() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasRemovePairedDeviceRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasRemovePairedDeviceResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasScanResultsNotification() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasSetEnablePairedDeviceRequest() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasSetEnablePairedDeviceResponse() {
            return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasStartPairingRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasStartPairingResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasStartScanRequest() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasStartScanResponse() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasStopScanRequest() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
        public boolean hasStopScanResponse() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPairedListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPairedListRequest().hashCode();
            }
            if (hasPairedListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPairedListResponse().hashCode();
            }
            if (hasRemovePairedDeviceRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getRemovePairedDeviceRequest().hashCode();
            }
            if (hasRemovePairedDeviceResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getRemovePairedDeviceResponse().hashCode();
            }
            if (hasStartPairingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getStartPairingRequest().hashCode();
            }
            if (hasStartPairingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getStartPairingResponse().hashCode();
            }
            if (hasCancelPairingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getCancelPairingRequest().hashCode();
            }
            if (hasCancelPairingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getCancelPairingResponse().hashCode();
            }
            if (hasPairingCommandNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getPairingCommandNotification().hashCode();
            }
            if (hasRemoteDeviceStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getRemoteDeviceStatusNotification().hashCode();
            }
            if (hasPairingCompleteNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getPairingCompleteNotification().hashCode();
            }
            if (hasStartScanRequest()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getStartScanRequest().hashCode();
            }
            if (hasStartScanResponse()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getStartScanResponse().hashCode();
            }
            if (hasScanResultsNotification()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getScanResultsNotification().hashCode();
            }
            if (hasAccessoryConnectionNotification()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getAccessoryConnectionNotification().hashCode();
            }
            if (hasStopScanRequest()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getStopScanRequest().hashCode();
            }
            if (hasStopScanResponse()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getStopScanResponse().hashCode();
            }
            if (hasSetEnablePairedDeviceRequest()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getSetEnablePairedDeviceRequest().hashCode();
            }
            if (hasSetEnablePairedDeviceResponse()) {
                iHashCode = e5.c(iHashCode, 37, 19, 53) + getSetEnablePairedDeviceResponse().hashCode();
            }
            if (hasAccessoryStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 20, 53) + getAccessoryStatusRequest().hashCode();
            }
            if (hasAccessoryStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 21, 53) + getAccessoryStatusResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (!hasRemovePairedDeviceResponse() || getRemovePairedDeviceResponse().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getPairedListRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getPairedListResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getRemovePairedDeviceRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getRemovePairedDeviceResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getStartPairingRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getStartPairingResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getCancelPairingRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getCancelPairingResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getPairingCommandNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getRemoteDeviceStatusNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getPairingCompleteNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getStartScanRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getStartScanResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getScanResultsNotification());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getAccessoryConnectionNotification());
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeMessage(16, getStopScanRequest());
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeMessage(17, getStopScanResponse());
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeMessage(18, getSetEnablePairedDeviceRequest());
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                codedOutputStream.writeMessage(19, getSetEnablePairedDeviceResponse());
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeMessage(20, getAccessoryStatusRequest());
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                codedOutputStream.writeMessage(21, getAccessoryStatusResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> accessoryConnectionNotificationBuilder_;
            private AccessoryConnectionNotification accessoryConnectionNotification_;
            private SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> accessoryStatusRequestBuilder_;
            private AccessoryStatusRequest accessoryStatusRequest_;
            private SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> accessoryStatusResponseBuilder_;
            private AccessoryStatusResponse accessoryStatusResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> cancelPairingRequestBuilder_;
            private CancelPairingRequest cancelPairingRequest_;
            private SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> cancelPairingResponseBuilder_;
            private CancelPairingResponse cancelPairingResponse_;
            private SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> pairedListRequestBuilder_;
            private PairedListRequest pairedListRequest_;
            private SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> pairedListResponseBuilder_;
            private PairedListResponse pairedListResponse_;
            private SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> pairingCommandNotificationBuilder_;
            private PairingCommandNotification pairingCommandNotification_;
            private SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> pairingCompleteNotificationBuilder_;
            private PairingCompleteNotification pairingCompleteNotification_;
            private SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> remoteDeviceStatusNotificationBuilder_;
            private PairingStatusNotification remoteDeviceStatusNotification_;
            private SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> removePairedDeviceRequestBuilder_;
            private RemovePairedDeviceRequest removePairedDeviceRequest_;
            private SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> removePairedDeviceResponseBuilder_;
            private RemovePairedDeviceResponse removePairedDeviceResponse_;
            private SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> scanResultsNotificationBuilder_;
            private ScanResultsNotification scanResultsNotification_;
            private SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> setEnablePairedDeviceRequestBuilder_;
            private SetEnablePairedDeviceRequest setEnablePairedDeviceRequest_;
            private SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> setEnablePairedDeviceResponseBuilder_;
            private SetEnablePairedDeviceResponse setEnablePairedDeviceResponse_;
            private SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> startPairingRequestBuilder_;
            private StartPairingRequest startPairingRequest_;
            private SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> startPairingResponseBuilder_;
            private StartPairingResponse startPairingResponse_;
            private SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> startScanRequestBuilder_;
            private StartScanRequest startScanRequest_;
            private SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> startScanResponseBuilder_;
            private StartScanResponse startScanResponse_;
            private SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> stopScanRequestBuilder_;
            private StopScanRequest stopScanRequest_;
            private SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> stopScanResponseBuilder_;
            private StopScanResponse stopScanResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> singleFieldBuilderV3 = this.pairedListRequestBuilder_;
                    service.pairedListRequest_ = singleFieldBuilderV3 == null ? this.pairedListRequest_ : (PairedListRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> singleFieldBuilderV4 = this.pairedListResponseBuilder_;
                    service.pairedListResponse_ = singleFieldBuilderV4 == null ? this.pairedListResponse_ : (PairedListResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> singleFieldBuilderV5 = this.removePairedDeviceRequestBuilder_;
                    service.removePairedDeviceRequest_ = singleFieldBuilderV5 == null ? this.removePairedDeviceRequest_ : (RemovePairedDeviceRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> singleFieldBuilderV6 = this.removePairedDeviceResponseBuilder_;
                    service.removePairedDeviceResponse_ = singleFieldBuilderV6 == null ? this.removePairedDeviceResponse_ : (RemovePairedDeviceResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> singleFieldBuilderV7 = this.startPairingRequestBuilder_;
                    service.startPairingRequest_ = singleFieldBuilderV7 == null ? this.startPairingRequest_ : (StartPairingRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> singleFieldBuilderV8 = this.startPairingResponseBuilder_;
                    service.startPairingResponse_ = singleFieldBuilderV8 == null ? this.startPairingResponse_ : (StartPairingResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> singleFieldBuilderV9 = this.cancelPairingRequestBuilder_;
                    service.cancelPairingRequest_ = singleFieldBuilderV9 == null ? this.cancelPairingRequest_ : (CancelPairingRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> singleFieldBuilderV10 = this.cancelPairingResponseBuilder_;
                    service.cancelPairingResponse_ = singleFieldBuilderV10 == null ? this.cancelPairingResponse_ : (CancelPairingResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> singleFieldBuilderV11 = this.pairingCommandNotificationBuilder_;
                    service.pairingCommandNotification_ = singleFieldBuilderV11 == null ? this.pairingCommandNotification_ : (PairingCommandNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> singleFieldBuilderV12 = this.remoteDeviceStatusNotificationBuilder_;
                    service.remoteDeviceStatusNotification_ = singleFieldBuilderV12 == null ? this.remoteDeviceStatusNotification_ : (PairingStatusNotification) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> singleFieldBuilderV13 = this.pairingCompleteNotificationBuilder_;
                    service.pairingCompleteNotification_ = singleFieldBuilderV13 == null ? this.pairingCompleteNotification_ : (PairingCompleteNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> singleFieldBuilderV14 = this.startScanRequestBuilder_;
                    service.startScanRequest_ = singleFieldBuilderV14 == null ? this.startScanRequest_ : (StartScanRequest) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> singleFieldBuilderV15 = this.startScanResponseBuilder_;
                    service.startScanResponse_ = singleFieldBuilderV15 == null ? this.startScanResponse_ : (StartScanResponse) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> singleFieldBuilderV16 = this.scanResultsNotificationBuilder_;
                    service.scanResultsNotification_ = singleFieldBuilderV16 == null ? this.scanResultsNotification_ : (ScanResultsNotification) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> singleFieldBuilderV17 = this.accessoryConnectionNotificationBuilder_;
                    service.accessoryConnectionNotification_ = singleFieldBuilderV17 == null ? this.accessoryConnectionNotification_ : (AccessoryConnectionNotification) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> singleFieldBuilderV18 = this.stopScanRequestBuilder_;
                    service.stopScanRequest_ = singleFieldBuilderV18 == null ? this.stopScanRequest_ : (StopScanRequest) singleFieldBuilderV18.build();
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> singleFieldBuilderV19 = this.stopScanResponseBuilder_;
                    service.stopScanResponse_ = singleFieldBuilderV19 == null ? this.stopScanResponse_ : (StopScanResponse) singleFieldBuilderV19.build();
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> singleFieldBuilderV20 = this.setEnablePairedDeviceRequestBuilder_;
                    service.setEnablePairedDeviceRequest_ = singleFieldBuilderV20 == null ? this.setEnablePairedDeviceRequest_ : (SetEnablePairedDeviceRequest) singleFieldBuilderV20.build();
                    i14 |= 131072;
                }
                if ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                    SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> singleFieldBuilderV21 = this.setEnablePairedDeviceResponseBuilder_;
                    service.setEnablePairedDeviceResponse_ = singleFieldBuilderV21 == null ? this.setEnablePairedDeviceResponse_ : (SetEnablePairedDeviceResponse) singleFieldBuilderV21.build();
                    i14 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                }
                if ((i15 & 524288) != 0) {
                    SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> singleFieldBuilderV22 = this.accessoryStatusRequestBuilder_;
                    service.accessoryStatusRequest_ = singleFieldBuilderV22 == null ? this.accessoryStatusRequest_ : (AccessoryStatusRequest) singleFieldBuilderV22.build();
                    i14 |= 524288;
                }
                if ((i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                    SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> singleFieldBuilderV23 = this.accessoryStatusResponseBuilder_;
                    service.accessoryStatusResponse_ = singleFieldBuilderV23 == null ? this.accessoryStatusResponse_ : (AccessoryStatusResponse) singleFieldBuilderV23.build();
                    i14 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> getAccessoryConnectionNotificationFieldBuilder() {
                if (this.accessoryConnectionNotificationBuilder_ == null) {
                    this.accessoryConnectionNotificationBuilder_ = new SingleFieldBuilderV3<>(getAccessoryConnectionNotification(), getParentForChildren(), isClean());
                    this.accessoryConnectionNotification_ = null;
                }
                return this.accessoryConnectionNotificationBuilder_;
            }

            private SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> getAccessoryStatusRequestFieldBuilder() {
                if (this.accessoryStatusRequestBuilder_ == null) {
                    this.accessoryStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getAccessoryStatusRequest(), getParentForChildren(), isClean());
                    this.accessoryStatusRequest_ = null;
                }
                return this.accessoryStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> getAccessoryStatusResponseFieldBuilder() {
                if (this.accessoryStatusResponseBuilder_ == null) {
                    this.accessoryStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getAccessoryStatusResponse(), getParentForChildren(), isClean());
                    this.accessoryStatusResponse_ = null;
                }
                return this.accessoryStatusResponseBuilder_;
            }

            private SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> getCancelPairingRequestFieldBuilder() {
                if (this.cancelPairingRequestBuilder_ == null) {
                    this.cancelPairingRequestBuilder_ = new SingleFieldBuilderV3<>(getCancelPairingRequest(), getParentForChildren(), isClean());
                    this.cancelPairingRequest_ = null;
                }
                return this.cancelPairingRequestBuilder_;
            }

            private SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> getCancelPairingResponseFieldBuilder() {
                if (this.cancelPairingResponseBuilder_ == null) {
                    this.cancelPairingResponseBuilder_ = new SingleFieldBuilderV3<>(getCancelPairingResponse(), getParentForChildren(), isClean());
                    this.cancelPairingResponse_ = null;
                }
                return this.cancelPairingResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Service_descriptor;
            }

            private SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> getPairedListRequestFieldBuilder() {
                if (this.pairedListRequestBuilder_ == null) {
                    this.pairedListRequestBuilder_ = new SingleFieldBuilderV3<>(getPairedListRequest(), getParentForChildren(), isClean());
                    this.pairedListRequest_ = null;
                }
                return this.pairedListRequestBuilder_;
            }

            private SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> getPairedListResponseFieldBuilder() {
                if (this.pairedListResponseBuilder_ == null) {
                    this.pairedListResponseBuilder_ = new SingleFieldBuilderV3<>(getPairedListResponse(), getParentForChildren(), isClean());
                    this.pairedListResponse_ = null;
                }
                return this.pairedListResponseBuilder_;
            }

            private SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> getPairingCommandNotificationFieldBuilder() {
                if (this.pairingCommandNotificationBuilder_ == null) {
                    this.pairingCommandNotificationBuilder_ = new SingleFieldBuilderV3<>(getPairingCommandNotification(), getParentForChildren(), isClean());
                    this.pairingCommandNotification_ = null;
                }
                return this.pairingCommandNotificationBuilder_;
            }

            private SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> getPairingCompleteNotificationFieldBuilder() {
                if (this.pairingCompleteNotificationBuilder_ == null) {
                    this.pairingCompleteNotificationBuilder_ = new SingleFieldBuilderV3<>(getPairingCompleteNotification(), getParentForChildren(), isClean());
                    this.pairingCompleteNotification_ = null;
                }
                return this.pairingCompleteNotificationBuilder_;
            }

            private SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> getRemoteDeviceStatusNotificationFieldBuilder() {
                if (this.remoteDeviceStatusNotificationBuilder_ == null) {
                    this.remoteDeviceStatusNotificationBuilder_ = new SingleFieldBuilderV3<>(getRemoteDeviceStatusNotification(), getParentForChildren(), isClean());
                    this.remoteDeviceStatusNotification_ = null;
                }
                return this.remoteDeviceStatusNotificationBuilder_;
            }

            private SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> getRemovePairedDeviceRequestFieldBuilder() {
                if (this.removePairedDeviceRequestBuilder_ == null) {
                    this.removePairedDeviceRequestBuilder_ = new SingleFieldBuilderV3<>(getRemovePairedDeviceRequest(), getParentForChildren(), isClean());
                    this.removePairedDeviceRequest_ = null;
                }
                return this.removePairedDeviceRequestBuilder_;
            }

            private SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> getRemovePairedDeviceResponseFieldBuilder() {
                if (this.removePairedDeviceResponseBuilder_ == null) {
                    this.removePairedDeviceResponseBuilder_ = new SingleFieldBuilderV3<>(getRemovePairedDeviceResponse(), getParentForChildren(), isClean());
                    this.removePairedDeviceResponse_ = null;
                }
                return this.removePairedDeviceResponseBuilder_;
            }

            private SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> getScanResultsNotificationFieldBuilder() {
                if (this.scanResultsNotificationBuilder_ == null) {
                    this.scanResultsNotificationBuilder_ = new SingleFieldBuilderV3<>(getScanResultsNotification(), getParentForChildren(), isClean());
                    this.scanResultsNotification_ = null;
                }
                return this.scanResultsNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> getSetEnablePairedDeviceRequestFieldBuilder() {
                if (this.setEnablePairedDeviceRequestBuilder_ == null) {
                    this.setEnablePairedDeviceRequestBuilder_ = new SingleFieldBuilderV3<>(getSetEnablePairedDeviceRequest(), getParentForChildren(), isClean());
                    this.setEnablePairedDeviceRequest_ = null;
                }
                return this.setEnablePairedDeviceRequestBuilder_;
            }

            private SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> getSetEnablePairedDeviceResponseFieldBuilder() {
                if (this.setEnablePairedDeviceResponseBuilder_ == null) {
                    this.setEnablePairedDeviceResponseBuilder_ = new SingleFieldBuilderV3<>(getSetEnablePairedDeviceResponse(), getParentForChildren(), isClean());
                    this.setEnablePairedDeviceResponse_ = null;
                }
                return this.setEnablePairedDeviceResponseBuilder_;
            }

            private SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> getStartPairingRequestFieldBuilder() {
                if (this.startPairingRequestBuilder_ == null) {
                    this.startPairingRequestBuilder_ = new SingleFieldBuilderV3<>(getStartPairingRequest(), getParentForChildren(), isClean());
                    this.startPairingRequest_ = null;
                }
                return this.startPairingRequestBuilder_;
            }

            private SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> getStartPairingResponseFieldBuilder() {
                if (this.startPairingResponseBuilder_ == null) {
                    this.startPairingResponseBuilder_ = new SingleFieldBuilderV3<>(getStartPairingResponse(), getParentForChildren(), isClean());
                    this.startPairingResponse_ = null;
                }
                return this.startPairingResponseBuilder_;
            }

            private SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> getStartScanRequestFieldBuilder() {
                if (this.startScanRequestBuilder_ == null) {
                    this.startScanRequestBuilder_ = new SingleFieldBuilderV3<>(getStartScanRequest(), getParentForChildren(), isClean());
                    this.startScanRequest_ = null;
                }
                return this.startScanRequestBuilder_;
            }

            private SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> getStartScanResponseFieldBuilder() {
                if (this.startScanResponseBuilder_ == null) {
                    this.startScanResponseBuilder_ = new SingleFieldBuilderV3<>(getStartScanResponse(), getParentForChildren(), isClean());
                    this.startScanResponse_ = null;
                }
                return this.startScanResponseBuilder_;
            }

            private SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> getStopScanRequestFieldBuilder() {
                if (this.stopScanRequestBuilder_ == null) {
                    this.stopScanRequestBuilder_ = new SingleFieldBuilderV3<>(getStopScanRequest(), getParentForChildren(), isClean());
                    this.stopScanRequest_ = null;
                }
                return this.stopScanRequestBuilder_;
            }

            private SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> getStopScanResponseFieldBuilder() {
                if (this.stopScanResponseBuilder_ == null) {
                    this.stopScanResponseBuilder_ = new SingleFieldBuilderV3<>(getStopScanResponse(), getParentForChildren(), isClean());
                    this.stopScanResponse_ = null;
                }
                return this.stopScanResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPairedListRequestFieldBuilder();
                    getPairedListResponseFieldBuilder();
                    getRemovePairedDeviceRequestFieldBuilder();
                    getRemovePairedDeviceResponseFieldBuilder();
                    getStartPairingRequestFieldBuilder();
                    getStartPairingResponseFieldBuilder();
                    getCancelPairingRequestFieldBuilder();
                    getCancelPairingResponseFieldBuilder();
                    getPairingCommandNotificationFieldBuilder();
                    getRemoteDeviceStatusNotificationFieldBuilder();
                    getPairingCompleteNotificationFieldBuilder();
                    getStartScanRequestFieldBuilder();
                    getStartScanResponseFieldBuilder();
                    getScanResultsNotificationFieldBuilder();
                    getAccessoryConnectionNotificationFieldBuilder();
                    getStopScanRequestFieldBuilder();
                    getStopScanResponseFieldBuilder();
                    getSetEnablePairedDeviceRequestFieldBuilder();
                    getSetEnablePairedDeviceResponseFieldBuilder();
                    getAccessoryStatusRequestFieldBuilder();
                    getAccessoryStatusResponseFieldBuilder();
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
                this.pairedListRequest_ = null;
                SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> singleFieldBuilderV3 = this.pairedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pairedListRequestBuilder_ = null;
                }
                this.pairedListResponse_ = null;
                SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> singleFieldBuilderV4 = this.pairedListResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.pairedListResponseBuilder_ = null;
                }
                this.removePairedDeviceRequest_ = null;
                SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> singleFieldBuilderV5 = this.removePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.removePairedDeviceRequestBuilder_ = null;
                }
                this.removePairedDeviceResponse_ = null;
                SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> singleFieldBuilderV6 = this.removePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.removePairedDeviceResponseBuilder_ = null;
                }
                this.startPairingRequest_ = null;
                SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> singleFieldBuilderV7 = this.startPairingRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.startPairingRequestBuilder_ = null;
                }
                this.startPairingResponse_ = null;
                SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> singleFieldBuilderV8 = this.startPairingResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.startPairingResponseBuilder_ = null;
                }
                this.cancelPairingRequest_ = null;
                SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> singleFieldBuilderV9 = this.cancelPairingRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.cancelPairingRequestBuilder_ = null;
                }
                this.cancelPairingResponse_ = null;
                SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> singleFieldBuilderV10 = this.cancelPairingResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.cancelPairingResponseBuilder_ = null;
                }
                this.pairingCommandNotification_ = null;
                SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> singleFieldBuilderV11 = this.pairingCommandNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.pairingCommandNotificationBuilder_ = null;
                }
                this.remoteDeviceStatusNotification_ = null;
                SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> singleFieldBuilderV12 = this.remoteDeviceStatusNotificationBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.remoteDeviceStatusNotificationBuilder_ = null;
                }
                this.pairingCompleteNotification_ = null;
                SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> singleFieldBuilderV13 = this.pairingCompleteNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.pairingCompleteNotificationBuilder_ = null;
                }
                this.startScanRequest_ = null;
                SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> singleFieldBuilderV14 = this.startScanRequestBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.startScanRequestBuilder_ = null;
                }
                this.startScanResponse_ = null;
                SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> singleFieldBuilderV15 = this.startScanResponseBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.startScanResponseBuilder_ = null;
                }
                this.scanResultsNotification_ = null;
                SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> singleFieldBuilderV16 = this.scanResultsNotificationBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.scanResultsNotificationBuilder_ = null;
                }
                this.accessoryConnectionNotification_ = null;
                SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> singleFieldBuilderV17 = this.accessoryConnectionNotificationBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.accessoryConnectionNotificationBuilder_ = null;
                }
                this.stopScanRequest_ = null;
                SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> singleFieldBuilderV18 = this.stopScanRequestBuilder_;
                if (singleFieldBuilderV18 != null) {
                    singleFieldBuilderV18.dispose();
                    this.stopScanRequestBuilder_ = null;
                }
                this.stopScanResponse_ = null;
                SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> singleFieldBuilderV19 = this.stopScanResponseBuilder_;
                if (singleFieldBuilderV19 != null) {
                    singleFieldBuilderV19.dispose();
                    this.stopScanResponseBuilder_ = null;
                }
                this.setEnablePairedDeviceRequest_ = null;
                SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> singleFieldBuilderV20 = this.setEnablePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV20 != null) {
                    singleFieldBuilderV20.dispose();
                    this.setEnablePairedDeviceRequestBuilder_ = null;
                }
                this.setEnablePairedDeviceResponse_ = null;
                SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> singleFieldBuilderV21 = this.setEnablePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV21 != null) {
                    singleFieldBuilderV21.dispose();
                    this.setEnablePairedDeviceResponseBuilder_ = null;
                }
                this.accessoryStatusRequest_ = null;
                SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> singleFieldBuilderV22 = this.accessoryStatusRequestBuilder_;
                if (singleFieldBuilderV22 != null) {
                    singleFieldBuilderV22.dispose();
                    this.accessoryStatusRequestBuilder_ = null;
                }
                this.accessoryStatusResponse_ = null;
                SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> singleFieldBuilderV23 = this.accessoryStatusResponseBuilder_;
                if (singleFieldBuilderV23 != null) {
                    singleFieldBuilderV23.dispose();
                    this.accessoryStatusResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAccessoryConnectionNotification() {
                this.bitField0_ &= -16385;
                this.accessoryConnectionNotification_ = null;
                SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.accessoryConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessoryConnectionNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAccessoryStatusRequest() {
                this.bitField0_ &= -524289;
                this.accessoryStatusRequest_ = null;
                SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> singleFieldBuilderV3 = this.accessoryStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessoryStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAccessoryStatusResponse() {
                this.bitField0_ &= -1048577;
                this.accessoryStatusResponse_ = null;
                SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> singleFieldBuilderV3 = this.accessoryStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessoryStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCancelPairingRequest() {
                this.bitField0_ &= -65;
                this.cancelPairingRequest_ = null;
                SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> singleFieldBuilderV3 = this.cancelPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cancelPairingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCancelPairingResponse() {
                this.bitField0_ &= -129;
                this.cancelPairingResponse_ = null;
                SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> singleFieldBuilderV3 = this.cancelPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cancelPairingResponseBuilder_ = null;
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

            public Builder clearPairedListRequest() {
                this.bitField0_ &= -2;
                this.pairedListRequest_ = null;
                SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> singleFieldBuilderV3 = this.pairedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pairedListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPairedListResponse() {
                this.bitField0_ &= -3;
                this.pairedListResponse_ = null;
                SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> singleFieldBuilderV3 = this.pairedListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pairedListResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPairingCommandNotification() {
                this.bitField0_ &= -257;
                this.pairingCommandNotification_ = null;
                SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCommandNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pairingCommandNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPairingCompleteNotification() {
                this.bitField0_ &= -1025;
                this.pairingCompleteNotification_ = null;
                SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pairingCompleteNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRemoteDeviceStatusNotification() {
                this.bitField0_ &= -513;
                this.remoteDeviceStatusNotification_ = null;
                SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.remoteDeviceStatusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRemovePairedDeviceRequest() {
                this.bitField0_ &= -5;
                this.removePairedDeviceRequest_ = null;
                SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.removePairedDeviceRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRemovePairedDeviceResponse() {
                this.bitField0_ &= -9;
                this.removePairedDeviceResponse_ = null;
                SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.removePairedDeviceResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearScanResultsNotification() {
                this.bitField0_ &= -8193;
                this.scanResultsNotification_ = null;
                SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> singleFieldBuilderV3 = this.scanResultsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.scanResultsNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetEnablePairedDeviceRequest() {
                this.bitField0_ &= -131073;
                this.setEnablePairedDeviceRequest_ = null;
                SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setEnablePairedDeviceRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetEnablePairedDeviceResponse() {
                this.bitField0_ &= -262145;
                this.setEnablePairedDeviceResponse_ = null;
                SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setEnablePairedDeviceResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartPairingRequest() {
                this.bitField0_ &= -17;
                this.startPairingRequest_ = null;
                SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> singleFieldBuilderV3 = this.startPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startPairingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartPairingResponse() {
                this.bitField0_ &= -33;
                this.startPairingResponse_ = null;
                SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> singleFieldBuilderV3 = this.startPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startPairingResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartScanRequest() {
                this.bitField0_ &= -2049;
                this.startScanRequest_ = null;
                SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> singleFieldBuilderV3 = this.startScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startScanRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartScanResponse() {
                this.bitField0_ &= -4097;
                this.startScanResponse_ = null;
                SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> singleFieldBuilderV3 = this.startScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startScanResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStopScanRequest() {
                this.bitField0_ &= -32769;
                this.stopScanRequest_ = null;
                SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> singleFieldBuilderV3 = this.stopScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stopScanRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStopScanResponse() {
                this.bitField0_ &= -65537;
                this.stopScanResponse_ = null;
                SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> singleFieldBuilderV3 = this.stopScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stopScanResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public AccessoryConnectionNotification getAccessoryConnectionNotification() {
                SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.accessoryConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessoryConnectionNotification) singleFieldBuilderV3.getMessage();
                }
                AccessoryConnectionNotification accessoryConnectionNotification = this.accessoryConnectionNotification_;
                return accessoryConnectionNotification == null ? AccessoryConnectionNotification.getDefaultInstance() : accessoryConnectionNotification;
            }

            public AccessoryConnectionNotification.Builder getAccessoryConnectionNotificationBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (AccessoryConnectionNotification.Builder) getAccessoryConnectionNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public AccessoryConnectionNotificationOrBuilder getAccessoryConnectionNotificationOrBuilder() {
                SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.accessoryConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessoryConnectionNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AccessoryConnectionNotification accessoryConnectionNotification = this.accessoryConnectionNotification_;
                return accessoryConnectionNotification == null ? AccessoryConnectionNotification.getDefaultInstance() : accessoryConnectionNotification;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public AccessoryStatusRequest getAccessoryStatusRequest() {
                SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> singleFieldBuilderV3 = this.accessoryStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessoryStatusRequest) singleFieldBuilderV3.getMessage();
                }
                AccessoryStatusRequest accessoryStatusRequest = this.accessoryStatusRequest_;
                return accessoryStatusRequest == null ? AccessoryStatusRequest.getDefaultInstance() : accessoryStatusRequest;
            }

            public AccessoryStatusRequest.Builder getAccessoryStatusRequestBuilder() {
                this.bitField0_ |= 524288;
                onChanged();
                return (AccessoryStatusRequest.Builder) getAccessoryStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public AccessoryStatusRequestOrBuilder getAccessoryStatusRequestOrBuilder() {
                SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> singleFieldBuilderV3 = this.accessoryStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessoryStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AccessoryStatusRequest accessoryStatusRequest = this.accessoryStatusRequest_;
                return accessoryStatusRequest == null ? AccessoryStatusRequest.getDefaultInstance() : accessoryStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public AccessoryStatusResponse getAccessoryStatusResponse() {
                SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> singleFieldBuilderV3 = this.accessoryStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessoryStatusResponse) singleFieldBuilderV3.getMessage();
                }
                AccessoryStatusResponse accessoryStatusResponse = this.accessoryStatusResponse_;
                return accessoryStatusResponse == null ? AccessoryStatusResponse.getDefaultInstance() : accessoryStatusResponse;
            }

            public AccessoryStatusResponse.Builder getAccessoryStatusResponseBuilder() {
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return (AccessoryStatusResponse.Builder) getAccessoryStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public AccessoryStatusResponseOrBuilder getAccessoryStatusResponseOrBuilder() {
                SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> singleFieldBuilderV3 = this.accessoryStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessoryStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AccessoryStatusResponse accessoryStatusResponse = this.accessoryStatusResponse_;
                return accessoryStatusResponse == null ? AccessoryStatusResponse.getDefaultInstance() : accessoryStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public CancelPairingRequest getCancelPairingRequest() {
                SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> singleFieldBuilderV3 = this.cancelPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelPairingRequest) singleFieldBuilderV3.getMessage();
                }
                CancelPairingRequest cancelPairingRequest = this.cancelPairingRequest_;
                return cancelPairingRequest == null ? CancelPairingRequest.getDefaultInstance() : cancelPairingRequest;
            }

            public CancelPairingRequest.Builder getCancelPairingRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (CancelPairingRequest.Builder) getCancelPairingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public CancelPairingRequestOrBuilder getCancelPairingRequestOrBuilder() {
                SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> singleFieldBuilderV3 = this.cancelPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelPairingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CancelPairingRequest cancelPairingRequest = this.cancelPairingRequest_;
                return cancelPairingRequest == null ? CancelPairingRequest.getDefaultInstance() : cancelPairingRequest;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public CancelPairingResponse getCancelPairingResponse() {
                SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> singleFieldBuilderV3 = this.cancelPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelPairingResponse) singleFieldBuilderV3.getMessage();
                }
                CancelPairingResponse cancelPairingResponse = this.cancelPairingResponse_;
                return cancelPairingResponse == null ? CancelPairingResponse.getDefaultInstance() : cancelPairingResponse;
            }

            public CancelPairingResponse.Builder getCancelPairingResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (CancelPairingResponse.Builder) getCancelPairingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public CancelPairingResponseOrBuilder getCancelPairingResponseOrBuilder() {
                SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> singleFieldBuilderV3 = this.cancelPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelPairingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CancelPairingResponse cancelPairingResponse = this.cancelPairingResponse_;
                return cancelPairingResponse == null ? CancelPairingResponse.getDefaultInstance() : cancelPairingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairedListRequest getPairedListRequest() {
                SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> singleFieldBuilderV3 = this.pairedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairedListRequest) singleFieldBuilderV3.getMessage();
                }
                PairedListRequest pairedListRequest = this.pairedListRequest_;
                return pairedListRequest == null ? PairedListRequest.getDefaultInstance() : pairedListRequest;
            }

            public PairedListRequest.Builder getPairedListRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PairedListRequest.Builder) getPairedListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairedListRequestOrBuilder getPairedListRequestOrBuilder() {
                SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> singleFieldBuilderV3 = this.pairedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairedListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PairedListRequest pairedListRequest = this.pairedListRequest_;
                return pairedListRequest == null ? PairedListRequest.getDefaultInstance() : pairedListRequest;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairedListResponse getPairedListResponse() {
                SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> singleFieldBuilderV3 = this.pairedListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairedListResponse) singleFieldBuilderV3.getMessage();
                }
                PairedListResponse pairedListResponse = this.pairedListResponse_;
                return pairedListResponse == null ? PairedListResponse.getDefaultInstance() : pairedListResponse;
            }

            public PairedListResponse.Builder getPairedListResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (PairedListResponse.Builder) getPairedListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairedListResponseOrBuilder getPairedListResponseOrBuilder() {
                SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> singleFieldBuilderV3 = this.pairedListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairedListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PairedListResponse pairedListResponse = this.pairedListResponse_;
                return pairedListResponse == null ? PairedListResponse.getDefaultInstance() : pairedListResponse;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairingCommandNotification getPairingCommandNotification() {
                SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCommandNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairingCommandNotification) singleFieldBuilderV3.getMessage();
                }
                PairingCommandNotification pairingCommandNotification = this.pairingCommandNotification_;
                return pairingCommandNotification == null ? PairingCommandNotification.getDefaultInstance() : pairingCommandNotification;
            }

            public PairingCommandNotification.Builder getPairingCommandNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (PairingCommandNotification.Builder) getPairingCommandNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairingCommandNotificationOrBuilder getPairingCommandNotificationOrBuilder() {
                SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCommandNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairingCommandNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PairingCommandNotification pairingCommandNotification = this.pairingCommandNotification_;
                return pairingCommandNotification == null ? PairingCommandNotification.getDefaultInstance() : pairingCommandNotification;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairingCompleteNotification getPairingCompleteNotification() {
                SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairingCompleteNotification) singleFieldBuilderV3.getMessage();
                }
                PairingCompleteNotification pairingCompleteNotification = this.pairingCompleteNotification_;
                return pairingCompleteNotification == null ? PairingCompleteNotification.getDefaultInstance() : pairingCompleteNotification;
            }

            public PairingCompleteNotification.Builder getPairingCompleteNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (PairingCompleteNotification.Builder) getPairingCompleteNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairingCompleteNotificationOrBuilder getPairingCompleteNotificationOrBuilder() {
                SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairingCompleteNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PairingCompleteNotification pairingCompleteNotification = this.pairingCompleteNotification_;
                return pairingCompleteNotification == null ? PairingCompleteNotification.getDefaultInstance() : pairingCompleteNotification;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairingStatusNotification getRemoteDeviceStatusNotification() {
                SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairingStatusNotification) singleFieldBuilderV3.getMessage();
                }
                PairingStatusNotification pairingStatusNotification = this.remoteDeviceStatusNotification_;
                return pairingStatusNotification == null ? PairingStatusNotification.getDefaultInstance() : pairingStatusNotification;
            }

            public PairingStatusNotification.Builder getRemoteDeviceStatusNotificationBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (PairingStatusNotification.Builder) getRemoteDeviceStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public PairingStatusNotificationOrBuilder getRemoteDeviceStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PairingStatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PairingStatusNotification pairingStatusNotification = this.remoteDeviceStatusNotification_;
                return pairingStatusNotification == null ? PairingStatusNotification.getDefaultInstance() : pairingStatusNotification;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public RemovePairedDeviceRequest getRemovePairedDeviceRequest() {
                SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemovePairedDeviceRequest) singleFieldBuilderV3.getMessage();
                }
                RemovePairedDeviceRequest removePairedDeviceRequest = this.removePairedDeviceRequest_;
                return removePairedDeviceRequest == null ? RemovePairedDeviceRequest.getDefaultInstance() : removePairedDeviceRequest;
            }

            public RemovePairedDeviceRequest.Builder getRemovePairedDeviceRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (RemovePairedDeviceRequest.Builder) getRemovePairedDeviceRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public RemovePairedDeviceRequestOrBuilder getRemovePairedDeviceRequestOrBuilder() {
                SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemovePairedDeviceRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RemovePairedDeviceRequest removePairedDeviceRequest = this.removePairedDeviceRequest_;
                return removePairedDeviceRequest == null ? RemovePairedDeviceRequest.getDefaultInstance() : removePairedDeviceRequest;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public RemovePairedDeviceResponse getRemovePairedDeviceResponse() {
                SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemovePairedDeviceResponse) singleFieldBuilderV3.getMessage();
                }
                RemovePairedDeviceResponse removePairedDeviceResponse = this.removePairedDeviceResponse_;
                return removePairedDeviceResponse == null ? RemovePairedDeviceResponse.getDefaultInstance() : removePairedDeviceResponse;
            }

            public RemovePairedDeviceResponse.Builder getRemovePairedDeviceResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (RemovePairedDeviceResponse.Builder) getRemovePairedDeviceResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public RemovePairedDeviceResponseOrBuilder getRemovePairedDeviceResponseOrBuilder() {
                SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemovePairedDeviceResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RemovePairedDeviceResponse removePairedDeviceResponse = this.removePairedDeviceResponse_;
                return removePairedDeviceResponse == null ? RemovePairedDeviceResponse.getDefaultInstance() : removePairedDeviceResponse;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public ScanResultsNotification getScanResultsNotification() {
                SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> singleFieldBuilderV3 = this.scanResultsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ScanResultsNotification) singleFieldBuilderV3.getMessage();
                }
                ScanResultsNotification scanResultsNotification = this.scanResultsNotification_;
                return scanResultsNotification == null ? ScanResultsNotification.getDefaultInstance() : scanResultsNotification;
            }

            public ScanResultsNotification.Builder getScanResultsNotificationBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (ScanResultsNotification.Builder) getScanResultsNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public ScanResultsNotificationOrBuilder getScanResultsNotificationOrBuilder() {
                SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> singleFieldBuilderV3 = this.scanResultsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ScanResultsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ScanResultsNotification scanResultsNotification = this.scanResultsNotification_;
                return scanResultsNotification == null ? ScanResultsNotification.getDefaultInstance() : scanResultsNotification;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public SetEnablePairedDeviceRequest getSetEnablePairedDeviceRequest() {
                SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetEnablePairedDeviceRequest) singleFieldBuilderV3.getMessage();
                }
                SetEnablePairedDeviceRequest setEnablePairedDeviceRequest = this.setEnablePairedDeviceRequest_;
                return setEnablePairedDeviceRequest == null ? SetEnablePairedDeviceRequest.getDefaultInstance() : setEnablePairedDeviceRequest;
            }

            public SetEnablePairedDeviceRequest.Builder getSetEnablePairedDeviceRequestBuilder() {
                this.bitField0_ |= 131072;
                onChanged();
                return (SetEnablePairedDeviceRequest.Builder) getSetEnablePairedDeviceRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public SetEnablePairedDeviceRequestOrBuilder getSetEnablePairedDeviceRequestOrBuilder() {
                SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetEnablePairedDeviceRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetEnablePairedDeviceRequest setEnablePairedDeviceRequest = this.setEnablePairedDeviceRequest_;
                return setEnablePairedDeviceRequest == null ? SetEnablePairedDeviceRequest.getDefaultInstance() : setEnablePairedDeviceRequest;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public SetEnablePairedDeviceResponse getSetEnablePairedDeviceResponse() {
                SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetEnablePairedDeviceResponse) singleFieldBuilderV3.getMessage();
                }
                SetEnablePairedDeviceResponse setEnablePairedDeviceResponse = this.setEnablePairedDeviceResponse_;
                return setEnablePairedDeviceResponse == null ? SetEnablePairedDeviceResponse.getDefaultInstance() : setEnablePairedDeviceResponse;
            }

            public SetEnablePairedDeviceResponse.Builder getSetEnablePairedDeviceResponseBuilder() {
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return (SetEnablePairedDeviceResponse.Builder) getSetEnablePairedDeviceResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public SetEnablePairedDeviceResponseOrBuilder getSetEnablePairedDeviceResponseOrBuilder() {
                SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetEnablePairedDeviceResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetEnablePairedDeviceResponse setEnablePairedDeviceResponse = this.setEnablePairedDeviceResponse_;
                return setEnablePairedDeviceResponse == null ? SetEnablePairedDeviceResponse.getDefaultInstance() : setEnablePairedDeviceResponse;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StartPairingRequest getStartPairingRequest() {
                SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> singleFieldBuilderV3 = this.startPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartPairingRequest) singleFieldBuilderV3.getMessage();
                }
                StartPairingRequest startPairingRequest = this.startPairingRequest_;
                return startPairingRequest == null ? StartPairingRequest.getDefaultInstance() : startPairingRequest;
            }

            public StartPairingRequest.Builder getStartPairingRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (StartPairingRequest.Builder) getStartPairingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StartPairingRequestOrBuilder getStartPairingRequestOrBuilder() {
                SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> singleFieldBuilderV3 = this.startPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartPairingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartPairingRequest startPairingRequest = this.startPairingRequest_;
                return startPairingRequest == null ? StartPairingRequest.getDefaultInstance() : startPairingRequest;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StartPairingResponse getStartPairingResponse() {
                SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> singleFieldBuilderV3 = this.startPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartPairingResponse) singleFieldBuilderV3.getMessage();
                }
                StartPairingResponse startPairingResponse = this.startPairingResponse_;
                return startPairingResponse == null ? StartPairingResponse.getDefaultInstance() : startPairingResponse;
            }

            public StartPairingResponse.Builder getStartPairingResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (StartPairingResponse.Builder) getStartPairingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StartPairingResponseOrBuilder getStartPairingResponseOrBuilder() {
                SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> singleFieldBuilderV3 = this.startPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartPairingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartPairingResponse startPairingResponse = this.startPairingResponse_;
                return startPairingResponse == null ? StartPairingResponse.getDefaultInstance() : startPairingResponse;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StartScanRequest getStartScanRequest() {
                SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> singleFieldBuilderV3 = this.startScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartScanRequest) singleFieldBuilderV3.getMessage();
                }
                StartScanRequest startScanRequest = this.startScanRequest_;
                return startScanRequest == null ? StartScanRequest.getDefaultInstance() : startScanRequest;
            }

            public StartScanRequest.Builder getStartScanRequestBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (StartScanRequest.Builder) getStartScanRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StartScanRequestOrBuilder getStartScanRequestOrBuilder() {
                SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> singleFieldBuilderV3 = this.startScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartScanRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartScanRequest startScanRequest = this.startScanRequest_;
                return startScanRequest == null ? StartScanRequest.getDefaultInstance() : startScanRequest;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StartScanResponse getStartScanResponse() {
                SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> singleFieldBuilderV3 = this.startScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartScanResponse) singleFieldBuilderV3.getMessage();
                }
                StartScanResponse startScanResponse = this.startScanResponse_;
                return startScanResponse == null ? StartScanResponse.getDefaultInstance() : startScanResponse;
            }

            public StartScanResponse.Builder getStartScanResponseBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (StartScanResponse.Builder) getStartScanResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StartScanResponseOrBuilder getStartScanResponseOrBuilder() {
                SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> singleFieldBuilderV3 = this.startScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartScanResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartScanResponse startScanResponse = this.startScanResponse_;
                return startScanResponse == null ? StartScanResponse.getDefaultInstance() : startScanResponse;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StopScanRequest getStopScanRequest() {
                SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> singleFieldBuilderV3 = this.stopScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopScanRequest) singleFieldBuilderV3.getMessage();
                }
                StopScanRequest stopScanRequest = this.stopScanRequest_;
                return stopScanRequest == null ? StopScanRequest.getDefaultInstance() : stopScanRequest;
            }

            public StopScanRequest.Builder getStopScanRequestBuilder() {
                this.bitField0_ |= 32768;
                onChanged();
                return (StopScanRequest.Builder) getStopScanRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StopScanRequestOrBuilder getStopScanRequestOrBuilder() {
                SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> singleFieldBuilderV3 = this.stopScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopScanRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopScanRequest stopScanRequest = this.stopScanRequest_;
                return stopScanRequest == null ? StopScanRequest.getDefaultInstance() : stopScanRequest;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StopScanResponse getStopScanResponse() {
                SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> singleFieldBuilderV3 = this.stopScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopScanResponse) singleFieldBuilderV3.getMessage();
                }
                StopScanResponse stopScanResponse = this.stopScanResponse_;
                return stopScanResponse == null ? StopScanResponse.getDefaultInstance() : stopScanResponse;
            }

            public StopScanResponse.Builder getStopScanResponseBuilder() {
                this.bitField0_ |= 65536;
                onChanged();
                return (StopScanResponse.Builder) getStopScanResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public StopScanResponseOrBuilder getStopScanResponseOrBuilder() {
                SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> singleFieldBuilderV3 = this.stopScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopScanResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopScanResponse stopScanResponse = this.stopScanResponse_;
                return stopScanResponse == null ? StopScanResponse.getDefaultInstance() : stopScanResponse;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasAccessoryConnectionNotification() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasAccessoryStatusRequest() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasAccessoryStatusResponse() {
                return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasCancelPairingRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasCancelPairingResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasPairedListRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasPairedListResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasPairingCommandNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasPairingCompleteNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasRemoteDeviceStatusNotification() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasRemovePairedDeviceRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasRemovePairedDeviceResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasScanResultsNotification() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasSetEnablePairedDeviceRequest() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasSetEnablePairedDeviceResponse() {
                return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasStartPairingRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasStartPairingResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasStartScanRequest() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasStartScanResponse() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasStopScanRequest() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.ServiceOrBuilder
            public boolean hasStopScanResponse() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasRemovePairedDeviceResponse() || getRemovePairedDeviceResponse().isInitialized();
            }

            public Builder mergeAccessoryConnectionNotification(AccessoryConnectionNotification accessoryConnectionNotification) {
                AccessoryConnectionNotification accessoryConnectionNotification2;
                SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.accessoryConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(accessoryConnectionNotification);
                } else if ((this.bitField0_ & 16384) == 0 || (accessoryConnectionNotification2 = this.accessoryConnectionNotification_) == null || accessoryConnectionNotification2 == AccessoryConnectionNotification.getDefaultInstance()) {
                    this.accessoryConnectionNotification_ = accessoryConnectionNotification;
                } else {
                    getAccessoryConnectionNotificationBuilder().mergeFrom(accessoryConnectionNotification);
                }
                if (this.accessoryConnectionNotification_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAccessoryStatusRequest(AccessoryStatusRequest accessoryStatusRequest) {
                AccessoryStatusRequest accessoryStatusRequest2;
                SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> singleFieldBuilderV3 = this.accessoryStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(accessoryStatusRequest);
                } else if ((this.bitField0_ & 524288) == 0 || (accessoryStatusRequest2 = this.accessoryStatusRequest_) == null || accessoryStatusRequest2 == AccessoryStatusRequest.getDefaultInstance()) {
                    this.accessoryStatusRequest_ = accessoryStatusRequest;
                } else {
                    getAccessoryStatusRequestBuilder().mergeFrom(accessoryStatusRequest);
                }
                if (this.accessoryStatusRequest_ != null) {
                    this.bitField0_ |= 524288;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAccessoryStatusResponse(AccessoryStatusResponse accessoryStatusResponse) {
                AccessoryStatusResponse accessoryStatusResponse2;
                SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> singleFieldBuilderV3 = this.accessoryStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(accessoryStatusResponse);
                } else if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0 || (accessoryStatusResponse2 = this.accessoryStatusResponse_) == null || accessoryStatusResponse2 == AccessoryStatusResponse.getDefaultInstance()) {
                    this.accessoryStatusResponse_ = accessoryStatusResponse;
                } else {
                    getAccessoryStatusResponseBuilder().mergeFrom(accessoryStatusResponse);
                }
                if (this.accessoryStatusResponse_ != null) {
                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCancelPairingRequest(CancelPairingRequest cancelPairingRequest) {
                CancelPairingRequest cancelPairingRequest2;
                SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> singleFieldBuilderV3 = this.cancelPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cancelPairingRequest);
                } else if ((this.bitField0_ & 64) == 0 || (cancelPairingRequest2 = this.cancelPairingRequest_) == null || cancelPairingRequest2 == CancelPairingRequest.getDefaultInstance()) {
                    this.cancelPairingRequest_ = cancelPairingRequest;
                } else {
                    getCancelPairingRequestBuilder().mergeFrom(cancelPairingRequest);
                }
                if (this.cancelPairingRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCancelPairingResponse(CancelPairingResponse cancelPairingResponse) {
                CancelPairingResponse cancelPairingResponse2;
                SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> singleFieldBuilderV3 = this.cancelPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cancelPairingResponse);
                } else if ((this.bitField0_ & 128) == 0 || (cancelPairingResponse2 = this.cancelPairingResponse_) == null || cancelPairingResponse2 == CancelPairingResponse.getDefaultInstance()) {
                    this.cancelPairingResponse_ = cancelPairingResponse;
                } else {
                    getCancelPairingResponseBuilder().mergeFrom(cancelPairingResponse);
                }
                if (this.cancelPairingResponse_ != null) {
                    this.bitField0_ |= 128;
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
                                    codedInputStream.readMessage(getPairedListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getPairedListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getRemovePairedDeviceRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getRemovePairedDeviceResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getStartPairingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getStartPairingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getCancelPairingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getCancelPairingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getPairingCommandNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getRemoteDeviceStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getPairingCompleteNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getStartScanRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getStartScanResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getScanResultsNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getAccessoryConnectionNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 130:
                                    codedInputStream.readMessage(getStopScanRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32768;
                                    continue;
                                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                    codedInputStream.readMessage(getStopScanResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 65536;
                                    continue;
                                case 146:
                                    codedInputStream.readMessage(getSetEnablePairedDeviceRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 131072;
                                    continue;
                                case 154:
                                    codedInputStream.readMessage(getSetEnablePairedDeviceResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                                    continue;
                                case 162:
                                    codedInputStream.readMessage(getAccessoryStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 524288;
                                    continue;
                                case 170:
                                    codedInputStream.readMessage(getAccessoryStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
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

            public Builder mergePairedListRequest(PairedListRequest pairedListRequest) {
                PairedListRequest pairedListRequest2;
                SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> singleFieldBuilderV3 = this.pairedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pairedListRequest);
                } else if ((this.bitField0_ & 1) == 0 || (pairedListRequest2 = this.pairedListRequest_) == null || pairedListRequest2 == PairedListRequest.getDefaultInstance()) {
                    this.pairedListRequest_ = pairedListRequest;
                } else {
                    getPairedListRequestBuilder().mergeFrom(pairedListRequest);
                }
                if (this.pairedListRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergePairedListResponse(PairedListResponse pairedListResponse) {
                PairedListResponse pairedListResponse2;
                SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> singleFieldBuilderV3 = this.pairedListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pairedListResponse);
                } else if ((this.bitField0_ & 2) == 0 || (pairedListResponse2 = this.pairedListResponse_) == null || pairedListResponse2 == PairedListResponse.getDefaultInstance()) {
                    this.pairedListResponse_ = pairedListResponse;
                } else {
                    getPairedListResponseBuilder().mergeFrom(pairedListResponse);
                }
                if (this.pairedListResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergePairingCommandNotification(PairingCommandNotification pairingCommandNotification) {
                PairingCommandNotification pairingCommandNotification2;
                SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCommandNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pairingCommandNotification);
                } else if ((this.bitField0_ & 256) == 0 || (pairingCommandNotification2 = this.pairingCommandNotification_) == null || pairingCommandNotification2 == PairingCommandNotification.getDefaultInstance()) {
                    this.pairingCommandNotification_ = pairingCommandNotification;
                } else {
                    getPairingCommandNotificationBuilder().mergeFrom(pairingCommandNotification);
                }
                if (this.pairingCommandNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergePairingCompleteNotification(PairingCompleteNotification pairingCompleteNotification) {
                PairingCompleteNotification pairingCompleteNotification2;
                SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pairingCompleteNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (pairingCompleteNotification2 = this.pairingCompleteNotification_) == null || pairingCompleteNotification2 == PairingCompleteNotification.getDefaultInstance()) {
                    this.pairingCompleteNotification_ = pairingCompleteNotification;
                } else {
                    getPairingCompleteNotificationBuilder().mergeFrom(pairingCompleteNotification);
                }
                if (this.pairingCompleteNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRemoteDeviceStatusNotification(PairingStatusNotification pairingStatusNotification) {
                PairingStatusNotification pairingStatusNotification2;
                SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pairingStatusNotification);
                } else if ((this.bitField0_ & 512) == 0 || (pairingStatusNotification2 = this.remoteDeviceStatusNotification_) == null || pairingStatusNotification2 == PairingStatusNotification.getDefaultInstance()) {
                    this.remoteDeviceStatusNotification_ = pairingStatusNotification;
                } else {
                    getRemoteDeviceStatusNotificationBuilder().mergeFrom(pairingStatusNotification);
                }
                if (this.remoteDeviceStatusNotification_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRemovePairedDeviceRequest(RemovePairedDeviceRequest removePairedDeviceRequest) {
                RemovePairedDeviceRequest removePairedDeviceRequest2;
                SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(removePairedDeviceRequest);
                } else if ((this.bitField0_ & 4) == 0 || (removePairedDeviceRequest2 = this.removePairedDeviceRequest_) == null || removePairedDeviceRequest2 == RemovePairedDeviceRequest.getDefaultInstance()) {
                    this.removePairedDeviceRequest_ = removePairedDeviceRequest;
                } else {
                    getRemovePairedDeviceRequestBuilder().mergeFrom(removePairedDeviceRequest);
                }
                if (this.removePairedDeviceRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRemovePairedDeviceResponse(RemovePairedDeviceResponse removePairedDeviceResponse) {
                RemovePairedDeviceResponse removePairedDeviceResponse2;
                SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(removePairedDeviceResponse);
                } else if ((this.bitField0_ & 8) == 0 || (removePairedDeviceResponse2 = this.removePairedDeviceResponse_) == null || removePairedDeviceResponse2 == RemovePairedDeviceResponse.getDefaultInstance()) {
                    this.removePairedDeviceResponse_ = removePairedDeviceResponse;
                } else {
                    getRemovePairedDeviceResponseBuilder().mergeFrom(removePairedDeviceResponse);
                }
                if (this.removePairedDeviceResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeScanResultsNotification(ScanResultsNotification scanResultsNotification) {
                ScanResultsNotification scanResultsNotification2;
                SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> singleFieldBuilderV3 = this.scanResultsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scanResultsNotification);
                } else if ((this.bitField0_ & 8192) == 0 || (scanResultsNotification2 = this.scanResultsNotification_) == null || scanResultsNotification2 == ScanResultsNotification.getDefaultInstance()) {
                    this.scanResultsNotification_ = scanResultsNotification;
                } else {
                    getScanResultsNotificationBuilder().mergeFrom(scanResultsNotification);
                }
                if (this.scanResultsNotification_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetEnablePairedDeviceRequest(SetEnablePairedDeviceRequest setEnablePairedDeviceRequest) {
                SetEnablePairedDeviceRequest setEnablePairedDeviceRequest2;
                SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setEnablePairedDeviceRequest);
                } else if ((this.bitField0_ & 131072) == 0 || (setEnablePairedDeviceRequest2 = this.setEnablePairedDeviceRequest_) == null || setEnablePairedDeviceRequest2 == SetEnablePairedDeviceRequest.getDefaultInstance()) {
                    this.setEnablePairedDeviceRequest_ = setEnablePairedDeviceRequest;
                } else {
                    getSetEnablePairedDeviceRequestBuilder().mergeFrom(setEnablePairedDeviceRequest);
                }
                if (this.setEnablePairedDeviceRequest_ != null) {
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetEnablePairedDeviceResponse(SetEnablePairedDeviceResponse setEnablePairedDeviceResponse) {
                SetEnablePairedDeviceResponse setEnablePairedDeviceResponse2;
                SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setEnablePairedDeviceResponse);
                } else if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0 || (setEnablePairedDeviceResponse2 = this.setEnablePairedDeviceResponse_) == null || setEnablePairedDeviceResponse2 == SetEnablePairedDeviceResponse.getDefaultInstance()) {
                    this.setEnablePairedDeviceResponse_ = setEnablePairedDeviceResponse;
                } else {
                    getSetEnablePairedDeviceResponseBuilder().mergeFrom(setEnablePairedDeviceResponse);
                }
                if (this.setEnablePairedDeviceResponse_ != null) {
                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartPairingRequest(StartPairingRequest startPairingRequest) {
                StartPairingRequest startPairingRequest2;
                SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> singleFieldBuilderV3 = this.startPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startPairingRequest);
                } else if ((this.bitField0_ & 16) == 0 || (startPairingRequest2 = this.startPairingRequest_) == null || startPairingRequest2 == StartPairingRequest.getDefaultInstance()) {
                    this.startPairingRequest_ = startPairingRequest;
                } else {
                    getStartPairingRequestBuilder().mergeFrom(startPairingRequest);
                }
                if (this.startPairingRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartPairingResponse(StartPairingResponse startPairingResponse) {
                StartPairingResponse startPairingResponse2;
                SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> singleFieldBuilderV3 = this.startPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startPairingResponse);
                } else if ((this.bitField0_ & 32) == 0 || (startPairingResponse2 = this.startPairingResponse_) == null || startPairingResponse2 == StartPairingResponse.getDefaultInstance()) {
                    this.startPairingResponse_ = startPairingResponse;
                } else {
                    getStartPairingResponseBuilder().mergeFrom(startPairingResponse);
                }
                if (this.startPairingResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartScanRequest(StartScanRequest startScanRequest) {
                StartScanRequest startScanRequest2;
                SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> singleFieldBuilderV3 = this.startScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startScanRequest);
                } else if ((this.bitField0_ & 2048) == 0 || (startScanRequest2 = this.startScanRequest_) == null || startScanRequest2 == StartScanRequest.getDefaultInstance()) {
                    this.startScanRequest_ = startScanRequest;
                } else {
                    getStartScanRequestBuilder().mergeFrom(startScanRequest);
                }
                if (this.startScanRequest_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartScanResponse(StartScanResponse startScanResponse) {
                StartScanResponse startScanResponse2;
                SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> singleFieldBuilderV3 = this.startScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startScanResponse);
                } else if ((this.bitField0_ & 4096) == 0 || (startScanResponse2 = this.startScanResponse_) == null || startScanResponse2 == StartScanResponse.getDefaultInstance()) {
                    this.startScanResponse_ = startScanResponse;
                } else {
                    getStartScanResponseBuilder().mergeFrom(startScanResponse);
                }
                if (this.startScanResponse_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStopScanRequest(StopScanRequest stopScanRequest) {
                StopScanRequest stopScanRequest2;
                SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> singleFieldBuilderV3 = this.stopScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopScanRequest);
                } else if ((this.bitField0_ & 32768) == 0 || (stopScanRequest2 = this.stopScanRequest_) == null || stopScanRequest2 == StopScanRequest.getDefaultInstance()) {
                    this.stopScanRequest_ = stopScanRequest;
                } else {
                    getStopScanRequestBuilder().mergeFrom(stopScanRequest);
                }
                if (this.stopScanRequest_ != null) {
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStopScanResponse(StopScanResponse stopScanResponse) {
                StopScanResponse stopScanResponse2;
                SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> singleFieldBuilderV3 = this.stopScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopScanResponse);
                } else if ((this.bitField0_ & 65536) == 0 || (stopScanResponse2 = this.stopScanResponse_) == null || stopScanResponse2 == StopScanResponse.getDefaultInstance()) {
                    this.stopScanResponse_ = stopScanResponse;
                } else {
                    getStopScanResponseBuilder().mergeFrom(stopScanResponse);
                }
                if (this.stopScanResponse_ != null) {
                    this.bitField0_ |= 65536;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAccessoryConnectionNotification(AccessoryConnectionNotification.Builder builder) {
                SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.accessoryConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessoryConnectionNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setAccessoryStatusRequest(AccessoryStatusRequest.Builder builder) {
                SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> singleFieldBuilderV3 = this.accessoryStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessoryStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setAccessoryStatusResponse(AccessoryStatusResponse.Builder builder) {
                SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> singleFieldBuilderV3 = this.accessoryStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessoryStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setCancelPairingRequest(CancelPairingRequest.Builder builder) {
                SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> singleFieldBuilderV3 = this.cancelPairingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cancelPairingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCancelPairingResponse(CancelPairingResponse.Builder builder) {
                SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> singleFieldBuilderV3 = this.cancelPairingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cancelPairingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPairedListRequest(PairedListRequest.Builder builder) {
                SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> singleFieldBuilderV3 = this.pairedListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pairedListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPairedListResponse(PairedListResponse.Builder builder) {
                SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> singleFieldBuilderV3 = this.pairedListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pairedListResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPairingCommandNotification(PairingCommandNotification.Builder builder) {
                SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCommandNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pairingCommandNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setPairingCompleteNotification(PairingCompleteNotification.Builder builder) {
                SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pairingCompleteNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceStatusNotification(PairingStatusNotification.Builder builder) {
                SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.remoteDeviceStatusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setRemovePairedDeviceRequest(RemovePairedDeviceRequest.Builder builder) {
                SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.removePairedDeviceRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRemovePairedDeviceResponse(RemovePairedDeviceResponse.Builder builder) {
                SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.removePairedDeviceResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setScanResultsNotification(ScanResultsNotification.Builder builder) {
                SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> singleFieldBuilderV3 = this.scanResultsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.scanResultsNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setSetEnablePairedDeviceRequest(SetEnablePairedDeviceRequest.Builder builder) {
                SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setEnablePairedDeviceRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setSetEnablePairedDeviceResponse(SetEnablePairedDeviceResponse.Builder builder) {
                SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setEnablePairedDeviceResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setStartPairingRequest(StartPairingRequest.Builder builder) {
                SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> singleFieldBuilderV3 = this.startPairingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startPairingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStartPairingResponse(StartPairingResponse.Builder builder) {
                SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> singleFieldBuilderV3 = this.startPairingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startPairingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStartScanRequest(StartScanRequest.Builder builder) {
                SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> singleFieldBuilderV3 = this.startScanRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startScanRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setStartScanResponse(StartScanResponse.Builder builder) {
                SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> singleFieldBuilderV3 = this.startScanResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startScanResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setStopScanRequest(StopScanRequest.Builder builder) {
                SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> singleFieldBuilderV3 = this.stopScanRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stopScanRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setStopScanResponse(StopScanResponse.Builder builder) {
                SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> singleFieldBuilderV3 = this.stopScanResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stopScanResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
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

            public Builder setAccessoryConnectionNotification(AccessoryConnectionNotification accessoryConnectionNotification) {
                SingleFieldBuilderV3<AccessoryConnectionNotification, AccessoryConnectionNotification.Builder, AccessoryConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.accessoryConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    accessoryConnectionNotification.getClass();
                    this.accessoryConnectionNotification_ = accessoryConnectionNotification;
                } else {
                    singleFieldBuilderV3.setMessage(accessoryConnectionNotification);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setCancelPairingRequest(CancelPairingRequest cancelPairingRequest) {
                SingleFieldBuilderV3<CancelPairingRequest, CancelPairingRequest.Builder, CancelPairingRequestOrBuilder> singleFieldBuilderV3 = this.cancelPairingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cancelPairingRequest.getClass();
                    this.cancelPairingRequest_ = cancelPairingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(cancelPairingRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCancelPairingResponse(CancelPairingResponse cancelPairingResponse) {
                SingleFieldBuilderV3<CancelPairingResponse, CancelPairingResponse.Builder, CancelPairingResponseOrBuilder> singleFieldBuilderV3 = this.cancelPairingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cancelPairingResponse.getClass();
                    this.cancelPairingResponse_ = cancelPairingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(cancelPairingResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setPairedListRequest(PairedListRequest pairedListRequest) {
                SingleFieldBuilderV3<PairedListRequest, PairedListRequest.Builder, PairedListRequestOrBuilder> singleFieldBuilderV3 = this.pairedListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pairedListRequest.getClass();
                    this.pairedListRequest_ = pairedListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(pairedListRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPairedListResponse(PairedListResponse pairedListResponse) {
                SingleFieldBuilderV3<PairedListResponse, PairedListResponse.Builder, PairedListResponseOrBuilder> singleFieldBuilderV3 = this.pairedListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pairedListResponse.getClass();
                    this.pairedListResponse_ = pairedListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(pairedListResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPairingCommandNotification(PairingCommandNotification pairingCommandNotification) {
                SingleFieldBuilderV3<PairingCommandNotification, PairingCommandNotification.Builder, PairingCommandNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCommandNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pairingCommandNotification.getClass();
                    this.pairingCommandNotification_ = pairingCommandNotification;
                } else {
                    singleFieldBuilderV3.setMessage(pairingCommandNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setPairingCompleteNotification(PairingCompleteNotification pairingCompleteNotification) {
                SingleFieldBuilderV3<PairingCompleteNotification, PairingCompleteNotification.Builder, PairingCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.pairingCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pairingCompleteNotification.getClass();
                    this.pairingCompleteNotification_ = pairingCompleteNotification;
                } else {
                    singleFieldBuilderV3.setMessage(pairingCompleteNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setRemoteDeviceStatusNotification(PairingStatusNotification pairingStatusNotification) {
                SingleFieldBuilderV3<PairingStatusNotification, PairingStatusNotification.Builder, PairingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.remoteDeviceStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pairingStatusNotification.getClass();
                    this.remoteDeviceStatusNotification_ = pairingStatusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(pairingStatusNotification);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setRemovePairedDeviceRequest(RemovePairedDeviceRequest removePairedDeviceRequest) {
                SingleFieldBuilderV3<RemovePairedDeviceRequest, RemovePairedDeviceRequest.Builder, RemovePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    removePairedDeviceRequest.getClass();
                    this.removePairedDeviceRequest_ = removePairedDeviceRequest;
                } else {
                    singleFieldBuilderV3.setMessage(removePairedDeviceRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRemovePairedDeviceResponse(RemovePairedDeviceResponse removePairedDeviceResponse) {
                SingleFieldBuilderV3<RemovePairedDeviceResponse, RemovePairedDeviceResponse.Builder, RemovePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.removePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    removePairedDeviceResponse.getClass();
                    this.removePairedDeviceResponse_ = removePairedDeviceResponse;
                } else {
                    singleFieldBuilderV3.setMessage(removePairedDeviceResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setScanResultsNotification(ScanResultsNotification scanResultsNotification) {
                SingleFieldBuilderV3<ScanResultsNotification, ScanResultsNotification.Builder, ScanResultsNotificationOrBuilder> singleFieldBuilderV3 = this.scanResultsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scanResultsNotification.getClass();
                    this.scanResultsNotification_ = scanResultsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(scanResultsNotification);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setStartPairingRequest(StartPairingRequest startPairingRequest) {
                SingleFieldBuilderV3<StartPairingRequest, StartPairingRequest.Builder, StartPairingRequestOrBuilder> singleFieldBuilderV3 = this.startPairingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startPairingRequest.getClass();
                    this.startPairingRequest_ = startPairingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(startPairingRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStartPairingResponse(StartPairingResponse startPairingResponse) {
                SingleFieldBuilderV3<StartPairingResponse, StartPairingResponse.Builder, StartPairingResponseOrBuilder> singleFieldBuilderV3 = this.startPairingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startPairingResponse.getClass();
                    this.startPairingResponse_ = startPairingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(startPairingResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStartScanRequest(StartScanRequest startScanRequest) {
                SingleFieldBuilderV3<StartScanRequest, StartScanRequest.Builder, StartScanRequestOrBuilder> singleFieldBuilderV3 = this.startScanRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startScanRequest.getClass();
                    this.startScanRequest_ = startScanRequest;
                } else {
                    singleFieldBuilderV3.setMessage(startScanRequest);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setStartScanResponse(StartScanResponse startScanResponse) {
                SingleFieldBuilderV3<StartScanResponse, StartScanResponse.Builder, StartScanResponseOrBuilder> singleFieldBuilderV3 = this.startScanResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startScanResponse.getClass();
                    this.startScanResponse_ = startScanResponse;
                } else {
                    singleFieldBuilderV3.setMessage(startScanResponse);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setAccessoryStatusRequest(AccessoryStatusRequest accessoryStatusRequest) {
                SingleFieldBuilderV3<AccessoryStatusRequest, AccessoryStatusRequest.Builder, AccessoryStatusRequestOrBuilder> singleFieldBuilderV3 = this.accessoryStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    accessoryStatusRequest.getClass();
                    this.accessoryStatusRequest_ = accessoryStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(accessoryStatusRequest);
                }
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setAccessoryStatusResponse(AccessoryStatusResponse accessoryStatusResponse) {
                SingleFieldBuilderV3<AccessoryStatusResponse, AccessoryStatusResponse.Builder, AccessoryStatusResponseOrBuilder> singleFieldBuilderV3 = this.accessoryStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    accessoryStatusResponse.getClass();
                    this.accessoryStatusResponse_ = accessoryStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(accessoryStatusResponse);
                }
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setSetEnablePairedDeviceRequest(SetEnablePairedDeviceRequest setEnablePairedDeviceRequest) {
                SingleFieldBuilderV3<SetEnablePairedDeviceRequest, SetEnablePairedDeviceRequest.Builder, SetEnablePairedDeviceRequestOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setEnablePairedDeviceRequest.getClass();
                    this.setEnablePairedDeviceRequest_ = setEnablePairedDeviceRequest;
                } else {
                    singleFieldBuilderV3.setMessage(setEnablePairedDeviceRequest);
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setSetEnablePairedDeviceResponse(SetEnablePairedDeviceResponse setEnablePairedDeviceResponse) {
                SingleFieldBuilderV3<SetEnablePairedDeviceResponse, SetEnablePairedDeviceResponse.Builder, SetEnablePairedDeviceResponseOrBuilder> singleFieldBuilderV3 = this.setEnablePairedDeviceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setEnablePairedDeviceResponse.getClass();
                    this.setEnablePairedDeviceResponse_ = setEnablePairedDeviceResponse;
                } else {
                    singleFieldBuilderV3.setMessage(setEnablePairedDeviceResponse);
                }
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setStopScanResponse(StopScanResponse stopScanResponse) {
                SingleFieldBuilderV3<StopScanResponse, StopScanResponse.Builder, StopScanResponseOrBuilder> singleFieldBuilderV3 = this.stopScanResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopScanResponse.getClass();
                    this.stopScanResponse_ = stopScanResponse;
                } else {
                    singleFieldBuilderV3.setMessage(stopScanResponse);
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setStopScanRequest(StopScanRequest stopScanRequest) {
                SingleFieldBuilderV3<StopScanRequest, StopScanRequest.Builder, StopScanRequestOrBuilder> singleFieldBuilderV3 = this.stopScanRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopScanRequest.getClass();
                    this.stopScanRequest_ = stopScanRequest;
                } else {
                    singleFieldBuilderV3.setMessage(stopScanRequest);
                }
                this.bitField0_ |= 32768;
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
                if (service.hasPairedListRequest()) {
                    mergePairedListRequest(service.getPairedListRequest());
                }
                if (service.hasPairedListResponse()) {
                    mergePairedListResponse(service.getPairedListResponse());
                }
                if (service.hasRemovePairedDeviceRequest()) {
                    mergeRemovePairedDeviceRequest(service.getRemovePairedDeviceRequest());
                }
                if (service.hasRemovePairedDeviceResponse()) {
                    mergeRemovePairedDeviceResponse(service.getRemovePairedDeviceResponse());
                }
                if (service.hasStartPairingRequest()) {
                    mergeStartPairingRequest(service.getStartPairingRequest());
                }
                if (service.hasStartPairingResponse()) {
                    mergeStartPairingResponse(service.getStartPairingResponse());
                }
                if (service.hasCancelPairingRequest()) {
                    mergeCancelPairingRequest(service.getCancelPairingRequest());
                }
                if (service.hasCancelPairingResponse()) {
                    mergeCancelPairingResponse(service.getCancelPairingResponse());
                }
                if (service.hasPairingCommandNotification()) {
                    mergePairingCommandNotification(service.getPairingCommandNotification());
                }
                if (service.hasRemoteDeviceStatusNotification()) {
                    mergeRemoteDeviceStatusNotification(service.getRemoteDeviceStatusNotification());
                }
                if (service.hasPairingCompleteNotification()) {
                    mergePairingCompleteNotification(service.getPairingCompleteNotification());
                }
                if (service.hasStartScanRequest()) {
                    mergeStartScanRequest(service.getStartScanRequest());
                }
                if (service.hasStartScanResponse()) {
                    mergeStartScanResponse(service.getStartScanResponse());
                }
                if (service.hasScanResultsNotification()) {
                    mergeScanResultsNotification(service.getScanResultsNotification());
                }
                if (service.hasAccessoryConnectionNotification()) {
                    mergeAccessoryConnectionNotification(service.getAccessoryConnectionNotification());
                }
                if (service.hasStopScanRequest()) {
                    mergeStopScanRequest(service.getStopScanRequest());
                }
                if (service.hasStopScanResponse()) {
                    mergeStopScanResponse(service.getStopScanResponse());
                }
                if (service.hasSetEnablePairedDeviceRequest()) {
                    mergeSetEnablePairedDeviceRequest(service.getSetEnablePairedDeviceRequest());
                }
                if (service.hasSetEnablePairedDeviceResponse()) {
                    mergeSetEnablePairedDeviceResponse(service.getSetEnablePairedDeviceResponse());
                }
                if (service.hasAccessoryStatusRequest()) {
                    mergeAccessoryStatusRequest(service.getAccessoryStatusRequest());
                }
                if (service.hasAccessoryStatusResponse()) {
                    mergeAccessoryStatusResponse(service.getAccessoryStatusResponse());
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

    public static final class SetEnablePairedDeviceRequest extends GeneratedMessageV3 implements SetEnablePairedDeviceRequestOrBuilder {
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAC_ADDRESS_FIELD_NUMBER = 2;
        public static final int UNIT_ID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enabled_;
        private MacAddress macAddress_;
        private byte memoizedIsInitialized;
        private int unitId_;
        private static final SetEnablePairedDeviceRequest DEFAULT_INSTANCE = new SetEnablePairedDeviceRequest();

        @Deprecated
        public static final Parser<SetEnablePairedDeviceRequest> PARSER = new AbstractParser<SetEnablePairedDeviceRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequest.1
            @Override // com.google.protobuf.Parser
            public SetEnablePairedDeviceRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetEnablePairedDeviceRequest.newBuilder();
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

        private SetEnablePairedDeviceRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.enabled_ = false;
            this.unitId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetEnablePairedDeviceRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_descriptor;
        }

        public static Builder newBuilder(SetEnablePairedDeviceRequest setEnablePairedDeviceRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setEnablePairedDeviceRequest);
        }

        public static SetEnablePairedDeviceRequest parseDelimitedFrom(InputStream inputStream) {
            return (SetEnablePairedDeviceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetEnablePairedDeviceRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetEnablePairedDeviceRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetEnablePairedDeviceRequest)) {
                return super.equals(obj);
            }
            SetEnablePairedDeviceRequest setEnablePairedDeviceRequest = (SetEnablePairedDeviceRequest) obj;
            if (hasEnabled() != setEnablePairedDeviceRequest.hasEnabled()) {
                return false;
            }
            if ((hasEnabled() && getEnabled() != setEnablePairedDeviceRequest.getEnabled()) || hasMacAddress() != setEnablePairedDeviceRequest.hasMacAddress()) {
                return false;
            }
            if ((!hasMacAddress() || getMacAddress().equals(setEnablePairedDeviceRequest.getMacAddress())) && hasUnitId() == setEnablePairedDeviceRequest.hasUnitId()) {
                return (!hasUnitId() || getUnitId() == setEnablePairedDeviceRequest.getUnitId()) && getUnknownFields().equals(setEnablePairedDeviceRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
        public MacAddress getMacAddress() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
        public MacAddressOrBuilder getMacAddressOrBuilder() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetEnablePairedDeviceRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.enabled_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(2, getMacAddress());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(3, this.unitId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
        public int getUnitId() {
            return this.unitId_;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
        public boolean hasMacAddress() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
        public boolean hasUnitId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getEnabled());
            }
            if (hasMacAddress()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMacAddress().hashCode();
            }
            if (hasUnitId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getUnitId();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetEnablePairedDeviceRequest.class, Builder.class);
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
            return new SetEnablePairedDeviceRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.enabled_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getMacAddress());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.unitId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetEnablePairedDeviceRequestOrBuilder {
            private int bitField0_;
            private boolean enabled_;
            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> macAddressBuilder_;
            private MacAddress macAddress_;
            private int unitId_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SetEnablePairedDeviceRequest setEnablePairedDeviceRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    setEnablePairedDeviceRequest.enabled_ = this.enabled_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                    setEnablePairedDeviceRequest.macAddress_ = singleFieldBuilderV3 == null ? this.macAddress_ : (MacAddress) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    setEnablePairedDeviceRequest.unitId_ = this.unitId_;
                    i14 |= 4;
                }
                setEnablePairedDeviceRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_descriptor;
            }

            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> getMacAddressFieldBuilder() {
                if (this.macAddressBuilder_ == null) {
                    this.macAddressBuilder_ = new SingleFieldBuilderV3<>(getMacAddress(), getParentForChildren(), isClean());
                    this.macAddress_ = null;
                }
                return this.macAddressBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMacAddressFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetEnablePairedDeviceRequest build() {
                SetEnablePairedDeviceRequest setEnablePairedDeviceRequestBuildPartial = buildPartial();
                if (setEnablePairedDeviceRequestBuildPartial.isInitialized()) {
                    return setEnablePairedDeviceRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setEnablePairedDeviceRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetEnablePairedDeviceRequest buildPartial() {
                SetEnablePairedDeviceRequest setEnablePairedDeviceRequest = new SetEnablePairedDeviceRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setEnablePairedDeviceRequest);
                }
                onBuilt();
                return setEnablePairedDeviceRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.enabled_ = false;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
                this.unitId_ = 0;
                return this;
            }

            public Builder clearEnabled() {
                this.bitField0_ &= -2;
                this.enabled_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAddress() {
                this.bitField0_ &= -3;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearUnitId() {
                this.bitField0_ &= -5;
                this.unitId_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
            public MacAddress getMacAddress() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddress) singleFieldBuilderV3.getMessage();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            public MacAddress.Builder getMacAddressBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (MacAddress.Builder) getMacAddressFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
            public MacAddressOrBuilder getMacAddressOrBuilder() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddressOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
            public int getUnitId() {
                return this.unitId_;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
            public boolean hasMacAddress() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceRequestOrBuilder
            public boolean hasUnitId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetEnablePairedDeviceRequest.class, Builder.class);
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
                                    this.enabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getMacAddressFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.unitId_ = codedInputStream.readUInt32();
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

            public Builder mergeMacAddress(MacAddress macAddress) {
                MacAddress macAddress2;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(macAddress);
                } else if ((this.bitField0_ & 2) == 0 || (macAddress2 = this.macAddress_) == null || macAddress2 == MacAddress.getDefaultInstance()) {
                    this.macAddress_ = macAddress;
                } else {
                    getMacAddressBuilder().mergeFrom(macAddress);
                }
                if (this.macAddress_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEnabled(boolean z14) {
                this.enabled_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMacAddress(MacAddress.Builder builder) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.macAddress_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setUnitId(int i14) {
                this.unitId_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SetEnablePairedDeviceRequest getDefaultInstanceForType() {
                return SetEnablePairedDeviceRequest.getDefaultInstance();
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

            public Builder setMacAddress(MacAddress macAddress) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    macAddress.getClass();
                    this.macAddress_ = macAddress;
                } else {
                    singleFieldBuilderV3.setMessage(macAddress);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetEnablePairedDeviceRequest) {
                    return mergeFrom((SetEnablePairedDeviceRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetEnablePairedDeviceRequest setEnablePairedDeviceRequest) {
                if (setEnablePairedDeviceRequest == SetEnablePairedDeviceRequest.getDefaultInstance()) {
                    return this;
                }
                if (setEnablePairedDeviceRequest.hasEnabled()) {
                    setEnabled(setEnablePairedDeviceRequest.getEnabled());
                }
                if (setEnablePairedDeviceRequest.hasMacAddress()) {
                    mergeMacAddress(setEnablePairedDeviceRequest.getMacAddress());
                }
                if (setEnablePairedDeviceRequest.hasUnitId()) {
                    setUnitId(setEnablePairedDeviceRequest.getUnitId());
                }
                mergeUnknownFields(setEnablePairedDeviceRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetEnablePairedDeviceRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetEnablePairedDeviceRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEnablePairedDeviceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetEnablePairedDeviceRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetEnablePairedDeviceRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetEnablePairedDeviceRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ SetEnablePairedDeviceRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SetEnablePairedDeviceRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private SetEnablePairedDeviceRequest() {
            this.enabled_ = false;
            this.unitId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetEnablePairedDeviceRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetEnablePairedDeviceRequest parseFrom(InputStream inputStream) {
            return (SetEnablePairedDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetEnablePairedDeviceRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEnablePairedDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetEnablePairedDeviceRequest parseFrom(CodedInputStream codedInputStream) {
            return (SetEnablePairedDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetEnablePairedDeviceRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEnablePairedDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetEnablePairedDeviceResponse extends GeneratedMessageV3 implements SetEnablePairedDeviceResponseOrBuilder {
        private static final SetEnablePairedDeviceResponse DEFAULT_INSTANCE = new SetEnablePairedDeviceResponse();

        @Deprecated
        public static final Parser<SetEnablePairedDeviceResponse> PARSER = new AbstractParser<SetEnablePairedDeviceResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceResponse.1
            @Override // com.google.protobuf.Parser
            public SetEnablePairedDeviceResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetEnablePairedDeviceResponse.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private SetEnablePairedDeviceResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetEnablePairedDeviceResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_descriptor;
        }

        public static Builder newBuilder(SetEnablePairedDeviceResponse setEnablePairedDeviceResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setEnablePairedDeviceResponse);
        }

        public static SetEnablePairedDeviceResponse parseDelimitedFrom(InputStream inputStream) {
            return (SetEnablePairedDeviceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetEnablePairedDeviceResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetEnablePairedDeviceResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetEnablePairedDeviceResponse)) {
                return super.equals(obj);
            }
            SetEnablePairedDeviceResponse setEnablePairedDeviceResponse = (SetEnablePairedDeviceResponse) obj;
            if (hasResult() != setEnablePairedDeviceResponse.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == setEnablePairedDeviceResponse.result_) && getUnknownFields().equals(setEnablePairedDeviceResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetEnablePairedDeviceResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceResponseOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.FAIL : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetEnablePairedDeviceResponse.class, Builder.class);
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
            return new SetEnablePairedDeviceResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetEnablePairedDeviceResponseOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(SetEnablePairedDeviceResponse setEnablePairedDeviceResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setEnablePairedDeviceResponse.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                setEnablePairedDeviceResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetEnablePairedDeviceResponse build() {
                SetEnablePairedDeviceResponse setEnablePairedDeviceResponseBuildPartial = buildPartial();
                if (setEnablePairedDeviceResponseBuildPartial.isInitialized()) {
                    return setEnablePairedDeviceResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setEnablePairedDeviceResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetEnablePairedDeviceResponse buildPartial() {
                SetEnablePairedDeviceResponse setEnablePairedDeviceResponse = new SetEnablePairedDeviceResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setEnablePairedDeviceResponse);
                }
                onBuilt();
                return setEnablePairedDeviceResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceResponseOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.FAIL : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_SetEnablePairedDeviceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetEnablePairedDeviceResponse.class, Builder.class);
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
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 1;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SetEnablePairedDeviceResponse getDefaultInstanceForType() {
                return SetEnablePairedDeviceResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetEnablePairedDeviceResponse) {
                    return mergeFrom((SetEnablePairedDeviceResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetEnablePairedDeviceResponse setEnablePairedDeviceResponse) {
                if (setEnablePairedDeviceResponse == SetEnablePairedDeviceResponse.getDefaultInstance()) {
                    return this;
                }
                if (setEnablePairedDeviceResponse.hasResult()) {
                    setResult(setEnablePairedDeviceResponse.getResult());
                }
                mergeUnknownFields(setEnablePairedDeviceResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetEnablePairedDeviceResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetEnablePairedDeviceResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEnablePairedDeviceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetEnablePairedDeviceResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SetEnablePairedDeviceResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SetEnablePairedDeviceResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SetEnablePairedDeviceResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetEnablePairedDeviceResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetEnablePairedDeviceResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetEnablePairedDeviceResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetEnablePairedDeviceResponse parseFrom(InputStream inputStream) {
            return (SetEnablePairedDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetEnablePairedDeviceResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEnablePairedDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetEnablePairedDeviceResponse parseFrom(CodedInputStream codedInputStream) {
            return (SetEnablePairedDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetEnablePairedDeviceResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEnablePairedDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            FAIL(0),
            SUCCESS(1);

            public static final int FAIL_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.SetEnablePairedDeviceResponse.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SetEnablePairedDeviceResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class StartPairingRequest extends GeneratedMessageV3 implements StartPairingRequestOrBuilder {
        public static final int MAC_ADDRESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private MacAddress macAddress_;
        private byte memoizedIsInitialized;
        private static final StartPairingRequest DEFAULT_INSTANCE = new StartPairingRequest();

        @Deprecated
        public static final Parser<StartPairingRequest> PARSER = new AbstractParser<StartPairingRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingRequest.1
            @Override // com.google.protobuf.Parser
            public StartPairingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartPairingRequest.newBuilder();
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

        private StartPairingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartPairingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_descriptor;
        }

        public static Builder newBuilder(StartPairingRequest startPairingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startPairingRequest);
        }

        public static StartPairingRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartPairingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartPairingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartPairingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartPairingRequest)) {
                return super.equals(obj);
            }
            StartPairingRequest startPairingRequest = (StartPairingRequest) obj;
            if (hasMacAddress() != startPairingRequest.hasMacAddress()) {
                return false;
            }
            return (!hasMacAddress() || getMacAddress().equals(startPairingRequest.getMacAddress())) && getUnknownFields().equals(startPairingRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingRequestOrBuilder
        public MacAddress getMacAddress() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingRequestOrBuilder
        public MacAddressOrBuilder getMacAddressOrBuilder() {
            MacAddress macAddress = this.macAddress_;
            return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartPairingRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMacAddress()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingRequestOrBuilder
        public boolean hasMacAddress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMacAddress()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMacAddress().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartPairingRequest.class, Builder.class);
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
            return new StartPairingRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getMacAddress());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartPairingRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> macAddressBuilder_;
            private MacAddress macAddress_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StartPairingRequest startPairingRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                    startPairingRequest.macAddress_ = singleFieldBuilderV3 == null ? this.macAddress_ : (MacAddress) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                startPairingRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_descriptor;
            }

            private SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> getMacAddressFieldBuilder() {
                if (this.macAddressBuilder_ == null) {
                    this.macAddressBuilder_ = new SingleFieldBuilderV3<>(getMacAddress(), getParentForChildren(), isClean());
                    this.macAddress_ = null;
                }
                return this.macAddressBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMacAddressFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartPairingRequest build() {
                StartPairingRequest startPairingRequestBuildPartial = buildPartial();
                if (startPairingRequestBuildPartial.isInitialized()) {
                    return startPairingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startPairingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartPairingRequest buildPartial() {
                StartPairingRequest startPairingRequest = new StartPairingRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startPairingRequest);
                }
                onBuilt();
                return startPairingRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAddress() {
                this.bitField0_ &= -2;
                this.macAddress_ = null;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.macAddressBuilder_ = null;
                }
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingRequestOrBuilder
            public MacAddress getMacAddress() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddress) singleFieldBuilderV3.getMessage();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            public MacAddress.Builder getMacAddressBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (MacAddress.Builder) getMacAddressFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingRequestOrBuilder
            public MacAddressOrBuilder getMacAddressOrBuilder() {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MacAddressOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MacAddress macAddress = this.macAddress_;
                return macAddress == null ? MacAddress.getDefaultInstance() : macAddress;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingRequestOrBuilder
            public boolean hasMacAddress() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartPairingRequest.class, Builder.class);
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getMacAddressFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeMacAddress(MacAddress macAddress) {
                MacAddress macAddress2;
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(macAddress);
                } else if ((this.bitField0_ & 1) == 0 || (macAddress2 = this.macAddress_) == null || macAddress2 == MacAddress.getDefaultInstance()) {
                    this.macAddress_ = macAddress;
                } else {
                    getMacAddressBuilder().mergeFrom(macAddress);
                }
                if (this.macAddress_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
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

            public Builder setMacAddress(MacAddress.Builder builder) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.macAddress_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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
            public StartPairingRequest getDefaultInstanceForType() {
                return StartPairingRequest.getDefaultInstance();
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

            public Builder setMacAddress(MacAddress macAddress) {
                SingleFieldBuilderV3<MacAddress, MacAddress.Builder, MacAddressOrBuilder> singleFieldBuilderV3 = this.macAddressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    macAddress.getClass();
                    this.macAddress_ = macAddress;
                } else {
                    singleFieldBuilderV3.setMessage(macAddress);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartPairingRequest) {
                    return mergeFrom((StartPairingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartPairingRequest startPairingRequest) {
                if (startPairingRequest == StartPairingRequest.getDefaultInstance()) {
                    return this;
                }
                if (startPairingRequest.hasMacAddress()) {
                    mergeMacAddress(startPairingRequest.getMacAddress());
                }
                mergeUnknownFields(startPairingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartPairingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StartPairingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StartPairingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartPairingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartPairingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartPairingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StartPairingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartPairingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartPairingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartPairingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartPairingRequest parseFrom(InputStream inputStream) {
            return (StartPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartPairingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartPairingRequest parseFrom(CodedInputStream codedInputStream) {
            return (StartPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartPairingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartPairingResponse extends GeneratedMessageV3 implements StartPairingResponseOrBuilder {
        private static final StartPairingResponse DEFAULT_INSTANCE = new StartPairingResponse();

        @Deprecated
        public static final Parser<StartPairingResponse> PARSER = new AbstractParser<StartPairingResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingResponse.1
            @Override // com.google.protobuf.Parser
            public StartPairingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartPairingResponse.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private StartPairingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartPairingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_descriptor;
        }

        public static Builder newBuilder(StartPairingResponse startPairingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startPairingResponse);
        }

        public static StartPairingResponse parseDelimitedFrom(InputStream inputStream) {
            return (StartPairingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartPairingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartPairingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartPairingResponse)) {
                return super.equals(obj);
            }
            StartPairingResponse startPairingResponse = (StartPairingResponse) obj;
            if (hasResult() != startPairingResponse.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == startPairingResponse.result_) && getUnknownFields().equals(startPairingResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartPairingResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingResponseOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.FAIL_OTHER : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartPairingResponse.class, Builder.class);
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
            return new StartPairingResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartPairingResponseOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(StartPairingResponse startPairingResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    startPairingResponse.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                startPairingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartPairingResponse build() {
                StartPairingResponse startPairingResponseBuildPartial = buildPartial();
                if (startPairingResponseBuildPartial.isInitialized()) {
                    return startPairingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startPairingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartPairingResponse buildPartial() {
                StartPairingResponse startPairingResponse = new StartPairingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startPairingResponse);
                }
                onBuilt();
                return startPairingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingResponseOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.FAIL_OTHER : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartPairingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartPairingResponse.class, Builder.class);
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
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 1;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StartPairingResponse getDefaultInstanceForType() {
                return StartPairingResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartPairingResponse) {
                    return mergeFrom((StartPairingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartPairingResponse startPairingResponse) {
                if (startPairingResponse == StartPairingResponse.getDefaultInstance()) {
                    return this;
                }
                if (startPairingResponse.hasResult()) {
                    setResult(startPairingResponse.getResult());
                }
                mergeUnknownFields(startPairingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartPairingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartPairingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartPairingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartPairingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StartPairingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartPairingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StartPairingResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartPairingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartPairingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartPairingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartPairingResponse parseFrom(InputStream inputStream) {
            return (StartPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartPairingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartPairingResponse parseFrom(CodedInputStream codedInputStream) {
            return (StartPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartPairingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            FAIL_OTHER(0),
            SUCCESS(1),
            FAIL_INVALID_PARAMETER(2),
            FAIL_TOO_MANY_PAIRED_DEVICES(3);

            public static final int FAIL_INVALID_PARAMETER_VALUE = 2;
            public static final int FAIL_OTHER_VALUE = 0;
            public static final int FAIL_TOO_MANY_PAIRED_DEVICES_VALUE = 3;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StartPairingResponse.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL_OTHER;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 == 2) {
                    return FAIL_INVALID_PARAMETER;
                }
                if (i14 != 3) {
                    return null;
                }
                return FAIL_TOO_MANY_PAIRED_DEVICES;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StartPairingResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class StartScanRequest extends GeneratedMessageV3 implements StartScanRequestOrBuilder {
        private static final StartScanRequest DEFAULT_INSTANCE = new StartScanRequest();

        @Deprecated
        public static final Parser<StartScanRequest> PARSER = new AbstractParser<StartScanRequest>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanRequest.1
            @Override // com.google.protobuf.Parser
            public StartScanRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartScanRequest.newBuilder();
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
        public static final int SENSOR_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int sensorType_;

        private StartScanRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sensorType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartScanRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_descriptor;
        }

        public static Builder newBuilder(StartScanRequest startScanRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startScanRequest);
        }

        public static StartScanRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartScanRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartScanRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartScanRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartScanRequest)) {
                return super.equals(obj);
            }
            StartScanRequest startScanRequest = (StartScanRequest) obj;
            if (hasSensorType() != startScanRequest.hasSensorType()) {
                return false;
            }
            return (!hasSensorType() || this.sensorType_ == startScanRequest.sensorType_) && getUnknownFields().equals(startScanRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartScanRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanRequestOrBuilder
        public SensorType getSensorType() {
            SensorType sensorTypeForNumber = SensorType.forNumber(this.sensorType_);
            return sensorTypeForNumber == null ? SensorType.NOT_SUPPORTED : sensorTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.sensorType_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanRequestOrBuilder
        public boolean hasSensorType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSensorType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.sensorType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartScanRequest.class, Builder.class);
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
            return new StartScanRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.sensorType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartScanRequestOrBuilder {
            private int bitField0_;
            private int sensorType_;

            private Builder() {
                this.sensorType_ = 0;
            }

            private void buildPartial0(StartScanRequest startScanRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    startScanRequest.sensorType_ = this.sensorType_;
                } else {
                    i14 = 0;
                }
                startScanRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartScanRequest build() {
                StartScanRequest startScanRequestBuildPartial = buildPartial();
                if (startScanRequestBuildPartial.isInitialized()) {
                    return startScanRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startScanRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartScanRequest buildPartial() {
                StartScanRequest startScanRequest = new StartScanRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startScanRequest);
                }
                onBuilt();
                return startScanRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sensorType_ = 0;
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

            public Builder clearSensorType() {
                this.bitField0_ &= -2;
                this.sensorType_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanRequestOrBuilder
            public SensorType getSensorType() {
                SensorType sensorTypeForNumber = SensorType.forNumber(this.sensorType_);
                return sensorTypeForNumber == null ? SensorType.NOT_SUPPORTED : sensorTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanRequestOrBuilder
            public boolean hasSensorType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartScanRequest.class, Builder.class);
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
                                    if (SensorType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.sensorType_ = i14;
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

            public Builder setSensorType(SensorType sensorType) {
                sensorType.getClass();
                this.bitField0_ |= 1;
                this.sensorType_ = sensorType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StartScanRequest getDefaultInstanceForType() {
                return StartScanRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sensorType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartScanRequest) {
                    return mergeFrom((StartScanRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartScanRequest startScanRequest) {
                if (startScanRequest == StartScanRequest.getDefaultInstance()) {
                    return this;
                }
                if (startScanRequest.hasSensorType()) {
                    setSensorType(startScanRequest.getSensorType());
                }
                mergeUnknownFields(startScanRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartScanRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartScanRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartScanRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartScanRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StartScanRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartScanRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StartScanRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.sensorType_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartScanRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartScanRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartScanRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartScanRequest parseFrom(InputStream inputStream) {
            return (StartScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartScanRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartScanRequest parseFrom(CodedInputStream codedInputStream) {
            return (StartScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartScanRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartScanResponse extends GeneratedMessageV3 implements StartScanResponseOrBuilder {
        private static final StartScanResponse DEFAULT_INSTANCE = new StartScanResponse();

        @Deprecated
        public static final Parser<StartScanResponse> PARSER = new AbstractParser<StartScanResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanResponse.1
            @Override // com.google.protobuf.Parser
            public StartScanResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartScanResponse.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private StartScanResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartScanResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_descriptor;
        }

        public static Builder newBuilder(StartScanResponse startScanResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startScanResponse);
        }

        public static StartScanResponse parseDelimitedFrom(InputStream inputStream) {
            return (StartScanResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartScanResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartScanResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartScanResponse)) {
                return super.equals(obj);
            }
            StartScanResponse startScanResponse = (StartScanResponse) obj;
            if (hasResult() != startScanResponse.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == startScanResponse.result_) && getUnknownFields().equals(startScanResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartScanResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanResponseOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.FAIL : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartScanResponse.class, Builder.class);
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
            return new StartScanResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartScanResponseOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(StartScanResponse startScanResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    startScanResponse.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                startScanResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartScanResponse build() {
                StartScanResponse startScanResponseBuildPartial = buildPartial();
                if (startScanResponseBuildPartial.isInitialized()) {
                    return startScanResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startScanResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartScanResponse buildPartial() {
                StartScanResponse startScanResponse = new StartScanResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startScanResponse);
                }
                onBuilt();
                return startScanResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanResponseOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.FAIL : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StartScanResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartScanResponse.class, Builder.class);
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
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 1;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StartScanResponse getDefaultInstanceForType() {
                return StartScanResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartScanResponse) {
                    return mergeFrom((StartScanResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartScanResponse startScanResponse) {
                if (startScanResponse == StartScanResponse.getDefaultInstance()) {
                    return this;
                }
                if (startScanResponse.hasResult()) {
                    setResult(startScanResponse.getResult());
                }
                mergeUnknownFields(startScanResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartScanResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartScanResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartScanResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartScanResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StartScanResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartScanResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StartScanResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartScanResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartScanResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartScanResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartScanResponse parseFrom(InputStream inputStream) {
            return (StartScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartScanResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartScanResponse parseFrom(CodedInputStream codedInputStream) {
            return (StartScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartScanResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            FAIL(0),
            SUCCESS(1);

            public static final int FAIL_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StartScanResponse.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StartScanResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class StopScanResponse extends GeneratedMessageV3 implements StopScanResponseOrBuilder {
        private static final StopScanResponse DEFAULT_INSTANCE = new StopScanResponse();

        @Deprecated
        public static final Parser<StopScanResponse> PARSER = new AbstractParser<StopScanResponse>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StopScanResponse.1
            @Override // com.google.protobuf.Parser
            public StopScanResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopScanResponse.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private StopScanResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopScanResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_descriptor;
        }

        public static Builder newBuilder(StopScanResponse stopScanResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopScanResponse);
        }

        public static StopScanResponse parseDelimitedFrom(InputStream inputStream) {
            return (StopScanResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopScanResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopScanResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StopScanResponse)) {
                return super.equals(obj);
            }
            StopScanResponse stopScanResponse = (StopScanResponse) obj;
            if (hasResult() != stopScanResponse.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == stopScanResponse.result_) && getUnknownFields().equals(stopScanResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopScanResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StopScanResponseOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.FAIL : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StopScanResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StopScanResponse.class, Builder.class);
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
            return new StopScanResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopScanResponseOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(StopScanResponse stopScanResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stopScanResponse.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                stopScanResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopScanResponse build() {
                StopScanResponse stopScanResponseBuildPartial = buildPartial();
                if (stopScanResponseBuildPartial.isInitialized()) {
                    return stopScanResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopScanResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopScanResponse buildPartial() {
                StopScanResponse stopScanResponse = new StopScanResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stopScanResponse);
                }
                onBuilt();
                return stopScanResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StopScanResponseOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.FAIL : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRemoteDeviceManagement.StopScanResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRemoteDeviceManagement.internal_static_GDI_Proto_RemoteDeviceManagement_StopScanResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StopScanResponse.class, Builder.class);
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
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 1;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StopScanResponse getDefaultInstanceForType() {
                return StopScanResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StopScanResponse) {
                    return mergeFrom((StopScanResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StopScanResponse stopScanResponse) {
                if (stopScanResponse == StopScanResponse.getDefaultInstance()) {
                    return this;
                }
                if (stopScanResponse.hasResult()) {
                    setResult(stopScanResponse.getResult());
                }
                mergeUnknownFields(stopScanResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopScanResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StopScanResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopScanResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopScanResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StopScanResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StopScanResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StopScanResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopScanResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopScanResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopScanResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopScanResponse parseFrom(InputStream inputStream) {
            return (StopScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopScanResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopScanResponse parseFrom(CodedInputStream codedInputStream) {
            return (StopScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopScanResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            FAIL(0),
            SUCCESS(1);

            public static final int FAIL_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.StopScanResponse.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return FAIL;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StopScanResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum SensorType implements ProtocolMessageEnum {
        NOT_SUPPORTED(0),
        ALL(1),
        HEART_RATE(2),
        XCEL_STRENGTH_SENSOR(3),
        XCEL_STRENGTH_CRADLE(4);

        public static final int ALL_VALUE = 1;
        public static final int HEART_RATE_VALUE = 2;
        public static final int NOT_SUPPORTED_VALUE = 0;
        public static final int XCEL_STRENGTH_CRADLE_VALUE = 4;
        public static final int XCEL_STRENGTH_SENSOR_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<SensorType> internalValueMap = new Internal.EnumLiteMap<SensorType>() { // from class: com.garmin.proto.generated.GDIRemoteDeviceManagement.SensorType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SensorType findValueByNumber(int i14) {
                return SensorType.forNumber(i14);
            }
        };
        private static final SensorType[] VALUES = values();

        SensorType(int i14) {
            this.value = i14;
        }

        public static SensorType forNumber(int i14) {
            if (i14 == 0) {
                return NOT_SUPPORTED;
            }
            if (i14 == 1) {
                return ALL;
            }
            if (i14 == 2) {
                return HEART_RATE;
            }
            if (i14 == 3) {
                return XCEL_STRENGTH_SENSOR;
            }
            if (i14 != 4) {
                return null;
            }
            return XCEL_STRENGTH_CRADLE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIRemoteDeviceManagement.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<SensorType> internalGetValueMap() {
            return internalValueMap;
        }

        public static SensorType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SensorType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
