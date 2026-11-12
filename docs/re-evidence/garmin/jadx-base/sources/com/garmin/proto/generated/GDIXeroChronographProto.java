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
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXeroChronographProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018GDIXeroChronograph.proto\u0012\u0019GDI.Proto.XeroChronograph\u001a\u0015GDIEventSharing.proto\"ë\u000e\n\u0007Service\u0012M\n\u0015start_session_request\u0018\u0001 \u0001(\u000b2..GDI.Proto.XeroChronograph.StartSessionRequest\u0012O\n\u0016start_session_response\u0018\u0002 \u0001(\u000b2/.GDI.Proto.XeroChronograph.StartSessionResponse\u0012I\n\u0013delete_shot_request\u0018\u0003 \u0001(\u000b2,.GDI.Proto.XeroChronograph.DeleteShotRequest\u0012K\n\u0014delete_shot_response\u0018\u0004 \u0001(\u000b2-.GDI.Proto.XeroChronograph.DeleteShotResponse\u0012J\n\u0013end_session_request\u0018\u0005 \u0001(\u000b2-.GDI.Proto.XeroChronograph.StopSessionRequest\u0012L\n\u0014end_session_response\u0018\u0006 \u0001(\u000b2..GDI.Proto.XeroChronograph.StopSessionResponse\u0012K\n\u0014exclude_shot_request\u0018\u0007 \u0001(\u000b2-.GDI.Proto.XeroChronograph.ExcludeShotRequest\u0012M\n\u0015exclude_shot_response\u0018\b \u0001(\u000b2..GDI.Proto.XeroChronograph.ExcludeShotResponse\u0012E\n\u0011shot_list_request\u0018\t \u0001(\u000b2*.GDI.Proto.XeroChronograph.ShotListRequest\u0012G\n\u0012shot_list_response\u0018\n \u0001(\u000b2+.GDI.Proto.XeroChronograph.ShotListResponse\u0012K\n\u0014session_info_request\u0018\u000b \u0001(\u000b2-.GDI.Proto.XeroChronograph.SessionInfoRequest\u0012M\n\u0015session_info_response\u0018\f \u0001(\u000b2..GDI.Proto.XeroChronograph.SessionInfoResponse\u0012K\n\u0014title_change_request\u0018\r \u0001(\u000b2-.GDI.Proto.XeroChronograph.TitleChangeRequest\u0012M\n\u0015title_change_response\u0018\u000e \u0001(\u000b2..GDI.Proto.XeroChronograph.TitleChangeResponse\u0012Q\n\u0017recent_sessions_request\u0018\u000f \u0001(\u000b20.GDI.Proto.XeroChronograph.RecentSessionsRequest\u0012S\n\u0018recent_sessions_response\u0018\u0010 \u0001(\u000b21.GDI.Proto.XeroChronograph.RecentSessionsResponse\u0012I\n\u0013rearm_radar_request\u0018\u0011 \u0001(\u000b2,.GDI.Proto.XeroChronograph.RearmRadarRequest\u0012K\n\u0014rearm_radar_response\u0018\u0012 \u0001(\u000b2-.GDI.Proto.XeroChronograph.RearmRadarResponse\u0012]\n\u001ddevice_identification_request\u0018\u0013 \u0001(\u000b26.GDI.Proto.XeroChronograph.DeviceIdentificationRequest\u0012_\n\u001edevice_identification_response\u0018\u0014 \u0001(\u000b27.GDI.Proto.XeroChronograph.DeviceIdentificationResponse\u0012E\n\u0011last_shot_request\u0018\u0015 \u0001(\u000b2*.GDI.Proto.XeroChronograph.LastShotRequest\u0012G\n\u0012last_shot_response\u0018\u0016 \u0001(\u000b2+.GDI.Proto.XeroChronograph.LastShotResponse\u0012K\n\u0014radar_status_request\u0018\u0017 \u0001(\u000b2-.GDI.Proto.XeroChronograph.RadarStatusRequest\u0012M\n\u0015radar_status_response\u0018\u0018 \u0001(\u000b2..GDI.Proto.XeroChronograph.RadarStatusResponse\"Æ\u0001\n\u000bShotMessage\u0012\u0016\n\u000eshot_timestamp\u0018\u0001 \u0001(\r\u0012\u0015\n\rshot_velocity\u0018\u0002 \u0001(\u0002\u0012A\n\u0006status\u0018\u0003 \u0001(\u000e21.GDI.Proto.XeroChronograph.ShotMessage.ShotStatus\u0012\u0010\n\bshot_num\u0018\u0004 \u0001(\r\"3\n\nShotStatus\u0012\n\n\u0006NORMAL\u0010\u0000\u0012\f\n\bEXCLUDED\u0010\u0001\u0012\u000b\n\u0007DELETED\u0010\u0002\"ç\u0002\n\u0012SessionInfoMessage\u0012\u0016\n\u000emin_shot_speed\u0018\u0001 \u0001(\u0002\u0012\u0016\n\u000emax_shot_speed\u0018\u0002 \u0001(\u0002\u0012\u0016\n\u000eavg_shot_speed\u0018\u0003 \u0001(\u0002\u0012\u0012\n\nshot_count\u0018\u0004 \u0001(\r\u0012\u0014\n\fgrain_weight\u0018\u0005 \u0001(\u0002\u0012\u0016\n\u000esession_active\u0018\u0006 \u0001(\b\u0012\u001a\n\u0012standard_deviation\u0018\u0007 \u0001(\u0002\u0012\u0012\n\naverage_pf\u0018\b \u0001(\u0002\u0012\u0012\n\naverage_ke\u0018\t \u0001(\u0002\u0012\u0013\n\u000bsessionUUID\u0018\n \u0001(\f\u0012B\n\u000fprojectile_type\u0018\u000b \u0001(\u000e2).GDI.Proto.XeroChronograph.ProjectileType\u0012\u0015\n\rsession_title\u0018\f \u0001(\t\u0012\u0013\n\u000bradar_armed\u0018\r \u0001(\b\"°\u0002\n\u0013StartSessionRequest\u0012B\n\u000fprojectile_type\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ProjectileType\u0012T\n\u000evelocity_range\u0018\u0002 \u0001(\u000e2<.GDI.Proto.XeroChronograph.StartSessionRequest.VelocityRange\u0012\u0013\n\u000bsessionUUID\u0018\u0003 \u0001(\f\u0012\u0015\n\rsession_title\u0018\u0004 \u0001(\t\u0012\u0014\n\fgrain_weight\u0018\u0005 \u0001(\u0002\"=\n\rVelocityRange\u0012\r\n\tLOW_RANGE\u0010\u0000\u0012\r\n\tMID_RANGE\u0010\u0001\u0012\u000e\n\nHIGH_RANGE\u0010\u0002\"f\n\u0014StartSessionResponse\u00129\n\u0006status\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\u0012\u0013\n\u000bsessionUUID\u0018\u0002 \u0001(\f\"-\n\u0012StopSessionRequest\u0012\u0017\n\u000fdiscard_session\u0018\u0001 \u0001(\b\"P\n\u0013StopSessionResponse\u00129\n\u0006status\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"E\n\u0011DeleteShotRequest\u0012\u001b\n\u0013shot_nums_to_delete\u0018\u0001 \u0003(\r\u0012\u0013\n\u000bsessionUUID\u0018\u0002 \u0001(\f\"O\n\u0012DeleteShotResponse\u00129\n\u0006status\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"G\n\u0012ExcludeShotRequest\u0012\u001c\n\u0014shot_nums_to_exclude\u0018\u0001 \u0003(\r\u0012\u0013\n\u000bsessionUUID\u0018\u0002 \u0001(\f\"P\n\u0013ExcludeShotResponse\u00129\n\u0006status\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"\u0011\n\u000fShotListRequest\"\u0088\u0001\n\u0010ShotListResponse\u00129\n\tshot_list\u0018\u0001 \u0003(\u000b2&.GDI.Proto.XeroChronograph.ShotMessage\u00129\n\u0006status\u0018\u0002 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"\u0014\n\u0012SessionInfoRequest\"\u0095\u0001\n\u0013SessionInfoResponse\u0012C\n\fsession_info\u0018\u0001 \u0001(\u000b2-.GDI.Proto.XeroChronograph.SessionInfoMessage\u00129\n\u0006status\u0018\u0002 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"#\n\u0012TitleChangeRequest\u0012\r\n\u0005title\u0018\u0001 \u0001(\t\"P\n\u0013TitleChangeResponse\u00129\n\u0006status\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"j\n\u0015RecentSessionsRequest\u0012\u001d\n\u0015session_request_count\u0018\u0001 \u0001(\r\u0012\u0019\n\u0011start_timestamp_s\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fend_timestamp_s\u0018\u0003 \u0001(\r\"\u009b\u0001\n\u0016RecentSessionsResponse\u00129\n\u0006status\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\u0012F\n\u000frecent_sessions\u0018\u0002 \u0003(\u000b2-.GDI.Proto.XeroChronograph.SessionInfoMessage\"\u0013\n\u0011RearmRadarRequest\"O\n\u0012RearmRadarResponse\u00129\n\u0006status\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"/\n\u001bDeviceIdentificationRequest\u0012\u0010\n\bid_value\u0018\u0001 \u0001(\r\"Y\n\u001cDeviceIdentificationResponse\u00129\n\u0006status\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"\u0011\n\u000fLastShotRequest\"\u0088\u0001\n\u0010LastShotResponse\u00129\n\tlast_shot\u0018\u0001 \u0001(\u000b2&.GDI.Proto.XeroChronograph.ShotMessage\u00129\n\u0006status\u0018\u0002 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"\u0014\n\u0012RadarStatusRequest\"f\n\u0013RadarStatusResponse\u0012\u0014\n\fradar_active\u0018\u0001 \u0001(\b\u00129\n\u0006status\u0018\u0002 \u0001(\u000e2).GDI.Proto.XeroChronograph.ResponseStatus\"\u0088\u0003\n\fAlertDetails\u0012=\n\nalert_type\u0018\u0001 \u0001(\u000e2).GDI.Proto.XeroChronograph.EventAlertType\u0012<\n\fshot_message\u0018\u0002 \u0001(\u000b2&.GDI.Proto.XeroChronograph.ShotMessage\u0012C\n\fsession_info\u0018\u0003 \u0001(\u000b2-.GDI.Proto.XeroChronograph.SessionInfoMessage\u00129\n\tshot_list\u0018\u0004 \u0003(\u000b2&.GDI.Proto.XeroChronograph.ShotMessage\u0012\u0015\n\rbattery_level\u0018\u0005 \u0001(\u00022d\n\u0007details\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ð\u0007 \u0001(\u000b2'.GDI.Proto.XeroChronograph.AlertDetails*N\n\u000eResponseStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u000b\n\u0007SYNCING\u0010\u0001\u0012\u000b\n\u0007FAILURE\u0010\u0002\u0012\u0015\n\u0011DEVICE_NEEDS_FILE\u0010\u0003*Y\n\u000eProjectileType\u0012\t\n\u0005ARROW\u0010\u0000\u0012\t\n\u0005RIFLE\u0010\u0001\u0012\n\n\u0006PISTOL\u0010\u0002\u0012\u000b\n\u0007SHOTGUN\u0010\u0003\u0012\r\n\tAIR_RIFLE\u0010\u0004\u0012\t\n\u0005OTHER\u0010\u0005*\u0083\u0001\n\u000eEventAlertType\u0012\u0013\n\u000fSESSION_STARTED\u0010\u0000\u0012\u0011\n\rSESSION_ENDED\u0010\u0001\u0012\u0010\n\fSHOT_DELETED\u0010\u0002\u0012\u0011\n\rSHOT_EXCLUDED\u0010\u0003\u0012\u0011\n\rSHOT_DETECTED\u0010\u0004\u0012\u0011\n\rRADAR_TIMEOUT\u0010\u0005B7\n\u001acom.garmin.proto.generatedB\u0017GDIXeroChronographProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_AlertDetails_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_AlertDetails_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_LastShotRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_LastShotRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_LastShotResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_LastShotResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_ShotListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_ShotListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_ShotListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_ShotListResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_ShotMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_ShotMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_fieldAccessorTable;

    public interface AlertDetailsOrBuilder extends MessageOrBuilder {
        EventAlertType getAlertType();

        float getBatteryLevel();

        SessionInfoMessage getSessionInfo();

        SessionInfoMessageOrBuilder getSessionInfoOrBuilder();

        ShotMessage getShotList(int i14);

        int getShotListCount();

        List<ShotMessage> getShotListList();

        ShotMessageOrBuilder getShotListOrBuilder(int i14);

        List<? extends ShotMessageOrBuilder> getShotListOrBuilderList();

        ShotMessage getShotMessage();

        ShotMessageOrBuilder getShotMessageOrBuilder();

        boolean hasAlertType();

        boolean hasBatteryLevel();

        boolean hasSessionInfo();

        boolean hasShotMessage();
    }

    public interface DeleteShotRequestOrBuilder extends MessageOrBuilder {
        ByteString getSessionUUID();

        int getShotNumsToDelete(int i14);

        int getShotNumsToDeleteCount();

        List<Integer> getShotNumsToDeleteList();

        boolean hasSessionUUID();
    }

    public interface DeleteShotResponseOrBuilder extends MessageOrBuilder {
        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface DeviceIdentificationRequestOrBuilder extends MessageOrBuilder {
        int getIdValue();

        boolean hasIdValue();
    }

    public interface DeviceIdentificationResponseOrBuilder extends MessageOrBuilder {
        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface ExcludeShotRequestOrBuilder extends MessageOrBuilder {
        ByteString getSessionUUID();

        int getShotNumsToExclude(int i14);

        int getShotNumsToExcludeCount();

        List<Integer> getShotNumsToExcludeList();

        boolean hasSessionUUID();
    }

    public interface ExcludeShotResponseOrBuilder extends MessageOrBuilder {
        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface LastShotRequestOrBuilder extends MessageOrBuilder {
    }

    public interface LastShotResponseOrBuilder extends MessageOrBuilder {
        ShotMessage getLastShot();

        ShotMessageOrBuilder getLastShotOrBuilder();

        ResponseStatus getStatus();

        boolean hasLastShot();

        boolean hasStatus();
    }

    public interface RadarStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface RadarStatusResponseOrBuilder extends MessageOrBuilder {
        boolean getRadarActive();

        ResponseStatus getStatus();

        boolean hasRadarActive();

        boolean hasStatus();
    }

    public interface RearmRadarRequestOrBuilder extends MessageOrBuilder {
    }

    public interface RearmRadarResponseOrBuilder extends MessageOrBuilder {
        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface RecentSessionsRequestOrBuilder extends MessageOrBuilder {
        int getEndTimestampS();

        int getSessionRequestCount();

        int getStartTimestampS();

        boolean hasEndTimestampS();

        boolean hasSessionRequestCount();

        boolean hasStartTimestampS();
    }

    public interface RecentSessionsResponseOrBuilder extends MessageOrBuilder {
        SessionInfoMessage getRecentSessions(int i14);

        int getRecentSessionsCount();

        List<SessionInfoMessage> getRecentSessionsList();

        SessionInfoMessageOrBuilder getRecentSessionsOrBuilder(int i14);

        List<? extends SessionInfoMessageOrBuilder> getRecentSessionsOrBuilderList();

        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        DeleteShotRequest getDeleteShotRequest();

        DeleteShotRequestOrBuilder getDeleteShotRequestOrBuilder();

        DeleteShotResponse getDeleteShotResponse();

        DeleteShotResponseOrBuilder getDeleteShotResponseOrBuilder();

        DeviceIdentificationRequest getDeviceIdentificationRequest();

        DeviceIdentificationRequestOrBuilder getDeviceIdentificationRequestOrBuilder();

        DeviceIdentificationResponse getDeviceIdentificationResponse();

        DeviceIdentificationResponseOrBuilder getDeviceIdentificationResponseOrBuilder();

        StopSessionRequest getEndSessionRequest();

        StopSessionRequestOrBuilder getEndSessionRequestOrBuilder();

        StopSessionResponse getEndSessionResponse();

        StopSessionResponseOrBuilder getEndSessionResponseOrBuilder();

        ExcludeShotRequest getExcludeShotRequest();

        ExcludeShotRequestOrBuilder getExcludeShotRequestOrBuilder();

        ExcludeShotResponse getExcludeShotResponse();

        ExcludeShotResponseOrBuilder getExcludeShotResponseOrBuilder();

        LastShotRequest getLastShotRequest();

        LastShotRequestOrBuilder getLastShotRequestOrBuilder();

        LastShotResponse getLastShotResponse();

        LastShotResponseOrBuilder getLastShotResponseOrBuilder();

        RadarStatusRequest getRadarStatusRequest();

        RadarStatusRequestOrBuilder getRadarStatusRequestOrBuilder();

        RadarStatusResponse getRadarStatusResponse();

        RadarStatusResponseOrBuilder getRadarStatusResponseOrBuilder();

        RearmRadarRequest getRearmRadarRequest();

        RearmRadarRequestOrBuilder getRearmRadarRequestOrBuilder();

        RearmRadarResponse getRearmRadarResponse();

        RearmRadarResponseOrBuilder getRearmRadarResponseOrBuilder();

        RecentSessionsRequest getRecentSessionsRequest();

        RecentSessionsRequestOrBuilder getRecentSessionsRequestOrBuilder();

        RecentSessionsResponse getRecentSessionsResponse();

        RecentSessionsResponseOrBuilder getRecentSessionsResponseOrBuilder();

        SessionInfoRequest getSessionInfoRequest();

        SessionInfoRequestOrBuilder getSessionInfoRequestOrBuilder();

        SessionInfoResponse getSessionInfoResponse();

        SessionInfoResponseOrBuilder getSessionInfoResponseOrBuilder();

        ShotListRequest getShotListRequest();

        ShotListRequestOrBuilder getShotListRequestOrBuilder();

        ShotListResponse getShotListResponse();

        ShotListResponseOrBuilder getShotListResponseOrBuilder();

        StartSessionRequest getStartSessionRequest();

        StartSessionRequestOrBuilder getStartSessionRequestOrBuilder();

        StartSessionResponse getStartSessionResponse();

        StartSessionResponseOrBuilder getStartSessionResponseOrBuilder();

        TitleChangeRequest getTitleChangeRequest();

        TitleChangeRequestOrBuilder getTitleChangeRequestOrBuilder();

        TitleChangeResponse getTitleChangeResponse();

        TitleChangeResponseOrBuilder getTitleChangeResponseOrBuilder();

        boolean hasDeleteShotRequest();

        boolean hasDeleteShotResponse();

        boolean hasDeviceIdentificationRequest();

        boolean hasDeviceIdentificationResponse();

        boolean hasEndSessionRequest();

        boolean hasEndSessionResponse();

        boolean hasExcludeShotRequest();

        boolean hasExcludeShotResponse();

        boolean hasLastShotRequest();

        boolean hasLastShotResponse();

        boolean hasRadarStatusRequest();

        boolean hasRadarStatusResponse();

        boolean hasRearmRadarRequest();

        boolean hasRearmRadarResponse();

        boolean hasRecentSessionsRequest();

        boolean hasRecentSessionsResponse();

        boolean hasSessionInfoRequest();

        boolean hasSessionInfoResponse();

        boolean hasShotListRequest();

        boolean hasShotListResponse();

        boolean hasStartSessionRequest();

        boolean hasStartSessionResponse();

        boolean hasTitleChangeRequest();

        boolean hasTitleChangeResponse();
    }

    public interface SessionInfoMessageOrBuilder extends MessageOrBuilder {
        float getAverageKe();

        float getAveragePf();

        float getAvgShotSpeed();

        float getGrainWeight();

        float getMaxShotSpeed();

        float getMinShotSpeed();

        ProjectileType getProjectileType();

        boolean getRadarArmed();

        boolean getSessionActive();

        String getSessionTitle();

        ByteString getSessionTitleBytes();

        ByteString getSessionUUID();

        int getShotCount();

        float getStandardDeviation();

        boolean hasAverageKe();

        boolean hasAveragePf();

        boolean hasAvgShotSpeed();

        boolean hasGrainWeight();

        boolean hasMaxShotSpeed();

        boolean hasMinShotSpeed();

        boolean hasProjectileType();

        boolean hasRadarArmed();

        boolean hasSessionActive();

        boolean hasSessionTitle();

        boolean hasSessionUUID();

        boolean hasShotCount();

        boolean hasStandardDeviation();
    }

    public interface SessionInfoRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SessionInfoResponseOrBuilder extends MessageOrBuilder {
        SessionInfoMessage getSessionInfo();

        SessionInfoMessageOrBuilder getSessionInfoOrBuilder();

        ResponseStatus getStatus();

        boolean hasSessionInfo();

        boolean hasStatus();
    }

    public interface ShotListRequestOrBuilder extends MessageOrBuilder {
    }

    public interface ShotListResponseOrBuilder extends MessageOrBuilder {
        ShotMessage getShotList(int i14);

        int getShotListCount();

        List<ShotMessage> getShotListList();

        ShotMessageOrBuilder getShotListOrBuilder(int i14);

        List<? extends ShotMessageOrBuilder> getShotListOrBuilderList();

        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface ShotMessageOrBuilder extends MessageOrBuilder {
        int getShotNum();

        int getShotTimestamp();

        float getShotVelocity();

        ShotMessage.ShotStatus getStatus();

        boolean hasShotNum();

        boolean hasShotTimestamp();

        boolean hasShotVelocity();

        boolean hasStatus();
    }

    public interface StartSessionRequestOrBuilder extends MessageOrBuilder {
        float getGrainWeight();

        ProjectileType getProjectileType();

        String getSessionTitle();

        ByteString getSessionTitleBytes();

        ByteString getSessionUUID();

        StartSessionRequest.VelocityRange getVelocityRange();

        boolean hasGrainWeight();

        boolean hasProjectileType();

        boolean hasSessionTitle();

        boolean hasSessionUUID();

        boolean hasVelocityRange();
    }

    public interface StartSessionResponseOrBuilder extends MessageOrBuilder {
        ByteString getSessionUUID();

        ResponseStatus getStatus();

        boolean hasSessionUUID();

        boolean hasStatus();
    }

    public interface StopSessionRequestOrBuilder extends MessageOrBuilder {
        boolean getDiscardSession();

        boolean hasDiscardSession();
    }

    public interface StopSessionResponseOrBuilder extends MessageOrBuilder {
        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface TitleChangeRequestOrBuilder extends MessageOrBuilder {
        String getTitle();

        ByteString getTitleBytes();

        boolean hasTitle();
    }

    public interface TitleChangeResponseOrBuilder extends MessageOrBuilder {
        ResponseStatus getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) a.k(0);
        internal_static_GDI_Proto_XeroChronograph_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_XeroChronograph_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"StartSessionRequest", "StartSessionResponse", "DeleteShotRequest", "DeleteShotResponse", "EndSessionRequest", "EndSessionResponse", "ExcludeShotRequest", "ExcludeShotResponse", "ShotListRequest", "ShotListResponse", "SessionInfoRequest", "SessionInfoResponse", "TitleChangeRequest", "TitleChangeResponse", "RecentSessionsRequest", "RecentSessionsResponse", "RearmRadarRequest", "RearmRadarResponse", "DeviceIdentificationRequest", "DeviceIdentificationResponse", "LastShotRequest", "LastShotResponse", "RadarStatusRequest", "RadarStatusResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) a.k(1);
        internal_static_GDI_Proto_XeroChronograph_ShotMessage_descriptor = descriptor3;
        internal_static_GDI_Proto_XeroChronograph_ShotMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ShotTimestamp", "ShotVelocity", "Status", "ShotNum"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) a.k(2);
        internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_descriptor = descriptor4;
        internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"MinShotSpeed", "MaxShotSpeed", "AvgShotSpeed", "ShotCount", "GrainWeight", "SessionActive", "StandardDeviation", "AveragePf", "AverageKe", "SessionUUID", "ProjectileType", "SessionTitle", "RadarArmed"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) a.k(3);
        internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ProjectileType", "VelocityRange", "SessionUUID", "SessionTitle", "GrainWeight"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) a.k(4);
        internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status", "SessionUUID"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) a.k(5);
        internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"DiscardSession"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) a.k(6);
        internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) a.k(7);
        internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ShotNumsToDelete", "SessionUUID"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) a.k(8);
        internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) a.k(9);
        internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"ShotNumsToExclude", "SessionUUID"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) a.k(10);
        internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) a.k(11);
        internal_static_GDI_Proto_XeroChronograph_ShotListRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_XeroChronograph_ShotListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[0]);
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) a.k(12);
        internal_static_GDI_Proto_XeroChronograph_ShotListResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_XeroChronograph_ShotListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"ShotList", "Status"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) a.k(13);
        internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[0]);
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) a.k(14);
        internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"SessionInfo", "Status"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) a.k(15);
        internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_descriptor = descriptor17;
        internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Title"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) a.k(16);
        internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_descriptor = descriptor18;
        internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Status"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) a.k(17);
        internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_descriptor = descriptor19;
        internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"SessionRequestCount", "StartTimestampS", "EndTimestampS"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) a.k(18);
        internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_descriptor = descriptor20;
        internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Status", "RecentSessions"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) a.k(19);
        internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_descriptor = descriptor21;
        internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[0]);
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) a.k(20);
        internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_descriptor = descriptor22;
        internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Status"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) a.k(21);
        internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_descriptor = descriptor23;
        internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"IdValue"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) a.k(22);
        internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_descriptor = descriptor24;
        internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"Status"});
        Descriptors.Descriptor descriptor25 = (Descriptors.Descriptor) a.k(23);
        internal_static_GDI_Proto_XeroChronograph_LastShotRequest_descriptor = descriptor25;
        internal_static_GDI_Proto_XeroChronograph_LastShotRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[0]);
        Descriptors.Descriptor descriptor26 = (Descriptors.Descriptor) a.k(24);
        internal_static_GDI_Proto_XeroChronograph_LastShotResponse_descriptor = descriptor26;
        internal_static_GDI_Proto_XeroChronograph_LastShotResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"LastShot", "Status"});
        Descriptors.Descriptor descriptor27 = (Descriptors.Descriptor) a.k(25);
        internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_descriptor = descriptor27;
        internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[0]);
        Descriptors.Descriptor descriptor28 = (Descriptors.Descriptor) a.k(26);
        internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_descriptor = descriptor28;
        internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor28, new String[]{"RadarActive", "Status"});
        Descriptors.Descriptor descriptor29 = (Descriptors.Descriptor) a.k(27);
        internal_static_GDI_Proto_XeroChronograph_AlertDetails_descriptor = descriptor29;
        internal_static_GDI_Proto_XeroChronograph_AlertDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor29, new String[]{"AlertType", "ShotMessage", "SessionInfo", "ShotList", "BatteryLevel"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDIXeroChronographProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(AlertDetails.details);
    }

    public static final class DeviceIdentificationRequest extends GeneratedMessageV3 implements DeviceIdentificationRequestOrBuilder {
        public static final int ID_VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int idValue_;
        private byte memoizedIsInitialized;
        private static final DeviceIdentificationRequest DEFAULT_INSTANCE = new DeviceIdentificationRequest();

        @Deprecated
        public static final Parser<DeviceIdentificationRequest> PARSER = new AbstractParser<DeviceIdentificationRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationRequest.1
            @Override // com.google.protobuf.Parser
            public DeviceIdentificationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceIdentificationRequest.newBuilder();
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

        private DeviceIdentificationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.idValue_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceIdentificationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_descriptor;
        }

        public static Builder newBuilder(DeviceIdentificationRequest deviceIdentificationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceIdentificationRequest);
        }

        public static DeviceIdentificationRequest parseDelimitedFrom(InputStream inputStream) {
            return (DeviceIdentificationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceIdentificationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceIdentificationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceIdentificationRequest)) {
                return super.equals(obj);
            }
            DeviceIdentificationRequest deviceIdentificationRequest = (DeviceIdentificationRequest) obj;
            if (hasIdValue() != deviceIdentificationRequest.hasIdValue()) {
                return false;
            }
            return (!hasIdValue() || getIdValue() == deviceIdentificationRequest.getIdValue()) && getUnknownFields().equals(deviceIdentificationRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationRequestOrBuilder
        public int getIdValue() {
            return this.idValue_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceIdentificationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.idValue_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationRequestOrBuilder
        public boolean hasIdValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIdValue()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getIdValue();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceIdentificationRequest.class, Builder.class);
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
            return new DeviceIdentificationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.idValue_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceIdentificationRequestOrBuilder {
            private int bitField0_;
            private int idValue_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DeviceIdentificationRequest deviceIdentificationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    deviceIdentificationRequest.idValue_ = this.idValue_;
                } else {
                    i14 = 0;
                }
                deviceIdentificationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceIdentificationRequest build() {
                DeviceIdentificationRequest deviceIdentificationRequestBuildPartial = buildPartial();
                if (deviceIdentificationRequestBuildPartial.isInitialized()) {
                    return deviceIdentificationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceIdentificationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceIdentificationRequest buildPartial() {
                DeviceIdentificationRequest deviceIdentificationRequest = new DeviceIdentificationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceIdentificationRequest);
                }
                onBuilt();
                return deviceIdentificationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.idValue_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIdValue() {
                this.bitField0_ &= -2;
                this.idValue_ = 0;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationRequestOrBuilder
            public int getIdValue() {
                return this.idValue_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationRequestOrBuilder
            public boolean hasIdValue() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceIdentificationRequest.class, Builder.class);
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
                                    this.idValue_ = codedInputStream.readUInt32();
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

            public Builder setIdValue(int i14) {
                this.idValue_ = i14;
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
            public DeviceIdentificationRequest getDefaultInstanceForType() {
                return DeviceIdentificationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceIdentificationRequest) {
                    return mergeFrom((DeviceIdentificationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceIdentificationRequest deviceIdentificationRequest) {
                if (deviceIdentificationRequest == DeviceIdentificationRequest.getDefaultInstance()) {
                    return this;
                }
                if (deviceIdentificationRequest.hasIdValue()) {
                    setIdValue(deviceIdentificationRequest.getIdValue());
                }
                mergeUnknownFields(deviceIdentificationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceIdentificationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeviceIdentificationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceIdentificationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceIdentificationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DeviceIdentificationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeviceIdentificationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DeviceIdentificationRequest() {
            this.idValue_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceIdentificationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceIdentificationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceIdentificationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceIdentificationRequest parseFrom(InputStream inputStream) {
            return (DeviceIdentificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceIdentificationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceIdentificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceIdentificationRequest parseFrom(CodedInputStream codedInputStream) {
            return (DeviceIdentificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceIdentificationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceIdentificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LastShotRequest extends GeneratedMessageV3 implements LastShotRequestOrBuilder {
        private static final LastShotRequest DEFAULT_INSTANCE = new LastShotRequest();

        @Deprecated
        public static final Parser<LastShotRequest> PARSER = new AbstractParser<LastShotRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.LastShotRequest.1
            @Override // com.google.protobuf.Parser
            public LastShotRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LastShotRequest.newBuilder();
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

        private LastShotRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LastShotRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotRequest_descriptor;
        }

        public static Builder newBuilder(LastShotRequest lastShotRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lastShotRequest);
        }

        public static LastShotRequest parseDelimitedFrom(InputStream inputStream) {
            return (LastShotRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LastShotRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LastShotRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LastShotRequest) {
                return getUnknownFields().equals(((LastShotRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LastShotRequest> getParserForType() {
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LastShotRequest.class, Builder.class);
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
            return new LastShotRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LastShotRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LastShotRequest build() {
                LastShotRequest lastShotRequestBuildPartial = buildPartial();
                if (lastShotRequestBuildPartial.isInitialized()) {
                    return lastShotRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lastShotRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LastShotRequest buildPartial() {
                LastShotRequest lastShotRequest = new LastShotRequest(this);
                onBuilt();
                return lastShotRequest;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LastShotRequest.class, Builder.class);
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
            public LastShotRequest getDefaultInstanceForType() {
                return LastShotRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LastShotRequest) {
                    return mergeFrom((LastShotRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LastShotRequest lastShotRequest) {
                if (lastShotRequest == LastShotRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(lastShotRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LastShotRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LastShotRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LastShotRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LastShotRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LastShotRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LastShotRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LastShotRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LastShotRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LastShotRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LastShotRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LastShotRequest parseFrom(InputStream inputStream) {
            return (LastShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LastShotRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LastShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LastShotRequest parseFrom(CodedInputStream codedInputStream) {
            return (LastShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LastShotRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LastShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RadarStatusRequest extends GeneratedMessageV3 implements RadarStatusRequestOrBuilder {
        private static final RadarStatusRequest DEFAULT_INSTANCE = new RadarStatusRequest();

        @Deprecated
        public static final Parser<RadarStatusRequest> PARSER = new AbstractParser<RadarStatusRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusRequest.1
            @Override // com.google.protobuf.Parser
            public RadarStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RadarStatusRequest.newBuilder();
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

        private RadarStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RadarStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_descriptor;
        }

        public static Builder newBuilder(RadarStatusRequest radarStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(radarStatusRequest);
        }

        public static RadarStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (RadarStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RadarStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RadarStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof RadarStatusRequest) {
                return getUnknownFields().equals(((RadarStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RadarStatusRequest> getParserForType() {
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RadarStatusRequest.class, Builder.class);
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
            return new RadarStatusRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RadarStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RadarStatusRequest build() {
                RadarStatusRequest radarStatusRequestBuildPartial = buildPartial();
                if (radarStatusRequestBuildPartial.isInitialized()) {
                    return radarStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) radarStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RadarStatusRequest buildPartial() {
                RadarStatusRequest radarStatusRequest = new RadarStatusRequest(this);
                onBuilt();
                return radarStatusRequest;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RadarStatusRequest.class, Builder.class);
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
            public RadarStatusRequest getDefaultInstanceForType() {
                return RadarStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RadarStatusRequest) {
                    return mergeFrom((RadarStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RadarStatusRequest radarStatusRequest) {
                if (radarStatusRequest == RadarStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(radarStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RadarStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ RadarStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private RadarStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RadarStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadarStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RadarStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RadarStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RadarStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RadarStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RadarStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RadarStatusRequest parseFrom(InputStream inputStream) {
            return (RadarStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RadarStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadarStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RadarStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (RadarStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RadarStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadarStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RearmRadarRequest extends GeneratedMessageV3 implements RearmRadarRequestOrBuilder {
        private static final RearmRadarRequest DEFAULT_INSTANCE = new RearmRadarRequest();

        @Deprecated
        public static final Parser<RearmRadarRequest> PARSER = new AbstractParser<RearmRadarRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.RearmRadarRequest.1
            @Override // com.google.protobuf.Parser
            public RearmRadarRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RearmRadarRequest.newBuilder();
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

        private RearmRadarRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RearmRadarRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_descriptor;
        }

        public static Builder newBuilder(RearmRadarRequest rearmRadarRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rearmRadarRequest);
        }

        public static RearmRadarRequest parseDelimitedFrom(InputStream inputStream) {
            return (RearmRadarRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RearmRadarRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RearmRadarRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof RearmRadarRequest) {
                return getUnknownFields().equals(((RearmRadarRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RearmRadarRequest> getParserForType() {
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RearmRadarRequest.class, Builder.class);
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
            return new RearmRadarRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RearmRadarRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RearmRadarRequest build() {
                RearmRadarRequest rearmRadarRequestBuildPartial = buildPartial();
                if (rearmRadarRequestBuildPartial.isInitialized()) {
                    return rearmRadarRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rearmRadarRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RearmRadarRequest buildPartial() {
                RearmRadarRequest rearmRadarRequest = new RearmRadarRequest(this);
                onBuilt();
                return rearmRadarRequest;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RearmRadarRequest.class, Builder.class);
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
            public RearmRadarRequest getDefaultInstanceForType() {
                return RearmRadarRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RearmRadarRequest) {
                    return mergeFrom((RearmRadarRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RearmRadarRequest rearmRadarRequest) {
                if (rearmRadarRequest == RearmRadarRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(rearmRadarRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RearmRadarRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ RearmRadarRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private RearmRadarRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RearmRadarRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RearmRadarRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RearmRadarRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RearmRadarRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RearmRadarRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RearmRadarRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RearmRadarRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RearmRadarRequest parseFrom(InputStream inputStream) {
            return (RearmRadarRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RearmRadarRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RearmRadarRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RearmRadarRequest parseFrom(CodedInputStream codedInputStream) {
            return (RearmRadarRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RearmRadarRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RearmRadarRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RecentSessionsRequest extends GeneratedMessageV3 implements RecentSessionsRequestOrBuilder {
        public static final int END_TIMESTAMP_S_FIELD_NUMBER = 3;
        public static final int SESSION_REQUEST_COUNT_FIELD_NUMBER = 1;
        public static final int START_TIMESTAMP_S_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int endTimestampS_;
        private byte memoizedIsInitialized;
        private int sessionRequestCount_;
        private int startTimestampS_;
        private static final RecentSessionsRequest DEFAULT_INSTANCE = new RecentSessionsRequest();

        @Deprecated
        public static final Parser<RecentSessionsRequest> PARSER = new AbstractParser<RecentSessionsRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequest.1
            @Override // com.google.protobuf.Parser
            public RecentSessionsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RecentSessionsRequest.newBuilder();
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

        private RecentSessionsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionRequestCount_ = 0;
            this.startTimestampS_ = 0;
            this.endTimestampS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RecentSessionsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_descriptor;
        }

        public static Builder newBuilder(RecentSessionsRequest recentSessionsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(recentSessionsRequest);
        }

        public static RecentSessionsRequest parseDelimitedFrom(InputStream inputStream) {
            return (RecentSessionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RecentSessionsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RecentSessionsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecentSessionsRequest)) {
                return super.equals(obj);
            }
            RecentSessionsRequest recentSessionsRequest = (RecentSessionsRequest) obj;
            if (hasSessionRequestCount() != recentSessionsRequest.hasSessionRequestCount()) {
                return false;
            }
            if ((hasSessionRequestCount() && getSessionRequestCount() != recentSessionsRequest.getSessionRequestCount()) || hasStartTimestampS() != recentSessionsRequest.hasStartTimestampS()) {
                return false;
            }
            if ((!hasStartTimestampS() || getStartTimestampS() == recentSessionsRequest.getStartTimestampS()) && hasEndTimestampS() == recentSessionsRequest.hasEndTimestampS()) {
                return (!hasEndTimestampS() || getEndTimestampS() == recentSessionsRequest.getEndTimestampS()) && getUnknownFields().equals(recentSessionsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
        public int getEndTimestampS() {
            return this.endTimestampS_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RecentSessionsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sessionRequestCount_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.startTimestampS_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.endTimestampS_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
        public int getSessionRequestCount() {
            return this.sessionRequestCount_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
        public int getStartTimestampS() {
            return this.startTimestampS_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
        public boolean hasEndTimestampS() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
        public boolean hasSessionRequestCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
        public boolean hasStartTimestampS() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionRequestCount()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionRequestCount();
            }
            if (hasStartTimestampS()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStartTimestampS();
            }
            if (hasEndTimestampS()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getEndTimestampS();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RecentSessionsRequest.class, Builder.class);
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
            return new RecentSessionsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sessionRequestCount_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.startTimestampS_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.endTimestampS_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecentSessionsRequestOrBuilder {
            private int bitField0_;
            private int endTimestampS_;
            private int sessionRequestCount_;
            private int startTimestampS_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(RecentSessionsRequest recentSessionsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    recentSessionsRequest.sessionRequestCount_ = this.sessionRequestCount_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    recentSessionsRequest.startTimestampS_ = this.startTimestampS_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    recentSessionsRequest.endTimestampS_ = this.endTimestampS_;
                    i14 |= 4;
                }
                recentSessionsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RecentSessionsRequest build() {
                RecentSessionsRequest recentSessionsRequestBuildPartial = buildPartial();
                if (recentSessionsRequestBuildPartial.isInitialized()) {
                    return recentSessionsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) recentSessionsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RecentSessionsRequest buildPartial() {
                RecentSessionsRequest recentSessionsRequest = new RecentSessionsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(recentSessionsRequest);
                }
                onBuilt();
                return recentSessionsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionRequestCount_ = 0;
                this.startTimestampS_ = 0;
                this.endTimestampS_ = 0;
                return this;
            }

            public Builder clearEndTimestampS() {
                this.bitField0_ &= -5;
                this.endTimestampS_ = 0;
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

            public Builder clearSessionRequestCount() {
                this.bitField0_ &= -2;
                this.sessionRequestCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStartTimestampS() {
                this.bitField0_ &= -3;
                this.startTimestampS_ = 0;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
            public int getEndTimestampS() {
                return this.endTimestampS_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
            public int getSessionRequestCount() {
                return this.sessionRequestCount_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
            public int getStartTimestampS() {
                return this.startTimestampS_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
            public boolean hasEndTimestampS() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
            public boolean hasSessionRequestCount() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsRequestOrBuilder
            public boolean hasStartTimestampS() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RecentSessionsRequest.class, Builder.class);
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
                                    this.sessionRequestCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.startTimestampS_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.endTimestampS_ = codedInputStream.readUInt32();
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

            public Builder setEndTimestampS(int i14) {
                this.endTimestampS_ = i14;
                this.bitField0_ |= 4;
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

            public Builder setSessionRequestCount(int i14) {
                this.sessionRequestCount_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStartTimestampS(int i14) {
                this.startTimestampS_ = i14;
                this.bitField0_ |= 2;
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
            public RecentSessionsRequest getDefaultInstanceForType() {
                return RecentSessionsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RecentSessionsRequest) {
                    return mergeFrom((RecentSessionsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RecentSessionsRequest recentSessionsRequest) {
                if (recentSessionsRequest == RecentSessionsRequest.getDefaultInstance()) {
                    return this;
                }
                if (recentSessionsRequest.hasSessionRequestCount()) {
                    setSessionRequestCount(recentSessionsRequest.getSessionRequestCount());
                }
                if (recentSessionsRequest.hasStartTimestampS()) {
                    setStartTimestampS(recentSessionsRequest.getStartTimestampS());
                }
                if (recentSessionsRequest.hasEndTimestampS()) {
                    setEndTimestampS(recentSessionsRequest.getEndTimestampS());
                }
                mergeUnknownFields(recentSessionsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RecentSessionsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RecentSessionsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecentSessionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RecentSessionsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RecentSessionsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RecentSessionsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RecentSessionsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RecentSessionsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ RecentSessionsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RecentSessionsRequest parseFrom(InputStream inputStream) {
            return (RecentSessionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private RecentSessionsRequest() {
            this.sessionRequestCount_ = 0;
            this.startTimestampS_ = 0;
            this.endTimestampS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RecentSessionsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecentSessionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RecentSessionsRequest parseFrom(CodedInputStream codedInputStream) {
            return (RecentSessionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RecentSessionsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecentSessionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SessionInfoRequest extends GeneratedMessageV3 implements SessionInfoRequestOrBuilder {
        private static final SessionInfoRequest DEFAULT_INSTANCE = new SessionInfoRequest();

        @Deprecated
        public static final Parser<SessionInfoRequest> PARSER = new AbstractParser<SessionInfoRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoRequest.1
            @Override // com.google.protobuf.Parser
            public SessionInfoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SessionInfoRequest.newBuilder();
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

        private SessionInfoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_descriptor;
        }

        public static Builder newBuilder(SessionInfoRequest sessionInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionInfoRequest);
        }

        public static SessionInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (SessionInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SessionInfoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SessionInfoRequest) {
                return getUnknownFields().equals(((SessionInfoRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SessionInfoRequest> getParserForType() {
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionInfoRequest.class, Builder.class);
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
            return new SessionInfoRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionInfoRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionInfoRequest build() {
                SessionInfoRequest sessionInfoRequestBuildPartial = buildPartial();
                if (sessionInfoRequestBuildPartial.isInitialized()) {
                    return sessionInfoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionInfoRequest buildPartial() {
                SessionInfoRequest sessionInfoRequest = new SessionInfoRequest(this);
                onBuilt();
                return sessionInfoRequest;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionInfoRequest.class, Builder.class);
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
            public SessionInfoRequest getDefaultInstanceForType() {
                return SessionInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionInfoRequest) {
                    return mergeFrom((SessionInfoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionInfoRequest sessionInfoRequest) {
                if (sessionInfoRequest == SessionInfoRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(sessionInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SessionInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SessionInfoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SessionInfoRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionInfoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionInfoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SessionInfoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionInfoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SessionInfoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SessionInfoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SessionInfoRequest parseFrom(InputStream inputStream) {
            return (SessionInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SessionInfoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionInfoRequest parseFrom(CodedInputStream codedInputStream) {
            return (SessionInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionInfoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShotListRequest extends GeneratedMessageV3 implements ShotListRequestOrBuilder {
        private static final ShotListRequest DEFAULT_INSTANCE = new ShotListRequest();

        @Deprecated
        public static final Parser<ShotListRequest> PARSER = new AbstractParser<ShotListRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.ShotListRequest.1
            @Override // com.google.protobuf.Parser
            public ShotListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShotListRequest.newBuilder();
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

        private ShotListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShotListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListRequest_descriptor;
        }

        public static Builder newBuilder(ShotListRequest shotListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shotListRequest);
        }

        public static ShotListRequest parseDelimitedFrom(InputStream inputStream) {
            return (ShotListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShotListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShotListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ShotListRequest) {
                return getUnknownFields().equals(((ShotListRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShotListRequest> getParserForType() {
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotListRequest.class, Builder.class);
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
            return new ShotListRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShotListRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotListRequest build() {
                ShotListRequest shotListRequestBuildPartial = buildPartial();
                if (shotListRequestBuildPartial.isInitialized()) {
                    return shotListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shotListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotListRequest buildPartial() {
                ShotListRequest shotListRequest = new ShotListRequest(this);
                onBuilt();
                return shotListRequest;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotListRequest.class, Builder.class);
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
            public ShotListRequest getDefaultInstanceForType() {
                return ShotListRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShotListRequest) {
                    return mergeFrom((ShotListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShotListRequest shotListRequest) {
                if (shotListRequest == ShotListRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(shotListRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShotListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ShotListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ShotListRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShotListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShotListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShotListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShotListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShotListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShotListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShotListRequest parseFrom(InputStream inputStream) {
            return (ShotListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShotListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShotListRequest parseFrom(CodedInputStream codedInputStream) {
            return (ShotListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShotListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StopSessionRequest extends GeneratedMessageV3 implements StopSessionRequestOrBuilder {
        public static final int DISCARD_SESSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean discardSession_;
        private byte memoizedIsInitialized;
        private static final StopSessionRequest DEFAULT_INSTANCE = new StopSessionRequest();

        @Deprecated
        public static final Parser<StopSessionRequest> PARSER = new AbstractParser<StopSessionRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.StopSessionRequest.1
            @Override // com.google.protobuf.Parser
            public StopSessionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopSessionRequest.newBuilder();
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

        private StopSessionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.discardSession_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopSessionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_descriptor;
        }

        public static Builder newBuilder(StopSessionRequest stopSessionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopSessionRequest);
        }

        public static StopSessionRequest parseDelimitedFrom(InputStream inputStream) {
            return (StopSessionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopSessionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopSessionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StopSessionRequest)) {
                return super.equals(obj);
            }
            StopSessionRequest stopSessionRequest = (StopSessionRequest) obj;
            if (hasDiscardSession() != stopSessionRequest.hasDiscardSession()) {
                return false;
            }
            return (!hasDiscardSession() || getDiscardSession() == stopSessionRequest.getDiscardSession()) && getUnknownFields().equals(stopSessionRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StopSessionRequestOrBuilder
        public boolean getDiscardSession() {
            return this.discardSession_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopSessionRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.discardSession_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StopSessionRequestOrBuilder
        public boolean hasDiscardSession() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDiscardSession()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getDiscardSession());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StopSessionRequest.class, Builder.class);
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
            return new StopSessionRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.discardSession_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopSessionRequestOrBuilder {
            private int bitField0_;
            private boolean discardSession_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(StopSessionRequest stopSessionRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stopSessionRequest.discardSession_ = this.discardSession_;
                } else {
                    i14 = 0;
                }
                stopSessionRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopSessionRequest build() {
                StopSessionRequest stopSessionRequestBuildPartial = buildPartial();
                if (stopSessionRequestBuildPartial.isInitialized()) {
                    return stopSessionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopSessionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopSessionRequest buildPartial() {
                StopSessionRequest stopSessionRequest = new StopSessionRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stopSessionRequest);
                }
                onBuilt();
                return stopSessionRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.discardSession_ = false;
                return this;
            }

            public Builder clearDiscardSession() {
                this.bitField0_ &= -2;
                this.discardSession_ = false;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StopSessionRequestOrBuilder
            public boolean getDiscardSession() {
                return this.discardSession_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StopSessionRequestOrBuilder
            public boolean hasDiscardSession() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StopSessionRequest.class, Builder.class);
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
                                    this.discardSession_ = codedInputStream.readBool();
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

            public Builder setDiscardSession(boolean z14) {
                this.discardSession_ = z14;
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
            public StopSessionRequest getDefaultInstanceForType() {
                return StopSessionRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StopSessionRequest) {
                    return mergeFrom((StopSessionRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StopSessionRequest stopSessionRequest) {
                if (stopSessionRequest == StopSessionRequest.getDefaultInstance()) {
                    return this;
                }
                if (stopSessionRequest.hasDiscardSession()) {
                    setDiscardSession(stopSessionRequest.getDiscardSession());
                }
                mergeUnknownFields(stopSessionRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopSessionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StopSessionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopSessionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopSessionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StopSessionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StopSessionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StopSessionRequest() {
            this.discardSession_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopSessionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopSessionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopSessionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopSessionRequest parseFrom(InputStream inputStream) {
            return (StopSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopSessionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopSessionRequest parseFrom(CodedInputStream codedInputStream) {
            return (StopSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopSessionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlertDetails extends GeneratedMessageV3 implements AlertDetailsOrBuilder {
        public static final int ALERT_TYPE_FIELD_NUMBER = 1;
        public static final int BATTERY_LEVEL_FIELD_NUMBER = 5;
        public static final int DETAILS_FIELD_NUMBER = 1008;
        public static final int SESSION_INFO_FIELD_NUMBER = 3;
        public static final int SHOT_LIST_FIELD_NUMBER = 4;
        public static final int SHOT_MESSAGE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int alertType_;
        private float batteryLevel_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SessionInfoMessage sessionInfo_;
        private List<ShotMessage> shotList_;
        private ShotMessage shotMessage_;
        private static final AlertDetails DEFAULT_INSTANCE = new AlertDetails();

        @Deprecated
        public static final Parser<AlertDetails> PARSER = new AbstractParser<AlertDetails>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.AlertDetails.1
            @Override // com.google.protobuf.Parser
            public AlertDetails parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertDetails.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, AlertDetails> details = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, AlertDetails.class, getDefaultInstance());

        private AlertDetails() {
            this.batteryLevel_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.alertType_ = 0;
            this.shotList_ = Collections.EMPTY_LIST;
        }

        public static AlertDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_AlertDetails_descriptor;
        }

        public static Builder newBuilder(AlertDetails alertDetails) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertDetails);
        }

        public static AlertDetails parseDelimitedFrom(InputStream inputStream) {
            return (AlertDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertDetails parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertDetails> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlertDetails)) {
                return super.equals(obj);
            }
            AlertDetails alertDetails = (AlertDetails) obj;
            if (hasAlertType() != alertDetails.hasAlertType()) {
                return false;
            }
            if ((hasAlertType() && this.alertType_ != alertDetails.alertType_) || hasShotMessage() != alertDetails.hasShotMessage()) {
                return false;
            }
            if ((hasShotMessage() && !getShotMessage().equals(alertDetails.getShotMessage())) || hasSessionInfo() != alertDetails.hasSessionInfo()) {
                return false;
            }
            if ((!hasSessionInfo() || getSessionInfo().equals(alertDetails.getSessionInfo())) && getShotListList().equals(alertDetails.getShotListList()) && hasBatteryLevel() == alertDetails.hasBatteryLevel()) {
                return (!hasBatteryLevel() || Float.floatToIntBits(getBatteryLevel()) == Float.floatToIntBits(alertDetails.getBatteryLevel())) && getUnknownFields().equals(alertDetails.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public EventAlertType getAlertType() {
            EventAlertType eventAlertTypeForNumber = EventAlertType.forNumber(this.alertType_);
            return eventAlertTypeForNumber == null ? EventAlertType.SESSION_STARTED : eventAlertTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public float getBatteryLevel() {
            return this.batteryLevel_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertDetails> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.alertType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getShotMessage());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getSessionInfo());
            }
            for (int i15 = 0; i15 < this.shotList_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, this.shotList_.get(i15));
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(5, this.batteryLevel_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public SessionInfoMessage getSessionInfo() {
            SessionInfoMessage sessionInfoMessage = this.sessionInfo_;
            return sessionInfoMessage == null ? SessionInfoMessage.getDefaultInstance() : sessionInfoMessage;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public SessionInfoMessageOrBuilder getSessionInfoOrBuilder() {
            SessionInfoMessage sessionInfoMessage = this.sessionInfo_;
            return sessionInfoMessage == null ? SessionInfoMessage.getDefaultInstance() : sessionInfoMessage;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public ShotMessage getShotList(int i14) {
            return this.shotList_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public int getShotListCount() {
            return this.shotList_.size();
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public List<ShotMessage> getShotListList() {
            return this.shotList_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public ShotMessageOrBuilder getShotListOrBuilder(int i14) {
            return this.shotList_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public List<? extends ShotMessageOrBuilder> getShotListOrBuilderList() {
            return this.shotList_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public ShotMessage getShotMessage() {
            ShotMessage shotMessage = this.shotMessage_;
            return shotMessage == null ? ShotMessage.getDefaultInstance() : shotMessage;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public ShotMessageOrBuilder getShotMessageOrBuilder() {
            ShotMessage shotMessage = this.shotMessage_;
            return shotMessage == null ? ShotMessage.getDefaultInstance() : shotMessage;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public boolean hasAlertType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public boolean hasBatteryLevel() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public boolean hasSessionInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
        public boolean hasShotMessage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAlertType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.alertType_;
            }
            if (hasShotMessage()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getShotMessage().hashCode();
            }
            if (hasSessionInfo()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSessionInfo().hashCode();
            }
            if (getShotListCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getShotListList().hashCode();
            }
            if (hasBatteryLevel()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getBatteryLevel());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_AlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertDetails.class, Builder.class);
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
            return new AlertDetails();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.alertType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getShotMessage());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSessionInfo());
            }
            for (int i14 = 0; i14 < this.shotList_.size(); i14++) {
                codedOutputStream.writeMessage(4, this.shotList_.get(i14));
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(5, this.batteryLevel_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertDetailsOrBuilder {
            private int alertType_;
            private float batteryLevel_;
            private int bitField0_;
            private SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> sessionInfoBuilder_;
            private SessionInfoMessage sessionInfo_;
            private RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> shotListBuilder_;
            private List<ShotMessage> shotList_;
            private SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> shotMessageBuilder_;
            private ShotMessage shotMessage_;

            private Builder() {
                this.alertType_ = 0;
                this.shotList_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AlertDetails alertDetails) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    alertDetails.alertType_ = this.alertType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.shotMessageBuilder_;
                    alertDetails.shotMessage_ = singleFieldBuilderV3 == null ? this.shotMessage_ : (ShotMessage) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV4 = this.sessionInfoBuilder_;
                    alertDetails.sessionInfo_ = singleFieldBuilderV4 == null ? this.sessionInfo_ : (SessionInfoMessage) singleFieldBuilderV4.build();
                    i14 |= 4;
                }
                if ((i15 & 16) != 0) {
                    alertDetails.batteryLevel_ = this.batteryLevel_;
                    i14 |= 8;
                }
                alertDetails.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(AlertDetails alertDetails) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    alertDetails.shotList_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 8) != 0) {
                    this.shotList_ = Collections.unmodifiableList(this.shotList_);
                    this.bitField0_ &= -9;
                }
                alertDetails.shotList_ = this.shotList_;
            }

            private void ensureShotListIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.shotList_ = new ArrayList(this.shotList_);
                    this.bitField0_ |= 8;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_AlertDetails_descriptor;
            }

            private SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> getSessionInfoFieldBuilder() {
                if (this.sessionInfoBuilder_ == null) {
                    this.sessionInfoBuilder_ = new SingleFieldBuilderV3<>(getSessionInfo(), getParentForChildren(), isClean());
                    this.sessionInfo_ = null;
                }
                return this.sessionInfoBuilder_;
            }

            private RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> getShotListFieldBuilder() {
                if (this.shotListBuilder_ == null) {
                    this.shotListBuilder_ = new RepeatedFieldBuilderV3<>(this.shotList_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.shotList_ = null;
                }
                return this.shotListBuilder_;
            }

            private SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> getShotMessageFieldBuilder() {
                if (this.shotMessageBuilder_ == null) {
                    this.shotMessageBuilder_ = new SingleFieldBuilderV3<>(getShotMessage(), getParentForChildren(), isClean());
                    this.shotMessage_ = null;
                }
                return this.shotMessageBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getShotMessageFieldBuilder();
                    getSessionInfoFieldBuilder();
                    getShotListFieldBuilder();
                }
            }

            public Builder addAllShotList(Iterable<? extends ShotMessage> iterable) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureShotListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.shotList_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addShotList(ShotMessage.Builder builder) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureShotListIsMutable();
                this.shotList_.add(builder.build());
                onChanged();
                return this;
            }

            public ShotMessage.Builder addShotListBuilder() {
                return (ShotMessage.Builder) getShotListFieldBuilder().addBuilder(ShotMessage.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertDetails build() {
                AlertDetails alertDetailsBuildPartial = buildPartial();
                if (alertDetailsBuildPartial.isInitialized()) {
                    return alertDetailsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertDetailsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertDetails buildPartial() {
                AlertDetails alertDetails = new AlertDetails(this);
                buildPartialRepeatedFields(alertDetails);
                if (this.bitField0_ != 0) {
                    buildPartial0(alertDetails);
                }
                onBuilt();
                return alertDetails;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.alertType_ = 0;
                this.shotMessage_ = null;
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.shotMessageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shotMessageBuilder_ = null;
                }
                this.sessionInfo_ = null;
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV4 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.sessionInfoBuilder_ = null;
                }
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.shotList_ = Collections.EMPTY_LIST;
                } else {
                    this.shotList_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                this.batteryLevel_ = 0.0f;
                return this;
            }

            public Builder clearAlertType() {
                this.bitField0_ &= -2;
                this.alertType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBatteryLevel() {
                this.bitField0_ &= -17;
                this.batteryLevel_ = 0.0f;
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

            public Builder clearSessionInfo() {
                this.bitField0_ &= -5;
                this.sessionInfo_ = null;
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShotList() {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.shotList_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearShotMessage() {
                this.bitField0_ &= -3;
                this.shotMessage_ = null;
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.shotMessageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shotMessageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public EventAlertType getAlertType() {
                EventAlertType eventAlertTypeForNumber = EventAlertType.forNumber(this.alertType_);
                return eventAlertTypeForNumber == null ? EventAlertType.SESSION_STARTED : eventAlertTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public float getBatteryLevel() {
                return this.batteryLevel_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_AlertDetails_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public SessionInfoMessage getSessionInfo() {
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionInfoMessage) singleFieldBuilderV3.getMessage();
                }
                SessionInfoMessage sessionInfoMessage = this.sessionInfo_;
                return sessionInfoMessage == null ? SessionInfoMessage.getDefaultInstance() : sessionInfoMessage;
            }

            public SessionInfoMessage.Builder getSessionInfoBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SessionInfoMessage.Builder) getSessionInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public SessionInfoMessageOrBuilder getSessionInfoOrBuilder() {
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionInfoMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionInfoMessage sessionInfoMessage = this.sessionInfo_;
                return sessionInfoMessage == null ? SessionInfoMessage.getDefaultInstance() : sessionInfoMessage;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public ShotMessage getShotList(int i14) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shotList_.get(i14) : (ShotMessage) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ShotMessage.Builder getShotListBuilder(int i14) {
                return (ShotMessage.Builder) getShotListFieldBuilder().getBuilder(i14);
            }

            public List<ShotMessage.Builder> getShotListBuilderList() {
                return getShotListFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public int getShotListCount() {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shotList_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public List<ShotMessage> getShotListList() {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.shotList_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public ShotMessageOrBuilder getShotListOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shotList_.get(i14) : (ShotMessageOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public List<? extends ShotMessageOrBuilder> getShotListOrBuilderList() {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.shotList_);
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public ShotMessage getShotMessage() {
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.shotMessageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotMessage) singleFieldBuilderV3.getMessage();
                }
                ShotMessage shotMessage = this.shotMessage_;
                return shotMessage == null ? ShotMessage.getDefaultInstance() : shotMessage;
            }

            public ShotMessage.Builder getShotMessageBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ShotMessage.Builder) getShotMessageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public ShotMessageOrBuilder getShotMessageOrBuilder() {
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.shotMessageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShotMessage shotMessage = this.shotMessage_;
                return shotMessage == null ? ShotMessage.getDefaultInstance() : shotMessage;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public boolean hasAlertType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public boolean hasBatteryLevel() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public boolean hasSessionInfo() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.AlertDetailsOrBuilder
            public boolean hasShotMessage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_AlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertDetails.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(AlertDetails alertDetails) {
                if (alertDetails == AlertDetails.getDefaultInstance()) {
                    return this;
                }
                if (alertDetails.hasAlertType()) {
                    setAlertType(alertDetails.getAlertType());
                }
                if (alertDetails.hasShotMessage()) {
                    mergeShotMessage(alertDetails.getShotMessage());
                }
                if (alertDetails.hasSessionInfo()) {
                    mergeSessionInfo(alertDetails.getSessionInfo());
                }
                if (this.shotListBuilder_ == null) {
                    if (!alertDetails.shotList_.isEmpty()) {
                        if (this.shotList_.isEmpty()) {
                            this.shotList_ = alertDetails.shotList_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureShotListIsMutable();
                            this.shotList_.addAll(alertDetails.shotList_);
                        }
                        onChanged();
                    }
                } else if (!alertDetails.shotList_.isEmpty()) {
                    boolean zIsEmpty = this.shotListBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.shotListBuilder_ = null;
                        this.shotList_ = alertDetails.shotList_;
                        this.bitField0_ &= -9;
                        this.shotListBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getShotListFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(alertDetails.shotList_);
                    }
                }
                if (alertDetails.hasBatteryLevel()) {
                    setBatteryLevel(alertDetails.getBatteryLevel());
                }
                mergeUnknownFields(alertDetails.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeSessionInfo(SessionInfoMessage sessionInfoMessage) {
                SessionInfoMessage sessionInfoMessage2;
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionInfoMessage);
                } else if ((this.bitField0_ & 4) == 0 || (sessionInfoMessage2 = this.sessionInfo_) == null || sessionInfoMessage2 == SessionInfoMessage.getDefaultInstance()) {
                    this.sessionInfo_ = sessionInfoMessage;
                } else {
                    getSessionInfoBuilder().mergeFrom(sessionInfoMessage);
                }
                if (this.sessionInfo_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShotMessage(ShotMessage shotMessage) {
                ShotMessage shotMessage2;
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.shotMessageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shotMessage);
                } else if ((this.bitField0_ & 2) == 0 || (shotMessage2 = this.shotMessage_) == null || shotMessage2 == ShotMessage.getDefaultInstance()) {
                    this.shotMessage_ = shotMessage;
                } else {
                    getShotMessageBuilder().mergeFrom(shotMessage);
                }
                if (this.shotMessage_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeShotList(int i14) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureShotListIsMutable();
                this.shotList_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setAlertType(EventAlertType eventAlertType) {
                eventAlertType.getClass();
                this.bitField0_ |= 1;
                this.alertType_ = eventAlertType.getNumber();
                onChanged();
                return this;
            }

            public Builder setBatteryLevel(float f14) {
                this.batteryLevel_ = f14;
                this.bitField0_ |= 16;
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

            public Builder setSessionInfo(SessionInfoMessage.Builder builder) {
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setShotList(int i14, ShotMessage.Builder builder) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureShotListIsMutable();
                this.shotList_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setShotMessage(ShotMessage.Builder builder) {
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.shotMessageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shotMessage_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertDetails getDefaultInstanceForType() {
                return AlertDetails.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            public ShotMessage.Builder addShotListBuilder(int i14) {
                return (ShotMessage.Builder) getShotListFieldBuilder().addBuilder(i14, ShotMessage.getDefaultInstance());
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.alertType_ = 0;
                this.shotList_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addShotList(int i14, ShotMessage shotMessage) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shotMessage.getClass();
                    ensureShotListIsMutable();
                    this.shotList_.add(i14, shotMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, shotMessage);
                return this;
            }

            public Builder setSessionInfo(SessionInfoMessage sessionInfoMessage) {
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionInfoMessage.getClass();
                    this.sessionInfo_ = sessionInfoMessage;
                } else {
                    singleFieldBuilderV3.setMessage(sessionInfoMessage);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setShotList(int i14, ShotMessage shotMessage) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shotMessage.getClass();
                    ensureShotListIsMutable();
                    this.shotList_.set(i14, shotMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, shotMessage);
                return this;
            }

            public Builder setShotMessage(ShotMessage shotMessage) {
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.shotMessageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shotMessage.getClass();
                    this.shotMessage_ = shotMessage;
                } else {
                    singleFieldBuilderV3.setMessage(shotMessage);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addShotList(ShotMessage shotMessage) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shotMessage.getClass();
                    ensureShotListIsMutable();
                    this.shotList_.add(shotMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(shotMessage);
                return this;
            }

            public Builder addShotList(int i14, ShotMessage.Builder builder) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureShotListIsMutable();
                    this.shotList_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertDetails) {
                    return mergeFrom((AlertDetails) message);
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
                                    if (EventAlertType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.alertType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getShotMessageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSessionInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    ShotMessage shotMessage = (ShotMessage) codedInputStream.readMessage(ShotMessage.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureShotListIsMutable();
                                        this.shotList_.add(shotMessage);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(shotMessage);
                                    }
                                } else if (tag != 45) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.batteryLevel_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
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
        public AlertDetails getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlertDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertDetails parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlertDetails parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlertDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlertDetails parseFrom(InputStream inputStream) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlertDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private AlertDetails(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.alertType_ = 0;
            this.batteryLevel_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertDetails parseFrom(CodedInputStream codedInputStream) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ AlertDetails(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class DeleteShotRequest extends GeneratedMessageV3 implements DeleteShotRequestOrBuilder {
        private static final DeleteShotRequest DEFAULT_INSTANCE = new DeleteShotRequest();

        @Deprecated
        public static final Parser<DeleteShotRequest> PARSER = new AbstractParser<DeleteShotRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequest.1
            @Override // com.google.protobuf.Parser
            public DeleteShotRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeleteShotRequest.newBuilder();
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
        public static final int SESSIONUUID_FIELD_NUMBER = 2;
        public static final int SHOT_NUMS_TO_DELETE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString sessionUUID_;
        private Internal.IntList shotNumsToDelete_;

        private DeleteShotRequest() {
            this.shotNumsToDelete_ = GeneratedMessageV3.emptyIntList();
            ByteString byteString = ByteString.EMPTY;
            this.sessionUUID_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.shotNumsToDelete_ = GeneratedMessageV3.emptyIntList();
            this.sessionUUID_ = byteString;
        }

        public static DeleteShotRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_descriptor;
        }

        public static Builder newBuilder(DeleteShotRequest deleteShotRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteShotRequest);
        }

        public static DeleteShotRequest parseDelimitedFrom(InputStream inputStream) {
            return (DeleteShotRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeleteShotRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeleteShotRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteShotRequest)) {
                return super.equals(obj);
            }
            DeleteShotRequest deleteShotRequest = (DeleteShotRequest) obj;
            if (getShotNumsToDeleteList().equals(deleteShotRequest.getShotNumsToDeleteList()) && hasSessionUUID() == deleteShotRequest.hasSessionUUID()) {
                return (!hasSessionUUID() || getSessionUUID().equals(deleteShotRequest.getSessionUUID())) && getUnknownFields().equals(deleteShotRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeleteShotRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iB = 0;
            for (int i15 = 0; i15 < this.shotNumsToDelete_.size(); i15++) {
                iB = f3.b(this.shotNumsToDelete_, i15, iB);
            }
            int size = getShotNumsToDeleteList().size() + iB;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeBytesSize(2, this.sessionUUID_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
        public ByteString getSessionUUID() {
            return this.sessionUUID_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
        public int getShotNumsToDelete(int i14) {
            return this.shotNumsToDelete_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
        public int getShotNumsToDeleteCount() {
            return this.shotNumsToDelete_.size();
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
        public List<Integer> getShotNumsToDeleteList() {
            return this.shotNumsToDelete_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
        public boolean hasSessionUUID() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getShotNumsToDeleteCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShotNumsToDeleteList().hashCode();
            }
            if (hasSessionUUID()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSessionUUID().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteShotRequest.class, Builder.class);
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
            return new DeleteShotRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iC = 0;
            while (iC < this.shotNumsToDelete_.size()) {
                iC = f3.c(this.shotNumsToDelete_, iC, codedOutputStream, 1, iC, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(2, this.sessionUUID_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeleteShotRequestOrBuilder {
            private int bitField0_;
            private ByteString sessionUUID_;
            private Internal.IntList shotNumsToDelete_;

            private Builder() {
                this.shotNumsToDelete_ = GeneratedMessageV3.emptyIntList();
                this.sessionUUID_ = ByteString.EMPTY;
            }

            private void buildPartial0(DeleteShotRequest deleteShotRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    this.shotNumsToDelete_.makeImmutable();
                    deleteShotRequest.shotNumsToDelete_ = this.shotNumsToDelete_;
                }
                if ((i15 & 2) != 0) {
                    deleteShotRequest.sessionUUID_ = this.sessionUUID_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                deleteShotRequest.bitField0_ = i14 | deleteShotRequest.bitField0_;
            }

            private void ensureShotNumsToDeleteIsMutable() {
                if (!this.shotNumsToDelete_.isModifiable()) {
                    this.shotNumsToDelete_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.shotNumsToDelete_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_descriptor;
            }

            public Builder addAllShotNumsToDelete(Iterable<? extends Integer> iterable) {
                ensureShotNumsToDeleteIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.shotNumsToDelete_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addShotNumsToDelete(int i14) {
                ensureShotNumsToDeleteIsMutable();
                this.shotNumsToDelete_.addInt(i14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteShotRequest build() {
                DeleteShotRequest deleteShotRequestBuildPartial = buildPartial();
                if (deleteShotRequestBuildPartial.isInitialized()) {
                    return deleteShotRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deleteShotRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteShotRequest buildPartial() {
                DeleteShotRequest deleteShotRequest = new DeleteShotRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deleteShotRequest);
                }
                onBuilt();
                return deleteShotRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.shotNumsToDelete_ = GeneratedMessageV3.emptyIntList();
                this.sessionUUID_ = ByteString.EMPTY;
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

            public Builder clearSessionUUID() {
                this.bitField0_ &= -3;
                this.sessionUUID_ = DeleteShotRequest.getDefaultInstance().getSessionUUID();
                onChanged();
                return this;
            }

            public Builder clearShotNumsToDelete() {
                this.shotNumsToDelete_ = GeneratedMessageV3.emptyIntList();
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
            public ByteString getSessionUUID() {
                return this.sessionUUID_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
            public int getShotNumsToDelete(int i14) {
                return this.shotNumsToDelete_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
            public int getShotNumsToDeleteCount() {
                return this.shotNumsToDelete_.size();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
            public List<Integer> getShotNumsToDeleteList() {
                this.shotNumsToDelete_.makeImmutable();
                return this.shotNumsToDelete_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotRequestOrBuilder
            public boolean hasSessionUUID() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteShotRequest.class, Builder.class);
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
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureShotNumsToDeleteIsMutable();
                                    this.shotNumsToDelete_.addInt(uInt32);
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureShotNumsToDeleteIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.shotNumsToDelete_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 18) {
                                    this.sessionUUID_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionUUID(ByteString byteString) {
                byteString.getClass();
                this.sessionUUID_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setShotNumsToDelete(int i14, int i15) {
                ensureShotNumsToDeleteIsMutable();
                this.shotNumsToDelete_.setInt(i14, i15);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeleteShotRequest getDefaultInstanceForType() {
                return DeleteShotRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shotNumsToDelete_ = GeneratedMessageV3.emptyIntList();
                this.sessionUUID_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeleteShotRequest) {
                    return mergeFrom((DeleteShotRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeleteShotRequest deleteShotRequest) {
                if (deleteShotRequest == DeleteShotRequest.getDefaultInstance()) {
                    return this;
                }
                if (!deleteShotRequest.shotNumsToDelete_.isEmpty()) {
                    if (this.shotNumsToDelete_.isEmpty()) {
                        Internal.IntList intList = deleteShotRequest.shotNumsToDelete_;
                        this.shotNumsToDelete_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureShotNumsToDeleteIsMutable();
                        this.shotNumsToDelete_.addAll(deleteShotRequest.shotNumsToDelete_);
                    }
                    onChanged();
                }
                if (deleteShotRequest.hasSessionUUID()) {
                    setSessionUUID(deleteShotRequest.getSessionUUID());
                }
                mergeUnknownFields(deleteShotRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeleteShotRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeleteShotRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteShotRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteShotRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeleteShotRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteShotRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeleteShotRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeleteShotRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeleteShotRequest parseFrom(InputStream inputStream) {
            return (DeleteShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeleteShotRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteShotRequest parseFrom(CodedInputStream codedInputStream) {
            return (DeleteShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeleteShotRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private DeleteShotRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.shotNumsToDelete_ = GeneratedMessageV3.emptyIntList();
            this.sessionUUID_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ DeleteShotRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class DeleteShotResponse extends GeneratedMessageV3 implements DeleteShotResponseOrBuilder {
        private static final DeleteShotResponse DEFAULT_INSTANCE = new DeleteShotResponse();

        @Deprecated
        public static final Parser<DeleteShotResponse> PARSER = new AbstractParser<DeleteShotResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotResponse.1
            @Override // com.google.protobuf.Parser
            public DeleteShotResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeleteShotResponse.newBuilder();
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

        private DeleteShotResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeleteShotResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_descriptor;
        }

        public static Builder newBuilder(DeleteShotResponse deleteShotResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteShotResponse);
        }

        public static DeleteShotResponse parseDelimitedFrom(InputStream inputStream) {
            return (DeleteShotResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeleteShotResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeleteShotResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteShotResponse)) {
                return super.equals(obj);
            }
            DeleteShotResponse deleteShotResponse = (DeleteShotResponse) obj;
            if (hasStatus() != deleteShotResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == deleteShotResponse.status_) && getUnknownFields().equals(deleteShotResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeleteShotResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotResponseOrBuilder
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteShotResponse.class, Builder.class);
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
            return new DeleteShotResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeleteShotResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(DeleteShotResponse deleteShotResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    deleteShotResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                deleteShotResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteShotResponse build() {
                DeleteShotResponse deleteShotResponseBuildPartial = buildPartial();
                if (deleteShotResponseBuildPartial.isInitialized()) {
                    return deleteShotResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deleteShotResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteShotResponse buildPartial() {
                DeleteShotResponse deleteShotResponse = new DeleteShotResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deleteShotResponse);
                }
                onBuilt();
                return deleteShotResponse;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeleteShotResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeleteShotResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteShotResponse.class, Builder.class);
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
            public DeleteShotResponse getDefaultInstanceForType() {
                return DeleteShotResponse.getDefaultInstance();
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
                if (message instanceof DeleteShotResponse) {
                    return mergeFrom((DeleteShotResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeleteShotResponse deleteShotResponse) {
                if (deleteShotResponse == DeleteShotResponse.getDefaultInstance()) {
                    return this;
                }
                if (deleteShotResponse.hasStatus()) {
                    setStatus(deleteShotResponse.getStatus());
                }
                mergeUnknownFields(deleteShotResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeleteShotResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeleteShotResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteShotResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteShotResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DeleteShotResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeleteShotResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DeleteShotResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteShotResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeleteShotResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeleteShotResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeleteShotResponse parseFrom(InputStream inputStream) {
            return (DeleteShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeleteShotResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteShotResponse parseFrom(CodedInputStream codedInputStream) {
            return (DeleteShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeleteShotResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeviceIdentificationResponse extends GeneratedMessageV3 implements DeviceIdentificationResponseOrBuilder {
        private static final DeviceIdentificationResponse DEFAULT_INSTANCE = new DeviceIdentificationResponse();

        @Deprecated
        public static final Parser<DeviceIdentificationResponse> PARSER = new AbstractParser<DeviceIdentificationResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationResponse.1
            @Override // com.google.protobuf.Parser
            public DeviceIdentificationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceIdentificationResponse.newBuilder();
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

        private DeviceIdentificationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceIdentificationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_descriptor;
        }

        public static Builder newBuilder(DeviceIdentificationResponse deviceIdentificationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceIdentificationResponse);
        }

        public static DeviceIdentificationResponse parseDelimitedFrom(InputStream inputStream) {
            return (DeviceIdentificationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceIdentificationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceIdentificationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceIdentificationResponse)) {
                return super.equals(obj);
            }
            DeviceIdentificationResponse deviceIdentificationResponse = (DeviceIdentificationResponse) obj;
            if (hasStatus() != deviceIdentificationResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == deviceIdentificationResponse.status_) && getUnknownFields().equals(deviceIdentificationResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceIdentificationResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationResponseOrBuilder
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceIdentificationResponse.class, Builder.class);
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
            return new DeviceIdentificationResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceIdentificationResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(DeviceIdentificationResponse deviceIdentificationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    deviceIdentificationResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                deviceIdentificationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceIdentificationResponse build() {
                DeviceIdentificationResponse deviceIdentificationResponseBuildPartial = buildPartial();
                if (deviceIdentificationResponseBuildPartial.isInitialized()) {
                    return deviceIdentificationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceIdentificationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceIdentificationResponse buildPartial() {
                DeviceIdentificationResponse deviceIdentificationResponse = new DeviceIdentificationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceIdentificationResponse);
                }
                onBuilt();
                return deviceIdentificationResponse;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.DeviceIdentificationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_DeviceIdentificationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceIdentificationResponse.class, Builder.class);
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
            public DeviceIdentificationResponse getDefaultInstanceForType() {
                return DeviceIdentificationResponse.getDefaultInstance();
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
                if (message instanceof DeviceIdentificationResponse) {
                    return mergeFrom((DeviceIdentificationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceIdentificationResponse deviceIdentificationResponse) {
                if (deviceIdentificationResponse == DeviceIdentificationResponse.getDefaultInstance()) {
                    return this;
                }
                if (deviceIdentificationResponse.hasStatus()) {
                    setStatus(deviceIdentificationResponse.getStatus());
                }
                mergeUnknownFields(deviceIdentificationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceIdentificationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeviceIdentificationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceIdentificationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceIdentificationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DeviceIdentificationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeviceIdentificationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DeviceIdentificationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceIdentificationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceIdentificationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceIdentificationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceIdentificationResponse parseFrom(InputStream inputStream) {
            return (DeviceIdentificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceIdentificationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceIdentificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceIdentificationResponse parseFrom(CodedInputStream codedInputStream) {
            return (DeviceIdentificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceIdentificationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceIdentificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ExcludeShotRequest extends GeneratedMessageV3 implements ExcludeShotRequestOrBuilder {
        private static final ExcludeShotRequest DEFAULT_INSTANCE = new ExcludeShotRequest();

        @Deprecated
        public static final Parser<ExcludeShotRequest> PARSER = new AbstractParser<ExcludeShotRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequest.1
            @Override // com.google.protobuf.Parser
            public ExcludeShotRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ExcludeShotRequest.newBuilder();
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
        public static final int SESSIONUUID_FIELD_NUMBER = 2;
        public static final int SHOT_NUMS_TO_EXCLUDE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString sessionUUID_;
        private Internal.IntList shotNumsToExclude_;

        private ExcludeShotRequest() {
            this.shotNumsToExclude_ = GeneratedMessageV3.emptyIntList();
            ByteString byteString = ByteString.EMPTY;
            this.sessionUUID_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.shotNumsToExclude_ = GeneratedMessageV3.emptyIntList();
            this.sessionUUID_ = byteString;
        }

        public static ExcludeShotRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_descriptor;
        }

        public static Builder newBuilder(ExcludeShotRequest excludeShotRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(excludeShotRequest);
        }

        public static ExcludeShotRequest parseDelimitedFrom(InputStream inputStream) {
            return (ExcludeShotRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExcludeShotRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ExcludeShotRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExcludeShotRequest)) {
                return super.equals(obj);
            }
            ExcludeShotRequest excludeShotRequest = (ExcludeShotRequest) obj;
            if (getShotNumsToExcludeList().equals(excludeShotRequest.getShotNumsToExcludeList()) && hasSessionUUID() == excludeShotRequest.hasSessionUUID()) {
                return (!hasSessionUUID() || getSessionUUID().equals(excludeShotRequest.getSessionUUID())) && getUnknownFields().equals(excludeShotRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ExcludeShotRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iB = 0;
            for (int i15 = 0; i15 < this.shotNumsToExclude_.size(); i15++) {
                iB = f3.b(this.shotNumsToExclude_, i15, iB);
            }
            int size = getShotNumsToExcludeList().size() + iB;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeBytesSize(2, this.sessionUUID_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
        public ByteString getSessionUUID() {
            return this.sessionUUID_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
        public int getShotNumsToExclude(int i14) {
            return this.shotNumsToExclude_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
        public int getShotNumsToExcludeCount() {
            return this.shotNumsToExclude_.size();
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
        public List<Integer> getShotNumsToExcludeList() {
            return this.shotNumsToExclude_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
        public boolean hasSessionUUID() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getShotNumsToExcludeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShotNumsToExcludeList().hashCode();
            }
            if (hasSessionUUID()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSessionUUID().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ExcludeShotRequest.class, Builder.class);
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
            return new ExcludeShotRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iC = 0;
            while (iC < this.shotNumsToExclude_.size()) {
                iC = f3.c(this.shotNumsToExclude_, iC, codedOutputStream, 1, iC, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(2, this.sessionUUID_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExcludeShotRequestOrBuilder {
            private int bitField0_;
            private ByteString sessionUUID_;
            private Internal.IntList shotNumsToExclude_;

            private Builder() {
                this.shotNumsToExclude_ = GeneratedMessageV3.emptyIntList();
                this.sessionUUID_ = ByteString.EMPTY;
            }

            private void buildPartial0(ExcludeShotRequest excludeShotRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    this.shotNumsToExclude_.makeImmutable();
                    excludeShotRequest.shotNumsToExclude_ = this.shotNumsToExclude_;
                }
                if ((i15 & 2) != 0) {
                    excludeShotRequest.sessionUUID_ = this.sessionUUID_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                excludeShotRequest.bitField0_ = i14 | excludeShotRequest.bitField0_;
            }

            private void ensureShotNumsToExcludeIsMutable() {
                if (!this.shotNumsToExclude_.isModifiable()) {
                    this.shotNumsToExclude_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.shotNumsToExclude_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_descriptor;
            }

            public Builder addAllShotNumsToExclude(Iterable<? extends Integer> iterable) {
                ensureShotNumsToExcludeIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.shotNumsToExclude_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addShotNumsToExclude(int i14) {
                ensureShotNumsToExcludeIsMutable();
                this.shotNumsToExclude_.addInt(i14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExcludeShotRequest build() {
                ExcludeShotRequest excludeShotRequestBuildPartial = buildPartial();
                if (excludeShotRequestBuildPartial.isInitialized()) {
                    return excludeShotRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) excludeShotRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExcludeShotRequest buildPartial() {
                ExcludeShotRequest excludeShotRequest = new ExcludeShotRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(excludeShotRequest);
                }
                onBuilt();
                return excludeShotRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.shotNumsToExclude_ = GeneratedMessageV3.emptyIntList();
                this.sessionUUID_ = ByteString.EMPTY;
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

            public Builder clearSessionUUID() {
                this.bitField0_ &= -3;
                this.sessionUUID_ = ExcludeShotRequest.getDefaultInstance().getSessionUUID();
                onChanged();
                return this;
            }

            public Builder clearShotNumsToExclude() {
                this.shotNumsToExclude_ = GeneratedMessageV3.emptyIntList();
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
            public ByteString getSessionUUID() {
                return this.sessionUUID_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
            public int getShotNumsToExclude(int i14) {
                return this.shotNumsToExclude_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
            public int getShotNumsToExcludeCount() {
                return this.shotNumsToExclude_.size();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
            public List<Integer> getShotNumsToExcludeList() {
                this.shotNumsToExclude_.makeImmutable();
                return this.shotNumsToExclude_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotRequestOrBuilder
            public boolean hasSessionUUID() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ExcludeShotRequest.class, Builder.class);
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
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureShotNumsToExcludeIsMutable();
                                    this.shotNumsToExclude_.addInt(uInt32);
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureShotNumsToExcludeIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.shotNumsToExclude_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 18) {
                                    this.sessionUUID_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionUUID(ByteString byteString) {
                byteString.getClass();
                this.sessionUUID_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setShotNumsToExclude(int i14, int i15) {
                ensureShotNumsToExcludeIsMutable();
                this.shotNumsToExclude_.setInt(i14, i15);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ExcludeShotRequest getDefaultInstanceForType() {
                return ExcludeShotRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shotNumsToExclude_ = GeneratedMessageV3.emptyIntList();
                this.sessionUUID_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ExcludeShotRequest) {
                    return mergeFrom((ExcludeShotRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ExcludeShotRequest excludeShotRequest) {
                if (excludeShotRequest == ExcludeShotRequest.getDefaultInstance()) {
                    return this;
                }
                if (!excludeShotRequest.shotNumsToExclude_.isEmpty()) {
                    if (this.shotNumsToExclude_.isEmpty()) {
                        Internal.IntList intList = excludeShotRequest.shotNumsToExclude_;
                        this.shotNumsToExclude_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureShotNumsToExcludeIsMutable();
                        this.shotNumsToExclude_.addAll(excludeShotRequest.shotNumsToExclude_);
                    }
                    onChanged();
                }
                if (excludeShotRequest.hasSessionUUID()) {
                    setSessionUUID(excludeShotRequest.getSessionUUID());
                }
                mergeUnknownFields(excludeShotRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ExcludeShotRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ExcludeShotRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExcludeShotRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExcludeShotRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ExcludeShotRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ExcludeShotRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ExcludeShotRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ExcludeShotRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ExcludeShotRequest parseFrom(InputStream inputStream) {
            return (ExcludeShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ExcludeShotRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExcludeShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExcludeShotRequest parseFrom(CodedInputStream codedInputStream) {
            return (ExcludeShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ExcludeShotRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExcludeShotRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ExcludeShotRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.shotNumsToExclude_ = GeneratedMessageV3.emptyIntList();
            this.sessionUUID_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ExcludeShotRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ExcludeShotResponse extends GeneratedMessageV3 implements ExcludeShotResponseOrBuilder {
        private static final ExcludeShotResponse DEFAULT_INSTANCE = new ExcludeShotResponse();

        @Deprecated
        public static final Parser<ExcludeShotResponse> PARSER = new AbstractParser<ExcludeShotResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotResponse.1
            @Override // com.google.protobuf.Parser
            public ExcludeShotResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ExcludeShotResponse.newBuilder();
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

        private ExcludeShotResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExcludeShotResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_descriptor;
        }

        public static Builder newBuilder(ExcludeShotResponse excludeShotResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(excludeShotResponse);
        }

        public static ExcludeShotResponse parseDelimitedFrom(InputStream inputStream) {
            return (ExcludeShotResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExcludeShotResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ExcludeShotResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExcludeShotResponse)) {
                return super.equals(obj);
            }
            ExcludeShotResponse excludeShotResponse = (ExcludeShotResponse) obj;
            if (hasStatus() != excludeShotResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == excludeShotResponse.status_) && getUnknownFields().equals(excludeShotResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ExcludeShotResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotResponseOrBuilder
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ExcludeShotResponse.class, Builder.class);
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
            return new ExcludeShotResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExcludeShotResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ExcludeShotResponse excludeShotResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    excludeShotResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                excludeShotResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExcludeShotResponse build() {
                ExcludeShotResponse excludeShotResponseBuildPartial = buildPartial();
                if (excludeShotResponseBuildPartial.isInitialized()) {
                    return excludeShotResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) excludeShotResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExcludeShotResponse buildPartial() {
                ExcludeShotResponse excludeShotResponse = new ExcludeShotResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(excludeShotResponse);
                }
                onBuilt();
                return excludeShotResponse;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ExcludeShotResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ExcludeShotResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ExcludeShotResponse.class, Builder.class);
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
            public ExcludeShotResponse getDefaultInstanceForType() {
                return ExcludeShotResponse.getDefaultInstance();
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
                if (message instanceof ExcludeShotResponse) {
                    return mergeFrom((ExcludeShotResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ExcludeShotResponse excludeShotResponse) {
                if (excludeShotResponse == ExcludeShotResponse.getDefaultInstance()) {
                    return this;
                }
                if (excludeShotResponse.hasStatus()) {
                    setStatus(excludeShotResponse.getStatus());
                }
                mergeUnknownFields(excludeShotResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ExcludeShotResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ExcludeShotResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExcludeShotResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExcludeShotResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ExcludeShotResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ExcludeShotResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ExcludeShotResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ExcludeShotResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ExcludeShotResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ExcludeShotResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ExcludeShotResponse parseFrom(InputStream inputStream) {
            return (ExcludeShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ExcludeShotResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExcludeShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExcludeShotResponse parseFrom(CodedInputStream codedInputStream) {
            return (ExcludeShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ExcludeShotResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExcludeShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LastShotResponse extends GeneratedMessageV3 implements LastShotResponseOrBuilder {
        public static final int LAST_SHOT_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ShotMessage lastShot_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final LastShotResponse DEFAULT_INSTANCE = new LastShotResponse();

        @Deprecated
        public static final Parser<LastShotResponse> PARSER = new AbstractParser<LastShotResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponse.1
            @Override // com.google.protobuf.Parser
            public LastShotResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LastShotResponse.newBuilder();
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

        private LastShotResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LastShotResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotResponse_descriptor;
        }

        public static Builder newBuilder(LastShotResponse lastShotResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lastShotResponse);
        }

        public static LastShotResponse parseDelimitedFrom(InputStream inputStream) {
            return (LastShotResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LastShotResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LastShotResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LastShotResponse)) {
                return super.equals(obj);
            }
            LastShotResponse lastShotResponse = (LastShotResponse) obj;
            if (hasLastShot() != lastShotResponse.hasLastShot()) {
                return false;
            }
            if ((!hasLastShot() || getLastShot().equals(lastShotResponse.getLastShot())) && hasStatus() == lastShotResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == lastShotResponse.status_) && getUnknownFields().equals(lastShotResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
        public ShotMessage getLastShot() {
            ShotMessage shotMessage = this.lastShot_;
            return shotMessage == null ? ShotMessage.getDefaultInstance() : shotMessage;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
        public ShotMessageOrBuilder getLastShotOrBuilder() {
            ShotMessage shotMessage = this.lastShot_;
            return shotMessage == null ? ShotMessage.getDefaultInstance() : shotMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LastShotResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLastShot()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
        public boolean hasLastShot() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
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
            if (hasLastShot()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLastShot().hashCode();
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LastShotResponse.class, Builder.class);
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
            return new LastShotResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLastShot());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LastShotResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> lastShotBuilder_;
            private ShotMessage lastShot_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LastShotResponse lastShotResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.lastShotBuilder_;
                    lastShotResponse.lastShot_ = singleFieldBuilderV3 == null ? this.lastShot_ : (ShotMessage) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    lastShotResponse.status_ = this.status_;
                    i14 |= 2;
                }
                lastShotResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotResponse_descriptor;
            }

            private SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> getLastShotFieldBuilder() {
                if (this.lastShotBuilder_ == null) {
                    this.lastShotBuilder_ = new SingleFieldBuilderV3<>(getLastShot(), getParentForChildren(), isClean());
                    this.lastShot_ = null;
                }
                return this.lastShotBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLastShotFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LastShotResponse build() {
                LastShotResponse lastShotResponseBuildPartial = buildPartial();
                if (lastShotResponseBuildPartial.isInitialized()) {
                    return lastShotResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lastShotResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LastShotResponse buildPartial() {
                LastShotResponse lastShotResponse = new LastShotResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lastShotResponse);
                }
                onBuilt();
                return lastShotResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.lastShot_ = null;
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.lastShotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lastShotBuilder_ = null;
                }
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLastShot() {
                this.bitField0_ &= -2;
                this.lastShot_ = null;
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.lastShotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lastShotBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -3;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
            public ShotMessage getLastShot() {
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.lastShotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotMessage) singleFieldBuilderV3.getMessage();
                }
                ShotMessage shotMessage = this.lastShot_;
                return shotMessage == null ? ShotMessage.getDefaultInstance() : shotMessage;
            }

            public ShotMessage.Builder getLastShotBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ShotMessage.Builder) getLastShotFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
            public ShotMessageOrBuilder getLastShotOrBuilder() {
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.lastShotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShotMessage shotMessage = this.lastShot_;
                return shotMessage == null ? ShotMessage.getDefaultInstance() : shotMessage;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
            public boolean hasLastShot() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.LastShotResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_LastShotResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LastShotResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getLastShotFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
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

            public Builder mergeLastShot(ShotMessage shotMessage) {
                ShotMessage shotMessage2;
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.lastShotBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shotMessage);
                } else if ((this.bitField0_ & 1) == 0 || (shotMessage2 = this.lastShot_) == null || shotMessage2 == ShotMessage.getDefaultInstance()) {
                    this.lastShot_ = shotMessage;
                } else {
                    getLastShotBuilder().mergeFrom(shotMessage);
                }
                if (this.lastShot_ != null) {
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

            public Builder setLastShot(ShotMessage.Builder builder) {
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.lastShotBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lastShot_ = builder.build();
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 2;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LastShotResponse getDefaultInstanceForType() {
                return LastShotResponse.getDefaultInstance();
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

            public Builder setLastShot(ShotMessage shotMessage) {
                SingleFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> singleFieldBuilderV3 = this.lastShotBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shotMessage.getClass();
                    this.lastShot_ = shotMessage;
                } else {
                    singleFieldBuilderV3.setMessage(shotMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LastShotResponse) {
                    return mergeFrom((LastShotResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LastShotResponse lastShotResponse) {
                if (lastShotResponse == LastShotResponse.getDefaultInstance()) {
                    return this;
                }
                if (lastShotResponse.hasLastShot()) {
                    mergeLastShot(lastShotResponse.getLastShot());
                }
                if (lastShotResponse.hasStatus()) {
                    setStatus(lastShotResponse.getStatus());
                }
                mergeUnknownFields(lastShotResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LastShotResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LastShotResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LastShotResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LastShotResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LastShotResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LastShotResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LastShotResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LastShotResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LastShotResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LastShotResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LastShotResponse parseFrom(InputStream inputStream) {
            return (LastShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LastShotResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LastShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LastShotResponse parseFrom(CodedInputStream codedInputStream) {
            return (LastShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LastShotResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LastShotResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RadarStatusResponse extends GeneratedMessageV3 implements RadarStatusResponseOrBuilder {
        private static final RadarStatusResponse DEFAULT_INSTANCE = new RadarStatusResponse();

        @Deprecated
        public static final Parser<RadarStatusResponse> PARSER = new AbstractParser<RadarStatusResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponse.1
            @Override // com.google.protobuf.Parser
            public RadarStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RadarStatusResponse.newBuilder();
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
        public static final int RADAR_ACTIVE_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean radarActive_;
        private int status_;

        private RadarStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.radarActive_ = false;
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RadarStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_descriptor;
        }

        public static Builder newBuilder(RadarStatusResponse radarStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(radarStatusResponse);
        }

        public static RadarStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (RadarStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RadarStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RadarStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RadarStatusResponse)) {
                return super.equals(obj);
            }
            RadarStatusResponse radarStatusResponse = (RadarStatusResponse) obj;
            if (hasRadarActive() != radarStatusResponse.hasRadarActive()) {
                return false;
            }
            if ((!hasRadarActive() || getRadarActive() == radarStatusResponse.getRadarActive()) && hasStatus() == radarStatusResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == radarStatusResponse.status_) && getUnknownFields().equals(radarStatusResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RadarStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponseOrBuilder
        public boolean getRadarActive() {
            return this.radarActive_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.radarActive_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponseOrBuilder
        public boolean hasRadarActive() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponseOrBuilder
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
            if (hasRadarActive()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getRadarActive());
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RadarStatusResponse.class, Builder.class);
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
            return new RadarStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.radarActive_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RadarStatusResponseOrBuilder {
            private int bitField0_;
            private boolean radarActive_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(RadarStatusResponse radarStatusResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    radarStatusResponse.radarActive_ = this.radarActive_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    radarStatusResponse.status_ = this.status_;
                    i14 |= 2;
                }
                radarStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RadarStatusResponse build() {
                RadarStatusResponse radarStatusResponseBuildPartial = buildPartial();
                if (radarStatusResponseBuildPartial.isInitialized()) {
                    return radarStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) radarStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RadarStatusResponse buildPartial() {
                RadarStatusResponse radarStatusResponse = new RadarStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(radarStatusResponse);
                }
                onBuilt();
                return radarStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.radarActive_ = false;
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

            public Builder clearRadarActive() {
                this.bitField0_ &= -2;
                this.radarActive_ = false;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -3;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponseOrBuilder
            public boolean getRadarActive() {
                return this.radarActive_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponseOrBuilder
            public boolean hasRadarActive() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RadarStatusResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RadarStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RadarStatusResponse.class, Builder.class);
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
                                    this.radarActive_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
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

            public Builder setRadarActive(boolean z14) {
                this.radarActive_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 2;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RadarStatusResponse getDefaultInstanceForType() {
                return RadarStatusResponse.getDefaultInstance();
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
                if (message instanceof RadarStatusResponse) {
                    return mergeFrom((RadarStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RadarStatusResponse radarStatusResponse) {
                if (radarStatusResponse == RadarStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (radarStatusResponse.hasRadarActive()) {
                    setRadarActive(radarStatusResponse.getRadarActive());
                }
                if (radarStatusResponse.hasStatus()) {
                    setStatus(radarStatusResponse.getStatus());
                }
                mergeUnknownFields(radarStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RadarStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RadarStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadarStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RadarStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RadarStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RadarStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ RadarStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RadarStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private RadarStatusResponse() {
            this.radarActive_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static RadarStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RadarStatusResponse parseFrom(InputStream inputStream) {
            return (RadarStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RadarStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadarStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RadarStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (RadarStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RadarStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RadarStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RearmRadarResponse extends GeneratedMessageV3 implements RearmRadarResponseOrBuilder {
        private static final RearmRadarResponse DEFAULT_INSTANCE = new RearmRadarResponse();

        @Deprecated
        public static final Parser<RearmRadarResponse> PARSER = new AbstractParser<RearmRadarResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.RearmRadarResponse.1
            @Override // com.google.protobuf.Parser
            public RearmRadarResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RearmRadarResponse.newBuilder();
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

        private RearmRadarResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RearmRadarResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_descriptor;
        }

        public static Builder newBuilder(RearmRadarResponse rearmRadarResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rearmRadarResponse);
        }

        public static RearmRadarResponse parseDelimitedFrom(InputStream inputStream) {
            return (RearmRadarResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RearmRadarResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RearmRadarResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RearmRadarResponse)) {
                return super.equals(obj);
            }
            RearmRadarResponse rearmRadarResponse = (RearmRadarResponse) obj;
            if (hasStatus() != rearmRadarResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == rearmRadarResponse.status_) && getUnknownFields().equals(rearmRadarResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RearmRadarResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RearmRadarResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RearmRadarResponseOrBuilder
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RearmRadarResponse.class, Builder.class);
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
            return new RearmRadarResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RearmRadarResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(RearmRadarResponse rearmRadarResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    rearmRadarResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                rearmRadarResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RearmRadarResponse build() {
                RearmRadarResponse rearmRadarResponseBuildPartial = buildPartial();
                if (rearmRadarResponseBuildPartial.isInitialized()) {
                    return rearmRadarResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rearmRadarResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RearmRadarResponse buildPartial() {
                RearmRadarResponse rearmRadarResponse = new RearmRadarResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(rearmRadarResponse);
                }
                onBuilt();
                return rearmRadarResponse;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RearmRadarResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RearmRadarResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RearmRadarResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RearmRadarResponse.class, Builder.class);
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
            public RearmRadarResponse getDefaultInstanceForType() {
                return RearmRadarResponse.getDefaultInstance();
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
                if (message instanceof RearmRadarResponse) {
                    return mergeFrom((RearmRadarResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RearmRadarResponse rearmRadarResponse) {
                if (rearmRadarResponse == RearmRadarResponse.getDefaultInstance()) {
                    return this;
                }
                if (rearmRadarResponse.hasStatus()) {
                    setStatus(rearmRadarResponse.getStatus());
                }
                mergeUnknownFields(rearmRadarResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RearmRadarResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RearmRadarResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RearmRadarResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RearmRadarResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ RearmRadarResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RearmRadarResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private RearmRadarResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RearmRadarResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RearmRadarResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RearmRadarResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RearmRadarResponse parseFrom(InputStream inputStream) {
            return (RearmRadarResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RearmRadarResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RearmRadarResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RearmRadarResponse parseFrom(CodedInputStream codedInputStream) {
            return (RearmRadarResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RearmRadarResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RearmRadarResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RecentSessionsResponse extends GeneratedMessageV3 implements RecentSessionsResponseOrBuilder {
        private static final RecentSessionsResponse DEFAULT_INSTANCE = new RecentSessionsResponse();

        @Deprecated
        public static final Parser<RecentSessionsResponse> PARSER = new AbstractParser<RecentSessionsResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponse.1
            @Override // com.google.protobuf.Parser
            public RecentSessionsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RecentSessionsResponse.newBuilder();
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
        public static final int RECENT_SESSIONS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<SessionInfoMessage> recentSessions_;
        private int status_;

        private RecentSessionsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.recentSessions_ = Collections.EMPTY_LIST;
        }

        public static RecentSessionsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_descriptor;
        }

        public static Builder newBuilder(RecentSessionsResponse recentSessionsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(recentSessionsResponse);
        }

        public static RecentSessionsResponse parseDelimitedFrom(InputStream inputStream) {
            return (RecentSessionsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RecentSessionsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RecentSessionsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecentSessionsResponse)) {
                return super.equals(obj);
            }
            RecentSessionsResponse recentSessionsResponse = (RecentSessionsResponse) obj;
            if (hasStatus() != recentSessionsResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == recentSessionsResponse.status_) && getRecentSessionsList().equals(recentSessionsResponse.getRecentSessionsList()) && getUnknownFields().equals(recentSessionsResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RecentSessionsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
        public SessionInfoMessage getRecentSessions(int i14) {
            return this.recentSessions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
        public int getRecentSessionsCount() {
            return this.recentSessions_.size();
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
        public List<SessionInfoMessage> getRecentSessionsList() {
            return this.recentSessions_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
        public SessionInfoMessageOrBuilder getRecentSessionsOrBuilder(int i14) {
            return this.recentSessions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
        public List<? extends SessionInfoMessageOrBuilder> getRecentSessionsOrBuilderList() {
            return this.recentSessions_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            for (int i15 = 0; i15 < this.recentSessions_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.recentSessions_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
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
            if (getRecentSessionsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRecentSessionsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RecentSessionsResponse.class, Builder.class);
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
            return new RecentSessionsResponse();
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
            for (int i14 = 0; i14 < this.recentSessions_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.recentSessions_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecentSessionsResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> recentSessionsBuilder_;
            private List<SessionInfoMessage> recentSessions_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.recentSessions_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(RecentSessionsResponse recentSessionsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    recentSessionsResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                recentSessionsResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(RecentSessionsResponse recentSessionsResponse) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    recentSessionsResponse.recentSessions_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.recentSessions_ = Collections.unmodifiableList(this.recentSessions_);
                    this.bitField0_ &= -3;
                }
                recentSessionsResponse.recentSessions_ = this.recentSessions_;
            }

            private void ensureRecentSessionsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.recentSessions_ = new ArrayList(this.recentSessions_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> getRecentSessionsFieldBuilder() {
                if (this.recentSessionsBuilder_ == null) {
                    this.recentSessionsBuilder_ = new RepeatedFieldBuilderV3<>(this.recentSessions_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.recentSessions_ = null;
                }
                return this.recentSessionsBuilder_;
            }

            public Builder addAllRecentSessions(Iterable<? extends SessionInfoMessage> iterable) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureRecentSessionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.recentSessions_);
                onChanged();
                return this;
            }

            public Builder addRecentSessions(SessionInfoMessage.Builder builder) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureRecentSessionsIsMutable();
                this.recentSessions_.add(builder.build());
                onChanged();
                return this;
            }

            public SessionInfoMessage.Builder addRecentSessionsBuilder() {
                return (SessionInfoMessage.Builder) getRecentSessionsFieldBuilder().addBuilder(SessionInfoMessage.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RecentSessionsResponse build() {
                RecentSessionsResponse recentSessionsResponseBuildPartial = buildPartial();
                if (recentSessionsResponseBuildPartial.isInitialized()) {
                    return recentSessionsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) recentSessionsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RecentSessionsResponse buildPartial() {
                RecentSessionsResponse recentSessionsResponse = new RecentSessionsResponse(this);
                buildPartialRepeatedFields(recentSessionsResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(recentSessionsResponse);
                }
                onBuilt();
                return recentSessionsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.recentSessions_ = Collections.EMPTY_LIST;
                } else {
                    this.recentSessions_ = null;
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

            public Builder clearRecentSessions() {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.recentSessions_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
            public SessionInfoMessage getRecentSessions(int i14) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.recentSessions_.get(i14) : (SessionInfoMessage) repeatedFieldBuilderV3.getMessage(i14);
            }

            public SessionInfoMessage.Builder getRecentSessionsBuilder(int i14) {
                return (SessionInfoMessage.Builder) getRecentSessionsFieldBuilder().getBuilder(i14);
            }

            public List<SessionInfoMessage.Builder> getRecentSessionsBuilderList() {
                return getRecentSessionsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
            public int getRecentSessionsCount() {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.recentSessions_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
            public List<SessionInfoMessage> getRecentSessionsList() {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.recentSessions_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
            public SessionInfoMessageOrBuilder getRecentSessionsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.recentSessions_.get(i14) : (SessionInfoMessageOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
            public List<? extends SessionInfoMessageOrBuilder> getRecentSessionsOrBuilderList() {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.recentSessions_);
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.RecentSessionsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_RecentSessionsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RecentSessionsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(RecentSessionsResponse recentSessionsResponse) {
                if (recentSessionsResponse == RecentSessionsResponse.getDefaultInstance()) {
                    return this;
                }
                if (recentSessionsResponse.hasStatus()) {
                    setStatus(recentSessionsResponse.getStatus());
                }
                if (this.recentSessionsBuilder_ == null) {
                    if (!recentSessionsResponse.recentSessions_.isEmpty()) {
                        if (this.recentSessions_.isEmpty()) {
                            this.recentSessions_ = recentSessionsResponse.recentSessions_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureRecentSessionsIsMutable();
                            this.recentSessions_.addAll(recentSessionsResponse.recentSessions_);
                        }
                        onChanged();
                    }
                } else if (!recentSessionsResponse.recentSessions_.isEmpty()) {
                    boolean zIsEmpty = this.recentSessionsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.recentSessionsBuilder_ = null;
                        this.recentSessions_ = recentSessionsResponse.recentSessions_;
                        this.bitField0_ &= -3;
                        this.recentSessionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getRecentSessionsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(recentSessionsResponse.recentSessions_);
                    }
                }
                mergeUnknownFields(recentSessionsResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeRecentSessions(int i14) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureRecentSessionsIsMutable();
                this.recentSessions_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setRecentSessions(int i14, SessionInfoMessage.Builder builder) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureRecentSessionsIsMutable();
                this.recentSessions_.set(i14, builder.build());
                onChanged();
                return this;
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
            public RecentSessionsResponse getDefaultInstanceForType() {
                return RecentSessionsResponse.getDefaultInstance();
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
                this.recentSessions_ = Collections.EMPTY_LIST;
            }

            public SessionInfoMessage.Builder addRecentSessionsBuilder(int i14) {
                return (SessionInfoMessage.Builder) getRecentSessionsFieldBuilder().addBuilder(i14, SessionInfoMessage.getDefaultInstance());
            }

            public Builder addRecentSessions(int i14, SessionInfoMessage sessionInfoMessage) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sessionInfoMessage.getClass();
                    ensureRecentSessionsIsMutable();
                    this.recentSessions_.add(i14, sessionInfoMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, sessionInfoMessage);
                return this;
            }

            public Builder setRecentSessions(int i14, SessionInfoMessage sessionInfoMessage) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sessionInfoMessage.getClass();
                    ensureRecentSessionsIsMutable();
                    this.recentSessions_.set(i14, sessionInfoMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, sessionInfoMessage);
                return this;
            }

            public Builder addRecentSessions(SessionInfoMessage sessionInfoMessage) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sessionInfoMessage.getClass();
                    ensureRecentSessionsIsMutable();
                    this.recentSessions_.add(sessionInfoMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(sessionInfoMessage);
                return this;
            }

            public Builder addRecentSessions(int i14, SessionInfoMessage.Builder builder) {
                RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRecentSessionsIsMutable();
                    this.recentSessions_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RecentSessionsResponse) {
                    return mergeFrom((RecentSessionsResponse) message);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    SessionInfoMessage sessionInfoMessage = (SessionInfoMessage) codedInputStream.readMessage(SessionInfoMessage.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> repeatedFieldBuilderV3 = this.recentSessionsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureRecentSessionsIsMutable();
                                        this.recentSessions_.add(sessionInfoMessage);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(sessionInfoMessage);
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
        public RecentSessionsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RecentSessionsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecentSessionsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RecentSessionsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RecentSessionsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RecentSessionsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RecentSessionsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RecentSessionsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private RecentSessionsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RecentSessionsResponse parseFrom(InputStream inputStream) {
            return (RecentSessionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RecentSessionsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecentSessionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ RecentSessionsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RecentSessionsResponse parseFrom(CodedInputStream codedInputStream) {
            return (RecentSessionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RecentSessionsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RecentSessionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int DELETE_SHOT_REQUEST_FIELD_NUMBER = 3;
        public static final int DELETE_SHOT_RESPONSE_FIELD_NUMBER = 4;
        public static final int DEVICE_IDENTIFICATION_REQUEST_FIELD_NUMBER = 19;
        public static final int DEVICE_IDENTIFICATION_RESPONSE_FIELD_NUMBER = 20;
        public static final int END_SESSION_REQUEST_FIELD_NUMBER = 5;
        public static final int END_SESSION_RESPONSE_FIELD_NUMBER = 6;
        public static final int EXCLUDE_SHOT_REQUEST_FIELD_NUMBER = 7;
        public static final int EXCLUDE_SHOT_RESPONSE_FIELD_NUMBER = 8;
        public static final int LAST_SHOT_REQUEST_FIELD_NUMBER = 21;
        public static final int LAST_SHOT_RESPONSE_FIELD_NUMBER = 22;
        public static final int RADAR_STATUS_REQUEST_FIELD_NUMBER = 23;
        public static final int RADAR_STATUS_RESPONSE_FIELD_NUMBER = 24;
        public static final int REARM_RADAR_REQUEST_FIELD_NUMBER = 17;
        public static final int REARM_RADAR_RESPONSE_FIELD_NUMBER = 18;
        public static final int RECENT_SESSIONS_REQUEST_FIELD_NUMBER = 15;
        public static final int RECENT_SESSIONS_RESPONSE_FIELD_NUMBER = 16;
        public static final int SESSION_INFO_REQUEST_FIELD_NUMBER = 11;
        public static final int SESSION_INFO_RESPONSE_FIELD_NUMBER = 12;
        public static final int SHOT_LIST_REQUEST_FIELD_NUMBER = 9;
        public static final int SHOT_LIST_RESPONSE_FIELD_NUMBER = 10;
        public static final int START_SESSION_REQUEST_FIELD_NUMBER = 1;
        public static final int START_SESSION_RESPONSE_FIELD_NUMBER = 2;
        public static final int TITLE_CHANGE_REQUEST_FIELD_NUMBER = 13;
        public static final int TITLE_CHANGE_RESPONSE_FIELD_NUMBER = 14;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DeleteShotRequest deleteShotRequest_;
        private DeleteShotResponse deleteShotResponse_;
        private DeviceIdentificationRequest deviceIdentificationRequest_;
        private DeviceIdentificationResponse deviceIdentificationResponse_;
        private StopSessionRequest endSessionRequest_;
        private StopSessionResponse endSessionResponse_;
        private ExcludeShotRequest excludeShotRequest_;
        private ExcludeShotResponse excludeShotResponse_;
        private LastShotRequest lastShotRequest_;
        private LastShotResponse lastShotResponse_;
        private byte memoizedIsInitialized;
        private RadarStatusRequest radarStatusRequest_;
        private RadarStatusResponse radarStatusResponse_;
        private RearmRadarRequest rearmRadarRequest_;
        private RearmRadarResponse rearmRadarResponse_;
        private RecentSessionsRequest recentSessionsRequest_;
        private RecentSessionsResponse recentSessionsResponse_;
        private SessionInfoRequest sessionInfoRequest_;
        private SessionInfoResponse sessionInfoResponse_;
        private ShotListRequest shotListRequest_;
        private ShotListResponse shotListResponse_;
        private StartSessionRequest startSessionRequest_;
        private StartSessionResponse startSessionResponse_;
        private TitleChangeRequest titleChangeRequest_;
        private TitleChangeResponse titleChangeResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.Service.1
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_Service_descriptor;
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
            if (hasStartSessionRequest() != service.hasStartSessionRequest()) {
                return false;
            }
            if ((hasStartSessionRequest() && !getStartSessionRequest().equals(service.getStartSessionRequest())) || hasStartSessionResponse() != service.hasStartSessionResponse()) {
                return false;
            }
            if ((hasStartSessionResponse() && !getStartSessionResponse().equals(service.getStartSessionResponse())) || hasDeleteShotRequest() != service.hasDeleteShotRequest()) {
                return false;
            }
            if ((hasDeleteShotRequest() && !getDeleteShotRequest().equals(service.getDeleteShotRequest())) || hasDeleteShotResponse() != service.hasDeleteShotResponse()) {
                return false;
            }
            if ((hasDeleteShotResponse() && !getDeleteShotResponse().equals(service.getDeleteShotResponse())) || hasEndSessionRequest() != service.hasEndSessionRequest()) {
                return false;
            }
            if ((hasEndSessionRequest() && !getEndSessionRequest().equals(service.getEndSessionRequest())) || hasEndSessionResponse() != service.hasEndSessionResponse()) {
                return false;
            }
            if ((hasEndSessionResponse() && !getEndSessionResponse().equals(service.getEndSessionResponse())) || hasExcludeShotRequest() != service.hasExcludeShotRequest()) {
                return false;
            }
            if ((hasExcludeShotRequest() && !getExcludeShotRequest().equals(service.getExcludeShotRequest())) || hasExcludeShotResponse() != service.hasExcludeShotResponse()) {
                return false;
            }
            if ((hasExcludeShotResponse() && !getExcludeShotResponse().equals(service.getExcludeShotResponse())) || hasShotListRequest() != service.hasShotListRequest()) {
                return false;
            }
            if ((hasShotListRequest() && !getShotListRequest().equals(service.getShotListRequest())) || hasShotListResponse() != service.hasShotListResponse()) {
                return false;
            }
            if ((hasShotListResponse() && !getShotListResponse().equals(service.getShotListResponse())) || hasSessionInfoRequest() != service.hasSessionInfoRequest()) {
                return false;
            }
            if ((hasSessionInfoRequest() && !getSessionInfoRequest().equals(service.getSessionInfoRequest())) || hasSessionInfoResponse() != service.hasSessionInfoResponse()) {
                return false;
            }
            if ((hasSessionInfoResponse() && !getSessionInfoResponse().equals(service.getSessionInfoResponse())) || hasTitleChangeRequest() != service.hasTitleChangeRequest()) {
                return false;
            }
            if ((hasTitleChangeRequest() && !getTitleChangeRequest().equals(service.getTitleChangeRequest())) || hasTitleChangeResponse() != service.hasTitleChangeResponse()) {
                return false;
            }
            if ((hasTitleChangeResponse() && !getTitleChangeResponse().equals(service.getTitleChangeResponse())) || hasRecentSessionsRequest() != service.hasRecentSessionsRequest()) {
                return false;
            }
            if ((hasRecentSessionsRequest() && !getRecentSessionsRequest().equals(service.getRecentSessionsRequest())) || hasRecentSessionsResponse() != service.hasRecentSessionsResponse()) {
                return false;
            }
            if ((hasRecentSessionsResponse() && !getRecentSessionsResponse().equals(service.getRecentSessionsResponse())) || hasRearmRadarRequest() != service.hasRearmRadarRequest()) {
                return false;
            }
            if ((hasRearmRadarRequest() && !getRearmRadarRequest().equals(service.getRearmRadarRequest())) || hasRearmRadarResponse() != service.hasRearmRadarResponse()) {
                return false;
            }
            if ((hasRearmRadarResponse() && !getRearmRadarResponse().equals(service.getRearmRadarResponse())) || hasDeviceIdentificationRequest() != service.hasDeviceIdentificationRequest()) {
                return false;
            }
            if ((hasDeviceIdentificationRequest() && !getDeviceIdentificationRequest().equals(service.getDeviceIdentificationRequest())) || hasDeviceIdentificationResponse() != service.hasDeviceIdentificationResponse()) {
                return false;
            }
            if ((hasDeviceIdentificationResponse() && !getDeviceIdentificationResponse().equals(service.getDeviceIdentificationResponse())) || hasLastShotRequest() != service.hasLastShotRequest()) {
                return false;
            }
            if ((hasLastShotRequest() && !getLastShotRequest().equals(service.getLastShotRequest())) || hasLastShotResponse() != service.hasLastShotResponse()) {
                return false;
            }
            if ((hasLastShotResponse() && !getLastShotResponse().equals(service.getLastShotResponse())) || hasRadarStatusRequest() != service.hasRadarStatusRequest()) {
                return false;
            }
            if ((!hasRadarStatusRequest() || getRadarStatusRequest().equals(service.getRadarStatusRequest())) && hasRadarStatusResponse() == service.hasRadarStatusResponse()) {
                return (!hasRadarStatusResponse() || getRadarStatusResponse().equals(service.getRadarStatusResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public DeleteShotRequest getDeleteShotRequest() {
            DeleteShotRequest deleteShotRequest = this.deleteShotRequest_;
            return deleteShotRequest == null ? DeleteShotRequest.getDefaultInstance() : deleteShotRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public DeleteShotRequestOrBuilder getDeleteShotRequestOrBuilder() {
            DeleteShotRequest deleteShotRequest = this.deleteShotRequest_;
            return deleteShotRequest == null ? DeleteShotRequest.getDefaultInstance() : deleteShotRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public DeleteShotResponse getDeleteShotResponse() {
            DeleteShotResponse deleteShotResponse = this.deleteShotResponse_;
            return deleteShotResponse == null ? DeleteShotResponse.getDefaultInstance() : deleteShotResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public DeleteShotResponseOrBuilder getDeleteShotResponseOrBuilder() {
            DeleteShotResponse deleteShotResponse = this.deleteShotResponse_;
            return deleteShotResponse == null ? DeleteShotResponse.getDefaultInstance() : deleteShotResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public DeviceIdentificationRequest getDeviceIdentificationRequest() {
            DeviceIdentificationRequest deviceIdentificationRequest = this.deviceIdentificationRequest_;
            return deviceIdentificationRequest == null ? DeviceIdentificationRequest.getDefaultInstance() : deviceIdentificationRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public DeviceIdentificationRequestOrBuilder getDeviceIdentificationRequestOrBuilder() {
            DeviceIdentificationRequest deviceIdentificationRequest = this.deviceIdentificationRequest_;
            return deviceIdentificationRequest == null ? DeviceIdentificationRequest.getDefaultInstance() : deviceIdentificationRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public DeviceIdentificationResponse getDeviceIdentificationResponse() {
            DeviceIdentificationResponse deviceIdentificationResponse = this.deviceIdentificationResponse_;
            return deviceIdentificationResponse == null ? DeviceIdentificationResponse.getDefaultInstance() : deviceIdentificationResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public DeviceIdentificationResponseOrBuilder getDeviceIdentificationResponseOrBuilder() {
            DeviceIdentificationResponse deviceIdentificationResponse = this.deviceIdentificationResponse_;
            return deviceIdentificationResponse == null ? DeviceIdentificationResponse.getDefaultInstance() : deviceIdentificationResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public StopSessionRequest getEndSessionRequest() {
            StopSessionRequest stopSessionRequest = this.endSessionRequest_;
            return stopSessionRequest == null ? StopSessionRequest.getDefaultInstance() : stopSessionRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public StopSessionRequestOrBuilder getEndSessionRequestOrBuilder() {
            StopSessionRequest stopSessionRequest = this.endSessionRequest_;
            return stopSessionRequest == null ? StopSessionRequest.getDefaultInstance() : stopSessionRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public StopSessionResponse getEndSessionResponse() {
            StopSessionResponse stopSessionResponse = this.endSessionResponse_;
            return stopSessionResponse == null ? StopSessionResponse.getDefaultInstance() : stopSessionResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public StopSessionResponseOrBuilder getEndSessionResponseOrBuilder() {
            StopSessionResponse stopSessionResponse = this.endSessionResponse_;
            return stopSessionResponse == null ? StopSessionResponse.getDefaultInstance() : stopSessionResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public ExcludeShotRequest getExcludeShotRequest() {
            ExcludeShotRequest excludeShotRequest = this.excludeShotRequest_;
            return excludeShotRequest == null ? ExcludeShotRequest.getDefaultInstance() : excludeShotRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public ExcludeShotRequestOrBuilder getExcludeShotRequestOrBuilder() {
            ExcludeShotRequest excludeShotRequest = this.excludeShotRequest_;
            return excludeShotRequest == null ? ExcludeShotRequest.getDefaultInstance() : excludeShotRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public ExcludeShotResponse getExcludeShotResponse() {
            ExcludeShotResponse excludeShotResponse = this.excludeShotResponse_;
            return excludeShotResponse == null ? ExcludeShotResponse.getDefaultInstance() : excludeShotResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public ExcludeShotResponseOrBuilder getExcludeShotResponseOrBuilder() {
            ExcludeShotResponse excludeShotResponse = this.excludeShotResponse_;
            return excludeShotResponse == null ? ExcludeShotResponse.getDefaultInstance() : excludeShotResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public LastShotRequest getLastShotRequest() {
            LastShotRequest lastShotRequest = this.lastShotRequest_;
            return lastShotRequest == null ? LastShotRequest.getDefaultInstance() : lastShotRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public LastShotRequestOrBuilder getLastShotRequestOrBuilder() {
            LastShotRequest lastShotRequest = this.lastShotRequest_;
            return lastShotRequest == null ? LastShotRequest.getDefaultInstance() : lastShotRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public LastShotResponse getLastShotResponse() {
            LastShotResponse lastShotResponse = this.lastShotResponse_;
            return lastShotResponse == null ? LastShotResponse.getDefaultInstance() : lastShotResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public LastShotResponseOrBuilder getLastShotResponseOrBuilder() {
            LastShotResponse lastShotResponse = this.lastShotResponse_;
            return lastShotResponse == null ? LastShotResponse.getDefaultInstance() : lastShotResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RadarStatusRequest getRadarStatusRequest() {
            RadarStatusRequest radarStatusRequest = this.radarStatusRequest_;
            return radarStatusRequest == null ? RadarStatusRequest.getDefaultInstance() : radarStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RadarStatusRequestOrBuilder getRadarStatusRequestOrBuilder() {
            RadarStatusRequest radarStatusRequest = this.radarStatusRequest_;
            return radarStatusRequest == null ? RadarStatusRequest.getDefaultInstance() : radarStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RadarStatusResponse getRadarStatusResponse() {
            RadarStatusResponse radarStatusResponse = this.radarStatusResponse_;
            return radarStatusResponse == null ? RadarStatusResponse.getDefaultInstance() : radarStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RadarStatusResponseOrBuilder getRadarStatusResponseOrBuilder() {
            RadarStatusResponse radarStatusResponse = this.radarStatusResponse_;
            return radarStatusResponse == null ? RadarStatusResponse.getDefaultInstance() : radarStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RearmRadarRequest getRearmRadarRequest() {
            RearmRadarRequest rearmRadarRequest = this.rearmRadarRequest_;
            return rearmRadarRequest == null ? RearmRadarRequest.getDefaultInstance() : rearmRadarRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RearmRadarRequestOrBuilder getRearmRadarRequestOrBuilder() {
            RearmRadarRequest rearmRadarRequest = this.rearmRadarRequest_;
            return rearmRadarRequest == null ? RearmRadarRequest.getDefaultInstance() : rearmRadarRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RearmRadarResponse getRearmRadarResponse() {
            RearmRadarResponse rearmRadarResponse = this.rearmRadarResponse_;
            return rearmRadarResponse == null ? RearmRadarResponse.getDefaultInstance() : rearmRadarResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RearmRadarResponseOrBuilder getRearmRadarResponseOrBuilder() {
            RearmRadarResponse rearmRadarResponse = this.rearmRadarResponse_;
            return rearmRadarResponse == null ? RearmRadarResponse.getDefaultInstance() : rearmRadarResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RecentSessionsRequest getRecentSessionsRequest() {
            RecentSessionsRequest recentSessionsRequest = this.recentSessionsRequest_;
            return recentSessionsRequest == null ? RecentSessionsRequest.getDefaultInstance() : recentSessionsRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RecentSessionsRequestOrBuilder getRecentSessionsRequestOrBuilder() {
            RecentSessionsRequest recentSessionsRequest = this.recentSessionsRequest_;
            return recentSessionsRequest == null ? RecentSessionsRequest.getDefaultInstance() : recentSessionsRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RecentSessionsResponse getRecentSessionsResponse() {
            RecentSessionsResponse recentSessionsResponse = this.recentSessionsResponse_;
            return recentSessionsResponse == null ? RecentSessionsResponse.getDefaultInstance() : recentSessionsResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public RecentSessionsResponseOrBuilder getRecentSessionsResponseOrBuilder() {
            RecentSessionsResponse recentSessionsResponse = this.recentSessionsResponse_;
            return recentSessionsResponse == null ? RecentSessionsResponse.getDefaultInstance() : recentSessionsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStartSessionRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getStartSessionResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getDeleteShotRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getDeleteShotResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getEndSessionRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getEndSessionResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getExcludeShotRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getExcludeShotResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getShotListRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getShotListResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getSessionInfoRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getSessionInfoResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getTitleChangeRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getTitleChangeResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getRecentSessionsRequest());
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getRecentSessionsResponse());
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getRearmRadarRequest());
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getRearmRadarResponse());
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(19, getDeviceIdentificationRequest());
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(20, getDeviceIdentificationResponse());
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(21, getLastShotRequest());
            }
            if ((this.bitField0_ & 2097152) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(22, getLastShotResponse());
            }
            if ((this.bitField0_ & 4194304) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(23, getRadarStatusRequest());
            }
            if ((this.bitField0_ & 8388608) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(24, getRadarStatusResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public SessionInfoRequest getSessionInfoRequest() {
            SessionInfoRequest sessionInfoRequest = this.sessionInfoRequest_;
            return sessionInfoRequest == null ? SessionInfoRequest.getDefaultInstance() : sessionInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public SessionInfoRequestOrBuilder getSessionInfoRequestOrBuilder() {
            SessionInfoRequest sessionInfoRequest = this.sessionInfoRequest_;
            return sessionInfoRequest == null ? SessionInfoRequest.getDefaultInstance() : sessionInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public SessionInfoResponse getSessionInfoResponse() {
            SessionInfoResponse sessionInfoResponse = this.sessionInfoResponse_;
            return sessionInfoResponse == null ? SessionInfoResponse.getDefaultInstance() : sessionInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public SessionInfoResponseOrBuilder getSessionInfoResponseOrBuilder() {
            SessionInfoResponse sessionInfoResponse = this.sessionInfoResponse_;
            return sessionInfoResponse == null ? SessionInfoResponse.getDefaultInstance() : sessionInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public ShotListRequest getShotListRequest() {
            ShotListRequest shotListRequest = this.shotListRequest_;
            return shotListRequest == null ? ShotListRequest.getDefaultInstance() : shotListRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public ShotListRequestOrBuilder getShotListRequestOrBuilder() {
            ShotListRequest shotListRequest = this.shotListRequest_;
            return shotListRequest == null ? ShotListRequest.getDefaultInstance() : shotListRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public ShotListResponse getShotListResponse() {
            ShotListResponse shotListResponse = this.shotListResponse_;
            return shotListResponse == null ? ShotListResponse.getDefaultInstance() : shotListResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public ShotListResponseOrBuilder getShotListResponseOrBuilder() {
            ShotListResponse shotListResponse = this.shotListResponse_;
            return shotListResponse == null ? ShotListResponse.getDefaultInstance() : shotListResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public StartSessionRequest getStartSessionRequest() {
            StartSessionRequest startSessionRequest = this.startSessionRequest_;
            return startSessionRequest == null ? StartSessionRequest.getDefaultInstance() : startSessionRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public StartSessionRequestOrBuilder getStartSessionRequestOrBuilder() {
            StartSessionRequest startSessionRequest = this.startSessionRequest_;
            return startSessionRequest == null ? StartSessionRequest.getDefaultInstance() : startSessionRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public StartSessionResponse getStartSessionResponse() {
            StartSessionResponse startSessionResponse = this.startSessionResponse_;
            return startSessionResponse == null ? StartSessionResponse.getDefaultInstance() : startSessionResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public StartSessionResponseOrBuilder getStartSessionResponseOrBuilder() {
            StartSessionResponse startSessionResponse = this.startSessionResponse_;
            return startSessionResponse == null ? StartSessionResponse.getDefaultInstance() : startSessionResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public TitleChangeRequest getTitleChangeRequest() {
            TitleChangeRequest titleChangeRequest = this.titleChangeRequest_;
            return titleChangeRequest == null ? TitleChangeRequest.getDefaultInstance() : titleChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public TitleChangeRequestOrBuilder getTitleChangeRequestOrBuilder() {
            TitleChangeRequest titleChangeRequest = this.titleChangeRequest_;
            return titleChangeRequest == null ? TitleChangeRequest.getDefaultInstance() : titleChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public TitleChangeResponse getTitleChangeResponse() {
            TitleChangeResponse titleChangeResponse = this.titleChangeResponse_;
            return titleChangeResponse == null ? TitleChangeResponse.getDefaultInstance() : titleChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public TitleChangeResponseOrBuilder getTitleChangeResponseOrBuilder() {
            TitleChangeResponse titleChangeResponse = this.titleChangeResponse_;
            return titleChangeResponse == null ? TitleChangeResponse.getDefaultInstance() : titleChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasDeleteShotRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasDeleteShotResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasDeviceIdentificationRequest() {
            return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasDeviceIdentificationResponse() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasEndSessionRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasEndSessionResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasExcludeShotRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasExcludeShotResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasLastShotRequest() {
            return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasLastShotResponse() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasRadarStatusRequest() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasRadarStatusResponse() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasRearmRadarRequest() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasRearmRadarResponse() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasRecentSessionsRequest() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasRecentSessionsResponse() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasSessionInfoRequest() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasSessionInfoResponse() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasShotListRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasShotListResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasStartSessionRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasStartSessionResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasTitleChangeRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
        public boolean hasTitleChangeResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStartSessionRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStartSessionRequest().hashCode();
            }
            if (hasStartSessionResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStartSessionResponse().hashCode();
            }
            if (hasDeleteShotRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDeleteShotRequest().hashCode();
            }
            if (hasDeleteShotResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDeleteShotResponse().hashCode();
            }
            if (hasEndSessionRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getEndSessionRequest().hashCode();
            }
            if (hasEndSessionResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getEndSessionResponse().hashCode();
            }
            if (hasExcludeShotRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getExcludeShotRequest().hashCode();
            }
            if (hasExcludeShotResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getExcludeShotResponse().hashCode();
            }
            if (hasShotListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getShotListRequest().hashCode();
            }
            if (hasShotListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getShotListResponse().hashCode();
            }
            if (hasSessionInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getSessionInfoRequest().hashCode();
            }
            if (hasSessionInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getSessionInfoResponse().hashCode();
            }
            if (hasTitleChangeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getTitleChangeRequest().hashCode();
            }
            if (hasTitleChangeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getTitleChangeResponse().hashCode();
            }
            if (hasRecentSessionsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getRecentSessionsRequest().hashCode();
            }
            if (hasRecentSessionsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getRecentSessionsResponse().hashCode();
            }
            if (hasRearmRadarRequest()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getRearmRadarRequest().hashCode();
            }
            if (hasRearmRadarResponse()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getRearmRadarResponse().hashCode();
            }
            if (hasDeviceIdentificationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 19, 53) + getDeviceIdentificationRequest().hashCode();
            }
            if (hasDeviceIdentificationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 20, 53) + getDeviceIdentificationResponse().hashCode();
            }
            if (hasLastShotRequest()) {
                iHashCode = e5.c(iHashCode, 37, 21, 53) + getLastShotRequest().hashCode();
            }
            if (hasLastShotResponse()) {
                iHashCode = e5.c(iHashCode, 37, 22, 53) + getLastShotResponse().hashCode();
            }
            if (hasRadarStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 23, 53) + getRadarStatusRequest().hashCode();
            }
            if (hasRadarStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 24, 53) + getRadarStatusResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getStartSessionRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStartSessionResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getDeleteShotRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getDeleteShotResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getEndSessionRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getEndSessionResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getExcludeShotRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getExcludeShotResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getShotListRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getShotListResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getSessionInfoRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getSessionInfoResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getTitleChangeRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getTitleChangeResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getRecentSessionsRequest());
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeMessage(16, getRecentSessionsResponse());
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeMessage(17, getRearmRadarRequest());
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeMessage(18, getRearmRadarResponse());
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                codedOutputStream.writeMessage(19, getDeviceIdentificationRequest());
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeMessage(20, getDeviceIdentificationResponse());
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                codedOutputStream.writeMessage(21, getLastShotRequest());
            }
            if ((this.bitField0_ & 2097152) != 0) {
                codedOutputStream.writeMessage(22, getLastShotResponse());
            }
            if ((this.bitField0_ & 4194304) != 0) {
                codedOutputStream.writeMessage(23, getRadarStatusRequest());
            }
            if ((this.bitField0_ & 8388608) != 0) {
                codedOutputStream.writeMessage(24, getRadarStatusResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> deleteShotRequestBuilder_;
            private DeleteShotRequest deleteShotRequest_;
            private SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> deleteShotResponseBuilder_;
            private DeleteShotResponse deleteShotResponse_;
            private SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> deviceIdentificationRequestBuilder_;
            private DeviceIdentificationRequest deviceIdentificationRequest_;
            private SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> deviceIdentificationResponseBuilder_;
            private DeviceIdentificationResponse deviceIdentificationResponse_;
            private SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> endSessionRequestBuilder_;
            private StopSessionRequest endSessionRequest_;
            private SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> endSessionResponseBuilder_;
            private StopSessionResponse endSessionResponse_;
            private SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> excludeShotRequestBuilder_;
            private ExcludeShotRequest excludeShotRequest_;
            private SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> excludeShotResponseBuilder_;
            private ExcludeShotResponse excludeShotResponse_;
            private SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> lastShotRequestBuilder_;
            private LastShotRequest lastShotRequest_;
            private SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> lastShotResponseBuilder_;
            private LastShotResponse lastShotResponse_;
            private SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> radarStatusRequestBuilder_;
            private RadarStatusRequest radarStatusRequest_;
            private SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> radarStatusResponseBuilder_;
            private RadarStatusResponse radarStatusResponse_;
            private SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> rearmRadarRequestBuilder_;
            private RearmRadarRequest rearmRadarRequest_;
            private SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> rearmRadarResponseBuilder_;
            private RearmRadarResponse rearmRadarResponse_;
            private SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> recentSessionsRequestBuilder_;
            private RecentSessionsRequest recentSessionsRequest_;
            private SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> recentSessionsResponseBuilder_;
            private RecentSessionsResponse recentSessionsResponse_;
            private SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> sessionInfoRequestBuilder_;
            private SessionInfoRequest sessionInfoRequest_;
            private SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> sessionInfoResponseBuilder_;
            private SessionInfoResponse sessionInfoResponse_;
            private SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> shotListRequestBuilder_;
            private ShotListRequest shotListRequest_;
            private SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> shotListResponseBuilder_;
            private ShotListResponse shotListResponse_;
            private SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> startSessionRequestBuilder_;
            private StartSessionRequest startSessionRequest_;
            private SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> startSessionResponseBuilder_;
            private StartSessionResponse startSessionResponse_;
            private SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> titleChangeRequestBuilder_;
            private TitleChangeRequest titleChangeRequest_;
            private SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> titleChangeResponseBuilder_;
            private TitleChangeResponse titleChangeResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> singleFieldBuilderV3 = this.startSessionRequestBuilder_;
                    service.startSessionRequest_ = singleFieldBuilderV3 == null ? this.startSessionRequest_ : (StartSessionRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> singleFieldBuilderV4 = this.startSessionResponseBuilder_;
                    service.startSessionResponse_ = singleFieldBuilderV4 == null ? this.startSessionResponse_ : (StartSessionResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> singleFieldBuilderV5 = this.deleteShotRequestBuilder_;
                    service.deleteShotRequest_ = singleFieldBuilderV5 == null ? this.deleteShotRequest_ : (DeleteShotRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> singleFieldBuilderV6 = this.deleteShotResponseBuilder_;
                    service.deleteShotResponse_ = singleFieldBuilderV6 == null ? this.deleteShotResponse_ : (DeleteShotResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> singleFieldBuilderV7 = this.endSessionRequestBuilder_;
                    service.endSessionRequest_ = singleFieldBuilderV7 == null ? this.endSessionRequest_ : (StopSessionRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> singleFieldBuilderV8 = this.endSessionResponseBuilder_;
                    service.endSessionResponse_ = singleFieldBuilderV8 == null ? this.endSessionResponse_ : (StopSessionResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> singleFieldBuilderV9 = this.excludeShotRequestBuilder_;
                    service.excludeShotRequest_ = singleFieldBuilderV9 == null ? this.excludeShotRequest_ : (ExcludeShotRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> singleFieldBuilderV10 = this.excludeShotResponseBuilder_;
                    service.excludeShotResponse_ = singleFieldBuilderV10 == null ? this.excludeShotResponse_ : (ExcludeShotResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> singleFieldBuilderV11 = this.shotListRequestBuilder_;
                    service.shotListRequest_ = singleFieldBuilderV11 == null ? this.shotListRequest_ : (ShotListRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> singleFieldBuilderV12 = this.shotListResponseBuilder_;
                    service.shotListResponse_ = singleFieldBuilderV12 == null ? this.shotListResponse_ : (ShotListResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> singleFieldBuilderV13 = this.sessionInfoRequestBuilder_;
                    service.sessionInfoRequest_ = singleFieldBuilderV13 == null ? this.sessionInfoRequest_ : (SessionInfoRequest) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> singleFieldBuilderV14 = this.sessionInfoResponseBuilder_;
                    service.sessionInfoResponse_ = singleFieldBuilderV14 == null ? this.sessionInfoResponse_ : (SessionInfoResponse) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> singleFieldBuilderV15 = this.titleChangeRequestBuilder_;
                    service.titleChangeRequest_ = singleFieldBuilderV15 == null ? this.titleChangeRequest_ : (TitleChangeRequest) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> singleFieldBuilderV16 = this.titleChangeResponseBuilder_;
                    service.titleChangeResponse_ = singleFieldBuilderV16 == null ? this.titleChangeResponse_ : (TitleChangeResponse) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> singleFieldBuilderV17 = this.recentSessionsRequestBuilder_;
                    service.recentSessionsRequest_ = singleFieldBuilderV17 == null ? this.recentSessionsRequest_ : (RecentSessionsRequest) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> singleFieldBuilderV18 = this.recentSessionsResponseBuilder_;
                    service.recentSessionsResponse_ = singleFieldBuilderV18 == null ? this.recentSessionsResponse_ : (RecentSessionsResponse) singleFieldBuilderV18.build();
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> singleFieldBuilderV19 = this.rearmRadarRequestBuilder_;
                    service.rearmRadarRequest_ = singleFieldBuilderV19 == null ? this.rearmRadarRequest_ : (RearmRadarRequest) singleFieldBuilderV19.build();
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> singleFieldBuilderV20 = this.rearmRadarResponseBuilder_;
                    service.rearmRadarResponse_ = singleFieldBuilderV20 == null ? this.rearmRadarResponse_ : (RearmRadarResponse) singleFieldBuilderV20.build();
                    i14 |= 131072;
                }
                if ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                    SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> singleFieldBuilderV21 = this.deviceIdentificationRequestBuilder_;
                    service.deviceIdentificationRequest_ = singleFieldBuilderV21 == null ? this.deviceIdentificationRequest_ : (DeviceIdentificationRequest) singleFieldBuilderV21.build();
                    i14 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                }
                if ((i15 & 524288) != 0) {
                    SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> singleFieldBuilderV22 = this.deviceIdentificationResponseBuilder_;
                    service.deviceIdentificationResponse_ = singleFieldBuilderV22 == null ? this.deviceIdentificationResponse_ : (DeviceIdentificationResponse) singleFieldBuilderV22.build();
                    i14 |= 524288;
                }
                if ((i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                    SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> singleFieldBuilderV23 = this.lastShotRequestBuilder_;
                    service.lastShotRequest_ = singleFieldBuilderV23 == null ? this.lastShotRequest_ : (LastShotRequest) singleFieldBuilderV23.build();
                    i14 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                if ((i15 & 2097152) != 0) {
                    SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> singleFieldBuilderV24 = this.lastShotResponseBuilder_;
                    service.lastShotResponse_ = singleFieldBuilderV24 == null ? this.lastShotResponse_ : (LastShotResponse) singleFieldBuilderV24.build();
                    i14 |= 2097152;
                }
                if ((i15 & 4194304) != 0) {
                    SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> singleFieldBuilderV25 = this.radarStatusRequestBuilder_;
                    service.radarStatusRequest_ = singleFieldBuilderV25 == null ? this.radarStatusRequest_ : (RadarStatusRequest) singleFieldBuilderV25.build();
                    i14 |= 4194304;
                }
                if ((i15 & 8388608) != 0) {
                    SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> singleFieldBuilderV26 = this.radarStatusResponseBuilder_;
                    service.radarStatusResponse_ = singleFieldBuilderV26 == null ? this.radarStatusResponse_ : (RadarStatusResponse) singleFieldBuilderV26.build();
                    i14 |= 8388608;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> getDeleteShotRequestFieldBuilder() {
                if (this.deleteShotRequestBuilder_ == null) {
                    this.deleteShotRequestBuilder_ = new SingleFieldBuilderV3<>(getDeleteShotRequest(), getParentForChildren(), isClean());
                    this.deleteShotRequest_ = null;
                }
                return this.deleteShotRequestBuilder_;
            }

            private SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> getDeleteShotResponseFieldBuilder() {
                if (this.deleteShotResponseBuilder_ == null) {
                    this.deleteShotResponseBuilder_ = new SingleFieldBuilderV3<>(getDeleteShotResponse(), getParentForChildren(), isClean());
                    this.deleteShotResponse_ = null;
                }
                return this.deleteShotResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_Service_descriptor;
            }

            private SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> getDeviceIdentificationRequestFieldBuilder() {
                if (this.deviceIdentificationRequestBuilder_ == null) {
                    this.deviceIdentificationRequestBuilder_ = new SingleFieldBuilderV3<>(getDeviceIdentificationRequest(), getParentForChildren(), isClean());
                    this.deviceIdentificationRequest_ = null;
                }
                return this.deviceIdentificationRequestBuilder_;
            }

            private SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> getDeviceIdentificationResponseFieldBuilder() {
                if (this.deviceIdentificationResponseBuilder_ == null) {
                    this.deviceIdentificationResponseBuilder_ = new SingleFieldBuilderV3<>(getDeviceIdentificationResponse(), getParentForChildren(), isClean());
                    this.deviceIdentificationResponse_ = null;
                }
                return this.deviceIdentificationResponseBuilder_;
            }

            private SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> getEndSessionRequestFieldBuilder() {
                if (this.endSessionRequestBuilder_ == null) {
                    this.endSessionRequestBuilder_ = new SingleFieldBuilderV3<>(getEndSessionRequest(), getParentForChildren(), isClean());
                    this.endSessionRequest_ = null;
                }
                return this.endSessionRequestBuilder_;
            }

            private SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> getEndSessionResponseFieldBuilder() {
                if (this.endSessionResponseBuilder_ == null) {
                    this.endSessionResponseBuilder_ = new SingleFieldBuilderV3<>(getEndSessionResponse(), getParentForChildren(), isClean());
                    this.endSessionResponse_ = null;
                }
                return this.endSessionResponseBuilder_;
            }

            private SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> getExcludeShotRequestFieldBuilder() {
                if (this.excludeShotRequestBuilder_ == null) {
                    this.excludeShotRequestBuilder_ = new SingleFieldBuilderV3<>(getExcludeShotRequest(), getParentForChildren(), isClean());
                    this.excludeShotRequest_ = null;
                }
                return this.excludeShotRequestBuilder_;
            }

            private SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> getExcludeShotResponseFieldBuilder() {
                if (this.excludeShotResponseBuilder_ == null) {
                    this.excludeShotResponseBuilder_ = new SingleFieldBuilderV3<>(getExcludeShotResponse(), getParentForChildren(), isClean());
                    this.excludeShotResponse_ = null;
                }
                return this.excludeShotResponseBuilder_;
            }

            private SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> getLastShotRequestFieldBuilder() {
                if (this.lastShotRequestBuilder_ == null) {
                    this.lastShotRequestBuilder_ = new SingleFieldBuilderV3<>(getLastShotRequest(), getParentForChildren(), isClean());
                    this.lastShotRequest_ = null;
                }
                return this.lastShotRequestBuilder_;
            }

            private SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> getLastShotResponseFieldBuilder() {
                if (this.lastShotResponseBuilder_ == null) {
                    this.lastShotResponseBuilder_ = new SingleFieldBuilderV3<>(getLastShotResponse(), getParentForChildren(), isClean());
                    this.lastShotResponse_ = null;
                }
                return this.lastShotResponseBuilder_;
            }

            private SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> getRadarStatusRequestFieldBuilder() {
                if (this.radarStatusRequestBuilder_ == null) {
                    this.radarStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getRadarStatusRequest(), getParentForChildren(), isClean());
                    this.radarStatusRequest_ = null;
                }
                return this.radarStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> getRadarStatusResponseFieldBuilder() {
                if (this.radarStatusResponseBuilder_ == null) {
                    this.radarStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getRadarStatusResponse(), getParentForChildren(), isClean());
                    this.radarStatusResponse_ = null;
                }
                return this.radarStatusResponseBuilder_;
            }

            private SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> getRearmRadarRequestFieldBuilder() {
                if (this.rearmRadarRequestBuilder_ == null) {
                    this.rearmRadarRequestBuilder_ = new SingleFieldBuilderV3<>(getRearmRadarRequest(), getParentForChildren(), isClean());
                    this.rearmRadarRequest_ = null;
                }
                return this.rearmRadarRequestBuilder_;
            }

            private SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> getRearmRadarResponseFieldBuilder() {
                if (this.rearmRadarResponseBuilder_ == null) {
                    this.rearmRadarResponseBuilder_ = new SingleFieldBuilderV3<>(getRearmRadarResponse(), getParentForChildren(), isClean());
                    this.rearmRadarResponse_ = null;
                }
                return this.rearmRadarResponseBuilder_;
            }

            private SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> getRecentSessionsRequestFieldBuilder() {
                if (this.recentSessionsRequestBuilder_ == null) {
                    this.recentSessionsRequestBuilder_ = new SingleFieldBuilderV3<>(getRecentSessionsRequest(), getParentForChildren(), isClean());
                    this.recentSessionsRequest_ = null;
                }
                return this.recentSessionsRequestBuilder_;
            }

            private SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> getRecentSessionsResponseFieldBuilder() {
                if (this.recentSessionsResponseBuilder_ == null) {
                    this.recentSessionsResponseBuilder_ = new SingleFieldBuilderV3<>(getRecentSessionsResponse(), getParentForChildren(), isClean());
                    this.recentSessionsResponse_ = null;
                }
                return this.recentSessionsResponseBuilder_;
            }

            private SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> getSessionInfoRequestFieldBuilder() {
                if (this.sessionInfoRequestBuilder_ == null) {
                    this.sessionInfoRequestBuilder_ = new SingleFieldBuilderV3<>(getSessionInfoRequest(), getParentForChildren(), isClean());
                    this.sessionInfoRequest_ = null;
                }
                return this.sessionInfoRequestBuilder_;
            }

            private SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> getSessionInfoResponseFieldBuilder() {
                if (this.sessionInfoResponseBuilder_ == null) {
                    this.sessionInfoResponseBuilder_ = new SingleFieldBuilderV3<>(getSessionInfoResponse(), getParentForChildren(), isClean());
                    this.sessionInfoResponse_ = null;
                }
                return this.sessionInfoResponseBuilder_;
            }

            private SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> getShotListRequestFieldBuilder() {
                if (this.shotListRequestBuilder_ == null) {
                    this.shotListRequestBuilder_ = new SingleFieldBuilderV3<>(getShotListRequest(), getParentForChildren(), isClean());
                    this.shotListRequest_ = null;
                }
                return this.shotListRequestBuilder_;
            }

            private SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> getShotListResponseFieldBuilder() {
                if (this.shotListResponseBuilder_ == null) {
                    this.shotListResponseBuilder_ = new SingleFieldBuilderV3<>(getShotListResponse(), getParentForChildren(), isClean());
                    this.shotListResponse_ = null;
                }
                return this.shotListResponseBuilder_;
            }

            private SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> getStartSessionRequestFieldBuilder() {
                if (this.startSessionRequestBuilder_ == null) {
                    this.startSessionRequestBuilder_ = new SingleFieldBuilderV3<>(getStartSessionRequest(), getParentForChildren(), isClean());
                    this.startSessionRequest_ = null;
                }
                return this.startSessionRequestBuilder_;
            }

            private SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> getStartSessionResponseFieldBuilder() {
                if (this.startSessionResponseBuilder_ == null) {
                    this.startSessionResponseBuilder_ = new SingleFieldBuilderV3<>(getStartSessionResponse(), getParentForChildren(), isClean());
                    this.startSessionResponse_ = null;
                }
                return this.startSessionResponseBuilder_;
            }

            private SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> getTitleChangeRequestFieldBuilder() {
                if (this.titleChangeRequestBuilder_ == null) {
                    this.titleChangeRequestBuilder_ = new SingleFieldBuilderV3<>(getTitleChangeRequest(), getParentForChildren(), isClean());
                    this.titleChangeRequest_ = null;
                }
                return this.titleChangeRequestBuilder_;
            }

            private SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> getTitleChangeResponseFieldBuilder() {
                if (this.titleChangeResponseBuilder_ == null) {
                    this.titleChangeResponseBuilder_ = new SingleFieldBuilderV3<>(getTitleChangeResponse(), getParentForChildren(), isClean());
                    this.titleChangeResponse_ = null;
                }
                return this.titleChangeResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStartSessionRequestFieldBuilder();
                    getStartSessionResponseFieldBuilder();
                    getDeleteShotRequestFieldBuilder();
                    getDeleteShotResponseFieldBuilder();
                    getEndSessionRequestFieldBuilder();
                    getEndSessionResponseFieldBuilder();
                    getExcludeShotRequestFieldBuilder();
                    getExcludeShotResponseFieldBuilder();
                    getShotListRequestFieldBuilder();
                    getShotListResponseFieldBuilder();
                    getSessionInfoRequestFieldBuilder();
                    getSessionInfoResponseFieldBuilder();
                    getTitleChangeRequestFieldBuilder();
                    getTitleChangeResponseFieldBuilder();
                    getRecentSessionsRequestFieldBuilder();
                    getRecentSessionsResponseFieldBuilder();
                    getRearmRadarRequestFieldBuilder();
                    getRearmRadarResponseFieldBuilder();
                    getDeviceIdentificationRequestFieldBuilder();
                    getDeviceIdentificationResponseFieldBuilder();
                    getLastShotRequestFieldBuilder();
                    getLastShotResponseFieldBuilder();
                    getRadarStatusRequestFieldBuilder();
                    getRadarStatusResponseFieldBuilder();
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
                this.startSessionRequest_ = null;
                SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> singleFieldBuilderV3 = this.startSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startSessionRequestBuilder_ = null;
                }
                this.startSessionResponse_ = null;
                SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> singleFieldBuilderV4 = this.startSessionResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.startSessionResponseBuilder_ = null;
                }
                this.deleteShotRequest_ = null;
                SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> singleFieldBuilderV5 = this.deleteShotRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.deleteShotRequestBuilder_ = null;
                }
                this.deleteShotResponse_ = null;
                SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> singleFieldBuilderV6 = this.deleteShotResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.deleteShotResponseBuilder_ = null;
                }
                this.endSessionRequest_ = null;
                SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> singleFieldBuilderV7 = this.endSessionRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.endSessionRequestBuilder_ = null;
                }
                this.endSessionResponse_ = null;
                SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> singleFieldBuilderV8 = this.endSessionResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.endSessionResponseBuilder_ = null;
                }
                this.excludeShotRequest_ = null;
                SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> singleFieldBuilderV9 = this.excludeShotRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.excludeShotRequestBuilder_ = null;
                }
                this.excludeShotResponse_ = null;
                SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> singleFieldBuilderV10 = this.excludeShotResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.excludeShotResponseBuilder_ = null;
                }
                this.shotListRequest_ = null;
                SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> singleFieldBuilderV11 = this.shotListRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.shotListRequestBuilder_ = null;
                }
                this.shotListResponse_ = null;
                SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> singleFieldBuilderV12 = this.shotListResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.shotListResponseBuilder_ = null;
                }
                this.sessionInfoRequest_ = null;
                SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> singleFieldBuilderV13 = this.sessionInfoRequestBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.sessionInfoRequestBuilder_ = null;
                }
                this.sessionInfoResponse_ = null;
                SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> singleFieldBuilderV14 = this.sessionInfoResponseBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.sessionInfoResponseBuilder_ = null;
                }
                this.titleChangeRequest_ = null;
                SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> singleFieldBuilderV15 = this.titleChangeRequestBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.titleChangeRequestBuilder_ = null;
                }
                this.titleChangeResponse_ = null;
                SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> singleFieldBuilderV16 = this.titleChangeResponseBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.titleChangeResponseBuilder_ = null;
                }
                this.recentSessionsRequest_ = null;
                SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> singleFieldBuilderV17 = this.recentSessionsRequestBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.recentSessionsRequestBuilder_ = null;
                }
                this.recentSessionsResponse_ = null;
                SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> singleFieldBuilderV18 = this.recentSessionsResponseBuilder_;
                if (singleFieldBuilderV18 != null) {
                    singleFieldBuilderV18.dispose();
                    this.recentSessionsResponseBuilder_ = null;
                }
                this.rearmRadarRequest_ = null;
                SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> singleFieldBuilderV19 = this.rearmRadarRequestBuilder_;
                if (singleFieldBuilderV19 != null) {
                    singleFieldBuilderV19.dispose();
                    this.rearmRadarRequestBuilder_ = null;
                }
                this.rearmRadarResponse_ = null;
                SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> singleFieldBuilderV20 = this.rearmRadarResponseBuilder_;
                if (singleFieldBuilderV20 != null) {
                    singleFieldBuilderV20.dispose();
                    this.rearmRadarResponseBuilder_ = null;
                }
                this.deviceIdentificationRequest_ = null;
                SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> singleFieldBuilderV21 = this.deviceIdentificationRequestBuilder_;
                if (singleFieldBuilderV21 != null) {
                    singleFieldBuilderV21.dispose();
                    this.deviceIdentificationRequestBuilder_ = null;
                }
                this.deviceIdentificationResponse_ = null;
                SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> singleFieldBuilderV22 = this.deviceIdentificationResponseBuilder_;
                if (singleFieldBuilderV22 != null) {
                    singleFieldBuilderV22.dispose();
                    this.deviceIdentificationResponseBuilder_ = null;
                }
                this.lastShotRequest_ = null;
                SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> singleFieldBuilderV23 = this.lastShotRequestBuilder_;
                if (singleFieldBuilderV23 != null) {
                    singleFieldBuilderV23.dispose();
                    this.lastShotRequestBuilder_ = null;
                }
                this.lastShotResponse_ = null;
                SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> singleFieldBuilderV24 = this.lastShotResponseBuilder_;
                if (singleFieldBuilderV24 != null) {
                    singleFieldBuilderV24.dispose();
                    this.lastShotResponseBuilder_ = null;
                }
                this.radarStatusRequest_ = null;
                SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> singleFieldBuilderV25 = this.radarStatusRequestBuilder_;
                if (singleFieldBuilderV25 != null) {
                    singleFieldBuilderV25.dispose();
                    this.radarStatusRequestBuilder_ = null;
                }
                this.radarStatusResponse_ = null;
                SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> singleFieldBuilderV26 = this.radarStatusResponseBuilder_;
                if (singleFieldBuilderV26 != null) {
                    singleFieldBuilderV26.dispose();
                    this.radarStatusResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearDeleteShotRequest() {
                this.bitField0_ &= -5;
                this.deleteShotRequest_ = null;
                SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> singleFieldBuilderV3 = this.deleteShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deleteShotRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeleteShotResponse() {
                this.bitField0_ &= -9;
                this.deleteShotResponse_ = null;
                SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> singleFieldBuilderV3 = this.deleteShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deleteShotResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceIdentificationRequest() {
                this.bitField0_ &= -262145;
                this.deviceIdentificationRequest_ = null;
                SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceIdentificationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceIdentificationResponse() {
                this.bitField0_ &= -524289;
                this.deviceIdentificationResponse_ = null;
                SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceIdentificationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEndSessionRequest() {
                this.bitField0_ &= -17;
                this.endSessionRequest_ = null;
                SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> singleFieldBuilderV3 = this.endSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.endSessionRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEndSessionResponse() {
                this.bitField0_ &= -33;
                this.endSessionResponse_ = null;
                SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> singleFieldBuilderV3 = this.endSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.endSessionResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearExcludeShotRequest() {
                this.bitField0_ &= -65;
                this.excludeShotRequest_ = null;
                SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> singleFieldBuilderV3 = this.excludeShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.excludeShotRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearExcludeShotResponse() {
                this.bitField0_ &= -129;
                this.excludeShotResponse_ = null;
                SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> singleFieldBuilderV3 = this.excludeShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.excludeShotResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLastShotRequest() {
                this.bitField0_ &= -1048577;
                this.lastShotRequest_ = null;
                SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> singleFieldBuilderV3 = this.lastShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lastShotRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLastShotResponse() {
                this.bitField0_ &= -2097153;
                this.lastShotResponse_ = null;
                SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> singleFieldBuilderV3 = this.lastShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lastShotResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRadarStatusRequest() {
                this.bitField0_ &= -4194305;
                this.radarStatusRequest_ = null;
                SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> singleFieldBuilderV3 = this.radarStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.radarStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRadarStatusResponse() {
                this.bitField0_ &= -8388609;
                this.radarStatusResponse_ = null;
                SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> singleFieldBuilderV3 = this.radarStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.radarStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRearmRadarRequest() {
                this.bitField0_ &= -65537;
                this.rearmRadarRequest_ = null;
                SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> singleFieldBuilderV3 = this.rearmRadarRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rearmRadarRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRearmRadarResponse() {
                this.bitField0_ &= -131073;
                this.rearmRadarResponse_ = null;
                SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> singleFieldBuilderV3 = this.rearmRadarResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rearmRadarResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRecentSessionsRequest() {
                this.bitField0_ &= -16385;
                this.recentSessionsRequest_ = null;
                SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> singleFieldBuilderV3 = this.recentSessionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.recentSessionsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRecentSessionsResponse() {
                this.bitField0_ &= -32769;
                this.recentSessionsResponse_ = null;
                SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> singleFieldBuilderV3 = this.recentSessionsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.recentSessionsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSessionInfoRequest() {
                this.bitField0_ &= -1025;
                this.sessionInfoRequest_ = null;
                SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> singleFieldBuilderV3 = this.sessionInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionInfoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSessionInfoResponse() {
                this.bitField0_ &= -2049;
                this.sessionInfoResponse_ = null;
                SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> singleFieldBuilderV3 = this.sessionInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionInfoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShotListRequest() {
                this.bitField0_ &= -257;
                this.shotListRequest_ = null;
                SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> singleFieldBuilderV3 = this.shotListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shotListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShotListResponse() {
                this.bitField0_ &= -513;
                this.shotListResponse_ = null;
                SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> singleFieldBuilderV3 = this.shotListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shotListResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartSessionRequest() {
                this.bitField0_ &= -2;
                this.startSessionRequest_ = null;
                SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> singleFieldBuilderV3 = this.startSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startSessionRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartSessionResponse() {
                this.bitField0_ &= -3;
                this.startSessionResponse_ = null;
                SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> singleFieldBuilderV3 = this.startSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startSessionResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTitleChangeRequest() {
                this.bitField0_ &= -4097;
                this.titleChangeRequest_ = null;
                SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> singleFieldBuilderV3 = this.titleChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.titleChangeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTitleChangeResponse() {
                this.bitField0_ &= -8193;
                this.titleChangeResponse_ = null;
                SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> singleFieldBuilderV3 = this.titleChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.titleChangeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public DeleteShotRequest getDeleteShotRequest() {
                SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> singleFieldBuilderV3 = this.deleteShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteShotRequest) singleFieldBuilderV3.getMessage();
                }
                DeleteShotRequest deleteShotRequest = this.deleteShotRequest_;
                return deleteShotRequest == null ? DeleteShotRequest.getDefaultInstance() : deleteShotRequest;
            }

            public DeleteShotRequest.Builder getDeleteShotRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DeleteShotRequest.Builder) getDeleteShotRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public DeleteShotRequestOrBuilder getDeleteShotRequestOrBuilder() {
                SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> singleFieldBuilderV3 = this.deleteShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteShotRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeleteShotRequest deleteShotRequest = this.deleteShotRequest_;
                return deleteShotRequest == null ? DeleteShotRequest.getDefaultInstance() : deleteShotRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public DeleteShotResponse getDeleteShotResponse() {
                SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> singleFieldBuilderV3 = this.deleteShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteShotResponse) singleFieldBuilderV3.getMessage();
                }
                DeleteShotResponse deleteShotResponse = this.deleteShotResponse_;
                return deleteShotResponse == null ? DeleteShotResponse.getDefaultInstance() : deleteShotResponse;
            }

            public DeleteShotResponse.Builder getDeleteShotResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DeleteShotResponse.Builder) getDeleteShotResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public DeleteShotResponseOrBuilder getDeleteShotResponseOrBuilder() {
                SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> singleFieldBuilderV3 = this.deleteShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteShotResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeleteShotResponse deleteShotResponse = this.deleteShotResponse_;
                return deleteShotResponse == null ? DeleteShotResponse.getDefaultInstance() : deleteShotResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public DeviceIdentificationRequest getDeviceIdentificationRequest() {
                SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceIdentificationRequest) singleFieldBuilderV3.getMessage();
                }
                DeviceIdentificationRequest deviceIdentificationRequest = this.deviceIdentificationRequest_;
                return deviceIdentificationRequest == null ? DeviceIdentificationRequest.getDefaultInstance() : deviceIdentificationRequest;
            }

            public DeviceIdentificationRequest.Builder getDeviceIdentificationRequestBuilder() {
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return (DeviceIdentificationRequest.Builder) getDeviceIdentificationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public DeviceIdentificationRequestOrBuilder getDeviceIdentificationRequestOrBuilder() {
                SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceIdentificationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceIdentificationRequest deviceIdentificationRequest = this.deviceIdentificationRequest_;
                return deviceIdentificationRequest == null ? DeviceIdentificationRequest.getDefaultInstance() : deviceIdentificationRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public DeviceIdentificationResponse getDeviceIdentificationResponse() {
                SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceIdentificationResponse) singleFieldBuilderV3.getMessage();
                }
                DeviceIdentificationResponse deviceIdentificationResponse = this.deviceIdentificationResponse_;
                return deviceIdentificationResponse == null ? DeviceIdentificationResponse.getDefaultInstance() : deviceIdentificationResponse;
            }

            public DeviceIdentificationResponse.Builder getDeviceIdentificationResponseBuilder() {
                this.bitField0_ |= 524288;
                onChanged();
                return (DeviceIdentificationResponse.Builder) getDeviceIdentificationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public DeviceIdentificationResponseOrBuilder getDeviceIdentificationResponseOrBuilder() {
                SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceIdentificationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceIdentificationResponse deviceIdentificationResponse = this.deviceIdentificationResponse_;
                return deviceIdentificationResponse == null ? DeviceIdentificationResponse.getDefaultInstance() : deviceIdentificationResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public StopSessionRequest getEndSessionRequest() {
                SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> singleFieldBuilderV3 = this.endSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopSessionRequest) singleFieldBuilderV3.getMessage();
                }
                StopSessionRequest stopSessionRequest = this.endSessionRequest_;
                return stopSessionRequest == null ? StopSessionRequest.getDefaultInstance() : stopSessionRequest;
            }

            public StopSessionRequest.Builder getEndSessionRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (StopSessionRequest.Builder) getEndSessionRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public StopSessionRequestOrBuilder getEndSessionRequestOrBuilder() {
                SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> singleFieldBuilderV3 = this.endSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopSessionRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopSessionRequest stopSessionRequest = this.endSessionRequest_;
                return stopSessionRequest == null ? StopSessionRequest.getDefaultInstance() : stopSessionRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public StopSessionResponse getEndSessionResponse() {
                SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> singleFieldBuilderV3 = this.endSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopSessionResponse) singleFieldBuilderV3.getMessage();
                }
                StopSessionResponse stopSessionResponse = this.endSessionResponse_;
                return stopSessionResponse == null ? StopSessionResponse.getDefaultInstance() : stopSessionResponse;
            }

            public StopSessionResponse.Builder getEndSessionResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (StopSessionResponse.Builder) getEndSessionResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public StopSessionResponseOrBuilder getEndSessionResponseOrBuilder() {
                SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> singleFieldBuilderV3 = this.endSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopSessionResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopSessionResponse stopSessionResponse = this.endSessionResponse_;
                return stopSessionResponse == null ? StopSessionResponse.getDefaultInstance() : stopSessionResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public ExcludeShotRequest getExcludeShotRequest() {
                SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> singleFieldBuilderV3 = this.excludeShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ExcludeShotRequest) singleFieldBuilderV3.getMessage();
                }
                ExcludeShotRequest excludeShotRequest = this.excludeShotRequest_;
                return excludeShotRequest == null ? ExcludeShotRequest.getDefaultInstance() : excludeShotRequest;
            }

            public ExcludeShotRequest.Builder getExcludeShotRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (ExcludeShotRequest.Builder) getExcludeShotRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public ExcludeShotRequestOrBuilder getExcludeShotRequestOrBuilder() {
                SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> singleFieldBuilderV3 = this.excludeShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ExcludeShotRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ExcludeShotRequest excludeShotRequest = this.excludeShotRequest_;
                return excludeShotRequest == null ? ExcludeShotRequest.getDefaultInstance() : excludeShotRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public ExcludeShotResponse getExcludeShotResponse() {
                SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> singleFieldBuilderV3 = this.excludeShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ExcludeShotResponse) singleFieldBuilderV3.getMessage();
                }
                ExcludeShotResponse excludeShotResponse = this.excludeShotResponse_;
                return excludeShotResponse == null ? ExcludeShotResponse.getDefaultInstance() : excludeShotResponse;
            }

            public ExcludeShotResponse.Builder getExcludeShotResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (ExcludeShotResponse.Builder) getExcludeShotResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public ExcludeShotResponseOrBuilder getExcludeShotResponseOrBuilder() {
                SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> singleFieldBuilderV3 = this.excludeShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ExcludeShotResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ExcludeShotResponse excludeShotResponse = this.excludeShotResponse_;
                return excludeShotResponse == null ? ExcludeShotResponse.getDefaultInstance() : excludeShotResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public LastShotRequest getLastShotRequest() {
                SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> singleFieldBuilderV3 = this.lastShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LastShotRequest) singleFieldBuilderV3.getMessage();
                }
                LastShotRequest lastShotRequest = this.lastShotRequest_;
                return lastShotRequest == null ? LastShotRequest.getDefaultInstance() : lastShotRequest;
            }

            public LastShotRequest.Builder getLastShotRequestBuilder() {
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return (LastShotRequest.Builder) getLastShotRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public LastShotRequestOrBuilder getLastShotRequestOrBuilder() {
                SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> singleFieldBuilderV3 = this.lastShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LastShotRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LastShotRequest lastShotRequest = this.lastShotRequest_;
                return lastShotRequest == null ? LastShotRequest.getDefaultInstance() : lastShotRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public LastShotResponse getLastShotResponse() {
                SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> singleFieldBuilderV3 = this.lastShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LastShotResponse) singleFieldBuilderV3.getMessage();
                }
                LastShotResponse lastShotResponse = this.lastShotResponse_;
                return lastShotResponse == null ? LastShotResponse.getDefaultInstance() : lastShotResponse;
            }

            public LastShotResponse.Builder getLastShotResponseBuilder() {
                this.bitField0_ |= 2097152;
                onChanged();
                return (LastShotResponse.Builder) getLastShotResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public LastShotResponseOrBuilder getLastShotResponseOrBuilder() {
                SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> singleFieldBuilderV3 = this.lastShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LastShotResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LastShotResponse lastShotResponse = this.lastShotResponse_;
                return lastShotResponse == null ? LastShotResponse.getDefaultInstance() : lastShotResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RadarStatusRequest getRadarStatusRequest() {
                SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> singleFieldBuilderV3 = this.radarStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RadarStatusRequest) singleFieldBuilderV3.getMessage();
                }
                RadarStatusRequest radarStatusRequest = this.radarStatusRequest_;
                return radarStatusRequest == null ? RadarStatusRequest.getDefaultInstance() : radarStatusRequest;
            }

            public RadarStatusRequest.Builder getRadarStatusRequestBuilder() {
                this.bitField0_ |= 4194304;
                onChanged();
                return (RadarStatusRequest.Builder) getRadarStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RadarStatusRequestOrBuilder getRadarStatusRequestOrBuilder() {
                SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> singleFieldBuilderV3 = this.radarStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RadarStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RadarStatusRequest radarStatusRequest = this.radarStatusRequest_;
                return radarStatusRequest == null ? RadarStatusRequest.getDefaultInstance() : radarStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RadarStatusResponse getRadarStatusResponse() {
                SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> singleFieldBuilderV3 = this.radarStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RadarStatusResponse) singleFieldBuilderV3.getMessage();
                }
                RadarStatusResponse radarStatusResponse = this.radarStatusResponse_;
                return radarStatusResponse == null ? RadarStatusResponse.getDefaultInstance() : radarStatusResponse;
            }

            public RadarStatusResponse.Builder getRadarStatusResponseBuilder() {
                this.bitField0_ |= 8388608;
                onChanged();
                return (RadarStatusResponse.Builder) getRadarStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RadarStatusResponseOrBuilder getRadarStatusResponseOrBuilder() {
                SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> singleFieldBuilderV3 = this.radarStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RadarStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RadarStatusResponse radarStatusResponse = this.radarStatusResponse_;
                return radarStatusResponse == null ? RadarStatusResponse.getDefaultInstance() : radarStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RearmRadarRequest getRearmRadarRequest() {
                SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> singleFieldBuilderV3 = this.rearmRadarRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RearmRadarRequest) singleFieldBuilderV3.getMessage();
                }
                RearmRadarRequest rearmRadarRequest = this.rearmRadarRequest_;
                return rearmRadarRequest == null ? RearmRadarRequest.getDefaultInstance() : rearmRadarRequest;
            }

            public RearmRadarRequest.Builder getRearmRadarRequestBuilder() {
                this.bitField0_ |= 65536;
                onChanged();
                return (RearmRadarRequest.Builder) getRearmRadarRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RearmRadarRequestOrBuilder getRearmRadarRequestOrBuilder() {
                SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> singleFieldBuilderV3 = this.rearmRadarRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RearmRadarRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RearmRadarRequest rearmRadarRequest = this.rearmRadarRequest_;
                return rearmRadarRequest == null ? RearmRadarRequest.getDefaultInstance() : rearmRadarRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RearmRadarResponse getRearmRadarResponse() {
                SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> singleFieldBuilderV3 = this.rearmRadarResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RearmRadarResponse) singleFieldBuilderV3.getMessage();
                }
                RearmRadarResponse rearmRadarResponse = this.rearmRadarResponse_;
                return rearmRadarResponse == null ? RearmRadarResponse.getDefaultInstance() : rearmRadarResponse;
            }

            public RearmRadarResponse.Builder getRearmRadarResponseBuilder() {
                this.bitField0_ |= 131072;
                onChanged();
                return (RearmRadarResponse.Builder) getRearmRadarResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RearmRadarResponseOrBuilder getRearmRadarResponseOrBuilder() {
                SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> singleFieldBuilderV3 = this.rearmRadarResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RearmRadarResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RearmRadarResponse rearmRadarResponse = this.rearmRadarResponse_;
                return rearmRadarResponse == null ? RearmRadarResponse.getDefaultInstance() : rearmRadarResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RecentSessionsRequest getRecentSessionsRequest() {
                SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> singleFieldBuilderV3 = this.recentSessionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RecentSessionsRequest) singleFieldBuilderV3.getMessage();
                }
                RecentSessionsRequest recentSessionsRequest = this.recentSessionsRequest_;
                return recentSessionsRequest == null ? RecentSessionsRequest.getDefaultInstance() : recentSessionsRequest;
            }

            public RecentSessionsRequest.Builder getRecentSessionsRequestBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (RecentSessionsRequest.Builder) getRecentSessionsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RecentSessionsRequestOrBuilder getRecentSessionsRequestOrBuilder() {
                SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> singleFieldBuilderV3 = this.recentSessionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RecentSessionsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RecentSessionsRequest recentSessionsRequest = this.recentSessionsRequest_;
                return recentSessionsRequest == null ? RecentSessionsRequest.getDefaultInstance() : recentSessionsRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RecentSessionsResponse getRecentSessionsResponse() {
                SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> singleFieldBuilderV3 = this.recentSessionsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RecentSessionsResponse) singleFieldBuilderV3.getMessage();
                }
                RecentSessionsResponse recentSessionsResponse = this.recentSessionsResponse_;
                return recentSessionsResponse == null ? RecentSessionsResponse.getDefaultInstance() : recentSessionsResponse;
            }

            public RecentSessionsResponse.Builder getRecentSessionsResponseBuilder() {
                this.bitField0_ |= 32768;
                onChanged();
                return (RecentSessionsResponse.Builder) getRecentSessionsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public RecentSessionsResponseOrBuilder getRecentSessionsResponseOrBuilder() {
                SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> singleFieldBuilderV3 = this.recentSessionsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RecentSessionsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RecentSessionsResponse recentSessionsResponse = this.recentSessionsResponse_;
                return recentSessionsResponse == null ? RecentSessionsResponse.getDefaultInstance() : recentSessionsResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public SessionInfoRequest getSessionInfoRequest() {
                SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> singleFieldBuilderV3 = this.sessionInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionInfoRequest) singleFieldBuilderV3.getMessage();
                }
                SessionInfoRequest sessionInfoRequest = this.sessionInfoRequest_;
                return sessionInfoRequest == null ? SessionInfoRequest.getDefaultInstance() : sessionInfoRequest;
            }

            public SessionInfoRequest.Builder getSessionInfoRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (SessionInfoRequest.Builder) getSessionInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public SessionInfoRequestOrBuilder getSessionInfoRequestOrBuilder() {
                SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> singleFieldBuilderV3 = this.sessionInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionInfoRequest sessionInfoRequest = this.sessionInfoRequest_;
                return sessionInfoRequest == null ? SessionInfoRequest.getDefaultInstance() : sessionInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public SessionInfoResponse getSessionInfoResponse() {
                SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> singleFieldBuilderV3 = this.sessionInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionInfoResponse) singleFieldBuilderV3.getMessage();
                }
                SessionInfoResponse sessionInfoResponse = this.sessionInfoResponse_;
                return sessionInfoResponse == null ? SessionInfoResponse.getDefaultInstance() : sessionInfoResponse;
            }

            public SessionInfoResponse.Builder getSessionInfoResponseBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (SessionInfoResponse.Builder) getSessionInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public SessionInfoResponseOrBuilder getSessionInfoResponseOrBuilder() {
                SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> singleFieldBuilderV3 = this.sessionInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionInfoResponse sessionInfoResponse = this.sessionInfoResponse_;
                return sessionInfoResponse == null ? SessionInfoResponse.getDefaultInstance() : sessionInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public ShotListRequest getShotListRequest() {
                SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> singleFieldBuilderV3 = this.shotListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotListRequest) singleFieldBuilderV3.getMessage();
                }
                ShotListRequest shotListRequest = this.shotListRequest_;
                return shotListRequest == null ? ShotListRequest.getDefaultInstance() : shotListRequest;
            }

            public ShotListRequest.Builder getShotListRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (ShotListRequest.Builder) getShotListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public ShotListRequestOrBuilder getShotListRequestOrBuilder() {
                SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> singleFieldBuilderV3 = this.shotListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShotListRequest shotListRequest = this.shotListRequest_;
                return shotListRequest == null ? ShotListRequest.getDefaultInstance() : shotListRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public ShotListResponse getShotListResponse() {
                SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> singleFieldBuilderV3 = this.shotListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotListResponse) singleFieldBuilderV3.getMessage();
                }
                ShotListResponse shotListResponse = this.shotListResponse_;
                return shotListResponse == null ? ShotListResponse.getDefaultInstance() : shotListResponse;
            }

            public ShotListResponse.Builder getShotListResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (ShotListResponse.Builder) getShotListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public ShotListResponseOrBuilder getShotListResponseOrBuilder() {
                SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> singleFieldBuilderV3 = this.shotListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShotListResponse shotListResponse = this.shotListResponse_;
                return shotListResponse == null ? ShotListResponse.getDefaultInstance() : shotListResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public StartSessionRequest getStartSessionRequest() {
                SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> singleFieldBuilderV3 = this.startSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartSessionRequest) singleFieldBuilderV3.getMessage();
                }
                StartSessionRequest startSessionRequest = this.startSessionRequest_;
                return startSessionRequest == null ? StartSessionRequest.getDefaultInstance() : startSessionRequest;
            }

            public StartSessionRequest.Builder getStartSessionRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (StartSessionRequest.Builder) getStartSessionRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public StartSessionRequestOrBuilder getStartSessionRequestOrBuilder() {
                SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> singleFieldBuilderV3 = this.startSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartSessionRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartSessionRequest startSessionRequest = this.startSessionRequest_;
                return startSessionRequest == null ? StartSessionRequest.getDefaultInstance() : startSessionRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public StartSessionResponse getStartSessionResponse() {
                SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> singleFieldBuilderV3 = this.startSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartSessionResponse) singleFieldBuilderV3.getMessage();
                }
                StartSessionResponse startSessionResponse = this.startSessionResponse_;
                return startSessionResponse == null ? StartSessionResponse.getDefaultInstance() : startSessionResponse;
            }

            public StartSessionResponse.Builder getStartSessionResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (StartSessionResponse.Builder) getStartSessionResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public StartSessionResponseOrBuilder getStartSessionResponseOrBuilder() {
                SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> singleFieldBuilderV3 = this.startSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartSessionResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartSessionResponse startSessionResponse = this.startSessionResponse_;
                return startSessionResponse == null ? StartSessionResponse.getDefaultInstance() : startSessionResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public TitleChangeRequest getTitleChangeRequest() {
                SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> singleFieldBuilderV3 = this.titleChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TitleChangeRequest) singleFieldBuilderV3.getMessage();
                }
                TitleChangeRequest titleChangeRequest = this.titleChangeRequest_;
                return titleChangeRequest == null ? TitleChangeRequest.getDefaultInstance() : titleChangeRequest;
            }

            public TitleChangeRequest.Builder getTitleChangeRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (TitleChangeRequest.Builder) getTitleChangeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public TitleChangeRequestOrBuilder getTitleChangeRequestOrBuilder() {
                SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> singleFieldBuilderV3 = this.titleChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TitleChangeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TitleChangeRequest titleChangeRequest = this.titleChangeRequest_;
                return titleChangeRequest == null ? TitleChangeRequest.getDefaultInstance() : titleChangeRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public TitleChangeResponse getTitleChangeResponse() {
                SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> singleFieldBuilderV3 = this.titleChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TitleChangeResponse) singleFieldBuilderV3.getMessage();
                }
                TitleChangeResponse titleChangeResponse = this.titleChangeResponse_;
                return titleChangeResponse == null ? TitleChangeResponse.getDefaultInstance() : titleChangeResponse;
            }

            public TitleChangeResponse.Builder getTitleChangeResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (TitleChangeResponse.Builder) getTitleChangeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public TitleChangeResponseOrBuilder getTitleChangeResponseOrBuilder() {
                SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> singleFieldBuilderV3 = this.titleChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TitleChangeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TitleChangeResponse titleChangeResponse = this.titleChangeResponse_;
                return titleChangeResponse == null ? TitleChangeResponse.getDefaultInstance() : titleChangeResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasDeleteShotRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasDeleteShotResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasDeviceIdentificationRequest() {
                return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasDeviceIdentificationResponse() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasEndSessionRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasEndSessionResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasExcludeShotRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasExcludeShotResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasLastShotRequest() {
                return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasLastShotResponse() {
                return (this.bitField0_ & 2097152) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasRadarStatusRequest() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasRadarStatusResponse() {
                return (this.bitField0_ & 8388608) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasRearmRadarRequest() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasRearmRadarResponse() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasRecentSessionsRequest() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasRecentSessionsResponse() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasSessionInfoRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasSessionInfoResponse() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasShotListRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasShotListResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasStartSessionRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasStartSessionResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasTitleChangeRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ServiceOrBuilder
            public boolean hasTitleChangeResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDeleteShotRequest(DeleteShotRequest deleteShotRequest) {
                DeleteShotRequest deleteShotRequest2;
                SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> singleFieldBuilderV3 = this.deleteShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deleteShotRequest);
                } else if ((this.bitField0_ & 4) == 0 || (deleteShotRequest2 = this.deleteShotRequest_) == null || deleteShotRequest2 == DeleteShotRequest.getDefaultInstance()) {
                    this.deleteShotRequest_ = deleteShotRequest;
                } else {
                    getDeleteShotRequestBuilder().mergeFrom(deleteShotRequest);
                }
                if (this.deleteShotRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeleteShotResponse(DeleteShotResponse deleteShotResponse) {
                DeleteShotResponse deleteShotResponse2;
                SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> singleFieldBuilderV3 = this.deleteShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deleteShotResponse);
                } else if ((this.bitField0_ & 8) == 0 || (deleteShotResponse2 = this.deleteShotResponse_) == null || deleteShotResponse2 == DeleteShotResponse.getDefaultInstance()) {
                    this.deleteShotResponse_ = deleteShotResponse;
                } else {
                    getDeleteShotResponseBuilder().mergeFrom(deleteShotResponse);
                }
                if (this.deleteShotResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceIdentificationRequest(DeviceIdentificationRequest deviceIdentificationRequest) {
                DeviceIdentificationRequest deviceIdentificationRequest2;
                SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceIdentificationRequest);
                } else if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0 || (deviceIdentificationRequest2 = this.deviceIdentificationRequest_) == null || deviceIdentificationRequest2 == DeviceIdentificationRequest.getDefaultInstance()) {
                    this.deviceIdentificationRequest_ = deviceIdentificationRequest;
                } else {
                    getDeviceIdentificationRequestBuilder().mergeFrom(deviceIdentificationRequest);
                }
                if (this.deviceIdentificationRequest_ != null) {
                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceIdentificationResponse(DeviceIdentificationResponse deviceIdentificationResponse) {
                DeviceIdentificationResponse deviceIdentificationResponse2;
                SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceIdentificationResponse);
                } else if ((this.bitField0_ & 524288) == 0 || (deviceIdentificationResponse2 = this.deviceIdentificationResponse_) == null || deviceIdentificationResponse2 == DeviceIdentificationResponse.getDefaultInstance()) {
                    this.deviceIdentificationResponse_ = deviceIdentificationResponse;
                } else {
                    getDeviceIdentificationResponseBuilder().mergeFrom(deviceIdentificationResponse);
                }
                if (this.deviceIdentificationResponse_ != null) {
                    this.bitField0_ |= 524288;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEndSessionRequest(StopSessionRequest stopSessionRequest) {
                StopSessionRequest stopSessionRequest2;
                SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> singleFieldBuilderV3 = this.endSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopSessionRequest);
                } else if ((this.bitField0_ & 16) == 0 || (stopSessionRequest2 = this.endSessionRequest_) == null || stopSessionRequest2 == StopSessionRequest.getDefaultInstance()) {
                    this.endSessionRequest_ = stopSessionRequest;
                } else {
                    getEndSessionRequestBuilder().mergeFrom(stopSessionRequest);
                }
                if (this.endSessionRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEndSessionResponse(StopSessionResponse stopSessionResponse) {
                StopSessionResponse stopSessionResponse2;
                SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> singleFieldBuilderV3 = this.endSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopSessionResponse);
                } else if ((this.bitField0_ & 32) == 0 || (stopSessionResponse2 = this.endSessionResponse_) == null || stopSessionResponse2 == StopSessionResponse.getDefaultInstance()) {
                    this.endSessionResponse_ = stopSessionResponse;
                } else {
                    getEndSessionResponseBuilder().mergeFrom(stopSessionResponse);
                }
                if (this.endSessionResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeExcludeShotRequest(ExcludeShotRequest excludeShotRequest) {
                ExcludeShotRequest excludeShotRequest2;
                SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> singleFieldBuilderV3 = this.excludeShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(excludeShotRequest);
                } else if ((this.bitField0_ & 64) == 0 || (excludeShotRequest2 = this.excludeShotRequest_) == null || excludeShotRequest2 == ExcludeShotRequest.getDefaultInstance()) {
                    this.excludeShotRequest_ = excludeShotRequest;
                } else {
                    getExcludeShotRequestBuilder().mergeFrom(excludeShotRequest);
                }
                if (this.excludeShotRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeExcludeShotResponse(ExcludeShotResponse excludeShotResponse) {
                ExcludeShotResponse excludeShotResponse2;
                SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> singleFieldBuilderV3 = this.excludeShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(excludeShotResponse);
                } else if ((this.bitField0_ & 128) == 0 || (excludeShotResponse2 = this.excludeShotResponse_) == null || excludeShotResponse2 == ExcludeShotResponse.getDefaultInstance()) {
                    this.excludeShotResponse_ = excludeShotResponse;
                } else {
                    getExcludeShotResponseBuilder().mergeFrom(excludeShotResponse);
                }
                if (this.excludeShotResponse_ != null) {
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
                                    codedInputStream.readMessage(getStartSessionRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getStartSessionResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getDeleteShotRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getDeleteShotResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getEndSessionRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getEndSessionResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getExcludeShotRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getExcludeShotResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getShotListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getShotListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getSessionInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getSessionInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getTitleChangeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getTitleChangeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getRecentSessionsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 130:
                                    codedInputStream.readMessage(getRecentSessionsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32768;
                                    continue;
                                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                    codedInputStream.readMessage(getRearmRadarRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 65536;
                                    continue;
                                case 146:
                                    codedInputStream.readMessage(getRearmRadarResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 131072;
                                    continue;
                                case 154:
                                    codedInputStream.readMessage(getDeviceIdentificationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                                    continue;
                                case 162:
                                    codedInputStream.readMessage(getDeviceIdentificationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 524288;
                                    continue;
                                case 170:
                                    codedInputStream.readMessage(getLastShotRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                    continue;
                                case 178:
                                    codedInputStream.readMessage(getLastShotResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2097152;
                                    continue;
                                case 186:
                                    codedInputStream.readMessage(getRadarStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4194304;
                                    continue;
                                case 194:
                                    codedInputStream.readMessage(getRadarStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8388608;
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

            public Builder mergeLastShotRequest(LastShotRequest lastShotRequest) {
                LastShotRequest lastShotRequest2;
                SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> singleFieldBuilderV3 = this.lastShotRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lastShotRequest);
                } else if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0 || (lastShotRequest2 = this.lastShotRequest_) == null || lastShotRequest2 == LastShotRequest.getDefaultInstance()) {
                    this.lastShotRequest_ = lastShotRequest;
                } else {
                    getLastShotRequestBuilder().mergeFrom(lastShotRequest);
                }
                if (this.lastShotRequest_ != null) {
                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLastShotResponse(LastShotResponse lastShotResponse) {
                LastShotResponse lastShotResponse2;
                SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> singleFieldBuilderV3 = this.lastShotResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lastShotResponse);
                } else if ((this.bitField0_ & 2097152) == 0 || (lastShotResponse2 = this.lastShotResponse_) == null || lastShotResponse2 == LastShotResponse.getDefaultInstance()) {
                    this.lastShotResponse_ = lastShotResponse;
                } else {
                    getLastShotResponseBuilder().mergeFrom(lastShotResponse);
                }
                if (this.lastShotResponse_ != null) {
                    this.bitField0_ |= 2097152;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRadarStatusRequest(RadarStatusRequest radarStatusRequest) {
                RadarStatusRequest radarStatusRequest2;
                SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> singleFieldBuilderV3 = this.radarStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(radarStatusRequest);
                } else if ((this.bitField0_ & 4194304) == 0 || (radarStatusRequest2 = this.radarStatusRequest_) == null || radarStatusRequest2 == RadarStatusRequest.getDefaultInstance()) {
                    this.radarStatusRequest_ = radarStatusRequest;
                } else {
                    getRadarStatusRequestBuilder().mergeFrom(radarStatusRequest);
                }
                if (this.radarStatusRequest_ != null) {
                    this.bitField0_ |= 4194304;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRadarStatusResponse(RadarStatusResponse radarStatusResponse) {
                RadarStatusResponse radarStatusResponse2;
                SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> singleFieldBuilderV3 = this.radarStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(radarStatusResponse);
                } else if ((this.bitField0_ & 8388608) == 0 || (radarStatusResponse2 = this.radarStatusResponse_) == null || radarStatusResponse2 == RadarStatusResponse.getDefaultInstance()) {
                    this.radarStatusResponse_ = radarStatusResponse;
                } else {
                    getRadarStatusResponseBuilder().mergeFrom(radarStatusResponse);
                }
                if (this.radarStatusResponse_ != null) {
                    this.bitField0_ |= 8388608;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRearmRadarRequest(RearmRadarRequest rearmRadarRequest) {
                RearmRadarRequest rearmRadarRequest2;
                SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> singleFieldBuilderV3 = this.rearmRadarRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(rearmRadarRequest);
                } else if ((this.bitField0_ & 65536) == 0 || (rearmRadarRequest2 = this.rearmRadarRequest_) == null || rearmRadarRequest2 == RearmRadarRequest.getDefaultInstance()) {
                    this.rearmRadarRequest_ = rearmRadarRequest;
                } else {
                    getRearmRadarRequestBuilder().mergeFrom(rearmRadarRequest);
                }
                if (this.rearmRadarRequest_ != null) {
                    this.bitField0_ |= 65536;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRearmRadarResponse(RearmRadarResponse rearmRadarResponse) {
                RearmRadarResponse rearmRadarResponse2;
                SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> singleFieldBuilderV3 = this.rearmRadarResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(rearmRadarResponse);
                } else if ((this.bitField0_ & 131072) == 0 || (rearmRadarResponse2 = this.rearmRadarResponse_) == null || rearmRadarResponse2 == RearmRadarResponse.getDefaultInstance()) {
                    this.rearmRadarResponse_ = rearmRadarResponse;
                } else {
                    getRearmRadarResponseBuilder().mergeFrom(rearmRadarResponse);
                }
                if (this.rearmRadarResponse_ != null) {
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRecentSessionsRequest(RecentSessionsRequest recentSessionsRequest) {
                RecentSessionsRequest recentSessionsRequest2;
                SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> singleFieldBuilderV3 = this.recentSessionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(recentSessionsRequest);
                } else if ((this.bitField0_ & 16384) == 0 || (recentSessionsRequest2 = this.recentSessionsRequest_) == null || recentSessionsRequest2 == RecentSessionsRequest.getDefaultInstance()) {
                    this.recentSessionsRequest_ = recentSessionsRequest;
                } else {
                    getRecentSessionsRequestBuilder().mergeFrom(recentSessionsRequest);
                }
                if (this.recentSessionsRequest_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRecentSessionsResponse(RecentSessionsResponse recentSessionsResponse) {
                RecentSessionsResponse recentSessionsResponse2;
                SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> singleFieldBuilderV3 = this.recentSessionsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(recentSessionsResponse);
                } else if ((this.bitField0_ & 32768) == 0 || (recentSessionsResponse2 = this.recentSessionsResponse_) == null || recentSessionsResponse2 == RecentSessionsResponse.getDefaultInstance()) {
                    this.recentSessionsResponse_ = recentSessionsResponse;
                } else {
                    getRecentSessionsResponseBuilder().mergeFrom(recentSessionsResponse);
                }
                if (this.recentSessionsResponse_ != null) {
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSessionInfoRequest(SessionInfoRequest sessionInfoRequest) {
                SessionInfoRequest sessionInfoRequest2;
                SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> singleFieldBuilderV3 = this.sessionInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionInfoRequest);
                } else if ((this.bitField0_ & 1024) == 0 || (sessionInfoRequest2 = this.sessionInfoRequest_) == null || sessionInfoRequest2 == SessionInfoRequest.getDefaultInstance()) {
                    this.sessionInfoRequest_ = sessionInfoRequest;
                } else {
                    getSessionInfoRequestBuilder().mergeFrom(sessionInfoRequest);
                }
                if (this.sessionInfoRequest_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSessionInfoResponse(SessionInfoResponse sessionInfoResponse) {
                SessionInfoResponse sessionInfoResponse2;
                SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> singleFieldBuilderV3 = this.sessionInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionInfoResponse);
                } else if ((this.bitField0_ & 2048) == 0 || (sessionInfoResponse2 = this.sessionInfoResponse_) == null || sessionInfoResponse2 == SessionInfoResponse.getDefaultInstance()) {
                    this.sessionInfoResponse_ = sessionInfoResponse;
                } else {
                    getSessionInfoResponseBuilder().mergeFrom(sessionInfoResponse);
                }
                if (this.sessionInfoResponse_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShotListRequest(ShotListRequest shotListRequest) {
                ShotListRequest shotListRequest2;
                SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> singleFieldBuilderV3 = this.shotListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shotListRequest);
                } else if ((this.bitField0_ & 256) == 0 || (shotListRequest2 = this.shotListRequest_) == null || shotListRequest2 == ShotListRequest.getDefaultInstance()) {
                    this.shotListRequest_ = shotListRequest;
                } else {
                    getShotListRequestBuilder().mergeFrom(shotListRequest);
                }
                if (this.shotListRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShotListResponse(ShotListResponse shotListResponse) {
                ShotListResponse shotListResponse2;
                SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> singleFieldBuilderV3 = this.shotListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shotListResponse);
                } else if ((this.bitField0_ & 512) == 0 || (shotListResponse2 = this.shotListResponse_) == null || shotListResponse2 == ShotListResponse.getDefaultInstance()) {
                    this.shotListResponse_ = shotListResponse;
                } else {
                    getShotListResponseBuilder().mergeFrom(shotListResponse);
                }
                if (this.shotListResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartSessionRequest(StartSessionRequest startSessionRequest) {
                StartSessionRequest startSessionRequest2;
                SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> singleFieldBuilderV3 = this.startSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startSessionRequest);
                } else if ((this.bitField0_ & 1) == 0 || (startSessionRequest2 = this.startSessionRequest_) == null || startSessionRequest2 == StartSessionRequest.getDefaultInstance()) {
                    this.startSessionRequest_ = startSessionRequest;
                } else {
                    getStartSessionRequestBuilder().mergeFrom(startSessionRequest);
                }
                if (this.startSessionRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartSessionResponse(StartSessionResponse startSessionResponse) {
                StartSessionResponse startSessionResponse2;
                SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> singleFieldBuilderV3 = this.startSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startSessionResponse);
                } else if ((this.bitField0_ & 2) == 0 || (startSessionResponse2 = this.startSessionResponse_) == null || startSessionResponse2 == StartSessionResponse.getDefaultInstance()) {
                    this.startSessionResponse_ = startSessionResponse;
                } else {
                    getStartSessionResponseBuilder().mergeFrom(startSessionResponse);
                }
                if (this.startSessionResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTitleChangeRequest(TitleChangeRequest titleChangeRequest) {
                TitleChangeRequest titleChangeRequest2;
                SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> singleFieldBuilderV3 = this.titleChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(titleChangeRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (titleChangeRequest2 = this.titleChangeRequest_) == null || titleChangeRequest2 == TitleChangeRequest.getDefaultInstance()) {
                    this.titleChangeRequest_ = titleChangeRequest;
                } else {
                    getTitleChangeRequestBuilder().mergeFrom(titleChangeRequest);
                }
                if (this.titleChangeRequest_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTitleChangeResponse(TitleChangeResponse titleChangeResponse) {
                TitleChangeResponse titleChangeResponse2;
                SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> singleFieldBuilderV3 = this.titleChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(titleChangeResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (titleChangeResponse2 = this.titleChangeResponse_) == null || titleChangeResponse2 == TitleChangeResponse.getDefaultInstance()) {
                    this.titleChangeResponse_ = titleChangeResponse;
                } else {
                    getTitleChangeResponseBuilder().mergeFrom(titleChangeResponse);
                }
                if (this.titleChangeResponse_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDeleteShotRequest(DeleteShotRequest.Builder builder) {
                SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> singleFieldBuilderV3 = this.deleteShotRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deleteShotRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDeleteShotResponse(DeleteShotResponse.Builder builder) {
                SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> singleFieldBuilderV3 = this.deleteShotResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deleteShotResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDeviceIdentificationRequest(DeviceIdentificationRequest.Builder builder) {
                SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceIdentificationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setDeviceIdentificationResponse(DeviceIdentificationResponse.Builder builder) {
                SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceIdentificationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setEndSessionRequest(StopSessionRequest.Builder builder) {
                SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> singleFieldBuilderV3 = this.endSessionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.endSessionRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEndSessionResponse(StopSessionResponse.Builder builder) {
                SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> singleFieldBuilderV3 = this.endSessionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.endSessionResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setExcludeShotRequest(ExcludeShotRequest.Builder builder) {
                SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> singleFieldBuilderV3 = this.excludeShotRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.excludeShotRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setExcludeShotResponse(ExcludeShotResponse.Builder builder) {
                SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> singleFieldBuilderV3 = this.excludeShotResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.excludeShotResponse_ = builder.build();
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

            public Builder setLastShotRequest(LastShotRequest.Builder builder) {
                SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> singleFieldBuilderV3 = this.lastShotRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lastShotRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setLastShotResponse(LastShotResponse.Builder builder) {
                SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> singleFieldBuilderV3 = this.lastShotResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lastShotResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setRadarStatusRequest(RadarStatusRequest.Builder builder) {
                SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> singleFieldBuilderV3 = this.radarStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.radarStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setRadarStatusResponse(RadarStatusResponse.Builder builder) {
                SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> singleFieldBuilderV3 = this.radarStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.radarStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setRearmRadarRequest(RearmRadarRequest.Builder builder) {
                SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> singleFieldBuilderV3 = this.rearmRadarRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rearmRadarRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setRearmRadarResponse(RearmRadarResponse.Builder builder) {
                SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> singleFieldBuilderV3 = this.rearmRadarResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rearmRadarResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setRecentSessionsRequest(RecentSessionsRequest.Builder builder) {
                SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> singleFieldBuilderV3 = this.recentSessionsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.recentSessionsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setRecentSessionsResponse(RecentSessionsResponse.Builder builder) {
                SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> singleFieldBuilderV3 = this.recentSessionsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.recentSessionsResponse_ = builder.build();
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

            public Builder setSessionInfoRequest(SessionInfoRequest.Builder builder) {
                SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> singleFieldBuilderV3 = this.sessionInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionInfoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setSessionInfoResponse(SessionInfoResponse.Builder builder) {
                SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> singleFieldBuilderV3 = this.sessionInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionInfoResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setShotListRequest(ShotListRequest.Builder builder) {
                SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> singleFieldBuilderV3 = this.shotListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shotListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setShotListResponse(ShotListResponse.Builder builder) {
                SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> singleFieldBuilderV3 = this.shotListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shotListResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setStartSessionRequest(StartSessionRequest.Builder builder) {
                SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> singleFieldBuilderV3 = this.startSessionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startSessionRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStartSessionResponse(StartSessionResponse.Builder builder) {
                SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> singleFieldBuilderV3 = this.startSessionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startSessionResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitleChangeRequest(TitleChangeRequest.Builder builder) {
                SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> singleFieldBuilderV3 = this.titleChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.titleChangeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setTitleChangeResponse(TitleChangeResponse.Builder builder) {
                SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> singleFieldBuilderV3 = this.titleChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.titleChangeResponse_ = builder.build();
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

            public Builder setDeleteShotRequest(DeleteShotRequest deleteShotRequest) {
                SingleFieldBuilderV3<DeleteShotRequest, DeleteShotRequest.Builder, DeleteShotRequestOrBuilder> singleFieldBuilderV3 = this.deleteShotRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deleteShotRequest.getClass();
                    this.deleteShotRequest_ = deleteShotRequest;
                } else {
                    singleFieldBuilderV3.setMessage(deleteShotRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDeleteShotResponse(DeleteShotResponse deleteShotResponse) {
                SingleFieldBuilderV3<DeleteShotResponse, DeleteShotResponse.Builder, DeleteShotResponseOrBuilder> singleFieldBuilderV3 = this.deleteShotResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deleteShotResponse.getClass();
                    this.deleteShotResponse_ = deleteShotResponse;
                } else {
                    singleFieldBuilderV3.setMessage(deleteShotResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEndSessionRequest(StopSessionRequest stopSessionRequest) {
                SingleFieldBuilderV3<StopSessionRequest, StopSessionRequest.Builder, StopSessionRequestOrBuilder> singleFieldBuilderV3 = this.endSessionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopSessionRequest.getClass();
                    this.endSessionRequest_ = stopSessionRequest;
                } else {
                    singleFieldBuilderV3.setMessage(stopSessionRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEndSessionResponse(StopSessionResponse stopSessionResponse) {
                SingleFieldBuilderV3<StopSessionResponse, StopSessionResponse.Builder, StopSessionResponseOrBuilder> singleFieldBuilderV3 = this.endSessionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopSessionResponse.getClass();
                    this.endSessionResponse_ = stopSessionResponse;
                } else {
                    singleFieldBuilderV3.setMessage(stopSessionResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setExcludeShotRequest(ExcludeShotRequest excludeShotRequest) {
                SingleFieldBuilderV3<ExcludeShotRequest, ExcludeShotRequest.Builder, ExcludeShotRequestOrBuilder> singleFieldBuilderV3 = this.excludeShotRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    excludeShotRequest.getClass();
                    this.excludeShotRequest_ = excludeShotRequest;
                } else {
                    singleFieldBuilderV3.setMessage(excludeShotRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setExcludeShotResponse(ExcludeShotResponse excludeShotResponse) {
                SingleFieldBuilderV3<ExcludeShotResponse, ExcludeShotResponse.Builder, ExcludeShotResponseOrBuilder> singleFieldBuilderV3 = this.excludeShotResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    excludeShotResponse.getClass();
                    this.excludeShotResponse_ = excludeShotResponse;
                } else {
                    singleFieldBuilderV3.setMessage(excludeShotResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setRecentSessionsRequest(RecentSessionsRequest recentSessionsRequest) {
                SingleFieldBuilderV3<RecentSessionsRequest, RecentSessionsRequest.Builder, RecentSessionsRequestOrBuilder> singleFieldBuilderV3 = this.recentSessionsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    recentSessionsRequest.getClass();
                    this.recentSessionsRequest_ = recentSessionsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(recentSessionsRequest);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setSessionInfoRequest(SessionInfoRequest sessionInfoRequest) {
                SingleFieldBuilderV3<SessionInfoRequest, SessionInfoRequest.Builder, SessionInfoRequestOrBuilder> singleFieldBuilderV3 = this.sessionInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionInfoRequest.getClass();
                    this.sessionInfoRequest_ = sessionInfoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(sessionInfoRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setSessionInfoResponse(SessionInfoResponse sessionInfoResponse) {
                SingleFieldBuilderV3<SessionInfoResponse, SessionInfoResponse.Builder, SessionInfoResponseOrBuilder> singleFieldBuilderV3 = this.sessionInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionInfoResponse.getClass();
                    this.sessionInfoResponse_ = sessionInfoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(sessionInfoResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setShotListRequest(ShotListRequest shotListRequest) {
                SingleFieldBuilderV3<ShotListRequest, ShotListRequest.Builder, ShotListRequestOrBuilder> singleFieldBuilderV3 = this.shotListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shotListRequest.getClass();
                    this.shotListRequest_ = shotListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(shotListRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setShotListResponse(ShotListResponse shotListResponse) {
                SingleFieldBuilderV3<ShotListResponse, ShotListResponse.Builder, ShotListResponseOrBuilder> singleFieldBuilderV3 = this.shotListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shotListResponse.getClass();
                    this.shotListResponse_ = shotListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(shotListResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setStartSessionRequest(StartSessionRequest startSessionRequest) {
                SingleFieldBuilderV3<StartSessionRequest, StartSessionRequest.Builder, StartSessionRequestOrBuilder> singleFieldBuilderV3 = this.startSessionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startSessionRequest.getClass();
                    this.startSessionRequest_ = startSessionRequest;
                } else {
                    singleFieldBuilderV3.setMessage(startSessionRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStartSessionResponse(StartSessionResponse startSessionResponse) {
                SingleFieldBuilderV3<StartSessionResponse, StartSessionResponse.Builder, StartSessionResponseOrBuilder> singleFieldBuilderV3 = this.startSessionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startSessionResponse.getClass();
                    this.startSessionResponse_ = startSessionResponse;
                } else {
                    singleFieldBuilderV3.setMessage(startSessionResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitleChangeRequest(TitleChangeRequest titleChangeRequest) {
                SingleFieldBuilderV3<TitleChangeRequest, TitleChangeRequest.Builder, TitleChangeRequestOrBuilder> singleFieldBuilderV3 = this.titleChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    titleChangeRequest.getClass();
                    this.titleChangeRequest_ = titleChangeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(titleChangeRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setTitleChangeResponse(TitleChangeResponse titleChangeResponse) {
                SingleFieldBuilderV3<TitleChangeResponse, TitleChangeResponse.Builder, TitleChangeResponseOrBuilder> singleFieldBuilderV3 = this.titleChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    titleChangeResponse.getClass();
                    this.titleChangeResponse_ = titleChangeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(titleChangeResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setDeviceIdentificationRequest(DeviceIdentificationRequest deviceIdentificationRequest) {
                SingleFieldBuilderV3<DeviceIdentificationRequest, DeviceIdentificationRequest.Builder, DeviceIdentificationRequestOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceIdentificationRequest.getClass();
                    this.deviceIdentificationRequest_ = deviceIdentificationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(deviceIdentificationRequest);
                }
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setDeviceIdentificationResponse(DeviceIdentificationResponse deviceIdentificationResponse) {
                SingleFieldBuilderV3<DeviceIdentificationResponse, DeviceIdentificationResponse.Builder, DeviceIdentificationResponseOrBuilder> singleFieldBuilderV3 = this.deviceIdentificationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceIdentificationResponse.getClass();
                    this.deviceIdentificationResponse_ = deviceIdentificationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(deviceIdentificationResponse);
                }
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setLastShotRequest(LastShotRequest lastShotRequest) {
                SingleFieldBuilderV3<LastShotRequest, LastShotRequest.Builder, LastShotRequestOrBuilder> singleFieldBuilderV3 = this.lastShotRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lastShotRequest.getClass();
                    this.lastShotRequest_ = lastShotRequest;
                } else {
                    singleFieldBuilderV3.setMessage(lastShotRequest);
                }
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setLastShotResponse(LastShotResponse lastShotResponse) {
                SingleFieldBuilderV3<LastShotResponse, LastShotResponse.Builder, LastShotResponseOrBuilder> singleFieldBuilderV3 = this.lastShotResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lastShotResponse.getClass();
                    this.lastShotResponse_ = lastShotResponse;
                } else {
                    singleFieldBuilderV3.setMessage(lastShotResponse);
                }
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setRadarStatusRequest(RadarStatusRequest radarStatusRequest) {
                SingleFieldBuilderV3<RadarStatusRequest, RadarStatusRequest.Builder, RadarStatusRequestOrBuilder> singleFieldBuilderV3 = this.radarStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    radarStatusRequest.getClass();
                    this.radarStatusRequest_ = radarStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(radarStatusRequest);
                }
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setRadarStatusResponse(RadarStatusResponse radarStatusResponse) {
                SingleFieldBuilderV3<RadarStatusResponse, RadarStatusResponse.Builder, RadarStatusResponseOrBuilder> singleFieldBuilderV3 = this.radarStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    radarStatusResponse.getClass();
                    this.radarStatusResponse_ = radarStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(radarStatusResponse);
                }
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setRearmRadarRequest(RearmRadarRequest rearmRadarRequest) {
                SingleFieldBuilderV3<RearmRadarRequest, RearmRadarRequest.Builder, RearmRadarRequestOrBuilder> singleFieldBuilderV3 = this.rearmRadarRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    rearmRadarRequest.getClass();
                    this.rearmRadarRequest_ = rearmRadarRequest;
                } else {
                    singleFieldBuilderV3.setMessage(rearmRadarRequest);
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setRearmRadarResponse(RearmRadarResponse rearmRadarResponse) {
                SingleFieldBuilderV3<RearmRadarResponse, RearmRadarResponse.Builder, RearmRadarResponseOrBuilder> singleFieldBuilderV3 = this.rearmRadarResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    rearmRadarResponse.getClass();
                    this.rearmRadarResponse_ = rearmRadarResponse;
                } else {
                    singleFieldBuilderV3.setMessage(rearmRadarResponse);
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setRecentSessionsResponse(RecentSessionsResponse recentSessionsResponse) {
                SingleFieldBuilderV3<RecentSessionsResponse, RecentSessionsResponse.Builder, RecentSessionsResponseOrBuilder> singleFieldBuilderV3 = this.recentSessionsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    recentSessionsResponse.getClass();
                    this.recentSessionsResponse_ = recentSessionsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(recentSessionsResponse);
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
                if (service.hasStartSessionRequest()) {
                    mergeStartSessionRequest(service.getStartSessionRequest());
                }
                if (service.hasStartSessionResponse()) {
                    mergeStartSessionResponse(service.getStartSessionResponse());
                }
                if (service.hasDeleteShotRequest()) {
                    mergeDeleteShotRequest(service.getDeleteShotRequest());
                }
                if (service.hasDeleteShotResponse()) {
                    mergeDeleteShotResponse(service.getDeleteShotResponse());
                }
                if (service.hasEndSessionRequest()) {
                    mergeEndSessionRequest(service.getEndSessionRequest());
                }
                if (service.hasEndSessionResponse()) {
                    mergeEndSessionResponse(service.getEndSessionResponse());
                }
                if (service.hasExcludeShotRequest()) {
                    mergeExcludeShotRequest(service.getExcludeShotRequest());
                }
                if (service.hasExcludeShotResponse()) {
                    mergeExcludeShotResponse(service.getExcludeShotResponse());
                }
                if (service.hasShotListRequest()) {
                    mergeShotListRequest(service.getShotListRequest());
                }
                if (service.hasShotListResponse()) {
                    mergeShotListResponse(service.getShotListResponse());
                }
                if (service.hasSessionInfoRequest()) {
                    mergeSessionInfoRequest(service.getSessionInfoRequest());
                }
                if (service.hasSessionInfoResponse()) {
                    mergeSessionInfoResponse(service.getSessionInfoResponse());
                }
                if (service.hasTitleChangeRequest()) {
                    mergeTitleChangeRequest(service.getTitleChangeRequest());
                }
                if (service.hasTitleChangeResponse()) {
                    mergeTitleChangeResponse(service.getTitleChangeResponse());
                }
                if (service.hasRecentSessionsRequest()) {
                    mergeRecentSessionsRequest(service.getRecentSessionsRequest());
                }
                if (service.hasRecentSessionsResponse()) {
                    mergeRecentSessionsResponse(service.getRecentSessionsResponse());
                }
                if (service.hasRearmRadarRequest()) {
                    mergeRearmRadarRequest(service.getRearmRadarRequest());
                }
                if (service.hasRearmRadarResponse()) {
                    mergeRearmRadarResponse(service.getRearmRadarResponse());
                }
                if (service.hasDeviceIdentificationRequest()) {
                    mergeDeviceIdentificationRequest(service.getDeviceIdentificationRequest());
                }
                if (service.hasDeviceIdentificationResponse()) {
                    mergeDeviceIdentificationResponse(service.getDeviceIdentificationResponse());
                }
                if (service.hasLastShotRequest()) {
                    mergeLastShotRequest(service.getLastShotRequest());
                }
                if (service.hasLastShotResponse()) {
                    mergeLastShotResponse(service.getLastShotResponse());
                }
                if (service.hasRadarStatusRequest()) {
                    mergeRadarStatusRequest(service.getRadarStatusRequest());
                }
                if (service.hasRadarStatusResponse()) {
                    mergeRadarStatusResponse(service.getRadarStatusResponse());
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

    public static final class SessionInfoMessage extends GeneratedMessageV3 implements SessionInfoMessageOrBuilder {
        public static final int AVERAGE_KE_FIELD_NUMBER = 9;
        public static final int AVERAGE_PF_FIELD_NUMBER = 8;
        public static final int AVG_SHOT_SPEED_FIELD_NUMBER = 3;
        public static final int GRAIN_WEIGHT_FIELD_NUMBER = 5;
        public static final int MAX_SHOT_SPEED_FIELD_NUMBER = 2;
        public static final int MIN_SHOT_SPEED_FIELD_NUMBER = 1;
        public static final int PROJECTILE_TYPE_FIELD_NUMBER = 11;
        public static final int RADAR_ARMED_FIELD_NUMBER = 13;
        public static final int SESSIONUUID_FIELD_NUMBER = 10;
        public static final int SESSION_ACTIVE_FIELD_NUMBER = 6;
        public static final int SESSION_TITLE_FIELD_NUMBER = 12;
        public static final int SHOT_COUNT_FIELD_NUMBER = 4;
        public static final int STANDARD_DEVIATION_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private float averageKe_;
        private float averagePf_;
        private float avgShotSpeed_;
        private int bitField0_;
        private float grainWeight_;
        private float maxShotSpeed_;
        private byte memoizedIsInitialized;
        private float minShotSpeed_;
        private int projectileType_;
        private boolean radarArmed_;
        private boolean sessionActive_;
        private volatile Object sessionTitle_;
        private ByteString sessionUUID_;
        private int shotCount_;
        private float standardDeviation_;
        private static final SessionInfoMessage DEFAULT_INSTANCE = new SessionInfoMessage();

        @Deprecated
        public static final Parser<SessionInfoMessage> PARSER = new AbstractParser<SessionInfoMessage>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessage.1
            @Override // com.google.protobuf.Parser
            public SessionInfoMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SessionInfoMessage.newBuilder();
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

        private SessionInfoMessage() {
            this.minShotSpeed_ = 0.0f;
            this.maxShotSpeed_ = 0.0f;
            this.avgShotSpeed_ = 0.0f;
            this.shotCount_ = 0;
            this.grainWeight_ = 0.0f;
            this.sessionActive_ = false;
            this.standardDeviation_ = 0.0f;
            this.averagePf_ = 0.0f;
            this.averageKe_ = 0.0f;
            ByteString byteString = ByteString.EMPTY;
            this.sessionUUID_ = byteString;
            this.projectileType_ = 0;
            this.sessionTitle_ = "";
            this.radarArmed_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.sessionUUID_ = byteString;
            this.projectileType_ = 0;
            this.sessionTitle_ = "";
        }

        public static SessionInfoMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_descriptor;
        }

        public static Builder newBuilder(SessionInfoMessage sessionInfoMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionInfoMessage);
        }

        public static SessionInfoMessage parseDelimitedFrom(InputStream inputStream) {
            return (SessionInfoMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionInfoMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SessionInfoMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionInfoMessage)) {
                return super.equals(obj);
            }
            SessionInfoMessage sessionInfoMessage = (SessionInfoMessage) obj;
            if (hasMinShotSpeed() != sessionInfoMessage.hasMinShotSpeed()) {
                return false;
            }
            if ((hasMinShotSpeed() && Float.floatToIntBits(getMinShotSpeed()) != Float.floatToIntBits(sessionInfoMessage.getMinShotSpeed())) || hasMaxShotSpeed() != sessionInfoMessage.hasMaxShotSpeed()) {
                return false;
            }
            if ((hasMaxShotSpeed() && Float.floatToIntBits(getMaxShotSpeed()) != Float.floatToIntBits(sessionInfoMessage.getMaxShotSpeed())) || hasAvgShotSpeed() != sessionInfoMessage.hasAvgShotSpeed()) {
                return false;
            }
            if ((hasAvgShotSpeed() && Float.floatToIntBits(getAvgShotSpeed()) != Float.floatToIntBits(sessionInfoMessage.getAvgShotSpeed())) || hasShotCount() != sessionInfoMessage.hasShotCount()) {
                return false;
            }
            if ((hasShotCount() && getShotCount() != sessionInfoMessage.getShotCount()) || hasGrainWeight() != sessionInfoMessage.hasGrainWeight()) {
                return false;
            }
            if ((hasGrainWeight() && Float.floatToIntBits(getGrainWeight()) != Float.floatToIntBits(sessionInfoMessage.getGrainWeight())) || hasSessionActive() != sessionInfoMessage.hasSessionActive()) {
                return false;
            }
            if ((hasSessionActive() && getSessionActive() != sessionInfoMessage.getSessionActive()) || hasStandardDeviation() != sessionInfoMessage.hasStandardDeviation()) {
                return false;
            }
            if ((hasStandardDeviation() && Float.floatToIntBits(getStandardDeviation()) != Float.floatToIntBits(sessionInfoMessage.getStandardDeviation())) || hasAveragePf() != sessionInfoMessage.hasAveragePf()) {
                return false;
            }
            if ((hasAveragePf() && Float.floatToIntBits(getAveragePf()) != Float.floatToIntBits(sessionInfoMessage.getAveragePf())) || hasAverageKe() != sessionInfoMessage.hasAverageKe()) {
                return false;
            }
            if ((hasAverageKe() && Float.floatToIntBits(getAverageKe()) != Float.floatToIntBits(sessionInfoMessage.getAverageKe())) || hasSessionUUID() != sessionInfoMessage.hasSessionUUID()) {
                return false;
            }
            if ((hasSessionUUID() && !getSessionUUID().equals(sessionInfoMessage.getSessionUUID())) || hasProjectileType() != sessionInfoMessage.hasProjectileType()) {
                return false;
            }
            if ((hasProjectileType() && this.projectileType_ != sessionInfoMessage.projectileType_) || hasSessionTitle() != sessionInfoMessage.hasSessionTitle()) {
                return false;
            }
            if ((!hasSessionTitle() || getSessionTitle().equals(sessionInfoMessage.getSessionTitle())) && hasRadarArmed() == sessionInfoMessage.hasRadarArmed()) {
                return (!hasRadarArmed() || getRadarArmed() == sessionInfoMessage.getRadarArmed()) && getUnknownFields().equals(sessionInfoMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public float getAverageKe() {
            return this.averageKe_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public float getAveragePf() {
            return this.averagePf_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public float getAvgShotSpeed() {
            return this.avgShotSpeed_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public float getGrainWeight() {
            return this.grainWeight_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public float getMaxShotSpeed() {
            return this.maxShotSpeed_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public float getMinShotSpeed() {
            return this.minShotSpeed_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SessionInfoMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public ProjectileType getProjectileType() {
            ProjectileType projectileTypeForNumber = ProjectileType.forNumber(this.projectileType_);
            return projectileTypeForNumber == null ? ProjectileType.ARROW : projectileTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean getRadarArmed() {
            return this.radarArmed_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.minShotSpeed_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.maxShotSpeed_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.avgShotSpeed_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeUInt32Size(4, this.shotCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(5, this.grainWeight_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(6, this.sessionActive_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(7, this.standardDeviation_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(8, this.averagePf_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(9, this.averageKe_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeFloatSize += CodedOutputStream.computeBytesSize(10, this.sessionUUID_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeFloatSize += CodedOutputStream.computeEnumSize(11, this.projectileType_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeFloatSize += GeneratedMessageV3.computeStringSize(12, this.sessionTitle_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(13, this.radarArmed_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean getSessionActive() {
            return this.sessionActive_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public String getSessionTitle() {
            Object obj = this.sessionTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sessionTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public ByteString getSessionTitleBytes() {
            Object obj = this.sessionTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public ByteString getSessionUUID() {
            return this.sessionUUID_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public int getShotCount() {
            return this.shotCount_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public float getStandardDeviation() {
            return this.standardDeviation_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasAverageKe() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasAveragePf() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasAvgShotSpeed() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasGrainWeight() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasMaxShotSpeed() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasMinShotSpeed() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasProjectileType() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasRadarArmed() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasSessionActive() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasSessionTitle() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasSessionUUID() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasShotCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
        public boolean hasStandardDeviation() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMinShotSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getMinShotSpeed());
            }
            if (hasMaxShotSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getMaxShotSpeed());
            }
            if (hasAvgShotSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getAvgShotSpeed());
            }
            if (hasShotCount()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getShotCount();
            }
            if (hasGrainWeight()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getGrainWeight());
            }
            if (hasSessionActive()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getSessionActive());
            }
            if (hasStandardDeviation()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getStandardDeviation());
            }
            if (hasAveragePf()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Float.floatToIntBits(getAveragePf());
            }
            if (hasAverageKe()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Float.floatToIntBits(getAverageKe());
            }
            if (hasSessionUUID()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSessionUUID().hashCode();
            }
            if (hasProjectileType()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + this.projectileType_;
            }
            if (hasSessionTitle()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getSessionTitle().hashCode();
            }
            if (hasRadarArmed()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + Internal.hashBoolean(getRadarArmed());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionInfoMessage.class, Builder.class);
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
            return new SessionInfoMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.minShotSpeed_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.maxShotSpeed_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.avgShotSpeed_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.shotCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.grainWeight_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.sessionActive_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.standardDeviation_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(8, this.averagePf_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(9, this.averageKe_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeBytes(10, this.sessionUUID_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeEnum(11, this.projectileType_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.sessionTitle_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeBool(13, this.radarArmed_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionInfoMessageOrBuilder {
            private float averageKe_;
            private float averagePf_;
            private float avgShotSpeed_;
            private int bitField0_;
            private float grainWeight_;
            private float maxShotSpeed_;
            private float minShotSpeed_;
            private int projectileType_;
            private boolean radarArmed_;
            private boolean sessionActive_;
            private Object sessionTitle_;
            private ByteString sessionUUID_;
            private int shotCount_;
            private float standardDeviation_;

            private Builder() {
                this.sessionUUID_ = ByteString.EMPTY;
                this.projectileType_ = 0;
                this.sessionTitle_ = "";
            }

            private void buildPartial0(SessionInfoMessage sessionInfoMessage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sessionInfoMessage.minShotSpeed_ = this.minShotSpeed_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sessionInfoMessage.maxShotSpeed_ = this.maxShotSpeed_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    sessionInfoMessage.avgShotSpeed_ = this.avgShotSpeed_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    sessionInfoMessage.shotCount_ = this.shotCount_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    sessionInfoMessage.grainWeight_ = this.grainWeight_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    sessionInfoMessage.sessionActive_ = this.sessionActive_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    sessionInfoMessage.standardDeviation_ = this.standardDeviation_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    sessionInfoMessage.averagePf_ = this.averagePf_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    sessionInfoMessage.averageKe_ = this.averageKe_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    sessionInfoMessage.sessionUUID_ = this.sessionUUID_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    sessionInfoMessage.projectileType_ = this.projectileType_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    sessionInfoMessage.sessionTitle_ = this.sessionTitle_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    sessionInfoMessage.radarArmed_ = this.radarArmed_;
                    i14 |= 4096;
                }
                sessionInfoMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionInfoMessage build() {
                SessionInfoMessage sessionInfoMessageBuildPartial = buildPartial();
                if (sessionInfoMessageBuildPartial.isInitialized()) {
                    return sessionInfoMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionInfoMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionInfoMessage buildPartial() {
                SessionInfoMessage sessionInfoMessage = new SessionInfoMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sessionInfoMessage);
                }
                onBuilt();
                return sessionInfoMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.minShotSpeed_ = 0.0f;
                this.maxShotSpeed_ = 0.0f;
                this.avgShotSpeed_ = 0.0f;
                this.shotCount_ = 0;
                this.grainWeight_ = 0.0f;
                this.sessionActive_ = false;
                this.standardDeviation_ = 0.0f;
                this.averagePf_ = 0.0f;
                this.averageKe_ = 0.0f;
                this.sessionUUID_ = ByteString.EMPTY;
                this.projectileType_ = 0;
                this.sessionTitle_ = "";
                this.radarArmed_ = false;
                return this;
            }

            public Builder clearAverageKe() {
                this.bitField0_ &= -257;
                this.averageKe_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearAveragePf() {
                this.bitField0_ &= -129;
                this.averagePf_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearAvgShotSpeed() {
                this.bitField0_ &= -5;
                this.avgShotSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGrainWeight() {
                this.bitField0_ &= -17;
                this.grainWeight_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMaxShotSpeed() {
                this.bitField0_ &= -3;
                this.maxShotSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMinShotSpeed() {
                this.bitField0_ &= -2;
                this.minShotSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearProjectileType() {
                this.bitField0_ &= -1025;
                this.projectileType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRadarArmed() {
                this.bitField0_ &= -4097;
                this.radarArmed_ = false;
                onChanged();
                return this;
            }

            public Builder clearSessionActive() {
                this.bitField0_ &= -33;
                this.sessionActive_ = false;
                onChanged();
                return this;
            }

            public Builder clearSessionTitle() {
                this.sessionTitle_ = SessionInfoMessage.getDefaultInstance().getSessionTitle();
                this.bitField0_ &= -2049;
                onChanged();
                return this;
            }

            public Builder clearSessionUUID() {
                this.bitField0_ &= -513;
                this.sessionUUID_ = SessionInfoMessage.getDefaultInstance().getSessionUUID();
                onChanged();
                return this;
            }

            public Builder clearShotCount() {
                this.bitField0_ &= -9;
                this.shotCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStandardDeviation() {
                this.bitField0_ &= -65;
                this.standardDeviation_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public float getAverageKe() {
                return this.averageKe_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public float getAveragePf() {
                return this.averagePf_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public float getAvgShotSpeed() {
                return this.avgShotSpeed_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public float getGrainWeight() {
                return this.grainWeight_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public float getMaxShotSpeed() {
                return this.maxShotSpeed_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public float getMinShotSpeed() {
                return this.minShotSpeed_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public ProjectileType getProjectileType() {
                ProjectileType projectileTypeForNumber = ProjectileType.forNumber(this.projectileType_);
                return projectileTypeForNumber == null ? ProjectileType.ARROW : projectileTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean getRadarArmed() {
                return this.radarArmed_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean getSessionActive() {
                return this.sessionActive_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public String getSessionTitle() {
                Object obj = this.sessionTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sessionTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public ByteString getSessionTitleBytes() {
                Object obj = this.sessionTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public ByteString getSessionUUID() {
                return this.sessionUUID_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public int getShotCount() {
                return this.shotCount_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public float getStandardDeviation() {
                return this.standardDeviation_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasAverageKe() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasAveragePf() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasAvgShotSpeed() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasGrainWeight() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasMaxShotSpeed() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasMinShotSpeed() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasProjectileType() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasRadarArmed() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasSessionActive() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasSessionTitle() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasSessionUUID() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasShotCount() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoMessageOrBuilder
            public boolean hasStandardDeviation() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionInfoMessage.class, Builder.class);
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
                                case 13:
                                    this.minShotSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 21:
                                    this.maxShotSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 29:
                                    this.avgShotSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.shotCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 45:
                                    this.grainWeight_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.sessionActive_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 61:
                                    this.standardDeviation_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 69:
                                    this.averagePf_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 77:
                                    this.averageKe_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    this.sessionUUID_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    int i14 = codedInputStream.readEnum();
                                    if (ProjectileType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(11, i14);
                                    } else {
                                        this.projectileType_ = i14;
                                        this.bitField0_ |= 1024;
                                        continue;
                                    }
                                    break;
                                case 98:
                                    this.sessionTitle_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    this.radarArmed_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4096;
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

            public Builder setAverageKe(float f14) {
                this.averageKe_ = f14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setAveragePf(float f14) {
                this.averagePf_ = f14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAvgShotSpeed(float f14) {
                this.avgShotSpeed_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGrainWeight(float f14) {
                this.grainWeight_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMaxShotSpeed(float f14) {
                this.maxShotSpeed_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMinShotSpeed(float f14) {
                this.minShotSpeed_ = f14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setProjectileType(ProjectileType projectileType) {
                projectileType.getClass();
                this.bitField0_ |= 1024;
                this.projectileType_ = projectileType.getNumber();
                onChanged();
                return this;
            }

            public Builder setRadarArmed(boolean z14) {
                this.radarArmed_ = z14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionActive(boolean z14) {
                this.sessionActive_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSessionTitle(String str) {
                str.getClass();
                this.sessionTitle_ = str;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSessionTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.sessionTitle_ = byteString;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSessionUUID(ByteString byteString) {
                byteString.getClass();
                this.sessionUUID_ = byteString;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setShotCount(int i14) {
                this.shotCount_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStandardDeviation(float f14) {
                this.standardDeviation_ = f14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SessionInfoMessage getDefaultInstanceForType() {
                return SessionInfoMessage.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionUUID_ = ByteString.EMPTY;
                this.projectileType_ = 0;
                this.sessionTitle_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionInfoMessage) {
                    return mergeFrom((SessionInfoMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionInfoMessage sessionInfoMessage) {
                if (sessionInfoMessage == SessionInfoMessage.getDefaultInstance()) {
                    return this;
                }
                if (sessionInfoMessage.hasMinShotSpeed()) {
                    setMinShotSpeed(sessionInfoMessage.getMinShotSpeed());
                }
                if (sessionInfoMessage.hasMaxShotSpeed()) {
                    setMaxShotSpeed(sessionInfoMessage.getMaxShotSpeed());
                }
                if (sessionInfoMessage.hasAvgShotSpeed()) {
                    setAvgShotSpeed(sessionInfoMessage.getAvgShotSpeed());
                }
                if (sessionInfoMessage.hasShotCount()) {
                    setShotCount(sessionInfoMessage.getShotCount());
                }
                if (sessionInfoMessage.hasGrainWeight()) {
                    setGrainWeight(sessionInfoMessage.getGrainWeight());
                }
                if (sessionInfoMessage.hasSessionActive()) {
                    setSessionActive(sessionInfoMessage.getSessionActive());
                }
                if (sessionInfoMessage.hasStandardDeviation()) {
                    setStandardDeviation(sessionInfoMessage.getStandardDeviation());
                }
                if (sessionInfoMessage.hasAveragePf()) {
                    setAveragePf(sessionInfoMessage.getAveragePf());
                }
                if (sessionInfoMessage.hasAverageKe()) {
                    setAverageKe(sessionInfoMessage.getAverageKe());
                }
                if (sessionInfoMessage.hasSessionUUID()) {
                    setSessionUUID(sessionInfoMessage.getSessionUUID());
                }
                if (sessionInfoMessage.hasProjectileType()) {
                    setProjectileType(sessionInfoMessage.getProjectileType());
                }
                if (sessionInfoMessage.hasSessionTitle()) {
                    this.sessionTitle_ = sessionInfoMessage.sessionTitle_;
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                if (sessionInfoMessage.hasRadarArmed()) {
                    setRadarArmed(sessionInfoMessage.getRadarArmed());
                }
                mergeUnknownFields(sessionInfoMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SessionInfoMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SessionInfoMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionInfoMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SessionInfoMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionInfoMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SessionInfoMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SessionInfoMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SessionInfoMessage parseFrom(InputStream inputStream) {
            return (SessionInfoMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SessionInfoMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionInfoMessage parseFrom(CodedInputStream codedInputStream) {
            return (SessionInfoMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionInfoMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SessionInfoMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.minShotSpeed_ = 0.0f;
            this.maxShotSpeed_ = 0.0f;
            this.avgShotSpeed_ = 0.0f;
            this.shotCount_ = 0;
            this.grainWeight_ = 0.0f;
            this.sessionActive_ = false;
            this.standardDeviation_ = 0.0f;
            this.averagePf_ = 0.0f;
            this.averageKe_ = 0.0f;
            this.sessionUUID_ = ByteString.EMPTY;
            this.projectileType_ = 0;
            this.sessionTitle_ = "";
            this.radarArmed_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ SessionInfoMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SessionInfoResponse extends GeneratedMessageV3 implements SessionInfoResponseOrBuilder {
        private static final SessionInfoResponse DEFAULT_INSTANCE = new SessionInfoResponse();

        @Deprecated
        public static final Parser<SessionInfoResponse> PARSER = new AbstractParser<SessionInfoResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponse.1
            @Override // com.google.protobuf.Parser
            public SessionInfoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SessionInfoResponse.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SessionInfoMessage sessionInfo_;
        private int status_;

        private SessionInfoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_descriptor;
        }

        public static Builder newBuilder(SessionInfoResponse sessionInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionInfoResponse);
        }

        public static SessionInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (SessionInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SessionInfoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionInfoResponse)) {
                return super.equals(obj);
            }
            SessionInfoResponse sessionInfoResponse = (SessionInfoResponse) obj;
            if (hasSessionInfo() != sessionInfoResponse.hasSessionInfo()) {
                return false;
            }
            if ((!hasSessionInfo() || getSessionInfo().equals(sessionInfoResponse.getSessionInfo())) && hasStatus() == sessionInfoResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == sessionInfoResponse.status_) && getUnknownFields().equals(sessionInfoResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SessionInfoResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSessionInfo()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
        public SessionInfoMessage getSessionInfo() {
            SessionInfoMessage sessionInfoMessage = this.sessionInfo_;
            return sessionInfoMessage == null ? SessionInfoMessage.getDefaultInstance() : sessionInfoMessage;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
        public SessionInfoMessageOrBuilder getSessionInfoOrBuilder() {
            SessionInfoMessage sessionInfoMessage = this.sessionInfo_;
            return sessionInfoMessage == null ? SessionInfoMessage.getDefaultInstance() : sessionInfoMessage;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
        public boolean hasSessionInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
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
            if (hasSessionInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionInfo().hashCode();
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionInfoResponse.class, Builder.class);
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
            return new SessionInfoResponse();
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionInfoResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> sessionInfoBuilder_;
            private SessionInfoMessage sessionInfo_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SessionInfoResponse sessionInfoResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                    sessionInfoResponse.sessionInfo_ = singleFieldBuilderV3 == null ? this.sessionInfo_ : (SessionInfoMessage) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sessionInfoResponse.status_ = this.status_;
                    i14 |= 2;
                }
                sessionInfoResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_descriptor;
            }

            private SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> getSessionInfoFieldBuilder() {
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
            public SessionInfoResponse build() {
                SessionInfoResponse sessionInfoResponseBuildPartial = buildPartial();
                if (sessionInfoResponseBuildPartial.isInitialized()) {
                    return sessionInfoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionInfoResponse buildPartial() {
                SessionInfoResponse sessionInfoResponse = new SessionInfoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sessionInfoResponse);
                }
                onBuilt();
                return sessionInfoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionInfo_ = null;
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionInfoBuilder_ = null;
                }
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

            public Builder clearSessionInfo() {
                this.bitField0_ &= -2;
                this.sessionInfo_ = null;
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -3;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
            public SessionInfoMessage getSessionInfo() {
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionInfoMessage) singleFieldBuilderV3.getMessage();
                }
                SessionInfoMessage sessionInfoMessage = this.sessionInfo_;
                return sessionInfoMessage == null ? SessionInfoMessage.getDefaultInstance() : sessionInfoMessage;
            }

            public SessionInfoMessage.Builder getSessionInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SessionInfoMessage.Builder) getSessionInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
            public SessionInfoMessageOrBuilder getSessionInfoOrBuilder() {
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionInfoMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionInfoMessage sessionInfoMessage = this.sessionInfo_;
                return sessionInfoMessage == null ? SessionInfoMessage.getDefaultInstance() : sessionInfoMessage;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
            public boolean hasSessionInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.SessionInfoResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_SessionInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionInfoResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getSessionInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
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

            public Builder mergeSessionInfo(SessionInfoMessage sessionInfoMessage) {
                SessionInfoMessage sessionInfoMessage2;
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionInfoMessage);
                } else if ((this.bitField0_ & 1) == 0 || (sessionInfoMessage2 = this.sessionInfo_) == null || sessionInfoMessage2 == SessionInfoMessage.getDefaultInstance()) {
                    this.sessionInfo_ = sessionInfoMessage;
                } else {
                    getSessionInfoBuilder().mergeFrom(sessionInfoMessage);
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

            public Builder setSessionInfo(SessionInfoMessage.Builder builder) {
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 2;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SessionInfoResponse getDefaultInstanceForType() {
                return SessionInfoResponse.getDefaultInstance();
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

            public Builder setSessionInfo(SessionInfoMessage sessionInfoMessage) {
                SingleFieldBuilderV3<SessionInfoMessage, SessionInfoMessage.Builder, SessionInfoMessageOrBuilder> singleFieldBuilderV3 = this.sessionInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionInfoMessage.getClass();
                    this.sessionInfo_ = sessionInfoMessage;
                } else {
                    singleFieldBuilderV3.setMessage(sessionInfoMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionInfoResponse) {
                    return mergeFrom((SessionInfoResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionInfoResponse sessionInfoResponse) {
                if (sessionInfoResponse == SessionInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (sessionInfoResponse.hasSessionInfo()) {
                    mergeSessionInfo(sessionInfoResponse.getSessionInfo());
                }
                if (sessionInfoResponse.hasStatus()) {
                    setStatus(sessionInfoResponse.getStatus());
                }
                mergeUnknownFields(sessionInfoResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SessionInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SessionInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SessionInfoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SessionInfoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SessionInfoResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SessionInfoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SessionInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SessionInfoResponse parseFrom(InputStream inputStream) {
            return (SessionInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SessionInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionInfoResponse parseFrom(CodedInputStream codedInputStream) {
            return (SessionInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShotListResponse extends GeneratedMessageV3 implements ShotListResponseOrBuilder {
        private static final ShotListResponse DEFAULT_INSTANCE = new ShotListResponse();

        @Deprecated
        public static final Parser<ShotListResponse> PARSER = new AbstractParser<ShotListResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponse.1
            @Override // com.google.protobuf.Parser
            public ShotListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShotListResponse.newBuilder();
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
        public static final int SHOT_LIST_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<ShotMessage> shotList_;
        private int status_;

        private ShotListResponse() {
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.shotList_ = Collections.EMPTY_LIST;
            this.status_ = 0;
        }

        public static ShotListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListResponse_descriptor;
        }

        public static Builder newBuilder(ShotListResponse shotListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shotListResponse);
        }

        public static ShotListResponse parseDelimitedFrom(InputStream inputStream) {
            return (ShotListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShotListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShotListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShotListResponse)) {
                return super.equals(obj);
            }
            ShotListResponse shotListResponse = (ShotListResponse) obj;
            if (getShotListList().equals(shotListResponse.getShotListList()) && hasStatus() == shotListResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == shotListResponse.status_) && getUnknownFields().equals(shotListResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShotListResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = 0;
            for (int i15 = 0; i15 < this.shotList_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(1, this.shotList_.get(i15));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
        public ShotMessage getShotList(int i14) {
            return this.shotList_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
        public int getShotListCount() {
            return this.shotList_.size();
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
        public List<ShotMessage> getShotListList() {
            return this.shotList_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
        public ShotMessageOrBuilder getShotListOrBuilder(int i14) {
            return this.shotList_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
        public List<? extends ShotMessageOrBuilder> getShotListOrBuilderList() {
            return this.shotList_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
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
            if (getShotListCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShotListList().hashCode();
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotListResponse.class, Builder.class);
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
            return new ShotListResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.shotList_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.shotList_.get(i14));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShotListResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> shotListBuilder_;
            private List<ShotMessage> shotList_;
            private int status_;

            private Builder() {
                this.shotList_ = Collections.EMPTY_LIST;
                this.status_ = 0;
            }

            private void buildPartial0(ShotListResponse shotListResponse) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    shotListResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                shotListResponse.bitField0_ = i14 | shotListResponse.bitField0_;
            }

            private void buildPartialRepeatedFields(ShotListResponse shotListResponse) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    shotListResponse.shotList_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.shotList_ = Collections.unmodifiableList(this.shotList_);
                    this.bitField0_ &= -2;
                }
                shotListResponse.shotList_ = this.shotList_;
            }

            private void ensureShotListIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.shotList_ = new ArrayList(this.shotList_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> getShotListFieldBuilder() {
                if (this.shotListBuilder_ == null) {
                    this.shotListBuilder_ = new RepeatedFieldBuilderV3<>(this.shotList_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.shotList_ = null;
                }
                return this.shotListBuilder_;
            }

            public Builder addAllShotList(Iterable<? extends ShotMessage> iterable) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureShotListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.shotList_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addShotList(ShotMessage.Builder builder) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureShotListIsMutable();
                this.shotList_.add(builder.build());
                onChanged();
                return this;
            }

            public ShotMessage.Builder addShotListBuilder() {
                return (ShotMessage.Builder) getShotListFieldBuilder().addBuilder(ShotMessage.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotListResponse build() {
                ShotListResponse shotListResponseBuildPartial = buildPartial();
                if (shotListResponseBuildPartial.isInitialized()) {
                    return shotListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shotListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotListResponse buildPartial() {
                ShotListResponse shotListResponse = new ShotListResponse(this);
                buildPartialRepeatedFields(shotListResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(shotListResponse);
                }
                onBuilt();
                return shotListResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.shotList_ = Collections.EMPTY_LIST;
                } else {
                    this.shotList_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearShotList() {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.shotList_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -3;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
            public ShotMessage getShotList(int i14) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shotList_.get(i14) : (ShotMessage) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ShotMessage.Builder getShotListBuilder(int i14) {
                return (ShotMessage.Builder) getShotListFieldBuilder().getBuilder(i14);
            }

            public List<ShotMessage.Builder> getShotListBuilderList() {
                return getShotListFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
            public int getShotListCount() {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shotList_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
            public List<ShotMessage> getShotListList() {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.shotList_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
            public ShotMessageOrBuilder getShotListOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shotList_.get(i14) : (ShotMessageOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
            public List<? extends ShotMessageOrBuilder> getShotListOrBuilderList() {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.shotList_);
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotListResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotListResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ShotListResponse shotListResponse) {
                if (shotListResponse == ShotListResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.shotListBuilder_ == null) {
                    if (!shotListResponse.shotList_.isEmpty()) {
                        if (this.shotList_.isEmpty()) {
                            this.shotList_ = shotListResponse.shotList_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureShotListIsMutable();
                            this.shotList_.addAll(shotListResponse.shotList_);
                        }
                        onChanged();
                    }
                } else if (!shotListResponse.shotList_.isEmpty()) {
                    boolean zIsEmpty = this.shotListBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.shotListBuilder_ = null;
                        this.shotList_ = shotListResponse.shotList_;
                        this.bitField0_ &= -2;
                        this.shotListBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getShotListFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(shotListResponse.shotList_);
                    }
                }
                if (shotListResponse.hasStatus()) {
                    setStatus(shotListResponse.getStatus());
                }
                mergeUnknownFields(shotListResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeShotList(int i14) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureShotListIsMutable();
                this.shotList_.remove(i14);
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

            public Builder setShotList(int i14, ShotMessage.Builder builder) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureShotListIsMutable();
                this.shotList_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 2;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ShotListResponse getDefaultInstanceForType() {
                return ShotListResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shotList_ = Collections.EMPTY_LIST;
                this.status_ = 0;
            }

            public ShotMessage.Builder addShotListBuilder(int i14) {
                return (ShotMessage.Builder) getShotListFieldBuilder().addBuilder(i14, ShotMessage.getDefaultInstance());
            }

            public Builder addShotList(int i14, ShotMessage shotMessage) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shotMessage.getClass();
                    ensureShotListIsMutable();
                    this.shotList_.add(i14, shotMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, shotMessage);
                return this;
            }

            public Builder setShotList(int i14, ShotMessage shotMessage) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shotMessage.getClass();
                    ensureShotListIsMutable();
                    this.shotList_.set(i14, shotMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, shotMessage);
                return this;
            }

            public Builder addShotList(ShotMessage shotMessage) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shotMessage.getClass();
                    ensureShotListIsMutable();
                    this.shotList_.add(shotMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(shotMessage);
                return this;
            }

            public Builder addShotList(int i14, ShotMessage.Builder builder) {
                RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureShotListIsMutable();
                    this.shotList_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShotListResponse) {
                    return mergeFrom((ShotListResponse) message);
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
                                if (tag == 10) {
                                    ShotMessage shotMessage = (ShotMessage) codedInputStream.readMessage(ShotMessage.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ShotMessage, ShotMessage.Builder, ShotMessageOrBuilder> repeatedFieldBuilderV3 = this.shotListBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureShotListIsMutable();
                                        this.shotList_.add(shotMessage);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(shotMessage);
                                    }
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 2;
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
        public ShotListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShotListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShotListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShotListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShotListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShotListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShotListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShotListResponse parseFrom(InputStream inputStream) {
            return (ShotListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ShotListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShotListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShotListResponse parseFrom(CodedInputStream codedInputStream) {
            return (ShotListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ ShotListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ShotListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShotMessage extends GeneratedMessageV3 implements ShotMessageOrBuilder {
        private static final ShotMessage DEFAULT_INSTANCE = new ShotMessage();

        @Deprecated
        public static final Parser<ShotMessage> PARSER = new AbstractParser<ShotMessage>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.ShotMessage.1
            @Override // com.google.protobuf.Parser
            public ShotMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShotMessage.newBuilder();
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
        public static final int SHOT_NUM_FIELD_NUMBER = 4;
        public static final int SHOT_TIMESTAMP_FIELD_NUMBER = 1;
        public static final int SHOT_VELOCITY_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int shotNum_;
        private int shotTimestamp_;
        private float shotVelocity_;
        private int status_;

        private ShotMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.shotTimestamp_ = 0;
            this.shotVelocity_ = 0.0f;
            this.status_ = 0;
            this.shotNum_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShotMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotMessage_descriptor;
        }

        public static Builder newBuilder(ShotMessage shotMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shotMessage);
        }

        public static ShotMessage parseDelimitedFrom(InputStream inputStream) {
            return (ShotMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShotMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShotMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShotMessage)) {
                return super.equals(obj);
            }
            ShotMessage shotMessage = (ShotMessage) obj;
            if (hasShotTimestamp() != shotMessage.hasShotTimestamp()) {
                return false;
            }
            if ((hasShotTimestamp() && getShotTimestamp() != shotMessage.getShotTimestamp()) || hasShotVelocity() != shotMessage.hasShotVelocity()) {
                return false;
            }
            if ((hasShotVelocity() && Float.floatToIntBits(getShotVelocity()) != Float.floatToIntBits(shotMessage.getShotVelocity())) || hasStatus() != shotMessage.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == shotMessage.status_) && hasShotNum() == shotMessage.hasShotNum()) {
                return (!hasShotNum() || getShotNum() == shotMessage.getShotNum()) && getUnknownFields().equals(shotMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShotMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.shotTimestamp_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(2, this.shotVelocity_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(3, this.status_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.shotNum_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
        public int getShotNum() {
            return this.shotNum_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
        public int getShotTimestamp() {
            return this.shotTimestamp_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
        public float getShotVelocity() {
            return this.shotVelocity_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
        public ShotStatus getStatus() {
            ShotStatus shotStatusForNumber = ShotStatus.forNumber(this.status_);
            return shotStatusForNumber == null ? ShotStatus.NORMAL : shotStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
        public boolean hasShotNum() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
        public boolean hasShotTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
        public boolean hasShotVelocity() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasShotTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShotTimestamp();
            }
            if (hasShotVelocity()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getShotVelocity());
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.status_;
            }
            if (hasShotNum()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getShotNum();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotMessage.class, Builder.class);
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
            return new ShotMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.shotTimestamp_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.shotVelocity_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.status_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.shotNum_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShotMessageOrBuilder {
            private int bitField0_;
            private int shotNum_;
            private int shotTimestamp_;
            private float shotVelocity_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ShotMessage shotMessage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    shotMessage.shotTimestamp_ = this.shotTimestamp_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    shotMessage.shotVelocity_ = this.shotVelocity_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    shotMessage.status_ = this.status_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    shotMessage.shotNum_ = this.shotNum_;
                    i14 |= 8;
                }
                shotMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotMessage build() {
                ShotMessage shotMessageBuildPartial = buildPartial();
                if (shotMessageBuildPartial.isInitialized()) {
                    return shotMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shotMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotMessage buildPartial() {
                ShotMessage shotMessage = new ShotMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shotMessage);
                }
                onBuilt();
                return shotMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.shotTimestamp_ = 0;
                this.shotVelocity_ = 0.0f;
                this.status_ = 0;
                this.shotNum_ = 0;
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

            public Builder clearShotNum() {
                this.bitField0_ &= -9;
                this.shotNum_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShotTimestamp() {
                this.bitField0_ &= -2;
                this.shotTimestamp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShotVelocity() {
                this.bitField0_ &= -3;
                this.shotVelocity_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -5;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
            public int getShotNum() {
                return this.shotNum_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
            public int getShotTimestamp() {
                return this.shotTimestamp_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
            public float getShotVelocity() {
                return this.shotVelocity_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
            public ShotStatus getStatus() {
                ShotStatus shotStatusForNumber = ShotStatus.forNumber(this.status_);
                return shotStatusForNumber == null ? ShotStatus.NORMAL : shotStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
            public boolean hasShotNum() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
            public boolean hasShotTimestamp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
            public boolean hasShotVelocity() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.ShotMessageOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_ShotMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotMessage.class, Builder.class);
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
                                    this.shotTimestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.shotVelocity_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ShotStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    this.shotNum_ = codedInputStream.readUInt32();
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

            public Builder setShotNum(int i14) {
                this.shotNum_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setShotTimestamp(int i14) {
                this.shotTimestamp_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setShotVelocity(float f14) {
                this.shotVelocity_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStatus(ShotStatus shotStatus) {
                shotStatus.getClass();
                this.bitField0_ |= 4;
                this.status_ = shotStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ShotMessage getDefaultInstanceForType() {
                return ShotMessage.getDefaultInstance();
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
                if (message instanceof ShotMessage) {
                    return mergeFrom((ShotMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShotMessage shotMessage) {
                if (shotMessage == ShotMessage.getDefaultInstance()) {
                    return this;
                }
                if (shotMessage.hasShotTimestamp()) {
                    setShotTimestamp(shotMessage.getShotTimestamp());
                }
                if (shotMessage.hasShotVelocity()) {
                    setShotVelocity(shotMessage.getShotVelocity());
                }
                if (shotMessage.hasStatus()) {
                    setStatus(shotMessage.getStatus());
                }
                if (shotMessage.hasShotNum()) {
                    setShotNum(shotMessage.getShotNum());
                }
                mergeUnknownFields(shotMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShotMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShotMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShotMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShotMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShotMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShotMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShotMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShotMessage parseFrom(InputStream inputStream) {
            return (ShotMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShotMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ ShotMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ShotMessage() {
            this.shotTimestamp_ = 0;
            this.shotVelocity_ = 0.0f;
            this.shotNum_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static ShotMessage parseFrom(CodedInputStream codedInputStream) {
            return (ShotMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShotMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ShotStatus implements ProtocolMessageEnum {
            NORMAL(0),
            EXCLUDED(1),
            DELETED(2);

            public static final int DELETED_VALUE = 2;
            public static final int EXCLUDED_VALUE = 1;
            public static final int NORMAL_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ShotStatus> internalValueMap = new Internal.EnumLiteMap<ShotStatus>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.ShotMessage.ShotStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ShotStatus findValueByNumber(int i14) {
                    return ShotStatus.forNumber(i14);
                }
            };
            private static final ShotStatus[] VALUES = values();

            ShotStatus(int i14) {
                this.value = i14;
            }

            public static ShotStatus forNumber(int i14) {
                if (i14 == 0) {
                    return NORMAL;
                }
                if (i14 == 1) {
                    return EXCLUDED;
                }
                if (i14 != 2) {
                    return null;
                }
                return DELETED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ShotMessage.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ShotStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ShotStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ShotStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class StartSessionRequest extends GeneratedMessageV3 implements StartSessionRequestOrBuilder {
        public static final int GRAIN_WEIGHT_FIELD_NUMBER = 5;
        public static final int PROJECTILE_TYPE_FIELD_NUMBER = 1;
        public static final int SESSIONUUID_FIELD_NUMBER = 3;
        public static final int SESSION_TITLE_FIELD_NUMBER = 4;
        public static final int VELOCITY_RANGE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private float grainWeight_;
        private byte memoizedIsInitialized;
        private int projectileType_;
        private volatile Object sessionTitle_;
        private ByteString sessionUUID_;
        private int velocityRange_;
        private static final StartSessionRequest DEFAULT_INSTANCE = new StartSessionRequest();

        @Deprecated
        public static final Parser<StartSessionRequest> PARSER = new AbstractParser<StartSessionRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequest.1
            @Override // com.google.protobuf.Parser
            public StartSessionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartSessionRequest.newBuilder();
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

        private StartSessionRequest() {
            this.projectileType_ = 0;
            this.velocityRange_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.sessionUUID_ = byteString;
            this.sessionTitle_ = "";
            this.grainWeight_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.projectileType_ = 0;
            this.velocityRange_ = 0;
            this.sessionUUID_ = byteString;
            this.sessionTitle_ = "";
        }

        public static StartSessionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_descriptor;
        }

        public static Builder newBuilder(StartSessionRequest startSessionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startSessionRequest);
        }

        public static StartSessionRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartSessionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartSessionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartSessionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartSessionRequest)) {
                return super.equals(obj);
            }
            StartSessionRequest startSessionRequest = (StartSessionRequest) obj;
            if (hasProjectileType() != startSessionRequest.hasProjectileType()) {
                return false;
            }
            if ((hasProjectileType() && this.projectileType_ != startSessionRequest.projectileType_) || hasVelocityRange() != startSessionRequest.hasVelocityRange()) {
                return false;
            }
            if ((hasVelocityRange() && this.velocityRange_ != startSessionRequest.velocityRange_) || hasSessionUUID() != startSessionRequest.hasSessionUUID()) {
                return false;
            }
            if ((hasSessionUUID() && !getSessionUUID().equals(startSessionRequest.getSessionUUID())) || hasSessionTitle() != startSessionRequest.hasSessionTitle()) {
                return false;
            }
            if ((!hasSessionTitle() || getSessionTitle().equals(startSessionRequest.getSessionTitle())) && hasGrainWeight() == startSessionRequest.hasGrainWeight()) {
                return (!hasGrainWeight() || Float.floatToIntBits(getGrainWeight()) == Float.floatToIntBits(startSessionRequest.getGrainWeight())) && getUnknownFields().equals(startSessionRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public float getGrainWeight() {
            return this.grainWeight_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartSessionRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public ProjectileType getProjectileType() {
            ProjectileType projectileTypeForNumber = ProjectileType.forNumber(this.projectileType_);
            return projectileTypeForNumber == null ? ProjectileType.ARROW : projectileTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.projectileType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.velocityRange_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.sessionUUID_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.sessionTitle_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(5, this.grainWeight_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public String getSessionTitle() {
            Object obj = this.sessionTitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sessionTitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public ByteString getSessionTitleBytes() {
            Object obj = this.sessionTitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionTitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public ByteString getSessionUUID() {
            return this.sessionUUID_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public VelocityRange getVelocityRange() {
            VelocityRange velocityRangeForNumber = VelocityRange.forNumber(this.velocityRange_);
            return velocityRangeForNumber == null ? VelocityRange.LOW_RANGE : velocityRangeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public boolean hasGrainWeight() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public boolean hasProjectileType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public boolean hasSessionTitle() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public boolean hasSessionUUID() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
        public boolean hasVelocityRange() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasProjectileType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.projectileType_;
            }
            if (hasVelocityRange()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.velocityRange_;
            }
            if (hasSessionUUID()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSessionUUID().hashCode();
            }
            if (hasSessionTitle()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSessionTitle().hashCode();
            }
            if (hasGrainWeight()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getGrainWeight());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartSessionRequest.class, Builder.class);
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
            return new StartSessionRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.projectileType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.velocityRange_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.sessionUUID_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.sessionTitle_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.grainWeight_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartSessionRequestOrBuilder {
            private int bitField0_;
            private float grainWeight_;
            private int projectileType_;
            private Object sessionTitle_;
            private ByteString sessionUUID_;
            private int velocityRange_;

            private Builder() {
                this.projectileType_ = 0;
                this.velocityRange_ = 0;
                this.sessionUUID_ = ByteString.EMPTY;
                this.sessionTitle_ = "";
            }

            private void buildPartial0(StartSessionRequest startSessionRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    startSessionRequest.projectileType_ = this.projectileType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    startSessionRequest.velocityRange_ = this.velocityRange_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    startSessionRequest.sessionUUID_ = this.sessionUUID_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    startSessionRequest.sessionTitle_ = this.sessionTitle_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    startSessionRequest.grainWeight_ = this.grainWeight_;
                    i14 |= 16;
                }
                startSessionRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartSessionRequest build() {
                StartSessionRequest startSessionRequestBuildPartial = buildPartial();
                if (startSessionRequestBuildPartial.isInitialized()) {
                    return startSessionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startSessionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartSessionRequest buildPartial() {
                StartSessionRequest startSessionRequest = new StartSessionRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startSessionRequest);
                }
                onBuilt();
                return startSessionRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.projectileType_ = 0;
                this.velocityRange_ = 0;
                this.sessionUUID_ = ByteString.EMPTY;
                this.sessionTitle_ = "";
                this.grainWeight_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGrainWeight() {
                this.bitField0_ &= -17;
                this.grainWeight_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearProjectileType() {
                this.bitField0_ &= -2;
                this.projectileType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionTitle() {
                this.sessionTitle_ = StartSessionRequest.getDefaultInstance().getSessionTitle();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearSessionUUID() {
                this.bitField0_ &= -5;
                this.sessionUUID_ = StartSessionRequest.getDefaultInstance().getSessionUUID();
                onChanged();
                return this;
            }

            public Builder clearVelocityRange() {
                this.bitField0_ &= -3;
                this.velocityRange_ = 0;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public float getGrainWeight() {
                return this.grainWeight_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public ProjectileType getProjectileType() {
                ProjectileType projectileTypeForNumber = ProjectileType.forNumber(this.projectileType_);
                return projectileTypeForNumber == null ? ProjectileType.ARROW : projectileTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public String getSessionTitle() {
                Object obj = this.sessionTitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sessionTitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public ByteString getSessionTitleBytes() {
                Object obj = this.sessionTitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionTitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public ByteString getSessionUUID() {
                return this.sessionUUID_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public VelocityRange getVelocityRange() {
                VelocityRange velocityRangeForNumber = VelocityRange.forNumber(this.velocityRange_);
                return velocityRangeForNumber == null ? VelocityRange.LOW_RANGE : velocityRangeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public boolean hasGrainWeight() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public boolean hasProjectileType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public boolean hasSessionTitle() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public boolean hasSessionUUID() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequestOrBuilder
            public boolean hasVelocityRange() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartSessionRequest.class, Builder.class);
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
                                    if (ProjectileType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.projectileType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (VelocityRange.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.velocityRange_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    this.sessionUUID_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.sessionTitle_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.grainWeight_ = codedInputStream.readFloat();
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

            public Builder setGrainWeight(float f14) {
                this.grainWeight_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setProjectileType(ProjectileType projectileType) {
                projectileType.getClass();
                this.bitField0_ |= 1;
                this.projectileType_ = projectileType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionTitle(String str) {
                str.getClass();
                this.sessionTitle_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSessionTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.sessionTitle_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSessionUUID(ByteString byteString) {
                byteString.getClass();
                this.sessionUUID_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVelocityRange(VelocityRange velocityRange) {
                velocityRange.getClass();
                this.bitField0_ |= 2;
                this.velocityRange_ = velocityRange.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StartSessionRequest getDefaultInstanceForType() {
                return StartSessionRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.projectileType_ = 0;
                this.velocityRange_ = 0;
                this.sessionUUID_ = ByteString.EMPTY;
                this.sessionTitle_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartSessionRequest) {
                    return mergeFrom((StartSessionRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartSessionRequest startSessionRequest) {
                if (startSessionRequest == StartSessionRequest.getDefaultInstance()) {
                    return this;
                }
                if (startSessionRequest.hasProjectileType()) {
                    setProjectileType(startSessionRequest.getProjectileType());
                }
                if (startSessionRequest.hasVelocityRange()) {
                    setVelocityRange(startSessionRequest.getVelocityRange());
                }
                if (startSessionRequest.hasSessionUUID()) {
                    setSessionUUID(startSessionRequest.getSessionUUID());
                }
                if (startSessionRequest.hasSessionTitle()) {
                    this.sessionTitle_ = startSessionRequest.sessionTitle_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (startSessionRequest.hasGrainWeight()) {
                    setGrainWeight(startSessionRequest.getGrainWeight());
                }
                mergeUnknownFields(startSessionRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartSessionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartSessionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartSessionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartSessionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StartSessionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartSessionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartSessionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartSessionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartSessionRequest parseFrom(InputStream inputStream) {
            return (StartSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartSessionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartSessionRequest parseFrom(CodedInputStream codedInputStream) {
            return (StartSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartSessionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum VelocityRange implements ProtocolMessageEnum {
            LOW_RANGE(0),
            MID_RANGE(1),
            HIGH_RANGE(2);

            public static final int HIGH_RANGE_VALUE = 2;
            public static final int LOW_RANGE_VALUE = 0;
            public static final int MID_RANGE_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<VelocityRange> internalValueMap = new Internal.EnumLiteMap<VelocityRange>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.StartSessionRequest.VelocityRange.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public VelocityRange findValueByNumber(int i14) {
                    return VelocityRange.forNumber(i14);
                }
            };
            private static final VelocityRange[] VALUES = values();

            VelocityRange(int i14) {
                this.value = i14;
            }

            public static VelocityRange forNumber(int i14) {
                if (i14 == 0) {
                    return LOW_RANGE;
                }
                if (i14 == 1) {
                    return MID_RANGE;
                }
                if (i14 != 2) {
                    return null;
                }
                return HIGH_RANGE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StartSessionRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<VelocityRange> internalGetValueMap() {
                return internalValueMap;
            }

            public static VelocityRange valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static VelocityRange valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private StartSessionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.projectileType_ = 0;
            this.velocityRange_ = 0;
            this.sessionUUID_ = ByteString.EMPTY;
            this.sessionTitle_ = "";
            this.grainWeight_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ StartSessionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class StartSessionResponse extends GeneratedMessageV3 implements StartSessionResponseOrBuilder {
        private static final StartSessionResponse DEFAULT_INSTANCE = new StartSessionResponse();

        @Deprecated
        public static final Parser<StartSessionResponse> PARSER = new AbstractParser<StartSessionResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponse.1
            @Override // com.google.protobuf.Parser
            public StartSessionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartSessionResponse.newBuilder();
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
        public static final int SESSIONUUID_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString sessionUUID_;
        private int status_;

        private StartSessionResponse() {
            this.status_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.sessionUUID_ = byteString;
        }

        public static StartSessionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_descriptor;
        }

        public static Builder newBuilder(StartSessionResponse startSessionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startSessionResponse);
        }

        public static StartSessionResponse parseDelimitedFrom(InputStream inputStream) {
            return (StartSessionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartSessionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartSessionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartSessionResponse)) {
                return super.equals(obj);
            }
            StartSessionResponse startSessionResponse = (StartSessionResponse) obj;
            if (hasStatus() != startSessionResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == startSessionResponse.status_) && hasSessionUUID() == startSessionResponse.hasSessionUUID()) {
                return (!hasSessionUUID() || getSessionUUID().equals(startSessionResponse.getSessionUUID())) && getUnknownFields().equals(startSessionResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartSessionResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.sessionUUID_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponseOrBuilder
        public ByteString getSessionUUID() {
            return this.sessionUUID_;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponseOrBuilder
        public boolean hasSessionUUID() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponseOrBuilder
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
            if (hasSessionUUID()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSessionUUID().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartSessionResponse.class, Builder.class);
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
            return new StartSessionResponse();
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
                codedOutputStream.writeBytes(2, this.sessionUUID_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartSessionResponseOrBuilder {
            private int bitField0_;
            private ByteString sessionUUID_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.sessionUUID_ = ByteString.EMPTY;
            }

            private void buildPartial0(StartSessionResponse startSessionResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    startSessionResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    startSessionResponse.sessionUUID_ = this.sessionUUID_;
                    i14 |= 2;
                }
                startSessionResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartSessionResponse build() {
                StartSessionResponse startSessionResponseBuildPartial = buildPartial();
                if (startSessionResponseBuildPartial.isInitialized()) {
                    return startSessionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startSessionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartSessionResponse buildPartial() {
                StartSessionResponse startSessionResponse = new StartSessionResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startSessionResponse);
                }
                onBuilt();
                return startSessionResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.sessionUUID_ = ByteString.EMPTY;
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

            public Builder clearSessionUUID() {
                this.bitField0_ &= -3;
                this.sessionUUID_ = StartSessionResponse.getDefaultInstance().getSessionUUID();
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponseOrBuilder
            public ByteString getSessionUUID() {
                return this.sessionUUID_;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponseOrBuilder
            public boolean hasSessionUUID() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StartSessionResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StartSessionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartSessionResponse.class, Builder.class);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.sessionUUID_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionUUID(ByteString byteString) {
                byteString.getClass();
                this.sessionUUID_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
            public StartSessionResponse getDefaultInstanceForType() {
                return StartSessionResponse.getDefaultInstance();
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
                this.sessionUUID_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartSessionResponse) {
                    return mergeFrom((StartSessionResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartSessionResponse startSessionResponse) {
                if (startSessionResponse == StartSessionResponse.getDefaultInstance()) {
                    return this;
                }
                if (startSessionResponse.hasStatus()) {
                    setStatus(startSessionResponse.getStatus());
                }
                if (startSessionResponse.hasSessionUUID()) {
                    setSessionUUID(startSessionResponse.getSessionUUID());
                }
                mergeUnknownFields(startSessionResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartSessionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartSessionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartSessionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartSessionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StartSessionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartSessionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartSessionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartSessionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartSessionResponse parseFrom(InputStream inputStream) {
            return (StartSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private StartSessionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.sessionUUID_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartSessionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartSessionResponse parseFrom(CodedInputStream codedInputStream) {
            return (StartSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ StartSessionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartSessionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StopSessionResponse extends GeneratedMessageV3 implements StopSessionResponseOrBuilder {
        private static final StopSessionResponse DEFAULT_INSTANCE = new StopSessionResponse();

        @Deprecated
        public static final Parser<StopSessionResponse> PARSER = new AbstractParser<StopSessionResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.StopSessionResponse.1
            @Override // com.google.protobuf.Parser
            public StopSessionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopSessionResponse.newBuilder();
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

        private StopSessionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopSessionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_descriptor;
        }

        public static Builder newBuilder(StopSessionResponse stopSessionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopSessionResponse);
        }

        public static StopSessionResponse parseDelimitedFrom(InputStream inputStream) {
            return (StopSessionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopSessionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopSessionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StopSessionResponse)) {
                return super.equals(obj);
            }
            StopSessionResponse stopSessionResponse = (StopSessionResponse) obj;
            if (hasStatus() != stopSessionResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == stopSessionResponse.status_) && getUnknownFields().equals(stopSessionResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopSessionResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StopSessionResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.StopSessionResponseOrBuilder
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StopSessionResponse.class, Builder.class);
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
            return new StopSessionResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopSessionResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(StopSessionResponse stopSessionResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stopSessionResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                stopSessionResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopSessionResponse build() {
                StopSessionResponse stopSessionResponseBuildPartial = buildPartial();
                if (stopSessionResponseBuildPartial.isInitialized()) {
                    return stopSessionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopSessionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopSessionResponse buildPartial() {
                StopSessionResponse stopSessionResponse = new StopSessionResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stopSessionResponse);
                }
                onBuilt();
                return stopSessionResponse;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StopSessionResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.StopSessionResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_StopSessionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StopSessionResponse.class, Builder.class);
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
            public StopSessionResponse getDefaultInstanceForType() {
                return StopSessionResponse.getDefaultInstance();
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
                if (message instanceof StopSessionResponse) {
                    return mergeFrom((StopSessionResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StopSessionResponse stopSessionResponse) {
                if (stopSessionResponse == StopSessionResponse.getDefaultInstance()) {
                    return this;
                }
                if (stopSessionResponse.hasStatus()) {
                    setStatus(stopSessionResponse.getStatus());
                }
                mergeUnknownFields(stopSessionResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopSessionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StopSessionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopSessionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopSessionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StopSessionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StopSessionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StopSessionResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopSessionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopSessionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopSessionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopSessionResponse parseFrom(InputStream inputStream) {
            return (StopSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopSessionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopSessionResponse parseFrom(CodedInputStream codedInputStream) {
            return (StopSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopSessionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TitleChangeRequest extends GeneratedMessageV3 implements TitleChangeRequestOrBuilder {
        private static final TitleChangeRequest DEFAULT_INSTANCE = new TitleChangeRequest();

        @Deprecated
        public static final Parser<TitleChangeRequest> PARSER = new AbstractParser<TitleChangeRequest>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeRequest.1
            @Override // com.google.protobuf.Parser
            public TitleChangeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TitleChangeRequest.newBuilder();
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
        public static final int TITLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object title_;

        private TitleChangeRequest() {
            this.title_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
        }

        public static TitleChangeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_descriptor;
        }

        public static Builder newBuilder(TitleChangeRequest titleChangeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleChangeRequest);
        }

        public static TitleChangeRequest parseDelimitedFrom(InputStream inputStream) {
            return (TitleChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TitleChangeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TitleChangeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TitleChangeRequest)) {
                return super.equals(obj);
            }
            TitleChangeRequest titleChangeRequest = (TitleChangeRequest) obj;
            if (hasTitle() != titleChangeRequest.hasTitle()) {
                return false;
            }
            return (!hasTitle() || getTitle().equals(titleChangeRequest.getTitle())) && getUnknownFields().equals(titleChangeRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TitleChangeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.title_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeRequestOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.title_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeRequestOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeRequestOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTitle()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTitle().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TitleChangeRequest.class, Builder.class);
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
            return new TitleChangeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.title_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TitleChangeRequestOrBuilder {
            private int bitField0_;
            private Object title_;

            private Builder() {
                this.title_ = "";
            }

            private void buildPartial0(TitleChangeRequest titleChangeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    titleChangeRequest.title_ = this.title_;
                } else {
                    i14 = 0;
                }
                titleChangeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TitleChangeRequest build() {
                TitleChangeRequest titleChangeRequestBuildPartial = buildPartial();
                if (titleChangeRequestBuildPartial.isInitialized()) {
                    return titleChangeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleChangeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TitleChangeRequest buildPartial() {
                TitleChangeRequest titleChangeRequest = new TitleChangeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(titleChangeRequest);
                }
                onBuilt();
                return titleChangeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.title_ = "";
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

            public Builder clearTitle() {
                this.title_ = TitleChangeRequest.getDefaultInstance().getTitle();
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeRequestOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.title_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeRequestOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeRequestOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TitleChangeRequest.class, Builder.class);
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
                                    this.title_ = codedInputStream.readBytes();
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

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.title_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TitleChangeRequest getDefaultInstanceForType() {
                return TitleChangeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TitleChangeRequest) {
                    return mergeFrom((TitleChangeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TitleChangeRequest titleChangeRequest) {
                if (titleChangeRequest == TitleChangeRequest.getDefaultInstance()) {
                    return this;
                }
                if (titleChangeRequest.hasTitle()) {
                    this.title_ = titleChangeRequest.title_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(titleChangeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TitleChangeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TitleChangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TitleChangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TitleChangeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TitleChangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TitleChangeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private TitleChangeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.title_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TitleChangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TitleChangeRequest parseFrom(InputStream inputStream) {
            return (TitleChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ TitleChangeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TitleChangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TitleChangeRequest parseFrom(CodedInputStream codedInputStream) {
            return (TitleChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TitleChangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TitleChangeResponse extends GeneratedMessageV3 implements TitleChangeResponseOrBuilder {
        private static final TitleChangeResponse DEFAULT_INSTANCE = new TitleChangeResponse();

        @Deprecated
        public static final Parser<TitleChangeResponse> PARSER = new AbstractParser<TitleChangeResponse>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeResponse.1
            @Override // com.google.protobuf.Parser
            public TitleChangeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TitleChangeResponse.newBuilder();
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

        private TitleChangeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TitleChangeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_descriptor;
        }

        public static Builder newBuilder(TitleChangeResponse titleChangeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleChangeResponse);
        }

        public static TitleChangeResponse parseDelimitedFrom(InputStream inputStream) {
            return (TitleChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TitleChangeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TitleChangeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TitleChangeResponse)) {
                return super.equals(obj);
            }
            TitleChangeResponse titleChangeResponse = (TitleChangeResponse) obj;
            if (hasStatus() != titleChangeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == titleChangeResponse.status_) && getUnknownFields().equals(titleChangeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TitleChangeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeResponseOrBuilder
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
            return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TitleChangeResponse.class, Builder.class);
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
            return new TitleChangeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TitleChangeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(TitleChangeResponse titleChangeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    titleChangeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                titleChangeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TitleChangeResponse build() {
                TitleChangeResponse titleChangeResponseBuildPartial = buildPartial();
                if (titleChangeResponseBuildPartial.isInitialized()) {
                    return titleChangeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleChangeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TitleChangeResponse buildPartial() {
                TitleChangeResponse titleChangeResponse = new TitleChangeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(titleChangeResponse);
                }
                onBuilt();
                return titleChangeResponse;
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
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroChronographProto.TitleChangeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroChronographProto.internal_static_GDI_Proto_XeroChronograph_TitleChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TitleChangeResponse.class, Builder.class);
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
            public TitleChangeResponse getDefaultInstanceForType() {
                return TitleChangeResponse.getDefaultInstance();
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
                if (message instanceof TitleChangeResponse) {
                    return mergeFrom((TitleChangeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TitleChangeResponse titleChangeResponse) {
                if (titleChangeResponse == TitleChangeResponse.getDefaultInstance()) {
                    return this;
                }
                if (titleChangeResponse.hasStatus()) {
                    setStatus(titleChangeResponse.getStatus());
                }
                mergeUnknownFields(titleChangeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TitleChangeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TitleChangeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TitleChangeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ TitleChangeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TitleChangeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TitleChangeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TitleChangeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TitleChangeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TitleChangeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TitleChangeResponse parseFrom(InputStream inputStream) {
            return (TitleChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TitleChangeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TitleChangeResponse parseFrom(CodedInputStream codedInputStream) {
            return (TitleChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TitleChangeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TitleChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum EventAlertType implements ProtocolMessageEnum {
        SESSION_STARTED(0),
        SESSION_ENDED(1),
        SHOT_DELETED(2),
        SHOT_EXCLUDED(3),
        SHOT_DETECTED(4),
        RADAR_TIMEOUT(5);

        public static final int RADAR_TIMEOUT_VALUE = 5;
        public static final int SESSION_ENDED_VALUE = 1;
        public static final int SESSION_STARTED_VALUE = 0;
        public static final int SHOT_DELETED_VALUE = 2;
        public static final int SHOT_DETECTED_VALUE = 4;
        public static final int SHOT_EXCLUDED_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<EventAlertType> internalValueMap = new Internal.EnumLiteMap<EventAlertType>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.EventAlertType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public EventAlertType findValueByNumber(int i14) {
                return EventAlertType.forNumber(i14);
            }
        };
        private static final EventAlertType[] VALUES = values();

        EventAlertType(int i14) {
            this.value = i14;
        }

        public static EventAlertType forNumber(int i14) {
            if (i14 == 0) {
                return SESSION_STARTED;
            }
            if (i14 == 1) {
                return SESSION_ENDED;
            }
            if (i14 == 2) {
                return SHOT_DELETED;
            }
            if (i14 == 3) {
                return SHOT_EXCLUDED;
            }
            if (i14 == 4) {
                return SHOT_DETECTED;
            }
            if (i14 != 5) {
                return null;
            }
            return RADAR_TIMEOUT;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIXeroChronographProto.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<EventAlertType> internalGetValueMap() {
            return internalValueMap;
        }

        public static EventAlertType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static EventAlertType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum ProjectileType implements ProtocolMessageEnum {
        ARROW(0),
        RIFLE(1),
        PISTOL(2),
        SHOTGUN(3),
        AIR_RIFLE(4),
        OTHER(5);

        public static final int AIR_RIFLE_VALUE = 4;
        public static final int ARROW_VALUE = 0;
        public static final int OTHER_VALUE = 5;
        public static final int PISTOL_VALUE = 2;
        public static final int RIFLE_VALUE = 1;
        public static final int SHOTGUN_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<ProjectileType> internalValueMap = new Internal.EnumLiteMap<ProjectileType>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.ProjectileType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ProjectileType findValueByNumber(int i14) {
                return ProjectileType.forNumber(i14);
            }
        };
        private static final ProjectileType[] VALUES = values();

        ProjectileType(int i14) {
            this.value = i14;
        }

        public static ProjectileType forNumber(int i14) {
            if (i14 == 0) {
                return ARROW;
            }
            if (i14 == 1) {
                return RIFLE;
            }
            if (i14 == 2) {
                return PISTOL;
            }
            if (i14 == 3) {
                return SHOTGUN;
            }
            if (i14 == 4) {
                return AIR_RIFLE;
            }
            if (i14 != 5) {
                return null;
            }
            return OTHER;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIXeroChronographProto.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<ProjectileType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ProjectileType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ProjectileType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum ResponseStatus implements ProtocolMessageEnum {
        SUCCESS(0),
        SYNCING(1),
        FAILURE(2),
        DEVICE_NEEDS_FILE(3);

        public static final int DEVICE_NEEDS_FILE_VALUE = 3;
        public static final int FAILURE_VALUE = 2;
        public static final int SUCCESS_VALUE = 0;
        public static final int SYNCING_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIXeroChronographProto.ResponseStatus.1
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
                return SUCCESS;
            }
            if (i14 == 1) {
                return SYNCING;
            }
            if (i14 == 2) {
                return FAILURE;
            }
            if (i14 != 3) {
                return null;
            }
            return DEVICE_NEEDS_FILE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIXeroChronographProto.getDescriptor().getEnumTypes().get(0);
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
