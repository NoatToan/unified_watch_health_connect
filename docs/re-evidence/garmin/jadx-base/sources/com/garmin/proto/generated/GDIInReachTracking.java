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
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachTracking {
    public static final int CONFIG_EXT_FIELD_NUMBER = 101;
    public static final int LOCATIONDATA_INREACH_TRACKING_EXT_FIELD_NUMBER = 1000;
    public static final int REFERENCE_EXT_FIELD_NUMBER = 101;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeConfig, DataTypeConfigExt> configExt;
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_InReachTrackingService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_InReachTrackingService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachTracking_UintListSettingValue_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachTracking_UintListSettingValue_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<GDICore.LocationData, TrackingPointInfo> locationdataInreachTrackingExt;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItemReference, GenericItemReferenceExt> referenceExt;

    public interface ChangeUintListSettingRequestOrBuilder extends MessageOrBuilder {
        UintListSettingValue getValue();

        UintListSettingValueOrBuilder getValueOrBuilder();

        boolean hasValue();
    }

    public interface ChangeUintListSettingResponseOrBuilder extends MessageOrBuilder {
        SettingError getStatus();

        boolean hasStatus();
    }

    public interface CurrentSettingsRequestOrBuilder extends MessageOrBuilder {
        int getMaxSettingsVersion();

        boolean hasMaxSettingsVersion();
    }

    public interface CurrentSettingsResponseOrBuilder extends MessageOrBuilder {
        TrackingSettings getSettings();

        TrackingSettingsOrBuilder getSettingsOrBuilder();

        SettingError getStatus();

        boolean hasSettings();

        boolean hasStatus();
    }

    public interface DataTypeConfigExtOrBuilder extends MessageOrBuilder {
        TrackingPointDateRangeQuery getPointDateRange();

        TrackingPointDateRangeQueryOrBuilder getPointDateRangeOrBuilder();

        boolean hasPointDateRange();
    }

    public interface GenericItemReferenceExtOrBuilder extends MessageOrBuilder {
        GDICore.LocationData getTrackingPoint();

        GDICore.LocationDataOrBuilder getTrackingPointOrBuilder();

        boolean hasTrackingPoint();
    }

    public interface InReachTrackingServiceOrBuilder extends MessageOrBuilder {
        ChangeUintListSettingRequest getChangeUintListSettingRequest();

        ChangeUintListSettingRequestOrBuilder getChangeUintListSettingRequestOrBuilder();

        ChangeUintListSettingResponse getChangeUintListSettingResponse();

        ChangeUintListSettingResponseOrBuilder getChangeUintListSettingResponseOrBuilder();

        CurrentSettingsRequest getCurrentSettingsRequest();

        CurrentSettingsRequestOrBuilder getCurrentSettingsRequestOrBuilder();

        CurrentSettingsResponse getCurrentSettingsResponse();

        CurrentSettingsResponseOrBuilder getCurrentSettingsResponseOrBuilder();

        LegalUintListValuesRequest getLegalUintListValuesRequest();

        LegalUintListValuesRequestOrBuilder getLegalUintListValuesRequestOrBuilder();

        LegalUintListValuesResponse getLegalUintListValuesResponse();

        LegalUintListValuesResponseOrBuilder getLegalUintListValuesResponseOrBuilder();

        LegalValuesChangedNotification getLegalValuesChangedNotification();

        LegalValuesChangedNotificationOrBuilder getLegalValuesChangedNotificationOrBuilder();

        StartTrackingRequest getStartTrackingRequest();

        StartTrackingRequestOrBuilder getStartTrackingRequestOrBuilder();

        StartTrackingResponse getStartTrackingResponse();

        StartTrackingResponseOrBuilder getStartTrackingResponseOrBuilder();

        StopTrackingRequest getStopTrackingRequest();

        StopTrackingRequestOrBuilder getStopTrackingRequestOrBuilder();

        StopTrackingResponse getStopTrackingResponse();

        StopTrackingResponseOrBuilder getStopTrackingResponseOrBuilder();

        TrackingPointNotification getTrackingPointNotification();

        TrackingPointNotificationOrBuilder getTrackingPointNotificationOrBuilder();

        TrackingSessionNotification getTrackingSessionNotification();

        TrackingSessionNotificationOrBuilder getTrackingSessionNotificationOrBuilder();

        TrackingStateRequest getTrackingStateRequest();

        TrackingStateRequestOrBuilder getTrackingStateRequestOrBuilder();

        TrackingStateResponse getTrackingStateResponse();

        TrackingStateResponseOrBuilder getTrackingStateResponseOrBuilder();

        TrackingStatusNotification getTrackingStatusNotification();

        TrackingStatusNotificationOrBuilder getTrackingStatusNotificationOrBuilder();

        TrackingSubscribeRequest getTrackingSubscribeRequest();

        TrackingSubscribeRequestOrBuilder getTrackingSubscribeRequestOrBuilder();

        TrackingSubscribeResponse getTrackingSubscribeResponse();

        TrackingSubscribeResponseOrBuilder getTrackingSubscribeResponseOrBuilder();

        boolean hasChangeUintListSettingRequest();

        boolean hasChangeUintListSettingResponse();

        boolean hasCurrentSettingsRequest();

        boolean hasCurrentSettingsResponse();

        boolean hasLegalUintListValuesRequest();

        boolean hasLegalUintListValuesResponse();

        boolean hasLegalValuesChangedNotification();

        boolean hasStartTrackingRequest();

        boolean hasStartTrackingResponse();

        boolean hasStopTrackingRequest();

        boolean hasStopTrackingResponse();

        boolean hasTrackingPointNotification();

        boolean hasTrackingSessionNotification();

        boolean hasTrackingStateRequest();

        boolean hasTrackingStateResponse();

        boolean hasTrackingStatusNotification();

        boolean hasTrackingSubscribeRequest();

        boolean hasTrackingSubscribeResponse();
    }

    public interface LegalUintListValuesRequestOrBuilder extends MessageOrBuilder {
        UintListSetting getSetting();

        boolean hasSetting();
    }

    public interface LegalUintListValuesResponseOrBuilder extends MessageOrBuilder {
        UintListSettingSpecialValue getLegalSpecialValues(int i14);

        int getLegalSpecialValuesCount();

        List<UintListSettingSpecialValue> getLegalSpecialValuesList();

        int getLegalValues(int i14);

        int getLegalValuesCount();

        List<Integer> getLegalValuesList();

        UintListSetting getSetting();

        SettingError getStatus();

        boolean hasSetting();

        boolean hasStatus();
    }

    public interface LegalValuesChangedNotificationOrBuilder extends MessageOrBuilder {
        UintListSetting getChangedUintLists(int i14);

        int getChangedUintListsCount();

        List<UintListSetting> getChangedUintListsList();
    }

    public interface StartTrackingRequestOrBuilder extends MessageOrBuilder {
    }

    public interface StartTrackingResponseOrBuilder extends MessageOrBuilder {
        StartTrackingResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface StopTrackingRequestOrBuilder extends MessageOrBuilder {
    }

    public interface StopTrackingResponseOrBuilder extends MessageOrBuilder {
        StopTrackingResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface TrackingPointDateRangeQueryOrBuilder extends MessageOrBuilder {
        int getDateBegin();

        int getDateEnd();

        int getPointLimit();

        GDIDataTypes.UUID getSessionUuid();

        GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder();

        boolean hasDateBegin();

        boolean hasDateEnd();

        boolean hasPointLimit();

        boolean hasSessionUuid();
    }

    public interface TrackingPointInfoOrBuilder extends MessageOrBuilder {
        TrackingState getState();

        TrackingPointInfo.PointStatus getStatus();

        TrackingPointInfo.PointType getType();

        boolean hasState();

        boolean hasStatus();

        boolean hasType();
    }

    public interface TrackingPointNotificationOrBuilder extends MessageOrBuilder {
        GDICore.LocationData getPoints(int i14);

        int getPointsCount();

        List<GDICore.LocationData> getPointsList();

        GDICore.LocationDataOrBuilder getPointsOrBuilder(int i14);

        List<? extends GDICore.LocationDataOrBuilder> getPointsOrBuilderList();
    }

    public interface TrackingSessionInfoOrBuilder extends MessageOrBuilder {
        int getLastSentTimestamp();

        boolean getSendPending();

        int getStartTime();

        float getTotalDistanceM();

        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        boolean hasLastSentTimestamp();

        boolean hasSendPending();

        boolean hasStartTime();

        boolean hasTotalDistanceM();

        boolean hasUuid();
    }

    public interface TrackingSessionNotificationOrBuilder extends MessageOrBuilder {
        TrackingSessionInfo getSessionInfo();

        TrackingSessionInfoOrBuilder getSessionInfoOrBuilder();

        boolean hasSessionInfo();
    }

    public interface TrackingSettingsOrBuilder extends MessageOrBuilder {
        int getSettingsVersion();

        UintListSettingValue getUintListValues(int i14);

        int getUintListValuesCount();

        List<UintListSettingValue> getUintListValuesList();

        UintListSettingValueOrBuilder getUintListValuesOrBuilder(int i14);

        List<? extends UintListSettingValueOrBuilder> getUintListValuesOrBuilderList();

        boolean hasSettingsVersion();
    }

    public interface TrackingStateRequestOrBuilder extends MessageOrBuilder {
    }

    public interface TrackingStateResponseOrBuilder extends MessageOrBuilder {
        TrackingSessionInfo getSessionInfo();

        TrackingSessionInfoOrBuilder getSessionInfoOrBuilder();

        GDIDataTypes.UUID getSessionUuid();

        GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder();

        TrackingSettings getSettings();

        TrackingSettingsOrBuilder getSettingsOrBuilder();

        TrackingStateResponse.Status getStatus();

        TrackingState getTracking();

        boolean hasSessionInfo();

        boolean hasSessionUuid();

        boolean hasSettings();

        boolean hasStatus();

        boolean hasTracking();
    }

    public interface TrackingStatusNotificationOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getSessionUuid();

        GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder();

        TrackingSettings getSettings();

        TrackingSettingsOrBuilder getSettingsOrBuilder();

        TrackingState getTracking();

        boolean hasSessionUuid();

        boolean hasSettings();

        boolean hasTracking();
    }

    public interface TrackingSubscribeRequestOrBuilder extends MessageOrBuilder {
        boolean getWantLegalValuesChanged();

        boolean getWantPoint();

        boolean getWantSession();

        boolean getWantStatus();

        boolean hasWantLegalValuesChanged();

        boolean hasWantPoint();

        boolean hasWantSession();

        boolean hasWantStatus();
    }

    public interface TrackingSubscribeResponseOrBuilder extends MessageOrBuilder {
        TrackingSubscribeResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface UintListSettingValueOrBuilder extends MessageOrBuilder {
        UintListSetting getSetting();

        UintListSettingSpecialValue getSpecial();

        int getValue();

        boolean hasSetting();

        boolean hasSpecial();

        boolean hasValue();
    }

    static {
        GeneratedMessage.GeneratedExtension<GDICore.LocationData, TrackingPointInfo> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(TrackingPointInfo.class, TrackingPointInfo.getDefaultInstance());
        locationdataInreachTrackingExt = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeConfig, DataTypeConfigExt> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(DataTypeConfigExt.class, DataTypeConfigExt.getDefaultInstance());
        configExt = generatedExtensionNewFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItemReference, GenericItemReferenceExt> generatedExtensionNewFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(GenericItemReferenceExt.class, GenericItemReferenceExt.getDefaultInstance());
        referenceExt = generatedExtensionNewFileScopedGeneratedExtension3;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018GDIInReachTracking.proto\u0012\u0019GDI.Proto.InReachTracking\u001a\u0012GDIDataTypes.proto\u001a\rGDICore.proto\u001a\u001cGDIGenericItemTransfer.proto\"å\f\n\u0016InReachTrackingService\u0012O\n\u0016tracking_state_request\u0018\u0001 \u0001(\u000b2/.GDI.Proto.InReachTracking.TrackingStateRequest\u0012Q\n\u0017tracking_state_response\u0018\u0002 \u0001(\u000b20.GDI.Proto.InReachTracking.TrackingStateResponse\u0012O\n\u0016start_tracking_request\u0018\u0003 \u0001(\u000b2/.GDI.Proto.InReachTracking.StartTrackingRequest\u0012Q\n\u0017start_tracking_response\u0018\u0004 \u0001(\u000b20.GDI.Proto.InReachTracking.StartTrackingResponse\u0012M\n\u0015stop_tracking_request\u0018\u0005 \u0001(\u000b2..GDI.Proto.InReachTracking.StopTrackingRequest\u0012O\n\u0016stop_tracking_response\u0018\u0006 \u0001(\u000b2/.GDI.Proto.InReachTracking.StopTrackingResponse\u0012S\n\u0018current_settings_request\u0018\u0007 \u0001(\u000b21.GDI.Proto.InReachTracking.CurrentSettingsRequest\u0012U\n\u0019current_settings_response\u0018\b \u0001(\u000b22.GDI.Proto.InReachTracking.CurrentSettingsResponse\u0012]\n\u001elegal_uint_list_values_request\u0018\t \u0001(\u000b25.GDI.Proto.InReachTracking.LegalUintListValuesRequest\u0012_\n\u001flegal_uint_list_values_response\u0018\n \u0001(\u000b26.GDI.Proto.InReachTracking.LegalUintListValuesResponse\u0012a\n change_uint_list_setting_request\u0018\u000b \u0001(\u000b27.GDI.Proto.InReachTracking.ChangeUintListSettingRequest\u0012c\n!change_uint_list_setting_response\u0018\f \u0001(\u000b28.GDI.Proto.InReachTracking.ChangeUintListSettingResponse\u0012W\n\u001atracking_subscribe_request\u0018\r \u0001(\u000b23.GDI.Proto.InReachTracking.TrackingSubscribeRequest\u0012Y\n\u001btracking_subscribe_response\u0018\u000e \u0001(\u000b24.GDI.Proto.InReachTracking.TrackingSubscribeResponse\u0012[\n\u001ctracking_status_notification\u0018\u000f \u0001(\u000b25.GDI.Proto.InReachTracking.TrackingStatusNotification\u0012d\n!legal_values_changed_notification\u0018\u0010 \u0001(\u000b29.GDI.Proto.InReachTracking.LegalValuesChangedNotification\u0012]\n\u001dtracking_session_notification\u0018\u0011 \u0001(\u000b26.GDI.Proto.InReachTracking.TrackingSessionNotification\u0012Y\n\u001btracking_point_notification\u0018\u0012 \u0001(\u000b24.GDI.Proto.InReachTracking.TrackingPointNotification\"\u009f\u0001\n\u0013TrackingSessionInfo\u0012'\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012\u0012\n\nstart_time\u0018\u0002 \u0001(\u0007\u0012\u001b\n\u0013last_sent_timestamp\u0018\u0003 \u0001(\u0007\u0012\u0014\n\fsend_pending\u0018\u0004 \u0001(\b\u0012\u0018\n\u0010total_distance_m\u0018\u0005 \u0001(\u0002\"\u0084\u0003\n\u0011TrackingPointInfo\u00127\n\u0005state\u0018\u0001 \u0001(\u000e2(.GDI.Proto.InReachTracking.TrackingState\u0012D\n\u0004type\u0018\u0002 \u0001(\u000e26.GDI.Proto.InReachTracking.TrackingPointInfo.PointType\u0012H\n\u0006status\u0018\u0003 \u0001(\u000e28.GDI.Proto.InReachTracking.TrackingPointInfo.PointStatus\"M\n\tPointType\u0012\u001f\n\u001bTRACKING_POINT_TYPE_UNKNOWN\u0010\u0000\u0012\t\n\u0005START\u0010\u0001\u0012\n\n\u0006NORMAL\u0010\u0002\u0012\b\n\u0004STOP\u0010\u0003\"W\n\u000bPointStatus\u0012!\n\u001dTRACKING_POINT_STATUS_UNKNOWN\u0010\u0000\u0012\n\n\u0006FAILED\u0010\u0001\u0012\u000b\n\u0007PENDING\u0010\u0002\u0012\f\n\bCOMPLETE\u0010\u0003\"\u0016\n\u0014TrackingStateRequest\"\u008b\u0003\n\u0015TrackingStateResponse\u0012G\n\u0006status\u0018\u0001 \u0002(\u000e27.GDI.Proto.InReachTracking.TrackingStateResponse.Status\u0012:\n\btracking\u0018\u0002 \u0001(\u000e2(.GDI.Proto.InReachTracking.TrackingState\u0012=\n\bsettings\u0018\u0003 \u0001(\u000b2+.GDI.Proto.InReachTracking.TrackingSettings\u0012/\n\fsession_uuid\u0018\u0004 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012D\n\fsession_info\u0018\u0005 \u0001(\u000b2..GDI.Proto.InReachTracking.TrackingSessionInfo\"7\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\"\u0016\n\u0014StartTrackingRequest\"ø\u0001\n\u0015StartTrackingResponse\u0012G\n\u0006status\u0018\u0001 \u0002(\u000e27.GDI.Proto.InReachTracking.StartTrackingResponse.Status\"\u0095\u0001\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\u0012\u0014\n\u0010ALREADY_TRACKING\u0010\u0003\u0012\u0011\n\rNOT_ACTIVATED\u0010\u0004\u0012\u001a\n\u0016MOVING_INTERVAL_IS_OFF\u0010\u0005\u0012\u0017\n\u0013UNSUPPORTED_BY_PLAN\u0010\u0006\"\u0015\n\u0013StopTrackingRequest\"Å\u0001\n\u0014StopTrackingResponse\u0012F\n\u0006status\u0018\u0001 \u0002(\u000e26.GDI.Proto.InReachTracking.StopTrackingResponse.Status\"e\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\u0012\u0013\n\u000fSTOP_DISALLOWED\u0010\u0003\u0012\u0017\n\u0013UNSUPPORTED_BY_PLAN\u0010\u0004\"w\n\u0010TrackingSettings\u0012\u0018\n\u0010settings_version\u0018\u0001 \u0002(\r\u0012I\n\u0010uint_list_values\u0018\u0002 \u0003(\u000b2/.GDI.Proto.InReachTracking.UintListSettingValue\"«\u0001\n\u0014UintListSettingValue\u0012;\n\u0007setting\u0018\u0001 \u0002(\u000e2*.GDI.Proto.InReachTracking.UintListSetting\u0012\r\n\u0005value\u0018\u0002 \u0001(\r\u0012G\n\u0007special\u0018\u0003 \u0001(\u000e26.GDI.Proto.InReachTracking.UintListSettingSpecialValue\"6\n\u0016CurrentSettingsRequest\u0012\u001c\n\u0014max_settings_version\u0018\u0001 \u0002(\r\"\u0091\u0001\n\u0017CurrentSettingsResponse\u00127\n\u0006status\u0018\u0001 \u0002(\u000e2'.GDI.Proto.InReachTracking.SettingError\u0012=\n\bsettings\u0018\u0002 \u0001(\u000b2+.GDI.Proto.InReachTracking.TrackingSettings\"Y\n\u001aLegalUintListValuesRequest\u0012;\n\u0007setting\u0018\u0001 \u0002(\u000e2*.GDI.Proto.InReachTracking.UintListSetting\"ÿ\u0001\n\u001bLegalUintListValuesResponse\u00127\n\u0006status\u0018\u0001 \u0002(\u000e2'.GDI.Proto.InReachTracking.SettingError\u0012;\n\u0007setting\u0018\u0002 \u0001(\u000e2*.GDI.Proto.InReachTracking.UintListSetting\u0012\u0014\n\flegal_values\u0018\u0003 \u0003(\r\u0012T\n\u0014legal_special_values\u0018\u0004 \u0003(\u000e26.GDI.Proto.InReachTracking.UintListSettingSpecialValue\"^\n\u001cChangeUintListSettingRequest\u0012>\n\u0005value\u0018\u0001 \u0002(\u000b2/.GDI.Proto.InReachTracking.UintListSettingValue\"X\n\u001dChangeUintListSettingResponse\u00127\n\u0006status\u0018\u0001 \u0002(\u000e2'.GDI.Proto.InReachTracking.SettingError\"\u0098\u0001\n\u0018TrackingSubscribeRequest\u0012\u001a\n\u000bwant_status\u0018\u0001 \u0001(\b:\u0005false\u0012(\n\u0019want_legal_values_changed\u0018\u0002 \u0001(\b:\u0005false\u0012\u001b\n\fwant_session\u0018\u0003 \u0001(\b:\u0005false\u0012\u0019\n\nwant_point\u0018\u0004 \u0001(\b:\u0005false\"\u008d\u0001\n\u0019TrackingSubscribeResponse\u0012K\n\u0006status\u0018\u0001 \u0002(\u000e2;.GDI.Proto.InReachTracking.TrackingSubscribeResponse.Status\"#\n\u0006Status\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\"È\u0001\n\u001aTrackingStatusNotification\u0012:\n\btracking\u0018\u0001 \u0002(\u000e2(.GDI.Proto.InReachTracking.TrackingState\u0012=\n\bsettings\u0018\u0002 \u0001(\u000b2+.GDI.Proto.InReachTracking.TrackingSettings\u0012/\n\fsession_uuid\u0018\u0003 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"c\n\u001bTrackingSessionNotification\u0012D\n\fsession_info\u0018\u0001 \u0001(\u000b2..GDI.Proto.InReachTracking.TrackingSessionInfo\"I\n\u0019TrackingPointNotification\u0012,\n\u0006points\u0018\u0001 \u0003(\u000b2\u001c.GDI.Proto.Core.LocationData\"h\n\u001eLegalValuesChangedNotification\u0012F\n\u0012changed_uint_lists\u0018\u0001 \u0003(\u000e2*.GDI.Proto.InReachTracking.UintListSetting\"\u0089\u0001\n\u001bTrackingPointDateRangeQuery\u0012\u0012\n\ndate_begin\u0018\u0001 \u0001(\u0007\u0012\u0010\n\bdate_end\u0018\u0002 \u0001(\u0007\u0012\u0013\n\u000bpoint_limit\u0018\u0003 \u0001(\r\u0012/\n\fsession_uuid\u0018\u0004 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"e\n\u0011DataTypeConfigExt\u0012P\n\u0010point_date_range\u0018\u0001 \u0001(\u000b26.GDI.Proto.InReachTracking.TrackingPointDateRangeQuery\"O\n\u0017GenericItemReferenceExt\u00124\n\u000etracking_point\u0018\u0001 \u0001(\u000b2\u001c.GDI.Proto.Core.LocationData*`\n\rTrackingState\u0012\u0016\n\u0012TRACKING_STATE_OFF\u0010\u0001\u0012\u0019\n\u0015TRACKING_STATE_NORMAL\u0010\u0002\u0012\u001c\n\u0018TRACKING_STATE_EMERGENCY\u0010\u0003*Å\u0001\n\fSettingError\u0012\u0019\n\u0015SETTING_ERROR_UNKNOWN\u0010\u0000\u0012\u0014\n\u0010SETTING_ERROR_OK\u0010\u0001\u0012\u0019\n\u0015SETTING_ERROR_GENERIC\u0010\u0002\u0012!\n\u001dSETTING_ERROR_UNKNOWN_SETTING\u0010\u0003\u0012%\n!SETTING_ERROR_UNAVAILABLE_SETTING\u0010\u0004\u0012\u001f\n\u001bSETTING_ERROR_ILLEGAL_VALUE\u0010\u0005*R\n\u000fUintListSetting\u0012\u0013\n\u000fMOVING_INTERVAL\u0010\u0001\u0012\u0014\n\u0010RESTING_INTERVAL\u0010\u0002\u0012\u0014\n\u0010RESTING_DISTANCE\u0010\u0003*u\n\u001bUintListSettingSpecialValue\u0012\u0017\n\u0013MOVING_INTERVAL_OFF\u0010\u0001\u0012#\n\u001fRESTING_INTERVAL_SAME_AS_MOVING\u0010\u0002\u0012\u0018\n\u0014RESTING_DISTANCE_OFF\u0010\u0003:v\n!locationdata_inreach_tracking_ext\u0012\u001c.GDI.Proto.Core.LocationData\u0018è\u0007 \u0001(\u000b2,.GDI.Proto.InReachTracking.TrackingPointInfo:o\n\nconfig_ext\u0012-.GDI.Proto.GenericItemTransfer.DataTypeConfig\u0018e \u0001(\u000b2,.GDI.Proto.InReachTracking.DataTypeConfigExt:~\n\rreference_ext\u00123.GDI.Proto.GenericItemTransfer.GenericItemReference\u0018e \u0001(\u000b22.GDI.Proto.InReachTracking.GenericItemReferenceExtB2\n\u001acom.garmin.proto.generatedB\u0012GDIInReachTrackingH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor(), GDICore.getDescriptor(), GDIGenericItemTransferProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) f3.t(0);
        internal_static_GDI_Proto_InReachTracking_InReachTrackingService_descriptor = descriptor2;
        internal_static_GDI_Proto_InReachTracking_InReachTrackingService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TrackingStateRequest", "TrackingStateResponse", "StartTrackingRequest", "StartTrackingResponse", "StopTrackingRequest", "StopTrackingResponse", "CurrentSettingsRequest", "CurrentSettingsResponse", "LegalUintListValuesRequest", "LegalUintListValuesResponse", "ChangeUintListSettingRequest", "ChangeUintListSettingResponse", "TrackingSubscribeRequest", "TrackingSubscribeResponse", "TrackingStatusNotification", "LegalValuesChangedNotification", "TrackingSessionNotification", "TrackingPointNotification"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) f3.t(1);
        internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_descriptor = descriptor3;
        internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Uuid", "StartTime", "LastSentTimestamp", "SendPending", "TotalDistanceM"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) f3.t(2);
        internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_descriptor = descriptor4;
        internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"State", "Type", "Status"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) f3.t(3);
        internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) f3.t(4);
        internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status", "Tracking", "Settings", "SessionUuid", "SessionInfo"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) f3.t(5);
        internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) f3.t(6);
        internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) f3.t(7);
        internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) f3.t(8);
        internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) f3.t(9);
        internal_static_GDI_Proto_InReachTracking_TrackingSettings_descriptor = descriptor11;
        internal_static_GDI_Proto_InReachTracking_TrackingSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SettingsVersion", "UintListValues"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) f3.t(10);
        internal_static_GDI_Proto_InReachTracking_UintListSettingValue_descriptor = descriptor12;
        internal_static_GDI_Proto_InReachTracking_UintListSettingValue_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Setting", "Value", "Special"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) f3.t(11);
        internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"MaxSettingsVersion"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) f3.t(12);
        internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Status", "Settings"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) f3.t(13);
        internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Setting"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) f3.t(14);
        internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Status", "Setting", "LegalValues", "LegalSpecialValues"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) f3.t(15);
        internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_descriptor = descriptor17;
        internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Value"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) f3.t(16);
        internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_descriptor = descriptor18;
        internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Status"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) f3.t(17);
        internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_descriptor = descriptor19;
        internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"WantStatus", "WantLegalValuesChanged", "WantSession", "WantPoint"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) f3.t(18);
        internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_descriptor = descriptor20;
        internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Status"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) f3.t(19);
        internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_descriptor = descriptor21;
        internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Tracking", "Settings", "SessionUuid"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) f3.t(20);
        internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_descriptor = descriptor22;
        internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"SessionInfo"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) f3.t(21);
        internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_descriptor = descriptor23;
        internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Points"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) f3.t(22);
        internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_descriptor = descriptor24;
        internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"ChangedUintLists"});
        Descriptors.Descriptor descriptor25 = (Descriptors.Descriptor) f3.t(23);
        internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_descriptor = descriptor25;
        internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"DateBegin", "DateEnd", "PointLimit", "SessionUuid"});
        Descriptors.Descriptor descriptor26 = (Descriptors.Descriptor) f3.t(24);
        internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_descriptor = descriptor26;
        internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"PointDateRange"});
        Descriptors.Descriptor descriptor27 = (Descriptors.Descriptor) f3.t(25);
        internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_descriptor = descriptor27;
        internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"TrackingPoint"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        generatedExtensionNewFileScopedGeneratedExtension3.internalInit(descriptor.getExtensions().get(2));
        GDIDataTypes.getDescriptor();
        GDICore.getDescriptor();
        GDIGenericItemTransferProto.getDescriptor();
    }

    private GDIInReachTracking() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(locationdataInreachTrackingExt);
        extensionRegistryLite.add(configExt);
        extensionRegistryLite.add(referenceExt);
    }

    public static final class CurrentSettingsRequest extends GeneratedMessageV3 implements CurrentSettingsRequestOrBuilder {
        public static final int MAX_SETTINGS_VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int maxSettingsVersion_;
        private byte memoizedIsInitialized;
        private static final CurrentSettingsRequest DEFAULT_INSTANCE = new CurrentSettingsRequest();

        @Deprecated
        public static final Parser<CurrentSettingsRequest> PARSER = new AbstractParser<CurrentSettingsRequest>() { // from class: com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public CurrentSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CurrentSettingsRequest.newBuilder();
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

        private CurrentSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.maxSettingsVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CurrentSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_descriptor;
        }

        public static Builder newBuilder(CurrentSettingsRequest currentSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(currentSettingsRequest);
        }

        public static CurrentSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (CurrentSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CurrentSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CurrentSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CurrentSettingsRequest)) {
                return super.equals(obj);
            }
            CurrentSettingsRequest currentSettingsRequest = (CurrentSettingsRequest) obj;
            if (hasMaxSettingsVersion() != currentSettingsRequest.hasMaxSettingsVersion()) {
                return false;
            }
            return (!hasMaxSettingsVersion() || getMaxSettingsVersion() == currentSettingsRequest.getMaxSettingsVersion()) && getUnknownFields().equals(currentSettingsRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsRequestOrBuilder
        public int getMaxSettingsVersion() {
            return this.maxSettingsVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CurrentSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.maxSettingsVersion_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsRequestOrBuilder
        public boolean hasMaxSettingsVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMaxSettingsVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMaxSettingsVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CurrentSettingsRequest.class, Builder.class);
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
            if (hasMaxSettingsVersion()) {
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
            return new CurrentSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.maxSettingsVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CurrentSettingsRequestOrBuilder {
            private int bitField0_;
            private int maxSettingsVersion_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CurrentSettingsRequest currentSettingsRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    currentSettingsRequest.maxSettingsVersion_ = this.maxSettingsVersion_;
                } else {
                    i14 = 0;
                }
                currentSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CurrentSettingsRequest build() {
                CurrentSettingsRequest currentSettingsRequestBuildPartial = buildPartial();
                if (currentSettingsRequestBuildPartial.isInitialized()) {
                    return currentSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) currentSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CurrentSettingsRequest buildPartial() {
                CurrentSettingsRequest currentSettingsRequest = new CurrentSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(currentSettingsRequest);
                }
                onBuilt();
                return currentSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.maxSettingsVersion_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxSettingsVersion() {
                this.bitField0_ &= -2;
                this.maxSettingsVersion_ = 0;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsRequestOrBuilder
            public int getMaxSettingsVersion() {
                return this.maxSettingsVersion_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsRequestOrBuilder
            public boolean hasMaxSettingsVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CurrentSettingsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasMaxSettingsVersion();
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
                                    this.maxSettingsVersion_ = codedInputStream.readUInt32();
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

            public Builder setMaxSettingsVersion(int i14) {
                this.maxSettingsVersion_ = i14;
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
            public CurrentSettingsRequest getDefaultInstanceForType() {
                return CurrentSettingsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CurrentSettingsRequest) {
                    return mergeFrom((CurrentSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CurrentSettingsRequest currentSettingsRequest) {
                if (currentSettingsRequest == CurrentSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (currentSettingsRequest.hasMaxSettingsVersion()) {
                    setMaxSettingsVersion(currentSettingsRequest.getMaxSettingsVersion());
                }
                mergeUnknownFields(currentSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CurrentSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CurrentSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CurrentSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CurrentSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CurrentSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CurrentSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CurrentSettingsRequest() {
            this.maxSettingsVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CurrentSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CurrentSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CurrentSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CurrentSettingsRequest parseFrom(InputStream inputStream) {
            return (CurrentSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CurrentSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CurrentSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CurrentSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (CurrentSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CurrentSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CurrentSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartTrackingRequest extends GeneratedMessageV3 implements StartTrackingRequestOrBuilder {
        private static final StartTrackingRequest DEFAULT_INSTANCE = new StartTrackingRequest();

        @Deprecated
        public static final Parser<StartTrackingRequest> PARSER = new AbstractParser<StartTrackingRequest>() { // from class: com.garmin.proto.generated.GDIInReachTracking.StartTrackingRequest.1
            @Override // com.google.protobuf.Parser
            public StartTrackingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartTrackingRequest.newBuilder();
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

        private StartTrackingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartTrackingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_descriptor;
        }

        public static Builder newBuilder(StartTrackingRequest startTrackingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startTrackingRequest);
        }

        public static StartTrackingRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartTrackingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartTrackingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartTrackingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StartTrackingRequest) {
                return getUnknownFields().equals(((StartTrackingRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartTrackingRequest> getParserForType() {
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
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartTrackingRequest.class, Builder.class);
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
            return new StartTrackingRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartTrackingRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartTrackingRequest build() {
                StartTrackingRequest startTrackingRequestBuildPartial = buildPartial();
                if (startTrackingRequestBuildPartial.isInitialized()) {
                    return startTrackingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startTrackingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartTrackingRequest buildPartial() {
                StartTrackingRequest startTrackingRequest = new StartTrackingRequest(this);
                onBuilt();
                return startTrackingRequest;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartTrackingRequest.class, Builder.class);
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
            public StartTrackingRequest getDefaultInstanceForType() {
                return StartTrackingRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartTrackingRequest) {
                    return mergeFrom((StartTrackingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartTrackingRequest startTrackingRequest) {
                if (startTrackingRequest == StartTrackingRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(startTrackingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartTrackingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StartTrackingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StartTrackingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartTrackingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTrackingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartTrackingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StartTrackingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartTrackingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartTrackingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartTrackingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartTrackingRequest parseFrom(InputStream inputStream) {
            return (StartTrackingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartTrackingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTrackingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartTrackingRequest parseFrom(CodedInputStream codedInputStream) {
            return (StartTrackingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartTrackingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTrackingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StopTrackingRequest extends GeneratedMessageV3 implements StopTrackingRequestOrBuilder {
        private static final StopTrackingRequest DEFAULT_INSTANCE = new StopTrackingRequest();

        @Deprecated
        public static final Parser<StopTrackingRequest> PARSER = new AbstractParser<StopTrackingRequest>() { // from class: com.garmin.proto.generated.GDIInReachTracking.StopTrackingRequest.1
            @Override // com.google.protobuf.Parser
            public StopTrackingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopTrackingRequest.newBuilder();
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

        private StopTrackingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopTrackingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_descriptor;
        }

        public static Builder newBuilder(StopTrackingRequest stopTrackingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopTrackingRequest);
        }

        public static StopTrackingRequest parseDelimitedFrom(InputStream inputStream) {
            return (StopTrackingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopTrackingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopTrackingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StopTrackingRequest) {
                return getUnknownFields().equals(((StopTrackingRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopTrackingRequest> getParserForType() {
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
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StopTrackingRequest.class, Builder.class);
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
            return new StopTrackingRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopTrackingRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopTrackingRequest build() {
                StopTrackingRequest stopTrackingRequestBuildPartial = buildPartial();
                if (stopTrackingRequestBuildPartial.isInitialized()) {
                    return stopTrackingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopTrackingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopTrackingRequest buildPartial() {
                StopTrackingRequest stopTrackingRequest = new StopTrackingRequest(this);
                onBuilt();
                return stopTrackingRequest;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StopTrackingRequest.class, Builder.class);
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
            public StopTrackingRequest getDefaultInstanceForType() {
                return StopTrackingRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StopTrackingRequest) {
                    return mergeFrom((StopTrackingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StopTrackingRequest stopTrackingRequest) {
                if (stopTrackingRequest == StopTrackingRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(stopTrackingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopTrackingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StopTrackingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StopTrackingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopTrackingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopTrackingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopTrackingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StopTrackingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopTrackingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopTrackingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopTrackingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopTrackingRequest parseFrom(InputStream inputStream) {
            return (StopTrackingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopTrackingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopTrackingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopTrackingRequest parseFrom(CodedInputStream codedInputStream) {
            return (StopTrackingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopTrackingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopTrackingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackingStateRequest extends GeneratedMessageV3 implements TrackingStateRequestOrBuilder {
        private static final TrackingStateRequest DEFAULT_INSTANCE = new TrackingStateRequest();

        @Deprecated
        public static final Parser<TrackingStateRequest> PARSER = new AbstractParser<TrackingStateRequest>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingStateRequest.1
            @Override // com.google.protobuf.Parser
            public TrackingStateRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingStateRequest.newBuilder();
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

        private TrackingStateRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingStateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_descriptor;
        }

        public static Builder newBuilder(TrackingStateRequest trackingStateRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingStateRequest);
        }

        public static TrackingStateRequest parseDelimitedFrom(InputStream inputStream) {
            return (TrackingStateRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingStateRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingStateRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof TrackingStateRequest) {
                return getUnknownFields().equals(((TrackingStateRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingStateRequest> getParserForType() {
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
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingStateRequest.class, Builder.class);
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
            return new TrackingStateRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingStateRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingStateRequest build() {
                TrackingStateRequest trackingStateRequestBuildPartial = buildPartial();
                if (trackingStateRequestBuildPartial.isInitialized()) {
                    return trackingStateRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingStateRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingStateRequest buildPartial() {
                TrackingStateRequest trackingStateRequest = new TrackingStateRequest(this);
                onBuilt();
                return trackingStateRequest;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingStateRequest.class, Builder.class);
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
            public TrackingStateRequest getDefaultInstanceForType() {
                return TrackingStateRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingStateRequest) {
                    return mergeFrom((TrackingStateRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingStateRequest trackingStateRequest) {
                if (trackingStateRequest == TrackingStateRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(trackingStateRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingStateRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TrackingStateRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TrackingStateRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingStateRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStateRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingStateRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingStateRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingStateRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingStateRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingStateRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackingStateRequest parseFrom(InputStream inputStream) {
            return (TrackingStateRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackingStateRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStateRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingStateRequest parseFrom(CodedInputStream codedInputStream) {
            return (TrackingStateRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingStateRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStateRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackingSubscribeRequest extends GeneratedMessageV3 implements TrackingSubscribeRequestOrBuilder {
        private static final TrackingSubscribeRequest DEFAULT_INSTANCE = new TrackingSubscribeRequest();

        @Deprecated
        public static final Parser<TrackingSubscribeRequest> PARSER = new AbstractParser<TrackingSubscribeRequest>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequest.1
            @Override // com.google.protobuf.Parser
            public TrackingSubscribeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingSubscribeRequest.newBuilder();
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
        public static final int WANT_LEGAL_VALUES_CHANGED_FIELD_NUMBER = 2;
        public static final int WANT_POINT_FIELD_NUMBER = 4;
        public static final int WANT_SESSION_FIELD_NUMBER = 3;
        public static final int WANT_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean wantLegalValuesChanged_;
        private boolean wantPoint_;
        private boolean wantSession_;
        private boolean wantStatus_;

        private TrackingSubscribeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.wantStatus_ = false;
            this.wantLegalValuesChanged_ = false;
            this.wantSession_ = false;
            this.wantPoint_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingSubscribeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_descriptor;
        }

        public static Builder newBuilder(TrackingSubscribeRequest trackingSubscribeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingSubscribeRequest);
        }

        public static TrackingSubscribeRequest parseDelimitedFrom(InputStream inputStream) {
            return (TrackingSubscribeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingSubscribeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingSubscribeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingSubscribeRequest)) {
                return super.equals(obj);
            }
            TrackingSubscribeRequest trackingSubscribeRequest = (TrackingSubscribeRequest) obj;
            if (hasWantStatus() != trackingSubscribeRequest.hasWantStatus()) {
                return false;
            }
            if ((hasWantStatus() && getWantStatus() != trackingSubscribeRequest.getWantStatus()) || hasWantLegalValuesChanged() != trackingSubscribeRequest.hasWantLegalValuesChanged()) {
                return false;
            }
            if ((hasWantLegalValuesChanged() && getWantLegalValuesChanged() != trackingSubscribeRequest.getWantLegalValuesChanged()) || hasWantSession() != trackingSubscribeRequest.hasWantSession()) {
                return false;
            }
            if ((!hasWantSession() || getWantSession() == trackingSubscribeRequest.getWantSession()) && hasWantPoint() == trackingSubscribeRequest.hasWantPoint()) {
                return (!hasWantPoint() || getWantPoint() == trackingSubscribeRequest.getWantPoint()) && getUnknownFields().equals(trackingSubscribeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingSubscribeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.wantStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.wantLegalValuesChanged_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.wantSession_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.wantPoint_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
        public boolean getWantLegalValuesChanged() {
            return this.wantLegalValuesChanged_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
        public boolean getWantPoint() {
            return this.wantPoint_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
        public boolean getWantSession() {
            return this.wantSession_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
        public boolean getWantStatus() {
            return this.wantStatus_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
        public boolean hasWantLegalValuesChanged() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
        public boolean hasWantPoint() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
        public boolean hasWantSession() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
        public boolean hasWantStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWantStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getWantStatus());
            }
            if (hasWantLegalValuesChanged()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getWantLegalValuesChanged());
            }
            if (hasWantSession()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getWantSession());
            }
            if (hasWantPoint()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getWantPoint());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSubscribeRequest.class, Builder.class);
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
            return new TrackingSubscribeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.wantStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.wantLegalValuesChanged_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.wantSession_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.wantPoint_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingSubscribeRequestOrBuilder {
            private int bitField0_;
            private boolean wantLegalValuesChanged_;
            private boolean wantPoint_;
            private boolean wantSession_;
            private boolean wantStatus_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(TrackingSubscribeRequest trackingSubscribeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    trackingSubscribeRequest.wantStatus_ = this.wantStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    trackingSubscribeRequest.wantLegalValuesChanged_ = this.wantLegalValuesChanged_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    trackingSubscribeRequest.wantSession_ = this.wantSession_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    trackingSubscribeRequest.wantPoint_ = this.wantPoint_;
                    i14 |= 8;
                }
                trackingSubscribeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSubscribeRequest build() {
                TrackingSubscribeRequest trackingSubscribeRequestBuildPartial = buildPartial();
                if (trackingSubscribeRequestBuildPartial.isInitialized()) {
                    return trackingSubscribeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingSubscribeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSubscribeRequest buildPartial() {
                TrackingSubscribeRequest trackingSubscribeRequest = new TrackingSubscribeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingSubscribeRequest);
                }
                onBuilt();
                return trackingSubscribeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.wantStatus_ = false;
                this.wantLegalValuesChanged_ = false;
                this.wantSession_ = false;
                this.wantPoint_ = false;
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

            public Builder clearWantLegalValuesChanged() {
                this.bitField0_ &= -3;
                this.wantLegalValuesChanged_ = false;
                onChanged();
                return this;
            }

            public Builder clearWantPoint() {
                this.bitField0_ &= -9;
                this.wantPoint_ = false;
                onChanged();
                return this;
            }

            public Builder clearWantSession() {
                this.bitField0_ &= -5;
                this.wantSession_ = false;
                onChanged();
                return this;
            }

            public Builder clearWantStatus() {
                this.bitField0_ &= -2;
                this.wantStatus_ = false;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
            public boolean getWantLegalValuesChanged() {
                return this.wantLegalValuesChanged_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
            public boolean getWantPoint() {
                return this.wantPoint_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
            public boolean getWantSession() {
                return this.wantSession_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
            public boolean getWantStatus() {
                return this.wantStatus_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
            public boolean hasWantLegalValuesChanged() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
            public boolean hasWantPoint() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
            public boolean hasWantSession() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeRequestOrBuilder
            public boolean hasWantStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSubscribeRequest.class, Builder.class);
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
                                    this.wantStatus_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.wantLegalValuesChanged_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.wantSession_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.wantPoint_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWantLegalValuesChanged(boolean z14) {
                this.wantLegalValuesChanged_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setWantPoint(boolean z14) {
                this.wantPoint_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setWantSession(boolean z14) {
                this.wantSession_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setWantStatus(boolean z14) {
                this.wantStatus_ = z14;
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
            public TrackingSubscribeRequest getDefaultInstanceForType() {
                return TrackingSubscribeRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingSubscribeRequest) {
                    return mergeFrom((TrackingSubscribeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingSubscribeRequest trackingSubscribeRequest) {
                if (trackingSubscribeRequest == TrackingSubscribeRequest.getDefaultInstance()) {
                    return this;
                }
                if (trackingSubscribeRequest.hasWantStatus()) {
                    setWantStatus(trackingSubscribeRequest.getWantStatus());
                }
                if (trackingSubscribeRequest.hasWantLegalValuesChanged()) {
                    setWantLegalValuesChanged(trackingSubscribeRequest.getWantLegalValuesChanged());
                }
                if (trackingSubscribeRequest.hasWantSession()) {
                    setWantSession(trackingSubscribeRequest.getWantSession());
                }
                if (trackingSubscribeRequest.hasWantPoint()) {
                    setWantPoint(trackingSubscribeRequest.getWantPoint());
                }
                mergeUnknownFields(trackingSubscribeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingSubscribeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingSubscribeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSubscribeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingSubscribeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingSubscribeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingSubscribeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingSubscribeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingSubscribeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackingSubscribeRequest parseFrom(InputStream inputStream) {
            return (TrackingSubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ TrackingSubscribeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrackingSubscribeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private TrackingSubscribeRequest() {
            this.wantStatus_ = false;
            this.wantLegalValuesChanged_ = false;
            this.wantSession_ = false;
            this.wantPoint_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingSubscribeRequest parseFrom(CodedInputStream codedInputStream) {
            return (TrackingSubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingSubscribeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ChangeUintListSettingRequest extends GeneratedMessageV3 implements ChangeUintListSettingRequestOrBuilder {
        private static final ChangeUintListSettingRequest DEFAULT_INSTANCE = new ChangeUintListSettingRequest();

        @Deprecated
        public static final Parser<ChangeUintListSettingRequest> PARSER = new AbstractParser<ChangeUintListSettingRequest>() { // from class: com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingRequest.1
            @Override // com.google.protobuf.Parser
            public ChangeUintListSettingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChangeUintListSettingRequest.newBuilder();
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
        public static final int VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private UintListSettingValue value_;

        private ChangeUintListSettingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeUintListSettingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_descriptor;
        }

        public static Builder newBuilder(ChangeUintListSettingRequest changeUintListSettingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(changeUintListSettingRequest);
        }

        public static ChangeUintListSettingRequest parseDelimitedFrom(InputStream inputStream) {
            return (ChangeUintListSettingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChangeUintListSettingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChangeUintListSettingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChangeUintListSettingRequest)) {
                return super.equals(obj);
            }
            ChangeUintListSettingRequest changeUintListSettingRequest = (ChangeUintListSettingRequest) obj;
            if (hasValue() != changeUintListSettingRequest.hasValue()) {
                return false;
            }
            return (!hasValue() || getValue().equals(changeUintListSettingRequest.getValue())) && getUnknownFields().equals(changeUintListSettingRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChangeUintListSettingRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getValue()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingRequestOrBuilder
        public UintListSettingValue getValue() {
            UintListSettingValue uintListSettingValue = this.value_;
            return uintListSettingValue == null ? UintListSettingValue.getDefaultInstance() : uintListSettingValue;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingRequestOrBuilder
        public UintListSettingValueOrBuilder getValueOrBuilder() {
            UintListSettingValue uintListSettingValue = this.value_;
            return uintListSettingValue == null ? UintListSettingValue.getDefaultInstance() : uintListSettingValue;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingRequestOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasValue()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getValue().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeUintListSettingRequest.class, Builder.class);
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
            if (!hasValue()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getValue().isInitialized()) {
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
            return new ChangeUintListSettingRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getValue());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChangeUintListSettingRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> valueBuilder_;
            private UintListSettingValue value_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ChangeUintListSettingRequest changeUintListSettingRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                    changeUintListSettingRequest.value_ = singleFieldBuilderV3 == null ? this.value_ : (UintListSettingValue) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                changeUintListSettingRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_descriptor;
            }

            private SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> getValueFieldBuilder() {
                if (this.valueBuilder_ == null) {
                    this.valueBuilder_ = new SingleFieldBuilderV3<>(getValue(), getParentForChildren(), isClean());
                    this.value_ = null;
                }
                return this.valueBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getValueFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeUintListSettingRequest build() {
                ChangeUintListSettingRequest changeUintListSettingRequestBuildPartial = buildPartial();
                if (changeUintListSettingRequestBuildPartial.isInitialized()) {
                    return changeUintListSettingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) changeUintListSettingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeUintListSettingRequest buildPartial() {
                ChangeUintListSettingRequest changeUintListSettingRequest = new ChangeUintListSettingRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(changeUintListSettingRequest);
                }
                onBuilt();
                return changeUintListSettingRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.value_ = null;
                SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.valueBuilder_ = null;
                }
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

            public Builder clearValue() {
                this.bitField0_ &= -2;
                this.value_ = null;
                SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.valueBuilder_ = null;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingRequestOrBuilder
            public UintListSettingValue getValue() {
                SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UintListSettingValue) singleFieldBuilderV3.getMessage();
                }
                UintListSettingValue uintListSettingValue = this.value_;
                return uintListSettingValue == null ? UintListSettingValue.getDefaultInstance() : uintListSettingValue;
            }

            public UintListSettingValue.Builder getValueBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (UintListSettingValue.Builder) getValueFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingRequestOrBuilder
            public UintListSettingValueOrBuilder getValueOrBuilder() {
                SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UintListSettingValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UintListSettingValue uintListSettingValue = this.value_;
                return uintListSettingValue == null ? UintListSettingValue.getDefaultInstance() : uintListSettingValue;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingRequestOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeUintListSettingRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasValue() && getValue().isInitialized();
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
                                    codedInputStream.readMessage(getValueFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeValue(UintListSettingValue uintListSettingValue) {
                UintListSettingValue uintListSettingValue2;
                SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uintListSettingValue);
                } else if ((this.bitField0_ & 1) == 0 || (uintListSettingValue2 = this.value_) == null || uintListSettingValue2 == UintListSettingValue.getDefaultInstance()) {
                    this.value_ = uintListSettingValue;
                } else {
                    getValueBuilder().mergeFrom(uintListSettingValue);
                }
                if (this.value_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
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

            public Builder setValue(UintListSettingValue.Builder builder) {
                SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.value_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChangeUintListSettingRequest getDefaultInstanceForType() {
                return ChangeUintListSettingRequest.getDefaultInstance();
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

            public Builder setValue(UintListSettingValue uintListSettingValue) {
                SingleFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> singleFieldBuilderV3 = this.valueBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uintListSettingValue.getClass();
                    this.value_ = uintListSettingValue;
                } else {
                    singleFieldBuilderV3.setMessage(uintListSettingValue);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ChangeUintListSettingRequest) {
                    return mergeFrom((ChangeUintListSettingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChangeUintListSettingRequest changeUintListSettingRequest) {
                if (changeUintListSettingRequest == ChangeUintListSettingRequest.getDefaultInstance()) {
                    return this;
                }
                if (changeUintListSettingRequest.hasValue()) {
                    mergeValue(changeUintListSettingRequest.getValue());
                }
                mergeUnknownFields(changeUintListSettingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChangeUintListSettingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ChangeUintListSettingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ChangeUintListSettingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeUintListSettingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeUintListSettingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeUintListSettingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ChangeUintListSettingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChangeUintListSettingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChangeUintListSettingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChangeUintListSettingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChangeUintListSettingRequest parseFrom(InputStream inputStream) {
            return (ChangeUintListSettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChangeUintListSettingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeUintListSettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeUintListSettingRequest parseFrom(CodedInputStream codedInputStream) {
            return (ChangeUintListSettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChangeUintListSettingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeUintListSettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ChangeUintListSettingResponse extends GeneratedMessageV3 implements ChangeUintListSettingResponseOrBuilder {
        private static final ChangeUintListSettingResponse DEFAULT_INSTANCE = new ChangeUintListSettingResponse();

        @Deprecated
        public static final Parser<ChangeUintListSettingResponse> PARSER = new AbstractParser<ChangeUintListSettingResponse>() { // from class: com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingResponse.1
            @Override // com.google.protobuf.Parser
            public ChangeUintListSettingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChangeUintListSettingResponse.newBuilder();
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

        private ChangeUintListSettingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeUintListSettingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_descriptor;
        }

        public static Builder newBuilder(ChangeUintListSettingResponse changeUintListSettingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(changeUintListSettingResponse);
        }

        public static ChangeUintListSettingResponse parseDelimitedFrom(InputStream inputStream) {
            return (ChangeUintListSettingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChangeUintListSettingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChangeUintListSettingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChangeUintListSettingResponse)) {
                return super.equals(obj);
            }
            ChangeUintListSettingResponse changeUintListSettingResponse = (ChangeUintListSettingResponse) obj;
            if (hasStatus() != changeUintListSettingResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == changeUintListSettingResponse.status_) && getUnknownFields().equals(changeUintListSettingResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChangeUintListSettingResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingResponseOrBuilder
        public SettingError getStatus() {
            SettingError settingErrorForNumber = SettingError.forNumber(this.status_);
            return settingErrorForNumber == null ? SettingError.SETTING_ERROR_UNKNOWN : settingErrorForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingResponseOrBuilder
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
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeUintListSettingResponse.class, Builder.class);
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
            return new ChangeUintListSettingResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChangeUintListSettingResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ChangeUintListSettingResponse changeUintListSettingResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    changeUintListSettingResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                changeUintListSettingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeUintListSettingResponse build() {
                ChangeUintListSettingResponse changeUintListSettingResponseBuildPartial = buildPartial();
                if (changeUintListSettingResponseBuildPartial.isInitialized()) {
                    return changeUintListSettingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) changeUintListSettingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeUintListSettingResponse buildPartial() {
                ChangeUintListSettingResponse changeUintListSettingResponse = new ChangeUintListSettingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(changeUintListSettingResponse);
                }
                onBuilt();
                return changeUintListSettingResponse;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingResponseOrBuilder
            public SettingError getStatus() {
                SettingError settingErrorForNumber = SettingError.forNumber(this.status_);
                return settingErrorForNumber == null ? SettingError.SETTING_ERROR_UNKNOWN : settingErrorForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.ChangeUintListSettingResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_ChangeUintListSettingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeUintListSettingResponse.class, Builder.class);
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
                                    if (SettingError.forNumber(i14) == null) {
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

            public Builder setStatus(SettingError settingError) {
                settingError.getClass();
                this.bitField0_ |= 1;
                this.status_ = settingError.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChangeUintListSettingResponse getDefaultInstanceForType() {
                return ChangeUintListSettingResponse.getDefaultInstance();
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
                if (message instanceof ChangeUintListSettingResponse) {
                    return mergeFrom((ChangeUintListSettingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChangeUintListSettingResponse changeUintListSettingResponse) {
                if (changeUintListSettingResponse == ChangeUintListSettingResponse.getDefaultInstance()) {
                    return this;
                }
                if (changeUintListSettingResponse.hasStatus()) {
                    setStatus(changeUintListSettingResponse.getStatus());
                }
                mergeUnknownFields(changeUintListSettingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChangeUintListSettingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ChangeUintListSettingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeUintListSettingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeUintListSettingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ChangeUintListSettingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ChangeUintListSettingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ChangeUintListSettingResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChangeUintListSettingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChangeUintListSettingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChangeUintListSettingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChangeUintListSettingResponse parseFrom(InputStream inputStream) {
            return (ChangeUintListSettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChangeUintListSettingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeUintListSettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeUintListSettingResponse parseFrom(CodedInputStream codedInputStream) {
            return (ChangeUintListSettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChangeUintListSettingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeUintListSettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CurrentSettingsResponse extends GeneratedMessageV3 implements CurrentSettingsResponseOrBuilder {
        private static final CurrentSettingsResponse DEFAULT_INSTANCE = new CurrentSettingsResponse();

        @Deprecated
        public static final Parser<CurrentSettingsResponse> PARSER = new AbstractParser<CurrentSettingsResponse>() { // from class: com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public CurrentSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CurrentSettingsResponse.newBuilder();
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
        public static final int SETTINGS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private TrackingSettings settings_;
        private int status_;

        private CurrentSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CurrentSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_descriptor;
        }

        public static Builder newBuilder(CurrentSettingsResponse currentSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(currentSettingsResponse);
        }

        public static CurrentSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (CurrentSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CurrentSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CurrentSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CurrentSettingsResponse)) {
                return super.equals(obj);
            }
            CurrentSettingsResponse currentSettingsResponse = (CurrentSettingsResponse) obj;
            if (hasStatus() != currentSettingsResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == currentSettingsResponse.status_) && hasSettings() == currentSettingsResponse.hasSettings()) {
                return (!hasSettings() || getSettings().equals(currentSettingsResponse.getSettings())) && getUnknownFields().equals(currentSettingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CurrentSettingsResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getSettings());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
        public TrackingSettings getSettings() {
            TrackingSettings trackingSettings = this.settings_;
            return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
        public TrackingSettingsOrBuilder getSettingsOrBuilder() {
            TrackingSettings trackingSettings = this.settings_;
            return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
        public SettingError getStatus() {
            SettingError settingErrorForNumber = SettingError.forNumber(this.status_);
            return settingErrorForNumber == null ? SettingError.SETTING_ERROR_UNKNOWN : settingErrorForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
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
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSettings().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CurrentSettingsResponse.class, Builder.class);
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
            if (!hasSettings() || getSettings().isInitialized()) {
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
            return new CurrentSettingsResponse();
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
                codedOutputStream.writeMessage(2, getSettings());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CurrentSettingsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> settingsBuilder_;
            private TrackingSettings settings_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CurrentSettingsResponse currentSettingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    currentSettingsResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    currentSettingsResponse.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (TrackingSettings) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                currentSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_descriptor;
            }

            private SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CurrentSettingsResponse build() {
                CurrentSettingsResponse currentSettingsResponseBuildPartial = buildPartial();
                if (currentSettingsResponseBuildPartial.isInitialized()) {
                    return currentSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) currentSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CurrentSettingsResponse buildPartial() {
                CurrentSettingsResponse currentSettingsResponse = new CurrentSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(currentSettingsResponse);
                }
                onBuilt();
                return currentSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
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

            public Builder clearSettings() {
                this.bitField0_ &= -3;
                this.settings_ = null;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
            public TrackingSettings getSettings() {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSettings) singleFieldBuilderV3.getMessage();
                }
                TrackingSettings trackingSettings = this.settings_;
                return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
            }

            public TrackingSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (TrackingSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
            public TrackingSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingSettings trackingSettings = this.settings_;
                return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
            public SettingError getStatus() {
                SettingError settingErrorForNumber = SettingError.forNumber(this.status_);
                return settingErrorForNumber == null ? SettingError.SETTING_ERROR_UNKNOWN : settingErrorForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.CurrentSettingsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_CurrentSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CurrentSettingsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasStatus()) {
                    return !hasSettings() || getSettings().isInitialized();
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
                                    if (SettingError.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSettings(TrackingSettings trackingSettings) {
                TrackingSettings trackingSettings2;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingSettings);
                } else if ((this.bitField0_ & 2) == 0 || (trackingSettings2 = this.settings_) == null || trackingSettings2 == TrackingSettings.getDefaultInstance()) {
                    this.settings_ = trackingSettings;
                } else {
                    getSettingsBuilder().mergeFrom(trackingSettings);
                }
                if (this.settings_ != null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSettings(TrackingSettings.Builder builder) {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStatus(SettingError settingError) {
                settingError.getClass();
                this.bitField0_ |= 1;
                this.status_ = settingError.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CurrentSettingsResponse getDefaultInstanceForType() {
                return CurrentSettingsResponse.getDefaultInstance();
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

            public Builder setSettings(TrackingSettings trackingSettings) {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingSettings.getClass();
                    this.settings_ = trackingSettings;
                } else {
                    singleFieldBuilderV3.setMessage(trackingSettings);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CurrentSettingsResponse) {
                    return mergeFrom((CurrentSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CurrentSettingsResponse currentSettingsResponse) {
                if (currentSettingsResponse == CurrentSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (currentSettingsResponse.hasStatus()) {
                    setStatus(currentSettingsResponse.getStatus());
                }
                if (currentSettingsResponse.hasSettings()) {
                    mergeSettings(currentSettingsResponse.getSettings());
                }
                mergeUnknownFields(currentSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CurrentSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CurrentSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CurrentSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CurrentSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CurrentSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CurrentSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CurrentSettingsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CurrentSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CurrentSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CurrentSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CurrentSettingsResponse parseFrom(InputStream inputStream) {
            return (CurrentSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CurrentSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CurrentSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CurrentSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (CurrentSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CurrentSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CurrentSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataTypeConfigExt extends GeneratedMessageV3 implements DataTypeConfigExtOrBuilder {
        private static final DataTypeConfigExt DEFAULT_INSTANCE = new DataTypeConfigExt();

        @Deprecated
        public static final Parser<DataTypeConfigExt> PARSER = new AbstractParser<DataTypeConfigExt>() { // from class: com.garmin.proto.generated.GDIInReachTracking.DataTypeConfigExt.1
            @Override // com.google.protobuf.Parser
            public DataTypeConfigExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTypeConfigExt.newBuilder();
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
        public static final int POINT_DATE_RANGE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private TrackingPointDateRangeQuery pointDateRange_;

        private DataTypeConfigExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeConfigExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_descriptor;
        }

        public static Builder newBuilder(DataTypeConfigExt dataTypeConfigExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTypeConfigExt);
        }

        public static DataTypeConfigExt parseDelimitedFrom(InputStream inputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTypeConfigExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTypeConfigExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTypeConfigExt)) {
                return super.equals(obj);
            }
            DataTypeConfigExt dataTypeConfigExt = (DataTypeConfigExt) obj;
            if (hasPointDateRange() != dataTypeConfigExt.hasPointDateRange()) {
                return false;
            }
            return (!hasPointDateRange() || getPointDateRange().equals(dataTypeConfigExt.getPointDateRange())) && getUnknownFields().equals(dataTypeConfigExt.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTypeConfigExt> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.DataTypeConfigExtOrBuilder
        public TrackingPointDateRangeQuery getPointDateRange() {
            TrackingPointDateRangeQuery trackingPointDateRangeQuery = this.pointDateRange_;
            return trackingPointDateRangeQuery == null ? TrackingPointDateRangeQuery.getDefaultInstance() : trackingPointDateRangeQuery;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.DataTypeConfigExtOrBuilder
        public TrackingPointDateRangeQueryOrBuilder getPointDateRangeOrBuilder() {
            TrackingPointDateRangeQuery trackingPointDateRangeQuery = this.pointDateRange_;
            return trackingPointDateRangeQuery == null ? TrackingPointDateRangeQuery.getDefaultInstance() : trackingPointDateRangeQuery;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPointDateRange()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.DataTypeConfigExtOrBuilder
        public boolean hasPointDateRange() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPointDateRange()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPointDateRange().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfigExt.class, Builder.class);
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
            if (!hasPointDateRange() || getPointDateRange().isInitialized()) {
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
            return new DataTypeConfigExt();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPointDateRange());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataTypeConfigExtOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> pointDateRangeBuilder_;
            private TrackingPointDateRangeQuery pointDateRange_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DataTypeConfigExt dataTypeConfigExt) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> singleFieldBuilderV3 = this.pointDateRangeBuilder_;
                    dataTypeConfigExt.pointDateRange_ = singleFieldBuilderV3 == null ? this.pointDateRange_ : (TrackingPointDateRangeQuery) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                dataTypeConfigExt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_descriptor;
            }

            private SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> getPointDateRangeFieldBuilder() {
                if (this.pointDateRangeBuilder_ == null) {
                    this.pointDateRangeBuilder_ = new SingleFieldBuilderV3<>(getPointDateRange(), getParentForChildren(), isClean());
                    this.pointDateRange_ = null;
                }
                return this.pointDateRangeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPointDateRangeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeConfigExt build() {
                DataTypeConfigExt dataTypeConfigExtBuildPartial = buildPartial();
                if (dataTypeConfigExtBuildPartial.isInitialized()) {
                    return dataTypeConfigExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTypeConfigExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeConfigExt buildPartial() {
                DataTypeConfigExt dataTypeConfigExt = new DataTypeConfigExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataTypeConfigExt);
                }
                onBuilt();
                return dataTypeConfigExt;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.pointDateRange_ = null;
                SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> singleFieldBuilderV3 = this.pointDateRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pointDateRangeBuilder_ = null;
                }
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

            public Builder clearPointDateRange() {
                this.bitField0_ &= -2;
                this.pointDateRange_ = null;
                SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> singleFieldBuilderV3 = this.pointDateRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pointDateRangeBuilder_ = null;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.DataTypeConfigExtOrBuilder
            public TrackingPointDateRangeQuery getPointDateRange() {
                SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> singleFieldBuilderV3 = this.pointDateRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingPointDateRangeQuery) singleFieldBuilderV3.getMessage();
                }
                TrackingPointDateRangeQuery trackingPointDateRangeQuery = this.pointDateRange_;
                return trackingPointDateRangeQuery == null ? TrackingPointDateRangeQuery.getDefaultInstance() : trackingPointDateRangeQuery;
            }

            public TrackingPointDateRangeQuery.Builder getPointDateRangeBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TrackingPointDateRangeQuery.Builder) getPointDateRangeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.DataTypeConfigExtOrBuilder
            public TrackingPointDateRangeQueryOrBuilder getPointDateRangeOrBuilder() {
                SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> singleFieldBuilderV3 = this.pointDateRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingPointDateRangeQueryOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingPointDateRangeQuery trackingPointDateRangeQuery = this.pointDateRange_;
                return trackingPointDateRangeQuery == null ? TrackingPointDateRangeQuery.getDefaultInstance() : trackingPointDateRangeQuery;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.DataTypeConfigExtOrBuilder
            public boolean hasPointDateRange() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_DataTypeConfigExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfigExt.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasPointDateRange() || getPointDateRange().isInitialized();
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
                                    codedInputStream.readMessage(getPointDateRangeFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePointDateRange(TrackingPointDateRangeQuery trackingPointDateRangeQuery) {
                TrackingPointDateRangeQuery trackingPointDateRangeQuery2;
                SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> singleFieldBuilderV3 = this.pointDateRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingPointDateRangeQuery);
                } else if ((this.bitField0_ & 1) == 0 || (trackingPointDateRangeQuery2 = this.pointDateRange_) == null || trackingPointDateRangeQuery2 == TrackingPointDateRangeQuery.getDefaultInstance()) {
                    this.pointDateRange_ = trackingPointDateRangeQuery;
                } else {
                    getPointDateRangeBuilder().mergeFrom(trackingPointDateRangeQuery);
                }
                if (this.pointDateRange_ != null) {
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

            public Builder setPointDateRange(TrackingPointDateRangeQuery.Builder builder) {
                SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> singleFieldBuilderV3 = this.pointDateRangeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pointDateRange_ = builder.build();
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
            public DataTypeConfigExt getDefaultInstanceForType() {
                return DataTypeConfigExt.getDefaultInstance();
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

            public Builder setPointDateRange(TrackingPointDateRangeQuery trackingPointDateRangeQuery) {
                SingleFieldBuilderV3<TrackingPointDateRangeQuery, TrackingPointDateRangeQuery.Builder, TrackingPointDateRangeQueryOrBuilder> singleFieldBuilderV3 = this.pointDateRangeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingPointDateRangeQuery.getClass();
                    this.pointDateRange_ = trackingPointDateRangeQuery;
                } else {
                    singleFieldBuilderV3.setMessage(trackingPointDateRangeQuery);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataTypeConfigExt) {
                    return mergeFrom((DataTypeConfigExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTypeConfigExt dataTypeConfigExt) {
                if (dataTypeConfigExt == DataTypeConfigExt.getDefaultInstance()) {
                    return this;
                }
                if (dataTypeConfigExt.hasPointDateRange()) {
                    mergePointDateRange(dataTypeConfigExt.getPointDateRange());
                }
                mergeUnknownFields(dataTypeConfigExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTypeConfigExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DataTypeConfigExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DataTypeConfigExt() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeConfigExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataTypeConfigExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTypeConfigExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataTypeConfigExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(InputStream inputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataTypeConfigExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(CodedInputStream codedInputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTypeConfigExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GenericItemReferenceExt extends GeneratedMessageV3 implements GenericItemReferenceExtOrBuilder {
        private static final GenericItemReferenceExt DEFAULT_INSTANCE = new GenericItemReferenceExt();

        @Deprecated
        public static final Parser<GenericItemReferenceExt> PARSER = new AbstractParser<GenericItemReferenceExt>() { // from class: com.garmin.proto.generated.GDIInReachTracking.GenericItemReferenceExt.1
            @Override // com.google.protobuf.Parser
            public GenericItemReferenceExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GenericItemReferenceExt.newBuilder();
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
        public static final int TRACKING_POINT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private GDICore.LocationData trackingPoint_;

        private GenericItemReferenceExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReferenceExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_descriptor;
        }

        public static Builder newBuilder(GenericItemReferenceExt genericItemReferenceExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericItemReferenceExt);
        }

        public static GenericItemReferenceExt parseDelimitedFrom(InputStream inputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GenericItemReferenceExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GenericItemReferenceExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GenericItemReferenceExt)) {
                return super.equals(obj);
            }
            GenericItemReferenceExt genericItemReferenceExt = (GenericItemReferenceExt) obj;
            if (hasTrackingPoint() != genericItemReferenceExt.hasTrackingPoint()) {
                return false;
            }
            return (!hasTrackingPoint() || getTrackingPoint().equals(genericItemReferenceExt.getTrackingPoint())) && getUnknownFields().equals(genericItemReferenceExt.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GenericItemReferenceExt> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTrackingPoint()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.GenericItemReferenceExtOrBuilder
        public GDICore.LocationData getTrackingPoint() {
            GDICore.LocationData locationData = this.trackingPoint_;
            return locationData == null ? GDICore.LocationData.getDefaultInstance() : locationData;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.GenericItemReferenceExtOrBuilder
        public GDICore.LocationDataOrBuilder getTrackingPointOrBuilder() {
            GDICore.LocationData locationData = this.trackingPoint_;
            return locationData == null ? GDICore.LocationData.getDefaultInstance() : locationData;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.GenericItemReferenceExtOrBuilder
        public boolean hasTrackingPoint() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTrackingPoint()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTrackingPoint().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReferenceExt.class, Builder.class);
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
            if (!hasTrackingPoint() || getTrackingPoint().isInitialized()) {
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
            return new GenericItemReferenceExt();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getTrackingPoint());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GenericItemReferenceExtOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> trackingPointBuilder_;
            private GDICore.LocationData trackingPoint_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GenericItemReferenceExt genericItemReferenceExt) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> singleFieldBuilderV3 = this.trackingPointBuilder_;
                    genericItemReferenceExt.trackingPoint_ = singleFieldBuilderV3 == null ? this.trackingPoint_ : (GDICore.LocationData) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                genericItemReferenceExt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_descriptor;
            }

            private SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> getTrackingPointFieldBuilder() {
                if (this.trackingPointBuilder_ == null) {
                    this.trackingPointBuilder_ = new SingleFieldBuilderV3<>(getTrackingPoint(), getParentForChildren(), isClean());
                    this.trackingPoint_ = null;
                }
                return this.trackingPointBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTrackingPointFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemReferenceExt build() {
                GenericItemReferenceExt genericItemReferenceExtBuildPartial = buildPartial();
                if (genericItemReferenceExtBuildPartial.isInitialized()) {
                    return genericItemReferenceExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericItemReferenceExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemReferenceExt buildPartial() {
                GenericItemReferenceExt genericItemReferenceExt = new GenericItemReferenceExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(genericItemReferenceExt);
                }
                onBuilt();
                return genericItemReferenceExt;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.trackingPoint_ = null;
                SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> singleFieldBuilderV3 = this.trackingPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingPointBuilder_ = null;
                }
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

            public Builder clearTrackingPoint() {
                this.bitField0_ &= -2;
                this.trackingPoint_ = null;
                SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> singleFieldBuilderV3 = this.trackingPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingPointBuilder_ = null;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.GenericItemReferenceExtOrBuilder
            public GDICore.LocationData getTrackingPoint() {
                SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> singleFieldBuilderV3 = this.trackingPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDICore.LocationData) singleFieldBuilderV3.getMessage();
                }
                GDICore.LocationData locationData = this.trackingPoint_;
                return locationData == null ? GDICore.LocationData.getDefaultInstance() : locationData;
            }

            public GDICore.LocationData.Builder getTrackingPointBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDICore.LocationData.Builder) getTrackingPointFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.GenericItemReferenceExtOrBuilder
            public GDICore.LocationDataOrBuilder getTrackingPointOrBuilder() {
                SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> singleFieldBuilderV3 = this.trackingPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDICore.LocationDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDICore.LocationData locationData = this.trackingPoint_;
                return locationData == null ? GDICore.LocationData.getDefaultInstance() : locationData;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.GenericItemReferenceExtOrBuilder
            public boolean hasTrackingPoint() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_GenericItemReferenceExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReferenceExt.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasTrackingPoint() || getTrackingPoint().isInitialized();
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
                                    codedInputStream.readMessage(getTrackingPointFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeTrackingPoint(GDICore.LocationData locationData) {
                GDICore.LocationData locationData2;
                SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> singleFieldBuilderV3 = this.trackingPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(locationData);
                } else if ((this.bitField0_ & 1) == 0 || (locationData2 = this.trackingPoint_) == null || locationData2 == GDICore.LocationData.getDefaultInstance()) {
                    this.trackingPoint_ = locationData;
                } else {
                    getTrackingPointBuilder().mergeFrom(locationData);
                }
                if (this.trackingPoint_ != null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTrackingPoint(GDICore.LocationData.Builder builder) {
                SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> singleFieldBuilderV3 = this.trackingPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackingPoint_ = builder.build();
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
            public GenericItemReferenceExt getDefaultInstanceForType() {
                return GenericItemReferenceExt.getDefaultInstance();
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

            public Builder setTrackingPoint(GDICore.LocationData locationData) {
                SingleFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> singleFieldBuilderV3 = this.trackingPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    locationData.getClass();
                    this.trackingPoint_ = locationData;
                } else {
                    singleFieldBuilderV3.setMessage(locationData);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GenericItemReferenceExt) {
                    return mergeFrom((GenericItemReferenceExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GenericItemReferenceExt genericItemReferenceExt) {
                if (genericItemReferenceExt == GenericItemReferenceExt.getDefaultInstance()) {
                    return this;
                }
                if (genericItemReferenceExt.hasTrackingPoint()) {
                    mergeTrackingPoint(genericItemReferenceExt.getTrackingPoint());
                }
                mergeUnknownFields(genericItemReferenceExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericItemReferenceExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GenericItemReferenceExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GenericItemReferenceExt() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReferenceExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GenericItemReferenceExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericItemReferenceExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GenericItemReferenceExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(InputStream inputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GenericItemReferenceExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(CodedInputStream codedInputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericItemReferenceExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InReachTrackingService extends GeneratedMessageV3 implements InReachTrackingServiceOrBuilder {
        public static final int CHANGE_UINT_LIST_SETTING_REQUEST_FIELD_NUMBER = 11;
        public static final int CHANGE_UINT_LIST_SETTING_RESPONSE_FIELD_NUMBER = 12;
        public static final int CURRENT_SETTINGS_REQUEST_FIELD_NUMBER = 7;
        public static final int CURRENT_SETTINGS_RESPONSE_FIELD_NUMBER = 8;
        public static final int LEGAL_UINT_LIST_VALUES_REQUEST_FIELD_NUMBER = 9;
        public static final int LEGAL_UINT_LIST_VALUES_RESPONSE_FIELD_NUMBER = 10;
        public static final int LEGAL_VALUES_CHANGED_NOTIFICATION_FIELD_NUMBER = 16;
        public static final int START_TRACKING_REQUEST_FIELD_NUMBER = 3;
        public static final int START_TRACKING_RESPONSE_FIELD_NUMBER = 4;
        public static final int STOP_TRACKING_REQUEST_FIELD_NUMBER = 5;
        public static final int STOP_TRACKING_RESPONSE_FIELD_NUMBER = 6;
        public static final int TRACKING_POINT_NOTIFICATION_FIELD_NUMBER = 18;
        public static final int TRACKING_SESSION_NOTIFICATION_FIELD_NUMBER = 17;
        public static final int TRACKING_STATE_REQUEST_FIELD_NUMBER = 1;
        public static final int TRACKING_STATE_RESPONSE_FIELD_NUMBER = 2;
        public static final int TRACKING_STATUS_NOTIFICATION_FIELD_NUMBER = 15;
        public static final int TRACKING_SUBSCRIBE_REQUEST_FIELD_NUMBER = 13;
        public static final int TRACKING_SUBSCRIBE_RESPONSE_FIELD_NUMBER = 14;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ChangeUintListSettingRequest changeUintListSettingRequest_;
        private ChangeUintListSettingResponse changeUintListSettingResponse_;
        private CurrentSettingsRequest currentSettingsRequest_;
        private CurrentSettingsResponse currentSettingsResponse_;
        private LegalUintListValuesRequest legalUintListValuesRequest_;
        private LegalUintListValuesResponse legalUintListValuesResponse_;
        private LegalValuesChangedNotification legalValuesChangedNotification_;
        private byte memoizedIsInitialized;
        private StartTrackingRequest startTrackingRequest_;
        private StartTrackingResponse startTrackingResponse_;
        private StopTrackingRequest stopTrackingRequest_;
        private StopTrackingResponse stopTrackingResponse_;
        private TrackingPointNotification trackingPointNotification_;
        private TrackingSessionNotification trackingSessionNotification_;
        private TrackingStateRequest trackingStateRequest_;
        private TrackingStateResponse trackingStateResponse_;
        private TrackingStatusNotification trackingStatusNotification_;
        private TrackingSubscribeRequest trackingSubscribeRequest_;
        private TrackingSubscribeResponse trackingSubscribeResponse_;
        private static final InReachTrackingService DEFAULT_INSTANCE = new InReachTrackingService();

        @Deprecated
        public static final Parser<InReachTrackingService> PARSER = new AbstractParser<InReachTrackingService>() { // from class: com.garmin.proto.generated.GDIInReachTracking.InReachTrackingService.1
            @Override // com.google.protobuf.Parser
            public InReachTrackingService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InReachTrackingService.newBuilder();
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

        private InReachTrackingService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InReachTrackingService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_InReachTrackingService_descriptor;
        }

        public static Builder newBuilder(InReachTrackingService inReachTrackingService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(inReachTrackingService);
        }

        public static InReachTrackingService parseDelimitedFrom(InputStream inputStream) {
            return (InReachTrackingService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InReachTrackingService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InReachTrackingService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InReachTrackingService)) {
                return super.equals(obj);
            }
            InReachTrackingService inReachTrackingService = (InReachTrackingService) obj;
            if (hasTrackingStateRequest() != inReachTrackingService.hasTrackingStateRequest()) {
                return false;
            }
            if ((hasTrackingStateRequest() && !getTrackingStateRequest().equals(inReachTrackingService.getTrackingStateRequest())) || hasTrackingStateResponse() != inReachTrackingService.hasTrackingStateResponse()) {
                return false;
            }
            if ((hasTrackingStateResponse() && !getTrackingStateResponse().equals(inReachTrackingService.getTrackingStateResponse())) || hasStartTrackingRequest() != inReachTrackingService.hasStartTrackingRequest()) {
                return false;
            }
            if ((hasStartTrackingRequest() && !getStartTrackingRequest().equals(inReachTrackingService.getStartTrackingRequest())) || hasStartTrackingResponse() != inReachTrackingService.hasStartTrackingResponse()) {
                return false;
            }
            if ((hasStartTrackingResponse() && !getStartTrackingResponse().equals(inReachTrackingService.getStartTrackingResponse())) || hasStopTrackingRequest() != inReachTrackingService.hasStopTrackingRequest()) {
                return false;
            }
            if ((hasStopTrackingRequest() && !getStopTrackingRequest().equals(inReachTrackingService.getStopTrackingRequest())) || hasStopTrackingResponse() != inReachTrackingService.hasStopTrackingResponse()) {
                return false;
            }
            if ((hasStopTrackingResponse() && !getStopTrackingResponse().equals(inReachTrackingService.getStopTrackingResponse())) || hasCurrentSettingsRequest() != inReachTrackingService.hasCurrentSettingsRequest()) {
                return false;
            }
            if ((hasCurrentSettingsRequest() && !getCurrentSettingsRequest().equals(inReachTrackingService.getCurrentSettingsRequest())) || hasCurrentSettingsResponse() != inReachTrackingService.hasCurrentSettingsResponse()) {
                return false;
            }
            if ((hasCurrentSettingsResponse() && !getCurrentSettingsResponse().equals(inReachTrackingService.getCurrentSettingsResponse())) || hasLegalUintListValuesRequest() != inReachTrackingService.hasLegalUintListValuesRequest()) {
                return false;
            }
            if ((hasLegalUintListValuesRequest() && !getLegalUintListValuesRequest().equals(inReachTrackingService.getLegalUintListValuesRequest())) || hasLegalUintListValuesResponse() != inReachTrackingService.hasLegalUintListValuesResponse()) {
                return false;
            }
            if ((hasLegalUintListValuesResponse() && !getLegalUintListValuesResponse().equals(inReachTrackingService.getLegalUintListValuesResponse())) || hasChangeUintListSettingRequest() != inReachTrackingService.hasChangeUintListSettingRequest()) {
                return false;
            }
            if ((hasChangeUintListSettingRequest() && !getChangeUintListSettingRequest().equals(inReachTrackingService.getChangeUintListSettingRequest())) || hasChangeUintListSettingResponse() != inReachTrackingService.hasChangeUintListSettingResponse()) {
                return false;
            }
            if ((hasChangeUintListSettingResponse() && !getChangeUintListSettingResponse().equals(inReachTrackingService.getChangeUintListSettingResponse())) || hasTrackingSubscribeRequest() != inReachTrackingService.hasTrackingSubscribeRequest()) {
                return false;
            }
            if ((hasTrackingSubscribeRequest() && !getTrackingSubscribeRequest().equals(inReachTrackingService.getTrackingSubscribeRequest())) || hasTrackingSubscribeResponse() != inReachTrackingService.hasTrackingSubscribeResponse()) {
                return false;
            }
            if ((hasTrackingSubscribeResponse() && !getTrackingSubscribeResponse().equals(inReachTrackingService.getTrackingSubscribeResponse())) || hasTrackingStatusNotification() != inReachTrackingService.hasTrackingStatusNotification()) {
                return false;
            }
            if ((hasTrackingStatusNotification() && !getTrackingStatusNotification().equals(inReachTrackingService.getTrackingStatusNotification())) || hasLegalValuesChangedNotification() != inReachTrackingService.hasLegalValuesChangedNotification()) {
                return false;
            }
            if ((hasLegalValuesChangedNotification() && !getLegalValuesChangedNotification().equals(inReachTrackingService.getLegalValuesChangedNotification())) || hasTrackingSessionNotification() != inReachTrackingService.hasTrackingSessionNotification()) {
                return false;
            }
            if ((!hasTrackingSessionNotification() || getTrackingSessionNotification().equals(inReachTrackingService.getTrackingSessionNotification())) && hasTrackingPointNotification() == inReachTrackingService.hasTrackingPointNotification()) {
                return (!hasTrackingPointNotification() || getTrackingPointNotification().equals(inReachTrackingService.getTrackingPointNotification())) && getUnknownFields().equals(inReachTrackingService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public ChangeUintListSettingRequest getChangeUintListSettingRequest() {
            ChangeUintListSettingRequest changeUintListSettingRequest = this.changeUintListSettingRequest_;
            return changeUintListSettingRequest == null ? ChangeUintListSettingRequest.getDefaultInstance() : changeUintListSettingRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public ChangeUintListSettingRequestOrBuilder getChangeUintListSettingRequestOrBuilder() {
            ChangeUintListSettingRequest changeUintListSettingRequest = this.changeUintListSettingRequest_;
            return changeUintListSettingRequest == null ? ChangeUintListSettingRequest.getDefaultInstance() : changeUintListSettingRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public ChangeUintListSettingResponse getChangeUintListSettingResponse() {
            ChangeUintListSettingResponse changeUintListSettingResponse = this.changeUintListSettingResponse_;
            return changeUintListSettingResponse == null ? ChangeUintListSettingResponse.getDefaultInstance() : changeUintListSettingResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public ChangeUintListSettingResponseOrBuilder getChangeUintListSettingResponseOrBuilder() {
            ChangeUintListSettingResponse changeUintListSettingResponse = this.changeUintListSettingResponse_;
            return changeUintListSettingResponse == null ? ChangeUintListSettingResponse.getDefaultInstance() : changeUintListSettingResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public CurrentSettingsRequest getCurrentSettingsRequest() {
            CurrentSettingsRequest currentSettingsRequest = this.currentSettingsRequest_;
            return currentSettingsRequest == null ? CurrentSettingsRequest.getDefaultInstance() : currentSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public CurrentSettingsRequestOrBuilder getCurrentSettingsRequestOrBuilder() {
            CurrentSettingsRequest currentSettingsRequest = this.currentSettingsRequest_;
            return currentSettingsRequest == null ? CurrentSettingsRequest.getDefaultInstance() : currentSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public CurrentSettingsResponse getCurrentSettingsResponse() {
            CurrentSettingsResponse currentSettingsResponse = this.currentSettingsResponse_;
            return currentSettingsResponse == null ? CurrentSettingsResponse.getDefaultInstance() : currentSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public CurrentSettingsResponseOrBuilder getCurrentSettingsResponseOrBuilder() {
            CurrentSettingsResponse currentSettingsResponse = this.currentSettingsResponse_;
            return currentSettingsResponse == null ? CurrentSettingsResponse.getDefaultInstance() : currentSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public LegalUintListValuesRequest getLegalUintListValuesRequest() {
            LegalUintListValuesRequest legalUintListValuesRequest = this.legalUintListValuesRequest_;
            return legalUintListValuesRequest == null ? LegalUintListValuesRequest.getDefaultInstance() : legalUintListValuesRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public LegalUintListValuesRequestOrBuilder getLegalUintListValuesRequestOrBuilder() {
            LegalUintListValuesRequest legalUintListValuesRequest = this.legalUintListValuesRequest_;
            return legalUintListValuesRequest == null ? LegalUintListValuesRequest.getDefaultInstance() : legalUintListValuesRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public LegalUintListValuesResponse getLegalUintListValuesResponse() {
            LegalUintListValuesResponse legalUintListValuesResponse = this.legalUintListValuesResponse_;
            return legalUintListValuesResponse == null ? LegalUintListValuesResponse.getDefaultInstance() : legalUintListValuesResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public LegalUintListValuesResponseOrBuilder getLegalUintListValuesResponseOrBuilder() {
            LegalUintListValuesResponse legalUintListValuesResponse = this.legalUintListValuesResponse_;
            return legalUintListValuesResponse == null ? LegalUintListValuesResponse.getDefaultInstance() : legalUintListValuesResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public LegalValuesChangedNotification getLegalValuesChangedNotification() {
            LegalValuesChangedNotification legalValuesChangedNotification = this.legalValuesChangedNotification_;
            return legalValuesChangedNotification == null ? LegalValuesChangedNotification.getDefaultInstance() : legalValuesChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public LegalValuesChangedNotificationOrBuilder getLegalValuesChangedNotificationOrBuilder() {
            LegalValuesChangedNotification legalValuesChangedNotification = this.legalValuesChangedNotification_;
            return legalValuesChangedNotification == null ? LegalValuesChangedNotification.getDefaultInstance() : legalValuesChangedNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InReachTrackingService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTrackingStateRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getTrackingStateResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStartTrackingRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getStartTrackingResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getStopTrackingRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getStopTrackingResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getCurrentSettingsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getCurrentSettingsResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getLegalUintListValuesRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getLegalUintListValuesResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getChangeUintListSettingRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getChangeUintListSettingResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getTrackingSubscribeRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getTrackingSubscribeResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getTrackingStatusNotification());
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getLegalValuesChangedNotification());
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getTrackingSessionNotification());
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getTrackingPointNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public StartTrackingRequest getStartTrackingRequest() {
            StartTrackingRequest startTrackingRequest = this.startTrackingRequest_;
            return startTrackingRequest == null ? StartTrackingRequest.getDefaultInstance() : startTrackingRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public StartTrackingRequestOrBuilder getStartTrackingRequestOrBuilder() {
            StartTrackingRequest startTrackingRequest = this.startTrackingRequest_;
            return startTrackingRequest == null ? StartTrackingRequest.getDefaultInstance() : startTrackingRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public StartTrackingResponse getStartTrackingResponse() {
            StartTrackingResponse startTrackingResponse = this.startTrackingResponse_;
            return startTrackingResponse == null ? StartTrackingResponse.getDefaultInstance() : startTrackingResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public StartTrackingResponseOrBuilder getStartTrackingResponseOrBuilder() {
            StartTrackingResponse startTrackingResponse = this.startTrackingResponse_;
            return startTrackingResponse == null ? StartTrackingResponse.getDefaultInstance() : startTrackingResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public StopTrackingRequest getStopTrackingRequest() {
            StopTrackingRequest stopTrackingRequest = this.stopTrackingRequest_;
            return stopTrackingRequest == null ? StopTrackingRequest.getDefaultInstance() : stopTrackingRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public StopTrackingRequestOrBuilder getStopTrackingRequestOrBuilder() {
            StopTrackingRequest stopTrackingRequest = this.stopTrackingRequest_;
            return stopTrackingRequest == null ? StopTrackingRequest.getDefaultInstance() : stopTrackingRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public StopTrackingResponse getStopTrackingResponse() {
            StopTrackingResponse stopTrackingResponse = this.stopTrackingResponse_;
            return stopTrackingResponse == null ? StopTrackingResponse.getDefaultInstance() : stopTrackingResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public StopTrackingResponseOrBuilder getStopTrackingResponseOrBuilder() {
            StopTrackingResponse stopTrackingResponse = this.stopTrackingResponse_;
            return stopTrackingResponse == null ? StopTrackingResponse.getDefaultInstance() : stopTrackingResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingPointNotification getTrackingPointNotification() {
            TrackingPointNotification trackingPointNotification = this.trackingPointNotification_;
            return trackingPointNotification == null ? TrackingPointNotification.getDefaultInstance() : trackingPointNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingPointNotificationOrBuilder getTrackingPointNotificationOrBuilder() {
            TrackingPointNotification trackingPointNotification = this.trackingPointNotification_;
            return trackingPointNotification == null ? TrackingPointNotification.getDefaultInstance() : trackingPointNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingSessionNotification getTrackingSessionNotification() {
            TrackingSessionNotification trackingSessionNotification = this.trackingSessionNotification_;
            return trackingSessionNotification == null ? TrackingSessionNotification.getDefaultInstance() : trackingSessionNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingSessionNotificationOrBuilder getTrackingSessionNotificationOrBuilder() {
            TrackingSessionNotification trackingSessionNotification = this.trackingSessionNotification_;
            return trackingSessionNotification == null ? TrackingSessionNotification.getDefaultInstance() : trackingSessionNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingStateRequest getTrackingStateRequest() {
            TrackingStateRequest trackingStateRequest = this.trackingStateRequest_;
            return trackingStateRequest == null ? TrackingStateRequest.getDefaultInstance() : trackingStateRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingStateRequestOrBuilder getTrackingStateRequestOrBuilder() {
            TrackingStateRequest trackingStateRequest = this.trackingStateRequest_;
            return trackingStateRequest == null ? TrackingStateRequest.getDefaultInstance() : trackingStateRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingStateResponse getTrackingStateResponse() {
            TrackingStateResponse trackingStateResponse = this.trackingStateResponse_;
            return trackingStateResponse == null ? TrackingStateResponse.getDefaultInstance() : trackingStateResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingStateResponseOrBuilder getTrackingStateResponseOrBuilder() {
            TrackingStateResponse trackingStateResponse = this.trackingStateResponse_;
            return trackingStateResponse == null ? TrackingStateResponse.getDefaultInstance() : trackingStateResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingStatusNotification getTrackingStatusNotification() {
            TrackingStatusNotification trackingStatusNotification = this.trackingStatusNotification_;
            return trackingStatusNotification == null ? TrackingStatusNotification.getDefaultInstance() : trackingStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingStatusNotificationOrBuilder getTrackingStatusNotificationOrBuilder() {
            TrackingStatusNotification trackingStatusNotification = this.trackingStatusNotification_;
            return trackingStatusNotification == null ? TrackingStatusNotification.getDefaultInstance() : trackingStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingSubscribeRequest getTrackingSubscribeRequest() {
            TrackingSubscribeRequest trackingSubscribeRequest = this.trackingSubscribeRequest_;
            return trackingSubscribeRequest == null ? TrackingSubscribeRequest.getDefaultInstance() : trackingSubscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingSubscribeRequestOrBuilder getTrackingSubscribeRequestOrBuilder() {
            TrackingSubscribeRequest trackingSubscribeRequest = this.trackingSubscribeRequest_;
            return trackingSubscribeRequest == null ? TrackingSubscribeRequest.getDefaultInstance() : trackingSubscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingSubscribeResponse getTrackingSubscribeResponse() {
            TrackingSubscribeResponse trackingSubscribeResponse = this.trackingSubscribeResponse_;
            return trackingSubscribeResponse == null ? TrackingSubscribeResponse.getDefaultInstance() : trackingSubscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public TrackingSubscribeResponseOrBuilder getTrackingSubscribeResponseOrBuilder() {
            TrackingSubscribeResponse trackingSubscribeResponse = this.trackingSubscribeResponse_;
            return trackingSubscribeResponse == null ? TrackingSubscribeResponse.getDefaultInstance() : trackingSubscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasChangeUintListSettingRequest() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasChangeUintListSettingResponse() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasCurrentSettingsRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasCurrentSettingsResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasLegalUintListValuesRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasLegalUintListValuesResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasLegalValuesChangedNotification() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasStartTrackingRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasStartTrackingResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasStopTrackingRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasStopTrackingResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasTrackingPointNotification() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasTrackingSessionNotification() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasTrackingStateRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasTrackingStateResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasTrackingStatusNotification() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasTrackingSubscribeRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
        public boolean hasTrackingSubscribeResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTrackingStateRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTrackingStateRequest().hashCode();
            }
            if (hasTrackingStateResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTrackingStateResponse().hashCode();
            }
            if (hasStartTrackingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStartTrackingRequest().hashCode();
            }
            if (hasStartTrackingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStartTrackingResponse().hashCode();
            }
            if (hasStopTrackingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getStopTrackingRequest().hashCode();
            }
            if (hasStopTrackingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getStopTrackingResponse().hashCode();
            }
            if (hasCurrentSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getCurrentSettingsRequest().hashCode();
            }
            if (hasCurrentSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getCurrentSettingsResponse().hashCode();
            }
            if (hasLegalUintListValuesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getLegalUintListValuesRequest().hashCode();
            }
            if (hasLegalUintListValuesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getLegalUintListValuesResponse().hashCode();
            }
            if (hasChangeUintListSettingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getChangeUintListSettingRequest().hashCode();
            }
            if (hasChangeUintListSettingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getChangeUintListSettingResponse().hashCode();
            }
            if (hasTrackingSubscribeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getTrackingSubscribeRequest().hashCode();
            }
            if (hasTrackingSubscribeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getTrackingSubscribeResponse().hashCode();
            }
            if (hasTrackingStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getTrackingStatusNotification().hashCode();
            }
            if (hasLegalValuesChangedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getLegalValuesChangedNotification().hashCode();
            }
            if (hasTrackingSessionNotification()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getTrackingSessionNotification().hashCode();
            }
            if (hasTrackingPointNotification()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getTrackingPointNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_InReachTrackingService_fieldAccessorTable.ensureFieldAccessorsInitialized(InReachTrackingService.class, Builder.class);
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
            if (hasTrackingStateResponse() && !getTrackingStateResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStartTrackingResponse() && !getStartTrackingResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStopTrackingResponse() && !getStopTrackingResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCurrentSettingsRequest() && !getCurrentSettingsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCurrentSettingsResponse() && !getCurrentSettingsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLegalUintListValuesRequest() && !getLegalUintListValuesRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLegalUintListValuesResponse() && !getLegalUintListValuesResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasChangeUintListSettingRequest() && !getChangeUintListSettingRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasChangeUintListSettingResponse() && !getChangeUintListSettingResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTrackingSubscribeResponse() && !getTrackingSubscribeResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTrackingStatusNotification() && !getTrackingStatusNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTrackingSessionNotification() && !getTrackingSessionNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTrackingPointNotification() || getTrackingPointNotification().isInitialized()) {
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
            return new InReachTrackingService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getTrackingStateRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTrackingStateResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStartTrackingRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getStartTrackingResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getStopTrackingRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getStopTrackingResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getCurrentSettingsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getCurrentSettingsResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getLegalUintListValuesRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getLegalUintListValuesResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getChangeUintListSettingRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getChangeUintListSettingResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getTrackingSubscribeRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getTrackingSubscribeResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getTrackingStatusNotification());
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeMessage(16, getLegalValuesChangedNotification());
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeMessage(17, getTrackingSessionNotification());
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeMessage(18, getTrackingPointNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InReachTrackingServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> changeUintListSettingRequestBuilder_;
            private ChangeUintListSettingRequest changeUintListSettingRequest_;
            private SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> changeUintListSettingResponseBuilder_;
            private ChangeUintListSettingResponse changeUintListSettingResponse_;
            private SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> currentSettingsRequestBuilder_;
            private CurrentSettingsRequest currentSettingsRequest_;
            private SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> currentSettingsResponseBuilder_;
            private CurrentSettingsResponse currentSettingsResponse_;
            private SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> legalUintListValuesRequestBuilder_;
            private LegalUintListValuesRequest legalUintListValuesRequest_;
            private SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> legalUintListValuesResponseBuilder_;
            private LegalUintListValuesResponse legalUintListValuesResponse_;
            private SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> legalValuesChangedNotificationBuilder_;
            private LegalValuesChangedNotification legalValuesChangedNotification_;
            private SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> startTrackingRequestBuilder_;
            private StartTrackingRequest startTrackingRequest_;
            private SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> startTrackingResponseBuilder_;
            private StartTrackingResponse startTrackingResponse_;
            private SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> stopTrackingRequestBuilder_;
            private StopTrackingRequest stopTrackingRequest_;
            private SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> stopTrackingResponseBuilder_;
            private StopTrackingResponse stopTrackingResponse_;
            private SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> trackingPointNotificationBuilder_;
            private TrackingPointNotification trackingPointNotification_;
            private SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> trackingSessionNotificationBuilder_;
            private TrackingSessionNotification trackingSessionNotification_;
            private SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> trackingStateRequestBuilder_;
            private TrackingStateRequest trackingStateRequest_;
            private SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> trackingStateResponseBuilder_;
            private TrackingStateResponse trackingStateResponse_;
            private SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> trackingStatusNotificationBuilder_;
            private TrackingStatusNotification trackingStatusNotification_;
            private SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> trackingSubscribeRequestBuilder_;
            private TrackingSubscribeRequest trackingSubscribeRequest_;
            private SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> trackingSubscribeResponseBuilder_;
            private TrackingSubscribeResponse trackingSubscribeResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(InReachTrackingService inReachTrackingService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> singleFieldBuilderV3 = this.trackingStateRequestBuilder_;
                    inReachTrackingService.trackingStateRequest_ = singleFieldBuilderV3 == null ? this.trackingStateRequest_ : (TrackingStateRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> singleFieldBuilderV4 = this.trackingStateResponseBuilder_;
                    inReachTrackingService.trackingStateResponse_ = singleFieldBuilderV4 == null ? this.trackingStateResponse_ : (TrackingStateResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> singleFieldBuilderV5 = this.startTrackingRequestBuilder_;
                    inReachTrackingService.startTrackingRequest_ = singleFieldBuilderV5 == null ? this.startTrackingRequest_ : (StartTrackingRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> singleFieldBuilderV6 = this.startTrackingResponseBuilder_;
                    inReachTrackingService.startTrackingResponse_ = singleFieldBuilderV6 == null ? this.startTrackingResponse_ : (StartTrackingResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> singleFieldBuilderV7 = this.stopTrackingRequestBuilder_;
                    inReachTrackingService.stopTrackingRequest_ = singleFieldBuilderV7 == null ? this.stopTrackingRequest_ : (StopTrackingRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> singleFieldBuilderV8 = this.stopTrackingResponseBuilder_;
                    inReachTrackingService.stopTrackingResponse_ = singleFieldBuilderV8 == null ? this.stopTrackingResponse_ : (StopTrackingResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> singleFieldBuilderV9 = this.currentSettingsRequestBuilder_;
                    inReachTrackingService.currentSettingsRequest_ = singleFieldBuilderV9 == null ? this.currentSettingsRequest_ : (CurrentSettingsRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> singleFieldBuilderV10 = this.currentSettingsResponseBuilder_;
                    inReachTrackingService.currentSettingsResponse_ = singleFieldBuilderV10 == null ? this.currentSettingsResponse_ : (CurrentSettingsResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> singleFieldBuilderV11 = this.legalUintListValuesRequestBuilder_;
                    inReachTrackingService.legalUintListValuesRequest_ = singleFieldBuilderV11 == null ? this.legalUintListValuesRequest_ : (LegalUintListValuesRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> singleFieldBuilderV12 = this.legalUintListValuesResponseBuilder_;
                    inReachTrackingService.legalUintListValuesResponse_ = singleFieldBuilderV12 == null ? this.legalUintListValuesResponse_ : (LegalUintListValuesResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> singleFieldBuilderV13 = this.changeUintListSettingRequestBuilder_;
                    inReachTrackingService.changeUintListSettingRequest_ = singleFieldBuilderV13 == null ? this.changeUintListSettingRequest_ : (ChangeUintListSettingRequest) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> singleFieldBuilderV14 = this.changeUintListSettingResponseBuilder_;
                    inReachTrackingService.changeUintListSettingResponse_ = singleFieldBuilderV14 == null ? this.changeUintListSettingResponse_ : (ChangeUintListSettingResponse) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> singleFieldBuilderV15 = this.trackingSubscribeRequestBuilder_;
                    inReachTrackingService.trackingSubscribeRequest_ = singleFieldBuilderV15 == null ? this.trackingSubscribeRequest_ : (TrackingSubscribeRequest) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> singleFieldBuilderV16 = this.trackingSubscribeResponseBuilder_;
                    inReachTrackingService.trackingSubscribeResponse_ = singleFieldBuilderV16 == null ? this.trackingSubscribeResponse_ : (TrackingSubscribeResponse) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> singleFieldBuilderV17 = this.trackingStatusNotificationBuilder_;
                    inReachTrackingService.trackingStatusNotification_ = singleFieldBuilderV17 == null ? this.trackingStatusNotification_ : (TrackingStatusNotification) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> singleFieldBuilderV18 = this.legalValuesChangedNotificationBuilder_;
                    inReachTrackingService.legalValuesChangedNotification_ = singleFieldBuilderV18 == null ? this.legalValuesChangedNotification_ : (LegalValuesChangedNotification) singleFieldBuilderV18.build();
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> singleFieldBuilderV19 = this.trackingSessionNotificationBuilder_;
                    inReachTrackingService.trackingSessionNotification_ = singleFieldBuilderV19 == null ? this.trackingSessionNotification_ : (TrackingSessionNotification) singleFieldBuilderV19.build();
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> singleFieldBuilderV20 = this.trackingPointNotificationBuilder_;
                    inReachTrackingService.trackingPointNotification_ = singleFieldBuilderV20 == null ? this.trackingPointNotification_ : (TrackingPointNotification) singleFieldBuilderV20.build();
                    i14 |= 131072;
                }
                inReachTrackingService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> getChangeUintListSettingRequestFieldBuilder() {
                if (this.changeUintListSettingRequestBuilder_ == null) {
                    this.changeUintListSettingRequestBuilder_ = new SingleFieldBuilderV3<>(getChangeUintListSettingRequest(), getParentForChildren(), isClean());
                    this.changeUintListSettingRequest_ = null;
                }
                return this.changeUintListSettingRequestBuilder_;
            }

            private SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> getChangeUintListSettingResponseFieldBuilder() {
                if (this.changeUintListSettingResponseBuilder_ == null) {
                    this.changeUintListSettingResponseBuilder_ = new SingleFieldBuilderV3<>(getChangeUintListSettingResponse(), getParentForChildren(), isClean());
                    this.changeUintListSettingResponse_ = null;
                }
                return this.changeUintListSettingResponseBuilder_;
            }

            private SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> getCurrentSettingsRequestFieldBuilder() {
                if (this.currentSettingsRequestBuilder_ == null) {
                    this.currentSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getCurrentSettingsRequest(), getParentForChildren(), isClean());
                    this.currentSettingsRequest_ = null;
                }
                return this.currentSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> getCurrentSettingsResponseFieldBuilder() {
                if (this.currentSettingsResponseBuilder_ == null) {
                    this.currentSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getCurrentSettingsResponse(), getParentForChildren(), isClean());
                    this.currentSettingsResponse_ = null;
                }
                return this.currentSettingsResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_InReachTrackingService_descriptor;
            }

            private SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> getLegalUintListValuesRequestFieldBuilder() {
                if (this.legalUintListValuesRequestBuilder_ == null) {
                    this.legalUintListValuesRequestBuilder_ = new SingleFieldBuilderV3<>(getLegalUintListValuesRequest(), getParentForChildren(), isClean());
                    this.legalUintListValuesRequest_ = null;
                }
                return this.legalUintListValuesRequestBuilder_;
            }

            private SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> getLegalUintListValuesResponseFieldBuilder() {
                if (this.legalUintListValuesResponseBuilder_ == null) {
                    this.legalUintListValuesResponseBuilder_ = new SingleFieldBuilderV3<>(getLegalUintListValuesResponse(), getParentForChildren(), isClean());
                    this.legalUintListValuesResponse_ = null;
                }
                return this.legalUintListValuesResponseBuilder_;
            }

            private SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> getLegalValuesChangedNotificationFieldBuilder() {
                if (this.legalValuesChangedNotificationBuilder_ == null) {
                    this.legalValuesChangedNotificationBuilder_ = new SingleFieldBuilderV3<>(getLegalValuesChangedNotification(), getParentForChildren(), isClean());
                    this.legalValuesChangedNotification_ = null;
                }
                return this.legalValuesChangedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> getStartTrackingRequestFieldBuilder() {
                if (this.startTrackingRequestBuilder_ == null) {
                    this.startTrackingRequestBuilder_ = new SingleFieldBuilderV3<>(getStartTrackingRequest(), getParentForChildren(), isClean());
                    this.startTrackingRequest_ = null;
                }
                return this.startTrackingRequestBuilder_;
            }

            private SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> getStartTrackingResponseFieldBuilder() {
                if (this.startTrackingResponseBuilder_ == null) {
                    this.startTrackingResponseBuilder_ = new SingleFieldBuilderV3<>(getStartTrackingResponse(), getParentForChildren(), isClean());
                    this.startTrackingResponse_ = null;
                }
                return this.startTrackingResponseBuilder_;
            }

            private SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> getStopTrackingRequestFieldBuilder() {
                if (this.stopTrackingRequestBuilder_ == null) {
                    this.stopTrackingRequestBuilder_ = new SingleFieldBuilderV3<>(getStopTrackingRequest(), getParentForChildren(), isClean());
                    this.stopTrackingRequest_ = null;
                }
                return this.stopTrackingRequestBuilder_;
            }

            private SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> getStopTrackingResponseFieldBuilder() {
                if (this.stopTrackingResponseBuilder_ == null) {
                    this.stopTrackingResponseBuilder_ = new SingleFieldBuilderV3<>(getStopTrackingResponse(), getParentForChildren(), isClean());
                    this.stopTrackingResponse_ = null;
                }
                return this.stopTrackingResponseBuilder_;
            }

            private SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> getTrackingPointNotificationFieldBuilder() {
                if (this.trackingPointNotificationBuilder_ == null) {
                    this.trackingPointNotificationBuilder_ = new SingleFieldBuilderV3<>(getTrackingPointNotification(), getParentForChildren(), isClean());
                    this.trackingPointNotification_ = null;
                }
                return this.trackingPointNotificationBuilder_;
            }

            private SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> getTrackingSessionNotificationFieldBuilder() {
                if (this.trackingSessionNotificationBuilder_ == null) {
                    this.trackingSessionNotificationBuilder_ = new SingleFieldBuilderV3<>(getTrackingSessionNotification(), getParentForChildren(), isClean());
                    this.trackingSessionNotification_ = null;
                }
                return this.trackingSessionNotificationBuilder_;
            }

            private SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> getTrackingStateRequestFieldBuilder() {
                if (this.trackingStateRequestBuilder_ == null) {
                    this.trackingStateRequestBuilder_ = new SingleFieldBuilderV3<>(getTrackingStateRequest(), getParentForChildren(), isClean());
                    this.trackingStateRequest_ = null;
                }
                return this.trackingStateRequestBuilder_;
            }

            private SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> getTrackingStateResponseFieldBuilder() {
                if (this.trackingStateResponseBuilder_ == null) {
                    this.trackingStateResponseBuilder_ = new SingleFieldBuilderV3<>(getTrackingStateResponse(), getParentForChildren(), isClean());
                    this.trackingStateResponse_ = null;
                }
                return this.trackingStateResponseBuilder_;
            }

            private SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> getTrackingStatusNotificationFieldBuilder() {
                if (this.trackingStatusNotificationBuilder_ == null) {
                    this.trackingStatusNotificationBuilder_ = new SingleFieldBuilderV3<>(getTrackingStatusNotification(), getParentForChildren(), isClean());
                    this.trackingStatusNotification_ = null;
                }
                return this.trackingStatusNotificationBuilder_;
            }

            private SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> getTrackingSubscribeRequestFieldBuilder() {
                if (this.trackingSubscribeRequestBuilder_ == null) {
                    this.trackingSubscribeRequestBuilder_ = new SingleFieldBuilderV3<>(getTrackingSubscribeRequest(), getParentForChildren(), isClean());
                    this.trackingSubscribeRequest_ = null;
                }
                return this.trackingSubscribeRequestBuilder_;
            }

            private SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> getTrackingSubscribeResponseFieldBuilder() {
                if (this.trackingSubscribeResponseBuilder_ == null) {
                    this.trackingSubscribeResponseBuilder_ = new SingleFieldBuilderV3<>(getTrackingSubscribeResponse(), getParentForChildren(), isClean());
                    this.trackingSubscribeResponse_ = null;
                }
                return this.trackingSubscribeResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTrackingStateRequestFieldBuilder();
                    getTrackingStateResponseFieldBuilder();
                    getStartTrackingRequestFieldBuilder();
                    getStartTrackingResponseFieldBuilder();
                    getStopTrackingRequestFieldBuilder();
                    getStopTrackingResponseFieldBuilder();
                    getCurrentSettingsRequestFieldBuilder();
                    getCurrentSettingsResponseFieldBuilder();
                    getLegalUintListValuesRequestFieldBuilder();
                    getLegalUintListValuesResponseFieldBuilder();
                    getChangeUintListSettingRequestFieldBuilder();
                    getChangeUintListSettingResponseFieldBuilder();
                    getTrackingSubscribeRequestFieldBuilder();
                    getTrackingSubscribeResponseFieldBuilder();
                    getTrackingStatusNotificationFieldBuilder();
                    getLegalValuesChangedNotificationFieldBuilder();
                    getTrackingSessionNotificationFieldBuilder();
                    getTrackingPointNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InReachTrackingService build() {
                InReachTrackingService inReachTrackingServiceBuildPartial = buildPartial();
                if (inReachTrackingServiceBuildPartial.isInitialized()) {
                    return inReachTrackingServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) inReachTrackingServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InReachTrackingService buildPartial() {
                InReachTrackingService inReachTrackingService = new InReachTrackingService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(inReachTrackingService);
                }
                onBuilt();
                return inReachTrackingService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.trackingStateRequest_ = null;
                SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> singleFieldBuilderV3 = this.trackingStateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingStateRequestBuilder_ = null;
                }
                this.trackingStateResponse_ = null;
                SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> singleFieldBuilderV4 = this.trackingStateResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.trackingStateResponseBuilder_ = null;
                }
                this.startTrackingRequest_ = null;
                SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> singleFieldBuilderV5 = this.startTrackingRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.startTrackingRequestBuilder_ = null;
                }
                this.startTrackingResponse_ = null;
                SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> singleFieldBuilderV6 = this.startTrackingResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.startTrackingResponseBuilder_ = null;
                }
                this.stopTrackingRequest_ = null;
                SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> singleFieldBuilderV7 = this.stopTrackingRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.stopTrackingRequestBuilder_ = null;
                }
                this.stopTrackingResponse_ = null;
                SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> singleFieldBuilderV8 = this.stopTrackingResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.stopTrackingResponseBuilder_ = null;
                }
                this.currentSettingsRequest_ = null;
                SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> singleFieldBuilderV9 = this.currentSettingsRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.currentSettingsRequestBuilder_ = null;
                }
                this.currentSettingsResponse_ = null;
                SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> singleFieldBuilderV10 = this.currentSettingsResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.currentSettingsResponseBuilder_ = null;
                }
                this.legalUintListValuesRequest_ = null;
                SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> singleFieldBuilderV11 = this.legalUintListValuesRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.legalUintListValuesRequestBuilder_ = null;
                }
                this.legalUintListValuesResponse_ = null;
                SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> singleFieldBuilderV12 = this.legalUintListValuesResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.legalUintListValuesResponseBuilder_ = null;
                }
                this.changeUintListSettingRequest_ = null;
                SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> singleFieldBuilderV13 = this.changeUintListSettingRequestBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.changeUintListSettingRequestBuilder_ = null;
                }
                this.changeUintListSettingResponse_ = null;
                SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> singleFieldBuilderV14 = this.changeUintListSettingResponseBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.changeUintListSettingResponseBuilder_ = null;
                }
                this.trackingSubscribeRequest_ = null;
                SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> singleFieldBuilderV15 = this.trackingSubscribeRequestBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.trackingSubscribeRequestBuilder_ = null;
                }
                this.trackingSubscribeResponse_ = null;
                SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> singleFieldBuilderV16 = this.trackingSubscribeResponseBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.trackingSubscribeResponseBuilder_ = null;
                }
                this.trackingStatusNotification_ = null;
                SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> singleFieldBuilderV17 = this.trackingStatusNotificationBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.trackingStatusNotificationBuilder_ = null;
                }
                this.legalValuesChangedNotification_ = null;
                SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> singleFieldBuilderV18 = this.legalValuesChangedNotificationBuilder_;
                if (singleFieldBuilderV18 != null) {
                    singleFieldBuilderV18.dispose();
                    this.legalValuesChangedNotificationBuilder_ = null;
                }
                this.trackingSessionNotification_ = null;
                SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> singleFieldBuilderV19 = this.trackingSessionNotificationBuilder_;
                if (singleFieldBuilderV19 != null) {
                    singleFieldBuilderV19.dispose();
                    this.trackingSessionNotificationBuilder_ = null;
                }
                this.trackingPointNotification_ = null;
                SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> singleFieldBuilderV20 = this.trackingPointNotificationBuilder_;
                if (singleFieldBuilderV20 != null) {
                    singleFieldBuilderV20.dispose();
                    this.trackingPointNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearChangeUintListSettingRequest() {
                this.bitField0_ &= -1025;
                this.changeUintListSettingRequest_ = null;
                SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.changeUintListSettingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearChangeUintListSettingResponse() {
                this.bitField0_ &= -2049;
                this.changeUintListSettingResponse_ = null;
                SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.changeUintListSettingResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCurrentSettingsRequest() {
                this.bitField0_ &= -65;
                this.currentSettingsRequest_ = null;
                SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> singleFieldBuilderV3 = this.currentSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.currentSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCurrentSettingsResponse() {
                this.bitField0_ &= -129;
                this.currentSettingsResponse_ = null;
                SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> singleFieldBuilderV3 = this.currentSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.currentSettingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLegalUintListValuesRequest() {
                this.bitField0_ &= -257;
                this.legalUintListValuesRequest_ = null;
                SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.legalUintListValuesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLegalUintListValuesResponse() {
                this.bitField0_ &= -513;
                this.legalUintListValuesResponse_ = null;
                SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.legalUintListValuesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLegalValuesChangedNotification() {
                this.bitField0_ &= -32769;
                this.legalValuesChangedNotification_ = null;
                SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> singleFieldBuilderV3 = this.legalValuesChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.legalValuesChangedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStartTrackingRequest() {
                this.bitField0_ &= -5;
                this.startTrackingRequest_ = null;
                SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> singleFieldBuilderV3 = this.startTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startTrackingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartTrackingResponse() {
                this.bitField0_ &= -9;
                this.startTrackingResponse_ = null;
                SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> singleFieldBuilderV3 = this.startTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startTrackingResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStopTrackingRequest() {
                this.bitField0_ &= -17;
                this.stopTrackingRequest_ = null;
                SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> singleFieldBuilderV3 = this.stopTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stopTrackingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStopTrackingResponse() {
                this.bitField0_ &= -33;
                this.stopTrackingResponse_ = null;
                SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> singleFieldBuilderV3 = this.stopTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stopTrackingResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackingPointNotification() {
                this.bitField0_ &= -131073;
                this.trackingPointNotification_ = null;
                SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> singleFieldBuilderV3 = this.trackingPointNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingPointNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackingSessionNotification() {
                this.bitField0_ &= -65537;
                this.trackingSessionNotification_ = null;
                SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> singleFieldBuilderV3 = this.trackingSessionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingSessionNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackingStateRequest() {
                this.bitField0_ &= -2;
                this.trackingStateRequest_ = null;
                SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> singleFieldBuilderV3 = this.trackingStateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingStateRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackingStateResponse() {
                this.bitField0_ &= -3;
                this.trackingStateResponse_ = null;
                SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> singleFieldBuilderV3 = this.trackingStateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingStateResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackingStatusNotification() {
                this.bitField0_ &= -16385;
                this.trackingStatusNotification_ = null;
                SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.trackingStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingStatusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackingSubscribeRequest() {
                this.bitField0_ &= -4097;
                this.trackingSubscribeRequest_ = null;
                SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingSubscribeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrackingSubscribeResponse() {
                this.bitField0_ &= -8193;
                this.trackingSubscribeResponse_ = null;
                SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackingSubscribeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public ChangeUintListSettingRequest getChangeUintListSettingRequest() {
                SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeUintListSettingRequest) singleFieldBuilderV3.getMessage();
                }
                ChangeUintListSettingRequest changeUintListSettingRequest = this.changeUintListSettingRequest_;
                return changeUintListSettingRequest == null ? ChangeUintListSettingRequest.getDefaultInstance() : changeUintListSettingRequest;
            }

            public ChangeUintListSettingRequest.Builder getChangeUintListSettingRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (ChangeUintListSettingRequest.Builder) getChangeUintListSettingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public ChangeUintListSettingRequestOrBuilder getChangeUintListSettingRequestOrBuilder() {
                SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeUintListSettingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChangeUintListSettingRequest changeUintListSettingRequest = this.changeUintListSettingRequest_;
                return changeUintListSettingRequest == null ? ChangeUintListSettingRequest.getDefaultInstance() : changeUintListSettingRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public ChangeUintListSettingResponse getChangeUintListSettingResponse() {
                SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeUintListSettingResponse) singleFieldBuilderV3.getMessage();
                }
                ChangeUintListSettingResponse changeUintListSettingResponse = this.changeUintListSettingResponse_;
                return changeUintListSettingResponse == null ? ChangeUintListSettingResponse.getDefaultInstance() : changeUintListSettingResponse;
            }

            public ChangeUintListSettingResponse.Builder getChangeUintListSettingResponseBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (ChangeUintListSettingResponse.Builder) getChangeUintListSettingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public ChangeUintListSettingResponseOrBuilder getChangeUintListSettingResponseOrBuilder() {
                SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeUintListSettingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChangeUintListSettingResponse changeUintListSettingResponse = this.changeUintListSettingResponse_;
                return changeUintListSettingResponse == null ? ChangeUintListSettingResponse.getDefaultInstance() : changeUintListSettingResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public CurrentSettingsRequest getCurrentSettingsRequest() {
                SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> singleFieldBuilderV3 = this.currentSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CurrentSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                CurrentSettingsRequest currentSettingsRequest = this.currentSettingsRequest_;
                return currentSettingsRequest == null ? CurrentSettingsRequest.getDefaultInstance() : currentSettingsRequest;
            }

            public CurrentSettingsRequest.Builder getCurrentSettingsRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (CurrentSettingsRequest.Builder) getCurrentSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public CurrentSettingsRequestOrBuilder getCurrentSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> singleFieldBuilderV3 = this.currentSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CurrentSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CurrentSettingsRequest currentSettingsRequest = this.currentSettingsRequest_;
                return currentSettingsRequest == null ? CurrentSettingsRequest.getDefaultInstance() : currentSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public CurrentSettingsResponse getCurrentSettingsResponse() {
                SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> singleFieldBuilderV3 = this.currentSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CurrentSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                CurrentSettingsResponse currentSettingsResponse = this.currentSettingsResponse_;
                return currentSettingsResponse == null ? CurrentSettingsResponse.getDefaultInstance() : currentSettingsResponse;
            }

            public CurrentSettingsResponse.Builder getCurrentSettingsResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (CurrentSettingsResponse.Builder) getCurrentSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public CurrentSettingsResponseOrBuilder getCurrentSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> singleFieldBuilderV3 = this.currentSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CurrentSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CurrentSettingsResponse currentSettingsResponse = this.currentSettingsResponse_;
                return currentSettingsResponse == null ? CurrentSettingsResponse.getDefaultInstance() : currentSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_InReachTrackingService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public LegalUintListValuesRequest getLegalUintListValuesRequest() {
                SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LegalUintListValuesRequest) singleFieldBuilderV3.getMessage();
                }
                LegalUintListValuesRequest legalUintListValuesRequest = this.legalUintListValuesRequest_;
                return legalUintListValuesRequest == null ? LegalUintListValuesRequest.getDefaultInstance() : legalUintListValuesRequest;
            }

            public LegalUintListValuesRequest.Builder getLegalUintListValuesRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (LegalUintListValuesRequest.Builder) getLegalUintListValuesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public LegalUintListValuesRequestOrBuilder getLegalUintListValuesRequestOrBuilder() {
                SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LegalUintListValuesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LegalUintListValuesRequest legalUintListValuesRequest = this.legalUintListValuesRequest_;
                return legalUintListValuesRequest == null ? LegalUintListValuesRequest.getDefaultInstance() : legalUintListValuesRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public LegalUintListValuesResponse getLegalUintListValuesResponse() {
                SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LegalUintListValuesResponse) singleFieldBuilderV3.getMessage();
                }
                LegalUintListValuesResponse legalUintListValuesResponse = this.legalUintListValuesResponse_;
                return legalUintListValuesResponse == null ? LegalUintListValuesResponse.getDefaultInstance() : legalUintListValuesResponse;
            }

            public LegalUintListValuesResponse.Builder getLegalUintListValuesResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (LegalUintListValuesResponse.Builder) getLegalUintListValuesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public LegalUintListValuesResponseOrBuilder getLegalUintListValuesResponseOrBuilder() {
                SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LegalUintListValuesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LegalUintListValuesResponse legalUintListValuesResponse = this.legalUintListValuesResponse_;
                return legalUintListValuesResponse == null ? LegalUintListValuesResponse.getDefaultInstance() : legalUintListValuesResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public LegalValuesChangedNotification getLegalValuesChangedNotification() {
                SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> singleFieldBuilderV3 = this.legalValuesChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LegalValuesChangedNotification) singleFieldBuilderV3.getMessage();
                }
                LegalValuesChangedNotification legalValuesChangedNotification = this.legalValuesChangedNotification_;
                return legalValuesChangedNotification == null ? LegalValuesChangedNotification.getDefaultInstance() : legalValuesChangedNotification;
            }

            public LegalValuesChangedNotification.Builder getLegalValuesChangedNotificationBuilder() {
                this.bitField0_ |= 32768;
                onChanged();
                return (LegalValuesChangedNotification.Builder) getLegalValuesChangedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public LegalValuesChangedNotificationOrBuilder getLegalValuesChangedNotificationOrBuilder() {
                SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> singleFieldBuilderV3 = this.legalValuesChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LegalValuesChangedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LegalValuesChangedNotification legalValuesChangedNotification = this.legalValuesChangedNotification_;
                return legalValuesChangedNotification == null ? LegalValuesChangedNotification.getDefaultInstance() : legalValuesChangedNotification;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public StartTrackingRequest getStartTrackingRequest() {
                SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> singleFieldBuilderV3 = this.startTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartTrackingRequest) singleFieldBuilderV3.getMessage();
                }
                StartTrackingRequest startTrackingRequest = this.startTrackingRequest_;
                return startTrackingRequest == null ? StartTrackingRequest.getDefaultInstance() : startTrackingRequest;
            }

            public StartTrackingRequest.Builder getStartTrackingRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (StartTrackingRequest.Builder) getStartTrackingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public StartTrackingRequestOrBuilder getStartTrackingRequestOrBuilder() {
                SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> singleFieldBuilderV3 = this.startTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartTrackingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartTrackingRequest startTrackingRequest = this.startTrackingRequest_;
                return startTrackingRequest == null ? StartTrackingRequest.getDefaultInstance() : startTrackingRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public StartTrackingResponse getStartTrackingResponse() {
                SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> singleFieldBuilderV3 = this.startTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartTrackingResponse) singleFieldBuilderV3.getMessage();
                }
                StartTrackingResponse startTrackingResponse = this.startTrackingResponse_;
                return startTrackingResponse == null ? StartTrackingResponse.getDefaultInstance() : startTrackingResponse;
            }

            public StartTrackingResponse.Builder getStartTrackingResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (StartTrackingResponse.Builder) getStartTrackingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public StartTrackingResponseOrBuilder getStartTrackingResponseOrBuilder() {
                SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> singleFieldBuilderV3 = this.startTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartTrackingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartTrackingResponse startTrackingResponse = this.startTrackingResponse_;
                return startTrackingResponse == null ? StartTrackingResponse.getDefaultInstance() : startTrackingResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public StopTrackingRequest getStopTrackingRequest() {
                SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> singleFieldBuilderV3 = this.stopTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopTrackingRequest) singleFieldBuilderV3.getMessage();
                }
                StopTrackingRequest stopTrackingRequest = this.stopTrackingRequest_;
                return stopTrackingRequest == null ? StopTrackingRequest.getDefaultInstance() : stopTrackingRequest;
            }

            public StopTrackingRequest.Builder getStopTrackingRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (StopTrackingRequest.Builder) getStopTrackingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public StopTrackingRequestOrBuilder getStopTrackingRequestOrBuilder() {
                SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> singleFieldBuilderV3 = this.stopTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopTrackingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopTrackingRequest stopTrackingRequest = this.stopTrackingRequest_;
                return stopTrackingRequest == null ? StopTrackingRequest.getDefaultInstance() : stopTrackingRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public StopTrackingResponse getStopTrackingResponse() {
                SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> singleFieldBuilderV3 = this.stopTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopTrackingResponse) singleFieldBuilderV3.getMessage();
                }
                StopTrackingResponse stopTrackingResponse = this.stopTrackingResponse_;
                return stopTrackingResponse == null ? StopTrackingResponse.getDefaultInstance() : stopTrackingResponse;
            }

            public StopTrackingResponse.Builder getStopTrackingResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (StopTrackingResponse.Builder) getStopTrackingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public StopTrackingResponseOrBuilder getStopTrackingResponseOrBuilder() {
                SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> singleFieldBuilderV3 = this.stopTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopTrackingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopTrackingResponse stopTrackingResponse = this.stopTrackingResponse_;
                return stopTrackingResponse == null ? StopTrackingResponse.getDefaultInstance() : stopTrackingResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingPointNotification getTrackingPointNotification() {
                SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> singleFieldBuilderV3 = this.trackingPointNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingPointNotification) singleFieldBuilderV3.getMessage();
                }
                TrackingPointNotification trackingPointNotification = this.trackingPointNotification_;
                return trackingPointNotification == null ? TrackingPointNotification.getDefaultInstance() : trackingPointNotification;
            }

            public TrackingPointNotification.Builder getTrackingPointNotificationBuilder() {
                this.bitField0_ |= 131072;
                onChanged();
                return (TrackingPointNotification.Builder) getTrackingPointNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingPointNotificationOrBuilder getTrackingPointNotificationOrBuilder() {
                SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> singleFieldBuilderV3 = this.trackingPointNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingPointNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingPointNotification trackingPointNotification = this.trackingPointNotification_;
                return trackingPointNotification == null ? TrackingPointNotification.getDefaultInstance() : trackingPointNotification;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingSessionNotification getTrackingSessionNotification() {
                SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> singleFieldBuilderV3 = this.trackingSessionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSessionNotification) singleFieldBuilderV3.getMessage();
                }
                TrackingSessionNotification trackingSessionNotification = this.trackingSessionNotification_;
                return trackingSessionNotification == null ? TrackingSessionNotification.getDefaultInstance() : trackingSessionNotification;
            }

            public TrackingSessionNotification.Builder getTrackingSessionNotificationBuilder() {
                this.bitField0_ |= 65536;
                onChanged();
                return (TrackingSessionNotification.Builder) getTrackingSessionNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingSessionNotificationOrBuilder getTrackingSessionNotificationOrBuilder() {
                SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> singleFieldBuilderV3 = this.trackingSessionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSessionNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingSessionNotification trackingSessionNotification = this.trackingSessionNotification_;
                return trackingSessionNotification == null ? TrackingSessionNotification.getDefaultInstance() : trackingSessionNotification;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingStateRequest getTrackingStateRequest() {
                SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> singleFieldBuilderV3 = this.trackingStateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingStateRequest) singleFieldBuilderV3.getMessage();
                }
                TrackingStateRequest trackingStateRequest = this.trackingStateRequest_;
                return trackingStateRequest == null ? TrackingStateRequest.getDefaultInstance() : trackingStateRequest;
            }

            public TrackingStateRequest.Builder getTrackingStateRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TrackingStateRequest.Builder) getTrackingStateRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingStateRequestOrBuilder getTrackingStateRequestOrBuilder() {
                SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> singleFieldBuilderV3 = this.trackingStateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingStateRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingStateRequest trackingStateRequest = this.trackingStateRequest_;
                return trackingStateRequest == null ? TrackingStateRequest.getDefaultInstance() : trackingStateRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingStateResponse getTrackingStateResponse() {
                SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> singleFieldBuilderV3 = this.trackingStateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingStateResponse) singleFieldBuilderV3.getMessage();
                }
                TrackingStateResponse trackingStateResponse = this.trackingStateResponse_;
                return trackingStateResponse == null ? TrackingStateResponse.getDefaultInstance() : trackingStateResponse;
            }

            public TrackingStateResponse.Builder getTrackingStateResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (TrackingStateResponse.Builder) getTrackingStateResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingStateResponseOrBuilder getTrackingStateResponseOrBuilder() {
                SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> singleFieldBuilderV3 = this.trackingStateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingStateResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingStateResponse trackingStateResponse = this.trackingStateResponse_;
                return trackingStateResponse == null ? TrackingStateResponse.getDefaultInstance() : trackingStateResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingStatusNotification getTrackingStatusNotification() {
                SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.trackingStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingStatusNotification) singleFieldBuilderV3.getMessage();
                }
                TrackingStatusNotification trackingStatusNotification = this.trackingStatusNotification_;
                return trackingStatusNotification == null ? TrackingStatusNotification.getDefaultInstance() : trackingStatusNotification;
            }

            public TrackingStatusNotification.Builder getTrackingStatusNotificationBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (TrackingStatusNotification.Builder) getTrackingStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingStatusNotificationOrBuilder getTrackingStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.trackingStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingStatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingStatusNotification trackingStatusNotification = this.trackingStatusNotification_;
                return trackingStatusNotification == null ? TrackingStatusNotification.getDefaultInstance() : trackingStatusNotification;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingSubscribeRequest getTrackingSubscribeRequest() {
                SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSubscribeRequest) singleFieldBuilderV3.getMessage();
                }
                TrackingSubscribeRequest trackingSubscribeRequest = this.trackingSubscribeRequest_;
                return trackingSubscribeRequest == null ? TrackingSubscribeRequest.getDefaultInstance() : trackingSubscribeRequest;
            }

            public TrackingSubscribeRequest.Builder getTrackingSubscribeRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (TrackingSubscribeRequest.Builder) getTrackingSubscribeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingSubscribeRequestOrBuilder getTrackingSubscribeRequestOrBuilder() {
                SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSubscribeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingSubscribeRequest trackingSubscribeRequest = this.trackingSubscribeRequest_;
                return trackingSubscribeRequest == null ? TrackingSubscribeRequest.getDefaultInstance() : trackingSubscribeRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingSubscribeResponse getTrackingSubscribeResponse() {
                SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSubscribeResponse) singleFieldBuilderV3.getMessage();
                }
                TrackingSubscribeResponse trackingSubscribeResponse = this.trackingSubscribeResponse_;
                return trackingSubscribeResponse == null ? TrackingSubscribeResponse.getDefaultInstance() : trackingSubscribeResponse;
            }

            public TrackingSubscribeResponse.Builder getTrackingSubscribeResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (TrackingSubscribeResponse.Builder) getTrackingSubscribeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public TrackingSubscribeResponseOrBuilder getTrackingSubscribeResponseOrBuilder() {
                SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSubscribeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingSubscribeResponse trackingSubscribeResponse = this.trackingSubscribeResponse_;
                return trackingSubscribeResponse == null ? TrackingSubscribeResponse.getDefaultInstance() : trackingSubscribeResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasChangeUintListSettingRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasChangeUintListSettingResponse() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasCurrentSettingsRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasCurrentSettingsResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasLegalUintListValuesRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasLegalUintListValuesResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasLegalValuesChangedNotification() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasStartTrackingRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasStartTrackingResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasStopTrackingRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasStopTrackingResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasTrackingPointNotification() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasTrackingSessionNotification() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasTrackingStateRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasTrackingStateResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasTrackingStatusNotification() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasTrackingSubscribeRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.InReachTrackingServiceOrBuilder
            public boolean hasTrackingSubscribeResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_InReachTrackingService_fieldAccessorTable.ensureFieldAccessorsInitialized(InReachTrackingService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasTrackingStateResponse() && !getTrackingStateResponse().isInitialized()) {
                    return false;
                }
                if (hasStartTrackingResponse() && !getStartTrackingResponse().isInitialized()) {
                    return false;
                }
                if (hasStopTrackingResponse() && !getStopTrackingResponse().isInitialized()) {
                    return false;
                }
                if (hasCurrentSettingsRequest() && !getCurrentSettingsRequest().isInitialized()) {
                    return false;
                }
                if (hasCurrentSettingsResponse() && !getCurrentSettingsResponse().isInitialized()) {
                    return false;
                }
                if (hasLegalUintListValuesRequest() && !getLegalUintListValuesRequest().isInitialized()) {
                    return false;
                }
                if (hasLegalUintListValuesResponse() && !getLegalUintListValuesResponse().isInitialized()) {
                    return false;
                }
                if (hasChangeUintListSettingRequest() && !getChangeUintListSettingRequest().isInitialized()) {
                    return false;
                }
                if (hasChangeUintListSettingResponse() && !getChangeUintListSettingResponse().isInitialized()) {
                    return false;
                }
                if (hasTrackingSubscribeResponse() && !getTrackingSubscribeResponse().isInitialized()) {
                    return false;
                }
                if (hasTrackingStatusNotification() && !getTrackingStatusNotification().isInitialized()) {
                    return false;
                }
                if (!hasTrackingSessionNotification() || getTrackingSessionNotification().isInitialized()) {
                    return !hasTrackingPointNotification() || getTrackingPointNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeChangeUintListSettingRequest(ChangeUintListSettingRequest changeUintListSettingRequest) {
                ChangeUintListSettingRequest changeUintListSettingRequest2;
                SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(changeUintListSettingRequest);
                } else if ((this.bitField0_ & 1024) == 0 || (changeUintListSettingRequest2 = this.changeUintListSettingRequest_) == null || changeUintListSettingRequest2 == ChangeUintListSettingRequest.getDefaultInstance()) {
                    this.changeUintListSettingRequest_ = changeUintListSettingRequest;
                } else {
                    getChangeUintListSettingRequestBuilder().mergeFrom(changeUintListSettingRequest);
                }
                if (this.changeUintListSettingRequest_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeChangeUintListSettingResponse(ChangeUintListSettingResponse changeUintListSettingResponse) {
                ChangeUintListSettingResponse changeUintListSettingResponse2;
                SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(changeUintListSettingResponse);
                } else if ((this.bitField0_ & 2048) == 0 || (changeUintListSettingResponse2 = this.changeUintListSettingResponse_) == null || changeUintListSettingResponse2 == ChangeUintListSettingResponse.getDefaultInstance()) {
                    this.changeUintListSettingResponse_ = changeUintListSettingResponse;
                } else {
                    getChangeUintListSettingResponseBuilder().mergeFrom(changeUintListSettingResponse);
                }
                if (this.changeUintListSettingResponse_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCurrentSettingsRequest(CurrentSettingsRequest currentSettingsRequest) {
                CurrentSettingsRequest currentSettingsRequest2;
                SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> singleFieldBuilderV3 = this.currentSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(currentSettingsRequest);
                } else if ((this.bitField0_ & 64) == 0 || (currentSettingsRequest2 = this.currentSettingsRequest_) == null || currentSettingsRequest2 == CurrentSettingsRequest.getDefaultInstance()) {
                    this.currentSettingsRequest_ = currentSettingsRequest;
                } else {
                    getCurrentSettingsRequestBuilder().mergeFrom(currentSettingsRequest);
                }
                if (this.currentSettingsRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCurrentSettingsResponse(CurrentSettingsResponse currentSettingsResponse) {
                CurrentSettingsResponse currentSettingsResponse2;
                SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> singleFieldBuilderV3 = this.currentSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(currentSettingsResponse);
                } else if ((this.bitField0_ & 128) == 0 || (currentSettingsResponse2 = this.currentSettingsResponse_) == null || currentSettingsResponse2 == CurrentSettingsResponse.getDefaultInstance()) {
                    this.currentSettingsResponse_ = currentSettingsResponse;
                } else {
                    getCurrentSettingsResponseBuilder().mergeFrom(currentSettingsResponse);
                }
                if (this.currentSettingsResponse_ != null) {
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
                                    codedInputStream.readMessage(getTrackingStateRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getTrackingStateResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getStartTrackingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getStartTrackingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getStopTrackingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getStopTrackingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getCurrentSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getCurrentSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getLegalUintListValuesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getLegalUintListValuesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getChangeUintListSettingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getChangeUintListSettingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getTrackingSubscribeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getTrackingSubscribeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getTrackingStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 130:
                                    codedInputStream.readMessage(getLegalValuesChangedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32768;
                                    continue;
                                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                    codedInputStream.readMessage(getTrackingSessionNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 65536;
                                    continue;
                                case 146:
                                    codedInputStream.readMessage(getTrackingPointNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLegalUintListValuesRequest(LegalUintListValuesRequest legalUintListValuesRequest) {
                LegalUintListValuesRequest legalUintListValuesRequest2;
                SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(legalUintListValuesRequest);
                } else if ((this.bitField0_ & 256) == 0 || (legalUintListValuesRequest2 = this.legalUintListValuesRequest_) == null || legalUintListValuesRequest2 == LegalUintListValuesRequest.getDefaultInstance()) {
                    this.legalUintListValuesRequest_ = legalUintListValuesRequest;
                } else {
                    getLegalUintListValuesRequestBuilder().mergeFrom(legalUintListValuesRequest);
                }
                if (this.legalUintListValuesRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLegalUintListValuesResponse(LegalUintListValuesResponse legalUintListValuesResponse) {
                LegalUintListValuesResponse legalUintListValuesResponse2;
                SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(legalUintListValuesResponse);
                } else if ((this.bitField0_ & 512) == 0 || (legalUintListValuesResponse2 = this.legalUintListValuesResponse_) == null || legalUintListValuesResponse2 == LegalUintListValuesResponse.getDefaultInstance()) {
                    this.legalUintListValuesResponse_ = legalUintListValuesResponse;
                } else {
                    getLegalUintListValuesResponseBuilder().mergeFrom(legalUintListValuesResponse);
                }
                if (this.legalUintListValuesResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLegalValuesChangedNotification(LegalValuesChangedNotification legalValuesChangedNotification) {
                LegalValuesChangedNotification legalValuesChangedNotification2;
                SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> singleFieldBuilderV3 = this.legalValuesChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(legalValuesChangedNotification);
                } else if ((this.bitField0_ & 32768) == 0 || (legalValuesChangedNotification2 = this.legalValuesChangedNotification_) == null || legalValuesChangedNotification2 == LegalValuesChangedNotification.getDefaultInstance()) {
                    this.legalValuesChangedNotification_ = legalValuesChangedNotification;
                } else {
                    getLegalValuesChangedNotificationBuilder().mergeFrom(legalValuesChangedNotification);
                }
                if (this.legalValuesChangedNotification_ != null) {
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartTrackingRequest(StartTrackingRequest startTrackingRequest) {
                StartTrackingRequest startTrackingRequest2;
                SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> singleFieldBuilderV3 = this.startTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startTrackingRequest);
                } else if ((this.bitField0_ & 4) == 0 || (startTrackingRequest2 = this.startTrackingRequest_) == null || startTrackingRequest2 == StartTrackingRequest.getDefaultInstance()) {
                    this.startTrackingRequest_ = startTrackingRequest;
                } else {
                    getStartTrackingRequestBuilder().mergeFrom(startTrackingRequest);
                }
                if (this.startTrackingRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartTrackingResponse(StartTrackingResponse startTrackingResponse) {
                StartTrackingResponse startTrackingResponse2;
                SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> singleFieldBuilderV3 = this.startTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startTrackingResponse);
                } else if ((this.bitField0_ & 8) == 0 || (startTrackingResponse2 = this.startTrackingResponse_) == null || startTrackingResponse2 == StartTrackingResponse.getDefaultInstance()) {
                    this.startTrackingResponse_ = startTrackingResponse;
                } else {
                    getStartTrackingResponseBuilder().mergeFrom(startTrackingResponse);
                }
                if (this.startTrackingResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStopTrackingRequest(StopTrackingRequest stopTrackingRequest) {
                StopTrackingRequest stopTrackingRequest2;
                SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> singleFieldBuilderV3 = this.stopTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopTrackingRequest);
                } else if ((this.bitField0_ & 16) == 0 || (stopTrackingRequest2 = this.stopTrackingRequest_) == null || stopTrackingRequest2 == StopTrackingRequest.getDefaultInstance()) {
                    this.stopTrackingRequest_ = stopTrackingRequest;
                } else {
                    getStopTrackingRequestBuilder().mergeFrom(stopTrackingRequest);
                }
                if (this.stopTrackingRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStopTrackingResponse(StopTrackingResponse stopTrackingResponse) {
                StopTrackingResponse stopTrackingResponse2;
                SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> singleFieldBuilderV3 = this.stopTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopTrackingResponse);
                } else if ((this.bitField0_ & 32) == 0 || (stopTrackingResponse2 = this.stopTrackingResponse_) == null || stopTrackingResponse2 == StopTrackingResponse.getDefaultInstance()) {
                    this.stopTrackingResponse_ = stopTrackingResponse;
                } else {
                    getStopTrackingResponseBuilder().mergeFrom(stopTrackingResponse);
                }
                if (this.stopTrackingResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackingPointNotification(TrackingPointNotification trackingPointNotification) {
                TrackingPointNotification trackingPointNotification2;
                SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> singleFieldBuilderV3 = this.trackingPointNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingPointNotification);
                } else if ((this.bitField0_ & 131072) == 0 || (trackingPointNotification2 = this.trackingPointNotification_) == null || trackingPointNotification2 == TrackingPointNotification.getDefaultInstance()) {
                    this.trackingPointNotification_ = trackingPointNotification;
                } else {
                    getTrackingPointNotificationBuilder().mergeFrom(trackingPointNotification);
                }
                if (this.trackingPointNotification_ != null) {
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackingSessionNotification(TrackingSessionNotification trackingSessionNotification) {
                TrackingSessionNotification trackingSessionNotification2;
                SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> singleFieldBuilderV3 = this.trackingSessionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingSessionNotification);
                } else if ((this.bitField0_ & 65536) == 0 || (trackingSessionNotification2 = this.trackingSessionNotification_) == null || trackingSessionNotification2 == TrackingSessionNotification.getDefaultInstance()) {
                    this.trackingSessionNotification_ = trackingSessionNotification;
                } else {
                    getTrackingSessionNotificationBuilder().mergeFrom(trackingSessionNotification);
                }
                if (this.trackingSessionNotification_ != null) {
                    this.bitField0_ |= 65536;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackingStateRequest(TrackingStateRequest trackingStateRequest) {
                TrackingStateRequest trackingStateRequest2;
                SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> singleFieldBuilderV3 = this.trackingStateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingStateRequest);
                } else if ((this.bitField0_ & 1) == 0 || (trackingStateRequest2 = this.trackingStateRequest_) == null || trackingStateRequest2 == TrackingStateRequest.getDefaultInstance()) {
                    this.trackingStateRequest_ = trackingStateRequest;
                } else {
                    getTrackingStateRequestBuilder().mergeFrom(trackingStateRequest);
                }
                if (this.trackingStateRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackingStateResponse(TrackingStateResponse trackingStateResponse) {
                TrackingStateResponse trackingStateResponse2;
                SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> singleFieldBuilderV3 = this.trackingStateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingStateResponse);
                } else if ((this.bitField0_ & 2) == 0 || (trackingStateResponse2 = this.trackingStateResponse_) == null || trackingStateResponse2 == TrackingStateResponse.getDefaultInstance()) {
                    this.trackingStateResponse_ = trackingStateResponse;
                } else {
                    getTrackingStateResponseBuilder().mergeFrom(trackingStateResponse);
                }
                if (this.trackingStateResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackingStatusNotification(TrackingStatusNotification trackingStatusNotification) {
                TrackingStatusNotification trackingStatusNotification2;
                SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.trackingStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingStatusNotification);
                } else if ((this.bitField0_ & 16384) == 0 || (trackingStatusNotification2 = this.trackingStatusNotification_) == null || trackingStatusNotification2 == TrackingStatusNotification.getDefaultInstance()) {
                    this.trackingStatusNotification_ = trackingStatusNotification;
                } else {
                    getTrackingStatusNotificationBuilder().mergeFrom(trackingStatusNotification);
                }
                if (this.trackingStatusNotification_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackingSubscribeRequest(TrackingSubscribeRequest trackingSubscribeRequest) {
                TrackingSubscribeRequest trackingSubscribeRequest2;
                SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingSubscribeRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (trackingSubscribeRequest2 = this.trackingSubscribeRequest_) == null || trackingSubscribeRequest2 == TrackingSubscribeRequest.getDefaultInstance()) {
                    this.trackingSubscribeRequest_ = trackingSubscribeRequest;
                } else {
                    getTrackingSubscribeRequestBuilder().mergeFrom(trackingSubscribeRequest);
                }
                if (this.trackingSubscribeRequest_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrackingSubscribeResponse(TrackingSubscribeResponse trackingSubscribeResponse) {
                TrackingSubscribeResponse trackingSubscribeResponse2;
                SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingSubscribeResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (trackingSubscribeResponse2 = this.trackingSubscribeResponse_) == null || trackingSubscribeResponse2 == TrackingSubscribeResponse.getDefaultInstance()) {
                    this.trackingSubscribeResponse_ = trackingSubscribeResponse;
                } else {
                    getTrackingSubscribeResponseBuilder().mergeFrom(trackingSubscribeResponse);
                }
                if (this.trackingSubscribeResponse_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setChangeUintListSettingRequest(ChangeUintListSettingRequest.Builder builder) {
                SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.changeUintListSettingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setChangeUintListSettingResponse(ChangeUintListSettingResponse.Builder builder) {
                SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.changeUintListSettingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setCurrentSettingsRequest(CurrentSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> singleFieldBuilderV3 = this.currentSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.currentSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCurrentSettingsResponse(CurrentSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> singleFieldBuilderV3 = this.currentSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.currentSettingsResponse_ = builder.build();
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

            public Builder setLegalUintListValuesRequest(LegalUintListValuesRequest.Builder builder) {
                SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.legalUintListValuesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setLegalUintListValuesResponse(LegalUintListValuesResponse.Builder builder) {
                SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.legalUintListValuesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setLegalValuesChangedNotification(LegalValuesChangedNotification.Builder builder) {
                SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> singleFieldBuilderV3 = this.legalValuesChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.legalValuesChangedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStartTrackingRequest(StartTrackingRequest.Builder builder) {
                SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> singleFieldBuilderV3 = this.startTrackingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startTrackingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStartTrackingResponse(StartTrackingResponse.Builder builder) {
                SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> singleFieldBuilderV3 = this.startTrackingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startTrackingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStopTrackingRequest(StopTrackingRequest.Builder builder) {
                SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> singleFieldBuilderV3 = this.stopTrackingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stopTrackingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStopTrackingResponse(StopTrackingResponse.Builder builder) {
                SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> singleFieldBuilderV3 = this.stopTrackingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stopTrackingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setTrackingPointNotification(TrackingPointNotification.Builder builder) {
                SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> singleFieldBuilderV3 = this.trackingPointNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackingPointNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setTrackingSessionNotification(TrackingSessionNotification.Builder builder) {
                SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> singleFieldBuilderV3 = this.trackingSessionNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackingSessionNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setTrackingStateRequest(TrackingStateRequest.Builder builder) {
                SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> singleFieldBuilderV3 = this.trackingStateRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackingStateRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackingStateResponse(TrackingStateResponse.Builder builder) {
                SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> singleFieldBuilderV3 = this.trackingStateResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackingStateResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTrackingStatusNotification(TrackingStatusNotification.Builder builder) {
                SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.trackingStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackingStatusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setTrackingSubscribeRequest(TrackingSubscribeRequest.Builder builder) {
                SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackingSubscribeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setTrackingSubscribeResponse(TrackingSubscribeResponse.Builder builder) {
                SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackingSubscribeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InReachTrackingService getDefaultInstanceForType() {
                return InReachTrackingService.getDefaultInstance();
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

            public Builder setChangeUintListSettingRequest(ChangeUintListSettingRequest changeUintListSettingRequest) {
                SingleFieldBuilderV3<ChangeUintListSettingRequest, ChangeUintListSettingRequest.Builder, ChangeUintListSettingRequestOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    changeUintListSettingRequest.getClass();
                    this.changeUintListSettingRequest_ = changeUintListSettingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(changeUintListSettingRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setChangeUintListSettingResponse(ChangeUintListSettingResponse changeUintListSettingResponse) {
                SingleFieldBuilderV3<ChangeUintListSettingResponse, ChangeUintListSettingResponse.Builder, ChangeUintListSettingResponseOrBuilder> singleFieldBuilderV3 = this.changeUintListSettingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    changeUintListSettingResponse.getClass();
                    this.changeUintListSettingResponse_ = changeUintListSettingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(changeUintListSettingResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setCurrentSettingsRequest(CurrentSettingsRequest currentSettingsRequest) {
                SingleFieldBuilderV3<CurrentSettingsRequest, CurrentSettingsRequest.Builder, CurrentSettingsRequestOrBuilder> singleFieldBuilderV3 = this.currentSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    currentSettingsRequest.getClass();
                    this.currentSettingsRequest_ = currentSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(currentSettingsRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCurrentSettingsResponse(CurrentSettingsResponse currentSettingsResponse) {
                SingleFieldBuilderV3<CurrentSettingsResponse, CurrentSettingsResponse.Builder, CurrentSettingsResponseOrBuilder> singleFieldBuilderV3 = this.currentSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    currentSettingsResponse.getClass();
                    this.currentSettingsResponse_ = currentSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(currentSettingsResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setLegalUintListValuesRequest(LegalUintListValuesRequest legalUintListValuesRequest) {
                SingleFieldBuilderV3<LegalUintListValuesRequest, LegalUintListValuesRequest.Builder, LegalUintListValuesRequestOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    legalUintListValuesRequest.getClass();
                    this.legalUintListValuesRequest_ = legalUintListValuesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(legalUintListValuesRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setLegalUintListValuesResponse(LegalUintListValuesResponse legalUintListValuesResponse) {
                SingleFieldBuilderV3<LegalUintListValuesResponse, LegalUintListValuesResponse.Builder, LegalUintListValuesResponseOrBuilder> singleFieldBuilderV3 = this.legalUintListValuesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    legalUintListValuesResponse.getClass();
                    this.legalUintListValuesResponse_ = legalUintListValuesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(legalUintListValuesResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setStartTrackingRequest(StartTrackingRequest startTrackingRequest) {
                SingleFieldBuilderV3<StartTrackingRequest, StartTrackingRequest.Builder, StartTrackingRequestOrBuilder> singleFieldBuilderV3 = this.startTrackingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startTrackingRequest.getClass();
                    this.startTrackingRequest_ = startTrackingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(startTrackingRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStartTrackingResponse(StartTrackingResponse startTrackingResponse) {
                SingleFieldBuilderV3<StartTrackingResponse, StartTrackingResponse.Builder, StartTrackingResponseOrBuilder> singleFieldBuilderV3 = this.startTrackingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startTrackingResponse.getClass();
                    this.startTrackingResponse_ = startTrackingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(startTrackingResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStopTrackingRequest(StopTrackingRequest stopTrackingRequest) {
                SingleFieldBuilderV3<StopTrackingRequest, StopTrackingRequest.Builder, StopTrackingRequestOrBuilder> singleFieldBuilderV3 = this.stopTrackingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopTrackingRequest.getClass();
                    this.stopTrackingRequest_ = stopTrackingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(stopTrackingRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStopTrackingResponse(StopTrackingResponse stopTrackingResponse) {
                SingleFieldBuilderV3<StopTrackingResponse, StopTrackingResponse.Builder, StopTrackingResponseOrBuilder> singleFieldBuilderV3 = this.stopTrackingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopTrackingResponse.getClass();
                    this.stopTrackingResponse_ = stopTrackingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(stopTrackingResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setTrackingStateRequest(TrackingStateRequest trackingStateRequest) {
                SingleFieldBuilderV3<TrackingStateRequest, TrackingStateRequest.Builder, TrackingStateRequestOrBuilder> singleFieldBuilderV3 = this.trackingStateRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingStateRequest.getClass();
                    this.trackingStateRequest_ = trackingStateRequest;
                } else {
                    singleFieldBuilderV3.setMessage(trackingStateRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackingStateResponse(TrackingStateResponse trackingStateResponse) {
                SingleFieldBuilderV3<TrackingStateResponse, TrackingStateResponse.Builder, TrackingStateResponseOrBuilder> singleFieldBuilderV3 = this.trackingStateResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingStateResponse.getClass();
                    this.trackingStateResponse_ = trackingStateResponse;
                } else {
                    singleFieldBuilderV3.setMessage(trackingStateResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTrackingStatusNotification(TrackingStatusNotification trackingStatusNotification) {
                SingleFieldBuilderV3<TrackingStatusNotification, TrackingStatusNotification.Builder, TrackingStatusNotificationOrBuilder> singleFieldBuilderV3 = this.trackingStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingStatusNotification.getClass();
                    this.trackingStatusNotification_ = trackingStatusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(trackingStatusNotification);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setTrackingSubscribeRequest(TrackingSubscribeRequest trackingSubscribeRequest) {
                SingleFieldBuilderV3<TrackingSubscribeRequest, TrackingSubscribeRequest.Builder, TrackingSubscribeRequestOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingSubscribeRequest.getClass();
                    this.trackingSubscribeRequest_ = trackingSubscribeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(trackingSubscribeRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setTrackingSubscribeResponse(TrackingSubscribeResponse trackingSubscribeResponse) {
                SingleFieldBuilderV3<TrackingSubscribeResponse, TrackingSubscribeResponse.Builder, TrackingSubscribeResponseOrBuilder> singleFieldBuilderV3 = this.trackingSubscribeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingSubscribeResponse.getClass();
                    this.trackingSubscribeResponse_ = trackingSubscribeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(trackingSubscribeResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setTrackingPointNotification(TrackingPointNotification trackingPointNotification) {
                SingleFieldBuilderV3<TrackingPointNotification, TrackingPointNotification.Builder, TrackingPointNotificationOrBuilder> singleFieldBuilderV3 = this.trackingPointNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingPointNotification.getClass();
                    this.trackingPointNotification_ = trackingPointNotification;
                } else {
                    singleFieldBuilderV3.setMessage(trackingPointNotification);
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setTrackingSessionNotification(TrackingSessionNotification trackingSessionNotification) {
                SingleFieldBuilderV3<TrackingSessionNotification, TrackingSessionNotification.Builder, TrackingSessionNotificationOrBuilder> singleFieldBuilderV3 = this.trackingSessionNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingSessionNotification.getClass();
                    this.trackingSessionNotification_ = trackingSessionNotification;
                } else {
                    singleFieldBuilderV3.setMessage(trackingSessionNotification);
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setLegalValuesChangedNotification(LegalValuesChangedNotification legalValuesChangedNotification) {
                SingleFieldBuilderV3<LegalValuesChangedNotification, LegalValuesChangedNotification.Builder, LegalValuesChangedNotificationOrBuilder> singleFieldBuilderV3 = this.legalValuesChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    legalValuesChangedNotification.getClass();
                    this.legalValuesChangedNotification_ = legalValuesChangedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(legalValuesChangedNotification);
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InReachTrackingService) {
                    return mergeFrom((InReachTrackingService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InReachTrackingService inReachTrackingService) {
                if (inReachTrackingService == InReachTrackingService.getDefaultInstance()) {
                    return this;
                }
                if (inReachTrackingService.hasTrackingStateRequest()) {
                    mergeTrackingStateRequest(inReachTrackingService.getTrackingStateRequest());
                }
                if (inReachTrackingService.hasTrackingStateResponse()) {
                    mergeTrackingStateResponse(inReachTrackingService.getTrackingStateResponse());
                }
                if (inReachTrackingService.hasStartTrackingRequest()) {
                    mergeStartTrackingRequest(inReachTrackingService.getStartTrackingRequest());
                }
                if (inReachTrackingService.hasStartTrackingResponse()) {
                    mergeStartTrackingResponse(inReachTrackingService.getStartTrackingResponse());
                }
                if (inReachTrackingService.hasStopTrackingRequest()) {
                    mergeStopTrackingRequest(inReachTrackingService.getStopTrackingRequest());
                }
                if (inReachTrackingService.hasStopTrackingResponse()) {
                    mergeStopTrackingResponse(inReachTrackingService.getStopTrackingResponse());
                }
                if (inReachTrackingService.hasCurrentSettingsRequest()) {
                    mergeCurrentSettingsRequest(inReachTrackingService.getCurrentSettingsRequest());
                }
                if (inReachTrackingService.hasCurrentSettingsResponse()) {
                    mergeCurrentSettingsResponse(inReachTrackingService.getCurrentSettingsResponse());
                }
                if (inReachTrackingService.hasLegalUintListValuesRequest()) {
                    mergeLegalUintListValuesRequest(inReachTrackingService.getLegalUintListValuesRequest());
                }
                if (inReachTrackingService.hasLegalUintListValuesResponse()) {
                    mergeLegalUintListValuesResponse(inReachTrackingService.getLegalUintListValuesResponse());
                }
                if (inReachTrackingService.hasChangeUintListSettingRequest()) {
                    mergeChangeUintListSettingRequest(inReachTrackingService.getChangeUintListSettingRequest());
                }
                if (inReachTrackingService.hasChangeUintListSettingResponse()) {
                    mergeChangeUintListSettingResponse(inReachTrackingService.getChangeUintListSettingResponse());
                }
                if (inReachTrackingService.hasTrackingSubscribeRequest()) {
                    mergeTrackingSubscribeRequest(inReachTrackingService.getTrackingSubscribeRequest());
                }
                if (inReachTrackingService.hasTrackingSubscribeResponse()) {
                    mergeTrackingSubscribeResponse(inReachTrackingService.getTrackingSubscribeResponse());
                }
                if (inReachTrackingService.hasTrackingStatusNotification()) {
                    mergeTrackingStatusNotification(inReachTrackingService.getTrackingStatusNotification());
                }
                if (inReachTrackingService.hasLegalValuesChangedNotification()) {
                    mergeLegalValuesChangedNotification(inReachTrackingService.getLegalValuesChangedNotification());
                }
                if (inReachTrackingService.hasTrackingSessionNotification()) {
                    mergeTrackingSessionNotification(inReachTrackingService.getTrackingSessionNotification());
                }
                if (inReachTrackingService.hasTrackingPointNotification()) {
                    mergeTrackingPointNotification(inReachTrackingService.getTrackingPointNotification());
                }
                mergeUnknownFields(inReachTrackingService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InReachTrackingService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InReachTrackingService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InReachTrackingService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InReachTrackingService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachTrackingService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InReachTrackingService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InReachTrackingService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InReachTrackingService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InReachTrackingService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InReachTrackingService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InReachTrackingService parseFrom(InputStream inputStream) {
            return (InReachTrackingService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InReachTrackingService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachTrackingService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InReachTrackingService parseFrom(CodedInputStream codedInputStream) {
            return (InReachTrackingService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InReachTrackingService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachTrackingService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LegalUintListValuesRequest extends GeneratedMessageV3 implements LegalUintListValuesRequestOrBuilder {
        private static final LegalUintListValuesRequest DEFAULT_INSTANCE = new LegalUintListValuesRequest();

        @Deprecated
        public static final Parser<LegalUintListValuesRequest> PARSER = new AbstractParser<LegalUintListValuesRequest>() { // from class: com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesRequest.1
            @Override // com.google.protobuf.Parser
            public LegalUintListValuesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LegalUintListValuesRequest.newBuilder();
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
        public static final int SETTING_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int setting_;

        private LegalUintListValuesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.setting_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LegalUintListValuesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_descriptor;
        }

        public static Builder newBuilder(LegalUintListValuesRequest legalUintListValuesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(legalUintListValuesRequest);
        }

        public static LegalUintListValuesRequest parseDelimitedFrom(InputStream inputStream) {
            return (LegalUintListValuesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LegalUintListValuesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LegalUintListValuesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LegalUintListValuesRequest)) {
                return super.equals(obj);
            }
            LegalUintListValuesRequest legalUintListValuesRequest = (LegalUintListValuesRequest) obj;
            if (hasSetting() != legalUintListValuesRequest.hasSetting()) {
                return false;
            }
            return (!hasSetting() || this.setting_ == legalUintListValuesRequest.setting_) && getUnknownFields().equals(legalUintListValuesRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LegalUintListValuesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.setting_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesRequestOrBuilder
        public UintListSetting getSetting() {
            UintListSetting uintListSettingForNumber = UintListSetting.forNumber(this.setting_);
            return uintListSettingForNumber == null ? UintListSetting.MOVING_INTERVAL : uintListSettingForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesRequestOrBuilder
        public boolean hasSetting() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSetting()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.setting_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LegalUintListValuesRequest.class, Builder.class);
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
            if (hasSetting()) {
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
            return new LegalUintListValuesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.setting_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LegalUintListValuesRequestOrBuilder {
            private int bitField0_;
            private int setting_;

            private Builder() {
                this.setting_ = 1;
            }

            private void buildPartial0(LegalUintListValuesRequest legalUintListValuesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    legalUintListValuesRequest.setting_ = this.setting_;
                } else {
                    i14 = 0;
                }
                legalUintListValuesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LegalUintListValuesRequest build() {
                LegalUintListValuesRequest legalUintListValuesRequestBuildPartial = buildPartial();
                if (legalUintListValuesRequestBuildPartial.isInitialized()) {
                    return legalUintListValuesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) legalUintListValuesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LegalUintListValuesRequest buildPartial() {
                LegalUintListValuesRequest legalUintListValuesRequest = new LegalUintListValuesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(legalUintListValuesRequest);
                }
                onBuilt();
                return legalUintListValuesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.setting_ = 1;
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

            public Builder clearSetting() {
                this.bitField0_ &= -2;
                this.setting_ = 1;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesRequestOrBuilder
            public UintListSetting getSetting() {
                UintListSetting uintListSettingForNumber = UintListSetting.forNumber(this.setting_);
                return uintListSettingForNumber == null ? UintListSetting.MOVING_INTERVAL : uintListSettingForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesRequestOrBuilder
            public boolean hasSetting() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LegalUintListValuesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSetting();
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
                                    if (UintListSetting.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.setting_ = i14;
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

            public Builder setSetting(UintListSetting uintListSetting) {
                uintListSetting.getClass();
                this.bitField0_ |= 1;
                this.setting_ = uintListSetting.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LegalUintListValuesRequest getDefaultInstanceForType() {
                return LegalUintListValuesRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.setting_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LegalUintListValuesRequest) {
                    return mergeFrom((LegalUintListValuesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LegalUintListValuesRequest legalUintListValuesRequest) {
                if (legalUintListValuesRequest == LegalUintListValuesRequest.getDefaultInstance()) {
                    return this;
                }
                if (legalUintListValuesRequest.hasSetting()) {
                    setSetting(legalUintListValuesRequest.getSetting());
                }
                mergeUnknownFields(legalUintListValuesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LegalUintListValuesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LegalUintListValuesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalUintListValuesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LegalUintListValuesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LegalUintListValuesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LegalUintListValuesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LegalUintListValuesRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.setting_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LegalUintListValuesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LegalUintListValuesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LegalUintListValuesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LegalUintListValuesRequest parseFrom(InputStream inputStream) {
            return (LegalUintListValuesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LegalUintListValuesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalUintListValuesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LegalUintListValuesRequest parseFrom(CodedInputStream codedInputStream) {
            return (LegalUintListValuesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LegalUintListValuesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalUintListValuesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LegalUintListValuesResponse extends GeneratedMessageV3 implements LegalUintListValuesResponseOrBuilder {
        public static final int LEGAL_SPECIAL_VALUES_FIELD_NUMBER = 4;
        public static final int LEGAL_VALUES_FIELD_NUMBER = 3;
        public static final int SETTING_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<Integer> legalSpecialValues_;
        private Internal.IntList legalValues_;
        private byte memoizedIsInitialized;
        private int setting_;
        private int status_;
        private static final Internal.ListAdapter.Converter<Integer, UintListSettingSpecialValue> legalSpecialValues_converter_ = new Internal.ListAdapter.Converter<Integer, UintListSettingSpecialValue>() { // from class: com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public UintListSettingSpecialValue convert(Integer num) {
                UintListSettingSpecialValue uintListSettingSpecialValueForNumber = UintListSettingSpecialValue.forNumber(num.intValue());
                return uintListSettingSpecialValueForNumber == null ? UintListSettingSpecialValue.MOVING_INTERVAL_OFF : uintListSettingSpecialValueForNumber;
            }
        };
        private static final LegalUintListValuesResponse DEFAULT_INSTANCE = new LegalUintListValuesResponse();

        @Deprecated
        public static final Parser<LegalUintListValuesResponse> PARSER = new AbstractParser<LegalUintListValuesResponse>() { // from class: com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponse.2
            @Override // com.google.protobuf.Parser
            public LegalUintListValuesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LegalUintListValuesResponse.newBuilder();
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

        private LegalUintListValuesResponse() {
            this.status_ = 0;
            this.setting_ = 1;
            this.legalValues_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.setting_ = 1;
            this.legalValues_ = GeneratedMessageV3.emptyIntList();
            this.legalSpecialValues_ = Collections.EMPTY_LIST;
        }

        public static LegalUintListValuesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_descriptor;
        }

        public static Builder newBuilder(LegalUintListValuesResponse legalUintListValuesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(legalUintListValuesResponse);
        }

        public static LegalUintListValuesResponse parseDelimitedFrom(InputStream inputStream) {
            return (LegalUintListValuesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LegalUintListValuesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LegalUintListValuesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LegalUintListValuesResponse)) {
                return super.equals(obj);
            }
            LegalUintListValuesResponse legalUintListValuesResponse = (LegalUintListValuesResponse) obj;
            if (hasStatus() != legalUintListValuesResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == legalUintListValuesResponse.status_) && hasSetting() == legalUintListValuesResponse.hasSetting()) {
                return (!hasSetting() || this.setting_ == legalUintListValuesResponse.setting_) && getLegalValuesList().equals(legalUintListValuesResponse.getLegalValuesList()) && this.legalSpecialValues_.equals(legalUintListValuesResponse.legalSpecialValues_) && getUnknownFields().equals(legalUintListValuesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public UintListSettingSpecialValue getLegalSpecialValues(int i14) {
            return legalSpecialValues_converter_.convert(this.legalSpecialValues_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public int getLegalSpecialValuesCount() {
            return this.legalSpecialValues_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public List<UintListSettingSpecialValue> getLegalSpecialValuesList() {
            return new Internal.ListAdapter(this.legalSpecialValues_, legalSpecialValues_converter_);
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public int getLegalValues(int i14) {
            return this.legalValues_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public int getLegalValuesCount() {
            return this.legalValues_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public List<Integer> getLegalValuesList() {
            return this.legalValues_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LegalUintListValuesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.setting_);
            }
            int iB = 0;
            for (int i16 = 0; i16 < this.legalValues_.size(); i16++) {
                iB = f3.b(this.legalValues_, i16, iB);
            }
            int size = getLegalValuesList().size() + iComputeEnumSize + iB;
            int iA = 0;
            while (true) {
                int size2 = this.legalSpecialValues_.size();
                List<Integer> list = this.legalSpecialValues_;
                if (i15 >= size2) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + size + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public UintListSetting getSetting() {
            UintListSetting uintListSettingForNumber = UintListSetting.forNumber(this.setting_);
            return uintListSettingForNumber == null ? UintListSetting.MOVING_INTERVAL : uintListSettingForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public SettingError getStatus() {
            SettingError settingErrorForNumber = SettingError.forNumber(this.status_);
            return settingErrorForNumber == null ? SettingError.SETTING_ERROR_UNKNOWN : settingErrorForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
        public boolean hasSetting() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
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
            if (hasSetting()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.setting_;
            }
            if (getLegalValuesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLegalValuesList().hashCode();
            }
            if (getLegalSpecialValuesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.legalSpecialValues_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LegalUintListValuesResponse.class, Builder.class);
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
            return new LegalUintListValuesResponse();
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
                codedOutputStream.writeEnum(2, this.setting_);
            }
            int iF = 0;
            int iC = 0;
            while (iC < this.legalValues_.size()) {
                iC = f3.c(this.legalValues_, iC, codedOutputStream, 3, iC, 1);
            }
            while (iF < this.legalSpecialValues_.size()) {
                iF = f3.f(this.legalSpecialValues_.get(iF), codedOutputStream, 4, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LegalUintListValuesResponseOrBuilder {
            private int bitField0_;
            private List<Integer> legalSpecialValues_;
            private Internal.IntList legalValues_;
            private int setting_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.setting_ = 1;
                this.legalValues_ = GeneratedMessageV3.emptyIntList();
                this.legalSpecialValues_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(LegalUintListValuesResponse legalUintListValuesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    legalUintListValuesResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    legalUintListValuesResponse.setting_ = this.setting_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    this.legalValues_.makeImmutable();
                    legalUintListValuesResponse.legalValues_ = this.legalValues_;
                }
                legalUintListValuesResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(LegalUintListValuesResponse legalUintListValuesResponse) {
                if ((this.bitField0_ & 8) != 0) {
                    this.legalSpecialValues_ = Collections.unmodifiableList(this.legalSpecialValues_);
                    this.bitField0_ &= -9;
                }
                legalUintListValuesResponse.legalSpecialValues_ = this.legalSpecialValues_;
            }

            private void ensureLegalSpecialValuesIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.legalSpecialValues_ = new ArrayList(this.legalSpecialValues_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureLegalValuesIsMutable() {
                if (!this.legalValues_.isModifiable()) {
                    this.legalValues_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.legalValues_);
                }
                this.bitField0_ |= 4;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_descriptor;
            }

            public Builder addAllLegalSpecialValues(Iterable<? extends UintListSettingSpecialValue> iterable) {
                ensureLegalSpecialValuesIsMutable();
                Iterator<? extends UintListSettingSpecialValue> it = iterable.iterator();
                while (it.hasNext()) {
                    this.legalSpecialValues_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllLegalValues(Iterable<? extends Integer> iterable) {
                ensureLegalValuesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.legalValues_);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder addLegalSpecialValues(UintListSettingSpecialValue uintListSettingSpecialValue) {
                uintListSettingSpecialValue.getClass();
                ensureLegalSpecialValuesIsMutable();
                this.legalSpecialValues_.add(Integer.valueOf(uintListSettingSpecialValue.getNumber()));
                onChanged();
                return this;
            }

            public Builder addLegalValues(int i14) {
                ensureLegalValuesIsMutable();
                this.legalValues_.addInt(i14);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LegalUintListValuesResponse build() {
                LegalUintListValuesResponse legalUintListValuesResponseBuildPartial = buildPartial();
                if (legalUintListValuesResponseBuildPartial.isInitialized()) {
                    return legalUintListValuesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) legalUintListValuesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LegalUintListValuesResponse buildPartial() {
                LegalUintListValuesResponse legalUintListValuesResponse = new LegalUintListValuesResponse(this);
                buildPartialRepeatedFields(legalUintListValuesResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(legalUintListValuesResponse);
                }
                onBuilt();
                return legalUintListValuesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.setting_ = 1;
                this.legalValues_ = GeneratedMessageV3.emptyIntList();
                this.legalSpecialValues_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLegalSpecialValues() {
                this.legalSpecialValues_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearLegalValues() {
                this.legalValues_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSetting() {
                this.bitField0_ &= -3;
                this.setting_ = 1;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public UintListSettingSpecialValue getLegalSpecialValues(int i14) {
                return (UintListSettingSpecialValue) LegalUintListValuesResponse.legalSpecialValues_converter_.convert(this.legalSpecialValues_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public int getLegalSpecialValuesCount() {
                return this.legalSpecialValues_.size();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public List<UintListSettingSpecialValue> getLegalSpecialValuesList() {
                return new Internal.ListAdapter(this.legalSpecialValues_, LegalUintListValuesResponse.legalSpecialValues_converter_);
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public int getLegalValues(int i14) {
                return this.legalValues_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public int getLegalValuesCount() {
                return this.legalValues_.size();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public List<Integer> getLegalValuesList() {
                this.legalValues_.makeImmutable();
                return this.legalValues_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public UintListSetting getSetting() {
                UintListSetting uintListSettingForNumber = UintListSetting.forNumber(this.setting_);
                return uintListSettingForNumber == null ? UintListSetting.MOVING_INTERVAL : uintListSettingForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public SettingError getStatus() {
                SettingError settingErrorForNumber = SettingError.forNumber(this.status_);
                return settingErrorForNumber == null ? SettingError.SETTING_ERROR_UNKNOWN : settingErrorForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public boolean hasSetting() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalUintListValuesResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalUintListValuesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LegalUintListValuesResponse.class, Builder.class);
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
                                    if (SettingError.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (UintListSetting.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.setting_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureLegalValuesIsMutable();
                                    this.legalValues_.addInt(uInt32);
                                } else if (tag == 26) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureLegalValuesIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.legalValues_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 32) {
                                    int i16 = codedInputStream.readEnum();
                                    if (UintListSettingSpecialValue.forNumber(i16) == null) {
                                        mergeUnknownVarintField(4, i16);
                                    } else {
                                        ensureLegalSpecialValuesIsMutable();
                                        this.legalSpecialValues_.add(Integer.valueOf(i16));
                                    }
                                } else if (tag == 34) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i17 = codedInputStream.readEnum();
                                        if (UintListSettingSpecialValue.forNumber(i17) == null) {
                                            mergeUnknownVarintField(4, i17);
                                        } else {
                                            ensureLegalSpecialValuesIsMutable();
                                            this.legalSpecialValues_.add(Integer.valueOf(i17));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
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

            public Builder setLegalSpecialValues(int i14, UintListSettingSpecialValue uintListSettingSpecialValue) {
                uintListSettingSpecialValue.getClass();
                ensureLegalSpecialValuesIsMutable();
                this.legalSpecialValues_.set(i14, Integer.valueOf(uintListSettingSpecialValue.getNumber()));
                onChanged();
                return this;
            }

            public Builder setLegalValues(int i14, int i15) {
                ensureLegalValuesIsMutable();
                this.legalValues_.setInt(i14, i15);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSetting(UintListSetting uintListSetting) {
                uintListSetting.getClass();
                this.bitField0_ |= 2;
                this.setting_ = uintListSetting.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatus(SettingError settingError) {
                settingError.getClass();
                this.bitField0_ |= 1;
                this.status_ = settingError.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LegalUintListValuesResponse getDefaultInstanceForType() {
                return LegalUintListValuesResponse.getDefaultInstance();
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
                this.setting_ = 1;
                this.legalValues_ = GeneratedMessageV3.emptyIntList();
                this.legalSpecialValues_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LegalUintListValuesResponse) {
                    return mergeFrom((LegalUintListValuesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LegalUintListValuesResponse legalUintListValuesResponse) {
                if (legalUintListValuesResponse == LegalUintListValuesResponse.getDefaultInstance()) {
                    return this;
                }
                if (legalUintListValuesResponse.hasStatus()) {
                    setStatus(legalUintListValuesResponse.getStatus());
                }
                if (legalUintListValuesResponse.hasSetting()) {
                    setSetting(legalUintListValuesResponse.getSetting());
                }
                if (!legalUintListValuesResponse.legalValues_.isEmpty()) {
                    if (this.legalValues_.isEmpty()) {
                        Internal.IntList intList = legalUintListValuesResponse.legalValues_;
                        this.legalValues_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 4;
                    } else {
                        ensureLegalValuesIsMutable();
                        this.legalValues_.addAll(legalUintListValuesResponse.legalValues_);
                    }
                    onChanged();
                }
                if (!legalUintListValuesResponse.legalSpecialValues_.isEmpty()) {
                    if (this.legalSpecialValues_.isEmpty()) {
                        this.legalSpecialValues_ = legalUintListValuesResponse.legalSpecialValues_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureLegalSpecialValuesIsMutable();
                        this.legalSpecialValues_.addAll(legalUintListValuesResponse.legalSpecialValues_);
                    }
                    onChanged();
                }
                mergeUnknownFields(legalUintListValuesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LegalUintListValuesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LegalUintListValuesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalUintListValuesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LegalUintListValuesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LegalUintListValuesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LegalUintListValuesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LegalUintListValuesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LegalUintListValuesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LegalUintListValuesResponse parseFrom(InputStream inputStream) {
            return (LegalUintListValuesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LegalUintListValuesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalUintListValuesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LegalUintListValuesResponse parseFrom(CodedInputStream codedInputStream) {
            return (LegalUintListValuesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LegalUintListValuesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalUintListValuesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private LegalUintListValuesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.setting_ = 1;
            this.legalValues_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ LegalUintListValuesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LegalValuesChangedNotification extends GeneratedMessageV3 implements LegalValuesChangedNotificationOrBuilder {
        public static final int CHANGED_UINT_LISTS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Integer> changedUintLists_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, UintListSetting> changedUintLists_converter_ = new Internal.ListAdapter.Converter<Integer, UintListSetting>() { // from class: com.garmin.proto.generated.GDIInReachTracking.LegalValuesChangedNotification.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public UintListSetting convert(Integer num) {
                UintListSetting uintListSettingForNumber = UintListSetting.forNumber(num.intValue());
                return uintListSettingForNumber == null ? UintListSetting.MOVING_INTERVAL : uintListSettingForNumber;
            }
        };
        private static final LegalValuesChangedNotification DEFAULT_INSTANCE = new LegalValuesChangedNotification();

        @Deprecated
        public static final Parser<LegalValuesChangedNotification> PARSER = new AbstractParser<LegalValuesChangedNotification>() { // from class: com.garmin.proto.generated.GDIInReachTracking.LegalValuesChangedNotification.2
            @Override // com.google.protobuf.Parser
            public LegalValuesChangedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LegalValuesChangedNotification.newBuilder();
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

        private LegalValuesChangedNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.changedUintLists_ = Collections.EMPTY_LIST;
        }

        public static LegalValuesChangedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_descriptor;
        }

        public static Builder newBuilder(LegalValuesChangedNotification legalValuesChangedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(legalValuesChangedNotification);
        }

        public static LegalValuesChangedNotification parseDelimitedFrom(InputStream inputStream) {
            return (LegalValuesChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LegalValuesChangedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LegalValuesChangedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LegalValuesChangedNotification)) {
                return super.equals(obj);
            }
            LegalValuesChangedNotification legalValuesChangedNotification = (LegalValuesChangedNotification) obj;
            return this.changedUintLists_.equals(legalValuesChangedNotification.changedUintLists_) && getUnknownFields().equals(legalValuesChangedNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalValuesChangedNotificationOrBuilder
        public UintListSetting getChangedUintLists(int i14) {
            return changedUintLists_converter_.convert(this.changedUintLists_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalValuesChangedNotificationOrBuilder
        public int getChangedUintListsCount() {
            return this.changedUintLists_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.LegalValuesChangedNotificationOrBuilder
        public List<UintListSetting> getChangedUintListsList() {
            return new Internal.ListAdapter(this.changedUintLists_, changedUintLists_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LegalValuesChangedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.changedUintLists_.size();
                List<Integer> list = this.changedUintLists_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getChangedUintListsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.changedUintLists_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LegalValuesChangedNotification.class, Builder.class);
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
            return new LegalValuesChangedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.changedUintLists_.size()) {
                iF = f3.f(this.changedUintLists_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LegalValuesChangedNotificationOrBuilder {
            private int bitField0_;
            private List<Integer> changedUintLists_;

            private Builder() {
                this.changedUintLists_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(LegalValuesChangedNotification legalValuesChangedNotification) {
            }

            private void buildPartialRepeatedFields(LegalValuesChangedNotification legalValuesChangedNotification) {
                if ((this.bitField0_ & 1) != 0) {
                    this.changedUintLists_ = Collections.unmodifiableList(this.changedUintLists_);
                    this.bitField0_ &= -2;
                }
                legalValuesChangedNotification.changedUintLists_ = this.changedUintLists_;
            }

            private void ensureChangedUintListsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.changedUintLists_ = new ArrayList(this.changedUintLists_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_descriptor;
            }

            public Builder addAllChangedUintLists(Iterable<? extends UintListSetting> iterable) {
                ensureChangedUintListsIsMutable();
                Iterator<? extends UintListSetting> it = iterable.iterator();
                while (it.hasNext()) {
                    this.changedUintLists_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addChangedUintLists(UintListSetting uintListSetting) {
                uintListSetting.getClass();
                ensureChangedUintListsIsMutable();
                this.changedUintLists_.add(Integer.valueOf(uintListSetting.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LegalValuesChangedNotification build() {
                LegalValuesChangedNotification legalValuesChangedNotificationBuildPartial = buildPartial();
                if (legalValuesChangedNotificationBuildPartial.isInitialized()) {
                    return legalValuesChangedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) legalValuesChangedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LegalValuesChangedNotification buildPartial() {
                LegalValuesChangedNotification legalValuesChangedNotification = new LegalValuesChangedNotification(this);
                buildPartialRepeatedFields(legalValuesChangedNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(legalValuesChangedNotification);
                }
                onBuilt();
                return legalValuesChangedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.changedUintLists_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                return this;
            }

            public Builder clearChangedUintLists() {
                this.changedUintLists_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalValuesChangedNotificationOrBuilder
            public UintListSetting getChangedUintLists(int i14) {
                return (UintListSetting) LegalValuesChangedNotification.changedUintLists_converter_.convert(this.changedUintLists_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalValuesChangedNotificationOrBuilder
            public int getChangedUintListsCount() {
                return this.changedUintLists_.size();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.LegalValuesChangedNotificationOrBuilder
            public List<UintListSetting> getChangedUintListsList() {
                return new Internal.ListAdapter(this.changedUintLists_, LegalValuesChangedNotification.changedUintLists_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_LegalValuesChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LegalValuesChangedNotification.class, Builder.class);
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
                                    if (UintListSetting.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureChangedUintListsIsMutable();
                                        this.changedUintLists_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (UintListSetting.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureChangedUintListsIsMutable();
                                            this.changedUintLists_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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

            public Builder setChangedUintLists(int i14, UintListSetting uintListSetting) {
                uintListSetting.getClass();
                ensureChangedUintListsIsMutable();
                this.changedUintLists_.set(i14, Integer.valueOf(uintListSetting.getNumber()));
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
            public LegalValuesChangedNotification getDefaultInstanceForType() {
                return LegalValuesChangedNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.changedUintLists_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LegalValuesChangedNotification) {
                    return mergeFrom((LegalValuesChangedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LegalValuesChangedNotification legalValuesChangedNotification) {
                if (legalValuesChangedNotification == LegalValuesChangedNotification.getDefaultInstance()) {
                    return this;
                }
                if (!legalValuesChangedNotification.changedUintLists_.isEmpty()) {
                    if (this.changedUintLists_.isEmpty()) {
                        this.changedUintLists_ = legalValuesChangedNotification.changedUintLists_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureChangedUintListsIsMutable();
                        this.changedUintLists_.addAll(legalValuesChangedNotification.changedUintLists_);
                    }
                    onChanged();
                }
                mergeUnknownFields(legalValuesChangedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LegalValuesChangedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LegalValuesChangedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalValuesChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LegalValuesChangedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LegalValuesChangedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LegalValuesChangedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LegalValuesChangedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LegalValuesChangedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ LegalValuesChangedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LegalValuesChangedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LegalValuesChangedNotification parseFrom(InputStream inputStream) {
            return (LegalValuesChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LegalValuesChangedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalValuesChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LegalValuesChangedNotification parseFrom(CodedInputStream codedInputStream) {
            return (LegalValuesChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LegalValuesChangedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LegalValuesChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartTrackingResponse extends GeneratedMessageV3 implements StartTrackingResponseOrBuilder {
        private static final StartTrackingResponse DEFAULT_INSTANCE = new StartTrackingResponse();

        @Deprecated
        public static final Parser<StartTrackingResponse> PARSER = new AbstractParser<StartTrackingResponse>() { // from class: com.garmin.proto.generated.GDIInReachTracking.StartTrackingResponse.1
            @Override // com.google.protobuf.Parser
            public StartTrackingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartTrackingResponse.newBuilder();
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

        private StartTrackingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartTrackingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_descriptor;
        }

        public static Builder newBuilder(StartTrackingResponse startTrackingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startTrackingResponse);
        }

        public static StartTrackingResponse parseDelimitedFrom(InputStream inputStream) {
            return (StartTrackingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartTrackingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartTrackingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartTrackingResponse)) {
                return super.equals(obj);
            }
            StartTrackingResponse startTrackingResponse = (StartTrackingResponse) obj;
            if (hasStatus() != startTrackingResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == startTrackingResponse.status_) && getUnknownFields().equals(startTrackingResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartTrackingResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachTracking.StartTrackingResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.StartTrackingResponseOrBuilder
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
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartTrackingResponse.class, Builder.class);
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
            return new StartTrackingResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartTrackingResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(StartTrackingResponse startTrackingResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    startTrackingResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                startTrackingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartTrackingResponse build() {
                StartTrackingResponse startTrackingResponseBuildPartial = buildPartial();
                if (startTrackingResponseBuildPartial.isInitialized()) {
                    return startTrackingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startTrackingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartTrackingResponse buildPartial() {
                StartTrackingResponse startTrackingResponse = new StartTrackingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startTrackingResponse);
                }
                onBuilt();
                return startTrackingResponse;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.StartTrackingResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.StartTrackingResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StartTrackingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartTrackingResponse.class, Builder.class);
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
            public StartTrackingResponse getDefaultInstanceForType() {
                return StartTrackingResponse.getDefaultInstance();
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
                if (message instanceof StartTrackingResponse) {
                    return mergeFrom((StartTrackingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartTrackingResponse startTrackingResponse) {
                if (startTrackingResponse == StartTrackingResponse.getDefaultInstance()) {
                    return this;
                }
                if (startTrackingResponse.hasStatus()) {
                    setStatus(startTrackingResponse.getStatus());
                }
                mergeUnknownFields(startTrackingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartTrackingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartTrackingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTrackingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartTrackingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StartTrackingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartTrackingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StartTrackingResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartTrackingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartTrackingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartTrackingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartTrackingResponse parseFrom(InputStream inputStream) {
            return (StartTrackingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartTrackingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTrackingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartTrackingResponse parseFrom(CodedInputStream codedInputStream) {
            return (StartTrackingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartTrackingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTrackingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            GENERIC_ERROR(2),
            ALREADY_TRACKING(3),
            NOT_ACTIVATED(4),
            MOVING_INTERVAL_IS_OFF(5),
            UNSUPPORTED_BY_PLAN(6);

            public static final int ALREADY_TRACKING_VALUE = 3;
            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int MOVING_INTERVAL_IS_OFF_VALUE = 5;
            public static final int NOT_ACTIVATED_VALUE = 4;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            public static final int UNSUPPORTED_BY_PLAN_VALUE = 6;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachTracking.StartTrackingResponse.Status.1
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
                switch (i14) {
                    case 0:
                        return UNKNOWN_STATUS;
                    case 1:
                        return OK;
                    case 2:
                        return GENERIC_ERROR;
                    case 3:
                        return ALREADY_TRACKING;
                    case 4:
                        return NOT_ACTIVATED;
                    case 5:
                        return MOVING_INTERVAL_IS_OFF;
                    case 6:
                        return UNSUPPORTED_BY_PLAN;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StartTrackingResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class StopTrackingResponse extends GeneratedMessageV3 implements StopTrackingResponseOrBuilder {
        private static final StopTrackingResponse DEFAULT_INSTANCE = new StopTrackingResponse();

        @Deprecated
        public static final Parser<StopTrackingResponse> PARSER = new AbstractParser<StopTrackingResponse>() { // from class: com.garmin.proto.generated.GDIInReachTracking.StopTrackingResponse.1
            @Override // com.google.protobuf.Parser
            public StopTrackingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopTrackingResponse.newBuilder();
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

        private StopTrackingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopTrackingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_descriptor;
        }

        public static Builder newBuilder(StopTrackingResponse stopTrackingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopTrackingResponse);
        }

        public static StopTrackingResponse parseDelimitedFrom(InputStream inputStream) {
            return (StopTrackingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopTrackingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopTrackingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StopTrackingResponse)) {
                return super.equals(obj);
            }
            StopTrackingResponse stopTrackingResponse = (StopTrackingResponse) obj;
            if (hasStatus() != stopTrackingResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == stopTrackingResponse.status_) && getUnknownFields().equals(stopTrackingResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopTrackingResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachTracking.StopTrackingResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.StopTrackingResponseOrBuilder
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
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StopTrackingResponse.class, Builder.class);
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
            return new StopTrackingResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopTrackingResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(StopTrackingResponse stopTrackingResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stopTrackingResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                stopTrackingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopTrackingResponse build() {
                StopTrackingResponse stopTrackingResponseBuildPartial = buildPartial();
                if (stopTrackingResponseBuildPartial.isInitialized()) {
                    return stopTrackingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopTrackingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopTrackingResponse buildPartial() {
                StopTrackingResponse stopTrackingResponse = new StopTrackingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stopTrackingResponse);
                }
                onBuilt();
                return stopTrackingResponse;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.StopTrackingResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.StopTrackingResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_StopTrackingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StopTrackingResponse.class, Builder.class);
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
            public StopTrackingResponse getDefaultInstanceForType() {
                return StopTrackingResponse.getDefaultInstance();
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
                if (message instanceof StopTrackingResponse) {
                    return mergeFrom((StopTrackingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StopTrackingResponse stopTrackingResponse) {
                if (stopTrackingResponse == StopTrackingResponse.getDefaultInstance()) {
                    return this;
                }
                if (stopTrackingResponse.hasStatus()) {
                    setStatus(stopTrackingResponse.getStatus());
                }
                mergeUnknownFields(stopTrackingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopTrackingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StopTrackingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopTrackingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopTrackingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StopTrackingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StopTrackingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StopTrackingResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopTrackingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopTrackingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopTrackingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopTrackingResponse parseFrom(InputStream inputStream) {
            return (StopTrackingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopTrackingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopTrackingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopTrackingResponse parseFrom(CodedInputStream codedInputStream) {
            return (StopTrackingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopTrackingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopTrackingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            GENERIC_ERROR(2),
            STOP_DISALLOWED(3),
            UNSUPPORTED_BY_PLAN(4);

            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int STOP_DISALLOWED_VALUE = 3;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            public static final int UNSUPPORTED_BY_PLAN_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachTracking.StopTrackingResponse.Status.1
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
                    return UNKNOWN_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return GENERIC_ERROR;
                }
                if (i14 == 3) {
                    return STOP_DISALLOWED;
                }
                if (i14 != 4) {
                    return null;
                }
                return UNSUPPORTED_BY_PLAN;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StopTrackingResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class TrackingPointDateRangeQuery extends GeneratedMessageV3 implements TrackingPointDateRangeQueryOrBuilder {
        public static final int DATE_BEGIN_FIELD_NUMBER = 1;
        public static final int DATE_END_FIELD_NUMBER = 2;
        private static final TrackingPointDateRangeQuery DEFAULT_INSTANCE = new TrackingPointDateRangeQuery();

        @Deprecated
        public static final Parser<TrackingPointDateRangeQuery> PARSER = new AbstractParser<TrackingPointDateRangeQuery>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQuery.1
            @Override // com.google.protobuf.Parser
            public TrackingPointDateRangeQuery parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingPointDateRangeQuery.newBuilder();
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
        public static final int POINT_LIMIT_FIELD_NUMBER = 3;
        public static final int SESSION_UUID_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int dateBegin_;
        private int dateEnd_;
        private byte memoizedIsInitialized;
        private int pointLimit_;
        private GDIDataTypes.UUID sessionUuid_;

        private TrackingPointDateRangeQuery(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.dateBegin_ = 0;
            this.dateEnd_ = 0;
            this.pointLimit_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingPointDateRangeQuery getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_descriptor;
        }

        public static Builder newBuilder(TrackingPointDateRangeQuery trackingPointDateRangeQuery) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingPointDateRangeQuery);
        }

        public static TrackingPointDateRangeQuery parseDelimitedFrom(InputStream inputStream) {
            return (TrackingPointDateRangeQuery) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingPointDateRangeQuery parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingPointDateRangeQuery> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingPointDateRangeQuery)) {
                return super.equals(obj);
            }
            TrackingPointDateRangeQuery trackingPointDateRangeQuery = (TrackingPointDateRangeQuery) obj;
            if (hasDateBegin() != trackingPointDateRangeQuery.hasDateBegin()) {
                return false;
            }
            if ((hasDateBegin() && getDateBegin() != trackingPointDateRangeQuery.getDateBegin()) || hasDateEnd() != trackingPointDateRangeQuery.hasDateEnd()) {
                return false;
            }
            if ((hasDateEnd() && getDateEnd() != trackingPointDateRangeQuery.getDateEnd()) || hasPointLimit() != trackingPointDateRangeQuery.hasPointLimit()) {
                return false;
            }
            if ((!hasPointLimit() || getPointLimit() == trackingPointDateRangeQuery.getPointLimit()) && hasSessionUuid() == trackingPointDateRangeQuery.hasSessionUuid()) {
                return (!hasSessionUuid() || getSessionUuid().equals(trackingPointDateRangeQuery.getSessionUuid())) && getUnknownFields().equals(trackingPointDateRangeQuery.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public int getDateBegin() {
            return this.dateBegin_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public int getDateEnd() {
            return this.dateEnd_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingPointDateRangeQuery> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public int getPointLimit() {
            return this.pointLimit_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFixed32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFixed32Size(1, this.dateBegin_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFixed32Size(2, this.dateEnd_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(3, this.pointLimit_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeMessageSize(4, getSessionUuid());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFixed32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public GDIDataTypes.UUID getSessionUuid() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public boolean hasDateBegin() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public boolean hasDateEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public boolean hasPointLimit() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
        public boolean hasSessionUuid() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDateBegin()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDateBegin();
            }
            if (hasDateEnd()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDateEnd();
            }
            if (hasPointLimit()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPointLimit();
            }
            if (hasSessionUuid()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSessionUuid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingPointDateRangeQuery.class, Builder.class);
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
            if (!hasSessionUuid() || getSessionUuid().isInitialized()) {
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
            return new TrackingPointDateRangeQuery();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFixed32(1, this.dateBegin_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed32(2, this.dateEnd_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.pointLimit_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSessionUuid());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingPointDateRangeQueryOrBuilder {
            private int bitField0_;
            private int dateBegin_;
            private int dateEnd_;
            private int pointLimit_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> sessionUuidBuilder_;
            private GDIDataTypes.UUID sessionUuid_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TrackingPointDateRangeQuery trackingPointDateRangeQuery) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    trackingPointDateRangeQuery.dateBegin_ = this.dateBegin_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    trackingPointDateRangeQuery.dateEnd_ = this.dateEnd_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    trackingPointDateRangeQuery.pointLimit_ = this.pointLimit_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                    trackingPointDateRangeQuery.sessionUuid_ = singleFieldBuilderV3 == null ? this.sessionUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                trackingPointDateRangeQuery.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_descriptor;
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
                    getSessionUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingPointDateRangeQuery build() {
                TrackingPointDateRangeQuery trackingPointDateRangeQueryBuildPartial = buildPartial();
                if (trackingPointDateRangeQueryBuildPartial.isInitialized()) {
                    return trackingPointDateRangeQueryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingPointDateRangeQueryBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingPointDateRangeQuery buildPartial() {
                TrackingPointDateRangeQuery trackingPointDateRangeQuery = new TrackingPointDateRangeQuery(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingPointDateRangeQuery);
                }
                onBuilt();
                return trackingPointDateRangeQuery;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.dateBegin_ = 0;
                this.dateEnd_ = 0;
                this.pointLimit_ = 0;
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                return this;
            }

            public Builder clearDateBegin() {
                this.bitField0_ &= -2;
                this.dateBegin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDateEnd() {
                this.bitField0_ &= -3;
                this.dateEnd_ = 0;
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

            public Builder clearPointLimit() {
                this.bitField0_ &= -5;
                this.pointLimit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionUuid() {
                this.bitField0_ &= -9;
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public int getDateBegin() {
                return this.dateBegin_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public int getDateEnd() {
                return this.dateEnd_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public int getPointLimit() {
                return this.pointLimit_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public GDIDataTypes.UUID getSessionUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getSessionUuidBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getSessionUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public boolean hasDateBegin() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public boolean hasDateEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public boolean hasPointLimit() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointDateRangeQueryOrBuilder
            public boolean hasSessionUuid() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointDateRangeQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingPointDateRangeQuery.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasSessionUuid() || getSessionUuid().isInitialized();
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
                                if (tag == 13) {
                                    this.dateBegin_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.dateEnd_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.pointLimit_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSessionUuidFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSessionUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 8) == 0 || (uuid2 = this.sessionUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.sessionUuid_ = uuid;
                } else {
                    getSessionUuidBuilder().mergeFrom(uuid);
                }
                if (this.sessionUuid_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDateBegin(int i14) {
                this.dateBegin_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDateEnd(int i14) {
                this.dateEnd_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPointLimit(int i14) {
                this.pointLimit_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TrackingPointDateRangeQuery getDefaultInstanceForType() {
                return TrackingPointDateRangeQuery.getDefaultInstance();
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

            public Builder setSessionUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.sessionUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingPointDateRangeQuery) {
                    return mergeFrom((TrackingPointDateRangeQuery) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingPointDateRangeQuery trackingPointDateRangeQuery) {
                if (trackingPointDateRangeQuery == TrackingPointDateRangeQuery.getDefaultInstance()) {
                    return this;
                }
                if (trackingPointDateRangeQuery.hasDateBegin()) {
                    setDateBegin(trackingPointDateRangeQuery.getDateBegin());
                }
                if (trackingPointDateRangeQuery.hasDateEnd()) {
                    setDateEnd(trackingPointDateRangeQuery.getDateEnd());
                }
                if (trackingPointDateRangeQuery.hasPointLimit()) {
                    setPointLimit(trackingPointDateRangeQuery.getPointLimit());
                }
                if (trackingPointDateRangeQuery.hasSessionUuid()) {
                    mergeSessionUuid(trackingPointDateRangeQuery.getSessionUuid());
                }
                mergeUnknownFields(trackingPointDateRangeQuery.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingPointDateRangeQuery getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingPointDateRangeQuery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointDateRangeQuery) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingPointDateRangeQuery parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingPointDateRangeQuery parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingPointDateRangeQuery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingPointDateRangeQuery parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingPointDateRangeQuery parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ TrackingPointDateRangeQuery(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrackingPointDateRangeQuery parseFrom(InputStream inputStream) {
            return (TrackingPointDateRangeQuery) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private TrackingPointDateRangeQuery() {
            this.dateBegin_ = 0;
            this.dateEnd_ = 0;
            this.pointLimit_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingPointDateRangeQuery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointDateRangeQuery) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingPointDateRangeQuery parseFrom(CodedInputStream codedInputStream) {
            return (TrackingPointDateRangeQuery) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingPointDateRangeQuery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointDateRangeQuery) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackingPointInfo extends GeneratedMessageV3 implements TrackingPointInfoOrBuilder {
        private static final TrackingPointInfo DEFAULT_INSTANCE = new TrackingPointInfo();

        @Deprecated
        public static final Parser<TrackingPointInfo> PARSER = new AbstractParser<TrackingPointInfo>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfo.1
            @Override // com.google.protobuf.Parser
            public TrackingPointInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingPointInfo.newBuilder();
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
        public static final int STATE_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int state_;
        private int status_;
        private int type_;

        private TrackingPointInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = 1;
            this.type_ = 0;
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingPointInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_descriptor;
        }

        public static Builder newBuilder(TrackingPointInfo trackingPointInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingPointInfo);
        }

        public static TrackingPointInfo parseDelimitedFrom(InputStream inputStream) {
            return (TrackingPointInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingPointInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingPointInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingPointInfo)) {
                return super.equals(obj);
            }
            TrackingPointInfo trackingPointInfo = (TrackingPointInfo) obj;
            if (hasState() != trackingPointInfo.hasState()) {
                return false;
            }
            if ((hasState() && this.state_ != trackingPointInfo.state_) || hasType() != trackingPointInfo.hasType()) {
                return false;
            }
            if ((!hasType() || this.type_ == trackingPointInfo.type_) && hasStatus() == trackingPointInfo.hasStatus()) {
                return (!hasStatus() || this.status_ == trackingPointInfo.status_) && getUnknownFields().equals(trackingPointInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingPointInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.state_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.type_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
        public TrackingState getState() {
            TrackingState trackingStateForNumber = TrackingState.forNumber(this.state_);
            return trackingStateForNumber == null ? TrackingState.TRACKING_STATE_OFF : trackingStateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
        public PointStatus getStatus() {
            PointStatus pointStatusForNumber = PointStatus.forNumber(this.status_);
            return pointStatusForNumber == null ? PointStatus.TRACKING_POINT_STATUS_UNKNOWN : pointStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
        public PointType getType() {
            PointType pointTypeForNumber = PointType.forNumber(this.type_);
            return pointTypeForNumber == null ? PointType.TRACKING_POINT_TYPE_UNKNOWN : pointTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.state_;
            }
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.type_;
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingPointInfo.class, Builder.class);
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
            return new TrackingPointInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.type_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingPointInfoOrBuilder {
            private int bitField0_;
            private int state_;
            private int status_;
            private int type_;

            private Builder() {
                this.state_ = 1;
                this.type_ = 0;
                this.status_ = 0;
            }

            private void buildPartial0(TrackingPointInfo trackingPointInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    trackingPointInfo.state_ = this.state_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    trackingPointInfo.type_ = this.type_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    trackingPointInfo.status_ = this.status_;
                    i14 |= 4;
                }
                trackingPointInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingPointInfo build() {
                TrackingPointInfo trackingPointInfoBuildPartial = buildPartial();
                if (trackingPointInfoBuildPartial.isInitialized()) {
                    return trackingPointInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingPointInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingPointInfo buildPartial() {
                TrackingPointInfo trackingPointInfo = new TrackingPointInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingPointInfo);
                }
                onBuilt();
                return trackingPointInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 1;
                this.type_ = 0;
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

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = 1;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -5;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -3;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
            public TrackingState getState() {
                TrackingState trackingStateForNumber = TrackingState.forNumber(this.state_);
                return trackingStateForNumber == null ? TrackingState.TRACKING_STATE_OFF : trackingStateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
            public PointStatus getStatus() {
                PointStatus pointStatusForNumber = PointStatus.forNumber(this.status_);
                return pointStatusForNumber == null ? PointStatus.TRACKING_POINT_STATUS_UNKNOWN : pointStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
            public PointType getType() {
                PointType pointTypeForNumber = PointType.forNumber(this.type_);
                return pointTypeForNumber == null ? PointType.TRACKING_POINT_TYPE_UNKNOWN : pointTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfoOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingPointInfo.class, Builder.class);
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
                                    if (TrackingState.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.state_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (PointType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.type_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    int i16 = codedInputStream.readEnum();
                                    if (PointStatus.forNumber(i16) == null) {
                                        mergeUnknownVarintField(3, i16);
                                    } else {
                                        this.status_ = i16;
                                        this.bitField0_ |= 4;
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

            public Builder setState(TrackingState trackingState) {
                trackingState.getClass();
                this.bitField0_ |= 1;
                this.state_ = trackingState.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatus(PointStatus pointStatus) {
                pointStatus.getClass();
                this.bitField0_ |= 4;
                this.status_ = pointStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setType(PointType pointType) {
                pointType.getClass();
                this.bitField0_ |= 2;
                this.type_ = pointType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TrackingPointInfo getDefaultInstanceForType() {
                return TrackingPointInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.state_ = 1;
                this.type_ = 0;
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingPointInfo) {
                    return mergeFrom((TrackingPointInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingPointInfo trackingPointInfo) {
                if (trackingPointInfo == TrackingPointInfo.getDefaultInstance()) {
                    return this;
                }
                if (trackingPointInfo.hasState()) {
                    setState(trackingPointInfo.getState());
                }
                if (trackingPointInfo.hasType()) {
                    setType(trackingPointInfo.getType());
                }
                if (trackingPointInfo.hasStatus()) {
                    setStatus(trackingPointInfo.getStatus());
                }
                mergeUnknownFields(trackingPointInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingPointInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingPointInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingPointInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingPointInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingPointInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingPointInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingPointInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackingPointInfo parseFrom(InputStream inputStream) {
            return (TrackingPointInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ TrackingPointInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TrackingPointInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 1;
            this.type_ = 0;
            this.status_ = 0;
        }

        public static TrackingPointInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingPointInfo parseFrom(CodedInputStream codedInputStream) {
            return (TrackingPointInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingPointInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum PointStatus implements ProtocolMessageEnum {
            TRACKING_POINT_STATUS_UNKNOWN(0),
            FAILED(1),
            PENDING(2),
            COMPLETE(3);

            public static final int COMPLETE_VALUE = 3;
            public static final int FAILED_VALUE = 1;
            public static final int PENDING_VALUE = 2;
            public static final int TRACKING_POINT_STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<PointStatus> internalValueMap = new Internal.EnumLiteMap<PointStatus>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfo.PointStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public PointStatus findValueByNumber(int i14) {
                    return PointStatus.forNumber(i14);
                }
            };
            private static final PointStatus[] VALUES = values();

            PointStatus(int i14) {
                this.value = i14;
            }

            public static PointStatus forNumber(int i14) {
                if (i14 == 0) {
                    return TRACKING_POINT_STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return FAILED;
                }
                if (i14 == 2) {
                    return PENDING;
                }
                if (i14 != 3) {
                    return null;
                }
                return COMPLETE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TrackingPointInfo.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<PointStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static PointStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static PointStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum PointType implements ProtocolMessageEnum {
            TRACKING_POINT_TYPE_UNKNOWN(0),
            START(1),
            NORMAL(2),
            STOP(3);

            public static final int NORMAL_VALUE = 2;
            public static final int START_VALUE = 1;
            public static final int STOP_VALUE = 3;
            public static final int TRACKING_POINT_TYPE_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<PointType> internalValueMap = new Internal.EnumLiteMap<PointType>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingPointInfo.PointType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public PointType findValueByNumber(int i14) {
                    return PointType.forNumber(i14);
                }
            };
            private static final PointType[] VALUES = values();

            PointType(int i14) {
                this.value = i14;
            }

            public static PointType forNumber(int i14) {
                if (i14 == 0) {
                    return TRACKING_POINT_TYPE_UNKNOWN;
                }
                if (i14 == 1) {
                    return START;
                }
                if (i14 == 2) {
                    return NORMAL;
                }
                if (i14 != 3) {
                    return null;
                }
                return STOP;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TrackingPointInfo.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<PointType> internalGetValueMap() {
                return internalValueMap;
            }

            public static PointType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static PointType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class TrackingPointNotification extends GeneratedMessageV3 implements TrackingPointNotificationOrBuilder {
        private static final TrackingPointNotification DEFAULT_INSTANCE = new TrackingPointNotification();

        @Deprecated
        public static final Parser<TrackingPointNotification> PARSER = new AbstractParser<TrackingPointNotification>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotification.1
            @Override // com.google.protobuf.Parser
            public TrackingPointNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingPointNotification.newBuilder();
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
        public static final int POINTS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<GDICore.LocationData> points_;

        private TrackingPointNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.points_ = Collections.EMPTY_LIST;
        }

        public static TrackingPointNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_descriptor;
        }

        public static Builder newBuilder(TrackingPointNotification trackingPointNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingPointNotification);
        }

        public static TrackingPointNotification parseDelimitedFrom(InputStream inputStream) {
            return (TrackingPointNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingPointNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingPointNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingPointNotification)) {
                return super.equals(obj);
            }
            TrackingPointNotification trackingPointNotification = (TrackingPointNotification) obj;
            return getPointsList().equals(trackingPointNotification.getPointsList()) && getUnknownFields().equals(trackingPointNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingPointNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
        public GDICore.LocationData getPoints(int i14) {
            return this.points_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
        public int getPointsCount() {
            return this.points_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
        public List<GDICore.LocationData> getPointsList() {
            return this.points_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
        public GDICore.LocationDataOrBuilder getPointsOrBuilder(int i14) {
            return this.points_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
        public List<? extends GDICore.LocationDataOrBuilder> getPointsOrBuilderList() {
            return this.points_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.points_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.points_.get(i15));
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
            if (getPointsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPointsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingPointNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getPointsCount(); i14++) {
                if (!getPoints(i14).isInitialized()) {
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
            return new TrackingPointNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.points_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.points_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingPointNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> pointsBuilder_;
            private List<GDICore.LocationData> points_;

            private Builder() {
                this.points_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(TrackingPointNotification trackingPointNotification) {
            }

            private void buildPartialRepeatedFields(TrackingPointNotification trackingPointNotification) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    trackingPointNotification.points_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.points_ = Collections.unmodifiableList(this.points_);
                    this.bitField0_ &= -2;
                }
                trackingPointNotification.points_ = this.points_;
            }

            private void ensurePointsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.points_ = new ArrayList(this.points_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> getPointsFieldBuilder() {
                if (this.pointsBuilder_ == null) {
                    this.pointsBuilder_ = new RepeatedFieldBuilderV3<>(this.points_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.points_ = null;
                }
                return this.pointsBuilder_;
            }

            public Builder addAllPoints(Iterable<? extends GDICore.LocationData> iterable) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePointsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.points_);
                onChanged();
                return this;
            }

            public Builder addPoints(GDICore.LocationData.Builder builder) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensurePointsIsMutable();
                this.points_.add(builder.build());
                onChanged();
                return this;
            }

            public GDICore.LocationData.Builder addPointsBuilder() {
                return (GDICore.LocationData.Builder) getPointsFieldBuilder().addBuilder(GDICore.LocationData.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingPointNotification build() {
                TrackingPointNotification trackingPointNotificationBuildPartial = buildPartial();
                if (trackingPointNotificationBuildPartial.isInitialized()) {
                    return trackingPointNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingPointNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingPointNotification buildPartial() {
                TrackingPointNotification trackingPointNotification = new TrackingPointNotification(this);
                buildPartialRepeatedFields(trackingPointNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingPointNotification);
                }
                onBuilt();
                return trackingPointNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.points_ = Collections.EMPTY_LIST;
                } else {
                    this.points_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearPoints() {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.points_ = Collections.EMPTY_LIST;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
            public GDICore.LocationData getPoints(int i14) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.points_.get(i14) : (GDICore.LocationData) repeatedFieldBuilderV3.getMessage(i14);
            }

            public GDICore.LocationData.Builder getPointsBuilder(int i14) {
                return (GDICore.LocationData.Builder) getPointsFieldBuilder().getBuilder(i14);
            }

            public List<GDICore.LocationData.Builder> getPointsBuilderList() {
                return getPointsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
            public int getPointsCount() {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.points_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
            public List<GDICore.LocationData> getPointsList() {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.points_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
            public GDICore.LocationDataOrBuilder getPointsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.points_.get(i14) : (GDICore.LocationDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingPointNotificationOrBuilder
            public List<? extends GDICore.LocationDataOrBuilder> getPointsOrBuilderList() {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.points_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingPointNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingPointNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getPointsCount(); i14++) {
                    if (!getPoints(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(TrackingPointNotification trackingPointNotification) {
                if (trackingPointNotification == TrackingPointNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.pointsBuilder_ == null) {
                    if (!trackingPointNotification.points_.isEmpty()) {
                        if (this.points_.isEmpty()) {
                            this.points_ = trackingPointNotification.points_;
                            this.bitField0_ &= -2;
                        } else {
                            ensurePointsIsMutable();
                            this.points_.addAll(trackingPointNotification.points_);
                        }
                        onChanged();
                    }
                } else if (!trackingPointNotification.points_.isEmpty()) {
                    boolean zIsEmpty = this.pointsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.pointsBuilder_ = null;
                        this.points_ = trackingPointNotification.points_;
                        this.bitField0_ &= -2;
                        this.pointsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(trackingPointNotification.points_);
                    }
                }
                mergeUnknownFields(trackingPointNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removePoints(int i14) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensurePointsIsMutable();
                this.points_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPoints(int i14, GDICore.LocationData.Builder builder) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensurePointsIsMutable();
                this.points_.set(i14, builder.build());
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
            public TrackingPointNotification getDefaultInstanceForType() {
                return TrackingPointNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.points_ = Collections.EMPTY_LIST;
            }

            public GDICore.LocationData.Builder addPointsBuilder(int i14) {
                return (GDICore.LocationData.Builder) getPointsFieldBuilder().addBuilder(i14, GDICore.LocationData.getDefaultInstance());
            }

            public Builder addPoints(int i14, GDICore.LocationData locationData) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    locationData.getClass();
                    ensurePointsIsMutable();
                    this.points_.add(i14, locationData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, locationData);
                return this;
            }

            public Builder setPoints(int i14, GDICore.LocationData locationData) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    locationData.getClass();
                    ensurePointsIsMutable();
                    this.points_.set(i14, locationData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, locationData);
                return this;
            }

            public Builder addPoints(GDICore.LocationData locationData) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    locationData.getClass();
                    ensurePointsIsMutable();
                    this.points_.add(locationData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(locationData);
                return this;
            }

            public Builder addPoints(int i14, GDICore.LocationData.Builder builder) {
                RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePointsIsMutable();
                    this.points_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingPointNotification) {
                    return mergeFrom((TrackingPointNotification) message);
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
                                    GDICore.LocationData locationData = (GDICore.LocationData) codedInputStream.readMessage(GDICore.LocationData.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<GDICore.LocationData, GDICore.LocationData.Builder, GDICore.LocationDataOrBuilder> repeatedFieldBuilderV3 = this.pointsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensurePointsIsMutable();
                                        this.points_.add(locationData);
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
        public TrackingPointNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingPointNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingPointNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingPointNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TrackingPointNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingPointNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingPointNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ TrackingPointNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrackingPointNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackingPointNotification parseFrom(InputStream inputStream) {
            return (TrackingPointNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackingPointNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingPointNotification parseFrom(CodedInputStream codedInputStream) {
            return (TrackingPointNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingPointNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingPointNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackingSessionInfo extends GeneratedMessageV3 implements TrackingSessionInfoOrBuilder {
        public static final int LAST_SENT_TIMESTAMP_FIELD_NUMBER = 3;
        public static final int SEND_PENDING_FIELD_NUMBER = 4;
        public static final int START_TIME_FIELD_NUMBER = 2;
        public static final int TOTAL_DISTANCE_M_FIELD_NUMBER = 5;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int lastSentTimestamp_;
        private byte memoizedIsInitialized;
        private boolean sendPending_;
        private int startTime_;
        private float totalDistanceM_;
        private GDIDataTypes.UUID uuid_;
        private static final TrackingSessionInfo DEFAULT_INSTANCE = new TrackingSessionInfo();

        @Deprecated
        public static final Parser<TrackingSessionInfo> PARSER = new AbstractParser<TrackingSessionInfo>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfo.1
            @Override // com.google.protobuf.Parser
            public TrackingSessionInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingSessionInfo.newBuilder();
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

        private TrackingSessionInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.startTime_ = 0;
            this.lastSentTimestamp_ = 0;
            this.sendPending_ = false;
            this.totalDistanceM_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingSessionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_descriptor;
        }

        public static Builder newBuilder(TrackingSessionInfo trackingSessionInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingSessionInfo);
        }

        public static TrackingSessionInfo parseDelimitedFrom(InputStream inputStream) {
            return (TrackingSessionInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingSessionInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingSessionInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingSessionInfo)) {
                return super.equals(obj);
            }
            TrackingSessionInfo trackingSessionInfo = (TrackingSessionInfo) obj;
            if (hasUuid() != trackingSessionInfo.hasUuid()) {
                return false;
            }
            if ((hasUuid() && !getUuid().equals(trackingSessionInfo.getUuid())) || hasStartTime() != trackingSessionInfo.hasStartTime()) {
                return false;
            }
            if ((hasStartTime() && getStartTime() != trackingSessionInfo.getStartTime()) || hasLastSentTimestamp() != trackingSessionInfo.hasLastSentTimestamp()) {
                return false;
            }
            if ((hasLastSentTimestamp() && getLastSentTimestamp() != trackingSessionInfo.getLastSentTimestamp()) || hasSendPending() != trackingSessionInfo.hasSendPending()) {
                return false;
            }
            if ((!hasSendPending() || getSendPending() == trackingSessionInfo.getSendPending()) && hasTotalDistanceM() == trackingSessionInfo.hasTotalDistanceM()) {
                return (!hasTotalDistanceM() || Float.floatToIntBits(getTotalDistanceM()) == Float.floatToIntBits(trackingSessionInfo.getTotalDistanceM())) && getUnknownFields().equals(trackingSessionInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public int getLastSentTimestamp() {
            return this.lastSentTimestamp_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingSessionInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public boolean getSendPending() {
            return this.sendPending_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUuid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(2, this.startTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(3, this.lastSentTimestamp_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(4, this.sendPending_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(5, this.totalDistanceM_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public int getStartTime() {
            return this.startTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public float getTotalDistanceM() {
            return this.totalDistanceM_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public boolean hasLastSentTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public boolean hasSendPending() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public boolean hasStartTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public boolean hasTotalDistanceM() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
        public boolean hasUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUuid().hashCode();
            }
            if (hasStartTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStartTime();
            }
            if (hasLastSentTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLastSentTimestamp();
            }
            if (hasSendPending()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getSendPending());
            }
            if (hasTotalDistanceM()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getTotalDistanceM());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSessionInfo.class, Builder.class);
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
            if (!hasUuid() || getUuid().isInitialized()) {
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
            return new TrackingSessionInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUuid());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed32(2, this.startTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFixed32(3, this.lastSentTimestamp_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.sendPending_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.totalDistanceM_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingSessionInfoOrBuilder {
            private int bitField0_;
            private int lastSentTimestamp_;
            private boolean sendPending_;
            private int startTime_;
            private float totalDistanceM_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TrackingSessionInfo trackingSessionInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    trackingSessionInfo.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    trackingSessionInfo.startTime_ = this.startTime_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    trackingSessionInfo.lastSentTimestamp_ = this.lastSentTimestamp_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    trackingSessionInfo.sendPending_ = this.sendPending_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    trackingSessionInfo.totalDistanceM_ = this.totalDistanceM_;
                    i14 |= 16;
                }
                trackingSessionInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUuidFieldBuilder() {
                if (this.uuidBuilder_ == null) {
                    this.uuidBuilder_ = new SingleFieldBuilderV3<>(getUuid(), getParentForChildren(), isClean());
                    this.uuid_ = null;
                }
                return this.uuidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSessionInfo build() {
                TrackingSessionInfo trackingSessionInfoBuildPartial = buildPartial();
                if (trackingSessionInfoBuildPartial.isInitialized()) {
                    return trackingSessionInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingSessionInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSessionInfo buildPartial() {
                TrackingSessionInfo trackingSessionInfo = new TrackingSessionInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingSessionInfo);
                }
                onBuilt();
                return trackingSessionInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
                }
                this.startTime_ = 0;
                this.lastSentTimestamp_ = 0;
                this.sendPending_ = false;
                this.totalDistanceM_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLastSentTimestamp() {
                this.bitField0_ &= -5;
                this.lastSentTimestamp_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSendPending() {
                this.bitField0_ &= -9;
                this.sendPending_ = false;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.bitField0_ &= -3;
                this.startTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalDistanceM() {
                this.bitField0_ &= -17;
                this.totalDistanceM_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearUuid() {
                this.bitField0_ &= -2;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public int getLastSentTimestamp() {
                return this.lastSentTimestamp_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public boolean getSendPending() {
                return this.sendPending_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public int getStartTime() {
                return this.startTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public float getTotalDistanceM() {
                return this.totalDistanceM_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public GDIDataTypes.UUID getUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUuidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public boolean hasLastSentTimestamp() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public boolean hasSendPending() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public boolean hasStartTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public boolean hasTotalDistanceM() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionInfoOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSessionInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasUuid() || getUuid().isInitialized();
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
                                    codedInputStream.readMessage(getUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.startTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.lastSentTimestamp_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.sendPending_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.totalDistanceM_ = codedInputStream.readFloat();
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

            public Builder mergeUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uuid_ = uuid;
                } else {
                    getUuidBuilder().mergeFrom(uuid);
                }
                if (this.uuid_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLastSentTimestamp(int i14) {
                this.lastSentTimestamp_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSendPending(boolean z14) {
                this.sendPending_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStartTime(int i14) {
                this.startTime_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTotalDistanceM(float f14) {
                this.totalDistanceM_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TrackingSessionInfo getDefaultInstanceForType() {
                return TrackingSessionInfo.getDefaultInstance();
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

            public Builder setUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingSessionInfo) {
                    return mergeFrom((TrackingSessionInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingSessionInfo trackingSessionInfo) {
                if (trackingSessionInfo == TrackingSessionInfo.getDefaultInstance()) {
                    return this;
                }
                if (trackingSessionInfo.hasUuid()) {
                    mergeUuid(trackingSessionInfo.getUuid());
                }
                if (trackingSessionInfo.hasStartTime()) {
                    setStartTime(trackingSessionInfo.getStartTime());
                }
                if (trackingSessionInfo.hasLastSentTimestamp()) {
                    setLastSentTimestamp(trackingSessionInfo.getLastSentTimestamp());
                }
                if (trackingSessionInfo.hasSendPending()) {
                    setSendPending(trackingSessionInfo.getSendPending());
                }
                if (trackingSessionInfo.hasTotalDistanceM()) {
                    setTotalDistanceM(trackingSessionInfo.getTotalDistanceM());
                }
                mergeUnknownFields(trackingSessionInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingSessionInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingSessionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSessionInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingSessionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingSessionInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingSessionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingSessionInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingSessionInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackingSessionInfo parseFrom(InputStream inputStream) {
            return (TrackingSessionInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackingSessionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSessionInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ TrackingSessionInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TrackingSessionInfo() {
            this.startTime_ = 0;
            this.lastSentTimestamp_ = 0;
            this.sendPending_ = false;
            this.totalDistanceM_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingSessionInfo parseFrom(CodedInputStream codedInputStream) {
            return (TrackingSessionInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingSessionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSessionInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackingSessionNotification extends GeneratedMessageV3 implements TrackingSessionNotificationOrBuilder {
        private static final TrackingSessionNotification DEFAULT_INSTANCE = new TrackingSessionNotification();

        @Deprecated
        public static final Parser<TrackingSessionNotification> PARSER = new AbstractParser<TrackingSessionNotification>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingSessionNotification.1
            @Override // com.google.protobuf.Parser
            public TrackingSessionNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingSessionNotification.newBuilder();
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
        public static final int SESSION_INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private TrackingSessionInfo sessionInfo_;

        private TrackingSessionNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingSessionNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_descriptor;
        }

        public static Builder newBuilder(TrackingSessionNotification trackingSessionNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingSessionNotification);
        }

        public static TrackingSessionNotification parseDelimitedFrom(InputStream inputStream) {
            return (TrackingSessionNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingSessionNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingSessionNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingSessionNotification)) {
                return super.equals(obj);
            }
            TrackingSessionNotification trackingSessionNotification = (TrackingSessionNotification) obj;
            if (hasSessionInfo() != trackingSessionNotification.hasSessionInfo()) {
                return false;
            }
            return (!hasSessionInfo() || getSessionInfo().equals(trackingSessionNotification.getSessionInfo())) && getUnknownFields().equals(trackingSessionNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingSessionNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSessionInfo()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionNotificationOrBuilder
        public TrackingSessionInfo getSessionInfo() {
            TrackingSessionInfo trackingSessionInfo = this.sessionInfo_;
            return trackingSessionInfo == null ? TrackingSessionInfo.getDefaultInstance() : trackingSessionInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionNotificationOrBuilder
        public TrackingSessionInfoOrBuilder getSessionInfoOrBuilder() {
            TrackingSessionInfo trackingSessionInfo = this.sessionInfo_;
            return trackingSessionInfo == null ? TrackingSessionInfo.getDefaultInstance() : trackingSessionInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionNotificationOrBuilder
        public boolean hasSessionInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSessionNotification.class, Builder.class);
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
            if (!hasSessionInfo() || getSessionInfo().isInitialized()) {
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
            return new TrackingSessionNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSessionInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingSessionNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> sessionInfoBuilder_;
            private TrackingSessionInfo sessionInfo_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TrackingSessionNotification trackingSessionNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                    trackingSessionNotification.sessionInfo_ = singleFieldBuilderV3 == null ? this.sessionInfo_ : (TrackingSessionInfo) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                trackingSessionNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_descriptor;
            }

            private SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> getSessionInfoFieldBuilder() {
                if (this.sessionInfoBuilder_ == null) {
                    this.sessionInfoBuilder_ = new SingleFieldBuilderV3<>(getSessionInfo(), getParentForChildren(), isClean());
                    this.sessionInfo_ = null;
                }
                return this.sessionInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSessionInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSessionNotification build() {
                TrackingSessionNotification trackingSessionNotificationBuildPartial = buildPartial();
                if (trackingSessionNotificationBuildPartial.isInitialized()) {
                    return trackingSessionNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingSessionNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSessionNotification buildPartial() {
                TrackingSessionNotification trackingSessionNotification = new TrackingSessionNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingSessionNotification);
                }
                onBuilt();
                return trackingSessionNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionInfo_ = null;
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionInfoBuilder_ = null;
                }
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

            public Builder clearSessionInfo() {
                this.bitField0_ &= -2;
                this.sessionInfo_ = null;
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionInfoBuilder_ = null;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionNotificationOrBuilder
            public TrackingSessionInfo getSessionInfo() {
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSessionInfo) singleFieldBuilderV3.getMessage();
                }
                TrackingSessionInfo trackingSessionInfo = this.sessionInfo_;
                return trackingSessionInfo == null ? TrackingSessionInfo.getDefaultInstance() : trackingSessionInfo;
            }

            public TrackingSessionInfo.Builder getSessionInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TrackingSessionInfo.Builder) getSessionInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionNotificationOrBuilder
            public TrackingSessionInfoOrBuilder getSessionInfoOrBuilder() {
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSessionInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingSessionInfo trackingSessionInfo = this.sessionInfo_;
                return trackingSessionInfo == null ? TrackingSessionInfo.getDefaultInstance() : trackingSessionInfo;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSessionNotificationOrBuilder
            public boolean hasSessionInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSessionNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSessionNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasSessionInfo() || getSessionInfo().isInitialized();
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
                                    codedInputStream.readMessage(getSessionInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSessionInfo(TrackingSessionInfo trackingSessionInfo) {
                TrackingSessionInfo trackingSessionInfo2;
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingSessionInfo);
                } else if ((this.bitField0_ & 1) == 0 || (trackingSessionInfo2 = this.sessionInfo_) == null || trackingSessionInfo2 == TrackingSessionInfo.getDefaultInstance()) {
                    this.sessionInfo_ = trackingSessionInfo;
                } else {
                    getSessionInfoBuilder().mergeFrom(trackingSessionInfo);
                }
                if (this.sessionInfo_ != null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionInfo(TrackingSessionInfo.Builder builder) {
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionInfo_ = builder.build();
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
            public TrackingSessionNotification getDefaultInstanceForType() {
                return TrackingSessionNotification.getDefaultInstance();
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

            public Builder setSessionInfo(TrackingSessionInfo trackingSessionInfo) {
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingSessionInfo.getClass();
                    this.sessionInfo_ = trackingSessionInfo;
                } else {
                    singleFieldBuilderV3.setMessage(trackingSessionInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingSessionNotification) {
                    return mergeFrom((TrackingSessionNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingSessionNotification trackingSessionNotification) {
                if (trackingSessionNotification == TrackingSessionNotification.getDefaultInstance()) {
                    return this;
                }
                if (trackingSessionNotification.hasSessionInfo()) {
                    mergeSessionInfo(trackingSessionNotification.getSessionInfo());
                }
                mergeUnknownFields(trackingSessionNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingSessionNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TrackingSessionNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TrackingSessionNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingSessionNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSessionNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingSessionNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingSessionNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingSessionNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingSessionNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingSessionNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackingSessionNotification parseFrom(InputStream inputStream) {
            return (TrackingSessionNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackingSessionNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSessionNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingSessionNotification parseFrom(CodedInputStream codedInputStream) {
            return (TrackingSessionNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingSessionNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSessionNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackingSettings extends GeneratedMessageV3 implements TrackingSettingsOrBuilder {
        private static final TrackingSettings DEFAULT_INSTANCE = new TrackingSettings();

        @Deprecated
        public static final Parser<TrackingSettings> PARSER = new AbstractParser<TrackingSettings>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingSettings.1
            @Override // com.google.protobuf.Parser
            public TrackingSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingSettings.newBuilder();
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
        public static final int SETTINGS_VERSION_FIELD_NUMBER = 1;
        public static final int UINT_LIST_VALUES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int settingsVersion_;
        private List<UintListSettingValue> uintListValues_;

        private TrackingSettings() {
            this.settingsVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.uintListValues_ = Collections.EMPTY_LIST;
        }

        public static TrackingSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSettings_descriptor;
        }

        public static Builder newBuilder(TrackingSettings trackingSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingSettings);
        }

        public static TrackingSettings parseDelimitedFrom(InputStream inputStream) {
            return (TrackingSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingSettings)) {
                return super.equals(obj);
            }
            TrackingSettings trackingSettings = (TrackingSettings) obj;
            if (hasSettingsVersion() != trackingSettings.hasSettingsVersion()) {
                return false;
            }
            return (!hasSettingsVersion() || getSettingsVersion() == trackingSettings.getSettingsVersion()) && getUintListValuesList().equals(trackingSettings.getUintListValuesList()) && getUnknownFields().equals(trackingSettings.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.settingsVersion_) : 0;
            for (int i15 = 0; i15 < this.uintListValues_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, this.uintListValues_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
        public int getSettingsVersion() {
            return this.settingsVersion_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
        public UintListSettingValue getUintListValues(int i14) {
            return this.uintListValues_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
        public int getUintListValuesCount() {
            return this.uintListValues_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
        public List<UintListSettingValue> getUintListValuesList() {
            return this.uintListValues_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
        public UintListSettingValueOrBuilder getUintListValuesOrBuilder(int i14) {
            return this.uintListValues_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
        public List<? extends UintListSettingValueOrBuilder> getUintListValuesOrBuilderList() {
            return this.uintListValues_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
        public boolean hasSettingsVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSettingsVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSettingsVersion();
            }
            if (getUintListValuesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUintListValuesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSettings.class, Builder.class);
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
            if (!hasSettingsVersion()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getUintListValuesCount(); i14++) {
                if (!getUintListValues(i14).isInitialized()) {
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
            return new TrackingSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.settingsVersion_);
            }
            for (int i14 = 0; i14 < this.uintListValues_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.uintListValues_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingSettingsOrBuilder {
            private int bitField0_;
            private int settingsVersion_;
            private RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> uintListValuesBuilder_;
            private List<UintListSettingValue> uintListValues_;

            private Builder() {
                this.uintListValues_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(TrackingSettings trackingSettings) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    trackingSettings.settingsVersion_ = this.settingsVersion_;
                } else {
                    i14 = 0;
                }
                trackingSettings.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(TrackingSettings trackingSettings) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    trackingSettings.uintListValues_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.uintListValues_ = Collections.unmodifiableList(this.uintListValues_);
                    this.bitField0_ &= -3;
                }
                trackingSettings.uintListValues_ = this.uintListValues_;
            }

            private void ensureUintListValuesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.uintListValues_ = new ArrayList(this.uintListValues_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSettings_descriptor;
            }

            private RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> getUintListValuesFieldBuilder() {
                if (this.uintListValuesBuilder_ == null) {
                    this.uintListValuesBuilder_ = new RepeatedFieldBuilderV3<>(this.uintListValues_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.uintListValues_ = null;
                }
                return this.uintListValuesBuilder_;
            }

            public Builder addAllUintListValues(Iterable<? extends UintListSettingValue> iterable) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureUintListValuesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.uintListValues_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addUintListValues(UintListSettingValue.Builder builder) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureUintListValuesIsMutable();
                this.uintListValues_.add(builder.build());
                onChanged();
                return this;
            }

            public UintListSettingValue.Builder addUintListValuesBuilder() {
                return (UintListSettingValue.Builder) getUintListValuesFieldBuilder().addBuilder(UintListSettingValue.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSettings build() {
                TrackingSettings trackingSettingsBuildPartial = buildPartial();
                if (trackingSettingsBuildPartial.isInitialized()) {
                    return trackingSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSettings buildPartial() {
                TrackingSettings trackingSettings = new TrackingSettings(this);
                buildPartialRepeatedFields(trackingSettings);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingSettings);
                }
                onBuilt();
                return trackingSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settingsVersion_ = 0;
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.uintListValues_ = Collections.EMPTY_LIST;
                } else {
                    this.uintListValues_ = null;
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

            public Builder clearSettingsVersion() {
                this.bitField0_ &= -2;
                this.settingsVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUintListValues() {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.uintListValues_ = Collections.EMPTY_LIST;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
            public int getSettingsVersion() {
                return this.settingsVersion_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
            public UintListSettingValue getUintListValues(int i14) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.uintListValues_.get(i14) : (UintListSettingValue) repeatedFieldBuilderV3.getMessage(i14);
            }

            public UintListSettingValue.Builder getUintListValuesBuilder(int i14) {
                return (UintListSettingValue.Builder) getUintListValuesFieldBuilder().getBuilder(i14);
            }

            public List<UintListSettingValue.Builder> getUintListValuesBuilderList() {
                return getUintListValuesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
            public int getUintListValuesCount() {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.uintListValues_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
            public List<UintListSettingValue> getUintListValuesList() {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.uintListValues_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
            public UintListSettingValueOrBuilder getUintListValuesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.uintListValues_.get(i14) : (UintListSettingValueOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
            public List<? extends UintListSettingValueOrBuilder> getUintListValuesOrBuilderList() {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.uintListValues_);
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSettingsOrBuilder
            public boolean hasSettingsVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSettings.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasSettingsVersion()) {
                    return false;
                }
                for (int i14 = 0; i14 < getUintListValuesCount(); i14++) {
                    if (!getUintListValues(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(TrackingSettings trackingSettings) {
                if (trackingSettings == TrackingSettings.getDefaultInstance()) {
                    return this;
                }
                if (trackingSettings.hasSettingsVersion()) {
                    setSettingsVersion(trackingSettings.getSettingsVersion());
                }
                if (this.uintListValuesBuilder_ == null) {
                    if (!trackingSettings.uintListValues_.isEmpty()) {
                        if (this.uintListValues_.isEmpty()) {
                            this.uintListValues_ = trackingSettings.uintListValues_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureUintListValuesIsMutable();
                            this.uintListValues_.addAll(trackingSettings.uintListValues_);
                        }
                        onChanged();
                    }
                } else if (!trackingSettings.uintListValues_.isEmpty()) {
                    boolean zIsEmpty = this.uintListValuesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.uintListValuesBuilder_ = null;
                        this.uintListValues_ = trackingSettings.uintListValues_;
                        this.bitField0_ &= -3;
                        this.uintListValuesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUintListValuesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(trackingSettings.uintListValues_);
                    }
                }
                mergeUnknownFields(trackingSettings.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeUintListValues(int i14) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureUintListValuesIsMutable();
                this.uintListValues_.remove(i14);
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

            public Builder setSettingsVersion(int i14) {
                this.settingsVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUintListValues(int i14, UintListSettingValue.Builder builder) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureUintListValuesIsMutable();
                this.uintListValues_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TrackingSettings getDefaultInstanceForType() {
                return TrackingSettings.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.uintListValues_ = Collections.EMPTY_LIST;
            }

            public UintListSettingValue.Builder addUintListValuesBuilder(int i14) {
                return (UintListSettingValue.Builder) getUintListValuesFieldBuilder().addBuilder(i14, UintListSettingValue.getDefaultInstance());
            }

            public Builder addUintListValues(int i14, UintListSettingValue uintListSettingValue) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    uintListSettingValue.getClass();
                    ensureUintListValuesIsMutable();
                    this.uintListValues_.add(i14, uintListSettingValue);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, uintListSettingValue);
                return this;
            }

            public Builder setUintListValues(int i14, UintListSettingValue uintListSettingValue) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    uintListSettingValue.getClass();
                    ensureUintListValuesIsMutable();
                    this.uintListValues_.set(i14, uintListSettingValue);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, uintListSettingValue);
                return this;
            }

            public Builder addUintListValues(UintListSettingValue uintListSettingValue) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    uintListSettingValue.getClass();
                    ensureUintListValuesIsMutable();
                    this.uintListValues_.add(uintListSettingValue);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(uintListSettingValue);
                return this;
            }

            public Builder addUintListValues(int i14, UintListSettingValue.Builder builder) {
                RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUintListValuesIsMutable();
                    this.uintListValues_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingSettings) {
                    return mergeFrom((TrackingSettings) message);
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
                                    this.settingsVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    UintListSettingValue uintListSettingValue = (UintListSettingValue) codedInputStream.readMessage(UintListSettingValue.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<UintListSettingValue, UintListSettingValue.Builder, UintListSettingValueOrBuilder> repeatedFieldBuilderV3 = this.uintListValuesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureUintListValuesIsMutable();
                                        this.uintListValues_.add(uintListSettingValue);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uintListSettingValue);
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
        public TrackingSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private TrackingSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.settingsVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingSettings parseFrom(InputStream inputStream) {
            return (TrackingSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackingSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ TrackingSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrackingSettings parseFrom(CodedInputStream codedInputStream) {
            return (TrackingSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackingStateResponse extends GeneratedMessageV3 implements TrackingStateResponseOrBuilder {
        private static final TrackingStateResponse DEFAULT_INSTANCE = new TrackingStateResponse();

        @Deprecated
        public static final Parser<TrackingStateResponse> PARSER = new AbstractParser<TrackingStateResponse>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponse.1
            @Override // com.google.protobuf.Parser
            public TrackingStateResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingStateResponse.newBuilder();
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
        public static final int SESSION_INFO_FIELD_NUMBER = 5;
        public static final int SESSION_UUID_FIELD_NUMBER = 4;
        public static final int SETTINGS_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TRACKING_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private TrackingSessionInfo sessionInfo_;
        private GDIDataTypes.UUID sessionUuid_;
        private TrackingSettings settings_;
        private int status_;
        private int tracking_;

        private TrackingStateResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.tracking_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingStateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_descriptor;
        }

        public static Builder newBuilder(TrackingStateResponse trackingStateResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingStateResponse);
        }

        public static TrackingStateResponse parseDelimitedFrom(InputStream inputStream) {
            return (TrackingStateResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingStateResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingStateResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingStateResponse)) {
                return super.equals(obj);
            }
            TrackingStateResponse trackingStateResponse = (TrackingStateResponse) obj;
            if (hasStatus() != trackingStateResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != trackingStateResponse.status_) || hasTracking() != trackingStateResponse.hasTracking()) {
                return false;
            }
            if ((hasTracking() && this.tracking_ != trackingStateResponse.tracking_) || hasSettings() != trackingStateResponse.hasSettings()) {
                return false;
            }
            if ((hasSettings() && !getSettings().equals(trackingStateResponse.getSettings())) || hasSessionUuid() != trackingStateResponse.hasSessionUuid()) {
                return false;
            }
            if ((!hasSessionUuid() || getSessionUuid().equals(trackingStateResponse.getSessionUuid())) && hasSessionInfo() == trackingStateResponse.hasSessionInfo()) {
                return (!hasSessionInfo() || getSessionInfo().equals(trackingStateResponse.getSessionInfo())) && getUnknownFields().equals(trackingStateResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingStateResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.tracking_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getSettings());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, getSessionUuid());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, getSessionInfo());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public TrackingSessionInfo getSessionInfo() {
            TrackingSessionInfo trackingSessionInfo = this.sessionInfo_;
            return trackingSessionInfo == null ? TrackingSessionInfo.getDefaultInstance() : trackingSessionInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public TrackingSessionInfoOrBuilder getSessionInfoOrBuilder() {
            TrackingSessionInfo trackingSessionInfo = this.sessionInfo_;
            return trackingSessionInfo == null ? TrackingSessionInfo.getDefaultInstance() : trackingSessionInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public GDIDataTypes.UUID getSessionUuid() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public TrackingSettings getSettings() {
            TrackingSettings trackingSettings = this.settings_;
            return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public TrackingSettingsOrBuilder getSettingsOrBuilder() {
            TrackingSettings trackingSettings = this.settings_;
            return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public TrackingState getTracking() {
            TrackingState trackingStateForNumber = TrackingState.forNumber(this.tracking_);
            return trackingStateForNumber == null ? TrackingState.TRACKING_STATE_OFF : trackingStateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public boolean hasSessionInfo() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public boolean hasSessionUuid() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
        public boolean hasTracking() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasTracking()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.tracking_;
            }
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSettings().hashCode();
            }
            if (hasSessionUuid()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSessionUuid().hashCode();
            }
            if (hasSessionInfo()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSessionInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingStateResponse.class, Builder.class);
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
            if (hasSettings() && !getSettings().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSessionUuid() && !getSessionUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSessionInfo() || getSessionInfo().isInitialized()) {
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
            return new TrackingStateResponse();
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
                codedOutputStream.writeEnum(2, this.tracking_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSettings());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSessionUuid());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSessionInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingStateResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> sessionInfoBuilder_;
            private TrackingSessionInfo sessionInfo_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> sessionUuidBuilder_;
            private GDIDataTypes.UUID sessionUuid_;
            private SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> settingsBuilder_;
            private TrackingSettings settings_;
            private int status_;
            private int tracking_;

            private Builder() {
                this.status_ = 0;
                this.tracking_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TrackingStateResponse trackingStateResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    trackingStateResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    trackingStateResponse.tracking_ = this.tracking_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    trackingStateResponse.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (TrackingSettings) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.sessionUuidBuilder_;
                    trackingStateResponse.sessionUuid_ = singleFieldBuilderV4 == null ? this.sessionUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV4.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV5 = this.sessionInfoBuilder_;
                    trackingStateResponse.sessionInfo_ = singleFieldBuilderV5 == null ? this.sessionInfo_ : (TrackingSessionInfo) singleFieldBuilderV5.build();
                    i14 |= 16;
                }
                trackingStateResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_descriptor;
            }

            private SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> getSessionInfoFieldBuilder() {
                if (this.sessionInfoBuilder_ == null) {
                    this.sessionInfoBuilder_ = new SingleFieldBuilderV3<>(getSessionInfo(), getParentForChildren(), isClean());
                    this.sessionInfo_ = null;
                }
                return this.sessionInfoBuilder_;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getSessionUuidFieldBuilder() {
                if (this.sessionUuidBuilder_ == null) {
                    this.sessionUuidBuilder_ = new SingleFieldBuilderV3<>(getSessionUuid(), getParentForChildren(), isClean());
                    this.sessionUuid_ = null;
                }
                return this.sessionUuidBuilder_;
            }

            private SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                    getSessionUuidFieldBuilder();
                    getSessionInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingStateResponse build() {
                TrackingStateResponse trackingStateResponseBuildPartial = buildPartial();
                if (trackingStateResponseBuildPartial.isInitialized()) {
                    return trackingStateResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingStateResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingStateResponse buildPartial() {
                TrackingStateResponse trackingStateResponse = new TrackingStateResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingStateResponse);
                }
                onBuilt();
                return trackingStateResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.tracking_ = 1;
                this.settings_ = null;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                this.sessionInfo_ = null;
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV5 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.sessionInfoBuilder_ = null;
                }
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

            public Builder clearSessionInfo() {
                this.bitField0_ &= -17;
                this.sessionInfo_ = null;
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSessionUuid() {
                this.bitField0_ &= -9;
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettings() {
                this.bitField0_ &= -5;
                this.settings_ = null;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTracking() {
                this.bitField0_ &= -3;
                this.tracking_ = 1;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public TrackingSessionInfo getSessionInfo() {
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSessionInfo) singleFieldBuilderV3.getMessage();
                }
                TrackingSessionInfo trackingSessionInfo = this.sessionInfo_;
                return trackingSessionInfo == null ? TrackingSessionInfo.getDefaultInstance() : trackingSessionInfo;
            }

            public TrackingSessionInfo.Builder getSessionInfoBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (TrackingSessionInfo.Builder) getSessionInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public TrackingSessionInfoOrBuilder getSessionInfoOrBuilder() {
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSessionInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingSessionInfo trackingSessionInfo = this.sessionInfo_;
                return trackingSessionInfo == null ? TrackingSessionInfo.getDefaultInstance() : trackingSessionInfo;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public GDIDataTypes.UUID getSessionUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getSessionUuidBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getSessionUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public TrackingSettings getSettings() {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSettings) singleFieldBuilderV3.getMessage();
                }
                TrackingSettings trackingSettings = this.settings_;
                return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
            }

            public TrackingSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (TrackingSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public TrackingSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingSettings trackingSettings = this.settings_;
                return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public TrackingState getTracking() {
                TrackingState trackingStateForNumber = TrackingState.forNumber(this.tracking_);
                return trackingStateForNumber == null ? TrackingState.TRACKING_STATE_OFF : trackingStateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public boolean hasSessionInfo() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public boolean hasSessionUuid() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponseOrBuilder
            public boolean hasTracking() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStateResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingStateResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasStatus()) {
                    return false;
                }
                if (hasSettings() && !getSettings().isInitialized()) {
                    return false;
                }
                if (!hasSessionUuid() || getSessionUuid().isInitialized()) {
                    return !hasSessionInfo() || getSessionInfo().isInitialized();
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
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (TrackingState.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.tracking_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSessionUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getSessionInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSessionInfo(TrackingSessionInfo trackingSessionInfo) {
                TrackingSessionInfo trackingSessionInfo2;
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingSessionInfo);
                } else if ((this.bitField0_ & 16) == 0 || (trackingSessionInfo2 = this.sessionInfo_) == null || trackingSessionInfo2 == TrackingSessionInfo.getDefaultInstance()) {
                    this.sessionInfo_ = trackingSessionInfo;
                } else {
                    getSessionInfoBuilder().mergeFrom(trackingSessionInfo);
                }
                if (this.sessionInfo_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSessionUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 8) == 0 || (uuid2 = this.sessionUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.sessionUuid_ = uuid;
                } else {
                    getSessionUuidBuilder().mergeFrom(uuid);
                }
                if (this.sessionUuid_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettings(TrackingSettings trackingSettings) {
                TrackingSettings trackingSettings2;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingSettings);
                } else if ((this.bitField0_ & 4) == 0 || (trackingSettings2 = this.settings_) == null || trackingSettings2 == TrackingSettings.getDefaultInstance()) {
                    this.settings_ = trackingSettings;
                } else {
                    getSettingsBuilder().mergeFrom(trackingSettings);
                }
                if (this.settings_ != null) {
                    this.bitField0_ |= 4;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionInfo(TrackingSessionInfo.Builder builder) {
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSessionUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionUuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSettings(TrackingSettings.Builder builder) {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
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

            public Builder setTracking(TrackingState trackingState) {
                trackingState.getClass();
                this.bitField0_ |= 2;
                this.tracking_ = trackingState.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TrackingStateResponse getDefaultInstanceForType() {
                return TrackingStateResponse.getDefaultInstance();
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
                this.tracking_ = 1;
                maybeForceBuilderInitialization();
            }

            public Builder setSessionInfo(TrackingSessionInfo trackingSessionInfo) {
                SingleFieldBuilderV3<TrackingSessionInfo, TrackingSessionInfo.Builder, TrackingSessionInfoOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingSessionInfo.getClass();
                    this.sessionInfo_ = trackingSessionInfo;
                } else {
                    singleFieldBuilderV3.setMessage(trackingSessionInfo);
                }
                this.bitField0_ |= 16;
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
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSettings(TrackingSettings trackingSettings) {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingSettings.getClass();
                    this.settings_ = trackingSettings;
                } else {
                    singleFieldBuilderV3.setMessage(trackingSettings);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingStateResponse) {
                    return mergeFrom((TrackingStateResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingStateResponse trackingStateResponse) {
                if (trackingStateResponse == TrackingStateResponse.getDefaultInstance()) {
                    return this;
                }
                if (trackingStateResponse.hasStatus()) {
                    setStatus(trackingStateResponse.getStatus());
                }
                if (trackingStateResponse.hasTracking()) {
                    setTracking(trackingStateResponse.getTracking());
                }
                if (trackingStateResponse.hasSettings()) {
                    mergeSettings(trackingStateResponse.getSettings());
                }
                if (trackingStateResponse.hasSessionUuid()) {
                    mergeSessionUuid(trackingStateResponse.getSessionUuid());
                }
                if (trackingStateResponse.hasSessionInfo()) {
                    mergeSessionInfo(trackingStateResponse.getSessionInfo());
                }
                mergeUnknownFields(trackingStateResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingStateResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingStateResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStateResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingStateResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrackingStateResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingStateResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingStateResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ TrackingStateResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrackingStateResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private TrackingStateResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.tracking_ = 1;
        }

        public static TrackingStateResponse parseFrom(InputStream inputStream) {
            return (TrackingStateResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackingStateResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStateResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingStateResponse parseFrom(CodedInputStream codedInputStream) {
            return (TrackingStateResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingStateResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStateResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            GENERIC_ERROR(2);

            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingStateResponse.Status.1
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
                    return UNKNOWN_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return GENERIC_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TrackingStateResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class TrackingStatusNotification extends GeneratedMessageV3 implements TrackingStatusNotificationOrBuilder {
        private static final TrackingStatusNotification DEFAULT_INSTANCE = new TrackingStatusNotification();

        @Deprecated
        public static final Parser<TrackingStatusNotification> PARSER = new AbstractParser<TrackingStatusNotification>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotification.1
            @Override // com.google.protobuf.Parser
            public TrackingStatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingStatusNotification.newBuilder();
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
        public static final int SESSION_UUID_FIELD_NUMBER = 3;
        public static final int SETTINGS_FIELD_NUMBER = 2;
        public static final int TRACKING_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.UUID sessionUuid_;
        private TrackingSettings settings_;
        private int tracking_;

        private TrackingStatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.tracking_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingStatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_descriptor;
        }

        public static Builder newBuilder(TrackingStatusNotification trackingStatusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingStatusNotification);
        }

        public static TrackingStatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (TrackingStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingStatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingStatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingStatusNotification)) {
                return super.equals(obj);
            }
            TrackingStatusNotification trackingStatusNotification = (TrackingStatusNotification) obj;
            if (hasTracking() != trackingStatusNotification.hasTracking()) {
                return false;
            }
            if ((hasTracking() && this.tracking_ != trackingStatusNotification.tracking_) || hasSettings() != trackingStatusNotification.hasSettings()) {
                return false;
            }
            if ((!hasSettings() || getSettings().equals(trackingStatusNotification.getSettings())) && hasSessionUuid() == trackingStatusNotification.hasSessionUuid()) {
                return (!hasSessionUuid() || getSessionUuid().equals(trackingStatusNotification.getSessionUuid())) && getUnknownFields().equals(trackingStatusNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingStatusNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.tracking_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getSettings());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getSessionUuid());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
        public GDIDataTypes.UUID getSessionUuid() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
        public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
        public TrackingSettings getSettings() {
            TrackingSettings trackingSettings = this.settings_;
            return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
        public TrackingSettingsOrBuilder getSettingsOrBuilder() {
            TrackingSettings trackingSettings = this.settings_;
            return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
        public TrackingState getTracking() {
            TrackingState trackingStateForNumber = TrackingState.forNumber(this.tracking_);
            return trackingStateForNumber == null ? TrackingState.TRACKING_STATE_OFF : trackingStateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
        public boolean hasSessionUuid() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
        public boolean hasTracking() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTracking()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.tracking_;
            }
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSettings().hashCode();
            }
            if (hasSessionUuid()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSessionUuid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingStatusNotification.class, Builder.class);
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
            if (!hasTracking()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSettings() && !getSettings().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSessionUuid() || getSessionUuid().isInitialized()) {
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
            return new TrackingStatusNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.tracking_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSettings());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSessionUuid());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingStatusNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> sessionUuidBuilder_;
            private GDIDataTypes.UUID sessionUuid_;
            private SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> settingsBuilder_;
            private TrackingSettings settings_;
            private int tracking_;

            private Builder() {
                this.tracking_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TrackingStatusNotification trackingStatusNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    trackingStatusNotification.tracking_ = this.tracking_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    trackingStatusNotification.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (TrackingSettings) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.sessionUuidBuilder_;
                    trackingStatusNotification.sessionUuid_ = singleFieldBuilderV4 == null ? this.sessionUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV4.build();
                    i14 |= 4;
                }
                trackingStatusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getSessionUuidFieldBuilder() {
                if (this.sessionUuidBuilder_ == null) {
                    this.sessionUuidBuilder_ = new SingleFieldBuilderV3<>(getSessionUuid(), getParentForChildren(), isClean());
                    this.sessionUuid_ = null;
                }
                return this.sessionUuidBuilder_;
            }

            private SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                    getSessionUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingStatusNotification build() {
                TrackingStatusNotification trackingStatusNotificationBuildPartial = buildPartial();
                if (trackingStatusNotificationBuildPartial.isInitialized()) {
                    return trackingStatusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingStatusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingStatusNotification buildPartial() {
                TrackingStatusNotification trackingStatusNotification = new TrackingStatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingStatusNotification);
                }
                onBuilt();
                return trackingStatusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.tracking_ = 1;
                this.settings_ = null;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.sessionUuidBuilder_ = null;
                }
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

            public Builder clearSessionUuid() {
                this.bitField0_ &= -5;
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettings() {
                this.bitField0_ &= -3;
                this.settings_ = null;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTracking() {
                this.bitField0_ &= -2;
                this.tracking_ = 1;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
            public GDIDataTypes.UUID getSessionUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getSessionUuidBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getSessionUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
            public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
            public TrackingSettings getSettings() {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSettings) singleFieldBuilderV3.getMessage();
                }
                TrackingSettings trackingSettings = this.settings_;
                return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
            }

            public TrackingSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (TrackingSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
            public TrackingSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackingSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackingSettings trackingSettings = this.settings_;
                return trackingSettings == null ? TrackingSettings.getDefaultInstance() : trackingSettings;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
            public TrackingState getTracking() {
                TrackingState trackingStateForNumber = TrackingState.forNumber(this.tracking_);
                return trackingStateForNumber == null ? TrackingState.TRACKING_STATE_OFF : trackingStateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
            public boolean hasSessionUuid() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingStatusNotificationOrBuilder
            public boolean hasTracking() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingStatusNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasTracking()) {
                    return false;
                }
                if (!hasSettings() || getSettings().isInitialized()) {
                    return !hasSessionUuid() || getSessionUuid().isInitialized();
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
                                    if (TrackingState.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.tracking_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSessionUuidFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSessionUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 4) == 0 || (uuid2 = this.sessionUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.sessionUuid_ = uuid;
                } else {
                    getSessionUuidBuilder().mergeFrom(uuid);
                }
                if (this.sessionUuid_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettings(TrackingSettings trackingSettings) {
                TrackingSettings trackingSettings2;
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackingSettings);
                } else if ((this.bitField0_ & 2) == 0 || (trackingSettings2 = this.settings_) == null || trackingSettings2 == TrackingSettings.getDefaultInstance()) {
                    this.settings_ = trackingSettings;
                } else {
                    getSettingsBuilder().mergeFrom(trackingSettings);
                }
                if (this.settings_ != null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSettings(TrackingSettings.Builder builder) {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTracking(TrackingState trackingState) {
                trackingState.getClass();
                this.bitField0_ |= 1;
                this.tracking_ = trackingState.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TrackingStatusNotification getDefaultInstanceForType() {
                return TrackingStatusNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.tracking_ = 1;
                maybeForceBuilderInitialization();
            }

            public Builder setSessionUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.sessionUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSettings(TrackingSettings trackingSettings) {
                SingleFieldBuilderV3<TrackingSettings, TrackingSettings.Builder, TrackingSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackingSettings.getClass();
                    this.settings_ = trackingSettings;
                } else {
                    singleFieldBuilderV3.setMessage(trackingSettings);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingStatusNotification) {
                    return mergeFrom((TrackingStatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingStatusNotification trackingStatusNotification) {
                if (trackingStatusNotification == TrackingStatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (trackingStatusNotification.hasTracking()) {
                    setTracking(trackingStatusNotification.getTracking());
                }
                if (trackingStatusNotification.hasSettings()) {
                    mergeSettings(trackingStatusNotification.getSettings());
                }
                if (trackingStatusNotification.hasSessionUuid()) {
                    mergeSessionUuid(trackingStatusNotification.getSessionUuid());
                }
                mergeUnknownFields(trackingStatusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingStatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingStatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingStatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ TrackingStatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrackingStatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TrackingStatusNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.tracking_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingStatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingStatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingStatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackingStatusNotification parseFrom(InputStream inputStream) {
            return (TrackingStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackingStatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingStatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (TrackingStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingStatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrackingSubscribeResponse extends GeneratedMessageV3 implements TrackingSubscribeResponseOrBuilder {
        private static final TrackingSubscribeResponse DEFAULT_INSTANCE = new TrackingSubscribeResponse();

        @Deprecated
        public static final Parser<TrackingSubscribeResponse> PARSER = new AbstractParser<TrackingSubscribeResponse>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeResponse.1
            @Override // com.google.protobuf.Parser
            public TrackingSubscribeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrackingSubscribeResponse.newBuilder();
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

        private TrackingSubscribeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrackingSubscribeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_descriptor;
        }

        public static Builder newBuilder(TrackingSubscribeResponse trackingSubscribeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trackingSubscribeResponse);
        }

        public static TrackingSubscribeResponse parseDelimitedFrom(InputStream inputStream) {
            return (TrackingSubscribeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrackingSubscribeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrackingSubscribeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingSubscribeResponse)) {
                return super.equals(obj);
            }
            TrackingSubscribeResponse trackingSubscribeResponse = (TrackingSubscribeResponse) obj;
            if (hasStatus() != trackingSubscribeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == trackingSubscribeResponse.status_) && getUnknownFields().equals(trackingSubscribeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrackingSubscribeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.OK : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeResponseOrBuilder
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
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSubscribeResponse.class, Builder.class);
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
            return new TrackingSubscribeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingSubscribeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(TrackingSubscribeResponse trackingSubscribeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    trackingSubscribeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                trackingSubscribeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSubscribeResponse build() {
                TrackingSubscribeResponse trackingSubscribeResponseBuildPartial = buildPartial();
                if (trackingSubscribeResponseBuildPartial.isInitialized()) {
                    return trackingSubscribeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trackingSubscribeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrackingSubscribeResponse buildPartial() {
                TrackingSubscribeResponse trackingSubscribeResponse = new TrackingSubscribeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trackingSubscribeResponse);
                }
                onBuilt();
                return trackingSubscribeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.OK : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_TrackingSubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingSubscribeResponse.class, Builder.class);
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
            public TrackingSubscribeResponse getDefaultInstanceForType() {
                return TrackingSubscribeResponse.getDefaultInstance();
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
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrackingSubscribeResponse) {
                    return mergeFrom((TrackingSubscribeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrackingSubscribeResponse trackingSubscribeResponse) {
                if (trackingSubscribeResponse == TrackingSubscribeResponse.getDefaultInstance()) {
                    return this;
                }
                if (trackingSubscribeResponse.hasStatus()) {
                    setStatus(trackingSubscribeResponse.getStatus());
                }
                mergeUnknownFields(trackingSubscribeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrackingSubscribeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrackingSubscribeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSubscribeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingSubscribeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ TrackingSubscribeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrackingSubscribeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TrackingSubscribeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrackingSubscribeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrackingSubscribeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrackingSubscribeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrackingSubscribeResponse parseFrom(InputStream inputStream) {
            return (TrackingSubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrackingSubscribeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrackingSubscribeResponse parseFrom(CodedInputStream codedInputStream) {
            return (TrackingSubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrackingSubscribeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrackingSubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            OK(1),
            GENERIC_ERROR(2);

            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int OK_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingSubscribeResponse.Status.1
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
                return GENERIC_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TrackingSubscribeResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UintListSettingValue extends GeneratedMessageV3 implements UintListSettingValueOrBuilder {
        private static final UintListSettingValue DEFAULT_INSTANCE = new UintListSettingValue();

        @Deprecated
        public static final Parser<UintListSettingValue> PARSER = new AbstractParser<UintListSettingValue>() { // from class: com.garmin.proto.generated.GDIInReachTracking.UintListSettingValue.1
            @Override // com.google.protobuf.Parser
            public UintListSettingValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UintListSettingValue.newBuilder();
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
        public static final int SETTING_FIELD_NUMBER = 1;
        public static final int SPECIAL_FIELD_NUMBER = 3;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int setting_;
        private int special_;
        private int value_;

        private UintListSettingValue(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.setting_ = 1;
            this.value_ = 0;
            this.special_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UintListSettingValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_UintListSettingValue_descriptor;
        }

        public static Builder newBuilder(UintListSettingValue uintListSettingValue) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uintListSettingValue);
        }

        public static UintListSettingValue parseDelimitedFrom(InputStream inputStream) {
            return (UintListSettingValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UintListSettingValue parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UintListSettingValue> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UintListSettingValue)) {
                return super.equals(obj);
            }
            UintListSettingValue uintListSettingValue = (UintListSettingValue) obj;
            if (hasSetting() != uintListSettingValue.hasSetting()) {
                return false;
            }
            if ((hasSetting() && this.setting_ != uintListSettingValue.setting_) || hasValue() != uintListSettingValue.hasValue()) {
                return false;
            }
            if ((!hasValue() || getValue() == uintListSettingValue.getValue()) && hasSpecial() == uintListSettingValue.hasSpecial()) {
                return (!hasSpecial() || this.special_ == uintListSettingValue.special_) && getUnknownFields().equals(uintListSettingValue.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UintListSettingValue> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.setting_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.value_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.special_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
        public UintListSetting getSetting() {
            UintListSetting uintListSettingForNumber = UintListSetting.forNumber(this.setting_);
            return uintListSettingForNumber == null ? UintListSetting.MOVING_INTERVAL : uintListSettingForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
        public UintListSettingSpecialValue getSpecial() {
            UintListSettingSpecialValue uintListSettingSpecialValueForNumber = UintListSettingSpecialValue.forNumber(this.special_);
            return uintListSettingSpecialValueForNumber == null ? UintListSettingSpecialValue.MOVING_INTERVAL_OFF : uintListSettingSpecialValueForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
        public int getValue() {
            return this.value_;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
        public boolean hasSetting() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
        public boolean hasSpecial() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSetting()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.setting_;
            }
            if (hasValue()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getValue();
            }
            if (hasSpecial()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.special_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_UintListSettingValue_fieldAccessorTable.ensureFieldAccessorsInitialized(UintListSettingValue.class, Builder.class);
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
            if (hasSetting()) {
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
            return new UintListSettingValue();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.setting_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.value_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.special_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UintListSettingValueOrBuilder {
            private int bitField0_;
            private int setting_;
            private int special_;
            private int value_;

            private Builder() {
                this.setting_ = 1;
                this.special_ = 1;
            }

            private void buildPartial0(UintListSettingValue uintListSettingValue) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uintListSettingValue.setting_ = this.setting_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uintListSettingValue.value_ = this.value_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    uintListSettingValue.special_ = this.special_;
                    i14 |= 4;
                }
                uintListSettingValue.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_UintListSettingValue_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UintListSettingValue build() {
                UintListSettingValue uintListSettingValueBuildPartial = buildPartial();
                if (uintListSettingValueBuildPartial.isInitialized()) {
                    return uintListSettingValueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uintListSettingValueBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UintListSettingValue buildPartial() {
                UintListSettingValue uintListSettingValue = new UintListSettingValue(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uintListSettingValue);
                }
                onBuilt();
                return uintListSettingValue;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.setting_ = 1;
                this.value_ = 0;
                this.special_ = 1;
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

            public Builder clearSetting() {
                this.bitField0_ &= -2;
                this.setting_ = 1;
                onChanged();
                return this;
            }

            public Builder clearSpecial() {
                this.bitField0_ &= -5;
                this.special_ = 1;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= -3;
                this.value_ = 0;
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
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_UintListSettingValue_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
            public UintListSetting getSetting() {
                UintListSetting uintListSettingForNumber = UintListSetting.forNumber(this.setting_);
                return uintListSettingForNumber == null ? UintListSetting.MOVING_INTERVAL : uintListSettingForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
            public UintListSettingSpecialValue getSpecial() {
                UintListSettingSpecialValue uintListSettingSpecialValueForNumber = UintListSettingSpecialValue.forNumber(this.special_);
                return uintListSettingSpecialValueForNumber == null ? UintListSettingSpecialValue.MOVING_INTERVAL_OFF : uintListSettingSpecialValueForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
            public int getValue() {
                return this.value_;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
            public boolean hasSetting() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
            public boolean hasSpecial() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachTracking.UintListSettingValueOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachTracking.internal_static_GDI_Proto_InReachTracking_UintListSettingValue_fieldAccessorTable.ensureFieldAccessorsInitialized(UintListSettingValue.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSetting();
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
                                    if (UintListSetting.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.setting_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.value_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (UintListSettingSpecialValue.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.special_ = i15;
                                        this.bitField0_ |= 4;
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

            public Builder setSetting(UintListSetting uintListSetting) {
                uintListSetting.getClass();
                this.bitField0_ |= 1;
                this.setting_ = uintListSetting.getNumber();
                onChanged();
                return this;
            }

            public Builder setSpecial(UintListSettingSpecialValue uintListSettingSpecialValue) {
                uintListSettingSpecialValue.getClass();
                this.bitField0_ |= 4;
                this.special_ = uintListSettingSpecialValue.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setValue(int i14) {
                this.value_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UintListSettingValue getDefaultInstanceForType() {
                return UintListSettingValue.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.setting_ = 1;
                this.special_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UintListSettingValue) {
                    return mergeFrom((UintListSettingValue) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UintListSettingValue uintListSettingValue) {
                if (uintListSettingValue == UintListSettingValue.getDefaultInstance()) {
                    return this;
                }
                if (uintListSettingValue.hasSetting()) {
                    setSetting(uintListSettingValue.getSetting());
                }
                if (uintListSettingValue.hasValue()) {
                    setValue(uintListSettingValue.getValue());
                }
                if (uintListSettingValue.hasSpecial()) {
                    setSpecial(uintListSettingValue.getSpecial());
                }
                mergeUnknownFields(uintListSettingValue.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UintListSettingValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UintListSettingValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UintListSettingValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UintListSettingValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UintListSettingValue parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UintListSettingValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UintListSettingValue parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UintListSettingValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UintListSettingValue parseFrom(InputStream inputStream) {
            return (UintListSettingValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ UintListSettingValue(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private UintListSettingValue() {
            this.value_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.setting_ = 1;
            this.special_ = 1;
        }

        public static UintListSettingValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UintListSettingValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UintListSettingValue parseFrom(CodedInputStream codedInputStream) {
            return (UintListSettingValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UintListSettingValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UintListSettingValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum SettingError implements ProtocolMessageEnum {
        SETTING_ERROR_UNKNOWN(0),
        SETTING_ERROR_OK(1),
        SETTING_ERROR_GENERIC(2),
        SETTING_ERROR_UNKNOWN_SETTING(3),
        SETTING_ERROR_UNAVAILABLE_SETTING(4),
        SETTING_ERROR_ILLEGAL_VALUE(5);

        public static final int SETTING_ERROR_GENERIC_VALUE = 2;
        public static final int SETTING_ERROR_ILLEGAL_VALUE_VALUE = 5;
        public static final int SETTING_ERROR_OK_VALUE = 1;
        public static final int SETTING_ERROR_UNAVAILABLE_SETTING_VALUE = 4;
        public static final int SETTING_ERROR_UNKNOWN_SETTING_VALUE = 3;
        public static final int SETTING_ERROR_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<SettingError> internalValueMap = new Internal.EnumLiteMap<SettingError>() { // from class: com.garmin.proto.generated.GDIInReachTracking.SettingError.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SettingError findValueByNumber(int i14) {
                return SettingError.forNumber(i14);
            }
        };
        private static final SettingError[] VALUES = values();

        SettingError(int i14) {
            this.value = i14;
        }

        public static SettingError forNumber(int i14) {
            if (i14 == 0) {
                return SETTING_ERROR_UNKNOWN;
            }
            if (i14 == 1) {
                return SETTING_ERROR_OK;
            }
            if (i14 == 2) {
                return SETTING_ERROR_GENERIC;
            }
            if (i14 == 3) {
                return SETTING_ERROR_UNKNOWN_SETTING;
            }
            if (i14 == 4) {
                return SETTING_ERROR_UNAVAILABLE_SETTING;
            }
            if (i14 != 5) {
                return null;
            }
            return SETTING_ERROR_ILLEGAL_VALUE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachTracking.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<SettingError> internalGetValueMap() {
            return internalValueMap;
        }

        public static SettingError valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SettingError valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum TrackingState implements ProtocolMessageEnum {
        TRACKING_STATE_OFF(1),
        TRACKING_STATE_NORMAL(2),
        TRACKING_STATE_EMERGENCY(3);

        public static final int TRACKING_STATE_EMERGENCY_VALUE = 3;
        public static final int TRACKING_STATE_NORMAL_VALUE = 2;
        public static final int TRACKING_STATE_OFF_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<TrackingState> internalValueMap = new Internal.EnumLiteMap<TrackingState>() { // from class: com.garmin.proto.generated.GDIInReachTracking.TrackingState.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TrackingState findValueByNumber(int i14) {
                return TrackingState.forNumber(i14);
            }
        };
        private static final TrackingState[] VALUES = values();

        TrackingState(int i14) {
            this.value = i14;
        }

        public static TrackingState forNumber(int i14) {
            if (i14 == 1) {
                return TRACKING_STATE_OFF;
            }
            if (i14 == 2) {
                return TRACKING_STATE_NORMAL;
            }
            if (i14 != 3) {
                return null;
            }
            return TRACKING_STATE_EMERGENCY;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachTracking.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<TrackingState> internalGetValueMap() {
            return internalValueMap;
        }

        public static TrackingState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static TrackingState valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum UintListSetting implements ProtocolMessageEnum {
        MOVING_INTERVAL(1),
        RESTING_INTERVAL(2),
        RESTING_DISTANCE(3);

        public static final int MOVING_INTERVAL_VALUE = 1;
        public static final int RESTING_DISTANCE_VALUE = 3;
        public static final int RESTING_INTERVAL_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<UintListSetting> internalValueMap = new Internal.EnumLiteMap<UintListSetting>() { // from class: com.garmin.proto.generated.GDIInReachTracking.UintListSetting.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public UintListSetting findValueByNumber(int i14) {
                return UintListSetting.forNumber(i14);
            }
        };
        private static final UintListSetting[] VALUES = values();

        UintListSetting(int i14) {
            this.value = i14;
        }

        public static UintListSetting forNumber(int i14) {
            if (i14 == 1) {
                return MOVING_INTERVAL;
            }
            if (i14 == 2) {
                return RESTING_INTERVAL;
            }
            if (i14 != 3) {
                return null;
            }
            return RESTING_DISTANCE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachTracking.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<UintListSetting> internalGetValueMap() {
            return internalValueMap;
        }

        public static UintListSetting valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static UintListSetting valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum UintListSettingSpecialValue implements ProtocolMessageEnum {
        MOVING_INTERVAL_OFF(1),
        RESTING_INTERVAL_SAME_AS_MOVING(2),
        RESTING_DISTANCE_OFF(3);

        public static final int MOVING_INTERVAL_OFF_VALUE = 1;
        public static final int RESTING_DISTANCE_OFF_VALUE = 3;
        public static final int RESTING_INTERVAL_SAME_AS_MOVING_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<UintListSettingSpecialValue> internalValueMap = new Internal.EnumLiteMap<UintListSettingSpecialValue>() { // from class: com.garmin.proto.generated.GDIInReachTracking.UintListSettingSpecialValue.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public UintListSettingSpecialValue findValueByNumber(int i14) {
                return UintListSettingSpecialValue.forNumber(i14);
            }
        };
        private static final UintListSettingSpecialValue[] VALUES = values();

        UintListSettingSpecialValue(int i14) {
            this.value = i14;
        }

        public static UintListSettingSpecialValue forNumber(int i14) {
            if (i14 == 1) {
                return MOVING_INTERVAL_OFF;
            }
            if (i14 == 2) {
                return RESTING_INTERVAL_SAME_AS_MOVING;
            }
            if (i14 != 3) {
                return null;
            }
            return RESTING_DISTANCE_OFF;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachTracking.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<UintListSettingSpecialValue> internalGetValueMap() {
            return internalValueMap;
        }

        public static UintListSettingSpecialValue valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static UintListSettingSpecialValue valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
