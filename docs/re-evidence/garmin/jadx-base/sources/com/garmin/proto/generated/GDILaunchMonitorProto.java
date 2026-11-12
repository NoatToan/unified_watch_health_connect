package com.garmin.proto.generated;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes5.dex */
public final class GDILaunchMonitorProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016GDILaunchMonitor.proto\u0012\u0017GDI.Proto.LaunchMonitor\u001a\u0015GDIEventSharing.proto\"ó\u0007\n\u0007Service\u0012>\n\u000estatus_request\u0018\u0001 \u0001(\u000b2&.GDI.Proto.LaunchMonitor.StatusRequest\u0012@\n\u000fstatus_response\u0018\u0002 \u0001(\u000b2'.GDI.Proto.LaunchMonitor.StatusResponse\u0012?\n\u000fwake_up_request\u0018\u0003 \u0001(\u000b2&.GDI.Proto.LaunchMonitor.WakeUpRequest\u0012A\n\u0010wake_up_response\u0018\u0004 \u0001(\u000b2'.GDI.Proto.LaunchMonitor.WakeUpResponse\u0012:\n\ftilt_request\u0018\u0005 \u0001(\u000b2$.GDI.Proto.LaunchMonitor.TiltRequest\u0012<\n\rtilt_response\u0018\u0006 \u0001(\u000b2%.GDI.Proto.LaunchMonitor.TiltResponse\u0012T\n\u0016start_tilt_cal_request\u0018\u0007 \u0001(\u000b24.GDI.Proto.LaunchMonitor.StartTiltCalibrationRequest\u0012V\n\u0017start_tilt_cal_response\u0018\b \u0001(\u000b25.GDI.Proto.LaunchMonitor.StartTiltCalibrationResponse\u0012T\n\u0016reset_tilt_cal_request\u0018\t \u0001(\u000b24.GDI.Proto.LaunchMonitor.ResetTiltCalibrationRequest\u0012V\n\u0017reset_tilt_cal_response\u0018\n \u0001(\u000b25.GDI.Proto.LaunchMonitor.ResetTiltCalibrationResponse\u0012G\n\u0013shot_config_request\u0018\u000b \u0001(\u000b2*.GDI.Proto.LaunchMonitor.ShotConfigRequest\u0012I\n\u0014shot_config_response\u0018\f \u0001(\u000b2+.GDI.Proto.LaunchMonitor.ShotConfigResponse\u0012:\n\fmode_request\u0018\r \u0001(\u000b2$.GDI.Proto.LaunchMonitor.ModeRequest\u0012<\n\rmode_response\u0018\u000e \u0001(\u000b2%.GDI.Proto.LaunchMonitor.ModeResponse\"\u000f\n\rStatusRequest\"?\n\u000eStatusResponse\u0012-\n\u0005state\u0018\u0001 \u0001(\u000b2\u001e.GDI.Proto.LaunchMonitor.State\"\u000f\n\rWakeUpRequest\"\u009d\u0001\n\u000eWakeUpResponse\u0012F\n\u0006status\u0018\u0001 \u0001(\u000e26.GDI.Proto.LaunchMonitor.WakeUpResponse.ResponseStatus\"C\n\u000eResponseStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0011\n\rALREADY_AWAKE\u0010\u0001\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0002\"\r\n\u000bTiltRequest\";\n\fTiltResponse\u0012+\n\u0004tilt\u0018\u0001 \u0001(\u000b2\u001d.GDI.Proto.LaunchMonitor.Tilt\"\u001d\n\u001bStartTiltCalibrationRequest\"µ\u0001\n\u001cStartTiltCalibrationResponse\u0012W\n\u0006status\u0018\u0001 \u0001(\u000e2G.GDI.Proto.LaunchMonitor.StartTiltCalibrationResponse.CalibrationStatus\"<\n\u0011CalibrationStatus\u0012\u000b\n\u0007STARTED\u0010\u0000\u0012\u000f\n\u000bIN_PROGRESS\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\"3\n\u001bResetTiltCalibrationRequest\u0012\u0014\n\fshould_reset\u0018\u0001 \u0001(\b\"À\u0001\n\u001cResetTiltCalibrationResponse\u0012L\n\u0006status\u0018\u0001 \u0001(\u000e2<.GDI.Proto.LaunchMonitor.ResetTiltCalibrationResponse.Status\"R\n\u0006Status\u0012\r\n\tCAN_RESET\u0010\u0001\u0012\u0011\n\rALREADY_RESET\u0010\u0002\u0012\u0014\n\u0010RESET_SUCCESSFUL\u0010\u0003\u0012\u0010\n\fCANNOT_RESET\u0010\u0004\"t\n\u0011ShotConfigRequest\u0012\u0013\n\u000btemperature\u0018\u0001 \u0001(\u0002\u0012\u0010\n\bhumidity\u0018\u0002 \u0001(\u0002\u0012\u0010\n\baltitude\u0018\u0003 \u0001(\u0002\u0012\u0013\n\u000bair_density\u0018\u0004 \u0001(\u0002\u0012\u0011\n\ttee_range\u0018\u0005 \u0001(\u0002\"%\n\u0012ShotConfigResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\"\u008d\u0001\n\u000bModeRequest\u00127\n\u0004mode\u0018\u0001 \u0001(\u000e2).GDI.Proto.LaunchMonitor.ModeRequest.Mode\"E\n\u0004Mode\u0012\t\n\u0005RANGE\u0010\u0001\u0012\u000b\n\u0007PUTTING\u0010\u0002\u0012\u000f\n\u000bHOLEFINDING\u0010\u0003\u0012\u0014\n\u0010STIMPMEASUREMENT\u0010\u0004\"\u0083\u0001\n\fModeResponse\u0012<\n\u0006status\u0018\u0001 \u0001(\u000e2,.GDI.Proto.LaunchMonitor.ModeResponse.Status\"5\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0013\n\u000fALREADY_IN_MODE\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\"\u008c\u0003\n\fAlertDetails\u0012-\n\u0005state\u0018\u0001 \u0001(\u000b2\u001e.GDI.Proto.LaunchMonitor.State\u00121\n\u0007metrics\u0018\u0002 \u0001(\u000b2 .GDI.Proto.LaunchMonitor.Metrics\u0012-\n\u0005error\u0018\u0003 \u0001(\u000b2\u001e.GDI.Proto.LaunchMonitor.Error\u0012D\n\u0010tilt_calibration\u0018\u0004 \u0001(\u000b2*.GDI.Proto.LaunchMonitor.CalibrationStatus\u0012A\n\u0010hole_find_status\u0018\u0005 \u0001(\u000b2'.GDI.Proto.LaunchMonitor.HoleFindStatus2b\n\u0007details\u0012).GDI.Proto.EventSharing.AlertNotification\u0018é\u0007 \u0001(\u000b2%.GDI.Proto.LaunchMonitor.AlertDetails\"¨\u0001\n\u0005State\u00127\n\u0005state\u0018\u0001 \u0001(\u000e2(.GDI.Proto.LaunchMonitor.State.StateType\"f\n\tStateType\u0012\u000b\n\u0007STANDBY\u0010\u0000\u0012\u0015\n\u0011INTERFERENCE_TEST\u0010\u0001\u0012\u000b\n\u0007WAITING\u0010\u0002\u0012\r\n\tRECORDING\u0010\u0003\u0012\u000e\n\nPROCESSING\u0010\u0004\u0012\t\n\u0005ERROR\u0010\u0005\"¼\u0002\n\u0011CalibrationStatus\u0012E\n\u0006status\u0018\u0001 \u0001(\u000e25.GDI.Proto.LaunchMonitor.CalibrationStatus.StatusType\u0012L\n\u0006result\u0018\u0002 \u0001(\u000e2<.GDI.Proto.LaunchMonitor.CalibrationStatus.CalibrationResult\"T\n\nStatusType\u0012\r\n\tIN_BOUNDS\u0010\u0001\u0012\u001b\n\u0017RECALIBRATION_SUGGESTED\u0010\u0002\u0012\u001a\n\u0016RECALIBRATION_REQUIRED\u0010\u0003\"<\n\u0011CalibrationResult\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\t\n\u0005ERROR\u0010\u0001\u0012\u000f\n\u000bUNIT_MOVING\u0010\u0002\"¶\u0001\n\u000eHoleFindStatus\u0012B\n\u0006status\u0018\u0001 \u0001(\u000e22.GDI.Proto.LaunchMonitor.HoleFindStatus.StatusType\u0012\u001b\n\u0013tracking_percentage\u0018\u0002 \u0001(\u0002\"C\n\nStatusType\u0012\r\n\tSEARCHING\u0010\u0000\u0012\f\n\bTRACKING\u0010\u0001\u0012\t\n\u0005FOUND\u0010\u0002\u0012\r\n\tNOT_FOUND\u0010\u0003\"á\u0003\n\u0007Metrics\u0012\u000f\n\u0007shot_id\u0018\u0001 \u0001(\r\u0012<\n\tshot_type\u0018\u0002 \u0001(\u000e2).GDI.Proto.LaunchMonitor.Metrics.ShotType\u0012:\n\fball_metrics\u0018\u0003 \u0001(\u000b2$.GDI.Proto.LaunchMonitor.BallMetrics\u0012:\n\fclub_metrics\u0018\u0004 \u0001(\u000b2$.GDI.Proto.LaunchMonitor.ClubMetrics\u0012<\n\rswing_metrics\u0018\u0005 \u0001(\u000b2%.GDI.Proto.LaunchMonitor.SwingMetrics\u00124\n\tputt_path\u0018\u0006 \u0001(\u000b2!.GDI.Proto.LaunchMonitor.PuttPath\u0012<\n\rhole_position\u0018\u0007 \u0001(\u000b2%.GDI.Proto.LaunchMonitor.HolePosition\u0012-\n\u0005stimp\u0018\b \u0001(\u000b2\u001e.GDI.Proto.LaunchMonitor.Stimp\".\n\bShotType\u0012\f\n\bPRACTICE\u0010\u0000\u0012\n\n\u0006NORMAL\u0010\u0001\u0012\b\n\u0004PUTT\u0010\u0002\"¾\u0004\n\u000bBallMetrics\u0012\u0014\n\flaunch_angle\u0018\u0001 \u0001(\u0002\u0012\u0018\n\u0010launch_direction\u0018\u0002 \u0001(\u0002\u0012\u0012\n\nball_speed\u0018\u0003 \u0001(\u0002\u0012\u0011\n\tspin_axis\u0018\u0004 \u0001(\u0002\u0012\u0012\n\ntotal_spin\u0018\u0005 \u0001(\u0002\u0012W\n\u0015spin_calculation_type\u0018\u0006 \u0001(\u000e28.GDI.Proto.LaunchMonitor.BallMetrics.SpinCalculationType\u0012I\n\u000egolf_ball_type\u0018\u0007 \u0001(\u000e21.GDI.Proto.LaunchMonitor.BallMetrics.GolfBallType\u0012O\n\u0011launch_speed_type\u0018\b \u0001(\u000e24.GDI.Proto.LaunchMonitor.BallMetrics.LaunchSpeedType\"J\n\u0013SpinCalculationType\u0012\t\n\u0005RATIO\u0010\u0000\u0012\u000f\n\u000bBALL_FLIGHT\u0010\u0001\u0012\t\n\u0005OTHER\u0010\u0002\u0012\f\n\bMEASURED\u0010\u0003\"9\n\fGolfBallType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0010\n\fCONVENTIONAL\u0010\u0001\u0012\n\n\u0006MARKED\u0010\u0002\"H\n\u000fLaunchSpeedType\u0012\u0019\n\u0015LAUNCH_SPEED_MEASURED\u0010\u0000\u0012\u001a\n\u0016LAUNCH_SPEED_ESTIMATED\u0010\u0001\"Ï\u0004\n\bPuttPath\u0012\u001d\n\u0011skidding_x_path_m\u0018\u0001 \u0003(\u0002B\u0002\u0010\u0001\u0012\u001d\n\u0011skidding_y_path_m\u0018\u0002 \u0003(\u0002B\u0002\u0010\u0001\u0012\u001c\n\u0010rolling_x_path_m\u0018\u0003 \u0003(\u0002B\u0002\u0010\u0001\u0012\u001c\n\u0010rolling_y_path_m\u0018\u0004 \u0003(\u0002B\u0002\u0010\u0001\u0012!\n\u0015extrapolated_x_path_m\u0018\u0005 \u0003(\u0002B\u0002\u0010\u0001\u0012!\n\u0015extrapolated_y_path_m\u0018\u0006 \u0003(\u0002B\u0002\u0010\u0001\u0012\u001a\n\u0012roll_start_time_ms\u0018\u0007 \u0001(\r\u0012\u0018\n\u0010roll_end_time_ms\u0018\b \u0001(\r\u0012\u0019\n\u0011track_end_time_ms\u0018\t \u0001(\r\u0012\u0019\n\u0011track_ended_early\u0018\n \u0001(\b\u0012\u0018\n\u0010roll_start_speed\u0018\u000b \u0001(\u0002\u0012\u0017\n\u000fskid_distance_m\u0018\f \u0001(\u0002\u0012\u0017\n\u000froll_distance_m\u0018\r \u0001(\u0002\u0012\u001e\n\u0016entry_speed_distance_m\u0018\u000e \u0001(\u0002\u0012\u001c\n\u0014break_at_entry_speed\u0018\u000f \u0001(\u0002\u0012X\n\u001ebreak_direction_at_entry_speed\u0018\u0010 \u0001(\u000e20.GDI.Proto.LaunchMonitor.PuttPath.BreakDirection\"3\n\u000eBreakDirection\u0012\b\n\u0004LEFT\u0010\u0000\u0012\t\n\u0005RIGHT\u0010\u0001\u0012\f\n\bSTRAIGHT\u0010\u0002\".\n\fHolePosition\u0012\u000e\n\u0006hole_x\u0018\u0001 \u0001(\u0002\u0012\u000e\n\u0006hole_y\u0018\u0002 \u0001(\u0002\"\u0016\n\u0005Stimp\u0012\r\n\u0005stimp\u0018\u0001 \u0001(\u0002\"\u009c\u0001\n\u000bClubMetrics\u0012\u0017\n\u000fclub_head_speed\u0018\u0001 \u0001(\u0002\u0012\u0017\n\u000fclub_angle_face\u0018\u0002 \u0001(\u0002\u0012\u0017\n\u000fclub_angle_path\u0018\u0003 \u0001(\u0002\u0012\u0014\n\fattack_angle\u0018\u0004 \u0001(\u0002\u0012\u0015\n\rimpact_height\u0018\u0005 \u0001(\u0002\u0012\u0015\n\rimpact_offset\u0018\u0006 \u0001(\u0002\"´\u0002\n\fSwingMetrics\u0012 \n\u0018back_swing_start_time_ms\u0018\u0001 \u0001(\r\u0012 \n\u0018down_swing_start_time_ms\u0018\u0002 \u0001(\r\u0012\u0016\n\u000eimpact_time_ms\u0018\u0003 \u0001(\r\u0012\"\n\u001afollow_through_end_time_ms\u0018\u0004 \u0001(\r\u0012\u001d\n\u0015end_recording_time_ms\u0018\u0005 \u0001(\r\u0012\u001f\n\u0017follow_through_length_m\u0018\u0007 \u0001(\u0002\u0012\u0015\n\rswing_time_ms\u0018\b \u0001(\r\u0012\u0017\n\u000fswing_plane_deg\u0018\t \u0001(\u0002\u0012\u0013\n\u000blow_point_m\u0018\n \u0001(\u0002\u0012\u001f\n\u0017forward_stroke_length_m\u0018\u000b \u0001(\u0002\"´\u0002\n\u0005Error\u00126\n\u0004code\u0018\u0001 \u0001(\u000e2(.GDI.Proto.LaunchMonitor.Error.ErrorCode\u00129\n\bseverity\u0018\u0002 \u0001(\u000e2'.GDI.Proto.LaunchMonitor.Error.Severity\u00121\n\ndeviceTilt\u0018\u0003 \u0001(\u000b2\u001d.GDI.Proto.LaunchMonitor.Tilt\"T\n\tErrorCode\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000f\n\u000bOVERHEATING\u0010\u0001\u0012\u0014\n\u0010RADAR_SATURATION\u0010\u0002\u0012\u0013\n\u000fPLATFORM_TILTED\u0010\u0003\"/\n\bSeverity\u0012\u000b\n\u0007WARNING\u0010\u0000\u0012\u000b\n\u0007SERIOUS\u0010\u0001\u0012\t\n\u0005FATAL\u0010\u0002\"#\n\u0004Tilt\u0012\f\n\u0004roll\u0018\u0001 \u0001(\u0002\u0012\r\n\u0005pitch\u0018\u0002 \u0001(\u0002B5\n\u001acom.garmin.proto.generatedB\u0015GDILaunchMonitorProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_AlertDetails_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_AlertDetails_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_BallMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_BallMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_Error_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_Error_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_HolePosition_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_HolePosition_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_Metrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_Metrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_ModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_ModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_ModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_ModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_PuttPath_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_PuttPath_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_State_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_State_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_StatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_StatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_StatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_StatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_Stimp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_Stimp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_TiltRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_TiltRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_TiltResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_TiltResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_Tilt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_Tilt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_fieldAccessorTable;

    public interface AlertDetailsOrBuilder extends MessageOrBuilder {
        Error getError();

        ErrorOrBuilder getErrorOrBuilder();

        HoleFindStatus getHoleFindStatus();

        HoleFindStatusOrBuilder getHoleFindStatusOrBuilder();

        Metrics getMetrics();

        MetricsOrBuilder getMetricsOrBuilder();

        State getState();

        StateOrBuilder getStateOrBuilder();

        CalibrationStatus getTiltCalibration();

        CalibrationStatusOrBuilder getTiltCalibrationOrBuilder();

        boolean hasError();

        boolean hasHoleFindStatus();

        boolean hasMetrics();

        boolean hasState();

        boolean hasTiltCalibration();
    }

    public interface BallMetricsOrBuilder extends MessageOrBuilder {
        float getBallSpeed();

        BallMetrics.GolfBallType getGolfBallType();

        float getLaunchAngle();

        float getLaunchDirection();

        BallMetrics.LaunchSpeedType getLaunchSpeedType();

        float getSpinAxis();

        BallMetrics.SpinCalculationType getSpinCalculationType();

        float getTotalSpin();

        boolean hasBallSpeed();

        boolean hasGolfBallType();

        boolean hasLaunchAngle();

        boolean hasLaunchDirection();

        boolean hasLaunchSpeedType();

        boolean hasSpinAxis();

        boolean hasSpinCalculationType();

        boolean hasTotalSpin();
    }

    public interface CalibrationStatusOrBuilder extends MessageOrBuilder {
        CalibrationStatus.CalibrationResult getResult();

        CalibrationStatus.StatusType getStatus();

        boolean hasResult();

        boolean hasStatus();
    }

    public interface ClubMetricsOrBuilder extends MessageOrBuilder {
        float getAttackAngle();

        float getClubAngleFace();

        float getClubAnglePath();

        float getClubHeadSpeed();

        float getImpactHeight();

        float getImpactOffset();

        boolean hasAttackAngle();

        boolean hasClubAngleFace();

        boolean hasClubAnglePath();

        boolean hasClubHeadSpeed();

        boolean hasImpactHeight();

        boolean hasImpactOffset();
    }

    public interface ErrorOrBuilder extends MessageOrBuilder {
        Error.ErrorCode getCode();

        Tilt getDeviceTilt();

        TiltOrBuilder getDeviceTiltOrBuilder();

        Error.Severity getSeverity();

        boolean hasCode();

        boolean hasDeviceTilt();

        boolean hasSeverity();
    }

    public interface HoleFindStatusOrBuilder extends MessageOrBuilder {
        HoleFindStatus.StatusType getStatus();

        float getTrackingPercentage();

        boolean hasStatus();

        boolean hasTrackingPercentage();
    }

    public interface HolePositionOrBuilder extends MessageOrBuilder {
        float getHoleX();

        float getHoleY();

        boolean hasHoleX();

        boolean hasHoleY();
    }

    public interface MetricsOrBuilder extends MessageOrBuilder {
        BallMetrics getBallMetrics();

        BallMetricsOrBuilder getBallMetricsOrBuilder();

        ClubMetrics getClubMetrics();

        ClubMetricsOrBuilder getClubMetricsOrBuilder();

        HolePosition getHolePosition();

        HolePositionOrBuilder getHolePositionOrBuilder();

        PuttPath getPuttPath();

        PuttPathOrBuilder getPuttPathOrBuilder();

        int getShotId();

        Metrics.ShotType getShotType();

        Stimp getStimp();

        StimpOrBuilder getStimpOrBuilder();

        SwingMetrics getSwingMetrics();

        SwingMetricsOrBuilder getSwingMetricsOrBuilder();

        boolean hasBallMetrics();

        boolean hasClubMetrics();

        boolean hasHolePosition();

        boolean hasPuttPath();

        boolean hasShotId();

        boolean hasShotType();

        boolean hasStimp();

        boolean hasSwingMetrics();
    }

    public interface ModeRequestOrBuilder extends MessageOrBuilder {
        ModeRequest.Mode getMode();

        boolean hasMode();
    }

    public interface ModeResponseOrBuilder extends MessageOrBuilder {
        ModeResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface PuttPathOrBuilder extends MessageOrBuilder {
        float getBreakAtEntrySpeed();

        PuttPath.BreakDirection getBreakDirectionAtEntrySpeed();

        float getEntrySpeedDistanceM();

        float getExtrapolatedXPathM(int i14);

        int getExtrapolatedXPathMCount();

        List<Float> getExtrapolatedXPathMList();

        float getExtrapolatedYPathM(int i14);

        int getExtrapolatedYPathMCount();

        List<Float> getExtrapolatedYPathMList();

        float getRollDistanceM();

        int getRollEndTimeMs();

        float getRollStartSpeed();

        int getRollStartTimeMs();

        float getRollingXPathM(int i14);

        int getRollingXPathMCount();

        List<Float> getRollingXPathMList();

        float getRollingYPathM(int i14);

        int getRollingYPathMCount();

        List<Float> getRollingYPathMList();

        float getSkidDistanceM();

        float getSkiddingXPathM(int i14);

        int getSkiddingXPathMCount();

        List<Float> getSkiddingXPathMList();

        float getSkiddingYPathM(int i14);

        int getSkiddingYPathMCount();

        List<Float> getSkiddingYPathMList();

        int getTrackEndTimeMs();

        boolean getTrackEndedEarly();

        boolean hasBreakAtEntrySpeed();

        boolean hasBreakDirectionAtEntrySpeed();

        boolean hasEntrySpeedDistanceM();

        boolean hasRollDistanceM();

        boolean hasRollEndTimeMs();

        boolean hasRollStartSpeed();

        boolean hasRollStartTimeMs();

        boolean hasSkidDistanceM();

        boolean hasTrackEndTimeMs();

        boolean hasTrackEndedEarly();
    }

    public interface ResetTiltCalibrationRequestOrBuilder extends MessageOrBuilder {
        boolean getShouldReset();

        boolean hasShouldReset();
    }

    public interface ResetTiltCalibrationResponseOrBuilder extends MessageOrBuilder {
        ResetTiltCalibrationResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ModeRequest getModeRequest();

        ModeRequestOrBuilder getModeRequestOrBuilder();

        ModeResponse getModeResponse();

        ModeResponseOrBuilder getModeResponseOrBuilder();

        ResetTiltCalibrationRequest getResetTiltCalRequest();

        ResetTiltCalibrationRequestOrBuilder getResetTiltCalRequestOrBuilder();

        ResetTiltCalibrationResponse getResetTiltCalResponse();

        ResetTiltCalibrationResponseOrBuilder getResetTiltCalResponseOrBuilder();

        ShotConfigRequest getShotConfigRequest();

        ShotConfigRequestOrBuilder getShotConfigRequestOrBuilder();

        ShotConfigResponse getShotConfigResponse();

        ShotConfigResponseOrBuilder getShotConfigResponseOrBuilder();

        StartTiltCalibrationRequest getStartTiltCalRequest();

        StartTiltCalibrationRequestOrBuilder getStartTiltCalRequestOrBuilder();

        StartTiltCalibrationResponse getStartTiltCalResponse();

        StartTiltCalibrationResponseOrBuilder getStartTiltCalResponseOrBuilder();

        StatusRequest getStatusRequest();

        StatusRequestOrBuilder getStatusRequestOrBuilder();

        StatusResponse getStatusResponse();

        StatusResponseOrBuilder getStatusResponseOrBuilder();

        TiltRequest getTiltRequest();

        TiltRequestOrBuilder getTiltRequestOrBuilder();

        TiltResponse getTiltResponse();

        TiltResponseOrBuilder getTiltResponseOrBuilder();

        WakeUpRequest getWakeUpRequest();

        WakeUpRequestOrBuilder getWakeUpRequestOrBuilder();

        WakeUpResponse getWakeUpResponse();

        WakeUpResponseOrBuilder getWakeUpResponseOrBuilder();

        boolean hasModeRequest();

        boolean hasModeResponse();

        boolean hasResetTiltCalRequest();

        boolean hasResetTiltCalResponse();

        boolean hasShotConfigRequest();

        boolean hasShotConfigResponse();

        boolean hasStartTiltCalRequest();

        boolean hasStartTiltCalResponse();

        boolean hasStatusRequest();

        boolean hasStatusResponse();

        boolean hasTiltRequest();

        boolean hasTiltResponse();

        boolean hasWakeUpRequest();

        boolean hasWakeUpResponse();
    }

    public interface ShotConfigRequestOrBuilder extends MessageOrBuilder {
        float getAirDensity();

        float getAltitude();

        float getHumidity();

        float getTeeRange();

        float getTemperature();

        boolean hasAirDensity();

        boolean hasAltitude();

        boolean hasHumidity();

        boolean hasTeeRange();

        boolean hasTemperature();
    }

    public interface ShotConfigResponseOrBuilder extends MessageOrBuilder {
        boolean getSuccess();

        boolean hasSuccess();
    }

    public interface StartTiltCalibrationRequestOrBuilder extends MessageOrBuilder {
    }

    public interface StartTiltCalibrationResponseOrBuilder extends MessageOrBuilder {
        StartTiltCalibrationResponse.CalibrationStatus getStatus();

        boolean hasStatus();
    }

    public interface StateOrBuilder extends MessageOrBuilder {
        State.StateType getState();

        boolean hasState();
    }

    public interface StatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface StatusResponseOrBuilder extends MessageOrBuilder {
        State getState();

        StateOrBuilder getStateOrBuilder();

        boolean hasState();
    }

    public interface StimpOrBuilder extends MessageOrBuilder {
        float getStimp();

        boolean hasStimp();
    }

    public interface SwingMetricsOrBuilder extends MessageOrBuilder {
        int getBackSwingStartTimeMs();

        int getDownSwingStartTimeMs();

        int getEndRecordingTimeMs();

        int getFollowThroughEndTimeMs();

        float getFollowThroughLengthM();

        float getForwardStrokeLengthM();

        int getImpactTimeMs();

        float getLowPointM();

        float getSwingPlaneDeg();

        int getSwingTimeMs();

        boolean hasBackSwingStartTimeMs();

        boolean hasDownSwingStartTimeMs();

        boolean hasEndRecordingTimeMs();

        boolean hasFollowThroughEndTimeMs();

        boolean hasFollowThroughLengthM();

        boolean hasForwardStrokeLengthM();

        boolean hasImpactTimeMs();

        boolean hasLowPointM();

        boolean hasSwingPlaneDeg();

        boolean hasSwingTimeMs();
    }

    public interface TiltOrBuilder extends MessageOrBuilder {
        float getPitch();

        float getRoll();

        boolean hasPitch();

        boolean hasRoll();
    }

    public interface TiltRequestOrBuilder extends MessageOrBuilder {
    }

    public interface TiltResponseOrBuilder extends MessageOrBuilder {
        Tilt getTilt();

        TiltOrBuilder getTiltOrBuilder();

        boolean hasTilt();
    }

    public interface WakeUpRequestOrBuilder extends MessageOrBuilder {
    }

    public interface WakeUpResponseOrBuilder extends MessageOrBuilder {
        WakeUpResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) a.l(0);
        internal_static_GDI_Proto_LaunchMonitor_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_LaunchMonitor_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"StatusRequest", "StatusResponse", "WakeUpRequest", "WakeUpResponse", "TiltRequest", "TiltResponse", "StartTiltCalRequest", "StartTiltCalResponse", "ResetTiltCalRequest", "ResetTiltCalResponse", "ShotConfigRequest", "ShotConfigResponse", "ModeRequest", "ModeResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) a.l(1);
        internal_static_GDI_Proto_LaunchMonitor_StatusRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_LaunchMonitor_StatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) a.l(2);
        internal_static_GDI_Proto_LaunchMonitor_StatusResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_LaunchMonitor_StatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"State"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) a.l(3);
        internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) a.l(4);
        internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) a.l(5);
        internal_static_GDI_Proto_LaunchMonitor_TiltRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_LaunchMonitor_TiltRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) a.l(6);
        internal_static_GDI_Proto_LaunchMonitor_TiltResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_LaunchMonitor_TiltResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Tilt"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) a.l(7);
        internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) a.l(8);
        internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) a.l(9);
        internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"ShouldReset"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) a.l(10);
        internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) a.l(11);
        internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Temperature", "Humidity", "Altitude", "AirDensity", "TeeRange"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) a.l(12);
        internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Success"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) a.l(13);
        internal_static_GDI_Proto_LaunchMonitor_ModeRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_LaunchMonitor_ModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Mode"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) a.l(14);
        internal_static_GDI_Proto_LaunchMonitor_ModeResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_LaunchMonitor_ModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Status"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) a.l(15);
        internal_static_GDI_Proto_LaunchMonitor_AlertDetails_descriptor = descriptor17;
        internal_static_GDI_Proto_LaunchMonitor_AlertDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"State", "Metrics", "Error", "TiltCalibration", "HoleFindStatus"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) a.l(16);
        internal_static_GDI_Proto_LaunchMonitor_State_descriptor = descriptor18;
        internal_static_GDI_Proto_LaunchMonitor_State_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"State"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) a.l(17);
        internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_descriptor = descriptor19;
        internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Status", "Result"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) a.l(18);
        internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_descriptor = descriptor20;
        internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Status", "TrackingPercentage"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) a.l(19);
        internal_static_GDI_Proto_LaunchMonitor_Metrics_descriptor = descriptor21;
        internal_static_GDI_Proto_LaunchMonitor_Metrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"ShotId", "ShotType", "BallMetrics", "ClubMetrics", "SwingMetrics", "PuttPath", "HolePosition", "Stimp"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) a.l(20);
        internal_static_GDI_Proto_LaunchMonitor_BallMetrics_descriptor = descriptor22;
        internal_static_GDI_Proto_LaunchMonitor_BallMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"LaunchAngle", "LaunchDirection", "BallSpeed", "SpinAxis", "TotalSpin", "SpinCalculationType", "GolfBallType", "LaunchSpeedType"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) a.l(21);
        internal_static_GDI_Proto_LaunchMonitor_PuttPath_descriptor = descriptor23;
        internal_static_GDI_Proto_LaunchMonitor_PuttPath_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"SkiddingXPathM", "SkiddingYPathM", "RollingXPathM", "RollingYPathM", "ExtrapolatedXPathM", "ExtrapolatedYPathM", "RollStartTimeMs", "RollEndTimeMs", "TrackEndTimeMs", "TrackEndedEarly", "RollStartSpeed", "SkidDistanceM", "RollDistanceM", "EntrySpeedDistanceM", "BreakAtEntrySpeed", "BreakDirectionAtEntrySpeed"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) a.l(22);
        internal_static_GDI_Proto_LaunchMonitor_HolePosition_descriptor = descriptor24;
        internal_static_GDI_Proto_LaunchMonitor_HolePosition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"HoleX", "HoleY"});
        Descriptors.Descriptor descriptor25 = (Descriptors.Descriptor) a.l(23);
        internal_static_GDI_Proto_LaunchMonitor_Stimp_descriptor = descriptor25;
        internal_static_GDI_Proto_LaunchMonitor_Stimp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"Stimp"});
        Descriptors.Descriptor descriptor26 = (Descriptors.Descriptor) a.l(24);
        internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_descriptor = descriptor26;
        internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"ClubHeadSpeed", "ClubAngleFace", "ClubAnglePath", "AttackAngle", "ImpactHeight", "ImpactOffset"});
        Descriptors.Descriptor descriptor27 = (Descriptors.Descriptor) a.l(25);
        internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_descriptor = descriptor27;
        internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"BackSwingStartTimeMs", "DownSwingStartTimeMs", "ImpactTimeMs", "FollowThroughEndTimeMs", "EndRecordingTimeMs", "FollowThroughLengthM", "SwingTimeMs", "SwingPlaneDeg", "LowPointM", "ForwardStrokeLengthM"});
        Descriptors.Descriptor descriptor28 = (Descriptors.Descriptor) a.l(26);
        internal_static_GDI_Proto_LaunchMonitor_Error_descriptor = descriptor28;
        internal_static_GDI_Proto_LaunchMonitor_Error_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor28, new String[]{"Code", "Severity", "DeviceTilt"});
        Descriptors.Descriptor descriptor29 = (Descriptors.Descriptor) a.l(27);
        internal_static_GDI_Proto_LaunchMonitor_Tilt_descriptor = descriptor29;
        internal_static_GDI_Proto_LaunchMonitor_Tilt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor29, new String[]{"Roll", "Pitch"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDILaunchMonitorProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(AlertDetails.details);
    }

    public static final class ClubMetrics extends GeneratedMessageV3 implements ClubMetricsOrBuilder {
        public static final int ATTACK_ANGLE_FIELD_NUMBER = 4;
        public static final int CLUB_ANGLE_FACE_FIELD_NUMBER = 2;
        public static final int CLUB_ANGLE_PATH_FIELD_NUMBER = 3;
        public static final int CLUB_HEAD_SPEED_FIELD_NUMBER = 1;
        public static final int IMPACT_HEIGHT_FIELD_NUMBER = 5;
        public static final int IMPACT_OFFSET_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private float attackAngle_;
        private int bitField0_;
        private float clubAngleFace_;
        private float clubAnglePath_;
        private float clubHeadSpeed_;
        private float impactHeight_;
        private float impactOffset_;
        private byte memoizedIsInitialized;
        private static final ClubMetrics DEFAULT_INSTANCE = new ClubMetrics();

        @Deprecated
        public static final Parser<ClubMetrics> PARSER = new AbstractParser<ClubMetrics>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetrics.1
            @Override // com.google.protobuf.Parser
            public ClubMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ClubMetrics.newBuilder();
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

        private ClubMetrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.clubHeadSpeed_ = 0.0f;
            this.clubAngleFace_ = 0.0f;
            this.clubAnglePath_ = 0.0f;
            this.attackAngle_ = 0.0f;
            this.impactHeight_ = 0.0f;
            this.impactOffset_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ClubMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_descriptor;
        }

        public static Builder newBuilder(ClubMetrics clubMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clubMetrics);
        }

        public static ClubMetrics parseDelimitedFrom(InputStream inputStream) {
            return (ClubMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ClubMetrics parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ClubMetrics> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClubMetrics)) {
                return super.equals(obj);
            }
            ClubMetrics clubMetrics = (ClubMetrics) obj;
            if (hasClubHeadSpeed() != clubMetrics.hasClubHeadSpeed()) {
                return false;
            }
            if ((hasClubHeadSpeed() && Float.floatToIntBits(getClubHeadSpeed()) != Float.floatToIntBits(clubMetrics.getClubHeadSpeed())) || hasClubAngleFace() != clubMetrics.hasClubAngleFace()) {
                return false;
            }
            if ((hasClubAngleFace() && Float.floatToIntBits(getClubAngleFace()) != Float.floatToIntBits(clubMetrics.getClubAngleFace())) || hasClubAnglePath() != clubMetrics.hasClubAnglePath()) {
                return false;
            }
            if ((hasClubAnglePath() && Float.floatToIntBits(getClubAnglePath()) != Float.floatToIntBits(clubMetrics.getClubAnglePath())) || hasAttackAngle() != clubMetrics.hasAttackAngle()) {
                return false;
            }
            if ((hasAttackAngle() && Float.floatToIntBits(getAttackAngle()) != Float.floatToIntBits(clubMetrics.getAttackAngle())) || hasImpactHeight() != clubMetrics.hasImpactHeight()) {
                return false;
            }
            if ((!hasImpactHeight() || Float.floatToIntBits(getImpactHeight()) == Float.floatToIntBits(clubMetrics.getImpactHeight())) && hasImpactOffset() == clubMetrics.hasImpactOffset()) {
                return (!hasImpactOffset() || Float.floatToIntBits(getImpactOffset()) == Float.floatToIntBits(clubMetrics.getImpactOffset())) && getUnknownFields().equals(clubMetrics.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public float getAttackAngle() {
            return this.attackAngle_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public float getClubAngleFace() {
            return this.clubAngleFace_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public float getClubAnglePath() {
            return this.clubAnglePath_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public float getClubHeadSpeed() {
            return this.clubHeadSpeed_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public float getImpactHeight() {
            return this.impactHeight_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public float getImpactOffset() {
            return this.impactOffset_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ClubMetrics> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.clubHeadSpeed_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.clubAngleFace_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.clubAnglePath_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.attackAngle_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(5, this.impactHeight_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(6, this.impactOffset_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public boolean hasAttackAngle() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public boolean hasClubAngleFace() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public boolean hasClubAnglePath() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public boolean hasClubHeadSpeed() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public boolean hasImpactHeight() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
        public boolean hasImpactOffset() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasClubHeadSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getClubHeadSpeed());
            }
            if (hasClubAngleFace()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getClubAngleFace());
            }
            if (hasClubAnglePath()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getClubAnglePath());
            }
            if (hasAttackAngle()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getAttackAngle());
            }
            if (hasImpactHeight()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getImpactHeight());
            }
            if (hasImpactOffset()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Float.floatToIntBits(getImpactOffset());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(ClubMetrics.class, Builder.class);
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
            return new ClubMetrics();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.clubHeadSpeed_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.clubAngleFace_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.clubAnglePath_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.attackAngle_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.impactHeight_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(6, this.impactOffset_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClubMetricsOrBuilder {
            private float attackAngle_;
            private int bitField0_;
            private float clubAngleFace_;
            private float clubAnglePath_;
            private float clubHeadSpeed_;
            private float impactHeight_;
            private float impactOffset_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ClubMetrics clubMetrics) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    clubMetrics.clubHeadSpeed_ = this.clubHeadSpeed_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    clubMetrics.clubAngleFace_ = this.clubAngleFace_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    clubMetrics.clubAnglePath_ = this.clubAnglePath_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    clubMetrics.attackAngle_ = this.attackAngle_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    clubMetrics.impactHeight_ = this.impactHeight_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    clubMetrics.impactOffset_ = this.impactOffset_;
                    i14 |= 32;
                }
                clubMetrics.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClubMetrics build() {
                ClubMetrics clubMetricsBuildPartial = buildPartial();
                if (clubMetricsBuildPartial.isInitialized()) {
                    return clubMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) clubMetricsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClubMetrics buildPartial() {
                ClubMetrics clubMetrics = new ClubMetrics(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(clubMetrics);
                }
                onBuilt();
                return clubMetrics;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.clubHeadSpeed_ = 0.0f;
                this.clubAngleFace_ = 0.0f;
                this.clubAnglePath_ = 0.0f;
                this.attackAngle_ = 0.0f;
                this.impactHeight_ = 0.0f;
                this.impactOffset_ = 0.0f;
                return this;
            }

            public Builder clearAttackAngle() {
                this.bitField0_ &= -9;
                this.attackAngle_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearClubAngleFace() {
                this.bitField0_ &= -3;
                this.clubAngleFace_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearClubAnglePath() {
                this.bitField0_ &= -5;
                this.clubAnglePath_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearClubHeadSpeed() {
                this.bitField0_ &= -2;
                this.clubHeadSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearImpactHeight() {
                this.bitField0_ &= -17;
                this.impactHeight_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearImpactOffset() {
                this.bitField0_ &= -33;
                this.impactOffset_ = 0.0f;
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

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public float getAttackAngle() {
                return this.attackAngle_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public float getClubAngleFace() {
                return this.clubAngleFace_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public float getClubAnglePath() {
                return this.clubAnglePath_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public float getClubHeadSpeed() {
                return this.clubHeadSpeed_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public float getImpactHeight() {
                return this.impactHeight_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public float getImpactOffset() {
                return this.impactOffset_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public boolean hasAttackAngle() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public boolean hasClubAngleFace() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public boolean hasClubAnglePath() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public boolean hasClubHeadSpeed() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public boolean hasImpactHeight() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ClubMetricsOrBuilder
            public boolean hasImpactOffset() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ClubMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(ClubMetrics.class, Builder.class);
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
                                if (tag == 13) {
                                    this.clubHeadSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.clubAngleFace_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.clubAnglePath_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                } else if (tag == 37) {
                                    this.attackAngle_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.impactHeight_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
                                } else if (tag == 53) {
                                    this.impactOffset_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
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

            public Builder setAttackAngle(float f14) {
                this.attackAngle_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setClubAngleFace(float f14) {
                this.clubAngleFace_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setClubAnglePath(float f14) {
                this.clubAnglePath_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setClubHeadSpeed(float f14) {
                this.clubHeadSpeed_ = f14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setImpactHeight(float f14) {
                this.impactHeight_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setImpactOffset(float f14) {
                this.impactOffset_ = f14;
                this.bitField0_ |= 32;
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
            public ClubMetrics getDefaultInstanceForType() {
                return ClubMetrics.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ClubMetrics) {
                    return mergeFrom((ClubMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ClubMetrics clubMetrics) {
                if (clubMetrics == ClubMetrics.getDefaultInstance()) {
                    return this;
                }
                if (clubMetrics.hasClubHeadSpeed()) {
                    setClubHeadSpeed(clubMetrics.getClubHeadSpeed());
                }
                if (clubMetrics.hasClubAngleFace()) {
                    setClubAngleFace(clubMetrics.getClubAngleFace());
                }
                if (clubMetrics.hasClubAnglePath()) {
                    setClubAnglePath(clubMetrics.getClubAnglePath());
                }
                if (clubMetrics.hasAttackAngle()) {
                    setAttackAngle(clubMetrics.getAttackAngle());
                }
                if (clubMetrics.hasImpactHeight()) {
                    setImpactHeight(clubMetrics.getImpactHeight());
                }
                if (clubMetrics.hasImpactOffset()) {
                    setImpactOffset(clubMetrics.getImpactOffset());
                }
                mergeUnknownFields(clubMetrics.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ClubMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ClubMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClubMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ClubMetrics parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ClubMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClubMetrics parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ClubMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClubMetrics parseFrom(InputStream inputStream) {
            return (ClubMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ClubMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClubMetrics parseFrom(CodedInputStream codedInputStream) {
            return (ClubMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ ClubMetrics(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ClubMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ClubMetrics() {
            this.clubHeadSpeed_ = 0.0f;
            this.clubAngleFace_ = 0.0f;
            this.clubAnglePath_ = 0.0f;
            this.attackAngle_ = 0.0f;
            this.impactHeight_ = 0.0f;
            this.impactOffset_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class HolePosition extends GeneratedMessageV3 implements HolePositionOrBuilder {
        public static final int HOLE_X_FIELD_NUMBER = 1;
        public static final int HOLE_Y_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private float holeX_;
        private float holeY_;
        private byte memoizedIsInitialized;
        private static final HolePosition DEFAULT_INSTANCE = new HolePosition();

        @Deprecated
        public static final Parser<HolePosition> PARSER = new AbstractParser<HolePosition>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.HolePosition.1
            @Override // com.google.protobuf.Parser
            public HolePosition parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HolePosition.newBuilder();
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

        private HolePosition(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.holeX_ = 0.0f;
            this.holeY_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HolePosition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HolePosition_descriptor;
        }

        public static Builder newBuilder(HolePosition holePosition) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(holePosition);
        }

        public static HolePosition parseDelimitedFrom(InputStream inputStream) {
            return (HolePosition) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HolePosition parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HolePosition> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HolePosition)) {
                return super.equals(obj);
            }
            HolePosition holePosition = (HolePosition) obj;
            if (hasHoleX() != holePosition.hasHoleX()) {
                return false;
            }
            if ((!hasHoleX() || Float.floatToIntBits(getHoleX()) == Float.floatToIntBits(holePosition.getHoleX())) && hasHoleY() == holePosition.hasHoleY()) {
                return (!hasHoleY() || Float.floatToIntBits(getHoleY()) == Float.floatToIntBits(holePosition.getHoleY())) && getUnknownFields().equals(holePosition.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HolePositionOrBuilder
        public float getHoleX() {
            return this.holeX_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HolePositionOrBuilder
        public float getHoleY() {
            return this.holeY_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HolePosition> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.holeX_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.holeY_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HolePositionOrBuilder
        public boolean hasHoleX() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HolePositionOrBuilder
        public boolean hasHoleY() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHoleX()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getHoleX());
            }
            if (hasHoleY()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getHoleY());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HolePosition_fieldAccessorTable.ensureFieldAccessorsInitialized(HolePosition.class, Builder.class);
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
            return new HolePosition();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.holeX_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.holeY_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HolePositionOrBuilder {
            private int bitField0_;
            private float holeX_;
            private float holeY_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(HolePosition holePosition) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    holePosition.holeX_ = this.holeX_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    holePosition.holeY_ = this.holeY_;
                    i14 |= 2;
                }
                holePosition.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HolePosition_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HolePosition build() {
                HolePosition holePositionBuildPartial = buildPartial();
                if (holePositionBuildPartial.isInitialized()) {
                    return holePositionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) holePositionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HolePosition buildPartial() {
                HolePosition holePosition = new HolePosition(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(holePosition);
                }
                onBuilt();
                return holePosition;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.holeX_ = 0.0f;
                this.holeY_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHoleX() {
                this.bitField0_ &= -2;
                this.holeX_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearHoleY() {
                this.bitField0_ &= -3;
                this.holeY_ = 0.0f;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HolePosition_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HolePositionOrBuilder
            public float getHoleX() {
                return this.holeX_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HolePositionOrBuilder
            public float getHoleY() {
                return this.holeY_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HolePositionOrBuilder
            public boolean hasHoleX() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HolePositionOrBuilder
            public boolean hasHoleY() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HolePosition_fieldAccessorTable.ensureFieldAccessorsInitialized(HolePosition.class, Builder.class);
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
                                if (tag == 13) {
                                    this.holeX_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.holeY_ = codedInputStream.readFloat();
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

            public Builder setHoleX(float f14) {
                this.holeX_ = f14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHoleY(float f14) {
                this.holeY_ = f14;
                this.bitField0_ |= 2;
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
            public HolePosition getDefaultInstanceForType() {
                return HolePosition.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HolePosition) {
                    return mergeFrom((HolePosition) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HolePosition holePosition) {
                if (holePosition == HolePosition.getDefaultInstance()) {
                    return this;
                }
                if (holePosition.hasHoleX()) {
                    setHoleX(holePosition.getHoleX());
                }
                if (holePosition.hasHoleY()) {
                    setHoleY(holePosition.getHoleY());
                }
                mergeUnknownFields(holePosition.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HolePosition getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HolePosition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HolePosition) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HolePosition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HolePosition parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HolePosition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ HolePosition(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HolePosition parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private HolePosition() {
            this.holeX_ = 0.0f;
            this.holeY_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HolePosition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HolePosition parseFrom(InputStream inputStream) {
            return (HolePosition) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HolePosition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HolePosition) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HolePosition parseFrom(CodedInputStream codedInputStream) {
            return (HolePosition) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HolePosition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HolePosition) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ResetTiltCalibrationRequest extends GeneratedMessageV3 implements ResetTiltCalibrationRequestOrBuilder {
        private static final ResetTiltCalibrationRequest DEFAULT_INSTANCE = new ResetTiltCalibrationRequest();

        @Deprecated
        public static final Parser<ResetTiltCalibrationRequest> PARSER = new AbstractParser<ResetTiltCalibrationRequest>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationRequest.1
            @Override // com.google.protobuf.Parser
            public ResetTiltCalibrationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ResetTiltCalibrationRequest.newBuilder();
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
        public static final int SHOULD_RESET_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean shouldReset_;

        private ResetTiltCalibrationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.shouldReset_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetTiltCalibrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_descriptor;
        }

        public static Builder newBuilder(ResetTiltCalibrationRequest resetTiltCalibrationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resetTiltCalibrationRequest);
        }

        public static ResetTiltCalibrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (ResetTiltCalibrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResetTiltCalibrationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ResetTiltCalibrationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResetTiltCalibrationRequest)) {
                return super.equals(obj);
            }
            ResetTiltCalibrationRequest resetTiltCalibrationRequest = (ResetTiltCalibrationRequest) obj;
            if (hasShouldReset() != resetTiltCalibrationRequest.hasShouldReset()) {
                return false;
            }
            return (!hasShouldReset() || getShouldReset() == resetTiltCalibrationRequest.getShouldReset()) && getUnknownFields().equals(resetTiltCalibrationRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResetTiltCalibrationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.shouldReset_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationRequestOrBuilder
        public boolean getShouldReset() {
            return this.shouldReset_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationRequestOrBuilder
        public boolean hasShouldReset() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasShouldReset()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getShouldReset());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetTiltCalibrationRequest.class, Builder.class);
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
            return new ResetTiltCalibrationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.shouldReset_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResetTiltCalibrationRequestOrBuilder {
            private int bitField0_;
            private boolean shouldReset_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ResetTiltCalibrationRequest resetTiltCalibrationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    resetTiltCalibrationRequest.shouldReset_ = this.shouldReset_;
                } else {
                    i14 = 0;
                }
                resetTiltCalibrationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetTiltCalibrationRequest build() {
                ResetTiltCalibrationRequest resetTiltCalibrationRequestBuildPartial = buildPartial();
                if (resetTiltCalibrationRequestBuildPartial.isInitialized()) {
                    return resetTiltCalibrationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resetTiltCalibrationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetTiltCalibrationRequest buildPartial() {
                ResetTiltCalibrationRequest resetTiltCalibrationRequest = new ResetTiltCalibrationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(resetTiltCalibrationRequest);
                }
                onBuilt();
                return resetTiltCalibrationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.shouldReset_ = false;
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

            public Builder clearShouldReset() {
                this.bitField0_ &= -2;
                this.shouldReset_ = false;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationRequestOrBuilder
            public boolean getShouldReset() {
                return this.shouldReset_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationRequestOrBuilder
            public boolean hasShouldReset() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetTiltCalibrationRequest.class, Builder.class);
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
                                    this.shouldReset_ = codedInputStream.readBool();
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

            public Builder setShouldReset(boolean z14) {
                this.shouldReset_ = z14;
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
            public ResetTiltCalibrationRequest getDefaultInstanceForType() {
                return ResetTiltCalibrationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ResetTiltCalibrationRequest) {
                    return mergeFrom((ResetTiltCalibrationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ResetTiltCalibrationRequest resetTiltCalibrationRequest) {
                if (resetTiltCalibrationRequest == ResetTiltCalibrationRequest.getDefaultInstance()) {
                    return this;
                }
                if (resetTiltCalibrationRequest.hasShouldReset()) {
                    setShouldReset(resetTiltCalibrationRequest.getShouldReset());
                }
                mergeUnknownFields(resetTiltCalibrationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResetTiltCalibrationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ResetTiltCalibrationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetTiltCalibrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetTiltCalibrationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ResetTiltCalibrationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ResetTiltCalibrationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ResetTiltCalibrationRequest() {
            this.shouldReset_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResetTiltCalibrationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ResetTiltCalibrationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ResetTiltCalibrationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ResetTiltCalibrationRequest parseFrom(InputStream inputStream) {
            return (ResetTiltCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ResetTiltCalibrationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetTiltCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetTiltCalibrationRequest parseFrom(CodedInputStream codedInputStream) {
            return (ResetTiltCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResetTiltCalibrationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetTiltCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShotConfigRequest extends GeneratedMessageV3 implements ShotConfigRequestOrBuilder {
        public static final int AIR_DENSITY_FIELD_NUMBER = 4;
        public static final int ALTITUDE_FIELD_NUMBER = 3;
        public static final int HUMIDITY_FIELD_NUMBER = 2;
        public static final int TEE_RANGE_FIELD_NUMBER = 5;
        public static final int TEMPERATURE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private float airDensity_;
        private float altitude_;
        private int bitField0_;
        private float humidity_;
        private byte memoizedIsInitialized;
        private float teeRange_;
        private float temperature_;
        private static final ShotConfigRequest DEFAULT_INSTANCE = new ShotConfigRequest();

        @Deprecated
        public static final Parser<ShotConfigRequest> PARSER = new AbstractParser<ShotConfigRequest>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequest.1
            @Override // com.google.protobuf.Parser
            public ShotConfigRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShotConfigRequest.newBuilder();
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

        private ShotConfigRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.temperature_ = 0.0f;
            this.humidity_ = 0.0f;
            this.altitude_ = 0.0f;
            this.airDensity_ = 0.0f;
            this.teeRange_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShotConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_descriptor;
        }

        public static Builder newBuilder(ShotConfigRequest shotConfigRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shotConfigRequest);
        }

        public static ShotConfigRequest parseDelimitedFrom(InputStream inputStream) {
            return (ShotConfigRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShotConfigRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShotConfigRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShotConfigRequest)) {
                return super.equals(obj);
            }
            ShotConfigRequest shotConfigRequest = (ShotConfigRequest) obj;
            if (hasTemperature() != shotConfigRequest.hasTemperature()) {
                return false;
            }
            if ((hasTemperature() && Float.floatToIntBits(getTemperature()) != Float.floatToIntBits(shotConfigRequest.getTemperature())) || hasHumidity() != shotConfigRequest.hasHumidity()) {
                return false;
            }
            if ((hasHumidity() && Float.floatToIntBits(getHumidity()) != Float.floatToIntBits(shotConfigRequest.getHumidity())) || hasAltitude() != shotConfigRequest.hasAltitude()) {
                return false;
            }
            if ((hasAltitude() && Float.floatToIntBits(getAltitude()) != Float.floatToIntBits(shotConfigRequest.getAltitude())) || hasAirDensity() != shotConfigRequest.hasAirDensity()) {
                return false;
            }
            if ((!hasAirDensity() || Float.floatToIntBits(getAirDensity()) == Float.floatToIntBits(shotConfigRequest.getAirDensity())) && hasTeeRange() == shotConfigRequest.hasTeeRange()) {
                return (!hasTeeRange() || Float.floatToIntBits(getTeeRange()) == Float.floatToIntBits(shotConfigRequest.getTeeRange())) && getUnknownFields().equals(shotConfigRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public float getAirDensity() {
            return this.airDensity_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public float getAltitude() {
            return this.altitude_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public float getHumidity() {
            return this.humidity_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShotConfigRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.temperature_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.humidity_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.altitude_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.airDensity_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(5, this.teeRange_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public float getTeeRange() {
            return this.teeRange_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public float getTemperature() {
            return this.temperature_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public boolean hasAirDensity() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public boolean hasAltitude() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public boolean hasHumidity() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public boolean hasTeeRange() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
        public boolean hasTemperature() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTemperature()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getTemperature());
            }
            if (hasHumidity()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getHumidity());
            }
            if (hasAltitude()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getAltitude());
            }
            if (hasAirDensity()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getAirDensity());
            }
            if (hasTeeRange()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getTeeRange());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotConfigRequest.class, Builder.class);
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
            return new ShotConfigRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.temperature_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.humidity_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.altitude_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.airDensity_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.teeRange_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShotConfigRequestOrBuilder {
            private float airDensity_;
            private float altitude_;
            private int bitField0_;
            private float humidity_;
            private float teeRange_;
            private float temperature_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ShotConfigRequest shotConfigRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    shotConfigRequest.temperature_ = this.temperature_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    shotConfigRequest.humidity_ = this.humidity_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    shotConfigRequest.altitude_ = this.altitude_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    shotConfigRequest.airDensity_ = this.airDensity_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    shotConfigRequest.teeRange_ = this.teeRange_;
                    i14 |= 16;
                }
                shotConfigRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotConfigRequest build() {
                ShotConfigRequest shotConfigRequestBuildPartial = buildPartial();
                if (shotConfigRequestBuildPartial.isInitialized()) {
                    return shotConfigRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shotConfigRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotConfigRequest buildPartial() {
                ShotConfigRequest shotConfigRequest = new ShotConfigRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shotConfigRequest);
                }
                onBuilt();
                return shotConfigRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.temperature_ = 0.0f;
                this.humidity_ = 0.0f;
                this.altitude_ = 0.0f;
                this.airDensity_ = 0.0f;
                this.teeRange_ = 0.0f;
                return this;
            }

            public Builder clearAirDensity() {
                this.bitField0_ &= -9;
                this.airDensity_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearAltitude() {
                this.bitField0_ &= -5;
                this.altitude_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHumidity() {
                this.bitField0_ &= -3;
                this.humidity_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTeeRange() {
                this.bitField0_ &= -17;
                this.teeRange_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearTemperature() {
                this.bitField0_ &= -2;
                this.temperature_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public float getAirDensity() {
                return this.airDensity_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public float getAltitude() {
                return this.altitude_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public float getHumidity() {
                return this.humidity_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public float getTeeRange() {
                return this.teeRange_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public float getTemperature() {
                return this.temperature_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public boolean hasAirDensity() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public boolean hasAltitude() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public boolean hasHumidity() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public boolean hasTeeRange() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigRequestOrBuilder
            public boolean hasTemperature() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotConfigRequest.class, Builder.class);
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
                                if (tag == 13) {
                                    this.temperature_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.humidity_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.altitude_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                } else if (tag == 37) {
                                    this.airDensity_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.teeRange_ = codedInputStream.readFloat();
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

            public Builder setAirDensity(float f14) {
                this.airDensity_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAltitude(float f14) {
                this.altitude_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHumidity(float f14) {
                this.humidity_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTeeRange(float f14) {
                this.teeRange_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTemperature(float f14) {
                this.temperature_ = f14;
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
            public ShotConfigRequest getDefaultInstanceForType() {
                return ShotConfigRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShotConfigRequest) {
                    return mergeFrom((ShotConfigRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShotConfigRequest shotConfigRequest) {
                if (shotConfigRequest == ShotConfigRequest.getDefaultInstance()) {
                    return this;
                }
                if (shotConfigRequest.hasTemperature()) {
                    setTemperature(shotConfigRequest.getTemperature());
                }
                if (shotConfigRequest.hasHumidity()) {
                    setHumidity(shotConfigRequest.getHumidity());
                }
                if (shotConfigRequest.hasAltitude()) {
                    setAltitude(shotConfigRequest.getAltitude());
                }
                if (shotConfigRequest.hasAirDensity()) {
                    setAirDensity(shotConfigRequest.getAirDensity());
                }
                if (shotConfigRequest.hasTeeRange()) {
                    setTeeRange(shotConfigRequest.getTeeRange());
                }
                mergeUnknownFields(shotConfigRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShotConfigRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShotConfigRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotConfigRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShotConfigRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShotConfigRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShotConfigRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShotConfigRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShotConfigRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShotConfigRequest parseFrom(InputStream inputStream) {
            return (ShotConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShotConfigRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ ShotConfigRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ShotConfigRequest parseFrom(CodedInputStream codedInputStream) {
            return (ShotConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private ShotConfigRequest() {
            this.temperature_ = 0.0f;
            this.humidity_ = 0.0f;
            this.altitude_ = 0.0f;
            this.airDensity_ = 0.0f;
            this.teeRange_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShotConfigRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShotConfigResponse extends GeneratedMessageV3 implements ShotConfigResponseOrBuilder {
        private static final ShotConfigResponse DEFAULT_INSTANCE = new ShotConfigResponse();

        @Deprecated
        public static final Parser<ShotConfigResponse> PARSER = new AbstractParser<ShotConfigResponse>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigResponse.1
            @Override // com.google.protobuf.Parser
            public ShotConfigResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShotConfigResponse.newBuilder();
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
        public static final int SUCCESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean success_;

        private ShotConfigResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShotConfigResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_descriptor;
        }

        public static Builder newBuilder(ShotConfigResponse shotConfigResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shotConfigResponse);
        }

        public static ShotConfigResponse parseDelimitedFrom(InputStream inputStream) {
            return (ShotConfigResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShotConfigResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShotConfigResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShotConfigResponse)) {
                return super.equals(obj);
            }
            ShotConfigResponse shotConfigResponse = (ShotConfigResponse) obj;
            if (hasSuccess() != shotConfigResponse.hasSuccess()) {
                return false;
            }
            return (!hasSuccess() || getSuccess() == shotConfigResponse.getSuccess()) && getUnknownFields().equals(shotConfigResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShotConfigResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.success_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigResponseOrBuilder
        public boolean hasSuccess() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSuccess()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSuccess());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotConfigResponse.class, Builder.class);
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
            return new ShotConfigResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.success_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShotConfigResponseOrBuilder {
            private int bitField0_;
            private boolean success_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ShotConfigResponse shotConfigResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    shotConfigResponse.success_ = this.success_;
                } else {
                    i14 = 0;
                }
                shotConfigResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotConfigResponse build() {
                ShotConfigResponse shotConfigResponseBuildPartial = buildPartial();
                if (shotConfigResponseBuildPartial.isInitialized()) {
                    return shotConfigResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shotConfigResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShotConfigResponse buildPartial() {
                ShotConfigResponse shotConfigResponse = new ShotConfigResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shotConfigResponse);
                }
                onBuilt();
                return shotConfigResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.success_ = false;
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

            public Builder clearSuccess() {
                this.bitField0_ &= -2;
                this.success_ = false;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ShotConfigResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ShotConfigResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShotConfigResponse.class, Builder.class);
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
                                    this.success_ = codedInputStream.readBool();
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

            public Builder setSuccess(boolean z14) {
                this.success_ = z14;
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
            public ShotConfigResponse getDefaultInstanceForType() {
                return ShotConfigResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShotConfigResponse) {
                    return mergeFrom((ShotConfigResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShotConfigResponse shotConfigResponse) {
                if (shotConfigResponse == ShotConfigResponse.getDefaultInstance()) {
                    return this;
                }
                if (shotConfigResponse.hasSuccess()) {
                    setSuccess(shotConfigResponse.getSuccess());
                }
                mergeUnknownFields(shotConfigResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShotConfigResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShotConfigResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotConfigResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShotConfigResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ShotConfigResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ShotConfigResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ShotConfigResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShotConfigResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShotConfigResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShotConfigResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShotConfigResponse parseFrom(InputStream inputStream) {
            return (ShotConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShotConfigResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShotConfigResponse parseFrom(CodedInputStream codedInputStream) {
            return (ShotConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShotConfigResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShotConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartTiltCalibrationRequest extends GeneratedMessageV3 implements StartTiltCalibrationRequestOrBuilder {
        private static final StartTiltCalibrationRequest DEFAULT_INSTANCE = new StartTiltCalibrationRequest();

        @Deprecated
        public static final Parser<StartTiltCalibrationRequest> PARSER = new AbstractParser<StartTiltCalibrationRequest>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.StartTiltCalibrationRequest.1
            @Override // com.google.protobuf.Parser
            public StartTiltCalibrationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartTiltCalibrationRequest.newBuilder();
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

        private StartTiltCalibrationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartTiltCalibrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_descriptor;
        }

        public static Builder newBuilder(StartTiltCalibrationRequest startTiltCalibrationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startTiltCalibrationRequest);
        }

        public static StartTiltCalibrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartTiltCalibrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartTiltCalibrationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartTiltCalibrationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StartTiltCalibrationRequest) {
                return getUnknownFields().equals(((StartTiltCalibrationRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartTiltCalibrationRequest> getParserForType() {
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartTiltCalibrationRequest.class, Builder.class);
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
            return new StartTiltCalibrationRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartTiltCalibrationRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartTiltCalibrationRequest build() {
                StartTiltCalibrationRequest startTiltCalibrationRequestBuildPartial = buildPartial();
                if (startTiltCalibrationRequestBuildPartial.isInitialized()) {
                    return startTiltCalibrationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startTiltCalibrationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartTiltCalibrationRequest buildPartial() {
                StartTiltCalibrationRequest startTiltCalibrationRequest = new StartTiltCalibrationRequest(this);
                onBuilt();
                return startTiltCalibrationRequest;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartTiltCalibrationRequest.class, Builder.class);
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
            public StartTiltCalibrationRequest getDefaultInstanceForType() {
                return StartTiltCalibrationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartTiltCalibrationRequest) {
                    return mergeFrom((StartTiltCalibrationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartTiltCalibrationRequest startTiltCalibrationRequest) {
                if (startTiltCalibrationRequest == StartTiltCalibrationRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(startTiltCalibrationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartTiltCalibrationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StartTiltCalibrationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StartTiltCalibrationRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartTiltCalibrationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTiltCalibrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartTiltCalibrationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StartTiltCalibrationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartTiltCalibrationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartTiltCalibrationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartTiltCalibrationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartTiltCalibrationRequest parseFrom(InputStream inputStream) {
            return (StartTiltCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartTiltCalibrationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTiltCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartTiltCalibrationRequest parseFrom(CodedInputStream codedInputStream) {
            return (StartTiltCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartTiltCalibrationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTiltCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StatusRequest extends GeneratedMessageV3 implements StatusRequestOrBuilder {
        private static final StatusRequest DEFAULT_INSTANCE = new StatusRequest();

        @Deprecated
        public static final Parser<StatusRequest> PARSER = new AbstractParser<StatusRequest>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.StatusRequest.1
            @Override // com.google.protobuf.Parser
            public StatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StatusRequest.newBuilder();
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

        private StatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusRequest_descriptor;
        }

        public static Builder newBuilder(StatusRequest statusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(statusRequest);
        }

        public static StatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (StatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StatusRequest) {
                return getUnknownFields().equals(((StatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StatusRequest> getParserForType() {
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusRequest.class, Builder.class);
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
            return new StatusRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusRequest build() {
                StatusRequest statusRequestBuildPartial = buildPartial();
                if (statusRequestBuildPartial.isInitialized()) {
                    return statusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) statusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusRequest buildPartial() {
                StatusRequest statusRequest = new StatusRequest(this);
                onBuilt();
                return statusRequest;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusRequest.class, Builder.class);
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
            public StatusRequest getDefaultInstanceForType() {
                return StatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StatusRequest) {
                    return mergeFrom((StatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StatusRequest statusRequest) {
                if (statusRequest == StatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(statusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StatusRequest parseFrom(InputStream inputStream) {
            return (StatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (StatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Stimp extends GeneratedMessageV3 implements StimpOrBuilder {
        private static final Stimp DEFAULT_INSTANCE = new Stimp();

        @Deprecated
        public static final Parser<Stimp> PARSER = new AbstractParser<Stimp>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.Stimp.1
            @Override // com.google.protobuf.Parser
            public Stimp parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Stimp.newBuilder();
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
        public static final int STIMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private float stimp_;

        private Stimp(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.stimp_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Stimp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Stimp_descriptor;
        }

        public static Builder newBuilder(Stimp stimp) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stimp);
        }

        public static Stimp parseDelimitedFrom(InputStream inputStream) {
            return (Stimp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Stimp parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Stimp> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Stimp)) {
                return super.equals(obj);
            }
            Stimp stimp = (Stimp) obj;
            if (hasStimp() != stimp.hasStimp()) {
                return false;
            }
            return (!hasStimp() || Float.floatToIntBits(getStimp()) == Float.floatToIntBits(stimp.getStimp())) && getUnknownFields().equals(stimp.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Stimp> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.stimp_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StimpOrBuilder
        public float getStimp() {
            return this.stimp_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StimpOrBuilder
        public boolean hasStimp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStimp()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getStimp());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Stimp_fieldAccessorTable.ensureFieldAccessorsInitialized(Stimp.class, Builder.class);
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
            return new Stimp();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.stimp_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StimpOrBuilder {
            private int bitField0_;
            private float stimp_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(Stimp stimp) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stimp.stimp_ = this.stimp_;
                } else {
                    i14 = 0;
                }
                stimp.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Stimp_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Stimp build() {
                Stimp stimpBuildPartial = buildPartial();
                if (stimpBuildPartial.isInitialized()) {
                    return stimpBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stimpBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Stimp buildPartial() {
                Stimp stimp = new Stimp(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stimp);
                }
                onBuilt();
                return stimp;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.stimp_ = 0.0f;
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

            public Builder clearStimp() {
                this.bitField0_ &= -2;
                this.stimp_ = 0.0f;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Stimp_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StimpOrBuilder
            public float getStimp() {
                return this.stimp_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StimpOrBuilder
            public boolean hasStimp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Stimp_fieldAccessorTable.ensureFieldAccessorsInitialized(Stimp.class, Builder.class);
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
                                if (tag == 13) {
                                    this.stimp_ = codedInputStream.readFloat();
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

            public Builder setStimp(float f14) {
                this.stimp_ = f14;
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
            public Stimp getDefaultInstanceForType() {
                return Stimp.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Stimp) {
                    return mergeFrom((Stimp) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Stimp stimp) {
                if (stimp == Stimp.getDefaultInstance()) {
                    return this;
                }
                if (stimp.hasStimp()) {
                    setStimp(stimp.getStimp());
                }
                mergeUnknownFields(stimp.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Stimp getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Stimp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Stimp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Stimp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ Stimp(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Stimp parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private Stimp() {
            this.stimp_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Stimp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Stimp parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Stimp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Stimp parseFrom(InputStream inputStream) {
            return (Stimp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Stimp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Stimp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Stimp parseFrom(CodedInputStream codedInputStream) {
            return (Stimp) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Stimp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Stimp) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwingMetrics extends GeneratedMessageV3 implements SwingMetricsOrBuilder {
        public static final int BACK_SWING_START_TIME_MS_FIELD_NUMBER = 1;
        public static final int DOWN_SWING_START_TIME_MS_FIELD_NUMBER = 2;
        public static final int END_RECORDING_TIME_MS_FIELD_NUMBER = 5;
        public static final int FOLLOW_THROUGH_END_TIME_MS_FIELD_NUMBER = 4;
        public static final int FOLLOW_THROUGH_LENGTH_M_FIELD_NUMBER = 7;
        public static final int FORWARD_STROKE_LENGTH_M_FIELD_NUMBER = 11;
        public static final int IMPACT_TIME_MS_FIELD_NUMBER = 3;
        public static final int LOW_POINT_M_FIELD_NUMBER = 10;
        public static final int SWING_PLANE_DEG_FIELD_NUMBER = 9;
        public static final int SWING_TIME_MS_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int backSwingStartTimeMs_;
        private int bitField0_;
        private int downSwingStartTimeMs_;
        private int endRecordingTimeMs_;
        private int followThroughEndTimeMs_;
        private float followThroughLengthM_;
        private float forwardStrokeLengthM_;
        private int impactTimeMs_;
        private float lowPointM_;
        private byte memoizedIsInitialized;
        private float swingPlaneDeg_;
        private int swingTimeMs_;
        private static final SwingMetrics DEFAULT_INSTANCE = new SwingMetrics();

        @Deprecated
        public static final Parser<SwingMetrics> PARSER = new AbstractParser<SwingMetrics>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetrics.1
            @Override // com.google.protobuf.Parser
            public SwingMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwingMetrics.newBuilder();
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

        private SwingMetrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.backSwingStartTimeMs_ = 0;
            this.downSwingStartTimeMs_ = 0;
            this.impactTimeMs_ = 0;
            this.followThroughEndTimeMs_ = 0;
            this.endRecordingTimeMs_ = 0;
            this.followThroughLengthM_ = 0.0f;
            this.swingTimeMs_ = 0;
            this.swingPlaneDeg_ = 0.0f;
            this.lowPointM_ = 0.0f;
            this.forwardStrokeLengthM_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_descriptor;
        }

        public static Builder newBuilder(SwingMetrics swingMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(swingMetrics);
        }

        public static SwingMetrics parseDelimitedFrom(InputStream inputStream) {
            return (SwingMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwingMetrics parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwingMetrics> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwingMetrics)) {
                return super.equals(obj);
            }
            SwingMetrics swingMetrics = (SwingMetrics) obj;
            if (hasBackSwingStartTimeMs() != swingMetrics.hasBackSwingStartTimeMs()) {
                return false;
            }
            if ((hasBackSwingStartTimeMs() && getBackSwingStartTimeMs() != swingMetrics.getBackSwingStartTimeMs()) || hasDownSwingStartTimeMs() != swingMetrics.hasDownSwingStartTimeMs()) {
                return false;
            }
            if ((hasDownSwingStartTimeMs() && getDownSwingStartTimeMs() != swingMetrics.getDownSwingStartTimeMs()) || hasImpactTimeMs() != swingMetrics.hasImpactTimeMs()) {
                return false;
            }
            if ((hasImpactTimeMs() && getImpactTimeMs() != swingMetrics.getImpactTimeMs()) || hasFollowThroughEndTimeMs() != swingMetrics.hasFollowThroughEndTimeMs()) {
                return false;
            }
            if ((hasFollowThroughEndTimeMs() && getFollowThroughEndTimeMs() != swingMetrics.getFollowThroughEndTimeMs()) || hasEndRecordingTimeMs() != swingMetrics.hasEndRecordingTimeMs()) {
                return false;
            }
            if ((hasEndRecordingTimeMs() && getEndRecordingTimeMs() != swingMetrics.getEndRecordingTimeMs()) || hasFollowThroughLengthM() != swingMetrics.hasFollowThroughLengthM()) {
                return false;
            }
            if ((hasFollowThroughLengthM() && Float.floatToIntBits(getFollowThroughLengthM()) != Float.floatToIntBits(swingMetrics.getFollowThroughLengthM())) || hasSwingTimeMs() != swingMetrics.hasSwingTimeMs()) {
                return false;
            }
            if ((hasSwingTimeMs() && getSwingTimeMs() != swingMetrics.getSwingTimeMs()) || hasSwingPlaneDeg() != swingMetrics.hasSwingPlaneDeg()) {
                return false;
            }
            if ((hasSwingPlaneDeg() && Float.floatToIntBits(getSwingPlaneDeg()) != Float.floatToIntBits(swingMetrics.getSwingPlaneDeg())) || hasLowPointM() != swingMetrics.hasLowPointM()) {
                return false;
            }
            if ((!hasLowPointM() || Float.floatToIntBits(getLowPointM()) == Float.floatToIntBits(swingMetrics.getLowPointM())) && hasForwardStrokeLengthM() == swingMetrics.hasForwardStrokeLengthM()) {
                return (!hasForwardStrokeLengthM() || Float.floatToIntBits(getForwardStrokeLengthM()) == Float.floatToIntBits(swingMetrics.getForwardStrokeLengthM())) && getUnknownFields().equals(swingMetrics.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public int getBackSwingStartTimeMs() {
            return this.backSwingStartTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public int getDownSwingStartTimeMs() {
            return this.downSwingStartTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public int getEndRecordingTimeMs() {
            return this.endRecordingTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public int getFollowThroughEndTimeMs() {
            return this.followThroughEndTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public float getFollowThroughLengthM() {
            return this.followThroughLengthM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public float getForwardStrokeLengthM() {
            return this.forwardStrokeLengthM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public int getImpactTimeMs() {
            return this.impactTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public float getLowPointM() {
            return this.lowPointM_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwingMetrics> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.backSwingStartTimeMs_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.downSwingStartTimeMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.impactTimeMs_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.followThroughEndTimeMs_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.endRecordingTimeMs_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(7, this.followThroughLengthM_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, this.swingTimeMs_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(9, this.swingPlaneDeg_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(10, this.lowPointM_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(11, this.forwardStrokeLengthM_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public float getSwingPlaneDeg() {
            return this.swingPlaneDeg_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public int getSwingTimeMs() {
            return this.swingTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasBackSwingStartTimeMs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasDownSwingStartTimeMs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasEndRecordingTimeMs() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasFollowThroughEndTimeMs() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasFollowThroughLengthM() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasForwardStrokeLengthM() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasImpactTimeMs() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasLowPointM() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasSwingPlaneDeg() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
        public boolean hasSwingTimeMs() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBackSwingStartTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBackSwingStartTimeMs();
            }
            if (hasDownSwingStartTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDownSwingStartTimeMs();
            }
            if (hasImpactTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getImpactTimeMs();
            }
            if (hasFollowThroughEndTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getFollowThroughEndTimeMs();
            }
            if (hasEndRecordingTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getEndRecordingTimeMs();
            }
            if (hasFollowThroughLengthM()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getFollowThroughLengthM());
            }
            if (hasSwingTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSwingTimeMs();
            }
            if (hasSwingPlaneDeg()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Float.floatToIntBits(getSwingPlaneDeg());
            }
            if (hasLowPointM()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Float.floatToIntBits(getLowPointM());
            }
            if (hasForwardStrokeLengthM()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + Float.floatToIntBits(getForwardStrokeLengthM());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingMetrics.class, Builder.class);
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
            return new SwingMetrics();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.backSwingStartTimeMs_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.downSwingStartTimeMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.impactTimeMs_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.followThroughEndTimeMs_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.endRecordingTimeMs_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(7, this.followThroughLengthM_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(8, this.swingTimeMs_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(9, this.swingPlaneDeg_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(10, this.lowPointM_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeFloat(11, this.forwardStrokeLengthM_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwingMetricsOrBuilder {
            private int backSwingStartTimeMs_;
            private int bitField0_;
            private int downSwingStartTimeMs_;
            private int endRecordingTimeMs_;
            private int followThroughEndTimeMs_;
            private float followThroughLengthM_;
            private float forwardStrokeLengthM_;
            private int impactTimeMs_;
            private float lowPointM_;
            private float swingPlaneDeg_;
            private int swingTimeMs_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SwingMetrics swingMetrics) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    swingMetrics.backSwingStartTimeMs_ = this.backSwingStartTimeMs_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    swingMetrics.downSwingStartTimeMs_ = this.downSwingStartTimeMs_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    swingMetrics.impactTimeMs_ = this.impactTimeMs_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    swingMetrics.followThroughEndTimeMs_ = this.followThroughEndTimeMs_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    swingMetrics.endRecordingTimeMs_ = this.endRecordingTimeMs_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    swingMetrics.followThroughLengthM_ = this.followThroughLengthM_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    swingMetrics.swingTimeMs_ = this.swingTimeMs_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    swingMetrics.swingPlaneDeg_ = this.swingPlaneDeg_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    swingMetrics.lowPointM_ = this.lowPointM_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    swingMetrics.forwardStrokeLengthM_ = this.forwardStrokeLengthM_;
                    i14 |= 512;
                }
                swingMetrics.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingMetrics build() {
                SwingMetrics swingMetricsBuildPartial = buildPartial();
                if (swingMetricsBuildPartial.isInitialized()) {
                    return swingMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) swingMetricsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingMetrics buildPartial() {
                SwingMetrics swingMetrics = new SwingMetrics(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(swingMetrics);
                }
                onBuilt();
                return swingMetrics;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.backSwingStartTimeMs_ = 0;
                this.downSwingStartTimeMs_ = 0;
                this.impactTimeMs_ = 0;
                this.followThroughEndTimeMs_ = 0;
                this.endRecordingTimeMs_ = 0;
                this.followThroughLengthM_ = 0.0f;
                this.swingTimeMs_ = 0;
                this.swingPlaneDeg_ = 0.0f;
                this.lowPointM_ = 0.0f;
                this.forwardStrokeLengthM_ = 0.0f;
                return this;
            }

            public Builder clearBackSwingStartTimeMs() {
                this.bitField0_ &= -2;
                this.backSwingStartTimeMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDownSwingStartTimeMs() {
                this.bitField0_ &= -3;
                this.downSwingStartTimeMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEndRecordingTimeMs() {
                this.bitField0_ &= -17;
                this.endRecordingTimeMs_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFollowThroughEndTimeMs() {
                this.bitField0_ &= -9;
                this.followThroughEndTimeMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFollowThroughLengthM() {
                this.bitField0_ &= -33;
                this.followThroughLengthM_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearForwardStrokeLengthM() {
                this.bitField0_ &= -513;
                this.forwardStrokeLengthM_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearImpactTimeMs() {
                this.bitField0_ &= -5;
                this.impactTimeMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLowPointM() {
                this.bitField0_ &= -257;
                this.lowPointM_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSwingPlaneDeg() {
                this.bitField0_ &= -129;
                this.swingPlaneDeg_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearSwingTimeMs() {
                this.bitField0_ &= -65;
                this.swingTimeMs_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public int getBackSwingStartTimeMs() {
                return this.backSwingStartTimeMs_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public int getDownSwingStartTimeMs() {
                return this.downSwingStartTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public int getEndRecordingTimeMs() {
                return this.endRecordingTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public int getFollowThroughEndTimeMs() {
                return this.followThroughEndTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public float getFollowThroughLengthM() {
                return this.followThroughLengthM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public float getForwardStrokeLengthM() {
                return this.forwardStrokeLengthM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public int getImpactTimeMs() {
                return this.impactTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public float getLowPointM() {
                return this.lowPointM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public float getSwingPlaneDeg() {
                return this.swingPlaneDeg_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public int getSwingTimeMs() {
                return this.swingTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasBackSwingStartTimeMs() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasDownSwingStartTimeMs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasEndRecordingTimeMs() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasFollowThroughEndTimeMs() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasFollowThroughLengthM() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasForwardStrokeLengthM() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasImpactTimeMs() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasLowPointM() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasSwingPlaneDeg() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.SwingMetricsOrBuilder
            public boolean hasSwingTimeMs() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_SwingMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingMetrics.class, Builder.class);
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
                                    this.backSwingStartTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.downSwingStartTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.impactTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.followThroughEndTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.endRecordingTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 61:
                                    this.followThroughLengthM_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 64:
                                    this.swingTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 77:
                                    this.swingPlaneDeg_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 85:
                                    this.lowPointM_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 93:
                                    this.forwardStrokeLengthM_ = codedInputStream.readFloat();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBackSwingStartTimeMs(int i14) {
                this.backSwingStartTimeMs_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDownSwingStartTimeMs(int i14) {
                this.downSwingStartTimeMs_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEndRecordingTimeMs(int i14) {
                this.endRecordingTimeMs_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFollowThroughEndTimeMs(int i14) {
                this.followThroughEndTimeMs_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFollowThroughLengthM(float f14) {
                this.followThroughLengthM_ = f14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setForwardStrokeLengthM(float f14) {
                this.forwardStrokeLengthM_ = f14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setImpactTimeMs(int i14) {
                this.impactTimeMs_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLowPointM(float f14) {
                this.lowPointM_ = f14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSwingPlaneDeg(float f14) {
                this.swingPlaneDeg_ = f14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSwingTimeMs(int i14) {
                this.swingTimeMs_ = i14;
                this.bitField0_ |= 64;
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
            public SwingMetrics getDefaultInstanceForType() {
                return SwingMetrics.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwingMetrics) {
                    return mergeFrom((SwingMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwingMetrics swingMetrics) {
                if (swingMetrics == SwingMetrics.getDefaultInstance()) {
                    return this;
                }
                if (swingMetrics.hasBackSwingStartTimeMs()) {
                    setBackSwingStartTimeMs(swingMetrics.getBackSwingStartTimeMs());
                }
                if (swingMetrics.hasDownSwingStartTimeMs()) {
                    setDownSwingStartTimeMs(swingMetrics.getDownSwingStartTimeMs());
                }
                if (swingMetrics.hasImpactTimeMs()) {
                    setImpactTimeMs(swingMetrics.getImpactTimeMs());
                }
                if (swingMetrics.hasFollowThroughEndTimeMs()) {
                    setFollowThroughEndTimeMs(swingMetrics.getFollowThroughEndTimeMs());
                }
                if (swingMetrics.hasEndRecordingTimeMs()) {
                    setEndRecordingTimeMs(swingMetrics.getEndRecordingTimeMs());
                }
                if (swingMetrics.hasFollowThroughLengthM()) {
                    setFollowThroughLengthM(swingMetrics.getFollowThroughLengthM());
                }
                if (swingMetrics.hasSwingTimeMs()) {
                    setSwingTimeMs(swingMetrics.getSwingTimeMs());
                }
                if (swingMetrics.hasSwingPlaneDeg()) {
                    setSwingPlaneDeg(swingMetrics.getSwingPlaneDeg());
                }
                if (swingMetrics.hasLowPointM()) {
                    setLowPointM(swingMetrics.getLowPointM());
                }
                if (swingMetrics.hasForwardStrokeLengthM()) {
                    setForwardStrokeLengthM(swingMetrics.getForwardStrokeLengthM());
                }
                mergeUnknownFields(swingMetrics.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwingMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwingMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwingMetrics parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwingMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwingMetrics parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwingMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwingMetrics parseFrom(InputStream inputStream) {
            return (SwingMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwingMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingMetrics parseFrom(CodedInputStream codedInputStream) {
            return (SwingMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwingMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ SwingMetrics(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwingMetrics() {
            this.backSwingStartTimeMs_ = 0;
            this.downSwingStartTimeMs_ = 0;
            this.impactTimeMs_ = 0;
            this.followThroughEndTimeMs_ = 0;
            this.endRecordingTimeMs_ = 0;
            this.followThroughLengthM_ = 0.0f;
            this.swingTimeMs_ = 0;
            this.swingPlaneDeg_ = 0.0f;
            this.lowPointM_ = 0.0f;
            this.forwardStrokeLengthM_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class Tilt extends GeneratedMessageV3 implements TiltOrBuilder {
        private static final Tilt DEFAULT_INSTANCE = new Tilt();

        @Deprecated
        public static final Parser<Tilt> PARSER = new AbstractParser<Tilt>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.Tilt.1
            @Override // com.google.protobuf.Parser
            public Tilt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Tilt.newBuilder();
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
        public static final int PITCH_FIELD_NUMBER = 2;
        public static final int ROLL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private float pitch_;
        private float roll_;

        private Tilt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.roll_ = 0.0f;
            this.pitch_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Tilt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Tilt_descriptor;
        }

        public static Builder newBuilder(Tilt tilt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(tilt);
        }

        public static Tilt parseDelimitedFrom(InputStream inputStream) {
            return (Tilt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Tilt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Tilt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Tilt)) {
                return super.equals(obj);
            }
            Tilt tilt = (Tilt) obj;
            if (hasRoll() != tilt.hasRoll()) {
                return false;
            }
            if ((!hasRoll() || Float.floatToIntBits(getRoll()) == Float.floatToIntBits(tilt.getRoll())) && hasPitch() == tilt.hasPitch()) {
                return (!hasPitch() || Float.floatToIntBits(getPitch()) == Float.floatToIntBits(tilt.getPitch())) && getUnknownFields().equals(tilt.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Tilt> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltOrBuilder
        public float getPitch() {
            return this.pitch_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltOrBuilder
        public float getRoll() {
            return this.roll_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.roll_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.pitch_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltOrBuilder
        public boolean hasPitch() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltOrBuilder
        public boolean hasRoll() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRoll()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getRoll());
            }
            if (hasPitch()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getPitch());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Tilt_fieldAccessorTable.ensureFieldAccessorsInitialized(Tilt.class, Builder.class);
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
            return new Tilt();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.roll_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.pitch_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TiltOrBuilder {
            private int bitField0_;
            private float pitch_;
            private float roll_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(Tilt tilt) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    tilt.roll_ = this.roll_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    tilt.pitch_ = this.pitch_;
                    i14 |= 2;
                }
                tilt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Tilt_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Tilt build() {
                Tilt tiltBuildPartial = buildPartial();
                if (tiltBuildPartial.isInitialized()) {
                    return tiltBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) tiltBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Tilt buildPartial() {
                Tilt tilt = new Tilt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(tilt);
                }
                onBuilt();
                return tilt;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.roll_ = 0.0f;
                this.pitch_ = 0.0f;
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

            public Builder clearPitch() {
                this.bitField0_ &= -3;
                this.pitch_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearRoll() {
                this.bitField0_ &= -2;
                this.roll_ = 0.0f;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Tilt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltOrBuilder
            public float getPitch() {
                return this.pitch_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltOrBuilder
            public float getRoll() {
                return this.roll_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltOrBuilder
            public boolean hasPitch() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltOrBuilder
            public boolean hasRoll() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Tilt_fieldAccessorTable.ensureFieldAccessorsInitialized(Tilt.class, Builder.class);
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
                                if (tag == 13) {
                                    this.roll_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.pitch_ = codedInputStream.readFloat();
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

            public Builder setPitch(float f14) {
                this.pitch_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRoll(float f14) {
                this.roll_ = f14;
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
            public Tilt getDefaultInstanceForType() {
                return Tilt.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Tilt) {
                    return mergeFrom((Tilt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Tilt tilt) {
                if (tilt == Tilt.getDefaultInstance()) {
                    return this;
                }
                if (tilt.hasRoll()) {
                    setRoll(tilt.getRoll());
                }
                if (tilt.hasPitch()) {
                    setPitch(tilt.getPitch());
                }
                mergeUnknownFields(tilt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Tilt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Tilt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Tilt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Tilt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Tilt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Tilt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ Tilt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Tilt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private Tilt() {
            this.roll_ = 0.0f;
            this.pitch_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Tilt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Tilt parseFrom(InputStream inputStream) {
            return (Tilt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Tilt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Tilt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Tilt parseFrom(CodedInputStream codedInputStream) {
            return (Tilt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Tilt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Tilt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TiltRequest extends GeneratedMessageV3 implements TiltRequestOrBuilder {
        private static final TiltRequest DEFAULT_INSTANCE = new TiltRequest();

        @Deprecated
        public static final Parser<TiltRequest> PARSER = new AbstractParser<TiltRequest>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.TiltRequest.1
            @Override // com.google.protobuf.Parser
            public TiltRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TiltRequest.newBuilder();
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

        private TiltRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TiltRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltRequest_descriptor;
        }

        public static Builder newBuilder(TiltRequest tiltRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(tiltRequest);
        }

        public static TiltRequest parseDelimitedFrom(InputStream inputStream) {
            return (TiltRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TiltRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TiltRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof TiltRequest) {
                return getUnknownFields().equals(((TiltRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TiltRequest> getParserForType() {
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TiltRequest.class, Builder.class);
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
            return new TiltRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TiltRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TiltRequest build() {
                TiltRequest tiltRequestBuildPartial = buildPartial();
                if (tiltRequestBuildPartial.isInitialized()) {
                    return tiltRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) tiltRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TiltRequest buildPartial() {
                TiltRequest tiltRequest = new TiltRequest(this);
                onBuilt();
                return tiltRequest;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TiltRequest.class, Builder.class);
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
            public TiltRequest getDefaultInstanceForType() {
                return TiltRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TiltRequest) {
                    return mergeFrom((TiltRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TiltRequest tiltRequest) {
                if (tiltRequest == TiltRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(tiltRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TiltRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TiltRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TiltRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TiltRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TiltRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TiltRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TiltRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TiltRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TiltRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TiltRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TiltRequest parseFrom(InputStream inputStream) {
            return (TiltRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TiltRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TiltRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TiltRequest parseFrom(CodedInputStream codedInputStream) {
            return (TiltRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TiltRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TiltRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WakeUpRequest extends GeneratedMessageV3 implements WakeUpRequestOrBuilder {
        private static final WakeUpRequest DEFAULT_INSTANCE = new WakeUpRequest();

        @Deprecated
        public static final Parser<WakeUpRequest> PARSER = new AbstractParser<WakeUpRequest>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.WakeUpRequest.1
            @Override // com.google.protobuf.Parser
            public WakeUpRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WakeUpRequest.newBuilder();
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

        private WakeUpRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WakeUpRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_descriptor;
        }

        public static Builder newBuilder(WakeUpRequest wakeUpRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wakeUpRequest);
        }

        public static WakeUpRequest parseDelimitedFrom(InputStream inputStream) {
            return (WakeUpRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WakeUpRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WakeUpRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof WakeUpRequest) {
                return getUnknownFields().equals(((WakeUpRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WakeUpRequest> getParserForType() {
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WakeUpRequest.class, Builder.class);
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
            return new WakeUpRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WakeUpRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WakeUpRequest build() {
                WakeUpRequest wakeUpRequestBuildPartial = buildPartial();
                if (wakeUpRequestBuildPartial.isInitialized()) {
                    return wakeUpRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wakeUpRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WakeUpRequest buildPartial() {
                WakeUpRequest wakeUpRequest = new WakeUpRequest(this);
                onBuilt();
                return wakeUpRequest;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WakeUpRequest.class, Builder.class);
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
            public WakeUpRequest getDefaultInstanceForType() {
                return WakeUpRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WakeUpRequest) {
                    return mergeFrom((WakeUpRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WakeUpRequest wakeUpRequest) {
                if (wakeUpRequest == WakeUpRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(wakeUpRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WakeUpRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WakeUpRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WakeUpRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WakeUpRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WakeUpRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WakeUpRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WakeUpRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WakeUpRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WakeUpRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WakeUpRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WakeUpRequest parseFrom(InputStream inputStream) {
            return (WakeUpRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WakeUpRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WakeUpRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WakeUpRequest parseFrom(CodedInputStream codedInputStream) {
            return (WakeUpRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WakeUpRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WakeUpRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlertDetails extends GeneratedMessageV3 implements AlertDetailsOrBuilder {
        public static final int DETAILS_FIELD_NUMBER = 1001;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int HOLE_FIND_STATUS_FIELD_NUMBER = 5;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 1;
        public static final int TILT_CALIBRATION_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Error error_;
        private HoleFindStatus holeFindStatus_;
        private byte memoizedIsInitialized;
        private Metrics metrics_;
        private State state_;
        private CalibrationStatus tiltCalibration_;
        private static final AlertDetails DEFAULT_INSTANCE = new AlertDetails();

        @Deprecated
        public static final Parser<AlertDetails> PARSER = new AbstractParser<AlertDetails>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetails.1
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

        private AlertDetails(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_AlertDetails_descriptor;
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
            if (hasState() != alertDetails.hasState()) {
                return false;
            }
            if ((hasState() && !getState().equals(alertDetails.getState())) || hasMetrics() != alertDetails.hasMetrics()) {
                return false;
            }
            if ((hasMetrics() && !getMetrics().equals(alertDetails.getMetrics())) || hasError() != alertDetails.hasError()) {
                return false;
            }
            if ((hasError() && !getError().equals(alertDetails.getError())) || hasTiltCalibration() != alertDetails.hasTiltCalibration()) {
                return false;
            }
            if ((!hasTiltCalibration() || getTiltCalibration().equals(alertDetails.getTiltCalibration())) && hasHoleFindStatus() == alertDetails.hasHoleFindStatus()) {
                return (!hasHoleFindStatus() || getHoleFindStatus().equals(alertDetails.getHoleFindStatus())) && getUnknownFields().equals(alertDetails.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public Error getError() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public HoleFindStatus getHoleFindStatus() {
            HoleFindStatus holeFindStatus = this.holeFindStatus_;
            return holeFindStatus == null ? HoleFindStatus.getDefaultInstance() : holeFindStatus;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public HoleFindStatusOrBuilder getHoleFindStatusOrBuilder() {
            HoleFindStatus holeFindStatus = this.holeFindStatus_;
            return holeFindStatus == null ? HoleFindStatus.getDefaultInstance() : holeFindStatus;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public Metrics getMetrics() {
            Metrics metrics = this.metrics_;
            return metrics == null ? Metrics.getDefaultInstance() : metrics;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public MetricsOrBuilder getMetricsOrBuilder() {
            Metrics metrics = this.metrics_;
            return metrics == null ? Metrics.getDefaultInstance() : metrics;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getState()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getMetrics());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getError());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getTiltCalibration());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getHoleFindStatus());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public State getState() {
            State state = this.state_;
            return state == null ? State.getDefaultInstance() : state;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public StateOrBuilder getStateOrBuilder() {
            State state = this.state_;
            return state == null ? State.getDefaultInstance() : state;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public CalibrationStatus getTiltCalibration() {
            CalibrationStatus calibrationStatus = this.tiltCalibration_;
            return calibrationStatus == null ? CalibrationStatus.getDefaultInstance() : calibrationStatus;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public CalibrationStatusOrBuilder getTiltCalibrationOrBuilder() {
            CalibrationStatus calibrationStatus = this.tiltCalibration_;
            return calibrationStatus == null ? CalibrationStatus.getDefaultInstance() : calibrationStatus;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public boolean hasHoleFindStatus() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public boolean hasMetrics() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
        public boolean hasTiltCalibration() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getState().hashCode();
            }
            if (hasMetrics()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMetrics().hashCode();
            }
            if (hasError()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getError().hashCode();
            }
            if (hasTiltCalibration()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getTiltCalibration().hashCode();
            }
            if (hasHoleFindStatus()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getHoleFindStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_AlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertDetails.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getState());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getMetrics());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getError());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getTiltCalibration());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getHoleFindStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertDetailsOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> errorBuilder_;
            private Error error_;
            private SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> holeFindStatusBuilder_;
            private HoleFindStatus holeFindStatus_;
            private SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> metricsBuilder_;
            private Metrics metrics_;
            private SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> stateBuilder_;
            private State state_;
            private SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> tiltCalibrationBuilder_;
            private CalibrationStatus tiltCalibration_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AlertDetails alertDetails) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                    alertDetails.state_ = singleFieldBuilderV3 == null ? this.state_ : (State) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> singleFieldBuilderV4 = this.metricsBuilder_;
                    alertDetails.metrics_ = singleFieldBuilderV4 == null ? this.metrics_ : (Metrics) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV5 = this.errorBuilder_;
                    alertDetails.error_ = singleFieldBuilderV5 == null ? this.error_ : (Error) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> singleFieldBuilderV6 = this.tiltCalibrationBuilder_;
                    alertDetails.tiltCalibration_ = singleFieldBuilderV6 == null ? this.tiltCalibration_ : (CalibrationStatus) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> singleFieldBuilderV7 = this.holeFindStatusBuilder_;
                    alertDetails.holeFindStatus_ = singleFieldBuilderV7 == null ? this.holeFindStatus_ : (HoleFindStatus) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                alertDetails.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_AlertDetails_descriptor;
            }

            private SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new SingleFieldBuilderV3<>(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            private SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> getHoleFindStatusFieldBuilder() {
                if (this.holeFindStatusBuilder_ == null) {
                    this.holeFindStatusBuilder_ = new SingleFieldBuilderV3<>(getHoleFindStatus(), getParentForChildren(), isClean());
                    this.holeFindStatus_ = null;
                }
                return this.holeFindStatusBuilder_;
            }

            private SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> getMetricsFieldBuilder() {
                if (this.metricsBuilder_ == null) {
                    this.metricsBuilder_ = new SingleFieldBuilderV3<>(getMetrics(), getParentForChildren(), isClean());
                    this.metrics_ = null;
                }
                return this.metricsBuilder_;
            }

            private SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> getStateFieldBuilder() {
                if (this.stateBuilder_ == null) {
                    this.stateBuilder_ = new SingleFieldBuilderV3<>(getState(), getParentForChildren(), isClean());
                    this.state_ = null;
                }
                return this.stateBuilder_;
            }

            private SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> getTiltCalibrationFieldBuilder() {
                if (this.tiltCalibrationBuilder_ == null) {
                    this.tiltCalibrationBuilder_ = new SingleFieldBuilderV3<>(getTiltCalibration(), getParentForChildren(), isClean());
                    this.tiltCalibration_ = null;
                }
                return this.tiltCalibrationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStateFieldBuilder();
                    getMetricsFieldBuilder();
                    getErrorFieldBuilder();
                    getTiltCalibrationFieldBuilder();
                    getHoleFindStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
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
                this.state_ = null;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateBuilder_ = null;
                }
                this.metrics_ = null;
                SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> singleFieldBuilderV4 = this.metricsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.metricsBuilder_ = null;
                }
                this.error_ = null;
                SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV5 = this.errorBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.errorBuilder_ = null;
                }
                this.tiltCalibration_ = null;
                SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> singleFieldBuilderV6 = this.tiltCalibrationBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.tiltCalibrationBuilder_ = null;
                }
                this.holeFindStatus_ = null;
                SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> singleFieldBuilderV7 = this.holeFindStatusBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.holeFindStatusBuilder_ = null;
                }
                return this;
            }

            public Builder clearError() {
                this.bitField0_ &= -5;
                this.error_ = null;
                SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.errorBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHoleFindStatus() {
                this.bitField0_ &= -17;
                this.holeFindStatus_ = null;
                SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> singleFieldBuilderV3 = this.holeFindStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.holeFindStatusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMetrics() {
                this.bitField0_ &= -3;
                this.metrics_ = null;
                SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> singleFieldBuilderV3 = this.metricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.metricsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = null;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTiltCalibration() {
                this.bitField0_ &= -9;
                this.tiltCalibration_ = null;
                SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> singleFieldBuilderV3 = this.tiltCalibrationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tiltCalibrationBuilder_ = null;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_AlertDetails_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public Error getError() {
                SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Error) singleFieldBuilderV3.getMessage();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            public Error.Builder getErrorBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Error.Builder) getErrorFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ErrorOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public HoleFindStatus getHoleFindStatus() {
                SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> singleFieldBuilderV3 = this.holeFindStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HoleFindStatus) singleFieldBuilderV3.getMessage();
                }
                HoleFindStatus holeFindStatus = this.holeFindStatus_;
                return holeFindStatus == null ? HoleFindStatus.getDefaultInstance() : holeFindStatus;
            }

            public HoleFindStatus.Builder getHoleFindStatusBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (HoleFindStatus.Builder) getHoleFindStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public HoleFindStatusOrBuilder getHoleFindStatusOrBuilder() {
                SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> singleFieldBuilderV3 = this.holeFindStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HoleFindStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HoleFindStatus holeFindStatus = this.holeFindStatus_;
                return holeFindStatus == null ? HoleFindStatus.getDefaultInstance() : holeFindStatus;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public Metrics getMetrics() {
                SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> singleFieldBuilderV3 = this.metricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Metrics) singleFieldBuilderV3.getMessage();
                }
                Metrics metrics = this.metrics_;
                return metrics == null ? Metrics.getDefaultInstance() : metrics;
            }

            public Metrics.Builder getMetricsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Metrics.Builder) getMetricsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public MetricsOrBuilder getMetricsOrBuilder() {
                SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> singleFieldBuilderV3 = this.metricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MetricsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Metrics metrics = this.metrics_;
                return metrics == null ? Metrics.getDefaultInstance() : metrics;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public State getState() {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (State) singleFieldBuilderV3.getMessage();
                }
                State state = this.state_;
                return state == null ? State.getDefaultInstance() : state;
            }

            public State.Builder getStateBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (State.Builder) getStateFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public StateOrBuilder getStateOrBuilder() {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                State state = this.state_;
                return state == null ? State.getDefaultInstance() : state;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public CalibrationStatus getTiltCalibration() {
                SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> singleFieldBuilderV3 = this.tiltCalibrationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalibrationStatus) singleFieldBuilderV3.getMessage();
                }
                CalibrationStatus calibrationStatus = this.tiltCalibration_;
                return calibrationStatus == null ? CalibrationStatus.getDefaultInstance() : calibrationStatus;
            }

            public CalibrationStatus.Builder getTiltCalibrationBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CalibrationStatus.Builder) getTiltCalibrationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public CalibrationStatusOrBuilder getTiltCalibrationOrBuilder() {
                SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> singleFieldBuilderV3 = this.tiltCalibrationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalibrationStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CalibrationStatus calibrationStatus = this.tiltCalibration_;
                return calibrationStatus == null ? CalibrationStatus.getDefaultInstance() : calibrationStatus;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public boolean hasError() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public boolean hasHoleFindStatus() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public boolean hasMetrics() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.AlertDetailsOrBuilder
            public boolean hasTiltCalibration() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_AlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertDetails.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeError(Error error) {
                Error error2;
                SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(error);
                } else if ((this.bitField0_ & 4) == 0 || (error2 = this.error_) == null || error2 == Error.getDefaultInstance()) {
                    this.error_ = error;
                } else {
                    getErrorBuilder().mergeFrom(error);
                }
                if (this.error_ != null) {
                    this.bitField0_ |= 4;
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
                                    codedInputStream.readMessage(getStateFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getMetricsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getErrorFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getTiltCalibrationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getHoleFindStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeHoleFindStatus(HoleFindStatus holeFindStatus) {
                HoleFindStatus holeFindStatus2;
                SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> singleFieldBuilderV3 = this.holeFindStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(holeFindStatus);
                } else if ((this.bitField0_ & 16) == 0 || (holeFindStatus2 = this.holeFindStatus_) == null || holeFindStatus2 == HoleFindStatus.getDefaultInstance()) {
                    this.holeFindStatus_ = holeFindStatus;
                } else {
                    getHoleFindStatusBuilder().mergeFrom(holeFindStatus);
                }
                if (this.holeFindStatus_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMetrics(Metrics metrics) {
                Metrics metrics2;
                SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> singleFieldBuilderV3 = this.metricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(metrics);
                } else if ((this.bitField0_ & 2) == 0 || (metrics2 = this.metrics_) == null || metrics2 == Metrics.getDefaultInstance()) {
                    this.metrics_ = metrics;
                } else {
                    getMetricsBuilder().mergeFrom(metrics);
                }
                if (this.metrics_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeState(State state) {
                State state2;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(state);
                } else if ((this.bitField0_ & 1) == 0 || (state2 = this.state_) == null || state2 == State.getDefaultInstance()) {
                    this.state_ = state;
                } else {
                    getStateBuilder().mergeFrom(state);
                }
                if (this.state_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTiltCalibration(CalibrationStatus calibrationStatus) {
                CalibrationStatus calibrationStatus2;
                SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> singleFieldBuilderV3 = this.tiltCalibrationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(calibrationStatus);
                } else if ((this.bitField0_ & 8) == 0 || (calibrationStatus2 = this.tiltCalibration_) == null || calibrationStatus2 == CalibrationStatus.getDefaultInstance()) {
                    this.tiltCalibration_ = calibrationStatus;
                } else {
                    getTiltCalibrationBuilder().mergeFrom(calibrationStatus);
                }
                if (this.tiltCalibration_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setError(Error.Builder builder) {
                SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.error_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHoleFindStatus(HoleFindStatus.Builder builder) {
                SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> singleFieldBuilderV3 = this.holeFindStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.holeFindStatus_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMetrics(Metrics.Builder builder) {
                SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> singleFieldBuilderV3 = this.metricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.metrics_ = builder.build();
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

            public Builder setState(State.Builder builder) {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.state_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTiltCalibration(CalibrationStatus.Builder builder) {
                SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> singleFieldBuilderV3 = this.tiltCalibrationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tiltCalibration_ = builder.build();
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
            public AlertDetails getDefaultInstanceForType() {
                return AlertDetails.getDefaultInstance();
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

            public Builder setError(Error error) {
                SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                if (singleFieldBuilderV3 == null) {
                    error.getClass();
                    this.error_ = error;
                } else {
                    singleFieldBuilderV3.setMessage(error);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setHoleFindStatus(HoleFindStatus holeFindStatus) {
                SingleFieldBuilderV3<HoleFindStatus, HoleFindStatus.Builder, HoleFindStatusOrBuilder> singleFieldBuilderV3 = this.holeFindStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    holeFindStatus.getClass();
                    this.holeFindStatus_ = holeFindStatus;
                } else {
                    singleFieldBuilderV3.setMessage(holeFindStatus);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMetrics(Metrics metrics) {
                SingleFieldBuilderV3<Metrics, Metrics.Builder, MetricsOrBuilder> singleFieldBuilderV3 = this.metricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    metrics.getClass();
                    this.metrics_ = metrics;
                } else {
                    singleFieldBuilderV3.setMessage(metrics);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setState(State state) {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    state.getClass();
                    this.state_ = state;
                } else {
                    singleFieldBuilderV3.setMessage(state);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTiltCalibration(CalibrationStatus calibrationStatus) {
                SingleFieldBuilderV3<CalibrationStatus, CalibrationStatus.Builder, CalibrationStatusOrBuilder> singleFieldBuilderV3 = this.tiltCalibrationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calibrationStatus.getClass();
                    this.tiltCalibration_ = calibrationStatus;
                } else {
                    singleFieldBuilderV3.setMessage(calibrationStatus);
                }
                this.bitField0_ |= 8;
                onChanged();
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

            public Builder mergeFrom(AlertDetails alertDetails) {
                if (alertDetails == AlertDetails.getDefaultInstance()) {
                    return this;
                }
                if (alertDetails.hasState()) {
                    mergeState(alertDetails.getState());
                }
                if (alertDetails.hasMetrics()) {
                    mergeMetrics(alertDetails.getMetrics());
                }
                if (alertDetails.hasError()) {
                    mergeError(alertDetails.getError());
                }
                if (alertDetails.hasTiltCalibration()) {
                    mergeTiltCalibration(alertDetails.getTiltCalibration());
                }
                if (alertDetails.hasHoleFindStatus()) {
                    mergeHoleFindStatus(alertDetails.getHoleFindStatus());
                }
                mergeUnknownFields(alertDetails.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlertDetails getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AlertDetails(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AlertDetails() {
            this.memoizedIsInitialized = (byte) -1;
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

        public static AlertDetails parseFrom(CodedInputStream codedInputStream) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class BallMetrics extends GeneratedMessageV3 implements BallMetricsOrBuilder {
        public static final int BALL_SPEED_FIELD_NUMBER = 3;
        public static final int GOLF_BALL_TYPE_FIELD_NUMBER = 7;
        public static final int LAUNCH_ANGLE_FIELD_NUMBER = 1;
        public static final int LAUNCH_DIRECTION_FIELD_NUMBER = 2;
        public static final int LAUNCH_SPEED_TYPE_FIELD_NUMBER = 8;
        public static final int SPIN_AXIS_FIELD_NUMBER = 4;
        public static final int SPIN_CALCULATION_TYPE_FIELD_NUMBER = 6;
        public static final int TOTAL_SPIN_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private float ballSpeed_;
        private int bitField0_;
        private int golfBallType_;
        private float launchAngle_;
        private float launchDirection_;
        private int launchSpeedType_;
        private byte memoizedIsInitialized;
        private float spinAxis_;
        private int spinCalculationType_;
        private float totalSpin_;
        private static final BallMetrics DEFAULT_INSTANCE = new BallMetrics();

        @Deprecated
        public static final Parser<BallMetrics> PARSER = new AbstractParser<BallMetrics>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.BallMetrics.1
            @Override // com.google.protobuf.Parser
            public BallMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = BallMetrics.newBuilder();
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

        private BallMetrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.launchAngle_ = 0.0f;
            this.launchDirection_ = 0.0f;
            this.ballSpeed_ = 0.0f;
            this.spinAxis_ = 0.0f;
            this.totalSpin_ = 0.0f;
            this.spinCalculationType_ = 0;
            this.golfBallType_ = 0;
            this.launchSpeedType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BallMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_BallMetrics_descriptor;
        }

        public static Builder newBuilder(BallMetrics ballMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ballMetrics);
        }

        public static BallMetrics parseDelimitedFrom(InputStream inputStream) {
            return (BallMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BallMetrics parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<BallMetrics> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BallMetrics)) {
                return super.equals(obj);
            }
            BallMetrics ballMetrics = (BallMetrics) obj;
            if (hasLaunchAngle() != ballMetrics.hasLaunchAngle()) {
                return false;
            }
            if ((hasLaunchAngle() && Float.floatToIntBits(getLaunchAngle()) != Float.floatToIntBits(ballMetrics.getLaunchAngle())) || hasLaunchDirection() != ballMetrics.hasLaunchDirection()) {
                return false;
            }
            if ((hasLaunchDirection() && Float.floatToIntBits(getLaunchDirection()) != Float.floatToIntBits(ballMetrics.getLaunchDirection())) || hasBallSpeed() != ballMetrics.hasBallSpeed()) {
                return false;
            }
            if ((hasBallSpeed() && Float.floatToIntBits(getBallSpeed()) != Float.floatToIntBits(ballMetrics.getBallSpeed())) || hasSpinAxis() != ballMetrics.hasSpinAxis()) {
                return false;
            }
            if ((hasSpinAxis() && Float.floatToIntBits(getSpinAxis()) != Float.floatToIntBits(ballMetrics.getSpinAxis())) || hasTotalSpin() != ballMetrics.hasTotalSpin()) {
                return false;
            }
            if ((hasTotalSpin() && Float.floatToIntBits(getTotalSpin()) != Float.floatToIntBits(ballMetrics.getTotalSpin())) || hasSpinCalculationType() != ballMetrics.hasSpinCalculationType()) {
                return false;
            }
            if ((hasSpinCalculationType() && this.spinCalculationType_ != ballMetrics.spinCalculationType_) || hasGolfBallType() != ballMetrics.hasGolfBallType()) {
                return false;
            }
            if ((!hasGolfBallType() || this.golfBallType_ == ballMetrics.golfBallType_) && hasLaunchSpeedType() == ballMetrics.hasLaunchSpeedType()) {
                return (!hasLaunchSpeedType() || this.launchSpeedType_ == ballMetrics.launchSpeedType_) && getUnknownFields().equals(ballMetrics.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public float getBallSpeed() {
            return this.ballSpeed_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public GolfBallType getGolfBallType() {
            GolfBallType golfBallTypeForNumber = GolfBallType.forNumber(this.golfBallType_);
            return golfBallTypeForNumber == null ? GolfBallType.UNKNOWN : golfBallTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public float getLaunchAngle() {
            return this.launchAngle_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public float getLaunchDirection() {
            return this.launchDirection_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public LaunchSpeedType getLaunchSpeedType() {
            LaunchSpeedType launchSpeedTypeForNumber = LaunchSpeedType.forNumber(this.launchSpeedType_);
            return launchSpeedTypeForNumber == null ? LaunchSpeedType.LAUNCH_SPEED_MEASURED : launchSpeedTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BallMetrics> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.launchAngle_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.launchDirection_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.ballSpeed_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.spinAxis_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(5, this.totalSpin_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFloatSize += CodedOutputStream.computeEnumSize(6, this.spinCalculationType_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeFloatSize += CodedOutputStream.computeEnumSize(7, this.golfBallType_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeFloatSize += CodedOutputStream.computeEnumSize(8, this.launchSpeedType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public float getSpinAxis() {
            return this.spinAxis_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public SpinCalculationType getSpinCalculationType() {
            SpinCalculationType spinCalculationTypeForNumber = SpinCalculationType.forNumber(this.spinCalculationType_);
            return spinCalculationTypeForNumber == null ? SpinCalculationType.RATIO : spinCalculationTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public float getTotalSpin() {
            return this.totalSpin_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public boolean hasBallSpeed() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public boolean hasGolfBallType() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public boolean hasLaunchAngle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public boolean hasLaunchDirection() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public boolean hasLaunchSpeedType() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public boolean hasSpinAxis() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public boolean hasSpinCalculationType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
        public boolean hasTotalSpin() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLaunchAngle()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getLaunchAngle());
            }
            if (hasLaunchDirection()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getLaunchDirection());
            }
            if (hasBallSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getBallSpeed());
            }
            if (hasSpinAxis()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getSpinAxis());
            }
            if (hasTotalSpin()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getTotalSpin());
            }
            if (hasSpinCalculationType()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + this.spinCalculationType_;
            }
            if (hasGolfBallType()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + this.golfBallType_;
            }
            if (hasLaunchSpeedType()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + this.launchSpeedType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_BallMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(BallMetrics.class, Builder.class);
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
            return new BallMetrics();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.launchAngle_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.launchDirection_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.ballSpeed_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.spinAxis_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.totalSpin_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(6, this.spinCalculationType_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeEnum(7, this.golfBallType_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeEnum(8, this.launchSpeedType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BallMetricsOrBuilder {
            private float ballSpeed_;
            private int bitField0_;
            private int golfBallType_;
            private float launchAngle_;
            private float launchDirection_;
            private int launchSpeedType_;
            private float spinAxis_;
            private int spinCalculationType_;
            private float totalSpin_;

            private Builder() {
                this.spinCalculationType_ = 0;
                this.golfBallType_ = 0;
                this.launchSpeedType_ = 0;
            }

            private void buildPartial0(BallMetrics ballMetrics) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    ballMetrics.launchAngle_ = this.launchAngle_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    ballMetrics.launchDirection_ = this.launchDirection_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    ballMetrics.ballSpeed_ = this.ballSpeed_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    ballMetrics.spinAxis_ = this.spinAxis_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    ballMetrics.totalSpin_ = this.totalSpin_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    ballMetrics.spinCalculationType_ = this.spinCalculationType_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    ballMetrics.golfBallType_ = this.golfBallType_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    ballMetrics.launchSpeedType_ = this.launchSpeedType_;
                    i14 |= 128;
                }
                ballMetrics.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_BallMetrics_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BallMetrics build() {
                BallMetrics ballMetricsBuildPartial = buildPartial();
                if (ballMetricsBuildPartial.isInitialized()) {
                    return ballMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ballMetricsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BallMetrics buildPartial() {
                BallMetrics ballMetrics = new BallMetrics(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(ballMetrics);
                }
                onBuilt();
                return ballMetrics;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.launchAngle_ = 0.0f;
                this.launchDirection_ = 0.0f;
                this.ballSpeed_ = 0.0f;
                this.spinAxis_ = 0.0f;
                this.totalSpin_ = 0.0f;
                this.spinCalculationType_ = 0;
                this.golfBallType_ = 0;
                this.launchSpeedType_ = 0;
                return this;
            }

            public Builder clearBallSpeed() {
                this.bitField0_ &= -5;
                this.ballSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGolfBallType() {
                this.bitField0_ &= -65;
                this.golfBallType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLaunchAngle() {
                this.bitField0_ &= -2;
                this.launchAngle_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearLaunchDirection() {
                this.bitField0_ &= -3;
                this.launchDirection_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearLaunchSpeedType() {
                this.bitField0_ &= -129;
                this.launchSpeedType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSpinAxis() {
                this.bitField0_ &= -9;
                this.spinAxis_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearSpinCalculationType() {
                this.bitField0_ &= -33;
                this.spinCalculationType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalSpin() {
                this.bitField0_ &= -17;
                this.totalSpin_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public float getBallSpeed() {
                return this.ballSpeed_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_BallMetrics_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public GolfBallType getGolfBallType() {
                GolfBallType golfBallTypeForNumber = GolfBallType.forNumber(this.golfBallType_);
                return golfBallTypeForNumber == null ? GolfBallType.UNKNOWN : golfBallTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public float getLaunchAngle() {
                return this.launchAngle_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public float getLaunchDirection() {
                return this.launchDirection_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public LaunchSpeedType getLaunchSpeedType() {
                LaunchSpeedType launchSpeedTypeForNumber = LaunchSpeedType.forNumber(this.launchSpeedType_);
                return launchSpeedTypeForNumber == null ? LaunchSpeedType.LAUNCH_SPEED_MEASURED : launchSpeedTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public float getSpinAxis() {
                return this.spinAxis_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public SpinCalculationType getSpinCalculationType() {
                SpinCalculationType spinCalculationTypeForNumber = SpinCalculationType.forNumber(this.spinCalculationType_);
                return spinCalculationTypeForNumber == null ? SpinCalculationType.RATIO : spinCalculationTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public float getTotalSpin() {
                return this.totalSpin_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public boolean hasBallSpeed() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public boolean hasGolfBallType() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public boolean hasLaunchAngle() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public boolean hasLaunchDirection() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public boolean hasLaunchSpeedType() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public boolean hasSpinAxis() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public boolean hasSpinCalculationType() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.BallMetricsOrBuilder
            public boolean hasTotalSpin() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_BallMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(BallMetrics.class, Builder.class);
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
                                if (tag == 13) {
                                    this.launchAngle_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.launchDirection_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.ballSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                } else if (tag == 37) {
                                    this.spinAxis_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.totalSpin_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SpinCalculationType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(6, i14);
                                    } else {
                                        this.spinCalculationType_ = i14;
                                        this.bitField0_ |= 32;
                                    }
                                } else if (tag == 56) {
                                    int i15 = codedInputStream.readEnum();
                                    if (GolfBallType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(7, i15);
                                    } else {
                                        this.golfBallType_ = i15;
                                        this.bitField0_ |= 64;
                                    }
                                } else if (tag == 64) {
                                    int i16 = codedInputStream.readEnum();
                                    if (LaunchSpeedType.forNumber(i16) == null) {
                                        mergeUnknownVarintField(8, i16);
                                    } else {
                                        this.launchSpeedType_ = i16;
                                        this.bitField0_ |= 128;
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

            public Builder setBallSpeed(float f14) {
                this.ballSpeed_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGolfBallType(GolfBallType golfBallType) {
                golfBallType.getClass();
                this.bitField0_ |= 64;
                this.golfBallType_ = golfBallType.getNumber();
                onChanged();
                return this;
            }

            public Builder setLaunchAngle(float f14) {
                this.launchAngle_ = f14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLaunchDirection(float f14) {
                this.launchDirection_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLaunchSpeedType(LaunchSpeedType launchSpeedType) {
                launchSpeedType.getClass();
                this.bitField0_ |= 128;
                this.launchSpeedType_ = launchSpeedType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSpinAxis(float f14) {
                this.spinAxis_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSpinCalculationType(SpinCalculationType spinCalculationType) {
                spinCalculationType.getClass();
                this.bitField0_ |= 32;
                this.spinCalculationType_ = spinCalculationType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTotalSpin(float f14) {
                this.totalSpin_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BallMetrics getDefaultInstanceForType() {
                return BallMetrics.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.spinCalculationType_ = 0;
                this.golfBallType_ = 0;
                this.launchSpeedType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BallMetrics) {
                    return mergeFrom((BallMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BallMetrics ballMetrics) {
                if (ballMetrics == BallMetrics.getDefaultInstance()) {
                    return this;
                }
                if (ballMetrics.hasLaunchAngle()) {
                    setLaunchAngle(ballMetrics.getLaunchAngle());
                }
                if (ballMetrics.hasLaunchDirection()) {
                    setLaunchDirection(ballMetrics.getLaunchDirection());
                }
                if (ballMetrics.hasBallSpeed()) {
                    setBallSpeed(ballMetrics.getBallSpeed());
                }
                if (ballMetrics.hasSpinAxis()) {
                    setSpinAxis(ballMetrics.getSpinAxis());
                }
                if (ballMetrics.hasTotalSpin()) {
                    setTotalSpin(ballMetrics.getTotalSpin());
                }
                if (ballMetrics.hasSpinCalculationType()) {
                    setSpinCalculationType(ballMetrics.getSpinCalculationType());
                }
                if (ballMetrics.hasGolfBallType()) {
                    setGolfBallType(ballMetrics.getGolfBallType());
                }
                if (ballMetrics.hasLaunchSpeedType()) {
                    setLaunchSpeedType(ballMetrics.getLaunchSpeedType());
                }
                mergeUnknownFields(ballMetrics.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BallMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static BallMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BallMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BallMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BallMetrics parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BallMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BallMetrics parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BallMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BallMetrics parseFrom(InputStream inputStream) {
            return (BallMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static BallMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BallMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BallMetrics parseFrom(CodedInputStream codedInputStream) {
            return (BallMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static BallMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BallMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum GolfBallType implements ProtocolMessageEnum {
            UNKNOWN(0),
            CONVENTIONAL(1),
            MARKED(2);

            public static final int CONVENTIONAL_VALUE = 1;
            public static final int MARKED_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<GolfBallType> internalValueMap = new Internal.EnumLiteMap<GolfBallType>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.BallMetrics.GolfBallType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GolfBallType findValueByNumber(int i14) {
                    return GolfBallType.forNumber(i14);
                }
            };
            private static final GolfBallType[] VALUES = values();

            GolfBallType(int i14) {
                this.value = i14;
            }

            public static GolfBallType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return CONVENTIONAL;
                }
                if (i14 != 2) {
                    return null;
                }
                return MARKED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return BallMetrics.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<GolfBallType> internalGetValueMap() {
                return internalValueMap;
            }

            public static GolfBallType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static GolfBallType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum LaunchSpeedType implements ProtocolMessageEnum {
            LAUNCH_SPEED_MEASURED(0),
            LAUNCH_SPEED_ESTIMATED(1);

            public static final int LAUNCH_SPEED_ESTIMATED_VALUE = 1;
            public static final int LAUNCH_SPEED_MEASURED_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<LaunchSpeedType> internalValueMap = new Internal.EnumLiteMap<LaunchSpeedType>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.BallMetrics.LaunchSpeedType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public LaunchSpeedType findValueByNumber(int i14) {
                    return LaunchSpeedType.forNumber(i14);
                }
            };
            private static final LaunchSpeedType[] VALUES = values();

            LaunchSpeedType(int i14) {
                this.value = i14;
            }

            public static LaunchSpeedType forNumber(int i14) {
                if (i14 == 0) {
                    return LAUNCH_SPEED_MEASURED;
                }
                if (i14 != 1) {
                    return null;
                }
                return LAUNCH_SPEED_ESTIMATED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return BallMetrics.getDescriptor().getEnumTypes().get(2);
            }

            public static Internal.EnumLiteMap<LaunchSpeedType> internalGetValueMap() {
                return internalValueMap;
            }

            public static LaunchSpeedType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static LaunchSpeedType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum SpinCalculationType implements ProtocolMessageEnum {
            RATIO(0),
            BALL_FLIGHT(1),
            OTHER(2),
            MEASURED(3);

            public static final int BALL_FLIGHT_VALUE = 1;
            public static final int MEASURED_VALUE = 3;
            public static final int OTHER_VALUE = 2;
            public static final int RATIO_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<SpinCalculationType> internalValueMap = new Internal.EnumLiteMap<SpinCalculationType>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.BallMetrics.SpinCalculationType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SpinCalculationType findValueByNumber(int i14) {
                    return SpinCalculationType.forNumber(i14);
                }
            };
            private static final SpinCalculationType[] VALUES = values();

            SpinCalculationType(int i14) {
                this.value = i14;
            }

            public static SpinCalculationType forNumber(int i14) {
                if (i14 == 0) {
                    return RATIO;
                }
                if (i14 == 1) {
                    return BALL_FLIGHT;
                }
                if (i14 == 2) {
                    return OTHER;
                }
                if (i14 != 3) {
                    return null;
                }
                return MEASURED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return BallMetrics.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SpinCalculationType> internalGetValueMap() {
                return internalValueMap;
            }

            public static SpinCalculationType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SpinCalculationType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public /* synthetic */ BallMetrics(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private BallMetrics() {
            this.launchAngle_ = 0.0f;
            this.launchDirection_ = 0.0f;
            this.ballSpeed_ = 0.0f;
            this.spinAxis_ = 0.0f;
            this.totalSpin_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.spinCalculationType_ = 0;
            this.golfBallType_ = 0;
            this.launchSpeedType_ = 0;
        }
    }

    public static final class CalibrationStatus extends GeneratedMessageV3 implements CalibrationStatusOrBuilder {
        private static final CalibrationStatus DEFAULT_INSTANCE = new CalibrationStatus();

        @Deprecated
        public static final Parser<CalibrationStatus> PARSER = new AbstractParser<CalibrationStatus>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatus.1
            @Override // com.google.protobuf.Parser
            public CalibrationStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalibrationStatus.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;
        private int status_;

        private CalibrationStatus(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalibrationStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_descriptor;
        }

        public static Builder newBuilder(CalibrationStatus calibrationStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calibrationStatus);
        }

        public static CalibrationStatus parseDelimitedFrom(InputStream inputStream) {
            return (CalibrationStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalibrationStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalibrationStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalibrationStatus)) {
                return super.equals(obj);
            }
            CalibrationStatus calibrationStatus = (CalibrationStatus) obj;
            if (hasStatus() != calibrationStatus.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == calibrationStatus.status_) && hasResult() == calibrationStatus.hasResult()) {
                return (!hasResult() || this.result_ == calibrationStatus.result_) && getUnknownFields().equals(calibrationStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalibrationStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatusOrBuilder
        public CalibrationResult getResult() {
            CalibrationResult calibrationResultForNumber = CalibrationResult.forNumber(this.result_);
            return calibrationResultForNumber == null ? CalibrationResult.SUCCESS : calibrationResultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.result_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatusOrBuilder
        public StatusType getStatus() {
            StatusType statusTypeForNumber = StatusType.forNumber(this.status_);
            return statusTypeForNumber == null ? StatusType.IN_BOUNDS : statusTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatusOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatusOrBuilder
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
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(CalibrationStatus.class, Builder.class);
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
            return new CalibrationStatus();
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
                codedOutputStream.writeEnum(2, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalibrationStatusOrBuilder {
            private int bitField0_;
            private int result_;
            private int status_;

            private Builder() {
                this.status_ = 1;
                this.result_ = 0;
            }

            private void buildPartial0(CalibrationStatus calibrationStatus) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    calibrationStatus.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    calibrationStatus.result_ = this.result_;
                    i14 |= 2;
                }
                calibrationStatus.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalibrationStatus build() {
                CalibrationStatus calibrationStatusBuildPartial = buildPartial();
                if (calibrationStatusBuildPartial.isInitialized()) {
                    return calibrationStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calibrationStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalibrationStatus buildPartial() {
                CalibrationStatus calibrationStatus = new CalibrationStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(calibrationStatus);
                }
                onBuilt();
                return calibrationStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
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
                this.bitField0_ &= -3;
                this.result_ = 0;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatusOrBuilder
            public CalibrationResult getResult() {
                CalibrationResult calibrationResultForNumber = CalibrationResult.forNumber(this.result_);
                return calibrationResultForNumber == null ? CalibrationResult.SUCCESS : calibrationResultForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatusOrBuilder
            public StatusType getStatus() {
                StatusType statusTypeForNumber = StatusType.forNumber(this.status_);
                return statusTypeForNumber == null ? StatusType.IN_BOUNDS : statusTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatusOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatusOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_CalibrationStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(CalibrationStatus.class, Builder.class);
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
                                    if (StatusType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (CalibrationResult.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.result_ = i15;
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

            public Builder setResult(CalibrationResult calibrationResult) {
                calibrationResult.getClass();
                this.bitField0_ |= 2;
                this.result_ = calibrationResult.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatus(StatusType statusType) {
                statusType.getClass();
                this.bitField0_ |= 1;
                this.status_ = statusType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalibrationStatus getDefaultInstanceForType() {
                return CalibrationStatus.getDefaultInstance();
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
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalibrationStatus) {
                    return mergeFrom((CalibrationStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalibrationStatus calibrationStatus) {
                if (calibrationStatus == CalibrationStatus.getDefaultInstance()) {
                    return this;
                }
                if (calibrationStatus.hasStatus()) {
                    setStatus(calibrationStatus.getStatus());
                }
                if (calibrationStatus.hasResult()) {
                    setResult(calibrationStatus.getResult());
                }
                mergeUnknownFields(calibrationStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalibrationStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CalibrationStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalibrationStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalibrationStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalibrationStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalibrationStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ CalibrationStatus(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CalibrationStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private CalibrationStatus() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
            this.result_ = 0;
        }

        public static CalibrationStatus parseFrom(InputStream inputStream) {
            return (CalibrationStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalibrationStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalibrationStatus parseFrom(CodedInputStream codedInputStream) {
            return (CalibrationStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalibrationStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum CalibrationResult implements ProtocolMessageEnum {
            SUCCESS(0),
            ERROR(1),
            UNIT_MOVING(2);

            public static final int ERROR_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            public static final int UNIT_MOVING_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<CalibrationResult> internalValueMap = new Internal.EnumLiteMap<CalibrationResult>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatus.CalibrationResult.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CalibrationResult findValueByNumber(int i14) {
                    return CalibrationResult.forNumber(i14);
                }
            };
            private static final CalibrationResult[] VALUES = values();

            CalibrationResult(int i14) {
                this.value = i14;
            }

            public static CalibrationResult forNumber(int i14) {
                if (i14 == 0) {
                    return SUCCESS;
                }
                if (i14 == 1) {
                    return ERROR;
                }
                if (i14 != 2) {
                    return null;
                }
                return UNIT_MOVING;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CalibrationStatus.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<CalibrationResult> internalGetValueMap() {
                return internalValueMap;
            }

            public static CalibrationResult valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static CalibrationResult valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum StatusType implements ProtocolMessageEnum {
            IN_BOUNDS(1),
            RECALIBRATION_SUGGESTED(2),
            RECALIBRATION_REQUIRED(3);

            public static final int IN_BOUNDS_VALUE = 1;
            public static final int RECALIBRATION_REQUIRED_VALUE = 3;
            public static final int RECALIBRATION_SUGGESTED_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<StatusType> internalValueMap = new Internal.EnumLiteMap<StatusType>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.CalibrationStatus.StatusType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public StatusType findValueByNumber(int i14) {
                    return StatusType.forNumber(i14);
                }
            };
            private static final StatusType[] VALUES = values();

            StatusType(int i14) {
                this.value = i14;
            }

            public static StatusType forNumber(int i14) {
                if (i14 == 1) {
                    return IN_BOUNDS;
                }
                if (i14 == 2) {
                    return RECALIBRATION_SUGGESTED;
                }
                if (i14 != 3) {
                    return null;
                }
                return RECALIBRATION_REQUIRED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CalibrationStatus.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<StatusType> internalGetValueMap() {
                return internalValueMap;
            }

            public static StatusType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static StatusType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Error extends GeneratedMessageV3 implements ErrorOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int DEVICETILT_FIELD_NUMBER = 3;
        public static final int SEVERITY_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private Tilt deviceTilt_;
        private byte memoizedIsInitialized;
        private int severity_;
        private static final Error DEFAULT_INSTANCE = new Error();

        @Deprecated
        public static final Parser<Error> PARSER = new AbstractParser<Error>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.Error.1
            @Override // com.google.protobuf.Parser
            public Error parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Error.newBuilder();
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

        private Error(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.code_ = 0;
            this.severity_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Error_descriptor;
        }

        public static Builder newBuilder(Error error) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream) {
            return (Error) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Error> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return super.equals(obj);
            }
            Error error = (Error) obj;
            if (hasCode() != error.hasCode()) {
                return false;
            }
            if ((hasCode() && this.code_ != error.code_) || hasSeverity() != error.hasSeverity()) {
                return false;
            }
            if ((!hasSeverity() || this.severity_ == error.severity_) && hasDeviceTilt() == error.hasDeviceTilt()) {
                return (!hasDeviceTilt() || getDeviceTilt().equals(error.getDeviceTilt())) && getUnknownFields().equals(error.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
        public ErrorCode getCode() {
            ErrorCode errorCodeForNumber = ErrorCode.forNumber(this.code_);
            return errorCodeForNumber == null ? ErrorCode.UNKNOWN : errorCodeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
        public Tilt getDeviceTilt() {
            Tilt tilt = this.deviceTilt_;
            return tilt == null ? Tilt.getDefaultInstance() : tilt;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
        public TiltOrBuilder getDeviceTiltOrBuilder() {
            Tilt tilt = this.deviceTilt_;
            return tilt == null ? Tilt.getDefaultInstance() : tilt;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Error> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.code_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.severity_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getDeviceTilt());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
        public Severity getSeverity() {
            Severity severityForNumber = Severity.forNumber(this.severity_);
            return severityForNumber == null ? Severity.WARNING : severityForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
        public boolean hasDeviceTilt() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
        public boolean hasSeverity() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.code_;
            }
            if (hasSeverity()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.severity_;
            }
            if (hasDeviceTilt()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDeviceTilt().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
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
            return new Error();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.code_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.severity_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getDeviceTilt());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ErrorOrBuilder {
            private int bitField0_;
            private int code_;
            private SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> deviceTiltBuilder_;
            private Tilt deviceTilt_;
            private int severity_;

            private Builder() {
                this.code_ = 0;
                this.severity_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Error error) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    error.code_ = this.code_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    error.severity_ = this.severity_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.deviceTiltBuilder_;
                    error.deviceTilt_ = singleFieldBuilderV3 == null ? this.deviceTilt_ : (Tilt) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                error.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Error_descriptor;
            }

            private SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> getDeviceTiltFieldBuilder() {
                if (this.deviceTiltBuilder_ == null) {
                    this.deviceTiltBuilder_ = new SingleFieldBuilderV3<>(getDeviceTilt(), getParentForChildren(), isClean());
                    this.deviceTilt_ = null;
                }
                return this.deviceTiltBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeviceTiltFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Error build() {
                Error errorBuildPartial = buildPartial();
                if (errorBuildPartial.isInitialized()) {
                    return errorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Error buildPartial() {
                Error error = new Error(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(error);
                }
                onBuilt();
                return error;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.code_ = 0;
                this.severity_ = 0;
                this.deviceTilt_ = null;
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.deviceTiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceTiltBuilder_ = null;
                }
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDeviceTilt() {
                this.bitField0_ &= -5;
                this.deviceTilt_ = null;
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.deviceTiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceTiltBuilder_ = null;
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

            public Builder clearSeverity() {
                this.bitField0_ &= -3;
                this.severity_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
            public ErrorCode getCode() {
                ErrorCode errorCodeForNumber = ErrorCode.forNumber(this.code_);
                return errorCodeForNumber == null ? ErrorCode.UNKNOWN : errorCodeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Error_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
            public Tilt getDeviceTilt() {
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.deviceTiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Tilt) singleFieldBuilderV3.getMessage();
                }
                Tilt tilt = this.deviceTilt_;
                return tilt == null ? Tilt.getDefaultInstance() : tilt;
            }

            public Tilt.Builder getDeviceTiltBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Tilt.Builder) getDeviceTiltFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
            public TiltOrBuilder getDeviceTiltOrBuilder() {
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.deviceTiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TiltOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Tilt tilt = this.deviceTilt_;
                return tilt == null ? Tilt.getDefaultInstance() : tilt;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
            public Severity getSeverity() {
                Severity severityForNumber = Severity.forNumber(this.severity_);
                return severityForNumber == null ? Severity.WARNING : severityForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
            public boolean hasDeviceTilt() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ErrorOrBuilder
            public boolean hasSeverity() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDeviceTilt(Tilt tilt) {
                Tilt tilt2;
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.deviceTiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(tilt);
                } else if ((this.bitField0_ & 4) == 0 || (tilt2 = this.deviceTilt_) == null || tilt2 == Tilt.getDefaultInstance()) {
                    this.deviceTilt_ = tilt;
                } else {
                    getDeviceTiltBuilder().mergeFrom(tilt);
                }
                if (this.deviceTilt_ != null) {
                    this.bitField0_ |= 4;
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
                                    if (ErrorCode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.code_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Severity.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.severity_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getDeviceTiltFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCode(ErrorCode errorCode) {
                errorCode.getClass();
                this.bitField0_ |= 1;
                this.code_ = errorCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setDeviceTilt(Tilt.Builder builder) {
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.deviceTiltBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceTilt_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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

            public Builder setSeverity(Severity severity) {
                severity.getClass();
                this.bitField0_ |= 2;
                this.severity_ = severity.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Error getDefaultInstanceForType() {
                return Error.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.code_ = 0;
                this.severity_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setDeviceTilt(Tilt tilt) {
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.deviceTiltBuilder_;
                if (singleFieldBuilderV3 == null) {
                    tilt.getClass();
                    this.deviceTilt_ = tilt;
                } else {
                    singleFieldBuilderV3.setMessage(tilt);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Error) {
                    return mergeFrom((Error) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Error error) {
                if (error == Error.getDefaultInstance()) {
                    return this;
                }
                if (error.hasCode()) {
                    setCode(error.getCode());
                }
                if (error.hasSeverity()) {
                    setSeverity(error.getSeverity());
                }
                if (error.hasDeviceTilt()) {
                    mergeDeviceTilt(error.getDeviceTilt());
                }
                mergeUnknownFields(error.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Error getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Error parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ Error(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Error parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private Error() {
            this.memoizedIsInitialized = (byte) -1;
            this.code_ = 0;
            this.severity_ = 0;
        }

        public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Error parseFrom(InputStream inputStream) {
            return (Error) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(CodedInputStream codedInputStream) {
            return (Error) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ErrorCode implements ProtocolMessageEnum {
            UNKNOWN(0),
            OVERHEATING(1),
            RADAR_SATURATION(2),
            PLATFORM_TILTED(3);

            public static final int OVERHEATING_VALUE = 1;
            public static final int PLATFORM_TILTED_VALUE = 3;
            public static final int RADAR_SATURATION_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = new Internal.EnumLiteMap<ErrorCode>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.Error.ErrorCode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ErrorCode findValueByNumber(int i14) {
                    return ErrorCode.forNumber(i14);
                }
            };
            private static final ErrorCode[] VALUES = values();

            ErrorCode(int i14) {
                this.value = i14;
            }

            public static ErrorCode forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OVERHEATING;
                }
                if (i14 == 2) {
                    return RADAR_SATURATION;
                }
                if (i14 != 3) {
                    return null;
                }
                return PLATFORM_TILTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Error.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
                return internalValueMap;
            }

            public static ErrorCode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ErrorCode valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Severity implements ProtocolMessageEnum {
            WARNING(0),
            SERIOUS(1),
            FATAL(2);

            public static final int FATAL_VALUE = 2;
            public static final int SERIOUS_VALUE = 1;
            public static final int WARNING_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Severity> internalValueMap = new Internal.EnumLiteMap<Severity>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.Error.Severity.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Severity findValueByNumber(int i14) {
                    return Severity.forNumber(i14);
                }
            };
            private static final Severity[] VALUES = values();

            Severity(int i14) {
                this.value = i14;
            }

            public static Severity forNumber(int i14) {
                if (i14 == 0) {
                    return WARNING;
                }
                if (i14 == 1) {
                    return SERIOUS;
                }
                if (i14 != 2) {
                    return null;
                }
                return FATAL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Error.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<Severity> internalGetValueMap() {
                return internalValueMap;
            }

            public static Severity valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Severity valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class HoleFindStatus extends GeneratedMessageV3 implements HoleFindStatusOrBuilder {
        private static final HoleFindStatus DEFAULT_INSTANCE = new HoleFindStatus();

        @Deprecated
        public static final Parser<HoleFindStatus> PARSER = new AbstractParser<HoleFindStatus>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatus.1
            @Override // com.google.protobuf.Parser
            public HoleFindStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HoleFindStatus.newBuilder();
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
        public static final int TRACKING_PERCENTAGE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private float trackingPercentage_;

        private HoleFindStatus(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.trackingPercentage_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HoleFindStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_descriptor;
        }

        public static Builder newBuilder(HoleFindStatus holeFindStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(holeFindStatus);
        }

        public static HoleFindStatus parseDelimitedFrom(InputStream inputStream) {
            return (HoleFindStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HoleFindStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HoleFindStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HoleFindStatus)) {
                return super.equals(obj);
            }
            HoleFindStatus holeFindStatus = (HoleFindStatus) obj;
            if (hasStatus() != holeFindStatus.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == holeFindStatus.status_) && hasTrackingPercentage() == holeFindStatus.hasTrackingPercentage()) {
                return (!hasTrackingPercentage() || Float.floatToIntBits(getTrackingPercentage()) == Float.floatToIntBits(holeFindStatus.getTrackingPercentage())) && getUnknownFields().equals(holeFindStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HoleFindStatus> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeFloatSize(2, this.trackingPercentage_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatusOrBuilder
        public StatusType getStatus() {
            StatusType statusTypeForNumber = StatusType.forNumber(this.status_);
            return statusTypeForNumber == null ? StatusType.SEARCHING : statusTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatusOrBuilder
        public float getTrackingPercentage() {
            return this.trackingPercentage_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatusOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatusOrBuilder
        public boolean hasTrackingPercentage() {
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
            if (hasTrackingPercentage()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getTrackingPercentage());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(HoleFindStatus.class, Builder.class);
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
            return new HoleFindStatus();
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
                codedOutputStream.writeFloat(2, this.trackingPercentage_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HoleFindStatusOrBuilder {
            private int bitField0_;
            private int status_;
            private float trackingPercentage_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(HoleFindStatus holeFindStatus) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    holeFindStatus.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    holeFindStatus.trackingPercentage_ = this.trackingPercentage_;
                    i14 |= 2;
                }
                holeFindStatus.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HoleFindStatus build() {
                HoleFindStatus holeFindStatusBuildPartial = buildPartial();
                if (holeFindStatusBuildPartial.isInitialized()) {
                    return holeFindStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) holeFindStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HoleFindStatus buildPartial() {
                HoleFindStatus holeFindStatus = new HoleFindStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(holeFindStatus);
                }
                onBuilt();
                return holeFindStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.trackingPercentage_ = 0.0f;
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

            public Builder clearTrackingPercentage() {
                this.bitField0_ &= -3;
                this.trackingPercentage_ = 0.0f;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatusOrBuilder
            public StatusType getStatus() {
                StatusType statusTypeForNumber = StatusType.forNumber(this.status_);
                return statusTypeForNumber == null ? StatusType.SEARCHING : statusTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatusOrBuilder
            public float getTrackingPercentage() {
                return this.trackingPercentage_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatusOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatusOrBuilder
            public boolean hasTrackingPercentage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_HoleFindStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(HoleFindStatus.class, Builder.class);
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
                                    if (StatusType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 21) {
                                    this.trackingPercentage_ = codedInputStream.readFloat();
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

            public Builder setStatus(StatusType statusType) {
                statusType.getClass();
                this.bitField0_ |= 1;
                this.status_ = statusType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTrackingPercentage(float f14) {
                this.trackingPercentage_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HoleFindStatus getDefaultInstanceForType() {
                return HoleFindStatus.getDefaultInstance();
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
                if (message instanceof HoleFindStatus) {
                    return mergeFrom((HoleFindStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HoleFindStatus holeFindStatus) {
                if (holeFindStatus == HoleFindStatus.getDefaultInstance()) {
                    return this;
                }
                if (holeFindStatus.hasStatus()) {
                    setStatus(holeFindStatus.getStatus());
                }
                if (holeFindStatus.hasTrackingPercentage()) {
                    setTrackingPercentage(holeFindStatus.getTrackingPercentage());
                }
                mergeUnknownFields(holeFindStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HoleFindStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HoleFindStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HoleFindStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HoleFindStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HoleFindStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HoleFindStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HoleFindStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ HoleFindStatus(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HoleFindStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private HoleFindStatus() {
            this.trackingPercentage_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static HoleFindStatus parseFrom(InputStream inputStream) {
            return (HoleFindStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HoleFindStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HoleFindStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HoleFindStatus parseFrom(CodedInputStream codedInputStream) {
            return (HoleFindStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HoleFindStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HoleFindStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum StatusType implements ProtocolMessageEnum {
            SEARCHING(0),
            TRACKING(1),
            FOUND(2),
            NOT_FOUND(3);

            public static final int FOUND_VALUE = 2;
            public static final int NOT_FOUND_VALUE = 3;
            public static final int SEARCHING_VALUE = 0;
            public static final int TRACKING_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<StatusType> internalValueMap = new Internal.EnumLiteMap<StatusType>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.HoleFindStatus.StatusType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public StatusType findValueByNumber(int i14) {
                    return StatusType.forNumber(i14);
                }
            };
            private static final StatusType[] VALUES = values();

            StatusType(int i14) {
                this.value = i14;
            }

            public static StatusType forNumber(int i14) {
                if (i14 == 0) {
                    return SEARCHING;
                }
                if (i14 == 1) {
                    return TRACKING;
                }
                if (i14 == 2) {
                    return FOUND;
                }
                if (i14 != 3) {
                    return null;
                }
                return NOT_FOUND;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HoleFindStatus.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<StatusType> internalGetValueMap() {
                return internalValueMap;
            }

            public static StatusType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static StatusType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Metrics extends GeneratedMessageV3 implements MetricsOrBuilder {
        public static final int BALL_METRICS_FIELD_NUMBER = 3;
        public static final int CLUB_METRICS_FIELD_NUMBER = 4;
        public static final int HOLE_POSITION_FIELD_NUMBER = 7;
        public static final int PUTT_PATH_FIELD_NUMBER = 6;
        public static final int SHOT_ID_FIELD_NUMBER = 1;
        public static final int SHOT_TYPE_FIELD_NUMBER = 2;
        public static final int STIMP_FIELD_NUMBER = 8;
        public static final int SWING_METRICS_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private BallMetrics ballMetrics_;
        private int bitField0_;
        private ClubMetrics clubMetrics_;
        private HolePosition holePosition_;
        private byte memoizedIsInitialized;
        private PuttPath puttPath_;
        private int shotId_;
        private int shotType_;
        private Stimp stimp_;
        private SwingMetrics swingMetrics_;
        private static final Metrics DEFAULT_INSTANCE = new Metrics();

        @Deprecated
        public static final Parser<Metrics> PARSER = new AbstractParser<Metrics>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.Metrics.1
            @Override // com.google.protobuf.Parser
            public Metrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Metrics.newBuilder();
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

        private Metrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.shotId_ = 0;
            this.shotType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Metrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Metrics_descriptor;
        }

        public static Builder newBuilder(Metrics metrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metrics);
        }

        public static Metrics parseDelimitedFrom(InputStream inputStream) {
            return (Metrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Metrics parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Metrics> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metrics)) {
                return super.equals(obj);
            }
            Metrics metrics = (Metrics) obj;
            if (hasShotId() != metrics.hasShotId()) {
                return false;
            }
            if ((hasShotId() && getShotId() != metrics.getShotId()) || hasShotType() != metrics.hasShotType()) {
                return false;
            }
            if ((hasShotType() && this.shotType_ != metrics.shotType_) || hasBallMetrics() != metrics.hasBallMetrics()) {
                return false;
            }
            if ((hasBallMetrics() && !getBallMetrics().equals(metrics.getBallMetrics())) || hasClubMetrics() != metrics.hasClubMetrics()) {
                return false;
            }
            if ((hasClubMetrics() && !getClubMetrics().equals(metrics.getClubMetrics())) || hasSwingMetrics() != metrics.hasSwingMetrics()) {
                return false;
            }
            if ((hasSwingMetrics() && !getSwingMetrics().equals(metrics.getSwingMetrics())) || hasPuttPath() != metrics.hasPuttPath()) {
                return false;
            }
            if ((hasPuttPath() && !getPuttPath().equals(metrics.getPuttPath())) || hasHolePosition() != metrics.hasHolePosition()) {
                return false;
            }
            if ((!hasHolePosition() || getHolePosition().equals(metrics.getHolePosition())) && hasStimp() == metrics.hasStimp()) {
                return (!hasStimp() || getStimp().equals(metrics.getStimp())) && getUnknownFields().equals(metrics.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public BallMetrics getBallMetrics() {
            BallMetrics ballMetrics = this.ballMetrics_;
            return ballMetrics == null ? BallMetrics.getDefaultInstance() : ballMetrics;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public BallMetricsOrBuilder getBallMetricsOrBuilder() {
            BallMetrics ballMetrics = this.ballMetrics_;
            return ballMetrics == null ? BallMetrics.getDefaultInstance() : ballMetrics;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public ClubMetrics getClubMetrics() {
            ClubMetrics clubMetrics = this.clubMetrics_;
            return clubMetrics == null ? ClubMetrics.getDefaultInstance() : clubMetrics;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public ClubMetricsOrBuilder getClubMetricsOrBuilder() {
            ClubMetrics clubMetrics = this.clubMetrics_;
            return clubMetrics == null ? ClubMetrics.getDefaultInstance() : clubMetrics;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public HolePosition getHolePosition() {
            HolePosition holePosition = this.holePosition_;
            return holePosition == null ? HolePosition.getDefaultInstance() : holePosition;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public HolePositionOrBuilder getHolePositionOrBuilder() {
            HolePosition holePosition = this.holePosition_;
            return holePosition == null ? HolePosition.getDefaultInstance() : holePosition;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Metrics> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public PuttPath getPuttPath() {
            PuttPath puttPath = this.puttPath_;
            return puttPath == null ? PuttPath.getDefaultInstance() : puttPath;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public PuttPathOrBuilder getPuttPathOrBuilder() {
            PuttPath puttPath = this.puttPath_;
            return puttPath == null ? PuttPath.getDefaultInstance() : puttPath;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.shotId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.shotType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getBallMetrics());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getClubMetrics());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(5, getSwingMetrics());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(6, getPuttPath());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(7, getHolePosition());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(8, getStimp());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public int getShotId() {
            return this.shotId_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public ShotType getShotType() {
            ShotType shotTypeForNumber = ShotType.forNumber(this.shotType_);
            return shotTypeForNumber == null ? ShotType.PRACTICE : shotTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public Stimp getStimp() {
            Stimp stimp = this.stimp_;
            return stimp == null ? Stimp.getDefaultInstance() : stimp;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public StimpOrBuilder getStimpOrBuilder() {
            Stimp stimp = this.stimp_;
            return stimp == null ? Stimp.getDefaultInstance() : stimp;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public SwingMetrics getSwingMetrics() {
            SwingMetrics swingMetrics = this.swingMetrics_;
            return swingMetrics == null ? SwingMetrics.getDefaultInstance() : swingMetrics;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public SwingMetricsOrBuilder getSwingMetricsOrBuilder() {
            SwingMetrics swingMetrics = this.swingMetrics_;
            return swingMetrics == null ? SwingMetrics.getDefaultInstance() : swingMetrics;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public boolean hasBallMetrics() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public boolean hasClubMetrics() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public boolean hasHolePosition() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public boolean hasPuttPath() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public boolean hasShotId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public boolean hasShotType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public boolean hasStimp() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
        public boolean hasSwingMetrics() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasShotId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShotId();
            }
            if (hasShotType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.shotType_;
            }
            if (hasBallMetrics()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getBallMetrics().hashCode();
            }
            if (hasClubMetrics()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getClubMetrics().hashCode();
            }
            if (hasSwingMetrics()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSwingMetrics().hashCode();
            }
            if (hasPuttPath()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPuttPath().hashCode();
            }
            if (hasHolePosition()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getHolePosition().hashCode();
            }
            if (hasStimp()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getStimp().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Metrics_fieldAccessorTable.ensureFieldAccessorsInitialized(Metrics.class, Builder.class);
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
            return new Metrics();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.shotId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.shotType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getBallMetrics());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getClubMetrics());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSwingMetrics());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getPuttPath());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getHolePosition());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getStimp());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricsOrBuilder {
            private SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> ballMetricsBuilder_;
            private BallMetrics ballMetrics_;
            private int bitField0_;
            private SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> clubMetricsBuilder_;
            private ClubMetrics clubMetrics_;
            private SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> holePositionBuilder_;
            private HolePosition holePosition_;
            private SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> puttPathBuilder_;
            private PuttPath puttPath_;
            private int shotId_;
            private int shotType_;
            private SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> stimpBuilder_;
            private Stimp stimp_;
            private SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> swingMetricsBuilder_;
            private SwingMetrics swingMetrics_;

            private Builder() {
                this.shotType_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Metrics metrics) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    metrics.shotId_ = this.shotId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    metrics.shotType_ = this.shotType_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> singleFieldBuilderV3 = this.ballMetricsBuilder_;
                    metrics.ballMetrics_ = singleFieldBuilderV3 == null ? this.ballMetrics_ : (BallMetrics) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> singleFieldBuilderV4 = this.clubMetricsBuilder_;
                    metrics.clubMetrics_ = singleFieldBuilderV4 == null ? this.clubMetrics_ : (ClubMetrics) singleFieldBuilderV4.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV5 = this.swingMetricsBuilder_;
                    metrics.swingMetrics_ = singleFieldBuilderV5 == null ? this.swingMetrics_ : (SwingMetrics) singleFieldBuilderV5.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> singleFieldBuilderV6 = this.puttPathBuilder_;
                    metrics.puttPath_ = singleFieldBuilderV6 == null ? this.puttPath_ : (PuttPath) singleFieldBuilderV6.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> singleFieldBuilderV7 = this.holePositionBuilder_;
                    metrics.holePosition_ = singleFieldBuilderV7 == null ? this.holePosition_ : (HolePosition) singleFieldBuilderV7.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> singleFieldBuilderV8 = this.stimpBuilder_;
                    metrics.stimp_ = singleFieldBuilderV8 == null ? this.stimp_ : (Stimp) singleFieldBuilderV8.build();
                    i14 |= 128;
                }
                metrics.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> getBallMetricsFieldBuilder() {
                if (this.ballMetricsBuilder_ == null) {
                    this.ballMetricsBuilder_ = new SingleFieldBuilderV3<>(getBallMetrics(), getParentForChildren(), isClean());
                    this.ballMetrics_ = null;
                }
                return this.ballMetricsBuilder_;
            }

            private SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> getClubMetricsFieldBuilder() {
                if (this.clubMetricsBuilder_ == null) {
                    this.clubMetricsBuilder_ = new SingleFieldBuilderV3<>(getClubMetrics(), getParentForChildren(), isClean());
                    this.clubMetrics_ = null;
                }
                return this.clubMetricsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Metrics_descriptor;
            }

            private SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> getHolePositionFieldBuilder() {
                if (this.holePositionBuilder_ == null) {
                    this.holePositionBuilder_ = new SingleFieldBuilderV3<>(getHolePosition(), getParentForChildren(), isClean());
                    this.holePosition_ = null;
                }
                return this.holePositionBuilder_;
            }

            private SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> getPuttPathFieldBuilder() {
                if (this.puttPathBuilder_ == null) {
                    this.puttPathBuilder_ = new SingleFieldBuilderV3<>(getPuttPath(), getParentForChildren(), isClean());
                    this.puttPath_ = null;
                }
                return this.puttPathBuilder_;
            }

            private SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> getStimpFieldBuilder() {
                if (this.stimpBuilder_ == null) {
                    this.stimpBuilder_ = new SingleFieldBuilderV3<>(getStimp(), getParentForChildren(), isClean());
                    this.stimp_ = null;
                }
                return this.stimpBuilder_;
            }

            private SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> getSwingMetricsFieldBuilder() {
                if (this.swingMetricsBuilder_ == null) {
                    this.swingMetricsBuilder_ = new SingleFieldBuilderV3<>(getSwingMetrics(), getParentForChildren(), isClean());
                    this.swingMetrics_ = null;
                }
                return this.swingMetricsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getBallMetricsFieldBuilder();
                    getClubMetricsFieldBuilder();
                    getSwingMetricsFieldBuilder();
                    getPuttPathFieldBuilder();
                    getHolePositionFieldBuilder();
                    getStimpFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Metrics build() {
                Metrics metricsBuildPartial = buildPartial();
                if (metricsBuildPartial.isInitialized()) {
                    return metricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Metrics buildPartial() {
                Metrics metrics = new Metrics(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(metrics);
                }
                onBuilt();
                return metrics;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.shotId_ = 0;
                this.shotType_ = 0;
                this.ballMetrics_ = null;
                SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> singleFieldBuilderV3 = this.ballMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.ballMetricsBuilder_ = null;
                }
                this.clubMetrics_ = null;
                SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> singleFieldBuilderV4 = this.clubMetricsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.clubMetricsBuilder_ = null;
                }
                this.swingMetrics_ = null;
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV5 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.swingMetricsBuilder_ = null;
                }
                this.puttPath_ = null;
                SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> singleFieldBuilderV6 = this.puttPathBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.puttPathBuilder_ = null;
                }
                this.holePosition_ = null;
                SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> singleFieldBuilderV7 = this.holePositionBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.holePositionBuilder_ = null;
                }
                this.stimp_ = null;
                SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> singleFieldBuilderV8 = this.stimpBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.stimpBuilder_ = null;
                }
                return this;
            }

            public Builder clearBallMetrics() {
                this.bitField0_ &= -5;
                this.ballMetrics_ = null;
                SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> singleFieldBuilderV3 = this.ballMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.ballMetricsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearClubMetrics() {
                this.bitField0_ &= -9;
                this.clubMetrics_ = null;
                SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> singleFieldBuilderV3 = this.clubMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.clubMetricsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHolePosition() {
                this.bitField0_ &= -65;
                this.holePosition_ = null;
                SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> singleFieldBuilderV3 = this.holePositionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.holePositionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPuttPath() {
                this.bitField0_ &= -33;
                this.puttPath_ = null;
                SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> singleFieldBuilderV3 = this.puttPathBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.puttPathBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShotId() {
                this.bitField0_ &= -2;
                this.shotId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShotType() {
                this.bitField0_ &= -3;
                this.shotType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStimp() {
                this.bitField0_ &= -129;
                this.stimp_ = null;
                SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> singleFieldBuilderV3 = this.stimpBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stimpBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwingMetrics() {
                this.bitField0_ &= -17;
                this.swingMetrics_ = null;
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.swingMetricsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public BallMetrics getBallMetrics() {
                SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> singleFieldBuilderV3 = this.ballMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BallMetrics) singleFieldBuilderV3.getMessage();
                }
                BallMetrics ballMetrics = this.ballMetrics_;
                return ballMetrics == null ? BallMetrics.getDefaultInstance() : ballMetrics;
            }

            public BallMetrics.Builder getBallMetricsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (BallMetrics.Builder) getBallMetricsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public BallMetricsOrBuilder getBallMetricsOrBuilder() {
                SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> singleFieldBuilderV3 = this.ballMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BallMetricsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BallMetrics ballMetrics = this.ballMetrics_;
                return ballMetrics == null ? BallMetrics.getDefaultInstance() : ballMetrics;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public ClubMetrics getClubMetrics() {
                SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> singleFieldBuilderV3 = this.clubMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ClubMetrics) singleFieldBuilderV3.getMessage();
                }
                ClubMetrics clubMetrics = this.clubMetrics_;
                return clubMetrics == null ? ClubMetrics.getDefaultInstance() : clubMetrics;
            }

            public ClubMetrics.Builder getClubMetricsBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ClubMetrics.Builder) getClubMetricsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public ClubMetricsOrBuilder getClubMetricsOrBuilder() {
                SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> singleFieldBuilderV3 = this.clubMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ClubMetricsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ClubMetrics clubMetrics = this.clubMetrics_;
                return clubMetrics == null ? ClubMetrics.getDefaultInstance() : clubMetrics;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Metrics_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public HolePosition getHolePosition() {
                SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> singleFieldBuilderV3 = this.holePositionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HolePosition) singleFieldBuilderV3.getMessage();
                }
                HolePosition holePosition = this.holePosition_;
                return holePosition == null ? HolePosition.getDefaultInstance() : holePosition;
            }

            public HolePosition.Builder getHolePositionBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (HolePosition.Builder) getHolePositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public HolePositionOrBuilder getHolePositionOrBuilder() {
                SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> singleFieldBuilderV3 = this.holePositionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HolePositionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HolePosition holePosition = this.holePosition_;
                return holePosition == null ? HolePosition.getDefaultInstance() : holePosition;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public PuttPath getPuttPath() {
                SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> singleFieldBuilderV3 = this.puttPathBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PuttPath) singleFieldBuilderV3.getMessage();
                }
                PuttPath puttPath = this.puttPath_;
                return puttPath == null ? PuttPath.getDefaultInstance() : puttPath;
            }

            public PuttPath.Builder getPuttPathBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (PuttPath.Builder) getPuttPathFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public PuttPathOrBuilder getPuttPathOrBuilder() {
                SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> singleFieldBuilderV3 = this.puttPathBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PuttPathOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PuttPath puttPath = this.puttPath_;
                return puttPath == null ? PuttPath.getDefaultInstance() : puttPath;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public int getShotId() {
                return this.shotId_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public ShotType getShotType() {
                ShotType shotTypeForNumber = ShotType.forNumber(this.shotType_);
                return shotTypeForNumber == null ? ShotType.PRACTICE : shotTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public Stimp getStimp() {
                SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> singleFieldBuilderV3 = this.stimpBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Stimp) singleFieldBuilderV3.getMessage();
                }
                Stimp stimp = this.stimp_;
                return stimp == null ? Stimp.getDefaultInstance() : stimp;
            }

            public Stimp.Builder getStimpBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (Stimp.Builder) getStimpFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public StimpOrBuilder getStimpOrBuilder() {
                SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> singleFieldBuilderV3 = this.stimpBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StimpOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Stimp stimp = this.stimp_;
                return stimp == null ? Stimp.getDefaultInstance() : stimp;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public SwingMetrics getSwingMetrics() {
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwingMetrics) singleFieldBuilderV3.getMessage();
                }
                SwingMetrics swingMetrics = this.swingMetrics_;
                return swingMetrics == null ? SwingMetrics.getDefaultInstance() : swingMetrics;
            }

            public SwingMetrics.Builder getSwingMetricsBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SwingMetrics.Builder) getSwingMetricsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public SwingMetricsOrBuilder getSwingMetricsOrBuilder() {
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwingMetricsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwingMetrics swingMetrics = this.swingMetrics_;
                return swingMetrics == null ? SwingMetrics.getDefaultInstance() : swingMetrics;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public boolean hasBallMetrics() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public boolean hasClubMetrics() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public boolean hasHolePosition() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public boolean hasPuttPath() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public boolean hasShotId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public boolean hasShotType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public boolean hasStimp() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.MetricsOrBuilder
            public boolean hasSwingMetrics() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Metrics_fieldAccessorTable.ensureFieldAccessorsInitialized(Metrics.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBallMetrics(BallMetrics ballMetrics) {
                BallMetrics ballMetrics2;
                SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> singleFieldBuilderV3 = this.ballMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(ballMetrics);
                } else if ((this.bitField0_ & 4) == 0 || (ballMetrics2 = this.ballMetrics_) == null || ballMetrics2 == BallMetrics.getDefaultInstance()) {
                    this.ballMetrics_ = ballMetrics;
                } else {
                    getBallMetricsBuilder().mergeFrom(ballMetrics);
                }
                if (this.ballMetrics_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeClubMetrics(ClubMetrics clubMetrics) {
                ClubMetrics clubMetrics2;
                SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> singleFieldBuilderV3 = this.clubMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(clubMetrics);
                } else if ((this.bitField0_ & 8) == 0 || (clubMetrics2 = this.clubMetrics_) == null || clubMetrics2 == ClubMetrics.getDefaultInstance()) {
                    this.clubMetrics_ = clubMetrics;
                } else {
                    getClubMetricsBuilder().mergeFrom(clubMetrics);
                }
                if (this.clubMetrics_ != null) {
                    this.bitField0_ |= 8;
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
                                    this.shotId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ShotType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.shotType_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getBallMetricsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getClubMetricsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getSwingMetricsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getPuttPathFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getHolePositionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(getStimpFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
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

            public Builder mergeHolePosition(HolePosition holePosition) {
                HolePosition holePosition2;
                SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> singleFieldBuilderV3 = this.holePositionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(holePosition);
                } else if ((this.bitField0_ & 64) == 0 || (holePosition2 = this.holePosition_) == null || holePosition2 == HolePosition.getDefaultInstance()) {
                    this.holePosition_ = holePosition;
                } else {
                    getHolePositionBuilder().mergeFrom(holePosition);
                }
                if (this.holePosition_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergePuttPath(PuttPath puttPath) {
                PuttPath puttPath2;
                SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> singleFieldBuilderV3 = this.puttPathBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(puttPath);
                } else if ((this.bitField0_ & 32) == 0 || (puttPath2 = this.puttPath_) == null || puttPath2 == PuttPath.getDefaultInstance()) {
                    this.puttPath_ = puttPath;
                } else {
                    getPuttPathBuilder().mergeFrom(puttPath);
                }
                if (this.puttPath_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStimp(Stimp stimp) {
                Stimp stimp2;
                SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> singleFieldBuilderV3 = this.stimpBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stimp);
                } else if ((this.bitField0_ & 128) == 0 || (stimp2 = this.stimp_) == null || stimp2 == Stimp.getDefaultInstance()) {
                    this.stimp_ = stimp;
                } else {
                    getStimpBuilder().mergeFrom(stimp);
                }
                if (this.stimp_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwingMetrics(SwingMetrics swingMetrics) {
                SwingMetrics swingMetrics2;
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(swingMetrics);
                } else if ((this.bitField0_ & 16) == 0 || (swingMetrics2 = this.swingMetrics_) == null || swingMetrics2 == SwingMetrics.getDefaultInstance()) {
                    this.swingMetrics_ = swingMetrics;
                } else {
                    getSwingMetricsBuilder().mergeFrom(swingMetrics);
                }
                if (this.swingMetrics_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBallMetrics(BallMetrics.Builder builder) {
                SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> singleFieldBuilderV3 = this.ballMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ballMetrics_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setClubMetrics(ClubMetrics.Builder builder) {
                SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> singleFieldBuilderV3 = this.clubMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.clubMetrics_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHolePosition(HolePosition.Builder builder) {
                SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> singleFieldBuilderV3 = this.holePositionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.holePosition_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPuttPath(PuttPath.Builder builder) {
                SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> singleFieldBuilderV3 = this.puttPathBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.puttPath_ = builder.build();
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

            public Builder setShotId(int i14) {
                this.shotId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setShotType(ShotType shotType) {
                shotType.getClass();
                this.bitField0_ |= 2;
                this.shotType_ = shotType.getNumber();
                onChanged();
                return this;
            }

            public Builder setStimp(Stimp.Builder builder) {
                SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> singleFieldBuilderV3 = this.stimpBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stimp_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSwingMetrics(SwingMetrics.Builder builder) {
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.swingMetrics_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Metrics getDefaultInstanceForType() {
                return Metrics.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shotType_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setBallMetrics(BallMetrics ballMetrics) {
                SingleFieldBuilderV3<BallMetrics, BallMetrics.Builder, BallMetricsOrBuilder> singleFieldBuilderV3 = this.ballMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    ballMetrics.getClass();
                    this.ballMetrics_ = ballMetrics;
                } else {
                    singleFieldBuilderV3.setMessage(ballMetrics);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setClubMetrics(ClubMetrics clubMetrics) {
                SingleFieldBuilderV3<ClubMetrics, ClubMetrics.Builder, ClubMetricsOrBuilder> singleFieldBuilderV3 = this.clubMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    clubMetrics.getClass();
                    this.clubMetrics_ = clubMetrics;
                } else {
                    singleFieldBuilderV3.setMessage(clubMetrics);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setHolePosition(HolePosition holePosition) {
                SingleFieldBuilderV3<HolePosition, HolePosition.Builder, HolePositionOrBuilder> singleFieldBuilderV3 = this.holePositionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    holePosition.getClass();
                    this.holePosition_ = holePosition;
                } else {
                    singleFieldBuilderV3.setMessage(holePosition);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPuttPath(PuttPath puttPath) {
                SingleFieldBuilderV3<PuttPath, PuttPath.Builder, PuttPathOrBuilder> singleFieldBuilderV3 = this.puttPathBuilder_;
                if (singleFieldBuilderV3 == null) {
                    puttPath.getClass();
                    this.puttPath_ = puttPath;
                } else {
                    singleFieldBuilderV3.setMessage(puttPath);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStimp(Stimp stimp) {
                SingleFieldBuilderV3<Stimp, Stimp.Builder, StimpOrBuilder> singleFieldBuilderV3 = this.stimpBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stimp.getClass();
                    this.stimp_ = stimp;
                } else {
                    singleFieldBuilderV3.setMessage(stimp);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSwingMetrics(SwingMetrics swingMetrics) {
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    swingMetrics.getClass();
                    this.swingMetrics_ = swingMetrics;
                } else {
                    singleFieldBuilderV3.setMessage(swingMetrics);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Metrics) {
                    return mergeFrom((Metrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Metrics metrics) {
                if (metrics == Metrics.getDefaultInstance()) {
                    return this;
                }
                if (metrics.hasShotId()) {
                    setShotId(metrics.getShotId());
                }
                if (metrics.hasShotType()) {
                    setShotType(metrics.getShotType());
                }
                if (metrics.hasBallMetrics()) {
                    mergeBallMetrics(metrics.getBallMetrics());
                }
                if (metrics.hasClubMetrics()) {
                    mergeClubMetrics(metrics.getClubMetrics());
                }
                if (metrics.hasSwingMetrics()) {
                    mergeSwingMetrics(metrics.getSwingMetrics());
                }
                if (metrics.hasPuttPath()) {
                    mergePuttPath(metrics.getPuttPath());
                }
                if (metrics.hasHolePosition()) {
                    mergeHolePosition(metrics.getHolePosition());
                }
                if (metrics.hasStimp()) {
                    mergeStimp(metrics.getStimp());
                }
                mergeUnknownFields(metrics.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Metrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Metrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Metrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Metrics parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Metrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ Metrics(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Metrics parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private Metrics() {
            this.shotId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.shotType_ = 0;
        }

        public static Metrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Metrics parseFrom(InputStream inputStream) {
            return (Metrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Metrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Metrics parseFrom(CodedInputStream codedInputStream) {
            return (Metrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Metrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ShotType implements ProtocolMessageEnum {
            PRACTICE(0),
            NORMAL(1),
            PUTT(2);

            public static final int NORMAL_VALUE = 1;
            public static final int PRACTICE_VALUE = 0;
            public static final int PUTT_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<ShotType> internalValueMap = new Internal.EnumLiteMap<ShotType>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.Metrics.ShotType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ShotType findValueByNumber(int i14) {
                    return ShotType.forNumber(i14);
                }
            };
            private static final ShotType[] VALUES = values();

            ShotType(int i14) {
                this.value = i14;
            }

            public static ShotType forNumber(int i14) {
                if (i14 == 0) {
                    return PRACTICE;
                }
                if (i14 == 1) {
                    return NORMAL;
                }
                if (i14 != 2) {
                    return null;
                }
                return PUTT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Metrics.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ShotType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ShotType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ShotType valueOf(int i14) {
                return forNumber(i14);
            }
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
        public static final Parser<ModeRequest> PARSER = new AbstractParser<ModeRequest>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ModeRequest.1
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
            this.mode_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeRequest_descriptor;
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

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ModeRequestOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.RANGE : modeForNumber;
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

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ModeRequestOrBuilder
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeRequest.class, Builder.class);
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
                this.mode_ = 1;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeRequest_descriptor;
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
                this.mode_ = 1;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMode() {
                this.bitField0_ &= -2;
                this.mode_ = 1;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ModeRequestOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.RANGE : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ModeRequestOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeRequest.class, Builder.class);
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
                this.mode_ = 1;
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
            this.mode_ = 1;
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

        public enum Mode implements ProtocolMessageEnum {
            RANGE(1),
            PUTTING(2),
            HOLEFINDING(3),
            STIMPMEASUREMENT(4);

            public static final int HOLEFINDING_VALUE = 3;
            public static final int PUTTING_VALUE = 2;
            public static final int RANGE_VALUE = 1;
            public static final int STIMPMEASUREMENT_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<Mode> internalValueMap = new Internal.EnumLiteMap<Mode>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ModeRequest.Mode.1
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
                if (i14 == 1) {
                    return RANGE;
                }
                if (i14 == 2) {
                    return PUTTING;
                }
                if (i14 == 3) {
                    return HOLEFINDING;
                }
                if (i14 != 4) {
                    return null;
                }
                return STIMPMEASUREMENT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ModeRequest.getDescriptor().getEnumTypes().get(0);
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
    }

    public static final class ModeResponse extends GeneratedMessageV3 implements ModeResponseOrBuilder {
        private static final ModeResponse DEFAULT_INSTANCE = new ModeResponse();

        @Deprecated
        public static final Parser<ModeResponse> PARSER = new AbstractParser<ModeResponse>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ModeResponse.1
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
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private ModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeResponse_descriptor;
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
            return (!hasStatus() || this.status_ == modeResponse.status_) && getUnknownFields().equals(modeResponse.getUnknownFields());
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ModeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ModeResponseOrBuilder
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeResponse.class, Builder.class);
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ModeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ModeResponse modeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    modeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                modeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeResponse_descriptor;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ModeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ModeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ModeResponse.class, Builder.class);
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

        public /* synthetic */ ModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
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

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(0),
            ALREADY_IN_MODE(1),
            ERROR(2);

            public static final int ALREADY_IN_MODE_VALUE = 1;
            public static final int ERROR_VALUE = 2;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ModeResponse.Status.1
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
                    return SUCCESS;
                }
                if (i14 == 1) {
                    return ALREADY_IN_MODE;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ModeResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class PuttPath extends GeneratedMessageV3 implements PuttPathOrBuilder {
        public static final int BREAK_AT_ENTRY_SPEED_FIELD_NUMBER = 15;
        public static final int BREAK_DIRECTION_AT_ENTRY_SPEED_FIELD_NUMBER = 16;
        public static final int ENTRY_SPEED_DISTANCE_M_FIELD_NUMBER = 14;
        public static final int EXTRAPOLATED_X_PATH_M_FIELD_NUMBER = 5;
        public static final int EXTRAPOLATED_Y_PATH_M_FIELD_NUMBER = 6;
        public static final int ROLLING_X_PATH_M_FIELD_NUMBER = 3;
        public static final int ROLLING_Y_PATH_M_FIELD_NUMBER = 4;
        public static final int ROLL_DISTANCE_M_FIELD_NUMBER = 13;
        public static final int ROLL_END_TIME_MS_FIELD_NUMBER = 8;
        public static final int ROLL_START_SPEED_FIELD_NUMBER = 11;
        public static final int ROLL_START_TIME_MS_FIELD_NUMBER = 7;
        public static final int SKIDDING_X_PATH_M_FIELD_NUMBER = 1;
        public static final int SKIDDING_Y_PATH_M_FIELD_NUMBER = 2;
        public static final int SKID_DISTANCE_M_FIELD_NUMBER = 12;
        public static final int TRACK_ENDED_EARLY_FIELD_NUMBER = 10;
        public static final int TRACK_END_TIME_MS_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private float breakAtEntrySpeed_;
        private int breakDirectionAtEntrySpeed_;
        private float entrySpeedDistanceM_;
        private int extrapolatedXPathMMemoizedSerializedSize;
        private Internal.FloatList extrapolatedXPathM_;
        private int extrapolatedYPathMMemoizedSerializedSize;
        private Internal.FloatList extrapolatedYPathM_;
        private byte memoizedIsInitialized;
        private float rollDistanceM_;
        private int rollEndTimeMs_;
        private float rollStartSpeed_;
        private int rollStartTimeMs_;
        private int rollingXPathMMemoizedSerializedSize;
        private Internal.FloatList rollingXPathM_;
        private int rollingYPathMMemoizedSerializedSize;
        private Internal.FloatList rollingYPathM_;
        private float skidDistanceM_;
        private int skiddingXPathMMemoizedSerializedSize;
        private Internal.FloatList skiddingXPathM_;
        private int skiddingYPathMMemoizedSerializedSize;
        private Internal.FloatList skiddingYPathM_;
        private int trackEndTimeMs_;
        private boolean trackEndedEarly_;
        private static final PuttPath DEFAULT_INSTANCE = new PuttPath();

        @Deprecated
        public static final Parser<PuttPath> PARSER = new AbstractParser<PuttPath>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.PuttPath.1
            @Override // com.google.protobuf.Parser
            public PuttPath parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PuttPath.newBuilder();
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

        private PuttPath() {
            this.skiddingXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.skiddingXPathMMemoizedSerializedSize = -1;
            this.skiddingYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.skiddingYPathMMemoizedSerializedSize = -1;
            this.rollingXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.rollingXPathMMemoizedSerializedSize = -1;
            this.rollingYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.rollingYPathMMemoizedSerializedSize = -1;
            this.extrapolatedXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.extrapolatedXPathMMemoizedSerializedSize = -1;
            this.extrapolatedYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.extrapolatedYPathMMemoizedSerializedSize = -1;
            this.rollStartTimeMs_ = 0;
            this.rollEndTimeMs_ = 0;
            this.trackEndTimeMs_ = 0;
            this.trackEndedEarly_ = false;
            this.rollStartSpeed_ = 0.0f;
            this.skidDistanceM_ = 0.0f;
            this.rollDistanceM_ = 0.0f;
            this.entrySpeedDistanceM_ = 0.0f;
            this.breakAtEntrySpeed_ = 0.0f;
            this.breakDirectionAtEntrySpeed_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.skiddingXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.skiddingYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.rollingXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.rollingYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.extrapolatedXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.extrapolatedYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.breakDirectionAtEntrySpeed_ = 0;
        }

        public static PuttPath getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_PuttPath_descriptor;
        }

        public static Builder newBuilder(PuttPath puttPath) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(puttPath);
        }

        public static PuttPath parseDelimitedFrom(InputStream inputStream) {
            return (PuttPath) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PuttPath parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PuttPath> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PuttPath)) {
                return super.equals(obj);
            }
            PuttPath puttPath = (PuttPath) obj;
            if (!getSkiddingXPathMList().equals(puttPath.getSkiddingXPathMList()) || !getSkiddingYPathMList().equals(puttPath.getSkiddingYPathMList()) || !getRollingXPathMList().equals(puttPath.getRollingXPathMList()) || !getRollingYPathMList().equals(puttPath.getRollingYPathMList()) || !getExtrapolatedXPathMList().equals(puttPath.getExtrapolatedXPathMList()) || !getExtrapolatedYPathMList().equals(puttPath.getExtrapolatedYPathMList()) || hasRollStartTimeMs() != puttPath.hasRollStartTimeMs()) {
                return false;
            }
            if ((hasRollStartTimeMs() && getRollStartTimeMs() != puttPath.getRollStartTimeMs()) || hasRollEndTimeMs() != puttPath.hasRollEndTimeMs()) {
                return false;
            }
            if ((hasRollEndTimeMs() && getRollEndTimeMs() != puttPath.getRollEndTimeMs()) || hasTrackEndTimeMs() != puttPath.hasTrackEndTimeMs()) {
                return false;
            }
            if ((hasTrackEndTimeMs() && getTrackEndTimeMs() != puttPath.getTrackEndTimeMs()) || hasTrackEndedEarly() != puttPath.hasTrackEndedEarly()) {
                return false;
            }
            if ((hasTrackEndedEarly() && getTrackEndedEarly() != puttPath.getTrackEndedEarly()) || hasRollStartSpeed() != puttPath.hasRollStartSpeed()) {
                return false;
            }
            if ((hasRollStartSpeed() && Float.floatToIntBits(getRollStartSpeed()) != Float.floatToIntBits(puttPath.getRollStartSpeed())) || hasSkidDistanceM() != puttPath.hasSkidDistanceM()) {
                return false;
            }
            if ((hasSkidDistanceM() && Float.floatToIntBits(getSkidDistanceM()) != Float.floatToIntBits(puttPath.getSkidDistanceM())) || hasRollDistanceM() != puttPath.hasRollDistanceM()) {
                return false;
            }
            if ((hasRollDistanceM() && Float.floatToIntBits(getRollDistanceM()) != Float.floatToIntBits(puttPath.getRollDistanceM())) || hasEntrySpeedDistanceM() != puttPath.hasEntrySpeedDistanceM()) {
                return false;
            }
            if ((hasEntrySpeedDistanceM() && Float.floatToIntBits(getEntrySpeedDistanceM()) != Float.floatToIntBits(puttPath.getEntrySpeedDistanceM())) || hasBreakAtEntrySpeed() != puttPath.hasBreakAtEntrySpeed()) {
                return false;
            }
            if ((!hasBreakAtEntrySpeed() || Float.floatToIntBits(getBreakAtEntrySpeed()) == Float.floatToIntBits(puttPath.getBreakAtEntrySpeed())) && hasBreakDirectionAtEntrySpeed() == puttPath.hasBreakDirectionAtEntrySpeed()) {
                return (!hasBreakDirectionAtEntrySpeed() || this.breakDirectionAtEntrySpeed_ == puttPath.breakDirectionAtEntrySpeed_) && getUnknownFields().equals(puttPath.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getBreakAtEntrySpeed() {
            return this.breakAtEntrySpeed_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public BreakDirection getBreakDirectionAtEntrySpeed() {
            BreakDirection breakDirectionForNumber = BreakDirection.forNumber(this.breakDirectionAtEntrySpeed_);
            return breakDirectionForNumber == null ? BreakDirection.LEFT : breakDirectionForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getEntrySpeedDistanceM() {
            return this.entrySpeedDistanceM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getExtrapolatedXPathM(int i14) {
            return this.extrapolatedXPathM_.getFloat(i14);
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getExtrapolatedXPathMCount() {
            return this.extrapolatedXPathM_.size();
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public List<Float> getExtrapolatedXPathMList() {
            return this.extrapolatedXPathM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getExtrapolatedYPathM(int i14) {
            return this.extrapolatedYPathM_.getFloat(i14);
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getExtrapolatedYPathMCount() {
            return this.extrapolatedYPathM_.size();
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public List<Float> getExtrapolatedYPathMList() {
            return this.extrapolatedYPathM_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PuttPath> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getRollDistanceM() {
            return this.rollDistanceM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getRollEndTimeMs() {
            return this.rollEndTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getRollStartSpeed() {
            return this.rollStartSpeed_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getRollStartTimeMs() {
            return this.rollStartTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getRollingXPathM(int i14) {
            return this.rollingXPathM_.getFloat(i14);
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getRollingXPathMCount() {
            return this.rollingXPathM_.size();
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public List<Float> getRollingXPathMList() {
            return this.rollingXPathM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getRollingYPathM(int i14) {
            return this.rollingYPathM_.getFloat(i14);
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getRollingYPathMCount() {
            return this.rollingYPathM_.size();
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public List<Float> getRollingYPathMList() {
            return this.rollingYPathM_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int iComputeInt32SizeNoTag;
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int size = getSkiddingXPathMList().size() * 4;
            if (getSkiddingXPathMList().isEmpty()) {
                iComputeInt32SizeNoTag = size;
            } else {
                iComputeInt32SizeNoTag = CodedOutputStream.computeInt32SizeNoTag(size) + size + 1;
            }
            this.skiddingXPathMMemoizedSerializedSize = size;
            int size2 = getSkiddingYPathMList().size() * 4;
            int iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag + size2;
            if (!getSkiddingYPathMList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(size2);
            }
            this.skiddingYPathMMemoizedSerializedSize = size2;
            int size3 = getRollingXPathMList().size() * 4;
            int iComputeInt32SizeNoTag3 = iComputeInt32SizeNoTag2 + size3;
            if (!getRollingXPathMList().isEmpty()) {
                iComputeInt32SizeNoTag3 = iComputeInt32SizeNoTag3 + 1 + CodedOutputStream.computeInt32SizeNoTag(size3);
            }
            this.rollingXPathMMemoizedSerializedSize = size3;
            int size4 = getRollingYPathMList().size() * 4;
            int iComputeInt32SizeNoTag4 = iComputeInt32SizeNoTag3 + size4;
            if (!getRollingYPathMList().isEmpty()) {
                iComputeInt32SizeNoTag4 = iComputeInt32SizeNoTag4 + 1 + CodedOutputStream.computeInt32SizeNoTag(size4);
            }
            this.rollingYPathMMemoizedSerializedSize = size4;
            int size5 = getExtrapolatedXPathMList().size() * 4;
            int iComputeInt32SizeNoTag5 = iComputeInt32SizeNoTag4 + size5;
            if (!getExtrapolatedXPathMList().isEmpty()) {
                iComputeInt32SizeNoTag5 = iComputeInt32SizeNoTag5 + 1 + CodedOutputStream.computeInt32SizeNoTag(size5);
            }
            this.extrapolatedXPathMMemoizedSerializedSize = size5;
            int size6 = getExtrapolatedYPathMList().size() * 4;
            int iComputeEnumSize = iComputeInt32SizeNoTag5 + size6;
            if (!getExtrapolatedYPathMList().isEmpty()) {
                iComputeEnumSize = iComputeEnumSize + 1 + CodedOutputStream.computeInt32SizeNoTag(size6);
            }
            this.extrapolatedYPathMMemoizedSerializedSize = size6;
            if ((this.bitField0_ & 1) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(7, this.rollStartTimeMs_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(8, this.rollEndTimeMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(9, this.trackEndTimeMs_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(10, this.trackEndedEarly_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(11, this.rollStartSpeed_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(12, this.skidDistanceM_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(13, this.rollDistanceM_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(14, this.entrySpeedDistanceM_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(15, this.breakAtEntrySpeed_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(16, this.breakDirectionAtEntrySpeed_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getSkidDistanceM() {
            return this.skidDistanceM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getSkiddingXPathM(int i14) {
            return this.skiddingXPathM_.getFloat(i14);
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getSkiddingXPathMCount() {
            return this.skiddingXPathM_.size();
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public List<Float> getSkiddingXPathMList() {
            return this.skiddingXPathM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public float getSkiddingYPathM(int i14) {
            return this.skiddingYPathM_.getFloat(i14);
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getSkiddingYPathMCount() {
            return this.skiddingYPathM_.size();
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public List<Float> getSkiddingYPathMList() {
            return this.skiddingYPathM_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public int getTrackEndTimeMs() {
            return this.trackEndTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean getTrackEndedEarly() {
            return this.trackEndedEarly_;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasBreakAtEntrySpeed() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasBreakDirectionAtEntrySpeed() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasEntrySpeedDistanceM() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasRollDistanceM() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasRollEndTimeMs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasRollStartSpeed() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasRollStartTimeMs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasSkidDistanceM() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasTrackEndTimeMs() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
        public boolean hasTrackEndedEarly() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSkiddingXPathMCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSkiddingXPathMList().hashCode();
            }
            if (getSkiddingYPathMCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSkiddingYPathMList().hashCode();
            }
            if (getRollingXPathMCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getRollingXPathMList().hashCode();
            }
            if (getRollingYPathMCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getRollingYPathMList().hashCode();
            }
            if (getExtrapolatedXPathMCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getExtrapolatedXPathMList().hashCode();
            }
            if (getExtrapolatedYPathMCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getExtrapolatedYPathMList().hashCode();
            }
            if (hasRollStartTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getRollStartTimeMs();
            }
            if (hasRollEndTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getRollEndTimeMs();
            }
            if (hasTrackEndTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getTrackEndTimeMs();
            }
            if (hasTrackEndedEarly()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Internal.hashBoolean(getTrackEndedEarly());
            }
            if (hasRollStartSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + Float.floatToIntBits(getRollStartSpeed());
            }
            if (hasSkidDistanceM()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + Float.floatToIntBits(getSkidDistanceM());
            }
            if (hasRollDistanceM()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + Float.floatToIntBits(getRollDistanceM());
            }
            if (hasEntrySpeedDistanceM()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + Float.floatToIntBits(getEntrySpeedDistanceM());
            }
            if (hasBreakAtEntrySpeed()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + Float.floatToIntBits(getBreakAtEntrySpeed());
            }
            if (hasBreakDirectionAtEntrySpeed()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + this.breakDirectionAtEntrySpeed_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_PuttPath_fieldAccessorTable.ensureFieldAccessorsInitialized(PuttPath.class, Builder.class);
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
            return new PuttPath();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if (getSkiddingXPathMList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(10);
                codedOutputStream.writeUInt32NoTag(this.skiddingXPathMMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.skiddingXPathM_.size(); i14++) {
                codedOutputStream.writeFloatNoTag(this.skiddingXPathM_.getFloat(i14));
            }
            if (getSkiddingYPathMList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(18);
                codedOutputStream.writeUInt32NoTag(this.skiddingYPathMMemoizedSerializedSize);
            }
            for (int i15 = 0; i15 < this.skiddingYPathM_.size(); i15++) {
                codedOutputStream.writeFloatNoTag(this.skiddingYPathM_.getFloat(i15));
            }
            if (getRollingXPathMList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.rollingXPathMMemoizedSerializedSize);
            }
            for (int i16 = 0; i16 < this.rollingXPathM_.size(); i16++) {
                codedOutputStream.writeFloatNoTag(this.rollingXPathM_.getFloat(i16));
            }
            if (getRollingYPathMList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(34);
                codedOutputStream.writeUInt32NoTag(this.rollingYPathMMemoizedSerializedSize);
            }
            for (int i17 = 0; i17 < this.rollingYPathM_.size(); i17++) {
                codedOutputStream.writeFloatNoTag(this.rollingYPathM_.getFloat(i17));
            }
            if (getExtrapolatedXPathMList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(42);
                codedOutputStream.writeUInt32NoTag(this.extrapolatedXPathMMemoizedSerializedSize);
            }
            for (int i18 = 0; i18 < this.extrapolatedXPathM_.size(); i18++) {
                codedOutputStream.writeFloatNoTag(this.extrapolatedXPathM_.getFloat(i18));
            }
            if (getExtrapolatedYPathMList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(50);
                codedOutputStream.writeUInt32NoTag(this.extrapolatedYPathMMemoizedSerializedSize);
            }
            for (int i19 = 0; i19 < this.extrapolatedYPathM_.size(); i19++) {
                codedOutputStream.writeFloatNoTag(this.extrapolatedYPathM_.getFloat(i19));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(7, this.rollStartTimeMs_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(8, this.rollEndTimeMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(9, this.trackEndTimeMs_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(10, this.trackEndedEarly_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(11, this.rollStartSpeed_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(12, this.skidDistanceM_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(13, this.rollDistanceM_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(14, this.entrySpeedDistanceM_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(15, this.breakAtEntrySpeed_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeEnum(16, this.breakDirectionAtEntrySpeed_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PuttPathOrBuilder {
            private int bitField0_;
            private float breakAtEntrySpeed_;
            private int breakDirectionAtEntrySpeed_;
            private float entrySpeedDistanceM_;
            private Internal.FloatList extrapolatedXPathM_;
            private Internal.FloatList extrapolatedYPathM_;
            private float rollDistanceM_;
            private int rollEndTimeMs_;
            private float rollStartSpeed_;
            private int rollStartTimeMs_;
            private Internal.FloatList rollingXPathM_;
            private Internal.FloatList rollingYPathM_;
            private float skidDistanceM_;
            private Internal.FloatList skiddingXPathM_;
            private Internal.FloatList skiddingYPathM_;
            private int trackEndTimeMs_;
            private boolean trackEndedEarly_;

            private Builder() {
                this.skiddingXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.skiddingYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.rollingXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.rollingYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.extrapolatedXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.extrapolatedYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.breakDirectionAtEntrySpeed_ = 0;
            }

            private void buildPartial0(PuttPath puttPath) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    this.skiddingXPathM_.makeImmutable();
                    puttPath.skiddingXPathM_ = this.skiddingXPathM_;
                }
                if ((i15 & 2) != 0) {
                    this.skiddingYPathM_.makeImmutable();
                    puttPath.skiddingYPathM_ = this.skiddingYPathM_;
                }
                if ((i15 & 4) != 0) {
                    this.rollingXPathM_.makeImmutable();
                    puttPath.rollingXPathM_ = this.rollingXPathM_;
                }
                if ((i15 & 8) != 0) {
                    this.rollingYPathM_.makeImmutable();
                    puttPath.rollingYPathM_ = this.rollingYPathM_;
                }
                if ((i15 & 16) != 0) {
                    this.extrapolatedXPathM_.makeImmutable();
                    puttPath.extrapolatedXPathM_ = this.extrapolatedXPathM_;
                }
                if ((i15 & 32) != 0) {
                    this.extrapolatedYPathM_.makeImmutable();
                    puttPath.extrapolatedYPathM_ = this.extrapolatedYPathM_;
                }
                if ((i15 & 64) != 0) {
                    puttPath.rollStartTimeMs_ = this.rollStartTimeMs_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 128) != 0) {
                    puttPath.rollEndTimeMs_ = this.rollEndTimeMs_;
                    i14 |= 2;
                }
                if ((i15 & 256) != 0) {
                    puttPath.trackEndTimeMs_ = this.trackEndTimeMs_;
                    i14 |= 4;
                }
                if ((i15 & 512) != 0) {
                    puttPath.trackEndedEarly_ = this.trackEndedEarly_;
                    i14 |= 8;
                }
                if ((i15 & 1024) != 0) {
                    puttPath.rollStartSpeed_ = this.rollStartSpeed_;
                    i14 |= 16;
                }
                if ((i15 & 2048) != 0) {
                    puttPath.skidDistanceM_ = this.skidDistanceM_;
                    i14 |= 32;
                }
                if ((i15 & 4096) != 0) {
                    puttPath.rollDistanceM_ = this.rollDistanceM_;
                    i14 |= 64;
                }
                if ((i15 & 8192) != 0) {
                    puttPath.entrySpeedDistanceM_ = this.entrySpeedDistanceM_;
                    i14 |= 128;
                }
                if ((i15 & 16384) != 0) {
                    puttPath.breakAtEntrySpeed_ = this.breakAtEntrySpeed_;
                    i14 |= 256;
                }
                if ((i15 & 32768) != 0) {
                    puttPath.breakDirectionAtEntrySpeed_ = this.breakDirectionAtEntrySpeed_;
                    i14 |= 512;
                }
                puttPath.bitField0_ |= i14;
            }

            private void ensureExtrapolatedXPathMIsMutable() {
                if (!this.extrapolatedXPathM_.isModifiable()) {
                    this.extrapolatedXPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.extrapolatedXPathM_);
                }
                this.bitField0_ |= 16;
            }

            private void ensureExtrapolatedYPathMIsMutable() {
                if (!this.extrapolatedYPathM_.isModifiable()) {
                    this.extrapolatedYPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.extrapolatedYPathM_);
                }
                this.bitField0_ |= 32;
            }

            private void ensureRollingXPathMIsMutable() {
                if (!this.rollingXPathM_.isModifiable()) {
                    this.rollingXPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.rollingXPathM_);
                }
                this.bitField0_ |= 4;
            }

            private void ensureRollingYPathMIsMutable() {
                if (!this.rollingYPathM_.isModifiable()) {
                    this.rollingYPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.rollingYPathM_);
                }
                this.bitField0_ |= 8;
            }

            private void ensureSkiddingXPathMIsMutable() {
                if (!this.skiddingXPathM_.isModifiable()) {
                    this.skiddingXPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.skiddingXPathM_);
                }
                this.bitField0_ |= 1;
            }

            private void ensureSkiddingYPathMIsMutable() {
                if (!this.skiddingYPathM_.isModifiable()) {
                    this.skiddingYPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.skiddingYPathM_);
                }
                this.bitField0_ |= 2;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_PuttPath_descriptor;
            }

            public Builder addAllExtrapolatedXPathM(Iterable<? extends Float> iterable) {
                ensureExtrapolatedXPathMIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extrapolatedXPathM_);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder addAllExtrapolatedYPathM(Iterable<? extends Float> iterable) {
                ensureExtrapolatedYPathMIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extrapolatedYPathM_);
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder addAllRollingXPathM(Iterable<? extends Float> iterable) {
                ensureRollingXPathMIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.rollingXPathM_);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder addAllRollingYPathM(Iterable<? extends Float> iterable) {
                ensureRollingYPathMIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.rollingYPathM_);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder addAllSkiddingXPathM(Iterable<? extends Float> iterable) {
                ensureSkiddingXPathMIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.skiddingXPathM_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addAllSkiddingYPathM(Iterable<? extends Float> iterable) {
                ensureSkiddingYPathMIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.skiddingYPathM_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addExtrapolatedXPathM(float f14) {
                ensureExtrapolatedXPathMIsMutable();
                this.extrapolatedXPathM_.addFloat(f14);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder addExtrapolatedYPathM(float f14) {
                ensureExtrapolatedYPathMIsMutable();
                this.extrapolatedYPathM_.addFloat(f14);
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addRollingXPathM(float f14) {
                ensureRollingXPathMIsMutable();
                this.rollingXPathM_.addFloat(f14);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder addRollingYPathM(float f14) {
                ensureRollingYPathMIsMutable();
                this.rollingYPathM_.addFloat(f14);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder addSkiddingXPathM(float f14) {
                ensureSkiddingXPathMIsMutable();
                this.skiddingXPathM_.addFloat(f14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addSkiddingYPathM(float f14) {
                ensureSkiddingYPathMIsMutable();
                this.skiddingYPathM_.addFloat(f14);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PuttPath build() {
                PuttPath puttPathBuildPartial = buildPartial();
                if (puttPathBuildPartial.isInitialized()) {
                    return puttPathBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) puttPathBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PuttPath buildPartial() {
                PuttPath puttPath = new PuttPath(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(puttPath);
                }
                onBuilt();
                return puttPath;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.skiddingXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.skiddingYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.rollingXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.rollingYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.extrapolatedXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.extrapolatedYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.rollStartTimeMs_ = 0;
                this.rollEndTimeMs_ = 0;
                this.trackEndTimeMs_ = 0;
                this.trackEndedEarly_ = false;
                this.rollStartSpeed_ = 0.0f;
                this.skidDistanceM_ = 0.0f;
                this.rollDistanceM_ = 0.0f;
                this.entrySpeedDistanceM_ = 0.0f;
                this.breakAtEntrySpeed_ = 0.0f;
                this.breakDirectionAtEntrySpeed_ = 0;
                return this;
            }

            public Builder clearBreakAtEntrySpeed() {
                this.bitField0_ &= -16385;
                this.breakAtEntrySpeed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearBreakDirectionAtEntrySpeed() {
                this.bitField0_ &= -32769;
                this.breakDirectionAtEntrySpeed_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEntrySpeedDistanceM() {
                this.bitField0_ &= -8193;
                this.entrySpeedDistanceM_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearExtrapolatedXPathM() {
                this.extrapolatedXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearExtrapolatedYPathM() {
                this.extrapolatedYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.bitField0_ &= -33;
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

            public Builder clearRollDistanceM() {
                this.bitField0_ &= -4097;
                this.rollDistanceM_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearRollEndTimeMs() {
                this.bitField0_ &= -129;
                this.rollEndTimeMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRollStartSpeed() {
                this.bitField0_ &= -1025;
                this.rollStartSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearRollStartTimeMs() {
                this.bitField0_ &= -65;
                this.rollStartTimeMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRollingXPathM() {
                this.rollingXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRollingYPathM() {
                this.rollingYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearSkidDistanceM() {
                this.bitField0_ &= -2049;
                this.skidDistanceM_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearSkiddingXPathM() {
                this.skiddingXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSkiddingYPathM() {
                this.skiddingYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTrackEndTimeMs() {
                this.bitField0_ &= -257;
                this.trackEndTimeMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTrackEndedEarly() {
                this.bitField0_ &= -513;
                this.trackEndedEarly_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getBreakAtEntrySpeed() {
                return this.breakAtEntrySpeed_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public BreakDirection getBreakDirectionAtEntrySpeed() {
                BreakDirection breakDirectionForNumber = BreakDirection.forNumber(this.breakDirectionAtEntrySpeed_);
                return breakDirectionForNumber == null ? BreakDirection.LEFT : breakDirectionForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_PuttPath_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getEntrySpeedDistanceM() {
                return this.entrySpeedDistanceM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getExtrapolatedXPathM(int i14) {
                return this.extrapolatedXPathM_.getFloat(i14);
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getExtrapolatedXPathMCount() {
                return this.extrapolatedXPathM_.size();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public List<Float> getExtrapolatedXPathMList() {
                this.extrapolatedXPathM_.makeImmutable();
                return this.extrapolatedXPathM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getExtrapolatedYPathM(int i14) {
                return this.extrapolatedYPathM_.getFloat(i14);
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getExtrapolatedYPathMCount() {
                return this.extrapolatedYPathM_.size();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public List<Float> getExtrapolatedYPathMList() {
                this.extrapolatedYPathM_.makeImmutable();
                return this.extrapolatedYPathM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getRollDistanceM() {
                return this.rollDistanceM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getRollEndTimeMs() {
                return this.rollEndTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getRollStartSpeed() {
                return this.rollStartSpeed_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getRollStartTimeMs() {
                return this.rollStartTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getRollingXPathM(int i14) {
                return this.rollingXPathM_.getFloat(i14);
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getRollingXPathMCount() {
                return this.rollingXPathM_.size();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public List<Float> getRollingXPathMList() {
                this.rollingXPathM_.makeImmutable();
                return this.rollingXPathM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getRollingYPathM(int i14) {
                return this.rollingYPathM_.getFloat(i14);
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getRollingYPathMCount() {
                return this.rollingYPathM_.size();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public List<Float> getRollingYPathMList() {
                this.rollingYPathM_.makeImmutable();
                return this.rollingYPathM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getSkidDistanceM() {
                return this.skidDistanceM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getSkiddingXPathM(int i14) {
                return this.skiddingXPathM_.getFloat(i14);
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getSkiddingXPathMCount() {
                return this.skiddingXPathM_.size();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public List<Float> getSkiddingXPathMList() {
                this.skiddingXPathM_.makeImmutable();
                return this.skiddingXPathM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public float getSkiddingYPathM(int i14) {
                return this.skiddingYPathM_.getFloat(i14);
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getSkiddingYPathMCount() {
                return this.skiddingYPathM_.size();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public List<Float> getSkiddingYPathMList() {
                this.skiddingYPathM_.makeImmutable();
                return this.skiddingYPathM_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public int getTrackEndTimeMs() {
                return this.trackEndTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean getTrackEndedEarly() {
                return this.trackEndedEarly_;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasBreakAtEntrySpeed() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasBreakDirectionAtEntrySpeed() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasEntrySpeedDistanceM() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasRollDistanceM() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasRollEndTimeMs() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasRollStartSpeed() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasRollStartTimeMs() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasSkidDistanceM() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasTrackEndTimeMs() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.PuttPathOrBuilder
            public boolean hasTrackEndedEarly() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_PuttPath_fieldAccessorTable.ensureFieldAccessorsInitialized(PuttPath.class, Builder.class);
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
                            int i14 = 4096;
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    int rawVarint32 = codedInputStream.readRawVarint32();
                                    int iPushLimit = codedInputStream.pushLimit(rawVarint32);
                                    if (rawVarint32 <= 4096) {
                                        i14 = rawVarint32;
                                    }
                                    ensureSkiddingXPathMIsMutable(i14 / 4);
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.skiddingXPathM_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                case 13:
                                    float f14 = codedInputStream.readFloat();
                                    ensureSkiddingXPathMIsMutable();
                                    this.skiddingXPathM_.addFloat(f14);
                                    continue;
                                case 18:
                                    int rawVarint33 = codedInputStream.readRawVarint32();
                                    int iPushLimit2 = codedInputStream.pushLimit(rawVarint33);
                                    if (rawVarint33 <= 4096) {
                                        i14 = rawVarint33;
                                    }
                                    ensureSkiddingYPathMIsMutable(i14 / 4);
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.skiddingYPathM_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                    continue;
                                case 21:
                                    float f15 = codedInputStream.readFloat();
                                    ensureSkiddingYPathMIsMutable();
                                    this.skiddingYPathM_.addFloat(f15);
                                    continue;
                                case 26:
                                    int rawVarint34 = codedInputStream.readRawVarint32();
                                    int iPushLimit3 = codedInputStream.pushLimit(rawVarint34);
                                    if (rawVarint34 <= 4096) {
                                        i14 = rawVarint34;
                                    }
                                    ensureRollingXPathMIsMutable(i14 / 4);
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.rollingXPathM_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(iPushLimit3);
                                    continue;
                                case 29:
                                    float f16 = codedInputStream.readFloat();
                                    ensureRollingXPathMIsMutable();
                                    this.rollingXPathM_.addFloat(f16);
                                    continue;
                                case 34:
                                    int rawVarint35 = codedInputStream.readRawVarint32();
                                    int iPushLimit4 = codedInputStream.pushLimit(rawVarint35);
                                    if (rawVarint35 <= 4096) {
                                        i14 = rawVarint35;
                                    }
                                    ensureRollingYPathMIsMutable(i14 / 4);
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.rollingYPathM_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(iPushLimit4);
                                    continue;
                                case 37:
                                    float f17 = codedInputStream.readFloat();
                                    ensureRollingYPathMIsMutable();
                                    this.rollingYPathM_.addFloat(f17);
                                    continue;
                                case 42:
                                    int rawVarint36 = codedInputStream.readRawVarint32();
                                    int iPushLimit5 = codedInputStream.pushLimit(rawVarint36);
                                    if (rawVarint36 <= 4096) {
                                        i14 = rawVarint36;
                                    }
                                    ensureExtrapolatedXPathMIsMutable(i14 / 4);
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.extrapolatedXPathM_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(iPushLimit5);
                                    continue;
                                case 45:
                                    float f18 = codedInputStream.readFloat();
                                    ensureExtrapolatedXPathMIsMutable();
                                    this.extrapolatedXPathM_.addFloat(f18);
                                    continue;
                                case 50:
                                    int rawVarint37 = codedInputStream.readRawVarint32();
                                    int iPushLimit6 = codedInputStream.pushLimit(rawVarint37);
                                    if (rawVarint37 <= 4096) {
                                        i14 = rawVarint37;
                                    }
                                    ensureExtrapolatedYPathMIsMutable(i14 / 4);
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.extrapolatedYPathM_.addFloat(codedInputStream.readFloat());
                                    }
                                    codedInputStream.popLimit(iPushLimit6);
                                    continue;
                                case 53:
                                    float f19 = codedInputStream.readFloat();
                                    ensureExtrapolatedYPathMIsMutable();
                                    this.extrapolatedYPathM_.addFloat(f19);
                                    continue;
                                case 56:
                                    this.rollStartTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.rollEndTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.trackEndTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.trackEndedEarly_ = codedInputStream.readBool();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 93:
                                    this.rollStartSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 101:
                                    this.skidDistanceM_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 109:
                                    this.rollDistanceM_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 117:
                                    this.entrySpeedDistanceM_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 125:
                                    this.breakAtEntrySpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 128:
                                    int i15 = codedInputStream.readEnum();
                                    if (BreakDirection.forNumber(i15) == null) {
                                        mergeUnknownVarintField(16, i15);
                                    } else {
                                        this.breakDirectionAtEntrySpeed_ = i15;
                                        this.bitField0_ |= 32768;
                                        continue;
                                    }
                                    break;
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

            public Builder setBreakAtEntrySpeed(float f14) {
                this.breakAtEntrySpeed_ = f14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setBreakDirectionAtEntrySpeed(BreakDirection breakDirection) {
                breakDirection.getClass();
                this.bitField0_ |= 32768;
                this.breakDirectionAtEntrySpeed_ = breakDirection.getNumber();
                onChanged();
                return this;
            }

            public Builder setEntrySpeedDistanceM(float f14) {
                this.entrySpeedDistanceM_ = f14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setExtrapolatedXPathM(int i14, float f14) {
                ensureExtrapolatedXPathMIsMutable();
                this.extrapolatedXPathM_.setFloat(i14, f14);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setExtrapolatedYPathM(int i14, float f14) {
                ensureExtrapolatedYPathMIsMutable();
                this.extrapolatedYPathM_.setFloat(i14, f14);
                this.bitField0_ |= 32;
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

            public Builder setRollDistanceM(float f14) {
                this.rollDistanceM_ = f14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setRollEndTimeMs(int i14) {
                this.rollEndTimeMs_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setRollStartSpeed(float f14) {
                this.rollStartSpeed_ = f14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setRollStartTimeMs(int i14) {
                this.rollStartTimeMs_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRollingXPathM(int i14, float f14) {
                ensureRollingXPathMIsMutable();
                this.rollingXPathM_.setFloat(i14, f14);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRollingYPathM(int i14, float f14) {
                ensureRollingYPathMIsMutable();
                this.rollingYPathM_.setFloat(i14, f14);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSkidDistanceM(float f14) {
                this.skidDistanceM_ = f14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSkiddingXPathM(int i14, float f14) {
                ensureSkiddingXPathMIsMutable();
                this.skiddingXPathM_.setFloat(i14, f14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSkiddingYPathM(int i14, float f14) {
                ensureSkiddingYPathMIsMutable();
                this.skiddingYPathM_.setFloat(i14, f14);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTrackEndTimeMs(int i14) {
                this.trackEndTimeMs_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setTrackEndedEarly(boolean z14) {
                this.trackEndedEarly_ = z14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PuttPath getDefaultInstanceForType() {
                return PuttPath.getDefaultInstance();
            }

            private void ensureExtrapolatedXPathMIsMutable(int i14) {
                if (!this.extrapolatedXPathM_.isModifiable()) {
                    this.extrapolatedXPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.extrapolatedXPathM_, i14);
                }
                this.bitField0_ |= 16;
            }

            private void ensureExtrapolatedYPathMIsMutable(int i14) {
                if (!this.extrapolatedYPathM_.isModifiable()) {
                    this.extrapolatedYPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.extrapolatedYPathM_, i14);
                }
                this.bitField0_ |= 32;
            }

            private void ensureRollingXPathMIsMutable(int i14) {
                if (!this.rollingXPathM_.isModifiable()) {
                    this.rollingXPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.rollingXPathM_, i14);
                }
                this.bitField0_ |= 4;
            }

            private void ensureRollingYPathMIsMutable(int i14) {
                if (!this.rollingYPathM_.isModifiable()) {
                    this.rollingYPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.rollingYPathM_, i14);
                }
                this.bitField0_ |= 8;
            }

            private void ensureSkiddingXPathMIsMutable(int i14) {
                if (!this.skiddingXPathM_.isModifiable()) {
                    this.skiddingXPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.skiddingXPathM_, i14);
                }
                this.bitField0_ |= 1;
            }

            private void ensureSkiddingYPathMIsMutable(int i14) {
                if (!this.skiddingYPathM_.isModifiable()) {
                    this.skiddingYPathM_ = (Internal.FloatList) GeneratedMessageV3.makeMutableCopy(this.skiddingYPathM_, i14);
                }
                this.bitField0_ |= 2;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.skiddingXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.skiddingYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.rollingXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.rollingYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.extrapolatedXPathM_ = GeneratedMessageV3.emptyFloatList();
                this.extrapolatedYPathM_ = GeneratedMessageV3.emptyFloatList();
                this.breakDirectionAtEntrySpeed_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PuttPath) {
                    return mergeFrom((PuttPath) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PuttPath puttPath) {
                if (puttPath == PuttPath.getDefaultInstance()) {
                    return this;
                }
                if (!puttPath.skiddingXPathM_.isEmpty()) {
                    if (this.skiddingXPathM_.isEmpty()) {
                        Internal.FloatList floatList = puttPath.skiddingXPathM_;
                        this.skiddingXPathM_ = floatList;
                        floatList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureSkiddingXPathMIsMutable();
                        this.skiddingXPathM_.addAll(puttPath.skiddingXPathM_);
                    }
                    onChanged();
                }
                if (!puttPath.skiddingYPathM_.isEmpty()) {
                    if (this.skiddingYPathM_.isEmpty()) {
                        Internal.FloatList floatList2 = puttPath.skiddingYPathM_;
                        this.skiddingYPathM_ = floatList2;
                        floatList2.makeImmutable();
                        this.bitField0_ |= 2;
                    } else {
                        ensureSkiddingYPathMIsMutable();
                        this.skiddingYPathM_.addAll(puttPath.skiddingYPathM_);
                    }
                    onChanged();
                }
                if (!puttPath.rollingXPathM_.isEmpty()) {
                    if (this.rollingXPathM_.isEmpty()) {
                        Internal.FloatList floatList3 = puttPath.rollingXPathM_;
                        this.rollingXPathM_ = floatList3;
                        floatList3.makeImmutable();
                        this.bitField0_ |= 4;
                    } else {
                        ensureRollingXPathMIsMutable();
                        this.rollingXPathM_.addAll(puttPath.rollingXPathM_);
                    }
                    onChanged();
                }
                if (!puttPath.rollingYPathM_.isEmpty()) {
                    if (this.rollingYPathM_.isEmpty()) {
                        Internal.FloatList floatList4 = puttPath.rollingYPathM_;
                        this.rollingYPathM_ = floatList4;
                        floatList4.makeImmutable();
                        this.bitField0_ |= 8;
                    } else {
                        ensureRollingYPathMIsMutable();
                        this.rollingYPathM_.addAll(puttPath.rollingYPathM_);
                    }
                    onChanged();
                }
                if (!puttPath.extrapolatedXPathM_.isEmpty()) {
                    if (this.extrapolatedXPathM_.isEmpty()) {
                        Internal.FloatList floatList5 = puttPath.extrapolatedXPathM_;
                        this.extrapolatedXPathM_ = floatList5;
                        floatList5.makeImmutable();
                        this.bitField0_ |= 16;
                    } else {
                        ensureExtrapolatedXPathMIsMutable();
                        this.extrapolatedXPathM_.addAll(puttPath.extrapolatedXPathM_);
                    }
                    onChanged();
                }
                if (!puttPath.extrapolatedYPathM_.isEmpty()) {
                    if (this.extrapolatedYPathM_.isEmpty()) {
                        Internal.FloatList floatList6 = puttPath.extrapolatedYPathM_;
                        this.extrapolatedYPathM_ = floatList6;
                        floatList6.makeImmutable();
                        this.bitField0_ |= 32;
                    } else {
                        ensureExtrapolatedYPathMIsMutable();
                        this.extrapolatedYPathM_.addAll(puttPath.extrapolatedYPathM_);
                    }
                    onChanged();
                }
                if (puttPath.hasRollStartTimeMs()) {
                    setRollStartTimeMs(puttPath.getRollStartTimeMs());
                }
                if (puttPath.hasRollEndTimeMs()) {
                    setRollEndTimeMs(puttPath.getRollEndTimeMs());
                }
                if (puttPath.hasTrackEndTimeMs()) {
                    setTrackEndTimeMs(puttPath.getTrackEndTimeMs());
                }
                if (puttPath.hasTrackEndedEarly()) {
                    setTrackEndedEarly(puttPath.getTrackEndedEarly());
                }
                if (puttPath.hasRollStartSpeed()) {
                    setRollStartSpeed(puttPath.getRollStartSpeed());
                }
                if (puttPath.hasSkidDistanceM()) {
                    setSkidDistanceM(puttPath.getSkidDistanceM());
                }
                if (puttPath.hasRollDistanceM()) {
                    setRollDistanceM(puttPath.getRollDistanceM());
                }
                if (puttPath.hasEntrySpeedDistanceM()) {
                    setEntrySpeedDistanceM(puttPath.getEntrySpeedDistanceM());
                }
                if (puttPath.hasBreakAtEntrySpeed()) {
                    setBreakAtEntrySpeed(puttPath.getBreakAtEntrySpeed());
                }
                if (puttPath.hasBreakDirectionAtEntrySpeed()) {
                    setBreakDirectionAtEntrySpeed(puttPath.getBreakDirectionAtEntrySpeed());
                }
                mergeUnknownFields(puttPath.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PuttPath getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PuttPath parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PuttPath) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PuttPath parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PuttPath parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PuttPath parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PuttPath parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PuttPath parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PuttPath parseFrom(InputStream inputStream) {
            return (PuttPath) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PuttPath parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PuttPath) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PuttPath parseFrom(CodedInputStream codedInputStream) {
            return (PuttPath) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PuttPath parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PuttPath) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum BreakDirection implements ProtocolMessageEnum {
            LEFT(0),
            RIGHT(1),
            STRAIGHT(2);

            public static final int LEFT_VALUE = 0;
            public static final int RIGHT_VALUE = 1;
            public static final int STRAIGHT_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<BreakDirection> internalValueMap = new Internal.EnumLiteMap<BreakDirection>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.PuttPath.BreakDirection.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public BreakDirection findValueByNumber(int i14) {
                    return BreakDirection.forNumber(i14);
                }
            };
            private static final BreakDirection[] VALUES = values();

            BreakDirection(int i14) {
                this.value = i14;
            }

            public static BreakDirection forNumber(int i14) {
                if (i14 == 0) {
                    return LEFT;
                }
                if (i14 == 1) {
                    return RIGHT;
                }
                if (i14 != 2) {
                    return null;
                }
                return STRAIGHT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PuttPath.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<BreakDirection> internalGetValueMap() {
                return internalValueMap;
            }

            public static BreakDirection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static BreakDirection valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private PuttPath(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.skiddingXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.skiddingXPathMMemoizedSerializedSize = -1;
            this.skiddingYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.skiddingYPathMMemoizedSerializedSize = -1;
            this.rollingXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.rollingXPathMMemoizedSerializedSize = -1;
            this.rollingYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.rollingYPathMMemoizedSerializedSize = -1;
            this.extrapolatedXPathM_ = GeneratedMessageV3.emptyFloatList();
            this.extrapolatedXPathMMemoizedSerializedSize = -1;
            this.extrapolatedYPathM_ = GeneratedMessageV3.emptyFloatList();
            this.extrapolatedYPathMMemoizedSerializedSize = -1;
            this.rollStartTimeMs_ = 0;
            this.rollEndTimeMs_ = 0;
            this.trackEndTimeMs_ = 0;
            this.trackEndedEarly_ = false;
            this.rollStartSpeed_ = 0.0f;
            this.skidDistanceM_ = 0.0f;
            this.rollDistanceM_ = 0.0f;
            this.entrySpeedDistanceM_ = 0.0f;
            this.breakAtEntrySpeed_ = 0.0f;
            this.breakDirectionAtEntrySpeed_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ PuttPath(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ResetTiltCalibrationResponse extends GeneratedMessageV3 implements ResetTiltCalibrationResponseOrBuilder {
        private static final ResetTiltCalibrationResponse DEFAULT_INSTANCE = new ResetTiltCalibrationResponse();

        @Deprecated
        public static final Parser<ResetTiltCalibrationResponse> PARSER = new AbstractParser<ResetTiltCalibrationResponse>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationResponse.1
            @Override // com.google.protobuf.Parser
            public ResetTiltCalibrationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ResetTiltCalibrationResponse.newBuilder();
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

        private ResetTiltCalibrationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetTiltCalibrationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_descriptor;
        }

        public static Builder newBuilder(ResetTiltCalibrationResponse resetTiltCalibrationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resetTiltCalibrationResponse);
        }

        public static ResetTiltCalibrationResponse parseDelimitedFrom(InputStream inputStream) {
            return (ResetTiltCalibrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResetTiltCalibrationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ResetTiltCalibrationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResetTiltCalibrationResponse)) {
                return super.equals(obj);
            }
            ResetTiltCalibrationResponse resetTiltCalibrationResponse = (ResetTiltCalibrationResponse) obj;
            if (hasStatus() != resetTiltCalibrationResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == resetTiltCalibrationResponse.status_) && getUnknownFields().equals(resetTiltCalibrationResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResetTiltCalibrationResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.CAN_RESET : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationResponseOrBuilder
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetTiltCalibrationResponse.class, Builder.class);
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
            return new ResetTiltCalibrationResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResetTiltCalibrationResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(ResetTiltCalibrationResponse resetTiltCalibrationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    resetTiltCalibrationResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                resetTiltCalibrationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetTiltCalibrationResponse build() {
                ResetTiltCalibrationResponse resetTiltCalibrationResponseBuildPartial = buildPartial();
                if (resetTiltCalibrationResponseBuildPartial.isInitialized()) {
                    return resetTiltCalibrationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resetTiltCalibrationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetTiltCalibrationResponse buildPartial() {
                ResetTiltCalibrationResponse resetTiltCalibrationResponse = new ResetTiltCalibrationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(resetTiltCalibrationResponse);
                }
                onBuilt();
                return resetTiltCalibrationResponse;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.CAN_RESET : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_ResetTiltCalibrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetTiltCalibrationResponse.class, Builder.class);
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
            public ResetTiltCalibrationResponse getDefaultInstanceForType() {
                return ResetTiltCalibrationResponse.getDefaultInstance();
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
                if (message instanceof ResetTiltCalibrationResponse) {
                    return mergeFrom((ResetTiltCalibrationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ResetTiltCalibrationResponse resetTiltCalibrationResponse) {
                if (resetTiltCalibrationResponse == ResetTiltCalibrationResponse.getDefaultInstance()) {
                    return this;
                }
                if (resetTiltCalibrationResponse.hasStatus()) {
                    setStatus(resetTiltCalibrationResponse.getStatus());
                }
                mergeUnknownFields(resetTiltCalibrationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResetTiltCalibrationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ResetTiltCalibrationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetTiltCalibrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetTiltCalibrationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ResetTiltCalibrationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ResetTiltCalibrationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ResetTiltCalibrationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResetTiltCalibrationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ResetTiltCalibrationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ResetTiltCalibrationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ResetTiltCalibrationResponse parseFrom(InputStream inputStream) {
            return (ResetTiltCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ResetTiltCalibrationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetTiltCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetTiltCalibrationResponse parseFrom(CodedInputStream codedInputStream) {
            return (ResetTiltCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResetTiltCalibrationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetTiltCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            CAN_RESET(1),
            ALREADY_RESET(2),
            RESET_SUCCESSFUL(3),
            CANNOT_RESET(4);

            public static final int ALREADY_RESET_VALUE = 2;
            public static final int CANNOT_RESET_VALUE = 4;
            public static final int CAN_RESET_VALUE = 1;
            public static final int RESET_SUCCESSFUL_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.ResetTiltCalibrationResponse.Status.1
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
                    return CAN_RESET;
                }
                if (i14 == 2) {
                    return ALREADY_RESET;
                }
                if (i14 == 3) {
                    return RESET_SUCCESSFUL;
                }
                if (i14 != 4) {
                    return null;
                }
                return CANNOT_RESET;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ResetTiltCalibrationResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int MODE_REQUEST_FIELD_NUMBER = 13;
        public static final int MODE_RESPONSE_FIELD_NUMBER = 14;
        public static final int RESET_TILT_CAL_REQUEST_FIELD_NUMBER = 9;
        public static final int RESET_TILT_CAL_RESPONSE_FIELD_NUMBER = 10;
        public static final int SHOT_CONFIG_REQUEST_FIELD_NUMBER = 11;
        public static final int SHOT_CONFIG_RESPONSE_FIELD_NUMBER = 12;
        public static final int START_TILT_CAL_REQUEST_FIELD_NUMBER = 7;
        public static final int START_TILT_CAL_RESPONSE_FIELD_NUMBER = 8;
        public static final int STATUS_REQUEST_FIELD_NUMBER = 1;
        public static final int STATUS_RESPONSE_FIELD_NUMBER = 2;
        public static final int TILT_REQUEST_FIELD_NUMBER = 5;
        public static final int TILT_RESPONSE_FIELD_NUMBER = 6;
        public static final int WAKE_UP_REQUEST_FIELD_NUMBER = 3;
        public static final int WAKE_UP_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ModeRequest modeRequest_;
        private ModeResponse modeResponse_;
        private ResetTiltCalibrationRequest resetTiltCalRequest_;
        private ResetTiltCalibrationResponse resetTiltCalResponse_;
        private ShotConfigRequest shotConfigRequest_;
        private ShotConfigResponse shotConfigResponse_;
        private StartTiltCalibrationRequest startTiltCalRequest_;
        private StartTiltCalibrationResponse startTiltCalResponse_;
        private StatusRequest statusRequest_;
        private StatusResponse statusResponse_;
        private TiltRequest tiltRequest_;
        private TiltResponse tiltResponse_;
        private WakeUpRequest wakeUpRequest_;
        private WakeUpResponse wakeUpResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.Service.1
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Service_descriptor;
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
            if (hasStatusRequest() != service.hasStatusRequest()) {
                return false;
            }
            if ((hasStatusRequest() && !getStatusRequest().equals(service.getStatusRequest())) || hasStatusResponse() != service.hasStatusResponse()) {
                return false;
            }
            if ((hasStatusResponse() && !getStatusResponse().equals(service.getStatusResponse())) || hasWakeUpRequest() != service.hasWakeUpRequest()) {
                return false;
            }
            if ((hasWakeUpRequest() && !getWakeUpRequest().equals(service.getWakeUpRequest())) || hasWakeUpResponse() != service.hasWakeUpResponse()) {
                return false;
            }
            if ((hasWakeUpResponse() && !getWakeUpResponse().equals(service.getWakeUpResponse())) || hasTiltRequest() != service.hasTiltRequest()) {
                return false;
            }
            if ((hasTiltRequest() && !getTiltRequest().equals(service.getTiltRequest())) || hasTiltResponse() != service.hasTiltResponse()) {
                return false;
            }
            if ((hasTiltResponse() && !getTiltResponse().equals(service.getTiltResponse())) || hasStartTiltCalRequest() != service.hasStartTiltCalRequest()) {
                return false;
            }
            if ((hasStartTiltCalRequest() && !getStartTiltCalRequest().equals(service.getStartTiltCalRequest())) || hasStartTiltCalResponse() != service.hasStartTiltCalResponse()) {
                return false;
            }
            if ((hasStartTiltCalResponse() && !getStartTiltCalResponse().equals(service.getStartTiltCalResponse())) || hasResetTiltCalRequest() != service.hasResetTiltCalRequest()) {
                return false;
            }
            if ((hasResetTiltCalRequest() && !getResetTiltCalRequest().equals(service.getResetTiltCalRequest())) || hasResetTiltCalResponse() != service.hasResetTiltCalResponse()) {
                return false;
            }
            if ((hasResetTiltCalResponse() && !getResetTiltCalResponse().equals(service.getResetTiltCalResponse())) || hasShotConfigRequest() != service.hasShotConfigRequest()) {
                return false;
            }
            if ((hasShotConfigRequest() && !getShotConfigRequest().equals(service.getShotConfigRequest())) || hasShotConfigResponse() != service.hasShotConfigResponse()) {
                return false;
            }
            if ((hasShotConfigResponse() && !getShotConfigResponse().equals(service.getShotConfigResponse())) || hasModeRequest() != service.hasModeRequest()) {
                return false;
            }
            if ((!hasModeRequest() || getModeRequest().equals(service.getModeRequest())) && hasModeResponse() == service.hasModeResponse()) {
                return (!hasModeResponse() || getModeResponse().equals(service.getModeResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ModeRequest getModeRequest() {
            ModeRequest modeRequest = this.modeRequest_;
            return modeRequest == null ? ModeRequest.getDefaultInstance() : modeRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ModeRequestOrBuilder getModeRequestOrBuilder() {
            ModeRequest modeRequest = this.modeRequest_;
            return modeRequest == null ? ModeRequest.getDefaultInstance() : modeRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ModeResponse getModeResponse() {
            ModeResponse modeResponse = this.modeResponse_;
            return modeResponse == null ? ModeResponse.getDefaultInstance() : modeResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ModeResponseOrBuilder getModeResponseOrBuilder() {
            ModeResponse modeResponse = this.modeResponse_;
            return modeResponse == null ? ModeResponse.getDefaultInstance() : modeResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ResetTiltCalibrationRequest getResetTiltCalRequest() {
            ResetTiltCalibrationRequest resetTiltCalibrationRequest = this.resetTiltCalRequest_;
            return resetTiltCalibrationRequest == null ? ResetTiltCalibrationRequest.getDefaultInstance() : resetTiltCalibrationRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ResetTiltCalibrationRequestOrBuilder getResetTiltCalRequestOrBuilder() {
            ResetTiltCalibrationRequest resetTiltCalibrationRequest = this.resetTiltCalRequest_;
            return resetTiltCalibrationRequest == null ? ResetTiltCalibrationRequest.getDefaultInstance() : resetTiltCalibrationRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ResetTiltCalibrationResponse getResetTiltCalResponse() {
            ResetTiltCalibrationResponse resetTiltCalibrationResponse = this.resetTiltCalResponse_;
            return resetTiltCalibrationResponse == null ? ResetTiltCalibrationResponse.getDefaultInstance() : resetTiltCalibrationResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ResetTiltCalibrationResponseOrBuilder getResetTiltCalResponseOrBuilder() {
            ResetTiltCalibrationResponse resetTiltCalibrationResponse = this.resetTiltCalResponse_;
            return resetTiltCalibrationResponse == null ? ResetTiltCalibrationResponse.getDefaultInstance() : resetTiltCalibrationResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStatusRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getStatusResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getWakeUpRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getWakeUpResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getTiltRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getTiltResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getStartTiltCalRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getStartTiltCalResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getResetTiltCalRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getResetTiltCalResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getShotConfigRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getShotConfigResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getModeRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getModeResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ShotConfigRequest getShotConfigRequest() {
            ShotConfigRequest shotConfigRequest = this.shotConfigRequest_;
            return shotConfigRequest == null ? ShotConfigRequest.getDefaultInstance() : shotConfigRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ShotConfigRequestOrBuilder getShotConfigRequestOrBuilder() {
            ShotConfigRequest shotConfigRequest = this.shotConfigRequest_;
            return shotConfigRequest == null ? ShotConfigRequest.getDefaultInstance() : shotConfigRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ShotConfigResponse getShotConfigResponse() {
            ShotConfigResponse shotConfigResponse = this.shotConfigResponse_;
            return shotConfigResponse == null ? ShotConfigResponse.getDefaultInstance() : shotConfigResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public ShotConfigResponseOrBuilder getShotConfigResponseOrBuilder() {
            ShotConfigResponse shotConfigResponse = this.shotConfigResponse_;
            return shotConfigResponse == null ? ShotConfigResponse.getDefaultInstance() : shotConfigResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public StartTiltCalibrationRequest getStartTiltCalRequest() {
            StartTiltCalibrationRequest startTiltCalibrationRequest = this.startTiltCalRequest_;
            return startTiltCalibrationRequest == null ? StartTiltCalibrationRequest.getDefaultInstance() : startTiltCalibrationRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public StartTiltCalibrationRequestOrBuilder getStartTiltCalRequestOrBuilder() {
            StartTiltCalibrationRequest startTiltCalibrationRequest = this.startTiltCalRequest_;
            return startTiltCalibrationRequest == null ? StartTiltCalibrationRequest.getDefaultInstance() : startTiltCalibrationRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public StartTiltCalibrationResponse getStartTiltCalResponse() {
            StartTiltCalibrationResponse startTiltCalibrationResponse = this.startTiltCalResponse_;
            return startTiltCalibrationResponse == null ? StartTiltCalibrationResponse.getDefaultInstance() : startTiltCalibrationResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public StartTiltCalibrationResponseOrBuilder getStartTiltCalResponseOrBuilder() {
            StartTiltCalibrationResponse startTiltCalibrationResponse = this.startTiltCalResponse_;
            return startTiltCalibrationResponse == null ? StartTiltCalibrationResponse.getDefaultInstance() : startTiltCalibrationResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public StatusRequest getStatusRequest() {
            StatusRequest statusRequest = this.statusRequest_;
            return statusRequest == null ? StatusRequest.getDefaultInstance() : statusRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public StatusRequestOrBuilder getStatusRequestOrBuilder() {
            StatusRequest statusRequest = this.statusRequest_;
            return statusRequest == null ? StatusRequest.getDefaultInstance() : statusRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public StatusResponse getStatusResponse() {
            StatusResponse statusResponse = this.statusResponse_;
            return statusResponse == null ? StatusResponse.getDefaultInstance() : statusResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public StatusResponseOrBuilder getStatusResponseOrBuilder() {
            StatusResponse statusResponse = this.statusResponse_;
            return statusResponse == null ? StatusResponse.getDefaultInstance() : statusResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public TiltRequest getTiltRequest() {
            TiltRequest tiltRequest = this.tiltRequest_;
            return tiltRequest == null ? TiltRequest.getDefaultInstance() : tiltRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public TiltRequestOrBuilder getTiltRequestOrBuilder() {
            TiltRequest tiltRequest = this.tiltRequest_;
            return tiltRequest == null ? TiltRequest.getDefaultInstance() : tiltRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public TiltResponse getTiltResponse() {
            TiltResponse tiltResponse = this.tiltResponse_;
            return tiltResponse == null ? TiltResponse.getDefaultInstance() : tiltResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public TiltResponseOrBuilder getTiltResponseOrBuilder() {
            TiltResponse tiltResponse = this.tiltResponse_;
            return tiltResponse == null ? TiltResponse.getDefaultInstance() : tiltResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public WakeUpRequest getWakeUpRequest() {
            WakeUpRequest wakeUpRequest = this.wakeUpRequest_;
            return wakeUpRequest == null ? WakeUpRequest.getDefaultInstance() : wakeUpRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public WakeUpRequestOrBuilder getWakeUpRequestOrBuilder() {
            WakeUpRequest wakeUpRequest = this.wakeUpRequest_;
            return wakeUpRequest == null ? WakeUpRequest.getDefaultInstance() : wakeUpRequest;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public WakeUpResponse getWakeUpResponse() {
            WakeUpResponse wakeUpResponse = this.wakeUpResponse_;
            return wakeUpResponse == null ? WakeUpResponse.getDefaultInstance() : wakeUpResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public WakeUpResponseOrBuilder getWakeUpResponseOrBuilder() {
            WakeUpResponse wakeUpResponse = this.wakeUpResponse_;
            return wakeUpResponse == null ? WakeUpResponse.getDefaultInstance() : wakeUpResponse;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasModeRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasModeResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasResetTiltCalRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasResetTiltCalResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasShotConfigRequest() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasShotConfigResponse() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasStartTiltCalRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasStartTiltCalResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasStatusRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasStatusResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasTiltRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasTiltResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasWakeUpRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
        public boolean hasWakeUpResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatusRequest().hashCode();
            }
            if (hasStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStatusResponse().hashCode();
            }
            if (hasWakeUpRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getWakeUpRequest().hashCode();
            }
            if (hasWakeUpResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getWakeUpResponse().hashCode();
            }
            if (hasTiltRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getTiltRequest().hashCode();
            }
            if (hasTiltResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getTiltResponse().hashCode();
            }
            if (hasStartTiltCalRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getStartTiltCalRequest().hashCode();
            }
            if (hasStartTiltCalResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getStartTiltCalResponse().hashCode();
            }
            if (hasResetTiltCalRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getResetTiltCalRequest().hashCode();
            }
            if (hasResetTiltCalResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getResetTiltCalResponse().hashCode();
            }
            if (hasShotConfigRequest()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getShotConfigRequest().hashCode();
            }
            if (hasShotConfigResponse()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getShotConfigResponse().hashCode();
            }
            if (hasModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getModeRequest().hashCode();
            }
            if (hasModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getModeResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getStatusRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStatusResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getWakeUpRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getWakeUpResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getTiltRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getTiltResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getStartTiltCalRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getStartTiltCalResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getResetTiltCalRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getResetTiltCalResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getShotConfigRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getShotConfigResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getModeRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getModeResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> modeRequestBuilder_;
            private ModeRequest modeRequest_;
            private SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> modeResponseBuilder_;
            private ModeResponse modeResponse_;
            private SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> resetTiltCalRequestBuilder_;
            private ResetTiltCalibrationRequest resetTiltCalRequest_;
            private SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> resetTiltCalResponseBuilder_;
            private ResetTiltCalibrationResponse resetTiltCalResponse_;
            private SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> shotConfigRequestBuilder_;
            private ShotConfigRequest shotConfigRequest_;
            private SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> shotConfigResponseBuilder_;
            private ShotConfigResponse shotConfigResponse_;
            private SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> startTiltCalRequestBuilder_;
            private StartTiltCalibrationRequest startTiltCalRequest_;
            private SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> startTiltCalResponseBuilder_;
            private StartTiltCalibrationResponse startTiltCalResponse_;
            private SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> statusRequestBuilder_;
            private StatusRequest statusRequest_;
            private SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> statusResponseBuilder_;
            private StatusResponse statusResponse_;
            private SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> tiltRequestBuilder_;
            private TiltRequest tiltRequest_;
            private SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> tiltResponseBuilder_;
            private TiltResponse tiltResponse_;
            private SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> wakeUpRequestBuilder_;
            private WakeUpRequest wakeUpRequest_;
            private SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> wakeUpResponseBuilder_;
            private WakeUpResponse wakeUpResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                    service.statusRequest_ = singleFieldBuilderV3 == null ? this.statusRequest_ : (StatusRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV4 = this.statusResponseBuilder_;
                    service.statusResponse_ = singleFieldBuilderV4 == null ? this.statusResponse_ : (StatusResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> singleFieldBuilderV5 = this.wakeUpRequestBuilder_;
                    service.wakeUpRequest_ = singleFieldBuilderV5 == null ? this.wakeUpRequest_ : (WakeUpRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> singleFieldBuilderV6 = this.wakeUpResponseBuilder_;
                    service.wakeUpResponse_ = singleFieldBuilderV6 == null ? this.wakeUpResponse_ : (WakeUpResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> singleFieldBuilderV7 = this.tiltRequestBuilder_;
                    service.tiltRequest_ = singleFieldBuilderV7 == null ? this.tiltRequest_ : (TiltRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> singleFieldBuilderV8 = this.tiltResponseBuilder_;
                    service.tiltResponse_ = singleFieldBuilderV8 == null ? this.tiltResponse_ : (TiltResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> singleFieldBuilderV9 = this.startTiltCalRequestBuilder_;
                    service.startTiltCalRequest_ = singleFieldBuilderV9 == null ? this.startTiltCalRequest_ : (StartTiltCalibrationRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> singleFieldBuilderV10 = this.startTiltCalResponseBuilder_;
                    service.startTiltCalResponse_ = singleFieldBuilderV10 == null ? this.startTiltCalResponse_ : (StartTiltCalibrationResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> singleFieldBuilderV11 = this.resetTiltCalRequestBuilder_;
                    service.resetTiltCalRequest_ = singleFieldBuilderV11 == null ? this.resetTiltCalRequest_ : (ResetTiltCalibrationRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> singleFieldBuilderV12 = this.resetTiltCalResponseBuilder_;
                    service.resetTiltCalResponse_ = singleFieldBuilderV12 == null ? this.resetTiltCalResponse_ : (ResetTiltCalibrationResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> singleFieldBuilderV13 = this.shotConfigRequestBuilder_;
                    service.shotConfigRequest_ = singleFieldBuilderV13 == null ? this.shotConfigRequest_ : (ShotConfigRequest) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> singleFieldBuilderV14 = this.shotConfigResponseBuilder_;
                    service.shotConfigResponse_ = singleFieldBuilderV14 == null ? this.shotConfigResponse_ : (ShotConfigResponse) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV15 = this.modeRequestBuilder_;
                    service.modeRequest_ = singleFieldBuilderV15 == null ? this.modeRequest_ : (ModeRequest) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV16 = this.modeResponseBuilder_;
                    service.modeResponse_ = singleFieldBuilderV16 == null ? this.modeResponse_ : (ModeResponse) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Service_descriptor;
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

            private SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> getResetTiltCalRequestFieldBuilder() {
                if (this.resetTiltCalRequestBuilder_ == null) {
                    this.resetTiltCalRequestBuilder_ = new SingleFieldBuilderV3<>(getResetTiltCalRequest(), getParentForChildren(), isClean());
                    this.resetTiltCalRequest_ = null;
                }
                return this.resetTiltCalRequestBuilder_;
            }

            private SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> getResetTiltCalResponseFieldBuilder() {
                if (this.resetTiltCalResponseBuilder_ == null) {
                    this.resetTiltCalResponseBuilder_ = new SingleFieldBuilderV3<>(getResetTiltCalResponse(), getParentForChildren(), isClean());
                    this.resetTiltCalResponse_ = null;
                }
                return this.resetTiltCalResponseBuilder_;
            }

            private SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> getShotConfigRequestFieldBuilder() {
                if (this.shotConfigRequestBuilder_ == null) {
                    this.shotConfigRequestBuilder_ = new SingleFieldBuilderV3<>(getShotConfigRequest(), getParentForChildren(), isClean());
                    this.shotConfigRequest_ = null;
                }
                return this.shotConfigRequestBuilder_;
            }

            private SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> getShotConfigResponseFieldBuilder() {
                if (this.shotConfigResponseBuilder_ == null) {
                    this.shotConfigResponseBuilder_ = new SingleFieldBuilderV3<>(getShotConfigResponse(), getParentForChildren(), isClean());
                    this.shotConfigResponse_ = null;
                }
                return this.shotConfigResponseBuilder_;
            }

            private SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> getStartTiltCalRequestFieldBuilder() {
                if (this.startTiltCalRequestBuilder_ == null) {
                    this.startTiltCalRequestBuilder_ = new SingleFieldBuilderV3<>(getStartTiltCalRequest(), getParentForChildren(), isClean());
                    this.startTiltCalRequest_ = null;
                }
                return this.startTiltCalRequestBuilder_;
            }

            private SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> getStartTiltCalResponseFieldBuilder() {
                if (this.startTiltCalResponseBuilder_ == null) {
                    this.startTiltCalResponseBuilder_ = new SingleFieldBuilderV3<>(getStartTiltCalResponse(), getParentForChildren(), isClean());
                    this.startTiltCalResponse_ = null;
                }
                return this.startTiltCalResponseBuilder_;
            }

            private SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> getStatusRequestFieldBuilder() {
                if (this.statusRequestBuilder_ == null) {
                    this.statusRequestBuilder_ = new SingleFieldBuilderV3<>(getStatusRequest(), getParentForChildren(), isClean());
                    this.statusRequest_ = null;
                }
                return this.statusRequestBuilder_;
            }

            private SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> getStatusResponseFieldBuilder() {
                if (this.statusResponseBuilder_ == null) {
                    this.statusResponseBuilder_ = new SingleFieldBuilderV3<>(getStatusResponse(), getParentForChildren(), isClean());
                    this.statusResponse_ = null;
                }
                return this.statusResponseBuilder_;
            }

            private SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> getTiltRequestFieldBuilder() {
                if (this.tiltRequestBuilder_ == null) {
                    this.tiltRequestBuilder_ = new SingleFieldBuilderV3<>(getTiltRequest(), getParentForChildren(), isClean());
                    this.tiltRequest_ = null;
                }
                return this.tiltRequestBuilder_;
            }

            private SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> getTiltResponseFieldBuilder() {
                if (this.tiltResponseBuilder_ == null) {
                    this.tiltResponseBuilder_ = new SingleFieldBuilderV3<>(getTiltResponse(), getParentForChildren(), isClean());
                    this.tiltResponse_ = null;
                }
                return this.tiltResponseBuilder_;
            }

            private SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> getWakeUpRequestFieldBuilder() {
                if (this.wakeUpRequestBuilder_ == null) {
                    this.wakeUpRequestBuilder_ = new SingleFieldBuilderV3<>(getWakeUpRequest(), getParentForChildren(), isClean());
                    this.wakeUpRequest_ = null;
                }
                return this.wakeUpRequestBuilder_;
            }

            private SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> getWakeUpResponseFieldBuilder() {
                if (this.wakeUpResponseBuilder_ == null) {
                    this.wakeUpResponseBuilder_ = new SingleFieldBuilderV3<>(getWakeUpResponse(), getParentForChildren(), isClean());
                    this.wakeUpResponse_ = null;
                }
                return this.wakeUpResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStatusRequestFieldBuilder();
                    getStatusResponseFieldBuilder();
                    getWakeUpRequestFieldBuilder();
                    getWakeUpResponseFieldBuilder();
                    getTiltRequestFieldBuilder();
                    getTiltResponseFieldBuilder();
                    getStartTiltCalRequestFieldBuilder();
                    getStartTiltCalResponseFieldBuilder();
                    getResetTiltCalRequestFieldBuilder();
                    getResetTiltCalResponseFieldBuilder();
                    getShotConfigRequestFieldBuilder();
                    getShotConfigResponseFieldBuilder();
                    getModeRequestFieldBuilder();
                    getModeResponseFieldBuilder();
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
                this.statusRequest_ = null;
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusRequestBuilder_ = null;
                }
                this.statusResponse_ = null;
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV4 = this.statusResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.statusResponseBuilder_ = null;
                }
                this.wakeUpRequest_ = null;
                SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> singleFieldBuilderV5 = this.wakeUpRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.wakeUpRequestBuilder_ = null;
                }
                this.wakeUpResponse_ = null;
                SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> singleFieldBuilderV6 = this.wakeUpResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.wakeUpResponseBuilder_ = null;
                }
                this.tiltRequest_ = null;
                SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> singleFieldBuilderV7 = this.tiltRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.tiltRequestBuilder_ = null;
                }
                this.tiltResponse_ = null;
                SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> singleFieldBuilderV8 = this.tiltResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.tiltResponseBuilder_ = null;
                }
                this.startTiltCalRequest_ = null;
                SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> singleFieldBuilderV9 = this.startTiltCalRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.startTiltCalRequestBuilder_ = null;
                }
                this.startTiltCalResponse_ = null;
                SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> singleFieldBuilderV10 = this.startTiltCalResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.startTiltCalResponseBuilder_ = null;
                }
                this.resetTiltCalRequest_ = null;
                SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> singleFieldBuilderV11 = this.resetTiltCalRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.resetTiltCalRequestBuilder_ = null;
                }
                this.resetTiltCalResponse_ = null;
                SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> singleFieldBuilderV12 = this.resetTiltCalResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.resetTiltCalResponseBuilder_ = null;
                }
                this.shotConfigRequest_ = null;
                SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> singleFieldBuilderV13 = this.shotConfigRequestBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.shotConfigRequestBuilder_ = null;
                }
                this.shotConfigResponse_ = null;
                SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> singleFieldBuilderV14 = this.shotConfigResponseBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.shotConfigResponseBuilder_ = null;
                }
                this.modeRequest_ = null;
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV15 = this.modeRequestBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.modeRequestBuilder_ = null;
                }
                this.modeResponse_ = null;
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV16 = this.modeResponseBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.modeResponseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearModeRequest() {
                this.bitField0_ &= -4097;
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
                this.bitField0_ &= -8193;
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

            public Builder clearResetTiltCalRequest() {
                this.bitField0_ &= -257;
                this.resetTiltCalRequest_ = null;
                SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.resetTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.resetTiltCalRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearResetTiltCalResponse() {
                this.bitField0_ &= -513;
                this.resetTiltCalResponse_ = null;
                SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.resetTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.resetTiltCalResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShotConfigRequest() {
                this.bitField0_ &= -1025;
                this.shotConfigRequest_ = null;
                SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> singleFieldBuilderV3 = this.shotConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shotConfigRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShotConfigResponse() {
                this.bitField0_ &= -2049;
                this.shotConfigResponse_ = null;
                SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> singleFieldBuilderV3 = this.shotConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shotConfigResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartTiltCalRequest() {
                this.bitField0_ &= -65;
                this.startTiltCalRequest_ = null;
                SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.startTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startTiltCalRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartTiltCalResponse() {
                this.bitField0_ &= -129;
                this.startTiltCalResponse_ = null;
                SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.startTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startTiltCalResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusRequest() {
                this.bitField0_ &= -2;
                this.statusRequest_ = null;
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusResponse() {
                this.bitField0_ &= -3;
                this.statusResponse_ = null;
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTiltRequest() {
                this.bitField0_ &= -17;
                this.tiltRequest_ = null;
                SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> singleFieldBuilderV3 = this.tiltRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tiltRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTiltResponse() {
                this.bitField0_ &= -33;
                this.tiltResponse_ = null;
                SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> singleFieldBuilderV3 = this.tiltResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tiltResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWakeUpRequest() {
                this.bitField0_ &= -5;
                this.wakeUpRequest_ = null;
                SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> singleFieldBuilderV3 = this.wakeUpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wakeUpRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWakeUpResponse() {
                this.bitField0_ &= -9;
                this.wakeUpResponse_ = null;
                SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> singleFieldBuilderV3 = this.wakeUpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wakeUpResponseBuilder_ = null;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ModeRequest getModeRequest() {
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeRequest) singleFieldBuilderV3.getMessage();
                }
                ModeRequest modeRequest = this.modeRequest_;
                return modeRequest == null ? ModeRequest.getDefaultInstance() : modeRequest;
            }

            public ModeRequest.Builder getModeRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (ModeRequest.Builder) getModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ModeRequestOrBuilder getModeRequestOrBuilder() {
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ModeRequest modeRequest = this.modeRequest_;
                return modeRequest == null ? ModeRequest.getDefaultInstance() : modeRequest;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ModeResponse getModeResponse() {
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeResponse) singleFieldBuilderV3.getMessage();
                }
                ModeResponse modeResponse = this.modeResponse_;
                return modeResponse == null ? ModeResponse.getDefaultInstance() : modeResponse;
            }

            public ModeResponse.Builder getModeResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (ModeResponse.Builder) getModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ModeResponseOrBuilder getModeResponseOrBuilder() {
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ModeResponse modeResponse = this.modeResponse_;
                return modeResponse == null ? ModeResponse.getDefaultInstance() : modeResponse;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ResetTiltCalibrationRequest getResetTiltCalRequest() {
                SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.resetTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetTiltCalibrationRequest) singleFieldBuilderV3.getMessage();
                }
                ResetTiltCalibrationRequest resetTiltCalibrationRequest = this.resetTiltCalRequest_;
                return resetTiltCalibrationRequest == null ? ResetTiltCalibrationRequest.getDefaultInstance() : resetTiltCalibrationRequest;
            }

            public ResetTiltCalibrationRequest.Builder getResetTiltCalRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (ResetTiltCalibrationRequest.Builder) getResetTiltCalRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ResetTiltCalibrationRequestOrBuilder getResetTiltCalRequestOrBuilder() {
                SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.resetTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetTiltCalibrationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ResetTiltCalibrationRequest resetTiltCalibrationRequest = this.resetTiltCalRequest_;
                return resetTiltCalibrationRequest == null ? ResetTiltCalibrationRequest.getDefaultInstance() : resetTiltCalibrationRequest;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ResetTiltCalibrationResponse getResetTiltCalResponse() {
                SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.resetTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetTiltCalibrationResponse) singleFieldBuilderV3.getMessage();
                }
                ResetTiltCalibrationResponse resetTiltCalibrationResponse = this.resetTiltCalResponse_;
                return resetTiltCalibrationResponse == null ? ResetTiltCalibrationResponse.getDefaultInstance() : resetTiltCalibrationResponse;
            }

            public ResetTiltCalibrationResponse.Builder getResetTiltCalResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (ResetTiltCalibrationResponse.Builder) getResetTiltCalResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ResetTiltCalibrationResponseOrBuilder getResetTiltCalResponseOrBuilder() {
                SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.resetTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetTiltCalibrationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ResetTiltCalibrationResponse resetTiltCalibrationResponse = this.resetTiltCalResponse_;
                return resetTiltCalibrationResponse == null ? ResetTiltCalibrationResponse.getDefaultInstance() : resetTiltCalibrationResponse;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ShotConfigRequest getShotConfigRequest() {
                SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> singleFieldBuilderV3 = this.shotConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotConfigRequest) singleFieldBuilderV3.getMessage();
                }
                ShotConfigRequest shotConfigRequest = this.shotConfigRequest_;
                return shotConfigRequest == null ? ShotConfigRequest.getDefaultInstance() : shotConfigRequest;
            }

            public ShotConfigRequest.Builder getShotConfigRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (ShotConfigRequest.Builder) getShotConfigRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ShotConfigRequestOrBuilder getShotConfigRequestOrBuilder() {
                SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> singleFieldBuilderV3 = this.shotConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotConfigRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShotConfigRequest shotConfigRequest = this.shotConfigRequest_;
                return shotConfigRequest == null ? ShotConfigRequest.getDefaultInstance() : shotConfigRequest;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ShotConfigResponse getShotConfigResponse() {
                SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> singleFieldBuilderV3 = this.shotConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotConfigResponse) singleFieldBuilderV3.getMessage();
                }
                ShotConfigResponse shotConfigResponse = this.shotConfigResponse_;
                return shotConfigResponse == null ? ShotConfigResponse.getDefaultInstance() : shotConfigResponse;
            }

            public ShotConfigResponse.Builder getShotConfigResponseBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (ShotConfigResponse.Builder) getShotConfigResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public ShotConfigResponseOrBuilder getShotConfigResponseOrBuilder() {
                SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> singleFieldBuilderV3 = this.shotConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShotConfigResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShotConfigResponse shotConfigResponse = this.shotConfigResponse_;
                return shotConfigResponse == null ? ShotConfigResponse.getDefaultInstance() : shotConfigResponse;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public StartTiltCalibrationRequest getStartTiltCalRequest() {
                SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.startTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartTiltCalibrationRequest) singleFieldBuilderV3.getMessage();
                }
                StartTiltCalibrationRequest startTiltCalibrationRequest = this.startTiltCalRequest_;
                return startTiltCalibrationRequest == null ? StartTiltCalibrationRequest.getDefaultInstance() : startTiltCalibrationRequest;
            }

            public StartTiltCalibrationRequest.Builder getStartTiltCalRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (StartTiltCalibrationRequest.Builder) getStartTiltCalRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public StartTiltCalibrationRequestOrBuilder getStartTiltCalRequestOrBuilder() {
                SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.startTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartTiltCalibrationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartTiltCalibrationRequest startTiltCalibrationRequest = this.startTiltCalRequest_;
                return startTiltCalibrationRequest == null ? StartTiltCalibrationRequest.getDefaultInstance() : startTiltCalibrationRequest;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public StartTiltCalibrationResponse getStartTiltCalResponse() {
                SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.startTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartTiltCalibrationResponse) singleFieldBuilderV3.getMessage();
                }
                StartTiltCalibrationResponse startTiltCalibrationResponse = this.startTiltCalResponse_;
                return startTiltCalibrationResponse == null ? StartTiltCalibrationResponse.getDefaultInstance() : startTiltCalibrationResponse;
            }

            public StartTiltCalibrationResponse.Builder getStartTiltCalResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (StartTiltCalibrationResponse.Builder) getStartTiltCalResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public StartTiltCalibrationResponseOrBuilder getStartTiltCalResponseOrBuilder() {
                SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.startTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartTiltCalibrationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartTiltCalibrationResponse startTiltCalibrationResponse = this.startTiltCalResponse_;
                return startTiltCalibrationResponse == null ? StartTiltCalibrationResponse.getDefaultInstance() : startTiltCalibrationResponse;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public StatusRequest getStatusRequest() {
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusRequest) singleFieldBuilderV3.getMessage();
                }
                StatusRequest statusRequest = this.statusRequest_;
                return statusRequest == null ? StatusRequest.getDefaultInstance() : statusRequest;
            }

            public StatusRequest.Builder getStatusRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (StatusRequest.Builder) getStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public StatusRequestOrBuilder getStatusRequestOrBuilder() {
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StatusRequest statusRequest = this.statusRequest_;
                return statusRequest == null ? StatusRequest.getDefaultInstance() : statusRequest;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public StatusResponse getStatusResponse() {
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusResponse) singleFieldBuilderV3.getMessage();
                }
                StatusResponse statusResponse = this.statusResponse_;
                return statusResponse == null ? StatusResponse.getDefaultInstance() : statusResponse;
            }

            public StatusResponse.Builder getStatusResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (StatusResponse.Builder) getStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public StatusResponseOrBuilder getStatusResponseOrBuilder() {
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StatusResponse statusResponse = this.statusResponse_;
                return statusResponse == null ? StatusResponse.getDefaultInstance() : statusResponse;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public TiltRequest getTiltRequest() {
                SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> singleFieldBuilderV3 = this.tiltRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TiltRequest) singleFieldBuilderV3.getMessage();
                }
                TiltRequest tiltRequest = this.tiltRequest_;
                return tiltRequest == null ? TiltRequest.getDefaultInstance() : tiltRequest;
            }

            public TiltRequest.Builder getTiltRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (TiltRequest.Builder) getTiltRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public TiltRequestOrBuilder getTiltRequestOrBuilder() {
                SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> singleFieldBuilderV3 = this.tiltRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TiltRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TiltRequest tiltRequest = this.tiltRequest_;
                return tiltRequest == null ? TiltRequest.getDefaultInstance() : tiltRequest;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public TiltResponse getTiltResponse() {
                SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> singleFieldBuilderV3 = this.tiltResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TiltResponse) singleFieldBuilderV3.getMessage();
                }
                TiltResponse tiltResponse = this.tiltResponse_;
                return tiltResponse == null ? TiltResponse.getDefaultInstance() : tiltResponse;
            }

            public TiltResponse.Builder getTiltResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (TiltResponse.Builder) getTiltResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public TiltResponseOrBuilder getTiltResponseOrBuilder() {
                SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> singleFieldBuilderV3 = this.tiltResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TiltResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TiltResponse tiltResponse = this.tiltResponse_;
                return tiltResponse == null ? TiltResponse.getDefaultInstance() : tiltResponse;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public WakeUpRequest getWakeUpRequest() {
                SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> singleFieldBuilderV3 = this.wakeUpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WakeUpRequest) singleFieldBuilderV3.getMessage();
                }
                WakeUpRequest wakeUpRequest = this.wakeUpRequest_;
                return wakeUpRequest == null ? WakeUpRequest.getDefaultInstance() : wakeUpRequest;
            }

            public WakeUpRequest.Builder getWakeUpRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (WakeUpRequest.Builder) getWakeUpRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public WakeUpRequestOrBuilder getWakeUpRequestOrBuilder() {
                SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> singleFieldBuilderV3 = this.wakeUpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WakeUpRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WakeUpRequest wakeUpRequest = this.wakeUpRequest_;
                return wakeUpRequest == null ? WakeUpRequest.getDefaultInstance() : wakeUpRequest;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public WakeUpResponse getWakeUpResponse() {
                SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> singleFieldBuilderV3 = this.wakeUpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WakeUpResponse) singleFieldBuilderV3.getMessage();
                }
                WakeUpResponse wakeUpResponse = this.wakeUpResponse_;
                return wakeUpResponse == null ? WakeUpResponse.getDefaultInstance() : wakeUpResponse;
            }

            public WakeUpResponse.Builder getWakeUpResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (WakeUpResponse.Builder) getWakeUpResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public WakeUpResponseOrBuilder getWakeUpResponseOrBuilder() {
                SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> singleFieldBuilderV3 = this.wakeUpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WakeUpResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WakeUpResponse wakeUpResponse = this.wakeUpResponse_;
                return wakeUpResponse == null ? WakeUpResponse.getDefaultInstance() : wakeUpResponse;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasModeRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasModeResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasResetTiltCalRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasResetTiltCalResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasShotConfigRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasShotConfigResponse() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasStartTiltCalRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasStartTiltCalResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasStatusRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasStatusResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasTiltRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasTiltResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasWakeUpRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.ServiceOrBuilder
            public boolean hasWakeUpResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                case 10:
                                    codedInputStream.readMessage(getStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getWakeUpRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getWakeUpResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getTiltRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getTiltResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getStartTiltCalRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getStartTiltCalResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getResetTiltCalRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getResetTiltCalResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getShotConfigRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getShotConfigResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
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

            public Builder mergeModeRequest(ModeRequest modeRequest) {
                ModeRequest modeRequest2;
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(modeRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (modeRequest2 = this.modeRequest_) == null || modeRequest2 == ModeRequest.getDefaultInstance()) {
                    this.modeRequest_ = modeRequest;
                } else {
                    getModeRequestBuilder().mergeFrom(modeRequest);
                }
                if (this.modeRequest_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeModeResponse(ModeResponse modeResponse) {
                ModeResponse modeResponse2;
                SingleFieldBuilderV3<ModeResponse, ModeResponse.Builder, ModeResponseOrBuilder> singleFieldBuilderV3 = this.modeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(modeResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (modeResponse2 = this.modeResponse_) == null || modeResponse2 == ModeResponse.getDefaultInstance()) {
                    this.modeResponse_ = modeResponse;
                } else {
                    getModeResponseBuilder().mergeFrom(modeResponse);
                }
                if (this.modeResponse_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergeResetTiltCalRequest(ResetTiltCalibrationRequest resetTiltCalibrationRequest) {
                ResetTiltCalibrationRequest resetTiltCalibrationRequest2;
                SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.resetTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(resetTiltCalibrationRequest);
                } else if ((this.bitField0_ & 256) == 0 || (resetTiltCalibrationRequest2 = this.resetTiltCalRequest_) == null || resetTiltCalibrationRequest2 == ResetTiltCalibrationRequest.getDefaultInstance()) {
                    this.resetTiltCalRequest_ = resetTiltCalibrationRequest;
                } else {
                    getResetTiltCalRequestBuilder().mergeFrom(resetTiltCalibrationRequest);
                }
                if (this.resetTiltCalRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeResetTiltCalResponse(ResetTiltCalibrationResponse resetTiltCalibrationResponse) {
                ResetTiltCalibrationResponse resetTiltCalibrationResponse2;
                SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.resetTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(resetTiltCalibrationResponse);
                } else if ((this.bitField0_ & 512) == 0 || (resetTiltCalibrationResponse2 = this.resetTiltCalResponse_) == null || resetTiltCalibrationResponse2 == ResetTiltCalibrationResponse.getDefaultInstance()) {
                    this.resetTiltCalResponse_ = resetTiltCalibrationResponse;
                } else {
                    getResetTiltCalResponseBuilder().mergeFrom(resetTiltCalibrationResponse);
                }
                if (this.resetTiltCalResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShotConfigRequest(ShotConfigRequest shotConfigRequest) {
                ShotConfigRequest shotConfigRequest2;
                SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> singleFieldBuilderV3 = this.shotConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shotConfigRequest);
                } else if ((this.bitField0_ & 1024) == 0 || (shotConfigRequest2 = this.shotConfigRequest_) == null || shotConfigRequest2 == ShotConfigRequest.getDefaultInstance()) {
                    this.shotConfigRequest_ = shotConfigRequest;
                } else {
                    getShotConfigRequestBuilder().mergeFrom(shotConfigRequest);
                }
                if (this.shotConfigRequest_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShotConfigResponse(ShotConfigResponse shotConfigResponse) {
                ShotConfigResponse shotConfigResponse2;
                SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> singleFieldBuilderV3 = this.shotConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shotConfigResponse);
                } else if ((this.bitField0_ & 2048) == 0 || (shotConfigResponse2 = this.shotConfigResponse_) == null || shotConfigResponse2 == ShotConfigResponse.getDefaultInstance()) {
                    this.shotConfigResponse_ = shotConfigResponse;
                } else {
                    getShotConfigResponseBuilder().mergeFrom(shotConfigResponse);
                }
                if (this.shotConfigResponse_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartTiltCalRequest(StartTiltCalibrationRequest startTiltCalibrationRequest) {
                StartTiltCalibrationRequest startTiltCalibrationRequest2;
                SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.startTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startTiltCalibrationRequest);
                } else if ((this.bitField0_ & 64) == 0 || (startTiltCalibrationRequest2 = this.startTiltCalRequest_) == null || startTiltCalibrationRequest2 == StartTiltCalibrationRequest.getDefaultInstance()) {
                    this.startTiltCalRequest_ = startTiltCalibrationRequest;
                } else {
                    getStartTiltCalRequestBuilder().mergeFrom(startTiltCalibrationRequest);
                }
                if (this.startTiltCalRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartTiltCalResponse(StartTiltCalibrationResponse startTiltCalibrationResponse) {
                StartTiltCalibrationResponse startTiltCalibrationResponse2;
                SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.startTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startTiltCalibrationResponse);
                } else if ((this.bitField0_ & 128) == 0 || (startTiltCalibrationResponse2 = this.startTiltCalResponse_) == null || startTiltCalibrationResponse2 == StartTiltCalibrationResponse.getDefaultInstance()) {
                    this.startTiltCalResponse_ = startTiltCalibrationResponse;
                } else {
                    getStartTiltCalResponseBuilder().mergeFrom(startTiltCalibrationResponse);
                }
                if (this.startTiltCalResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusRequest(StatusRequest statusRequest) {
                StatusRequest statusRequest2;
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(statusRequest);
                } else if ((this.bitField0_ & 1) == 0 || (statusRequest2 = this.statusRequest_) == null || statusRequest2 == StatusRequest.getDefaultInstance()) {
                    this.statusRequest_ = statusRequest;
                } else {
                    getStatusRequestBuilder().mergeFrom(statusRequest);
                }
                if (this.statusRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusResponse(StatusResponse statusResponse) {
                StatusResponse statusResponse2;
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(statusResponse);
                } else if ((this.bitField0_ & 2) == 0 || (statusResponse2 = this.statusResponse_) == null || statusResponse2 == StatusResponse.getDefaultInstance()) {
                    this.statusResponse_ = statusResponse;
                } else {
                    getStatusResponseBuilder().mergeFrom(statusResponse);
                }
                if (this.statusResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTiltRequest(TiltRequest tiltRequest) {
                TiltRequest tiltRequest2;
                SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> singleFieldBuilderV3 = this.tiltRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(tiltRequest);
                } else if ((this.bitField0_ & 16) == 0 || (tiltRequest2 = this.tiltRequest_) == null || tiltRequest2 == TiltRequest.getDefaultInstance()) {
                    this.tiltRequest_ = tiltRequest;
                } else {
                    getTiltRequestBuilder().mergeFrom(tiltRequest);
                }
                if (this.tiltRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTiltResponse(TiltResponse tiltResponse) {
                TiltResponse tiltResponse2;
                SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> singleFieldBuilderV3 = this.tiltResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(tiltResponse);
                } else if ((this.bitField0_ & 32) == 0 || (tiltResponse2 = this.tiltResponse_) == null || tiltResponse2 == TiltResponse.getDefaultInstance()) {
                    this.tiltResponse_ = tiltResponse;
                } else {
                    getTiltResponseBuilder().mergeFrom(tiltResponse);
                }
                if (this.tiltResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeWakeUpRequest(WakeUpRequest wakeUpRequest) {
                WakeUpRequest wakeUpRequest2;
                SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> singleFieldBuilderV3 = this.wakeUpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(wakeUpRequest);
                } else if ((this.bitField0_ & 4) == 0 || (wakeUpRequest2 = this.wakeUpRequest_) == null || wakeUpRequest2 == WakeUpRequest.getDefaultInstance()) {
                    this.wakeUpRequest_ = wakeUpRequest;
                } else {
                    getWakeUpRequestBuilder().mergeFrom(wakeUpRequest);
                }
                if (this.wakeUpRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeWakeUpResponse(WakeUpResponse wakeUpResponse) {
                WakeUpResponse wakeUpResponse2;
                SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> singleFieldBuilderV3 = this.wakeUpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(wakeUpResponse);
                } else if ((this.bitField0_ & 8) == 0 || (wakeUpResponse2 = this.wakeUpResponse_) == null || wakeUpResponse2 == WakeUpResponse.getDefaultInstance()) {
                    this.wakeUpResponse_ = wakeUpResponse;
                } else {
                    getWakeUpResponseBuilder().mergeFrom(wakeUpResponse);
                }
                if (this.wakeUpResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setModeRequest(ModeRequest.Builder builder) {
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.modeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
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
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResetTiltCalRequest(ResetTiltCalibrationRequest.Builder builder) {
                SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.resetTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetTiltCalRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setResetTiltCalResponse(ResetTiltCalibrationResponse.Builder builder) {
                SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.resetTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetTiltCalResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setShotConfigRequest(ShotConfigRequest.Builder builder) {
                SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> singleFieldBuilderV3 = this.shotConfigRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shotConfigRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setShotConfigResponse(ShotConfigResponse.Builder builder) {
                SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> singleFieldBuilderV3 = this.shotConfigResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shotConfigResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setStartTiltCalRequest(StartTiltCalibrationRequest.Builder builder) {
                SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.startTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startTiltCalRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStartTiltCalResponse(StartTiltCalibrationResponse.Builder builder) {
                SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.startTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startTiltCalResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setStatusRequest(StatusRequest.Builder builder) {
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStatusResponse(StatusResponse.Builder builder) {
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTiltRequest(TiltRequest.Builder builder) {
                SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> singleFieldBuilderV3 = this.tiltRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tiltRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTiltResponse(TiltResponse.Builder builder) {
                SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> singleFieldBuilderV3 = this.tiltResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tiltResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWakeUpRequest(WakeUpRequest.Builder builder) {
                SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> singleFieldBuilderV3 = this.wakeUpRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.wakeUpRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setWakeUpResponse(WakeUpResponse.Builder builder) {
                SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> singleFieldBuilderV3 = this.wakeUpResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.wakeUpResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
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

            public Builder setModeRequest(ModeRequest modeRequest) {
                SingleFieldBuilderV3<ModeRequest, ModeRequest.Builder, ModeRequestOrBuilder> singleFieldBuilderV3 = this.modeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    modeRequest.getClass();
                    this.modeRequest_ = modeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(modeRequest);
                }
                this.bitField0_ |= 4096;
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
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setResetTiltCalRequest(ResetTiltCalibrationRequest resetTiltCalibrationRequest) {
                SingleFieldBuilderV3<ResetTiltCalibrationRequest, ResetTiltCalibrationRequest.Builder, ResetTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.resetTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resetTiltCalibrationRequest.getClass();
                    this.resetTiltCalRequest_ = resetTiltCalibrationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(resetTiltCalibrationRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setResetTiltCalResponse(ResetTiltCalibrationResponse resetTiltCalibrationResponse) {
                SingleFieldBuilderV3<ResetTiltCalibrationResponse, ResetTiltCalibrationResponse.Builder, ResetTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.resetTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resetTiltCalibrationResponse.getClass();
                    this.resetTiltCalResponse_ = resetTiltCalibrationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(resetTiltCalibrationResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setShotConfigRequest(ShotConfigRequest shotConfigRequest) {
                SingleFieldBuilderV3<ShotConfigRequest, ShotConfigRequest.Builder, ShotConfigRequestOrBuilder> singleFieldBuilderV3 = this.shotConfigRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shotConfigRequest.getClass();
                    this.shotConfigRequest_ = shotConfigRequest;
                } else {
                    singleFieldBuilderV3.setMessage(shotConfigRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setShotConfigResponse(ShotConfigResponse shotConfigResponse) {
                SingleFieldBuilderV3<ShotConfigResponse, ShotConfigResponse.Builder, ShotConfigResponseOrBuilder> singleFieldBuilderV3 = this.shotConfigResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shotConfigResponse.getClass();
                    this.shotConfigResponse_ = shotConfigResponse;
                } else {
                    singleFieldBuilderV3.setMessage(shotConfigResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setStartTiltCalRequest(StartTiltCalibrationRequest startTiltCalibrationRequest) {
                SingleFieldBuilderV3<StartTiltCalibrationRequest, StartTiltCalibrationRequest.Builder, StartTiltCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.startTiltCalRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startTiltCalibrationRequest.getClass();
                    this.startTiltCalRequest_ = startTiltCalibrationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(startTiltCalibrationRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStartTiltCalResponse(StartTiltCalibrationResponse startTiltCalibrationResponse) {
                SingleFieldBuilderV3<StartTiltCalibrationResponse, StartTiltCalibrationResponse.Builder, StartTiltCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.startTiltCalResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startTiltCalibrationResponse.getClass();
                    this.startTiltCalResponse_ = startTiltCalibrationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(startTiltCalibrationResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setStatusRequest(StatusRequest statusRequest) {
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    statusRequest.getClass();
                    this.statusRequest_ = statusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(statusRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStatusResponse(StatusResponse statusResponse) {
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    statusResponse.getClass();
                    this.statusResponse_ = statusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(statusResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTiltRequest(TiltRequest tiltRequest) {
                SingleFieldBuilderV3<TiltRequest, TiltRequest.Builder, TiltRequestOrBuilder> singleFieldBuilderV3 = this.tiltRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    tiltRequest.getClass();
                    this.tiltRequest_ = tiltRequest;
                } else {
                    singleFieldBuilderV3.setMessage(tiltRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTiltResponse(TiltResponse tiltResponse) {
                SingleFieldBuilderV3<TiltResponse, TiltResponse.Builder, TiltResponseOrBuilder> singleFieldBuilderV3 = this.tiltResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    tiltResponse.getClass();
                    this.tiltResponse_ = tiltResponse;
                } else {
                    singleFieldBuilderV3.setMessage(tiltResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setWakeUpRequest(WakeUpRequest wakeUpRequest) {
                SingleFieldBuilderV3<WakeUpRequest, WakeUpRequest.Builder, WakeUpRequestOrBuilder> singleFieldBuilderV3 = this.wakeUpRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    wakeUpRequest.getClass();
                    this.wakeUpRequest_ = wakeUpRequest;
                } else {
                    singleFieldBuilderV3.setMessage(wakeUpRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setWakeUpResponse(WakeUpResponse wakeUpResponse) {
                SingleFieldBuilderV3<WakeUpResponse, WakeUpResponse.Builder, WakeUpResponseOrBuilder> singleFieldBuilderV3 = this.wakeUpResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    wakeUpResponse.getClass();
                    this.wakeUpResponse_ = wakeUpResponse;
                } else {
                    singleFieldBuilderV3.setMessage(wakeUpResponse);
                }
                this.bitField0_ |= 8;
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
                if (service.hasStatusRequest()) {
                    mergeStatusRequest(service.getStatusRequest());
                }
                if (service.hasStatusResponse()) {
                    mergeStatusResponse(service.getStatusResponse());
                }
                if (service.hasWakeUpRequest()) {
                    mergeWakeUpRequest(service.getWakeUpRequest());
                }
                if (service.hasWakeUpResponse()) {
                    mergeWakeUpResponse(service.getWakeUpResponse());
                }
                if (service.hasTiltRequest()) {
                    mergeTiltRequest(service.getTiltRequest());
                }
                if (service.hasTiltResponse()) {
                    mergeTiltResponse(service.getTiltResponse());
                }
                if (service.hasStartTiltCalRequest()) {
                    mergeStartTiltCalRequest(service.getStartTiltCalRequest());
                }
                if (service.hasStartTiltCalResponse()) {
                    mergeStartTiltCalResponse(service.getStartTiltCalResponse());
                }
                if (service.hasResetTiltCalRequest()) {
                    mergeResetTiltCalRequest(service.getResetTiltCalRequest());
                }
                if (service.hasResetTiltCalResponse()) {
                    mergeResetTiltCalResponse(service.getResetTiltCalResponse());
                }
                if (service.hasShotConfigRequest()) {
                    mergeShotConfigRequest(service.getShotConfigRequest());
                }
                if (service.hasShotConfigResponse()) {
                    mergeShotConfigResponse(service.getShotConfigResponse());
                }
                if (service.hasModeRequest()) {
                    mergeModeRequest(service.getModeRequest());
                }
                if (service.hasModeResponse()) {
                    mergeModeResponse(service.getModeResponse());
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

    public static final class StartTiltCalibrationResponse extends GeneratedMessageV3 implements StartTiltCalibrationResponseOrBuilder {
        private static final StartTiltCalibrationResponse DEFAULT_INSTANCE = new StartTiltCalibrationResponse();

        @Deprecated
        public static final Parser<StartTiltCalibrationResponse> PARSER = new AbstractParser<StartTiltCalibrationResponse>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.StartTiltCalibrationResponse.1
            @Override // com.google.protobuf.Parser
            public StartTiltCalibrationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartTiltCalibrationResponse.newBuilder();
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

        private StartTiltCalibrationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartTiltCalibrationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_descriptor;
        }

        public static Builder newBuilder(StartTiltCalibrationResponse startTiltCalibrationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startTiltCalibrationResponse);
        }

        public static StartTiltCalibrationResponse parseDelimitedFrom(InputStream inputStream) {
            return (StartTiltCalibrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartTiltCalibrationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartTiltCalibrationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartTiltCalibrationResponse)) {
                return super.equals(obj);
            }
            StartTiltCalibrationResponse startTiltCalibrationResponse = (StartTiltCalibrationResponse) obj;
            if (hasStatus() != startTiltCalibrationResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == startTiltCalibrationResponse.status_) && getUnknownFields().equals(startTiltCalibrationResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartTiltCalibrationResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StartTiltCalibrationResponseOrBuilder
        public CalibrationStatus getStatus() {
            CalibrationStatus calibrationStatusForNumber = CalibrationStatus.forNumber(this.status_);
            return calibrationStatusForNumber == null ? CalibrationStatus.STARTED : calibrationStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StartTiltCalibrationResponseOrBuilder
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartTiltCalibrationResponse.class, Builder.class);
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
            return new StartTiltCalibrationResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartTiltCalibrationResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(StartTiltCalibrationResponse startTiltCalibrationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    startTiltCalibrationResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                startTiltCalibrationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartTiltCalibrationResponse build() {
                StartTiltCalibrationResponse startTiltCalibrationResponseBuildPartial = buildPartial();
                if (startTiltCalibrationResponseBuildPartial.isInitialized()) {
                    return startTiltCalibrationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startTiltCalibrationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartTiltCalibrationResponse buildPartial() {
                StartTiltCalibrationResponse startTiltCalibrationResponse = new StartTiltCalibrationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startTiltCalibrationResponse);
                }
                onBuilt();
                return startTiltCalibrationResponse;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StartTiltCalibrationResponseOrBuilder
            public CalibrationStatus getStatus() {
                CalibrationStatus calibrationStatusForNumber = CalibrationStatus.forNumber(this.status_);
                return calibrationStatusForNumber == null ? CalibrationStatus.STARTED : calibrationStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StartTiltCalibrationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StartTiltCalibrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartTiltCalibrationResponse.class, Builder.class);
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
                                    if (CalibrationStatus.forNumber(i14) == null) {
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

            public Builder setStatus(CalibrationStatus calibrationStatus) {
                calibrationStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = calibrationStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StartTiltCalibrationResponse getDefaultInstanceForType() {
                return StartTiltCalibrationResponse.getDefaultInstance();
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
                if (message instanceof StartTiltCalibrationResponse) {
                    return mergeFrom((StartTiltCalibrationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartTiltCalibrationResponse startTiltCalibrationResponse) {
                if (startTiltCalibrationResponse == StartTiltCalibrationResponse.getDefaultInstance()) {
                    return this;
                }
                if (startTiltCalibrationResponse.hasStatus()) {
                    setStatus(startTiltCalibrationResponse.getStatus());
                }
                mergeUnknownFields(startTiltCalibrationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartTiltCalibrationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartTiltCalibrationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTiltCalibrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartTiltCalibrationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StartTiltCalibrationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartTiltCalibrationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StartTiltCalibrationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartTiltCalibrationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartTiltCalibrationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartTiltCalibrationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartTiltCalibrationResponse parseFrom(InputStream inputStream) {
            return (StartTiltCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartTiltCalibrationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTiltCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartTiltCalibrationResponse parseFrom(CodedInputStream codedInputStream) {
            return (StartTiltCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartTiltCalibrationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartTiltCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum CalibrationStatus implements ProtocolMessageEnum {
            STARTED(0),
            IN_PROGRESS(1),
            ERROR(2);

            public static final int ERROR_VALUE = 2;
            public static final int IN_PROGRESS_VALUE = 1;
            public static final int STARTED_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<CalibrationStatus> internalValueMap = new Internal.EnumLiteMap<CalibrationStatus>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.StartTiltCalibrationResponse.CalibrationStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CalibrationStatus findValueByNumber(int i14) {
                    return CalibrationStatus.forNumber(i14);
                }
            };
            private static final CalibrationStatus[] VALUES = values();

            CalibrationStatus(int i14) {
                this.value = i14;
            }

            public static CalibrationStatus forNumber(int i14) {
                if (i14 == 0) {
                    return STARTED;
                }
                if (i14 == 1) {
                    return IN_PROGRESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StartTiltCalibrationResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<CalibrationStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static CalibrationStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static CalibrationStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class State extends GeneratedMessageV3 implements StateOrBuilder {
        private static final State DEFAULT_INSTANCE = new State();

        @Deprecated
        public static final Parser<State> PARSER = new AbstractParser<State>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.State.1
            @Override // com.google.protobuf.Parser
            public State parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = State.newBuilder();
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int state_;

        private State(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static State getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_State_descriptor;
        }

        public static Builder newBuilder(State state) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(state);
        }

        public static State parseDelimitedFrom(InputStream inputStream) {
            return (State) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static State parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<State> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof State)) {
                return super.equals(obj);
            }
            State state = (State) obj;
            if (hasState() != state.hasState()) {
                return false;
            }
            return (!hasState() || this.state_ == state.state_) && getUnknownFields().equals(state.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<State> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.state_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StateOrBuilder
        public StateType getState() {
            StateType stateTypeForNumber = StateType.forNumber(this.state_);
            return stateTypeForNumber == null ? StateType.STANDBY : stateTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StateOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_State_fieldAccessorTable.ensureFieldAccessorsInitialized(State.class, Builder.class);
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
            return new State();
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StateOrBuilder {
            private int bitField0_;
            private int state_;

            private Builder() {
                this.state_ = 0;
            }

            private void buildPartial0(State state) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    state.state_ = this.state_;
                } else {
                    i14 = 0;
                }
                state.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_State_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public State build() {
                State stateBuildPartial = buildPartial();
                if (stateBuildPartial.isInitialized()) {
                    return stateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public State buildPartial() {
                State state = new State(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(state);
                }
                onBuilt();
                return state;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 0;
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
                this.state_ = 0;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_State_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StateOrBuilder
            public StateType getState() {
                StateType stateTypeForNumber = StateType.forNumber(this.state_);
                return stateTypeForNumber == null ? StateType.STANDBY : stateTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StateOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_State_fieldAccessorTable.ensureFieldAccessorsInitialized(State.class, Builder.class);
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
                                    if (StateType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.state_ = i14;
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

            public Builder setState(StateType stateType) {
                stateType.getClass();
                this.bitField0_ |= 1;
                this.state_ = stateType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public State getDefaultInstanceForType() {
                return State.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.state_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof State) {
                    return mergeFrom((State) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(State state) {
                if (state == State.getDefaultInstance()) {
                    return this;
                }
                if (state.hasState()) {
                    setState(state.getState());
                }
                mergeUnknownFields(state.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public State getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static State parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (State) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static State parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ State(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static State parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private State() {
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static State parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static State parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static State parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static State parseFrom(InputStream inputStream) {
            return (State) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static State parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (State) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static State parseFrom(CodedInputStream codedInputStream) {
            return (State) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static State parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (State) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum StateType implements ProtocolMessageEnum {
            STANDBY(0),
            INTERFERENCE_TEST(1),
            WAITING(2),
            RECORDING(3),
            PROCESSING(4),
            ERROR(5);

            public static final int ERROR_VALUE = 5;
            public static final int INTERFERENCE_TEST_VALUE = 1;
            public static final int PROCESSING_VALUE = 4;
            public static final int RECORDING_VALUE = 3;
            public static final int STANDBY_VALUE = 0;
            public static final int WAITING_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<StateType> internalValueMap = new Internal.EnumLiteMap<StateType>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.State.StateType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public StateType findValueByNumber(int i14) {
                    return StateType.forNumber(i14);
                }
            };
            private static final StateType[] VALUES = values();

            StateType(int i14) {
                this.value = i14;
            }

            public static StateType forNumber(int i14) {
                if (i14 == 0) {
                    return STANDBY;
                }
                if (i14 == 1) {
                    return INTERFERENCE_TEST;
                }
                if (i14 == 2) {
                    return WAITING;
                }
                if (i14 == 3) {
                    return RECORDING;
                }
                if (i14 == 4) {
                    return PROCESSING;
                }
                if (i14 != 5) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return State.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<StateType> internalGetValueMap() {
                return internalValueMap;
            }

            public static StateType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static StateType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class StatusResponse extends GeneratedMessageV3 implements StatusResponseOrBuilder {
        private static final StatusResponse DEFAULT_INSTANCE = new StatusResponse();

        @Deprecated
        public static final Parser<StatusResponse> PARSER = new AbstractParser<StatusResponse>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.StatusResponse.1
            @Override // com.google.protobuf.Parser
            public StatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StatusResponse.newBuilder();
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private State state_;

        private StatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusResponse_descriptor;
        }

        public static Builder newBuilder(StatusResponse statusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(statusResponse);
        }

        public static StatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (StatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusResponse)) {
                return super.equals(obj);
            }
            StatusResponse statusResponse = (StatusResponse) obj;
            if (hasState() != statusResponse.hasState()) {
                return false;
            }
            return (!hasState() || getState().equals(statusResponse.getState())) && getUnknownFields().equals(statusResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getState()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StatusResponseOrBuilder
        public State getState() {
            State state = this.state_;
            return state == null ? State.getDefaultInstance() : state;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StatusResponseOrBuilder
        public StateOrBuilder getStateOrBuilder() {
            State state = this.state_;
            return state == null ? State.getDefaultInstance() : state;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StatusResponseOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getState().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusResponse.class, Builder.class);
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
            return new StatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getState());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatusResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> stateBuilder_;
            private State state_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StatusResponse statusResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                    statusResponse.state_ = singleFieldBuilderV3 == null ? this.state_ : (State) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                statusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusResponse_descriptor;
            }

            private SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> getStateFieldBuilder() {
                if (this.stateBuilder_ == null) {
                    this.stateBuilder_ = new SingleFieldBuilderV3<>(getState(), getParentForChildren(), isClean());
                    this.state_ = null;
                }
                return this.stateBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStateFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusResponse build() {
                StatusResponse statusResponseBuildPartial = buildPartial();
                if (statusResponseBuildPartial.isInitialized()) {
                    return statusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) statusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusResponse buildPartial() {
                StatusResponse statusResponse = new StatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(statusResponse);
                }
                onBuilt();
                return statusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = null;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateBuilder_ = null;
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

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = null;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateBuilder_ = null;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StatusResponseOrBuilder
            public State getState() {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (State) singleFieldBuilderV3.getMessage();
                }
                State state = this.state_;
                return state == null ? State.getDefaultInstance() : state;
            }

            public State.Builder getStateBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (State.Builder) getStateFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StatusResponseOrBuilder
            public StateOrBuilder getStateOrBuilder() {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                State state = this.state_;
                return state == null ? State.getDefaultInstance() : state;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.StatusResponseOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_StatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getStateFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeState(State state) {
                State state2;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(state);
                } else if ((this.bitField0_ & 1) == 0 || (state2 = this.state_) == null || state2 == State.getDefaultInstance()) {
                    this.state_ = state;
                } else {
                    getStateBuilder().mergeFrom(state);
                }
                if (this.state_ != null) {
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

            public Builder setState(State.Builder builder) {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.state_ = builder.build();
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
            public StatusResponse getDefaultInstanceForType() {
                return StatusResponse.getDefaultInstance();
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

            public Builder setState(State state) {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    state.getClass();
                    this.state_ = state;
                } else {
                    singleFieldBuilderV3.setMessage(state);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StatusResponse) {
                    return mergeFrom((StatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StatusResponse statusResponse) {
                if (statusResponse == StatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (statusResponse.hasState()) {
                    mergeState(statusResponse.getState());
                }
                mergeUnknownFields(statusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StatusResponse parseFrom(InputStream inputStream) {
            return (StatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (StatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TiltResponse extends GeneratedMessageV3 implements TiltResponseOrBuilder {
        private static final TiltResponse DEFAULT_INSTANCE = new TiltResponse();

        @Deprecated
        public static final Parser<TiltResponse> PARSER = new AbstractParser<TiltResponse>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.TiltResponse.1
            @Override // com.google.protobuf.Parser
            public TiltResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TiltResponse.newBuilder();
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
        public static final int TILT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private Tilt tilt_;

        private TiltResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TiltResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltResponse_descriptor;
        }

        public static Builder newBuilder(TiltResponse tiltResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(tiltResponse);
        }

        public static TiltResponse parseDelimitedFrom(InputStream inputStream) {
            return (TiltResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TiltResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TiltResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TiltResponse)) {
                return super.equals(obj);
            }
            TiltResponse tiltResponse = (TiltResponse) obj;
            if (hasTilt() != tiltResponse.hasTilt()) {
                return false;
            }
            return (!hasTilt() || getTilt().equals(tiltResponse.getTilt())) && getUnknownFields().equals(tiltResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TiltResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTilt()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltResponseOrBuilder
        public Tilt getTilt() {
            Tilt tilt = this.tilt_;
            return tilt == null ? Tilt.getDefaultInstance() : tilt;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltResponseOrBuilder
        public TiltOrBuilder getTiltOrBuilder() {
            Tilt tilt = this.tilt_;
            return tilt == null ? Tilt.getDefaultInstance() : tilt;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltResponseOrBuilder
        public boolean hasTilt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTilt()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTilt().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TiltResponse.class, Builder.class);
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
            return new TiltResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getTilt());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TiltResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> tiltBuilder_;
            private Tilt tilt_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TiltResponse tiltResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.tiltBuilder_;
                    tiltResponse.tilt_ = singleFieldBuilderV3 == null ? this.tilt_ : (Tilt) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                tiltResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltResponse_descriptor;
            }

            private SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> getTiltFieldBuilder() {
                if (this.tiltBuilder_ == null) {
                    this.tiltBuilder_ = new SingleFieldBuilderV3<>(getTilt(), getParentForChildren(), isClean());
                    this.tilt_ = null;
                }
                return this.tiltBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTiltFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TiltResponse build() {
                TiltResponse tiltResponseBuildPartial = buildPartial();
                if (tiltResponseBuildPartial.isInitialized()) {
                    return tiltResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) tiltResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TiltResponse buildPartial() {
                TiltResponse tiltResponse = new TiltResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(tiltResponse);
                }
                onBuilt();
                return tiltResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.tilt_ = null;
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.tiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tiltBuilder_ = null;
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

            public Builder clearTilt() {
                this.bitField0_ &= -2;
                this.tilt_ = null;
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.tiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tiltBuilder_ = null;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltResponseOrBuilder
            public Tilt getTilt() {
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.tiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Tilt) singleFieldBuilderV3.getMessage();
                }
                Tilt tilt = this.tilt_;
                return tilt == null ? Tilt.getDefaultInstance() : tilt;
            }

            public Tilt.Builder getTiltBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Tilt.Builder) getTiltFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltResponseOrBuilder
            public TiltOrBuilder getTiltOrBuilder() {
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.tiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TiltOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Tilt tilt = this.tilt_;
                return tilt == null ? Tilt.getDefaultInstance() : tilt;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.TiltResponseOrBuilder
            public boolean hasTilt() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_TiltResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TiltResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getTiltFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeTilt(Tilt tilt) {
                Tilt tilt2;
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.tiltBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(tilt);
                } else if ((this.bitField0_ & 1) == 0 || (tilt2 = this.tilt_) == null || tilt2 == Tilt.getDefaultInstance()) {
                    this.tilt_ = tilt;
                } else {
                    getTiltBuilder().mergeFrom(tilt);
                }
                if (this.tilt_ != null) {
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

            public Builder setTilt(Tilt.Builder builder) {
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.tiltBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tilt_ = builder.build();
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
            public TiltResponse getDefaultInstanceForType() {
                return TiltResponse.getDefaultInstance();
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

            public Builder setTilt(Tilt tilt) {
                SingleFieldBuilderV3<Tilt, Tilt.Builder, TiltOrBuilder> singleFieldBuilderV3 = this.tiltBuilder_;
                if (singleFieldBuilderV3 == null) {
                    tilt.getClass();
                    this.tilt_ = tilt;
                } else {
                    singleFieldBuilderV3.setMessage(tilt);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TiltResponse) {
                    return mergeFrom((TiltResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TiltResponse tiltResponse) {
                if (tiltResponse == TiltResponse.getDefaultInstance()) {
                    return this;
                }
                if (tiltResponse.hasTilt()) {
                    mergeTilt(tiltResponse.getTilt());
                }
                mergeUnknownFields(tiltResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TiltResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TiltResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TiltResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TiltResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TiltResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TiltResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TiltResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TiltResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TiltResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TiltResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TiltResponse parseFrom(InputStream inputStream) {
            return (TiltResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TiltResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TiltResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TiltResponse parseFrom(CodedInputStream codedInputStream) {
            return (TiltResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TiltResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TiltResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WakeUpResponse extends GeneratedMessageV3 implements WakeUpResponseOrBuilder {
        private static final WakeUpResponse DEFAULT_INSTANCE = new WakeUpResponse();

        @Deprecated
        public static final Parser<WakeUpResponse> PARSER = new AbstractParser<WakeUpResponse>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.WakeUpResponse.1
            @Override // com.google.protobuf.Parser
            public WakeUpResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WakeUpResponse.newBuilder();
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

        private WakeUpResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WakeUpResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_descriptor;
        }

        public static Builder newBuilder(WakeUpResponse wakeUpResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wakeUpResponse);
        }

        public static WakeUpResponse parseDelimitedFrom(InputStream inputStream) {
            return (WakeUpResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WakeUpResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WakeUpResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WakeUpResponse)) {
                return super.equals(obj);
            }
            WakeUpResponse wakeUpResponse = (WakeUpResponse) obj;
            if (hasStatus() != wakeUpResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == wakeUpResponse.status_) && getUnknownFields().equals(wakeUpResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WakeUpResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.WakeUpResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILaunchMonitorProto.WakeUpResponseOrBuilder
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
            return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WakeUpResponse.class, Builder.class);
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
            return new WakeUpResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WakeUpResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(WakeUpResponse wakeUpResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    wakeUpResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                wakeUpResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WakeUpResponse build() {
                WakeUpResponse wakeUpResponseBuildPartial = buildPartial();
                if (wakeUpResponseBuildPartial.isInitialized()) {
                    return wakeUpResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wakeUpResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WakeUpResponse buildPartial() {
                WakeUpResponse wakeUpResponse = new WakeUpResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(wakeUpResponse);
                }
                onBuilt();
                return wakeUpResponse;
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
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.WakeUpResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILaunchMonitorProto.WakeUpResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILaunchMonitorProto.internal_static_GDI_Proto_LaunchMonitor_WakeUpResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WakeUpResponse.class, Builder.class);
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
            public WakeUpResponse getDefaultInstanceForType() {
                return WakeUpResponse.getDefaultInstance();
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
                if (message instanceof WakeUpResponse) {
                    return mergeFrom((WakeUpResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WakeUpResponse wakeUpResponse) {
                if (wakeUpResponse == WakeUpResponse.getDefaultInstance()) {
                    return this;
                }
                if (wakeUpResponse.hasStatus()) {
                    setStatus(wakeUpResponse.getStatus());
                }
                mergeUnknownFields(wakeUpResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WakeUpResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WakeUpResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WakeUpResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WakeUpResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ WakeUpResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static WakeUpResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private WakeUpResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WakeUpResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WakeUpResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WakeUpResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WakeUpResponse parseFrom(InputStream inputStream) {
            return (WakeUpResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WakeUpResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WakeUpResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WakeUpResponse parseFrom(CodedInputStream codedInputStream) {
            return (WakeUpResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WakeUpResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WakeUpResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            ALREADY_AWAKE(1),
            UNKNOWN_ERROR(2);

            public static final int ALREADY_AWAKE_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            public static final int UNKNOWN_ERROR_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDILaunchMonitorProto.WakeUpResponse.ResponseStatus.1
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
                    return ALREADY_AWAKE;
                }
                if (i14 != 2) {
                    return null;
                }
                return UNKNOWN_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return WakeUpResponse.getDescriptor().getEnumTypes().get(0);
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
}
