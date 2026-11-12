package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDICore {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rGDICore.proto\u0012\u000eGDI.Proto.Core\u001a\u0012GDIDataTypes.proto\"ß\n\n\u000bCoreService\u00121\n\fsync_request\u0018\u0001 \u0001(\u000b2\u001b.GDI.Proto.Core.SyncRequest\u00123\n\rsync_response\u0018\u0002 \u0001(\u000b2\u001c.GDI.Proto.Core.SyncResponse\u0012@\n\u0014get_location_request\u0018\u0003 \u0001(\u000b2\".GDI.Proto.Core.GetLocationRequest\u0012B\n\u0015get_location_response\u0018\u0004 \u0001(\u000b2#.GDI.Proto.Core.GetLocationResponse\u0012^\n$location_updated_set_enabled_request\u0018\u0005 \u0001(\u000b20.GDI.Proto.Core.LocationUpdatedSetEnabledRequest\u0012`\n%location_updated_set_enabled_response\u0018\u0006 \u0001(\u000b21.GDI.Proto.Core.LocationUpdatedSetEnabledResponse\u0012R\n\u001dlocation_updated_notification\u0018\u0007 \u0001(\u000b2+.GDI.Proto.Core.LocationUpdatedNotification\u0012P\n\u001cfeature_capabilities_request\u0018\b \u0001(\u000b2*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0012R\n\u001dfeature_capabilities_response\u0018\t \u0001(\u000b2+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0012Q\n\u001dgarmin_guid_overwrite_request\u0018\n \u0001(\u000b2*.GDI.Proto.Core.GarminGuidOverwriteRequest\u0012S\n\u001egarmin_guid_overwrite_response\u0018\u000b \u0001(\u000b2+.GDI.Proto.Core.GarminGuidOverwriteResponse\u0012@\n\u0014dual_pairing_request\u0018\f \u0001(\u000b2\".GDI.Proto.Core.DualPairingRequest\u0012B\n\u0015dual_pairing_response\u0018\r \u0001(\u000b2#.GDI.Proto.Core.DualPairingResponse\u0012R\n\u001dconnection_ready_notification\u0018\u000e \u0001(\u000b2+.GDI.Proto.Core.ConnectionReadyNotification\u0012S\n\u001echeck_pending_software_request\u0018\u000f \u0001(\u000b2+.GDI.Proto.Core.CheckPendingSoftwareRequest\u0012U\n\u001fcheck_pending_software_response\u0018\u0010 \u0001(\u000b2,.GDI.Proto.Core.CheckPendingSoftwareResponse\u0012:\n\u0011time_sync_request\u0018\u0011 \u0001(\u000b2\u001f.GDI.Proto.Core.TimeSyncRequest\u0012<\n\u0012time_sync_response\u0018\u0012 \u0001(\u000b2 .GDI.Proto.Core.TimeSyncResponse\"á\u0001\n\u001bLocationCapabilitiesRequest\u0012P\n\u001cnotification_disabled_reason\u0018\u0001 \u0001(\u000e2*.GDI.Proto.Core.NotificationDisabledReason2p\n\u000flocation_update\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u0012 \u0001(\u000b2+.GDI.Proto.Core.LocationCapabilitiesRequest\"Þ\u0003\n\fLocationData\u0012.\n\bposition\u0018\u0001 \u0001(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\u0012\u0010\n\baltitude\u0018\u0002 \u0001(\u0002\u0012\u0011\n\ttimestamp\u0018\u0003 \u0001(\r\u0012\u001b\n\u0013horizontal_accuracy\u0018\u0004 \u0001(\u0002\u0012\u0019\n\u0011vertical_accuracy\u0018\u0005 \u0001(\u0002\u00127\n\bdatatype\u0018\u0006 \u0001(\u000e2%.GDI.Proto.Core.LocationData.DataType\u0012/\n\fsession_uuid\u0018\u0007 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u00120\n\u0007gps_fix\u0018\b \u0001(\u000e2\u001f.GDI.Proto.DataTypes.GPSFixType\u0012\u000e\n\u0006course\u0018\t \u0001(\u0002\u0012\r\n\u0005speed\u0018\n \u0001(\u0002\"{\n\bDataType\u0012\u0018\n\u0014SIGNIFICANT_LOCATION\u0010\u0000\u0012\u0014\n\u0010GENERAL_LOCATION\u0010\u0001\u0012\u0015\n\u0011REALTIME_TRACKING\u0010\u0002\u0012\u0014\n\u0010INREACH_TRACKING\u0010\u0003\u0012\u0012\n\u000eTRACKING_EVENT\u0010\u0004*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0090\u0001\n\u0012GetLocationRequest\u0012N\n\frequest_type\u0018\u0001 \u0001(\u000e2..GDI.Proto.Core.GetLocationRequest.RequestType:\bSTANDARD\"*\n\u000bRequestType\u0012\f\n\bSTANDARD\u0010\u0000\u0012\r\n\tEMERGENCY\u0010\u0001\"\u0087\u0002\n\u0013GetLocationResponse\u0012:\n\u0006status\u0018\u0001 \u0002(\u000e2*.GDI.Proto.Core.GetLocationResponse.Status\u00123\n\rlocation_data\u0018\u0002 \u0001(\u000b2\u001c.GDI.Proto.Core.LocationData\"\u007f\n\u0006Status\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0015\n\u0011NO_VALID_LOCATION\u0010\u0002\u0012!\n\u001dLOCATION_SERVICES_UNAVAILABLE\u0010\u0003\u0012\u001e\n\u001aLOCATION_SERVICES_DISABLED\u0010\u0004\u0012\u0013\n\u000fTRY_AGAIN_LATER\u0010\u0005\"þ\u0001\n LocationUpdatedSetEnabledRequest\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\u0012J\n\brequests\u0018\u0002 \u0003(\u000b28.GDI.Proto.Core.LocationUpdatedSetEnabledRequest.Request\u001a}\n\u0007Request\u00128\n\trequested\u0018\u0001 \u0001(\u000e2%.GDI.Proto.Core.LocationData.DataType\u0012\u001c\n\u0014min_update_threshold\u0018\u0002 \u0001(\r\u0012\u001a\n\u0012distance_threshold\u0018\u0003 \u0001(\u0002\"Û\u0003\n!LocationUpdatedSetEnabledResponse\u0012H\n\u0006status\u0018\u0001 \u0002(\u000e28.GDI.Proto.Core.LocationUpdatedSetEnabledResponse.Status\u0012Q\n\brequests\u0018\u0002 \u0003(\u000b2?.GDI.Proto.Core.LocationUpdatedSetEnabledResponse.RequestStatus\u001aó\u0001\n\rRequestStatus\u00128\n\trequested\u0018\u0001 \u0001(\u000e2%.GDI.Proto.Core.LocationData.DataType\u0012V\n\u0006status\u0018\u0002 \u0001(\u000e2F.GDI.Proto.Core.LocationUpdatedSetEnabledResponse.RequestStatus.Status\"P\n\u0006Status\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rNOT_AVAILABLE\u0010\u0002\u0012\u0018\n\u0014UNSUPPORTED_CRITERIA\u0010\u0003\u0012\u0011\n\rGENERIC_ERROR\u0010\u0004\"#\n\u0006Status\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rNOT_AVAILABLE\u0010\u0002\"R\n\u001bLocationUpdatedNotification\u00123\n\rlocation_data\u0018\u0001 \u0003(\u000b2\u001c.GDI.Proto.Core.LocationData\"1\n\u000bSyncRequest\u0012\"\n\u0013use_this_connection\u0018\u0001 \u0001(\b:\u0005false\"\u009d\u0001\n\fSyncResponse\u0012;\n\u0006status\u0018\u0001 \u0002(\u000e2+.GDI.Proto.Core.SyncResponse.ResponseStatus\"P\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0019\n\u0015BUSY_WITH_ANOTHER_APP\u0010\u0002\"s\n\u001aFeatureCapabilitiesRequest\u0012\u0013\n\u000bgarmin_guid\u0018\u0001 \u0001(\f\u0012\u0016\n\u000eclient_version\u0018\u0002 \u0001(\r\u0012\u0014\n\fdisplay_name\u0018\u0003 \u0001(\t*\u0004\b\n\u0010\u000b*\u0004\b\u000b\u0010-*\u0006\bé\u0007\u0010ê\u0007\"Á\u0001\n\u001bFeatureCapabilitiesResponse\u0012K\n\u000bguid_status\u0018\u0001 \u0001(\u000e26.GDI.Proto.Core.FeatureCapabilitiesResponse.GuidStatus\u0012\u000f\n\u0007version\u0018\u0002 \u0001(\r\"0\n\nGuidStatus\u0012\t\n\u0005UNSET\u0010\u0000\u0012\t\n\u0005MATCH\u0010\u0001\u0012\f\n\bNO_MATCH\u0010\u0002*\u0004\b\n\u0010\u000b*\u0004\b\u000b\u0010-*\u0006\bé\u0007\u0010ê\u0007\"1\n\u001aGarminGuidOverwriteRequest\u0012\u0013\n\u000bgarmin_guid\u0018\u0001 \u0001(\f\"\u009a\u0001\n\u001bGarminGuidOverwriteResponse\u0012J\n\u0006status\u0018\u0001 \u0002(\u000e2:.GDI.Proto.Core.GarminGuidOverwriteResponse.ResponseStatus\"/\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\b\n\u0004FAIL\u0010\u0002\"\u008f\u0001\n\u0012DualPairingRequest\u0012U\n\frequest_type\u0018\u0001 \u0001(\u000e2..GDI.Proto.Core.DualPairingRequest.RequestType:\u000fPAIR_BT_CLASSIC\"\"\n\u000bRequestType\u0012\u0013\n\u000fPAIR_BT_CLASSIC\u0010\u0000\"\u0094\u0001\n\u0013DualPairingResponse\u0012B\n\u0006status\u0018\u0001 \u0002(\u000e22.GDI.Proto.Core.DualPairingResponse.ResponseStatus\"9\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0012\n\u000eUNABLE_TO_PAIR\u0010\u0002\"\u001d\n\u001bConnectionReadyNotification\";\n\u001bCheckPendingSoftwareRequest\u0012\u001c\n\rapply_updates\u0018\u0001 \u0002(\b:\u0005false\"Í\u0001\n\u001cCheckPendingSoftwareResponse\u0012O\n\u0006status\u0018\u0001 \u0002(\u000e23.GDI.Proto.Core.CheckPendingSoftwareResponse.Status:\nNO_UPDATES\u0012\u0017\n\u000fpending_version\u0018\u0002 \u0001(\r\"C\n\u0006Status\u0012\u000e\n\nNO_UPDATES\u0010\u0000\u0012\u0013\n\u000fPENDING_UPDATES\u0010\u0001\u0012\u0014\n\u0010APPLYING_UPDATES\u0010\u0002\"\u0011\n\u000fTimeSyncRequest\"(\n\u0010TimeSyncResponse\u0012\u0014\n\fcurrent_time\u0018\u0001 \u0001(\u0004*j\n\u001aNotificationDisabledReason\u0012\u0019\n\u0015LOW_RAM_MOBILE_DEVICE\u0010\u0001\u0012\u001a\n\u0016PERMISSION_NOT_GRANTED\u0010\u0002\u0012\u0015\n\u0011SERVICE_NOT_BOUND\u0010\u0003B'\n\u001acom.garmin.proto.generatedB\u0007GDICoreH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_ConnectionReadyNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_ConnectionReadyNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_CoreService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_CoreService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_DualPairingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_DualPairingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_DualPairingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_DualPairingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_GetLocationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_GetLocationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_GetLocationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_GetLocationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_LocationData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_LocationData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_LocationUpdatedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_LocationUpdatedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_SyncRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_SyncRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_SyncResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_SyncResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_TimeSyncRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_TimeSyncRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Core_TimeSyncResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Core_TimeSyncResponse_fieldAccessorTable;

    public interface CheckPendingSoftwareRequestOrBuilder extends MessageOrBuilder {
        boolean getApplyUpdates();

        boolean hasApplyUpdates();
    }

    public interface CheckPendingSoftwareResponseOrBuilder extends MessageOrBuilder {
        int getPendingVersion();

        CheckPendingSoftwareResponse.Status getStatus();

        boolean hasPendingVersion();

        boolean hasStatus();
    }

    public interface ConnectionReadyNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface CoreServiceOrBuilder extends MessageOrBuilder {
        CheckPendingSoftwareRequest getCheckPendingSoftwareRequest();

        CheckPendingSoftwareRequestOrBuilder getCheckPendingSoftwareRequestOrBuilder();

        CheckPendingSoftwareResponse getCheckPendingSoftwareResponse();

        CheckPendingSoftwareResponseOrBuilder getCheckPendingSoftwareResponseOrBuilder();

        ConnectionReadyNotification getConnectionReadyNotification();

        ConnectionReadyNotificationOrBuilder getConnectionReadyNotificationOrBuilder();

        DualPairingRequest getDualPairingRequest();

        DualPairingRequestOrBuilder getDualPairingRequestOrBuilder();

        DualPairingResponse getDualPairingResponse();

        DualPairingResponseOrBuilder getDualPairingResponseOrBuilder();

        FeatureCapabilitiesRequest getFeatureCapabilitiesRequest();

        FeatureCapabilitiesRequestOrBuilder getFeatureCapabilitiesRequestOrBuilder();

        FeatureCapabilitiesResponse getFeatureCapabilitiesResponse();

        FeatureCapabilitiesResponseOrBuilder getFeatureCapabilitiesResponseOrBuilder();

        GarminGuidOverwriteRequest getGarminGuidOverwriteRequest();

        GarminGuidOverwriteRequestOrBuilder getGarminGuidOverwriteRequestOrBuilder();

        GarminGuidOverwriteResponse getGarminGuidOverwriteResponse();

        GarminGuidOverwriteResponseOrBuilder getGarminGuidOverwriteResponseOrBuilder();

        GetLocationRequest getGetLocationRequest();

        GetLocationRequestOrBuilder getGetLocationRequestOrBuilder();

        GetLocationResponse getGetLocationResponse();

        GetLocationResponseOrBuilder getGetLocationResponseOrBuilder();

        LocationUpdatedNotification getLocationUpdatedNotification();

        LocationUpdatedNotificationOrBuilder getLocationUpdatedNotificationOrBuilder();

        LocationUpdatedSetEnabledRequest getLocationUpdatedSetEnabledRequest();

        LocationUpdatedSetEnabledRequestOrBuilder getLocationUpdatedSetEnabledRequestOrBuilder();

        LocationUpdatedSetEnabledResponse getLocationUpdatedSetEnabledResponse();

        LocationUpdatedSetEnabledResponseOrBuilder getLocationUpdatedSetEnabledResponseOrBuilder();

        SyncRequest getSyncRequest();

        SyncRequestOrBuilder getSyncRequestOrBuilder();

        SyncResponse getSyncResponse();

        SyncResponseOrBuilder getSyncResponseOrBuilder();

        TimeSyncRequest getTimeSyncRequest();

        TimeSyncRequestOrBuilder getTimeSyncRequestOrBuilder();

        TimeSyncResponse getTimeSyncResponse();

        TimeSyncResponseOrBuilder getTimeSyncResponseOrBuilder();

        boolean hasCheckPendingSoftwareRequest();

        boolean hasCheckPendingSoftwareResponse();

        boolean hasConnectionReadyNotification();

        boolean hasDualPairingRequest();

        boolean hasDualPairingResponse();

        boolean hasFeatureCapabilitiesRequest();

        boolean hasFeatureCapabilitiesResponse();

        boolean hasGarminGuidOverwriteRequest();

        boolean hasGarminGuidOverwriteResponse();

        boolean hasGetLocationRequest();

        boolean hasGetLocationResponse();

        boolean hasLocationUpdatedNotification();

        boolean hasLocationUpdatedSetEnabledRequest();

        boolean hasLocationUpdatedSetEnabledResponse();

        boolean hasSyncRequest();

        boolean hasSyncResponse();

        boolean hasTimeSyncRequest();

        boolean hasTimeSyncResponse();
    }

    public interface DualPairingRequestOrBuilder extends MessageOrBuilder {
        DualPairingRequest.RequestType getRequestType();

        boolean hasRequestType();
    }

    public interface DualPairingResponseOrBuilder extends MessageOrBuilder {
        DualPairingResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface FeatureCapabilitiesRequestOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<FeatureCapabilitiesRequest> {
        int getClientVersion();

        String getDisplayName();

        ByteString getDisplayNameBytes();

        ByteString getGarminGuid();

        boolean hasClientVersion();

        boolean hasDisplayName();

        boolean hasGarminGuid();
    }

    public interface FeatureCapabilitiesResponseOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<FeatureCapabilitiesResponse> {
        FeatureCapabilitiesResponse.GuidStatus getGuidStatus();

        int getVersion();

        boolean hasGuidStatus();

        boolean hasVersion();
    }

    public interface GarminGuidOverwriteRequestOrBuilder extends MessageOrBuilder {
        ByteString getGarminGuid();

        boolean hasGarminGuid();
    }

    public interface GarminGuidOverwriteResponseOrBuilder extends MessageOrBuilder {
        GarminGuidOverwriteResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface GetLocationRequestOrBuilder extends MessageOrBuilder {
        GetLocationRequest.RequestType getRequestType();

        boolean hasRequestType();
    }

    public interface GetLocationResponseOrBuilder extends MessageOrBuilder {
        LocationData getLocationData();

        LocationDataOrBuilder getLocationDataOrBuilder();

        GetLocationResponse.Status getStatus();

        boolean hasLocationData();

        boolean hasStatus();
    }

    public interface LocationCapabilitiesRequestOrBuilder extends MessageOrBuilder {
        NotificationDisabledReason getNotificationDisabledReason();

        boolean hasNotificationDisabledReason();
    }

    public interface LocationDataOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<LocationData> {
        float getAltitude();

        float getCourse();

        LocationData.DataType getDatatype();

        GDIDataTypes.GPSFixType getGpsFix();

        float getHorizontalAccuracy();

        GDIDataTypes.ScPoint getPosition();

        GDIDataTypes.ScPointOrBuilder getPositionOrBuilder();

        GDIDataTypes.UUID getSessionUuid();

        GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder();

        float getSpeed();

        int getTimestamp();

        float getVerticalAccuracy();

        boolean hasAltitude();

        boolean hasCourse();

        boolean hasDatatype();

        boolean hasGpsFix();

        boolean hasHorizontalAccuracy();

        boolean hasPosition();

        boolean hasSessionUuid();

        boolean hasSpeed();

        boolean hasTimestamp();

        boolean hasVerticalAccuracy();
    }

    public interface LocationUpdatedNotificationOrBuilder extends MessageOrBuilder {
        LocationData getLocationData(int i14);

        int getLocationDataCount();

        List<LocationData> getLocationDataList();

        LocationDataOrBuilder getLocationDataOrBuilder(int i14);

        List<? extends LocationDataOrBuilder> getLocationDataOrBuilderList();
    }

    public interface LocationUpdatedSetEnabledRequestOrBuilder extends MessageOrBuilder {
        boolean getEnabled();

        LocationUpdatedSetEnabledRequest.Request getRequests(int i14);

        int getRequestsCount();

        List<LocationUpdatedSetEnabledRequest.Request> getRequestsList();

        LocationUpdatedSetEnabledRequest.RequestOrBuilder getRequestsOrBuilder(int i14);

        List<? extends LocationUpdatedSetEnabledRequest.RequestOrBuilder> getRequestsOrBuilderList();

        boolean hasEnabled();
    }

    public interface LocationUpdatedSetEnabledResponseOrBuilder extends MessageOrBuilder {
        LocationUpdatedSetEnabledResponse.RequestStatus getRequests(int i14);

        int getRequestsCount();

        List<LocationUpdatedSetEnabledResponse.RequestStatus> getRequestsList();

        LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder getRequestsOrBuilder(int i14);

        List<? extends LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder> getRequestsOrBuilderList();

        LocationUpdatedSetEnabledResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface SyncRequestOrBuilder extends MessageOrBuilder {
        boolean getUseThisConnection();

        boolean hasUseThisConnection();
    }

    public interface SyncResponseOrBuilder extends MessageOrBuilder {
        SyncResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface TimeSyncRequestOrBuilder extends MessageOrBuilder {
    }

    public interface TimeSyncResponseOrBuilder extends MessageOrBuilder {
        long getCurrentTime();

        boolean hasCurrentTime();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) f3.z(0);
        internal_static_GDI_Proto_Core_CoreService_descriptor = descriptor2;
        internal_static_GDI_Proto_Core_CoreService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SyncRequest", "SyncResponse", "GetLocationRequest", "GetLocationResponse", "LocationUpdatedSetEnabledRequest", "LocationUpdatedSetEnabledResponse", "LocationUpdatedNotification", "FeatureCapabilitiesRequest", "FeatureCapabilitiesResponse", "GarminGuidOverwriteRequest", "GarminGuidOverwriteResponse", "DualPairingRequest", "DualPairingResponse", "ConnectionReadyNotification", "CheckPendingSoftwareRequest", "CheckPendingSoftwareResponse", "TimeSyncRequest", "TimeSyncResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) f3.z(1);
        internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"NotificationDisabledReason"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) f3.z(2);
        internal_static_GDI_Proto_Core_LocationData_descriptor = descriptor4;
        internal_static_GDI_Proto_Core_LocationData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Position", "Altitude", "Timestamp", "HorizontalAccuracy", "VerticalAccuracy", "Datatype", "SessionUuid", "GpsFix", "Course", "Speed"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) f3.z(3);
        internal_static_GDI_Proto_Core_GetLocationRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_Core_GetLocationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"RequestType"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) f3.z(4);
        internal_static_GDI_Proto_Core_GetLocationResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_Core_GetLocationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status", "LocationData"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) f3.z(5);
        internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Enabled", "Requests"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_descriptor = descriptor8;
        internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Requested", "MinUpdateThreshold", "DistanceThreshold"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) f3.z(6);
        internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status", "Requests"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_descriptor = descriptor10;
        internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Requested", "Status"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) f3.z(7);
        internal_static_GDI_Proto_Core_LocationUpdatedNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_Core_LocationUpdatedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"LocationData"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) f3.z(8);
        internal_static_GDI_Proto_Core_SyncRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_Core_SyncRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"UseThisConnection"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) f3.z(9);
        internal_static_GDI_Proto_Core_SyncResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_Core_SyncResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Status"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) f3.z(10);
        internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"GarminGuid", "ClientVersion", "DisplayName"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) f3.z(11);
        internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"GuidStatus", "Version"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) f3.z(12);
        internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_descriptor = descriptor16;
        internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"GarminGuid"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) f3.z(13);
        internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_descriptor = descriptor17;
        internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Status"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) f3.z(14);
        internal_static_GDI_Proto_Core_DualPairingRequest_descriptor = descriptor18;
        internal_static_GDI_Proto_Core_DualPairingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"RequestType"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) f3.z(15);
        internal_static_GDI_Proto_Core_DualPairingResponse_descriptor = descriptor19;
        internal_static_GDI_Proto_Core_DualPairingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Status"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) f3.z(16);
        internal_static_GDI_Proto_Core_ConnectionReadyNotification_descriptor = descriptor20;
        internal_static_GDI_Proto_Core_ConnectionReadyNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[0]);
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) f3.z(17);
        internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_descriptor = descriptor21;
        internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"ApplyUpdates"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) f3.z(18);
        internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_descriptor = descriptor22;
        internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Status", "PendingVersion"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) f3.z(19);
        internal_static_GDI_Proto_Core_TimeSyncRequest_descriptor = descriptor23;
        internal_static_GDI_Proto_Core_TimeSyncRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[0]);
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) f3.z(20);
        internal_static_GDI_Proto_Core_TimeSyncResponse_descriptor = descriptor24;
        internal_static_GDI_Proto_Core_TimeSyncResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"CurrentTime"});
        GDIDataTypes.getDescriptor();
    }

    private GDICore() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(LocationCapabilitiesRequest.locationUpdate);
    }

    public static final class CheckPendingSoftwareRequest extends GeneratedMessageV3 implements CheckPendingSoftwareRequestOrBuilder {
        public static final int APPLY_UPDATES_FIELD_NUMBER = 1;
        private static final CheckPendingSoftwareRequest DEFAULT_INSTANCE = new CheckPendingSoftwareRequest();

        @Deprecated
        public static final Parser<CheckPendingSoftwareRequest> PARSER = new AbstractParser<CheckPendingSoftwareRequest>() { // from class: com.garmin.proto.generated.GDICore.CheckPendingSoftwareRequest.1
            @Override // com.google.protobuf.Parser
            public CheckPendingSoftwareRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CheckPendingSoftwareRequest.newBuilder();
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
        private boolean applyUpdates_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private CheckPendingSoftwareRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.applyUpdates_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckPendingSoftwareRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_descriptor;
        }

        public static Builder newBuilder(CheckPendingSoftwareRequest checkPendingSoftwareRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkPendingSoftwareRequest);
        }

        public static CheckPendingSoftwareRequest parseDelimitedFrom(InputStream inputStream) {
            return (CheckPendingSoftwareRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckPendingSoftwareRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CheckPendingSoftwareRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckPendingSoftwareRequest)) {
                return super.equals(obj);
            }
            CheckPendingSoftwareRequest checkPendingSoftwareRequest = (CheckPendingSoftwareRequest) obj;
            if (hasApplyUpdates() != checkPendingSoftwareRequest.hasApplyUpdates()) {
                return false;
            }
            return (!hasApplyUpdates() || getApplyUpdates() == checkPendingSoftwareRequest.getApplyUpdates()) && getUnknownFields().equals(checkPendingSoftwareRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareRequestOrBuilder
        public boolean getApplyUpdates() {
            return this.applyUpdates_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CheckPendingSoftwareRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.applyUpdates_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareRequestOrBuilder
        public boolean hasApplyUpdates() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasApplyUpdates()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getApplyUpdates());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckPendingSoftwareRequest.class, Builder.class);
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
            if (hasApplyUpdates()) {
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
            return new CheckPendingSoftwareRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.applyUpdates_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CheckPendingSoftwareRequestOrBuilder {
            private boolean applyUpdates_;
            private int bitField0_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CheckPendingSoftwareRequest checkPendingSoftwareRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    checkPendingSoftwareRequest.applyUpdates_ = this.applyUpdates_;
                } else {
                    i14 = 0;
                }
                checkPendingSoftwareRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckPendingSoftwareRequest build() {
                CheckPendingSoftwareRequest checkPendingSoftwareRequestBuildPartial = buildPartial();
                if (checkPendingSoftwareRequestBuildPartial.isInitialized()) {
                    return checkPendingSoftwareRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) checkPendingSoftwareRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckPendingSoftwareRequest buildPartial() {
                CheckPendingSoftwareRequest checkPendingSoftwareRequest = new CheckPendingSoftwareRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkPendingSoftwareRequest);
                }
                onBuilt();
                return checkPendingSoftwareRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.applyUpdates_ = false;
                return this;
            }

            public Builder clearApplyUpdates() {
                this.bitField0_ &= -2;
                this.applyUpdates_ = false;
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

            @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareRequestOrBuilder
            public boolean getApplyUpdates() {
                return this.applyUpdates_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareRequestOrBuilder
            public boolean hasApplyUpdates() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckPendingSoftwareRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasApplyUpdates();
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
                                    this.applyUpdates_ = codedInputStream.readBool();
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

            public Builder setApplyUpdates(boolean z14) {
                this.applyUpdates_ = z14;
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
            public CheckPendingSoftwareRequest getDefaultInstanceForType() {
                return CheckPendingSoftwareRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CheckPendingSoftwareRequest) {
                    return mergeFrom((CheckPendingSoftwareRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CheckPendingSoftwareRequest checkPendingSoftwareRequest) {
                if (checkPendingSoftwareRequest == CheckPendingSoftwareRequest.getDefaultInstance()) {
                    return this;
                }
                if (checkPendingSoftwareRequest.hasApplyUpdates()) {
                    setApplyUpdates(checkPendingSoftwareRequest.getApplyUpdates());
                }
                mergeUnknownFields(checkPendingSoftwareRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CheckPendingSoftwareRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CheckPendingSoftwareRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckPendingSoftwareRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckPendingSoftwareRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CheckPendingSoftwareRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CheckPendingSoftwareRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CheckPendingSoftwareRequest() {
            this.applyUpdates_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckPendingSoftwareRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CheckPendingSoftwareRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CheckPendingSoftwareRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CheckPendingSoftwareRequest parseFrom(InputStream inputStream) {
            return (CheckPendingSoftwareRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CheckPendingSoftwareRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckPendingSoftwareRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckPendingSoftwareRequest parseFrom(CodedInputStream codedInputStream) {
            return (CheckPendingSoftwareRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CheckPendingSoftwareRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckPendingSoftwareRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectionReadyNotification extends GeneratedMessageV3 implements ConnectionReadyNotificationOrBuilder {
        private static final ConnectionReadyNotification DEFAULT_INSTANCE = new ConnectionReadyNotification();

        @Deprecated
        public static final Parser<ConnectionReadyNotification> PARSER = new AbstractParser<ConnectionReadyNotification>() { // from class: com.garmin.proto.generated.GDICore.ConnectionReadyNotification.1
            @Override // com.google.protobuf.Parser
            public ConnectionReadyNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectionReadyNotification.newBuilder();
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

        private ConnectionReadyNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionReadyNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_ConnectionReadyNotification_descriptor;
        }

        public static Builder newBuilder(ConnectionReadyNotification connectionReadyNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionReadyNotification);
        }

        public static ConnectionReadyNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConnectionReadyNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionReadyNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectionReadyNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ConnectionReadyNotification) {
                return getUnknownFields().equals(((ConnectionReadyNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectionReadyNotification> getParserForType() {
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
            return GDICore.internal_static_GDI_Proto_Core_ConnectionReadyNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionReadyNotification.class, Builder.class);
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
            return new ConnectionReadyNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectionReadyNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_ConnectionReadyNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionReadyNotification build() {
                ConnectionReadyNotification connectionReadyNotificationBuildPartial = buildPartial();
                if (connectionReadyNotificationBuildPartial.isInitialized()) {
                    return connectionReadyNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionReadyNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionReadyNotification buildPartial() {
                ConnectionReadyNotification connectionReadyNotification = new ConnectionReadyNotification(this);
                onBuilt();
                return connectionReadyNotification;
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
                return GDICore.internal_static_GDI_Proto_Core_ConnectionReadyNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_ConnectionReadyNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionReadyNotification.class, Builder.class);
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
            public ConnectionReadyNotification getDefaultInstanceForType() {
                return ConnectionReadyNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionReadyNotification) {
                    return mergeFrom((ConnectionReadyNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionReadyNotification connectionReadyNotification) {
                if (connectionReadyNotification == ConnectionReadyNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(connectionReadyNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectionReadyNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConnectionReadyNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConnectionReadyNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionReadyNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionReadyNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionReadyNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectionReadyNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionReadyNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectionReadyNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectionReadyNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectionReadyNotification parseFrom(InputStream inputStream) {
            return (ConnectionReadyNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionReadyNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionReadyNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionReadyNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConnectionReadyNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectionReadyNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionReadyNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SyncRequest extends GeneratedMessageV3 implements SyncRequestOrBuilder {
        private static final SyncRequest DEFAULT_INSTANCE = new SyncRequest();

        @Deprecated
        public static final Parser<SyncRequest> PARSER = new AbstractParser<SyncRequest>() { // from class: com.garmin.proto.generated.GDICore.SyncRequest.1
            @Override // com.google.protobuf.Parser
            public SyncRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SyncRequest.newBuilder();
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
        public static final int USE_THIS_CONNECTION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean useThisConnection_;

        private SyncRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.useThisConnection_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_SyncRequest_descriptor;
        }

        public static Builder newBuilder(SyncRequest syncRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(syncRequest);
        }

        public static SyncRequest parseDelimitedFrom(InputStream inputStream) {
            return (SyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SyncRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SyncRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncRequest)) {
                return super.equals(obj);
            }
            SyncRequest syncRequest = (SyncRequest) obj;
            if (hasUseThisConnection() != syncRequest.hasUseThisConnection()) {
                return false;
            }
            return (!hasUseThisConnection() || getUseThisConnection() == syncRequest.getUseThisConnection()) && getUnknownFields().equals(syncRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.useThisConnection_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.SyncRequestOrBuilder
        public boolean getUseThisConnection() {
            return this.useThisConnection_;
        }

        @Override // com.garmin.proto.generated.GDICore.SyncRequestOrBuilder
        public boolean hasUseThisConnection() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUseThisConnection()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getUseThisConnection());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_SyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequest.class, Builder.class);
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
            return new SyncRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.useThisConnection_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncRequestOrBuilder {
            private int bitField0_;
            private boolean useThisConnection_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SyncRequest syncRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    syncRequest.useThisConnection_ = this.useThisConnection_;
                } else {
                    i14 = 0;
                }
                syncRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_SyncRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequest build() {
                SyncRequest syncRequestBuildPartial = buildPartial();
                if (syncRequestBuildPartial.isInitialized()) {
                    return syncRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) syncRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequest buildPartial() {
                SyncRequest syncRequest = new SyncRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(syncRequest);
                }
                onBuilt();
                return syncRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.useThisConnection_ = false;
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

            public Builder clearUseThisConnection() {
                this.bitField0_ &= -2;
                this.useThisConnection_ = false;
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
                return GDICore.internal_static_GDI_Proto_Core_SyncRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.SyncRequestOrBuilder
            public boolean getUseThisConnection() {
                return this.useThisConnection_;
            }

            @Override // com.garmin.proto.generated.GDICore.SyncRequestOrBuilder
            public boolean hasUseThisConnection() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_SyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequest.class, Builder.class);
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
                                    this.useThisConnection_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUseThisConnection(boolean z14) {
                this.useThisConnection_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
            public SyncRequest getDefaultInstanceForType() {
                return SyncRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SyncRequest) {
                    return mergeFrom((SyncRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SyncRequest syncRequest) {
                if (syncRequest == SyncRequest.getDefaultInstance()) {
                    return this;
                }
                if (syncRequest.hasUseThisConnection()) {
                    setUseThisConnection(syncRequest.getUseThisConnection());
                }
                mergeUnknownFields(syncRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SyncRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SyncRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SyncRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SyncRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SyncRequest() {
            this.useThisConnection_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SyncRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SyncRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(InputStream inputStream) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SyncRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(CodedInputStream codedInputStream) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TimeSyncRequest extends GeneratedMessageV3 implements TimeSyncRequestOrBuilder {
        private static final TimeSyncRequest DEFAULT_INSTANCE = new TimeSyncRequest();

        @Deprecated
        public static final Parser<TimeSyncRequest> PARSER = new AbstractParser<TimeSyncRequest>() { // from class: com.garmin.proto.generated.GDICore.TimeSyncRequest.1
            @Override // com.google.protobuf.Parser
            public TimeSyncRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TimeSyncRequest.newBuilder();
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

        private TimeSyncRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TimeSyncRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_TimeSyncRequest_descriptor;
        }

        public static Builder newBuilder(TimeSyncRequest timeSyncRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timeSyncRequest);
        }

        public static TimeSyncRequest parseDelimitedFrom(InputStream inputStream) {
            return (TimeSyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TimeSyncRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TimeSyncRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof TimeSyncRequest) {
                return getUnknownFields().equals(((TimeSyncRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TimeSyncRequest> getParserForType() {
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
            return GDICore.internal_static_GDI_Proto_Core_TimeSyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TimeSyncRequest.class, Builder.class);
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
            return new TimeSyncRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TimeSyncRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_TimeSyncRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TimeSyncRequest build() {
                TimeSyncRequest timeSyncRequestBuildPartial = buildPartial();
                if (timeSyncRequestBuildPartial.isInitialized()) {
                    return timeSyncRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) timeSyncRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TimeSyncRequest buildPartial() {
                TimeSyncRequest timeSyncRequest = new TimeSyncRequest(this);
                onBuilt();
                return timeSyncRequest;
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
                return GDICore.internal_static_GDI_Proto_Core_TimeSyncRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_TimeSyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TimeSyncRequest.class, Builder.class);
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
            public TimeSyncRequest getDefaultInstanceForType() {
                return TimeSyncRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TimeSyncRequest) {
                    return mergeFrom((TimeSyncRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TimeSyncRequest timeSyncRequest) {
                if (timeSyncRequest == TimeSyncRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(timeSyncRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TimeSyncRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TimeSyncRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TimeSyncRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TimeSyncRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeSyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TimeSyncRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TimeSyncRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TimeSyncRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TimeSyncRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TimeSyncRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TimeSyncRequest parseFrom(InputStream inputStream) {
            return (TimeSyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TimeSyncRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeSyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TimeSyncRequest parseFrom(CodedInputStream codedInputStream) {
            return (TimeSyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TimeSyncRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeSyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TimeSyncResponse extends GeneratedMessageV3 implements TimeSyncResponseOrBuilder {
        public static final int CURRENT_TIME_FIELD_NUMBER = 1;
        private static final TimeSyncResponse DEFAULT_INSTANCE = new TimeSyncResponse();

        @Deprecated
        public static final Parser<TimeSyncResponse> PARSER = new AbstractParser<TimeSyncResponse>() { // from class: com.garmin.proto.generated.GDICore.TimeSyncResponse.1
            @Override // com.google.protobuf.Parser
            public TimeSyncResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TimeSyncResponse.newBuilder();
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
        private long currentTime_;
        private byte memoizedIsInitialized;

        private TimeSyncResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.currentTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TimeSyncResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_TimeSyncResponse_descriptor;
        }

        public static Builder newBuilder(TimeSyncResponse timeSyncResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timeSyncResponse);
        }

        public static TimeSyncResponse parseDelimitedFrom(InputStream inputStream) {
            return (TimeSyncResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TimeSyncResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TimeSyncResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TimeSyncResponse)) {
                return super.equals(obj);
            }
            TimeSyncResponse timeSyncResponse = (TimeSyncResponse) obj;
            if (hasCurrentTime() != timeSyncResponse.hasCurrentTime()) {
                return false;
            }
            return (!hasCurrentTime() || getCurrentTime() == timeSyncResponse.getCurrentTime()) && getUnknownFields().equals(timeSyncResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICore.TimeSyncResponseOrBuilder
        public long getCurrentTime() {
            return this.currentTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TimeSyncResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.currentTime_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.TimeSyncResponseOrBuilder
        public boolean hasCurrentTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrentTime()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getCurrentTime());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_TimeSyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TimeSyncResponse.class, Builder.class);
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
            return new TimeSyncResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.currentTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TimeSyncResponseOrBuilder {
            private int bitField0_;
            private long currentTime_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(TimeSyncResponse timeSyncResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    timeSyncResponse.currentTime_ = this.currentTime_;
                } else {
                    i14 = 0;
                }
                timeSyncResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_TimeSyncResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TimeSyncResponse build() {
                TimeSyncResponse timeSyncResponseBuildPartial = buildPartial();
                if (timeSyncResponseBuildPartial.isInitialized()) {
                    return timeSyncResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) timeSyncResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TimeSyncResponse buildPartial() {
                TimeSyncResponse timeSyncResponse = new TimeSyncResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(timeSyncResponse);
                }
                onBuilt();
                return timeSyncResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.currentTime_ = 0L;
                return this;
            }

            public Builder clearCurrentTime() {
                this.bitField0_ &= -2;
                this.currentTime_ = 0L;
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

            @Override // com.garmin.proto.generated.GDICore.TimeSyncResponseOrBuilder
            public long getCurrentTime() {
                return this.currentTime_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICore.internal_static_GDI_Proto_Core_TimeSyncResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.TimeSyncResponseOrBuilder
            public boolean hasCurrentTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_TimeSyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TimeSyncResponse.class, Builder.class);
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
                                    this.currentTime_ = codedInputStream.readUInt64();
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

            public Builder setCurrentTime(long j8) {
                this.currentTime_ = j8;
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
            public TimeSyncResponse getDefaultInstanceForType() {
                return TimeSyncResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TimeSyncResponse) {
                    return mergeFrom((TimeSyncResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TimeSyncResponse timeSyncResponse) {
                if (timeSyncResponse == TimeSyncResponse.getDefaultInstance()) {
                    return this;
                }
                if (timeSyncResponse.hasCurrentTime()) {
                    setCurrentTime(timeSyncResponse.getCurrentTime());
                }
                mergeUnknownFields(timeSyncResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TimeSyncResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TimeSyncResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeSyncResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TimeSyncResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TimeSyncResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ TimeSyncResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TimeSyncResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private TimeSyncResponse() {
            this.currentTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TimeSyncResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TimeSyncResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TimeSyncResponse parseFrom(InputStream inputStream) {
            return (TimeSyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TimeSyncResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeSyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TimeSyncResponse parseFrom(CodedInputStream codedInputStream) {
            return (TimeSyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TimeSyncResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TimeSyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LocationUpdatedSetEnabledRequest extends GeneratedMessageV3 implements LocationUpdatedSetEnabledRequestOrBuilder {
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int REQUESTS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enabled_;
        private byte memoizedIsInitialized;
        private List<Request> requests_;
        private static final LocationUpdatedSetEnabledRequest DEFAULT_INSTANCE = new LocationUpdatedSetEnabledRequest();

        @Deprecated
        public static final Parser<LocationUpdatedSetEnabledRequest> PARSER = new AbstractParser<LocationUpdatedSetEnabledRequest>() { // from class: com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.1
            @Override // com.google.protobuf.Parser
            public LocationUpdatedSetEnabledRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LocationUpdatedSetEnabledRequest.newBuilder();
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

        public interface RequestOrBuilder extends MessageOrBuilder {
            float getDistanceThreshold();

            int getMinUpdateThreshold();

            LocationData.DataType getRequested();

            boolean hasDistanceThreshold();

            boolean hasMinUpdateThreshold();

            boolean hasRequested();
        }

        private LocationUpdatedSetEnabledRequest() {
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.requests_ = Collections.EMPTY_LIST;
        }

        public static LocationUpdatedSetEnabledRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_descriptor;
        }

        public static Builder newBuilder(LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(locationUpdatedSetEnabledRequest);
        }

        public static LocationUpdatedSetEnabledRequest parseDelimitedFrom(InputStream inputStream) {
            return (LocationUpdatedSetEnabledRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LocationUpdatedSetEnabledRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationUpdatedSetEnabledRequest)) {
                return super.equals(obj);
            }
            LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest = (LocationUpdatedSetEnabledRequest) obj;
            if (hasEnabled() != locationUpdatedSetEnabledRequest.hasEnabled()) {
                return false;
            }
            return (!hasEnabled() || getEnabled() == locationUpdatedSetEnabledRequest.getEnabled()) && getRequestsList().equals(locationUpdatedSetEnabledRequest.getRequestsList()) && getUnknownFields().equals(locationUpdatedSetEnabledRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LocationUpdatedSetEnabledRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
        public Request getRequests(int i14) {
            return this.requests_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
        public int getRequestsCount() {
            return this.requests_.size();
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
        public List<Request> getRequestsList() {
            return this.requests_;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
        public RequestOrBuilder getRequestsOrBuilder(int i14) {
            return this.requests_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
        public List<? extends RequestOrBuilder> getRequestsOrBuilderList() {
            return this.requests_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.enabled_) : 0;
            for (int i15 = 0; i15 < this.requests_.size(); i15++) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(2, this.requests_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
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
            if (getRequestsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRequestsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationUpdatedSetEnabledRequest.class, Builder.class);
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
            if (hasEnabled()) {
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
            return new LocationUpdatedSetEnabledRequest();
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
            for (int i14 = 0; i14 < this.requests_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.requests_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Request extends GeneratedMessageV3 implements RequestOrBuilder {
            public static final int DISTANCE_THRESHOLD_FIELD_NUMBER = 3;
            public static final int MIN_UPDATE_THRESHOLD_FIELD_NUMBER = 2;
            public static final int REQUESTED_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private float distanceThreshold_;
            private byte memoizedIsInitialized;
            private int minUpdateThreshold_;
            private int requested_;
            private static final Request DEFAULT_INSTANCE = new Request();

            @Deprecated
            public static final Parser<Request> PARSER = new AbstractParser<Request>() { // from class: com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.Request.1
                @Override // com.google.protobuf.Parser
                public Request parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = Request.newBuilder();
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

            private Request(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.requested_ = 0;
                this.minUpdateThreshold_ = 0;
                this.distanceThreshold_ = 0.0f;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Request getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_descriptor;
            }

            public static Builder newBuilder(Request request) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(request);
            }

            public static Request parseDelimitedFrom(InputStream inputStream) {
                return (Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Request parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<Request> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return super.equals(obj);
                }
                Request request = (Request) obj;
                if (hasRequested() != request.hasRequested()) {
                    return false;
                }
                if ((hasRequested() && this.requested_ != request.requested_) || hasMinUpdateThreshold() != request.hasMinUpdateThreshold()) {
                    return false;
                }
                if ((!hasMinUpdateThreshold() || getMinUpdateThreshold() == request.getMinUpdateThreshold()) && hasDistanceThreshold() == request.hasDistanceThreshold()) {
                    return (!hasDistanceThreshold() || Float.floatToIntBits(getDistanceThreshold()) == Float.floatToIntBits(request.getDistanceThreshold())) && getUnknownFields().equals(request.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
            public float getDistanceThreshold() {
                return this.distanceThreshold_;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
            public int getMinUpdateThreshold() {
                return this.minUpdateThreshold_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Request> getParserForType() {
                return PARSER;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
            public LocationData.DataType getRequested() {
                LocationData.DataType dataTypeForNumber = LocationData.DataType.forNumber(this.requested_);
                return dataTypeForNumber == null ? LocationData.DataType.SIGNIFICANT_LOCATION : dataTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.requested_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.minUpdateThreshold_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeFloatSize(3, this.distanceThreshold_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
            public boolean hasDistanceThreshold() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
            public boolean hasMinUpdateThreshold() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
            public boolean hasRequested() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasRequested()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + this.requested_;
                }
                if (hasMinUpdateThreshold()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getMinUpdateThreshold();
                }
                if (hasDistanceThreshold()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getDistanceThreshold());
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
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
                return new Request();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeEnum(1, this.requested_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeUInt32(2, this.minUpdateThreshold_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeFloat(3, this.distanceThreshold_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestOrBuilder {
                private int bitField0_;
                private float distanceThreshold_;
                private int minUpdateThreshold_;
                private int requested_;

                private Builder() {
                    this.requested_ = 0;
                }

                private void buildPartial0(Request request) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        request.requested_ = this.requested_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        request.minUpdateThreshold_ = this.minUpdateThreshold_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        request.distanceThreshold_ = this.distanceThreshold_;
                        i14 |= 4;
                    }
                    request.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Request build() {
                    Request requestBuildPartial = buildPartial();
                    if (requestBuildPartial.isInitialized()) {
                        return requestBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Request buildPartial() {
                    Request request = new Request(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(request);
                    }
                    onBuilt();
                    return request;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.requested_ = 0;
                    this.minUpdateThreshold_ = 0;
                    this.distanceThreshold_ = 0.0f;
                    return this;
                }

                public Builder clearDistanceThreshold() {
                    this.bitField0_ &= -5;
                    this.distanceThreshold_ = 0.0f;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearMinUpdateThreshold() {
                    this.bitField0_ &= -3;
                    this.minUpdateThreshold_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearRequested() {
                    this.bitField0_ &= -2;
                    this.requested_ = 0;
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
                    return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_descriptor;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
                public float getDistanceThreshold() {
                    return this.distanceThreshold_;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
                public int getMinUpdateThreshold() {
                    return this.minUpdateThreshold_;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
                public LocationData.DataType getRequested() {
                    LocationData.DataType dataTypeForNumber = LocationData.DataType.forNumber(this.requested_);
                    return dataTypeForNumber == null ? LocationData.DataType.SIGNIFICANT_LOCATION : dataTypeForNumber;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
                public boolean hasDistanceThreshold() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
                public boolean hasMinUpdateThreshold() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequest.RequestOrBuilder
                public boolean hasRequested() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
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
                                        if (LocationData.DataType.forNumber(i14) == null) {
                                            mergeUnknownVarintField(1, i14);
                                        } else {
                                            this.requested_ = i14;
                                            this.bitField0_ |= 1;
                                        }
                                    } else if (tag == 16) {
                                        this.minUpdateThreshold_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 29) {
                                        this.distanceThreshold_ = codedInputStream.readFloat();
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

                public Builder setDistanceThreshold(float f14) {
                    this.distanceThreshold_ = f14;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setMinUpdateThreshold(int i14) {
                    this.minUpdateThreshold_ = i14;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setRequested(LocationData.DataType dataType) {
                    dataType.getClass();
                    this.bitField0_ |= 1;
                    this.requested_ = dataType.getNumber();
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Request getDefaultInstanceForType() {
                    return Request.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.requested_ = 0;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Request) {
                        return mergeFrom((Request) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Request request) {
                    if (request == Request.getDefaultInstance()) {
                        return this;
                    }
                    if (request.hasRequested()) {
                        setRequested(request.getRequested());
                    }
                    if (request.hasMinUpdateThreshold()) {
                        setMinUpdateThreshold(request.getMinUpdateThreshold());
                    }
                    if (request.hasDistanceThreshold()) {
                        setDistanceThreshold(request.getDistanceThreshold());
                    }
                    mergeUnknownFields(request.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Request getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Request parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Request parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static Request parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Request parseFrom(InputStream inputStream) {
                return (Request) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public /* synthetic */ Request(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }

            private Request() {
                this.minUpdateThreshold_ = 0;
                this.distanceThreshold_ = 0.0f;
                this.memoizedIsInitialized = (byte) -1;
                this.requested_ = 0;
            }

            public static Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Request) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Request parseFrom(CodedInputStream codedInputStream) {
                return (Request) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Request) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocationUpdatedSetEnabledRequestOrBuilder {
            private int bitField0_;
            private boolean enabled_;
            private RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> requestsBuilder_;
            private List<Request> requests_;

            private Builder() {
                this.requests_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    locationUpdatedSetEnabledRequest.enabled_ = this.enabled_;
                } else {
                    i14 = 0;
                }
                locationUpdatedSetEnabledRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    locationUpdatedSetEnabledRequest.requests_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.requests_ = Collections.unmodifiableList(this.requests_);
                    this.bitField0_ &= -3;
                }
                locationUpdatedSetEnabledRequest.requests_ = this.requests_;
            }

            private void ensureRequestsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.requests_ = new ArrayList(this.requests_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> getRequestsFieldBuilder() {
                if (this.requestsBuilder_ == null) {
                    this.requestsBuilder_ = new RepeatedFieldBuilderV3<>(this.requests_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.requests_ = null;
                }
                return this.requestsBuilder_;
            }

            public Builder addAllRequests(Iterable<? extends Request> iterable) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureRequestsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.requests_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addRequests(Request.Builder builder) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureRequestsIsMutable();
                this.requests_.add(builder.build());
                onChanged();
                return this;
            }

            public Request.Builder addRequestsBuilder() {
                return (Request.Builder) getRequestsFieldBuilder().addBuilder(Request.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationUpdatedSetEnabledRequest build() {
                LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequestBuildPartial = buildPartial();
                if (locationUpdatedSetEnabledRequestBuildPartial.isInitialized()) {
                    return locationUpdatedSetEnabledRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationUpdatedSetEnabledRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationUpdatedSetEnabledRequest buildPartial() {
                LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest = new LocationUpdatedSetEnabledRequest(this);
                buildPartialRepeatedFields(locationUpdatedSetEnabledRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(locationUpdatedSetEnabledRequest);
                }
                onBuilt();
                return locationUpdatedSetEnabledRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.enabled_ = false;
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.requests_ = Collections.EMPTY_LIST;
                } else {
                    this.requests_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRequests() {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.requests_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
            public Request getRequests(int i14) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.requests_.get(i14) : (Request) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Request.Builder getRequestsBuilder(int i14) {
                return (Request.Builder) getRequestsFieldBuilder().getBuilder(i14);
            }

            public List<Request.Builder> getRequestsBuilderList() {
                return getRequestsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
            public int getRequestsCount() {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.requests_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
            public List<Request> getRequestsList() {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.requests_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
            public RequestOrBuilder getRequestsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.requests_.get(i14) : (RequestOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
            public List<? extends RequestOrBuilder> getRequestsOrBuilderList() {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.requests_);
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledRequestOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationUpdatedSetEnabledRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEnabled();
            }

            public Builder mergeFrom(LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest) {
                if (locationUpdatedSetEnabledRequest == LocationUpdatedSetEnabledRequest.getDefaultInstance()) {
                    return this;
                }
                if (locationUpdatedSetEnabledRequest.hasEnabled()) {
                    setEnabled(locationUpdatedSetEnabledRequest.getEnabled());
                }
                if (this.requestsBuilder_ == null) {
                    if (!locationUpdatedSetEnabledRequest.requests_.isEmpty()) {
                        if (this.requests_.isEmpty()) {
                            this.requests_ = locationUpdatedSetEnabledRequest.requests_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureRequestsIsMutable();
                            this.requests_.addAll(locationUpdatedSetEnabledRequest.requests_);
                        }
                        onChanged();
                    }
                } else if (!locationUpdatedSetEnabledRequest.requests_.isEmpty()) {
                    boolean zIsEmpty = this.requestsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.requestsBuilder_ = null;
                        this.requests_ = locationUpdatedSetEnabledRequest.requests_;
                        this.bitField0_ &= -3;
                        this.requestsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getRequestsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(locationUpdatedSetEnabledRequest.requests_);
                    }
                }
                mergeUnknownFields(locationUpdatedSetEnabledRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeRequests(int i14) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureRequestsIsMutable();
                this.requests_.remove(i14);
                onChanged();
                return this;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRequests(int i14, Request.Builder builder) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureRequestsIsMutable();
                this.requests_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LocationUpdatedSetEnabledRequest getDefaultInstanceForType() {
                return LocationUpdatedSetEnabledRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.requests_ = Collections.EMPTY_LIST;
            }

            public Request.Builder addRequestsBuilder(int i14) {
                return (Request.Builder) getRequestsFieldBuilder().addBuilder(i14, Request.getDefaultInstance());
            }

            public Builder addRequests(int i14, Request request) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    request.getClass();
                    ensureRequestsIsMutable();
                    this.requests_.add(i14, request);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, request);
                return this;
            }

            public Builder setRequests(int i14, Request request) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    request.getClass();
                    ensureRequestsIsMutable();
                    this.requests_.set(i14, request);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, request);
                return this;
            }

            public Builder addRequests(Request request) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    request.getClass();
                    ensureRequestsIsMutable();
                    this.requests_.add(request);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(request);
                return this;
            }

            public Builder addRequests(int i14, Request.Builder builder) {
                RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRequestsIsMutable();
                    this.requests_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LocationUpdatedSetEnabledRequest) {
                    return mergeFrom((LocationUpdatedSetEnabledRequest) message);
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
                                if (tag == 8) {
                                    this.enabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Request request = (Request) codedInputStream.readMessage(Request.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureRequestsIsMutable();
                                        this.requests_.add(request);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(request);
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
        public LocationUpdatedSetEnabledRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LocationUpdatedSetEnabledRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedSetEnabledRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private LocationUpdatedSetEnabledRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(InputStream inputStream) {
            return (LocationUpdatedSetEnabledRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedSetEnabledRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ LocationUpdatedSetEnabledRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(CodedInputStream codedInputStream) {
            return (LocationUpdatedSetEnabledRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LocationUpdatedSetEnabledRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedSetEnabledRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LocationUpdatedSetEnabledResponse extends GeneratedMessageV3 implements LocationUpdatedSetEnabledResponseOrBuilder {
        private static final LocationUpdatedSetEnabledResponse DEFAULT_INSTANCE = new LocationUpdatedSetEnabledResponse();

        @Deprecated
        public static final Parser<LocationUpdatedSetEnabledResponse> PARSER = new AbstractParser<LocationUpdatedSetEnabledResponse>() { // from class: com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.1
            @Override // com.google.protobuf.Parser
            public LocationUpdatedSetEnabledResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LocationUpdatedSetEnabledResponse.newBuilder();
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
        public static final int REQUESTS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<RequestStatus> requests_;
        private int status_;

        public interface RequestStatusOrBuilder extends MessageOrBuilder {
            LocationData.DataType getRequested();

            RequestStatus.Status getStatus();

            boolean hasRequested();

            boolean hasStatus();
        }

        private LocationUpdatedSetEnabledResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
            this.requests_ = Collections.EMPTY_LIST;
        }

        public static LocationUpdatedSetEnabledResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_descriptor;
        }

        public static Builder newBuilder(LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(locationUpdatedSetEnabledResponse);
        }

        public static LocationUpdatedSetEnabledResponse parseDelimitedFrom(InputStream inputStream) {
            return (LocationUpdatedSetEnabledResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LocationUpdatedSetEnabledResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationUpdatedSetEnabledResponse)) {
                return super.equals(obj);
            }
            LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse = (LocationUpdatedSetEnabledResponse) obj;
            if (hasStatus() != locationUpdatedSetEnabledResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == locationUpdatedSetEnabledResponse.status_) && getRequestsList().equals(locationUpdatedSetEnabledResponse.getRequestsList()) && getUnknownFields().equals(locationUpdatedSetEnabledResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LocationUpdatedSetEnabledResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
        public RequestStatus getRequests(int i14) {
            return this.requests_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
        public int getRequestsCount() {
            return this.requests_.size();
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
        public List<RequestStatus> getRequestsList() {
            return this.requests_;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
        public RequestStatusOrBuilder getRequestsOrBuilder(int i14) {
            return this.requests_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
        public List<? extends RequestStatusOrBuilder> getRequestsOrBuilderList() {
            return this.requests_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            for (int i15 = 0; i15 < this.requests_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.requests_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.OK : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
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
            if (getRequestsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRequestsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationUpdatedSetEnabledResponse.class, Builder.class);
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
            return new LocationUpdatedSetEnabledResponse();
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
            for (int i14 = 0; i14 < this.requests_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.requests_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class RequestStatus extends GeneratedMessageV3 implements RequestStatusOrBuilder {
            private static final RequestStatus DEFAULT_INSTANCE = new RequestStatus();

            @Deprecated
            public static final Parser<RequestStatus> PARSER = new AbstractParser<RequestStatus>() { // from class: com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatus.1
                @Override // com.google.protobuf.Parser
                public RequestStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = RequestStatus.newBuilder();
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
            public static final int REQUESTED_FIELD_NUMBER = 1;
            public static final int STATUS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int requested_;
            private int status_;

            private RequestStatus(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.requested_ = 0;
                this.status_ = 1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static RequestStatus getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_descriptor;
            }

            public static Builder newBuilder(RequestStatus requestStatus) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestStatus);
            }

            public static RequestStatus parseDelimitedFrom(InputStream inputStream) {
                return (RequestStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static RequestStatus parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<RequestStatus> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RequestStatus)) {
                    return super.equals(obj);
                }
                RequestStatus requestStatus = (RequestStatus) obj;
                if (hasRequested() != requestStatus.hasRequested()) {
                    return false;
                }
                if ((!hasRequested() || this.requested_ == requestStatus.requested_) && hasStatus() == requestStatus.hasStatus()) {
                    return (!hasStatus() || this.status_ == requestStatus.status_) && getUnknownFields().equals(requestStatus.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<RequestStatus> getParserForType() {
                return PARSER;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder
            public LocationData.DataType getRequested() {
                LocationData.DataType dataTypeForNumber = LocationData.DataType.forNumber(this.requested_);
                return dataTypeForNumber == null ? LocationData.DataType.SIGNIFICANT_LOCATION : dataTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.requested_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.status_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.OK : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder
            public boolean hasRequested() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasRequested()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + this.requested_;
                }
                if (hasStatus()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + this.status_;
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestStatus.class, Builder.class);
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
                return new RequestStatus();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeEnum(1, this.requested_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeEnum(2, this.status_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestStatusOrBuilder {
                private int bitField0_;
                private int requested_;
                private int status_;

                private Builder() {
                    this.requested_ = 0;
                    this.status_ = 1;
                }

                private void buildPartial0(RequestStatus requestStatus) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        requestStatus.requested_ = this.requested_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        requestStatus.status_ = this.status_;
                        i14 |= 2;
                    }
                    requestStatus.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public RequestStatus build() {
                    RequestStatus requestStatusBuildPartial = buildPartial();
                    if (requestStatusBuildPartial.isInitialized()) {
                        return requestStatusBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestStatusBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public RequestStatus buildPartial() {
                    RequestStatus requestStatus = new RequestStatus(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(requestStatus);
                    }
                    onBuilt();
                    return requestStatus;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.requested_ = 0;
                    this.status_ = 1;
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

                public Builder clearRequested() {
                    this.bitField0_ &= -2;
                    this.requested_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearStatus() {
                    this.bitField0_ &= -3;
                    this.status_ = 1;
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
                    return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_descriptor;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder
                public LocationData.DataType getRequested() {
                    LocationData.DataType dataTypeForNumber = LocationData.DataType.forNumber(this.requested_);
                    return dataTypeForNumber == null ? LocationData.DataType.SIGNIFICANT_LOCATION : dataTypeForNumber;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder
                public Status getStatus() {
                    Status statusForNumber = Status.forNumber(this.status_);
                    return statusForNumber == null ? Status.OK : statusForNumber;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder
                public boolean hasRequested() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatusOrBuilder
                public boolean hasStatus() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_RequestStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestStatus.class, Builder.class);
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
                                        if (LocationData.DataType.forNumber(i14) == null) {
                                            mergeUnknownVarintField(1, i14);
                                        } else {
                                            this.requested_ = i14;
                                            this.bitField0_ |= 1;
                                        }
                                    } else if (tag == 16) {
                                        int i15 = codedInputStream.readEnum();
                                        if (Status.forNumber(i15) == null) {
                                            mergeUnknownVarintField(2, i15);
                                        } else {
                                            this.status_ = i15;
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

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setRequested(LocationData.DataType dataType) {
                    dataType.getClass();
                    this.bitField0_ |= 1;
                    this.requested_ = dataType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setStatus(Status status) {
                    status.getClass();
                    this.bitField0_ |= 2;
                    this.status_ = status.getNumber();
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public RequestStatus getDefaultInstanceForType() {
                    return RequestStatus.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.requested_ = 0;
                    this.status_ = 1;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof RequestStatus) {
                        return mergeFrom((RequestStatus) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(RequestStatus requestStatus) {
                    if (requestStatus == RequestStatus.getDefaultInstance()) {
                        return this;
                    }
                    if (requestStatus.hasRequested()) {
                        setRequested(requestStatus.getRequested());
                    }
                    if (requestStatus.hasStatus()) {
                        setStatus(requestStatus.getStatus());
                    }
                    mergeUnknownFields(requestStatus.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RequestStatus getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static RequestStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RequestStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static RequestStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static RequestStatus parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static RequestStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static RequestStatus parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public /* synthetic */ RequestStatus(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }

            public static RequestStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            private RequestStatus() {
                this.memoizedIsInitialized = (byte) -1;
                this.requested_ = 0;
                this.status_ = 1;
            }

            public static RequestStatus parseFrom(InputStream inputStream) {
                return (RequestStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static RequestStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RequestStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static RequestStatus parseFrom(CodedInputStream codedInputStream) {
                return (RequestStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static RequestStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RequestStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public enum Status implements ProtocolMessageEnum {
                OK(1),
                NOT_AVAILABLE(2),
                UNSUPPORTED_CRITERIA(3),
                GENERIC_ERROR(4);

                public static final int GENERIC_ERROR_VALUE = 4;
                public static final int NOT_AVAILABLE_VALUE = 2;
                public static final int OK_VALUE = 1;
                public static final int UNSUPPORTED_CRITERIA_VALUE = 3;
                private final int value;
                private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.RequestStatus.Status.1
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
                    if (i14 == 1) {
                        return OK;
                    }
                    if (i14 == 2) {
                        return NOT_AVAILABLE;
                    }
                    if (i14 == 3) {
                        return UNSUPPORTED_CRITERIA;
                    }
                    if (i14 != 4) {
                        return null;
                    }
                    return GENERIC_ERROR;
                }

                public static final Descriptors.EnumDescriptor getDescriptor() {
                    return RequestStatus.getDescriptor().getEnumTypes().get(0);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocationUpdatedSetEnabledResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> requestsBuilder_;
            private List<RequestStatus> requests_;
            private int status_;

            private Builder() {
                this.status_ = 1;
                this.requests_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    locationUpdatedSetEnabledResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                locationUpdatedSetEnabledResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    locationUpdatedSetEnabledResponse.requests_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.requests_ = Collections.unmodifiableList(this.requests_);
                    this.bitField0_ &= -3;
                }
                locationUpdatedSetEnabledResponse.requests_ = this.requests_;
            }

            private void ensureRequestsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.requests_ = new ArrayList(this.requests_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> getRequestsFieldBuilder() {
                if (this.requestsBuilder_ == null) {
                    this.requestsBuilder_ = new RepeatedFieldBuilderV3<>(this.requests_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.requests_ = null;
                }
                return this.requestsBuilder_;
            }

            public Builder addAllRequests(Iterable<? extends RequestStatus> iterable) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureRequestsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.requests_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addRequests(RequestStatus.Builder builder) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureRequestsIsMutable();
                this.requests_.add(builder.build());
                onChanged();
                return this;
            }

            public RequestStatus.Builder addRequestsBuilder() {
                return (RequestStatus.Builder) getRequestsFieldBuilder().addBuilder(RequestStatus.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationUpdatedSetEnabledResponse build() {
                LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponseBuildPartial = buildPartial();
                if (locationUpdatedSetEnabledResponseBuildPartial.isInitialized()) {
                    return locationUpdatedSetEnabledResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationUpdatedSetEnabledResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationUpdatedSetEnabledResponse buildPartial() {
                LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse = new LocationUpdatedSetEnabledResponse(this);
                buildPartialRepeatedFields(locationUpdatedSetEnabledResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(locationUpdatedSetEnabledResponse);
                }
                onBuilt();
                return locationUpdatedSetEnabledResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.requests_ = Collections.EMPTY_LIST;
                } else {
                    this.requests_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
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

            public Builder clearRequests() {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.requests_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 1;
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
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
            public RequestStatus getRequests(int i14) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.requests_.get(i14) : (RequestStatus) repeatedFieldBuilderV3.getMessage(i14);
            }

            public RequestStatus.Builder getRequestsBuilder(int i14) {
                return (RequestStatus.Builder) getRequestsFieldBuilder().getBuilder(i14);
            }

            public List<RequestStatus.Builder> getRequestsBuilderList() {
                return getRequestsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
            public int getRequestsCount() {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.requests_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
            public List<RequestStatus> getRequestsList() {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.requests_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
            public RequestStatusOrBuilder getRequestsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.requests_.get(i14) : (RequestStatusOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
            public List<? extends RequestStatusOrBuilder> getRequestsOrBuilderList() {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.requests_);
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.OK : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedSetEnabledResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationUpdatedSetEnabledResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
            }

            public Builder mergeFrom(LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse) {
                if (locationUpdatedSetEnabledResponse == LocationUpdatedSetEnabledResponse.getDefaultInstance()) {
                    return this;
                }
                if (locationUpdatedSetEnabledResponse.hasStatus()) {
                    setStatus(locationUpdatedSetEnabledResponse.getStatus());
                }
                if (this.requestsBuilder_ == null) {
                    if (!locationUpdatedSetEnabledResponse.requests_.isEmpty()) {
                        if (this.requests_.isEmpty()) {
                            this.requests_ = locationUpdatedSetEnabledResponse.requests_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureRequestsIsMutable();
                            this.requests_.addAll(locationUpdatedSetEnabledResponse.requests_);
                        }
                        onChanged();
                    }
                } else if (!locationUpdatedSetEnabledResponse.requests_.isEmpty()) {
                    boolean zIsEmpty = this.requestsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.requestsBuilder_ = null;
                        this.requests_ = locationUpdatedSetEnabledResponse.requests_;
                        this.bitField0_ &= -3;
                        this.requestsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getRequestsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(locationUpdatedSetEnabledResponse.requests_);
                    }
                }
                mergeUnknownFields(locationUpdatedSetEnabledResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeRequests(int i14) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureRequestsIsMutable();
                this.requests_.remove(i14);
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

            public Builder setRequests(int i14, RequestStatus.Builder builder) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureRequestsIsMutable();
                this.requests_.set(i14, builder.build());
                onChanged();
                return this;
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
            public LocationUpdatedSetEnabledResponse getDefaultInstanceForType() {
                return LocationUpdatedSetEnabledResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 1;
                this.requests_ = Collections.EMPTY_LIST;
            }

            public RequestStatus.Builder addRequestsBuilder(int i14) {
                return (RequestStatus.Builder) getRequestsFieldBuilder().addBuilder(i14, RequestStatus.getDefaultInstance());
            }

            public Builder addRequests(int i14, RequestStatus requestStatus) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    requestStatus.getClass();
                    ensureRequestsIsMutable();
                    this.requests_.add(i14, requestStatus);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, requestStatus);
                return this;
            }

            public Builder setRequests(int i14, RequestStatus requestStatus) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    requestStatus.getClass();
                    ensureRequestsIsMutable();
                    this.requests_.set(i14, requestStatus);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, requestStatus);
                return this;
            }

            public Builder addRequests(RequestStatus requestStatus) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    requestStatus.getClass();
                    ensureRequestsIsMutable();
                    this.requests_.add(requestStatus);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(requestStatus);
                return this;
            }

            public Builder addRequests(int i14, RequestStatus.Builder builder) {
                RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRequestsIsMutable();
                    this.requests_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LocationUpdatedSetEnabledResponse) {
                    return mergeFrom((LocationUpdatedSetEnabledResponse) message);
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    RequestStatus requestStatus = (RequestStatus) codedInputStream.readMessage(RequestStatus.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<RequestStatus, RequestStatus.Builder, RequestStatusOrBuilder> repeatedFieldBuilderV3 = this.requestsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureRequestsIsMutable();
                                        this.requests_.add(requestStatus);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(requestStatus);
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
        public LocationUpdatedSetEnabledResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LocationUpdatedSetEnabledResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedSetEnabledResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private LocationUpdatedSetEnabledResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(InputStream inputStream) {
            return (LocationUpdatedSetEnabledResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedSetEnabledResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ LocationUpdatedSetEnabledResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(CodedInputStream codedInputStream) {
            return (LocationUpdatedSetEnabledResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LocationUpdatedSetEnabledResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedSetEnabledResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            OK(1),
            NOT_AVAILABLE(2);

            public static final int NOT_AVAILABLE_VALUE = 2;
            public static final int OK_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDICore.LocationUpdatedSetEnabledResponse.Status.1
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
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return NOT_AVAILABLE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LocationUpdatedSetEnabledResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class CheckPendingSoftwareResponse extends GeneratedMessageV3 implements CheckPendingSoftwareResponseOrBuilder {
        private static final CheckPendingSoftwareResponse DEFAULT_INSTANCE = new CheckPendingSoftwareResponse();

        @Deprecated
        public static final Parser<CheckPendingSoftwareResponse> PARSER = new AbstractParser<CheckPendingSoftwareResponse>() { // from class: com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponse.1
            @Override // com.google.protobuf.Parser
            public CheckPendingSoftwareResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CheckPendingSoftwareResponse.newBuilder();
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
        public static final int PENDING_VERSION_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int pendingVersion_;
        private int status_;

        private CheckPendingSoftwareResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.pendingVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckPendingSoftwareResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_descriptor;
        }

        public static Builder newBuilder(CheckPendingSoftwareResponse checkPendingSoftwareResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkPendingSoftwareResponse);
        }

        public static CheckPendingSoftwareResponse parseDelimitedFrom(InputStream inputStream) {
            return (CheckPendingSoftwareResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckPendingSoftwareResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CheckPendingSoftwareResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckPendingSoftwareResponse)) {
                return super.equals(obj);
            }
            CheckPendingSoftwareResponse checkPendingSoftwareResponse = (CheckPendingSoftwareResponse) obj;
            if (hasStatus() != checkPendingSoftwareResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == checkPendingSoftwareResponse.status_) && hasPendingVersion() == checkPendingSoftwareResponse.hasPendingVersion()) {
                return (!hasPendingVersion() || getPendingVersion() == checkPendingSoftwareResponse.getPendingVersion()) && getUnknownFields().equals(checkPendingSoftwareResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CheckPendingSoftwareResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponseOrBuilder
        public int getPendingVersion() {
            return this.pendingVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.pendingVersion_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.NO_UPDATES : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponseOrBuilder
        public boolean hasPendingVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponseOrBuilder
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
            if (hasPendingVersion()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPendingVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckPendingSoftwareResponse.class, Builder.class);
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
            return new CheckPendingSoftwareResponse();
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
                codedOutputStream.writeUInt32(2, this.pendingVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CheckPendingSoftwareResponseOrBuilder {
            private int bitField0_;
            private int pendingVersion_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(CheckPendingSoftwareResponse checkPendingSoftwareResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    checkPendingSoftwareResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    checkPendingSoftwareResponse.pendingVersion_ = this.pendingVersion_;
                    i14 |= 2;
                }
                checkPendingSoftwareResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckPendingSoftwareResponse build() {
                CheckPendingSoftwareResponse checkPendingSoftwareResponseBuildPartial = buildPartial();
                if (checkPendingSoftwareResponseBuildPartial.isInitialized()) {
                    return checkPendingSoftwareResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) checkPendingSoftwareResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckPendingSoftwareResponse buildPartial() {
                CheckPendingSoftwareResponse checkPendingSoftwareResponse = new CheckPendingSoftwareResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkPendingSoftwareResponse);
                }
                onBuilt();
                return checkPendingSoftwareResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.pendingVersion_ = 0;
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

            public Builder clearPendingVersion() {
                this.bitField0_ &= -3;
                this.pendingVersion_ = 0;
                onChanged();
                return this;
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
                return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponseOrBuilder
            public int getPendingVersion() {
                return this.pendingVersion_;
            }

            @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.NO_UPDATES : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponseOrBuilder
            public boolean hasPendingVersion() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_CheckPendingSoftwareResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckPendingSoftwareResponse.class, Builder.class);
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
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.pendingVersion_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPendingVersion(int i14) {
                this.pendingVersion_ = i14;
                this.bitField0_ |= 2;
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
            public CheckPendingSoftwareResponse getDefaultInstanceForType() {
                return CheckPendingSoftwareResponse.getDefaultInstance();
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
                if (message instanceof CheckPendingSoftwareResponse) {
                    return mergeFrom((CheckPendingSoftwareResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CheckPendingSoftwareResponse checkPendingSoftwareResponse) {
                if (checkPendingSoftwareResponse == CheckPendingSoftwareResponse.getDefaultInstance()) {
                    return this;
                }
                if (checkPendingSoftwareResponse.hasStatus()) {
                    setStatus(checkPendingSoftwareResponse.getStatus());
                }
                if (checkPendingSoftwareResponse.hasPendingVersion()) {
                    setPendingVersion(checkPendingSoftwareResponse.getPendingVersion());
                }
                mergeUnknownFields(checkPendingSoftwareResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CheckPendingSoftwareResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CheckPendingSoftwareResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckPendingSoftwareResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckPendingSoftwareResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CheckPendingSoftwareResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckPendingSoftwareResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ CheckPendingSoftwareResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CheckPendingSoftwareResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private CheckPendingSoftwareResponse() {
            this.pendingVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static CheckPendingSoftwareResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CheckPendingSoftwareResponse parseFrom(InputStream inputStream) {
            return (CheckPendingSoftwareResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CheckPendingSoftwareResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckPendingSoftwareResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckPendingSoftwareResponse parseFrom(CodedInputStream codedInputStream) {
            return (CheckPendingSoftwareResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CheckPendingSoftwareResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckPendingSoftwareResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            NO_UPDATES(0),
            PENDING_UPDATES(1),
            APPLYING_UPDATES(2);

            public static final int APPLYING_UPDATES_VALUE = 2;
            public static final int NO_UPDATES_VALUE = 0;
            public static final int PENDING_UPDATES_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDICore.CheckPendingSoftwareResponse.Status.1
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
                    return NO_UPDATES;
                }
                if (i14 == 1) {
                    return PENDING_UPDATES;
                }
                if (i14 != 2) {
                    return null;
                }
                return APPLYING_UPDATES;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CheckPendingSoftwareResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class CoreService extends GeneratedMessageV3 implements CoreServiceOrBuilder {
        public static final int CHECK_PENDING_SOFTWARE_REQUEST_FIELD_NUMBER = 15;
        public static final int CHECK_PENDING_SOFTWARE_RESPONSE_FIELD_NUMBER = 16;
        public static final int CONNECTION_READY_NOTIFICATION_FIELD_NUMBER = 14;
        public static final int DUAL_PAIRING_REQUEST_FIELD_NUMBER = 12;
        public static final int DUAL_PAIRING_RESPONSE_FIELD_NUMBER = 13;
        public static final int FEATURE_CAPABILITIES_REQUEST_FIELD_NUMBER = 8;
        public static final int FEATURE_CAPABILITIES_RESPONSE_FIELD_NUMBER = 9;
        public static final int GARMIN_GUID_OVERWRITE_REQUEST_FIELD_NUMBER = 10;
        public static final int GARMIN_GUID_OVERWRITE_RESPONSE_FIELD_NUMBER = 11;
        public static final int GET_LOCATION_REQUEST_FIELD_NUMBER = 3;
        public static final int GET_LOCATION_RESPONSE_FIELD_NUMBER = 4;
        public static final int LOCATION_UPDATED_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int LOCATION_UPDATED_SET_ENABLED_REQUEST_FIELD_NUMBER = 5;
        public static final int LOCATION_UPDATED_SET_ENABLED_RESPONSE_FIELD_NUMBER = 6;
        public static final int SYNC_REQUEST_FIELD_NUMBER = 1;
        public static final int SYNC_RESPONSE_FIELD_NUMBER = 2;
        public static final int TIME_SYNC_REQUEST_FIELD_NUMBER = 17;
        public static final int TIME_SYNC_RESPONSE_FIELD_NUMBER = 18;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CheckPendingSoftwareRequest checkPendingSoftwareRequest_;
        private CheckPendingSoftwareResponse checkPendingSoftwareResponse_;
        private ConnectionReadyNotification connectionReadyNotification_;
        private DualPairingRequest dualPairingRequest_;
        private DualPairingResponse dualPairingResponse_;
        private FeatureCapabilitiesRequest featureCapabilitiesRequest_;
        private FeatureCapabilitiesResponse featureCapabilitiesResponse_;
        private GarminGuidOverwriteRequest garminGuidOverwriteRequest_;
        private GarminGuidOverwriteResponse garminGuidOverwriteResponse_;
        private GetLocationRequest getLocationRequest_;
        private GetLocationResponse getLocationResponse_;
        private LocationUpdatedNotification locationUpdatedNotification_;
        private LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest_;
        private LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse_;
        private byte memoizedIsInitialized;
        private SyncRequest syncRequest_;
        private SyncResponse syncResponse_;
        private TimeSyncRequest timeSyncRequest_;
        private TimeSyncResponse timeSyncResponse_;
        private static final CoreService DEFAULT_INSTANCE = new CoreService();

        @Deprecated
        public static final Parser<CoreService> PARSER = new AbstractParser<CoreService>() { // from class: com.garmin.proto.generated.GDICore.CoreService.1
            @Override // com.google.protobuf.Parser
            public CoreService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CoreService.newBuilder();
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

        private CoreService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CoreService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_CoreService_descriptor;
        }

        public static Builder newBuilder(CoreService coreService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(coreService);
        }

        public static CoreService parseDelimitedFrom(InputStream inputStream) {
            return (CoreService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CoreService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CoreService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CoreService)) {
                return super.equals(obj);
            }
            CoreService coreService = (CoreService) obj;
            if (hasSyncRequest() != coreService.hasSyncRequest()) {
                return false;
            }
            if ((hasSyncRequest() && !getSyncRequest().equals(coreService.getSyncRequest())) || hasSyncResponse() != coreService.hasSyncResponse()) {
                return false;
            }
            if ((hasSyncResponse() && !getSyncResponse().equals(coreService.getSyncResponse())) || hasGetLocationRequest() != coreService.hasGetLocationRequest()) {
                return false;
            }
            if ((hasGetLocationRequest() && !getGetLocationRequest().equals(coreService.getGetLocationRequest())) || hasGetLocationResponse() != coreService.hasGetLocationResponse()) {
                return false;
            }
            if ((hasGetLocationResponse() && !getGetLocationResponse().equals(coreService.getGetLocationResponse())) || hasLocationUpdatedSetEnabledRequest() != coreService.hasLocationUpdatedSetEnabledRequest()) {
                return false;
            }
            if ((hasLocationUpdatedSetEnabledRequest() && !getLocationUpdatedSetEnabledRequest().equals(coreService.getLocationUpdatedSetEnabledRequest())) || hasLocationUpdatedSetEnabledResponse() != coreService.hasLocationUpdatedSetEnabledResponse()) {
                return false;
            }
            if ((hasLocationUpdatedSetEnabledResponse() && !getLocationUpdatedSetEnabledResponse().equals(coreService.getLocationUpdatedSetEnabledResponse())) || hasLocationUpdatedNotification() != coreService.hasLocationUpdatedNotification()) {
                return false;
            }
            if ((hasLocationUpdatedNotification() && !getLocationUpdatedNotification().equals(coreService.getLocationUpdatedNotification())) || hasFeatureCapabilitiesRequest() != coreService.hasFeatureCapabilitiesRequest()) {
                return false;
            }
            if ((hasFeatureCapabilitiesRequest() && !getFeatureCapabilitiesRequest().equals(coreService.getFeatureCapabilitiesRequest())) || hasFeatureCapabilitiesResponse() != coreService.hasFeatureCapabilitiesResponse()) {
                return false;
            }
            if ((hasFeatureCapabilitiesResponse() && !getFeatureCapabilitiesResponse().equals(coreService.getFeatureCapabilitiesResponse())) || hasGarminGuidOverwriteRequest() != coreService.hasGarminGuidOverwriteRequest()) {
                return false;
            }
            if ((hasGarminGuidOverwriteRequest() && !getGarminGuidOverwriteRequest().equals(coreService.getGarminGuidOverwriteRequest())) || hasGarminGuidOverwriteResponse() != coreService.hasGarminGuidOverwriteResponse()) {
                return false;
            }
            if ((hasGarminGuidOverwriteResponse() && !getGarminGuidOverwriteResponse().equals(coreService.getGarminGuidOverwriteResponse())) || hasDualPairingRequest() != coreService.hasDualPairingRequest()) {
                return false;
            }
            if ((hasDualPairingRequest() && !getDualPairingRequest().equals(coreService.getDualPairingRequest())) || hasDualPairingResponse() != coreService.hasDualPairingResponse()) {
                return false;
            }
            if ((hasDualPairingResponse() && !getDualPairingResponse().equals(coreService.getDualPairingResponse())) || hasConnectionReadyNotification() != coreService.hasConnectionReadyNotification()) {
                return false;
            }
            if ((hasConnectionReadyNotification() && !getConnectionReadyNotification().equals(coreService.getConnectionReadyNotification())) || hasCheckPendingSoftwareRequest() != coreService.hasCheckPendingSoftwareRequest()) {
                return false;
            }
            if ((hasCheckPendingSoftwareRequest() && !getCheckPendingSoftwareRequest().equals(coreService.getCheckPendingSoftwareRequest())) || hasCheckPendingSoftwareResponse() != coreService.hasCheckPendingSoftwareResponse()) {
                return false;
            }
            if ((hasCheckPendingSoftwareResponse() && !getCheckPendingSoftwareResponse().equals(coreService.getCheckPendingSoftwareResponse())) || hasTimeSyncRequest() != coreService.hasTimeSyncRequest()) {
                return false;
            }
            if ((!hasTimeSyncRequest() || getTimeSyncRequest().equals(coreService.getTimeSyncRequest())) && hasTimeSyncResponse() == coreService.hasTimeSyncResponse()) {
                return (!hasTimeSyncResponse() || getTimeSyncResponse().equals(coreService.getTimeSyncResponse())) && getUnknownFields().equals(coreService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public CheckPendingSoftwareRequest getCheckPendingSoftwareRequest() {
            CheckPendingSoftwareRequest checkPendingSoftwareRequest = this.checkPendingSoftwareRequest_;
            return checkPendingSoftwareRequest == null ? CheckPendingSoftwareRequest.getDefaultInstance() : checkPendingSoftwareRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public CheckPendingSoftwareRequestOrBuilder getCheckPendingSoftwareRequestOrBuilder() {
            CheckPendingSoftwareRequest checkPendingSoftwareRequest = this.checkPendingSoftwareRequest_;
            return checkPendingSoftwareRequest == null ? CheckPendingSoftwareRequest.getDefaultInstance() : checkPendingSoftwareRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public CheckPendingSoftwareResponse getCheckPendingSoftwareResponse() {
            CheckPendingSoftwareResponse checkPendingSoftwareResponse = this.checkPendingSoftwareResponse_;
            return checkPendingSoftwareResponse == null ? CheckPendingSoftwareResponse.getDefaultInstance() : checkPendingSoftwareResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public CheckPendingSoftwareResponseOrBuilder getCheckPendingSoftwareResponseOrBuilder() {
            CheckPendingSoftwareResponse checkPendingSoftwareResponse = this.checkPendingSoftwareResponse_;
            return checkPendingSoftwareResponse == null ? CheckPendingSoftwareResponse.getDefaultInstance() : checkPendingSoftwareResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public ConnectionReadyNotification getConnectionReadyNotification() {
            ConnectionReadyNotification connectionReadyNotification = this.connectionReadyNotification_;
            return connectionReadyNotification == null ? ConnectionReadyNotification.getDefaultInstance() : connectionReadyNotification;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public ConnectionReadyNotificationOrBuilder getConnectionReadyNotificationOrBuilder() {
            ConnectionReadyNotification connectionReadyNotification = this.connectionReadyNotification_;
            return connectionReadyNotification == null ? ConnectionReadyNotification.getDefaultInstance() : connectionReadyNotification;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public DualPairingRequest getDualPairingRequest() {
            DualPairingRequest dualPairingRequest = this.dualPairingRequest_;
            return dualPairingRequest == null ? DualPairingRequest.getDefaultInstance() : dualPairingRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public DualPairingRequestOrBuilder getDualPairingRequestOrBuilder() {
            DualPairingRequest dualPairingRequest = this.dualPairingRequest_;
            return dualPairingRequest == null ? DualPairingRequest.getDefaultInstance() : dualPairingRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public DualPairingResponse getDualPairingResponse() {
            DualPairingResponse dualPairingResponse = this.dualPairingResponse_;
            return dualPairingResponse == null ? DualPairingResponse.getDefaultInstance() : dualPairingResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public DualPairingResponseOrBuilder getDualPairingResponseOrBuilder() {
            DualPairingResponse dualPairingResponse = this.dualPairingResponse_;
            return dualPairingResponse == null ? DualPairingResponse.getDefaultInstance() : dualPairingResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public FeatureCapabilitiesRequest getFeatureCapabilitiesRequest() {
            FeatureCapabilitiesRequest featureCapabilitiesRequest = this.featureCapabilitiesRequest_;
            return featureCapabilitiesRequest == null ? FeatureCapabilitiesRequest.getDefaultInstance() : featureCapabilitiesRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public FeatureCapabilitiesRequestOrBuilder getFeatureCapabilitiesRequestOrBuilder() {
            FeatureCapabilitiesRequest featureCapabilitiesRequest = this.featureCapabilitiesRequest_;
            return featureCapabilitiesRequest == null ? FeatureCapabilitiesRequest.getDefaultInstance() : featureCapabilitiesRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public FeatureCapabilitiesResponse getFeatureCapabilitiesResponse() {
            FeatureCapabilitiesResponse featureCapabilitiesResponse = this.featureCapabilitiesResponse_;
            return featureCapabilitiesResponse == null ? FeatureCapabilitiesResponse.getDefaultInstance() : featureCapabilitiesResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public FeatureCapabilitiesResponseOrBuilder getFeatureCapabilitiesResponseOrBuilder() {
            FeatureCapabilitiesResponse featureCapabilitiesResponse = this.featureCapabilitiesResponse_;
            return featureCapabilitiesResponse == null ? FeatureCapabilitiesResponse.getDefaultInstance() : featureCapabilitiesResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public GarminGuidOverwriteRequest getGarminGuidOverwriteRequest() {
            GarminGuidOverwriteRequest garminGuidOverwriteRequest = this.garminGuidOverwriteRequest_;
            return garminGuidOverwriteRequest == null ? GarminGuidOverwriteRequest.getDefaultInstance() : garminGuidOverwriteRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public GarminGuidOverwriteRequestOrBuilder getGarminGuidOverwriteRequestOrBuilder() {
            GarminGuidOverwriteRequest garminGuidOverwriteRequest = this.garminGuidOverwriteRequest_;
            return garminGuidOverwriteRequest == null ? GarminGuidOverwriteRequest.getDefaultInstance() : garminGuidOverwriteRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public GarminGuidOverwriteResponse getGarminGuidOverwriteResponse() {
            GarminGuidOverwriteResponse garminGuidOverwriteResponse = this.garminGuidOverwriteResponse_;
            return garminGuidOverwriteResponse == null ? GarminGuidOverwriteResponse.getDefaultInstance() : garminGuidOverwriteResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public GarminGuidOverwriteResponseOrBuilder getGarminGuidOverwriteResponseOrBuilder() {
            GarminGuidOverwriteResponse garminGuidOverwriteResponse = this.garminGuidOverwriteResponse_;
            return garminGuidOverwriteResponse == null ? GarminGuidOverwriteResponse.getDefaultInstance() : garminGuidOverwriteResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public GetLocationRequest getGetLocationRequest() {
            GetLocationRequest getLocationRequest = this.getLocationRequest_;
            return getLocationRequest == null ? GetLocationRequest.getDefaultInstance() : getLocationRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public GetLocationRequestOrBuilder getGetLocationRequestOrBuilder() {
            GetLocationRequest getLocationRequest = this.getLocationRequest_;
            return getLocationRequest == null ? GetLocationRequest.getDefaultInstance() : getLocationRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public GetLocationResponse getGetLocationResponse() {
            GetLocationResponse getLocationResponse = this.getLocationResponse_;
            return getLocationResponse == null ? GetLocationResponse.getDefaultInstance() : getLocationResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public GetLocationResponseOrBuilder getGetLocationResponseOrBuilder() {
            GetLocationResponse getLocationResponse = this.getLocationResponse_;
            return getLocationResponse == null ? GetLocationResponse.getDefaultInstance() : getLocationResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public LocationUpdatedNotification getLocationUpdatedNotification() {
            LocationUpdatedNotification locationUpdatedNotification = this.locationUpdatedNotification_;
            return locationUpdatedNotification == null ? LocationUpdatedNotification.getDefaultInstance() : locationUpdatedNotification;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public LocationUpdatedNotificationOrBuilder getLocationUpdatedNotificationOrBuilder() {
            LocationUpdatedNotification locationUpdatedNotification = this.locationUpdatedNotification_;
            return locationUpdatedNotification == null ? LocationUpdatedNotification.getDefaultInstance() : locationUpdatedNotification;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public LocationUpdatedSetEnabledRequest getLocationUpdatedSetEnabledRequest() {
            LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest = this.locationUpdatedSetEnabledRequest_;
            return locationUpdatedSetEnabledRequest == null ? LocationUpdatedSetEnabledRequest.getDefaultInstance() : locationUpdatedSetEnabledRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public LocationUpdatedSetEnabledRequestOrBuilder getLocationUpdatedSetEnabledRequestOrBuilder() {
            LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest = this.locationUpdatedSetEnabledRequest_;
            return locationUpdatedSetEnabledRequest == null ? LocationUpdatedSetEnabledRequest.getDefaultInstance() : locationUpdatedSetEnabledRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public LocationUpdatedSetEnabledResponse getLocationUpdatedSetEnabledResponse() {
            LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse = this.locationUpdatedSetEnabledResponse_;
            return locationUpdatedSetEnabledResponse == null ? LocationUpdatedSetEnabledResponse.getDefaultInstance() : locationUpdatedSetEnabledResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public LocationUpdatedSetEnabledResponseOrBuilder getLocationUpdatedSetEnabledResponseOrBuilder() {
            LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse = this.locationUpdatedSetEnabledResponse_;
            return locationUpdatedSetEnabledResponse == null ? LocationUpdatedSetEnabledResponse.getDefaultInstance() : locationUpdatedSetEnabledResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CoreService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSyncRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSyncResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getGetLocationRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getGetLocationResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getLocationUpdatedSetEnabledRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getLocationUpdatedSetEnabledResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getLocationUpdatedNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getFeatureCapabilitiesRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getFeatureCapabilitiesResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getGarminGuidOverwriteRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getGarminGuidOverwriteResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getDualPairingRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getDualPairingResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getConnectionReadyNotification());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getCheckPendingSoftwareRequest());
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getCheckPendingSoftwareResponse());
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getTimeSyncRequest());
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getTimeSyncResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public SyncRequest getSyncRequest() {
            SyncRequest syncRequest = this.syncRequest_;
            return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public SyncRequestOrBuilder getSyncRequestOrBuilder() {
            SyncRequest syncRequest = this.syncRequest_;
            return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public SyncResponse getSyncResponse() {
            SyncResponse syncResponse = this.syncResponse_;
            return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public SyncResponseOrBuilder getSyncResponseOrBuilder() {
            SyncResponse syncResponse = this.syncResponse_;
            return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public TimeSyncRequest getTimeSyncRequest() {
            TimeSyncRequest timeSyncRequest = this.timeSyncRequest_;
            return timeSyncRequest == null ? TimeSyncRequest.getDefaultInstance() : timeSyncRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public TimeSyncRequestOrBuilder getTimeSyncRequestOrBuilder() {
            TimeSyncRequest timeSyncRequest = this.timeSyncRequest_;
            return timeSyncRequest == null ? TimeSyncRequest.getDefaultInstance() : timeSyncRequest;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public TimeSyncResponse getTimeSyncResponse() {
            TimeSyncResponse timeSyncResponse = this.timeSyncResponse_;
            return timeSyncResponse == null ? TimeSyncResponse.getDefaultInstance() : timeSyncResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public TimeSyncResponseOrBuilder getTimeSyncResponseOrBuilder() {
            TimeSyncResponse timeSyncResponse = this.timeSyncResponse_;
            return timeSyncResponse == null ? TimeSyncResponse.getDefaultInstance() : timeSyncResponse;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasCheckPendingSoftwareRequest() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasCheckPendingSoftwareResponse() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasConnectionReadyNotification() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasDualPairingRequest() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasDualPairingResponse() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasFeatureCapabilitiesRequest() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasFeatureCapabilitiesResponse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasGarminGuidOverwriteRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasGarminGuidOverwriteResponse() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasGetLocationRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasGetLocationResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasLocationUpdatedNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasLocationUpdatedSetEnabledRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasLocationUpdatedSetEnabledResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasSyncRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasSyncResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasTimeSyncRequest() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
        public boolean hasTimeSyncResponse() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSyncRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSyncRequest().hashCode();
            }
            if (hasSyncResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSyncResponse().hashCode();
            }
            if (hasGetLocationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getGetLocationRequest().hashCode();
            }
            if (hasGetLocationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getGetLocationResponse().hashCode();
            }
            if (hasLocationUpdatedSetEnabledRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getLocationUpdatedSetEnabledRequest().hashCode();
            }
            if (hasLocationUpdatedSetEnabledResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getLocationUpdatedSetEnabledResponse().hashCode();
            }
            if (hasLocationUpdatedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getLocationUpdatedNotification().hashCode();
            }
            if (hasFeatureCapabilitiesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getFeatureCapabilitiesRequest().hashCode();
            }
            if (hasFeatureCapabilitiesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getFeatureCapabilitiesResponse().hashCode();
            }
            if (hasGarminGuidOverwriteRequest()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getGarminGuidOverwriteRequest().hashCode();
            }
            if (hasGarminGuidOverwriteResponse()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getGarminGuidOverwriteResponse().hashCode();
            }
            if (hasDualPairingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getDualPairingRequest().hashCode();
            }
            if (hasDualPairingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getDualPairingResponse().hashCode();
            }
            if (hasConnectionReadyNotification()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getConnectionReadyNotification().hashCode();
            }
            if (hasCheckPendingSoftwareRequest()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getCheckPendingSoftwareRequest().hashCode();
            }
            if (hasCheckPendingSoftwareResponse()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getCheckPendingSoftwareResponse().hashCode();
            }
            if (hasTimeSyncRequest()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getTimeSyncRequest().hashCode();
            }
            if (hasTimeSyncResponse()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getTimeSyncResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_CoreService_fieldAccessorTable.ensureFieldAccessorsInitialized(CoreService.class, Builder.class);
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
            if (hasSyncResponse() && !getSyncResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGetLocationResponse() && !getGetLocationResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLocationUpdatedSetEnabledRequest() && !getLocationUpdatedSetEnabledRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLocationUpdatedSetEnabledResponse() && !getLocationUpdatedSetEnabledResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLocationUpdatedNotification() && !getLocationUpdatedNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFeatureCapabilitiesRequest() && !getFeatureCapabilitiesRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFeatureCapabilitiesResponse() && !getFeatureCapabilitiesResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGarminGuidOverwriteResponse() && !getGarminGuidOverwriteResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDualPairingResponse() && !getDualPairingResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCheckPendingSoftwareRequest() && !getCheckPendingSoftwareRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCheckPendingSoftwareResponse() || getCheckPendingSoftwareResponse().isInitialized()) {
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
            return new CoreService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSyncRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSyncResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getGetLocationRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getGetLocationResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getLocationUpdatedSetEnabledRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getLocationUpdatedSetEnabledResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getLocationUpdatedNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getFeatureCapabilitiesRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getFeatureCapabilitiesResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getGarminGuidOverwriteRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getGarminGuidOverwriteResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getDualPairingRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getDualPairingResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getConnectionReadyNotification());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getCheckPendingSoftwareRequest());
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeMessage(16, getCheckPendingSoftwareResponse());
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeMessage(17, getTimeSyncRequest());
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeMessage(18, getTimeSyncResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CoreServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> checkPendingSoftwareRequestBuilder_;
            private CheckPendingSoftwareRequest checkPendingSoftwareRequest_;
            private SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> checkPendingSoftwareResponseBuilder_;
            private CheckPendingSoftwareResponse checkPendingSoftwareResponse_;
            private SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> connectionReadyNotificationBuilder_;
            private ConnectionReadyNotification connectionReadyNotification_;
            private SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> dualPairingRequestBuilder_;
            private DualPairingRequest dualPairingRequest_;
            private SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> dualPairingResponseBuilder_;
            private DualPairingResponse dualPairingResponse_;
            private SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> featureCapabilitiesRequestBuilder_;
            private FeatureCapabilitiesRequest featureCapabilitiesRequest_;
            private SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> featureCapabilitiesResponseBuilder_;
            private FeatureCapabilitiesResponse featureCapabilitiesResponse_;
            private SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> garminGuidOverwriteRequestBuilder_;
            private GarminGuidOverwriteRequest garminGuidOverwriteRequest_;
            private SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> garminGuidOverwriteResponseBuilder_;
            private GarminGuidOverwriteResponse garminGuidOverwriteResponse_;
            private SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> getLocationRequestBuilder_;
            private GetLocationRequest getLocationRequest_;
            private SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> getLocationResponseBuilder_;
            private GetLocationResponse getLocationResponse_;
            private SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> locationUpdatedNotificationBuilder_;
            private LocationUpdatedNotification locationUpdatedNotification_;
            private SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> locationUpdatedSetEnabledRequestBuilder_;
            private LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest_;
            private SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> locationUpdatedSetEnabledResponseBuilder_;
            private LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse_;
            private SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> syncRequestBuilder_;
            private SyncRequest syncRequest_;
            private SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> syncResponseBuilder_;
            private SyncResponse syncResponse_;
            private SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> timeSyncRequestBuilder_;
            private TimeSyncRequest timeSyncRequest_;
            private SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> timeSyncResponseBuilder_;
            private TimeSyncResponse timeSyncResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CoreService coreService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                    coreService.syncRequest_ = singleFieldBuilderV3 == null ? this.syncRequest_ : (SyncRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV4 = this.syncResponseBuilder_;
                    coreService.syncResponse_ = singleFieldBuilderV4 == null ? this.syncResponse_ : (SyncResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> singleFieldBuilderV5 = this.getLocationRequestBuilder_;
                    coreService.getLocationRequest_ = singleFieldBuilderV5 == null ? this.getLocationRequest_ : (GetLocationRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> singleFieldBuilderV6 = this.getLocationResponseBuilder_;
                    coreService.getLocationResponse_ = singleFieldBuilderV6 == null ? this.getLocationResponse_ : (GetLocationResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> singleFieldBuilderV7 = this.locationUpdatedSetEnabledRequestBuilder_;
                    coreService.locationUpdatedSetEnabledRequest_ = singleFieldBuilderV7 == null ? this.locationUpdatedSetEnabledRequest_ : (LocationUpdatedSetEnabledRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> singleFieldBuilderV8 = this.locationUpdatedSetEnabledResponseBuilder_;
                    coreService.locationUpdatedSetEnabledResponse_ = singleFieldBuilderV8 == null ? this.locationUpdatedSetEnabledResponse_ : (LocationUpdatedSetEnabledResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> singleFieldBuilderV9 = this.locationUpdatedNotificationBuilder_;
                    coreService.locationUpdatedNotification_ = singleFieldBuilderV9 == null ? this.locationUpdatedNotification_ : (LocationUpdatedNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> singleFieldBuilderV10 = this.featureCapabilitiesRequestBuilder_;
                    coreService.featureCapabilitiesRequest_ = singleFieldBuilderV10 == null ? this.featureCapabilitiesRequest_ : (FeatureCapabilitiesRequest) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> singleFieldBuilderV11 = this.featureCapabilitiesResponseBuilder_;
                    coreService.featureCapabilitiesResponse_ = singleFieldBuilderV11 == null ? this.featureCapabilitiesResponse_ : (FeatureCapabilitiesResponse) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> singleFieldBuilderV12 = this.garminGuidOverwriteRequestBuilder_;
                    coreService.garminGuidOverwriteRequest_ = singleFieldBuilderV12 == null ? this.garminGuidOverwriteRequest_ : (GarminGuidOverwriteRequest) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> singleFieldBuilderV13 = this.garminGuidOverwriteResponseBuilder_;
                    coreService.garminGuidOverwriteResponse_ = singleFieldBuilderV13 == null ? this.garminGuidOverwriteResponse_ : (GarminGuidOverwriteResponse) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> singleFieldBuilderV14 = this.dualPairingRequestBuilder_;
                    coreService.dualPairingRequest_ = singleFieldBuilderV14 == null ? this.dualPairingRequest_ : (DualPairingRequest) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> singleFieldBuilderV15 = this.dualPairingResponseBuilder_;
                    coreService.dualPairingResponse_ = singleFieldBuilderV15 == null ? this.dualPairingResponse_ : (DualPairingResponse) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> singleFieldBuilderV16 = this.connectionReadyNotificationBuilder_;
                    coreService.connectionReadyNotification_ = singleFieldBuilderV16 == null ? this.connectionReadyNotification_ : (ConnectionReadyNotification) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> singleFieldBuilderV17 = this.checkPendingSoftwareRequestBuilder_;
                    coreService.checkPendingSoftwareRequest_ = singleFieldBuilderV17 == null ? this.checkPendingSoftwareRequest_ : (CheckPendingSoftwareRequest) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> singleFieldBuilderV18 = this.checkPendingSoftwareResponseBuilder_;
                    coreService.checkPendingSoftwareResponse_ = singleFieldBuilderV18 == null ? this.checkPendingSoftwareResponse_ : (CheckPendingSoftwareResponse) singleFieldBuilderV18.build();
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> singleFieldBuilderV19 = this.timeSyncRequestBuilder_;
                    coreService.timeSyncRequest_ = singleFieldBuilderV19 == null ? this.timeSyncRequest_ : (TimeSyncRequest) singleFieldBuilderV19.build();
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> singleFieldBuilderV20 = this.timeSyncResponseBuilder_;
                    coreService.timeSyncResponse_ = singleFieldBuilderV20 == null ? this.timeSyncResponse_ : (TimeSyncResponse) singleFieldBuilderV20.build();
                    i14 |= 131072;
                }
                coreService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> getCheckPendingSoftwareRequestFieldBuilder() {
                if (this.checkPendingSoftwareRequestBuilder_ == null) {
                    this.checkPendingSoftwareRequestBuilder_ = new SingleFieldBuilderV3<>(getCheckPendingSoftwareRequest(), getParentForChildren(), isClean());
                    this.checkPendingSoftwareRequest_ = null;
                }
                return this.checkPendingSoftwareRequestBuilder_;
            }

            private SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> getCheckPendingSoftwareResponseFieldBuilder() {
                if (this.checkPendingSoftwareResponseBuilder_ == null) {
                    this.checkPendingSoftwareResponseBuilder_ = new SingleFieldBuilderV3<>(getCheckPendingSoftwareResponse(), getParentForChildren(), isClean());
                    this.checkPendingSoftwareResponse_ = null;
                }
                return this.checkPendingSoftwareResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> getConnectionReadyNotificationFieldBuilder() {
                if (this.connectionReadyNotificationBuilder_ == null) {
                    this.connectionReadyNotificationBuilder_ = new SingleFieldBuilderV3<>(getConnectionReadyNotification(), getParentForChildren(), isClean());
                    this.connectionReadyNotification_ = null;
                }
                return this.connectionReadyNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_CoreService_descriptor;
            }

            private SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> getDualPairingRequestFieldBuilder() {
                if (this.dualPairingRequestBuilder_ == null) {
                    this.dualPairingRequestBuilder_ = new SingleFieldBuilderV3<>(getDualPairingRequest(), getParentForChildren(), isClean());
                    this.dualPairingRequest_ = null;
                }
                return this.dualPairingRequestBuilder_;
            }

            private SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> getDualPairingResponseFieldBuilder() {
                if (this.dualPairingResponseBuilder_ == null) {
                    this.dualPairingResponseBuilder_ = new SingleFieldBuilderV3<>(getDualPairingResponse(), getParentForChildren(), isClean());
                    this.dualPairingResponse_ = null;
                }
                return this.dualPairingResponseBuilder_;
            }

            private SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> getFeatureCapabilitiesRequestFieldBuilder() {
                if (this.featureCapabilitiesRequestBuilder_ == null) {
                    this.featureCapabilitiesRequestBuilder_ = new SingleFieldBuilderV3<>(getFeatureCapabilitiesRequest(), getParentForChildren(), isClean());
                    this.featureCapabilitiesRequest_ = null;
                }
                return this.featureCapabilitiesRequestBuilder_;
            }

            private SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> getFeatureCapabilitiesResponseFieldBuilder() {
                if (this.featureCapabilitiesResponseBuilder_ == null) {
                    this.featureCapabilitiesResponseBuilder_ = new SingleFieldBuilderV3<>(getFeatureCapabilitiesResponse(), getParentForChildren(), isClean());
                    this.featureCapabilitiesResponse_ = null;
                }
                return this.featureCapabilitiesResponseBuilder_;
            }

            private SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> getGarminGuidOverwriteRequestFieldBuilder() {
                if (this.garminGuidOverwriteRequestBuilder_ == null) {
                    this.garminGuidOverwriteRequestBuilder_ = new SingleFieldBuilderV3<>(getGarminGuidOverwriteRequest(), getParentForChildren(), isClean());
                    this.garminGuidOverwriteRequest_ = null;
                }
                return this.garminGuidOverwriteRequestBuilder_;
            }

            private SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> getGarminGuidOverwriteResponseFieldBuilder() {
                if (this.garminGuidOverwriteResponseBuilder_ == null) {
                    this.garminGuidOverwriteResponseBuilder_ = new SingleFieldBuilderV3<>(getGarminGuidOverwriteResponse(), getParentForChildren(), isClean());
                    this.garminGuidOverwriteResponse_ = null;
                }
                return this.garminGuidOverwriteResponseBuilder_;
            }

            private SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> getGetLocationRequestFieldBuilder() {
                if (this.getLocationRequestBuilder_ == null) {
                    this.getLocationRequestBuilder_ = new SingleFieldBuilderV3<>(getGetLocationRequest(), getParentForChildren(), isClean());
                    this.getLocationRequest_ = null;
                }
                return this.getLocationRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> getGetLocationResponseFieldBuilder() {
                if (this.getLocationResponseBuilder_ == null) {
                    this.getLocationResponseBuilder_ = new SingleFieldBuilderV3<>(getGetLocationResponse(), getParentForChildren(), isClean());
                    this.getLocationResponse_ = null;
                }
                return this.getLocationResponseBuilder_;
            }

            private SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> getLocationUpdatedNotificationFieldBuilder() {
                if (this.locationUpdatedNotificationBuilder_ == null) {
                    this.locationUpdatedNotificationBuilder_ = new SingleFieldBuilderV3<>(getLocationUpdatedNotification(), getParentForChildren(), isClean());
                    this.locationUpdatedNotification_ = null;
                }
                return this.locationUpdatedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> getLocationUpdatedSetEnabledRequestFieldBuilder() {
                if (this.locationUpdatedSetEnabledRequestBuilder_ == null) {
                    this.locationUpdatedSetEnabledRequestBuilder_ = new SingleFieldBuilderV3<>(getLocationUpdatedSetEnabledRequest(), getParentForChildren(), isClean());
                    this.locationUpdatedSetEnabledRequest_ = null;
                }
                return this.locationUpdatedSetEnabledRequestBuilder_;
            }

            private SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> getLocationUpdatedSetEnabledResponseFieldBuilder() {
                if (this.locationUpdatedSetEnabledResponseBuilder_ == null) {
                    this.locationUpdatedSetEnabledResponseBuilder_ = new SingleFieldBuilderV3<>(getLocationUpdatedSetEnabledResponse(), getParentForChildren(), isClean());
                    this.locationUpdatedSetEnabledResponse_ = null;
                }
                return this.locationUpdatedSetEnabledResponseBuilder_;
            }

            private SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> getSyncRequestFieldBuilder() {
                if (this.syncRequestBuilder_ == null) {
                    this.syncRequestBuilder_ = new SingleFieldBuilderV3<>(getSyncRequest(), getParentForChildren(), isClean());
                    this.syncRequest_ = null;
                }
                return this.syncRequestBuilder_;
            }

            private SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> getSyncResponseFieldBuilder() {
                if (this.syncResponseBuilder_ == null) {
                    this.syncResponseBuilder_ = new SingleFieldBuilderV3<>(getSyncResponse(), getParentForChildren(), isClean());
                    this.syncResponse_ = null;
                }
                return this.syncResponseBuilder_;
            }

            private SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> getTimeSyncRequestFieldBuilder() {
                if (this.timeSyncRequestBuilder_ == null) {
                    this.timeSyncRequestBuilder_ = new SingleFieldBuilderV3<>(getTimeSyncRequest(), getParentForChildren(), isClean());
                    this.timeSyncRequest_ = null;
                }
                return this.timeSyncRequestBuilder_;
            }

            private SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> getTimeSyncResponseFieldBuilder() {
                if (this.timeSyncResponseBuilder_ == null) {
                    this.timeSyncResponseBuilder_ = new SingleFieldBuilderV3<>(getTimeSyncResponse(), getParentForChildren(), isClean());
                    this.timeSyncResponse_ = null;
                }
                return this.timeSyncResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSyncRequestFieldBuilder();
                    getSyncResponseFieldBuilder();
                    getGetLocationRequestFieldBuilder();
                    getGetLocationResponseFieldBuilder();
                    getLocationUpdatedSetEnabledRequestFieldBuilder();
                    getLocationUpdatedSetEnabledResponseFieldBuilder();
                    getLocationUpdatedNotificationFieldBuilder();
                    getFeatureCapabilitiesRequestFieldBuilder();
                    getFeatureCapabilitiesResponseFieldBuilder();
                    getGarminGuidOverwriteRequestFieldBuilder();
                    getGarminGuidOverwriteResponseFieldBuilder();
                    getDualPairingRequestFieldBuilder();
                    getDualPairingResponseFieldBuilder();
                    getConnectionReadyNotificationFieldBuilder();
                    getCheckPendingSoftwareRequestFieldBuilder();
                    getCheckPendingSoftwareResponseFieldBuilder();
                    getTimeSyncRequestFieldBuilder();
                    getTimeSyncResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CoreService build() {
                CoreService coreServiceBuildPartial = buildPartial();
                if (coreServiceBuildPartial.isInitialized()) {
                    return coreServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) coreServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CoreService buildPartial() {
                CoreService coreService = new CoreService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(coreService);
                }
                onBuilt();
                return coreService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.syncRequest_ = null;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncRequestBuilder_ = null;
                }
                this.syncResponse_ = null;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV4 = this.syncResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.syncResponseBuilder_ = null;
                }
                this.getLocationRequest_ = null;
                SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> singleFieldBuilderV5 = this.getLocationRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.getLocationRequestBuilder_ = null;
                }
                this.getLocationResponse_ = null;
                SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> singleFieldBuilderV6 = this.getLocationResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.getLocationResponseBuilder_ = null;
                }
                this.locationUpdatedSetEnabledRequest_ = null;
                SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> singleFieldBuilderV7 = this.locationUpdatedSetEnabledRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.locationUpdatedSetEnabledRequestBuilder_ = null;
                }
                this.locationUpdatedSetEnabledResponse_ = null;
                SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> singleFieldBuilderV8 = this.locationUpdatedSetEnabledResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.locationUpdatedSetEnabledResponseBuilder_ = null;
                }
                this.locationUpdatedNotification_ = null;
                SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> singleFieldBuilderV9 = this.locationUpdatedNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.locationUpdatedNotificationBuilder_ = null;
                }
                this.featureCapabilitiesRequest_ = null;
                SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> singleFieldBuilderV10 = this.featureCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.featureCapabilitiesRequestBuilder_ = null;
                }
                this.featureCapabilitiesResponse_ = null;
                SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> singleFieldBuilderV11 = this.featureCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.featureCapabilitiesResponseBuilder_ = null;
                }
                this.garminGuidOverwriteRequest_ = null;
                SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> singleFieldBuilderV12 = this.garminGuidOverwriteRequestBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.garminGuidOverwriteRequestBuilder_ = null;
                }
                this.garminGuidOverwriteResponse_ = null;
                SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> singleFieldBuilderV13 = this.garminGuidOverwriteResponseBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.garminGuidOverwriteResponseBuilder_ = null;
                }
                this.dualPairingRequest_ = null;
                SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> singleFieldBuilderV14 = this.dualPairingRequestBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.dualPairingRequestBuilder_ = null;
                }
                this.dualPairingResponse_ = null;
                SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> singleFieldBuilderV15 = this.dualPairingResponseBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.dualPairingResponseBuilder_ = null;
                }
                this.connectionReadyNotification_ = null;
                SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> singleFieldBuilderV16 = this.connectionReadyNotificationBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.connectionReadyNotificationBuilder_ = null;
                }
                this.checkPendingSoftwareRequest_ = null;
                SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> singleFieldBuilderV17 = this.checkPendingSoftwareRequestBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.checkPendingSoftwareRequestBuilder_ = null;
                }
                this.checkPendingSoftwareResponse_ = null;
                SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> singleFieldBuilderV18 = this.checkPendingSoftwareResponseBuilder_;
                if (singleFieldBuilderV18 != null) {
                    singleFieldBuilderV18.dispose();
                    this.checkPendingSoftwareResponseBuilder_ = null;
                }
                this.timeSyncRequest_ = null;
                SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> singleFieldBuilderV19 = this.timeSyncRequestBuilder_;
                if (singleFieldBuilderV19 != null) {
                    singleFieldBuilderV19.dispose();
                    this.timeSyncRequestBuilder_ = null;
                }
                this.timeSyncResponse_ = null;
                SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> singleFieldBuilderV20 = this.timeSyncResponseBuilder_;
                if (singleFieldBuilderV20 != null) {
                    singleFieldBuilderV20.dispose();
                    this.timeSyncResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearCheckPendingSoftwareRequest() {
                this.bitField0_ &= -16385;
                this.checkPendingSoftwareRequest_ = null;
                SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.checkPendingSoftwareRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCheckPendingSoftwareResponse() {
                this.bitField0_ &= -32769;
                this.checkPendingSoftwareResponse_ = null;
                SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.checkPendingSoftwareResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectionReadyNotification() {
                this.bitField0_ &= -8193;
                this.connectionReadyNotification_ = null;
                SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> singleFieldBuilderV3 = this.connectionReadyNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionReadyNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDualPairingRequest() {
                this.bitField0_ &= -2049;
                this.dualPairingRequest_ = null;
                SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> singleFieldBuilderV3 = this.dualPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dualPairingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDualPairingResponse() {
                this.bitField0_ &= -4097;
                this.dualPairingResponse_ = null;
                SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> singleFieldBuilderV3 = this.dualPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dualPairingResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFeatureCapabilitiesRequest() {
                this.bitField0_ &= -129;
                this.featureCapabilitiesRequest_ = null;
                SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.featureCapabilitiesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFeatureCapabilitiesResponse() {
                this.bitField0_ &= -257;
                this.featureCapabilitiesResponse_ = null;
                SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.featureCapabilitiesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGarminGuidOverwriteRequest() {
                this.bitField0_ &= -513;
                this.garminGuidOverwriteRequest_ = null;
                SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.garminGuidOverwriteRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGarminGuidOverwriteResponse() {
                this.bitField0_ &= -1025;
                this.garminGuidOverwriteResponse_ = null;
                SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.garminGuidOverwriteResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetLocationRequest() {
                this.bitField0_ &= -5;
                this.getLocationRequest_ = null;
                SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLocationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLocationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetLocationResponse() {
                this.bitField0_ &= -9;
                this.getLocationResponse_ = null;
                SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLocationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLocationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLocationUpdatedNotification() {
                this.bitField0_ &= -65;
                this.locationUpdatedNotification_ = null;
                SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.locationUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationUpdatedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLocationUpdatedSetEnabledRequest() {
                this.bitField0_ &= -17;
                this.locationUpdatedSetEnabledRequest_ = null;
                SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationUpdatedSetEnabledRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLocationUpdatedSetEnabledResponse() {
                this.bitField0_ &= -33;
                this.locationUpdatedSetEnabledResponse_ = null;
                SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationUpdatedSetEnabledResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSyncRequest() {
                this.bitField0_ &= -2;
                this.syncRequest_ = null;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSyncResponse() {
                this.bitField0_ &= -3;
                this.syncResponse_ = null;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTimeSyncRequest() {
                this.bitField0_ &= -65537;
                this.timeSyncRequest_ = null;
                SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> singleFieldBuilderV3 = this.timeSyncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.timeSyncRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTimeSyncResponse() {
                this.bitField0_ &= -131073;
                this.timeSyncResponse_ = null;
                SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> singleFieldBuilderV3 = this.timeSyncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.timeSyncResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public CheckPendingSoftwareRequest getCheckPendingSoftwareRequest() {
                SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckPendingSoftwareRequest) singleFieldBuilderV3.getMessage();
                }
                CheckPendingSoftwareRequest checkPendingSoftwareRequest = this.checkPendingSoftwareRequest_;
                return checkPendingSoftwareRequest == null ? CheckPendingSoftwareRequest.getDefaultInstance() : checkPendingSoftwareRequest;
            }

            public CheckPendingSoftwareRequest.Builder getCheckPendingSoftwareRequestBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (CheckPendingSoftwareRequest.Builder) getCheckPendingSoftwareRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public CheckPendingSoftwareRequestOrBuilder getCheckPendingSoftwareRequestOrBuilder() {
                SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckPendingSoftwareRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CheckPendingSoftwareRequest checkPendingSoftwareRequest = this.checkPendingSoftwareRequest_;
                return checkPendingSoftwareRequest == null ? CheckPendingSoftwareRequest.getDefaultInstance() : checkPendingSoftwareRequest;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public CheckPendingSoftwareResponse getCheckPendingSoftwareResponse() {
                SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckPendingSoftwareResponse) singleFieldBuilderV3.getMessage();
                }
                CheckPendingSoftwareResponse checkPendingSoftwareResponse = this.checkPendingSoftwareResponse_;
                return checkPendingSoftwareResponse == null ? CheckPendingSoftwareResponse.getDefaultInstance() : checkPendingSoftwareResponse;
            }

            public CheckPendingSoftwareResponse.Builder getCheckPendingSoftwareResponseBuilder() {
                this.bitField0_ |= 32768;
                onChanged();
                return (CheckPendingSoftwareResponse.Builder) getCheckPendingSoftwareResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public CheckPendingSoftwareResponseOrBuilder getCheckPendingSoftwareResponseOrBuilder() {
                SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckPendingSoftwareResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CheckPendingSoftwareResponse checkPendingSoftwareResponse = this.checkPendingSoftwareResponse_;
                return checkPendingSoftwareResponse == null ? CheckPendingSoftwareResponse.getDefaultInstance() : checkPendingSoftwareResponse;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public ConnectionReadyNotification getConnectionReadyNotification() {
                SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> singleFieldBuilderV3 = this.connectionReadyNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionReadyNotification) singleFieldBuilderV3.getMessage();
                }
                ConnectionReadyNotification connectionReadyNotification = this.connectionReadyNotification_;
                return connectionReadyNotification == null ? ConnectionReadyNotification.getDefaultInstance() : connectionReadyNotification;
            }

            public ConnectionReadyNotification.Builder getConnectionReadyNotificationBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (ConnectionReadyNotification.Builder) getConnectionReadyNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public ConnectionReadyNotificationOrBuilder getConnectionReadyNotificationOrBuilder() {
                SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> singleFieldBuilderV3 = this.connectionReadyNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionReadyNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectionReadyNotification connectionReadyNotification = this.connectionReadyNotification_;
                return connectionReadyNotification == null ? ConnectionReadyNotification.getDefaultInstance() : connectionReadyNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICore.internal_static_GDI_Proto_Core_CoreService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public DualPairingRequest getDualPairingRequest() {
                SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> singleFieldBuilderV3 = this.dualPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DualPairingRequest) singleFieldBuilderV3.getMessage();
                }
                DualPairingRequest dualPairingRequest = this.dualPairingRequest_;
                return dualPairingRequest == null ? DualPairingRequest.getDefaultInstance() : dualPairingRequest;
            }

            public DualPairingRequest.Builder getDualPairingRequestBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (DualPairingRequest.Builder) getDualPairingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public DualPairingRequestOrBuilder getDualPairingRequestOrBuilder() {
                SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> singleFieldBuilderV3 = this.dualPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DualPairingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DualPairingRequest dualPairingRequest = this.dualPairingRequest_;
                return dualPairingRequest == null ? DualPairingRequest.getDefaultInstance() : dualPairingRequest;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public DualPairingResponse getDualPairingResponse() {
                SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> singleFieldBuilderV3 = this.dualPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DualPairingResponse) singleFieldBuilderV3.getMessage();
                }
                DualPairingResponse dualPairingResponse = this.dualPairingResponse_;
                return dualPairingResponse == null ? DualPairingResponse.getDefaultInstance() : dualPairingResponse;
            }

            public DualPairingResponse.Builder getDualPairingResponseBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (DualPairingResponse.Builder) getDualPairingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public DualPairingResponseOrBuilder getDualPairingResponseOrBuilder() {
                SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> singleFieldBuilderV3 = this.dualPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DualPairingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DualPairingResponse dualPairingResponse = this.dualPairingResponse_;
                return dualPairingResponse == null ? DualPairingResponse.getDefaultInstance() : dualPairingResponse;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public FeatureCapabilitiesRequest getFeatureCapabilitiesRequest() {
                SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureCapabilitiesRequest) singleFieldBuilderV3.getMessage();
                }
                FeatureCapabilitiesRequest featureCapabilitiesRequest = this.featureCapabilitiesRequest_;
                return featureCapabilitiesRequest == null ? FeatureCapabilitiesRequest.getDefaultInstance() : featureCapabilitiesRequest;
            }

            public FeatureCapabilitiesRequest.Builder getFeatureCapabilitiesRequestBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (FeatureCapabilitiesRequest.Builder) getFeatureCapabilitiesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public FeatureCapabilitiesRequestOrBuilder getFeatureCapabilitiesRequestOrBuilder() {
                SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureCapabilitiesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FeatureCapabilitiesRequest featureCapabilitiesRequest = this.featureCapabilitiesRequest_;
                return featureCapabilitiesRequest == null ? FeatureCapabilitiesRequest.getDefaultInstance() : featureCapabilitiesRequest;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public FeatureCapabilitiesResponse getFeatureCapabilitiesResponse() {
                SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureCapabilitiesResponse) singleFieldBuilderV3.getMessage();
                }
                FeatureCapabilitiesResponse featureCapabilitiesResponse = this.featureCapabilitiesResponse_;
                return featureCapabilitiesResponse == null ? FeatureCapabilitiesResponse.getDefaultInstance() : featureCapabilitiesResponse;
            }

            public FeatureCapabilitiesResponse.Builder getFeatureCapabilitiesResponseBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (FeatureCapabilitiesResponse.Builder) getFeatureCapabilitiesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public FeatureCapabilitiesResponseOrBuilder getFeatureCapabilitiesResponseOrBuilder() {
                SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureCapabilitiesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FeatureCapabilitiesResponse featureCapabilitiesResponse = this.featureCapabilitiesResponse_;
                return featureCapabilitiesResponse == null ? FeatureCapabilitiesResponse.getDefaultInstance() : featureCapabilitiesResponse;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public GarminGuidOverwriteRequest getGarminGuidOverwriteRequest() {
                SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GarminGuidOverwriteRequest) singleFieldBuilderV3.getMessage();
                }
                GarminGuidOverwriteRequest garminGuidOverwriteRequest = this.garminGuidOverwriteRequest_;
                return garminGuidOverwriteRequest == null ? GarminGuidOverwriteRequest.getDefaultInstance() : garminGuidOverwriteRequest;
            }

            public GarminGuidOverwriteRequest.Builder getGarminGuidOverwriteRequestBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (GarminGuidOverwriteRequest.Builder) getGarminGuidOverwriteRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public GarminGuidOverwriteRequestOrBuilder getGarminGuidOverwriteRequestOrBuilder() {
                SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GarminGuidOverwriteRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GarminGuidOverwriteRequest garminGuidOverwriteRequest = this.garminGuidOverwriteRequest_;
                return garminGuidOverwriteRequest == null ? GarminGuidOverwriteRequest.getDefaultInstance() : garminGuidOverwriteRequest;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public GarminGuidOverwriteResponse getGarminGuidOverwriteResponse() {
                SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GarminGuidOverwriteResponse) singleFieldBuilderV3.getMessage();
                }
                GarminGuidOverwriteResponse garminGuidOverwriteResponse = this.garminGuidOverwriteResponse_;
                return garminGuidOverwriteResponse == null ? GarminGuidOverwriteResponse.getDefaultInstance() : garminGuidOverwriteResponse;
            }

            public GarminGuidOverwriteResponse.Builder getGarminGuidOverwriteResponseBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (GarminGuidOverwriteResponse.Builder) getGarminGuidOverwriteResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public GarminGuidOverwriteResponseOrBuilder getGarminGuidOverwriteResponseOrBuilder() {
                SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GarminGuidOverwriteResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GarminGuidOverwriteResponse garminGuidOverwriteResponse = this.garminGuidOverwriteResponse_;
                return garminGuidOverwriteResponse == null ? GarminGuidOverwriteResponse.getDefaultInstance() : garminGuidOverwriteResponse;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public GetLocationRequest getGetLocationRequest() {
                SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLocationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLocationRequest) singleFieldBuilderV3.getMessage();
                }
                GetLocationRequest getLocationRequest = this.getLocationRequest_;
                return getLocationRequest == null ? GetLocationRequest.getDefaultInstance() : getLocationRequest;
            }

            public GetLocationRequest.Builder getGetLocationRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GetLocationRequest.Builder) getGetLocationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public GetLocationRequestOrBuilder getGetLocationRequestOrBuilder() {
                SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLocationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLocationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetLocationRequest getLocationRequest = this.getLocationRequest_;
                return getLocationRequest == null ? GetLocationRequest.getDefaultInstance() : getLocationRequest;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public GetLocationResponse getGetLocationResponse() {
                SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLocationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLocationResponse) singleFieldBuilderV3.getMessage();
                }
                GetLocationResponse getLocationResponse = this.getLocationResponse_;
                return getLocationResponse == null ? GetLocationResponse.getDefaultInstance() : getLocationResponse;
            }

            public GetLocationResponse.Builder getGetLocationResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GetLocationResponse.Builder) getGetLocationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public GetLocationResponseOrBuilder getGetLocationResponseOrBuilder() {
                SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLocationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLocationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetLocationResponse getLocationResponse = this.getLocationResponse_;
                return getLocationResponse == null ? GetLocationResponse.getDefaultInstance() : getLocationResponse;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public LocationUpdatedNotification getLocationUpdatedNotification() {
                SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.locationUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationUpdatedNotification) singleFieldBuilderV3.getMessage();
                }
                LocationUpdatedNotification locationUpdatedNotification = this.locationUpdatedNotification_;
                return locationUpdatedNotification == null ? LocationUpdatedNotification.getDefaultInstance() : locationUpdatedNotification;
            }

            public LocationUpdatedNotification.Builder getLocationUpdatedNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (LocationUpdatedNotification.Builder) getLocationUpdatedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public LocationUpdatedNotificationOrBuilder getLocationUpdatedNotificationOrBuilder() {
                SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.locationUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationUpdatedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LocationUpdatedNotification locationUpdatedNotification = this.locationUpdatedNotification_;
                return locationUpdatedNotification == null ? LocationUpdatedNotification.getDefaultInstance() : locationUpdatedNotification;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public LocationUpdatedSetEnabledRequest getLocationUpdatedSetEnabledRequest() {
                SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationUpdatedSetEnabledRequest) singleFieldBuilderV3.getMessage();
                }
                LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest = this.locationUpdatedSetEnabledRequest_;
                return locationUpdatedSetEnabledRequest == null ? LocationUpdatedSetEnabledRequest.getDefaultInstance() : locationUpdatedSetEnabledRequest;
            }

            public LocationUpdatedSetEnabledRequest.Builder getLocationUpdatedSetEnabledRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (LocationUpdatedSetEnabledRequest.Builder) getLocationUpdatedSetEnabledRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public LocationUpdatedSetEnabledRequestOrBuilder getLocationUpdatedSetEnabledRequestOrBuilder() {
                SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationUpdatedSetEnabledRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest = this.locationUpdatedSetEnabledRequest_;
                return locationUpdatedSetEnabledRequest == null ? LocationUpdatedSetEnabledRequest.getDefaultInstance() : locationUpdatedSetEnabledRequest;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public LocationUpdatedSetEnabledResponse getLocationUpdatedSetEnabledResponse() {
                SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationUpdatedSetEnabledResponse) singleFieldBuilderV3.getMessage();
                }
                LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse = this.locationUpdatedSetEnabledResponse_;
                return locationUpdatedSetEnabledResponse == null ? LocationUpdatedSetEnabledResponse.getDefaultInstance() : locationUpdatedSetEnabledResponse;
            }

            public LocationUpdatedSetEnabledResponse.Builder getLocationUpdatedSetEnabledResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (LocationUpdatedSetEnabledResponse.Builder) getLocationUpdatedSetEnabledResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public LocationUpdatedSetEnabledResponseOrBuilder getLocationUpdatedSetEnabledResponseOrBuilder() {
                SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationUpdatedSetEnabledResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse = this.locationUpdatedSetEnabledResponse_;
                return locationUpdatedSetEnabledResponse == null ? LocationUpdatedSetEnabledResponse.getDefaultInstance() : locationUpdatedSetEnabledResponse;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public SyncRequest getSyncRequest() {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequest) singleFieldBuilderV3.getMessage();
                }
                SyncRequest syncRequest = this.syncRequest_;
                return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
            }

            public SyncRequest.Builder getSyncRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SyncRequest.Builder) getSyncRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public SyncRequestOrBuilder getSyncRequestOrBuilder() {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequest syncRequest = this.syncRequest_;
                return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public SyncResponse getSyncResponse() {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncResponse) singleFieldBuilderV3.getMessage();
                }
                SyncResponse syncResponse = this.syncResponse_;
                return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
            }

            public SyncResponse.Builder getSyncResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SyncResponse.Builder) getSyncResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public SyncResponseOrBuilder getSyncResponseOrBuilder() {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncResponse syncResponse = this.syncResponse_;
                return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public TimeSyncRequest getTimeSyncRequest() {
                SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> singleFieldBuilderV3 = this.timeSyncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimeSyncRequest) singleFieldBuilderV3.getMessage();
                }
                TimeSyncRequest timeSyncRequest = this.timeSyncRequest_;
                return timeSyncRequest == null ? TimeSyncRequest.getDefaultInstance() : timeSyncRequest;
            }

            public TimeSyncRequest.Builder getTimeSyncRequestBuilder() {
                this.bitField0_ |= 65536;
                onChanged();
                return (TimeSyncRequest.Builder) getTimeSyncRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public TimeSyncRequestOrBuilder getTimeSyncRequestOrBuilder() {
                SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> singleFieldBuilderV3 = this.timeSyncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimeSyncRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TimeSyncRequest timeSyncRequest = this.timeSyncRequest_;
                return timeSyncRequest == null ? TimeSyncRequest.getDefaultInstance() : timeSyncRequest;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public TimeSyncResponse getTimeSyncResponse() {
                SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> singleFieldBuilderV3 = this.timeSyncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimeSyncResponse) singleFieldBuilderV3.getMessage();
                }
                TimeSyncResponse timeSyncResponse = this.timeSyncResponse_;
                return timeSyncResponse == null ? TimeSyncResponse.getDefaultInstance() : timeSyncResponse;
            }

            public TimeSyncResponse.Builder getTimeSyncResponseBuilder() {
                this.bitField0_ |= 131072;
                onChanged();
                return (TimeSyncResponse.Builder) getTimeSyncResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public TimeSyncResponseOrBuilder getTimeSyncResponseOrBuilder() {
                SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> singleFieldBuilderV3 = this.timeSyncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimeSyncResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TimeSyncResponse timeSyncResponse = this.timeSyncResponse_;
                return timeSyncResponse == null ? TimeSyncResponse.getDefaultInstance() : timeSyncResponse;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasCheckPendingSoftwareRequest() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasCheckPendingSoftwareResponse() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasConnectionReadyNotification() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasDualPairingRequest() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasDualPairingResponse() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasFeatureCapabilitiesRequest() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasFeatureCapabilitiesResponse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasGarminGuidOverwriteRequest() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasGarminGuidOverwriteResponse() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasGetLocationRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasGetLocationResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasLocationUpdatedNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasLocationUpdatedSetEnabledRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasLocationUpdatedSetEnabledResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasSyncRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasSyncResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasTimeSyncRequest() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.CoreServiceOrBuilder
            public boolean hasTimeSyncResponse() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_CoreService_fieldAccessorTable.ensureFieldAccessorsInitialized(CoreService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSyncResponse() && !getSyncResponse().isInitialized()) {
                    return false;
                }
                if (hasGetLocationResponse() && !getGetLocationResponse().isInitialized()) {
                    return false;
                }
                if (hasLocationUpdatedSetEnabledRequest() && !getLocationUpdatedSetEnabledRequest().isInitialized()) {
                    return false;
                }
                if (hasLocationUpdatedSetEnabledResponse() && !getLocationUpdatedSetEnabledResponse().isInitialized()) {
                    return false;
                }
                if (hasLocationUpdatedNotification() && !getLocationUpdatedNotification().isInitialized()) {
                    return false;
                }
                if (hasFeatureCapabilitiesRequest() && !getFeatureCapabilitiesRequest().isInitialized()) {
                    return false;
                }
                if (hasFeatureCapabilitiesResponse() && !getFeatureCapabilitiesResponse().isInitialized()) {
                    return false;
                }
                if (hasGarminGuidOverwriteResponse() && !getGarminGuidOverwriteResponse().isInitialized()) {
                    return false;
                }
                if (hasDualPairingResponse() && !getDualPairingResponse().isInitialized()) {
                    return false;
                }
                if (!hasCheckPendingSoftwareRequest() || getCheckPendingSoftwareRequest().isInitialized()) {
                    return !hasCheckPendingSoftwareResponse() || getCheckPendingSoftwareResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeCheckPendingSoftwareRequest(CheckPendingSoftwareRequest checkPendingSoftwareRequest) {
                CheckPendingSoftwareRequest checkPendingSoftwareRequest2;
                SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(checkPendingSoftwareRequest);
                } else if ((this.bitField0_ & 16384) == 0 || (checkPendingSoftwareRequest2 = this.checkPendingSoftwareRequest_) == null || checkPendingSoftwareRequest2 == CheckPendingSoftwareRequest.getDefaultInstance()) {
                    this.checkPendingSoftwareRequest_ = checkPendingSoftwareRequest;
                } else {
                    getCheckPendingSoftwareRequestBuilder().mergeFrom(checkPendingSoftwareRequest);
                }
                if (this.checkPendingSoftwareRequest_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCheckPendingSoftwareResponse(CheckPendingSoftwareResponse checkPendingSoftwareResponse) {
                CheckPendingSoftwareResponse checkPendingSoftwareResponse2;
                SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(checkPendingSoftwareResponse);
                } else if ((this.bitField0_ & 32768) == 0 || (checkPendingSoftwareResponse2 = this.checkPendingSoftwareResponse_) == null || checkPendingSoftwareResponse2 == CheckPendingSoftwareResponse.getDefaultInstance()) {
                    this.checkPendingSoftwareResponse_ = checkPendingSoftwareResponse;
                } else {
                    getCheckPendingSoftwareResponseBuilder().mergeFrom(checkPendingSoftwareResponse);
                }
                if (this.checkPendingSoftwareResponse_ != null) {
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectionReadyNotification(ConnectionReadyNotification connectionReadyNotification) {
                ConnectionReadyNotification connectionReadyNotification2;
                SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> singleFieldBuilderV3 = this.connectionReadyNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectionReadyNotification);
                } else if ((this.bitField0_ & 8192) == 0 || (connectionReadyNotification2 = this.connectionReadyNotification_) == null || connectionReadyNotification2 == ConnectionReadyNotification.getDefaultInstance()) {
                    this.connectionReadyNotification_ = connectionReadyNotification;
                } else {
                    getConnectionReadyNotificationBuilder().mergeFrom(connectionReadyNotification);
                }
                if (this.connectionReadyNotification_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDualPairingRequest(DualPairingRequest dualPairingRequest) {
                DualPairingRequest dualPairingRequest2;
                SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> singleFieldBuilderV3 = this.dualPairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dualPairingRequest);
                } else if ((this.bitField0_ & 2048) == 0 || (dualPairingRequest2 = this.dualPairingRequest_) == null || dualPairingRequest2 == DualPairingRequest.getDefaultInstance()) {
                    this.dualPairingRequest_ = dualPairingRequest;
                } else {
                    getDualPairingRequestBuilder().mergeFrom(dualPairingRequest);
                }
                if (this.dualPairingRequest_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDualPairingResponse(DualPairingResponse dualPairingResponse) {
                DualPairingResponse dualPairingResponse2;
                SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> singleFieldBuilderV3 = this.dualPairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dualPairingResponse);
                } else if ((this.bitField0_ & 4096) == 0 || (dualPairingResponse2 = this.dualPairingResponse_) == null || dualPairingResponse2 == DualPairingResponse.getDefaultInstance()) {
                    this.dualPairingResponse_ = dualPairingResponse;
                } else {
                    getDualPairingResponseBuilder().mergeFrom(dualPairingResponse);
                }
                if (this.dualPairingResponse_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFeatureCapabilitiesRequest(FeatureCapabilitiesRequest featureCapabilitiesRequest) {
                FeatureCapabilitiesRequest featureCapabilitiesRequest2;
                SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(featureCapabilitiesRequest);
                } else if ((this.bitField0_ & 128) == 0 || (featureCapabilitiesRequest2 = this.featureCapabilitiesRequest_) == null || featureCapabilitiesRequest2 == FeatureCapabilitiesRequest.getDefaultInstance()) {
                    this.featureCapabilitiesRequest_ = featureCapabilitiesRequest;
                } else {
                    getFeatureCapabilitiesRequestBuilder().mergeFrom(featureCapabilitiesRequest);
                }
                if (this.featureCapabilitiesRequest_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFeatureCapabilitiesResponse(FeatureCapabilitiesResponse featureCapabilitiesResponse) {
                FeatureCapabilitiesResponse featureCapabilitiesResponse2;
                SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(featureCapabilitiesResponse);
                } else if ((this.bitField0_ & 256) == 0 || (featureCapabilitiesResponse2 = this.featureCapabilitiesResponse_) == null || featureCapabilitiesResponse2 == FeatureCapabilitiesResponse.getDefaultInstance()) {
                    this.featureCapabilitiesResponse_ = featureCapabilitiesResponse;
                } else {
                    getFeatureCapabilitiesResponseBuilder().mergeFrom(featureCapabilitiesResponse);
                }
                if (this.featureCapabilitiesResponse_ != null) {
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
                                    codedInputStream.readMessage(getSyncRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getSyncResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getGetLocationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getGetLocationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getLocationUpdatedSetEnabledRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getLocationUpdatedSetEnabledResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getLocationUpdatedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getFeatureCapabilitiesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getFeatureCapabilitiesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getGarminGuidOverwriteRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getGarminGuidOverwriteResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getDualPairingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getDualPairingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getConnectionReadyNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getCheckPendingSoftwareRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 130:
                                    codedInputStream.readMessage(getCheckPendingSoftwareResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32768;
                                    continue;
                                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                    codedInputStream.readMessage(getTimeSyncRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 65536;
                                    continue;
                                case 146:
                                    codedInputStream.readMessage(getTimeSyncResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 131072;
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

            public Builder mergeGarminGuidOverwriteRequest(GarminGuidOverwriteRequest garminGuidOverwriteRequest) {
                GarminGuidOverwriteRequest garminGuidOverwriteRequest2;
                SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(garminGuidOverwriteRequest);
                } else if ((this.bitField0_ & 512) == 0 || (garminGuidOverwriteRequest2 = this.garminGuidOverwriteRequest_) == null || garminGuidOverwriteRequest2 == GarminGuidOverwriteRequest.getDefaultInstance()) {
                    this.garminGuidOverwriteRequest_ = garminGuidOverwriteRequest;
                } else {
                    getGarminGuidOverwriteRequestBuilder().mergeFrom(garminGuidOverwriteRequest);
                }
                if (this.garminGuidOverwriteRequest_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGarminGuidOverwriteResponse(GarminGuidOverwriteResponse garminGuidOverwriteResponse) {
                GarminGuidOverwriteResponse garminGuidOverwriteResponse2;
                SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(garminGuidOverwriteResponse);
                } else if ((this.bitField0_ & 1024) == 0 || (garminGuidOverwriteResponse2 = this.garminGuidOverwriteResponse_) == null || garminGuidOverwriteResponse2 == GarminGuidOverwriteResponse.getDefaultInstance()) {
                    this.garminGuidOverwriteResponse_ = garminGuidOverwriteResponse;
                } else {
                    getGarminGuidOverwriteResponseBuilder().mergeFrom(garminGuidOverwriteResponse);
                }
                if (this.garminGuidOverwriteResponse_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetLocationRequest(GetLocationRequest getLocationRequest) {
                GetLocationRequest getLocationRequest2;
                SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLocationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getLocationRequest);
                } else if ((this.bitField0_ & 4) == 0 || (getLocationRequest2 = this.getLocationRequest_) == null || getLocationRequest2 == GetLocationRequest.getDefaultInstance()) {
                    this.getLocationRequest_ = getLocationRequest;
                } else {
                    getGetLocationRequestBuilder().mergeFrom(getLocationRequest);
                }
                if (this.getLocationRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetLocationResponse(GetLocationResponse getLocationResponse) {
                GetLocationResponse getLocationResponse2;
                SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLocationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getLocationResponse);
                } else if ((this.bitField0_ & 8) == 0 || (getLocationResponse2 = this.getLocationResponse_) == null || getLocationResponse2 == GetLocationResponse.getDefaultInstance()) {
                    this.getLocationResponse_ = getLocationResponse;
                } else {
                    getGetLocationResponseBuilder().mergeFrom(getLocationResponse);
                }
                if (this.getLocationResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLocationUpdatedNotification(LocationUpdatedNotification locationUpdatedNotification) {
                LocationUpdatedNotification locationUpdatedNotification2;
                SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.locationUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(locationUpdatedNotification);
                } else if ((this.bitField0_ & 64) == 0 || (locationUpdatedNotification2 = this.locationUpdatedNotification_) == null || locationUpdatedNotification2 == LocationUpdatedNotification.getDefaultInstance()) {
                    this.locationUpdatedNotification_ = locationUpdatedNotification;
                } else {
                    getLocationUpdatedNotificationBuilder().mergeFrom(locationUpdatedNotification);
                }
                if (this.locationUpdatedNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLocationUpdatedSetEnabledRequest(LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest) {
                LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest2;
                SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(locationUpdatedSetEnabledRequest);
                } else if ((this.bitField0_ & 16) == 0 || (locationUpdatedSetEnabledRequest2 = this.locationUpdatedSetEnabledRequest_) == null || locationUpdatedSetEnabledRequest2 == LocationUpdatedSetEnabledRequest.getDefaultInstance()) {
                    this.locationUpdatedSetEnabledRequest_ = locationUpdatedSetEnabledRequest;
                } else {
                    getLocationUpdatedSetEnabledRequestBuilder().mergeFrom(locationUpdatedSetEnabledRequest);
                }
                if (this.locationUpdatedSetEnabledRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLocationUpdatedSetEnabledResponse(LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse) {
                LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse2;
                SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(locationUpdatedSetEnabledResponse);
                } else if ((this.bitField0_ & 32) == 0 || (locationUpdatedSetEnabledResponse2 = this.locationUpdatedSetEnabledResponse_) == null || locationUpdatedSetEnabledResponse2 == LocationUpdatedSetEnabledResponse.getDefaultInstance()) {
                    this.locationUpdatedSetEnabledResponse_ = locationUpdatedSetEnabledResponse;
                } else {
                    getLocationUpdatedSetEnabledResponseBuilder().mergeFrom(locationUpdatedSetEnabledResponse);
                }
                if (this.locationUpdatedSetEnabledResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncRequest(SyncRequest syncRequest) {
                SyncRequest syncRequest2;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncRequest);
                } else if ((this.bitField0_ & 1) == 0 || (syncRequest2 = this.syncRequest_) == null || syncRequest2 == SyncRequest.getDefaultInstance()) {
                    this.syncRequest_ = syncRequest;
                } else {
                    getSyncRequestBuilder().mergeFrom(syncRequest);
                }
                if (this.syncRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncResponse(SyncResponse syncResponse) {
                SyncResponse syncResponse2;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncResponse);
                } else if ((this.bitField0_ & 2) == 0 || (syncResponse2 = this.syncResponse_) == null || syncResponse2 == SyncResponse.getDefaultInstance()) {
                    this.syncResponse_ = syncResponse;
                } else {
                    getSyncResponseBuilder().mergeFrom(syncResponse);
                }
                if (this.syncResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTimeSyncRequest(TimeSyncRequest timeSyncRequest) {
                TimeSyncRequest timeSyncRequest2;
                SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> singleFieldBuilderV3 = this.timeSyncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(timeSyncRequest);
                } else if ((this.bitField0_ & 65536) == 0 || (timeSyncRequest2 = this.timeSyncRequest_) == null || timeSyncRequest2 == TimeSyncRequest.getDefaultInstance()) {
                    this.timeSyncRequest_ = timeSyncRequest;
                } else {
                    getTimeSyncRequestBuilder().mergeFrom(timeSyncRequest);
                }
                if (this.timeSyncRequest_ != null) {
                    this.bitField0_ |= 65536;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTimeSyncResponse(TimeSyncResponse timeSyncResponse) {
                TimeSyncResponse timeSyncResponse2;
                SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> singleFieldBuilderV3 = this.timeSyncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(timeSyncResponse);
                } else if ((this.bitField0_ & 131072) == 0 || (timeSyncResponse2 = this.timeSyncResponse_) == null || timeSyncResponse2 == TimeSyncResponse.getDefaultInstance()) {
                    this.timeSyncResponse_ = timeSyncResponse;
                } else {
                    getTimeSyncResponseBuilder().mergeFrom(timeSyncResponse);
                }
                if (this.timeSyncResponse_ != null) {
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCheckPendingSoftwareRequest(CheckPendingSoftwareRequest.Builder builder) {
                SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.checkPendingSoftwareRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setCheckPendingSoftwareResponse(CheckPendingSoftwareResponse.Builder builder) {
                SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.checkPendingSoftwareResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setConnectionReadyNotification(ConnectionReadyNotification.Builder builder) {
                SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> singleFieldBuilderV3 = this.connectionReadyNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionReadyNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setDualPairingRequest(DualPairingRequest.Builder builder) {
                SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> singleFieldBuilderV3 = this.dualPairingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dualPairingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setDualPairingResponse(DualPairingResponse.Builder builder) {
                SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> singleFieldBuilderV3 = this.dualPairingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dualPairingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setFeatureCapabilitiesRequest(FeatureCapabilitiesRequest.Builder builder) {
                SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.featureCapabilitiesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setFeatureCapabilitiesResponse(FeatureCapabilitiesResponse.Builder builder) {
                SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.featureCapabilitiesResponse_ = builder.build();
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

            public Builder setGarminGuidOverwriteRequest(GarminGuidOverwriteRequest.Builder builder) {
                SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.garminGuidOverwriteRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setGarminGuidOverwriteResponse(GarminGuidOverwriteResponse.Builder builder) {
                SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.garminGuidOverwriteResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setGetLocationRequest(GetLocationRequest.Builder builder) {
                SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLocationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getLocationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGetLocationResponse(GetLocationResponse.Builder builder) {
                SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLocationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getLocationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLocationUpdatedNotification(LocationUpdatedNotification.Builder builder) {
                SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.locationUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.locationUpdatedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLocationUpdatedSetEnabledRequest(LocationUpdatedSetEnabledRequest.Builder builder) {
                SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.locationUpdatedSetEnabledRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLocationUpdatedSetEnabledResponse(LocationUpdatedSetEnabledResponse.Builder builder) {
                SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.locationUpdatedSetEnabledResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSyncRequest(SyncRequest.Builder builder) {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.syncRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSyncResponse(SyncResponse.Builder builder) {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.syncResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTimeSyncRequest(TimeSyncRequest.Builder builder) {
                SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> singleFieldBuilderV3 = this.timeSyncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.timeSyncRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setTimeSyncResponse(TimeSyncResponse.Builder builder) {
                SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> singleFieldBuilderV3 = this.timeSyncResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.timeSyncResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CoreService getDefaultInstanceForType() {
                return CoreService.getDefaultInstance();
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

            public Builder setCheckPendingSoftwareRequest(CheckPendingSoftwareRequest checkPendingSoftwareRequest) {
                SingleFieldBuilderV3<CheckPendingSoftwareRequest, CheckPendingSoftwareRequest.Builder, CheckPendingSoftwareRequestOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    checkPendingSoftwareRequest.getClass();
                    this.checkPendingSoftwareRequest_ = checkPendingSoftwareRequest;
                } else {
                    singleFieldBuilderV3.setMessage(checkPendingSoftwareRequest);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setConnectionReadyNotification(ConnectionReadyNotification connectionReadyNotification) {
                SingleFieldBuilderV3<ConnectionReadyNotification, ConnectionReadyNotification.Builder, ConnectionReadyNotificationOrBuilder> singleFieldBuilderV3 = this.connectionReadyNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectionReadyNotification.getClass();
                    this.connectionReadyNotification_ = connectionReadyNotification;
                } else {
                    singleFieldBuilderV3.setMessage(connectionReadyNotification);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setDualPairingRequest(DualPairingRequest dualPairingRequest) {
                SingleFieldBuilderV3<DualPairingRequest, DualPairingRequest.Builder, DualPairingRequestOrBuilder> singleFieldBuilderV3 = this.dualPairingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dualPairingRequest.getClass();
                    this.dualPairingRequest_ = dualPairingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(dualPairingRequest);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setDualPairingResponse(DualPairingResponse dualPairingResponse) {
                SingleFieldBuilderV3<DualPairingResponse, DualPairingResponse.Builder, DualPairingResponseOrBuilder> singleFieldBuilderV3 = this.dualPairingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dualPairingResponse.getClass();
                    this.dualPairingResponse_ = dualPairingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(dualPairingResponse);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setFeatureCapabilitiesRequest(FeatureCapabilitiesRequest featureCapabilitiesRequest) {
                SingleFieldBuilderV3<FeatureCapabilitiesRequest, FeatureCapabilitiesRequest.Builder, FeatureCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    featureCapabilitiesRequest.getClass();
                    this.featureCapabilitiesRequest_ = featureCapabilitiesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(featureCapabilitiesRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setFeatureCapabilitiesResponse(FeatureCapabilitiesResponse featureCapabilitiesResponse) {
                SingleFieldBuilderV3<FeatureCapabilitiesResponse, FeatureCapabilitiesResponse.Builder, FeatureCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.featureCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    featureCapabilitiesResponse.getClass();
                    this.featureCapabilitiesResponse_ = featureCapabilitiesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(featureCapabilitiesResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setGarminGuidOverwriteRequest(GarminGuidOverwriteRequest garminGuidOverwriteRequest) {
                SingleFieldBuilderV3<GarminGuidOverwriteRequest, GarminGuidOverwriteRequest.Builder, GarminGuidOverwriteRequestOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    garminGuidOverwriteRequest.getClass();
                    this.garminGuidOverwriteRequest_ = garminGuidOverwriteRequest;
                } else {
                    singleFieldBuilderV3.setMessage(garminGuidOverwriteRequest);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setGarminGuidOverwriteResponse(GarminGuidOverwriteResponse garminGuidOverwriteResponse) {
                SingleFieldBuilderV3<GarminGuidOverwriteResponse, GarminGuidOverwriteResponse.Builder, GarminGuidOverwriteResponseOrBuilder> singleFieldBuilderV3 = this.garminGuidOverwriteResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    garminGuidOverwriteResponse.getClass();
                    this.garminGuidOverwriteResponse_ = garminGuidOverwriteResponse;
                } else {
                    singleFieldBuilderV3.setMessage(garminGuidOverwriteResponse);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setGetLocationRequest(GetLocationRequest getLocationRequest) {
                SingleFieldBuilderV3<GetLocationRequest, GetLocationRequest.Builder, GetLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLocationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getLocationRequest.getClass();
                    this.getLocationRequest_ = getLocationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getLocationRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGetLocationResponse(GetLocationResponse getLocationResponse) {
                SingleFieldBuilderV3<GetLocationResponse, GetLocationResponse.Builder, GetLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLocationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getLocationResponse.getClass();
                    this.getLocationResponse_ = getLocationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getLocationResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLocationUpdatedNotification(LocationUpdatedNotification locationUpdatedNotification) {
                SingleFieldBuilderV3<LocationUpdatedNotification, LocationUpdatedNotification.Builder, LocationUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.locationUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    locationUpdatedNotification.getClass();
                    this.locationUpdatedNotification_ = locationUpdatedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(locationUpdatedNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLocationUpdatedSetEnabledRequest(LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest) {
                SingleFieldBuilderV3<LocationUpdatedSetEnabledRequest, LocationUpdatedSetEnabledRequest.Builder, LocationUpdatedSetEnabledRequestOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    locationUpdatedSetEnabledRequest.getClass();
                    this.locationUpdatedSetEnabledRequest_ = locationUpdatedSetEnabledRequest;
                } else {
                    singleFieldBuilderV3.setMessage(locationUpdatedSetEnabledRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLocationUpdatedSetEnabledResponse(LocationUpdatedSetEnabledResponse locationUpdatedSetEnabledResponse) {
                SingleFieldBuilderV3<LocationUpdatedSetEnabledResponse, LocationUpdatedSetEnabledResponse.Builder, LocationUpdatedSetEnabledResponseOrBuilder> singleFieldBuilderV3 = this.locationUpdatedSetEnabledResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    locationUpdatedSetEnabledResponse.getClass();
                    this.locationUpdatedSetEnabledResponse_ = locationUpdatedSetEnabledResponse;
                } else {
                    singleFieldBuilderV3.setMessage(locationUpdatedSetEnabledResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSyncRequest(SyncRequest syncRequest) {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncRequest.getClass();
                    this.syncRequest_ = syncRequest;
                } else {
                    singleFieldBuilderV3.setMessage(syncRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSyncResponse(SyncResponse syncResponse) {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncResponse.getClass();
                    this.syncResponse_ = syncResponse;
                } else {
                    singleFieldBuilderV3.setMessage(syncResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTimeSyncRequest(TimeSyncRequest timeSyncRequest) {
                SingleFieldBuilderV3<TimeSyncRequest, TimeSyncRequest.Builder, TimeSyncRequestOrBuilder> singleFieldBuilderV3 = this.timeSyncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    timeSyncRequest.getClass();
                    this.timeSyncRequest_ = timeSyncRequest;
                } else {
                    singleFieldBuilderV3.setMessage(timeSyncRequest);
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setTimeSyncResponse(TimeSyncResponse timeSyncResponse) {
                SingleFieldBuilderV3<TimeSyncResponse, TimeSyncResponse.Builder, TimeSyncResponseOrBuilder> singleFieldBuilderV3 = this.timeSyncResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    timeSyncResponse.getClass();
                    this.timeSyncResponse_ = timeSyncResponse;
                } else {
                    singleFieldBuilderV3.setMessage(timeSyncResponse);
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setCheckPendingSoftwareResponse(CheckPendingSoftwareResponse checkPendingSoftwareResponse) {
                SingleFieldBuilderV3<CheckPendingSoftwareResponse, CheckPendingSoftwareResponse.Builder, CheckPendingSoftwareResponseOrBuilder> singleFieldBuilderV3 = this.checkPendingSoftwareResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    checkPendingSoftwareResponse.getClass();
                    this.checkPendingSoftwareResponse_ = checkPendingSoftwareResponse;
                } else {
                    singleFieldBuilderV3.setMessage(checkPendingSoftwareResponse);
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CoreService) {
                    return mergeFrom((CoreService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CoreService coreService) {
                if (coreService == CoreService.getDefaultInstance()) {
                    return this;
                }
                if (coreService.hasSyncRequest()) {
                    mergeSyncRequest(coreService.getSyncRequest());
                }
                if (coreService.hasSyncResponse()) {
                    mergeSyncResponse(coreService.getSyncResponse());
                }
                if (coreService.hasGetLocationRequest()) {
                    mergeGetLocationRequest(coreService.getGetLocationRequest());
                }
                if (coreService.hasGetLocationResponse()) {
                    mergeGetLocationResponse(coreService.getGetLocationResponse());
                }
                if (coreService.hasLocationUpdatedSetEnabledRequest()) {
                    mergeLocationUpdatedSetEnabledRequest(coreService.getLocationUpdatedSetEnabledRequest());
                }
                if (coreService.hasLocationUpdatedSetEnabledResponse()) {
                    mergeLocationUpdatedSetEnabledResponse(coreService.getLocationUpdatedSetEnabledResponse());
                }
                if (coreService.hasLocationUpdatedNotification()) {
                    mergeLocationUpdatedNotification(coreService.getLocationUpdatedNotification());
                }
                if (coreService.hasFeatureCapabilitiesRequest()) {
                    mergeFeatureCapabilitiesRequest(coreService.getFeatureCapabilitiesRequest());
                }
                if (coreService.hasFeatureCapabilitiesResponse()) {
                    mergeFeatureCapabilitiesResponse(coreService.getFeatureCapabilitiesResponse());
                }
                if (coreService.hasGarminGuidOverwriteRequest()) {
                    mergeGarminGuidOverwriteRequest(coreService.getGarminGuidOverwriteRequest());
                }
                if (coreService.hasGarminGuidOverwriteResponse()) {
                    mergeGarminGuidOverwriteResponse(coreService.getGarminGuidOverwriteResponse());
                }
                if (coreService.hasDualPairingRequest()) {
                    mergeDualPairingRequest(coreService.getDualPairingRequest());
                }
                if (coreService.hasDualPairingResponse()) {
                    mergeDualPairingResponse(coreService.getDualPairingResponse());
                }
                if (coreService.hasConnectionReadyNotification()) {
                    mergeConnectionReadyNotification(coreService.getConnectionReadyNotification());
                }
                if (coreService.hasCheckPendingSoftwareRequest()) {
                    mergeCheckPendingSoftwareRequest(coreService.getCheckPendingSoftwareRequest());
                }
                if (coreService.hasCheckPendingSoftwareResponse()) {
                    mergeCheckPendingSoftwareResponse(coreService.getCheckPendingSoftwareResponse());
                }
                if (coreService.hasTimeSyncRequest()) {
                    mergeTimeSyncRequest(coreService.getTimeSyncRequest());
                }
                if (coreService.hasTimeSyncResponse()) {
                    mergeTimeSyncResponse(coreService.getTimeSyncResponse());
                }
                mergeUnknownFields(coreService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CoreService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CoreService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CoreService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CoreService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoreService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CoreService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CoreService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CoreService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CoreService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CoreService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CoreService parseFrom(InputStream inputStream) {
            return (CoreService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CoreService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoreService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CoreService parseFrom(CodedInputStream codedInputStream) {
            return (CoreService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CoreService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CoreService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DualPairingRequest extends GeneratedMessageV3 implements DualPairingRequestOrBuilder {
        private static final DualPairingRequest DEFAULT_INSTANCE = new DualPairingRequest();

        @Deprecated
        public static final Parser<DualPairingRequest> PARSER = new AbstractParser<DualPairingRequest>() { // from class: com.garmin.proto.generated.GDICore.DualPairingRequest.1
            @Override // com.google.protobuf.Parser
            public DualPairingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DualPairingRequest.newBuilder();
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
        public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int requestType_;

        private DualPairingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.requestType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DualPairingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_DualPairingRequest_descriptor;
        }

        public static Builder newBuilder(DualPairingRequest dualPairingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dualPairingRequest);
        }

        public static DualPairingRequest parseDelimitedFrom(InputStream inputStream) {
            return (DualPairingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DualPairingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DualPairingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DualPairingRequest)) {
                return super.equals(obj);
            }
            DualPairingRequest dualPairingRequest = (DualPairingRequest) obj;
            if (hasRequestType() != dualPairingRequest.hasRequestType()) {
                return false;
            }
            return (!hasRequestType() || this.requestType_ == dualPairingRequest.requestType_) && getUnknownFields().equals(dualPairingRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DualPairingRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICore.DualPairingRequestOrBuilder
        public RequestType getRequestType() {
            RequestType requestTypeForNumber = RequestType.forNumber(this.requestType_);
            return requestTypeForNumber == null ? RequestType.PAIR_BT_CLASSIC : requestTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.requestType_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.DualPairingRequestOrBuilder
        public boolean hasRequestType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.requestType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_DualPairingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DualPairingRequest.class, Builder.class);
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
            return new DualPairingRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.requestType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DualPairingRequestOrBuilder {
            private int bitField0_;
            private int requestType_;

            private Builder() {
                this.requestType_ = 0;
            }

            private void buildPartial0(DualPairingRequest dualPairingRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    dualPairingRequest.requestType_ = this.requestType_;
                } else {
                    i14 = 0;
                }
                dualPairingRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_DualPairingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DualPairingRequest build() {
                DualPairingRequest dualPairingRequestBuildPartial = buildPartial();
                if (dualPairingRequestBuildPartial.isInitialized()) {
                    return dualPairingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dualPairingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DualPairingRequest buildPartial() {
                DualPairingRequest dualPairingRequest = new DualPairingRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dualPairingRequest);
                }
                onBuilt();
                return dualPairingRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestType_ = 0;
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

            public Builder clearRequestType() {
                this.bitField0_ &= -2;
                this.requestType_ = 0;
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
                return GDICore.internal_static_GDI_Proto_Core_DualPairingRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.DualPairingRequestOrBuilder
            public RequestType getRequestType() {
                RequestType requestTypeForNumber = RequestType.forNumber(this.requestType_);
                return requestTypeForNumber == null ? RequestType.PAIR_BT_CLASSIC : requestTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.DualPairingRequestOrBuilder
            public boolean hasRequestType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_DualPairingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DualPairingRequest.class, Builder.class);
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
                                    if (RequestType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.requestType_ = i14;
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

            public Builder setRequestType(RequestType requestType) {
                requestType.getClass();
                this.bitField0_ |= 1;
                this.requestType_ = requestType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DualPairingRequest getDefaultInstanceForType() {
                return DualPairingRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.requestType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DualPairingRequest) {
                    return mergeFrom((DualPairingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DualPairingRequest dualPairingRequest) {
                if (dualPairingRequest == DualPairingRequest.getDefaultInstance()) {
                    return this;
                }
                if (dualPairingRequest.hasRequestType()) {
                    setRequestType(dualPairingRequest.getRequestType());
                }
                mergeUnknownFields(dualPairingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DualPairingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DualPairingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DualPairingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DualPairingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DualPairingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DualPairingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DualPairingRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.requestType_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DualPairingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DualPairingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DualPairingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DualPairingRequest parseFrom(InputStream inputStream) {
            return (DualPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DualPairingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DualPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DualPairingRequest parseFrom(CodedInputStream codedInputStream) {
            return (DualPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DualPairingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DualPairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum RequestType implements ProtocolMessageEnum {
            PAIR_BT_CLASSIC(0);

            public static final int PAIR_BT_CLASSIC_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<RequestType> internalValueMap = new Internal.EnumLiteMap<RequestType>() { // from class: com.garmin.proto.generated.GDICore.DualPairingRequest.RequestType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RequestType findValueByNumber(int i14) {
                    return RequestType.forNumber(i14);
                }
            };
            private static final RequestType[] VALUES = values();

            RequestType(int i14) {
                this.value = i14;
            }

            public static RequestType forNumber(int i14) {
                if (i14 != 0) {
                    return null;
                }
                return PAIR_BT_CLASSIC;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DualPairingRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<RequestType> internalGetValueMap() {
                return internalValueMap;
            }

            public static RequestType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RequestType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class DualPairingResponse extends GeneratedMessageV3 implements DualPairingResponseOrBuilder {
        private static final DualPairingResponse DEFAULT_INSTANCE = new DualPairingResponse();

        @Deprecated
        public static final Parser<DualPairingResponse> PARSER = new AbstractParser<DualPairingResponse>() { // from class: com.garmin.proto.generated.GDICore.DualPairingResponse.1
            @Override // com.google.protobuf.Parser
            public DualPairingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DualPairingResponse.newBuilder();
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

        private DualPairingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DualPairingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_DualPairingResponse_descriptor;
        }

        public static Builder newBuilder(DualPairingResponse dualPairingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dualPairingResponse);
        }

        public static DualPairingResponse parseDelimitedFrom(InputStream inputStream) {
            return (DualPairingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DualPairingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DualPairingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DualPairingResponse)) {
                return super.equals(obj);
            }
            DualPairingResponse dualPairingResponse = (DualPairingResponse) obj;
            if (hasStatus() != dualPairingResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == dualPairingResponse.status_) && getUnknownFields().equals(dualPairingResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DualPairingResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDICore.DualPairingResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICore.DualPairingResponseOrBuilder
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
            return GDICore.internal_static_GDI_Proto_Core_DualPairingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DualPairingResponse.class, Builder.class);
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
            return new DualPairingResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DualPairingResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(DualPairingResponse dualPairingResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    dualPairingResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                dualPairingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_DualPairingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DualPairingResponse build() {
                DualPairingResponse dualPairingResponseBuildPartial = buildPartial();
                if (dualPairingResponseBuildPartial.isInitialized()) {
                    return dualPairingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dualPairingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DualPairingResponse buildPartial() {
                DualPairingResponse dualPairingResponse = new DualPairingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dualPairingResponse);
                }
                onBuilt();
                return dualPairingResponse;
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
                return GDICore.internal_static_GDI_Proto_Core_DualPairingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.DualPairingResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.DualPairingResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_DualPairingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DualPairingResponse.class, Builder.class);
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
            public DualPairingResponse getDefaultInstanceForType() {
                return DualPairingResponse.getDefaultInstance();
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
                if (message instanceof DualPairingResponse) {
                    return mergeFrom((DualPairingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DualPairingResponse dualPairingResponse) {
                if (dualPairingResponse == DualPairingResponse.getDefaultInstance()) {
                    return this;
                }
                if (dualPairingResponse.hasStatus()) {
                    setStatus(dualPairingResponse.getStatus());
                }
                mergeUnknownFields(dualPairingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DualPairingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DualPairingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DualPairingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DualPairingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DualPairingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DualPairingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DualPairingResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DualPairingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DualPairingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DualPairingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DualPairingResponse parseFrom(InputStream inputStream) {
            return (DualPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DualPairingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DualPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DualPairingResponse parseFrom(CodedInputStream codedInputStream) {
            return (DualPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DualPairingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DualPairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            UNABLE_TO_PAIR(2);

            public static final int OK_VALUE = 1;
            public static final int UNABLE_TO_PAIR_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDICore.DualPairingResponse.ResponseStatus.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return UNABLE_TO_PAIR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DualPairingResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class FeatureCapabilitiesRequest extends GeneratedMessageV3.ExtendableMessage<FeatureCapabilitiesRequest> implements FeatureCapabilitiesRequestOrBuilder {
        public static final int CLIENT_VERSION_FIELD_NUMBER = 2;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
        public static final int GARMIN_GUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int clientVersion_;
        private volatile Object displayName_;
        private ByteString garminGuid_;
        private byte memoizedIsInitialized;
        private static final FeatureCapabilitiesRequest DEFAULT_INSTANCE = new FeatureCapabilitiesRequest();

        @Deprecated
        public static final Parser<FeatureCapabilitiesRequest> PARSER = new AbstractParser<FeatureCapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public FeatureCapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FeatureCapabilitiesRequest.newBuilder();
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

        private FeatureCapabilitiesRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.garminGuid_ = byteString;
            this.clientVersion_ = 0;
            this.displayName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.garminGuid_ = byteString;
            this.displayName_ = "";
        }

        public static FeatureCapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(FeatureCapabilitiesRequest featureCapabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureCapabilitiesRequest);
        }

        public static FeatureCapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (FeatureCapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureCapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FeatureCapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureCapabilitiesRequest)) {
                return super.equals(obj);
            }
            FeatureCapabilitiesRequest featureCapabilitiesRequest = (FeatureCapabilitiesRequest) obj;
            if (hasGarminGuid() != featureCapabilitiesRequest.hasGarminGuid()) {
                return false;
            }
            if ((hasGarminGuid() && !getGarminGuid().equals(featureCapabilitiesRequest.getGarminGuid())) || hasClientVersion() != featureCapabilitiesRequest.hasClientVersion()) {
                return false;
            }
            if ((!hasClientVersion() || getClientVersion() == featureCapabilitiesRequest.getClientVersion()) && hasDisplayName() == featureCapabilitiesRequest.hasDisplayName()) {
                return (!hasDisplayName() || getDisplayName().equals(featureCapabilitiesRequest.getDisplayName())) && getUnknownFields().equals(featureCapabilitiesRequest.getUnknownFields()) && getExtensionFields().equals(featureCapabilitiesRequest.getExtensionFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
        public int getClientVersion() {
            return this.clientVersion_;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
        public String getDisplayName() {
            Object obj = this.displayName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.displayName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
        public ByteString getDisplayNameBytes() {
            Object obj = this.displayName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.displayName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
        public ByteString getGarminGuid() {
            return this.garminGuid_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FeatureCapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.garminGuid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(2, this.clientVersion_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(3, this.displayName_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
        public boolean hasClientVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
        public boolean hasDisplayName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
        public boolean hasGarminGuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGarminGuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGarminGuid().hashCode();
            }
            if (hasClientVersion()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getClientVersion();
            }
            if (hasDisplayName()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDisplayName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (AbstractMessage.hashFields(iHashCode, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureCapabilitiesRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
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
            return new FeatureCapabilitiesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.garminGuid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.clientVersion_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.displayName_);
            }
            extensionWriterNewExtensionWriter.writeUntil(1002, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<FeatureCapabilitiesRequest, Builder> implements FeatureCapabilitiesRequestOrBuilder {
            private int bitField0_;
            private int clientVersion_;
            private Object displayName_;
            private ByteString garminGuid_;

            private Builder() {
                this.garminGuid_ = ByteString.EMPTY;
                this.displayName_ = "";
            }

            private void buildPartial0(FeatureCapabilitiesRequest featureCapabilitiesRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    featureCapabilitiesRequest.garminGuid_ = this.garminGuid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    featureCapabilitiesRequest.clientVersion_ = this.clientVersion_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    featureCapabilitiesRequest.displayName_ = this.displayName_;
                    i14 |= 4;
                }
                featureCapabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<FeatureCapabilitiesRequest, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureCapabilitiesRequest build() {
                FeatureCapabilitiesRequest featureCapabilitiesRequestBuildPartial = buildPartial();
                if (featureCapabilitiesRequestBuildPartial.isInitialized()) {
                    return featureCapabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featureCapabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureCapabilitiesRequest buildPartial() {
                FeatureCapabilitiesRequest featureCapabilitiesRequest = new FeatureCapabilitiesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureCapabilitiesRequest);
                }
                onBuilt();
                return featureCapabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.garminGuid_ = ByteString.EMPTY;
                this.clientVersion_ = 0;
                this.displayName_ = "";
                return this;
            }

            public Builder clearClientVersion() {
                this.bitField0_ &= -3;
                this.clientVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDisplayName() {
                this.displayName_ = FeatureCapabilitiesRequest.getDefaultInstance().getDisplayName();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<FeatureCapabilitiesRequest, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGarminGuid() {
                this.bitField0_ &= -2;
                this.garminGuid_ = FeatureCapabilitiesRequest.getDefaultInstance().getGarminGuid();
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

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
            public int getClientVersion() {
                return this.clientVersion_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
            public String getDisplayName() {
                Object obj = this.displayName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.displayName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
            public ByteString getDisplayNameBytes() {
                Object obj = this.displayName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.displayName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
            public ByteString getGarminGuid() {
                return this.garminGuid_;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
            public boolean hasClientVersion() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
            public boolean hasDisplayName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesRequestOrBuilder
            public boolean hasGarminGuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureCapabilitiesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
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
                                    this.garminGuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.clientVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.displayName_ = codedInputStream.readBytes();
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

            public Builder setClientVersion(int i14) {
                this.clientVersion_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDisplayName(String str) {
                str.getClass();
                this.displayName_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDisplayNameBytes(ByteString byteString) {
                byteString.getClass();
                this.displayName_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<FeatureCapabilitiesRequest, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGarminGuid(ByteString byteString) {
                byteString.getClass();
                this.garminGuid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FeatureCapabilitiesRequest getDefaultInstanceForType() {
                return FeatureCapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<FeatureCapabilitiesRequest, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<FeatureCapabilitiesRequest, Object>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<FeatureCapabilitiesRequest, List<Object>>) generatedExtension, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<FeatureCapabilitiesRequest, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.garminGuid_ = ByteString.EMPTY;
                this.displayName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FeatureCapabilitiesRequest) {
                    return mergeFrom((FeatureCapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FeatureCapabilitiesRequest featureCapabilitiesRequest) {
                if (featureCapabilitiesRequest == FeatureCapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                if (featureCapabilitiesRequest.hasGarminGuid()) {
                    setGarminGuid(featureCapabilitiesRequest.getGarminGuid());
                }
                if (featureCapabilitiesRequest.hasClientVersion()) {
                    setClientVersion(featureCapabilitiesRequest.getClientVersion());
                }
                if (featureCapabilitiesRequest.hasDisplayName()) {
                    this.displayName_ = featureCapabilitiesRequest.displayName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeExtensionFields(featureCapabilitiesRequest);
                mergeUnknownFields(featureCapabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FeatureCapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureCapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureCapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FeatureCapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureCapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FeatureCapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FeatureCapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FeatureCapabilitiesRequest parseFrom(InputStream inputStream) {
            return (FeatureCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FeatureCapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureCapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (FeatureCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FeatureCapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private FeatureCapabilitiesRequest(GeneratedMessageV3.ExtendableBuilder<FeatureCapabilitiesRequest, ?> extendableBuilder) {
            super(extendableBuilder);
            this.garminGuid_ = ByteString.EMPTY;
            this.clientVersion_ = 0;
            this.displayName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ FeatureCapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<FeatureCapabilitiesRequest, ?>) builder);
        }
    }

    public static final class FeatureCapabilitiesResponse extends GeneratedMessageV3.ExtendableMessage<FeatureCapabilitiesResponse> implements FeatureCapabilitiesResponseOrBuilder {
        public static final int GUID_STATUS_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int guidStatus_;
        private byte memoizedIsInitialized;
        private int version_;
        private static final FeatureCapabilitiesResponse DEFAULT_INSTANCE = new FeatureCapabilitiesResponse();

        @Deprecated
        public static final Parser<FeatureCapabilitiesResponse> PARSER = new AbstractParser<FeatureCapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponse.1
            @Override // com.google.protobuf.Parser
            public FeatureCapabilitiesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FeatureCapabilitiesResponse.newBuilder();
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

        private FeatureCapabilitiesResponse(GeneratedMessageV3.ExtendableBuilder<FeatureCapabilitiesResponse, ?> extendableBuilder) {
            super(extendableBuilder);
            this.guidStatus_ = 0;
            this.version_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FeatureCapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_descriptor;
        }

        public static Builder newBuilder(FeatureCapabilitiesResponse featureCapabilitiesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureCapabilitiesResponse);
        }

        public static FeatureCapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (FeatureCapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureCapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FeatureCapabilitiesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureCapabilitiesResponse)) {
                return super.equals(obj);
            }
            FeatureCapabilitiesResponse featureCapabilitiesResponse = (FeatureCapabilitiesResponse) obj;
            if (hasGuidStatus() != featureCapabilitiesResponse.hasGuidStatus()) {
                return false;
            }
            if ((!hasGuidStatus() || this.guidStatus_ == featureCapabilitiesResponse.guidStatus_) && hasVersion() == featureCapabilitiesResponse.hasVersion()) {
                return (!hasVersion() || getVersion() == featureCapabilitiesResponse.getVersion()) && getUnknownFields().equals(featureCapabilitiesResponse.getUnknownFields()) && getExtensionFields().equals(featureCapabilitiesResponse.getExtensionFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponseOrBuilder
        public GuidStatus getGuidStatus() {
            GuidStatus guidStatusForNumber = GuidStatus.forNumber(this.guidStatus_);
            return guidStatusForNumber == null ? GuidStatus.UNSET : guidStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FeatureCapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.guidStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.version_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponseOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponseOrBuilder
        public boolean hasGuidStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponseOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGuidStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.guidStatus_;
            }
            if (hasVersion()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (AbstractMessage.hashFields(iHashCode, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureCapabilitiesResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
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
            return new FeatureCapabilitiesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.guidStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.version_);
            }
            extensionWriterNewExtensionWriter.writeUntil(1002, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<FeatureCapabilitiesResponse, Builder> implements FeatureCapabilitiesResponseOrBuilder {
            private int bitField0_;
            private int guidStatus_;
            private int version_;

            private Builder() {
                this.guidStatus_ = 0;
            }

            private void buildPartial0(FeatureCapabilitiesResponse featureCapabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    featureCapabilitiesResponse.guidStatus_ = this.guidStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    featureCapabilitiesResponse.version_ = this.version_;
                    i14 |= 2;
                }
                featureCapabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<FeatureCapabilitiesResponse, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureCapabilitiesResponse build() {
                FeatureCapabilitiesResponse featureCapabilitiesResponseBuildPartial = buildPartial();
                if (featureCapabilitiesResponseBuildPartial.isInitialized()) {
                    return featureCapabilitiesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featureCapabilitiesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureCapabilitiesResponse buildPartial() {
                FeatureCapabilitiesResponse featureCapabilitiesResponse = new FeatureCapabilitiesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureCapabilitiesResponse);
                }
                onBuilt();
                return featureCapabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.guidStatus_ = 0;
                this.version_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<FeatureCapabilitiesResponse, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGuidStatus() {
                this.bitField0_ &= -2;
                this.guidStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearVersion() {
                this.bitField0_ &= -3;
                this.version_ = 0;
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
                return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponseOrBuilder
            public GuidStatus getGuidStatus() {
                GuidStatus guidStatusForNumber = GuidStatus.forNumber(this.guidStatus_);
                return guidStatusForNumber == null ? GuidStatus.UNSET : guidStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponseOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponseOrBuilder
            public boolean hasGuidStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponseOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_FeatureCapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureCapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
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
                                    if (GuidStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.guidStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.version_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<FeatureCapabilitiesResponse, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGuidStatus(GuidStatus guidStatus) {
                guidStatus.getClass();
                this.bitField0_ |= 1;
                this.guidStatus_ = guidStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVersion(int i14) {
                this.version_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FeatureCapabilitiesResponse getDefaultInstanceForType() {
                return FeatureCapabilitiesResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<FeatureCapabilitiesResponse, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<FeatureCapabilitiesResponse, Object>) generatedExtension, obj);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<FeatureCapabilitiesResponse, List<Object>>) generatedExtension, i14, obj);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.guidStatus_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<FeatureCapabilitiesResponse, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FeatureCapabilitiesResponse) {
                    return mergeFrom((FeatureCapabilitiesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FeatureCapabilitiesResponse featureCapabilitiesResponse) {
                if (featureCapabilitiesResponse == FeatureCapabilitiesResponse.getDefaultInstance()) {
                    return this;
                }
                if (featureCapabilitiesResponse.hasGuidStatus()) {
                    setGuidStatus(featureCapabilitiesResponse.getGuidStatus());
                }
                if (featureCapabilitiesResponse.hasVersion()) {
                    setVersion(featureCapabilitiesResponse.getVersion());
                }
                mergeExtensionFields(featureCapabilitiesResponse);
                mergeUnknownFields(featureCapabilitiesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FeatureCapabilitiesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureCapabilitiesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureCapabilitiesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FeatureCapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureCapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ FeatureCapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<FeatureCapabilitiesResponse, ?>) builder);
        }

        public static FeatureCapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private FeatureCapabilitiesResponse() {
            this.version_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.guidStatus_ = 0;
        }

        public static FeatureCapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FeatureCapabilitiesResponse parseFrom(InputStream inputStream) {
            return (FeatureCapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FeatureCapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureCapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (FeatureCapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FeatureCapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum GuidStatus implements ProtocolMessageEnum {
            UNSET(0),
            MATCH(1),
            NO_MATCH(2);

            public static final int MATCH_VALUE = 1;
            public static final int NO_MATCH_VALUE = 2;
            public static final int UNSET_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<GuidStatus> internalValueMap = new Internal.EnumLiteMap<GuidStatus>() { // from class: com.garmin.proto.generated.GDICore.FeatureCapabilitiesResponse.GuidStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GuidStatus findValueByNumber(int i14) {
                    return GuidStatus.forNumber(i14);
                }
            };
            private static final GuidStatus[] VALUES = values();

            GuidStatus(int i14) {
                this.value = i14;
            }

            public static GuidStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNSET;
                }
                if (i14 == 1) {
                    return MATCH;
                }
                if (i14 != 2) {
                    return null;
                }
                return NO_MATCH;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FeatureCapabilitiesResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<GuidStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static GuidStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static GuidStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class GarminGuidOverwriteRequest extends GeneratedMessageV3 implements GarminGuidOverwriteRequestOrBuilder {
        public static final int GARMIN_GUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString garminGuid_;
        private byte memoizedIsInitialized;
        private static final GarminGuidOverwriteRequest DEFAULT_INSTANCE = new GarminGuidOverwriteRequest();

        @Deprecated
        public static final Parser<GarminGuidOverwriteRequest> PARSER = new AbstractParser<GarminGuidOverwriteRequest>() { // from class: com.garmin.proto.generated.GDICore.GarminGuidOverwriteRequest.1
            @Override // com.google.protobuf.Parser
            public GarminGuidOverwriteRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GarminGuidOverwriteRequest.newBuilder();
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

        private GarminGuidOverwriteRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.garminGuid_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GarminGuidOverwriteRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_descriptor;
        }

        public static Builder newBuilder(GarminGuidOverwriteRequest garminGuidOverwriteRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(garminGuidOverwriteRequest);
        }

        public static GarminGuidOverwriteRequest parseDelimitedFrom(InputStream inputStream) {
            return (GarminGuidOverwriteRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GarminGuidOverwriteRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GarminGuidOverwriteRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GarminGuidOverwriteRequest)) {
                return super.equals(obj);
            }
            GarminGuidOverwriteRequest garminGuidOverwriteRequest = (GarminGuidOverwriteRequest) obj;
            if (hasGarminGuid() != garminGuidOverwriteRequest.hasGarminGuid()) {
                return false;
            }
            return (!hasGarminGuid() || getGarminGuid().equals(garminGuidOverwriteRequest.getGarminGuid())) && getUnknownFields().equals(garminGuidOverwriteRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICore.GarminGuidOverwriteRequestOrBuilder
        public ByteString getGarminGuid() {
            return this.garminGuid_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GarminGuidOverwriteRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.garminGuid_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.GarminGuidOverwriteRequestOrBuilder
        public boolean hasGarminGuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGarminGuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGarminGuid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GarminGuidOverwriteRequest.class, Builder.class);
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
            return new GarminGuidOverwriteRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.garminGuid_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GarminGuidOverwriteRequestOrBuilder {
            private int bitField0_;
            private ByteString garminGuid_;

            private Builder() {
                this.garminGuid_ = ByteString.EMPTY;
            }

            private void buildPartial0(GarminGuidOverwriteRequest garminGuidOverwriteRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    garminGuidOverwriteRequest.garminGuid_ = this.garminGuid_;
                } else {
                    i14 = 0;
                }
                garminGuidOverwriteRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GarminGuidOverwriteRequest build() {
                GarminGuidOverwriteRequest garminGuidOverwriteRequestBuildPartial = buildPartial();
                if (garminGuidOverwriteRequestBuildPartial.isInitialized()) {
                    return garminGuidOverwriteRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) garminGuidOverwriteRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GarminGuidOverwriteRequest buildPartial() {
                GarminGuidOverwriteRequest garminGuidOverwriteRequest = new GarminGuidOverwriteRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(garminGuidOverwriteRequest);
                }
                onBuilt();
                return garminGuidOverwriteRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.garminGuid_ = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGarminGuid() {
                this.bitField0_ &= -2;
                this.garminGuid_ = GarminGuidOverwriteRequest.getDefaultInstance().getGarminGuid();
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
                return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.GarminGuidOverwriteRequestOrBuilder
            public ByteString getGarminGuid() {
                return this.garminGuid_;
            }

            @Override // com.garmin.proto.generated.GDICore.GarminGuidOverwriteRequestOrBuilder
            public boolean hasGarminGuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GarminGuidOverwriteRequest.class, Builder.class);
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
                                    this.garminGuid_ = codedInputStream.readBytes();
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

            public Builder setGarminGuid(ByteString byteString) {
                byteString.getClass();
                this.garminGuid_ = byteString;
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
            public GarminGuidOverwriteRequest getDefaultInstanceForType() {
                return GarminGuidOverwriteRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.garminGuid_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GarminGuidOverwriteRequest) {
                    return mergeFrom((GarminGuidOverwriteRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GarminGuidOverwriteRequest garminGuidOverwriteRequest) {
                if (garminGuidOverwriteRequest == GarminGuidOverwriteRequest.getDefaultInstance()) {
                    return this;
                }
                if (garminGuidOverwriteRequest.hasGarminGuid()) {
                    setGarminGuid(garminGuidOverwriteRequest.getGarminGuid());
                }
                mergeUnknownFields(garminGuidOverwriteRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GarminGuidOverwriteRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GarminGuidOverwriteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GarminGuidOverwriteRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GarminGuidOverwriteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GarminGuidOverwriteRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ GarminGuidOverwriteRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GarminGuidOverwriteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GarminGuidOverwriteRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.garminGuid_ = byteString;
        }

        public static GarminGuidOverwriteRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GarminGuidOverwriteRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GarminGuidOverwriteRequest parseFrom(InputStream inputStream) {
            return (GarminGuidOverwriteRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GarminGuidOverwriteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GarminGuidOverwriteRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GarminGuidOverwriteRequest parseFrom(CodedInputStream codedInputStream) {
            return (GarminGuidOverwriteRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GarminGuidOverwriteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GarminGuidOverwriteRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GarminGuidOverwriteResponse extends GeneratedMessageV3 implements GarminGuidOverwriteResponseOrBuilder {
        private static final GarminGuidOverwriteResponse DEFAULT_INSTANCE = new GarminGuidOverwriteResponse();

        @Deprecated
        public static final Parser<GarminGuidOverwriteResponse> PARSER = new AbstractParser<GarminGuidOverwriteResponse>() { // from class: com.garmin.proto.generated.GDICore.GarminGuidOverwriteResponse.1
            @Override // com.google.protobuf.Parser
            public GarminGuidOverwriteResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GarminGuidOverwriteResponse.newBuilder();
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

        private GarminGuidOverwriteResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GarminGuidOverwriteResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_descriptor;
        }

        public static Builder newBuilder(GarminGuidOverwriteResponse garminGuidOverwriteResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(garminGuidOverwriteResponse);
        }

        public static GarminGuidOverwriteResponse parseDelimitedFrom(InputStream inputStream) {
            return (GarminGuidOverwriteResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GarminGuidOverwriteResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GarminGuidOverwriteResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GarminGuidOverwriteResponse)) {
                return super.equals(obj);
            }
            GarminGuidOverwriteResponse garminGuidOverwriteResponse = (GarminGuidOverwriteResponse) obj;
            if (hasStatus() != garminGuidOverwriteResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == garminGuidOverwriteResponse.status_) && getUnknownFields().equals(garminGuidOverwriteResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GarminGuidOverwriteResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDICore.GarminGuidOverwriteResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICore.GarminGuidOverwriteResponseOrBuilder
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
            return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GarminGuidOverwriteResponse.class, Builder.class);
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
            return new GarminGuidOverwriteResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GarminGuidOverwriteResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(GarminGuidOverwriteResponse garminGuidOverwriteResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    garminGuidOverwriteResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                garminGuidOverwriteResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GarminGuidOverwriteResponse build() {
                GarminGuidOverwriteResponse garminGuidOverwriteResponseBuildPartial = buildPartial();
                if (garminGuidOverwriteResponseBuildPartial.isInitialized()) {
                    return garminGuidOverwriteResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) garminGuidOverwriteResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GarminGuidOverwriteResponse buildPartial() {
                GarminGuidOverwriteResponse garminGuidOverwriteResponse = new GarminGuidOverwriteResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(garminGuidOverwriteResponse);
                }
                onBuilt();
                return garminGuidOverwriteResponse;
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
                return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.GarminGuidOverwriteResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.GarminGuidOverwriteResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_GarminGuidOverwriteResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GarminGuidOverwriteResponse.class, Builder.class);
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
            public GarminGuidOverwriteResponse getDefaultInstanceForType() {
                return GarminGuidOverwriteResponse.getDefaultInstance();
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
                if (message instanceof GarminGuidOverwriteResponse) {
                    return mergeFrom((GarminGuidOverwriteResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GarminGuidOverwriteResponse garminGuidOverwriteResponse) {
                if (garminGuidOverwriteResponse == GarminGuidOverwriteResponse.getDefaultInstance()) {
                    return this;
                }
                if (garminGuidOverwriteResponse.hasStatus()) {
                    setStatus(garminGuidOverwriteResponse.getStatus());
                }
                mergeUnknownFields(garminGuidOverwriteResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GarminGuidOverwriteResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GarminGuidOverwriteResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GarminGuidOverwriteResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GarminGuidOverwriteResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GarminGuidOverwriteResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GarminGuidOverwriteResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GarminGuidOverwriteResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GarminGuidOverwriteResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GarminGuidOverwriteResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GarminGuidOverwriteResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GarminGuidOverwriteResponse parseFrom(InputStream inputStream) {
            return (GarminGuidOverwriteResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GarminGuidOverwriteResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GarminGuidOverwriteResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GarminGuidOverwriteResponse parseFrom(CodedInputStream codedInputStream) {
            return (GarminGuidOverwriteResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GarminGuidOverwriteResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GarminGuidOverwriteResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            FAIL(2);

            public static final int FAIL_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDICore.GarminGuidOverwriteResponse.ResponseStatus.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return FAIL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GarminGuidOverwriteResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class GetLocationRequest extends GeneratedMessageV3 implements GetLocationRequestOrBuilder {
        private static final GetLocationRequest DEFAULT_INSTANCE = new GetLocationRequest();

        @Deprecated
        public static final Parser<GetLocationRequest> PARSER = new AbstractParser<GetLocationRequest>() { // from class: com.garmin.proto.generated.GDICore.GetLocationRequest.1
            @Override // com.google.protobuf.Parser
            public GetLocationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetLocationRequest.newBuilder();
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
        public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int requestType_;

        private GetLocationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.requestType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetLocationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_GetLocationRequest_descriptor;
        }

        public static Builder newBuilder(GetLocationRequest getLocationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLocationRequest);
        }

        public static GetLocationRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetLocationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetLocationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetLocationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLocationRequest)) {
                return super.equals(obj);
            }
            GetLocationRequest getLocationRequest = (GetLocationRequest) obj;
            if (hasRequestType() != getLocationRequest.hasRequestType()) {
                return false;
            }
            return (!hasRequestType() || this.requestType_ == getLocationRequest.requestType_) && getUnknownFields().equals(getLocationRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetLocationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICore.GetLocationRequestOrBuilder
        public RequestType getRequestType() {
            RequestType requestTypeForNumber = RequestType.forNumber(this.requestType_);
            return requestTypeForNumber == null ? RequestType.STANDARD : requestTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.requestType_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.GetLocationRequestOrBuilder
        public boolean hasRequestType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.requestType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_GetLocationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLocationRequest.class, Builder.class);
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
            return new GetLocationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.requestType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLocationRequestOrBuilder {
            private int bitField0_;
            private int requestType_;

            private Builder() {
                this.requestType_ = 0;
            }

            private void buildPartial0(GetLocationRequest getLocationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    getLocationRequest.requestType_ = this.requestType_;
                } else {
                    i14 = 0;
                }
                getLocationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_GetLocationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLocationRequest build() {
                GetLocationRequest getLocationRequestBuildPartial = buildPartial();
                if (getLocationRequestBuildPartial.isInitialized()) {
                    return getLocationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getLocationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLocationRequest buildPartial() {
                GetLocationRequest getLocationRequest = new GetLocationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getLocationRequest);
                }
                onBuilt();
                return getLocationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestType_ = 0;
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

            public Builder clearRequestType() {
                this.bitField0_ &= -2;
                this.requestType_ = 0;
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
                return GDICore.internal_static_GDI_Proto_Core_GetLocationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.GetLocationRequestOrBuilder
            public RequestType getRequestType() {
                RequestType requestTypeForNumber = RequestType.forNumber(this.requestType_);
                return requestTypeForNumber == null ? RequestType.STANDARD : requestTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.GetLocationRequestOrBuilder
            public boolean hasRequestType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_GetLocationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLocationRequest.class, Builder.class);
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
                                    if (RequestType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.requestType_ = i14;
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

            public Builder setRequestType(RequestType requestType) {
                requestType.getClass();
                this.bitField0_ |= 1;
                this.requestType_ = requestType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetLocationRequest getDefaultInstanceForType() {
                return GetLocationRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.requestType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetLocationRequest) {
                    return mergeFrom((GetLocationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetLocationRequest getLocationRequest) {
                if (getLocationRequest == GetLocationRequest.getDefaultInstance()) {
                    return this;
                }
                if (getLocationRequest.hasRequestType()) {
                    setRequestType(getLocationRequest.getRequestType());
                }
                mergeUnknownFields(getLocationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetLocationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetLocationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLocationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLocationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GetLocationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetLocationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GetLocationRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.requestType_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetLocationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetLocationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetLocationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetLocationRequest parseFrom(InputStream inputStream) {
            return (GetLocationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetLocationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLocationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLocationRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetLocationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetLocationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLocationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum RequestType implements ProtocolMessageEnum {
            STANDARD(0),
            EMERGENCY(1);

            public static final int EMERGENCY_VALUE = 1;
            public static final int STANDARD_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<RequestType> internalValueMap = new Internal.EnumLiteMap<RequestType>() { // from class: com.garmin.proto.generated.GDICore.GetLocationRequest.RequestType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RequestType findValueByNumber(int i14) {
                    return RequestType.forNumber(i14);
                }
            };
            private static final RequestType[] VALUES = values();

            RequestType(int i14) {
                this.value = i14;
            }

            public static RequestType forNumber(int i14) {
                if (i14 == 0) {
                    return STANDARD;
                }
                if (i14 != 1) {
                    return null;
                }
                return EMERGENCY;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetLocationRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<RequestType> internalGetValueMap() {
                return internalValueMap;
            }

            public static RequestType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RequestType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class GetLocationResponse extends GeneratedMessageV3 implements GetLocationResponseOrBuilder {
        public static final int LOCATION_DATA_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LocationData locationData_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final GetLocationResponse DEFAULT_INSTANCE = new GetLocationResponse();

        @Deprecated
        public static final Parser<GetLocationResponse> PARSER = new AbstractParser<GetLocationResponse>() { // from class: com.garmin.proto.generated.GDICore.GetLocationResponse.1
            @Override // com.google.protobuf.Parser
            public GetLocationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetLocationResponse.newBuilder();
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

        private GetLocationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetLocationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_GetLocationResponse_descriptor;
        }

        public static Builder newBuilder(GetLocationResponse getLocationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLocationResponse);
        }

        public static GetLocationResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetLocationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetLocationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetLocationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLocationResponse)) {
                return super.equals(obj);
            }
            GetLocationResponse getLocationResponse = (GetLocationResponse) obj;
            if (hasStatus() != getLocationResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == getLocationResponse.status_) && hasLocationData() == getLocationResponse.hasLocationData()) {
                return (!hasLocationData() || getLocationData().equals(getLocationResponse.getLocationData())) && getUnknownFields().equals(getLocationResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
        public LocationData getLocationData() {
            LocationData locationData = this.locationData_;
            return locationData == null ? LocationData.getDefaultInstance() : locationData;
        }

        @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
        public LocationDataOrBuilder getLocationDataOrBuilder() {
            LocationData locationData = this.locationData_;
            return locationData == null ? LocationData.getDefaultInstance() : locationData;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetLocationResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getLocationData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.OK : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
        public boolean hasLocationData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
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
            if (hasLocationData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLocationData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_GetLocationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLocationResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLocationData() || getLocationData().isInitialized()) {
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
            return new GetLocationResponse();
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
                codedOutputStream.writeMessage(2, getLocationData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLocationResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> locationDataBuilder_;
            private LocationData locationData_;
            private int status_;

            private Builder() {
                this.status_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GetLocationResponse getLocationResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    getLocationResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> singleFieldBuilderV3 = this.locationDataBuilder_;
                    getLocationResponse.locationData_ = singleFieldBuilderV3 == null ? this.locationData_ : (LocationData) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                getLocationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_GetLocationResponse_descriptor;
            }

            private SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> getLocationDataFieldBuilder() {
                if (this.locationDataBuilder_ == null) {
                    this.locationDataBuilder_ = new SingleFieldBuilderV3<>(getLocationData(), getParentForChildren(), isClean());
                    this.locationData_ = null;
                }
                return this.locationDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLocationDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLocationResponse build() {
                GetLocationResponse getLocationResponseBuildPartial = buildPartial();
                if (getLocationResponseBuildPartial.isInitialized()) {
                    return getLocationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getLocationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLocationResponse buildPartial() {
                GetLocationResponse getLocationResponse = new GetLocationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getLocationResponse);
                }
                onBuilt();
                return getLocationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
                this.locationData_ = null;
                SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> singleFieldBuilderV3 = this.locationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationDataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLocationData() {
                this.bitField0_ &= -3;
                this.locationData_ = null;
                SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> singleFieldBuilderV3 = this.locationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 1;
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
                return GDICore.internal_static_GDI_Proto_Core_GetLocationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
            public LocationData getLocationData() {
                SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> singleFieldBuilderV3 = this.locationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationData) singleFieldBuilderV3.getMessage();
                }
                LocationData locationData = this.locationData_;
                return locationData == null ? LocationData.getDefaultInstance() : locationData;
            }

            public LocationData.Builder getLocationDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LocationData.Builder) getLocationDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
            public LocationDataOrBuilder getLocationDataOrBuilder() {
                SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> singleFieldBuilderV3 = this.locationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LocationData locationData = this.locationData_;
                return locationData == null ? LocationData.getDefaultInstance() : locationData;
            }

            @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.OK : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
            public boolean hasLocationData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.GetLocationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_GetLocationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLocationResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasStatus()) {
                    return !hasLocationData() || getLocationData().isInitialized();
                }
                return false;
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
                                    codedInputStream.readMessage(getLocationDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLocationData(LocationData locationData) {
                LocationData locationData2;
                SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> singleFieldBuilderV3 = this.locationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(locationData);
                } else if ((this.bitField0_ & 2) == 0 || (locationData2 = this.locationData_) == null || locationData2 == LocationData.getDefaultInstance()) {
                    this.locationData_ = locationData;
                } else {
                    getLocationDataBuilder().mergeFrom(locationData);
                }
                if (this.locationData_ != null) {
                    this.bitField0_ |= 2;
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

            public Builder setLocationData(LocationData.Builder builder) {
                SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> singleFieldBuilderV3 = this.locationDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.locationData_ = builder.build();
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
            public GetLocationResponse getDefaultInstanceForType() {
                return GetLocationResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 1;
                maybeForceBuilderInitialization();
            }

            public Builder setLocationData(LocationData locationData) {
                SingleFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> singleFieldBuilderV3 = this.locationDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    locationData.getClass();
                    this.locationData_ = locationData;
                } else {
                    singleFieldBuilderV3.setMessage(locationData);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetLocationResponse) {
                    return mergeFrom((GetLocationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetLocationResponse getLocationResponse) {
                if (getLocationResponse == GetLocationResponse.getDefaultInstance()) {
                    return this;
                }
                if (getLocationResponse.hasStatus()) {
                    setStatus(getLocationResponse.getStatus());
                }
                if (getLocationResponse.hasLocationData()) {
                    mergeLocationData(getLocationResponse.getLocationData());
                }
                mergeUnknownFields(getLocationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetLocationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetLocationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLocationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLocationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GetLocationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetLocationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GetLocationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetLocationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetLocationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetLocationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetLocationResponse parseFrom(InputStream inputStream) {
            return (GetLocationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetLocationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLocationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLocationResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetLocationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetLocationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLocationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            OK(1),
            NO_VALID_LOCATION(2),
            LOCATION_SERVICES_UNAVAILABLE(3),
            LOCATION_SERVICES_DISABLED(4),
            TRY_AGAIN_LATER(5);

            public static final int LOCATION_SERVICES_DISABLED_VALUE = 4;
            public static final int LOCATION_SERVICES_UNAVAILABLE_VALUE = 3;
            public static final int NO_VALID_LOCATION_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int TRY_AGAIN_LATER_VALUE = 5;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDICore.GetLocationResponse.Status.1
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
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return NO_VALID_LOCATION;
                }
                if (i14 == 3) {
                    return LOCATION_SERVICES_UNAVAILABLE;
                }
                if (i14 == 4) {
                    return LOCATION_SERVICES_DISABLED;
                }
                if (i14 != 5) {
                    return null;
                }
                return TRY_AGAIN_LATER;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetLocationResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class LocationCapabilitiesRequest extends GeneratedMessageV3 implements LocationCapabilitiesRequestOrBuilder {
        public static final int LOCATION_UPDATE_FIELD_NUMBER = 18;
        public static final int NOTIFICATION_DISABLED_REASON_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int notificationDisabledReason_;
        private static final LocationCapabilitiesRequest DEFAULT_INSTANCE = new LocationCapabilitiesRequest();

        @Deprecated
        public static final Parser<LocationCapabilitiesRequest> PARSER = new AbstractParser<LocationCapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDICore.LocationCapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public LocationCapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LocationCapabilitiesRequest.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<FeatureCapabilitiesRequest, LocationCapabilitiesRequest> locationUpdate = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, LocationCapabilitiesRequest.class, getDefaultInstance());

        private LocationCapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.notificationDisabledReason_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LocationCapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(LocationCapabilitiesRequest locationCapabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(locationCapabilitiesRequest);
        }

        public static LocationCapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (LocationCapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LocationCapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LocationCapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationCapabilitiesRequest)) {
                return super.equals(obj);
            }
            LocationCapabilitiesRequest locationCapabilitiesRequest = (LocationCapabilitiesRequest) obj;
            if (hasNotificationDisabledReason() != locationCapabilitiesRequest.hasNotificationDisabledReason()) {
                return false;
            }
            return (!hasNotificationDisabledReason() || this.notificationDisabledReason_ == locationCapabilitiesRequest.notificationDisabledReason_) && getUnknownFields().equals(locationCapabilitiesRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICore.LocationCapabilitiesRequestOrBuilder
        public NotificationDisabledReason getNotificationDisabledReason() {
            NotificationDisabledReason notificationDisabledReasonForNumber = NotificationDisabledReason.forNumber(this.notificationDisabledReason_);
            return notificationDisabledReasonForNumber == null ? NotificationDisabledReason.LOW_RAM_MOBILE_DEVICE : notificationDisabledReasonForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LocationCapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.notificationDisabledReason_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationCapabilitiesRequestOrBuilder
        public boolean hasNotificationDisabledReason() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNotificationDisabledReason()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.notificationDisabledReason_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationCapabilitiesRequest.class, Builder.class);
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
            return new LocationCapabilitiesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.notificationDisabledReason_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocationCapabilitiesRequestOrBuilder {
            private int bitField0_;
            private int notificationDisabledReason_;

            private Builder() {
                this.notificationDisabledReason_ = 1;
            }

            private void buildPartial0(LocationCapabilitiesRequest locationCapabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    locationCapabilitiesRequest.notificationDisabledReason_ = this.notificationDisabledReason_;
                } else {
                    i14 = 0;
                }
                locationCapabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationCapabilitiesRequest build() {
                LocationCapabilitiesRequest locationCapabilitiesRequestBuildPartial = buildPartial();
                if (locationCapabilitiesRequestBuildPartial.isInitialized()) {
                    return locationCapabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationCapabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationCapabilitiesRequest buildPartial() {
                LocationCapabilitiesRequest locationCapabilitiesRequest = new LocationCapabilitiesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(locationCapabilitiesRequest);
                }
                onBuilt();
                return locationCapabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.notificationDisabledReason_ = 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNotificationDisabledReason() {
                this.bitField0_ &= -2;
                this.notificationDisabledReason_ = 1;
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
                return GDICore.internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationCapabilitiesRequestOrBuilder
            public NotificationDisabledReason getNotificationDisabledReason() {
                NotificationDisabledReason notificationDisabledReasonForNumber = NotificationDisabledReason.forNumber(this.notificationDisabledReason_);
                return notificationDisabledReasonForNumber == null ? NotificationDisabledReason.LOW_RAM_MOBILE_DEVICE : notificationDisabledReasonForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationCapabilitiesRequestOrBuilder
            public boolean hasNotificationDisabledReason() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_LocationCapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationCapabilitiesRequest.class, Builder.class);
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
                                    if (NotificationDisabledReason.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.notificationDisabledReason_ = i14;
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

            public Builder setNotificationDisabledReason(NotificationDisabledReason notificationDisabledReason) {
                notificationDisabledReason.getClass();
                this.bitField0_ |= 1;
                this.notificationDisabledReason_ = notificationDisabledReason.getNumber();
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
            public LocationCapabilitiesRequest getDefaultInstanceForType() {
                return LocationCapabilitiesRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.notificationDisabledReason_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LocationCapabilitiesRequest) {
                    return mergeFrom((LocationCapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LocationCapabilitiesRequest locationCapabilitiesRequest) {
                if (locationCapabilitiesRequest == LocationCapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                if (locationCapabilitiesRequest.hasNotificationDisabledReason()) {
                    setNotificationDisabledReason(locationCapabilitiesRequest.getNotificationDisabledReason());
                }
                mergeUnknownFields(locationCapabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LocationCapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LocationCapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationCapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationCapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LocationCapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LocationCapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LocationCapabilitiesRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.notificationDisabledReason_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LocationCapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LocationCapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LocationCapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LocationCapabilitiesRequest parseFrom(InputStream inputStream) {
            return (LocationCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LocationCapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationCapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (LocationCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LocationCapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LocationData extends GeneratedMessageV3.ExtendableMessage<LocationData> implements LocationDataOrBuilder {
        public static final int ALTITUDE_FIELD_NUMBER = 2;
        public static final int COURSE_FIELD_NUMBER = 9;
        public static final int DATATYPE_FIELD_NUMBER = 6;
        public static final int GPS_FIX_FIELD_NUMBER = 8;
        public static final int HORIZONTAL_ACCURACY_FIELD_NUMBER = 4;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int SESSION_UUID_FIELD_NUMBER = 7;
        public static final int SPEED_FIELD_NUMBER = 10;
        public static final int TIMESTAMP_FIELD_NUMBER = 3;
        public static final int VERTICAL_ACCURACY_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private float altitude_;
        private int bitField0_;
        private float course_;
        private int datatype_;
        private int gpsFix_;
        private float horizontalAccuracy_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.ScPoint position_;
        private GDIDataTypes.UUID sessionUuid_;
        private float speed_;
        private int timestamp_;
        private float verticalAccuracy_;
        private static final LocationData DEFAULT_INSTANCE = new LocationData();

        @Deprecated
        public static final Parser<LocationData> PARSER = new AbstractParser<LocationData>() { // from class: com.garmin.proto.generated.GDICore.LocationData.1
            @Override // com.google.protobuf.Parser
            public LocationData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LocationData.newBuilder();
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

        private LocationData(GeneratedMessageV3.ExtendableBuilder<LocationData, ?> extendableBuilder) {
            super(extendableBuilder);
            this.altitude_ = 0.0f;
            this.timestamp_ = 0;
            this.horizontalAccuracy_ = 0.0f;
            this.verticalAccuracy_ = 0.0f;
            this.datatype_ = 0;
            this.gpsFix_ = 1;
            this.course_ = 0.0f;
            this.speed_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LocationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_LocationData_descriptor;
        }

        public static Builder newBuilder(LocationData locationData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(locationData);
        }

        public static LocationData parseDelimitedFrom(InputStream inputStream) {
            return (LocationData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LocationData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LocationData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationData)) {
                return super.equals(obj);
            }
            LocationData locationData = (LocationData) obj;
            if (hasPosition() != locationData.hasPosition()) {
                return false;
            }
            if ((hasPosition() && !getPosition().equals(locationData.getPosition())) || hasAltitude() != locationData.hasAltitude()) {
                return false;
            }
            if ((hasAltitude() && Float.floatToIntBits(getAltitude()) != Float.floatToIntBits(locationData.getAltitude())) || hasTimestamp() != locationData.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != locationData.getTimestamp()) || hasHorizontalAccuracy() != locationData.hasHorizontalAccuracy()) {
                return false;
            }
            if ((hasHorizontalAccuracy() && Float.floatToIntBits(getHorizontalAccuracy()) != Float.floatToIntBits(locationData.getHorizontalAccuracy())) || hasVerticalAccuracy() != locationData.hasVerticalAccuracy()) {
                return false;
            }
            if ((hasVerticalAccuracy() && Float.floatToIntBits(getVerticalAccuracy()) != Float.floatToIntBits(locationData.getVerticalAccuracy())) || hasDatatype() != locationData.hasDatatype()) {
                return false;
            }
            if ((hasDatatype() && this.datatype_ != locationData.datatype_) || hasSessionUuid() != locationData.hasSessionUuid()) {
                return false;
            }
            if ((hasSessionUuid() && !getSessionUuid().equals(locationData.getSessionUuid())) || hasGpsFix() != locationData.hasGpsFix()) {
                return false;
            }
            if ((hasGpsFix() && this.gpsFix_ != locationData.gpsFix_) || hasCourse() != locationData.hasCourse()) {
                return false;
            }
            if ((!hasCourse() || Float.floatToIntBits(getCourse()) == Float.floatToIntBits(locationData.getCourse())) && hasSpeed() == locationData.hasSpeed()) {
                return (!hasSpeed() || Float.floatToIntBits(getSpeed()) == Float.floatToIntBits(locationData.getSpeed())) && getUnknownFields().equals(locationData.getUnknownFields()) && getExtensionFields().equals(locationData.getExtensionFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public float getAltitude() {
            return this.altitude_;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public float getCourse() {
            return this.course_;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public DataType getDatatype() {
            DataType dataTypeForNumber = DataType.forNumber(this.datatype_);
            return dataTypeForNumber == null ? DataType.SIGNIFICANT_LOCATION : dataTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public GDIDataTypes.GPSFixType getGpsFix() {
            GDIDataTypes.GPSFixType gPSFixTypeForNumber = GDIDataTypes.GPSFixType.forNumber(this.gpsFix_);
            return gPSFixTypeForNumber == null ? GDIDataTypes.GPSFixType.FORCE_NO_SOLUTION : gPSFixTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public float getHorizontalAccuracy() {
            return this.horizontalAccuracy_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LocationData> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public GDIDataTypes.ScPoint getPosition() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPosition()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(2, this.altitude_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.timestamp_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(4, this.horizontalAccuracy_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(5, this.verticalAccuracy_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(6, this.datatype_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getSessionUuid());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(8, this.gpsFix_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(9, this.course_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(10, this.speed_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public GDIDataTypes.UUID getSessionUuid() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public float getSpeed() {
            return this.speed_;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public float getVerticalAccuracy() {
            return this.verticalAccuracy_;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasCourse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasDatatype() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasGpsFix() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasHorizontalAccuracy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasSessionUuid() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasSpeed() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
        public boolean hasVerticalAccuracy() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPosition()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPosition().hashCode();
            }
            if (hasAltitude()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getAltitude());
            }
            if (hasTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTimestamp();
            }
            if (hasHorizontalAccuracy()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getHorizontalAccuracy());
            }
            if (hasVerticalAccuracy()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getVerticalAccuracy());
            }
            if (hasDatatype()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + this.datatype_;
            }
            if (hasSessionUuid()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSessionUuid().hashCode();
            }
            if (hasGpsFix()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + this.gpsFix_;
            }
            if (hasCourse()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Float.floatToIntBits(getCourse());
            }
            if (hasSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Float.floatToIntBits(getSpeed());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (AbstractMessage.hashFields(iHashCode, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_LocationData_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationData.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (hasPosition() && !getPosition().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSessionUuid() && !getSessionUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
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
            return new LocationData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPosition());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.altitude_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.timestamp_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.horizontalAccuracy_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.verticalAccuracy_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(6, this.datatype_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getSessionUuid());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeEnum(8, this.gpsFix_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(9, this.course_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeFloat(10, this.speed_);
            }
            extensionWriterNewExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<LocationData, Builder> implements LocationDataOrBuilder {
            private float altitude_;
            private int bitField0_;
            private float course_;
            private int datatype_;
            private int gpsFix_;
            private float horizontalAccuracy_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> positionBuilder_;
            private GDIDataTypes.ScPoint position_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> sessionUuidBuilder_;
            private GDIDataTypes.UUID sessionUuid_;
            private float speed_;
            private int timestamp_;
            private float verticalAccuracy_;

            private Builder() {
                this.datatype_ = 0;
                this.gpsFix_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LocationData locationData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    locationData.position_ = singleFieldBuilderV3 == null ? this.position_ : (GDIDataTypes.ScPoint) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    locationData.altitude_ = this.altitude_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    locationData.timestamp_ = this.timestamp_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    locationData.horizontalAccuracy_ = this.horizontalAccuracy_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    locationData.verticalAccuracy_ = this.verticalAccuracy_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    locationData.datatype_ = this.datatype_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.sessionUuidBuilder_;
                    locationData.sessionUuid_ = singleFieldBuilderV4 == null ? this.sessionUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV4.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    locationData.gpsFix_ = this.gpsFix_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    locationData.course_ = this.course_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    locationData.speed_ = this.speed_;
                    i14 |= 512;
                }
                locationData.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_LocationData_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3<>(getPosition(), getParentForChildren(), isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getSessionUuidFieldBuilder() {
                if (this.sessionUuidBuilder_ == null) {
                    this.sessionUuidBuilder_ = new SingleFieldBuilderV3<>(getSessionUuid(), getParentForChildren(), isClean());
                    this.sessionUuid_ = null;
                }
                return this.sessionUuidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPositionFieldBuilder();
                    getSessionUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<LocationData, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationData build() {
                LocationData locationDataBuildPartial = buildPartial();
                if (locationDataBuildPartial.isInitialized()) {
                    return locationDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationData buildPartial() {
                LocationData locationData = new LocationData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(locationData);
                }
                onBuilt();
                return locationData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.position_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                this.altitude_ = 0.0f;
                this.timestamp_ = 0;
                this.horizontalAccuracy_ = 0.0f;
                this.verticalAccuracy_ = 0.0f;
                this.datatype_ = 0;
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                this.gpsFix_ = 1;
                this.course_ = 0.0f;
                this.speed_ = 0.0f;
                return this;
            }

            public Builder clearAltitude() {
                this.bitField0_ &= -3;
                this.altitude_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearCourse() {
                this.bitField0_ &= -257;
                this.course_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearDatatype() {
                this.bitField0_ &= -33;
                this.datatype_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<LocationData, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGpsFix() {
                this.bitField0_ &= -129;
                this.gpsFix_ = 1;
                onChanged();
                return this;
            }

            public Builder clearHorizontalAccuracy() {
                this.bitField0_ &= -9;
                this.horizontalAccuracy_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPosition() {
                this.bitField0_ &= -2;
                this.position_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSessionUuid() {
                this.bitField0_ &= -65;
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSpeed() {
                this.bitField0_ &= -513;
                this.speed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -5;
                this.timestamp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVerticalAccuracy() {
                this.bitField0_ &= -17;
                this.verticalAccuracy_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public float getAltitude() {
                return this.altitude_;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public float getCourse() {
                return this.course_;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public DataType getDatatype() {
                DataType dataTypeForNumber = DataType.forNumber(this.datatype_);
                return dataTypeForNumber == null ? DataType.SIGNIFICANT_LOCATION : dataTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICore.internal_static_GDI_Proto_Core_LocationData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public GDIDataTypes.GPSFixType getGpsFix() {
                GDIDataTypes.GPSFixType gPSFixTypeForNumber = GDIDataTypes.GPSFixType.forNumber(this.gpsFix_);
                return gPSFixTypeForNumber == null ? GDIDataTypes.GPSFixType.FORCE_NO_SOLUTION : gPSFixTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public float getHorizontalAccuracy() {
                return this.horizontalAccuracy_;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public GDIDataTypes.ScPoint getPosition() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getPositionBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getPositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public GDIDataTypes.UUID getSessionUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getSessionUuidBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getSessionUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public float getSpeed() {
                return this.speed_;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public float getVerticalAccuracy() {
                return this.verticalAccuracy_;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasAltitude() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasCourse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasDatatype() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasGpsFix() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasHorizontalAccuracy() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasSessionUuid() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasSpeed() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationDataOrBuilder
            public boolean hasVerticalAccuracy() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_LocationData_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasPosition() || getPosition().isInitialized()) {
                    return (!hasSessionUuid() || getSessionUuid().isInitialized()) && extensionsAreInitialized();
                }
                return false;
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
                                    codedInputStream.readMessage(getPositionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 21:
                                    this.altitude_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.timestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 37:
                                    this.horizontalAccuracy_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 45:
                                    this.verticalAccuracy_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    int i14 = codedInputStream.readEnum();
                                    if (DataType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(6, i14);
                                    } else {
                                        this.datatype_ = i14;
                                        this.bitField0_ |= 32;
                                        continue;
                                    }
                                    break;
                                case 58:
                                    codedInputStream.readMessage(getSessionUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    int i15 = codedInputStream.readEnum();
                                    if (GDIDataTypes.GPSFixType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(8, i15);
                                    } else {
                                        this.gpsFix_ = i15;
                                        this.bitField0_ |= 128;
                                        continue;
                                    }
                                    break;
                                case 77:
                                    this.course_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 85:
                                    this.speed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 512;
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

            public Builder mergePosition(GDIDataTypes.ScPoint scPoint) {
                GDIDataTypes.ScPoint scPoint2;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 1) == 0 || (scPoint2 = this.position_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.position_ = scPoint;
                } else {
                    getPositionBuilder().mergeFrom(scPoint);
                }
                if (this.position_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSessionUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 64) == 0 || (uuid2 = this.sessionUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.sessionUuid_ = uuid;
                } else {
                    getSessionUuidBuilder().mergeFrom(uuid);
                }
                if (this.sessionUuid_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAltitude(float f14) {
                this.altitude_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCourse(float f14) {
                this.course_ = f14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setDatatype(DataType dataType) {
                dataType.getClass();
                this.bitField0_ |= 32;
                this.datatype_ = dataType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<LocationData, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGpsFix(GDIDataTypes.GPSFixType gPSFixType) {
                gPSFixType.getClass();
                this.bitField0_ |= 128;
                this.gpsFix_ = gPSFixType.getNumber();
                onChanged();
                return this;
            }

            public Builder setHorizontalAccuracy(float f14) {
                this.horizontalAccuracy_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPosition(GDIDataTypes.ScPoint.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.position_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionUuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSpeed(float f14) {
                this.speed_ = f14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setTimestamp(int i14) {
                this.timestamp_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVerticalAccuracy(float f14) {
                this.verticalAccuracy_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LocationData getDefaultInstanceForType() {
                return LocationData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<LocationData, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<LocationData, Object>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<LocationData, List<Object>>) generatedExtension, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<LocationData, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.datatype_ = 0;
                this.gpsFix_ = 1;
                maybeForceBuilderInitialization();
            }

            public Builder setPosition(GDIDataTypes.ScPoint scPoint) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.position_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSessionUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.sessionUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LocationData) {
                    return mergeFrom((LocationData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LocationData locationData) {
                if (locationData == LocationData.getDefaultInstance()) {
                    return this;
                }
                if (locationData.hasPosition()) {
                    mergePosition(locationData.getPosition());
                }
                if (locationData.hasAltitude()) {
                    setAltitude(locationData.getAltitude());
                }
                if (locationData.hasTimestamp()) {
                    setTimestamp(locationData.getTimestamp());
                }
                if (locationData.hasHorizontalAccuracy()) {
                    setHorizontalAccuracy(locationData.getHorizontalAccuracy());
                }
                if (locationData.hasVerticalAccuracy()) {
                    setVerticalAccuracy(locationData.getVerticalAccuracy());
                }
                if (locationData.hasDatatype()) {
                    setDatatype(locationData.getDatatype());
                }
                if (locationData.hasSessionUuid()) {
                    mergeSessionUuid(locationData.getSessionUuid());
                }
                if (locationData.hasGpsFix()) {
                    setGpsFix(locationData.getGpsFix());
                }
                if (locationData.hasCourse()) {
                    setCourse(locationData.getCourse());
                }
                if (locationData.hasSpeed()) {
                    setSpeed(locationData.getSpeed());
                }
                mergeExtensionFields(locationData);
                mergeUnknownFields(locationData.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LocationData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LocationData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LocationData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LocationData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LocationData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LocationData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LocationData parseFrom(InputStream inputStream) {
            return (LocationData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LocationData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationData parseFrom(CodedInputStream codedInputStream) {
            return (LocationData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LocationData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DataType implements ProtocolMessageEnum {
            SIGNIFICANT_LOCATION(0),
            GENERAL_LOCATION(1),
            REALTIME_TRACKING(2),
            INREACH_TRACKING(3),
            TRACKING_EVENT(4);

            public static final int GENERAL_LOCATION_VALUE = 1;
            public static final int INREACH_TRACKING_VALUE = 3;
            public static final int REALTIME_TRACKING_VALUE = 2;
            public static final int SIGNIFICANT_LOCATION_VALUE = 0;
            public static final int TRACKING_EVENT_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<DataType> internalValueMap = new Internal.EnumLiteMap<DataType>() { // from class: com.garmin.proto.generated.GDICore.LocationData.DataType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DataType findValueByNumber(int i14) {
                    return DataType.forNumber(i14);
                }
            };
            private static final DataType[] VALUES = values();

            DataType(int i14) {
                this.value = i14;
            }

            public static DataType forNumber(int i14) {
                if (i14 == 0) {
                    return SIGNIFICANT_LOCATION;
                }
                if (i14 == 1) {
                    return GENERAL_LOCATION;
                }
                if (i14 == 2) {
                    return REALTIME_TRACKING;
                }
                if (i14 == 3) {
                    return INREACH_TRACKING;
                }
                if (i14 != 4) {
                    return null;
                }
                return TRACKING_EVENT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LocationData.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DataType> internalGetValueMap() {
                return internalValueMap;
            }

            public static DataType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DataType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public /* synthetic */ LocationData(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<LocationData, ?>) builder);
        }

        private LocationData() {
            this.altitude_ = 0.0f;
            this.timestamp_ = 0;
            this.horizontalAccuracy_ = 0.0f;
            this.verticalAccuracy_ = 0.0f;
            this.course_ = 0.0f;
            this.speed_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.datatype_ = 0;
            this.gpsFix_ = 1;
        }
    }

    public static final class LocationUpdatedNotification extends GeneratedMessageV3 implements LocationUpdatedNotificationOrBuilder {
        public static final int LOCATION_DATA_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<LocationData> locationData_;
        private byte memoizedIsInitialized;
        private static final LocationUpdatedNotification DEFAULT_INSTANCE = new LocationUpdatedNotification();

        @Deprecated
        public static final Parser<LocationUpdatedNotification> PARSER = new AbstractParser<LocationUpdatedNotification>() { // from class: com.garmin.proto.generated.GDICore.LocationUpdatedNotification.1
            @Override // com.google.protobuf.Parser
            public LocationUpdatedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LocationUpdatedNotification.newBuilder();
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

        private LocationUpdatedNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.locationData_ = Collections.EMPTY_LIST;
        }

        public static LocationUpdatedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedNotification_descriptor;
        }

        public static Builder newBuilder(LocationUpdatedNotification locationUpdatedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(locationUpdatedNotification);
        }

        public static LocationUpdatedNotification parseDelimitedFrom(InputStream inputStream) {
            return (LocationUpdatedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LocationUpdatedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LocationUpdatedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationUpdatedNotification)) {
                return super.equals(obj);
            }
            LocationUpdatedNotification locationUpdatedNotification = (LocationUpdatedNotification) obj;
            return getLocationDataList().equals(locationUpdatedNotification.getLocationDataList()) && getUnknownFields().equals(locationUpdatedNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
        public LocationData getLocationData(int i14) {
            return this.locationData_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
        public int getLocationDataCount() {
            return this.locationData_.size();
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
        public List<LocationData> getLocationDataList() {
            return this.locationData_;
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
        public LocationDataOrBuilder getLocationDataOrBuilder(int i14) {
            return this.locationData_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
        public List<? extends LocationDataOrBuilder> getLocationDataOrBuilderList() {
            return this.locationData_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LocationUpdatedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.locationData_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.locationData_.get(i15));
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
            if (getLocationDataCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLocationDataList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationUpdatedNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getLocationDataCount(); i14++) {
                if (!getLocationData(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
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
            return new LocationUpdatedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.locationData_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.locationData_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocationUpdatedNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> locationDataBuilder_;
            private List<LocationData> locationData_;

            private Builder() {
                this.locationData_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(LocationUpdatedNotification locationUpdatedNotification) {
            }

            private void buildPartialRepeatedFields(LocationUpdatedNotification locationUpdatedNotification) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    locationUpdatedNotification.locationData_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.locationData_ = Collections.unmodifiableList(this.locationData_);
                    this.bitField0_ &= -2;
                }
                locationUpdatedNotification.locationData_ = this.locationData_;
            }

            private void ensureLocationDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.locationData_ = new ArrayList(this.locationData_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> getLocationDataFieldBuilder() {
                if (this.locationDataBuilder_ == null) {
                    this.locationDataBuilder_ = new RepeatedFieldBuilderV3<>(this.locationData_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.locationData_ = null;
                }
                return this.locationDataBuilder_;
            }

            public Builder addAllLocationData(Iterable<? extends LocationData> iterable) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureLocationDataIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.locationData_);
                onChanged();
                return this;
            }

            public Builder addLocationData(LocationData.Builder builder) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureLocationDataIsMutable();
                this.locationData_.add(builder.build());
                onChanged();
                return this;
            }

            public LocationData.Builder addLocationDataBuilder() {
                return (LocationData.Builder) getLocationDataFieldBuilder().addBuilder(LocationData.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationUpdatedNotification build() {
                LocationUpdatedNotification locationUpdatedNotificationBuildPartial = buildPartial();
                if (locationUpdatedNotificationBuildPartial.isInitialized()) {
                    return locationUpdatedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationUpdatedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationUpdatedNotification buildPartial() {
                LocationUpdatedNotification locationUpdatedNotification = new LocationUpdatedNotification(this);
                buildPartialRepeatedFields(locationUpdatedNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(locationUpdatedNotification);
                }
                onBuilt();
                return locationUpdatedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.locationData_ = Collections.EMPTY_LIST;
                } else {
                    this.locationData_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLocationData() {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.locationData_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
            public LocationData getLocationData(int i14) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                return repeatedFieldBuilderV3 == null ? this.locationData_.get(i14) : (LocationData) repeatedFieldBuilderV3.getMessage(i14);
            }

            public LocationData.Builder getLocationDataBuilder(int i14) {
                return (LocationData.Builder) getLocationDataFieldBuilder().getBuilder(i14);
            }

            public List<LocationData.Builder> getLocationDataBuilderList() {
                return getLocationDataFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
            public int getLocationDataCount() {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                return repeatedFieldBuilderV3 == null ? this.locationData_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
            public List<LocationData> getLocationDataList() {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.locationData_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
            public LocationDataOrBuilder getLocationDataOrBuilder(int i14) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                return repeatedFieldBuilderV3 == null ? this.locationData_.get(i14) : (LocationDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDICore.LocationUpdatedNotificationOrBuilder
            public List<? extends LocationDataOrBuilder> getLocationDataOrBuilderList() {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.locationData_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_LocationUpdatedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationUpdatedNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getLocationDataCount(); i14++) {
                    if (!getLocationData(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(LocationUpdatedNotification locationUpdatedNotification) {
                if (locationUpdatedNotification == LocationUpdatedNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.locationDataBuilder_ == null) {
                    if (!locationUpdatedNotification.locationData_.isEmpty()) {
                        if (this.locationData_.isEmpty()) {
                            this.locationData_ = locationUpdatedNotification.locationData_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureLocationDataIsMutable();
                            this.locationData_.addAll(locationUpdatedNotification.locationData_);
                        }
                        onChanged();
                    }
                } else if (!locationUpdatedNotification.locationData_.isEmpty()) {
                    boolean zIsEmpty = this.locationDataBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.locationDataBuilder_ = null;
                        this.locationData_ = locationUpdatedNotification.locationData_;
                        this.bitField0_ &= -2;
                        this.locationDataBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getLocationDataFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(locationUpdatedNotification.locationData_);
                    }
                }
                mergeUnknownFields(locationUpdatedNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeLocationData(int i14) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureLocationDataIsMutable();
                this.locationData_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLocationData(int i14, LocationData.Builder builder) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureLocationDataIsMutable();
                this.locationData_.set(i14, builder.build());
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
            public LocationUpdatedNotification getDefaultInstanceForType() {
                return LocationUpdatedNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.locationData_ = Collections.EMPTY_LIST;
            }

            public LocationData.Builder addLocationDataBuilder(int i14) {
                return (LocationData.Builder) getLocationDataFieldBuilder().addBuilder(i14, LocationData.getDefaultInstance());
            }

            public Builder addLocationData(int i14, LocationData locationData) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    locationData.getClass();
                    ensureLocationDataIsMutable();
                    this.locationData_.add(i14, locationData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, locationData);
                return this;
            }

            public Builder setLocationData(int i14, LocationData locationData) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    locationData.getClass();
                    ensureLocationDataIsMutable();
                    this.locationData_.set(i14, locationData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, locationData);
                return this;
            }

            public Builder addLocationData(LocationData locationData) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    locationData.getClass();
                    ensureLocationDataIsMutable();
                    this.locationData_.add(locationData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(locationData);
                return this;
            }

            public Builder addLocationData(int i14, LocationData.Builder builder) {
                RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureLocationDataIsMutable();
                    this.locationData_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LocationUpdatedNotification) {
                    return mergeFrom((LocationUpdatedNotification) message);
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
                                    LocationData locationData = (LocationData) codedInputStream.readMessage(LocationData.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<LocationData, LocationData.Builder, LocationDataOrBuilder> repeatedFieldBuilderV3 = this.locationDataBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureLocationDataIsMutable();
                                        this.locationData_.add(locationData);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(locationData);
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
        public LocationUpdatedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LocationUpdatedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationUpdatedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LocationUpdatedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LocationUpdatedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LocationUpdatedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LocationUpdatedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ LocationUpdatedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LocationUpdatedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LocationUpdatedNotification parseFrom(InputStream inputStream) {
            return (LocationUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LocationUpdatedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationUpdatedNotification parseFrom(CodedInputStream codedInputStream) {
            return (LocationUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LocationUpdatedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SyncResponse extends GeneratedMessageV3 implements SyncResponseOrBuilder {
        private static final SyncResponse DEFAULT_INSTANCE = new SyncResponse();

        @Deprecated
        public static final Parser<SyncResponse> PARSER = new AbstractParser<SyncResponse>() { // from class: com.garmin.proto.generated.GDICore.SyncResponse.1
            @Override // com.google.protobuf.Parser
            public SyncResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SyncResponse.newBuilder();
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

        private SyncResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICore.internal_static_GDI_Proto_Core_SyncResponse_descriptor;
        }

        public static Builder newBuilder(SyncResponse syncResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(syncResponse);
        }

        public static SyncResponse parseDelimitedFrom(InputStream inputStream) {
            return (SyncResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SyncResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SyncResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncResponse)) {
                return super.equals(obj);
            }
            SyncResponse syncResponse = (SyncResponse) obj;
            if (hasStatus() != syncResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == syncResponse.status_) && getUnknownFields().equals(syncResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDICore.SyncResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICore.SyncResponseOrBuilder
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
            return GDICore.internal_static_GDI_Proto_Core_SyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncResponse.class, Builder.class);
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
            return new SyncResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SyncResponse syncResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    syncResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                syncResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICore.internal_static_GDI_Proto_Core_SyncResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncResponse build() {
                SyncResponse syncResponseBuildPartial = buildPartial();
                if (syncResponseBuildPartial.isInitialized()) {
                    return syncResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) syncResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncResponse buildPartial() {
                SyncResponse syncResponse = new SyncResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(syncResponse);
                }
                onBuilt();
                return syncResponse;
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
                return GDICore.internal_static_GDI_Proto_Core_SyncResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICore.SyncResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICore.SyncResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICore.internal_static_GDI_Proto_Core_SyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncResponse.class, Builder.class);
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
            public SyncResponse getDefaultInstanceForType() {
                return SyncResponse.getDefaultInstance();
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
                if (message instanceof SyncResponse) {
                    return mergeFrom((SyncResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SyncResponse syncResponse) {
                if (syncResponse == SyncResponse.getDefaultInstance()) {
                    return this;
                }
                if (syncResponse.hasStatus()) {
                    setStatus(syncResponse.getStatus());
                }
                mergeUnknownFields(syncResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SyncResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SyncResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SyncResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SyncResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SyncResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SyncResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SyncResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(InputStream inputStream) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SyncResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(CodedInputStream codedInputStream) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            BUSY_WITH_ANOTHER_APP(2);

            public static final int BUSY_WITH_ANOTHER_APP_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDICore.SyncResponse.ResponseStatus.1
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
                return BUSY_WITH_ANOTHER_APP;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SyncResponse.getDescriptor().getEnumTypes().get(0);
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum NotificationDisabledReason implements ProtocolMessageEnum {
        LOW_RAM_MOBILE_DEVICE(1),
        PERMISSION_NOT_GRANTED(2),
        SERVICE_NOT_BOUND(3);

        public static final int LOW_RAM_MOBILE_DEVICE_VALUE = 1;
        public static final int PERMISSION_NOT_GRANTED_VALUE = 2;
        public static final int SERVICE_NOT_BOUND_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<NotificationDisabledReason> internalValueMap = new Internal.EnumLiteMap<NotificationDisabledReason>() { // from class: com.garmin.proto.generated.GDICore.NotificationDisabledReason.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NotificationDisabledReason findValueByNumber(int i14) {
                return NotificationDisabledReason.forNumber(i14);
            }
        };
        private static final NotificationDisabledReason[] VALUES = values();

        NotificationDisabledReason(int i14) {
            this.value = i14;
        }

        public static NotificationDisabledReason forNumber(int i14) {
            if (i14 == 1) {
                return LOW_RAM_MOBILE_DEVICE;
            }
            if (i14 == 2) {
                return PERMISSION_NOT_GRANTED;
            }
            if (i14 != 3) {
                return null;
            }
            return SERVICE_NOT_BOUND;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDICore.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<NotificationDisabledReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static NotificationDisabledReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static NotificationDisabledReason valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
